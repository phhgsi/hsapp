package p102f2;

import java.util.concurrent.CancellationException;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: f2.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1933g0 extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final transient InterfaceC1931f0 f9439d;

    public C1933g0(String str, Throwable th, InterfaceC1931f0 interfaceC1931f0) {
        super(str);
        this.f9439d = interfaceC1931f0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1933g0)) {
            return false;
        }
        C1933g0 c1933g0 = (C1933g0) obj;
        return AbstractC0606k.m2141a(c1933g0.getMessage(), getMessage()) && AbstractC0606k.m2141a(c1933g0.f9439d, this.f9439d) && AbstractC0606k.m2141a(c1933g0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC0606k.m2142b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f9439d.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f9439d;
    }
}
