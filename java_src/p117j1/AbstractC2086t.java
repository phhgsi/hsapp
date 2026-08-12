package p117j1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2086t extends AbstractC2087u implements NavigableSet, InterfaceC2062O {

    /* JADX INFO: renamed from: f */
    final transient Comparator f9769f;

    /* JADX INFO: renamed from: g */
    transient AbstractC2086t f9770g;

    AbstractC2086t(Comparator comparator) {
        this.f9769f = comparator;
    }

    /* JADX INFO: renamed from: H */
    static int m10448H(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX INFO: renamed from: r */
    static AbstractC2086t m10449r(Comparator comparator, int i3, Object... objArr) {
        if (i3 == 0) {
            return m10452w(comparator);
        }
        AbstractC2053F.m10274c(objArr, i3);
        Arrays.sort(objArr, 0, i3, comparator);
        int i4 = 1;
        for (int i5 = 1; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (comparator.compare(obj, objArr[i4 - 1]) != 0) {
                objArr[i4] = obj;
                i4++;
            }
        }
        Arrays.fill(objArr, i4, i3, (Object) null);
        if (i4 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C2059L(AbstractC2081o.m10406h(objArr, i4), comparator);
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC2086t m10450s(Comparator comparator, Iterable iterable) {
        AbstractC2035h.m10240i(comparator);
        if (AbstractC2063P.m10323b(comparator, iterable) && (iterable instanceof AbstractC2086t)) {
            AbstractC2086t abstractC2086t = (AbstractC2086t) iterable;
            if (!abstractC2086t.mo10288f()) {
                return abstractC2086t;
            }
        }
        Object[] objArrM10462b = AbstractC2088v.m10462b(iterable);
        return m10449r(comparator, objArrM10462b.length, objArrM10462b);
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC2086t m10451t(Comparator comparator, Collection collection) {
        return m10450s(comparator, collection);
    }

    /* JADX INFO: renamed from: w */
    static C2059L m10452w(Comparator comparator) {
        return AbstractC2054G.m10277c().equals(comparator) ? C2059L.f9695i : new C2059L(AbstractC2081o.m10408m(), comparator);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        AbstractC2035h.m10240i(obj);
        AbstractC2035h.m10240i(obj2);
        AbstractC2035h.m10235d(this.f9769f.compare(obj, obj2) <= 0);
        return mo10306C(obj, z2, obj2, z3);
    }

    /* JADX INFO: renamed from: C */
    abstract AbstractC2086t mo10306C(Object obj, boolean z2, Object obj2, boolean z3);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t tailSet(Object obj, boolean z2) {
        return mo10307F(AbstractC2035h.m10240i(obj), z2);
    }

    /* JADX INFO: renamed from: F */
    abstract AbstractC2086t mo10307F(Object obj, boolean z2);

    /* JADX INFO: renamed from: G */
    int m10457G(Object obj, Object obj2) {
        return m10448H(this.f9769f, obj, obj2);
    }

    @Override // java.util.SortedSet, p117j1.InterfaceC2062O
    public Comparator comparator() {
        return this.f9769f;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: u */
    abstract AbstractC2086t mo10314u();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t descendingSet() {
        AbstractC2086t abstractC2086t = this.f9770g;
        if (abstractC2086t != null) {
            return abstractC2086t;
        }
        AbstractC2086t abstractC2086tMo10314u = mo10314u();
        this.f9770g = abstractC2086tMo10314u;
        abstractC2086tMo10314u.f9770g = this;
        return abstractC2086tMo10314u;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC2086t headSet(Object obj, boolean z2) {
        return mo10315z(AbstractC2035h.m10240i(obj), z2);
    }

    /* JADX INFO: renamed from: z */
    abstract AbstractC2086t mo10315z(Object obj, boolean z2);
}
