package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;
import androidx.savedstate.C1240a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p100f0.InterfaceC1890d;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC1130l {

    /* JADX INFO: renamed from: e */
    public static final C1238a f6040e = new C1238a(null);

    /* JADX INFO: renamed from: d */
    private final InterfaceC1890d f6041d;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$a */
    public static final class C1238a {
        public /* synthetic */ C1238a(AbstractC0602g abstractC0602g) {
            this();
        }

        private C1238a() {
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$b */
    public static final class C1239b implements C1240a.c {

        /* JADX INFO: renamed from: a */
        private final Set f6042a;

        public C1239b(C1240a c1240a) {
            AbstractC0606k.m2145e(c1240a, "registry");
            this.f6042a = new LinkedHashSet();
            c1240a.m6295h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C1240a.c
        /* JADX INFO: renamed from: a */
        public Bundle mo2629a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f6042a));
            return bundle;
        }

        /* JADX INFO: renamed from: b */
        public final void m6287b(String str) {
            AbstractC0606k.m2145e(str, "className");
            this.f6042a.add(str);
        }
    }

    public Recreator(InterfaceC1890d interfaceC1890d) {
        AbstractC0606k.m2145e(interfaceC1890d, "owner");
        this.f6041d = interfaceC1890d;
    }

    /* JADX INFO: renamed from: f */
    private final void m6286f(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1240a.a.class);
            AbstractC0606k.m2144d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC0606k.m2144d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((C1240a.a) objNewInstance).mo5095a(this.f6041d);
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to instantiate " + str, e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Class " + str + " wasn't found", e5);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "source");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar != AbstractC1126h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1132n.getLifecycle().mo5134c(this);
        Bundle bundleM6290b = this.f6041d.getSavedStateRegistry().m6290b("androidx.savedstate.Restarter");
        if (bundleM6290b == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM6290b.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = stringArrayList.get(i3);
            i3++;
            m6286f(str);
        }
    }
}
