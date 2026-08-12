package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.cct.C1379a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p026I1.AbstractC0223h;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p144r0.InterfaceC2372i;
import p145r1.InterfaceC2374a;
import p145r1.InterfaceC2375b;
import p150t0.C2444t;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2372i m9147a(InterfaceC2324e interfaceC2324e) {
        C2444t.m11735f((Context) interfaceC2324e.mo11086a(Context.class));
        return C2444t.m11733c().m11737g(C1379a.f6866g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2372i m9148b(InterfaceC2324e interfaceC2324e) {
        C2444t.m11735f((Context) interfaceC2324e.mo11086a(Context.class));
        return C2444t.m11733c().m11737g(C1379a.f6867h);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC2372i m9149c(InterfaceC2324e interfaceC2324e) {
        C2444t.m11735f((Context) interfaceC2324e.mo11086a(Context.class));
        return C2444t.m11733c().m11737g(C1379a.f6867h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2322c> getComponents() {
        return Arrays.asList(C2322c.m11095c(InterfaceC2372i.class).m11120h(LIBRARY_NAME).m11115b(C2337r.m11166j(Context.class)).m11119f(new InterfaceC2327h() { // from class: r1.c
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return TransportRegistrar.m9149c(interfaceC2324e);
            }
        }).m11117d(), C2322c.m11097e(C2318E.m11084a(InterfaceC2374a.class, InterfaceC2372i.class)).m11115b(C2337r.m11166j(Context.class)).m11119f(new InterfaceC2327h() { // from class: r1.d
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return TransportRegistrar.m9148b(interfaceC2324e);
            }
        }).m11117d(), C2322c.m11097e(C2318E.m11084a(InterfaceC2375b.class, InterfaceC2372i.class)).m11115b(C2337r.m11166j(Context.class)).m11119f(new InterfaceC2327h() { // from class: r1.e
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return TransportRegistrar.m9147a(interfaceC2324e);
            }
        }).m11117d(), AbstractC0223h.m625b(LIBRARY_NAME, "18.2.0"));
    }
}
