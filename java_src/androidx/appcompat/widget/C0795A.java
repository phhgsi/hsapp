package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p033L.AbstractC0362c;
import p091d.AbstractC1769j;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: androidx.appcompat.widget.A */
/* JADX INFO: loaded from: classes.dex */
class C0795A {

    /* JADX INFO: renamed from: a */
    private final TextView f3087a;

    /* JADX INFO: renamed from: b */
    private C0884c0 f3088b;

    /* JADX INFO: renamed from: c */
    private C0884c0 f3089c;

    /* JADX INFO: renamed from: d */
    private C0884c0 f3090d;

    /* JADX INFO: renamed from: e */
    private C0884c0 f3091e;

    /* JADX INFO: renamed from: f */
    private C0884c0 f3092f;

    /* JADX INFO: renamed from: g */
    private C0884c0 f3093g;

    /* JADX INFO: renamed from: h */
    private C0884c0 f3094h;

    /* JADX INFO: renamed from: i */
    private final C0825C f3095i;

    /* JADX INFO: renamed from: j */
    private int f3096j = 0;

    /* JADX INFO: renamed from: k */
    private int f3097k = -1;

    /* JADX INFO: renamed from: l */
    private Typeface f3098l;

    /* JADX INFO: renamed from: m */
    private boolean f3099m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$a */
    class a extends AbstractC2538k.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f3100a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3101b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ WeakReference f3102c;

        a(int i3, int i4, WeakReference weakReference) {
            this.f3100a = i3;
            this.f3101b = i4;
            this.f3102c = weakReference;
        }

        @Override // p164y.AbstractC2538k.e
        /* JADX INFO: renamed from: f */
        public void mo2108f(int i3) {
        }

