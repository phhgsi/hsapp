package p161x;

import android.content.res.Configuration;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: x.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2519r {

    /* JADX INFO: renamed from: a */
    private final boolean f11785a;

    /* JADX INFO: renamed from: b */
    private Configuration f11786b;

    public C2519r(boolean z2) {
        this.f11785a = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12043a() {
        return this.f11785a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2519r(boolean z2, Configuration configuration) {
        this(z2);
        AbstractC0606k.m2145e(configuration, "newConfig");
        this.f11786b = configuration;
    }
}
