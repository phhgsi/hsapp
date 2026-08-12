package p115j;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public class C2044c extends AbstractC2046e {

    /* JADX INFO: renamed from: c */
    private static volatile C2044c f9660c;

    /* JADX INFO: renamed from: d */
    private static final Executor f9661d = new Executor() { // from class: j.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2044c.m10260f().mo10263c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    private static final Executor f9662e = new Executor() { // from class: j.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2044c.m10260f().mo10261a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    private AbstractC2046e f9663a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2046e f9664b;

    private C2044c() {
        C2045d c2045d = new C2045d();
        this.f9664b = c2045d;
        this.f9663a = c2045d;
    }

    /* JADX INFO: renamed from: f */
    public static C2044c m10260f() {
        if (f9660c != null) {
            return f9660c;
        }
        synchronized (C2044c.class) {
            try {
                if (f9660c == null) {
                    f9660c = new C2044c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9660c;
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: a */
    public void mo10261a(Runnable runnable) {
        this.f9663a.mo10261a(runnable);
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: b */
    public boolean mo10262b() {
        return this.f9663a.mo10262b();
    }

    @Override // p115j.AbstractC2046e
    /* JADX INFO: renamed from: c */
    public void mo10263c(Runnable runnable) {
        this.f9663a.mo10263c(runnable);
    }
}
