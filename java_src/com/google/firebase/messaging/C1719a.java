package com.google.firebase.messaging;

import androidx.appcompat.app.AbstractC0740E;
import p020G1.C0181a;
import p020G1.C0182b;
import p151t1.C2449c;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p154u1.InterfaceC2469a;
import p154u1.InterfaceC2470b;
import p160w1.C2493a;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1719a implements InterfaceC2469a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2469a f8561a = new C1719a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a */
    private static final class a implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final a f8562a = new a();

        /* JADX INFO: renamed from: b */
        private static final C2449c f8563b = C2449c.m11742a("projectNumber").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f8564c = C2449c.m11742a("messageId").m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

        /* JADX INFO: renamed from: d */
        private static final C2449c f8565d = C2449c.m11742a("instanceId").m11747b(C2493a.m11858b().m11860c(3).m11859a()).m11746a();

        /* JADX INFO: renamed from: e */
        private static final C2449c f8566e = C2449c.m11742a("messageType").m11747b(C2493a.m11858b().m11860c(4).m11859a()).m11746a();

        /* JADX INFO: renamed from: f */
        private static final C2449c f8567f = C2449c.m11742a("sdkPlatform").m11747b(C2493a.m11858b().m11860c(5).m11859a()).m11746a();

        /* JADX INFO: renamed from: g */
        private static final C2449c f8568g = C2449c.m11742a("packageName").m11747b(C2493a.m11858b().m11860c(6).m11859a()).m11746a();

        /* JADX INFO: renamed from: h */
        private static final C2449c f8569h = C2449c.m11742a("collapseKey").m11747b(C2493a.m11858b().m11860c(7).m11859a()).m11746a();

        /* JADX INFO: renamed from: i */
        private static final C2449c f8570i = C2449c.m11742a("priority").m11747b(C2493a.m11858b().m11860c(8).m11859a()).m11746a();

        /* JADX INFO: renamed from: j */
        private static final C2449c f8571j = C2449c.m11742a("ttl").m11747b(C2493a.m11858b().m11860c(9).m11859a()).m11746a();

        /* JADX INFO: renamed from: k */
        private static final C2449c f8572k = C2449c.m11742a("topic").m11747b(C2493a.m11858b().m11860c(10).m11859a()).m11746a();

        /* JADX INFO: renamed from: l */
        private static final C2449c f8573l = C2449c.m11742a("bulkId").m11747b(C2493a.m11858b().m11860c(11).m11859a()).m11746a();

        /* JADX INFO: renamed from: m */
        private static final C2449c f8574m = C2449c.m11742a("event").m11747b(C2493a.m11858b().m11860c(12).m11859a()).m11746a();

        /* JADX INFO: renamed from: n */
        private static final C2449c f8575n = C2449c.m11742a("analyticsLabel").m11747b(C2493a.m11858b().m11860c(13).m11859a()).m11746a();

        /* JADX INFO: renamed from: o */
        private static final C2449c f8576o = C2449c.m11742a("campaignId").m11747b(C2493a.m11858b().m11860c(14).m11859a()).m11746a();

        /* JADX INFO: renamed from: p */
        private static final C2449c f8577p = C2449c.m11742a("composerLabel").m11747b(C2493a.m11858b().m11860c(15).m11859a()).m11746a();

        private a() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C0181a c0181a, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11750e(f8563b, c0181a.m512l());
            interfaceC2451e.mo11748a(f8564c, c0181a.m508h());
            interfaceC2451e.mo11748a(f8565d, c0181a.m507g());
            interfaceC2451e.mo11748a(f8566e, c0181a.m509i());
            interfaceC2451e.mo11748a(f8567f, c0181a.m513m());
            interfaceC2451e.mo11748a(f8568g, c0181a.m510j());
            interfaceC2451e.mo11748a(f8569h, c0181a.m504d());
            interfaceC2451e.mo11749d(f8570i, c0181a.m511k());
            interfaceC2451e.mo11749d(f8571j, c0181a.m515o());
            interfaceC2451e.mo11748a(f8572k, c0181a.m514n());
            interfaceC2451e.mo11750e(f8573l, c0181a.m502b());
            interfaceC2451e.mo11748a(f8574m, c0181a.m506f());
            interfaceC2451e.mo11748a(f8575n, c0181a.m501a());
            interfaceC2451e.mo11750e(f8576o, c0181a.m503c());
            interfaceC2451e.mo11748a(f8577p, c0181a.m505e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final b f8578a = new b();

        /* JADX INFO: renamed from: b */
        private static final C2449c f8579b = C2449c.m11742a("messagingClientEvent").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        private b() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C0182b c0182b, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11748a(f8579b, c0182b.m535a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final c f8580a = new c();

        /* JADX INFO: renamed from: b */
        private static final C2449c f8581b = C2449c.m11743d("messagingClientEventExtension");

        private c() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo9388a(Object obj, Object obj2) {
            AbstractC0740E.m2693a(obj);
            m9391b(null, (InterfaceC2451e) obj2);
        }

        /* JADX INFO: renamed from: b */
        public void m9391b(AbstractC1702K abstractC1702K, InterfaceC2451e interfaceC2451e) {
            throw null;
        }
    }

    private C1719a() {
    }

    @Override // p154u1.InterfaceC2469a
    /* JADX INFO: renamed from: a */
    public void mo9387a(InterfaceC2470b interfaceC2470b) {
        interfaceC2470b.mo11784a(AbstractC1702K.class, c.f8580a);
        interfaceC2470b.mo11784a(C0182b.class, b.f8578a);
        interfaceC2470b.mo11784a(C0181a.class, a.f8562a);
    }
}
