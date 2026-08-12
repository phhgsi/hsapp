package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p038M1.AbstractC0413g;
import p038M1.AbstractC0419m;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p074Y1.InterfaceC0622a;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0922b implements Collection, Set, InterfaceC0622a {

    /* JADX INFO: renamed from: d */
    private int[] f3796d;

    /* JADX INFO: renamed from: e */
    private Object[] f3797e;

    /* JADX INFO: renamed from: f */
    private int f3798f;

    /* JADX INFO: renamed from: androidx.collection.b$a */
    private final class a extends AbstractC0925e {
        public a() {
            super(C0922b.this.m3914f());
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: a */
        protected Object mo3907a(int i3) {
            return C0922b.this.m3919k(i3);
        }

        @Override // androidx.collection.AbstractC0925e
        /* JADX INFO: renamed from: b */
        protected void mo3908b(int i3) {
            C0922b.this.m3915g(i3);
        }
    }

    public C0922b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i3;
        int iM3923c;
        int iM3914f = m3914f();
        if (obj == null) {
            iM3923c = AbstractC0924d.m3924d(this);
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iM3923c = AbstractC0924d.m3923c(this, obj, iHashCode);
        }
        if (iM3923c >= 0) {
            return false;
        }
        int i4 = ~iM3923c;
        if (iM3914f >= m3912d().length) {
            int i5 = 8;
            if (iM3914f >= 8) {
                i5 = (iM3914f >> 1) + iM3914f;
            } else if (iM3914f < 4) {
                i5 = 4;
            }
            int[] iArrM3912d = m3912d();
            Object[] objArrM3911c = m3911c();
            AbstractC0924d.m3921a(this, i5);
            if (iM3914f != m3914f()) {
                throw new ConcurrentModificationException();
            }
            if (!(m3912d().length == 0)) {
                AbstractC0413g.m1439g(iArrM3912d, m3912d(), 0, 0, iArrM3912d.length, 6, null);
                AbstractC0413g.m1440h(objArrM3911c, m3911c(), 0, 0, objArrM3911c.length, 6, null);
            }
        }
        if (i4 < iM3914f) {
            int i6 = i4 + 1;
            AbstractC0413g.m1436d(m3912d(), m3912d(), i6, i4, iM3914f);
            AbstractC0413g.m1438f(m3911c(), m3911c(), i6, i4, iM3914f);
        }
        if (iM3914f != m3914f() || i4 >= m3912d().length) {
            throw new ConcurrentModificationException();
        }
        m3912d()[i4] = i3;
        m3911c()[i4] = obj;
        m3918j(m3914f() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        m3910b(m3914f() + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final void m3910b(int i3) {
        int iM3914f = m3914f();
        if (m3912d().length < i3) {
            int[] iArrM3912d = m3912d();
            Object[] objArrM3911c = m3911c();
            AbstractC0924d.m3921a(this, i3);
            if (m3914f() > 0) {
                AbstractC0413g.m1439g(iArrM3912d, m3912d(), 0, 0, m3914f(), 6, null);
                AbstractC0413g.m1440h(objArrM3911c, m3911c(), 0, 0, m3914f(), 6, null);
            }
        }
        if (m3914f() != iM3914f) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m3911c() {
        return this.f3797e;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m3914f() != 0) {
            m3917i(AbstractC2284a.f10460a);
            m3916h(AbstractC2284a.f10462c);
            m3918j(0);
        }
        if (m3914f() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int[] m3912d() {
        return this.f3796d;
    }

    /* JADX INFO: renamed from: e */
    public int m3913e() {
        return this.f3798f;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iM3914f = m3914f();
            for (int i3 = 0; i3 < iM3914f; i3++) {
                if (!((Set) obj).contains(m3919k(i3))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m3914f() {
        return this.f3798f;
    }

    /* JADX INFO: renamed from: g */
    public final Object m3915g(int i3) {
        int i4;
        Object[] objArr;
        int iM3914f = m3914f();
        Object obj = m3911c()[i3];
        if (iM3914f <= 1) {
            clear();
            return obj;
        }
        int i5 = iM3914f - 1;
        if (m3912d().length <= 8 || m3914f() >= m3912d().length / 3) {
            if (i3 < i5) {
                int i6 = i3 + 1;
                AbstractC0413g.m1436d(m3912d(), m3912d(), i3, i6, iM3914f);
                AbstractC0413g.m1438f(m3911c(), m3911c(), i3, i6, iM3914f);
            }
            m3911c()[i5] = null;
        } else {
            int iM3914f2 = m3914f() > 8 ? m3914f() + (m3914f() >> 1) : 8;
            int[] iArrM3912d = m3912d();
            Object[] objArrM3911c = m3911c();
            AbstractC0924d.m3921a(this, iM3914f2);
            if (i3 > 0) {
                AbstractC0413g.m1439g(iArrM3912d, m3912d(), 0, 0, i3, 6, null);
                objArr = objArrM3911c;
                AbstractC0413g.m1440h(objArr, m3911c(), 0, 0, i3, 6, null);
                i4 = i3;
            } else {
                i4 = i3;
                objArr = objArrM3911c;
            }
            if (i4 < i5) {
                int i7 = i4 + 1;
                AbstractC0413g.m1436d(iArrM3912d, m3912d(), i4, i7, iM3914f);
                AbstractC0413g.m1438f(objArr, m3911c(), i4, i7, iM3914f);
            }
        }
        if (iM3914f != m3914f()) {
            throw new ConcurrentModificationException();
        }
        m3918j(i5);
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m3916h(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<set-?>");
        this.f3797e = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrM3912d = m3912d();
        int iM3914f = m3914f();
        int i3 = 0;
        for (int i4 = 0; i4 < iM3914f; i4++) {
            i3 += iArrM3912d[i4];
        }
        return i3;
    }

    /* JADX INFO: renamed from: i */
    public final void m3917i(int[] iArr) {
        AbstractC0606k.m2145e(iArr, "<set-?>");
        this.f3796d = iArr;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC0924d.m3924d(this) : AbstractC0924d.m3923c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m3914f() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: j */
    public final void m3918j(int i3) {
        this.f3798f = i3;
    }

    /* JADX INFO: renamed from: k */
    public final Object m3919k(int i3) {
        return m3911c()[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m3915g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        AbstractC0606k.m2145e(collection, "elements");
        boolean z2 = false;
        for (int iM3914f = m3914f() - 1; -1 < iM3914f; iM3914f--) {
            if (!AbstractC0419m.m1464k(collection, m3911c()[iM3914f])) {
                m3915g(iM3914f);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m3913e();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0413g.m1441i(this.f3797e, 0, this.f3798f);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m3914f() * 14);
        sb.append('{');
        int iM3914f = m3914f();
        for (int i3 = 0; i3 < iM3914f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objM3919k = m3919k(i3);
            if (objM3919k != this) {
                sb.append(objM3919k);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C0922b(int i3) {
        this.f3796d = AbstractC2284a.f10460a;
        this.f3797e = AbstractC2284a.f10462c;
        if (i3 > 0) {
            AbstractC0924d.m3921a(this, i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "array");
        Object[] objArrM3920a = AbstractC0923c.m3920a(objArr, this.f3798f);
        AbstractC0413g.m1438f(this.f3797e, objArrM3920a, 0, 0, this.f3798f);
        AbstractC0606k.m2144d(objArrM3920a, "result");
        return objArrM3920a;
    }

    public /* synthetic */ C0922b(int i3, int i4, AbstractC0602g abstractC0602g) {
        this((i4 & 1) != 0 ? 0 : i3);
    }
}
