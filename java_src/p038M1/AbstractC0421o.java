package p038M1;

import java.util.Collection;
import java.util.List;
import p071X1.AbstractC0606k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: M1.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0421o extends AbstractC0420n {
    /* JADX INFO: renamed from: d */
    public static final Collection m1457d(Object[] objArr, boolean z2) {
        AbstractC0606k.m2145e(objArr, "<this>");
        return new C0411e(objArr, z2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Collection m1458e(Object[] objArr, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        return m1457d(objArr, z2);
    }

    /* JADX INFO: renamed from: f */
    public static List m1459f() {
        return C0431y.f1540d;
    }

    /* JADX INFO: renamed from: g */
    public static final int m1460g(List list) {
        AbstractC0606k.m2145e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: h */
    public static List m1461h(Object... objArr) {
        AbstractC0606k.m2145e(objArr, "elements");
        return objArr.length > 0 ? AbstractC0416j.m1435c(objArr) : m1459f();
    }

    /* JADX INFO: renamed from: i */
    public static void m1462i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
