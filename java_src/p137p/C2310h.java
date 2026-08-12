package p137p;

import java.util.Arrays;
import java.util.Comparator;
import p137p.C2304b;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: loaded from: classes.dex */
public class C2310h extends C2304b {

    /* JADX INFO: renamed from: g */
    private int f10660g;

    /* JADX INFO: renamed from: h */
    private C2311i[] f10661h;

    /* JADX INFO: renamed from: i */
    private C2311i[] f10662i;

    /* JADX INFO: renamed from: j */
    private int f10663j;

    /* JADX INFO: renamed from: k */
    b f10664k;

    /* JADX INFO: renamed from: l */
    C2305c f10665l;

    /* JADX INFO: renamed from: p.h$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2311i c2311i, C2311i c2311i2) {
            return c2311i.f10673f - c2311i2.f10673f;
        }
    }

    /* JADX INFO: renamed from: p.h$b */
    class b {

        /* JADX INFO: renamed from: a */
        C2311i f10667a;

        /* JADX INFO: renamed from: b */
        C2310h f10668b;

        public b(C2310h c2310h) {
            this.f10668b = c2310h;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11056a(C2311i c2311i, float f3) {
            boolean z2 = true;
            if (!this.f10667a.f10671d) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = c2311i.f10679l[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f3;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        this.f10667a.f10679l[i3] = f5;
                    } else {
                        this.f10667a.f10679l[i3] = 0.0f;
                    }
                }
                return true;
            }
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f10667a.f10679l;
                float f6 = fArr[i4] + (c2311i.f10679l[i4] * f3);
                fArr[i4] = f6;
                if (Math.abs(f6) < 1.0E-4f) {
                    this.f10667a.f10679l[i4] = 0.0f;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                C2310h.this.m11054G(this.f10667a);
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void m11057b(C2311i c2311i) {
            this.f10667a = c2311i;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m11058c() {
            for (int i3 = 8; i3 >= 0; i3--) {
                float f3 = this.f10667a.f10679l[i3];
                if (f3 > 0.0f) {
                    return false;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m11059d(C2311i c2311i) {
            int i3 = 8;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                float f3 = c2311i.f10679l[i3];
                float f4 = this.f10667a.f10679l[i3];
                if (f4 == f3) {
                    i3--;
                } else if (f4 < f3) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m11060e() {
            Arrays.fill(this.f10667a.f10679l, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f10667a != null) {
                for (int i3 = 0; i3 < 9; i3++) {
                    str = str + this.f10667a.f10679l[i3] + " ";
                }
            }
            return str + "] " + this.f10667a;
        }
    }

    public C2310h(C2305c c2305c) {
        super(c2305c);
        this.f10660g = 128;
        this.f10661h = new C2311i[128];
        this.f10662i = new C2311i[128];
        this.f10663j = 0;
        this.f10664k = new b(this);
        this.f10665l = c2305c;
    }

    /* JADX INFO: renamed from: F */
    private final void m11053F(C2311i c2311i) {
        int i3;
        int i4 = this.f10663j + 1;
        C2311i[] c2311iArr = this.f10661h;
        if (i4 > c2311iArr.length) {
            C2311i[] c2311iArr2 = (C2311i[]) Arrays.copyOf(c2311iArr, c2311iArr.length * 2);
            this.f10661h = c2311iArr2;
            this.f10662i = (C2311i[]) Arrays.copyOf(c2311iArr2, c2311iArr2.length * 2);
        }
        C2311i[] c2311iArr3 = this.f10661h;
        int i5 = this.f10663j;
        c2311iArr3[i5] = c2311i;
        int i6 = i5 + 1;
        this.f10663j = i6;
        if (i6 > 1 && c2311iArr3[i5].f10673f > c2311i.f10673f) {
            int i7 = 0;
            while (true) {
                i3 = this.f10663j;
                if (i7 >= i3) {
                    break;
                }
                this.f10662i[i7] = this.f10661h[i7];
                i7++;
            }
            Arrays.sort(this.f10662i, 0, i3, new a());
            for (int i8 = 0; i8 < this.f10663j; i8++) {
                this.f10661h[i8] = this.f10662i[i8];
            }
        }
        c2311i.f10671d = true;
        c2311i.m11062a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m11054G(C2311i c2311i) {
        int i3 = 0;
        while (i3 < this.f10663j) {
            if (this.f10661h[i3] == c2311i) {
                while (true) {
                    int i4 = this.f10663j;
                    if (i3 >= i4 - 1) {
                        this.f10663j = i4 - 1;
                        c2311i.f10671d = false;
                        return;
                    } else {
                        C2311i[] c2311iArr = this.f10661h;
                        int i5 = i3 + 1;
                        c2311iArr[i3] = c2311iArr[i5];
                        i3 = i5;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    @Override // p137p.C2304b
    /* JADX INFO: renamed from: B */
    public void mo10992B(C2306d c2306d, C2304b c2304b, boolean z2) {
        C2311i c2311i = c2304b.f10622a;
        if (c2311i == null) {
            return;
        }
        C2304b.a aVar = c2304b.f10626e;
        int iMo10984g = aVar.mo10984g();
        for (int i3 = 0; i3 < iMo10984g; i3++) {
            C2311i c2311iMo10985h = aVar.mo10985h(i3);
            float fMo10978a = aVar.mo10978a(i3);
            this.f10664k.m11057b(c2311iMo10985h);
            if (this.f10664k.m11056a(c2311i, fMo10978a)) {
                m11053F(c2311iMo10985h);
            }
            this.f10623b += c2304b.f10623b * fMo10978a;
        }
        m11054G(c2311i);
    }

    @Override // p137p.C2304b, p137p.C2306d.a
    /* JADX INFO: renamed from: a */
    public void mo10995a(C2311i c2311i) {
        this.f10664k.m11057b(c2311i);
        this.f10664k.m11060e();
        c2311i.f10679l[c2311i.f10675h] = 1.0f;
        m11053F(c2311i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // p137p.C2304b, p137p.C2306d.a
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p137p.C2311i mo10997c(p137p.C2306d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f10663j
            if (r0 >= r2) goto L32
            p.i[] r2 = r4.f10661h
            r2 = r2[r0]
            int r3 = r2.f10673f
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            p.h$b r3 = r4.f10664k
            r3.m11057b(r2)
            if (r1 != r5) goto L22
            p.h$b r2 = r4.f10664k
            boolean r2 = r2.m11058c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            p.h$b r2 = r4.f10664k
            p.i[] r3 = r4.f10661h
            r3 = r3[r1]
            boolean r2 = r2.m11059d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            p.i[] r5 = r4.f10661h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p137p.C2310h.mo10997c(p.d, boolean[]):p.i");
    }

    @Override // p137p.C2304b, p137p.C2306d.a
    public void clear() {
        this.f10663j = 0;
        this.f10623b = 0.0f;
    }

    @Override // p137p.C2304b, p137p.C2306d.a
    public boolean isEmpty() {
        return this.f10663j == 0;
    }

    @Override // p137p.C2304b
    public String toString() {
        String str = " goal -> (" + this.f10623b + ") : ";
        for (int i3 = 0; i3 < this.f10663j; i3++) {
            this.f10664k.m11057b(this.f10661h[i3]);
            str = str + this.f10664k + " ";
        }
        return str;
    }
}
