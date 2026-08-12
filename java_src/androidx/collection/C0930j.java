package androidx.collection;

import java.util.Arrays;
import p038M1.AbstractC0413g;
import p071X1.AbstractC0602g;
import p071X1.AbstractC0606k;
import p134o.AbstractC2284a;

/* JADX INFO: renamed from: androidx.collection.j */
/* JADX INFO: loaded from: classes.dex */
public class C0930j implements Cloneable {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f3811d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int[] f3812e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object[] f3813f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f3814g;

    public C0930j() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m3949a(int i3, Object obj) {
        int i4 = this.f3814g;
        if (i4 != 0 && i3 <= this.f3812e[i4 - 1]) {
            m3956h(i3, obj);
            return;
        }
        if (this.f3811d && i4 >= this.f3812e.length) {
            AbstractC0931k.m3963e(this);
        }
        int i5 = this.f3814g;
        if (i5 >= this.f3812e.length) {
            int iM10894e = AbstractC2284a.m10894e(i5 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f3812e, iM10894e);
            AbstractC0606k.m2144d(iArrCopyOf, "copyOf(this, newSize)");
            this.f3812e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3813f, iM10894e);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3813f = objArrCopyOf;
        }
        this.f3812e[i5] = i3;
        this.f3813f[i5] = obj;
        this.f3814g = i5 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m3950b() {
        int i3 = this.f3814g;
        Object[] objArr = this.f3813f;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f3814g = 0;
        this.f3811d = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0930j clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0606k.m2143c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C0930j c0930j = (C0930j) objClone;
        c0930j.f3812e = (int[]) this.f3812e.clone();
        c0930j.f3813f = (Object[]) this.f3813f.clone();
        return c0930j;
    }

    /* JADX INFO: renamed from: d */
    public Object m3952d(int i3) {
        return AbstractC0931k.m3961c(this, i3);
    }

    /* JADX INFO: renamed from: e */
    public Object m3953e(int i3, Object obj) {
        return AbstractC0931k.m3962d(this, i3, obj);
    }

    /* JADX INFO: renamed from: f */
    public int m3954f(Object obj) {
        if (this.f3811d) {
            AbstractC0931k.m3963e(this);
        }
        int i3 = this.f3814g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f3813f[i4] == obj) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m3955g(int i3) {
        if (this.f3811d) {
            AbstractC0931k.m3963e(this);
        }
        return this.f3812e[i3];
    }

    /* JADX INFO: renamed from: h */
    public void m3956h(int i3, Object obj) {
        int iM10890a = AbstractC2284a.m10890a(this.f3812e, this.f3814g, i3);
        if (iM10890a >= 0) {
            this.f3813f[iM10890a] = obj;
            return;
        }
        int i4 = ~iM10890a;
        if (i4 < this.f3814g && this.f3813f[i4] == AbstractC0931k.f3815a) {
            this.f3812e[i4] = i3;
            this.f3813f[i4] = obj;
            return;
        }
        if (this.f3811d && this.f3814g >= this.f3812e.length) {
            AbstractC0931k.m3963e(this);
            i4 = ~AbstractC2284a.m10890a(this.f3812e, this.f3814g, i3);
        }
        int i5 = this.f3814g;
        if (i5 >= this.f3812e.length) {
            int iM10894e = AbstractC2284a.m10894e(i5 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f3812e, iM10894e);
            AbstractC0606k.m2144d(iArrCopyOf, "copyOf(this, newSize)");
            this.f3812e = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3813f, iM10894e);
            AbstractC0606k.m2144d(objArrCopyOf, "copyOf(this, newSize)");
            this.f3813f = objArrCopyOf;
        }
        int i6 = this.f3814g;
        if (i6 - i4 != 0) {
            int[] iArr = this.f3812e;
            int i7 = i4 + 1;
            AbstractC0413g.m1436d(iArr, iArr, i7, i4, i6);
            Object[] objArr = this.f3813f;
            AbstractC0413g.m1438f(objArr, objArr, i7, i4, this.f3814g);
        }
        this.f3812e[i4] = i3;
        this.f3813f[i4] = obj;
        this.f3814g++;
    }

    /* JADX INFO: renamed from: i */
    public int m3957i() {
        if (this.f3811d) {
            AbstractC0931k.m3963e(this);
        }
        return this.f3814g;
    }

    /* JADX INFO: renamed from: j */
    public Object m3958j(int i3) {
        if (this.f3811d) {
            AbstractC0931k.m3963e(this);
        }
        return this.f3813f[i3];
    }

    public String toString() {
        if (m3957i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3814g * 28);
        sb.append('{');
        int i3 = this.f3814g;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m3955g(i4));
            sb.append('=');
            Object objM3958j = m3958j(i4);
            if (objM3958j != this) {
                sb.append(objM3958j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0606k.m2144d(string, "buffer.toString()");
        return string;
    }

    public C0930j(int i3) {
        if (i3 == 0) {
            this.f3812e = AbstractC2284a.f10460a;
            this.f3813f = AbstractC2284a.f10462c;
        } else {
            int iM10894e = AbstractC2284a.m10894e(i3);
            this.f3812e = new int[iM10894e];
            this.f3813f = new Object[iM10894e];
        }
    }

    public /* synthetic */ C0930j(int i3, int i4, AbstractC0602g abstractC0602g) {
        this((i4 & 1) != 0 ? 10 : i3);
    }
}
