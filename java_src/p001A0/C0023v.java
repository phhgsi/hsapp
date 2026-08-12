package p001A0;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p004B0.InterfaceC0054d;
import p007C0.InterfaceC0086b;
import p150t0.AbstractC2439o;

/* JADX INFO: renamed from: A0.v */
/* JADX INFO: loaded from: classes.dex */
public class C0023v {

    /* JADX INFO: renamed from: a */
    private final Executor f64a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0054d f65b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0025x f66c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0086b f67d;

    C0023v(Executor executor, InterfaceC0054d interfaceC0054d, InterfaceC0025x interfaceC0025x, InterfaceC0086b interfaceC0086b) {
        this.f64a = executor;
        this.f65b = interfaceC0054d;
        this.f66c = interfaceC0025x;
        this.f67d = interfaceC0086b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m73a(C0023v c0023v) {
        Iterator it = c0023v.f65b.mo139n().iterator();
        while (it.hasNext()) {
            c0023v.f66c.mo42b((AbstractC2439o) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m75c() {
        this.f64a.execute(new Runnable() { // from class: A0.t
            @Override // java.lang.Runnable
            public final void run() {
                C0023v c0023v = this.f62d;
                c0023v.f67d.mo134d(new InterfaceC0086b.a() { // from class: A0.u
                    @Override // p007C0.InterfaceC0086b.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo56a() {
                        return C0023v.m73a(c0023v);
                    }
                });
            }
        });
    }
}
