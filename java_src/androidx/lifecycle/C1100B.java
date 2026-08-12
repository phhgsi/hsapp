package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C1240a;
import java.util.Map;
import p035L1.AbstractC0376h;
import p035L1.InterfaceC0375g;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0607l;

/* JADX INFO: renamed from: androidx.lifecycle.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1100B implements C1240a.c {

    /* JADX INFO: renamed from: a */
    private final C1240a f5253a;

    /* JADX INFO: renamed from: b */
    private boolean f5254b;

    /* JADX INFO: renamed from: c */
    private Bundle f5255c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0375g f5256d;

    /* JADX INFO: renamed from: androidx.lifecycle.B$a */
    static final class a extends AbstractC0607l implements InterfaceC0566a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC1110K f5257e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1110K interfaceC1110K) {
            super(0);
            this.f5257e = interfaceC1110K;
        }

        @Override // p068W1.InterfaceC0566a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1101C mo464a() {
            return AbstractC1099A.m5058e(this.f5257e);
        }
    }

    public C1100B(C1240a c1240a, InterfaceC1110K interfaceC1110K) {
        AbstractC0606k.m2145e(c1240a, "savedStateRegistry");
        AbstractC0606k.m2145e(interfaceC1110K, "viewModelStoreOwner");
        this.f5253a = c1240a;
        this.f5256d = AbstractC0376h.m1364a(new a(interfaceC1110K));
    }

    /* JADX INFO: renamed from: c */
    private final C1101C m5060c() {
        return (C1101C) this.f5256d.getValue();
    }

    @Override // androidx.savedstate.C1240a.c
    /* JADX INFO: renamed from: a */
    public Bundle mo2629a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5255c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m5060c().m5064f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo2629a = ((C1144z) entry.getValue()).m5191c().mo2629a();
            if (!AbstractC0606k.m2141a(bundleMo2629a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo2629a);
            }
        }
        this.f5254b = false;
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m5061b(String str) {
        AbstractC0606k.m2145e(str, "key");
        m5062d();
        Bundle bundle = this.f5255c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f5255c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f5255c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f5255c = null;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public final void m5062d() {
        if (this.f5254b) {
            return;
        }
        Bundle bundleM6290b = this.f5253a.m6290b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5255c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM6290b != null) {
            bundle.putAll(bundleM6290b);
        }
        this.f5255c = bundle;
        this.f5254b = true;
        m5060c();
    }
}
