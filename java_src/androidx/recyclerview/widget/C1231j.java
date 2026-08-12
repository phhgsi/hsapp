package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j */
/* JADX INFO: loaded from: classes.dex */
public class C1231j extends AbstractC1235n {

    /* JADX INFO: renamed from: d */
    private AbstractC1230i f6014d;

    /* JADX INFO: renamed from: e */
    private AbstractC1230i f6015e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$a */
    class a extends C1228g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1228g, androidx.recyclerview.widget.RecyclerView.AbstractC1214y
        /* JADX INFO: renamed from: o */
        protected void mo5957o(View view, RecyclerView.C1215z c1215z, RecyclerView.AbstractC1214y.a aVar) {
            C1231j c1231j = C1231j.this;
            int[] iArrMo6227c = c1231j.mo6227c(c1231j.f6022a.getLayoutManager(), view);
            int i3 = iArrMo6227c[0];
            int i4 = iArrMo6227c[1];
            int iM6192w = m6192w(Math.max(Math.abs(i3), Math.abs(i4)));
            if (iM6192w > 0) {
                aVar.m5965d(i3, i4, iM6192w, this.f6003j);
            }
        }

        @Override // androidx.recyclerview.widget.C1228g
        /* JADX INFO: renamed from: v */
        protected float mo6191v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C1228g
        /* JADX INFO: renamed from: x */
        protected int mo6193x(int i3) {
            return Math.min(100, super.mo6193x(i3));
        }
    }

    /* JADX INFO: renamed from: k */
    private int m6220k(View view, AbstractC1230i abstractC1230i) {
        return (abstractC1230i.mo6207g(view) + (abstractC1230i.mo6205e(view) / 2)) - (abstractC1230i.mo6213m() + (abstractC1230i.mo6214n() / 2));
    }

    /* JADX INFO: renamed from: l */
    private View m6221l(RecyclerView.AbstractC1205p abstractC1205p, AbstractC1230i abstractC1230i) {
        int iM5809O = abstractC1205p.m5809O();
        View view = null;
        if (iM5809O == 0) {
            return null;
        }
        int iMo6213m = abstractC1230i.mo6213m() + (abstractC1230i.mo6214n() / 2);
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i4 = 0; i4 < iM5809O; i4++) {
            View viewM5807N = abstractC1205p.m5807N(i4);
            int iAbs = Math.abs((abstractC1230i.mo6207g(viewM5807N) + (abstractC1230i.mo6205e(viewM5807N) / 2)) - iMo6213m);
            if (iAbs < i3) {
                view = viewM5807N;
                i3 = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: m */
    private AbstractC1230i m6222m(RecyclerView.AbstractC1205p abstractC1205p) {
        AbstractC1230i abstractC1230i = this.f6015e;
        if (abstractC1230i == null || abstractC1230i.f6011a != abstractC1205p) {
            this.f6015e = AbstractC1230i.m6201a(abstractC1205p);
        }
        return this.f6015e;
    }

    /* JADX INFO: renamed from: n */
    private AbstractC1230i m6223n(RecyclerView.AbstractC1205p abstractC1205p) {
        if (abstractC1205p.mo5489q()) {
            return m6224o(abstractC1205p);
        }
        if (abstractC1205p.mo5487p()) {
            return m6222m(abstractC1205p);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private AbstractC1230i m6224o(RecyclerView.AbstractC1205p abstractC1205p) {
        AbstractC1230i abstractC1230i = this.f6014d;
        if (abstractC1230i == null || abstractC1230i.f6011a != abstractC1205p) {
            this.f6014d = AbstractC1230i.m6203c(abstractC1205p);
        }
        return this.f6014d;
    }

    /* JADX INFO: renamed from: p */
    private boolean m6225p(RecyclerView.AbstractC1205p abstractC1205p, int i3, int i4) {
        return abstractC1205p.mo5487p() ? i3 > 0 : i4 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private boolean m6226q(RecyclerView.AbstractC1205p abstractC1205p) {
        PointF pointFMo5479d;
        int iM5830e = abstractC1205p.m5830e();
        if (!(abstractC1205p instanceof RecyclerView.AbstractC1214y.b) || (pointFMo5479d = ((RecyclerView.AbstractC1214y.b) abstractC1205p).mo5479d(iM5830e - 1)) == null) {
            return false;
        }
        return pointFMo5479d.x < 0.0f || pointFMo5479d.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1235n
    /* JADX INFO: renamed from: c */
    public int[] mo6227c(RecyclerView.AbstractC1205p abstractC1205p, View view) {
        int[] iArr = new int[2];
        if (abstractC1205p.mo5487p()) {
            iArr[0] = m6220k(view, m6222m(abstractC1205p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1205p.mo5489q()) {
            iArr[1] = m6220k(view, m6224o(abstractC1205p));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1235n
    /* JADX INFO: renamed from: d */
    protected RecyclerView.AbstractC1214y mo6228d(RecyclerView.AbstractC1205p abstractC1205p) {
        if (abstractC1205p instanceof RecyclerView.AbstractC1214y.b) {
            return new a(this.f6022a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1235n
    /* JADX INFO: renamed from: f */
    public View mo6229f(RecyclerView.AbstractC1205p abstractC1205p) {
        if (abstractC1205p.mo5489q()) {
            return m6221l(abstractC1205p, m6224o(abstractC1205p));
        }
        if (abstractC1205p.mo5487p()) {
            return m6221l(abstractC1205p, m6222m(abstractC1205p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1235n
    /* JADX INFO: renamed from: g */
    public int mo6230g(RecyclerView.AbstractC1205p abstractC1205p, int i3, int i4) {
        AbstractC1230i abstractC1230iM6223n;
        int iM5830e = abstractC1205p.m5830e();
        if (iM5830e == 0 || (abstractC1230iM6223n = m6223n(abstractC1205p)) == null) {
            return -1;
        }
        int iM5809O = abstractC1205p.m5809O();
        View view = null;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i7 = 0; i7 < iM5809O; i7++) {
            View viewM5807N = abstractC1205p.m5807N(i7);
            if (viewM5807N != null) {
                int iM6220k = m6220k(viewM5807N, abstractC1230iM6223n);
                if (iM6220k <= 0 && iM6220k > i6) {
                    view2 = viewM5807N;
                    i6 = iM6220k;
                }
                if (iM6220k >= 0 && iM6220k < i5) {
                    view = viewM5807N;
                    i5 = iM6220k;
                }
            }
        }
        boolean zM6225p = m6225p(abstractC1205p, i3, i4);
        if (zM6225p && view != null) {
            return abstractC1205p.m5847l0(view);
        }
        if (!zM6225p && view2 != null) {
            return abstractC1205p.m5847l0(view2);
        }
        if (zM6225p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM5847l0 = abstractC1205p.m5847l0(view) + (m6226q(abstractC1205p) == zM6225p ? -1 : 1);
        if (iM5847l0 < 0 || iM5847l0 >= iM5830e) {
            return -1;
        }
        return iM5847l0;
    }
}
