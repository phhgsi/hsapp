package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.C1240a;
import java.util.Iterator;
import p071X1.AbstractC0606k;
import p100f0.InterfaceC1890d;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a */
    public static final LegacySavedStateHandleController f5286a = new LegacySavedStateHandleController();

    /* JADX INFO: renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C1112a implements C1240a.a {
        @Override // androidx.savedstate.C1240a.a
        /* JADX INFO: renamed from: a */
        public void mo5095a(InterfaceC1890d interfaceC1890d) {
            AbstractC0606k.m2145e(interfaceC1890d, "owner");
            if (!(interfaceC1890d instanceof InterfaceC1110K)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C1109J viewModelStore = ((InterfaceC1110K) interfaceC1890d).getViewModelStore();
            C1240a savedStateRegistry = interfaceC1890d.getSavedStateRegistry();
            Iterator it = viewModelStore.m5089c().iterator();
            while (it.hasNext()) {
                AbstractC1105F abstractC1105FM5088b = viewModelStore.m5088b((String) it.next());
                AbstractC0606k.m2142b(abstractC1105FM5088b);
                LegacySavedStateHandleController.m5092a(abstractC1105FM5088b, savedStateRegistry, interfaceC1890d.getLifecycle());
            }
            if (viewModelStore.m5089c().isEmpty()) {
                return;
            }
            savedStateRegistry.m6296i(C1112a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m5092a(AbstractC1105F abstractC1105F, C1240a c1240a, AbstractC1126h abstractC1126h) {
        AbstractC0606k.m2145e(abstractC1105F, "viewModel");
        AbstractC0606k.m2145e(c1240a, "registry");
        AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC1105F.m5073c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m5118j()) {
            return;
        }
        savedStateHandleController.m5116f(c1240a, abstractC1126h);
        f5286a.m5094c(c1240a, abstractC1126h);
    }

    /* JADX INFO: renamed from: b */
    public static final SavedStateHandleController m5093b(C1240a c1240a, AbstractC1126h abstractC1126h, String str, Bundle bundle) {
        AbstractC0606k.m2145e(c1240a, "registry");
        AbstractC0606k.m2145e(abstractC1126h, "lifecycle");
        AbstractC0606k.m2142b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1144z.f5382f.m5193a(c1240a.m6290b(str), bundle));
        savedStateHandleController.m5116f(c1240a, abstractC1126h);
        f5286a.m5094c(c1240a, abstractC1126h);
        return savedStateHandleController;
    }

    /* JADX INFO: renamed from: c */
    private final void m5094c(final C1240a c1240a, final AbstractC1126h abstractC1126h) {
        AbstractC1126h.b bVarMo5133b = abstractC1126h.mo5133b();
        if (bVarMo5133b == AbstractC1126h.b.INITIALIZED || bVarMo5133b.m5141b(AbstractC1126h.b.STARTED)) {
            c1240a.m6296i(C1112a.class);
        } else {
            abstractC1126h.mo5132a(new InterfaceC1130l() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC1130l
                /* JADX INFO: renamed from: d */
                public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
                    AbstractC0606k.m2145e(interfaceC1132n, "source");
                    AbstractC0606k.m2145e(aVar, "event");
                    if (aVar == AbstractC1126h.a.ON_START) {
                        abstractC1126h.mo5134c(this);
                        c1240a.m6296i(LegacySavedStateHandleController.C1112a.class);
                    }
                }
            });
        }
    }
}
