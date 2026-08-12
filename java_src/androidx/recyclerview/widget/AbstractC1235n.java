package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235n extends RecyclerView.AbstractC1207r {

    /* JADX INFO: renamed from: a */
    RecyclerView f6022a;

    /* JADX INFO: renamed from: b */
    private Scroller f6023b;

    /* JADX INFO: renamed from: c */
    private final RecyclerView.AbstractC1209t f6024c = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$a */
    class a extends RecyclerView.AbstractC1209t {

        /* JADX INFO: renamed from: a */
        boolean f6025a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1209t
        /* JADX INFO: renamed from: a */
        public void mo5889a(RecyclerView recyclerView, int i3) {
            super.mo5889a(recyclerView, i3);
            if (i3 == 0 && this.f6025a) {
                this.f6025a = false;
                AbstractC1235n.this.m6258j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1209t
        /* JADX INFO: renamed from: b */
        public void mo5890b(RecyclerView recyclerView, int i3, int i4) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            this.f6025a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m6254e() {
        this.f6022a.m5589Y0(this.f6024c);
        this.f6022a.setOnFlingListener(null);
    }

    /* JADX INFO: renamed from: h */
    private void m6255h() {
        if (this.f6022a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f6022a.m5607k(this.f6024c);
        this.f6022a.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: i */
    private boolean m6256i(RecyclerView.AbstractC1205p abstractC1205p, int i3, int i4) {
        RecyclerView.AbstractC1214y abstractC1214yMo6228d;
        int iMo6230g;
        if (!(abstractC1205p instanceof RecyclerView.AbstractC1214y.b) || (abstractC1214yMo6228d = mo6228d(abstractC1205p)) == null || (iMo6230g = mo6230g(abstractC1205p, i3, i4)) == -1) {
            return false;
        }
        abstractC1214yMo6228d.m5958p(iMo6230g);
        abstractC1205p.m5808N1(abstractC1214yMo6228d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1207r
    /* JADX INFO: renamed from: a */
    public boolean mo5885a(int i3, int i4) {
        RecyclerView.AbstractC1205p layoutManager = this.f6022a.getLayoutManager();
        if (layoutManager == null || this.f6022a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6022a.getMinFlingVelocity();
        return (Math.abs(i4) > minFlingVelocity || Math.abs(i3) > minFlingVelocity) && m6256i(layoutManager, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public void m6257b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6022a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m6254e();
        }
        this.f6022a = recyclerView;
        if (recyclerView != null) {
            m6255h();
            this.f6023b = new Scroller(this.f6022a.getContext(), new DecelerateInterpolator());
            m6258j();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int[] mo6227c(RecyclerView.AbstractC1205p abstractC1205p, View view);

    /* JADX INFO: renamed from: d */
    protected abstract RecyclerView.AbstractC1214y mo6228d(RecyclerView.AbstractC1205p abstractC1205p);

    /* JADX INFO: renamed from: f */
    public abstract View mo6229f(RecyclerView.AbstractC1205p abstractC1205p);

    /* JADX INFO: renamed from: g */
    public abstract int mo6230g(RecyclerView.AbstractC1205p abstractC1205p, int i3, int i4);

    /* JADX INFO: renamed from: j */
    void m6258j() {
        RecyclerView.AbstractC1205p layoutManager;
        View viewMo6229f;
        RecyclerView recyclerView = this.f6022a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo6229f = mo6229f(layoutManager)) == null) {
            return;
        }
        int[] iArrMo6227c = mo6227c(layoutManager, viewMo6229f);
        int i3 = iArrMo6227c[0];
        if (i3 == 0 && iArrMo6227c[1] == 0) {
            return;
        }
        this.f6022a.m5611l1(i3, iArrMo6227c[1]);
    }
}
