package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0772b;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.view.e */
/* JADX INFO: loaded from: classes.dex */
public class C0775e extends AbstractC0772b implements C0786e.a {

    /* JADX INFO: renamed from: c */
    private Context f2824c;

    /* JADX INFO: renamed from: d */
    private ActionBarContextView f2825d;

    /* JADX INFO: renamed from: e */
    private AbstractC0772b.a f2826e;

    /* JADX INFO: renamed from: f */
    private WeakReference f2827f;

    /* JADX INFO: renamed from: g */
    private boolean f2828g;

    /* JADX INFO: renamed from: h */
    private boolean f2829h;

    /* JADX INFO: renamed from: i */
    private C0786e f2830i;

    public C0775e(Context context, ActionBarContextView actionBarContextView, AbstractC0772b.a aVar, boolean z2) {
        this.f2824c = context;
        this.f2825d = actionBarContextView;
        this.f2826e = aVar;
        C0786e c0786eM3144X = new C0786e(actionBarContextView.getContext()).m3144X(1);
        this.f2830i = c0786eM3144X;
        c0786eM3144X.mo3143W(this);
        this.f2829h = z2;
    }

    @Override // androidx.appcompat.view.menu.C0786e.a
    /* JADX INFO: renamed from: a */
    public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
        return this.f2826e.mo2931c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0786e.a
    /* JADX INFO: renamed from: b */
    public void mo2720b(C0786e c0786e) {
        mo2760k();
        this.f2825d.m3269l();
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: c */
    public void mo2754c() {
        if (this.f2828g) {
            return;
        }
        this.f2828g = true;
        this.f2826e.mo2930b(this);
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: d */
    public View mo2755d() {
        WeakReference weakReference = this.f2827f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: e */
    public Menu mo2756e() {
        return this.f2830i;
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: f */
    public MenuInflater mo2757f() {
        return new C0777g(this.f2825d.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: g */
    public CharSequence mo2758g() {
        return this.f2825d.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: i */
    public CharSequence mo2759i() {
        return this.f2825d.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: k */
    public void mo2760k() {
        this.f2826e.mo2929a(this, this.f2830i);
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: l */
    public boolean mo2761l() {
        return this.f2825d.m3267j();
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: m */
    public void mo2762m(View view) {
        this.f2825d.setCustomView(view);
        this.f2827f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: n */
    public void mo2763n(int i3) {
        mo2764o(this.f2824c.getString(i3));
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: o */
    public void mo2764o(CharSequence charSequence) {
        this.f2825d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: q */
    public void mo2765q(int i3) {
        mo2766r(this.f2824c.getString(i3));
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: r */
    public void mo2766r(CharSequence charSequence) {
        this.f2825d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0772b
    /* JADX INFO: renamed from: s */
    public void mo2767s(boolean z2) {
        super.mo2767s(z2);
        this.f2825d.setTitleOptional(z2);
    }
}
