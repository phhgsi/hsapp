package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import p016F0.AbstractC0150k;
import p024I.AbstractC0211h;
import p067W0.AbstractC0557c;
import p076Z0.C0637h;
import p076Z0.C0641l;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
final class C1494a {

    /* JADX INFO: renamed from: a */
    private final Rect f7482a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f7483b;

    /* JADX INFO: renamed from: c */
    private final ColorStateList f7484c;

    /* JADX INFO: renamed from: d */
    private final ColorStateList f7485d;

    /* JADX INFO: renamed from: e */
    private final int f7486e;

    /* JADX INFO: renamed from: f */
    private final C0641l f7487f;

    private C1494a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i3, C0641l c0641l, Rect rect) {
        AbstractC0211h.m607d(rect.left);
        AbstractC0211h.m607d(rect.top);
        AbstractC0211h.m607d(rect.right);
        AbstractC0211h.m607d(rect.bottom);
        this.f7482a = rect;
        this.f7483b = colorStateList2;
        this.f7484c = colorStateList;
        this.f7485d = colorStateList3;
        this.f7486e = i3;
        this.f7487f = c0641l;
    }

    /* JADX INFO: renamed from: a */
    static C1494a m8136a(Context context, int i3) {
        AbstractC0211h.m605b(i3 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0150k.f1009s3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0150k.f1018t3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0150k.f1036v3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0150k.f1027u3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0150k.f1045w3, 0));
        ColorStateList colorStateListM2077a = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f1054x3);
        ColorStateList colorStateListM2077a2 = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f616C3);
        ColorStateList colorStateListM2077a3 = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f598A3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0150k.f607B3, 0);
        C0641l c0641lM2351m = C0641l.m2305b(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f1063y3, 0), typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f1072z3, 0)).m2351m();
        typedArrayObtainStyledAttributes.recycle();
        return new C1494a(colorStateListM2077a, colorStateListM2077a2, colorStateListM2077a3, dimensionPixelSize, c0641lM2351m, rect);
    }

    /* JADX INFO: renamed from: b */
    void m8137b(TextView textView) {
        m8138c(textView, null, null);
    }

    /* JADX INFO: renamed from: c */
    void m8138c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C0637h c0637h = new C0637h();
        C0637h c0637h2 = new C0637h();
        c0637h.setShapeAppearanceModel(this.f7487f);
        c0637h2.setShapeAppearanceModel(this.f7487f);
        if (colorStateList == null) {
            colorStateList = this.f7484c;
        }
        c0637h.m2274c0(colorStateList);
        c0637h.m2281j0(this.f7486e, this.f7485d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f7483b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7483b.withAlpha(30), c0637h, c0637h2);
        Rect rect = this.f7482a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
