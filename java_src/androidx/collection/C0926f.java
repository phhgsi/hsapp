package androidx.collection;

import java.util.Arrays;
import p038M1.AbstractC0413g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.f */
/* JADX INFO: loaded from: classes.dex */
public class C0926f implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f3803d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long[] f3804e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object[] f3805f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f3806g;

    public C0926f() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m3925a(long j3, Object obj) {
        int i3 = this.f3806g;
        if (i3 != 0 && j3 <= this.f3804e[i3 - 1]) {
            m3932h(j3, obj);
            return;
        }
        if (this.f3803d) {
            long[] jArr = this.f3804e;
            if (i3 >= jArr.length) {
                Object[] objArr = this.f3805f;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj2 = objArr[i5];
                    if (obj2 != AbstractC0927g.f3807a) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr[i4] = obj2;
                            objArr[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f3803d = false;
                this.f3806g = i4;
            }
        }
        int i6 = this.f3806g;
        if (i6 >= this.f3804e.length) {
            int iM10895f = AbstractC2284a.m10895f(i6 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f3804e, iM10895f);
            AbstractC0606k.m2144d(jArrCopyOf, "copyOf(this, newSize)");
            this.f3804e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3805f, iM10895f);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3805f = objArrCopyOf;
        }
        this.f3804e[i6] = j3;
        this.f3805f[i6] = obj;
        this.f3806g = i6 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m3926b() {
        int i3 = this.f3806g;
        Object[] objArr = this.f3805f;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f3806g = 0;
        this.f3803d = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0926f clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0606k.m2143c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0926f c0926f = (C0926f) objClone;
        c0926f.f3804e = (long[]) this.f3804e.clone();
        c0926f.f3805f = (Object[]) this.f3805f.clone();
        return c0926f;
    }

    /* JADX INFO: renamed from: d */
    public Object m3928d(long j3) {
        int iM10891b = AbstractC2284a.m10891b(this.f3804e, this.f3806g, j3);
        if (iM10891b < 0 || this.f3805f[iM10891b] == AbstractC0927g.f3807a) {
            return null;
        }
        return this.f3805f[iM10891b];
    }

    /* JADX INFO: renamed from: e */
    public Object m3929e(long j3, Object obj) {
        int iM10891b = AbstractC2284a.m10891b(this.f3804e, this.f3806g, j3);
        return (iM10891b < 0 || this.f3805f[iM10891b] == AbstractC0927g.f3807a) ? obj : this.f3805f[iM10891b];
    }

    /* JADX INFO: renamed from: f */
    public int m3930f(long j3) {
        if (this.f3803d) {
            int i3 = this.f3806g;
            long[] jArr = this.f3804e;
            Object[] objArr = this.f3805f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0927g.f3807a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f3803d = false;
            this.f3806g = i4;
        }
        return AbstractC2284a.m10891b(this.f3804e, this.f3806g, j3);
    }

    /* JADX INFO: renamed from: g */
    public long m3931g(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f3806g)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
        }
        if (this.f3803d) {
            long[] jArr = this.f3804e;
            Object[] objArr = this.f3805f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0927g.f3807a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3803d = false;
            this.f3806g = i5;
        }
        return this.f3804e[i3];
    }

    /* JADX INFO: renamed from: h */
    public void m3932h(long j3, Object obj) {
        int iM10891b = AbstractC2284a.m10891b(this.f3804e, this.f3806g, j3);
        if (iM10891b >= 0) {
            this.f3805f[iM10891b] = obj;
            return;
        }
        int i3 = ~iM10891b;
        if (i3 < this.f3806g && this.f3805f[i3] == AbstractC0927g.f3807a) {
            this.f3804e[i3] = j3;
            this.f3805f[i3] = obj;
            return;
        }
        if (this.f3803d) {
            int i4 = this.f3806g;
            long[] jArr = this.f3804e;
            if (i4 >= jArr.length) {
                Object[] objArr = this.f3805f;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj2 = objArr[i6];
                    if (obj2 != AbstractC0927g.f3807a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj2;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f3803d = false;
                this.f3806g = i5;
                i3 = ~AbstractC2284a.m10891b(this.f3804e, i5, j3);
            }
        }
        int i7 = this.f3806g;
        if (i7 >= this.f3804e.length) {
            int iM10895f = AbstractC2284a.m10895f(i7 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f3804e, iM10895f);
            AbstractC0606k.m2144d(jArrCopyOf, "copyOf(this, newSize)");
            this.f3804e = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3805f, iM10895f);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3805f = objArrCopyOf;
        }
        int i8 = this.f3806g;
        if (i8 - i3 != 0) {
            long[] jArr2 = this.f3804e;
            int i9 = i3 + 1;
            AbstractC0413g.m1437e(jArr2, jArr2, i9, i3, i8);
            Object[] objArr2 = this.f3805f;
            AbstractC0413g.m1438f(objArr2, objArr2, i9, i3, this.f3806g);
        }
        this.f3804e[i3] = j3;
        this.f3805f[i3] = obj;
        this.f3806g++;
    }

    /* JADX INFO: renamed from: i */
    public void m3933i(long j3) {
        int iM10891b = AbstractC2284a.m10891b(this.f3804e, this.f3806g, j3);
        if (iM10891b < 0 || this.f3805f[iM10891b] == AbstractC0927g.f3807a) {
            return;
        }
        this.f3805f[iM10891b] = AbstractC0927g.f3807a;
        this.f3803d = true;
    }

    /* JADX INFO: renamed from: j */
    public void m3934j(int i3) {
        if (this.f3805f[i3] != AbstractC0927g.f3807a) {
            this.f3805f[i3] = AbstractC0927g.f3807a;
            this.f3803d = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m3935k() {
        if (this.f3803d) {
            int i3 = this.f3806g;
            long[] jArr = this.f3804e;
            Object[] objArr = this.f3805f;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0927g.f3807a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f3803d = false;
            this.f3806g = i4;
        }
        return this.f3806g;
    }

    /* JADX INFO: renamed from: l */
    public Object m3936l(int i3) {
        int i4;
        if (i3 < 0 || i3 >= (i4 = this.f3806g)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i3).toString());
        }
        if (this.f3803d) {
            long[] jArr = this.f3804e;
            Object[] objArr = this.f3805f;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC0927g.f3807a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f3803d = false;
            this.f3806g = i5;
        }
        return this.f3805f[i3];
    }

    public String toString() {
        if (m3935k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3806g * 28);
        sb.append('{');
        int i3 = this.f3806g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m3931g(i4));
            sb.append('=');
            Object objM3936l = m3936l(i4);
            if (objM3936l != sb) {
                sb.append(objM3936l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C0926f(int i3) {
        if (i3 == 0) {
            this.f3804e = AbstractC2284a.f10461b;
            this.f3805f = AbstractC2284a.f10462c;
        } else {
            int iM10895f = AbstractC2284a.m10895f(i3);
            this.f3804e = new long[iM10895f];
            this.f3805f = new Object[iM10895f];
        }
    }

    public /* synthetic */ C0926f(int i3, int i4, AbstractC0602g abstractC0602g) {
        this((i4 & 1) != 0 ? 10 : i3);
    }
}
