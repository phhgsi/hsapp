package p057T;

import androidx.fragment.app.Fragment;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0516j extends AbstractC0518l {

    /* JADX INFO: renamed from: e */
    private final Fragment f1772e;

    /* JADX INFO: renamed from: f */
    private final int f1773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516j(Fragment fragment, Fragment fragment2, int i3) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i3 + " for fragment " + fragment);
        AbstractC0606k.m2145e(fragment, "fragment");
        AbstractC0606k.m2145e(fragment2, "targetFragment");
        this.f1772e = fragment2;
        this.f1773f = i3;
    }
}
