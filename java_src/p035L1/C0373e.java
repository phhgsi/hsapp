package p035L1;

import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: L1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0373e implements Comparable {

    /* JADX INFO: renamed from: h */
    public static final a f1489h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final C0373e f1490i = C0374f.m1363a();

    /* JADX INFO: renamed from: d */
    private final int f1491d;

    /* JADX INFO: renamed from: e */
    private final int f1492e;

    /* JADX INFO: renamed from: f */
    private final int f1493f;

    /* JADX INFO: renamed from: g */
    private final int f1494g;

    /* JADX INFO: renamed from: L1.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        private a() {
        }
    }

    public C0373e(int i3, int i4, int i5) {
        this.f1491d = i3;
        this.f1492e = i4;
        this.f1493f = i5;
        this.f1494g = m1361b(i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    private final int m1361b(int i3, int i4, int i5) {
        if (i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256) {
            return (i3 << 16) + (i4 << 8) + i5;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i4 + '.' + i5).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0373e c0373e) {
        AbstractC0606k.m2145e(c0373e, "other");
        return this.f1494g - c0373e.f1494g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0373e c0373e = obj instanceof C0373e ? (C0373e) obj : null;
        return c0373e != null && this.f1494g == c0373e.f1494g;
    }

    public int hashCode() {
        return this.f1494g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1491d);
        sb.append('.');
        sb.append(this.f1492e);
        sb.append('.');
        sb.append(this.f1493f);
        return sb.toString();
    }
}
