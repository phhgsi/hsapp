package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1233l {
    /* JADX INFO: renamed from: a */
    static int m6235a(RecyclerView.C1215z c1215z, AbstractC1230i abstractC1230i, View view, View view2, RecyclerView.AbstractC1205p abstractC1205p, boolean z2) {
        if (abstractC1205p.m5809O() == 0 || c1215z.m5967b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(abstractC1205p.m5847l0(view) - abstractC1205p.m5847l0(view2)) + 1;
        }
        return Math.min(abstractC1230i.mo6214n(), abstractC1230i.mo6204d(view2) - abstractC1230i.mo6207g(view));
    }

    /* JADX INFO: renamed from: b */
    static int m6236b(RecyclerView.C1215z c1215z, AbstractC1230i abstractC1230i, View view, View view2, RecyclerView.AbstractC1205p abstractC1205p, boolean z2, boolean z3) {
        if (abstractC1205p.m5809O() == 0 || c1215z.m5967b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (c1215z.m5967b() - Math.max(abstractC1205p.m5847l0(view), abstractC1205p.m5847l0(view2))) - 1) : Math.max(0, Math.min(abstractC1205p.m5847l0(view), abstractC1205p.m5847l0(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(abstractC1230i.mo6204d(view2) - abstractC1230i.mo6207g(view)) / (Math.abs(abstractC1205p.m5847l0(view) - abstractC1205p.m5847l0(view2)) + 1))) + (abstractC1230i.mo6213m() - abstractC1230i.mo6207g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    static int m6237c(RecyclerView.C1215z c1215z, AbstractC1230i abstractC1230i, View view, View view2, RecyclerView.AbstractC1205p abstractC1205p, boolean z2) {
        if (abstractC1205p.m5809O() == 0 || c1215z.m5967b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c1215z.m5967b();
        }
        return (int) (((abstractC1230i.mo6204d(view2) - abstractC1230i.mo6207g(view)) / (Math.abs(abstractC1205p.m5847l0(view) - abstractC1205p.m5847l0(view2)) + 1)) * c1215z.m5967b());
    }
}
