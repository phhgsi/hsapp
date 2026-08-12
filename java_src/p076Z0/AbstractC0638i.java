package p076Z0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC1549t;

/* JADX INFO: renamed from: Z0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0638i {
    /* JADX INFO: renamed from: a */
    static AbstractC0634e m2296a(int i3) {
        return i3 != 0 ? i3 != 1 ? m2297b() : new C0635f() : new C0640k();
    }

    /* JADX INFO: renamed from: b */
    static AbstractC0634e m2297b() {
        return new C0640k();
    }

    /* JADX INFO: renamed from: c */
    static C0636g m2298c() {
        return new C0636g();
    }

    /* JADX INFO: renamed from: d */
    public static void m2299d(View view, float f3) {
        Drawable background = view.getBackground();
        if (background instanceof C0637h) {
            ((C0637h) background).m2273b0(f3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2300e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C0637h) {
            m2301f(view, (C0637h) background);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2301f(View view, C0637h c0637h) {
        if (c0637h.m2267S()) {
            c0637h.m2278g0(AbstractC1549t.m8501f(view));
        }
    }
}
