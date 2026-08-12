package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0746b;
import androidx.appcompat.app.AbstractC0751g;
import androidx.appcompat.widget.C0908o0;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0922b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p012E.C0112i;
import p161x.AbstractC2506e;

/* JADX INFO: renamed from: androidx.appcompat.app.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0751g {

    /* JADX INFO: renamed from: a */
    static c f2684a = new c(new d());

    /* JADX INFO: renamed from: b */
    private static int f2685b = -100;

    /* JADX INFO: renamed from: c */
    private static C0112i f2686c = null;

    /* JADX INFO: renamed from: d */
    private static C0112i f2687d = null;

    /* JADX INFO: renamed from: e */
    private static Boolean f2688e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f2689f = false;

    /* JADX INFO: renamed from: g */
    private static final C0922b f2690g = new C0922b();

    /* JADX INFO: renamed from: h */
    private static final Object f2691h = new Object();

    /* JADX INFO: renamed from: i */
    private static final Object f2692i = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.g$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m2856a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static LocaleList m2857a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: renamed from: b */
        static void m2858b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$c */
    static class c implements Executor {

        /* JADX INFO: renamed from: d */
        private final Object f2693d = new Object();

        /* JADX INFO: renamed from: e */
        final Queue f2694e = new ArrayDeque();

        /* JADX INFO: renamed from: f */
        final Executor f2695f;

        /* JADX INFO: renamed from: g */
        Runnable f2696g;

        c(Executor executor) {
            this.f2695f = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2859a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.m2860b();
            }
        }

        /* JADX INFO: renamed from: b */
        protected void m2860b() {
            synchronized (this.f2693d) {
                try {
                    Runnable runnable = (Runnable) this.f2694e.poll();
                    this.f2696g = runnable;
                    if (runnable != null) {
                        this.f2695f.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f2693d) {
                try {
                    this.f2694e.add(new Runnable() { // from class: androidx.appcompat.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0751g.c.m2859a(this.f2697d, runnable);
                        }
                    });
                    if (this.f2696g == null) {
                        m2860b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$d */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    AbstractC0751g() {
    }

    /* JADX INFO: renamed from: G */
    static void m2812G(AbstractC0751g abstractC0751g) {
        synchronized (f2691h) {
            m2813H(abstractC0751g);
        }
    }

    /* JADX INFO: renamed from: H */
    private static void m2813H(AbstractC0751g abstractC0751g) {
        synchronized (f2691h) {
            try {
                Iterator it = f2690g.iterator();
                while (it.hasNext()) {
                    AbstractC0751g abstractC0751g2 = (AbstractC0751g) ((WeakReference) it.next()).get();
                    if (abstractC0751g2 == abstractC0751g || abstractC0751g2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m2814J(boolean z2) {
        C0908o0.m3863c(z2);
    }

    /* JADX INFO: renamed from: N */
    public static void m2815N(int i3) {
        if (i3 != -1 && i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f2685b != i3) {
            f2685b = i3;
            m2820g();
        }
    }

    /* JADX INFO: renamed from: S */
    static void m2816S(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m2823m().m342f()) {
                    String strM11910b = AbstractC2506e.m11910b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.m2858b(systemService, a.m2856a(strM11910b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    static void m2817T(final Context context) {
        if (m2827x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f2689f) {
                    return;
                }
                f2684a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0751g.m2818c(context);
                    }
                });
                return;
            }
            synchronized (f2692i) {
                try {
                    C0112i c0112i = f2686c;
                    if (c0112i == null) {
                        if (f2687d == null) {
                            f2687d = C0112i.m338c(AbstractC2506e.m11910b(context));
                        }
                        if (f2687d.m342f()) {
                        } else {
                            f2686c = f2687d;
                        }
                    } else if (!c0112i.equals(f2687d)) {
                        C0112i c0112i2 = f2686c;
                        f2687d = c0112i2;
                        AbstractC2506e.m11909a(context, c0112i2.m344h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2818c(Context context) {
        m2816S(context);
        f2689f = true;
    }

    /* JADX INFO: renamed from: d */
    static void m2819d(AbstractC0751g abstractC0751g) {
        synchronized (f2691h) {
            m2813H(abstractC0751g);
            f2690g.add(new WeakReference(abstractC0751g));
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m2820g() {
        synchronized (f2691h) {
            try {
                Iterator it = f2690g.iterator();
                while (it.hasNext()) {
                    AbstractC0751g abstractC0751g = (AbstractC0751g) ((WeakReference) it.next()).get();
                    if (abstractC0751g != null) {
                        abstractC0751g.mo2843f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0751g m2821j(Activity activity, InterfaceC0749e interfaceC0749e) {
        return new LayoutInflaterFactory2C0753i(activity, interfaceC0749e);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0751g m2822k(Dialog dialog, InterfaceC0749e interfaceC0749e) {
        return new LayoutInflaterFactory2C0753i(dialog, interfaceC0749e);
    }

    /* JADX INFO: renamed from: m */
    public static C0112i m2823m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM2825r = m2825r();
            if (objM2825r != null) {
                return C0112i.m340j(b.m2857a(objM2825r));
            }
        } else {
            C0112i c0112i = f2686c;
            if (c0112i != null) {
                return c0112i;
            }
        }
        return C0112i.m339e();
    }

    /* JADX INFO: renamed from: o */
    public static int m2824o() {
        return f2685b;
    }

    /* JADX INFO: renamed from: r */
    static Object m2825r() {
        Context contextMo2847n;
        Iterator it = f2690g.iterator();
        while (it.hasNext()) {
            AbstractC0751g abstractC0751g = (AbstractC0751g) ((WeakReference) it.next()).get();
            if (abstractC0751g != null && (contextMo2847n = abstractC0751g.mo2847n()) != null) {
                return contextMo2847n.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    static C0112i m2826t() {
        return f2686c;
    }

    /* JADX INFO: renamed from: x */
    static boolean m2827x(Context context) {
        if (f2688e == null) {
            try {
                Bundle bundle = AbstractServiceC0732A.m2653a(context).metaData;
                if (bundle != null) {
                    f2688e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2688e = Boolean.FALSE;
            }
        }
        return f2688e.booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo2828A();

    /* JADX INFO: renamed from: B */
    public abstract void mo2829B(Bundle bundle);

    /* JADX INFO: renamed from: C */
    public abstract void mo2830C();

    /* JADX INFO: renamed from: D */
    public abstract void mo2831D(Bundle bundle);

    /* JADX INFO: renamed from: E */
    public abstract void mo2832E();

    /* JADX INFO: renamed from: F */
    public abstract void mo2833F();

    /* JADX INFO: renamed from: I */
    public abstract boolean mo2834I(int i3);

    /* JADX INFO: renamed from: K */
    public abstract void mo2835K(int i3);

    /* JADX INFO: renamed from: L */
    public abstract void mo2836L(View view);

    /* JADX INFO: renamed from: M */
    public abstract void mo2837M(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: O */
    public void mo2838O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo2839P(Toolbar toolbar);

    /* JADX INFO: renamed from: Q */
    public abstract void mo2840Q(int i3);

    /* JADX INFO: renamed from: R */
    public abstract void mo2841R(CharSequence charSequence);

    /* JADX INFO: renamed from: e */
    public abstract void mo2842e(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2843f();

    /* JADX INFO: renamed from: h */
    public void m2844h(Context context) {
    }

    /* JADX INFO: renamed from: i */
    public Context mo2845i(Context context) {
        m2844h(context);
        return context;
    }

    /* JADX INFO: renamed from: l */
    public abstract View mo2846l(int i3);

    /* JADX INFO: renamed from: n */
    public abstract Context mo2847n();

    /* JADX INFO: renamed from: p */
    public abstract AbstractC0746b.b mo2848p();

    /* JADX INFO: renamed from: q */
    public abstract int mo2849q();

    /* JADX INFO: renamed from: s */
    public abstract MenuInflater mo2850s();

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0745a mo2851u();

    /* JADX INFO: renamed from: v */
    public abstract void mo2852v();

    /* JADX INFO: renamed from: w */
    public abstract void mo2853w();

    /* JADX INFO: renamed from: y */
    public abstract void mo2854y(Configuration configuration);

    /* JADX INFO: renamed from: z */
    public abstract void mo2855z(Bundle bundle);
}
