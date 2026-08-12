package p086b2;

import p071X1.AbstractC0602g;

/* JADX INFO: renamed from: b2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1303c extends C1301a {

    /* JADX INFO: renamed from: h */
    public static final a f6369h = new a(null);

    /* JADX INFO: renamed from: i */
    private static final C1303c f6370i = new C1303c(1, 0);

    /* JADX INFO: renamed from: b2.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1303c m6630a() {
            return C1303c.f6370i;
        }

        private a() {
        }
    }

    public C1303c(int i3, int i4) {
        super(i3, i4, 1);
    }

    @Override // p086b2.C1301a
    public boolean equals(Object obj) {
        if (!(obj instanceof C1303c)) {
            return false;
        }
        if (isEmpty() && ((C1303c) obj).isEmpty()) {
            return true;
        }
        C1303c c1303c = (C1303c) obj;
        return m6622b() == c1303c.m6622b() && m6623c() == c1303c.m6623c();
    }

    /* JADX INFO: renamed from: g */
    public Integer m6628g() {
        return Integer.valueOf(m6623c());
    }

    /* JADX INFO: renamed from: h */
    public Integer m6629h() {
        return Integer.valueOf(m6622b());
    }

    @Override // p086b2.C1301a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m6622b() * 31) + m6623c();
    }

    @Override // p086b2.C1301a
    public boolean isEmpty() {
        return m6622b() > m6623c();
    }

    @Override // p086b2.C1301a
    public String toString() {
        return m6622b() + ".." + m6623c();
    }
}
