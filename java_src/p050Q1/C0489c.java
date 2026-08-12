package p050Q1;

import java.io.Serializable;
import p038M1.AbstractC0409c;
import p038M1.AbstractC0413g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: Q1.c */
/* JADX INFO: loaded from: classes.dex */
final class C0489c extends AbstractC0409c implements InterfaceC0487a, Serializable {

    /* JADX INFO: renamed from: e */
    private final Enum[] f1701e;

    public C0489c(Enum[] enumArr) {
        AbstractC0606k.m2145e(enumArr, "entries");
        this.f1701e = enumArr;
    }

    @Override // p038M1.AbstractC0408b
    /* JADX INFO: renamed from: c */
    public int mo1409c() {
        return this.f1701e.length;
    }

    @Override // p038M1.AbstractC0408b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m1800e((Enum) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1800e(Enum r3) {
        AbstractC0606k.m2145e(r3, "element");
        return ((Enum) AbstractC0413g.m1448p(this.f1701e, r3.ordinal())) == r3;
    }

    @Override // p038M1.AbstractC0409c, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum get(int i3) {
        AbstractC0409c.f1524d.m1410a(i3, this.f1701e.length);
        return this.f1701e[i3];
    }

    /* JADX INFO: renamed from: g */
    public int m1802g(Enum r3) {
        AbstractC0606k.m2145e(r3, "element");
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC0413g.m1448p(this.f1701e, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public int m1803h(Enum r2) {
        AbstractC0606k.m2145e(r2, "element");
        return m1802g(r2);
    }

    @Override // p038M1.AbstractC0409c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m1802g((Enum) obj);
        }
        return -1;
    }

    @Override // p038M1.AbstractC0409c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m1803h((Enum) obj);
        }
        return -1;
    }
}
