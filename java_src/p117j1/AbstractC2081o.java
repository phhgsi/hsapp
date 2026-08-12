package p117j1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p113i1.AbstractC2035h;
import p117j1.AbstractC2080n;

/* JADX INFO: renamed from: j1.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2081o extends AbstractC2080n implements List, RandomAccess {

    /* JADX INFO: renamed from: e */
    private static final AbstractC2066T f9744e = new b(C2056I.f9671h, 0);

    /* JADX INFO: renamed from: j1.o$a */
    public static final class a extends AbstractC2080n.a {
        public a() {
            this(4);
        }

        /* JADX INFO: renamed from: e */
        public a m10419e(Object... objArr) {
            super.m10402b(objArr);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC2081o m10420f() {
            this.f9743c = true;
            return AbstractC2081o.m10406h(this.f9741a, this.f9742b);
        }

        a(int i3) {
            super(i3);
        }
    }

    /* JADX INFO: renamed from: j1.o$b */
    static class b extends AbstractC2067a {

        /* JADX INFO: renamed from: f */
        private final AbstractC2081o f9745f;

        b(AbstractC2081o abstractC2081o, int i3) {
            super(abstractC2081o.size(), i3);
            this.f9745f = abstractC2081o;
        }

        @Override // p117j1.AbstractC2067a
        /* JADX INFO: renamed from: a */
        protected Object mo10324a(int i3) {
            return this.f9745f.get(i3);
        }
    }

    /* JADX INFO: renamed from: j1.o$c */
    private static class c extends AbstractC2081o {

        /* JADX INFO: renamed from: f */
        private final transient AbstractC2081o f9746f;

        c(AbstractC2081o abstractC2081o) {
            this.f9746f = abstractC2081o;
        }

        /* JADX INFO: renamed from: u */
        private int m10421u(int i3) {
            return (size() - 1) - i3;
        }

        /* JADX INFO: renamed from: v */
        private int m10422v(int i3) {
            return size() - i3;
        }

        @Override // p117j1.AbstractC2081o, p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9746f.contains(obj);
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: f */
        boolean mo10288f() {
            return this.f9746f.mo10288f();
        }

        @Override // java.util.List
        public Object get(int i3) {
            AbstractC2035h.m10238g(i3, size());
            return this.f9746f.get(m10421u(i3));
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f9746f.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return m10421u(iLastIndexOf);
            }
            return -1;
        }

        @Override // p117j1.AbstractC2081o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f9746f.indexOf(obj);
            if (iIndexOf >= 0) {
                return m10421u(iIndexOf);
            }
            return -1;
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p117j1.AbstractC2081o
        /* JADX INFO: renamed from: q */
        public AbstractC2081o mo10416q() {
            return this.f9746f;
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractC2081o subList(int i3, int i4) {
            AbstractC2035h.m10244m(i3, i4, size());
            return this.f9746f.subList(m10422v(i4), m10422v(i3)).mo10416q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9746f.size();
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
            return super.listIterator(i3);
        }
    }

    /* JADX INFO: renamed from: j1.o$d */
    class d extends AbstractC2081o {

        /* JADX INFO: renamed from: f */
        final transient int f9747f;

        /* JADX INFO: renamed from: g */
        final transient int f9748g;

        d(int i3, int i4) {
            this.f9747f = i3;
            this.f9748g = i4;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: c */
        Object[] mo10285c() {
            return AbstractC2081o.this.mo10285c();
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: d */
        int mo10286d() {
            return AbstractC2081o.this.mo10287e() + this.f9747f + this.f9748g;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: e */
        int mo10287e() {
            return AbstractC2081o.this.mo10287e() + this.f9747f;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: f */
        boolean mo10288f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i3) {
            AbstractC2035h.m10238g(i3, this.f9748g);
            return AbstractC2081o.this.get(i3 + this.f9747f);
        }

        @Override // p117j1.AbstractC2081o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        /* JADX INFO: renamed from: s */
        public AbstractC2081o subList(int i3, int i4) {
            AbstractC2035h.m10244m(i3, i4, this.f9748g);
            AbstractC2081o abstractC2081o = AbstractC2081o.this;
            int i5 = this.f9747f;
            return abstractC2081o.subList(i3 + i5, i4 + i5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9748g;
        }

        @Override // p117j1.AbstractC2081o, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
            return super.listIterator(i3);
        }
    }

    AbstractC2081o() {
    }

    /* JADX INFO: renamed from: g */
    static AbstractC2081o m10405g(Object[] objArr) {
        return m10406h(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: h */
    static AbstractC2081o m10406h(Object[] objArr, int i3) {
        return i3 == 0 ? m10408m() : new C2056I(objArr, i3);
    }

    /* JADX INFO: renamed from: i */
    private static AbstractC2081o m10407i(Object... objArr) {
        return m10405g(AbstractC2053F.m10273b(objArr));
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC2081o m10408m() {
        return C2056I.f9671h;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2081o m10409n(Object obj, Object obj2) {
        return m10407i(obj, obj2);
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC2081o m10410o(Object obj, Object obj2, Object obj3) {
        return m10407i(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC2081o m10411p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m10407i(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2081o m10412r(Comparator comparator, Iterable iterable) {
        AbstractC2035h.m10240i(comparator);
        Object[] objArrM10462b = AbstractC2088v.m10462b(iterable);
        AbstractC2053F.m10273b(objArrM10462b);
        Arrays.sort(objArrM10462b, comparator);
        return m10405g(objArrM10462b);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p117j1.AbstractC2080n
    /* JADX INFO: renamed from: b */
    int mo10284b(Object[] objArr, int i3) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = get(i4);
        }
        return i3 + size;
    }

    @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC2090x.m10466a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = ~(~((i3 * 31) + get(i4).hashCode()));
        }
        return i3;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC2090x.m10467b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC2065S iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC2066T listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2066T listIterator(int i3) {
        AbstractC2035h.m10242k(i3, size());
        return isEmpty() ? f9744e : new b(this, i3);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC2090x.m10469d(this, obj);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC2081o mo10416q() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s */
    public AbstractC2081o subList(int i3, int i4) {
        AbstractC2035h.m10244m(i3, i4, size());
        int i5 = i4 - i3;
        return i5 == size() ? this : i5 == 0 ? m10408m() : m10418t(i3, i4);
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: t */
    AbstractC2081o m10418t(int i3, int i4) {
        return new d(i3, i4 - i3);
    }
}
