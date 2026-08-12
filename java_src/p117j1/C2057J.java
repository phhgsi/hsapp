package p117j1;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p113i1.AbstractC2035h;
import p117j1.AbstractC2082p;

/* JADX INFO: renamed from: j1.J */
/* JADX INFO: loaded from: classes.dex */
final class C2057J extends AbstractC2082p {

    /* JADX INFO: renamed from: k */
    static final AbstractC2082p f9674k = new C2057J(null, new Object[0], 0);

    /* JADX INFO: renamed from: h */
    private final transient Object f9675h;

    /* JADX INFO: renamed from: i */
    final transient Object[] f9676i;

    /* JADX INFO: renamed from: j */
    private final transient int f9677j;

    /* JADX INFO: renamed from: j1.J$a */
    static class a extends AbstractC2084r {

        /* JADX INFO: renamed from: f */
        private final transient AbstractC2082p f9678f;

        /* JADX INFO: renamed from: g */
        private final transient Object[] f9679g;

        /* JADX INFO: renamed from: h */
        private final transient int f9680h;

        /* JADX INFO: renamed from: i */
        private final transient int f9681i;

        /* JADX INFO: renamed from: j1.J$a$a, reason: collision with other inner class name */
        class C2629a extends AbstractC2081o {
            C2629a() {
            }

