package p057T;

import androidx.fragment.app.Fragment;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0507a extends AbstractC0519m {

    /* JADX INFO: renamed from: e */
    private final String f1753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        AbstractC0606k.m2145e(fragment, "fragment");
        AbstractC0606k.m2145e(str, "previousFragmentId");
        this.f1753e = str;
    }
}
