package p110h2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p041N1.C0447j;
import p041N1.InterfaceC0446i;
import p102f2.AbstractC1900F;
import p102f2.AbstractC1964w;
import p102f2.AbstractC1968y;
import p102f2.InterfaceC1903I;

/* JADX INFO: renamed from: h2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2003j extends AbstractC1964w implements InterfaceC1903I {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9578k = AtomicIntegerFieldUpdater.newUpdater(C2003j.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: f */
    private final AbstractC1964w f9579f;

    /* JADX INFO: renamed from: g */
    private final int f9580g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ InterfaceC1903I f9581h;

    /* JADX INFO: renamed from: i */
    private final C2008o f9582i;

    /* JADX INFO: renamed from: j */
    private final Object f9583j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: h2.j$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: d */
        private Runnable f9584d;

        public a(Runnable runnable) {
            this.f9584d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i3 = 0;
            while (true) {
                try {
                    this.f9584d.run();
                } catch (Throwable th) {
                    AbstractC1968y.m10038a(C0447j.f1593d, th);
                }
                Runnable runnableM10136J = C2003j.this.m10136J();
                if (runnableM10136J == null) {
                    return;
                }
                this.f9584d = runnableM10136J;
                i3++;
                if (i3 >= 16 && C2003j.this.f9579f.mo10029E(C2003j.this)) {
                    C2003j.this.f9579f.mo9836D(C2003j.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2003j(AbstractC1964w abstractC1964w, int i3) {
        this.f9579f = abstractC1964w;
        this.f9580g = i3;
        InterfaceC1903I interfaceC1903I = abstractC1964w instanceof InterfaceC1903I ? (InterfaceC1903I) abstractC1964w : null;
        this.f9581h = interfaceC1903I == null ? AbstractC1900F.m9792a() : interfaceC1903I;
        this.f9582i = new C2008o(false);
        this.f9583j = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final Runnable m10136J() {
        while (true) {
            Runnable runnable = (Runnable) this.f9582i.m10162e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9583j) {
                f9578k.decrementAndGet(this);
                if (this.f9582i.m10161c() == 0) {
                    return null;
                }
                f9578k.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    private final boolean m10137K() {
        synchronized (this.f9583j) {
            if (f9578k.get(this) >= this.f9580g) {
                return false;
            }
            f9578k.incrementAndGet(this);
            return true;
        }
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        Runnable runnableM10136J;
        this.f9582i.m10159a(runnable);
        if (f9578k.get(this) >= this.f9580g || !m10137K() || (runnableM10136J = m10136J()) == null) {
            return;
        }
        this.f9579f.mo9836D(this, new a(runnableM10136J));
    }
}
