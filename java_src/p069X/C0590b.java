package p069X;

import androidx.lifecycle.AbstractC1105F;
import androidx.lifecycle.AbstractC1107H;
import androidx.lifecycle.C1106G;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: X.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0590b implements C1106G.b {

    /* JADX INFO: renamed from: a */
    private final C0594f[] f1980a;

    public C0590b(C0594f... c0594fArr) {
        AbstractC0606k.m2145e(c0594fArr, "initializers");
        this.f1980a = c0594fArr;
    }

    @Override // androidx.lifecycle.C1106G.b
    /* JADX INFO: renamed from: a */
    public /* synthetic */ AbstractC1105F mo2118a(Class cls) {
        return AbstractC1107H.m5084a(this, cls);
    }

    @Override // androidx.lifecycle.C1106G.b
    /* JADX INFO: renamed from: b */
    public AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC0606k.m2145e(abstractC0589a, "extras");
        AbstractC1105F abstractC1105F = null;
        for (C0594f c0594f : this.f1980a) {
            if (AbstractC0606k.m2141a(c0594f.m2123a(), cls)) {
                Object objMo1406f = c0594f.m2124b().mo1406f(abstractC0589a);
                abstractC1105F = objMo1406f instanceof AbstractC1105F ? (AbstractC1105F) objMo1406f : null;
            }
        }
        if (abstractC1105F != null) {
            return abstractC1105F;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
