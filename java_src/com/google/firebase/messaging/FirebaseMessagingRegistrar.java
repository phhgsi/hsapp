package com.google.firebase.messaging;

import androidx.appcompat.app.AbstractC0740E;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p005B1.InterfaceC0081e;
import p026I1.AbstractC0223h;
import p026I1.InterfaceC0224i;
import p129m1.C2267e;
import p139p1.C2318E;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p144r0.InterfaceC2372i;
import p145r1.InterfaceC2375b;
import p163x1.InterfaceC2527d;
import p166y1.InterfaceC2555j;
import p169z1.InterfaceC2603a;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FirebaseMessaging m9258a(C2318E c2318e, InterfaceC2324e interfaceC2324e) {
        C2267e c2267e = (C2267e) interfaceC2324e.mo11086a(C2267e.class);
        AbstractC0740E.m2693a(interfaceC2324e.mo11086a(InterfaceC2603a.class));
        return new FirebaseMessaging(c2267e, null, interfaceC2324e.mo11089d(InterfaceC0224i.class), interfaceC2324e.mo11089d(InterfaceC2555j.class), (InterfaceC0081e) interfaceC2324e.mo11086a(InterfaceC0081e.class), interfaceC2324e.mo11090e(c2318e), (InterfaceC2527d) interfaceC2324e.mo11086a(InterfaceC2527d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2322c> getComponents() {
        final C2318E c2318eM11084a = C2318E.m11084a(InterfaceC2375b.class, InterfaceC2372i.class);
        return Arrays.asList(C2322c.m11095c(FirebaseMessaging.class).m11120h(LIBRARY_NAME).m11115b(C2337r.m11166j(C2267e.class)).m11115b(C2337r.m11163g(InterfaceC2603a.class)).m11115b(C2337r.m11164h(InterfaceC0224i.class)).m11115b(C2337r.m11164h(InterfaceC2555j.class)).m11115b(C2337r.m11166j(InterfaceC0081e.class)).m11115b(C2337r.m11165i(c2318eM11084a)).m11115b(C2337r.m11166j(InterfaceC2527d.class)).m11119f(new InterfaceC2327h() { // from class: com.google.firebase.messaging.B
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return FirebaseMessagingRegistrar.m9258a(c2318eM11084a, interfaceC2324e);
            }
        }).m11116c().m11117d(), AbstractC0223h.m625b(LIBRARY_NAME, "24.1.0"));
    }
}
