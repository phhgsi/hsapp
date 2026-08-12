package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: com.google.android.material.drawable.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1519d {

    /* JADX INFO: renamed from: com.google.android.material.drawable.d$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static void m8259a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.drawable.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static void m8260a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m8248a(Drawable drawable, Drawable drawable2) {
        return m8249b(drawable, drawable2, -1, -1);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m8249b(Drawable drawable, Drawable drawable2, int i3, int i4) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i3 == -1) {
            i3 = m8255h(drawable, drawable2);
        }
        if (i4 == -1) {
            i4 = m8254g(drawable, drawable2);
        }
        if (i3 > drawable.getIntrinsicWidth() || i4 > drawable.getIntrinsicHeight()) {
            float f3 = i3 / i4;
            if (f3 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i4 = (int) (intrinsicWidth / f3);
                i3 = intrinsicWidth;
            } else {
                i4 = drawable.getIntrinsicHeight();
                i3 = (int) (f3 * i4);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i3, i4);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m8250c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m8251d(drawable, colorStateList, mode, false);
    }

    /* JADX INFO: renamed from: d */
    private static Drawable m8251d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z2) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = AbstractC0000a.m17r(drawable).mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m8252e(int[] iArr) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 == 16842912) {
                return iArr;
            }
            if (i4 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i3] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: f */
    public static ColorStateList m8253f(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC1516a.m8245a(drawable)) {
            return null;
        }
        return AbstractC1517b.m8246a(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: g */
    private static int m8254g(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    /* JADX INFO: renamed from: h */
    private static int m8255h(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: i */
    public static AttributeSet m8256i(Context context, int i3, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i3);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e3) {
            e = e3;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e4) {
            e = e4;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8257j(Outline outline, Path path) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            b.m8260a(outline, path);
            return;
        }
        if (i3 >= 29) {
            try {
                a.m8259a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.m8259a(outline, path);
        }
    }

    /* JADX INFO: renamed from: k */
    public static PorterDuffColorFilter m8258k(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
