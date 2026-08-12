package com.google.android.material.appbar;

import android.view.View;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: com.google.android.material.appbar.g */
/* JADX INFO: loaded from: classes.dex */
class C1431g {

    /* JADX INFO: renamed from: a */
    private final View f6964a;

    /* JADX INFO: renamed from: b */
    private int f6965b;

    /* JADX INFO: renamed from: c */
    private int f6966c;

    /* JADX INFO: renamed from: d */
    private int f6967d;

    /* JADX INFO: renamed from: e */
    private int f6968e;

    /* JADX INFO: renamed from: f */
    private boolean f6969f = true;

    /* JADX INFO: renamed from: g */
    private boolean f6970g = true;

    public C1431g(View view) {
        this.f6964a = view;
    }

    /* JADX INFO: renamed from: a */
    void m7372a() {
        View view = this.f6964a;
        AbstractC0268W.m751T(view, this.f6967d - (view.getTop() - this.f6965b));
        View view2 = this.f6964a;
        AbstractC0268W.m750S(view2, this.f6968e - (view2.getLeft() - this.f6966c));
    }

    /* JADX INFO: renamed from: b */
    public int m7373b() {
        return this.f6967d;
    }

    /* JADX INFO: renamed from: c */
    void m7374c() {
        this.f6965b = this.f6964a.getTop();
        this.f6966c = this.f6964a.getLeft();
    }

    /* JADX INFO: renamed from: d */
    public boolean m7375d(int i3) {
        if (!this.f6970g || this.f6968e == i3) {
            return false;
        }
        this.f6968e = i3;
        m7372a();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m7376e(int i3) {
        if (!this.f6969f || this.f6967d == i3) {
            return false;
        }
        this.f6967d = i3;
        m7372a();
        return true;
    }
}
