package p128m0;

import android.R;
import android.graphics.drawable.Drawable;
import co.median.android.MainActivity;
import p071X1.AbstractC0606k;
import p099f.C1886e;
import p132n0.C2279a;

/* JADX INFO: renamed from: m0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2174Q {

    /* JADX INFO: renamed from: a */
    public static final C2174Q f10033a = new C2174Q();

    private C2174Q() {
    }

    /* JADX INFO: renamed from: a */
    public static final C1886e m10669a(MainActivity mainActivity, String str, String str2, int i3, int i4) {
        AbstractC0606k.m2145e(mainActivity, "activity");
        AbstractC0606k.m2145e(str, "activeIcon");
        AbstractC0606k.m2145e(str2, "inactiveIcon");
        C1886e c1886e = new C1886e();
        Drawable drawableM10885a = new C2279a(mainActivity, str, i3, i4).m10885a();
        Drawable drawableM10885a2 = new C2279a(mainActivity, str2, i3, i4).m10885a();
        c1886e.m9765j(new int[]{R.attr.state_checked}, drawableM10885a);
        c1886e.m9765j(new int[]{-16842912}, drawableM10885a2);
        return c1886e;
    }
}
