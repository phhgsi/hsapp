package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import p035L1.AbstractC0381m;
import p035L1.AbstractC0382n;
import p035L1.C0388t;
import p041N1.InterfaceC0442e;
import p044O1.AbstractC0452b;
import p047P1.AbstractC0480k;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;
import p071X1.C0613r;
import p102f2.AbstractC1932g;
import p102f2.InterfaceC1931f0;
import p102f2.InterfaceC1936i;
import p102f2.InterfaceC1970z;
import p122k2.InterfaceC2115a;

/* JADX INFO: loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC1126h.a f5312d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C0613r f5313e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ InterfaceC1970z f5314f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ AbstractC1126h.a f5315g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ InterfaceC1936i f5316h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ InterfaceC0581p f5317i;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a */
    static final class C1117a extends AbstractC0480k implements InterfaceC0581p {

        /* JADX INFO: renamed from: h */
        Object f5318h;

        /* JADX INFO: renamed from: i */
        Object f5319i;

        /* JADX INFO: renamed from: j */
        int f5320j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC0581p f5321k;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a */
        static final class a extends AbstractC0480k implements InterfaceC0581p {

            /* JADX INFO: renamed from: h */
            int f5322h;

            /* JADX INFO: renamed from: i */
            private /* synthetic */ Object f5323i;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ InterfaceC0581p f5324j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC0581p interfaceC0581p, InterfaceC0442e interfaceC0442e) {
                super(2, interfaceC0442e);
                this.f5324j = interfaceC0581p;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: g */
            public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
                a aVar = new a(this.f5324j, interfaceC0442e);
                aVar.f5323i = obj;
                return aVar;
            }

            @Override // p047P1.AbstractC0470a
            /* JADX INFO: renamed from: k */
            public final Object mo1646k(Object obj) {
                Object objE = AbstractC0452b.m1647e();
                int i3 = this.f5322h;
                if (i3 == 0) {
                    AbstractC0382n.m1373b(obj);
                    InterfaceC1970z interfaceC1970z = (InterfaceC1970z) this.f5323i;
                    InterfaceC0581p interfaceC0581p = this.f5324j;
                    this.f5322h = 1;
                    if (interfaceC0581p.mo1609d(interfaceC1970z, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0382n.m1373b(obj);
                }
                return C0388t.f1507a;
            }

            @Override // p068W1.InterfaceC0581p
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
                return ((a) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1117a(InterfaceC2115a interfaceC2115a, InterfaceC0581p interfaceC0581p, InterfaceC0442e interfaceC0442e) {
            super(2, interfaceC0442e);
            this.f5321k = interfaceC0581p;
        }

        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: g */
        public final InterfaceC0442e mo1751g(Object obj, InterfaceC0442e interfaceC0442e) {
            return new C1117a(null, this.f5321k, interfaceC0442e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
        
            throw null;
         */
        @Override // p047P1.AbstractC0470a
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo1646k(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p044O1.AbstractC0452b.m1647e()
                int r1 = r5.f5320j
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L42
                r4 = 2
                if (r1 == r2) goto L20
                if (r1 == r4) goto L17
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                java.lang.Object r0 = r5.f5318h
                androidx.appcompat.app.AbstractC0740E.m2693a(r0)
                p035L1.AbstractC0382n.m1373b(r6)     // Catch: java.lang.Throwable -> L41
                goto L3e
            L20:
                java.lang.Object r1 = r5.f5319i
                W1.p r1 = (p068W1.InterfaceC0581p) r1
                java.lang.Object r2 = r5.f5318h
                androidx.appcompat.app.AbstractC0740E.m2693a(r2)
                p035L1.AbstractC0382n.m1373b(r6)
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a r6 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a     // Catch: java.lang.Throwable -> L41
                r6.<init>(r1, r3)     // Catch: java.lang.Throwable -> L41
                r5.f5318h = r3     // Catch: java.lang.Throwable -> L41
                r5.f5319i = r3     // Catch: java.lang.Throwable -> L41
                r5.f5320j = r4     // Catch: java.lang.Throwable -> L41
                java.lang.Object r6 = p102f2.AbstractC1893A.m9777b(r6, r5)     // Catch: java.lang.Throwable -> L41
                if (r6 != r0) goto L3e
                return r0
            L3e:
                L1.t r6 = p035L1.C0388t.f1507a     // Catch: java.lang.Throwable -> L41
                throw r3
            L41:
                throw r3
            L42:
                p035L1.AbstractC0382n.m1373b(r6)
                W1.p r6 = r5.f5321k
                r5.f5318h = r3
                r5.f5319i = r6
                r5.f5320j = r2
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.C1117a.mo1646k(java.lang.Object):java.lang.Object");
        }

        @Override // p068W1.InterfaceC0581p
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object mo1609d(InterfaceC1970z interfaceC1970z, InterfaceC0442e interfaceC0442e) {
            return ((C1117a) mo1751g(interfaceC1970z, interfaceC0442e)).mo1646k(C0388t.f1507a);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public final void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        AbstractC0606k.m2145e(interfaceC1132n, "<anonymous parameter 0>");
        AbstractC0606k.m2145e(aVar, "event");
        if (aVar == this.f5312d) {
            this.f5313e.f2012d = AbstractC1932g.m9877d(this.f5314f, null, null, new C1117a(null, this.f5317i, null), 3, null);
            return;
        }
        if (aVar == this.f5315g) {
            InterfaceC1931f0 interfaceC1931f0 = (InterfaceC1931f0) this.f5313e.f2012d;
            if (interfaceC1931f0 != null) {
                InterfaceC1931f0.a.m9869a(interfaceC1931f0, null, 1, null);
            }
            this.f5313e.f2012d = null;
        }
        if (aVar == AbstractC1126h.a.ON_DESTROY) {
            InterfaceC1936i interfaceC1936i = this.f5316h;
            AbstractC0381m.a aVar2 = AbstractC0381m.f1498d;
            interfaceC1936i.mo1616j(AbstractC0381m.m1369a(C0388t.f1507a));
        }
    }
}
