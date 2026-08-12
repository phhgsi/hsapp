package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0718r {

    /* JADX INFO: renamed from: a */
    private static final int f2469a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b */
    private static final int f2470b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c */
    private static InterfaceC0664B f2471c;

    /* JADX INFO: renamed from: a */
    public static final void m2635a(ComponentActivity componentActivity, C0688K c0688k, C0688K c0688k2) {
        AbstractC0606k.m2145e(componentActivity, "<this>");
        AbstractC0606k.m2145e(c0688k, "statusBarStyle");
        AbstractC0606k.m2145e(c0688k2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView, "window.decorView");
        InterfaceC0577l interfaceC0577lM2582b = c0688k.m2582b();
        Resources resources = decorView.getResources();
        AbstractC0606k.m2144d(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) interfaceC0577lM2582b.mo1406f(resources)).booleanValue();
        InterfaceC0577l interfaceC0577lM2582b2 = c0688k2.m2582b();
        Resources resources2 = decorView.getResources();
        AbstractC0606k.m2144d(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) interfaceC0577lM2582b2.mo1406f(resources2)).booleanValue();
        InterfaceC0664B c0731z = f2471c;
        if (c0731z == null) {
            int i3 = Build.VERSION.SDK_INT;
            c0731z = i3 >= 30 ? new C0731z() : i3 >= 29 ? new C0730y() : i3 >= 28 ? new C0727v() : i3 >= 26 ? new C0725t() : new C0724s();
        }
        InterfaceC0664B interfaceC0664B = c0731z;
        Window window = componentActivity.getWindow();
        AbstractC0606k.m2144d(window, "window");
        interfaceC0664B.mo2499a(c0688k, c0688k2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        AbstractC0606k.m2144d(window2, "window");
        interfaceC0664B.mo2498b(window2);
    }
}
