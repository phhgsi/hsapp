package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0746b;
import androidx.appcompat.view.AbstractC0772b;
import androidx.appcompat.view.AbstractWindowCallbackC0779i;
import androidx.appcompat.view.C0774d;
import androidx.appcompat.view.C0775e;
import androidx.appcompat.view.C0776f;
import androidx.appcompat.view.C0777g;
import androidx.appcompat.view.menu.C0784c;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.widget.AbstractC0910p0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0888e0;
import androidx.appcompat.widget.C0897j;
import androidx.appcompat.widget.C0908o0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0830G;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.C0929i;
import androidx.core.content.AbstractC0966b;
import androidx.core.widget.AbstractC0987h;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1132n;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p012E.C0112i;
import p024I.AbstractC0206c;
import p027J.AbstractC0268W;
import p027J.AbstractC0286g0;
import p027J.AbstractC0311t;
import p027J.AbstractC0313u;
import p027J.C0282e0;
import p027J.C0318w0;
import p027J.InterfaceC0235F;
import p091d.AbstractC1760a;
import p091d.AbstractC1762c;
import p091d.AbstractC1765f;
import p091d.AbstractC1766g;
import p091d.AbstractC1768i;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;
import p161x.AbstractC2511j;
import p164y.AbstractC2538k;

