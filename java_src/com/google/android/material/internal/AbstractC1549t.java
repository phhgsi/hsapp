package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.AbstractC0966b;
import com.google.android.material.drawable.AbstractC1519d;
import p027J.AbstractC0268W;
import p027J.C0265U0;
import p027J.C0318w0;
import p027J.InterfaceC0235F;

/* JADX INFO: renamed from: com.google.android.material.internal.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1549t {

    /* JADX INFO: renamed from: com.google.android.material.internal.t$a */
    class a implements InterfaceC0235F {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f7806a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f7807b;

        a(c cVar, d dVar) {
            this.f7806a = cVar;
            this.f7807b = dVar;
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            return this.f7806a.mo7586a(view, c0318w0, new d(this.f7807b));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.t$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.t$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        C0318w0 mo7586a(View view, C0318w0 c0318w0, d dVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m8497b(View view, c cVar) {
        AbstractC0268W.m795s0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        m8504i(view);
    }

    /* JADX INFO: renamed from: c */
    public static float m8498c(Context context, int i3) {
        return TypedValue.applyDimension(1, i3, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: d */
    public static Integer m8499d(View view) {
        ColorStateList colorStateListM8253f = AbstractC1519d.m8253f(view.getBackground());
        if (colorStateListM8253f != null) {
            return Integer.valueOf(colorStateListM8253f.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static InputMethodManager m8500e(View view) {
        return (InputMethodManager) AbstractC0966b.getSystemService(view.getContext(), InputMethodManager.class);
    }

    /* JADX INFO: renamed from: f */
    public static float m8501f(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8502g(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m8503h(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8504i(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8505j(final View view, final boolean z2) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1549t.m8506k(view, z2);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static void m8506k(View view, boolean z2) {
        C0265U0 c0265u0M739H;
        if (!z2 || (c0265u0M739H = AbstractC0268W.m739H(view)) == null) {
            m8500e(view).showSoftInput(view, 1);
        } else {
            c0265u0M739H.m715e(C0318w0.p.m1139a());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.t$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int f7808a;

        /* JADX INFO: renamed from: b */
        public int f7809b;

        /* JADX INFO: renamed from: c */
        public int f7810c;

        /* JADX INFO: renamed from: d */
        public int f7811d;

        public d(int i3, int i4, int i5, int i6) {
            this.f7808a = i3;
            this.f7809b = i4;
            this.f7810c = i5;
            this.f7811d = i6;
        }

        /* JADX INFO: renamed from: a */
        public void m8507a(View view) {
            view.setPaddingRelative(this.f7808a, this.f7809b, this.f7810c, this.f7811d);
        }

        public d(d dVar) {
            this.f7808a = dVar.f7808a;
            this.f7809b = dVar.f7809b;
            this.f7810c = dVar.f7810c;
            this.f7811d = dVar.f7811d;
        }
    }
}
