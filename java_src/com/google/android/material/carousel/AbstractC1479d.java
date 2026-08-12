package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.C1480e;
import p016F0.AbstractC0142c;

/* JADX INFO: renamed from: com.google.android.material.carousel.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1479d {
    /* JADX INFO: renamed from: a */
    static float m7859a(float f3, float f4, int i3) {
        return f3 + (Math.max(0, i3 - 1) * f4);
    }

    /* JADX INFO: renamed from: b */
    static float m7860b(float f3, float f4, int i3) {
        return i3 > 0 ? f3 + (f4 / 2.0f) : f3;
    }

    /* JADX INFO: renamed from: c */
    static C1480e m7861c(Context context, float f3, int i3, C1476a c1476a) {
        float f4;
        float f5;
        float fMin = Math.min(m7864f(context) + f3, c1476a.f7296f);
        float f6 = fMin / 2.0f;
        float f7 = 0.0f - f6;
        float fM7860b = m7860b(0.0f, c1476a.f7292b, c1476a.f7293c);
        float fM7868j = m7868j(0.0f, m7859a(fM7860b, c1476a.f7292b, (int) Math.floor(c1476a.f7293c / 2.0f)), c1476a.f7292b, c1476a.f7293c);
        float fM7860b2 = m7860b(fM7868j, c1476a.f7295e, c1476a.f7294d);
        float fM7868j2 = m7868j(fM7868j, m7859a(fM7860b2, c1476a.f7295e, (int) Math.floor(c1476a.f7294d / 2.0f)), c1476a.f7295e, c1476a.f7294d);
        float fM7860b3 = m7860b(fM7868j2, c1476a.f7296f, c1476a.f7297g);
        float fM7868j3 = m7868j(fM7868j2, m7859a(fM7860b3, c1476a.f7296f, c1476a.f7297g), c1476a.f7296f, c1476a.f7297g);
        float fM7860b4 = m7860b(fM7868j3, c1476a.f7295e, c1476a.f7294d);
        float fM7860b5 = m7860b(m7868j(fM7868j3, m7859a(fM7860b4, c1476a.f7295e, (int) Math.ceil(c1476a.f7294d / 2.0f)), c1476a.f7295e, c1476a.f7294d), c1476a.f7292b, c1476a.f7293c);
        float f8 = i3 + f6;
        float fM7851b = AbstractC1478c.m7851b(fMin, c1476a.f7296f, f3);
        float fM7851b2 = AbstractC1478c.m7851b(c1476a.f7292b, c1476a.f7296f, f3);
        float fM7851b3 = AbstractC1478c.m7851b(c1476a.f7295e, c1476a.f7296f, f3);
        C1480e.b bVarM7886a = new C1480e.b(c1476a.f7296f, i3).m7886a(f7, fM7851b, fMin);
        if (c1476a.f7293c > 0) {
            f4 = 2.0f;
            f5 = fM7851b;
            bVarM7886a.m7892g(fM7860b, fM7851b2, c1476a.f7292b, (int) Math.floor(r7 / 2.0f));
        } else {
            f4 = 2.0f;
            f5 = fM7851b;
        }
        if (c1476a.f7294d > 0) {
            bVarM7886a.m7892g(fM7860b2, fM7851b3, c1476a.f7295e, (int) Math.floor(r4 / f4));
        }
        bVarM7886a.m7893h(fM7860b3, 0.0f, c1476a.f7296f, c1476a.f7297g, true);
        if (c1476a.f7294d > 0) {
            bVarM7886a.m7892g(fM7860b4, fM7851b3, c1476a.f7295e, (int) Math.ceil(r4 / f4));
        }
        if (c1476a.f7293c > 0) {
            bVarM7886a.m7892g(fM7860b5, fM7851b2, c1476a.f7292b, (int) Math.ceil(r0 / f4));
        }
        bVarM7886a.m7886a(f8, f5, fMin);
        return bVarM7886a.m7894i();
    }

    /* JADX INFO: renamed from: d */
    static C1480e m7862d(Context context, float f3, int i3, C1476a c1476a, int i4) {
        return i4 == 1 ? m7861c(context, f3, i3, c1476a) : m7863e(context, f3, i3, c1476a);
    }

    /* JADX INFO: renamed from: e */
    static C1480e m7863e(Context context, float f3, int i3, C1476a c1476a) {
        float fMin = Math.min(m7864f(context) + f3, c1476a.f7296f);
        float f4 = fMin / 2.0f;
        float f5 = 0.0f - f4;
        float fM7860b = m7860b(0.0f, c1476a.f7296f, c1476a.f7297g);
        float fM7868j = m7868j(0.0f, m7859a(fM7860b, c1476a.f7296f, c1476a.f7297g), c1476a.f7296f, c1476a.f7297g);
        float fM7860b2 = m7860b(fM7868j, c1476a.f7295e, c1476a.f7294d);
        float fM7860b3 = m7860b(m7868j(fM7868j, fM7860b2, c1476a.f7295e, c1476a.f7294d), c1476a.f7292b, c1476a.f7293c);
        float f6 = i3 + f4;
        float fM7851b = AbstractC1478c.m7851b(fMin, c1476a.f7296f, f3);
        float fM7851b2 = AbstractC1478c.m7851b(c1476a.f7292b, c1476a.f7296f, f3);
        float fM7851b3 = AbstractC1478c.m7851b(c1476a.f7295e, c1476a.f7296f, f3);
        C1480e.b bVarM7893h = new C1480e.b(c1476a.f7296f, i3).m7886a(f5, fM7851b, fMin).m7893h(fM7860b, 0.0f, c1476a.f7296f, c1476a.f7297g, true);
        if (c1476a.f7294d > 0) {
            bVarM7893h.m7887b(fM7860b2, fM7851b3, c1476a.f7295e);
        }
        int i4 = c1476a.f7293c;
        if (i4 > 0) {
            bVarM7893h.m7892g(fM7860b3, fM7851b2, c1476a.f7292b, i4);
        }
        bVarM7893h.m7886a(f6, fM7851b, fMin);
        return bVarM7893h.m7894i();
    }

    /* JADX INFO: renamed from: f */
    static float m7864f(Context context) {
        return context.getResources().getDimension(AbstractC0142c.f439x);
    }

    /* JADX INFO: renamed from: g */
    static float m7865g(Context context) {
        return context.getResources().getDimension(AbstractC0142c.f441y);
    }

    /* JADX INFO: renamed from: h */
    static float m7866h(Context context) {
        return context.getResources().getDimension(AbstractC0142c.f443z);
    }

    /* JADX INFO: renamed from: i */
    static int m7867i(int[] iArr) {
        int i3 = Integer.MIN_VALUE;
        for (int i4 : iArr) {
            if (i4 > i3) {
                i3 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    static float m7868j(float f3, float f4, float f5, int i3) {
        return i3 > 0 ? f4 + (f5 / 2.0f) : f3;
    }
}
