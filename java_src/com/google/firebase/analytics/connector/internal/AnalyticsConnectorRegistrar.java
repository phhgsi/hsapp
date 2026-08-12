package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p026I1.AbstractC0223h;
import p129m1.C2267e;
import p133n1.C2281b;
import p133n1.InterfaceC2280a;
import p139p1.C2322c;
import p139p1.C2337r;
import p139p1.InterfaceC2324e;
import p139p1.InterfaceC2327h;
import p163x1.InterfaceC2527d;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2322c> getComponents() {
        return Arrays.asList(C2322c.m11095c(InterfaceC2280a.class).m11115b(C2337r.m11166j(C2267e.class)).m11115b(C2337r.m11166j(Context.class)).m11115b(C2337r.m11166j(InterfaceC2527d.class)).m11119f(new InterfaceC2327h() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // p139p1.InterfaceC2327h
            /* JADX INFO: renamed from: a */
            public final Object mo195a(InterfaceC2324e interfaceC2324e) {
                return C2281b.m10888c((C2267e) interfaceC2324e.mo11086a(C2267e.class), (Context) interfaceC2324e.mo11086a(Context.class), (InterfaceC2527d) interfaceC2324e.mo11086a(InterfaceC2527d.class));
            }
        }).m11118e().m11117d(), AbstractC0223h.m625b("fire-analytics", "22.1.2"));
    }
}
