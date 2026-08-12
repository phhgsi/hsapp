package p046P0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0150k;

/* JADX INFO: renamed from: P0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0469c {
    /* JADX INFO: renamed from: a */
    public static Rect m1748a(Context context, int i3, int i4) {
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, null, AbstractC0150k.f921j2, i3, i4, new int[0]);
        int dimensionPixelSize = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f951m2, context.getResources().getDimensionPixelSize(AbstractC0142c.f391Y));
        int dimensionPixelSize2 = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f961n2, context.getResources().getDimensionPixelSize(AbstractC0142c.f392Z));
        int dimensionPixelSize3 = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f941l2, context.getResources().getDimensionPixelSize(AbstractC0142c.f390X));
        int dimensionPixelSize4 = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f931k2, context.getResources().getDimensionPixelSize(AbstractC0142c.f389W));
        typedArrayM8488i.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i5 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i5, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    /* JADX INFO: renamed from: b */
    public static InsetDrawable m1749b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