/* JADX INFO: renamed from: androidx.appcompat.app.i */
/* JADX INFO: loaded from: classes.dex */
class LayoutInflaterFactory2C0753i extends AbstractC0751g implements C0786e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j0 */
    private static final C0929i f2699j0 = new C0929i();

    /* JADX INFO: renamed from: k0 */
    private static final boolean f2700k0 = false;

    /* JADX INFO: renamed from: l0 */
    private static final int[] f2701l0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: m0 */
    private static final boolean f2702m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    private boolean f2703A;

    /* JADX INFO: renamed from: B */
    ViewGroup f2704B;

    /* JADX INFO: renamed from: C */
    private TextView f2705C;

    /* JADX INFO: renamed from: D */
    private View f2706D;

    /* JADX INFO: renamed from: E */
    private boolean f2707E;

    /* JADX INFO: renamed from: F */
    private boolean f2708F;

    /* JADX INFO: renamed from: G */
    boolean f2709G;

    /* JADX INFO: renamed from: H */
    boolean f2710H;

    /* JADX INFO: renamed from: I */
    boolean f2711I;

    /* JADX INFO: renamed from: J */
    boolean f2712J;

    /* JADX INFO: renamed from: K */
    boolean f2713K;

    /* JADX INFO: renamed from: L */
    private boolean f2714L;

    /* JADX INFO: renamed from: M */
    private s[] f2715M;

    /* JADX INFO: renamed from: N */
    private s f2716N;

    /* JADX INFO: renamed from: O */
    private boolean f2717O;

    /* JADX INFO: renamed from: P */
    private boolean f2718P;

    /* JADX INFO: renamed from: Q */
    private boolean f2719Q;

    /* JADX INFO: renamed from: R */
    boolean f2720R;

    /* JADX INFO: renamed from: S */
    private Configuration f2721S;

    /* JADX INFO: renamed from: T */
    private int f2722T;

    /* JADX INFO: renamed from: U */
    private int f2723U;

    /* JADX INFO: renamed from: V */
    private int f2724V;

    /* JADX INFO: renamed from: W */
    private boolean f2725W;

    /* JADX INFO: renamed from: X */
    private p f2726X;

    /* JADX INFO: renamed from: Y */
    private p f2727Y;

    /* JADX INFO: renamed from: Z */
    boolean f2728Z;

    /* JADX INFO: renamed from: a0 */
    int f2729a0;

    /* JADX INFO: renamed from: b0 */
    private final Runnable f2730b0;

    /* JADX INFO: renamed from: c0 */
    private boolean f2731c0;

    /* JADX INFO: renamed from: d0 */
    private Rect f2732d0;

    /* JADX INFO: renamed from: e0 */
    private Rect f2733e0;

    /* JADX INFO: renamed from: f0 */
    private C0770z f2734f0;

    /* JADX INFO: renamed from: g0 */
    private C0737B f2735g0;

    /* JADX INFO: renamed from: h0 */
    private OnBackInvokedDispatcher f2736h0;

    /* JADX INFO: renamed from: i0 */
    private OnBackInvokedCallback f2737i0;

    /* JADX INFO: renamed from: j */
    final Object f2738j;

    /* JADX INFO: renamed from: k */
    final Context f2739k;

    /* JADX INFO: renamed from: l */
    Window f2740l;

    /* JADX INFO: renamed from: m */
    private n f2741m;

    /* JADX INFO: renamed from: n */
    final InterfaceC0749e f2742n;

    /* JADX INFO: renamed from: o */
    AbstractC0745a f2743o;

    /* JADX INFO: renamed from: p */
    MenuInflater f2744p;

    /* JADX INFO: renamed from: q */
    private CharSequence f2745q;

    /* JADX INFO: renamed from: r */
    private InterfaceC0830G f2746r;

    /* JADX INFO: renamed from: s */
    private h f2747s;

    /* JADX INFO: renamed from: t */
    private t f2748t;

    /* JADX INFO: renamed from: u */
    AbstractC0772b f2749u;

    /* JADX INFO: renamed from: v */
    ActionBarContextView f2750v;

    /* JADX INFO: renamed from: w */
    PopupWindow f2751w;

    /* JADX INFO: renamed from: x */
    Runnable f2752x;

    /* JADX INFO: renamed from: y */
    C0282e0 f2753y;

    /* JADX INFO: renamed from: z */
    private boolean f2754z;

    /* JADX INFO: renamed from: androidx.appcompat.app.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
            if ((layoutInflaterFactory2C0753i.f2729a0 & 1) != 0) {
                layoutInflaterFactory2C0753i.m2920k0(0);
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i2 = LayoutInflaterFactory2C0753i.this;
            if ((layoutInflaterFactory2C0753i2.f2729a0 & 4096) != 0) {
                layoutInflaterFactory2C0753i2.m2920k0(108);
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i3 = LayoutInflaterFactory2C0753i.this;
            layoutInflaterFactory2C0753i3.f2728Z = false;
            layoutInflaterFactory2C0753i3.f2729a0 = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$b */
    class b implements InterfaceC0235F {
        b() {
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            int iM1088l = c0318w0.m1088l();
            int iM2917h1 = LayoutInflaterFactory2C0753i.this.m2917h1(c0318w0, null);
            if (iM1088l != iM2917h1) {
                c0318w0 = c0318w0.m1093r(c0318w0.m1086j(), iM2917h1, c0318w0.m1087k(), c0318w0.m1085i());
            }
            return AbstractC0268W.m752U(view, c0318w0);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$c */
    class c implements ContentFrameLayout.InterfaceC0826a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0826a
        /* JADX INFO: renamed from: a */
        public void mo2928a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0826a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0753i.this.m2918i0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.i$d$a */
        class a extends AbstractC0286g0 {
            a() {
            }

            @Override // p027J.InterfaceC0284f0
            /* JADX INFO: renamed from: b */
            public void mo972b(View view) {
                LayoutInflaterFactory2C0753i.this.f2750v.setAlpha(1.0f);
                LayoutInflaterFactory2C0753i.this.f2753y.m965g(null);
                LayoutInflaterFactory2C0753i.this.f2753y = null;
            }

            @Override // p027J.AbstractC0286g0, p027J.InterfaceC0284f0
            /* JADX INFO: renamed from: c */
            public void mo973c(View view) {
                LayoutInflaterFactory2C0753i.this.f2750v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
            layoutInflaterFactory2C0753i.f2751w.showAtLocation(layoutInflaterFactory2C0753i.f2750v, 55, 0, 0);
            LayoutInflaterFactory2C0753i.this.m2921l0();
            if (!LayoutInflaterFactory2C0753i.this.m2906W0()) {
                LayoutInflaterFactory2C0753i.this.f2750v.setAlpha(1.0f);
                LayoutInflaterFactory2C0753i.this.f2750v.setVisibility(0);
            } else {
                LayoutInflaterFactory2C0753i.this.f2750v.setAlpha(0.0f);
                LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i2 = LayoutInflaterFactory2C0753i.this;
                layoutInflaterFactory2C0753i2.f2753y = AbstractC0268W.m766e(layoutInflaterFactory2C0753i2.f2750v).m960b(1.0f);
                LayoutInflaterFactory2C0753i.this.f2753y.m965g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$e */
    class e extends AbstractC0286g0 {
        e() {
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            LayoutInflaterFactory2C0753i.this.f2750v.setAlpha(1.0f);
            LayoutInflaterFactory2C0753i.this.f2753y.m965g(null);
            LayoutInflaterFactory2C0753i.this.f2753y = null;
        }

        @Override // p027J.AbstractC0286g0, p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: c */
        public void mo973c(View view) {
            LayoutInflaterFactory2C0753i.this.f2750v.setVisibility(0);
            if (LayoutInflaterFactory2C0753i.this.f2750v.getParent() instanceof View) {
                AbstractC0268W.m769f0((View) LayoutInflaterFactory2C0753i.this.f2750v.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$f */
    private class f implements AbstractC0746b.b {
        f() {
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: a */
        public void mo2780a(Drawable drawable, int i3) {
            AbstractC0745a abstractC0745aMo2851u = LayoutInflaterFactory2C0753i.this.mo2851u();
            if (abstractC0745aMo2851u != null) {
                abstractC0745aMo2851u.mo2713w(drawable);
                abstractC0745aMo2851u.mo2712v(i3);
            }
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: b */
        public boolean mo2781b() {
            AbstractC0745a abstractC0745aMo2851u = LayoutInflaterFactory2C0753i.this.mo2851u();
            return (abstractC0745aMo2851u == null || (abstractC0745aMo2851u.mo2700j() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: c */
        public Drawable mo2782c() {
            C0888e0 c0888e0M3764u = C0888e0.m3764u(mo2783d(), null, new int[]{AbstractC1760a.f8685C});
            Drawable drawableM3772g = c0888e0M3764u.m3772g(0);
            c0888e0M3764u.m3786x();
            return drawableM3772g;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: d */
        public Context mo2783d() {
            return LayoutInflaterFactory2C0753i.this.m2923q0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$g */
    interface g {
        /* JADX INFO: renamed from: a */
        boolean mo2721a(int i3);

        View onCreatePanelView(int i3);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$h */
    private final class h implements InterfaceC0791j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: a */
        public void mo2717a(C0786e c0786e, boolean z2) {
            LayoutInflaterFactory2C0753i.this.m2912b0(c0786e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: b */
        public boolean mo2718b(C0786e c0786e) {
            Window.Callback callbackM2927x0 = LayoutInflaterFactory2C0753i.this.m2927x0();
            if (callbackM2927x0 == null) {
                return true;
            }
            callbackM2927x0.onMenuOpened(108, c0786e);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$i */
    class i implements AbstractC0772b.a {

        /* JADX INFO: renamed from: a */
        private AbstractC0772b.a f2763a;

        /* JADX INFO: renamed from: androidx.appcompat.app.i$i$a */
        class a extends AbstractC0286g0 {
            a() {
            }

            @Override // p027J.InterfaceC0284f0
            /* JADX INFO: renamed from: b */
            public void mo972b(View view) {
                LayoutInflaterFactory2C0753i.this.f2750v.setVisibility(8);
                LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0753i.f2751w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0753i.f2750v.getParent() instanceof View) {
                    AbstractC0268W.m769f0((View) LayoutInflaterFactory2C0753i.this.f2750v.getParent());
                }
                LayoutInflaterFactory2C0753i.this.f2750v.m3268k();
                LayoutInflaterFactory2C0753i.this.f2753y.m965g(null);
                LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i2 = LayoutInflaterFactory2C0753i.this;
                layoutInflaterFactory2C0753i2.f2753y = null;
                AbstractC0268W.m769f0(layoutInflaterFactory2C0753i2.f2704B);
            }
        }

        public i(AbstractC0772b.a aVar) {
            this.f2763a = aVar;
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: a */
        public boolean mo2929a(AbstractC0772b abstractC0772b, Menu menu) {
            AbstractC0268W.m769f0(LayoutInflaterFactory2C0753i.this.f2704B);
            return this.f2763a.mo2929a(abstractC0772b, menu);
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: b */
        public void mo2930b(AbstractC0772b abstractC0772b) {
            this.f2763a.mo2930b(abstractC0772b);
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
            if (layoutInflaterFactory2C0753i.f2751w != null) {
                layoutInflaterFactory2C0753i.f2740l.getDecorView().removeCallbacks(LayoutInflaterFactory2C0753i.this.f2752x);
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i2 = LayoutInflaterFactory2C0753i.this;
            if (layoutInflaterFactory2C0753i2.f2750v != null) {
                layoutInflaterFactory2C0753i2.m2921l0();
                LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i3 = LayoutInflaterFactory2C0753i.this;
                layoutInflaterFactory2C0753i3.f2753y = AbstractC0268W.m766e(layoutInflaterFactory2C0753i3.f2750v).m960b(0.0f);
                LayoutInflaterFactory2C0753i.this.f2753y.m965g(new a());
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i4 = LayoutInflaterFactory2C0753i.this;
            InterfaceC0749e interfaceC0749e = layoutInflaterFactory2C0753i4.f2742n;
            if (interfaceC0749e != null) {
                interfaceC0749e.mo2802o(layoutInflaterFactory2C0753i4.f2749u);
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i5 = LayoutInflaterFactory2C0753i.this;
            layoutInflaterFactory2C0753i5.f2749u = null;
            AbstractC0268W.m769f0(layoutInflaterFactory2C0753i5.f2704B);
            LayoutInflaterFactory2C0753i.this.m2915f1();
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: c */
        public boolean mo2931c(AbstractC0772b abstractC0772b, MenuItem menuItem) {
            return this.f2763a.mo2931c(abstractC0772b, menuItem);
        }

        @Override // androidx.appcompat.view.AbstractC0772b.a
        /* JADX INFO: renamed from: d */
        public boolean mo2932d(AbstractC0772b abstractC0772b, Menu menu) {
            return this.f2763a.mo2932d(abstractC0772b, menu);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$j */
    static class j {
        /* JADX INFO: renamed from: a */
        static boolean m2933a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* JADX INFO: renamed from: b */
        static String m2934b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$k */
    static class k {
        /* JADX INFO: renamed from: a */
        static void m2935a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* JADX INFO: renamed from: b */
        static C0112i m2936b(Configuration configuration) {
            return C0112i.m338c(configuration.getLocales().toLanguageTags());
        }

        /* JADX INFO: renamed from: c */
        public static void m2937c(C0112i c0112i) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c0112i.m344h()));
        }

        /* JADX INFO: renamed from: d */
        static void m2938d(Configuration configuration, C0112i c0112i) {
            configuration.setLocales(LocaleList.forLanguageTags(c0112i.m344h()));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$l */
    static class l {
        /* JADX INFO: renamed from: a */
        static void m2939a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$m */
    static class m {
        /* JADX INFO: renamed from: a */
        static OnBackInvokedDispatcher m2940a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        static OnBackInvokedCallback m2941b(Object obj, final LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i) {
            Objects.requireNonNull(layoutInflaterFactory2C0753i);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.w
                public final void onBackInvoked() {
                    layoutInflaterFactory2C0753i.m2896F0();
                }
            };
            AbstractC0763s.m2967a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* JADX INFO: renamed from: c */
        static void m2942c(Object obj, Object obj2) {
            AbstractC0763s.m2967a(obj).unregisterOnBackInvokedCallback(AbstractC0762r.m2966a(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$n */
    class n extends AbstractWindowCallbackC0779i {

        /* JADX INFO: renamed from: b */
        private g f2766b;

        /* JADX INFO: renamed from: c */
        private boolean f2767c;

        /* JADX INFO: renamed from: d */
        private boolean f2768d;

        /* JADX INFO: renamed from: e */
        private boolean f2769e;

        n(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: b */
        public boolean m2943b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f2768d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f2768d = false;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2944c(Window.Callback callback) {
            try {
                this.f2767c = true;
                callback.onContentChanged();
            } finally {
                this.f2767c = false;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2945d(Window.Callback callback, int i3, Menu menu) {
            try {
                this.f2769e = true;
                callback.onPanelClosed(i3, menu);
            } finally {
                this.f2769e = false;
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f2768d ? m3038a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0753i.this.m2919j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0753i.this.m2898I0(keyEvent.getKeyCode(), keyEvent);
        }

        /* JADX INFO: renamed from: e */
        void m2946e(g gVar) {
            this.f2766b = gVar;
        }

        /* JADX INFO: renamed from: f */
        final ActionMode m2947f(ActionMode.Callback callback) {
            C0776f.a aVar = new C0776f.a(LayoutInflaterFactory2C0753i.this.f2739k, callback);
            AbstractC0772b abstractC0772bM2909Z0 = LayoutInflaterFactory2C0753i.this.m2909Z0(aVar);
            if (abstractC0772bM2909Z0 != null) {
                return aVar.m3016e(abstractC0772bM2909Z0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f2767c) {
                m3038a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i3, Menu menu) {
            if (i3 != 0 || (menu instanceof C0786e)) {
                return super.onCreatePanelMenu(i3, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public View onCreatePanelView(int i3) {
            View viewOnCreatePanelView;
            g gVar = this.f2766b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i3)) == null) ? super.onCreatePanelView(i3) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public boolean onMenuOpened(int i3, Menu menu) {
            super.onMenuOpened(i3, menu);
            LayoutInflaterFactory2C0753i.this.m2900L0(i3);
            return true;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public void onPanelClosed(int i3, Menu menu) {
            if (this.f2769e) {
                m3038a().onPanelClosed(i3, menu);
            } else {
                super.onPanelClosed(i3, menu);
                LayoutInflaterFactory2C0753i.this.m2901M0(i3);
            }
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public boolean onPreparePanel(int i3, View view, Menu menu) {
            C0786e c0786e = menu instanceof C0786e ? (C0786e) menu : null;
            if (i3 == 0 && c0786e == null) {
                return false;
            }
            if (c0786e != null) {
                c0786e.m3157f0(true);
            }
            g gVar = this.f2766b;
            boolean zOnPreparePanel = gVar != null && gVar.mo2721a(i3);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i3, view, menu);
            }
            if (c0786e != null) {
                c0786e.m3157f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
            C0786e c0786e;
            s sVarM2925v0 = LayoutInflaterFactory2C0753i.this.m2925v0(0, true);
            if (sVarM2925v0 == null || (c0786e = sVarM2925v0.f2788j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i3);
            } else {
                super.onProvideKeyboardShortcuts(list, c0786e, i3);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.AbstractWindowCallbackC0779i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
            return (LayoutInflaterFactory2C0753i.this.m2894D0() && i3 == 0) ? m2947f(callback) : super.onWindowStartingActionMode(callback, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$o */
    private class o extends p {

        /* JADX INFO: renamed from: c */
        private final PowerManager f2771c;

        o(Context context) {
            super();
            this.f2771c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: b */
        IntentFilter mo2948b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: c */
        public int mo2949c() {
            return j.m2933a(this.f2771c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: d */
        public void mo2950d() {
            LayoutInflaterFactory2C0753i.this.mo2843f();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$p */
    abstract class p {

        /* JADX INFO: renamed from: a */
        private BroadcastReceiver f2773a;

        /* JADX INFO: renamed from: androidx.appcompat.app.i$p$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.mo2950d();
            }
        }

        p() {
        }

        /* JADX INFO: renamed from: a */
        void m2951a() {
            BroadcastReceiver broadcastReceiver = this.f2773a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0753i.this.f2739k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2773a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        abstract IntentFilter mo2948b();

        /* JADX INFO: renamed from: c */
        abstract int mo2949c();

        /* JADX INFO: renamed from: d */
        abstract void mo2950d();

        /* JADX INFO: renamed from: e */
        void m2952e() {
            m2951a();
            IntentFilter intentFilterMo2948b = mo2948b();
            if (intentFilterMo2948b == null || intentFilterMo2948b.countActions() == 0) {
                return;
            }
            if (this.f2773a == null) {
                this.f2773a = new a();
            }
            LayoutInflaterFactory2C0753i.this.f2739k.registerReceiver(this.f2773a, intentFilterMo2948b);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$q */
    private class q extends p {

        /* JADX INFO: renamed from: c */
        private final C0743H f2776c;

        q(C0743H c0743h) {
            super();
            this.f2776c = c0743h;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: b */
        IntentFilter mo2948b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: c */
        public int mo2949c() {
            return this.f2776c.m2729d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.p
        /* JADX INFO: renamed from: d */
        public void mo2950d() {
            LayoutInflaterFactory2C0753i.this.mo2843f();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$r */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: b */
        private boolean m2953b(int i3, int i4) {
            return i3 < -5 || i4 < -5 || i3 > getWidth() + 5 || i4 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0753i.this.m2919j0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2953b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0753i.this.m2913d0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i3) {
            setBackgroundDrawable(AbstractC1832a.m9609b(getContext(), i3));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$s */
    protected static final class s {

        /* JADX INFO: renamed from: a */
        int f2779a;

        /* JADX INFO: renamed from: b */
        int f2780b;

        /* JADX INFO: renamed from: c */
        int f2781c;

        /* JADX INFO: renamed from: d */
        int f2782d;

        /* JADX INFO: renamed from: e */
        int f2783e;

        /* JADX INFO: renamed from: f */
        int f2784f;

        /* JADX INFO: renamed from: g */
        ViewGroup f2785g;

        /* JADX INFO: renamed from: h */
        View f2786h;

        /* JADX INFO: renamed from: i */
        View f2787i;

        /* JADX INFO: renamed from: j */
        C0786e f2788j;

        /* JADX INFO: renamed from: k */
        C0784c f2789k;

        /* JADX INFO: renamed from: l */
        Context f2790l;

        /* JADX INFO: renamed from: m */
        boolean f2791m;

        /* JADX INFO: renamed from: n */
        boolean f2792n;

        /* JADX INFO: renamed from: o */
        boolean f2793o;

        /* JADX INFO: renamed from: p */
        public boolean f2794p;

        /* JADX INFO: renamed from: q */
        boolean f2795q = false;

        /* JADX INFO: renamed from: r */
        boolean f2796r;

        /* JADX INFO: renamed from: s */
        Bundle f2797s;

        s(int i3) {
            this.f2779a = i3;
        }

        /* JADX INFO: renamed from: a */
        InterfaceC0792k m2954a(InterfaceC0791j.a aVar) {
            if (this.f2788j == null) {
                return null;
            }
            if (this.f2789k == null) {
                C0784c c0784c = new C0784c(this.f2790l, AbstractC1766g.f8844j);
                this.f2789k = c0784c;
                c0784c.mo3071n(aVar);
                this.f2788j.m3149b(this.f2789k);
            }
            return this.f2789k.m3104e(this.f2785g);
        }

        /* JADX INFO: renamed from: b */
        public boolean m2955b() {
            if (this.f2786h == null) {
                return false;
            }
            return this.f2787i != null || this.f2789k.m3103c().getCount() > 0;
        }

        /* JADX INFO: renamed from: c */
        void m2956c(C0786e c0786e) {
            C0784c c0784c;
            C0786e c0786e2 = this.f2788j;
            if (c0786e == c0786e2) {
                return;
            }
            if (c0786e2 != null) {
                c0786e2.m3138R(this.f2789k);
            }
            this.f2788j = c0786e;
            if (c0786e == null || (c0784c = this.f2789k) == null) {
                return;
            }
            c0786e.m3149b(c0784c);
        }

        /* JADX INFO: renamed from: d */
        void m2957d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC1760a.f8700a, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(AbstractC1760a.f8689G, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(AbstractC1768i.f8872d, true);
            }
            C0774d c0774d = new C0774d(context, 0);
            c0774d.getTheme().setTo(themeNewTheme);
            this.f2790l = c0774d;
            TypedArray typedArrayObtainStyledAttributes = c0774d.obtainStyledAttributes(AbstractC1769j.f9133y0);
            this.f2780b = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8882B0, 0);
            this.f2784f = typedArrayObtainStyledAttributes.getResourceId(AbstractC1769j.f8877A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.i$t */
    private final class t implements InterfaceC0791j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: a */
        public void mo2717a(C0786e c0786e, boolean z2) {
            C0786e c0786eMo3127F = c0786e.mo3127F();
            boolean z3 = c0786eMo3127F != c0786e;
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
            if (z3) {
                c0786e = c0786eMo3127F;
            }
            s sVarM2922o0 = layoutInflaterFactory2C0753i.m2922o0(c0786e);
            if (sVarM2922o0 != null) {
                if (!z3) {
                    LayoutInflaterFactory2C0753i.this.m2914e0(sVarM2922o0, z2);
                } else {
                    LayoutInflaterFactory2C0753i.this.m2910a0(sVarM2922o0.f2779a, sVarM2922o0, c0786eMo3127F);
                    LayoutInflaterFactory2C0753i.this.m2914e0(sVarM2922o0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: b */
        public boolean mo2718b(C0786e c0786e) {
            Window.Callback callbackM2927x0;
            if (c0786e != c0786e.mo3127F()) {
                return true;
            }
            LayoutInflaterFactory2C0753i layoutInflaterFactory2C0753i = LayoutInflaterFactory2C0753i.this;
            if (!layoutInflaterFactory2C0753i.f2709G || (callbackM2927x0 = layoutInflaterFactory2C0753i.m2927x0()) == null || LayoutInflaterFactory2C0753i.this.f2720R) {
                return true;
            }
            callbackM2927x0.onMenuOpened(108, c0786e);
            return true;
        }
    }

    LayoutInflaterFactory2C0753i(Activity activity, InterfaceC0749e interfaceC0749e) {
        this(activity, null, interfaceC0749e, activity);
    }

    /* JADX INFO: renamed from: A0 */
    private boolean m2861A0(s sVar) {
        sVar.m2957d(m2923q0());
        sVar.f2785g = new r(sVar.f2790l);
        sVar.f2781c = 81;
        return true;
    }

    /* JADX INFO: renamed from: B0 */
    private boolean m2862B0(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f2739k;
        int i3 = sVar.f2779a;
        if ((i3 == 0 || i3 == 108) && this.f2746r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC1760a.f8703d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC1760a.f8704e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC1760a.f8704e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C0774d c0774d = new C0774d(context, 0);
                c0774d.getTheme().setTo(themeNewTheme);
                context = c0774d;
            }
        }
        C0786e c0786e = new C0786e(context);
        c0786e.mo3143W(this);
        sVar.m2956c(c0786e);
        return true;
    }

    /* JADX INFO: renamed from: C0 */
    private void m2863C0(int i3) {
        this.f2729a0 = (1 << i3) | this.f2729a0;
        if (this.f2728Z) {
            return;
        }
        AbstractC0268W.m759a0(this.f2740l.getDecorView(), this.f2730b0);
        this.f2728Z = true;
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m2864H0(int i3, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarM2925v0 = m2925v0(i3, true);
        if (sVarM2925v0.f2793o) {
            return false;
        }
        return m2868R0(sVarM2925v0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2865K0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f2749u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.i$s r2 = r4.m2925v0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.G r5 = r4.f2746r
            if (r5 == 0) goto L43
            boolean r5 = r5.mo3286h()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f2739k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.G r5 = r4.f2746r
            boolean r5 = r5.mo3281b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f2720R
            if (r5 != 0) goto L62
            boolean r5 = r4.m2868R0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.G r5 = r4.f2746r
            boolean r0 = r5.mo3285g()
            goto L68
        L3c:
            androidx.appcompat.widget.G r5 = r4.f2746r
            boolean r0 = r5.mo3284f()
            goto L68
        L43:
            boolean r5 = r2.f2793o
            if (r5 != 0) goto L64
            boolean r3 = r2.f2792n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f2791m
            if (r5 == 0) goto L62
            boolean r5 = r2.f2796r
            if (r5 == 0) goto L5b
            r2.f2791m = r1
            boolean r5 = r4.m2868R0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.m2866O0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.m2914e0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f2739k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0753i.m2865K0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2866O0(androidx.appcompat.app.LayoutInflaterFactory2C0753i.s r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0753i.m2866O0(androidx.appcompat.app.i$s, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: Q0 */
    private boolean m2867Q0(s sVar, int i3, KeyEvent keyEvent, int i4) {
        C0786e c0786e;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f2791m || m2868R0(sVar, keyEvent)) && (c0786e = sVar.f2788j) != null) {
            zPerformShortcut = c0786e.performShortcut(i3, keyEvent, i4);
        }
        if (zPerformShortcut && (i4 & 1) == 0 && this.f2746r == null) {
            m2914e0(sVar, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: R0 */
    private boolean m2868R0(s sVar, KeyEvent keyEvent) {
        InterfaceC0830G interfaceC0830G;
        InterfaceC0830G interfaceC0830G2;
        InterfaceC0830G interfaceC0830G3;
        if (this.f2720R) {
            return false;
        }
        if (sVar.f2791m) {
            return true;
        }
        s sVar2 = this.f2716N;
        if (sVar2 != null && sVar2 != sVar) {
            m2914e0(sVar2, false);
        }
        Window.Callback callbackM2927x0 = m2927x0();
        if (callbackM2927x0 != null) {
            sVar.f2787i = callbackM2927x0.onCreatePanelView(sVar.f2779a);
        }
        int i3 = sVar.f2779a;
        boolean z2 = i3 == 0 || i3 == 108;
        if (z2 && (interfaceC0830G3 = this.f2746r) != null) {
            interfaceC0830G3.mo3282d();
        }
        if (sVar.f2787i == null && (!z2 || !(m2903P0() instanceof C0741F))) {
            C0786e c0786e = sVar.f2788j;
            if (c0786e == null || sVar.f2796r) {
                if (c0786e == null && (!m2862B0(sVar) || sVar.f2788j == null)) {
                    return false;
                }
                if (z2 && this.f2746r != null) {
                    if (this.f2747s == null) {
                        this.f2747s = new h();
                    }
                    this.f2746r.mo3280a(sVar.f2788j, this.f2747s);
                }
                sVar.f2788j.m3160i0();
                if (!callbackM2927x0.onCreatePanelMenu(sVar.f2779a, sVar.f2788j)) {
                    sVar.m2956c(null);
                    if (z2 && (interfaceC0830G = this.f2746r) != null) {
                        interfaceC0830G.mo3280a(null, this.f2747s);
                    }
                    return false;
                }
                sVar.f2796r = false;
            }
            sVar.f2788j.m3160i0();
            Bundle bundle = sVar.f2797s;
            if (bundle != null) {
                sVar.f2788j.m3139S(bundle);
                sVar.f2797s = null;
            }
            if (!callbackM2927x0.onPreparePanel(0, sVar.f2787i, sVar.f2788j)) {
                if (z2 && (interfaceC0830G2 = this.f2746r) != null) {
                    interfaceC0830G2.mo3280a(null, this.f2747s);
                }
                sVar.f2788j.m3159h0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f2794p = z3;
            sVar.f2788j.setQwertyMode(z3);
            sVar.f2788j.m3159h0();
        }
        sVar.f2791m = true;
        sVar.f2792n = false;
        this.f2716N = sVar;
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    private void m2869S0(boolean z2) {
        InterfaceC0830G interfaceC0830G = this.f2746r;
        if (interfaceC0830G == null || !interfaceC0830G.mo3286h() || (ViewConfiguration.get(this.f2739k).hasPermanentMenuKey() && !this.f2746r.mo3283e())) {
            s sVarM2925v0 = m2925v0(0, true);
            sVarM2925v0.f2795q = true;
            m2914e0(sVarM2925v0, false);
            m2866O0(sVarM2925v0, null);
            return;
        }
        Window.Callback callbackM2927x0 = m2927x0();
        if (this.f2746r.mo3281b() && z2) {
            this.f2746r.mo3284f();
            if (this.f2720R) {
                return;
            }
            callbackM2927x0.onPanelClosed(108, m2925v0(0, true).f2788j);
            return;
        }
        if (callbackM2927x0 == null || this.f2720R) {
            return;
        }
        if (this.f2728Z && (this.f2729a0 & 1) != 0) {
            this.f2740l.getDecorView().removeCallbacks(this.f2730b0);
            this.f2730b0.run();
        }
        s sVarM2925v02 = m2925v0(0, true);
        C0786e c0786e = sVarM2925v02.f2788j;
        if (c0786e == null || sVarM2925v02.f2796r || !callbackM2927x0.onPreparePanel(0, sVarM2925v02.f2787i, c0786e)) {
            return;
        }
        callbackM2927x0.onMenuOpened(108, sVarM2925v02.f2788j);
        this.f2746r.mo3285g();
    }

    /* JADX INFO: renamed from: T0 */
    private int m2870T0(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i3 != 9) {
            return i3;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* JADX INFO: renamed from: U */
    private boolean m2871U(boolean z2) {
        return m2872V(z2, true);
    }

    /* JADX INFO: renamed from: V */
    private boolean m2872V(boolean z2, boolean z3) {
        if (this.f2720R) {
            return false;
        }
        int iM2876Z = m2876Z();
        int iM2895E0 = m2895E0(this.f2739k, iM2876Z);
        C0112i c0112iM2907Y = Build.VERSION.SDK_INT < 33 ? m2907Y(this.f2739k) : null;
        if (!z3 && c0112iM2907Y != null) {
            c0112iM2907Y = m2924u0(this.f2739k.getResources().getConfiguration());
        }
        boolean zM2881e1 = m2881e1(iM2895E0, c0112iM2907Y, z2);
        if (iM2876Z == 0) {
            m2891t0(this.f2739k).m2952e();
        } else {
            p pVar = this.f2726X;
            if (pVar != null) {
                pVar.m2951a();
            }
        }
        if (iM2876Z == 3) {
            m2890s0(this.f2739k).m2952e();
            return zM2881e1;
        }
        p pVar2 = this.f2727Y;
        if (pVar2 != null) {
            pVar2.m2951a();
        }
        return zM2881e1;
    }

    /* JADX INFO: renamed from: W */
    private void m2873W() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2704B.findViewById(R.id.content);
        View decorView = this.f2740l.getDecorView();
        contentFrameLayout.m3417a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f2739k.obtainStyledAttributes(AbstractC1769j.f9133y0);
        typedArrayObtainStyledAttributes.getValue(AbstractC1769j.f8927K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC1769j.f8932L0, contentFrameLayout.getMinWidthMinor());
        int i3 = AbstractC1769j.f8917I0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMajor());
        }
        int i4 = AbstractC1769j.f8922J0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedWidthMinor());
        }
        int i5 = AbstractC1769j.f8907G0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMajor());
        }
        int i6 = AbstractC1769j.f8912H0;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            typedArrayObtainStyledAttributes.getValue(i6, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: renamed from: X */
    private void m2874X(Window window) {
        if (this.f2740l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f2741m = nVar;
        window.setCallback(nVar);
        C0888e0 c0888e0M3764u = C0888e0.m3764u(this.f2739k, null, f2701l0);
        Drawable drawableM3773h = c0888e0M3764u.m3773h(0);
        if (drawableM3773h != null) {
            window.setBackgroundDrawable(drawableM3773h);
        }
        c0888e0M3764u.m3786x();
        this.f2740l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f2736h0 != null) {
            return;
        }
        mo2838O(null);
    }

    /* JADX INFO: renamed from: X0 */
    private boolean m2875X0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2740l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private int m2876Z() {
        int i3 = this.f2722T;
        return i3 != -100 ? i3 : AbstractC0751g.m2824o();
    }

    /* JADX INFO: renamed from: b1 */
    private void m2877b1() {
        if (this.f2703A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m2878c0() {
        p pVar = this.f2726X;
        if (pVar != null) {
            pVar.m2951a();
        }
        p pVar2 = this.f2727Y;
        if (pVar2 != null) {
            pVar2.m2951a();
        }
    }

    /* JADX INFO: renamed from: c1 */
    private AbstractActivityC0748d m2879c1() {
        for (Context baseContext = this.f2739k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AbstractActivityC0748d) {
                return (AbstractActivityC0748d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    private void m2880d1(Configuration configuration) {
        Activity activity = (Activity) this.f2738j;
        if (activity instanceof InterfaceC1132n) {
            if (((InterfaceC1132n) activity).getLifecycle().mo5133b().m5141b(AbstractC1126h.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f2719Q || this.f2720R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX INFO: renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2881e1(int r11, p012E.C0112i r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0753i.m2881e1(int, E.i, boolean):boolean");
    }

    /* JADX INFO: renamed from: f0 */
    private Configuration m2882f0(Context context, int i3, C0112i c0112i, Configuration configuration, boolean z2) {
        int i4 = i3 != 1 ? i3 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (c0112i != null) {
            m2904U0(configuration2, c0112i);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: g0 */
    private ViewGroup m2883g0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f2739k.obtainStyledAttributes(AbstractC1769j.f9133y0);
        int i3 = AbstractC1769j.f8892D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f8937M0, false)) {
            mo2834I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i3, false)) {
            mo2834I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f8897E0, false)) {
            mo2834I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f8902F0, false)) {
            mo2834I(10);
        }
        this.f2712J = typedArrayObtainStyledAttributes.getBoolean(AbstractC1769j.f9138z0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2887n0();
        this.f2740l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2739k);
        if (this.f2713K) {
            viewGroup = this.f2711I ? (ViewGroup) layoutInflaterFrom.inflate(AbstractC1766g.f8849o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(AbstractC1766g.f8848n, (ViewGroup) null);
        } else if (this.f2712J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC1766g.f8840f, (ViewGroup) null);
            this.f2710H = false;
            this.f2709G = false;
        } else if (this.f2709G) {
            TypedValue typedValue = new TypedValue();
            this.f2739k.getTheme().resolveAttribute(AbstractC1760a.f8703d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0774d(this.f2739k, typedValue.resourceId) : this.f2739k).inflate(AbstractC1766g.f8850p, (ViewGroup) null);
            InterfaceC0830G interfaceC0830G = (InterfaceC0830G) viewGroup.findViewById(AbstractC1765f.f8824p);
            this.f2746r = interfaceC0830G;
            interfaceC0830G.setWindowCallback(m2927x0());
            if (this.f2710H) {
                this.f2746r.mo3287k(109);
            }
            if (this.f2707E) {
                this.f2746r.mo3287k(2);
            }
            if (this.f2708F) {
                this.f2746r.mo3287k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2709G + ", windowActionBarOverlay: " + this.f2710H + ", android:windowIsFloating: " + this.f2712J + ", windowActionModeOverlay: " + this.f2711I + ", windowNoTitle: " + this.f2713K + " }");
        }
        AbstractC0268W.m795s0(viewGroup, new b());
        if (this.f2746r == null) {
            this.f2705C = (TextView) viewGroup.findViewById(AbstractC1765f.f8805M);
        }
        AbstractC0910p0.m3879c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC1765f.f8810b);
        ViewGroup viewGroup2 = (ViewGroup) this.f2740l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2740l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    /* JADX INFO: renamed from: g1 */
    private void m2884g1(int i3, C0112i c0112i, boolean z2, Configuration configuration) {
        Resources resources = this.f2739k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i3 | (resources.getConfiguration().uiMode & (-49));
        if (c0112i != null) {
            m2904U0(configuration2, c0112i);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC0739D.m2689a(resources);
        }
        int i4 = this.f2723U;
        if (i4 != 0) {
            this.f2739k.setTheme(i4);
            this.f2739k.getTheme().applyStyle(this.f2723U, true);
        }
        if (z2 && (this.f2738j instanceof Activity)) {
            m2880d1(configuration2);
        }
    }

    /* JADX INFO: renamed from: i1 */
    private void m2885i1(View view) {
        view.setBackgroundColor((AbstractC0268W.m740I(view) & 8192) != 0 ? AbstractC0966b.getColor(this.f2739k, AbstractC1762c.f8728b) : AbstractC0966b.getColor(this.f2739k, AbstractC1762c.f8727a));
    }

    /* JADX INFO: renamed from: m0 */
    private void m2886m0() {
        if (this.f2703A) {
            return;
        }
        this.f2704B = m2883g0();
        CharSequence charSequenceM2926w0 = m2926w0();
        if (!TextUtils.isEmpty(charSequenceM2926w0)) {
            InterfaceC0830G interfaceC0830G = this.f2746r;
            if (interfaceC0830G != null) {
                interfaceC0830G.setWindowTitle(charSequenceM2926w0);
            } else if (m2903P0() != null) {
                m2903P0().mo2715y(charSequenceM2926w0);
            } else {
                TextView textView = this.f2705C;
                if (textView != null) {
                    textView.setText(charSequenceM2926w0);
                }
            }
        }
        m2873W();
        m2902N0(this.f2704B);
        this.f2703A = true;
        s sVarM2925v0 = m2925v0(0, false);
        if (this.f2720R) {
            return;
        }
        if (sVarM2925v0 == null || sVarM2925v0.f2788j == null) {
            m2863C0(108);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m2887n0() {
        if (this.f2740l == null) {
            Object obj = this.f2738j;
            if (obj instanceof Activity) {
                m2874X(((Activity) obj).getWindow());
            }
        }
        if (this.f2740l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: p0 */
    private static Configuration m2888p0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f3 = configuration.fontScale;
            float f4 = configuration2.fontScale;
            if (f3 != f4) {
                configuration3.fontScale = f4;
            }
            int i3 = configuration.mcc;
            int i4 = configuration2.mcc;
            if (i3 != i4) {
                configuration3.mcc = i4;
            }
            int i5 = configuration.mnc;
            int i6 = configuration2.mnc;
            if (i5 != i6) {
                configuration3.mnc = i6;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                k.m2935a(configuration, configuration2, configuration3);
            } else if (!AbstractC0206c.m596a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i8 = configuration.touchscreen;
            int i9 = configuration2.touchscreen;
            if (i8 != i9) {
                configuration3.touchscreen = i9;
            }
            int i10 = configuration.keyboard;
            int i11 = configuration2.keyboard;
            if (i10 != i11) {
                configuration3.keyboard = i11;
            }
            int i12 = configuration.keyboardHidden;
            int i13 = configuration2.keyboardHidden;
            if (i12 != i13) {
                configuration3.keyboardHidden = i13;
            }
            int i14 = configuration.navigation;
            int i15 = configuration2.navigation;
            if (i14 != i15) {
                configuration3.navigation = i15;
            }
            int i16 = configuration.navigationHidden;
            int i17 = configuration2.navigationHidden;
            if (i16 != i17) {
                configuration3.navigationHidden = i17;
            }
            int i18 = configuration.orientation;
            int i19 = configuration2.orientation;
            if (i18 != i19) {
                configuration3.orientation = i19;
            }
            int i20 = configuration.screenLayout & 15;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 15)) {
                configuration3.screenLayout |= i21 & 15;
            }
            int i22 = configuration.screenLayout & 192;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 192)) {
                configuration3.screenLayout |= i23 & 192;
            }
            int i24 = configuration.screenLayout & 48;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 48)) {
                configuration3.screenLayout |= i25 & 48;
            }
            int i26 = configuration.screenLayout & 768;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 768)) {
                configuration3.screenLayout |= i27 & 768;
            }
            if (i7 >= 26) {
                l.m2939a(configuration, configuration2, configuration3);
            }
            int i28 = configuration.uiMode & 15;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 15)) {
                configuration3.uiMode |= i29 & 15;
            }
            int i30 = configuration.uiMode & 48;
            int i31 = configuration2.uiMode;
            if (i30 != (i31 & 48)) {
                configuration3.uiMode |= i31 & 48;
            }
            int i32 = configuration.screenWidthDp;
            int i33 = configuration2.screenWidthDp;
            if (i32 != i33) {
                configuration3.screenWidthDp = i33;
            }
            int i34 = configuration.screenHeightDp;
            int i35 = configuration2.screenHeightDp;
            if (i34 != i35) {
                configuration3.screenHeightDp = i35;
            }
            int i36 = configuration.smallestScreenWidthDp;
            int i37 = configuration2.smallestScreenWidthDp;
            if (i36 != i37) {
                configuration3.smallestScreenWidthDp = i37;
            }
            int i38 = configuration.densityDpi;
            int i39 = configuration2.densityDpi;
            if (i38 != i39) {
                configuration3.densityDpi = i39;
            }
        }
        return configuration3;
    }

    /* JADX INFO: renamed from: r0 */
    private int m2889r0(Context context) {
        if (!this.f2725W && (this.f2738j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f2738j.getClass()), i3 >= 29 ? 269221888 : i3 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f2724V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e3);
                this.f2724V = 0;
            }
        }
        this.f2725W = true;
        return this.f2724V;
    }

    /* JADX INFO: renamed from: s0 */
    private p m2890s0(Context context) {
        if (this.f2727Y == null) {
            this.f2727Y = new o(context);
        }
        return this.f2727Y;
    }

    /* JADX INFO: renamed from: t0 */
    private p m2891t0(Context context) {
        if (this.f2726X == null) {
            this.f2726X = new q(C0743H.m2724a(context));
        }
        return this.f2726X;
    }

    /* JADX INFO: renamed from: y0 */
    private void m2892y0() {
        m2886m0();
        if (this.f2709G && this.f2743o == null) {
            Object obj = this.f2738j;
            if (obj instanceof Activity) {
                this.f2743o = new C0744I((Activity) this.f2738j, this.f2710H);
            } else if (obj instanceof Dialog) {
                this.f2743o = new C0744I((Dialog) this.f2738j);
            }
            AbstractC0745a abstractC0745a = this.f2743o;
            if (abstractC0745a != null) {
                abstractC0745a.mo2709s(this.f2731c0);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    private boolean m2893z0(s sVar) {
        View view = sVar.f2787i;
        if (view != null) {
            sVar.f2786h = view;
            return true;
        }
        if (sVar.f2788j == null) {
            return false;
        }
        if (this.f2748t == null) {
            this.f2748t = new t();
        }
        View view2 = (View) sVar.m2954a(this.f2748t);
        sVar.f2786h = view2;
        return view2 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2828A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2738j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0751g.m2812G(r3)
        L9:
            boolean r0 = r3.f2728Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f2740l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f2730b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f2720R = r0
            int r0 = r3.f2722T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f2738j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.i r0 = androidx.appcompat.app.LayoutInflaterFactory2C0753i.f2699j0
            java.lang.Object r1 = r3.f2738j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2722T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.i r0 = androidx.appcompat.app.LayoutInflaterFactory2C0753i.f2699j0
            java.lang.Object r1 = r3.f2738j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f2743o
            if (r0 == 0) goto L5b
            r0.mo2705o()
        L5b:
            r3.m2878c0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0753i.mo2828A():void");
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: B */
    public void mo2829B(Bundle bundle) {
        m2886m0();
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: C */
    public void mo2830C() {
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        if (abstractC0745aMo2851u != null) {
            abstractC0745aMo2851u.mo2714x(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: D */
    public void mo2831D(Bundle bundle) {
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m2894D0() {
        return this.f2754z;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: E */
    public void mo2832E() {
        m2872V(true, false);
    }

    /* JADX INFO: renamed from: E0 */
    int m2895E0(Context context, int i3) {
        if (i3 == -100) {
            return -1;
        }
        if (i3 != -1) {
            if (i3 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m2891t0(context).mo2949c();
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    return m2890s0(context).mo2949c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i3;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: F */
    public void mo2833F() {
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        if (abstractC0745aMo2851u != null) {
            abstractC0745aMo2851u.mo2714x(false);
        }
    }

    /* JADX INFO: renamed from: F0 */
    boolean m2896F0() {
        boolean z2 = this.f2717O;
        this.f2717O = false;
        s sVarM2925v0 = m2925v0(0, false);
        if (sVarM2925v0 != null && sVarM2925v0.f2793o) {
            if (!z2) {
                m2914e0(sVarM2925v0, true);
            }
            return true;
        }
        AbstractC0772b abstractC0772b = this.f2749u;
        if (abstractC0772b != null) {
            abstractC0772b.mo2754c();
            return true;
        }
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        return abstractC0745aMo2851u != null && abstractC0745aMo2851u.mo2698h();
    }

    /* JADX INFO: renamed from: G0 */
    boolean m2897G0(int i3, KeyEvent keyEvent) {
        if (i3 == 4) {
            this.f2717O = (keyEvent.getFlags() & 128) != 0;
        } else if (i3 == 82) {
            m2864H0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: I */
    public boolean mo2834I(int i3) {
        int iM2870T0 = m2870T0(i3);
        if (this.f2713K && iM2870T0 == 108) {
            return false;
        }
        if (this.f2709G && iM2870T0 == 1) {
            this.f2709G = false;
        }
        if (iM2870T0 == 1) {
            m2877b1();
            this.f2713K = true;
            return true;
        }
        if (iM2870T0 == 2) {
            m2877b1();
            this.f2707E = true;
            return true;
        }
        if (iM2870T0 == 5) {
            m2877b1();
            this.f2708F = true;
            return true;
        }
        if (iM2870T0 == 10) {
            m2877b1();
            this.f2711I = true;
            return true;
        }
        if (iM2870T0 == 108) {
            m2877b1();
            this.f2709G = true;
            return true;
        }
        if (iM2870T0 != 109) {
            return this.f2740l.requestFeature(iM2870T0);
        }
        m2877b1();
        this.f2710H = true;
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    boolean m2898I0(int i3, KeyEvent keyEvent) {
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        if (abstractC0745aMo2851u != null && abstractC0745aMo2851u.mo2706p(i3, keyEvent)) {
            return true;
        }
        s sVar = this.f2716N;
        if (sVar != null && m2867Q0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.f2716N;
            if (sVar2 != null) {
                sVar2.f2792n = true;
            }
            return true;
        }
        if (this.f2716N == null) {
            s sVarM2925v0 = m2925v0(0, true);
            m2868R0(sVarM2925v0, keyEvent);
            boolean zM2867Q0 = m2867Q0(sVarM2925v0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarM2925v0.f2791m = false;
            if (zM2867Q0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    boolean m2899J0(int i3, KeyEvent keyEvent) {
        if (i3 != 4) {
            if (i3 == 82) {
                m2865K0(0, keyEvent);
                return true;
            }
        } else if (m2896F0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: K */
    public void mo2835K(int i3) {
        m2886m0();
        ViewGroup viewGroup = (ViewGroup) this.f2704B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2739k).inflate(i3, viewGroup);
        this.f2741m.m2944c(this.f2740l.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: L */
    public void mo2836L(View view) {
        m2886m0();
        ViewGroup viewGroup = (ViewGroup) this.f2704B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2741m.m2944c(this.f2740l.getCallback());
    }

    /* JADX INFO: renamed from: L0 */
    void m2900L0(int i3) {
        AbstractC0745a abstractC0745aMo2851u;
        if (i3 != 108 || (abstractC0745aMo2851u = mo2851u()) == null) {
            return;
        }
        abstractC0745aMo2851u.mo2699i(true);
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: M */
    public void mo2837M(View view, ViewGroup.LayoutParams layoutParams) {
        m2886m0();
        ViewGroup viewGroup = (ViewGroup) this.f2704B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2741m.m2944c(this.f2740l.getCallback());
    }

    /* JADX INFO: renamed from: M0 */
    void m2901M0(int i3) {
        if (i3 == 108) {
            AbstractC0745a abstractC0745aMo2851u = mo2851u();
            if (abstractC0745aMo2851u != null) {
                abstractC0745aMo2851u.mo2699i(false);
                return;
            }
            return;
        }
        if (i3 == 0) {
            s sVarM2925v0 = m2925v0(i3, true);
            if (sVarM2925v0.f2793o) {
                m2914e0(sVarM2925v0, false);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    void m2902N0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2838O(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.mo2838O(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f2736h0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f2737i0
            if (r1 == 0) goto L11
            androidx.appcompat.app.LayoutInflaterFactory2C0753i.m.m2942c(r0, r1)
            r0 = 0
            r2.f2737i0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f2738j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f2738j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.LayoutInflaterFactory2C0753i.m.m2940a(r3)
            r2.f2736h0 = r3
            goto L2e
        L2c:
            r2.f2736h0 = r3
        L2e:
            r2.m2915f1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0753i.mo2838O(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: P */
    public void mo2839P(Toolbar toolbar) {
        if (this.f2738j instanceof Activity) {
            AbstractC0745a abstractC0745aMo2851u = mo2851u();
            if (abstractC0745aMo2851u instanceof C0744I) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2744p = null;
            if (abstractC0745aMo2851u != null) {
                abstractC0745aMo2851u.mo2705o();
            }
            this.f2743o = null;
            if (toolbar != null) {
                C0741F c0741f = new C0741F(toolbar, m2926w0(), this.f2741m);
                this.f2743o = c0741f;
                this.f2741m.m2946e(c0741f.f2597c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f2741m.m2946e(null);
            }
            mo2853w();
        }
    }

    /* JADX INFO: renamed from: P0 */
    final AbstractC0745a m2903P0() {
        return this.f2743o;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: Q */
    public void mo2840Q(int i3) {
        this.f2723U = i3;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: R */
    public final void mo2841R(CharSequence charSequence) {
        this.f2745q = charSequence;
        InterfaceC0830G interfaceC0830G = this.f2746r;
        if (interfaceC0830G != null) {
            interfaceC0830G.setWindowTitle(charSequence);
            return;
        }
        if (m2903P0() != null) {
            m2903P0().mo2715y(charSequence);
            return;
        }
        TextView textView = this.f2705C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: U0 */
    void m2904U0(Configuration configuration, C0112i c0112i) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.m2938d(configuration, c0112i);
        } else {
            configuration.setLocale(c0112i.m341d(0));
            configuration.setLayoutDirection(c0112i.m341d(0));
        }
    }

    /* JADX INFO: renamed from: V0 */
    void m2905V0(C0112i c0112i) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.m2937c(c0112i);
        } else {
            Locale.setDefault(c0112i.m341d(0));
        }
    }

    /* JADX INFO: renamed from: W0 */
    final boolean m2906W0() {
        ViewGroup viewGroup;
        return this.f2703A && (viewGroup = this.f2704B) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: Y */
    C0112i m2907Y(Context context) {
        C0112i c0112iM2826t;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 || (c0112iM2826t = AbstractC0751g.m2826t()) == null) {
            return null;
        }
        C0112i c0112iM2924u0 = m2924u0(context.getApplicationContext().getResources().getConfiguration());
        C0112i c0112iM2688b = i3 >= 24 ? AbstractC0738C.m2688b(c0112iM2826t, c0112iM2924u0) : c0112iM2826t.m342f() ? C0112i.m339e() : C0112i.m338c(j.m2934b(c0112iM2826t.m341d(0)));
        return c0112iM2688b.m342f() ? c0112iM2924u0 : c0112iM2688b;
    }

    /* JADX INFO: renamed from: Y0 */
    boolean m2908Y0() {
        if (this.f2736h0 == null) {
            return false;
        }
        s sVarM2925v0 = m2925v0(0, false);
        return (sVarM2925v0 != null && sVarM2925v0.f2793o) || this.f2749u != null;
    }

    /* JADX INFO: renamed from: Z0 */
    public AbstractC0772b m2909Z0(AbstractC0772b.a aVar) {
        InterfaceC0749e interfaceC0749e;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0772b abstractC0772b = this.f2749u;
        if (abstractC0772b != null) {
            abstractC0772b.mo2754c();
        }
        i iVar = new i(aVar);
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        if (abstractC0745aMo2851u != null) {
            AbstractC0772b abstractC0772bMo2738A = abstractC0745aMo2851u.mo2738A(iVar);
            this.f2749u = abstractC0772bMo2738A;
            if (abstractC0772bMo2738A != null && (interfaceC0749e = this.f2742n) != null) {
                interfaceC0749e.mo2797g(abstractC0772bMo2738A);
            }
        }
        if (this.f2749u == null) {
            this.f2749u = m2911a1(iVar);
        }
        m2915f1();
        return this.f2749u;
    }

    @Override // androidx.appcompat.view.menu.C0786e.a
    /* JADX INFO: renamed from: a */
    public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
        s sVarM2922o0;
        Window.Callback callbackM2927x0 = m2927x0();
        if (callbackM2927x0 == null || this.f2720R || (sVarM2922o0 = m2922o0(c0786e.mo3127F())) == null) {
            return false;
        }
        return callbackM2927x0.onMenuItemSelected(sVarM2922o0.f2779a, menuItem);
    }

    /* JADX INFO: renamed from: a0 */
    void m2910a0(int i3, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i3 >= 0) {
                s[] sVarArr = this.f2715M;
                if (i3 < sVarArr.length) {
                    sVar = sVarArr[i3];
                }
            }
            if (sVar != null) {
                menu = sVar.f2788j;
            }
        }
        if ((sVar == null || sVar.f2793o) && !this.f2720R) {
            this.f2741m.m2945d(this.f2740l.getCallback(), i3, menu);
        }
    }

    /* JADX INFO: renamed from: a1 */
    AbstractC0772b m2911a1(AbstractC0772b.a aVar) {
        AbstractC0772b abstractC0772bMo2809u;
        Context c0774d;
        InterfaceC0749e interfaceC0749e;
        m2921l0();
        AbstractC0772b abstractC0772b = this.f2749u;
        if (abstractC0772b != null) {
            abstractC0772b.mo2754c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        InterfaceC0749e interfaceC0749e2 = this.f2742n;
        if (interfaceC0749e2 == null || this.f2720R) {
            abstractC0772bMo2809u = null;
        } else {
            try {
                abstractC0772bMo2809u = interfaceC0749e2.mo2809u(aVar);
            } catch (AbstractMethodError unused) {
                abstractC0772bMo2809u = null;
            }
        }
        if (abstractC0772bMo2809u != null) {
            this.f2749u = abstractC0772bMo2809u;
        } else {
            if (this.f2750v == null) {
                if (this.f2712J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f2739k.getTheme();
                    theme.resolveAttribute(AbstractC1760a.f8703d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f2739k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c0774d = new C0774d(this.f2739k, 0);
                        c0774d.getTheme().setTo(themeNewTheme);
                    } else {
                        c0774d = this.f2739k;
                    }
                    this.f2750v = new ActionBarContextView(c0774d);
                    PopupWindow popupWindow = new PopupWindow(c0774d, (AttributeSet) null, AbstractC1760a.f8705f);
                    this.f2751w = popupWindow;
                    AbstractC0987h.m4378b(popupWindow, 2);
                    this.f2751w.setContentView(this.f2750v);
                    this.f2751w.setWidth(-1);
                    c0774d.getTheme().resolveAttribute(AbstractC1760a.f8701b, typedValue, true);
                    this.f2750v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0774d.getResources().getDisplayMetrics()));
                    this.f2751w.setHeight(-2);
                    this.f2752x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2704B.findViewById(AbstractC1765f.f8816h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m2923q0()));
                        this.f2750v = (ActionBarContextView) viewStubCompat.m3708a();
                    }
                }
            }
            if (this.f2750v != null) {
                m2921l0();
                this.f2750v.m3268k();
                C0775e c0775e = new C0775e(this.f2750v.getContext(), this.f2750v, aVar, this.f2751w == null);
                if (aVar.mo2932d(c0775e, c0775e.mo2756e())) {
                    c0775e.mo2760k();
                    this.f2750v.m3266h(c0775e);
                    this.f2749u = c0775e;
                    if (m2906W0()) {
                        this.f2750v.setAlpha(0.0f);
                        C0282e0 c0282e0M960b = AbstractC0268W.m766e(this.f2750v).m960b(1.0f);
                        this.f2753y = c0282e0M960b;
                        c0282e0M960b.m965g(new e());
                    } else {
                        this.f2750v.setAlpha(1.0f);
                        this.f2750v.setVisibility(0);
                        if (this.f2750v.getParent() instanceof View) {
                            AbstractC0268W.m769f0((View) this.f2750v.getParent());
                        }
                    }
                    if (this.f2751w != null) {
                        this.f2740l.getDecorView().post(this.f2752x);
                    }
                } else {
                    this.f2749u = null;
                }
            }
        }
        AbstractC0772b abstractC0772b2 = this.f2749u;
        if (abstractC0772b2 != null && (interfaceC0749e = this.f2742n) != null) {
            interfaceC0749e.mo2797g(abstractC0772b2);
        }
        m2915f1();
        return this.f2749u;
    }

    @Override // androidx.appcompat.view.menu.C0786e.a
    /* JADX INFO: renamed from: b */
    public void mo2720b(C0786e c0786e) {
        m2869S0(true);
    }

    /* JADX INFO: renamed from: b0 */
    void m2912b0(C0786e c0786e) {
        if (this.f2714L) {
            return;
        }
        this.f2714L = true;
        this.f2746r.mo3288l();
        Window.Callback callbackM2927x0 = m2927x0();
        if (callbackM2927x0 != null && !this.f2720R) {
            callbackM2927x0.onPanelClosed(108, c0786e);
        }
        this.f2714L = false;
    }

    /* JADX INFO: renamed from: d0 */
    void m2913d0(int i3) {
        m2914e0(m2925v0(i3, true), true);
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: e */
    public void mo2842e(View view, ViewGroup.LayoutParams layoutParams) {
        m2886m0();
        ((ViewGroup) this.f2704B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f2741m.m2944c(this.f2740l.getCallback());
    }

    /* JADX INFO: renamed from: e0 */
    void m2914e0(s sVar, boolean z2) {
        ViewGroup viewGroup;
        InterfaceC0830G interfaceC0830G;
        if (z2 && sVar.f2779a == 0 && (interfaceC0830G = this.f2746r) != null && interfaceC0830G.mo3281b()) {
            m2912b0(sVar.f2788j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2739k.getSystemService("window");
        if (windowManager != null && sVar.f2793o && (viewGroup = sVar.f2785g) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                m2910a0(sVar.f2779a, sVar, null);
            }
        }
        sVar.f2791m = false;
        sVar.f2792n = false;
        sVar.f2793o = false;
        sVar.f2786h = null;
        sVar.f2795q = true;
        if (this.f2716N == sVar) {
            this.f2716N = null;
        }
        if (sVar.f2779a == 0) {
            m2915f1();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: f */
    public boolean mo2843f() {
        return m2871U(true);
    }

    /* JADX INFO: renamed from: f1 */
    void m2915f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zM2908Y0 = m2908Y0();
            if (zM2908Y0 && this.f2737i0 == null) {
                this.f2737i0 = m.m2941b(this.f2736h0, this);
            } else {
                if (zM2908Y0 || (onBackInvokedCallback = this.f2737i0) == null) {
                    return;
                }
                m.m2942c(this.f2736h0, onBackInvokedCallback);
                this.f2737i0 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public View m2916h0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        if (this.f2734f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f2739k.obtainStyledAttributes(AbstractC1769j.f9133y0);
            String string = typedArrayObtainStyledAttributes.getString(AbstractC1769j.f8887C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f2734f0 = new C0770z();
            } else {
                try {
                    this.f2734f0 = (C0770z) this.f2739k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2734f0 = new C0770z();
                }
            }
        }
        boolean z3 = f2700k0;
        boolean zM2875X0 = false;
        if (z3) {
            if (this.f2735g0 == null) {
                this.f2735g0 = new C0737B();
            }
            if (this.f2735g0.m2686a(attributeSet)) {
                z2 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zM2875X0 = m2875X0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zM2875X0 = true;
                }
                z2 = zM2875X0;
            }
        } else {
            z2 = zM2875X0;
        }
        return this.f2734f0.m2996r(view, str, context, attributeSet, z2, z3, true, C0908o0.m3864d());
    }

    /* JADX INFO: renamed from: h1 */
    final int m2917h1(C0318w0 c0318w0, Rect rect) {
        boolean z2;
        boolean z3;
        int iM1088l = c0318w0 != null ? c0318w0.m1088l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f2750v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2750v.getLayoutParams();
            if (this.f2750v.isShown()) {
                if (this.f2732d0 == null) {
                    this.f2732d0 = new Rect();
                    this.f2733e0 = new Rect();
                }
                Rect rect2 = this.f2732d0;
                Rect rect3 = this.f2733e0;
                if (c0318w0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0318w0.m1086j(), c0318w0.m1088l(), c0318w0.m1087k(), c0318w0.m1085i());
                }
                AbstractC0910p0.m3877a(this.f2704B, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C0318w0 c0318w0M735D = AbstractC0268W.m735D(this.f2704B);
                int iM1086j = c0318w0M735D == null ? 0 : c0318w0M735D.m1086j();
                int iM1087k = c0318w0M735D == null ? 0 : c0318w0M735D.m1087k();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                if (i3 <= 0 || this.f2706D != null) {
                    View view = this.f2706D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iM1086j || marginLayoutParams2.rightMargin != iM1087k) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iM1086j;
                            marginLayoutParams2.rightMargin = iM1087k;
                            this.f2706D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f2739k);
                    this.f2706D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM1086j;
                    layoutParams.rightMargin = iM1087k;
                    this.f2704B.addView(this.f2706D, -1, layoutParams);
                }
                View view3 = this.f2706D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    m2885i1(this.f2706D);
                }
                if (!this.f2711I && z) {
                    iM1088l = 0;
                }
                z2 = z;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                this.f2750v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f2706D;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        return iM1088l;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: i */
    public Context mo2845i(Context context) {
        Context context2;
        this.f2718P = true;
        int iM2895E0 = m2895E0(context, m2876Z());
        if (AbstractC0751g.m2827x(context)) {
            AbstractC0751g.m2817T(context);
        }
        C0112i c0112iM2907Y = m2907Y(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(m2882f0(context2, iM2895E0, c0112iM2907Y, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof C0774d) {
            try {
                ((C0774d) context2).m3012a(m2882f0(context2, iM2895E0, c0112iM2907Y, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2702m0) {
            return super.mo2845i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM2882f0 = m2882f0(context2, iM2895E0, c0112iM2907Y, !configuration2.equals(configuration3) ? m2888p0(configuration2, configuration3) : null, true);
        C0774d c0774d = new C0774d(context2, AbstractC1768i.f8873e);
        c0774d.m3012a(configurationM2882f0);
        try {
            if (context2.getTheme() != null) {
                AbstractC2538k.f.m12159a(c0774d.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.mo2845i(c0774d);
    }

    /* JADX INFO: renamed from: i0 */
    void m2918i0() {
        C0786e c0786e;
        InterfaceC0830G interfaceC0830G = this.f2746r;
        if (interfaceC0830G != null) {
            interfaceC0830G.mo3288l();
        }
        if (this.f2751w != null) {
            this.f2740l.getDecorView().removeCallbacks(this.f2752x);
            if (this.f2751w.isShowing()) {
                try {
                    this.f2751w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2751w = null;
        }
        m2921l0();
        s sVarM2925v0 = m2925v0(0, false);
        if (sVarM2925v0 == null || (c0786e = sVarM2925v0.f2788j) == null) {
            return;
        }
        c0786e.close();
    }

    /* JADX INFO: renamed from: j0 */
    boolean m2919j0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2738j;
        if (((obj instanceof AbstractC0311t.a) || (obj instanceof AbstractDialogC0769y)) && (decorView = this.f2740l.getDecorView()) != null && AbstractC0311t.m1058d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2741m.m2943b(this.f2740l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m2897G0(keyCode, keyEvent) : m2899J0(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: k0 */
    void m2920k0(int i3) {
        s sVarM2925v0;
        s sVarM2925v02 = m2925v0(i3, true);
        if (sVarM2925v02.f2788j != null) {
            Bundle bundle = new Bundle();
            sVarM2925v02.f2788j.m3141U(bundle);
            if (bundle.size() > 0) {
                sVarM2925v02.f2797s = bundle;
            }
            sVarM2925v02.f2788j.m3160i0();
            sVarM2925v02.f2788j.clear();
        }
        sVarM2925v02.f2796r = true;
        sVarM2925v02.f2795q = true;
        if ((i3 != 108 && i3 != 0) || this.f2746r == null || (sVarM2925v0 = m2925v0(0, false)) == null) {
            return;
        }
        sVarM2925v0.f2791m = false;
        m2868R0(sVarM2925v0, null);
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: l */
    public View mo2846l(int i3) {
        m2886m0();
        return this.f2740l.findViewById(i3);
    }

    /* JADX INFO: renamed from: l0 */
    void m2921l0() {
        C0282e0 c0282e0 = this.f2753y;
        if (c0282e0 != null) {
            c0282e0.m961c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: n */
    public Context mo2847n() {
        return this.f2739k;
    }

    /* JADX INFO: renamed from: o0 */
    s m2922o0(Menu menu) {
        s[] sVarArr = this.f2715M;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i3 = 0; i3 < length; i3++) {
            s sVar = sVarArr[i3];
            if (sVar != null && sVar.f2788j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m2916h0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: p */
    public final AbstractC0746b.b mo2848p() {
        return new f();
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: q */
    public int mo2849q() {
        return this.f2722T;
    }

    /* JADX INFO: renamed from: q0 */
    final Context m2923q0() {
        AbstractC0745a abstractC0745aMo2851u = mo2851u();
        Context contextMo2701k = abstractC0745aMo2851u != null ? abstractC0745aMo2851u.mo2701k() : null;
        return contextMo2701k == null ? this.f2739k : contextMo2701k;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: s */
    public MenuInflater mo2850s() {
        if (this.f2744p == null) {
            m2892y0();
            AbstractC0745a abstractC0745a = this.f2743o;
            this.f2744p = new C0777g(abstractC0745a != null ? abstractC0745a.mo2701k() : this.f2739k);
        }
        return this.f2744p;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: u */
    public AbstractC0745a mo2851u() {
        m2892y0();
        return this.f2743o;
    }

    /* JADX INFO: renamed from: u0 */
    C0112i m2924u0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.m2936b(configuration) : C0112i.m338c(j.m2934b(configuration.locale));
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: v */
    public void mo2852v() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2739k);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC0313u.m1063a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0753i) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: v0 */
    protected s m2925v0(int i3, boolean z2) {
        s[] sVarArr = this.f2715M;
        if (sVarArr == null || sVarArr.length <= i3) {
            s[] sVarArr2 = new s[i3 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f2715M = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i3];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i3);
        sVarArr[i3] = sVar2;
        return sVar2;
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: w */
    public void mo2853w() {
        if (m2903P0() == null || mo2851u().mo2703m()) {
            return;
        }
        m2863C0(0);
    }

    /* JADX INFO: renamed from: w0 */
    final CharSequence m2926w0() {
        Object obj = this.f2738j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2745q;
    }

    /* JADX INFO: renamed from: x0 */
    final Window.Callback m2927x0() {
        return this.f2740l.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: y */
    public void mo2854y(Configuration configuration) {
        AbstractC0745a abstractC0745aMo2851u;
        if (this.f2709G && this.f2703A && (abstractC0745aMo2851u = mo2851u()) != null) {
            abstractC0745aMo2851u.mo2704n(configuration);
        }
        C0897j.m3813b().m3820g(this.f2739k);
        this.f2721S = new Configuration(this.f2739k.getResources().getConfiguration());
        m2872V(false, false);
    }

    @Override // androidx.appcompat.app.AbstractC0751g
    /* JADX INFO: renamed from: z */
    public void mo2855z(Bundle bundle) {
        String strM11928c;
        this.f2718P = true;
        m2871U(false);
        m2887n0();
        Object obj = this.f2738j;
        if (obj instanceof Activity) {
            try {
                strM11928c = AbstractC2511j.m11928c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM11928c = null;
            }
            if (strM11928c != null) {
                AbstractC0745a abstractC0745aM2903P0 = m2903P0();
                if (abstractC0745aM2903P0 == null) {
                    this.f2731c0 = true;
                } else {
                    abstractC0745aM2903P0.mo2709s(true);
                }
            }
            AbstractC0751g.m2819d(this);
        }
        this.f2721S = new Configuration(this.f2739k.getResources().getConfiguration());
        this.f2719Q = true;
    }

    LayoutInflaterFactory2C0753i(Dialog dialog, InterfaceC0749e interfaceC0749e) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0749e, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C0753i(Context context, Window window, InterfaceC0749e interfaceC0749e, Object obj) {
        AbstractActivityC0748d abstractActivityC0748dM2879c1;
        this.f2753y = null;
        this.f2754z = true;
        this.f2722T = -100;
        this.f2730b0 = new a();
        this.f2739k = context;
        this.f2742n = interfaceC0749e;
        this.f2738j = obj;
        if (this.f2722T == -100 && (obj instanceof Dialog) && (abstractActivityC0748dM2879c1 = m2879c1()) != null) {
            this.f2722T = abstractActivityC0748dM2879c1.m2798j0().mo2849q();
        }
        if (this.f2722T == -100) {
            C0929i c0929i = f2699j0;
            Integer num = (Integer) c0929i.get(obj.getClass().getName());
            if (num != null) {
                this.f2722T = num.intValue();
                c0929i.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m2874X(window);
        }
        C0897j.m3815h();
    }
}
