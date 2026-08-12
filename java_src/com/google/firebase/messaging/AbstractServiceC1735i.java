package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.BinderC1738j0;
import java.util.concurrent.ExecutorService;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: com.google.firebase.messaging.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1735i extends Service {

    /* JADX INFO: renamed from: b */
    private Binder f8639b;

    /* JADX INFO: renamed from: d */
    private int f8641d;

    /* JADX INFO: renamed from: a */
    final ExecutorService f8638a = AbstractC1746o.m9501d();

    /* JADX INFO: renamed from: c */
    private final Object f8640c = new Object();

    /* JADX INFO: renamed from: e */
    private int f8642e = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i$a */
    class a implements BinderC1738j0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.BinderC1738j0.a
        /* JADX INFO: renamed from: a */
        public Task mo9477a(Intent intent) {
            return AbstractServiceC1735i.this.m9474h(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9470a(AbstractServiceC1735i abstractServiceC1735i, Intent intent, TaskCompletionSource taskCompletionSource) {
        abstractServiceC1735i.getClass();
        try {
            abstractServiceC1735i.mo9266f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m9473d(Intent intent) {
        if (intent != null) {
            AbstractC1734h0.m9465c(intent);
        }
        synchronized (this.f8640c) {
            try {
                int i3 = this.f8642e - 1;
                this.f8642e = i3;
                if (i3 == 0) {
                    m9476i(this.f8641d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public Task m9474h(final Intent intent) {
        if (m9475g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8638a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC1735i.m9470a(this.f8632d, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: e */
    protected abstract Intent mo9265e(Intent intent);

    /* JADX INFO: renamed from: f */
    public abstract void mo9266f(Intent intent);

    /* JADX INFO: renamed from: g */
    public boolean m9475g(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    boolean m9476i(int i3) {
        return stopSelfResult(i3);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f8639b == null) {
                this.f8639b = new BinderC1738j0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8639b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f8638a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i3, int i4) {
        synchronized (this.f8640c) {
            this.f8641d = i4;
            this.f8642e++;
        }
        Intent intentMo9265e = mo9265e(intent);
        if (intentMo9265e == null) {
            m9473d(intent);
            return 2;
        }
        Task taskM9474h = m9474h(intentMo9265e);
        if (taskM9474h.isComplete()) {
            m9473d(intent);
            return 2;
        }
        taskM9474h.addOnCompleteListener(new ExecutorC1782m(), new OnCompleteListener() { // from class: com.google.firebase.messaging.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f8629a.m9473d(intent);
            }
        });
        return 3;
    }
}
