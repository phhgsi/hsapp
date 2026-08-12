package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0150k;
import p067W0.AbstractC0556b;
import p067W0.AbstractC0557c;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
final class C1495b {

    /* JADX INFO: renamed from: a */
    final C1494a f7488a;

    /* JADX INFO: renamed from: b */
    final C1494a f7489b;

    /* JADX INFO: renamed from: c */
    final C1494a f7490c;

    /* JADX INFO: renamed from: d */
    final C1494a f7491d;

    /* JADX INFO: renamed from: e */
    final C1494a f7492e;

    /* JADX INFO: renamed from: f */
    final C1494a f7493f;

    /* JADX INFO: renamed from: g */
    final C1494a f7494g;

    /* JADX INFO: renamed from: h */
    final Paint f7495h;

    C1495b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0556b.m2074f(context, AbstractC0140a.f351s, C1499f.class.getCanonicalName()), AbstractC0150k.f912i3);
        this.f7488a = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f952m3, 0));
        this.f7494g = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f932k3, 0));
        this.f7489b = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f942l3, 0));
        this.f7490c = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f962n3, 0));
        ColorStateList colorStateListM2077a = AbstractC0557c.m2077a(context, typedArrayObtainStyledAttributes, AbstractC0150k.f972o3);
        this.f7491d = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f991q3, 0));
        this.f7492e = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f982p3, 0));
        this.f7493f = C1494a.m8136a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f1000r3, 0));
        Paint paint = new Paint();
        this.f7495h = paint;
        paint.setColor(colorStateListM2077a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
