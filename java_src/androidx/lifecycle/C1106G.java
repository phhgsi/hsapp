package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import p069X.AbstractC0589a;
import p069X.C0592d;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public class C1106G {

    /* JADX INFO: renamed from: a */
    private final C1109J f5273a;

    /* JADX INFO: renamed from: b */
    private final b f5274b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0589a f5275c;

    /* JADX INFO: renamed from: androidx.lifecycle.G$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        AbstractC1105F mo2118a(Class cls);

        /* JADX INFO: renamed from: b */
        AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$c */
    public static class c implements b {

        /* JADX INFO: renamed from: b */
        private static c f5282b;

        /* JADX INFO: renamed from: a */
        public static final a f5281a = new a(null);

        /* JADX INFO: renamed from: c */
        public static final AbstractC0589a.b f5283c = a.C2614a.f5284a;

        /* JADX INFO: renamed from: androidx.lifecycle.G$c$a */
        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.G$c$a$a, reason: collision with other inner class name */
            private static final class C2614a implements AbstractC0589a.b {

                /* JADX INFO: renamed from: a */
                public static final C2614a f5284a = new C2614a();

                private C2614a() {
                }
            }

            public /* synthetic */ a(AbstractC0602g abstractC0602g) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final c m5083a() {
                if (c.f5282b == null) {
                    c.f5282b = new c();
                }
                c cVar = c.f5282b;
                AbstractC0606k.m2142b(cVar);
                return cVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: a */
        public AbstractC1105F mo2118a(Class cls) throws InvocationTargetException {
            AbstractC0606k.m2145e(cls, "modelClass");
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                AbstractC0606k.m2144d(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (AbstractC1105F) objNewInstance;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }

        @Override // androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: b */
        public /* synthetic */ AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
            return AbstractC1107H.m5085b(this, cls, abstractC0589a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$d */
    public static class d {
        /* JADX INFO: renamed from: c */
        public abstract void mo5065c(AbstractC1105F abstractC1105F);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1106G(C1109J c1109j, b bVar) {
        this(c1109j, bVar, null, 4, null);
        AbstractC0606k.m2145e(c1109j, "store");
        AbstractC0606k.m2145e(bVar, "factory");
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1105F m5075a(Class cls) {
        AbstractC0606k.m2145e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m5076b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1105F m5076b(String str, Class cls) {
        AbstractC1105F abstractC1105FMo2118a;
        AbstractC0606k.m2145e(str, "key");
        AbstractC0606k.m2145e(cls, "modelClass");
        AbstractC1105F abstractC1105FM5088b = this.f5273a.m5088b(str);
        if (!cls.isInstance(abstractC1105FM5088b)) {
            C0592d c0592d = new C0592d(this.f5275c);
            c0592d.m2122c(c.f5283c, str);
            try {
                abstractC1105FMo2118a = this.f5274b.mo2119b(cls, c0592d);
            } catch (AbstractMethodError unused) {
                abstractC1105FMo2118a = this.f5274b.mo2118a(cls);
            }
            this.f5273a.m5090d(str, abstractC1105FMo2118a);
            return abstractC1105FMo2118a;
        }
        Object obj = this.f5274b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            AbstractC0606k.m2142b(abstractC1105FM5088b);
            dVar.mo5065c(abstractC1105FM5088b);
        }
        AbstractC0606k.m2143c(abstractC1105FM5088b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return abstractC1105FM5088b;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.G$a */
    public static class a extends c {

        /* JADX INFO: renamed from: f */
        private static a f5277f;

        /* JADX INFO: renamed from: d */
        private final Application f5279d;

        /* JADX INFO: renamed from: e */
        public static final C2612a f5276e = new C2612a(null);

        /* JADX INFO: renamed from: g */
        public static final AbstractC0589a.b f5278g = C2612a.C2613a.f5280a;

        /* JADX INFO: renamed from: androidx.lifecycle.G$a$a, reason: collision with other inner class name */
        public static final class C2612a {

            /* JADX INFO: renamed from: androidx.lifecycle.G$a$a$a, reason: collision with other inner class name */
            private static final class C2613a implements AbstractC0589a.b {

                /* JADX INFO: renamed from: a */
                public static final C2613a f5280a = new C2613a();

                private C2613a() {
                }
            }

            public /* synthetic */ C2612a(AbstractC0602g abstractC0602g) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m5080a(Application application) {
                AbstractC0606k.m2145e(application, "application");
                if (a.f5277f == null) {
                    a.f5277f = new a(application);
                }
                a aVar = a.f5277f;
                AbstractC0606k.m2142b(aVar);
                return aVar;
            }

            private C2612a() {
            }
        }

        private a(Application application, int i3) {
            this.f5279d = application;
        }

        /* JADX INFO: renamed from: g */
        private final AbstractC1105F m5079g(Class cls, Application application) {
            if (!AbstractC1119a.class.isAssignableFrom(cls)) {
                return super.mo2118a(cls);
            }
            try {
                AbstractC1105F abstractC1105F = (AbstractC1105F) cls.getConstructor(Application.class).newInstance(application);
                AbstractC0606k.m2144d(abstractC1105F, "{\n                try {\n…          }\n            }");
                return abstractC1105F;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            }
        }

        @Override // androidx.lifecycle.C1106G.c, androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: a */
        public AbstractC1105F mo2118a(Class cls) {
            AbstractC0606k.m2145e(cls, "modelClass");
            Application application = this.f5279d;
            if (application != null) {
                return m5079g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C1106G.c, androidx.lifecycle.C1106G.b
        /* JADX INFO: renamed from: b */
        public AbstractC1105F mo2119b(Class cls, AbstractC0589a abstractC0589a) {
            AbstractC0606k.m2145e(cls, "modelClass");
            AbstractC0606k.m2145e(abstractC0589a, "extras");
            if (this.f5279d != null) {
                return mo2118a(cls);
            }
            Application application = (Application) abstractC0589a.mo2116a(f5278g);
            if (application != null) {
                return m5079g(cls, application);
            }
            if (AbstractC1119a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo2118a(cls);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC0606k.m2145e(application, "application");
        }
    }

    public C1106G(C1109J c1109j, b bVar, AbstractC0589a abstractC0589a) {
        AbstractC0606k.m2145e(c1109j, "store");
        AbstractC0606k.m2145e(bVar, "factory");
        AbstractC0606k.m2145e(abstractC0589a, "defaultCreationExtras");
        this.f5273a = c1109j;
        this.f5274b = bVar;
        this.f5275c = abstractC0589a;
    }

    public /* synthetic */ C1106G(C1109J c1109j, b bVar, AbstractC0589a abstractC0589a, int i3, AbstractC0602g abstractC0602g) {
        this(c1109j, bVar, (i3 & 4) != 0 ? AbstractC0589a.a.f1979b : abstractC0589a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1106G(InterfaceC1110K interfaceC1110K, b bVar) {
        this(interfaceC1110K.getViewModelStore(), bVar, AbstractC1108I.m5086a(interfaceC1110K));
        AbstractC0606k.m2145e(interfaceC1110K, "owner");
        AbstractC0606k.m2145e(bVar, "factory");
    }
}
