package p100f0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import androidx.savedstate.C1240a;
import androidx.savedstate.Recreator;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1889c {

    /* JADX INFO: renamed from: d */
    public static final a f9393d = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC1890d f9394a;

    /* JADX INFO: renamed from: b */
    private final C1240a f9395b;

    /* JADX INFO: renamed from: c */
    private boolean f9396c;

    /* JADX INFO: renamed from: f0.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1889c m9774a(InterfaceC1890d interfaceC1890d) {
            AbstractC0606k.m2145e(interfaceC1890d, "owner");
            return new C1889c(interfaceC1890d, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C1889c(InterfaceC1890d interfaceC1890d, AbstractC0602g abstractC0602g) {
        this(interfaceC1890d);
    }

    /* JADX INFO: renamed from: a */
    public static final C1889c m9769a(InterfaceC1890d interfaceC1890d) {
        return f9393d.m9774a(interfaceC1890d);
    }

    /* JADX INFO: renamed from: b */
    public final C1240a m9770b() {
        return this.f9395b;
    }

    /* JADX INFO: renamed from: c */
    public final void m9771c() {
        AbstractC1126h lifecycle = this.f9394a.getLifecycle();
        if (lifecycle.mo5133b() != AbstractC1126h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo5132a(new Recreator(this.f9394a));
        this.f9395b.m6292e(lifecycle);
        this.f9396c = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m9772d(Bundle bundle) {
        if (!this.f9396c) {
            m9771c();
        }
        AbstractC1126h lifecycle = this.f9394a.getLifecycle();
        if (!lifecycle.mo5133b().m5141b(AbstractC1126h.b.STARTED)) {
            this.f9395b.m6293f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo5133b()).toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m9773e(Bundle bundle) {
        AbstractC0606k.m2145e(bundle, "outBundle");
        this.f9395b.m6294g(bundle);
    }

    private C1889c(InterfaceC1890d interfaceC1890d) {
        this.f9394a = interfaceC1890d;
        this.f9395b = new C1240a();
    }
}
