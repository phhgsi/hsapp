package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import java.util.Iterator;
import java.util.ListIterator;
import p024I.InterfaceC0204a;
import p035L1.C0388t;
import p038M1.C0412f;
import p068W1.InterfaceC0566a;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0605j;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    private final Runnable f2417a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0204a f2418b;

    /* JADX INFO: renamed from: c */
    private final C0412f f2419c;

    /* JADX INFO: renamed from: d */
    private AbstractC0678F f2420d;

    /* JADX INFO: renamed from: e */
    private OnBackInvokedCallback f2421e;

    /* JADX INFO: renamed from: f */
    private OnBackInvokedDispatcher f2422f;

    /* JADX INFO: renamed from: g */
    private boolean f2423g;

    /* JADX INFO: renamed from: h */
    private boolean f2424h;

    private final class LifecycleOnBackPressedCancellable implements InterfaceC1130l, InterfaceC0703c {

        /* JADX INFO: renamed from: d */
        private final AbstractC1126h f2425d;

        /* JADX INFO: renamed from: e */
        private final AbstractC0678F f2426e;

        /* JADX INFO: renamed from: f */
        private InterfaceC0703c f2427f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ OnBackPressedDispatcher f2428g;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC1126h abstractC1126h, AbstractC0678F abstractC0678F) {
            AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
            AbstractC0606k.m2145e(abstractC0678F, "onBackPressedCallback");
            this.f2428g = onBackPressedDispatcher;
            this.f2425d = abstractC1126h;
            this.f2426e = abstractC0678F;
            abstractC1126h.mo5132a(this);
        }

        @Override // androidx.activity.InterfaceC0703c
        public void cancel() {
            this.f2425d.mo5134c(this);
            this.f2426e.m2571i(this);
            InterfaceC0703c interfaceC0703c = this.f2427f;
            if (interfaceC0703c != null) {
                interfaceC0703c.cancel();
            }
            this.f2427f = null;
        }

        @Override // androidx.lifecycle.InterfaceC1130l
        /* JADX INFO: renamed from: d */
        public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
            AbstractC0606k.m2145e(interfaceC1132n, "source");
            AbstractC0606k.m2145e(aVar, "event");
            if (aVar == AbstractC1126h.a.ON_START) {
                this.f2427f = this.f2428g.m2606j(this.f2426e);
                return;
            }
            if (aVar != AbstractC1126h.a.ON_STOP) {
                if (aVar == AbstractC1126h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0703c interfaceC0703c = this.f2427f;
                if (interfaceC0703c != null) {
                    interfaceC0703c.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    static final class C0691a extends AbstractC0607l implements InterfaceC0577l {
        C0691a() {
            super(1);
        }

        /* JADX INFO: renamed from: c */
        public final void m2609c(C0702b c0702b) {
            AbstractC0606k.m2145e(c0702b, "backEvent");
            OnBackPressedDispatcher.this.m2601n(c0702b);
        }

        @Override // p068W1.InterfaceC0577l
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Object mo1406f(Object obj) {
            m2609c((C0702b) obj);
            return C0388t.f1507a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$b */
    static final class C0692b extends AbstractC0607l implements InterfaceC0577l {
        C0692b() {
            super(1);
        }

        /* JADX INFO: renamed from: c */
        public final void m2610c(C0702b c0702b) {
            AbstractC0606k.m2145e(c0702b, "backEvent");
            OnBackPressedDispatcher.this.m2600m(c0702b);
        }

        @Override // p068W1.InterfaceC0577l
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ Object mo1406f(Object obj) {
            m2610c((C0702b) obj);
            return C0388t.f1507a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$c */
    static final class C0693c extends AbstractC0607l implements InterfaceC0566a {
        C0693c() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo464a() {
            m2611c();
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: c */
        public final void m2611c() {
            OnBackPressedDispatcher.this.m2607l();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$d */
    static final class C0694d extends AbstractC0607l implements InterfaceC0566a {
        C0694d() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo464a() {
            m2612c();
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: c */
        public final void m2612c() {
            OnBackPressedDispatcher.this.m2599k();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$e */
    static final class C0695e extends AbstractC0607l implements InterfaceC0566a {
        C0695e() {
            super(0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo464a() {
            m2613c();
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: c */
        public final void m2613c() {
            OnBackPressedDispatcher.this.m2607l();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$f */
    public static final class C0696f {

        /* JADX INFO: renamed from: a */
        public static final C0696f f2434a = new C0696f();

        private C0696f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m2615c(InterfaceC0566a interfaceC0566a) {
            AbstractC0606k.m2145e(interfaceC0566a, "$onBackInvoked");
            interfaceC0566a.mo464a();
        }

        /* JADX INFO: renamed from: b */
        public final OnBackInvokedCallback m2616b(final InterfaceC0566a interfaceC0566a) {
            AbstractC0606k.m2145e(interfaceC0566a, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.H
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.C0696f.m2615c(interfaceC0566a);
                }
            };
        }

        /* JADX INFO: renamed from: d */
        public final void m2617d(Object obj, int i3, Object obj2) {
            AbstractC0606k.m2145e(obj, "dispatcher");
            AbstractC0606k.m2145e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: e */
        public final void m2618e(Object obj, Object obj2) {
            AbstractC0606k.m2145e(obj, "dispatcher");
            AbstractC0606k.m2145e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$g */
    public static final class C0697g {

        /* JADX INFO: renamed from: a */
        public static final C0697g f2435a = new C0697g();

        /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC0577l f2436a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC0577l f2437b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC0566a f2438c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC0566a f2439d;

            a(InterfaceC0577l interfaceC0577l, InterfaceC0577l interfaceC0577l2, InterfaceC0566a interfaceC0566a, InterfaceC0566a interfaceC0566a2) {
                this.f2436a = interfaceC0577l;
                this.f2437b = interfaceC0577l2;
                this.f2438c = interfaceC0566a;
                this.f2439d = interfaceC0566a2;
            }

            public void onBackCancelled() {
                this.f2439d.mo464a();
            }

            public void onBackInvoked() {
                this.f2438c.mo464a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC0606k.m2145e(backEvent, "backEvent");
                this.f2437b.mo1406f(new C0702b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC0606k.m2145e(backEvent, "backEvent");
                this.f2436a.mo1406f(new C0702b(backEvent));
            }
        }

        private C0697g() {
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m2619a(InterfaceC0577l interfaceC0577l, InterfaceC0577l interfaceC0577l2, InterfaceC0566a interfaceC0566a, InterfaceC0566a interfaceC0566a2) {
            AbstractC0606k.m2145e(interfaceC0577l, "onBackStarted");
            AbstractC0606k.m2145e(interfaceC0577l2, "onBackProgressed");
            AbstractC0606k.m2145e(interfaceC0566a, "onBackInvoked");
            AbstractC0606k.m2145e(interfaceC0566a2, "onBackCancelled");
            return new a(interfaceC0577l, interfaceC0577l2, interfaceC0566a, interfaceC0566a2);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$h */
    private final class C0698h implements InterfaceC0703c {

        /* JADX INFO: renamed from: d */
        private final AbstractC0678F f2440d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ OnBackPressedDispatcher f2441e;

        public C0698h(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0678F abstractC0678F) {
            AbstractC0606k.m2145e(abstractC0678F, "onBackPressedCallback");
            this.f2441e = onBackPressedDispatcher;
            this.f2440d = abstractC0678F;
        }

        @Override // androidx.activity.InterfaceC0703c
        public void cancel() {
            this.f2441e.f2419c.remove(this.f2440d);
            if (AbstractC0606k.m2141a(this.f2441e.f2420d, this.f2440d)) {
                this.f2440d.m2565c();
                this.f2441e.f2420d = null;
            }
            this.f2440d.m2571i(this);
            InterfaceC0566a interfaceC0566aM2564b = this.f2440d.m2564b();
            if (interfaceC0566aM2564b != null) {
                interfaceC0566aM2564b.mo464a();
            }
            this.f2440d.m2573k(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$i */
    /* synthetic */ class C0699i extends AbstractC0605j implements InterfaceC0566a {
        C0699i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo464a() {
            m2620k();
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: k */
        public final void m2620k() {
            ((OnBackPressedDispatcher) this.f1995e).m2603q();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$j */
    /* synthetic */ class C0700j extends AbstractC0605j implements InterfaceC0566a {
        C0700j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Object mo464a() {
            m2621k();
            return C0388t.f1507a;
        }

        /* JADX INFO: renamed from: k */
        public final void m2621k() {
            ((OnBackPressedDispatcher) this.f1995e).m2603q();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC0204a interfaceC0204a) {
        this.f2417a = runnable;
        this.f2418b = interfaceC0204a;
        this.f2419c = new C0412f();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f2421e = i3 >= 34 ? C0697g.f2435a.m2619a(new C0691a(), new C0692b(), new C0693c(), new C0694d()) : C0696f.f2434a.m2616b(new C0695e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m2599k() {
        Object objPrevious;
        AbstractC0678F abstractC0678F = this.f2420d;
        if (abstractC0678F == null) {
            C0412f c0412f = this.f2419c;
            ListIterator<E> listIterator = c0412f.listIterator(c0412f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0678F) objPrevious).m2569g()) {
                        break;
                    }
                }
            }
            abstractC0678F = (AbstractC0678F) objPrevious;
        }
        this.f2420d = null;
        if (abstractC0678F != null) {
            abstractC0678F.m2565c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m2600m(C0702b c0702b) {
        Object objPrevious;
        AbstractC0678F abstractC0678F = this.f2420d;
        if (abstractC0678F == null) {
            C0412f c0412f = this.f2419c;
            ListIterator<E> listIterator = c0412f.listIterator(c0412f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0678F) objPrevious).m2569g()) {
                        break;
                    }
                }
            }
            abstractC0678F = (AbstractC0678F) objPrevious;
        }
        if (abstractC0678F != null) {
            abstractC0678F.m2567e(c0702b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m2601n(C0702b c0702b) {
        Object objPrevious;
        C0412f c0412f = this.f2419c;
        ListIterator<E> listIterator = c0412f.listIterator(c0412f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AbstractC0678F) objPrevious).m2569g()) {
                    break;
                }
            }
        }
        AbstractC0678F abstractC0678F = (AbstractC0678F) objPrevious;
        if (this.f2420d != null) {
            m2599k();
        }
        this.f2420d = abstractC0678F;
        if (abstractC0678F != null) {
            abstractC0678F.m2568f(c0702b);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m2602p(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2422f;
        OnBackInvokedCallback onBackInvokedCallback = this.f2421e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f2423g) {
            C0696f.f2434a.m2617d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2423g = true;
        } else {
            if (z2 || !this.f2423g) {
                return;
            }
            C0696f.f2434a.m2618e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2423g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m2603q() {
        boolean z2 = this.f2424h;
        C0412f c0412f = this.f2419c;
        boolean z3 = false;
        if (!AbstractC0679G.m2574a(c0412f) || !c0412f.isEmpty()) {
            Iterator<E> it = c0412f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0678F) it.next()).m2569g()) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f2424h = z3;
        if (z3 != z2) {
            InterfaceC0204a interfaceC0204a = this.f2418b;
            if (interfaceC0204a != null) {
                interfaceC0204a.accept(Boolean.valueOf(z3));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m2602p(z3);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2604h(AbstractC0678F abstractC0678F) {
        AbstractC0606k.m2145e(abstractC0678F, "onBackPressedCallback");
        m2606j(abstractC0678F);
    }

    /* JADX INFO: renamed from: i */
    public final void m2605i(InterfaceC1132n interfaceC1132n, AbstractC0678F abstractC0678F) {
        AbstractC0606k.m2145e(interfaceC1132n, "owner");
        AbstractC0606k.m2145e(abstractC0678F, "onBackPressedCallback");
        AbstractC1126h lifecycle = interfaceC1132n.getLifecycle();
        if (lifecycle.mo5133b() == AbstractC1126h.b.DESTROYED) {
            return;
        }
        abstractC0678F.m2563a(new LifecycleOnBackPressedCancellable(this, lifecycle, abstractC0678F));
        m2603q();
        abstractC0678F.m2573k(new C0699i(this));
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0703c m2606j(AbstractC0678F abstractC0678F) {
        AbstractC0606k.m2145e(abstractC0678F, "onBackPressedCallback");
        this.f2419c.add(abstractC0678F);
        C0698h c0698h = new C0698h(this, abstractC0678F);
        abstractC0678F.m2563a(c0698h);
        m2603q();
        abstractC0678F.m2573k(new C0700j(this));
        return c0698h;
    }

    /* JADX INFO: renamed from: l */
    public final void m2607l() {
        Object objPrevious;
        AbstractC0678F abstractC0678F = this.f2420d;
        if (abstractC0678F == null) {
            C0412f c0412f = this.f2419c;
            ListIterator<E> listIterator = c0412f.listIterator(c0412f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0678F) objPrevious).m2569g()) {
                        break;
                    }
                }
            }
            abstractC0678F = (AbstractC0678F) objPrevious;
        }
        this.f2420d = null;
        if (abstractC0678F != null) {
            abstractC0678F.mo2566d();
            return;
        }
        Runnable runnable = this.f2417a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2608o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        AbstractC0606k.m2145e(onBackInvokedDispatcher, "invoker");
        this.f2422f = onBackInvokedDispatcher;
        m2602p(this.f2424h);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
