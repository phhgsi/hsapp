package androidx.activity;

import android.view.View;
import android.view.Window;
import p027J.AbstractC0290i0;
import p027J.C0265U0;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.y */
/* JADX INFO: loaded from: classes.dex */
class C0730y extends C0727v {
    @Override // androidx.activity.C0725t, androidx.activity.InterfaceC0664B
    /* JADX INFO: renamed from: a */
    public void mo2499a(C0688K c0688k, C0688K c0688k2, Window window, View view, boolean z2, boolean z3) {
        AbstractC0606k.m2145e(c0688k, "statusBarStyle");
        AbstractC0606k.m2145e(c0688k2, "navigationBarStyle");
        AbstractC0606k.m2145e(window, "window");
        AbstractC0606k.m2145e(view, "view");
        AbstractC0290i0.m979b(window, false);
        window.setStatusBarColor(c0688k.m2585e(z2));
        window.setNavigationBarColor(c0688k2.m2585e(z3));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(c0688k2.m2583c() == 0);
        C0265U0 c0265u0 = new C0265U0(window, view);
        c0265u0.m713c(!z2);
        c0265u0.m712b(true ^ z3);
    }
}
