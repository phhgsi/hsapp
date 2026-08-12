package p117j1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.L */
/* JADX INFO: loaded from: classes.dex */
final class C2059L extends AbstractC2086t {

    /* JADX INFO: renamed from: i */
    static final C2059L f9695i = new C2059L(AbstractC2081o.m10408m(), AbstractC2054G.m10277c());

    /* JADX INFO: renamed from: h */
    final transient AbstractC2081o f9696h;

    C2059L(AbstractC2081o abstractC2081o, Comparator comparator) {
        super(comparator);
        this.f9696h = abstractC2081o;
    }

    /* JADX INFO: renamed from: N */
    private int m10305N(Object obj) {
        return Collections.binarySearch(this.f9696h, obj, m10313O());
    }

    @Override // p117j1.AbstractC2086t
    /* JADX INFO: renamed from: C */
    AbstractC2086t mo10306C(Object obj, boolean z2, Object obj2, boolean z3) {
        return mo10307F(obj, z2).mo10315z(obj2, z3);
    }

    @Override // p117j1.AbstractC2086t
    /* JADX INFO: renamed from: F */
    AbstractC2086t mo10307F(Object obj, boolean z2) {
        return m10309J(m10312M(obj, z2), size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC2065S descendingIterator() {
        return this.f9696h.mo10416q().iterator();
    }

    /* JADX INFO: renamed from: J */
    C2059L m10309J(int i3, int i4) {
        return (i3 == 0 && i4 == size()) ? this : i3 < i4 ? new C2059L(this.f9696h.subList(i3, i4), this.f9769f) : AbstractC2086t.m10452w(this.f9769f);
    }

    /* JADX INFO: renamed from: K */
    int m10310K(Object obj, boolean z2) {
        int iBinarySearch = Collections.binarySearch(this.f9696h, AbstractC2035h.m10240i(obj), comparator());
        return iBinarySearch >= 0 ? z2 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC2065S iterator() {
        return this.f9696h.iterator();
    }

    /* JADX INFO: renamed from: M */
    int m10312M(Object obj, boolean z2) {
        int iBinarySearch = Collections.binarySearch(this.f9696h, AbstractC2035h.m10240i(obj), comparator());
        return iBinarySearch >= 0 ? z2 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    /* JADX INFO: renamed from: O */
    Comparator m10313O() {
        return this.f9769f;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: b */
    int mo10284b(Object[] objArr, int i3) {
        return this.f9696h.mo10284b(objArr, i3);
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: c */
    Object[] mo10285c() {
        return this.f9696h.mo10285c();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iM10312M = m10312M(obj, true);
        if (iM10312M == size()) {
            return null;
        }
        return this.f9696h.get(iM10312M);
    }

    @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (m10305N(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC2050C) {
            collection = ((InterfaceC2050C) collection).m10268a();
        }
        if (!AbstractC2063P.m10323b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC2065S it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iM10457G = m10457G(next2, next);
                if (iM10457G < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iM10457G == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iM10457G > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: d */
    int mo10286d() {
        return this.f9696h.mo10286d();
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: e */
    int mo10287e() {
        return this.f9696h.mo10287e();
    }

    @Override // p117j1.AbstractC2084r, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!AbstractC2063P.m10323b(this.f9769f, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC2065S it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || m10457G(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: f */
    boolean mo10288f() {
        return this.f9696h.mo10288f();
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f9696h.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int iM10310K = m10310K(obj, true) - 1;
        if (iM10310K == -1) {
            return null;
        }
        return this.f9696h.get(iM10310K);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int iM10312M = m10312M(obj, false);
        if (iM10312M == size()) {
            return null;
        }
        return this.f9696h.get(iM10312M);
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f9696h.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int iM10310K = m10310K(obj, false) - 1;
        if (iM10310K == -1) {
            return null;
        }
        return this.f9696h.get(iM10310K);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f9696h.size();
    }

    @Override // p117j1.AbstractC2086t
    /* JADX INFO: renamed from: u */
    AbstractC2086t mo10314u() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f9769f);
        return isEmpty() ? AbstractC2086t.m10452w(comparatorReverseOrder) : new C2059L(this.f9696h.mo10416q(), comparatorReverseOrder);
    }

    @Override // p117j1.AbstractC2086t
    /* JADX INFO: renamed from: z */
    AbstractC2086t mo10315z(Object obj, boolean z2) {
        return m10309J(0, m10310K(obj, z2));
    }
}
