package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C1228g extends RecyclerView.AbstractC1214y {

    /* JADX INFO: renamed from: k */
    protected PointF f6004k;

    /* JADX INFO: renamed from: l */
    private final DisplayMetrics f6005l;

    /* JADX INFO: renamed from: n */
    private float f6007n;

    /* JADX INFO: renamed from: i */
    protected final LinearInterpolator f6002i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    protected final DecelerateInterpolator f6003j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    private boolean f6006m = false;

    /* JADX INFO: renamed from: o */
    protected int f6008o = 0;

    /* JADX INFO: renamed from: p */
    protected int f6009p = 0;

    public C1228g(Context context) {
        this.f6005l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: A */
    private float m6184A() {
        if (!this.f6006m) {
            this.f6007n = mo6191v(this.f6005l);
            this.f6006m = true;
        }
        return this.f6007n;
    }

    /* JADX INFO: renamed from: y */
    private int m6185y(int i3, int i4) {
        int i5 = i3 - i4;
        if (i3 * i5 <= 0) {
            return 0;
        }
        return i5;
    }

    /* JADX INFO: renamed from: B */
    protected int m6186B() {
        PointF pointF = this.f6004k;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.y;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }

    /* JADX INFO: renamed from: C */
    protected void m6187C(RecyclerView.AbstractC1214y.a aVar) {
        PointF pointFMo5943a = mo5943a(m5948f());
        if (pointFMo5943a == null || (pointFMo5943a.x == 0.0f && pointFMo5943a.y == 0.0f)) {
            aVar.m5963b(m5948f());
            m5960r();
            return;
        }
        m5951i(pointFMo5943a);
        this.f6004k = pointFMo5943a;
        this.f6008o = (int) (pointFMo5943a.x * 10000.0f);
        this.f6009p = (int) (pointFMo5943a.y * 10000.0f);
        aVar.m5965d((int) (this.f6008o * 1.2f), (int) (this.f6009p * 1.2f), (int) (mo6193x(10000) * 1.2f), this.f6002i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y
    /* JADX INFO: renamed from: l */
    protected void mo5954l(int i3, int i4, RecyclerView.C1215z c1215z, RecyclerView.AbstractC1214y.a aVar) {
        if (m5945c() == 0) {
            m5960r();
            return;
        }
        this.f6008o = m6185y(this.f6008o, i3);
        int iM6185y = m6185y(this.f6009p, i4);
        this.f6009p = iM6185y;
        if (this.f6008o == 0 && iM6185y == 0) {
            m6187C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y
    /* JADX INFO: renamed from: m */
    protected void mo5955m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y
    /* JADX INFO: renamed from: n */
    protected void mo5956n() {
        this.f6009p = 0;
        this.f6008o = 0;
        this.f6004k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1214y
    /* JADX INFO: renamed from: o */
    protected void mo5957o(View view, RecyclerView.C1215z c1215z, RecyclerView.AbstractC1214y.a aVar) {
        int iMo6189t = mo6189t(view, m6194z());
        int iMo6190u = mo6190u(view, m6186B());
        int iM6192w = m6192w((int) Math.sqrt((iMo6189t * iMo6189t) + (iMo6190u * iMo6190u)));
        if (iM6192w > 0) {
            aVar.m5965d(-iMo6189t, -iMo6190u, iM6192w, this.f6003j);
        }
    }

    /* JADX INFO: renamed from: s */
    public int m6188s(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == -1) {
            return i5 - i3;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return i6 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i8 = i5 - i3;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i6 - i4;
        if (i9 < 0) {
            return i9;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int mo6189t(View view, int i3) {
        RecyclerView.AbstractC1205p abstractC1205pM5947e = m5947e();
        if (abstractC1205pM5947e == null || !abstractC1205pM5947e.mo5487p()) {
            return 0;
        }
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
        return m6188s(abstractC1205pM5947e.m5819V(view) - ((ViewGroup.MarginLayoutParams) c1206q).leftMargin, abstractC1205pM5947e.m5822Y(view) + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin, abstractC1205pM5947e.m5840i0(), abstractC1205pM5947e.m5862s0() - abstractC1205pM5947e.m5843j0(), i3);
    }

    /* JADX INFO: renamed from: u */
    public int mo6190u(View view, int i3) {
        RecyclerView.AbstractC1205p abstractC1205pM5947e = m5947e();
        if (abstractC1205pM5947e == null || !abstractC1205pM5947e.mo5489q()) {
            return 0;
        }
        RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
        return m6188s(abstractC1205pM5947e.m5823Z(view) - ((ViewGroup.MarginLayoutParams) c1206q).topMargin, abstractC1205pM5947e.m5816T(view) + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin, abstractC1205pM5947e.m5845k0(), abstractC1205pM5947e.m5826b0() - abstractC1205pM5947e.m5838h0(), i3);
    }

    /* JADX INFO: renamed from: v */
    protected float mo6191v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: w */
    protected int m6192w(int i3) {
        return (int) Math.ceil(((double) mo6193x(i3)) / 0.3356d);
    }

    /* JADX INFO: renamed from: x */
    protected int mo6193x(int i3) {
        return (int) Math.ceil(Math.abs(i3) * m6184A());
    }

    /* JADX INFO: renamed from: z */
    protected int m6194z() {
        PointF pointF = this.f6004k;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.x;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }
}
