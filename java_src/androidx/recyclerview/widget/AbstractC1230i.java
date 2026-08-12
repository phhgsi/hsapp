package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1230i {

    /* JADX INFO: renamed from: a */
    protected final RecyclerView.AbstractC1205p f6011a;

    /* JADX INFO: renamed from: b */
    private int f6012b;

    /* JADX INFO: renamed from: c */
    final Rect f6013c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$a */
    class a extends AbstractC1230i {
        a(RecyclerView.AbstractC1205p abstractC1205p) {
            super(abstractC1205p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: d */
        public int mo6204d(View view) {
            return this.f6011a.m5822Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1206q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: e */
        public int mo6205e(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f6011a.m5821X(view) + ((ViewGroup.MarginLayoutParams) c1206q).leftMargin + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: f */
        public int mo6206f(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f6011a.m5820W(view) + ((ViewGroup.MarginLayoutParams) c1206q).topMargin + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: g */
        public int mo6207g(View view) {
            return this.f6011a.m5819V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1206q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: h */
        public int mo6208h() {
            return this.f6011a.m5862s0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: i */
        public int mo6209i() {
            return this.f6011a.m5862s0() - this.f6011a.m5843j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: j */
        public int mo6210j() {
            return this.f6011a.m5843j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: k */
        public int mo6211k() {
            return this.f6011a.m5864t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: l */
        public int mo6212l() {
            return this.f6011a.m5827c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: m */
        public int mo6213m() {
            return this.f6011a.m5840i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: n */
        public int mo6214n() {
            return (this.f6011a.m5862s0() - this.f6011a.m5840i0()) - this.f6011a.m5843j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: p */
        public int mo6216p(View view) {
            this.f6011a.m5860r0(view, true, this.f6013c);
            return this.f6013c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: q */
        public int mo6217q(View view) {
            this.f6011a.m5860r0(view, true, this.f6013c);
            return this.f6013c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: r */
        public void mo6218r(int i3) {
            this.f6011a.mo5795G0(i3);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$b */
    class b extends AbstractC1230i {
        b(RecyclerView.AbstractC1205p abstractC1205p) {
            super(abstractC1205p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: d */
        public int mo6204d(View view) {
            return this.f6011a.m5816T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1206q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: e */
        public int mo6205e(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f6011a.m5820W(view) + ((ViewGroup.MarginLayoutParams) c1206q).topMargin + ((ViewGroup.MarginLayoutParams) c1206q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: f */
        public int mo6206f(View view) {
            RecyclerView.C1206q c1206q = (RecyclerView.C1206q) view.getLayoutParams();
            return this.f6011a.m5821X(view) + ((ViewGroup.MarginLayoutParams) c1206q).leftMargin + ((ViewGroup.MarginLayoutParams) c1206q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: g */
        public int mo6207g(View view) {
            return this.f6011a.m5823Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1206q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: h */
        public int mo6208h() {
            return this.f6011a.m5826b0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: i */
        public int mo6209i() {
            return this.f6011a.m5826b0() - this.f6011a.m5838h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: j */
        public int mo6210j() {
            return this.f6011a.m5838h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: k */
        public int mo6211k() {
            return this.f6011a.m5827c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: l */
        public int mo6212l() {
            return this.f6011a.m5864t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: m */
        public int mo6213m() {
            return this.f6011a.m5845k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: n */
        public int mo6214n() {
            return (this.f6011a.m5826b0() - this.f6011a.m5845k0()) - this.f6011a.m5838h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: p */
        public int mo6216p(View view) {
            this.f6011a.m5860r0(view, true, this.f6013c);
            return this.f6013c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: q */
        public int mo6217q(View view) {
            this.f6011a.m5860r0(view, true, this.f6013c);
            return this.f6013c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1230i
        /* JADX INFO: renamed from: r */
        public void mo6218r(int i3) {
            this.f6011a.mo5796H0(i3);
        }
    }

    /* synthetic */ AbstractC1230i(RecyclerView.AbstractC1205p abstractC1205p, a aVar) {
        this(abstractC1205p);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1230i m6201a(RecyclerView.AbstractC1205p abstractC1205p) {
        return new a(abstractC1205p);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1230i m6202b(RecyclerView.AbstractC1205p abstractC1205p, int i3) {
        if (i3 == 0) {
            return m6201a(abstractC1205p);
        }
        if (i3 == 1) {
            return m6203c(abstractC1205p);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1230i m6203c(RecyclerView.AbstractC1205p abstractC1205p) {
        return new b(abstractC1205p);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo6204d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo6205e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo6206f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo6207g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo6208h();

    /* JADX INFO: renamed from: i */
    public abstract int mo6209i();

    /* JADX INFO: renamed from: j */
    public abstract int mo6210j();

    /* JADX INFO: renamed from: k */
    public abstract int mo6211k();

    /* JADX INFO: renamed from: l */
    public abstract int mo6212l();

    /* JADX INFO: renamed from: m */
    public abstract int mo6213m();

    /* JADX INFO: renamed from: n */
    public abstract int mo6214n();

    /* JADX INFO: renamed from: o */
    public int m6215o() {
        if (Integer.MIN_VALUE == this.f6012b) {
            return 0;
        }
        return mo6214n() - this.f6012b;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo6216p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo6217q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo6218r(int i3);

    /* JADX INFO: renamed from: s */
    public void m6219s() {
        this.f6012b = mo6214n();
    }

    private AbstractC1230i(RecyclerView.AbstractC1205p abstractC1205p) {
        this.f6012b = Integer.MIN_VALUE;
        this.f6013c = new Rect();
        this.f6011a = abstractC1205p;
    }
}
