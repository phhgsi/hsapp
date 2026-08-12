package androidx.lifecycle;

import androidx.lifecycle.C1106G;
import p069X.AbstractC0589a;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.H */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1107H {
    /* JADX INFO: renamed from: a */
    public static AbstractC1105F m5084a(C1106G.b bVar, Class cls) {
        AbstractC0606k.m2145e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1105F m5085b(C1106G.b bVar, Class cls, AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC0606k.m2145e(abstractC0589a, "extras");
        return bVar.mo2118a(cls);
    }
}
