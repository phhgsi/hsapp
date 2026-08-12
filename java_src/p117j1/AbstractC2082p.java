package p117j1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import p117j1.AbstractC2080n;

/* JADX INFO: renamed from: j1.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2082p implements Map, Serializable {

    /* JADX INFO: renamed from: g */
    static final Map.Entry[] f9750g = new Map.Entry[0];

    /* JADX INFO: renamed from: d */
    private transient AbstractC2084r f9751d;

    /* JADX INFO: renamed from: e */
    private transient AbstractC2084r f9752e;

    /* JADX INFO: renamed from: f */
    private transient AbstractC2080n f9753f;

    /* JADX INFO: renamed from: j1.p$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        Comparator f9754a;

        /* JADX INFO: renamed from: b */
        Object[] f9755b;

        /* JADX INFO: renamed from: c */
        int f9756c = 0;

        /* JADX INFO: renamed from: d */
        boolean f9757d = false;

        /* JADX INFO: renamed from: e */
        C2631a f9758e;

        /* JADX INFO: renamed from: j1.p$a$a, reason: collision with other inner class name */
        static final class C2631a {

            /* JADX INFO: renamed from: a */
            private final Object f9759a;

            /* JADX INFO: renamed from: b */
            private final Object f9760b;

            /* JADX INFO: renamed from: c */
            private final Object f9761c;

            C2631a(Object obj, Object obj2, Object obj3) {
                this.f9759a = obj;
                this.f9760b = obj2;
                this.f9761c = obj3;
            }

            /* JADX INFO: renamed from: a */
            IllegalArgumentException m10433a() {
                String strValueOf = String.valueOf(this.f9759a);
                String strValueOf2 = String.valueOf(this.f9760b);
                String strValueOf3 = String.valueOf(this.f9759a);
                String strValueOf4 = String.valueOf(this.f9761c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        a(int i3) {
            this.f9755b = new Object[i3 * 2];
        }

        /* JADX INFO: renamed from: a */
        private AbstractC2082p m10427a(boolean z2) {
            Object[] objArrM10429d;
            C2631a c2631a;
            C2631a c2631a2;
            if (z2 && (c2631a2 = this.f9758e) != null) {
                throw c2631a2.m10433a();
            }
            int length = this.f9756c;
            if (this.f9754a == null) {
                objArrM10429d = this.f9755b;
            } else {
                if (this.f9757d) {
                    this.f9755b = Arrays.copyOf(this.f9755b, length * 2);
                }
                objArrM10429d = this.f9755b;
                if (!z2) {
                    objArrM10429d = m10429d(objArrM10429d, this.f9756c);
                    if (objArrM10429d.length < this.f9755b.length) {
                        length = objArrM10429d.length >>> 1;
                    }
                }
                m10430f(objArrM10429d, length, this.f9754a);
            }
            this.f9757d = true;
            C2057J c2057jM10289h = C2057J.m10289h(length, objArrM10429d, this);
            if (!z2 || (c2631a = this.f9758e) == null) {
                return c2057jM10289h;
            }
            throw c2631a.m10433a();
        }

        /* JADX INFO: renamed from: c */
        private void m10428c(int i3) {
            int i4 = i3 * 2;
            Object[] objArr = this.f9755b;
            if (i4 > objArr.length) {
                this.f9755b = Arrays.copyOf(objArr, AbstractC2080n.b.m10404a(objArr.length, i4));
                this.f9757d = false;
            }
        }

        /* JADX INFO: renamed from: d */
        private Object[] m10429d(Object[] objArr, int i3) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                Object obj = objArr[i4 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i4);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i3 - bitSet.cardinality()) * 2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3 * 2) {
                if (bitSet.get(i5 >>> 1)) {
                    i5 += 2;
                } else {
                    int i7 = i6 + 1;
                    int i8 = i5 + 1;
                    Object obj2 = objArr[i5];
                    Objects.requireNonNull(obj2);
                    objArr2[i6] = obj2;
                    i6 += 2;
                    i5 += 2;
                    Object obj3 = objArr[i8];
                    Objects.requireNonNull(obj3);
                    objArr2[i7] = obj3;
                }
            }
            return objArr2;
        }

        /* JADX INFO: renamed from: f */
        static void m10430f(Object[] objArr, int i3, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i4 * 2;
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i5 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i4] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i3, AbstractC2054G.m10276a(comparator).m10280e(AbstractC2092z.m10476d()));
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = i6 * 2;
                objArr[i7] = entryArr[i6].getKey();
                objArr[i7 + 1] = entryArr[i6].getValue();
            }
        }

        /* JADX INFO: renamed from: b */
        public AbstractC2082p m10431b() {
            return m10427a(true);
        }

        /* JADX INFO: renamed from: e */
        public a m10432e(Object obj, Object obj2) {
            m10428c(this.f9756c + 1);
            AbstractC2073g.m10329a(obj, obj2);
            Object[] objArr = this.f9755b;
            int i3 = this.f9756c;
            objArr[i3 * 2] = obj;
            objArr[(i3 * 2) + 1] = obj2;
            this.f9756c = i3 + 1;
            return this;
        }
    }

    AbstractC2082p() {
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC2082p m10423f() {
        return C2057J.f9674k;
    }

    /* JADX INFO: renamed from: a */
    abstract AbstractC2084r mo10292a();

    /* JADX INFO: renamed from: b */
    abstract AbstractC2084r mo10293b();

    /* JADX INFO: renamed from: c */
    abstract AbstractC2080n mo10294c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC2084r entrySet() {
        AbstractC2084r abstractC2084r = this.f9751d;
        if (abstractC2084r != null) {
            return abstractC2084r;
        }
        AbstractC2084r abstractC2084rMo10292a = mo10292a();
        this.f9751d = abstractC2084rMo10292a;
        return abstractC2084rMo10292a;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2084r keySet() {
        AbstractC2084r abstractC2084r = this.f9752e;
        if (abstractC2084r != null) {
            return abstractC2084r;
        }
        AbstractC2084r abstractC2084rMo10293b = mo10293b();
        this.f9752e = abstractC2084rMo10293b;
        return abstractC2084rMo10293b;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC2092z.m10473a(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2080n values() {
        AbstractC2080n abstractC2080n = this.f9753f;
        if (abstractC2080n != null) {
            return abstractC2080n;
        }
        AbstractC2080n abstractC2080nMo10294c = mo10294c();
        this.f9753f = abstractC2080nMo10294c;
        return abstractC2080nMo10294c;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC2060M.m10317b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return AbstractC2092z.m10475c(this);
    }
}
