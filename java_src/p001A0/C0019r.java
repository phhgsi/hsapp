package p001A0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p004B0.AbstractC0061k;
import p004B0.InterfaceC0053c;
import p004B0.InterfaceC0054d;
import p007C0.C0085a;
import p007C0.InterfaceC0086b;
import p010D0.InterfaceC0092a;
import p144r0.C2366c;
import p150t0.AbstractC2433i;
import p150t0.AbstractC2439o;
import p150t0.C2432h;
import p153u0.AbstractC2461f;
import p153u0.AbstractC2462g;
import p153u0.InterfaceC2460e;
import p153u0.InterfaceC2468m;
import p159w0.C2487a;
import p159w0.C2489c;
import p162x0.AbstractC2523a;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public class C0019r {

    /* JADX INFO: renamed from: a */
    private final Context f44a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2460e f45b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0054d f46c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0025x f47d;

    /* JADX INFO: renamed from: e */
    private final Executor f48e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0086b f49f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0092a f50g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC0092a f51h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC0053c f52i;

    public C0019r(Context context, InterfaceC2460e interfaceC2460e, InterfaceC0054d interfaceC0054d, InterfaceC0025x interfaceC0025x, Executor executor, InterfaceC0086b interfaceC0086b, InterfaceC0092a interfaceC0092a, InterfaceC0092a interfaceC0092a2, InterfaceC0053c interfaceC0053c) {
        this.f44a = context;
        this.f45b = interfaceC2460e;
        this.f46c = interfaceC0054d;
        this.f47d = interfaceC0025x;
        this.f48e = executor;
        this.f49f = interfaceC0086b;
        this.f50g = interfaceC0092a;
        this.f51h = interfaceC0092a2;
        this.f52i = interfaceC0053c;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m58b(C0019r c0019r, Iterable iterable, AbstractC2439o abstractC2439o, long j3) {
        c0019r.f46c.mo127B(iterable);
        c0019r.f46c.mo138m(abstractC2439o, c0019r.f50g.mo259a() + j3);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m59c(C0019r c0019r) {
        c0019r.f52i.mo133c();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m61e(C0019r c0019r, Iterable iterable) {
        c0019r.f46c.mo136f(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m62f(C0019r c0019r, AbstractC2439o abstractC2439o, int i3) {
        c0019r.f47d.mo42b(abstractC2439o, i3 + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m63g(C0019r c0019r, AbstractC2439o abstractC2439o, long j3) {
        c0019r.f46c.mo138m(abstractC2439o, c0019r.f50g.mo259a() + j3);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m64h(C0019r c0019r, Map map) {
        c0019r.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            c0019r.f52i.mo132b(((Integer) r0.getValue()).intValue(), C2489c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m65i(final C0019r c0019r, final AbstractC2439o abstractC2439o, final int i3, Runnable runnable) {
        c0019r.getClass();
        try {
            try {
                InterfaceC0086b interfaceC0086b = c0019r.f49f;
                final InterfaceC0054d interfaceC0054d = c0019r.f46c;
                Objects.requireNonNull(interfaceC0054d);
                interfaceC0086b.mo134d(new InterfaceC0086b.a() { // from class: A0.i
                    @Override // p007C0.InterfaceC0086b.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo56a() {
                        return Integer.valueOf(interfaceC0054d.mo135e());
                    }
                });
                if (c0019r.m67k()) {
                    c0019r.m68l(abstractC2439o, i3);
                } else {
                    c0019r.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.j
                        @Override // p007C0.InterfaceC0086b.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo56a() {
                            return C0019r.m62f(this.f25a, abstractC2439o, i3);
                        }
                    });
                }
                runnable.run();
            } catch (C0085a unused) {
                c0019r.f47d.mo42b(abstractC2439o, i3 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public AbstractC2433i m66j(InterfaceC2468m interfaceC2468m) {
        InterfaceC0086b interfaceC0086b = this.f49f;
        final InterfaceC0053c interfaceC0053c = this.f52i;
        Objects.requireNonNull(interfaceC0053c);
        return interfaceC2468m.mo7204a(AbstractC2433i.m11709a().mo11679i(this.f50g.mo259a()).mo11681k(this.f51h.mo259a()).mo11680j("GDT_CLIENT_METRICS").mo11678h(new C2432h(C2366c.m11213b("proto"), ((C2487a) interfaceC0086b.mo134d(new InterfaceC0086b.a() { // from class: A0.h
            @Override // p007C0.InterfaceC0086b.a
            /* JADX INFO: renamed from: a */
            public final Object mo56a() {
                return interfaceC0053c.mo131a();
            }
        })).m11824f())).mo11674d());
    }

    /* JADX INFO: renamed from: k */
    boolean m67k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f44a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC2462g m68l(final AbstractC2439o abstractC2439o, int i3) {
        AbstractC2462g abstractC2462gMo7205b;
        InterfaceC2468m interfaceC2468mMo11766a = this.f45b.mo11766a(abstractC2439o.mo11693b());
        AbstractC2462g abstractC2462gM11770e = AbstractC2462g.m11770e(0L);
        final long j3 = 0;
        while (((Boolean) this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.k
            @Override // p007C0.InterfaceC0086b.a
            /* JADX INFO: renamed from: a */
            public final Object mo56a() {
                return Boolean.valueOf(this.f28a.f46c.mo140o(abstractC2439o));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.l
                @Override // p007C0.InterfaceC0086b.a
                /* JADX INFO: renamed from: a */
                public final Object mo56a() {
                    return this.f30a.f46c.mo142z(abstractC2439o);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC2462gM11770e;
            }
            if (interfaceC2468mMo11766a == null) {
                AbstractC2523a.m12054b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC2439o);
                abstractC2462gMo7205b = AbstractC2462g.m11768a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0061k) it.next()).mo169b());
                }
                if (abstractC2439o.m11727e()) {
                    arrayList.add(m66j(interfaceC2468mMo11766a));
                }
                abstractC2462gMo7205b = interfaceC2468mMo11766a.mo7205b(AbstractC2461f.m11767a().mo11758b(arrayList).mo11759c(abstractC2439o.mo11694c()).mo11757a());
            }
            abstractC2462gM11770e = abstractC2462gMo7205b;
            if (abstractC2462gM11770e.mo11761c() == AbstractC2462g.a.TRANSIENT_ERROR) {
                final AbstractC2439o abstractC2439o2 = abstractC2439o;
                this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.m
                    @Override // p007C0.InterfaceC0086b.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo56a() {
                        return C0019r.m58b(this.f32a, iterable, abstractC2439o2, j3);
                    }
                });
                this.f47d.mo41a(abstractC2439o2, i3 + 1, true);
                return abstractC2462gM11770e;
            }
            AbstractC2439o abstractC2439o3 = abstractC2439o;
            this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.n
                @Override // p007C0.InterfaceC0086b.a
                /* JADX INFO: renamed from: a */
                public final Object mo56a() {
                    return C0019r.m61e(this.f36a, iterable);
                }
            });
            if (abstractC2462gM11770e.mo11761c() == AbstractC2462g.a.OK) {
                long jMax = Math.max(j3, abstractC2462gM11770e.mo11760b());
                if (abstractC2439o3.m11727e()) {
                    this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.o
                        @Override // p007C0.InterfaceC0086b.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo56a() {
                            return C0019r.m59c(this.f38a);
                        }
                    });
                }
                j3 = jMax;
            } else if (abstractC2462gM11770e.mo11761c() == AbstractC2462g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strMo11672j = ((AbstractC0061k) it2.next()).mo169b().mo11672j();
                    if (map.containsKey(strMo11672j)) {
                        map.put(strMo11672j, Integer.valueOf(((Integer) map.get(strMo11672j)).intValue() + 1));
                    } else {
                        map.put(strMo11672j, 1);
                    }
                }
                this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.p
                    @Override // p007C0.InterfaceC0086b.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo56a() {
                        return C0019r.m64h(this.f39a, map);
                    }
                });
            }
            abstractC2439o = abstractC2439o3;
        }
        final AbstractC2439o abstractC2439o4 = abstractC2439o;
        this.f49f.mo134d(new InterfaceC0086b.a() { // from class: A0.q
            @Override // p007C0.InterfaceC0086b.a
            /* JADX INFO: renamed from: a */
            public final Object mo56a() {
                return C0019r.m63g(this.f41a, abstractC2439o4, j3);
            }
        });
        return abstractC2462gM11770e;
    }

    /* JADX INFO: renamed from: m */
    public void m69m(final AbstractC2439o abstractC2439o, final int i3, final Runnable runnable) {
        this.f48e.execute(new Runnable() { // from class: A0.g
            @Override // java.lang.Runnable
            public final void run() {
                C0019r.m65i(this.f19d, abstractC2439o, i3, runnable);
            }
        });
    }
}
