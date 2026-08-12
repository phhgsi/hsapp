package p139p1;

import p002A1.InterfaceC0027b;

/* JADX INFO: renamed from: p1.x */
/* JADX INFO: loaded from: classes.dex */
public class C2343x implements InterfaceC0027b {

    /* JADX INFO: renamed from: c */
    private static final Object f10777c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile Object f10778a = f10777c;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC0027b f10779b;

    public C2343x(InterfaceC0027b interfaceC0027b) {
        this.f10779b = interfaceC0027b;
    }

    @Override // p002A1.InterfaceC0027b
    public Object get() {
        Object obj;
        Object obj2 = this.f10778a;
        Object obj3 = f10777c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f10778a;
                if (obj == obj3) {
                    obj = this.f10779b.get();
                    this.f10778a = obj;
                    this.f10779b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
