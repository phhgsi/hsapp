package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.C */
/* JADX INFO: loaded from: classes.dex */
class C0825C {

    /* JADX INFO: renamed from: l */
    private static final RectF f3262l = new RectF();

    /* JADX INFO: renamed from: m */
    private static ConcurrentHashMap f3263m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private int f3264a = 0;

    /* JADX INFO: renamed from: b */
    private boolean f3265b = false;

    /* JADX INFO: renamed from: c */
    private float f3266c = -1.0f;

    /* JADX INFO: renamed from: d */
    private float f3267d = -1.0f;

    /* JADX INFO: renamed from: e */
    private float f3268e = -1.0f;

    /* JADX INFO: renamed from: f */
    private int[] f3269f = new int[0];

    /* JADX INFO: renamed from: g */
    private boolean f3270g = false;

    /* JADX INFO: renamed from: h */
    private TextPaint f3271h;

    /* JADX INFO: renamed from: i */
    private final TextView f3272i;

    /* JADX INFO: renamed from: j */
    private final Context f3273j;

    /* JADX INFO: renamed from: k */
    private final d f3274k;

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static StaticLayout m3414a(CharSequence charSequence, Layout.Alignment alignment, int i3, int i4, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i4 == -1) {
                i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i4);
            try {
                dVar.mo3415a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$b */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.C0825C.d
        /* JADX INFO: renamed from: a */
        void mo3415a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0825C.m3392m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$c */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C0825C.b, androidx.appcompat.widget.C0825C.d
        /* JADX INFO: renamed from: a */
        void mo3415a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0825C.d
        /* JADX INFO: renamed from: b */
        boolean mo3416b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.C$d */
    private static class d {
        d() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo3415a(StaticLayout.Builder builder, TextView textView);

        /* JADX INFO: renamed from: b */
        boolean mo3416b(TextView textView) {
            return ((Boolean) C0825C.m3392m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0825C(TextView textView) {
        this.f3272i = textView;
        this.f3273j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3274k = new c();
        } else {
            this.f3274k = new b();
        }
    }

    /* JADX INFO: renamed from: b */
    private int[] m3388b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    private void m3389c() {
        this.f3264a = 0;
        this.f3267d = -1.0f;
        this.f3268e = -1.0f;
        this.f3266c = -1.0f;
        this.f3269f = new int[0];
        this.f3265b = false;
    }

    /* JADX INFO: renamed from: e */
    private int m3390e(RectF rectF) {
        int length = this.f3269f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = 1;
        int i4 = length - 1;
        int i5 = 0;
        while (i3 <= i4) {
            int i6 = (i3 + i4) / 2;
            if (m3397x(this.f3269f[i6], rectF)) {
                int i7 = i6 + 1;
                i5 = i3;
                i3 = i7;
            } else {
                i5 = i6 - 1;
                i4 = i5;
            }
        }
        return this.f3269f[i5];
    }

    /* JADX INFO: renamed from: k */
    private static Method m3391k(String str) {
        try {
            Method declaredMethod = (Method) f3263m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f3263m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    static Object m3392m(Object obj, String str, Object obj2) {
        try {
            return m3391k(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m3393s(float f3) {
        if (f3 != this.f3272i.getPaint().getTextSize()) {
            this.f3272i.getPaint().setTextSize(f3);
            boolean zIsInLayout = this.f3272i.isInLayout();
            if (this.f3272i.getLayout() != null) {
                this.f3265b = false;
                try {
                    Method methodM3391k = m3391k("nullLayouts");
                    if (methodM3391k != null) {
                        methodM3391k.invoke(this.f3272i, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (zIsInLayout) {
                    this.f3272i.forceLayout();
                } else {
                    this.f3272i.requestLayout();
                }
                this.f3272i.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m3394u() {
        if (m3398y() && this.f3264a == 1) {
            if (!this.f3270g || this.f3269f.length == 0) {
                int iFloor = ((int) Math.floor((this.f3268e - this.f3267d) / this.f3266c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
                    iArr[i3] = Math.round(this.f3267d + (i3 * this.f3266c));
                }
                this.f3269f = m3388b(iArr);
            }
            this.f3265b = true;
        } else {
            this.f3265b = false;
        }
        return this.f3265b;
    }

    /* JADX INFO: renamed from: v */
    private void m3395v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = typedArray.getDimensionPixelSize(i3, -1);
            }
            this.f3269f = m3388b(iArr);
            m3396w();
        }
    }

    /* JADX INFO: renamed from: w */
    private boolean m3396w() {
        boolean z2 = this.f3269f.length > 0;
        this.f3270g = z2;
        if (z2) {
            this.f3264a = 1;
            this.f3267d = r0[0];
            this.f3268e = r0[r1 - 1];
            this.f3266c = -1.0f;
        }
        return z2;
    }

    /* JADX INFO: renamed from: x */
    private boolean m3397x(int i3, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f3272i.getText();
        TransformationMethod transformationMethod = this.f3272i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f3272i)) != null) {
            text = transformation;
        }
        int maxLines = this.f3272i.getMaxLines();
        m3407l(i3);
        StaticLayout staticLayoutM3401d = m3401d(text, (Layout.Alignment) m3392m(this.f3272i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM3401d.getLineCount() <= maxLines && staticLayoutM3401d.getLineEnd(staticLayoutM3401d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM3401d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: y */
    private boolean m3398y() {
        return !(this.f3272i instanceof C0899k);
    }

    /* JADX INFO: renamed from: z */
    private void m3399z(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f3264a = 1;
        this.f3267d = f3;
        this.f3268e = f4;
        this.f3266c = f5;
        this.f3270g = false;
    }

    /* JADX INFO: renamed from: a */
    void m3400a() {
        if (m3408n()) {
            if (this.f3265b) {
                if (this.f3272i.getMeasuredHeight() <= 0 || this.f3272i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3274k.mo3416b(this.f3272i) ? 1048576 : (this.f3272i.getMeasuredWidth() - this.f3272i.getTotalPaddingLeft()) - this.f3272i.getTotalPaddingRight();
                int height = (this.f3272i.getHeight() - this.f3272i.getCompoundPaddingBottom()) - this.f3272i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3262l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM3390e = m3390e(rectF);
                        if (fM3390e != this.f3272i.getTextSize()) {
                            m3413t(0, fM3390e);
                        }
                    } finally {
                    }
                }
            }
            this.f3265b = true;
        }
    }

    /* JADX INFO: renamed from: d */
    StaticLayout m3401d(CharSequence charSequence, Layout.Alignment alignment, int i3, int i4) {
        return a.m3414a(charSequence, alignment, i3, i4, this.f3272i, this.f3271h, this.f3274k);
    }

    /* JADX INFO: renamed from: f */
    int m3402f() {
        return Math.round(this.f3268e);
    }

    /* JADX INFO: renamed from: g */
    int m3403g() {
        return Math.round(this.f3267d);
    }

    /* JADX INFO: renamed from: h */
    int m3404h() {
        return Math.round(this.f3266c);
    }

    /* JADX INFO: renamed from: i */
    int[] m3405i() {
        return this.f3269f;
    }

    /* JADX INFO: renamed from: j */
    int m3406j() {
        return this.f3264a;
    }

    /* JADX INFO: renamed from: l */
    void m3407l(int i3) {
        TextPaint textPaint = this.f3271h;
        if (textPaint == null) {
            this.f3271h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f3271h.set(this.f3272i.getPaint());
        this.f3271h.setTextSize(i3);
    }

    /* JADX INFO: renamed from: n */
    boolean m3408n() {
        return m3398y() && this.f3264a != 0;
    }

    /* JADX INFO: renamed from: o */
    void m3409o(AttributeSet attributeSet, int i3) {
        int resourceId;
        Context context = this.f3273j;
        int[] iArr = AbstractC1769j.f9043g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        TextView textView = this.f3272i;
        AbstractC0268W.m771g0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i3, 0);
        int i4 = AbstractC1769j.f9068l0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            this.f3264a = typedArrayObtainStyledAttributes.getInt(i4, 0);
        }
        int i5 = AbstractC1769j.f9063k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = AbstractC1769j.f9053i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i6) ? typedArrayObtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = AbstractC1769j.f9048h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i7) ? typedArrayObtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i8 = AbstractC1769j.f9058j0;
        if (typedArrayObtainStyledAttributes.hasValue(i8) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i8, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m3395v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m3398y()) {
            this.f3264a = 0;
            return;
        }
        if (this.f3264a == 1) {
            if (!this.f3270g) {
                DisplayMetrics displayMetrics = this.f3273j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m3399z(dimension2, dimension3, dimension);
            }
            m3394u();
        }
    }

    /* JADX INFO: renamed from: p */
    void m3410p(int i3, int i4, int i5, int i6) {
        if (m3398y()) {
            DisplayMetrics displayMetrics = this.f3273j.getResources().getDisplayMetrics();
            m3399z(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (m3394u()) {
                m3400a();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m3411q(int[] iArr, int i3) {
        if (m3398y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i3 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3273j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArrCopyOf[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                this.f3269f = m3388b(iArrCopyOf);
                if (!m3396w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f3270g = false;
            }
            if (m3394u()) {
                m3400a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    void m3412r(int i3) {
        if (m3398y()) {
            if (i3 == 0) {
                m3389c();
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i3);
            }
            DisplayMetrics displayMetrics = this.f3273j.getResources().getDisplayMetrics();
            m3399z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m3394u()) {
                m3400a();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    void m3413t(int i3, float f3) {
        Context context = this.f3273j;
        m3393s(TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
