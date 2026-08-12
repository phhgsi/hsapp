package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0606k;
import p102f2.AbstractC1918Y;
import p102f2.AbstractC1964w;
import p136o1.InterfaceC2299a;
import p136o1.InterfaceC2300b;
import p136o1.InterfaceC2301c;
import p136o1.InterfaceC2302d;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    public static final class C1655a implements InterfaceC2327h {

        /* JADX INFO: renamed from: a */
        public static final C1655a f8355a = new C1655a();

        @Override // p139p1.InterfaceC2327h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1964w mo195a(InterfaceC2324e interfaceC2324e) {
            Object objMo11091f = interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2299a.class, Executor.class));
            AbstractC0606k.m2144d(objMo11091f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1918Y.m9847a((Executor) objMo11091f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    public static final class C1656b implements InterfaceC2327h {

        /* JADX INFO: renamed from: a */
        public static final C1656b f8356a = new C1656b();

        @Override // p139p1.InterfaceC2327h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1964w mo195a(InterfaceC2324e interfaceC2324e) {
            Object objMo11091f = interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2301c.class, Executor.class));
            AbstractC0606k.m2144d(objMo11091f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1918Y.m9847a((Executor) objMo11091f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    public static final class C1657c implements InterfaceC2327h {

        /* JADX INFO: renamed from: a */
        public static final C1657c f8357a = new C1657c();

        @Override // p139p1.InterfaceC2327h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1964w mo195a(InterfaceC2324e interfaceC2324e) {
            Object objMo11091f = interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2300b.class, Executor.class));
            AbstractC0606k.m2144d(objMo11091f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1918Y.m9847a((Executor) objMo11091f);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    public static final class C1658d implements InterfaceC2327h {

        /* JADX INFO: renamed from: a */
        public static final C1658d f8358a = new C1658d();

        @Override // p139p1.InterfaceC2327h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1964w mo195a(InterfaceC2324e interfaceC2324e) {
            Object objMo11091f = interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2302d.class, Executor.class));
            AbstractC0606k.m2144d(objMo11091f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1918Y.m9847a((Executor) objMo11091f);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2322c> getComponents() {
        C2322c c2322cM11117d = C2322c.m11097e(C2318E.m11084a(InterfaceC2299a.class, AbstractC1964w.class)).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2299a.class, Executor.class))).m11119f(C1655a.f8355a).m11117d();
        AbstractC0606k.m2144d(c2322cM11117d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C2322c c2322cM11117d2 = C2322c.m11097e(C2318E.m11084a(InterfaceC2301c.class, AbstractC1964w.class)).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2301c.class, Executor.class))).m11119f(C1656b.f8356a).m11117d();
        AbstractC0606k.m2144d(c2322cM11117d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C2322c c2322cM11117d3 = C2322c.m11097e(C2318E.m11084a(InterfaceC2300b.class, AbstractC1964w.class)).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2300b.class, Executor.class))).m11119f(C1657c.f8357a).m11117d();
        AbstractC0606k.m2144d(c2322cM11117d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C2322c c2322cM11117d4 = C2322c.m11097e(C2318E.m11084a(InterfaceC2302d.class, AbstractC1964w.class)).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2302d.class, Executor.class))).m11119f(C1658d.f8358a).m11117d();
        AbstractC0606k.m2144d(c2322cM11117d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC0419m.m1461h(c2322cM11117d, c2322cM11117d2, c2322cM11117d3, c2322cM11117d4);
    }
}
