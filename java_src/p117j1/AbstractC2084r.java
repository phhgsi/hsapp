package p117j1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p113i1.AbstractC2035h;

/* JADX INFO: renamed from: j1.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2084r extends AbstractC2080n implements Set {

    /* JADX INFO: renamed from: e */
    private transient AbstractC2081o f9767e;

    AbstractC2084r() {
    }

    /* JADX INFO: renamed from: h */
    static int m10435h(int i3) {
        int iMax = Math.max(i3, 2);
        if (iMax >= 751619276) {
            AbstractC2035h.m10236e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: i */
    private static AbstractC2084r m10436i(int i3, Object... objArr) {
        if (i3 == 0) {
            return m10438m();
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m10439n(obj);
        }
        int iM10435h = m10435h(i3);
        Object[] objArr2 = new Object[iM10435h];
        int i4 = iM10435h - 1;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object objM10272a = AbstractC2053F.m10272a(objArr[i7], i7);
            int iHashCode = objM10272a.hashCode();
            int iM10399b = AbstractC2079m.m10399b(iHashCode);
            while (true) {
                int i8 = iM10399b & i4;
                Object obj2 = objArr2[i8];
                if (obj2 == null) {
                    objArr[i6] = objM10272a;
                    objArr2[i8] = objM10272a;
                    i5 += iHashCode;
                    i6++;
                    break;
                }
                if (obj2.equals(objM10272a)) {
                    break;
                }
                iM10399b++;
            }
        }
        Arrays.fill(objArr, i6, i3, (Object) null);
        if (i6 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C2061N(obj3);
        }
        if (m10435h(i6) < iM10435h / 2) {
            return m10436i(i6, objArr);
        }
        if (m10442q(i6, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i6);
        }
        return new C2058K(objArr, i5, objArr2, i4, i6);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2084r m10437j(Collection collection) {
        if ((collection instanceof AbstractC2084r) && !(collection instanceof SortedSet)) {
            AbstractC2084r abstractC2084r = (AbstractC2084r) collection;
            if (!abstractC2084r.mo10288f()) {
                return abstractC2084r;
            }
        }
        Object[] array = collection.toArray();
        return m10436i(array.length, array);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC2084r m10438m() {
        return C2058K.f9689l;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2084r m10439n(Object obj) {
        return new C2061N(obj);
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC2084r m10440o(Object obj, Object obj2, Object obj3) {
        return m10436i(3, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC2084r m10441p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC2035h.m10236e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m10436i(length, objArr2);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m10442q(int i3, int i4) {
        return i3 < (i4 >> 1) + (i4 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2084r) && mo10303l() && ((AbstractC2084r) obj).mo10303l() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC2060M.m10316a(this, obj);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC2081o mo10301g() {
        AbstractC2081o abstractC2081o = this.f9767e;
        if (abstractC2081o != null) {
            return abstractC2081o;
        }
        AbstractC2081o abstractC2081oMo10298k = mo10298k();
        this.f9767e = abstractC2081oMo10298k;
        return abstractC2081oMo10298k;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2060M.m10317b(this);
    }

    /* JADX INFO: renamed from: k */
    AbstractC2081o mo10298k() {
        return AbstractC2081o.m10405g(toArray());
    }

    /* JADX INFO: renamed from: l */
    boolean mo10303l() {
        return false;
    }
}
