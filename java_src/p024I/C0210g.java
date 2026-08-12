package p024I;

import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: I.g */
/* JADX INFO: loaded from: classes.dex */
public class C0210g extends C0209f {

    /* JADX INFO: renamed from: c */
    private final Object f1236c;

    public C0210g(int i3) {
        super(i3);
        this.f1236c = new Object();
    }

    @Override // p024I.C0209f, p024I.InterfaceC0208e
    /* JADX INFO: renamed from: a */
    public boolean mo601a(Object obj) {
        boolean zMo601a;
        AbstractC0606k.m2145e(obj, "instance");
        synchronized (this.f1236c) {
            zMo601a = super.mo601a(obj);
        }
        return zMo601a;
    }

    @Override // p024I.C0209f, p024I.InterfaceC0208e
    /* JADX INFO: renamed from: b */
    public Object mo602b() {
        Object objMo602b;
        synchronized (this.f1236c) {
            objMo602b = super.mo602b();
        }
        return objMo602b;
    }
}
