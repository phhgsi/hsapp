package p071X1;

import p090c2.InterfaceC1315b;
import p090c2.InterfaceC1316c;
import p090c2.InterfaceC1317d;
import p090c2.InterfaceC1318e;

/* JADX INFO: renamed from: X1.t */
/* JADX INFO: loaded from: classes.dex */
public class C0615t {
    /* JADX INFO: renamed from: b */
    public InterfaceC1315b m2162b(Class cls) {
        return new C0600e(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC1316c m2163c(Class cls, String str) {
        return new C0608m(cls, str);
    }

    /* JADX INFO: renamed from: e */
    public String m2165e(InterfaceC0603h interfaceC0603h) {
        String string = interfaceC0603h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: f */
    public String m2166f(AbstractC0607l abstractC0607l) {
        return m2165e(abstractC0607l);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1317d m2161a(AbstractC0604i abstractC0604i) {
        return abstractC0604i;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC1318e m2164d(AbstractC0609n abstractC0609n) {
        return abstractC0609n;
    }
}
