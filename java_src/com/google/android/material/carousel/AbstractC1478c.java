package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import p034L0.InterfaceC0366a;

/* JADX INFO: renamed from: com.google.android.material.carousel.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1478c {

    /* JADX INFO: renamed from: a */
    private float f7302a;

    /* JADX INFO: renamed from: b */
    private float f7303b;

    /* JADX INFO: renamed from: com.google.android.material.carousel.c$a */
    enum a {
        CONTAINED,
        UNCONTAINED
    }

    /* JADX INFO: renamed from: a */
    static int[] m7850a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = iArr[i3] * 2;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    public static float m7851b(float f3, float f4, float f5) {
        return 1.0f - ((f3 - f5) / (f4 - f5));
    }

    /* JADX INFO: renamed from: c */
    public float m7852c() {
        return this.f7303b;
    }

    /* JADX INFO: renamed from: d */
    public float m7853d() {
        return this.f7302a;
    }

    /* JADX INFO: renamed from: e */
    a m7854e() {
        return a.CONTAINED;
    }

    /* JADX INFO: renamed from: f */
    void m7855f(Context context) {
        float fM7866h = this.f7302a;
        if (fM7866h <= 0.0f) {
            fM7866h = AbstractC1479d.m7866h(context);
        }
        this.f7302a = fM7866h;
        float fM7865g = this.f7303b;
        if (fM7865g <= 0.0f) {
            fM7865g = AbstractC1479d.m7865g(context);
        }
        this.f7303b = fM7865g;
    }

    /* JADX INFO: renamed from: g */
    public abstract C1480e mo7856g(InterfaceC0366a interfaceC0366a, View view);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo7857h(InterfaceC0366a interfaceC0366a, int i3);
}
