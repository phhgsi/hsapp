package p024I;

import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: I.f */
/* JADX INFO: loaded from: classes.dex */
public class C0209f implements InterfaceC0208e {

    /* JADX INFO: renamed from: a */
    private final Object[] f1234a;

    /* JADX INFO: renamed from: b */
    private int f1235b;

    public C0209f(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1234a = new Object[i3];
    }

    /* JADX INFO: renamed from: c */
    private final boolean m603c(Object obj) {
        int i3 = this.f1235b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f1234a[i4] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // p024I.InterfaceC0208e
    /* JADX INFO: renamed from: a */
    public boolean mo601a(Object obj) {
        AbstractC0606k.m2145e(obj, "instance");
        if (m603c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f1235b;
        Object[] objArr = this.f1234a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f1235b = i3 + 1;
        return true;
    }

    @Override // p024I.InterfaceC0208e
    /* JADX INFO: renamed from: b */
    public Object mo602b() {
        int i3 = this.f1235b;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object obj = this.f1234a[i4];
        AbstractC0606k.m2143c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f1234a[i4] = null;
        this.f1235b--;
        return obj;
    }
}
