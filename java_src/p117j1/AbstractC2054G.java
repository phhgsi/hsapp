package p117j1;

import java.util.Comparator;
import p113i1.InterfaceC2030c;

/* JADX INFO: renamed from: j1.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2054G implements Comparator {
    protected AbstractC2054G() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2054G m10276a(Comparator comparator) {
        return comparator instanceof AbstractC2054G ? (AbstractC2054G) comparator : new C2077k(comparator);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2054G m10277c() {
        return C2051D.f9670d;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2081o m10278b(Iterable iterable) {
        return AbstractC2081o.m10412r(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* JADX INFO: renamed from: d */
    AbstractC2054G m10279d() {
        return m10280e(AbstractC2092z.m10474b());
    }

    /* JADX INFO: renamed from: e */
    public AbstractC2054G m10280e(InterfaceC2030c interfaceC2030c) {
        return new C2072f(interfaceC2030c, this);
    }
}
