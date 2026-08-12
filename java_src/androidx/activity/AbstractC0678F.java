package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p068W1.InterfaceC0566a;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: androidx.activity.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0678F {

    /* JADX INFO: renamed from: a */
    private boolean f2396a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f2397b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private InterfaceC0566a f2398c;

    public AbstractC0678F(boolean z2) {
        this.f2396a = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2563a(InterfaceC0703c interfaceC0703c) {
        AbstractC0606k.m2145e(interfaceC0703c, "cancellable");
        this.f2397b.add(interfaceC0703c);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0566a m2564b() {
        return this.f2398c;
    }

    /* JADX INFO: renamed from: c */
    public void m2565c() {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2566d();

    /* JADX INFO: renamed from: e */
    public void m2567e(C0702b c0702b) {
        AbstractC0606k.m2145e(c0702b, "backEvent");
    }

    /* JADX INFO: renamed from: f */
    public void m2568f(C0702b c0702b) {
        AbstractC0606k.m2145e(c0702b, "backEvent");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2569g() {
        return this.f2396a;
    }

    /* JADX INFO: renamed from: h */
    public final void m2570h() {
        Iterator it = this.f2397b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0703c) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2571i(InterfaceC0703c interfaceC0703c) {
        AbstractC0606k.m2145e(interfaceC0703c, "cancellable");
        this.f2397b.remove(interfaceC0703c);
    }

    /* JADX INFO: renamed from: j */
    public final void m2572j(boolean z2) {
        this.f2396a = z2;
        InterfaceC0566a interfaceC0566a = this.f2398c;
        if (interfaceC0566a != null) {
            interfaceC0566a.mo464a();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2573k(InterfaceC0566a interfaceC0566a) {
        this.f2398c = interfaceC0566a;
    }
}
