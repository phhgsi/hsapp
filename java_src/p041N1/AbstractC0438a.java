package p041N1;

import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0438a implements InterfaceC0446i.b {

    /* JADX INFO: renamed from: d */
    private final InterfaceC0446i.c f1586d;

    public AbstractC0438a(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        this.f1586d = cVar;
    }

    @Override // p041N1.InterfaceC0446i.b, p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: b */
    public InterfaceC0446i.b mo1603b(InterfaceC0446i.c cVar) {
        return InterfaceC0446i.b.a.m1626b(this, cVar);
    }

    @Override // p041N1.InterfaceC0446i.b
    public InterfaceC0446i.c getKey() {
        return this.f1586d;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: i */
    public Object mo1604i(Object obj, InterfaceC0581p interfaceC0581p) {
        return InterfaceC0446i.b.a.m1625a(this, obj, interfaceC0581p);
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: p */
    public InterfaceC0446i mo1605p(InterfaceC0446i interfaceC0446i) {
        return InterfaceC0446i.b.a.m1628d(this, interfaceC0446i);
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: r */
    public InterfaceC0446i mo1606r(InterfaceC0446i.c cVar) {
        return InterfaceC0446i.b.a.m1627c(this, cVar);
    }
}
