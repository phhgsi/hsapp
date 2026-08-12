package p110h2;

import p041N1.InterfaceC0446i;

/* JADX INFO: renamed from: h2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2000g extends RuntimeException {

    /* JADX INFO: renamed from: d */
    private final transient InterfaceC0446i f9570d;

    public C2000g(InterfaceC0446i interfaceC0446i) {
        this.f9570d = interfaceC0446i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f9570d.toString();
    }
}
