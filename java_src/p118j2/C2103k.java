package p118j2;

import p102f2.AbstractC1898D;

/* JADX INFO: renamed from: j2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2103k extends AbstractRunnableC2100h {

    /* JADX INFO: renamed from: f */
    public final Runnable f9817f;

    public C2103k(Runnable runnable, long j3, InterfaceC2101i interfaceC2101i) {
        super(j3, interfaceC2101i);
        this.f9817f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f9817f.run();
        } finally {
            this.f9815e.mo10529a();
        }
    }

    public String toString() {
        return "Task[" + AbstractC1898D.m9781a(this.f9817f) + '@' + AbstractC1898D.m9782b(this.f9817f) + ", " + this.f9814d + ", " + this.f9815e + ']';
    }
}
