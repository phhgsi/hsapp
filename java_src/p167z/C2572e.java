package p167z;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: z.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2572e {

    /* JADX INFO: renamed from: e */
    public static final C2572e f11898e = new C2572e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f11899a;

    /* JADX INFO: renamed from: b */
    public final int f11900b;

    /* JADX INFO: renamed from: c */
    public final int f11901c;

    /* JADX INFO: renamed from: d */
    public final int f11902d;

    /* JADX INFO: renamed from: z.e$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Insets m12275a(int i3, int i4, int i5, int i6) {
            return Insets.of(i3, i4, i5, i6);
        }
    }

    private C2572e(int i3, int i4, int i5, int i6) {
        this.f11899a = i3;
        this.f11900b = i4;
        this.f11901c = i5;
        this.f11902d = i6;
    }

    /* JADX INFO: renamed from: a */
    public static C2572e m12270a(C2572e c2572e, C2572e c2572e2) {
        return m12271b(Math.max(c2572e.f11899a, c2572e2.f11899a), Math.max(c2572e.f11900b, c2572e2.f11900b), Math.max(c2572e.f11901c, c2572e2.f11901c), Math.max(c2572e.f11902d, c2572e2.f11902d));
    }

    /* JADX INFO: renamed from: b */
    public static C2572e m12271b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f11898e : new C2572e(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: c */
    public static C2572e m12272c(Rect rect) {
        return m12271b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d */
    public static C2572e m12273d(Insets insets) {
        return m12271b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: e */
    public Insets m12274e() {
        return a.m12275a(this.f11899a, this.f11900b, this.f11901c, this.f11902d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2572e.class != obj.getClass()) {
            return false;
        }
        C2572e c2572e = (C2572e) obj;
        return this.f11902d == c2572e.f11902d && this.f11899a == c2572e.f11899a && this.f11901c == c2572e.f11901c && this.f11900b == c2572e.f11900b;
    }

    public int hashCode() {
        return (((((this.f11899a * 31) + this.f11900b) * 31) + this.f11901c) * 31) + this.f11902d;
    }

    public String toString() {
        return "Insets{left=" + this.f11899a + ", top=" + this.f11900b + ", right=" + this.f11901c + ", bottom=" + this.f11902d + '}';
    }
}
