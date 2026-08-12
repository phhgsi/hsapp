package p137p;

import java.util.Arrays;
import p137p.C2304b;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public class C2303a implements C2304b.a {

    /* JADX INFO: renamed from: l */
    private static float f10610l = 0.001f;

    /* JADX INFO: renamed from: b */
    private final C2304b f10612b;

    /* JADX INFO: renamed from: c */
    protected final C2305c f10613c;

    /* JADX INFO: renamed from: a */
    int f10611a = 0;

    /* JADX INFO: renamed from: d */
    private int f10614d = 8;

    /* JADX INFO: renamed from: e */
    private C2311i f10615e = null;

    /* JADX INFO: renamed from: f */
    private int[] f10616f = new int[8];

    /* JADX INFO: renamed from: g */
    private int[] f10617g = new int[8];

    /* JADX INFO: renamed from: h */
    private float[] f10618h = new float[8];

    /* JADX INFO: renamed from: i */
    private int f10619i = -1;

    /* JADX INFO: renamed from: j */
    private int f10620j = -1;

    /* JADX INFO: renamed from: k */
    private boolean f10621k = false;

    C2303a(C2304b c2304b, C2305c c2305c) {
        this.f10612b = c2304b;
        this.f10613c = c2305c;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: a */
    public float mo10978a(int i3) {
        int i4 = this.f10619i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10611a; i5++) {
            if (i5 == i3) {
                return this.f10618h[i4];
            }
            i4 = this.f10617g[i4];
        }
        return 0.0f;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: b */
    public float mo10979b(C2304b c2304b, boolean z2) {
        float fMo10986i = mo10986i(c2304b.f10622a);
        mo10980c(c2304b.f10622a, z2);
        C2304b.a aVar = c2304b.f10626e;
        int iMo10984g = aVar.mo10984g();
        for (int i3 = 0; i3 < iMo10984g; i3++) {
            C2311i c2311iMo10985h = aVar.mo10985h(i3);
            mo10983f(c2311iMo10985h, aVar.mo10986i(c2311iMo10985h) * fMo10986i, z2);
        }
        return fMo10986i;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: c */
    public final float mo10980c(C2311i c2311i, boolean z2) {
        if (this.f10615e == c2311i) {
            this.f10615e = null;
        }
        int i3 = this.f10619i;
        if (i3 == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i3 != -1 && i4 < this.f10611a) {
            if (this.f10616f[i3] == c2311i.f10673f) {
                if (i3 == this.f10619i) {
                    this.f10619i = this.f10617g[i3];
                } else {
                    int[] iArr = this.f10617g;
                    iArr[i5] = iArr[i3];
                }
                if (z2) {
                    c2311i.m11064d(this.f10612b);
                }
                c2311i.f10683p--;
                this.f10611a--;
                this.f10616f[i3] = -1;
                if (this.f10621k) {
                    this.f10620j = i3;
                }
                return this.f10618h[i3];
            }
            i4++;
            i5 = i3;
            i3 = this.f10617g[i3];
        }
        return 0.0f;
    }

    @Override // p137p.C2304b.a
    public final void clear() {
        int i3 = this.f10619i;
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            C2311i c2311i = this.f10613c.f10631d[this.f10616f[i3]];
            if (c2311i != null) {
                c2311i.m11064d(this.f10612b);
            }
            i3 = this.f10617g[i3];
        }
        this.f10619i = -1;
        this.f10620j = -1;
        this.f10621k = false;
        this.f10611a = 0;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: d */
    public final void mo10981d(C2311i c2311i, float f3) {
        if (f3 == 0.0f) {
            mo10980c(c2311i, true);
            return;
        }
        int i3 = this.f10619i;
        if (i3 == -1) {
            this.f10619i = 0;
            this.f10618h[0] = f3;
            this.f10616f[0] = c2311i.f10673f;
            this.f10617g[0] = -1;
            c2311i.f10683p++;
            c2311i.m11062a(this.f10612b);
            this.f10611a++;
            if (this.f10621k) {
                return;
            }
            int i4 = this.f10620j + 1;
            this.f10620j = i4;
            int[] iArr = this.f10616f;
            if (i4 >= iArr.length) {
                this.f10621k = true;
                this.f10620j = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i3 != -1 && i6 < this.f10611a; i6++) {
            int i7 = this.f10616f[i3];
            int i8 = c2311i.f10673f;
            if (i7 == i8) {
                this.f10618h[i3] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i3;
            }
            i3 = this.f10617g[i3];
        }
        int length = this.f10620j;
        int i9 = length + 1;
        if (this.f10621k) {
            int[] iArr2 = this.f10616f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i9;
        }
        int[] iArr3 = this.f10616f;
        if (length >= iArr3.length && this.f10611a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f10616f;
                if (i10 >= iArr4.length) {
                    break;
                }
                if (iArr4[i10] == -1) {
                    length = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr5 = this.f10616f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i11 = this.f10614d * 2;
            this.f10614d = i11;
            this.f10621k = false;
            this.f10620j = length - 1;
            this.f10618h = Arrays.copyOf(this.f10618h, i11);
            this.f10616f = Arrays.copyOf(this.f10616f, this.f10614d);
            this.f10617g = Arrays.copyOf(this.f10617g, this.f10614d);
        }
        this.f10616f[length] = c2311i.f10673f;
        this.f10618h[length] = f3;
        if (i5 != -1) {
            int[] iArr6 = this.f10617g;
            iArr6[length] = iArr6[i5];
            iArr6[i5] = length;
        } else {
            this.f10617g[length] = this.f10619i;
            this.f10619i = length;
        }
        c2311i.f10683p++;
        c2311i.m11062a(this.f10612b);
        int i12 = this.f10611a + 1;
        this.f10611a = i12;
        if (!this.f10621k) {
            this.f10620j++;
        }
        int[] iArr7 = this.f10616f;
        if (i12 >= iArr7.length) {
            this.f10621k = true;
        }
        if (this.f10620j >= iArr7.length) {
            this.f10621k = true;
            this.f10620j = iArr7.length - 1;
        }
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: e */
    public boolean mo10982e(C2311i c2311i) {
        int i3 = this.f10619i;
        if (i3 == -1) {
            return false;
        }
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            if (this.f10616f[i3] == c2311i.f10673f) {
                return true;
            }
            i3 = this.f10617g[i3];
        }
        return false;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: f */
    public void mo10983f(C2311i c2311i, float f3, boolean z2) {
        float f4 = f10610l;
        if (f3 <= (-f4) || f3 >= f4) {
            int i3 = this.f10619i;
            if (i3 == -1) {
                this.f10619i = 0;
                this.f10618h[0] = f3;
                this.f10616f[0] = c2311i.f10673f;
                this.f10617g[0] = -1;
                c2311i.f10683p++;
                c2311i.m11062a(this.f10612b);
                this.f10611a++;
                if (this.f10621k) {
                    return;
                }
                int i4 = this.f10620j + 1;
                this.f10620j = i4;
                int[] iArr = this.f10616f;
                if (i4 >= iArr.length) {
                    this.f10621k = true;
                    this.f10620j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i3 != -1 && i6 < this.f10611a; i6++) {
                int i7 = this.f10616f[i3];
                int i8 = c2311i.f10673f;
                if (i7 == i8) {
                    float[] fArr = this.f10618h;
                    float f5 = fArr[i3] + f3;
                    float f6 = f10610l;
                    if (f5 > (-f6) && f5 < f6) {
                        f5 = 0.0f;
                    }
                    fArr[i3] = f5;
                    if (f5 == 0.0f) {
                        if (i3 == this.f10619i) {
                            this.f10619i = this.f10617g[i3];
                        } else {
                            int[] iArr2 = this.f10617g;
                            iArr2[i5] = iArr2[i3];
                        }
                        if (z2) {
                            c2311i.m11064d(this.f10612b);
                        }
                        if (this.f10621k) {
                            this.f10620j = i3;
                        }
                        c2311i.f10683p--;
                        this.f10611a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i3;
                }
                i3 = this.f10617g[i3];
            }
            int length = this.f10620j;
            int i9 = length + 1;
            if (this.f10621k) {
                int[] iArr3 = this.f10616f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i9;
            }
            int[] iArr4 = this.f10616f;
            if (length >= iArr4.length && this.f10611a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f10616f;
                    if (i10 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i10] == -1) {
                        length = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr6 = this.f10616f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i11 = this.f10614d * 2;
                this.f10614d = i11;
                this.f10621k = false;
                this.f10620j = length - 1;
                this.f10618h = Arrays.copyOf(this.f10618h, i11);
                this.f10616f = Arrays.copyOf(this.f10616f, this.f10614d);
                this.f10617g = Arrays.copyOf(this.f10617g, this.f10614d);
            }
            this.f10616f[length] = c2311i.f10673f;
            this.f10618h[length] = f3;
            if (i5 != -1) {
                int[] iArr7 = this.f10617g;
                iArr7[length] = iArr7[i5];
                iArr7[i5] = length;
            } else {
                this.f10617g[length] = this.f10619i;
                this.f10619i = length;
            }
            c2311i.f10683p++;
            c2311i.m11062a(this.f10612b);
            this.f10611a++;
            if (!this.f10621k) {
                this.f10620j++;
            }
            int i12 = this.f10620j;
            int[] iArr8 = this.f10616f;
            if (i12 >= iArr8.length) {
                this.f10621k = true;
                this.f10620j = iArr8.length - 1;
            }
        }
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: g */
    public int mo10984g() {
        return this.f10611a;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: h */
    public C2311i mo10985h(int i3) {
        int i4 = this.f10619i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10611a; i5++) {
            if (i5 == i3) {
                return this.f10613c.f10631d[this.f10616f[i4]];
            }
            i4 = this.f10617g[i4];
        }
        return null;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: i */
    public final float mo10986i(C2311i c2311i) {
        int i3 = this.f10619i;
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            if (this.f10616f[i3] == c2311i.f10673f) {
                return this.f10618h[i3];
            }
            i3 = this.f10617g[i3];
        }
        return 0.0f;
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: j */
    public void mo10987j(float f3) {
        int i3 = this.f10619i;
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            float[] fArr = this.f10618h;
            fArr[i3] = fArr[i3] / f3;
            i3 = this.f10617g[i3];
        }
    }

    @Override // p137p.C2304b.a
    /* JADX INFO: renamed from: k */
    public void mo10988k() {
        int i3 = this.f10619i;
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            float[] fArr = this.f10618h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f10617g[i3];
        }
    }

    public String toString() {
        int i3 = this.f10619i;
        String str = "";
        for (int i4 = 0; i3 != -1 && i4 < this.f10611a; i4++) {
            str = ((str + " -> ") + this.f10618h[i3] + " : ") + this.f10613c.f10631d[this.f10616f[i3]];
            i3 = this.f10617g[i3];
        }
        return str;
    }
}
