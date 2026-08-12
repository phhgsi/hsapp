package p027J;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: J.E */
/* JADX INFO: loaded from: classes.dex */
public class C0233E {

    /* JADX INFO: renamed from: a */
    private int f1254a;

    /* JADX INFO: renamed from: b */
    private int f1255b;

    public C0233E(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m656a() {
        return this.f1254a | this.f1255b;
    }

    /* JADX INFO: renamed from: b */
    public void m657b(View view, View view2, int i3) {
        m658c(view, view2, i3, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m658c(View view, View view2, int i3, int i4) {
        if (i4 == 1) {
            this.f1255b = i3;
        } else {
            this.f1254a = i3;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m659d(View view) {
        m660e(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m660e(View view, int i3) {
        if (i3 == 1) {
            this.f1255b = 0;
        } else {
            this.f1254a = 0;
        }
    }
}
