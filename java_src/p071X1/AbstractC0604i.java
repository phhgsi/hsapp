package p071X1;

import p090c2.InterfaceC1314a;
import p090c2.InterfaceC1317d;

/* JADX INFO: renamed from: X1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0604i extends AbstractC0598c implements InterfaceC0603h, InterfaceC1317d {

    /* JADX INFO: renamed from: k */
    private final int f2005k;

    /* JADX INFO: renamed from: l */
    private final int f2006l;

    public AbstractC0604i(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f2005k = i3;
        this.f2006l = i4 >> 1;
    }

    @Override // p071X1.InterfaceC0603h
    /* JADX INFO: renamed from: b */
    public int mo1771b() {
        return this.f2005k;
    }

    @Override // p071X1.AbstractC0598c
    /* JADX INFO: renamed from: e */
    protected InterfaceC1314a mo2132e() {
        return AbstractC0614s.m2155a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0604i) {
            AbstractC0604i abstractC0604i = (AbstractC0604i) obj;
            return m2134h().equals(abstractC0604i.m2134h()) && m2136j().equals(abstractC0604i.m2136j()) && this.f2006l == abstractC0604i.f2006l && this.f2005k == abstractC0604i.f2005k && AbstractC0606k.m2141a(m2133g(), abstractC0604i.m2133g()) && AbstractC0606k.m2141a(m2135i(), abstractC0604i.m2135i());
        }
        if (obj instanceof InterfaceC1317d) {
            return obj.equals(mo2131c());
        }
        return false;
    }

    public int hashCode() {
        return (((m2135i() == null ? 0 : m2135i().hashCode() * 31) + m2134h().hashCode()) * 31) + m2136j().hashCode();
    }

    public String toString() {
        InterfaceC1314a interfaceC1314aMo2131c = mo2131c();
        if (interfaceC1314aMo2131c != this) {
            return interfaceC1314aMo2131c.toString();
        }
        if ("<init>".equals(m2134h())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m2134h() + " (Kotlin reflection is not available)";
    }
}