        @Override // p164y.AbstractC2538k.e
        /* JADX INFO: renamed from: g */
        public void mo2109g(Typeface typeface) {
            int i3;
            if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f3100a) != -1) {
                typeface = f.m3259a(typeface, i3, (this.f3101b & 2) != 0);
            }
            C0795A.this.m3241n(this.f3102c, typeface);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ TextView f3104d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Typeface f3105e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f3106f;

        b(TextView textView, Typeface typeface, int i3) {
            this.f3104d = textView;
            this.f3105e = typeface;
            this.f3106f = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3104d.setTypeface(this.f3105e, this.f3106f);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static Locale m3252a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static LocaleList m3253a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* JADX INFO: renamed from: b */
        static void m3254b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$e */
    static class e {
        /* JADX INFO: renamed from: a */
        static int m3255a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: b */
        static void m3256b(TextView textView, int i3, int i4, int i5, int i6) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
        }

        /* JADX INFO: renamed from: c */
        static void m3257c(TextView textView, int[] iArr, int i3) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
        }

        /* JADX INFO: renamed from: d */
        static boolean m3258d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.A$f */
    static class f {
        /* JADX INFO: renamed from: a */
        static Typeface m3259a(Typeface typeface, int i3, boolean z2) {
            return Typeface.create(typeface, i3, z2);
        }
    }

    C0795A(TextView textView) {
        this.f3087a = textView;
        this.f3095i = new C0825C(textView);
    }

    /* JADX INFO: renamed from: B */
    private void m3223B(int i3, float f3) {
        this.f3095i.m3413t(i3, f3);
    }

    /* JADX INFO: renamed from: C */
    private void m3224C(Context context, C0888e0 c0888e0) {
        String strM3780o;
        this.f3096j = c0888e0.m3776k(AbstractC1769j.f9028d3, this.f3096j);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int iM3776k = c0888e0.m3776k(AbstractC1769j.f9076m3, -1);
            this.f3097k = iM3776k;
            if (iM3776k != -1) {
                this.f3096j &= 2;
            }
        }
        int i4 = AbstractC1769j.f9071l3;
        if (!c0888e0.m3784s(i4) && !c0888e0.m3784s(AbstractC1769j.f9081n3)) {
            int i5 = AbstractC1769j.f9022c3;
            if (c0888e0.m3784s(i5)) {
                this.f3099m = false;
                int iM3776k2 = c0888e0.m3776k(i5, 1);
                if (iM3776k2 == 1) {
                    this.f3098l = Typeface.SANS_SERIF;
                    return;
                } else if (iM3776k2 == 2) {
                    this.f3098l = Typeface.SERIF;
                    return;
                } else {
                    if (iM3776k2 != 3) {
                        return;
                    }
                    this.f3098l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3098l = null;
        int i6 = AbstractC1769j.f9081n3;
        if (c0888e0.m3784s(i6)) {
            i4 = i6;
        }
        int i7 = this.f3097k;
        int i8 = this.f3096j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM3775j = c0888e0.m3775j(i4, this.f3096j, new a(i7, i8, new WeakReference(this.f3087a)));
                if (typefaceM3775j != null) {
                    if (i3 < 28 || this.f3097k == -1) {
                        this.f3098l = typefaceM3775j;
                    } else {
                        this.f3098l = f.m3259a(Typeface.create(typefaceM3775j, 0), this.f3097k, (this.f3096j & 2) != 0);
                    }
                }
                this.f3099m = this.f3098l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3098l != null || (strM3780o = c0888e0.m3780o(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3097k == -1) {
            this.f3098l = Typeface.create(strM3780o, this.f3096j);
        } else {
            this.f3098l = f.m3259a(Typeface.create(strM3780o, 0), this.f3097k, (this.f3096j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3225a(Drawable drawable, C0884c0 c0884c0) {
        if (drawable == null || c0884c0 == null) {
            return;
        }
        C0897j.m3816i(drawable, c0884c0, this.f3087a.getDrawableState());
    }

    /* JADX INFO: renamed from: d */
    private static C0884c0 m3226d(Context context, C0897j c0897j, int i3) {
        ColorStateList colorStateListM3819f = c0897j.m3819f(context, i3);
        if (colorStateListM3819f == null) {
            return null;
        }
        C0884c0 c0884c0 = new C0884c0();
        c0884c0.f3643d = true;
        c0884c0.f3640a = colorStateListM3819f;
        return c0884c0;
    }

    /* JADX INFO: renamed from: y */
    private void m3227y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f3087a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f3087a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f3087a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f3087a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f3087a.getCompoundDrawables();
        TextView textView2 = this.f3087a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: z */
    private void m3228z() {
        C0884c0 c0884c0 = this.f3094h;
        this.f3088b = c0884c0;
        this.f3089c = c0884c0;
        this.f3090d = c0884c0;
        this.f3091e = c0884c0;
        this.f3092f = c0884c0;
        this.f3093g = c0884c0;
    }

    /* JADX INFO: renamed from: A */
    void m3229A(int i3, float f3) {
        if (AbstractC0910p0.f3755c || m3239l()) {
            return;
        }
        m3223B(i3, f3);
    }

    /* JADX INFO: renamed from: b */
    void m3230b() {
        if (this.f3088b != null || this.f3089c != null || this.f3090d != null || this.f3091e != null) {
            Drawable[] compoundDrawables = this.f3087a.getCompoundDrawables();
            m3225a(compoundDrawables[0], this.f3088b);
            m3225a(compoundDrawables[1], this.f3089c);
            m3225a(compoundDrawables[2], this.f3090d);
            m3225a(compoundDrawables[3], this.f3091e);
        }
        if (this.f3092f == null && this.f3093g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f3087a.getCompoundDrawablesRelative();
        m3225a(compoundDrawablesRelative[0], this.f3092f);
        m3225a(compoundDrawablesRelative[2], this.f3093g);
    }

    /* JADX INFO: renamed from: c */
    void m3231c() {
        this.f3095i.m3400a();
    }

    /* JADX INFO: renamed from: e */
    int m3232e() {
        return this.f3095i.m3402f();
    }

    /* JADX INFO: renamed from: f */
    int m3233f() {
        return this.f3095i.m3403g();
    }

    /* JADX INFO: renamed from: g */
    int m3234g() {
        return this.f3095i.m3404h();
    }

    /* JADX INFO: renamed from: h */
    int[] m3235h() {
        return this.f3095i.m3405i();
    }

    /* JADX INFO: renamed from: i */
    int m3236i() {
        return this.f3095i.m3406j();
    }

    /* JADX INFO: renamed from: j */
    ColorStateList m3237j() {
        C0884c0 c0884c0 = this.f3094h;
        if (c0884c0 != null) {
            return c0884c0.f3640a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    PorterDuff.Mode m3238k() {
        C0884c0 c0884c0 = this.f3094h;
        if (c0884c0 != null) {
            return c0884c0.f3641b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    boolean m3239l() {
        return this.f3095i.m3408n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3240m(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0795A.m3240m(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: renamed from: n */
    void m3241n(WeakReference weakReference, Typeface typeface) {
        if (this.f3099m) {
            this.f3098l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f3096j));
                } else {
                    textView.setTypeface(typeface, this.f3096j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    void m3242o(boolean z2, int i3, int i4, int i5, int i6) {
        if (AbstractC0910p0.f3755c) {
            return;
        }
        m3231c();
    }

    /* JADX INFO: renamed from: p */
    void m3243p() {
        m3230b();
    }

    /* JADX INFO: renamed from: q */
    void m3244q(Context context, int i3) {
        String strM3780o;
        C0888e0 c0888e0M3763t = C0888e0.m3763t(context, i3, AbstractC1769j.f9010a3);
        int i4 = AbstractC1769j.f9091p3;
        if (c0888e0M3763t.m3784s(i4)) {
            m3246s(c0888e0M3763t.m3766a(i4, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        int i6 = AbstractC1769j.f9016b3;
        if (c0888e0M3763t.m3784s(i6) && c0888e0M3763t.m3771f(i6, -1) == 0) {
            this.f3087a.setTextSize(0, 0.0f);
        }
        m3224C(context, c0888e0M3763t);
        if (i5 >= 26) {
            int i7 = AbstractC1769j.f9086o3;
            if (c0888e0M3763t.m3784s(i7) && (strM3780o = c0888e0M3763t.m3780o(i7)) != null) {
                e.m3258d(this.f3087a, strM3780o);
            }
        }
        c0888e0M3763t.m3786x();
        Typeface typeface = this.f3098l;
        if (typeface != null) {
            this.f3087a.setTypeface(typeface, this.f3096j);
        }
    }

    /* JADX INFO: renamed from: r */
    void m3245r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        AbstractC0362c.m1335f(editorInfo, textView.getText());
    }

    /* JADX INFO: renamed from: s */
    void m3246s(boolean z2) {
        this.f3087a.setAllCaps(z2);
    }

    /* JADX INFO: renamed from: t */
    void m3247t(int i3, int i4, int i5, int i6) {
        this.f3095i.m3410p(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: u */
    void m3248u(int[] iArr, int i3) {
        this.f3095i.m3411q(iArr, i3);
    }

    /* JADX INFO: renamed from: v */
    void m3249v(int i3) {
        this.f3095i.m3412r(i3);
    }

    /* JADX INFO: renamed from: w */
    void m3250w(ColorStateList colorStateList) {
        if (this.f3094h == null) {
            this.f3094h = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3094h;
        c0884c0.f3640a = colorStateList;
        c0884c0.f3643d = colorStateList != null;
        m3228z();
    }

    /* JADX INFO: renamed from: x */
    void m3251x(PorterDuff.Mode mode) {
        if (this.f3094h == null) {
            this.f3094h = new C0884c0();
        }
        C0884c0 c0884c0 = this.f3094h;
        c0884c0.f3641b = mode;
        c0884c0.f3642c = mode != null;
        m3228z();
    }
}
