package p168z0;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p001A0.InterfaceC0025x;
import p004B0.InterfaceC0054d;
import p007C0.InterfaceC0086b;
import p144r0.InterfaceC2373j;
import p150t0.AbstractC2433i;
import p150t0.AbstractC2439o;
import p150t0.C2444t;
import p153u0.InterfaceC2460e;
import p153u0.InterfaceC2468m;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public class C2596c implements InterfaceC2598e {

    /* JADX INFO: renamed from: f */
    private static final Logger f11935f = Logger.getLogger(C2444t.class.getName());

    /* JADX INFO: renamed from: a */
    private final InterfaceC0025x f11936a;

    /* JADX INFO: renamed from: b */
    private final Executor f11937b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2460e f11938c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0054d f11939d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0086b f11940e;

    public C2596c(Executor executor, InterfaceC2460e interfaceC2460e, InterfaceC0025x interfaceC0025x, InterfaceC0054d interfaceC0054d, InterfaceC0086b interfaceC0086b) {
        this.f11937b = executor;
        this.f11938c = interfaceC2460e;
        this.f11936a = interfaceC0025x;
        this.f11939d = interfaceC0054d;
        this.f11940e = interfaceC0086b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m12345b(C2596c c2596c, AbstractC2439o abstractC2439o, AbstractC2433i abstractC2433i) {
        c2596c.f11939d.mo137j(abstractC2439o, abstractC2433i);
        c2596c.f11936a.mo42b(abstractC2439o, 1);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12346c(final C2596c c2596c, final AbstractC2439o abstractC2439o, InterfaceC2373j interfaceC2373j, AbstractC2433i abstractC2433i) {
        c2596c.getClass();
        try {
            InterfaceC2468m interfaceC2468mMo11766a = c2596c.f11938c.mo11766a(abstractC2439o.mo11693b());
            if (interfaceC2468mMo11766a == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC2439o.mo11693b());
                f11935f.warning(str);
                interfaceC2373j.mo11219a(new IllegalArgumentException(str));
            } else {
                final AbstractC2433i abstractC2433iMo7204a = interfaceC2468mMo11766a.mo7204a(abstractC2433i);
                c2596c.f11940e.mo134d(new InterfaceC0086b.a() { // from class: z0.b
                    @Override // p007C0.InterfaceC0086b.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo56a() {
                        return C2596c.m12345b(this.f11932a, abstractC2439o, abstractC2433iMo7204a);
                    }
                });
                interfaceC2373j.mo11219a(null);
            }
        } catch (Exception e3) {
            f11935f.warning("Error scheduling event " + e3.getMessage());
            interfaceC2373j.mo11219a(e3);
        }
    }

    @Override // p168z0.InterfaceC2598e
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AbstractC2439o abstractC2439o, final AbstractC2433i abstractC2433i, final InterfaceC2373j interfaceC2373j) {
        this.f11937b.execute(new Runnable() { // from class: z0.a
            @Override // java.lang.Runnable
            public final void run() {
                C2596c.m12346c(this.f11928d, abstractC2439o, interfaceC2373j, abstractC2433i);
            }
        });
    }
}
