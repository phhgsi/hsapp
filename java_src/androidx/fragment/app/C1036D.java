package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1099A;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1106G;
import androidx.lifecycle.C1109J;
import androidx.lifecycle.C1133o;
import androidx.lifecycle.InterfaceC1110K;
import androidx.lifecycle.InterfaceC1125g;
import androidx.savedstate.C1240a;
import p069X.AbstractC0589a;
import p069X.C0592d;
import p100f0.C1889c;
import p100f0.InterfaceC1890d;

/* JADX INFO: renamed from: androidx.fragment.app.D */
/* JADX INFO: loaded from: classes.dex */
class C1036D implements InterfaceC1125g, InterfaceC1890d, InterfaceC1110K {

    /* JADX INFO: renamed from: a */
    private final Fragment f4947a;

    /* JADX INFO: renamed from: b */
    private final C1109J f4948b;

    /* JADX INFO: renamed from: c */
    private C1133o f4949c = null;

    /* JADX INFO: renamed from: d */
    private C1889c f4950d = null;

    C1036D(Fragment fragment, C1109J c1109j) {
        this.f4947a = fragment;
        this.f4948b = c1109j;
    }

    /* JADX INFO: renamed from: a */
    void m4683a(AbstractC1126h.a aVar) {
        this.f4949c.m5152h(aVar);
    }

    /* JADX INFO: renamed from: b */
    void m4684b() {
        if (this.f4949c == null) {
            this.f4949c = new C1133o(this);
            C1889c c1889cM9769a = C1889c.m9769a(this);
            this.f4950d = c1889cM9769a;
            c1889cM9769a.m9771c();
            AbstractC1099A.m5056c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    boolean m4685d() {
        return this.f4949c != null;
    }

    /* JADX INFO: renamed from: e */
    void m4686e(Bundle bundle) {
        this.f4950d.m9772d(bundle);
    }

    /* JADX INFO: renamed from: f */
    void m4687f(Bundle bundle) {
        this.f4950d.m9773e(bundle);
    }

    /* JADX INFO: renamed from: g */
    void m4688g(AbstractC1126h.b bVar) {
        this.f4949c.m5153m(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1125g
    public AbstractC0589a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4947a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0592d c0592d = new C0592d();
        if (application != null) {
            c0592d.m2122c(C1106G.a.f5278g, application);
        }
        c0592d.m2122c(AbstractC1099A.f5249a, this);
        c0592d.m2122c(AbstractC1099A.f5250b, this);
        if (this.f4947a.getArguments() != null) {
            c0592d.m2122c(AbstractC1099A.f5251c, this.f4947a.getArguments());
        }
        return c0592d;
    }

    @Override // androidx.lifecycle.InterfaceC1132n
    public AbstractC1126h getLifecycle() {
        m4684b();
        return this.f4949c;
    }

    @Override // p100f0.InterfaceC1890d
    public C1240a getSavedStateRegistry() {
        m4684b();
        return this.f4950d.m9770b();
    }

    @Override // androidx.lifecycle.InterfaceC1110K
    public C1109J getViewModelStore() {
        m4684b();
        return this.f4948b;
    }
}
