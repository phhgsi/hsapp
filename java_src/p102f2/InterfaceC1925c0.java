package p102f2;

import p068W1.InterfaceC0577l;

/* JADX INFO: renamed from: f2.c0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1925c0 {

    /* JADX INFO: renamed from: f2.c0$a */
    public static final class a implements InterfaceC1925c0 {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0577l f9431a;

        public a(InterfaceC0577l interfaceC0577l) {
            this.f9431a = interfaceC0577l;
        }

        @Override // p102f2.InterfaceC1925c0
        /* JADX INFO: renamed from: d */
        public void mo9857d(Throwable th) {
            this.f9431a.mo1406f(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + AbstractC1898D.m9781a(this.f9431a) + '@' + AbstractC1898D.m9782b(this) + ']';
        }
    }

    /* JADX INFO: renamed from: d */
    void mo9857d(Throwable th);
}
