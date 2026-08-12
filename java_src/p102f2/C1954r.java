package p102f2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071X1.AbstractC0602g;

/* JADX INFO: renamed from: f2.r */
/* JADX INFO: loaded from: classes.dex */
public class C1954r {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9475b = AtomicIntegerFieldUpdater.newUpdater(C1954r.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f9476a;

    public C1954r(Throwable th, boolean z2) {
        this.f9476a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10013a() {
        return f9475b.get(this) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10014c() {
        return f9475b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC1898D.m9781a(this) + '[' + this.f9476a + ']';
    }

    public /* synthetic */ C1954r(Throwable th, boolean z2, int i3, AbstractC0602g abstractC0602g) {
        this(th, (i3 & 2) != 0 ? false : z2);
    }
}
