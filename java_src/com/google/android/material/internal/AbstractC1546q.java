package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0888e0;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0556b;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: com.google.android.material.internal.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1546q {

    /* JADX INFO: renamed from: a */
    private static final int[] f7801a = {AbstractC1760a.f8722w};

    /* JADX INFO: renamed from: b */
    private static final int[] f7802b = {AbstractC0140a.f340h};

    /* JADX INFO: renamed from: a */
    public static void m8480a(Context context) {
        m8484e(context, f7801a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    private static void m8481b(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f937k8, i3, i4);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f957m8, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(AbstractC0140a.f347o, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m8482c(context);
            }
        }
        m8480a(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m8482c(Context context) {
        m8484e(context, f7802b, "Theme.MaterialComponents");
    }

    /* JADX INFO: renamed from: d */
    private static void m8483d(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        boolean zM8485f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f937k8, i3, i4);
        if (!typedArrayObtainStyledAttributes.getBoolean(AbstractC0150k.f967n8, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zM8485f = typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f947l8, -1) != -1;
        } else {
            zM8485f = m8485f(context, attributeSet, iArr, i3, i4, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zM8485f) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m8484e(Context context, int[] iArr, String str) {
        if (m8487h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* JADX INFO: renamed from: f */
    private static boolean m8485f(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
        for (int i5 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i5, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8486g(Context context) {
        return AbstractC0556b.m2070b(context, AbstractC0140a.f346n, false);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m8487h(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i3)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static TypedArray m8488i(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        m8481b(context, attributeSet, i3, i4);
        m8483d(context, attributeSet, iArr, i3, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
    }

    /* JADX INFO: renamed from: j */
    public static C0888e0 m8489j(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        m8481b(context, attributeSet, i3, i4);
        m8483d(context, attributeSet, iArr, i3, i4, iArr2);
        return C0888e0.m3765v(context, attributeSet, iArr, i3, i4);
    }
}
