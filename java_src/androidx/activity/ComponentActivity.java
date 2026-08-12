package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.content.InterfaceC0967c;
import androidx.core.content.InterfaceC0968d;
import androidx.lifecycle.AbstractC1099A;
import androidx.lifecycle.AbstractC1111L;
import androidx.lifecycle.AbstractC1116M;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1102D;
import androidx.lifecycle.C1106G;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.FragmentC1141w;
import androidx.lifecycle.InterfaceC1110K;
import androidx.lifecycle.InterfaceC1125g;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import androidx.savedstate.C1240a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p024I.InterfaceC0204a;
import p027J.C0317w;
import p027J.InterfaceC0315v;
import p027J.InterfaceC0321y;
import p035L1.AbstractC0376h;
import p035L1.C0388t;
import p035L1.InterfaceC0375g;
import p068W1.InterfaceC0566a;
import p069X.AbstractC0589a;
import p069X.C0592d;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p078a.C0654a;
import p078a.InterfaceC0655b;
import p083b.AbstractC1294b;
import p083b.AbstractC1296d;
import p083b.InterfaceC1293a;
import p083b.InterfaceC1297e;
import p087c.AbstractC1307a;
import p100f0.AbstractC1891e;
import p100f0.C1889c;
import p100f0.InterfaceC1890d;
import p112i0.AbstractC2025a;
import p161x.AbstractActivityC2508g;
import p161x.AbstractC2503b;
import p161x.AbstractC2504c;
import p161x.C2510i;
import p161x.C2519r;
import p161x.InterfaceC2517p;
import p161x.InterfaceC2518q;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComponentActivity extends AbstractActivityC2508g implements InterfaceC1132n, InterfaceC1110K, InterfaceC1125g, InterfaceC1890d, InterfaceC0681I, InterfaceC1297e, InterfaceC0967c, InterfaceC0968d, InterfaceC2517p, InterfaceC2518q, InterfaceC0315v, InterfaceC0677E {

    /* JADX INFO: renamed from: v */
    private static final C0668b f2355v = new C0668b(null);

    /* JADX INFO: renamed from: c */
    private final C0654a f2356c = new C0654a();

    /* JADX INFO: renamed from: d */
    private final C0317w f2357d = new C0317w(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.m2515U(this.f2448d);
        }
    });

    /* JADX INFO: renamed from: e */
    private final C1889c f2358e;

    /* JADX INFO: renamed from: f */
    private C1109J f2359f;

    /* JADX INFO: renamed from: g */
    private final InterfaceExecutorC0670d f2360g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0375g f2361h;

    /* JADX INFO: renamed from: i */
    private int f2362i;

    /* JADX INFO: renamed from: j */
    private final AtomicInteger f2363j;

    /* JADX INFO: renamed from: k */
    private final AbstractC1296d f2364k;

    /* JADX INFO: renamed from: l */
    private final CopyOnWriteArrayList f2365l;

    /* JADX INFO: renamed from: m */
    private final CopyOnWriteArrayList f2366m;

    /* JADX INFO: renamed from: n */
    private final CopyOnWriteArrayList f2367n;

    /* JADX INFO: renamed from: o */
    private final CopyOnWriteArrayList f2368o;

    /* JADX INFO: renamed from: p */
    private final CopyOnWriteArrayList f2369p;

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArrayList f2370q;

    /* JADX INFO: renamed from: r */
    private boolean f2371r;

    /* JADX INFO: renamed from: s */
    private boolean f2372s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC0375g f2373t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC0375g f2374u;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    private static final class C0667a {

        /* JADX INFO: renamed from: a */
        public static final C0667a f2376a = new C0667a();

        private C0667a() {
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedDispatcher m2538a(Activity activity) {
            AbstractC0606k.m2145e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC0606k.m2144d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    private static final class C0668b {
        public /* synthetic */ C0668b(AbstractC0602g abstractC0602g) {
            this();
        }

        private C0668b() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0669c {

        /* JADX INFO: renamed from: a */
        private Object f2377a;

        /* JADX INFO: renamed from: b */
        private C1109J f2378b;

        /* JADX INFO: renamed from: a */
        public final C1109J m2539a() {
            return this.f2378b;
        }

        /* JADX INFO: renamed from: b */
        public final void m2540b(Object obj) {
            this.f2377a = obj;
        }

        /* JADX INFO: renamed from: c */
        public final void m2541c(C1109J c1109j) {
            this.f2378b = c1109j;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$d */
    private interface InterfaceExecutorC0670d extends Executor {
        /* JADX INFO: renamed from: c */
        void mo2542c();

        /* JADX INFO: renamed from: k */
        void mo2543k(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$e */
    final class ViewTreeObserverOnDrawListenerC0671e implements InterfaceExecutorC0670d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: d */
        private final long f2379d = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: e */
        private Runnable f2380e;

        /* JADX INFO: renamed from: f */
        private boolean f2381f;

        public ViewTreeObserverOnDrawListenerC0671e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m2545b(ViewTreeObserverOnDrawListenerC0671e viewTreeObserverOnDrawListenerC0671e) {
            AbstractC0606k.m2145e(viewTreeObserverOnDrawListenerC0671e, "this$0");
            Runnable runnable = viewTreeObserverOnDrawListenerC0671e.f2380e;
            if (runnable != null) {
                AbstractC0606k.m2142b(runnable);
                runnable.run();
                viewTreeObserverOnDrawListenerC0671e.f2380e = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0670d
        /* JADX INFO: renamed from: c */
        public void mo2542c() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC0606k.m2145e(runnable, "runnable");
            this.f2380e = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            AbstractC0606k.m2144d(decorView, "window.decorView");
            if (!this.f2381f) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ViewTreeObserverOnDrawListenerC0671e.m2545b(this.f2455d);
                    }
                });
            } else if (AbstractC0606k.m2141a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0670d
        /* JADX INFO: renamed from: k */
        public void mo2543k(View view) {
            AbstractC0606k.m2145e(view, "view");
            if (this.f2381f) {
                return;
            }
            this.f2381f = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f2380e;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f2379d) {
                    this.f2381f = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f2380e = null;
            if (ComponentActivity.this.m2521R().m2562c()) {
                this.f2381f = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$f */
    public static final class C0672f extends AbstractC1296d {
        C0672f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static final void m2548s(C0672f c0672f, int i3, AbstractC1307a.a aVar) {
            AbstractC0606k.m2145e(c0672f, "this$0");
            c0672f.m6600f(i3, aVar.m6638a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public static final void m2549t(C0672f c0672f, int i3, IntentSender.SendIntentException sendIntentException) {
            AbstractC0606k.m2145e(c0672f, "this$0");
            AbstractC0606k.m2145e(sendIntentException, "$e");
            c0672f.m6599e(i3, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p083b.AbstractC1296d
        /* JADX INFO: renamed from: i */
        public void mo2550i(final int i3, AbstractC1307a abstractC1307a, Object obj, AbstractC2504c abstractC2504c) {
            Bundle bundleExtra;
            final int i4;
            AbstractC0606k.m2145e(abstractC1307a, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC1307a.a aVarMo6637b = abstractC1307a.mo6637b(componentActivity, obj);
            if (aVarMo6637b != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.C0672f.m2548s(this.f2456d, i3, aVarMo6637b);
                    }
                });
                return;
            }
            Intent intentMo4873a = abstractC1307a.mo4873a(componentActivity, obj);
            if (intentMo4873a.getExtras() != null) {
                Bundle extras = intentMo4873a.getExtras();
                AbstractC0606k.m2142b(extras);
                if (extras.getClassLoader() == null) {
                    intentMo4873a.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentMo4873a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo4873a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo4873a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (AbstractC0606k.m2141a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentMo4873a.getAction())) {
                String[] stringArrayExtra = intentMo4873a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC2503b.m11892d(componentActivity, stringArrayExtra, i3);
                return;
            }
            if (!AbstractC0606k.m2141a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentMo4873a.getAction())) {
                AbstractC2503b.m11894f(componentActivity, intentMo4873a, i3, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo4873a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC0606k.m2142b(intentSenderRequest);
                i4 = i3;
                try {
                    AbstractC2503b.m11895g(componentActivity, intentSenderRequest.m2644f(), i4, intentSenderRequest.m2641a(), intentSenderRequest.m2642d(), intentSenderRequest.m2643e(), 0, bundle);
                } catch (IntentSender.SendIntentException e3) {
                    e = e3;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.C0672f.m2549t(this.f2459d, i4, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                i4 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$g */
    static final class C0673g extends AbstractC0607l implements InterfaceC0566a {
        C0673g() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1102D mo464a() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new C1102D(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$h */
    static final class C0674h extends AbstractC0607l implements InterfaceC0566a {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$h$a */
        static final class a extends AbstractC0607l implements InterfaceC0566a {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ ComponentActivity f2386e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f2386e = componentActivity;
            }

            @Override // p068W1.InterfaceC0566a
            /* JADX INFO: renamed from: a */
            public /* bridge */ /* synthetic */ Object mo464a() {
                m2553c();
                return C0388t.f1507a;
            }

            /* JADX INFO: renamed from: c */
            public final void m2553c() {
                this.f2386e.reportFullyDrawn();
            }
        }

        C0674h() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C0676D mo464a() {
            return new C0676D(ComponentActivity.this.f2360g, new a(ComponentActivity.this));
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$i */
    static final class C0675i extends AbstractC0607l implements InterfaceC0566a {
        C0675i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m2556h(ComponentActivity componentActivity) {
            AbstractC0606k.m2145e(componentActivity, "this$0");
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e3) {
                if (!AbstractC0606k.m2141a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e3;
                }
            } catch (NullPointerException e4) {
                if (!AbstractC0606k.m2141a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e4;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m2557i(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
            AbstractC0606k.m2145e(componentActivity, "this$0");
            AbstractC0606k.m2145e(onBackPressedDispatcher, "$dispatcher");
            componentActivity.m2511L(onBackPressedDispatcher);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher mo464a() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.C0675i.m2556h(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!AbstractC0606k.m2141a(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.C0675i.m2557i(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                    return onBackPressedDispatcher;
                }
                componentActivity2.m2511L(onBackPressedDispatcher);
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        C1889c c1889cM9774a = C1889c.f9393d.m9774a(this);
        this.f2358e = c1889cM9774a;
        this.f2360g = m2513P();
        this.f2361h = AbstractC0376h.m1364a(new C0674h());
        this.f2363j = new AtomicInteger();
        this.f2364k = new C0672f();
        this.f2365l = new CopyOnWriteArrayList();
        this.f2366m = new CopyOnWriteArrayList();
        this.f2367n = new CopyOnWriteArrayList();
        this.f2368o = new CopyOnWriteArrayList();
        this.f2369p = new CopyOnWriteArrayList();
        this.f2370q = new CopyOnWriteArrayList();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().mo5132a(new InterfaceC1130l() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public final void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                ComponentActivity.m2503D(this.f2449d, interfaceC1132n, aVar);
            }
        });
        getLifecycle().mo5132a(new InterfaceC1130l() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public final void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                ComponentActivity.m2504E(this.f2450d, interfaceC1132n, aVar);
            }
        });
        getLifecycle().mo5132a(new InterfaceC1130l() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                AbstractC0606k.m2145e(interfaceC1132n, "source");
                AbstractC0606k.m2145e(aVar, "event");
                ComponentActivity.this.m2514Q();
                ComponentActivity.this.getLifecycle().mo5134c(this);
            }
        });
        c1889cM9774a.m9771c();
        AbstractC1099A.m5056c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().mo5132a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().m6295h("android:support:activity-result", new C1240a.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.C1240a.c
            /* JADX INFO: renamed from: a */
            public final Bundle mo2629a() {
                return ComponentActivity.m2505F(this.f2451a);
            }
        });
        m2519N(new InterfaceC0655b() { // from class: androidx.activity.h
            @Override // p078a.InterfaceC0655b
            /* JADX INFO: renamed from: a */
            public final void mo2494a(Context context) {
                ComponentActivity.m2506G(this.f2452a, context);
            }
        });
        this.f2373t = AbstractC0376h.m1364a(new C0673g());
        this.f2374u = AbstractC0376h.m1364a(new C0675i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m2503D(ComponentActivity componentActivity, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        Window window;
        View viewPeekDecorView;
        AbstractC0606k.m2145e(componentActivity, "this$0");
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar != AbstractC1126h.a.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m2504E(ComponentActivity componentActivity, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(componentActivity, "this$0");
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == AbstractC1126h.a.ON_DESTROY) {
            componentActivity.f2356c.m2492b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().m5087a();
            }
            componentActivity.f2360g.mo2542c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Bundle m2505F(ComponentActivity componentActivity) {
        AbstractC0606k.m2145e(componentActivity, "this$0");
        Bundle bundle = new Bundle();
        componentActivity.f2364k.m6602k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m2506G(ComponentActivity componentActivity, Context context) {
        AbstractC0606k.m2145e(componentActivity, "this$0");
        AbstractC0606k.m2145e(context, "it");
        Bundle bundleM6290b = componentActivity.getSavedStateRegistry().m6290b("android:support:activity-result");
        if (bundleM6290b != null) {
            componentActivity.f2364k.m6601j(bundleM6290b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m2511L(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().mo5132a(new InterfaceC1130l() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public final void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                ComponentActivity.m2512M(onBackPressedDispatcher, this, interfaceC1132n, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m2512M(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(onBackPressedDispatcher, "$dispatcher");
        AbstractC0606k.m2145e(componentActivity, "this$0");
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == AbstractC1126h.a.ON_CREATE) {
            onBackPressedDispatcher.m2608o(C0667a.f2376a.m2538a(componentActivity));
        }
    }

    /* JADX INFO: renamed from: P */
    private final InterfaceExecutorC0670d m2513P() {
        return new ViewTreeObserverOnDrawListenerC0671e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m2514Q() {
        if (this.f2359f == null) {
            C0669c c0669c = (C0669c) getLastNonConfigurationInstance();
            if (c0669c != null) {
                this.f2359f = c0669c.m2539a();
            }
            if (this.f2359f == null) {
                this.f2359f = new C1109J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m2515U(ComponentActivity componentActivity) {
        AbstractC0606k.m2145e(componentActivity, "this$0");
        componentActivity.m2523T();
    }

    /* JADX INFO: renamed from: N */
    public final void m2519N(InterfaceC0655b interfaceC0655b) {
        AbstractC0606k.m2145e(interfaceC0655b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2356c.m2491a(interfaceC0655b);
    }

    /* JADX INFO: renamed from: O */
    public final void m2520O(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2367n.add(interfaceC0204a);
    }

    /* JADX INFO: renamed from: R */
    public C0676D m2521R() {
        return (C0676D) this.f2361h.getValue();
    }

    /* JADX INFO: renamed from: S */
    public void m2522S() {
        View decorView = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView, "window.decorView");
        AbstractC1111L.m5091a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView2, "window.decorView");
        AbstractC1116M.m5112a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView3, "window.decorView");
        AbstractC1891e.m9775a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView4, "window.decorView");
        AbstractC0690M.m2591a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView5, "window.decorView");
        AbstractC0689L.m2590a(decorView5, this);
    }

    /* JADX INFO: renamed from: T */
    public void m2523T() {
        invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: V */
    public Object m2524V() {
        return null;
    }

    /* JADX INFO: renamed from: W */
    public final AbstractC1294b m2525W(AbstractC1307a abstractC1307a, InterfaceC1293a interfaceC1293a) {
        AbstractC0606k.m2145e(abstractC1307a, "contract");
        AbstractC0606k.m2145e(interfaceC1293a, "callback");
        return m2526X(abstractC1307a, this.f2364k, interfaceC1293a);
    }

    /* JADX INFO: renamed from: X */
    public final AbstractC1294b m2526X(AbstractC1307a abstractC1307a, AbstractC1296d abstractC1296d, InterfaceC1293a interfaceC1293a) {
        AbstractC0606k.m2145e(abstractC1307a, "contract");
        AbstractC0606k.m2145e(abstractC1296d, "registry");
        AbstractC0606k.m2145e(interfaceC1293a, "callback");
        return abstractC1296d.m6603l("activity_rq#" + this.f2363j.getAndIncrement(), this, abstractC1307a, interfaceC1293a);
    }

    @Override // androidx.activity.InterfaceC0681I
    /* JADX INFO: renamed from: c */
    public final OnBackPressedDispatcher mo2527c() {
        return (OnBackPressedDispatcher) this.f2374u.getValue();
    }

    @Override // p161x.InterfaceC2517p
    /* JADX INFO: renamed from: d */
    public final void mo2528d(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2368o.remove(interfaceC0204a);
    }

    @Override // androidx.core.content.InterfaceC0968d
    /* JADX INFO: renamed from: f */
    public final void mo2529f(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2366m.remove(interfaceC0204a);
    }

    @Override // androidx.lifecycle.InterfaceC1125g
    public AbstractC0589a getDefaultViewModelCreationExtras() {
        C0592d c0592d = new C0592d(null, 1, null);
        if (getApplication() != null) {
            AbstractC0589a.b bVar = C1106G.a.f5278g;
            Application application = getApplication();
            AbstractC0606k.m2144d(application, "application");
            c0592d.m2122c(bVar, application);
        }
        c0592d.m2122c(AbstractC1099A.f5249a, this);
        c0592d.m2122c(AbstractC1099A.f5250b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c0592d.m2122c(AbstractC1099A.f5251c, extras);
        }
        return c0592d;
    }

    @Override // p161x.AbstractActivityC2508g, androidx.lifecycle.InterfaceC1132n
    public AbstractC1126h getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p100f0.InterfaceC1890d
    public final C1240a getSavedStateRegistry() {
        return this.f2358e.m9770b();
    }

    @Override // androidx.lifecycle.InterfaceC1110K
    public C1109J getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m2514Q();
        C1109J c1109j = this.f2359f;
        AbstractC0606k.m2142b(c1109j);
        return c1109j;
    }

    @Override // androidx.core.content.InterfaceC0968d
    /* JADX INFO: renamed from: i */
    public final void mo2530i(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2366m.add(interfaceC0204a);
    }

    @Override // p161x.InterfaceC2518q
    /* JADX INFO: renamed from: j */
    public final void mo2531j(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2369p.add(interfaceC0204a);
    }

    @Override // p027J.InterfaceC0315v
    /* JADX INFO: renamed from: k */
    public void mo1065k(InterfaceC0321y interfaceC0321y) {
        AbstractC0606k.m2145e(interfaceC0321y, "provider");
        this.f2357d.m1073f(interfaceC0321y);
    }

    @Override // p161x.InterfaceC2517p
    /* JADX INFO: renamed from: l */
    public final void mo2532l(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2368o.add(interfaceC0204a);
    }

    @Override // p027J.InterfaceC0315v
    /* JADX INFO: renamed from: n */
    public void mo1066n(InterfaceC0321y interfaceC0321y) {
        AbstractC0606k.m2145e(interfaceC0321y, "provider");
        this.f2357d.m1068a(interfaceC0321y);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f2364k.m6599e(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        mo2527c().m2607l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC0606k.m2145e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2365l.iterator();
        while (it.hasNext()) {
            ((InterfaceC0204a) it.next()).accept(configuration);
        }
    }

    @Override // p161x.AbstractActivityC2508g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f2358e.m9772d(bundle);
        this.f2356c.m2493c(this);
        super.onCreate(bundle);
        FragmentC1141w.f5379b.m5185c(this);
        int i3 = this.f2362i;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        AbstractC0606k.m2145e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        this.f2357d.m1069b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        AbstractC0606k.m2145e(menuItem, "item");
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            return this.f2357d.m1071d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        if (this.f2371r) {
            return;
        }
        Iterator it = this.f2368o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0204a) it.next()).accept(new C2510i(z2));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC0606k.m2145e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f2367n.iterator();
        while (it.hasNext()) {
            ((InterfaceC0204a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        AbstractC0606k.m2145e(menu, "menu");
        this.f2357d.m1070c(menu);
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        if (this.f2372s) {
            return;
        }
        Iterator it = this.f2369p.iterator();
        while (it.hasNext()) {
            ((InterfaceC0204a) it.next()).accept(new C2519r(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        AbstractC0606k.m2145e(menu, "menu");
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        this.f2357d.m1072e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        AbstractC0606k.m2145e(strArr, "permissions");
        AbstractC0606k.m2145e(iArr, "grantResults");
        if (this.f2364k.m6599e(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0669c c0669c;
        Object objM2524V = m2524V();
        C1109J c1109jM2539a = this.f2359f;
        if (c1109jM2539a == null && (c0669c = (C0669c) getLastNonConfigurationInstance()) != null) {
            c1109jM2539a = c0669c.m2539a();
        }
        if (c1109jM2539a == null && objM2524V == null) {
            return null;
        }
        C0669c c0669c2 = new C0669c();
        c0669c2.m2540b(objM2524V);
        c0669c2.m2541c(c1109jM2539a);
        return c0669c2;
    }

    @Override // p161x.AbstractActivityC2508g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0606k.m2145e(bundle, "outState");
        if (getLifecycle() instanceof C1133o) {
            AbstractC1126h lifecycle = getLifecycle();
            AbstractC0606k.m2143c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1133o) lifecycle).m5153m(AbstractC1126h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f2358e.m9773e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f2366m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0204a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2370q.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p161x.InterfaceC2518q
    /* JADX INFO: renamed from: p */
    public final void mo2533p(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2369p.remove(interfaceC0204a);
    }

    @Override // androidx.core.content.InterfaceC0967c
    /* JADX INFO: renamed from: q */
    public final void mo2534q(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2365l.remove(interfaceC0204a);
    }

    @Override // androidx.core.content.InterfaceC0967c
    /* JADX INFO: renamed from: r */
    public final void mo2535r(InterfaceC0204a interfaceC0204a) {
        AbstractC0606k.m2145e(interfaceC0204a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2365l.add(interfaceC0204a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC2025a.m10213d()) {
                AbstractC2025a.m10210a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m2521R().m2561b();
            AbstractC2025a.m10211b();
        } catch (Throwable th) {
            AbstractC2025a.m10211b();
            throw th;
        }
    }

    @Override // p083b.InterfaceC1297e
    /* JADX INFO: renamed from: s */
    public final AbstractC1296d mo2536s() {
        return this.f2364k;
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i3);

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2522S();
        InterfaceExecutorC0670d interfaceExecutorC0670d = this.f2360g;
        View decorView = getWindow().getDecorView();
        AbstractC0606k.m2144d(decorView, "window.decorView");
        interfaceExecutorC0670d.mo2543k(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i3) {
        AbstractC0606k.m2145e(intent, "intent");
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) throws IntentSender.SendIntentException {
        AbstractC0606k.m2145e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        AbstractC0606k.m2145e(intent, "intent");
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC0606k.m2145e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        AbstractC0606k.m2145e(configuration, "newConfig");
        this.f2371r = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f2371r = false;
            Iterator it = this.f2368o.iterator();
            while (it.hasNext()) {
                ((InterfaceC0204a) it.next()).accept(new C2510i(z2, configuration));
            }
        } catch (Throwable th) {
            this.f2371r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        AbstractC0606k.m2145e(configuration, "newConfig");
        this.f2372s = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f2372s = false;
            Iterator it = this.f2369p.iterator();
            while (it.hasNext()) {
                ((InterfaceC0204a) it.next()).accept(new C2519r(z2, configuration));
            }
        } catch (Throwable th) {
            this.f2372s = false;
            throw th;
        }
    }
}
