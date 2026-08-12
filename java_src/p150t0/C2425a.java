package p150t0;

import androidx.appcompat.app.AbstractC0740E;
import p151t1.C2449c;
import p151t1.InterfaceC2450d;
import p151t1.InterfaceC2451e;
import p154u1.InterfaceC2469a;
import p154u1.InterfaceC2470b;
import p159w0.C2487a;
import p159w0.C2488b;
import p159w0.C2489c;
import p159w0.C2490d;
import p159w0.C2491e;
import p159w0.C2492f;
import p160w1.C2493a;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2425a implements InterfaceC2469a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2469a f11344a = new C2425a();

    /* JADX INFO: renamed from: t0.a$a */
    private static final class a implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final a f11345a = new a();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11346b = C2449c.m11742a("window").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f11347c = C2449c.m11742a("logSourceMetrics").m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

        /* JADX INFO: renamed from: d */
        private static final C2449c f11348d = C2449c.m11742a("globalMetrics").m11747b(C2493a.m11858b().m11860c(3).m11859a()).m11746a();

        /* JADX INFO: renamed from: e */
        private static final C2449c f11349e = C2449c.m11742a("appNamespace").m11747b(C2493a.m11858b().m11860c(4).m11859a()).m11746a();

        private a() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2487a c2487a, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11748a(f11346b, c2487a.m11823d());
            interfaceC2451e.mo11748a(f11347c, c2487a.m11822c());
            interfaceC2451e.mo11748a(f11348d, c2487a.m11821b());
            interfaceC2451e.mo11748a(f11349e, c2487a.m11820a());
        }
    }

    /* JADX INFO: renamed from: t0.a$b */
    private static final class b implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final b f11350a = new b();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11351b = C2449c.m11742a("storageMetrics").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        private b() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2488b c2488b, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11748a(f11351b, c2488b.m11831a());
        }
    }

    /* JADX INFO: renamed from: t0.a$c */
    private static final class c implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final c f11352a = new c();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11353b = C2449c.m11742a("eventsDroppedCount").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f11354c = C2449c.m11742a("reason").m11747b(C2493a.m11858b().m11860c(3).m11859a()).m11746a();

        private c() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2489c c2489c, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11750e(f11353b, c2489c.m11835a());
            interfaceC2451e.mo11748a(f11354c, c2489c.m11836b());
        }
    }

    /* JADX INFO: renamed from: t0.a$d */
    private static final class d implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final d f11355a = new d();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11356b = C2449c.m11742a("logSource").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f11357c = C2449c.m11742a("logEventDropped").m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

        private d() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2490d c2490d, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11748a(f11356b, c2490d.m11842b());
            interfaceC2451e.mo11748a(f11357c, c2490d.m11841a());
        }
    }

    /* JADX INFO: renamed from: t0.a$e */
    private static final class e implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final e f11358a = new e();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11359b = C2449c.m11743d("clientMetrics");

        private e() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo9388a(Object obj, Object obj2) {
            AbstractC0740E.m2693a(obj);
            m11665b(null, (InterfaceC2451e) obj2);
        }

        /* JADX INFO: renamed from: b */
        public void m11665b(AbstractC2436l abstractC2436l, InterfaceC2451e interfaceC2451e) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: t0.a$f */
    private static final class f implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final f f11360a = new f();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11361b = C2449c.m11742a("currentCacheSizeBytes").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f11362c = C2449c.m11742a("maxCacheSizeBytes").m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

        private f() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2491e c2491e, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11750e(f11361b, c2491e.m11847a());
            interfaceC2451e.mo11750e(f11362c, c2491e.m11848b());
        }
    }

    /* JADX INFO: renamed from: t0.a$g */
    private static final class g implements InterfaceC2450d {

        /* JADX INFO: renamed from: a */
        static final g f11363a = new g();

        /* JADX INFO: renamed from: b */
        private static final C2449c f11364b = C2449c.m11742a("startMs").m11747b(C2493a.m11858b().m11860c(1).m11859a()).m11746a();

        /* JADX INFO: renamed from: c */
        private static final C2449c f11365c = C2449c.m11742a("endMs").m11747b(C2493a.m11858b().m11860c(2).m11859a()).m11746a();

        private g() {
        }

        @Override // p151t1.InterfaceC2450d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9388a(C2492f c2492f, InterfaceC2451e interfaceC2451e) {
            interfaceC2451e.mo11750e(f11364b, c2492f.m11854b());
            interfaceC2451e.mo11750e(f11365c, c2492f.m11853a());
        }
    }

    private C2425a() {
    }

    @Override // p154u1.InterfaceC2469a
    /* JADX INFO: renamed from: a */
    public void mo9387a(InterfaceC2470b interfaceC2470b) {
        interfaceC2470b.mo11784a(AbstractC2436l.class, e.f11358a);
        interfaceC2470b.mo11784a(C2487a.class, a.f11345a);
        interfaceC2470b.mo11784a(C2492f.class, g.f11363a);
        interfaceC2470b.mo11784a(C2490d.class, d.f11355a);
        interfaceC2470b.mo11784a(C2489c.class, c.f11352a);
        interfaceC2470b.mo11784a(C2488b.class, b.f11350a);
        interfaceC2470b.mo11784a(C2491e.class, f.f11360a);
    }
}
