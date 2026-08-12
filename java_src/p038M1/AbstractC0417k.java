package p038M1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071X1.AbstractC0597b;
import p071X1.AbstractC0606k;
import p094d2.AbstractC1821g;
import p094d2.InterfaceC1820f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0417k extends AbstractC0416j {

    /* JADX INFO: renamed from: M1.k$a */
    public static final class a implements InterfaceC1820f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object[] f1538a;

        public a(Object[] objArr) {
            this.f1538a = objArr;
        }

        @Override // p094d2.InterfaceC1820f
        public Iterator iterator() {
            return AbstractC0597b.m2130a(this.f1538a);
        }
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1820f m1443k(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return objArr.length == 0 ? AbstractC1821g.m9590f() : new a(objArr);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m1444l(Object[] objArr, Object obj) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return m1449q(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: m */
    public static List m1445m(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return (List) m1446n(objArr, new ArrayList());
    }

    /* JADX INFO: renamed from: n */
    public static final Collection m1446n(Object[] objArr, Collection collection) {
        AbstractC0606k.m2145e(objArr, "<this>");
        AbstractC0606k.m2145e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* JADX INFO: renamed from: o */
    public static final int m1447o(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return objArr.length - 1;
    }

    /* JADX INFO: renamed from: p */
    public static Object m1448p(Object[] objArr, int i3) {
        AbstractC0606k.m2145e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    /* JADX INFO: renamed from: q */
    public static final int m1449q(Object[] objArr, Object obj) {
        AbstractC0606k.m2145e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (AbstractC0606k.m2141a(obj, objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public static Object m1450r(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static List m1451s(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? m1452t(objArr) : AbstractC0420n.m1455b(objArr[0]) : AbstractC0421o.m1459f();
    }

    /* JADX INFO: renamed from: t */
    public static final List m1452t(Object[] objArr) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return new ArrayList(AbstractC0421o.m1458e(objArr, false, 1, null));
    }
}
