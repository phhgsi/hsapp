package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.appcompat.app.AbstractC0740E;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1680c;
import com.google.firebase.installations.C1681d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p002A1.InterfaceC0027b;
import p005B1.C0083g;
import p005B1.InterfaceC0081e;
import p008C1.AbstractC0090d;
import p008C1.C0088b;
import p008C1.C0089c;
import p011D1.AbstractC0101d;
import p011D1.AbstractC0103f;
import p011D1.C0100c;
import p129m1.C2267e;
import p139p1.C2343x;

/* JADX INFO: renamed from: com.google.firebase.installations.c */
/* JADX INFO: loaded from: classes.dex */
public class C1680c implements InterfaceC0081e {

    /* JADX INFO: renamed from: m */
    private static final Object f8429m = new Object();

    /* JADX INFO: renamed from: n */
    private static final ThreadFactory f8430n = new a();

    /* JADX INFO: renamed from: a */
    private final C2267e f8431a;

    /* JADX INFO: renamed from: b */
    private final C0100c f8432b;

    /* JADX INFO: renamed from: c */
    private final C0089c f8433c;

    /* JADX INFO: renamed from: d */
    private final C1686i f8434d;

    /* JADX INFO: renamed from: e */
    private final C2343x f8435e;

    /* JADX INFO: renamed from: f */
    private final C0083g f8436f;

    /* JADX INFO: renamed from: g */
    private final Object f8437g;

    /* JADX INFO: renamed from: h */
    private final ExecutorService f8438h;

    /* JADX INFO: renamed from: i */
    private final Executor f8439i;

    /* JADX INFO: renamed from: j */
    private String f8440j;

    /* JADX INFO: renamed from: k */
    private Set f8441k;

    /* JADX INFO: renamed from: l */
    private final List f8442l;

