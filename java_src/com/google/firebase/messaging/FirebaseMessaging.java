package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C1713U;
import com.google.firebase.messaging.C1718Z;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002A1.InterfaceC0027b;
import p005B1.InterfaceC0081e;
import p129m1.AbstractC2264b;
import p129m1.C2267e;
import p133n1.InterfaceC2280a;
import p144r0.InterfaceC2372i;
import p163x1.AbstractC2524a;
import p163x1.InterfaceC2525b;
import p163x1.InterfaceC2527d;
import p169z1.InterfaceC2603a;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m */
    private static C1718Z f8477m;

    /* JADX INFO: renamed from: o */
    static ScheduledExecutorService f8479o;

    /* JADX INFO: renamed from: a */
    private final C2267e f8480a;

    /* JADX INFO: renamed from: b */
    private final Context f8481b;

    /* JADX INFO: renamed from: c */
    private final C1694D f8482c;

    /* JADX INFO: renamed from: d */
    private final C1713U f8483d;

    /* JADX INFO: renamed from: e */
    private final C1697a f8484e;

    /* JADX INFO: renamed from: f */
    private final Executor f8485f;

    /* JADX INFO: renamed from: g */
    private final Executor f8486g;

    /* JADX INFO: renamed from: h */
    private final Task f8487h;

    /* JADX INFO: renamed from: i */
    private final C1700I f8488i;

    /* JADX INFO: renamed from: j */
    private boolean f8489j;

    /* JADX INFO: renamed from: k */
    private final Application.ActivityLifecycleCallbacks f8490k;

    /* JADX INFO: renamed from: l */
    private static final long f8476l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n */
    static InterfaceC0027b f8478n = new InterfaceC0027b() { // from class: com.google.firebase.messaging.r
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return FirebaseMessaging.m9229d();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    class C1697a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC2527d f8491a;

        /* JADX INFO: renamed from: b */
        private boolean f8492b;

        /* JADX INFO: renamed from: c */
        private InterfaceC2525b f8493c;

        /* JADX INFO: renamed from: d */
        private Boolean f8494d;

        C1697a(InterfaceC2527d interfaceC2527d) {
            this.f8491a = interfaceC2527d;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9254a(C1697a c1697a, AbstractC2524a abstractC2524a) {
            if (c1697a.m9257c()) {
                FirebaseMessaging.this.m9225B();
            }
        }

        /* JADX INFO: renamed from: d */
        private Boolean m9255d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM10848j = FirebaseMessaging.this.f8480a.m10848j();
            SharedPreferences sharedPreferences = contextM10848j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM10848j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM10848j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        synchronized void m9256b() {
            try {
                if (this.f8492b) {
                    return;
                }
                Boolean boolM9255d = m9255d();
                this.f8494d = boolM9255d;
                if (boolM9255d == null) {
                    InterfaceC2525b interfaceC2525b = new InterfaceC2525b() { // from class: com.google.firebase.messaging.A
                        @Override // p163x1.InterfaceC2525b
                        /* JADX INFO: renamed from: a */
                        public final void mo9204a(AbstractC2524a abstractC2524a) {
                            FirebaseMessaging.C1697a.m9254a(this.f8462a, abstractC2524a);
                        }
                    };
                    this.f8493c = interfaceC2525b;
                    this.f8491a.mo11177a(AbstractC2264b.class, interfaceC2525b);
                }
                this.f8492b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        synchronized boolean m9257c() {
            Boolean bool;
            try {
                m9256b();
                bool = this.f8494d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f8480a.m10852s();
        }
    }

    FirebaseMessaging(C2267e c2267e, InterfaceC2603a interfaceC2603a, InterfaceC0027b interfaceC0027b, InterfaceC0027b interfaceC0027b2, InterfaceC0081e interfaceC0081e, InterfaceC0027b interfaceC0027b3, InterfaceC2527d interfaceC2527d) {
        this(c2267e, interfaceC2603a, interfaceC0027b, interfaceC0027b2, interfaceC0081e, interfaceC0027b3, interfaceC2527d, new C1700I(c2267e.m10848j()));
    }

    /* JADX INFO: renamed from: A */
    private synchronized void m9224A() {
        if (!this.f8489j) {
            m9244C(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m9225B() {
        if (m9245D(m9250r())) {
            m9224A();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m9226a(FirebaseMessaging firebaseMessaging, String str, C1718Z.a aVar, String str2) {
        m9237o(firebaseMessaging.f8481b).m9383f(firebaseMessaging.m9238p(), str, str2, firebaseMessaging.f8488i.m9304a());
        if (aVar == null || !str2.equals(aVar.f8558a)) {
            firebaseMessaging.m9242v(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9227b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.m9251w()) {
            firebaseMessaging.m9225B();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9228c(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.setResult(firebaseMessaging.m9246k());
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC2372i m9229d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9231f(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            AbstractC1699H.m9299y(cloudMessage.getIntent());
            firebaseMessaging.m9240t();
        }
    }

    static synchronized FirebaseMessaging getInstance(C2267e c2267e) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c2267e.m10847i(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9233h(FirebaseMessaging firebaseMessaging, C1728e0 c1728e0) {
        if (firebaseMessaging.m9251w()) {
            c1728e0.m9444n();
        }
    }

    /* JADX INFO: renamed from: n */
    public static synchronized FirebaseMessaging m9236n() {
        return getInstance(C2267e.m10839k());
    }

    /* JADX INFO: renamed from: o */
    private static synchronized C1718Z m9237o(Context context) {
        try {
            if (f8477m == null) {
                f8477m = new C1718Z(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8477m;
    }

    /* JADX INFO: renamed from: p */
    private String m9238p() {
        return "[DEFAULT]".equals(this.f8480a.m10849l()) ? "" : this.f8480a.m10851n();
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC2372i m9239s() {
        return (InterfaceC2372i) f8478n.get();
    }

    /* JADX INFO: renamed from: t */
    private void m9240t() {
        this.f8482c.m9213e().addOnSuccessListener(this.f8485f, new OnSuccessListener() { // from class: com.google.firebase.messaging.w
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m9231f(this.f8672a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m9241u() {
        AbstractC1706O.m9340c(this.f8481b);
        AbstractC1708Q.m9349f(this.f8481b, this.f8482c, m9243z());
        if (m9243z()) {
            m9240t();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m9242v(String str) {
        if ("[DEFAULT]".equals(this.f8480a.m10849l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f8480a.m10849l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C1745n(this.f8481b).m9496g(intent);
        }
    }

    /* JADX INFO: renamed from: z */
    private boolean m9243z() {
        AbstractC1706O.m9340c(this.f8481b);
        if (!AbstractC1706O.m9341d(this.f8481b)) {
            return false;
        }
        if (this.f8480a.m10847i(InterfaceC2280a.class) != null) {
            return true;
        }
        return AbstractC1699H.m9275a() && f8478n != null;
    }

    /* JADX INFO: renamed from: C */
    synchronized void m9244C(long j3) {
        m9247l(new RunnableC1720a0(this, Math.min(Math.max(30L, 2 * j3), f8476l)), j3);
        this.f8489j = true;
    }

    /* JADX INFO: renamed from: D */
    boolean m9245D(C1718Z.a aVar) {
        return aVar == null || aVar.m9386b(this.f8488i.m9304a());
    }

    /* JADX INFO: renamed from: k */
    String m9246k() throws IOException {
        final C1718Z.a aVarM9250r = m9250r();
        if (!m9245D(aVarM9250r)) {
            return aVarM9250r.f8558a;
        }
        final String strM9301c = C1700I.m9301c(this.f8480a);
        try {
            return (String) Tasks.await(this.f8483d.m9360b(strM9301c, new C1713U.a() { // from class: com.google.firebase.messaging.x
                @Override // com.google.firebase.messaging.C1713U.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f8673a;
                    return firebaseMessaging.f8482c.m9214f().onSuccessTask(firebaseMessaging.f8486g, new SuccessContinuation() { // from class: com.google.firebase.messaging.z
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
                            return FirebaseMessaging.m9226a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    /* JADX INFO: renamed from: l */
    void m9247l(Runnable runnable, long j3) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f8479o == null) {
                    f8479o = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f8479o.schedule(runnable, j3, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    Context m9248m() {
        return this.f8481b;
    }

    /* JADX INFO: renamed from: q */
    public Task m9249q() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8485f.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m9228c(this.f8676d, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: r */
    C1718Z.a m9250r() {
        return m9237o(this.f8481b).m9381d(m9238p(), C1700I.m9301c(this.f8480a));
    }

    /* JADX INFO: renamed from: w */
    public boolean m9251w() {
        return this.f8484e.m9257c();
    }

    /* JADX INFO: renamed from: x */
    boolean m9252x() {
        return this.f8488i.m9308g();
    }

    /* JADX INFO: renamed from: y */
    synchronized void m9253y(boolean z2) {
        this.f8489j = z2;
    }

    FirebaseMessaging(C2267e c2267e, InterfaceC2603a interfaceC2603a, InterfaceC0027b interfaceC0027b, InterfaceC0027b interfaceC0027b2, InterfaceC0081e interfaceC0081e, InterfaceC0027b interfaceC0027b3, InterfaceC2527d interfaceC2527d, C1700I c1700i) {
        this(c2267e, interfaceC2603a, interfaceC0027b3, interfaceC2527d, c1700i, new C1694D(c2267e, c1700i, interfaceC0027b, interfaceC0027b2, interfaceC0081e), AbstractC1746o.m9503f(), AbstractC1746o.m9500c(), AbstractC1746o.m9499b());
    }

    FirebaseMessaging(C2267e c2267e, InterfaceC2603a interfaceC2603a, InterfaceC0027b interfaceC0027b, InterfaceC2527d interfaceC2527d, C1700I c1700i, C1694D c1694d, Executor executor, Executor executor2, Executor executor3) {
        this.f8489j = false;
        f8478n = interfaceC0027b;
        this.f8480a = c2267e;
        this.f8484e = new C1697a(interfaceC2527d);
        Context contextM10848j = c2267e.m10848j();
        this.f8481b = contextM10848j;
        C1748q c1748q = new C1748q();
        this.f8490k = c1748q;
        this.f8488i = c1700i;
        this.f8482c = c1694d;
        this.f8483d = new C1713U(executor);
        this.f8485f = executor2;
        this.f8486g = executor3;
        Context contextM10848j2 = c2267e.m10848j();
        if (contextM10848j2 instanceof Application) {
            ((Application) contextM10848j2).registerActivityLifecycleCallbacks(c1748q);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextM10848j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC2603a != null) {
            interfaceC2603a.m12359a(new InterfaceC2603a.a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m9227b(this.f8669d);
            }
        });
        Task taskM9435e = C1728e0.m9435e(this, c1700i, c1694d, contextM10848j, AbstractC1746o.m9504g());
        this.f8487h = taskM9435e;
        taskM9435e.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m9233h(this.f8670a, (C1728e0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f8671d.m9241u();
            }
        });
    }
}
