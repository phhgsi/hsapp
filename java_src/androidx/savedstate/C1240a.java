package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import androidx.savedstate.C1240a;
import androidx.savedstate.Recreator;
import java.util.Map;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p100f0.InterfaceC1890d;
import p119k.C2109b;

/* JADX INFO: renamed from: androidx.savedstate.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1240a {

    /* JADX INFO: renamed from: g */
    private static final b f6043g = new b(null);

    /* JADX INFO: renamed from: b */
    private boolean f6045b;

    /* JADX INFO: renamed from: c */
    private Bundle f6046c;

    /* JADX INFO: renamed from: d */
    private boolean f6047d;

    /* JADX INFO: renamed from: e */
    private Recreator.C1239b f6048e;

    /* JADX INFO: renamed from: a */
    private final C2109b f6044a = new C2109b();

    /* JADX INFO: renamed from: f */
    private boolean f6049f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5095a(InterfaceC1890d interfaceC1890d);
    }

    /* JADX INFO: renamed from: androidx.savedstate.a$b */
    private static final class b {
        public /* synthetic */ b(AbstractC0602g abstractC0602g) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Bundle mo2629a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m6289d(C1240a c1240a, InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(c1240a, "this$0");
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == AbstractC1126h.a.ON_START) {
            c1240a.f6049f = true;
        } else if (aVar == AbstractC1126h.a.ON_STOP) {
            c1240a.f6049f = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m6290b(String str) {
        AbstractC0606k.m2145e(str, "key");
        if (!this.f6047d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f6046c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f6046c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f6046c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f6046c = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    public final c m6291c(String str) {
        AbstractC0606k.m2145e(str, "key");
        for (Map.Entry entry : this.f6044a) {
            AbstractC0606k.m2144d(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (AbstractC0606k.m2141a(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m6292e(AbstractC1126h abstractC1126h) {
        AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
        if (this.f6045b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC1126h.mo5132a(new InterfaceC1130l() { // from class: f0.b
            @Override // androidx.lifecycle.InterfaceC1130l
            /* JADX INFO: renamed from: d */
            public final void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                C1240a.m6289d(this.f9392d, interfaceC1132n, aVar);
            }
        });
        this.f6045b = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m6293f(Bundle bundle) {
        if (!this.f6045b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f6047d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f6046c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f6047d = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m6294g(Bundle bundle) {
        AbstractC0606k.m2145e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f6046c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2109b.d dVarM10556d = this.f6044a.m10556d();
        AbstractC0606k.m2144d(dVarM10556d, "this.components.iteratorWithAdditions()");
        while (dVarM10556d.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarM10556d.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).mo2629a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* JADX INFO: renamed from: h */
    public final void m6295h(String str, c cVar) {
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(cVar, "provider");
        if (((c) this.f6044a.mo10552g(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6296i(Class cls) {
        AbstractC0606k.m2145e(cls, "clazz");
        if (!this.f6049f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.C1239b c1239b = this.f6048e;
        if (c1239b == null) {
            c1239b = new Recreator.C1239b(this);
        }
        this.f6048e = c1239b;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.C1239b c1239b2 = this.f6048e;
            if (c1239b2 != null) {
                String name = cls.getName();
                AbstractC0606k.m2144d(name, "clazz.name");
                c1239b2.m6287b(name);
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
