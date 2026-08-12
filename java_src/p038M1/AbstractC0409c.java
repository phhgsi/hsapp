package p038M1;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: M1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409c extends AbstractC0408b implements List, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    public static final a f1524d = new a(null);

    /* JADX INFO: renamed from: M1.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m1410a(int i3, int i4) {
            if (i3 < 0 || i3 >= i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1411b(int i3, int i4) {
            if (i3 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m1412c(int i3, int i4, int i5) {
            if (i3 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
            }
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
        }

        /* JADX INFO: renamed from: d */
        public final int m1413d(int i3, int i4) {
            int i5 = i3 + (i3 >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 <= 0) {
                return i5;
            }
            if (i4 > 2147483639) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m1414e(Collection collection, Collection collection2) {
            AbstractC0606k.m2145e(collection, "c");
            AbstractC0606k.m2145e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!AbstractC0606k.m2141a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final int m1415f(Collection collection) {
            AbstractC0606k.m2145e(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: M1.c$b */
    private class b implements Iterator, InterfaceC0622a {

        /* JADX INFO: renamed from: d */
        private int f1525d;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        protected final int m1416a() {
            return this.f1525d;
        }

        /* JADX INFO: renamed from: b */
        protected final void m1417b(int i3) {
            this.f1525d = i3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1525d < AbstractC0409c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0409c abstractC0409c = AbstractC0409c.this;
            int i3 = this.f1525d;
            this.f1525d = i3 + 1;
            return abstractC0409c.get(i3);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: M1.c$c */
    private class c extends b implements ListIterator, InterfaceC0622a {
        public c(int i3) {
            super();
            AbstractC0409c.f1524d.m1411b(i3, AbstractC0409c.this.size());
            m1417b(i3);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m1416a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m1416a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0409c abstractC0409c = AbstractC0409c.this;
            m1417b(m1416a() - 1);
            return abstractC0409c.get(m1416a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m1416a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: M1.c$d */
    private static final class d extends AbstractC0409c implements RandomAccess {

        /* JADX INFO: renamed from: e */
        private final AbstractC0409c f1528e;

        /* JADX INFO: renamed from: f */
        private final int f1529f;

        /* JADX INFO: renamed from: g */
        private int f1530g;

        public d(AbstractC0409c abstractC0409c, int i3, int i4) {
            AbstractC0606k.m2145e(abstractC0409c, "list");
            this.f1528e = abstractC0409c;
            this.f1529f = i3;
            AbstractC0409c.f1524d.m1412c(i3, i4, abstractC0409c.size());
            this.f1530g = i4 - i3;
        }

        @Override // p038M1.AbstractC0408b
        /* JADX INFO: renamed from: c */
        public int mo1409c() {
            return this.f1530g;
        }

        @Override // p038M1.AbstractC0409c, java.util.List
        public Object get(int i3) {
            AbstractC0409c.f1524d.m1410a(i3, this.f1530g);
            return this.f1528e.get(this.f1529f + i3);
        }

        @Override // p038M1.AbstractC0409c, java.util.List
        public List subList(int i3, int i4) {
            AbstractC0409c.f1524d.m1412c(i3, i4, this.f1530g);
            AbstractC0409c abstractC0409c = this.f1528e;
            int i5 = this.f1529f;
            return new d(abstractC0409c, i3 + i5, i5 + i4);
        }
    }

    protected AbstractC0409c() {
    }

    @Override // java.util.List
    public void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f1524d.m1414e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract Object get(int i3);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f1524d.m1415f(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (AbstractC0606k.m2141a(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC0606k.m2141a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i3, int i4) {
        return new d(this, i3, i4);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i3) {
        return new c(i3);
    }
}
