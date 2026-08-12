package p038M1;

import java.util.Collection;
import java.util.Iterator;
import p071X1.AbstractC0597b;
import p071X1.AbstractC0601f;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.e */
/* JADX INFO: loaded from: classes.dex */
final class C0411e implements Collection, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    private final Object[] f1531d;

    /* JADX INFO: renamed from: e */
    private final boolean f1532e;

    public C0411e(Object[] objArr, boolean z2) {
        AbstractC0606k.m2145e(objArr, "values");
        this.f1531d = objArr;
        this.f1532e = z2;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public int m1420b() {
        return this.f1531d.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC0417k.m1444l(this.f1531d, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f1531d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC0597b.m2130a(this.f1531d);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m1420b();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        return AbstractC0601f.m2140b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0420n.m1454a(this.f1531d, this.f1532e);
    }
}
