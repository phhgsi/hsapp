package p156v0;

import p032K1.InterfaceC0359a;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2474a implements InterfaceC0359a {

    /* JADX INFO: renamed from: c */
    private static final Object f11483c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC0359a f11484a;

    /* JADX INFO: renamed from: b */
    private volatile Object f11485b = f11483c;

    private C2474a(InterfaceC0359a interfaceC0359a) {
        this.f11484a = interfaceC0359a;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0359a m11785a(InterfaceC0359a interfaceC0359a) {
        AbstractC2477d.m11789b(interfaceC0359a);
        return interfaceC0359a instanceof C2474a ? interfaceC0359a : new C2474a(interfaceC0359a);
    }

    /* JADX INFO: renamed from: b */
    public static Object m11786b(Object obj, Object obj2) {
        if (obj == f11483c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p032K1.InterfaceC0359a
    public Object get() {
        Object obj;
        Object obj2 = this.f11485b;
        Object obj3 = f11483c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f11485b;
                if (obj == obj3) {
                    obj = this.f11484a.get();
                    this.f11485b = m11786b(this.f11485b, obj);
                    this.f11484a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
