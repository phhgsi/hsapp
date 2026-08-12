package p038M1;

import java.util.Collection;
import java.util.Iterator;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0601f;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0408b implements Collection, InterfaceC0622a {
    protected AbstractC0408b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final CharSequence m1408d(AbstractC0408b abstractC0408b, Object obj) {
        return obj == abstractC0408b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo1409c();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC0606k.m2141a(it.next(), obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo1409c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC0601f.m2139a(this);
    }

    public String toString() {
        return AbstractC0429w.m1470q(this, ", ", "[", "]", 0, null, new InterfaceC0577l() { // from class: M1.a
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return AbstractC0408b.m1408d(this.f1523d, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        return AbstractC0601f.m2140b(this, objArr);
    }
}
