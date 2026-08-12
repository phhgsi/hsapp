package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: com.google.firebase.messaging.n */
/* JADX INFO: loaded from: classes.dex */
public class C1745n {

    /* JADX INFO: renamed from: c */
    private static final Object f8661c = new Object();

    /* JADX INFO: renamed from: d */
    private static ServiceConnectionC1744m0 f8662d;

    /* JADX INFO: renamed from: a */
    private final Context f8663a;

    /* JADX INFO: renamed from: b */
    private final Executor f8664b = new ExecutorC1782m();

    public C1745n(Context context) {
        this.f8663a = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m9490a(Context context, Intent intent, boolean z2, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? m9494e(context, intent, z2).continueWith(new ExecutorC1782m(), new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C1745n.m9493d(task2);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m9492c(Task task) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m9493d(Task task) {
        return 403;
    }

    /* JADX INFO: renamed from: e */
    private static Task m9494e(Context context, Intent intent, boolean z2) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC1744m0 serviceConnectionC1744m0M9495f = m9495f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z2) {
            return serviceConnectionC1744m0M9495f.m9484d(intent).continueWith(new ExecutorC1782m(), new Continuation() { // from class: com.google.firebase.messaging.m
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return C1745n.m9492c(task);
                }
            });
        }
        if (C1715W.m9363b().m9367e(context)) {
            AbstractC1734h0.m9467e(context, serviceConnectionC1744m0M9495f, intent);
        } else {
            serviceConnectionC1744m0M9495f.m9484d(intent);
        }
        return Tasks.forResult(-1);
    }

    /* JADX INFO: renamed from: f */
    private static ServiceConnectionC1744m0 m9495f(Context context, String str) {
        ServiceConnectionC1744m0 serviceConnectionC1744m0;
        synchronized (f8661c) {
            try {
                if (f8662d == null) {
                    f8662d = new ServiceConnectionC1744m0(context, str);
                }
                serviceConnectionC1744m0 = f8662d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC1744m0;
    }

    /* JADX INFO: renamed from: g */
    public Task m9496g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m9497h(this.f8663a, intent);
    }

    /* JADX INFO: renamed from: h */
    public Task m9497h(final Context context, final Intent intent) {
        boolean z2 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z3 = (intent.getFlags() & 268435456) != 0;
        return (!z2 || z3) ? Tasks.call(this.f8664b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C1715W.m9363b().m9368g(context, intent));
            }
        }).continueWithTask(this.f8664b, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1745n.m9490a(context, intent, z3, task);
            }
        }) : m9494e(context, intent, z3);
    }
}
