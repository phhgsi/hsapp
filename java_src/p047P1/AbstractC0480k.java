package p047P1;

import p041N1.InterfaceC0442e;
import p071X1.AbstractC0606k;
import p071X1.AbstractC0614s;
import p071X1.InterfaceC0603h;

/* JADX INFO: renamed from: P1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480k extends AbstractC0472c implements InterfaceC0603h {

    /* JADX INFO: renamed from: g */
    private final int f1688g;

    public AbstractC0480k(int i3, InterfaceC0442e interfaceC0442e) {
        super(interfaceC0442e);
        this.f1688g = i3;
    }

    @Override // p071X1.InterfaceC0603h
    /* JADX INFO: renamed from: b */
    public int mo1771b() {
        return this.f1688g;
    }

    @Override // p047P1.AbstractC0470a
    public String toString() {
        if (m1752h() != null) {
            return super.toString();
        }
        String strM2159e = AbstractC0614s.m2159e(this);
        AbstractC0606k.m2144d(strM2159e, "renderLambdaToString(...)");
        return strM2159e;
    }
}
