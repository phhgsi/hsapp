package p035L1;

import java.io.Serializable;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.o */
/* JADX INFO: loaded from: classes.dex */
final class C0383o implements InterfaceC0375g, Serializable {

    /* JADX INFO: renamed from: d */
    private InterfaceC0566a f1500d;

    /* JADX INFO: renamed from: e */
    private volatile Object f1501e;

    /* JADX INFO: renamed from: f */
    private final Object f1502f;

    public C0383o(InterfaceC0566a interfaceC0566a, Object obj) {
        AbstractC0606k.m2145e(interfaceC0566a, "initializer");
        this.f1500d = interfaceC0566a;
        this.f1501e = C0386r.f1506a;
        this.f1502f = obj == null ? this : obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1374a() {
        return this.f1501e != C0386r.f1506a;
    }

    @Override // p035L1.InterfaceC0375g
    public Object getValue() {
        Object objMo464a;
        Object obj = this.f1501e;
        C0386r c0386r = C0386r.f1506a;
        if (obj != c0386r) {
            return obj;
        }
        synchronized (this.f1502f) {
            objMo464a = this.f1501e;
            if (objMo464a == c0386r) {
                InterfaceC0566a interfaceC0566a = this.f1500d;
                AbstractC0606k.m2142b(interfaceC0566a);
                objMo464a = interfaceC0566a.mo464a();
                this.f1501e = objMo464a;
                this.f1500d = null;
            }
        }
        return objMo464a;
    }

    public String toString() {
        return m1374a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C0383o(InterfaceC0566a interfaceC0566a, Object obj, int i3, AbstractC0602g abstractC0602g) {
        this(interfaceC0566a, (i3 & 2) != 0 ? null : obj);
    }
}
