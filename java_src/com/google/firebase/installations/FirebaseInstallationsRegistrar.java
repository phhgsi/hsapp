package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p005B1.InterfaceC0081e;
import p026I1.AbstractC0223h;
import p129m1.C2267e;
import p136o1.InterfaceC2299a;
import p136o1.InterfaceC2300b;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p142q1.AbstractC2360j;
import p166y1.AbstractC2553h;
import p166y1.InterfaceC2554i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0081e m9151a(InterfaceC2324e interfaceC2324e) {
        return new C1680c((C2267e) interfaceC2324e.mo11086a(C2267e.class), interfaceC2324e.mo11089d(InterfaceC2554i.class), (ExecutorService) interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2299a.class, ExecutorService.class)), AbstractC2360j.m11199a((Executor) interfaceC2324e.mo11091f(C2318E.m11084a(InterfaceC2300b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2322c> getComponents() {
        return Arrays.asList(C2322c.m11095c(InterfaceC0081e.class).m11120h(LIBRARY_NAME).m11115b(C2337r.m11166j(C2267e.class)).m11115b(C2337r.m11164h(InterfaceC2554i.class)).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2299a.class, ExecutorService.class))).m11115b(C2337r.m11167k(C2318E.m11084a(InterfaceC2300b.class, Executor.class))).m11119f(new InterfaceC2327h() { // from class: B1.f
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return FirebaseInstallationsRegistrar.m9151a(interfaceC2324e);
            }
        }).m11117d(), AbstractC2553h.m12204a(), AbstractC0223h.m625b(LIBRARY_NAME, "18.0.0"));
    }
}
