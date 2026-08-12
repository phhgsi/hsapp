package p110h2;

import androidx.concurrent.futures.AbstractC0933b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.o */
/* JADX INFO: loaded from: classes.dex */
public class C2008o {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9592a = AtomicReferenceFieldUpdater.newUpdater(C2008o.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C2008o(boolean z2) {
        this._cur$volatile = new C2009p(8, z2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10159a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9592a;
        while (true) {
            C2009p c2009p = (C2009p) atomicReferenceFieldUpdater.get(this);
            int iM10171a = c2009p.m10171a(obj);
            if (iM10171a == 0) {
                return true;
            }
            if (iM10171a == 1) {
                AbstractC0933b.m3989a(f9592a, this, c2009p, c2009p.m10175l());
            } else if (iM10171a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10160b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9592a;
        while (true) {
            C2009p c2009p = (C2009p) atomicReferenceFieldUpdater.get(this);
            if (c2009p.m10172d()) {
                return;
            } else {
                AbstractC0933b.m3989a(f9592a, this, c2009p, c2009p.m10175l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m10161c() {
        return ((C2009p) f9592a.get(this)).m10173g();
    }

    /* JADX INFO: renamed from: e */
    public final Object m10162e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9592a;
        while (true) {
            C2009p c2009p = (C2009p) atomicReferenceFieldUpdater.get(this);
            Object objM10176m = c2009p.m10176m();
            if (objM10176m != C2009p.f9596h) {
                return objM10176m;
            }
            AbstractC0933b.m3989a(f9592a, this, c2009p, c2009p.m10175l());
        }
    }
}
