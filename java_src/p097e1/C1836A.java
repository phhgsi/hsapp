package p097e1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.appcompat.app.AbstractC0740E;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p093d1.C1805q;

/* JADX INFO: renamed from: e1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1836A {

    /* JADX INFO: renamed from: o */
    private static final Map f9255o = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Context f9256a;

    /* JADX INFO: renamed from: b */
    private final C1854p f9257b;

    /* JADX INFO: renamed from: g */
    private boolean f9262g;

    /* JADX INFO: renamed from: h */
    private final Intent f9263h;

    /* JADX INFO: renamed from: l */
    private ServiceConnection f9267l;

    /* JADX INFO: renamed from: m */
    private IInterface f9268m;

    /* JADX INFO: renamed from: n */
    private final C1805q f9269n;

    /* JADX INFO: renamed from: d */
    private final List f9259d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Set f9260e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Object f9261f = new Object();

    /* JADX INFO: renamed from: j */
    private final IBinder.DeathRecipient f9265j = new IBinder.DeathRecipient() { // from class: e1.s
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C1836A.m9617j(this.f9290a);
        }
    };

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f9266k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    private final String f9258c = "AppUpdateService";

    /* JADX INFO: renamed from: i */
    private final WeakReference f9264i = new WeakReference(null);

    public C1836A(Context context, C1854p c1854p, String str, Intent intent, C1805q c1805q, InterfaceC1860v interfaceC1860v) {
        this.f9256a = context;
        this.f9257b = c1854p;
        this.f9263h = intent;
        this.f9269n = c1805q;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m9617j(C1836A c1836a) {
        c1836a.f9257b.m9650c("reportBinderDeath", new Object[0]);
        AbstractC0740E.m2693a(c1836a.f9264i.get());
        c1836a.f9257b.m9650c("%s : Binder has died.", c1836a.f9258c);
        Iterator it = c1836a.f9259d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC1855q) it.next()).m9653c(c1836a.m9626v());
        }
        c1836a.f9259d.clear();
        synchronized (c1836a.f9261f) {
            c1836a.m9627w();
        }
    }

    /* JADX INFO: renamed from: n */
    static /* bridge */ /* synthetic */ void m9621n(final C1836A c1836a, final TaskCompletionSource taskCompletionSource) {
        c1836a.f9260e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: e1.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f9288a.m9631t(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    static /* bridge */ /* synthetic */ void m9623p(C1836A c1836a, AbstractRunnableC1855q abstractRunnableC1855q) {
        if (c1836a.f9268m != null || c1836a.f9262g) {
            if (!c1836a.f9262g) {
                abstractRunnableC1855q.run();
                return;
            } else {
                c1836a.f9257b.m9650c("Waiting to bind to the service.", new Object[0]);
                c1836a.f9259d.add(abstractRunnableC1855q);
                return;
            }
        }
        c1836a.f9257b.m9650c("Initiate binding to the service.", new Object[0]);
        c1836a.f9259d.add(abstractRunnableC1855q);
        ServiceConnectionC1864z serviceConnectionC1864z = new ServiceConnectionC1864z(c1836a, null);
        c1836a.f9267l = serviceConnectionC1864z;
        c1836a.f9262g = true;
        if (c1836a.f9256a.bindService(c1836a.f9263h, serviceConnectionC1864z, 1)) {
            return;
        }
        c1836a.f9257b.m9650c("Failed to bind to the service.", new Object[0]);
        c1836a.f9262g = false;
        Iterator it = c1836a.f9259d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC1855q) it.next()).m9653c(new C1837B());
        }
        c1836a.f9259d.clear();
    }

    /* JADX INFO: renamed from: q */
    static /* bridge */ /* synthetic */ void m9624q(C1836A c1836a) {
        c1836a.f9257b.m9650c("linkToDeath", new Object[0]);
        try {
            c1836a.f9268m.asBinder().linkToDeath(c1836a.f9265j, 0);
        } catch (RemoteException e3) {
            c1836a.f9257b.m9649b(e3, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    static /* bridge */ /* synthetic */ void m9625r(C1836A c1836a) {
        c1836a.f9257b.m9650c("unlinkToDeath", new Object[0]);
        c1836a.f9268m.asBinder().unlinkToDeath(c1836a.f9265j, 0);
    }

    /* JADX INFO: renamed from: v */
    private final RemoteException m9626v() {
        return new RemoteException(String.valueOf(this.f9258c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m9627w() {
        Iterator it = this.f9260e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m9626v());
        }
        this.f9260e.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m9628c() {
        Handler handler;
        Map map = f9255o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f9258c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f9258c, 10);
                    handlerThread.start();
                    map.put(this.f9258c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f9258c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m9629e() {
        return this.f9268m;
    }

    /* JADX INFO: renamed from: s */
    public final void m9630s(AbstractRunnableC1855q abstractRunnableC1855q, TaskCompletionSource taskCompletionSource) {
        m9628c().post(new C1858t(this, abstractRunnableC1855q.m9652b(), taskCompletionSource, abstractRunnableC1855q));
    }

    /* JADX INFO: renamed from: t */
    final /* synthetic */ void m9631t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f9261f) {
            this.f9260e.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9632u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f9261f) {
            this.f9260e.remove(taskCompletionSource);
        }
        m9628c().post(new C1859u(this));
    }
}
