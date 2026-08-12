package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p038M1.AbstractC0413g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.i */
/* JADX INFO: loaded from: classes.dex */
public class C0929i {

    /* JADX INFO: renamed from: d */
    private int[] f3808d;

    /* JADX INFO: renamed from: e */
    private Object[] f3809e;

    /* JADX INFO: renamed from: f */
    private int f3810f;

    public C0929i() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: c */
    private final int m3939c(Object obj, int i3) {
        int i4 = this.f3810f;
        if (i4 == 0) {
            return -1;
        }
        int iM10890a = AbstractC2284a.m10890a(this.f3808d, i4, i3);
        if (iM10890a < 0 || AbstractC0606k.m2141a(obj, this.f3809e[iM10890a << 1])) {
            return iM10890a;
        }
        int i5 = iM10890a + 1;
        while (i5 < i4 && this.f3808d[i5] == i3) {
            if (AbstractC0606k.m2141a(obj, this.f3809e[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iM10890a - 1; i6 >= 0 && this.f3808d[i6] == i3; i6--) {
            if (AbstractC0606k.m2141a(obj, this.f3809e[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    /* JADX INFO: renamed from: e */
    private final int m3940e() {
        int i3 = this.f3810f;
        if (i3 == 0) {
            return -1;
        }
        int iM10890a = AbstractC2284a.m10890a(this.f3808d, i3, 0);
        if (iM10890a < 0 || this.f3809e[iM10890a << 1] == null) {
            return iM10890a;
        }
        int i4 = iM10890a + 1;
        while (i4 < i3 && this.f3808d[i4] == 0) {
            if (this.f3809e[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM10890a - 1; i5 >= 0 && this.f3808d[i5] == 0; i5--) {
            if (this.f3809e[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: a */
    public final int m3941a(Object obj) {
        int i3 = this.f3810f * 2;
        Object[] objArr = this.f3809e;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (AbstractC0606k.m2141a(obj, objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m3942b(int i3) {
        int i4 = this.f3810f;
        int[] iArr = this.f3808d;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            AbstractC0606k.m2144d(iArrCopyOf, "copyOf(this, newSize)");
            this.f3808d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3809e, i3 * 2);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3809e = objArrCopyOf;
        }
        if (this.f3810f != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f3810f > 0) {
            this.f3808d = AbstractC2284a.f10460a;
            this.f3809e = AbstractC2284a.f10462c;
            this.f3810f = 0;
        }
        if (this.f3810f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m3943d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m3941a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public int m3943d(Object obj) {
        return obj == null ? m3940e() : m3939c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0929i) {
                if (size() != ((C0929i) obj).size()) {
                    return false;
                }
                C0929i c0929i = (C0929i) obj;
                int i3 = this.f3810f;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object objM3944f = m3944f(i4);
                    Object objM3948j = m3948j(i4);
                    Object obj2 = c0929i.get(objM3944f);
                    if (objM3948j == null) {
                        if (obj2 != null || !c0929i.containsKey(objM3944f)) {
                            return false;
                        }
                    } else if (!AbstractC0606k.m2141a(objM3948j, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i5 = this.f3810f;
            for (int i6 = 0; i6 < i5; i6++) {
                Object objM3944f2 = m3944f(i6);
                Object objM3948j2 = m3948j(i6);
                Object obj3 = ((Map) obj).get(objM3944f2);
                if (objM3948j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM3944f2)) {
                        return false;
                    }
                } else if (!AbstractC0606k.m2141a(objM3948j2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Object m3944f(int i3) {
        if (i3 >= 0 && i3 < this.f3810f) {
            return this.f3809e[i3 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
    }

    /* JADX INFO: renamed from: g */
    public void m3945g(C0929i c0929i) {
        AbstractC0606k.m2145e(c0929i, "map");
        int i3 = c0929i.f3810f;
        m3942b(this.f3810f + i3);
        if (this.f3810f != 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                put(c0929i.m3944f(i4), c0929i.m3948j(i4));
            }
        } else if (i3 > 0) {
            AbstractC0413g.m1436d(c0929i.f3808d, this.f3808d, 0, 0, i3);
            AbstractC0413g.m1438f(c0929i.f3809e, this.f3809e, 0, 0, i3 << 1);
            this.f3810f = i3;
        }
    }

    public Object get(Object obj) {
        int iM3943d = m3943d(obj);
        if (iM3943d >= 0) {
            return this.f3809e[(iM3943d << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iM3943d = m3943d(obj);
        return iM3943d >= 0 ? this.f3809e[(iM3943d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public Object m3946h(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f3810f)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
        }
        Object[] objArr = this.f3809e;
        int i5 = i3 << 1;
        Object obj = objArr[i5 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i6 = i4 - 1;
        int[] iArr = this.f3808d;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i6) {
                int i7 = i3 + 1;
                AbstractC0413g.m1436d(iArr, iArr, i3, i7, i4);
                Object[] objArr2 = this.f3809e;
                AbstractC0413g.m1438f(objArr2, objArr2, i5, i7 << 1, i4 << 1);
            }
            Object[] objArr3 = this.f3809e;
            int i8 = i6 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            AbstractC0606k.m2144d(iArrCopyOf, "copyOf(this, newSize)");
            this.f3808d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3809e, i9 << 1);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3809e = objArrCopyOf;
            if (i4 != this.f3810f) {
                throw new ConcurrentModificationException();
            }
            if (i3 > 0) {
                AbstractC0413g.m1436d(iArr, this.f3808d, 0, 0, i3);
                AbstractC0413g.m1438f(objArr, this.f3809e, 0, 0, i5);
            }
            if (i3 < i6) {
                int i10 = i3 + 1;
                AbstractC0413g.m1436d(iArr, this.f3808d, i3, i10, i4);
                AbstractC0413g.m1438f(objArr, this.f3809e, i5, i10 << 1, i4 << 1);
            }
        }
        if (i4 != this.f3810f) {
            throw new ConcurrentModificationException();
        }
        this.f3810f = i6;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f3808d;
        Object[] objArr = this.f3809e;
        int i3 = this.f3810f;
        int i4 = 1;
        int i5 = 0;
        int iHashCode = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object m3947i(int i3, Object obj) {
        if (i3 < 0 || i3 >= this.f3810f) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
        }
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f3809e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f3810f <= 0;
    }

    /* JADX INFO: renamed from: j */
    public Object m3948j(int i3) {
        if (i3 >= 0 && i3 < this.f3810f) {
            return this.f3809e[(i3 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i3 = this.f3810f;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM3939c = obj != null ? m3939c(obj, iHashCode) : m3940e();
        if (iM3939c >= 0) {
            int i4 = (iM3939c << 1) + 1;
            Object[] objArr = this.f3809e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iM3939c;
        int[] iArr = this.f3808d;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
            AbstractC0606k.m2144d(iArrCopyOf, "copyOf(this, newSize)");
            this.f3808d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3809e, i6 << 1);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3809e = objArrCopyOf;
            if (i3 != this.f3810f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f3808d;
            int i7 = i5 + 1;
            AbstractC0413g.m1436d(iArr2, iArr2, i7, i5, i3);
            Object[] objArr2 = this.f3809e;
            AbstractC0413g.m1438f(objArr2, objArr2, i7 << 1, i5 << 1, this.f3810f << 1);
        }
        int i8 = this.f3810f;
        if (i3 == i8) {
            int[] iArr3 = this.f3808d;
            if (i5 < iArr3.length) {
                iArr3[i5] = iHashCode;
                Object[] objArr3 = this.f3809e;
                int i9 = i5 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.f3810f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM3943d = m3943d(obj);
        if (iM3943d >= 0) {
            return m3946h(iM3943d);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iM3943d = m3943d(obj);
        if (iM3943d >= 0) {
            return m3947i(iM3943d, obj2);
        }
        return null;
    }

    public int size() {
        return this.f3810f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3810f * 28);
        sb.append('{');
        int i3 = this.f3810f;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objM3944f = m3944f(i4);
            if (objM3944f != sb) {
                sb.append(objM3944f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM3948j = m3948j(i4);
            if (objM3948j != sb) {
                sb.append(objM3948j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C0929i(int i3) {
        this.f3808d = i3 == 0 ? AbstractC2284a.f10460a : new int[i3];
        this.f3809e = i3 == 0 ? AbstractC2284a.f10462c : new Object[i3 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iM3943d = m3943d(obj);
        if (iM3943d < 0 || !AbstractC0606k.m2141a(obj2, m3948j(iM3943d))) {
            return false;
        }
        m3946h(iM3943d);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iM3943d = m3943d(obj);
        if (iM3943d < 0 || !AbstractC0606k.m2141a(obj2, m3948j(iM3943d))) {
            return false;
        }
        m3947i(iM3943d, obj3);
        return true;
    }

    public /* synthetic */ C0929i(int i3, int i4, AbstractC0602g abstractC0602g) {
        this((i4 & 1) != 0 ? 0 : i3);
    }

    public C0929i(C0929i c0929i) {
        this(0, 1, null);
        if (c0929i != null) {
            m3945g(c0929i);
        }
    }
}
