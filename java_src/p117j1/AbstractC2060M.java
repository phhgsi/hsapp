package p117j1;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2060M {

    /* JADX INFO: renamed from: j1.M$a */
    class a extends b {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Set f9697d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Set f9698e;

        /* JADX INFO: renamed from: j1.M$a$a, reason: collision with other inner class name */
        class C2630a extends AbstractC2068b {

            /* JADX INFO: renamed from: f */
            final Iterator f9699f;

            /* JADX INFO: renamed from: g */
            final Iterator f9700g;

            C2630a() {
                this.f9699f = a.this.f9697d.iterator();
                this.f9700g = a.this.f9698e.iterator();
            }

            @Override // p117j1.AbstractC2068b
            /* JADX INFO: renamed from: a */
            protected Object mo10320a() {
                if (this.f9699f.hasNext()) {
                    return this.f9699f.next();
                }
                while (this.f9700g.hasNext()) {
                    Object next = this.f9700g.next();
                    if (!a.this.f9697d.contains(next)) {
                        return next;
                    }
                }
                return m10326b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f9697d = set;
            this.f9698e = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2065S iterator() {
            return new C2630a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9697d.contains(obj) || this.f9698e.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f9697d.isEmpty() && this.f9698e.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f9697d.size();
            Iterator it = this.f9698e.iterator();
            while (it.hasNext()) {
                if (!this.f9697d.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: renamed from: j1.M$b */
    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: b */
        public abstract AbstractC2065S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m10316a(Set set, Object obj) {
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

    /* JADX INFO: renamed from: b */
    static int m10317b(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public static b m10318c(Set set, Set set2) {
        AbstractC2035h.m10241j(set, "set1");
        AbstractC2035h.m10241j(set2, "set2");
        return new a(set, set2);
    }
}
