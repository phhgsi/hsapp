package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234m extends RecyclerView.AbstractC1202m {

    /* JADX INFO: renamed from: g */
    boolean f6021g = true;

    /* JADX INFO: renamed from: A */
    public final void m6238A(RecyclerView.AbstractC1188C abstractC1188C) {
        m6246I(abstractC1188C);
        m5749h(abstractC1188C);
    }

    /* JADX INFO: renamed from: B */
    public final void m6239B(RecyclerView.AbstractC1188C abstractC1188C) {
        m6247J(abstractC1188C);
    }

    /* JADX INFO: renamed from: C */
    public final void m6240C(RecyclerView.AbstractC1188C abstractC1188C, boolean z2) {
        m6248K(abstractC1188C, z2);
        m5749h(abstractC1188C);
    }

    /* JADX INFO: renamed from: D */
    public final void m6241D(RecyclerView.AbstractC1188C abstractC1188C, boolean z2) {
        m6249L(abstractC1188C, z2);
    }

    /* JADX INFO: renamed from: E */
    public final void m6242E(RecyclerView.AbstractC1188C abstractC1188C) {
        m6250M(abstractC1188C);
        m5749h(abstractC1188C);
    }

    /* JADX INFO: renamed from: F */
    public final void m6243F(RecyclerView.AbstractC1188C abstractC1188C) {
        m6251N(abstractC1188C);
    }

    /* JADX INFO: renamed from: G */
    public final void m6244G(RecyclerView.AbstractC1188C abstractC1188C) {
        m6252O(abstractC1188C);
        m5749h(abstractC1188C);
    }

    /* JADX INFO: renamed from: H */
    public final void m6245H(RecyclerView.AbstractC1188C abstractC1188C) {
        m6253P(abstractC1188C);
    }

    /* JADX INFO: renamed from: I */
    public void m6246I(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    /* JADX INFO: renamed from: J */
    public void m6247J(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    /* JADX INFO: renamed from: K */
    public void m6248K(RecyclerView.AbstractC1188C abstractC1188C, boolean z2) {
    }

    /* JADX INFO: renamed from: L */
    public void m6249L(RecyclerView.AbstractC1188C abstractC1188C, boolean z2) {
    }

    /* JADX INFO: renamed from: M */
    public void m6250M(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    /* JADX INFO: renamed from: N */
    public void m6251N(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    /* JADX INFO: renamed from: O */
    public void m6252O(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    /* JADX INFO: renamed from: P */
    public void m6253P(RecyclerView.AbstractC1188C abstractC1188C) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: a */
    public boolean mo5743a(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2) {
        int i3;
        int i4;
        return (bVar == null || ((i3 = bVar.f5738a) == (i4 = bVar2.f5738a) && bVar.f5739b == bVar2.f5739b)) ? mo6142w(abstractC1188C) : mo6144y(abstractC1188C, i3, bVar.f5739b, i4, bVar2.f5739b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: b */
    public boolean mo5744b(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1188C abstractC1188C2, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2) {
        int i3;
        int i4;
        int i5 = bVar.f5738a;
        int i6 = bVar.f5739b;
        if (abstractC1188C2.m5656J()) {
            int i7 = bVar.f5738a;
            i4 = bVar.f5739b;
            i3 = i7;
        } else {
            i3 = bVar2.f5738a;
            i4 = bVar2.f5739b;
        }
        return mo6143x(abstractC1188C, abstractC1188C2, i5, i6, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: c */
    public boolean mo5745c(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2) {
        int i3 = bVar.f5738a;
        int i4 = bVar.f5739b;
        View view = abstractC1188C.f5699a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f5738a;
        int top = bVar2 == null ? view.getTop() : bVar2.f5739b;
        if (abstractC1188C.m5679v() || (i3 == left && i4 == top)) {
            return mo6145z(abstractC1188C);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo6144y(abstractC1188C, i3, i4, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: d */
    public boolean mo5746d(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1202m.b bVar, RecyclerView.AbstractC1202m.b bVar2) {
        int i3 = bVar.f5738a;
        int i4 = bVar2.f5738a;
        if (i3 != i4 || bVar.f5739b != bVar2.f5739b) {
            return mo6144y(abstractC1188C, i3, bVar.f5739b, i4, bVar2.f5739b);
        }
        m6242E(abstractC1188C);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1202m
    /* JADX INFO: renamed from: f */
    public boolean mo5747f(RecyclerView.AbstractC1188C abstractC1188C) {
        return !this.f6021g || abstractC1188C.m5677t();
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo6142w(RecyclerView.AbstractC1188C abstractC1188C);

    /* JADX INFO: renamed from: x */
    public abstract boolean mo6143x(RecyclerView.AbstractC1188C abstractC1188C, RecyclerView.AbstractC1188C abstractC1188C2, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: y */
    public abstract boolean mo6144y(RecyclerView.AbstractC1188C abstractC1188C, int i3, int i4, int i5, int i6);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo6145z(RecyclerView.AbstractC1188C abstractC1188C);
}
