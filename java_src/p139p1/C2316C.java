package p139p1;

import p002A1.InterfaceC0026a;
import p002A1.InterfaceC0027b;

/* JADX INFO: renamed from: p1.C */
/* JADX INFO: loaded from: classes.dex */
class C2316C implements InterfaceC0027b {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0026a f10708c = new InterfaceC0026a() { // from class: p1.A
        @Override // p002A1.InterfaceC0026a
        /* JADX INFO: renamed from: a */
        public final void mo79a(InterfaceC0027b interfaceC0027b) {
            C2316C.m11077b(interfaceC0027b);
        }
    };

    /* JADX INFO: renamed from: d */
    private static final InterfaceC0027b f10709d = new InterfaceC0027b() { // from class: p1.B
        @Override // p002A1.InterfaceC0027b
        public final Object get() {
            return C2316C.m11076a();
        }
    };

    /* JADX INFO: renamed from: a */
    private InterfaceC0026a f10710a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC0027b f10711b;

    private C2316C(InterfaceC0026a interfaceC0026a, InterfaceC0027b interfaceC0027b) {
        this.f10710a = interfaceC0026a;
        this.f10711b = interfaceC0027b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m11076a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11077b(InterfaceC0027b interfaceC0027b) {
    }

    /* JADX INFO: renamed from: c */
    static C2316C m11078c() {
        return new C2316C(f10708c, f10709d);
    }

    /* JADX INFO: renamed from: d */
    void m11079d(InterfaceC0027b interfaceC0027b) {
        InterfaceC0026a interfaceC0026a;
        if (this.f10711b != f10709d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0026a = this.f10710a;
            this.f10710a = null;
            this.f10711b = interfaceC0027b;
        }
        interfaceC0026a.mo79a(interfaceC0027b);
    }

    @Override // p002A1.InterfaceC0027b
    public Object get() {
        return this.f10711b.get();
    }
}
