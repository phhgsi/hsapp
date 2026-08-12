package p041N1;

import java.io.Serializable;
import p041N1.InterfaceC0446i;
import p068W1.InterfaceC0581p;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: N1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0447j implements InterfaceC0446i, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C0447j f1593d = new C0447j();

    private C0447j() {
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: b */
    public InterfaceC0446i.b mo1603b(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: i */
    public Object mo1604i(Object obj, InterfaceC0581p interfaceC0581p) {
        AbstractC0606k.m2145e(interfaceC0581p, "operation");
        return obj;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: p */
    public InterfaceC0446i mo1605p(InterfaceC0446i interfaceC0446i) {
        AbstractC0606k.m2145e(interfaceC0446i, "context");
        return interfaceC0446i;
    }

    @Override // p041N1.InterfaceC0446i
    /* JADX INFO: renamed from: r */
    public InterfaceC0446i mo1606r(InterfaceC0446i.c cVar) {
        AbstractC0606k.m2145e(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
