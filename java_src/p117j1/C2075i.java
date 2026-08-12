package p117j1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p113i1.AbstractC2033f;
import p113i1.AbstractC2035h;
import p121k1.AbstractC2113a;

/* JADX INFO: renamed from: j1.i */
/* JADX INFO: loaded from: classes.dex */
class C2075i extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: m */
    private static final Object f9715m = new Object();

    /* JADX INFO: renamed from: d */
    private transient Object f9716d;

    /* JADX INFO: renamed from: e */
    transient int[] f9717e;

    /* JADX INFO: renamed from: f */
    transient Object[] f9718f;

    /* JADX INFO: renamed from: g */
    transient Object[] f9719g;

    /* JADX INFO: renamed from: h */
    private transient int f9720h;

    /* JADX INFO: renamed from: i */
    private transient int f9721i;

    /* JADX INFO: renamed from: j */
    private transient Set f9722j;

    /* JADX INFO: renamed from: k */
    private transient Set f9723k;

    /* JADX INFO: renamed from: l */
    private transient Collection f9724l;

    /* JADX INFO: renamed from: j1.i$a */
    class a extends e {
        a() {
            super(C2075i.this, null);
        }

        @Override // p117j1.C2075i.e
        /* JADX INFO: renamed from: b */
        Object mo10383b(int i3) {
            return C2075i.this.m10335G(i3);
        }
    }

    /* JADX INFO: renamed from: j1.i$b */
    class b extends e {
        b() {
            super(C2075i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p117j1.C2075i.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry mo10383b(int i3) {
            return C2075i.this.new g(i3);
        }
    }

    /* JADX INFO: renamed from: j1.i$c */
    class c extends e {
        c() {
            super(C2075i.this, null);
        }

        @Override // p117j1.C2075i.e
        /* JADX INFO: renamed from: b */
        Object mo10383b(int i3) {
            return C2075i.this.m10347W(i3);
        }
    }

    /* JADX INFO: renamed from: j1.i$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2075i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapM10380w = C2075i.this.m10380w();
            if (mapM10380w != null) {
                return mapM10380w.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iM10334D = C2075i.this.m10334D(entry.getKey());
                if (iM10334D != -1 && AbstractC2033f.m10228a(C2075i.this.m10347W(iM10334D), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2075i.this.m10381y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM10333B;
            int iM10393f;
            Map mapM10380w = C2075i.this.m10380w();
            if (mapM10380w != null) {
                return mapM10380w.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C2075i.this.m10369J() || (iM10393f = AbstractC2076j.m10393f(entry.getKey(), entry.getValue(), (iM10333B = C2075i.this.m10333B()), C2075i.this.m10339N(), C2075i.this.m10337L(), C2075i.this.m10338M(), C2075i.this.m10340O())) == -1) {
                return false;
            }
            C2075i.this.m10368I(iM10393f, iM10333B);
            C2075i.m10352e(C2075i.this);
            C2075i.this.m10364C();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2075i.this.size();
        }
    }

    /* JADX INFO: renamed from: j1.i$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2075i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2075i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2075i.this.m10367H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapM10380w = C2075i.this.m10380w();
            return mapM10380w != null ? mapM10380w.keySet().remove(obj) : C2075i.this.m10336K(obj) != C2075i.f9715m;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2075i.this.size();
        }
    }

    /* JADX INFO: renamed from: j1.i$g */
    final class g extends AbstractC2069c {

        /* JADX INFO: renamed from: d */
        private final Object f9734d;

        /* JADX INFO: renamed from: e */
        private int f9735e;

        g(int i3) {
            this.f9734d = C2075i.this.m10335G(i3);
            this.f9735e = i3;
        }

        /* JADX INFO: renamed from: a */
        private void m10387a() {
            int i3 = this.f9735e;
            if (i3 == -1 || i3 >= C2075i.this.size() || !AbstractC2033f.m10228a(this.f9734d, C2075i.this.m10335G(this.f9735e))) {
                this.f9735e = C2075i.this.m10334D(this.f9734d);
            }
        }

        @Override // p117j1.AbstractC2069c, java.util.Map.Entry
        public Object getKey() {
            return this.f9734d;
        }

        @Override // p117j1.AbstractC2069c, java.util.Map.Entry
        public Object getValue() {
            Map mapM10380w = C2075i.this.m10380w();
            if (mapM10380w != null) {
                return AbstractC2052E.m10270a(mapM10380w.get(this.f9734d));
            }
            m10387a();
            int i3 = this.f9735e;
            return i3 == -1 ? AbstractC2052E.m10271b() : C2075i.this.m10347W(i3);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapM10380w = C2075i.this.m10380w();
            if (mapM10380w != null) {
                return AbstractC2052E.m10270a(mapM10380w.put(this.f9734d, obj));
            }
            m10387a();
            int i3 = this.f9735e;
            if (i3 == -1) {
                C2075i.this.put(this.f9734d, obj);
                return AbstractC2052E.m10271b();
            }
            Object objM10347W = C2075i.this.m10347W(i3);
            C2075i.this.m10346V(this.f9735e, obj);
            return objM10347W;
        }
    }

    /* JADX INFO: renamed from: j1.i$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2075i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C2075i.this.m10371X();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C2075i.this.size();
        }
    }

    C2075i() {
        m10365E(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public int m10333B() {
        return (1 << (this.f9720h & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public int m10334D(Object obj) {
        if (m10369J()) {
            return -1;
        }
        int iM10400c = AbstractC2079m.m10400c(obj);
        int iM10333B = m10333B();
        int iM10395h = AbstractC2076j.m10395h(m10339N(), iM10400c & iM10333B);
        if (iM10395h == 0) {
            return -1;
        }
        int iM10389b = AbstractC2076j.m10389b(iM10400c, iM10333B);
        do {
            int i3 = iM10395h - 1;
            int iM10362x = m10362x(i3);
            if (AbstractC2076j.m10389b(iM10362x, iM10333B) == iM10389b && AbstractC2033f.m10228a(obj, m10335G(i3))) {
                return i3;
            }
            iM10395h = AbstractC2076j.m10390c(iM10362x, iM10333B);
        } while (iM10395h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public Object m10335G(int i3) {
        return m10338M()[i3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public Object m10336K(Object obj) {
        if (m10369J()) {
            return f9715m;
        }
        int iM10333B = m10333B();
        int iM10393f = AbstractC2076j.m10393f(obj, null, iM10333B, m10339N(), m10337L(), m10338M(), null);
        if (iM10393f == -1) {
            return f9715m;
        }
        Object objM10347W = m10347W(iM10393f);
        m10368I(iM10393f, iM10333B);
        this.f9721i--;
        m10364C();
        return objM10347W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public int[] m10337L() {
        int[] iArr = this.f9717e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public Object[] m10338M() {
        Object[] objArr = this.f9718f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public Object m10339N() {
        Object obj = this.f9716d;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public Object[] m10340O() {
        Object[] objArr = this.f9719g;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: Q */
    private void m10341Q(int i3) {
        int iMin;
        int length = m10337L().length;
        if (i3 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m10370P(iMin);
    }

    /* JADX INFO: renamed from: R */
    private int m10342R(int i3, int i4, int i5, int i6) {
        Object objM10388a = AbstractC2076j.m10388a(i4);
        int i7 = i4 - 1;
        if (i6 != 0) {
            AbstractC2076j.m10396i(objM10388a, i5 & i7, i6 + 1);
        }
        Object objM10339N = m10339N();
        int[] iArrM10337L = m10337L();
        for (int i8 = 0; i8 <= i3; i8++) {
            int iM10395h = AbstractC2076j.m10395h(objM10339N, i8);
            while (iM10395h != 0) {
                int i9 = iM10395h - 1;
                int i10 = iArrM10337L[i9];
                int iM10389b = AbstractC2076j.m10389b(i10, i3) | i8;
                int i11 = iM10389b & i7;
                int iM10395h2 = AbstractC2076j.m10395h(objM10388a, i11);
                AbstractC2076j.m10396i(objM10388a, i11, iM10395h);
                iArrM10337L[i9] = AbstractC2076j.m10391d(iM10389b, iM10395h2, i7);
                iM10395h = AbstractC2076j.m10390c(i10, i3);
            }
        }
        this.f9716d = objM10388a;
        m10344T(i7);
        return i7;
    }

    /* JADX INFO: renamed from: S */
    private void m10343S(int i3, int i4) {
        m10337L()[i3] = i4;
    }

    /* JADX INFO: renamed from: T */
    private void m10344T(int i3) {
        this.f9720h = AbstractC2076j.m10391d(this.f9720h, 32 - Integer.numberOfLeadingZeros(i3), 31);
    }

    /* JADX INFO: renamed from: U */
    private void m10345U(int i3, Object obj) {
        m10338M()[i3] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m10346V(int i3, Object obj) {
        m10340O()[i3] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public Object m10347W(int i3) {
        return m10340O()[i3];
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ int m10352e(C2075i c2075i) {
        int i3 = c2075i.f9721i;
        c2075i.f9721i = i3 - 1;
        return i3;
    }

    /* JADX INFO: renamed from: r */
    public static C2075i m10361r() {
        return new C2075i();
    }

    /* JADX INFO: renamed from: x */
    private int m10362x(int i3) {
        return m10337L()[i3];
    }

    /* JADX INFO: renamed from: A */
    int m10363A(int i3) {
        int i4 = i3 + 1;
        if (i4 < this.f9721i) {
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    void m10364C() {
        this.f9720h += 32;
    }

    /* JADX INFO: renamed from: E */
    void m10365E(int i3) {
        AbstractC2035h.m10236e(i3 >= 0, "Expected size must be >= 0");
        this.f9720h = AbstractC2113a.m10573a(i3, 1, 1073741823);
    }

    /* JADX INFO: renamed from: F */
    void m10366F(int i3, Object obj, Object obj2, int i4, int i5) {
        m10343S(i3, AbstractC2076j.m10391d(i4, 0, i5));
        m10345U(i3, obj);
        m10346V(i3, obj2);
    }

    /* JADX INFO: renamed from: H */
    Iterator m10367H() {
        Map mapM10380w = m10380w();
        return mapM10380w != null ? mapM10380w.keySet().iterator() : new a();
    }

    /* JADX INFO: renamed from: I */
    void m10368I(int i3, int i4) {
        Object objM10339N = m10339N();
        int[] iArrM10337L = m10337L();
        Object[] objArrM10338M = m10338M();
        Object[] objArrM10340O = m10340O();
        int size = size();
        int i5 = size - 1;
        if (i3 >= i5) {
            objArrM10338M[i3] = null;
            objArrM10340O[i3] = null;
            iArrM10337L[i3] = 0;
            return;
        }
        Object obj = objArrM10338M[i5];
        objArrM10338M[i3] = obj;
        objArrM10340O[i3] = objArrM10340O[i5];
        objArrM10338M[i5] = null;
        objArrM10340O[i5] = null;
        iArrM10337L[i3] = iArrM10337L[i5];
        iArrM10337L[i5] = 0;
        int iM10400c = AbstractC2079m.m10400c(obj) & i4;
        int iM10395h = AbstractC2076j.m10395h(objM10339N, iM10400c);
        if (iM10395h == size) {
            AbstractC2076j.m10396i(objM10339N, iM10400c, i3 + 1);
            return;
        }
        while (true) {
            int i6 = iM10395h - 1;
            int i7 = iArrM10337L[i6];
            int iM10390c = AbstractC2076j.m10390c(i7, i4);
            if (iM10390c == size) {
                iArrM10337L[i6] = AbstractC2076j.m10391d(i7, i3 + 1, i4);
                return;
            }
            iM10395h = iM10390c;
        }
    }

    /* JADX INFO: renamed from: J */
    boolean m10369J() {
        return this.f9716d == null;
    }

    /* JADX INFO: renamed from: P */
    void m10370P(int i3) {
        this.f9717e = Arrays.copyOf(m10337L(), i3);
        this.f9718f = Arrays.copyOf(m10338M(), i3);
        this.f9719g = Arrays.copyOf(m10340O(), i3);
    }

    /* JADX INFO: renamed from: X */
    Iterator m10371X() {
        Map mapM10380w = m10380w();
        return mapM10380w != null ? mapM10380w.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m10369J()) {
            return;
        }
        m10364C();
        Map mapM10380w = m10380w();
        if (mapM10380w != null) {
            this.f9720h = AbstractC2113a.m10573a(size(), 3, 1073741823);
            mapM10380w.clear();
            this.f9716d = null;
            this.f9721i = 0;
            return;
        }
        Arrays.fill(m10338M(), 0, this.f9721i, (Object) null);
        Arrays.fill(m10340O(), 0, this.f9721i, (Object) null);
        AbstractC2076j.m10394g(m10339N());
        Arrays.fill(m10337L(), 0, this.f9721i, 0);
        this.f9721i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapM10380w = m10380w();
        return mapM10380w != null ? mapM10380w.containsKey(obj) : m10334D(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapM10380w = m10380w();
        if (mapM10380w != null) {
            return mapM10380w.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f9721i; i3++) {
            if (AbstractC2033f.m10228a(obj, m10347W(i3))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f9723k;
        if (set != null) {
            return set;
        }
        Set setM10376s = m10376s();
        this.f9723k = setM10376s;
        return setM10376s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapM10380w = m10380w();
        if (mapM10380w != null) {
            return mapM10380w.get(obj);
        }
        int iM10334D = m10334D(obj);
        if (iM10334D == -1) {
            return null;
        }
        m10372n(iM10334D);
        return m10347W(iM10334D);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f9722j;
        if (set != null) {
            return set;
        }
        Set setM10378u = m10378u();
        this.f9722j = setM10378u;
        return setM10378u;
    }

    /* JADX INFO: renamed from: o */
    int m10373o(int i3, int i4) {
        return i3 - 1;
    }

    /* JADX INFO: renamed from: p */
    int m10374p() {
        AbstractC2035h.m10246o(m10369J(), "Arrays already allocated");
        int i3 = this.f9720h;
        int iM10397j = AbstractC2076j.m10397j(i3);
        this.f9716d = AbstractC2076j.m10388a(iM10397j);
        m10344T(iM10397j - 1);
        this.f9717e = new int[i3];
        this.f9718f = new Object[i3];
        this.f9719g = new Object[i3];
        return i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (m10369J()) {
            m10374p();
        }
        Map mapM10380w = m10380w();
        if (mapM10380w != null) {
            return mapM10380w.put(obj, obj2);
        }
        int[] iArrM10337L = m10337L();
        Object[] objArrM10338M = m10338M();
        Object[] objArrM10340O = m10340O();
        int i3 = this.f9721i;
        int i4 = i3 + 1;
        int iM10400c = AbstractC2079m.m10400c(obj);
        int iM10333B = m10333B();
        int i5 = iM10400c & iM10333B;
        int iM10395h = AbstractC2076j.m10395h(m10339N(), i5);
        if (iM10395h != 0) {
            int iM10389b = AbstractC2076j.m10389b(iM10400c, iM10333B);
            int i6 = 0;
            while (true) {
                int i7 = iM10395h - 1;
                int i8 = iArrM10337L[i7];
                if (AbstractC2076j.m10389b(i8, iM10333B) == iM10389b && AbstractC2033f.m10228a(obj, objArrM10338M[i7])) {
                    Object obj3 = objArrM10340O[i7];
                    objArrM10340O[i7] = obj2;
                    m10372n(i7);
                    return obj3;
                }
                int iM10390c = AbstractC2076j.m10390c(i8, iM10333B);
                i6++;
                if (iM10390c != 0) {
                    obj = obj;
                    obj2 = obj2;
                    iM10395h = iM10390c;
                } else {
                    if (i6 >= 9) {
                        return m10375q().put(obj, obj2);
                    }
                    if (i4 > iM10333B) {
                        iM10333B = m10342R(iM10333B, AbstractC2076j.m10392e(iM10333B), iM10400c, i3);
                    } else {
                        iArrM10337L[i7] = AbstractC2076j.m10391d(i8, i4, iM10333B);
                    }
                }
            }
        } else if (i4 > iM10333B) {
            iM10333B = m10342R(iM10333B, AbstractC2076j.m10392e(iM10333B), iM10400c, i3);
        } else {
            AbstractC2076j.m10396i(m10339N(), i5, i4);
        }
        int i9 = iM10333B;
        m10341Q(i4);
        m10366F(i3, obj, obj2, iM10400c, i9);
        this.f9721i = i4;
        m10364C();
        return null;
    }

    /* JADX INFO: renamed from: q */
    Map m10375q() {
        Map mapM10377t = m10377t(m10333B() + 1);
        int iM10382z = m10382z();
        while (iM10382z >= 0) {
            mapM10377t.put(m10335G(iM10382z), m10347W(iM10382z));
            iM10382z = m10363A(iM10382z);
        }
        this.f9716d = mapM10377t;
        this.f9717e = null;
        this.f9718f = null;
        this.f9719g = null;
        m10364C();
        return mapM10377t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapM10380w = m10380w();
        if (mapM10380w != null) {
            return mapM10380w.remove(obj);
        }
        Object objM10336K = m10336K(obj);
        if (objM10336K == f9715m) {
            return null;
        }
        return objM10336K;
    }

    /* JADX INFO: renamed from: s */
    Set m10376s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapM10380w = m10380w();
        return mapM10380w != null ? mapM10380w.size() : this.f9721i;
    }

    /* JADX INFO: renamed from: t */
    Map m10377t(int i3) {
        return new LinkedHashMap(i3, 1.0f);
    }

    /* JADX INFO: renamed from: u */
    Set m10378u() {
        return new f();
    }

    /* JADX INFO: renamed from: v */
    Collection m10379v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f9724l;
        if (collection != null) {
            return collection;
        }
        Collection collectionM10379v = m10379v();
        this.f9724l = collectionM10379v;
        return collectionM10379v;
    }

    /* JADX INFO: renamed from: w */
    Map m10380w() {
        Object obj = this.f9716d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    Iterator m10381y() {
        Map mapM10380w = m10380w();
        return mapM10380w != null ? mapM10380w.entrySet().iterator() : new b();
    }

    /* JADX INFO: renamed from: z */
    int m10382z() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: j1.i$e */
    private abstract class e implements Iterator {

        /* JADX INFO: renamed from: d */
        int f9729d;

        /* JADX INFO: renamed from: e */
        int f9730e;

        /* JADX INFO: renamed from: f */
        int f9731f;

        private e() {
            this.f9729d = C2075i.this.f9720h;
            this.f9730e = C2075i.this.m10382z();
            this.f9731f = -1;
        }

        /* JADX INFO: renamed from: a */
        private void m10385a() {
            if (C2075i.this.f9720h != this.f9729d) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: b */
        abstract Object mo10383b(int i3);

        /* JADX INFO: renamed from: c */
        void m10386c() {
            this.f9729d += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9730e >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            m10385a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i3 = this.f9730e;
            this.f9731f = i3;
            Object objMo10383b = mo10383b(i3);
            this.f9730e = C2075i.this.m10363A(this.f9730e);
            return objMo10383b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m10385a();
            AbstractC2073g.m10331c(this.f9731f >= 0);
            m10386c();
            C2075i c2075i = C2075i.this;
            c2075i.remove(c2075i.m10335G(this.f9731f));
            this.f9730e = C2075i.this.m10373o(this.f9730e, this.f9731f);
            this.f9731f = -1;
        }

        /* synthetic */ e(C2075i c2075i, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: n */
    void m10372n(int i3) {
    }
}
