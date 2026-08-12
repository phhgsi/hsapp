package p137p;

import java.util.Arrays;
import p137p.C2304b;

/* JADX INFO: renamed from: p.j */
/* JADX INFO: loaded from: classes.dex */
public class C2312j implements C2304b.a {

    /* JADX INFO: renamed from: n */
    private static float f10694n = 0.001f;

    /* JADX INFO: renamed from: a */
    private final int f10695a = -1;

    /* JADX INFO: renamed from: b */
    private int f10696b = 16;

    /* JADX INFO: renamed from: c */
    private int f10697c = 16;

    /* JADX INFO: renamed from: d */
    int[] f10698d = new int[16];

    /* JADX INFO: renamed from: e */
    int[] f10699e = new int[16];

    /* JADX INFO: renamed from: f */
    int[] f10700f = new int[16];

    /* JADX INFO: renamed from: g */
    float[] f10701g = new float[16];

    /* JADX INFO: renamed from: h */
    int[] f10702h = new int[16];

    /* JADX INFO: renamed from: i */
    int[] f10703i = new int[16];

    /* JADX INFO: renamed from: j */
    int f10704j = 0;

    /* JADX INFO: renamed from: k */
    int f10705k = -1;

    /* JADX INFO: renamed from: l */
    private final C2304b f10706l;

    /* JADX INFO: renamed from: m */
    protected final C2305c f10707m;

    C2312j(C2304b c2304b, C2305c c2305c) {
        this.f10706l = c2304b;
        this.f10707m = c2305c;
        clear();
    }

