package p057T;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: T.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0520n extends AbstractC0519m {

    /* JADX INFO: renamed from: e */
    private final ViewGroup f1776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520n(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        AbstractC0606k.m2145e(fragment, "fragment");
        AbstractC0606k.m2145e(viewGroup, "container");
        this.f1776e = viewGroup;
    }
}
