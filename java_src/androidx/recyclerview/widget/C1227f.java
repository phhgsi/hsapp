package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
class C1227f {

    /* JADX INFO: renamed from: b */
    int f5994b;

    /* JADX INFO: renamed from: c */
    int f5995c;

    /* JADX INFO: renamed from: d */
    int f5996d;

    /* JADX INFO: renamed from: e */
    int f5997e;

    /* JADX INFO: renamed from: h */
    boolean f6000h;

    /* JADX INFO: renamed from: i */
    boolean f6001i;

    /* JADX INFO: renamed from: a */
    boolean f5993a = true;

    /* JADX INFO: renamed from: f */
    int f5998f = 0;

    /* JADX INFO: renamed from: g */
    int f5999g = 0;

    C1227f() {
    }

    /* JADX INFO: renamed from: a */
    boolean m6182a(RecyclerView.C1215z c1215z) {
        int i3 = this.f5995c;
        return i3 >= 0 && i3 < c1215z.m5967b();
    }

    /* JADX INFO: renamed from: b */
    View m6183b(RecyclerView.C1211v c1211v) {
        View viewM5932o = c1211v.m5932o(this.f5995c);
        this.f5995c += this.f5996d;
        return viewM5932o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5994b + ", mCurrentPosition=" + this.f5995c + ", mItemDirection=" + this.f5996d + ", mLayoutDirection=" + this.f5997e + ", mStartLine=" + this.f5998f + ", mEndLine=" + this.f5999g + '}';
    }
}