    /* JADX INFO: renamed from: l */
    private void m11069l(C2311i c2311i, int i3) {
        int[] iArr;
        int i4 = c2311i.f10673f % this.f10697c;
        int[] iArr2 = this.f10698d;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            iArr2[i4] = i3;
        } else {
            while (true) {
                iArr = this.f10699e;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                } else {
                    i5 = i6;
                }
            }
            iArr[i5] = i3;
        }
        this.f10699e[i3] = -1;
    }

    /* JADX INFO: renamed from: m */
    private void m11070m(int i3, C2311i c2311i, float f3) {
        this.f10700f[i3] = c2311i.f10673f;
        this.f10701g[i3] = f3;
        this.f10702h[i3] = -1;
        this.f10703i[i3] = -1;
        c2311i.m11062a(this.f10706l);
        c2311i.f10683p++;
        this.f10704j++;
    }

    /* JADX INFO: renamed from: n */
    private int m11071n() {
        for (int i3 = 0; i3 < this.f10696b; i3++) {
            if (this.f10700f[i3] == -1) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    private void m11072o() {
        int i3 = this.f10696b * 2;
        this.f10700f = Arrays.copyOf(this.f10700f, i3);
        this.f10701g = Arrays.copyOf(this.f10701g, i3);
        this.f10702h = Arrays.copyOf(this.f10702h, i3);
        this.f10703i = Arrays.copyOf(this.f10703i, i3);
        this.f10699e = Arrays.copyOf(this.f10699e, i3);
        for (int i4 = this.f10696b; i4 < i3; i4++) {
            this.f10700f[i4] = -1;
            this.f10699e[i4] = -1;
        }
        this.f10696b = i3;
    }

    /* JADX INFO: renamed from: q */
    private void m11073q(int i3, C2311i c2311i, float f3) {
        int iM11071n = m11071n();
        m11070m(iM11071n, c2311i, f3);
        if (i3 != -1) {
            this.f10702h[iM11071n] = i3;
            int[] iArr = this.f10703i;
            iArr[iM11071n] = iArr[i3];
            iArr[i3] = iM11071n;
        } else {
            this.f10702h[iM11071n] = -1;
            if (this.f10704j > 0) {
                this.f10703i[iM11071n] = this.f10705k;
                this.f10705k = iM11071n;
            } else {
                this.f10703i[iM11071n] = -1;
            }
        }
        int i4 = this.f10703i[iM11071n];
        if (i4 != -1) {
            this.f10702h[i4] = iM11071n;
        }
        m11069l(c2311i, iM11071n);
    }

    /* JADX INFO: renamed from: r */
    private void m11074r(C2311i c2311i) {
        int[] iArr;
        int i3;
        int i4 = c2311i.f10673f;
        int i5 = i4 % this.f10697c;
        int[] iArr2 = this.f10698d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            return;
        }
        if (this.f10700f[i6] == i4) {
            int[] iArr3 = this.f10699e;
            iArr2[i5] = iArr3[i6];
            iArr3[i6] = -1;
            return;
        }
        while (true) {
            iArr = this.f10699e;
            i3 = iArr[i6];
            if (i3 == -1 || this.f10700f[i3] == i4) {
                break;
            } else {
                i6 = i3;
            }
        }
        if (i3 == -1 || this.f10700f[i3] != i4) {
            return;
        }
        iArr[i6] = iArr[i3];
        iArr[i3] = -1;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: a */
    public float mo10978a(int i3) {
        int i4 = this.f10704j;
        int i5 = this.f10705k;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3) {
                return this.f10701g[i5];
            }
            i5 = this.f10703i[i5];
            if (i5 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: b */
    public float mo10979b(C2304b c2304b, boolean z2) {
        float fMo10986i = mo10986i(c2304b.f10622a);
        mo10980c(c2304b.f10622a, z2);
        C2312j c2312j = (C2312j) c2304b.f10626e;
        int iMo10984g = c2312j.mo10984g();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMo10984g) {
            int i5 = c2312j.f10700f[i4];
            if (i5 != -1) {
                mo10983f(this.f10707m.f10631d[i5], c2312j.f10701g[i4] * fMo10986i, z2);
                i3++;
            }
            i4++;
        }
        return fMo10986i;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: c */
    public float mo10980c(C2311i c2311i, boolean z2) {
        int iM11075p = m11075p(c2311i);
        if (iM11075p == -1) {
            return 0.0f;
        }
        m11074r(c2311i);
        float f3 = this.f10701g[iM11075p];
        if (this.f10705k == iM11075p) {
            this.f10705k = this.f10703i[iM11075p];
        }
        this.f10700f[iM11075p] = -1;
        int[] iArr = this.f10702h;
        int i3 = iArr[iM11075p];
        if (i3 != -1) {
            int[] iArr2 = this.f10703i;
            iArr2[i3] = iArr2[iM11075p];
        }
        int i4 = this.f10703i[iM11075p];
        if (i4 != -1) {
            iArr[i4] = iArr[iM11075p];
        }
        this.f10704j--;
        c2311i.f10683p--;
        if (z2) {
            c2311i.m11064d(this.f10706l);
        }
        return f3;
    }

    @Override // p137p.C2304b.a
    public void clear() {
        int i3 = this.f10704j;
        for (int i4 = 0; i4 < i3; i4++) {
            C2311i c2311iMo10985h = mo10985h(i4);
            if (c2311iMo10985h != null) {
                c2311iMo10985h.m11064d(this.f10706l);
            }
        }
        for (int i5 = 0; i5 < this.f10696b; i5++) {
            this.f10700f[i5] = -1;
            this.f10699e[i5] = -1;
        }
        for (int i6 = 0; i6 < this.f10697c; i6++) {
            this.f10698d[i6] = -1;
        }
        this.f10704j = 0;
        this.f10705k = -1;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: d */
    public void mo10981d(C2311i c2311i, float f3) {
        float f4 = f10694n;
        if (f3 > (-f4) && f3 < f4) {
            mo10980c(c2311i, true);
            return;
        }
        if (this.f10704j == 0) {
            m11070m(0, c2311i, f3);
            m11069l(c2311i, 0);
            this.f10705k = 0;
            return;
        }
        int iM11075p = m11075p(c2311i);
        if (iM11075p != -1) {
            this.f10701g[iM11075p] = f3;
            return;
        }
        if (this.f10704j + 1 >= this.f10696b) {
            m11072o();
        }
        int i3 = this.f10704j;
        int i4 = this.f10705k;
        int i5 = -1;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f10700f[i4];
            int i8 = c2311i.f10673f;
            if (i7 == i8) {
                this.f10701g[i4] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i4;
            }
            i4 = this.f10703i[i4];
            if (i4 == -1) {
                break;
            }
        }
        m11073q(i5, c2311i, f3);
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: e */
    public boolean mo10982e(C2311i c2311i) {
        return m11075p(c2311i) != -1;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: f */
    public void mo10983f(C2311i c2311i, float f3, boolean z2) {
        float f4 = f10694n;
        if (f3 <= (-f4) || f3 >= f4) {
            int iM11075p = m11075p(c2311i);
            if (iM11075p == -1) {
                mo10981d(c2311i, f3);
                return;
            }
            float[] fArr = this.f10701g;
            float f5 = fArr[iM11075p] + f3;
            fArr[iM11075p] = f5;
            float f6 = f10694n;
            if (f5 <= (-f6) || f5 >= f6) {
                return;
            }
            fArr[iM11075p] = 0.0f;
            mo10980c(c2311i, z2);
        }
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: g */
    public int mo10984g() {
        return this.f10704j;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: h */
    public C2311i mo10985h(int i3) {
        int i4 = this.f10704j;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f10705k;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3 && i5 != -1) {
                return this.f10707m.f10631d[this.f10700f[i5]];
            }
            i5 = this.f10703i[i5];
            if (i5 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: i */
    public float mo10986i(C2311i c2311i) {
        int iM11075p = m11075p(c2311i);
        if (iM11075p != -1) {
            return this.f10701g[iM11075p];
        }
        return 0.0f;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: j */
    public void mo10987j(float f3) {
        int i3 = this.f10704j;
        int i4 = this.f10705k;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f10701g;
            fArr[i4] = fArr[i4] / f3;
            i4 = this.f10703i[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: k */
    public void mo10988k() {
        int i3 = this.f10704j;
        int i4 = this.f10705k;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f10701g;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f10703i[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m11075p(C2311i c2311i) {
        if (this.f10704j != 0 && c2311i != null) {
            int i3 = c2311i.f10673f;
            int i4 = this.f10698d[i3 % this.f10697c];
            if (i4 == -1) {
                return -1;
            }
            if (this.f10700f[i4] == i3) {
                return i4;
            }
            do {
                i4 = this.f10699e[i4];
                if (i4 == -1) {
                    break;
                }
            } while (this.f10700f[i4] != i3);
            if (i4 != -1 && this.f10700f[i4] == i3) {
                return i4;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i3 = this.f10704j;
        for (int i4 = 0; i4 < i3; i4++) {
            C2311i c2311iMo10985h = mo10985h(i4);
            if (c2311iMo10985h != null) {
                String str2 = str + c2311iMo10985h + " = " + mo10978a(i4) + " ";
                int iM11075p = m11075p(c2311iMo10985h);
                String str3 = str2 + "[p: ";
                String str4 = (this.f10702h[iM11075p] != -1 ? str3 + this.f10707m.f10631d[this.f10700f[this.f10702h[iM11075p]]] : str3 + "none") + ", n: ";
                str = (this.f10703i[iM11075p] != -1 ? str4 + this.f10707m.f10631d[this.f10700f[this.f10703i[iM11075p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
