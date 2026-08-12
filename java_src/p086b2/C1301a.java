package p086b2;

import p038M1.AbstractC0396B;
import p053R1.AbstractC0501c;
import p071X1.AbstractC0602g;
import p074Y1.InterfaceC0622a;

/* JADX INFO: renamed from: b2.a */
/* JADX INFO: loaded from: classes.dex */
public class C1301a implements Iterable, InterfaceC0622a {

    /* JADX INFO: renamed from: g */
    public static final a f6361g = new a(null);

    /* JADX INFO: renamed from: d */
    private final int f6362d;

    /* JADX INFO: renamed from: e */
    private final int f6363e;

    /* JADX INFO: renamed from: f */
    private final int f6364f;

    /* JADX INFO: renamed from: b2.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0602g abstractC0602g) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1301a m6626a(int i3, int i4, int i5) {
            return new C1301a(i3, i4, i5);
        }

        private a() {
        }
    }

    public C1301a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6362d = i3;
        this.f6363e = AbstractC0501c.m1845b(i3, i4, i5);
        this.f6364f = i5;
    }

    /* JADX INFO: renamed from: b */
    public final int m6622b() {
        return this.f6362d;
    }

    /* JADX INFO: renamed from: c */
    public final int m6623c() {
        return this.f6363e;
    }

    /* JADX INFO: renamed from: d */
    public final int m6624d() {
        return this.f6364f;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC0396B iterator() {
        return new C1302b(this.f6362d, this.f6363e, this.f6364f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1301a)) {
            return false;
        }
        if (isEmpty() && ((C1301a) obj).isEmpty()) {
            return true;
        }
        C1301a c1301a = (C1301a) obj;
        return this.f6362d == c1301a.f6362d && this.f6363e == c1301a.f6363e && this.f6364f == c1301a.f6364f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6362d * 31) + this.f6363e) * 31) + this.f6364f;
    }

    public boolean isEmpty() {
        return this.f6364f > 0 ? this.f6362d > this.f6363e : this.f6362d < this.f6363e;
    }

    public String toString() {
        StringBuilder sb;
        int i3;
        if (this.f6364f > 0) {
            sb = new StringBuilder();
            sb.append(this.f6362d);
            sb.append("..");
            sb.append(this.f6363e);
            sb.append(" step ");
            i3 = this.f6364f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6362d);
            sb.append(" downTo ");
            sb.append(this.f6363e);
            sb.append(" step ");
            i3 = -this.f6364f;
        }
        sb.append(i3);
        return sb.toString();
    }
}
