package p097e1;

/* JADX INFO: renamed from: e1.u */
/* JADX INFO: loaded from: classes.dex */
final class C1859u extends AbstractRunnableC1855q {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C1836A f9294e;

    C1859u(C1836A c1836a) {
        this.f9294e = c1836a;
    }

    @Override // p097e1.AbstractRunnableC1855q
    /* JADX INFO: renamed from: a */
    public final void mo9559a() {
        synchronized (this.f9294e.f9261f) {
            try {
                if (this.f9294e.f9266k.get() > 0 && this.f9294e.f9266k.decrementAndGet() > 0) {
                    this.f9294e.f9257b.m9650c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C1836A c1836a = this.f9294e;
                if (c1836a.f9268m != null) {
                    c1836a.f9257b.m9650c("Unbind from service.", new Object[0]);
                    C1836A c1836a2 = this.f9294e;
                    c1836a2.f9256a.unbindService(c1836a2.f9267l);
                    this.f9294e.f9262g = false;
                    this.f9294e.f9268m = null;
                    this.f9294e.f9267l = null;
                }
                this.f9294e.m9627w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