    /* JADX INFO: renamed from: com.google.firebase.installations.c$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f8443a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f8443a.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.c$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f8444a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f8445b;

        static {
            int[] iArr = new int[AbstractC0103f.b.values().length];
            f8445b = iArr;
            try {
                iArr[AbstractC0103f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8445b[AbstractC0103f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8445b[AbstractC0103f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC0101d.b.values().length];
            f8444a = iArr2;
            try {
                iArr2[AbstractC0101d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8444a[AbstractC0101d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C1680c(final C2267e c2267e, InterfaceC0027b interfaceC0027b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c2267e, new C0100c(c2267e.m10848j(), interfaceC0027b), new C0089c(c2267e), C1686i.m9192c(), new C2343x(new InterfaceC0027b() { // from class: B1.a
            @Override // p002A1.InterfaceC0027b
            public final Object get() {
                return C1680c.m9167f(c2267e);
            }
        }), new C0083g());
    }

    /* JADX INFO: renamed from: A */
    private void m9161A(AbstractC0090d abstractC0090d) {
        synchronized (this.f8437g) {
            try {
                Iterator it = this.f8442l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1685h) it.next()).mo9189a(abstractC0090d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private synchronized void m9162B(String str) {
        this.f8440j = str;
    }

    /* JADX INFO: renamed from: C */
    private synchronized void m9163C(AbstractC0090d abstractC0090d, AbstractC0090d abstractC0090d2) {
        if (this.f8441k.size() != 0 && !TextUtils.equals(abstractC0090d.mo217d(), abstractC0090d2.mo217d())) {
            Iterator it = this.f8441k.iterator();
            if (it.hasNext()) {
                AbstractC0740E.m2693a(it.next());
                abstractC0090d2.mo217d();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0088b m9167f(C2267e c2267e) {
        return new C0088b(c2267e);
    }

    /* JADX INFO: renamed from: g */
    private Task m9168g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m9170i(new C1682e(this.f8434d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: h */
    private Task m9169h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m9170i(new C1683f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: i */
    private void m9170i(InterfaceC1685h interfaceC1685h) {
        synchronized (this.f8437g) {
            this.f8442l.add(interfaceC1685h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m9171j(boolean z2) {
        AbstractC0090d abstractC0090dM9183y;
        AbstractC0090d abstractC0090dM9178s = m9178s();
        try {
            if (abstractC0090dM9178s.m246i() || abstractC0090dM9178s.m249l()) {
                abstractC0090dM9183y = m9183y(abstractC0090dM9178s);
            } else {
                if (!z2 && !this.f8434d.m9199f(abstractC0090dM9178s)) {
                    return;
                }
                abstractC0090dM9183y = m9173l(abstractC0090dM9178s);
            }
            m9180v(abstractC0090dM9183y);
            m9163C(abstractC0090dM9178s, abstractC0090dM9183y);
            if (abstractC0090dM9183y.m248k()) {
                m9162B(abstractC0090dM9183y.mo217d());
            }
            if (abstractC0090dM9183y.m246i()) {
                m9184z(new C1681d(C1681d.a.BAD_CONFIG));
            } else if (abstractC0090dM9183y.m247j()) {
                m9184z(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                m9161A(abstractC0090dM9183y);
            }
        } catch (C1681d e3) {
            m9184z(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m9172k(final boolean z2) {
        AbstractC0090d abstractC0090dM9179t = m9179t();
        if (z2) {
            abstractC0090dM9179t = abstractC0090dM9179t.m252p();
        }
        m9161A(abstractC0090dM9179t);
        this.f8439i.execute(new Runnable() { // from class: B1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f153d.m9171j(z2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private AbstractC0090d m9173l(AbstractC0090d abstractC0090d) throws C1681d {
        AbstractC0103f abstractC0103fM306e = this.f8432b.m306e(m9185m(), abstractC0090d.mo217d(), m9187u(), abstractC0090d.mo219f());
        int i3 = b.f8445b[abstractC0103fM306e.mo281b().ordinal()];
        if (i3 == 1) {
            return abstractC0090d.m251o(abstractC0103fM306e.mo282c(), abstractC0103fM306e.mo283d(), this.f8434d.m9197b());
        }
        if (i3 == 2) {
            return abstractC0090d.m253q("BAD CONFIG");
        }
        if (i3 != 3) {
            throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
        }
        m9162B(null);
        return abstractC0090d.m254r();
    }

    /* JADX INFO: renamed from: o */
    private synchronized String m9174o() {
        return this.f8440j;
    }

    /* JADX INFO: renamed from: p */
    private C0088b m9175p() {
        return (C0088b) this.f8435e.get();
    }

    /* JADX INFO: renamed from: q */
    public static C1680c m9176q() {
        return m9177r(C2267e.m10839k());
    }

    /* JADX INFO: renamed from: r */
    public static C1680c m9177r(C2267e c2267e) {
        Preconditions.checkArgument(c2267e != null, "Null is not a valid value of FirebaseApp.");
        return (C1680c) c2267e.m10847i(InterfaceC0081e.class);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: s */
    private AbstractC0090d m9178s() {
        AbstractC0090d abstractC0090dM243d;
        synchronized (f8429m) {
            try {
                C1679b c1679bM9159a = C1679b.m9159a(this.f8431a.m10848j(), "generatefid.lock");
                try {
                    abstractC0090dM243d = this.f8433c.m243d();
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                } catch (Throwable th) {
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC0090dM243d;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: t */
    private AbstractC0090d m9179t() {
        AbstractC0090d abstractC0090dM243d;
        synchronized (f8429m) {
            try {
                C1679b c1679bM9159a = C1679b.m9159a(this.f8431a.m10848j(), "generatefid.lock");
                try {
                    abstractC0090dM243d = this.f8433c.m243d();
                    if (abstractC0090dM243d.m247j()) {
                        abstractC0090dM243d = this.f8433c.m242b(abstractC0090dM243d.m256t(m9182x(abstractC0090dM243d)));
                    }
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                } catch (Throwable th) {
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC0090dM243d;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: v */
    private void m9180v(AbstractC0090d abstractC0090d) {
        synchronized (f8429m) {
            try {
                C1679b c1679bM9159a = C1679b.m9159a(this.f8431a.m10848j(), "generatefid.lock");
                try {
                    this.f8433c.m242b(abstractC0090d);
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                } catch (Throwable th) {
                    if (c1679bM9159a != null) {
                        c1679bM9159a.m9160b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private void m9181w() {
        Preconditions.checkNotEmpty(m9186n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m9187u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(m9185m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(C1686i.m9195h(m9186n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(C1686i.m9194g(m9185m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX INFO: renamed from: x */
    private String m9182x(AbstractC0090d abstractC0090d) {
        if ((!this.f8431a.m10849l().equals("CHIME_ANDROID_SDK") && !this.f8431a.m10853t()) || !abstractC0090d.m250m()) {
            return this.f8436f.m198a();
        }
        String strM238f = m9175p().m238f();
        return TextUtils.isEmpty(strM238f) ? this.f8436f.m198a() : strM238f;
    }

    /* JADX INFO: renamed from: y */
    private AbstractC0090d m9183y(AbstractC0090d abstractC0090d) throws C1681d {
        AbstractC0101d abstractC0101dM305d = this.f8432b.m305d(m9185m(), abstractC0090d.mo217d(), m9187u(), m9186n(), (abstractC0090d.mo217d() == null || abstractC0090d.mo217d().length() != 11) ? null : m9175p().m239i());
        int i3 = b.f8444a[abstractC0101dM305d.mo273e().ordinal()];
        if (i3 == 1) {
            return abstractC0090d.m255s(abstractC0101dM305d.mo271c(), abstractC0101dM305d.mo272d(), this.f8434d.m9197b(), abstractC0101dM305d.mo270b().mo282c(), abstractC0101dM305d.mo270b().mo283d());
        }
        if (i3 == 2) {
            return abstractC0090d.m253q("BAD CONFIG");
        }
        throw new C1681d("Firebase Installations Service is unavailable. Please try again later.", C1681d.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: z */
    private void m9184z(Exception exc) {
        synchronized (this.f8437g) {
            try {
                Iterator it = this.f8442l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1685h) it.next()).mo9190b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p005B1.InterfaceC0081e
    /* JADX INFO: renamed from: b */
    public Task mo193b() {
        m9181w();
        String strM9174o = m9174o();
        if (strM9174o != null) {
            return Tasks.forResult(strM9174o);
        }
        Task taskM9169h = m9169h();
        this.f8438h.execute(new Runnable() { // from class: B1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f152d.m9172k(false);
            }
        });
        return taskM9169h;
    }

    @Override // p005B1.InterfaceC0081e
    /* JADX INFO: renamed from: c */
    public Task mo194c(final boolean z2) {
        m9181w();
        Task taskM9168g = m9168g();
        this.f8438h.execute(new Runnable() { // from class: B1.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f155d.m9172k(z2);
            }
        });
        return taskM9168g;
    }

    /* JADX INFO: renamed from: m */
    String m9185m() {
        return this.f8431a.m10850m().m10861b();
    }

    /* JADX INFO: renamed from: n */
    String m9186n() {
        return this.f8431a.m10850m().m10862c();
    }

    /* JADX INFO: renamed from: u */
    String m9187u() {
        return this.f8431a.m10850m().m10864e();
    }

    C1680c(ExecutorService executorService, Executor executor, C2267e c2267e, C0100c c0100c, C0089c c0089c, C1686i c1686i, C2343x c2343x, C0083g c0083g) {
        this.f8437g = new Object();
        this.f8441k = new HashSet();
        this.f8442l = new ArrayList();
        this.f8431a = c2267e;
        this.f8432b = c0100c;
        this.f8433c = c0089c;
        this.f8434d = c1686i;
        this.f8435e = c2343x;
        this.f8436f = c0083g;
        this.f8438h = executorService;
        this.f8439i = executor;
    }
}
