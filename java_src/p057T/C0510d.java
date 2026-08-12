package p057T;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0510d extends AbstractC0519m {

    /* JADX INFO: renamed from: e */
    private final ViewGroup f1771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0510d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        AbstractC0606k.m2145e(fragment, "fragment");
        this.f1771e = viewGroup;
    }
}
