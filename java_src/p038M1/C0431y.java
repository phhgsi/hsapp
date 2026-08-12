package p038M1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p071X1.AbstractC0601f;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0431y implements List, Serializable, RandomAccess, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    public static final C0431y f1540d = new C0431y();

    private C0431y() {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public boolean m1477b(Void r2) {
        AbstractC0606k.m2145e(r2, "element");
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(int i3) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i3 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m1477b((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        return collection.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public int m1479d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m1480e(Void r2) {
        AbstractC0606k.m2145e(r2, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public int m1481f(Void r2) {
        AbstractC0606k.m2145e(r2, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return m1480e((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C0430x.f1539d;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return m1481f((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return C0430x.f1539d;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m1479d();
    }

    @Override // java.util.List
    public List subList(int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC0601f.m2139a(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i3) {
        if (i3 == 0) {
            return C0430x.f1539d;
        }
        throw new IndexOutOfBoundsException("Index: " + i3);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        return AbstractC0601f.m2140b(this, objArr);
    }
}
