package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.C1106G;
import androidx.savedstate.C1240a;
import p068W1.InterfaceC0577l;
import p069X.AbstractC0589a;
import p069X.C0591c;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;
import p071X1.AbstractC0614s;
import p100f0.InterfaceC1890d;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1099A {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0589a.b f5249a = new b();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0589a.b f5250b = new c();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0589a.b f5251c = new a();

    /* JADX INFO: renamed from: androidx.lifecycle.A$a */
    public static final class a implements AbstractC0589a.b {
        a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.A$b */
    public static final class b implements AbstractC0589a.b {
        b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.A$c */
    public static final class c implements AbstractC0589a.b {
        c() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.A$d */
    static final class d extends AbstractC0607l implements InterfaceC0577l {

        /* JADX INFO: renamed from: e */
        public static final d f5252e = new d();

        d() {
            super(1);
        }

        @Override // p068W1.InterfaceC0577l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1101C mo1406f(AbstractC0589a abstractC0589a) {
            AbstractC0606k.m2145e(abstractC0589a, "$this$initializer");
            return new C1101C();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C1144z m5054a(AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(abstractC0589a, "<this>");
        InterfaceC1890d interfaceC1890d = (InterfaceC1890d) abstractC0589a.mo2116a(f5249a);
        if (interfaceC1890d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1110K interfaceC1110K = (InterfaceC1110K) abstractC0589a.mo2116a(f5250b);
        if (interfaceC1110K == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC0589a.mo2116a(f5251c);
        String str = (String) abstractC0589a.mo2116a(C1106G.c.f5283c);
        if (str != null) {
            return m5055b(interfaceC1890d, interfaceC1110K, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX INFO: renamed from: b */
    private static final C1144z m5055b(InterfaceC1890d interfaceC1890d, InterfaceC1110K interfaceC1110K, String str, Bundle bundle) {
        C1100B c1100bM5057d = m5057d(interfaceC1890d);
        C1101C c1101cM5058e = m5058e(interfaceC1110K);
        C1144z c1144z = (C1144z) c1101cM5058e.m5064f().get(str);
        if (c1144z != null) {
            return c1144z;
        }
        C1144z c1144zM5193a = C1144z.f5382f.m5193a(c1100bM5057d.m5061b(str), bundle);
        c1101cM5058e.m5064f().put(str, c1144zM5193a);
        return c1144zM5193a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5056c(InterfaceC1890d interfaceC1890d) {
        AbstractC0606k.m2145e(interfaceC1890d, "<this>");
        AbstractC1126h.b bVarMo5133b = interfaceC1890d.getLifecycle().mo5133b();
        if (bVarMo5133b != AbstractC1126h.b.INITIALIZED && bVarMo5133b != AbstractC1126h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC1890d.getSavedStateRegistry().m6291c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1100B c1100b = new C1100B(interfaceC1890d.getSavedStateRegistry(), (InterfaceC1110K) interfaceC1890d);
            interfaceC1890d.getSavedStateRegistry().m6295h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1100b);
            interfaceC1890d.getLifecycle().mo5132a(new SavedStateHandleAttacher(c1100b));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C1100B m5057d(InterfaceC1890d interfaceC1890d) {
        AbstractC0606k.m2145e(interfaceC1890d, "<this>");
        C1240a.c cVarM6291c = interfaceC1890d.getSavedStateRegistry().m6291c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C1100B c1100b = cVarM6291c instanceof C1100B ? (C1100B) cVarM6291c : null;
        if (c1100b != null) {
            return c1100b;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* JADX INFO: renamed from: e */
    public static final C1101C m5058e(InterfaceC1110K interfaceC1110K) {
        AbstractC0606k.m2145e(interfaceC1110K, "<this>");
        C0591c c0591c = new C0591c();
        c0591c.m2120a(AbstractC0614s.m2156b(C1101C.class), d.f5252e);
        return (C1101C) new C1106G(interfaceC1110K, c0591c.m2121b()).m5076b("androidx.lifecycle.internal.SavedStateHandlesVM", C1101C.class);
    }
}
