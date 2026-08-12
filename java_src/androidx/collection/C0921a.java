package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.a */
/* JADX INFO: loaded from: classes.dex */
public class C0921a extends C0929i implements Map {

    /* JADX INFO: renamed from: g */
    a f3784g;

    /* JADX INFO: renamed from: h */
    c f3785h;

    /* JADX INFO: renamed from: i */
    e f3786i;

    /* JADX INFO: renamed from: androidx.collection.a$a */
    final class a extends AbstractSet {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0921a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0921a.this.size();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$b */
    final class b extends AbstractC0925e {
        b() {
            super(C0921a.this.size());
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: a */
        protected Object mo3907a(int i3) {
            return C0921a.this.m3944f(i3);
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: b */
        protected void mo3908b(int i3) {
            C0921a.this.m3946h(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$d */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: d */
        int f3790d;

        /* JADX INFO: renamed from: e */
        int f3791e = -1;

        /* JADX INFO: renamed from: f */
        boolean f3792f;

        d() {
            this.f3790d = C0921a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3791e++;
            this.f3792f = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3792f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC2284a.m10892c(entry.getKey(), C0921a.this.m3944f(this.f3791e)) && AbstractC2284a.m10892c(entry.getValue(), C0921a.this.m3948j(this.f3791e));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f3792f) {
                return C0921a.this.m3944f(this.f3791e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f3792f) {
                return C0921a.this.m3948j(this.f3791e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3791e < this.f3790d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3792f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objM3944f = C0921a.this.m3944f(this.f3791e);
            Object objM3948j = C0921a.this.m3948j(this.f3791e);
            return (objM3944f == null ? 0 : objM3944f.hashCode()) ^ (objM3948j != null ? objM3948j.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3792f) {
                throw new IllegalStateException();
            }
            C0921a.this.m3946h(this.f3791e);
            this.f3791e--;
            this.f3790d--;
            this.f3792f = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f3792f) {
                return C0921a.this.m3947i(this.f3791e, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$f */
    final class f extends AbstractC0925e {
        f() {
            super(C0921a.this.size());
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: a */
        protected Object mo3907a(int i3) {
            return C0921a.this.m3948j(i3);
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: b */
        protected void mo3908b(int i3) {
            C0921a.this.m3946h(i3);
        }
    }

    public C0921a() {
    }

    /* JADX INFO: renamed from: l */
    static boolean m3903l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // androidx.collection.C0929i, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.C0929i, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        a aVar = this.f3784g;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f3784g = aVar2;
        return aVar2;
    }

    @Override // androidx.collection.C0929i, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    /* JADX INFO: renamed from: k */
    public boolean m3904k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f3785h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f3785h = cVar2;
        return cVar2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m3905m(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    /* JADX INFO: renamed from: n */
    public boolean m3906n(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m3944f(size2))) {
                m3946h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m3942b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.C0929i, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f3786i;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f3786i = eVar2;
        return eVar2;
    }

    public C0921a(int i3) {
        super(i3);
    }

    /* JADX INFO: renamed from: androidx.collection.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C0921a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C0921a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C0921a.this.m3904k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C0921a.m3903l(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C0921a.this.size() - 1; size >= 0; size--) {
                Object objM3944f = C0921a.this.m3944f(size);
                iHashCode += objM3944f == null ? 0 : objM3944f.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C0921a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C0921a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iM3943d = C0921a.this.m3943d(obj);
            if (iM3943d < 0) {
                return false;
            }
            C0921a.this.m3946h(iM3943d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C0921a.this.m3905m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C0921a.this.m3906n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C0921a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C0921a.this.size();
            Object[] objArr = new Object[size];
            for (int i3 = 0; i3 < size; i3++) {
                objArr[i3] = C0921a.this.m3944f(i3);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i3 = 0; i3 < size; i3++) {
                objArr[i3] = C0921a.this.m3944f(i3);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C0921a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C0921a.this.m3941a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C0921a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C0921a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM3941a = C0921a.this.m3941a(obj);
            if (iM3941a < 0) {
                return false;
            }
            C0921a.this.m3946h(iM3941a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C0921a.this.size();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < size) {
                if (collection.contains(C0921a.this.m3948j(i3))) {
                    C0921a.this.m3946h(i3);
                    i3--;
                    size--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C0921a.this.size();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < size) {
                if (!collection.contains(C0921a.this.m3948j(i3))) {
                    C0921a.this.m3946h(i3);
                    i3--;
                    size--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return C0921a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C0921a.this.size();
            Object[] objArr = new Object[size];
            for (int i3 = 0; i3 < size; i3++) {
                objArr[i3] = C0921a.this.m3948j(i3);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i3 = 0; i3 < size; i3++) {
                objArr[i3] = C0921a.this.m3948j(i3);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C0921a(C0929i c0929i) {
        super(c0929i);
    }
}
