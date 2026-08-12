package p089c1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C0774d;
import p016F0.AbstractC0140a;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1313a {

    /* JADX INFO: renamed from: a */
    private static final int[] f6392a = {R.attr.theme, AbstractC1760a.f8697O};

    /* JADX INFO: renamed from: b */
    private static final int[] f6393b = {AbstractC0140a.f355w};

    /* JADX INFO: renamed from: a */
    private static int m6665a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6392a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* JADX INFO: renamed from: b */
    private static int[] m6666b(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr2[i5] = typedArrayObtainStyledAttributes.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: c */
    private static int m6667c(Context context, AttributeSet attributeSet, int i3, int i4) {
        return m6666b(context, attributeSet, f6393b, i3, i4)[0];
    }

    /* JADX INFO: renamed from: d */
    public static Context m6668d(Context context, AttributeSet attributeSet, int i3, int i4) {
        return m6669e(context, attributeSet, i3, i4, new int[0]);
    }

    /* JADX INFO: renamed from: e */
    public static Context m6669e(Context context, AttributeSet attributeSet, int i3, int i4, int[] iArr) {
        int iM6667c = m6667c(context, attributeSet, i3, i4);
        boolean z2 = (context instanceof C0774d) && ((C0774d) context).m3013c() == iM6667c;
        if (iM6667c == 0 || z2) {
            return context;
        }
        C0774d c0774d = new C0774d(context, iM6667c);
        for (int i5 : m6666b(context, attributeSet, iArr, i3, i4)) {
            if (i5 != 0) {
                c0774d.getTheme().applyStyle(i5, true);
            }
        }
        int iM6665a = m6665a(context, attributeSet);
        if (iM6665a != 0) {
            c0774d.getTheme().applyStyle(iM6665a, true);
        }
        return c0774d;
    }
}
