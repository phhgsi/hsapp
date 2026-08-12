package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p019G0.AbstractC0176a;
import p027J.C0292j0;
import p027J.C0318w0;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.a */
/* JADX INFO: loaded from: classes.dex */
class C1461a extends C0292j0.b {

    /* JADX INFO: renamed from: c */
    private final View f7183c;

    /* JADX INFO: renamed from: d */
    private int f7184d;

    /* JADX INFO: renamed from: e */
    private int f7185e;

    /* JADX INFO: renamed from: f */
    private final int[] f7186f;

    public C1461a(View view) {
        super(0);
        this.f7186f = new int[2];
        this.f7183c = view;
    }

    @Override // p027J.C0292j0.b
    /* JADX INFO: renamed from: b */
    public void mo995b(C0292j0 c0292j0) {
        this.f7183c.setTranslationY(0.0f);
    }

    @Override // p027J.C0292j0.b
    /* JADX INFO: renamed from: c */
    public void mo996c(C0292j0 c0292j0) {
        this.f7183c.getLocationOnScreen(this.f7186f);
        this.f7184d = this.f7186f[1];
    }

    @Override // p027J.C0292j0.b
    /* JADX INFO: renamed from: d */
    public C0318w0 mo997d(C0318w0 c0318w0, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C0292j0) it.next()).m988c() & C0318w0.p.m1139a()) != 0) {
                this.f7183c.setTranslationY(AbstractC0176a.m484c(this.f7185e, 0, r0.m987b()));
                break;
            }
        }
        return c0318w0;
    }

    @Override // p027J.C0292j0.b
    /* JADX INFO: renamed from: e */
    public C0292j0.a mo998e(C0292j0 c0292j0, C0292j0.a aVar) {
        this.f7183c.getLocationOnScreen(this.f7186f);
        int i3 = this.f7184d - this.f7186f[1];
        this.f7185e = i3;
        this.f7183c.setTranslationY(i3);
        return aVar;
    }
}
