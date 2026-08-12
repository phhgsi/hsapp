package p117j1;

import java.io.Serializable;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.D */
/* JADX INFO: loaded from: classes.dex */
final class C2051D extends AbstractC2054G implements Serializable {

    /* JADX INFO: renamed from: d */
    static final C2051D f9670d = new C2051D();

    private C2051D() {
    }

    @Override // p117j1.AbstractC2054G, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC2035h.m10240i(comparable);
        AbstractC2035h.m10240i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
