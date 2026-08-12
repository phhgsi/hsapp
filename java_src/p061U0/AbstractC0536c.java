package p061U0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.internal.AbstractC1546q;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p067W0.AbstractC0557c;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0536c {

    /* JADX INFO: renamed from: a */
    public int f1826a;

    /* JADX INFO: renamed from: b */
    public int f1827b;

    /* JADX INFO: renamed from: c */
    public float f1828c;

    /* JADX INFO: renamed from: d */
    public boolean f1829d;

    /* JADX INFO: renamed from: e */
    public int[] f1830e = new int[0];

    /* JADX INFO: renamed from: f */
    public int f1831f;

    /* JADX INFO: renamed from: g */
    public int f1832g;

    /* JADX INFO: renamed from: h */
    public int f1833h;

    /* JADX INFO: renamed from: i */
    public int f1834i;

    /* JADX INFO: renamed from: j */
    public int f1835j;

    /* JADX INFO: renamed from: k */
    public int f1836k;

    /* JADX INFO: renamed from: l */
    public int f1837l;

    /* JADX INFO: renamed from: m */
    public int f1838m;

    /* JADX INFO: renamed from: n */
    public float f1839n;

    protected AbstractC0536c(Context context, AttributeSet attributeSet, int i3, int i4) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(AbstractC0142c.f436v0);
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f756S, i3, i4, new int[0]);
        this.f1826a = AbstractC0557c.m2080d(context, typedArrayM8488i, AbstractC0150k.f849c0, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayM8488i.peekValue(AbstractC0150k.f839b0);
        if (typedValuePeekValue != null) {
            int i5 = typedValuePeekValue.type;
            if (i5 == 5) {
                this.f1827b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayM8488i.getResources().getDisplayMetrics()), this.f1826a / 2);
                this.f1829d = false;
            } else if (i5 == 6) {
                this.f1828c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f1829d = true;
            }
        }
        this.f1832g = typedArrayM8488i.getInt(AbstractC0150k.f810Y, 0);
        this.f1833h = typedArrayM8488i.getInt(AbstractC0150k.f765T, 0);
        this.f1834i = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f792W, 0);
        int iAbs = Math.abs(typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f879f0, 0));
        this.f1835j = Math.abs(typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f889g0, iAbs));
        this.f1836k = Math.abs(typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f899h0, iAbs));
        this.f1837l = Math.abs(typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f859d0, 0));
        this.f1838m = typedArrayM8488i.getDimensionPixelSize(AbstractC0150k.f869e0, 0);
        this.f1839n = typedArrayM8488i.getFloat(AbstractC0150k.f774U, 1.0f);
        m1934e(context, typedArrayM8488i);
        m1935f(context, typedArrayM8488i);
        typedArrayM8488i.recycle();
    }

    /* JADX INFO: renamed from: e */
    private void m1934e(Context context, TypedArray typedArray) {
        int i3 = AbstractC0150k.f783V;
        if (!typedArray.hasValue(i3)) {
            this.f1830e = new int[]{AbstractC0450a.m1630b(context, AbstractC1760a.f8722w, -1)};
            return;
        }
        if (typedArray.peekValue(i3).type != 1) {
            this.f1830e = new int[]{typedArray.getColor(i3, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i3, -1));
        this.f1830e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1935f(Context context, TypedArray typedArray) {
        int i3 = AbstractC0150k.f829a0;
        if (typedArray.hasValue(i3)) {
            this.f1831f = typedArray.getColor(i3, -1);
            return;
        }
        this.f1831f = this.f1830e[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f3 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f1831f = AbstractC0450a.m1629a(this.f1831f, (int) (f3 * 255.0f));
    }

    /* JADX INFO: renamed from: a */
    public int m1936a() {
        return this.f1829d ? (int) (this.f1826a * this.f1828c) : this.f1827b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1937b(boolean z2) {
        if (this.f1837l <= 0) {
            return false;
        }
        if (z2 || this.f1836k <= 0) {
            return z2 && this.f1835j > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1938c() {
        return this.f1833h != 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1939d() {
        return this.f1832g != 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1940g() {
        return this.f1829d && this.f1828c == 0.5f;
    }

    /* JADX INFO: renamed from: h */
    void m1941h() {
        if (this.f1834i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
