package p097e1;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1842d implements InterfaceC1844f {

    /* JADX INFO: renamed from: c */
    private static final Object f9273c = new Object();

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC1844f f9274a;

    /* JADX INFO: renamed from: b */
    private volatile Object f9275b = f9273c;

    private C1842d(InterfaceC1844f interfaceC1844f) {
        this.f9274a = interfaceC1844f;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1844f m9638a(InterfaceC1844f interfaceC1844f) {
        interfaceC1844f.getClass();
        return interfaceC1844f instanceof C1842d ? interfaceC1844f : new C1842d(interfaceC1844f);
    }

    @Override // p097e1.InterfaceC1844f
    public final Object zza() {
        Object objZza;
        Object obj = this.f9275b;
        Object obj2 = f9273c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f9275b;
                if (objZza == obj2) {
                    objZza = this.f9274a.zza();
                    Object obj3 = this.f9275b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f9275b = objZza;
                    this.f9274a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
