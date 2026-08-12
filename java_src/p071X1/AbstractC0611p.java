package p071X1;

import p090c2.InterfaceC1314a;
import p090c2.InterfaceC1319f;

/* JADX INFO: renamed from: X1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0611p extends AbstractC0598c implements InterfaceC1319f {

    /* JADX INFO: renamed from: k */
    private final boolean f2010k;

    public AbstractC0611p(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f2010k = (i3 & 2) == 2;
    }

    @Override // p071X1.AbstractC0598c
    /* JADX INFO: renamed from: c */
    public InterfaceC1314a mo2131c() {
        return this.f2010k ? this : super.mo2131c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0611p) {
            AbstractC0611p abstractC0611p = (AbstractC0611p) obj;
            return m2135i().equals(abstractC0611p.m2135i()) && m2134h().equals(abstractC0611p.m2134h()) && m2136j().equals(abstractC0611p.m2136j()) && AbstractC0606k.m2141a(m2133g(), abstractC0611p.m2133g());
        }
        if (obj instanceof InterfaceC1319f) {
            return obj.equals(mo2131c());
        }
        return false;
    }

    public int hashCode() {
        return (((m2135i().hashCode() * 31) + m2134h().hashCode()) * 31) + m2136j().hashCode();
    }

    public String toString() {
        InterfaceC1314a interfaceC1314aMo2131c = mo2131c();
        if (interfaceC1314aMo2131c != this) {
            return interfaceC1314aMo2131c.toString();
        }
        return "property " + m2134h() + " (Kotlin reflection is not available)";
    }
}
