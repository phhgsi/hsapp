package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p035L1.C0388t;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0676D {

    /* JADX INFO: renamed from: a */
    private final Executor f2388a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0566a f2389b;

    /* JADX INFO: renamed from: c */
    private final Object f2390c;

    /* JADX INFO: renamed from: d */
    private int f2391d;

    /* JADX INFO: renamed from: e */
    private boolean f2392e;

    /* JADX INFO: renamed from: f */
    private boolean f2393f;

    /* JADX INFO: renamed from: g */
    private final List f2394g;

    /* JADX INFO: renamed from: h */
    private final Runnable f2395h;

    public C0676D(Executor executor, InterfaceC0566a interfaceC0566a) {
        AbstractC0606k.m2145e(executor, "executor");
        AbstractC0606k.m2145e(interfaceC0566a, "reportFullyDrawn");
        this.f2388a = executor;
        this.f2389b = interfaceC0566a;
        this.f2390c = new Object();
        this.f2394g = new ArrayList();
        this.f2395h = new Runnable() { // from class: androidx.activity.C
            @Override // java.lang.Runnable
            public final void run() {
                C0676D.m2560d(this.f2354d);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m2560d(C0676D c0676d) {
        AbstractC0606k.m2145e(c0676d, "this$0");
        synchronized (c0676d.f2390c) {
            try {
                c0676d.f2392e = false;
                if (c0676d.f2391d == 0 && !c0676d.f2393f) {
                    c0676d.f2389b.mo464a();
                    c0676d.m2561b();
                }
                C0388t c0388t = C0388t.f1507a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2561b() {
        synchronized (this.f2390c) {
            try {
                this.f2393f = true;
                Iterator it = this.f2394g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0566a) it.next()).mo464a();
                }
                this.f2394g.clear();
                C0388t c0388t = C0388t.f1507a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2562c() {
        boolean z2;
        synchronized (this.f2390c) {
            z2 = this.f2393f;
        }
        return z2;
    }
}
