package p117j1;

import java.io.Serializable;
import java.util.Comparator;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.k */
/* JADX INFO: loaded from: classes.dex */
final class C2077k extends AbstractC2054G implements Serializable {

    /* JADX INFO: renamed from: d */
    final Comparator f9738d;

    C2077k(Comparator comparator) {
        this.f9738d = (Comparator) AbstractC2035h.m10240i(comparator);
    }

    @Override // p117j1.AbstractC2054G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9738d.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2077k) {
            return this.f9738d.equals(((C2077k) obj).f9738d);
        }
        return false;
    }

    public int hashCode() {
        return this.f9738d.hashCode();
    }

    public String toString() {
        return this.f9738d.toString();
    }
}
