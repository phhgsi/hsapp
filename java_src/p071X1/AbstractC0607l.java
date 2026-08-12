package p071X1;

import java.io.Serializable;

/* JADX INFO: renamed from: X1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0607l implements InterfaceC0603h, Serializable {

    /* JADX INFO: renamed from: d */
    private final int f2007d;

    public AbstractC0607l(int i3) {
        this.f2007d = i3;
    }

    @Override // p071X1.InterfaceC0603h
    /* JADX INFO: renamed from: b */
    public int mo1771b() {
        return this.f2007d;
    }

    public String toString() {
        String strM2160f = AbstractC0614s.m2160f(this);
        AbstractC0606k.m2144d(strM2160f, "renderLambdaToString(...)");
        return strM2160f;
    }
}
