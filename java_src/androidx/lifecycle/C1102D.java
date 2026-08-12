package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1106G;
import androidx.savedstate.C1240a;
import java.lang.reflect.Constructor;
import p069X.AbstractC0589a;
import p071X1.AbstractC0606k;
import p100f0.InterfaceC1890d;

/* JADX INFO: renamed from: androidx.lifecycle.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1102D extends C1106G.d implements C1106G.b {

    /* JADX INFO: renamed from: a */
    private Application f5260a;

    /* JADX INFO: renamed from: b */
    private final C1106G.b f5261b;

    /* JADX INFO: renamed from: c */
    private Bundle f5262c;

    /* JADX INFO: renamed from: d */
    private AbstractC1126h f5263d;

    /* JADX INFO: renamed from: e */
    private C1240a f5264e;

    public C1102D(Application application, InterfaceC1890d interfaceC1890d, Bundle bundle) {
        AbstractC0606k.m2145e(interfaceC1890d, "owner");
        this.f5264e = interfaceC1890d.getSavedStateRegistry();
        this.f5263d = interfaceC1890d.getLifecycle();
        this.f5262c = bundle;
        this.f5260a = application;
        this.f5261b = application != null ? C1106G.a.f5276e.m5080a(application) : new C1106G.a();
    }

    @Override // androidx.lifecycle.C1106G.b
    /* JADX INFO: renamed from: a */
    public AbstractC1105F mo2118a(Class cls) {
        AbstractC0606k.m2145e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m5066d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1106G.b
    /* JADX INFO: renamed from: b */
    public AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC0606k.m2145e(abstractC0589a, "extras");
        String str = (String) abstractC0589a.mo2116a(C1106G.c.f5283c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (abstractC0589a.mo2116a(AbstractC1099A.f5249a) == null || abstractC0589a.mo2116a(AbstractC1099A.f5250b) == null) {
            if (this.f5263d != null) {
                return m5066d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) abstractC0589a.mo2116a(C1106G.a.f5278g);
        boolean zIsAssignableFrom = AbstractC1119a.class.isAssignableFrom(cls);
        Constructor constructorM5069c = (!zIsAssignableFrom || application == null) ? AbstractC1104E.m5069c(cls, AbstractC1104E.f5269b) : AbstractC1104E.m5069c(cls, AbstractC1104E.f5268a);
        return constructorM5069c == null ? this.f5261b.mo2119b(cls, abstractC0589a) : (!zIsAssignableFrom || application == null) ? AbstractC1104E.m5070d(cls, constructorM5069c, AbstractC1099A.m5054a(abstractC0589a)) : AbstractC1104E.m5070d(cls, constructorM5069c, application, AbstractC1099A.m5054a(abstractC0589a));
    }

    @Override // androidx.lifecycle.C1106G.d
    /* JADX INFO: renamed from: c */
    public void mo5065c(AbstractC1105F abstractC1105F) {
        AbstractC0606k.m2145e(abstractC1105F, "viewModel");
        if (this.f5263d != null) {
            C1240a c1240a = this.f5264e;
            AbstractC0606k.m2142b(c1240a);
            AbstractC1126h abstractC1126h = this.f5263d;
            AbstractC0606k.m2142b(abstractC1126h);
            LegacySavedStateHandleController.m5092a(abstractC1105F, c1240a, abstractC1126h);
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1105F m5066d(String str, Class cls) {
        AbstractC1105F abstractC1105FM5070d;
        Application application;
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC1126h abstractC1126h = this.f5263d;
        if (abstractC1126h == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1119a.class.isAssignableFrom(cls);
        Constructor constructorM5069c = (!zIsAssignableFrom || this.f5260a == null) ? AbstractC1104E.m5069c(cls, AbstractC1104E.f5269b) : AbstractC1104E.m5069c(cls, AbstractC1104E.f5268a);
        if (constructorM5069c == null) {
            return this.f5260a != null ? this.f5261b.mo2118a(cls) : C1106G.c.f5281a.m5083a().mo2118a(cls);
        }
        C1240a c1240a = this.f5264e;
        AbstractC0606k.m2142b(c1240a);
        SavedStateHandleController savedStateHandleControllerM5093b = LegacySavedStateHandleController.m5093b(c1240a, abstractC1126h, str, this.f5262c);
        if (!zIsAssignableFrom || (application = this.f5260a) == null) {
            abstractC1105FM5070d = AbstractC1104E.m5070d(cls, constructorM5069c, savedStateHandleControllerM5093b.m5117i());
        } else {
            AbstractC0606k.m2142b(application);
            abstractC1105FM5070d = AbstractC1104E.m5070d(cls, constructorM5069c, application, savedStateHandleControllerM5093b.m5117i());
        }
        abstractC1105FM5070d.m5074e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerM5093b);
        return abstractC1105FM5070d;
    }
}
