package p106g2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p041N1.InterfaceC0446i;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p102f2.AbstractC1939j0;
import p102f2.C1907M;
import p102f2.InterfaceC1903I;

/* JADX INFO: renamed from: g2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1981c extends AbstractC1982d implements InterfaceC1903I {

    /* JADX INFO: renamed from: f */
    private final Handler f9511f;

    /* JADX INFO: renamed from: g */
    private final String f9512g;

    /* JADX INFO: renamed from: h */
    private final boolean f9513h;

    /* JADX INFO: renamed from: i */
    private final C1981c f9514i;

    private C1981c(Handler handler, String str, boolean z2) {
        super(null);
        this.f9511f = handler;
        this.f9512g = str;
        this.f9513h = z2;
        this.f9514i = z2 ? this : new C1981c(handler, str, true);
    }

    /* JADX INFO: renamed from: I */
    private final void m10049I(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        AbstractC1939j0.m9911c(interfaceC0446i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1907M.m9813b().mo9836D(interfaceC0446i, runnable);
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: D */
    public void mo9836D(InterfaceC0446i interfaceC0446i, Runnable runnable) {
        if (this.f9511f.post(runnable)) {
            return;
        }
        m10049I(interfaceC0446i, runnable);
    }

    @Override // p102f2.AbstractC1964w
    /* JADX INFO: renamed from: E */
    public boolean mo10029E(InterfaceC0446i interfaceC0446i) {
        return (this.f9513h && AbstractC0606k.m2141a(Looper.myLooper(), this.f9511f.getLooper())) ? false : true;
    }

    @Override // p102f2.AbstractC1953q0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C1981c mo10010G() {
        return this.f9514i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1981c)) {
            return false;
        }
        C1981c c1981c = (C1981c) obj;
        return c1981c.f9511f == this.f9511f && c1981c.f9513h == this.f9513h;
    }

    public int hashCode() {
        return System.identityHashCode(this.f9511f) ^ (this.f9513h ? 1231 : 1237);
    }

    @Override // p102f2.AbstractC1964w
    public String toString() {
        String strM10011H = m10011H();
        if (strM10011H != null) {
            return strM10011H;
        }
        String string = this.f9512g;
        if (string == null) {
            string = this.f9511f.toString();
        }
        if (!this.f9513h) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ C1981c(Handler handler, String str, int i3, AbstractC0602g abstractC0602g) {
        this(handler, (i3 & 2) != 0 ? null : str);
    }

    public C1981c(Handler handler, String str) {
        this(handler, str, false);
    }
}
