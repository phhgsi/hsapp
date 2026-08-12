package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
public class C1083k {

    /* JADX INFO: renamed from: a */
    private final AbstractC1085m f5184a;

    private C1083k(AbstractC1085m abstractC1085m) {
        this.f5184a = abstractC1085m;
    }

    /* JADX INFO: renamed from: b */
    public static C1083k m4945b(AbstractC1085m abstractC1085m) {
        return new C1083k((AbstractC1085m) AbstractC0211h.m611h(abstractC1085m, "callbacks == null"));
    }

    /* JADX INFO: renamed from: a */
    public void m4946a(Fragment fragment) {
        AbstractC1085m abstractC1085m = this.f5184a;
        abstractC1085m.f5190e.m4845n(abstractC1085m, abstractC1085m, fragment);
    }

    /* JADX INFO: renamed from: c */
    public void m4947c() {
        this.f5184a.f5190e.m4860y();
    }

    /* JADX INFO: renamed from: d */
    public boolean m4948d(MenuItem menuItem) {
        return this.f5184a.f5190e.m4784B(menuItem);
    }

    /* JADX INFO: renamed from: e */
    public void m4949e() {
        this.f5184a.f5190e.m4785C();
    }

    /* JADX INFO: renamed from: f */
    public void m4950f() {
        this.f5184a.f5190e.m4789E();
    }

    /* JADX INFO: renamed from: g */
    public void m4951g() {
        this.f5184a.f5190e.m4803N();
    }

    /* JADX INFO: renamed from: h */
    public void m4952h() {
        this.f5184a.f5190e.m4811R();
    }

    /* JADX INFO: renamed from: i */
    public void m4953i() {
        this.f5184a.f5190e.m4813S();
    }

    /* JADX INFO: renamed from: j */
    public void m4954j() {
        this.f5184a.f5190e.m4816U();
    }

    /* JADX INFO: renamed from: k */
    public boolean m4955k() {
        return this.f5184a.f5190e.m4826b0(true);
    }

    /* JADX INFO: renamed from: l */
    public FragmentManager m4956l() {
        return this.f5184a.f5190e;
    }

    /* JADX INFO: renamed from: m */
    public void m4957m() {
        this.f5184a.f5190e.m4815T0();
    }

    /* JADX INFO: renamed from: n */
    public View m4958n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f5184a.f5190e.m4855v0().onCreateView(view, str, context, attributeSet);
    }
}
