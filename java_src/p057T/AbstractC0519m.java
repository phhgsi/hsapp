package p057T;

import androidx.fragment.app.Fragment;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0519m extends RuntimeException {

    /* JADX INFO: renamed from: d */
    private final Fragment f1775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0519m(Fragment fragment, String str) {
        super(str);
        AbstractC0606k.m2145e(fragment, "fragment");
        this.f1775d = fragment;
    }

    /* JADX INFO: renamed from: a */
    public final Fragment m1871a() {
        return this.f1775d;
    }
}
