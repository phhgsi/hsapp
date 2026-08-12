package com.google.android.material.carousel;

import p009D.AbstractC0091a;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1476a {

    /* JADX INFO: renamed from: a */
    final int f7291a;

    /* JADX INFO: renamed from: b */
    float f7292b;

    /* JADX INFO: renamed from: c */
    int f7293c;

    /* JADX INFO: renamed from: d */
    int f7294d;

    /* JADX INFO: renamed from: e */
    float f7295e;

    /* JADX INFO: renamed from: f */
    float f7296f;

    /* JADX INFO: renamed from: g */
    final int f7297g;

    /* JADX INFO: renamed from: h */
    final float f7298h;

    public C1476a(int i3, float f3, float f4, float f5, int i4, float f6, int i5, float f7, int i6, float f8) {
        this.f7291a = i3;
        this.f7292b = AbstractC0091a.m257a(f3, f4, f5);
        this.f7293c = i4;
        this.f7295e = f6;
        this.f7294d = i5;
        this.f7296f = f7;
        this.f7297g = i6;
        m7834d(f8, f4, f5, f7);
        this.f7298h = m7832b(f7);
    }

    /* JADX INFO: renamed from: a */
    private float m7831a(float f3, int i3, float f4, int i4, int i5) {
        if (i3 <= 0) {
            f4 = 0.0f;
        }
        float f5 = i4 / 2.0f;
        return (f3 - ((i3 + f5) * f4)) / (i5 + f5);
    }

    /* JADX INFO: renamed from: b */
    private float m7832b(float f3) {
        if (m7836g()) {
            return Math.abs(f3 - this.f7296f) * this.f7291a;
        }
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static C1476a m7833c(float f3, float f4, float f5, float f6, int[] iArr, float f7, int[] iArr2, float f8, int[] iArr3) {
        C1476a c1476a = null;
        int i3 = 1;
        for (int i4 : iArr3) {
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = iArr2[i5];
                int length2 = iArr.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = length;
                    int i9 = i5;
                    int i10 = i3;
                    int i11 = length2;
                    int i12 = i7;
                    C1476a c1476a2 = new C1476a(i10, f4, f5, f6, iArr[i7], f7, i6, f8, i4, f3);
                    if (c1476a == null || c1476a2.f7298h < c1476a.f7298h) {
                        if (c1476a2.f7298h == 0.0f) {
                            return c1476a2;
                        }
                        c1476a = c1476a2;
                    }
                    int i13 = i10 + 1;
                    i7 = i12 + 1;
                    i5 = i9;
                    i3 = i13;
                    length = i8;
                    length2 = i11;
                }
                i5++;
                i3 = i3;
                length = length;
            }
        }
        return c1476a;
    }

    /* JADX INFO: renamed from: d */
    private void m7834d(float f3, float f4, float f5, float f6) {
        float fM7835f = f3 - m7835f();
        int i3 = this.f7293c;
        if (i3 > 0 && fM7835f > 0.0f) {
            float f7 = this.f7292b;
            this.f7292b = f7 + Math.min(fM7835f / i3, f5 - f7);
        } else if (i3 > 0 && fM7835f < 0.0f) {
            float f8 = this.f7292b;
            this.f7292b = f8 + Math.max(fM7835f / i3, f4 - f8);
        }
        int i4 = this.f7293c;
        float f9 = i4 > 0 ? this.f7292b : 0.0f;
        this.f7292b = f9;
        float fM7831a = m7831a(f3, i4, f9, this.f7294d, this.f7297g);
        this.f7296f = fM7831a;
        float f10 = (this.f7292b + fM7831a) / 2.0f;
        this.f7295e = f10;
        int i5 = this.f7294d;
        if (i5 <= 0 || fM7831a == f6) {
            return;
        }
        float f11 = (f6 - fM7831a) * this.f7297g;
        float fMin = Math.min(Math.abs(f11), f10 * 0.1f * i5);
        if (f11 > 0.0f) {
            this.f7295e -= fMin / this.f7294d;
            this.f7296f += fMin / this.f7297g;
        } else {
            this.f7295e += fMin / this.f7294d;
            this.f7296f -= fMin / this.f7297g;
        }
    }

    /* JADX INFO: renamed from: f */
    private float m7835f() {
        return (this.f7296f * this.f7297g) + (this.f7295e * this.f7294d) + (this.f7292b * this.f7293c);
    }

    /* JADX INFO: renamed from: g */
    private boolean m7836g() {
        int i3 = this.f7297g;
        if (i3 <= 0 || this.f7293c <= 0 || this.f7294d <= 0) {
            return i3 <= 0 || this.f7293c <= 0 || this.f7296f > this.f7292b;
        }
        float f3 = this.f7296f;
        float f4 = this.f7295e;
        return f3 > f4 && f4 > this.f7292b;
    }

    /* JADX INFO: renamed from: e */
    int m7837e() {
        return this.f7293c + this.f7294d + this.f7297g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f7291a + ", smallCount=" + this.f7293c + ", smallSize=" + this.f7292b + ", mediumCount=" + this.f7294d + ", mediumSize=" + this.f7295e + ", largeCount=" + this.f7297g + ", largeSize=" + this.f7296f + ", cost=" + this.f7298h + "]";
    }
}
