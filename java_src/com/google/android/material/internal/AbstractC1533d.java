package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import p027J.AbstractC0290i0;
import p043O0.AbstractC0450a;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: com.google.android.material.internal.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1533d {
    /* JADX INFO: renamed from: a */
    public static void m8376a(Window window, boolean z2, Integer num, Integer num2) {
        boolean z3 = num == null || num.intValue() == 0;
        boolean z4 = num2 == null || num2.intValue() == 0;
        if (z3 || z4) {
            int iM1630b = AbstractC0450a.m1630b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z3) {
                num = Integer.valueOf(iM1630b);
            }
            if (z4) {
                num2 = Integer.valueOf(iM1630b);
            }
        }
        AbstractC0290i0.m979b(window, !z2);
        int iM8378c = m8378c(window.getContext(), z2);
        int iM8377b = m8377b(window.getContext(), z2);
        window.setStatusBarColor(iM8378c);
        window.setNavigationBarColor(iM8377b);
        m8381f(window, m8379d(iM8378c, AbstractC0450a.m1636h(num.intValue())));
        m8380e(window, m8379d(iM8377b, AbstractC0450a.m1636h(num2.intValue())));
    }

    /* JADX INFO: renamed from: b */
    private static int m8377b(Context context, boolean z2) {
        if (z2 && Build.VERSION.SDK_INT < 27) {
            return AbstractC2571d.m12269k(AbstractC0450a.m1630b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z2) {
            return 0;
        }
        return AbstractC0450a.m1630b(context, R.attr.navigationBarColor, -16777216);
    }

    /* JADX INFO: renamed from: c */
    private static int m8378c(Context context, boolean z2) {
        if (z2) {
            return 0;
        }
        return AbstractC0450a.m1630b(context, R.attr.statusBarColor, -16777216);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m8379d(int i3, boolean z2) {
        if (AbstractC0450a.m1636h(i3)) {
            return true;
        }
        return i3 == 0 && z2;
    }

    /* JADX INFO: renamed from: e */
    public static void m8380e(Window window, boolean z2) {
        AbstractC0290i0.m978a(window, window.getDecorView()).m712b(z2);
    }

    /* JADX INFO: renamed from: f */
    public static void m8381f(Window window, boolean z2) {
        AbstractC0290i0.m978a(window, window.getDecorView()).m713c(z2);
    }
}
