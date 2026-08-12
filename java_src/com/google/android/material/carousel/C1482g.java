package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p009D.AbstractC0091a;
import p034L0.InterfaceC0366a;

/* JADX INFO: renamed from: com.google.android.material.carousel.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1482g extends AbstractC1478c {

    /* JADX INFO: renamed from: d */
    private static final int[] f7338d = {1};

    /* JADX INFO: renamed from: e */
    private static final int[] f7339e = {1, 0};

    /* JADX INFO: renamed from: c */
    private int f7340c = 0;

    @Override // com.google.android.material.carousel.AbstractC1478c
    /* JADX INFO: renamed from: g */
    public C1480e mo7856g(InterfaceC0366a interfaceC0366a, View view) {
        boolean z2;
        int iMo1357c = interfaceC0366a.mo1357c();
        if (interfaceC0366a.mo1359f()) {
            iMo1357c = interfaceC0366a.mo1355a();
        }
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
        float f3 = ((ViewGroup.MarginLayoutParams) c1206q).topMargin + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC0366a.mo1359f()) {
            f3 = ((ViewGroup.MarginLayoutParams) c1206q).leftMargin + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fM7853d = m7853d() + f3;
        float fMax = Math.max(m7852c() + f3, fM7853d);
        float f4 = iMo1357c;
        float fMin = Math.min(measuredHeight + f3, f4);
        float fM257a = AbstractC0091a.m257a((measuredHeight / 3.0f) + f3, fM7853d + f3, fMax + f3);
        float f5 = (fMin + fM257a) / 2.0f;
        int[] iArrM7850a = f7338d;
        float f6 = 2.0f * fM7853d;
        if (f4 <= f6) {
            iArrM7850a = new int[]{0};
        }
        int[] iArrM7850a2 = f7339e;
        if (interfaceC0366a.mo1356b() == 1) {
            iArrM7850a = AbstractC1478c.m7850a(iArrM7850a);
            iArrM7850a2 = AbstractC1478c.m7850a(iArrM7850a2);
        }
        int[] iArr = iArrM7850a2;
        int[] iArr2 = iArrM7850a;
        float f7 = f3;
        int iMax = (int) Math.max(1.0d, Math.floor(((f4 - (AbstractC1479d.m7867i(iArr) * f5)) - (AbstractC1479d.m7867i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f4 / fMin);
        int i3 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = iCeil - i4;
        }
        C1476a c1476aM7833c = C1476a.m7833c(f4, fM257a, fM7853d, fMax, iArr2, f5, iArr, fMin, iArr3);
        this.f7340c = c1476aM7833c.m7837e();
        boolean zM7920i = m7920i(c1476aM7833c, interfaceC0366a.m1358e());
        int i5 = c1476aM7833c.f7294d;
        if (i5 == 0 && c1476aM7833c.f7293c == 0 && f4 > f6) {
            c1476aM7833c.f7293c = 1;
            z2 = true;
        } else {
            z2 = zM7920i;
        }
        if (z2) {
            c1476aM7833c = C1476a.m7833c(f4, fM257a, fM7853d, fMax, new int[]{c1476aM7833c.f7293c}, f5, new int[]{i5}, fMin, new int[]{c1476aM7833c.f7297g});
        }
        return AbstractC1479d.m7862d(view.getContext(), f7, iMo1357c, c1476aM7833c, interfaceC0366a.mo1356b());
    }

    @Override // com.google.android.material.carousel.AbstractC1478c
    /* JADX INFO: renamed from: h */
    public boolean mo7857h(InterfaceC0366a interfaceC0366a, int i3) {
        if (i3 >= this.f7340c || interfaceC0366a.m1358e() < this.f7340c) {
            return i3 >= this.f7340c && interfaceC0366a.m1358e() < this.f7340c;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    boolean m7920i(C1476a c1476a, int i3) {
        int iM7837e = c1476a.m7837e() - i3;
        boolean z2 = iM7837e > 0 && (c1476a.f7293c > 0 || c1476a.f7294d > 1);
        while (iM7837e > 0) {
            int i4 = c1476a.f7293c;
            if (i4 > 0) {
                c1476a.f7293c = i4 - 1;
            } else {
                int i5 = c1476a.f7294d;
                if (i5 > 1) {
                    c1476a.f7294d = i5 - 1;
                }
            }
            iM7837e--;
        }
        return z2;
    }
}
