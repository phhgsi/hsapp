package androidx.lifecycle;

import androidx.lifecycle.AbstractC1126h;
import java.util.Map;
import p115j.C2044c;
import p119k.C2109b;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {

    /* JADX INFO: renamed from: k */
    static final Object f5291k = new Object();

    /* JADX INFO: renamed from: a */
    final Object f5292a = new Object();

    /* JADX INFO: renamed from: b */
    private C2109b f5293b = new C2109b();

    /* JADX INFO: renamed from: c */
    int f5294c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f5295d;

    /* JADX INFO: renamed from: e */
    private volatile Object f5296e;

    /* JADX INFO: renamed from: f */
    volatile Object f5297f;

    /* JADX INFO: renamed from: g */
    private int f5298g;

    /* JADX INFO: renamed from: h */
    private boolean f5299h;

    /* JADX INFO: renamed from: i */
    private boolean f5300i;

    /* JADX INFO: renamed from: j */
    private final Runnable f5301j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC1130l {

        /* JADX INFO: renamed from: h */
        final InterfaceC1132n f5302h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ LiveData f5303i;

        @Override // androidx.lifecycle.InterfaceC1130l
        /* JADX INFO: renamed from: d */
        public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
            AbstractC1126h.b bVarMo5133b = this.f5302h.getLifecycle().mo5133b();
            if (bVarMo5133b == AbstractC1126h.b.DESTROYED) {
                this.f5303i.m5105h(this.f5306d);
                return;
            }
            AbstractC1126h.b bVar = null;
            while (bVar != bVarMo5133b) {
                m5110f(m5108j());
                bVar = bVarMo5133b;
                bVarMo5133b = this.f5302h.getLifecycle().mo5133b();
            }
        }

        /* JADX INFO: renamed from: i */
        void m5107i() {
            this.f5302h.getLifecycle().mo5134c(this);
        }

        /* JADX INFO: renamed from: j */
        boolean m5108j() {
            return this.f5302h.getLifecycle().mo5133b().m5141b(AbstractC1126h.b.STARTED);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    class RunnableC1113a implements Runnable {
        RunnableC1113a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f5292a) {
                obj = LiveData.this.f5297f;
                LiveData.this.f5297f = LiveData.f5291k;
            }
            LiveData.this.mo5106i(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    private class C1114b extends AbstractC1115c {
        C1114b(InterfaceC1137s interfaceC1137s) {
            super(interfaceC1137s);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC1115c
        /* JADX INFO: renamed from: j */
        boolean mo5109j() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$c */
    private abstract class AbstractC1115c {

        /* JADX INFO: renamed from: d */
        final InterfaceC1137s f5306d;

        /* JADX INFO: renamed from: e */
        boolean f5307e;

        /* JADX INFO: renamed from: f */
        int f5308f = -1;

        AbstractC1115c(InterfaceC1137s interfaceC1137s) {
            this.f5306d = interfaceC1137s;
        }

        /* JADX INFO: renamed from: f */
        void m5110f(boolean z2) {
            if (z2 == this.f5307e) {
                return;
            }
            this.f5307e = z2;
            LiveData.this.m5100b(z2 ? 1 : -1);
            if (this.f5307e) {
                LiveData.this.m5101d(this);
            }
        }

        /* JADX INFO: renamed from: i */
        void m5111i() {
        }

        /* JADX INFO: renamed from: j */
        abstract boolean mo5109j();
    }

    public LiveData() {
        Object obj = f5291k;
        this.f5297f = obj;
        this.f5301j = new RunnableC1113a();
        this.f5296e = obj;
        this.f5298g = -1;
    }

    /* JADX INFO: renamed from: a */
    static void m5098a(String str) {
        if (C2044c.m10260f().mo10262b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: renamed from: c */
    private void m5099c(AbstractC1115c abstractC1115c) {
        if (abstractC1115c.f5307e) {
            if (!abstractC1115c.mo5109j()) {
                abstractC1115c.m5110f(false);
                return;
            }
            int i3 = abstractC1115c.f5308f;
            int i4 = this.f5298g;
            if (i3 >= i4) {
                return;
            }
            abstractC1115c.f5308f = i4;
            abstractC1115c.f5306d.mo4919a(this.f5296e);
        }
    }

    /* JADX INFO: renamed from: b */
    void m5100b(int i3) {
        int i4 = this.f5294c;
        this.f5294c = i3 + i4;
        if (this.f5295d) {
            return;
        }
        this.f5295d = true;
        while (true) {
            try {
                int i5 = this.f5294c;
                if (i4 == i5) {
                    this.f5295d = false;
                    return;
                }
                boolean z2 = i4 == 0 && i5 > 0;
                boolean z3 = i4 > 0 && i5 == 0;
                if (z2) {
                    m5103f();
                } else if (z3) {
                    m5104g();
                }
                i4 = i5;
            } catch (Throwable th) {
                this.f5295d = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m5101d(AbstractC1115c abstractC1115c) {
        if (this.f5299h) {
            this.f5300i = true;
            return;
        }
        this.f5299h = true;
        do {
            this.f5300i = false;
            if (abstractC1115c != null) {
                m5099c(abstractC1115c);
                abstractC1115c = null;
            } else {
                C2109b.d dVarM10556d = this.f5293b.m10556d();
                while (dVarM10556d.hasNext()) {
                    m5099c((AbstractC1115c) ((Map.Entry) dVarM10556d.next()).getValue());
                    if (this.f5300i) {
                        break;
                    }
                }
            }
        } while (this.f5300i);
        this.f5299h = false;
    }

    /* JADX INFO: renamed from: e */
    public void m5102e(InterfaceC1137s interfaceC1137s) {
        m5098a("observeForever");
        C1114b c1114b = new C1114b(interfaceC1137s);
        AbstractC1115c abstractC1115c = (AbstractC1115c) this.f5293b.mo10552g(interfaceC1137s, c1114b);
        if (abstractC1115c instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1115c != null) {
            return;
        }
        c1114b.m5110f(true);
    }

    /* JADX INFO: renamed from: f */
    protected void m5103f() {
    }

    /* JADX INFO: renamed from: g */
    protected void m5104g() {
    }

    /* JADX INFO: renamed from: h */
    public void m5105h(InterfaceC1137s interfaceC1137s) {
        m5098a("removeObserver");
        AbstractC1115c abstractC1115c = (AbstractC1115c) this.f5293b.mo10553h(interfaceC1137s);
        if (abstractC1115c == null) {
            return;
        }
        abstractC1115c.m5111i();
        abstractC1115c.m5110f(false);
    }

    /* JADX INFO: renamed from: i */
    protected void mo5106i(Object obj) {
        m5098a("setValue");
        this.f5298g++;
        this.f5296e = obj;
        m5101d(null);
    }
}