            @Override // p117j1.AbstractC2080n
            /* JADX INFO: renamed from: f */
            public boolean mo10288f() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f9681i;
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i3) {
                AbstractC2035h.m10238g(i3, a.this.f9681i);
                int i4 = i3 * 2;
                Object obj = a.this.f9679g[a.this.f9680h + i4];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f9679g[i4 + (a.this.f9680h ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(AbstractC2082p abstractC2082p, Object[] objArr, int i3, int i4) {
            this.f9678f = abstractC2082p;
            this.f9679g = objArr;
            this.f9680h = i3;
            this.f9681i = i4;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: b */
        int mo10284b(Object[] objArr, int i3) {
            return mo10301g().mo10284b(objArr, i3);
        }

        @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f9678f.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: f */
        boolean mo10288f() {
            return true;
        }

        @Override // p117j1.AbstractC2084r
        /* JADX INFO: renamed from: k */
        AbstractC2081o mo10298k() {
            return new C2629a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9681i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public AbstractC2065S iterator() {
            return mo10301g().iterator();
        }
    }

    /* JADX INFO: renamed from: j1.J$b */
    static final class b extends AbstractC2084r {

        /* JADX INFO: renamed from: f */
        private final transient AbstractC2082p f9683f;

        /* JADX INFO: renamed from: g */
        private final transient AbstractC2081o f9684g;

        b(AbstractC2082p abstractC2082p, AbstractC2081o abstractC2081o) {
            this.f9683f = abstractC2082p;
            this.f9684g = abstractC2081o;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: b */
        int mo10284b(Object[] objArr, int i3) {
            return mo10301g().mo10284b(objArr, i3);
        }

        @Override // p117j1.AbstractC2080n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9683f.get(obj) != null;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: f */
        boolean mo10288f() {
            return true;
        }

        @Override // p117j1.AbstractC2084r
        /* JADX INFO: renamed from: g */
        public AbstractC2081o mo10301g() {
            return this.f9684g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC2065S iterator() {
            return mo10301g().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9683f.size();
        }
    }

    /* JADX INFO: renamed from: j1.J$c */
    static final class c extends AbstractC2081o {

        /* JADX INFO: renamed from: f */
        private final transient Object[] f9685f;

        /* JADX INFO: renamed from: g */
        private final transient int f9686g;

        /* JADX INFO: renamed from: h */
        private final transient int f9687h;

        c(Object[] objArr, int i3, int i4) {
            this.f9685f = objArr;
            this.f9686g = i3;
            this.f9687h = i4;
        }

        @Override // p117j1.AbstractC2080n
        /* JADX INFO: renamed from: f */
        boolean mo10288f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i3) {
            AbstractC2035h.m10238g(i3, this.f9687h);
            Object obj = this.f9685f[(i3 * 2) + this.f9686g];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9687h;
        }
    }

    private C2057J(Object obj, Object[] objArr, int i3) {
        this.f9675h = obj;
        this.f9676i = objArr;
        this.f9677j = i3;
    }

    /* JADX INFO: renamed from: h */
    static C2057J m10289h(int i3, Object[] objArr, AbstractC2082p.a aVar) {
        if (i3 == 0) {
            return (C2057J) f9674k;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC2073g.m10329a(obj, obj2);
            return new C2057J(null, objArr, 1);
        }
        AbstractC2035h.m10242k(i3, objArr.length >> 1);
        Object objM10290i = m10290i(objArr, i3, AbstractC2084r.m10435h(i3), 0);
        if (objM10290i instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM10290i;
            AbstractC2082p.a.C2631a c2631a = (AbstractC2082p.a.C2631a) objArr2[2];
            if (aVar == null) {
                throw c2631a.m10433a();
            }
            aVar.f9758e = c2631a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM10290i = obj3;
            i3 = iIntValue;
        }
        return new C2057J(objM10290i, objArr, i3);
    }

    /* JADX INFO: renamed from: i */
    private static Object m10290i(Object[] objArr, int i3, int i4, int i5) {
        int i6;
        AbstractC2082p.a.C2631a c2631a = null;
        int i7 = 1;
        if (i3 == 1) {
            Object obj = objArr[i5];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC2073g.m10329a(obj, obj2);
            return null;
        }
        int i8 = i4 - 1;
        if (i4 <= 128) {
            byte[] bArr = new byte[i4];
            Arrays.fill(bArr, (byte) -1);
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                int i11 = (i10 * 2) + i5;
                int i12 = (i9 * 2) + i5;
                Object obj3 = objArr[i11];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i11 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC2073g.m10329a(obj3, obj4);
                int iM10399b = AbstractC2079m.m10399b(obj3.hashCode());
                while (true) {
                    int i13 = iM10399b & i8;
                    int i14 = bArr[i13] & 255;
                    if (i14 == 255) {
                        bArr[i13] = (byte) i12;
                        if (i9 < i10) {
                            objArr[i12] = obj3;
                            objArr[i12 ^ 1] = obj4;
                        }
                        i9++;
                    } else {
                        if (obj3.equals(objArr[i14])) {
                            int i15 = i14 ^ 1;
                            Object obj5 = objArr[i15];
                            Objects.requireNonNull(obj5);
                            c2631a = new AbstractC2082p.a.C2631a(obj3, obj4, obj5);
                            objArr[i15] = obj4;
                            break;
                        }
                        iM10399b = i13 + 1;
                    }
                }
            }
            return i9 == i3 ? bArr : new Object[]{bArr, Integer.valueOf(i9), c2631a};
        }
        if (i4 <= 32768) {
            short[] sArr = new short[i4];
            Arrays.fill(sArr, (short) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i3; i17++) {
                int i18 = (i17 * 2) + i5;
                int i19 = (i16 * 2) + i5;
                Object obj6 = objArr[i18];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC2073g.m10329a(obj6, obj7);
                int iM10399b2 = AbstractC2079m.m10399b(obj6.hashCode());
                while (true) {
                    int i20 = iM10399b2 & i8;
                    int i21 = sArr[i20] & 65535;
                    if (i21 == 65535) {
                        sArr[i20] = (short) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj6;
                            objArr[i19 ^ 1] = obj7;
                        }
                        i16++;
                    } else {
                        if (obj6.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj8 = objArr[i22];
                            Objects.requireNonNull(obj8);
                            c2631a = new AbstractC2082p.a.C2631a(obj6, obj7, obj8);
                            objArr[i22] = obj7;
                            break;
                        }
                        iM10399b2 = i20 + 1;
                    }
                }
            }
            return i16 == i3 ? sArr : new Object[]{sArr, Integer.valueOf(i16), c2631a};
        }
        int[] iArr = new int[i4];
        Arrays.fill(iArr, -1);
        int i23 = 0;
        int i24 = 0;
        while (i23 < i3) {
            int i25 = (i23 * 2) + i5;
            int i26 = (i24 * 2) + i5;
            Object obj9 = objArr[i25];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i25 ^ i7];
            Objects.requireNonNull(obj10);
            AbstractC2073g.m10329a(obj9, obj10);
            int iM10399b3 = AbstractC2079m.m10399b(obj9.hashCode());
            while (true) {
                int i27 = iM10399b3 & i8;
                int i28 = iArr[i27];
                if (i28 == -1) {
                    iArr[i27] = i26;
                    if (i24 < i23) {
                        objArr[i26] = obj9;
                        objArr[i26 ^ 1] = obj10;
                    }
                    i24++;
                    i6 = i7;
                } else {
                    i6 = i7;
                    if (obj9.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj11 = objArr[i29];
                        Objects.requireNonNull(obj11);
                        c2631a = new AbstractC2082p.a.C2631a(obj9, obj10, obj11);
                        objArr[i29] = obj10;
                        break;
                    }
                    iM10399b3 = i27 + 1;
                    i7 = i6;
                }
            }
            i23++;
            i7 = i6;
        }
        int i30 = i7;
        if (i24 == i3) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i30] = Integer.valueOf(i24);
        objArr2[2] = c2631a;
        return objArr2;
    }

    /* JADX INFO: renamed from: j */
    static Object m10291j(Object obj, Object[] objArr, int i3, int i4, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i3 == 1) {
            Object obj3 = objArr[i4];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i4 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM10399b = AbstractC2079m.m10399b(obj2.hashCode());
            while (true) {
                int i5 = iM10399b & length;
                int i6 = bArr[i5] & 255;
                if (i6 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM10399b = i5 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM10399b2 = AbstractC2079m.m10399b(obj2.hashCode());
            while (true) {
                int i7 = iM10399b2 & length2;
                int i8 = sArr[i7] & 65535;
                if (i8 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM10399b2 = i7 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM10399b3 = AbstractC2079m.m10399b(obj2.hashCode());
            while (true) {
                int i9 = iM10399b3 & length3;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iM10399b3 = i9 + 1;
            }
        }
    }

    @Override // p117j1.AbstractC2082p
    /* JADX INFO: renamed from: a */
    AbstractC2084r mo10292a() {
        return new a(this, this.f9676i, 0, this.f9677j);
    }

    @Override // p117j1.AbstractC2082p
    /* JADX INFO: renamed from: b */
    AbstractC2084r mo10293b() {
        return new b(this, new c(this.f9676i, 0, this.f9677j));
    }

    @Override // p117j1.AbstractC2082p
    /* JADX INFO: renamed from: c */
    AbstractC2080n mo10294c() {
        return new c(this.f9676i, 1, this.f9677j);
    }

    @Override // p117j1.AbstractC2082p, java.util.Map
    public Object get(Object obj) {
        Object objM10291j = m10291j(this.f9675h, this.f9676i, this.f9677j, 0, obj);
        if (objM10291j == null) {
            return null;
        }
        return objM10291j;
    }

    @Override // java.util.Map
    public int size() {
        return this.f9677j;
    }
}
