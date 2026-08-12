package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1228g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.material.carousel.C1480e;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p009D.AbstractC0091a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p024I.AbstractC0211h;
import p034L0.InterfaceC0366a;
import p096e0.AbstractC1835c;
import p167z.AbstractC2571d;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC1205p implements InterfaceC0366a, RecyclerView.AbstractC1214y.b {

    /* JADX INFO: renamed from: A */
    private int f7267A;

    /* JADX INFO: renamed from: B */
    private Map f7268B;

    /* JADX INFO: renamed from: C */
    private AbstractC1477b f7269C;

    /* JADX INFO: renamed from: D */
    private final View.OnLayoutChangeListener f7270D;

    /* JADX INFO: renamed from: E */
    private int f7271E;

    /* JADX INFO: renamed from: F */
    private int f7272F;

    /* JADX INFO: renamed from: G */
    private int f7273G;

    /* JADX INFO: renamed from: s */
    int f7274s;

    /* JADX INFO: renamed from: t */
    int f7275t;

    /* JADX INFO: renamed from: u */
    int f7276u;

    /* JADX INFO: renamed from: v */
    private boolean f7277v;

    /* JADX INFO: renamed from: w */
    private final C1474c f7278w;

    /* JADX INFO: renamed from: x */
    private AbstractC1478c f7279x;

    /* JADX INFO: renamed from: y */
    private C1481f f7280y;

    /* JADX INFO: renamed from: z */
    private C1480e f7281z;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    class C1472a extends C1228g {
        C1472a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y
        /* JADX INFO: renamed from: a */
        public PointF mo5943a(int i3) {
            return CarouselLayoutManager.this.mo5479d(i3);
        }

        @Override // androidx.recyclerview.widget.C1228g
        /* JADX INFO: renamed from: t */
        public int mo6189t(View view, int i3) {
            if (CarouselLayoutManager.this.f7280y == null || !CarouselLayoutManager.this.mo1359f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m7827g2(carouselLayoutManager.m5847l0(view));
        }

        @Override // androidx.recyclerview.widget.C1228g
        /* JADX INFO: renamed from: u */
        public int mo6190u(View view, int i3) {
            if (CarouselLayoutManager.this.f7280y == null || CarouselLayoutManager.this.mo1359f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.m7827g2(carouselLayoutManager.m5847l0(view));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    private static final class C1473b {

        /* JADX INFO: renamed from: a */
        final View f7283a;

        /* JADX INFO: renamed from: b */
        final float f7284b;

        /* JADX INFO: renamed from: c */
        final float f7285c;

        /* JADX INFO: renamed from: d */
        final C1475d f7286d;

        C1473b(View view, float f3, float f4, C1475d c1475d) {
            this.f7283a = view;
            this.f7284b = f3;
            this.f7285c = f4;
            this.f7286d = c1475d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    private static class C1474c extends RecyclerView.AbstractC1204o {

        /* JADX INFO: renamed from: a */
        private final Paint f7287a;

        /* JADX INFO: renamed from: b */
        private List f7288b;

        C1474c() {
            Paint paint = new Paint();
            this.f7287a = paint;
            this.f7288b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1204o
        /* JADX INFO: renamed from: i */
        public void mo5772i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1215z c1215z) {
            super.mo5772i(canvas, recyclerView, c1215z);
            this.f7287a.setStrokeWidth(recyclerView.getResources().getDimension(AbstractC0142c.f437w));
            for (C1480e.c cVar : this.f7288b) {
                this.f7287a.setColor(AbstractC2571d.m12261c(-65281, -16776961, cVar.f7324c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).mo1359f()) {
                    canvas.drawLine(cVar.f7323b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m7770A2(), cVar.f7323b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m7819w2(), this.f7287a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).m7820x2(), cVar.f7323b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m7821y2(), cVar.f7323b, this.f7287a);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        void m7830j(List list) {
            this.f7288b = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$d */
    private static class C1475d {

        /* JADX INFO: renamed from: a */
        final C1480e.c f7289a;

        /* JADX INFO: renamed from: b */
        final C1480e.c f7290b;

        C1475d(C1480e.c cVar, C1480e.c cVar2) {
            AbstractC0211h.m604a(cVar.f7322a <= cVar2.f7322a);
            this.f7289a = cVar;
            this.f7290b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new C1482g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public int m7770A2() {
        return this.f7269C.mo7845h();
    }

    /* JADX INFO: renamed from: B2 */
    private int m7771B2() {
        if (m5813R()) {
            return 0;
        }
        return m7829v2() == 1 ? m5838h0() : m5843j0();
    }

    /* JADX INFO: renamed from: C2 */
    private int m7772C2(int i3, C1480e c1480e) {
        return m7823F2() ? (int) (((m7812n2() - c1480e.m7879i().f7322a) - (i3 * c1480e.m7877g())) - (c1480e.m7877g() / 2.0f)) : (int) (((i3 * c1480e.m7877g()) - c1480e.m7872b().f7322a) + (c1480e.m7877g() / 2.0f));
    }

    /* JADX INFO: renamed from: D2 */
    private int m7773D2(int i3, C1480e c1480e) {
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (C1480e.c cVar : c1480e.m7876f()) {
            float fM7877g = (i3 * c1480e.m7877g()) + (c1480e.m7877g() / 2.0f);
            int iM7812n2 = (m7823F2() ? (int) ((m7812n2() - cVar.f7322a) - fM7877g) : (int) (fM7877g - cVar.f7322a)) - this.f7274s;
            if (Math.abs(i4) > Math.abs(iM7812n2)) {
                i4 = iM7812n2;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: E2 */
    private static C1475d m7774E2(List list, float f3, boolean z2) {
        float f4 = Float.MAX_VALUE;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1480e.c cVar = (C1480e.c) list.get(i7);
            float f8 = z2 ? cVar.f7323b : cVar.f7322a;
            float fAbs = Math.abs(f8 - f3);
            if (f8 <= f3 && fAbs <= f4) {
                i3 = i7;
                f4 = fAbs;
            }
            if (f8 > f3 && fAbs <= f6) {
                i5 = i7;
                f6 = fAbs;
            }
            if (f8 <= f7) {
                i4 = i7;
                f7 = f8;
            }
            if (f8 > f5) {
                i6 = i7;
                f5 = f8;
            }
        }
        if (i3 == -1) {
            i3 = i4;
        }
        if (i5 == -1) {
            i5 = i6;
        }
        return new C1475d((C1480e.c) list.get(i3), (C1480e.c) list.get(i5));
    }

    /* JADX INFO: renamed from: G2 */
    private boolean m7775G2(float f3, C1475d c1475d) {
        float fM7799Z1 = m7799Z1(f3, m7818t2(f3, c1475d) / 2.0f);
        return m7823F2() ? fM7799Z1 < 0.0f : fM7799Z1 > ((float) m7812n2());
    }

    /* JADX INFO: renamed from: H2 */
    private boolean m7776H2(float f3, C1475d c1475d) {
        float fM7798Y1 = m7798Y1(f3, m7818t2(f3, c1475d) / 2.0f);
        return m7823F2() ? fM7798Y1 > ((float) m7812n2()) : fM7798Y1 < 0.0f;
    }

    /* JADX INFO: renamed from: I2 */
    private void m7777I2() {
        if (this.f7277v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i3 = 0; i3 < m5809O(); i3++) {
                View viewM5807N = m5807N(i3);
                Log.d("CarouselLayoutManager", "item position " + m5847l0(viewM5807N) + ", center:" + m7813o2(viewM5807N) + ", child index:" + i3);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    /* JADX INFO: renamed from: J2 */
    private C1473b m7778J2(RecyclerView.C1211v c1211v, float f3, int i3) {
        View viewM5932o = c1211v.m5932o(i3);
        mo5789E0(viewM5932o, 0, 0);
        float fM7798Y1 = m7798Y1(f3, this.f7281z.m7877g() / 2.0f);
        C1475d c1475dM7774E2 = m7774E2(this.f7281z.m7878h(), fM7798Y1, false);
        return new C1473b(viewM5932o, fM7798Y1, m7803d2(fM7798Y1, c1475dM7774E2), c1475dM7774E2);
    }

    /* JADX INFO: renamed from: K2 */
    private float m7779K2(View view, float f3, float f4, Rect rect) {
        float fM7798Y1 = m7798Y1(f3, f4);
        C1475d c1475dM7774E2 = m7774E2(this.f7281z.m7878h(), fM7798Y1, false);
        float fM7803d2 = m7803d2(fM7798Y1, c1475dM7774E2);
        super.mo5817U(view, rect);
        m7791U2(view, fM7798Y1, c1475dM7774E2);
        this.f7269C.mo7847j(view, rect, f4, fM7803d2);
        return fM7803d2;
    }

    /* JADX INFO: renamed from: L2 */
    private void m7780L2(RecyclerView.C1211v c1211v) {
        View viewM5932o = c1211v.m5932o(0);
        mo5789E0(viewM5932o, 0, 0);
        C1480e c1480eMo7856g = this.f7279x.mo7856g(this, viewM5932o);
        if (m7823F2()) {
            c1480eMo7856g = C1480e.m7870p(c1480eMo7856g, m7812n2());
        }
        this.f7280y = C1481f.m7901f(this, c1480eMo7856g, m7814p2(), m7817s2(), m7771B2(), this.f7279x.m7854e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public void m7781M2() {
        this.f7280y = null;
        m5871x1();
    }

    /* JADX INFO: renamed from: N2 */
    private void m7782N2(RecyclerView.C1211v c1211v) {
        while (m5809O() > 0) {
            View viewM5807N = m5807N(0);
            float fM7813o2 = m7813o2(viewM5807N);
            if (!m7776H2(fM7813o2, m7774E2(this.f7281z.m7878h(), fM7813o2, true))) {
                break;
            } else {
                m5859q1(viewM5807N, c1211v);
            }
        }
        while (m5809O() - 1 >= 0) {
            View viewM5807N2 = m5807N(m5809O() - 1);
            float fM7813o22 = m7813o2(viewM5807N2);
            if (!m7775G2(fM7813o22, m7774E2(this.f7281z.m7878h(), fM7813o22, true))) {
                return;
            } else {
                m5859q1(viewM5807N2, c1211v);
            }
        }
    }

    /* JADX INFO: renamed from: O2 */
    private int m7783O2(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (m5809O() == 0 || i3 == 0) {
            return 0;
        }
        if (this.f7280y == null) {
            m7780L2(c1211v);
        }
        if (m5830e() <= m7815q2(this.f7280y).m7884n()) {
            return 0;
        }
        int iM7806h2 = m7806h2(i3, this.f7274s, this.f7275t, this.f7276u);
        this.f7274s += iM7806h2;
        m7793V2(this.f7280y);
        float fM7877g = this.f7281z.m7877g() / 2.0f;
        float fM7804e2 = m7804e2(m5847l0(m5807N(0)));
        Rect rect = new Rect();
        float f3 = m7823F2() ? this.f7281z.m7879i().f7323b : this.f7281z.m7872b().f7323b;
        float f4 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < m5809O(); i4++) {
            View viewM5807N = m5807N(i4);
            float fAbs = Math.abs(f3 - m7779K2(viewM5807N, fM7804e2, fM7877g, rect));
            if (viewM5807N != null && fAbs < f4) {
                this.f7272F = m5847l0(viewM5807N);
                f4 = fAbs;
            }
            fM7804e2 = m7798Y1(fM7804e2, this.f7281z.m7877g());
        }
        m7809k2(c1211v, c1215z);
        return iM7806h2;
    }

    /* JADX INFO: renamed from: P2 */
    private void m7784P2(RecyclerView recyclerView, int i3) {
        if (mo1359f()) {
            recyclerView.scrollBy(i3, 0);
        } else {
            recyclerView.scrollBy(0, i3);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ void m7786R1(final CarouselLayoutManager carouselLayoutManager, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        carouselLayoutManager.getClass();
        if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
            return;
        }
        view.post(new Runnable() { // from class: L0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1488d.m7781M2();
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    private void m7787R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f694L0);
            m7824Q2(typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f703M0, 0));
            m7826T2(typedArrayObtainStyledAttributes.getInt(AbstractC1835c.f9243g, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: U2 */
    private void m7791U2(View view, float f3, C1475d c1475d) {
    }

    /* JADX INFO: renamed from: V2 */
    private void m7793V2(C1481f c1481f) {
        int i3 = this.f7276u;
        int i4 = this.f7275t;
        if (i3 <= i4) {
            this.f7281z = m7815q2(c1481f);
        } else {
            this.f7281z = c1481f.m7917j(this.f7274s, i4, i3);
        }
        this.f7278w.m7830j(this.f7281z.m7878h());
    }

    /* JADX INFO: renamed from: W2 */
    private void m7795W2() {
        int iM5830e = m5830e();
        int i3 = this.f7271E;
        if (iM5830e == i3 || this.f7280y == null) {
            return;
        }
        if (this.f7279x.mo7857h(this, i3)) {
            m7781M2();
        }
        this.f7271E = iM5830e;
    }

    /* JADX INFO: renamed from: X1 */
    private void m7796X1(View view, int i3, C1473b c1473b) {
        float fM7877g = this.f7281z.m7877g() / 2.0f;
        m5842j(view, i3);
        mo5789E0(view, 0, 0);
        float f3 = c1473b.f7285c;
        this.f7269C.mo7846i(view, (int) (f3 - fM7877g), (int) (f3 + fM7877g));
        m7791U2(view, c1473b.f7284b, c1473b.f7286d);
    }

    /* JADX INFO: renamed from: X2 */
    private void m7797X2() {
        if (!this.f7277v || m5809O() < 1) {
            return;
        }
        int i3 = 0;
        while (i3 < m5809O() - 1) {
            int iM5847l0 = m5847l0(m5807N(i3));
            int i4 = i3 + 1;
            int iM5847l02 = m5847l0(m5807N(i4));
            if (iM5847l0 > iM5847l02) {
                m7777I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i3 + "] had adapter position [" + iM5847l0 + "] and child at index [" + i4 + "] had adapter position [" + iM5847l02 + "].");
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private float m7798Y1(float f3, float f4) {
        return m7823F2() ? f3 - f4 : f3 + f4;
    }

    /* JADX INFO: renamed from: Z1 */
    private float m7799Z1(float f3, float f4) {
        return m7823F2() ? f3 + f4 : f3 - f4;
    }

    /* JADX INFO: renamed from: a2 */
    private void m7800a2(RecyclerView.C1211v c1211v, int i3, int i4) {
        if (i3 < 0 || i3 >= m5830e()) {
            return;
        }
        C1473b c1473bM7778J2 = m7778J2(c1211v, m7804e2(i3), i3);
        m7796X1(c1473bM7778J2.f7283a, i4, c1473bM7778J2);
    }

    /* JADX INFO: renamed from: b2 */
    private void m7801b2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z, int i3) {
        float fM7804e2 = m7804e2(i3);
        while (i3 < c1215z.m5967b()) {
            float fM7798Y1 = m7798Y1(fM7804e2, this.f7281z.m7877g() / 2.0f);
            C1475d c1475dM7774E2 = m7774E2(this.f7281z.m7878h(), fM7798Y1, false);
            float fM7803d2 = m7803d2(fM7798Y1, c1475dM7774E2);
            if (m7775G2(fM7803d2, c1475dM7774E2)) {
                return;
            }
            fM7804e2 = m7798Y1(fM7804e2, this.f7281z.m7877g());
            if (!m7776H2(fM7803d2, c1475dM7774E2)) {
                View viewM5932o = c1211v.m5932o(i3);
                m7796X1(viewM5932o, -1, new C1473b(viewM5932o, fM7798Y1, fM7803d2, c1475dM7774E2));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m7802c2(RecyclerView.C1211v c1211v, int i3) {
        float fM7804e2 = m7804e2(i3);
        while (i3 >= 0) {
            float fM7798Y1 = m7798Y1(fM7804e2, this.f7281z.m7877g() / 2.0f);
            C1475d c1475dM7774E2 = m7774E2(this.f7281z.m7878h(), fM7798Y1, false);
            float fM7803d2 = m7803d2(fM7798Y1, c1475dM7774E2);
            if (m7776H2(fM7803d2, c1475dM7774E2)) {
                return;
            }
            fM7804e2 = m7799Z1(fM7804e2, this.f7281z.m7877g());
            if (!m7775G2(fM7803d2, c1475dM7774E2)) {
                View viewM5932o = c1211v.m5932o(i3);
                m7796X1(viewM5932o, 0, new C1473b(viewM5932o, fM7798Y1, fM7803d2, c1475dM7774E2));
            }
            i3--;
        }
    }

    /* JADX INFO: renamed from: d2 */
    private float m7803d2(float f3, C1475d c1475d) {
        C1480e.c cVar = c1475d.f7289a;
        float f4 = cVar.f7323b;
        C1480e.c cVar2 = c1475d.f7290b;
        float fM483b = AbstractC0176a.m483b(f4, cVar2.f7323b, cVar.f7322a, cVar2.f7322a, f3);
        if (c1475d.f7290b != this.f7281z.m7874d() && c1475d.f7289a != this.f7281z.m7881k()) {
            return fM483b;
        }
        C1480e.c cVar3 = c1475d.f7290b;
        return fM483b + ((f3 - cVar3.f7322a) * (1.0f - cVar3.f7324c));
    }

    /* JADX INFO: renamed from: e2 */
    private float m7804e2(int i3) {
        return m7798Y1(m7822z2() - this.f7274s, this.f7281z.m7877g() * i3);
    }

    /* JADX INFO: renamed from: f2 */
    private int m7805f2(RecyclerView.C1215z c1215z, C1481f c1481f) {
        boolean zM7823F2 = m7823F2();
        C1480e c1480eM7919l = zM7823F2 ? c1481f.m7919l() : c1481f.m7915h();
        C1480e.c cVarM7872b = zM7823F2 ? c1480eM7919l.m7872b() : c1480eM7919l.m7879i();
        int iM5967b = (int) (((((c1215z.m5967b() - 1) * c1480eM7919l.m7877g()) * (zM7823F2 ? -1.0f : 1.0f)) - (cVarM7872b.f7322a - m7822z2())) + (((zM7823F2 ? -1 : 1) * cVarM7872b.f7325d) / 2.0f));
        return zM7823F2 ? Math.min(0, iM5967b) : Math.max(0, iM5967b);
    }

    /* JADX INFO: renamed from: h2 */
    private static int m7806h2(int i3, int i4, int i5, int i6) {
        int i7 = i4 + i3;
        return i7 < i5 ? i5 - i4 : i7 > i6 ? i6 - i4 : i3;
    }

    /* JADX INFO: renamed from: i2 */
    private int m7807i2(C1481f c1481f) {
        boolean zM7823F2 = m7823F2();
        C1480e c1480eM7915h = zM7823F2 ? c1481f.m7915h() : c1481f.m7919l();
        return (int) (m7822z2() - m7799Z1((zM7823F2 ? c1480eM7915h.m7879i() : c1480eM7915h.m7872b()).f7322a, c1480eM7915h.m7877g() / 2.0f));
    }

    /* JADX INFO: renamed from: j2 */
    private int m7808j2(int i3) {
        int iM7829v2 = m7829v2();
        if (i3 == 1) {
            return -1;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 17) {
            if (iM7829v2 == 0) {
                return m7823F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i3 == 33) {
            return iM7829v2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 == 66) {
            if (iM7829v2 == 0) {
                return m7823F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i3 == 130) {
            return iM7829v2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i3);
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k2 */
    private void m7809k2(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        m7782N2(c1211v);
        if (m5809O() == 0) {
            m7802c2(c1211v, this.f7267A - 1);
            m7801b2(c1211v, c1215z, this.f7267A);
        } else {
            int iM5847l0 = m5847l0(m5807N(0));
            int iM5847l02 = m5847l0(m5807N(m5809O() - 1));
            m7802c2(c1211v, iM5847l0 - 1);
            m7801b2(c1211v, c1215z, iM5847l02 + 1);
        }
        m7797X2();
    }

    /* JADX INFO: renamed from: l2 */
    private View m7810l2() {
        return m5807N(m7823F2() ? 0 : m5809O() - 1);
    }

    /* JADX INFO: renamed from: m2 */
    private View m7811m2() {
        return m5807N(m7823F2() ? m5809O() - 1 : 0);
    }

    /* JADX INFO: renamed from: n2 */
    private int m7812n2() {
        return mo1359f() ? mo1355a() : mo1357c();
    }

    /* JADX INFO: renamed from: o2 */
    private float m7813o2(View view) {
        super.mo5817U(view, new Rect());
        return mo1359f() ? r0.centerX() : r0.centerY();
    }

    /* JADX INFO: renamed from: p2 */
    private int m7814p2() {
        int i3;
        int i4;
        if (m5809O() <= 0) {
            return 0;
        }
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) m5807N(0).getLayoutParams();
        if (this.f7269C.f7299a == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) c1206q).leftMargin;
            i4 = ((ViewGroup.MarginLayoutParams) c1206q).rightMargin;
        } else {
            i3 = ((ViewGroup.MarginLayoutParams) c1206q).topMargin;
            i4 = ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin;
        }
        return i3 + i4;
    }

    /* JADX INFO: renamed from: q2 */
    private C1480e m7815q2(C1481f c1481f) {
        return m7823F2() ? c1481f.m7915h() : c1481f.m7919l();
    }

    /* JADX INFO: renamed from: r2 */
    private C1480e m7816r2(int i3) {
        C1480e c1480e;
        Map map = this.f7268B;
        return (map == null || (c1480e = (C1480e) map.get(Integer.valueOf(AbstractC0091a.m258b(i3, 0, Math.max(0, m5830e() + (-1)))))) == null) ? this.f7280y.m7914g() : c1480e;
    }

    /* JADX INFO: renamed from: s2 */
    private int m7817s2() {
        if (m5813R()) {
            return 0;
        }
        return m7829v2() == 1 ? m5845k0() : m5840i0();
    }

    /* JADX INFO: renamed from: t2 */
    private float m7818t2(float f3, C1475d c1475d) {
        C1480e.c cVar = c1475d.f7289a;
        float f4 = cVar.f7325d;
        C1480e.c cVar2 = c1475d.f7290b;
        return AbstractC0176a.m483b(f4, cVar2.f7325d, cVar.f7323b, cVar2.f7323b, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public int m7819w2() {
        return this.f7269C.mo7841d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public int m7820x2() {
        return this.f7269C.mo7842e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public int m7821y2() {
        return this.f7269C.mo7843f();
    }

    /* JADX INFO: renamed from: z2 */
    private int m7822z2() {
        return this.f7269C.mo7844g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A */
    public int mo5397A(RecyclerView.C1215z c1215z) {
        return this.f7276u - this.f7275t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: A1 */
    public int mo5398A1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (mo5487p()) {
            return m7783O2(i3, c1211v, c1215z);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: B1 */
    public void mo5462B1(int i3) {
        this.f7272F = i3;
        if (this.f7280y == null) {
            return;
        }
        this.f7274s = m7772C2(i3, m7816r2(i3));
        this.f7267A = AbstractC0091a.m258b(i3, 0, Math.max(0, m5830e() - 1));
        m7793V2(this.f7280y);
        m5871x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: C1 */
    public int mo5399C1(int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (mo5489q()) {
            return m7783O2(i3, c1211v, c1215z);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: E0 */
    public void mo5789E0(View view, int i3, int i4) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* JADX INFO: renamed from: F2 */
    boolean m7823F2() {
        return mo1359f() && m5828d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1206q mo5402I() {
        return new RecyclerView.C1206q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: K0 */
    public void mo5802K0(RecyclerView recyclerView) {
        super.mo5802K0(recyclerView);
        this.f7279x.m7855f(recyclerView.getContext());
        m7781M2();
        recyclerView.addOnLayoutChangeListener(this.f7270D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M0 */
    public void mo5468M0(RecyclerView recyclerView, RecyclerView.C1211v c1211v) {
        super.mo5468M0(recyclerView, c1211v);
        recyclerView.removeOnLayoutChangeListener(this.f7270D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: M1 */
    public void mo5469M1(RecyclerView recyclerView, RecyclerView.C1215z c1215z, int i3) {
        C1472a c1472a = new C1472a(recyclerView.getContext());
        c1472a.m5958p(i3);
        m5808N1(c1472a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: N0 */
    public View mo5405N0(View view, int i3, RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        int iM7808j2;
        if (m5809O() == 0 || (iM7808j2 = m7808j2(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iM7808j2 == -1) {
            if (m5847l0(view) == 0) {
                return null;
            }
            m7800a2(c1211v, m5847l0(m5807N(0)) - 1, 0);
            return m7811m2();
        }
        if (m5847l0(view) == m5830e() - 1) {
            return null;
        }
        m7800a2(c1211v, m5847l0(m5807N(m5809O() - 1)) + 1, -1);
        return m7810l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: O0 */
    public void mo5470O0(AccessibilityEvent accessibilityEvent) {
        super.mo5470O0(accessibilityEvent);
        if (m5809O() > 0) {
            accessibilityEvent.setFromIndex(m5847l0(m5807N(0)));
            accessibilityEvent.setToIndex(m5847l0(m5807N(m5809O() - 1)));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m7824Q2(int i3) {
        this.f7273G = i3;
        m7781M2();
    }

    /* JADX INFO: renamed from: S2 */
    public void m7825S2(AbstractC1478c abstractC1478c) {
        this.f7279x = abstractC1478c;
        m7781M2();
    }

    /* JADX INFO: renamed from: T2 */
    public void m7826T2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i3);
        }
        mo5485l(null);
        AbstractC1477b abstractC1477b = this.f7269C;
        if (abstractC1477b == null || i3 != abstractC1477b.f7299a) {
            this.f7269C = AbstractC1477b.m7839b(this, i3);
            m7781M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: U */
    public void mo5817U(View view, Rect rect) {
        super.mo5817U(view, rect);
        float fCenterY = rect.centerY();
        if (mo1359f()) {
            fCenterY = rect.centerX();
        }
        float fM7818t2 = m7818t2(fCenterY, m7774E2(this.f7281z.m7878h(), fCenterY, true));
        float fWidth = mo1359f() ? (rect.width() - fM7818t2) / 2.0f : 0.0f;
        float fHeight = mo1359f() ? 0.0f : (rect.height() - fM7818t2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: V0 */
    public void mo5410V0(RecyclerView recyclerView, int i3, int i4) {
        super.mo5410V0(recyclerView, i3, i4);
        m7795W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: W0 */
    public void mo5411W0(RecyclerView recyclerView) {
        super.mo5411W0(recyclerView);
        m7795W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: Y0 */
    public void mo5414Y0(RecyclerView recyclerView, int i3, int i4) {
        super.mo5414Y0(recyclerView, i3, i4);
        m7795W2();
    }

    @Override // p034L0.InterfaceC0366a
    /* JADX INFO: renamed from: a */
    public int mo1355a() {
        return m5862s0();
    }

    @Override // p034L0.InterfaceC0366a
    /* JADX INFO: renamed from: b */
    public int mo1356b() {
        return this.f7273G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: b1 */
    public void mo5416b1(RecyclerView.C1211v c1211v, RecyclerView.C1215z c1215z) {
        if (c1215z.m5967b() <= 0 || m7812n2() <= 0.0f) {
            m5855o1(c1211v);
            this.f7267A = 0;
            return;
        }
        boolean zM7823F2 = m7823F2();
        C1481f c1481f = this.f7280y;
        boolean z2 = c1481f == null;
        if (z2 || c1481f.m7914g().m7871a() != m7812n2()) {
            m7780L2(c1211v);
        }
        int iM7807i2 = m7807i2(this.f7280y);
        int iM7805f2 = m7805f2(c1215z, this.f7280y);
        this.f7275t = zM7823F2 ? iM7805f2 : iM7807i2;
        if (zM7823F2) {
            iM7805f2 = iM7807i2;
        }
        this.f7276u = iM7805f2;
        if (z2) {
            this.f7274s = iM7807i2;
            this.f7268B = this.f7280y.m7916i(m5830e(), this.f7275t, this.f7276u, m7823F2());
            int i3 = this.f7272F;
            if (i3 != -1) {
                this.f7274s = m7772C2(i3, m7816r2(i3));
            }
        }
        int i4 = this.f7274s;
        this.f7274s = i4 + m7806h2(0, i4, this.f7275t, this.f7276u);
        this.f7267A = AbstractC0091a.m258b(this.f7267A, 0, c1215z.m5967b());
        m7793V2(this.f7280y);
        m5782B(c1211v);
        m7809k2(c1211v, c1215z);
        this.f7271E = m5830e();
    }

    @Override // p034L0.InterfaceC0366a
    /* JADX INFO: renamed from: c */
    public int mo1357c() {
        return m5826b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: c1 */
    public void mo5417c1(RecyclerView.C1215z c1215z) {
        super.mo5417c1(c1215z);
        if (m5809O() == 0) {
            this.f7267A = 0;
        } else {
            this.f7267A = m5847l0(m5807N(0));
        }
        m7797X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y.b
    /* JADX INFO: renamed from: d */
    public PointF mo5479d(int i3) {
        if (this.f7280y == null) {
            return null;
        }
        int iM7828u2 = m7828u2(i3, m7816r2(i3));
        return mo1359f() ? new PointF(iM7828u2, 0.0f) : new PointF(0.0f, iM7828u2);
    }

    @Override // p034L0.InterfaceC0366a
    /* JADX INFO: renamed from: f */
    public boolean mo1359f() {
        return this.f7269C.f7299a == 0;
    }

    /* JADX INFO: renamed from: g2 */
    int m7827g2(int i3) {
        return (int) (this.f7274s - m7772C2(i3, m7816r2(i3)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: p */
    public boolean mo5487p() {
        return mo1359f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: q */
    public boolean mo5489q() {
        return !mo1359f();
    }

    /* JADX INFO: renamed from: u2 */
    int m7828u2(int i3, C1480e c1480e) {
        return m7772C2(i3, c1480e) - this.f7274s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: v */
    public int mo5494v(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0 || this.f7280y == null || m5830e() <= 1) {
            return 0;
        }
        return (int) (m5862s0() * (this.f7280y.m7914g().m7877g() / mo5425x(c1215z)));
    }

    /* JADX INFO: renamed from: v2 */
    public int m7829v2() {
        return this.f7269C.f7299a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w */
    public int mo5424w(RecyclerView.C1215z c1215z) {
        return this.f7274s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w0 */
    public boolean mo5495w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: w1 */
    public boolean mo5870w1(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iM7773D2;
        if (this.f7280y == null || (iM7773D2 = m7773D2(m5847l0(view), m7816r2(m5847l0(view)))) == 0) {
            return false;
        }
        m7784P2(recyclerView, m7773D2(m5847l0(view), this.f7280y.m7917j(this.f7274s + m7806h2(iM7773D2, this.f7274s, this.f7275t, this.f7276u), this.f7275t, this.f7276u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: x */
    public int mo5425x(RecyclerView.C1215z c1215z) {
        return this.f7276u - this.f7275t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: y */
    public int mo5496y(RecyclerView.C1215z c1215z) {
        if (m5809O() == 0 || this.f7280y == null || m5830e() <= 1) {
            return 0;
        }
        return (int) (m5826b0() * (this.f7280y.m7914g().m7877g() / mo5397A(c1215z)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1205p
    /* JADX INFO: renamed from: z */
    public int mo5426z(RecyclerView.C1215z c1215z) {
        return this.f7274s;
    }

    public CarouselLayoutManager(AbstractC1478c abstractC1478c) {
        this(abstractC1478c, 0);
    }

    public CarouselLayoutManager(AbstractC1478c abstractC1478c, int i3) {
        this.f7277v = false;
        this.f7278w = new C1474c();
        this.f7267A = 0;
        this.f7270D = new View.OnLayoutChangeListener() { // from class: L0.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager.m7786R1(this.f1487a, view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        this.f7272F = -1;
        this.f7273G = 0;
        m7825S2(abstractC1478c);
        m7826T2(i3);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f7277v = false;
        this.f7278w = new C1474c();
        this.f7267A = 0;
        this.f7270D = new View.OnLayoutChangeListener() { // from class: L0.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i42, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager.m7786R1(this.f1487a, view, i42, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        this.f7272F = -1;
        this.f7273G = 0;
        m7825S2(new C1482g());
        m7787R2(context, attributeSet);
    }
}
