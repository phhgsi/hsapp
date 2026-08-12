package p161x;

import android.content.res.Configuration;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: x.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2510i {

    /* JADX INFO: renamed from: a */
    private final boolean f11697a;

    /* JADX INFO: renamed from: b */
    private Configuration f11698b;

    public C2510i(boolean z2) {
        this.f11697a = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11925a() {
        return this.f11697a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2510i(boolean z2, Configuration configuration) {
        this(z2);
        AbstractC0606k.m2145e(configuration, "newConfig");
        this.f11698b = configuration;
    }
}
