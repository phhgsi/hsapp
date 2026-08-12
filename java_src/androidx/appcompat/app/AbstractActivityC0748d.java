package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AbstractC0746b;
import androidx.appcompat.view.AbstractC0772b;
import androidx.appcompat.widget.C0908o0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1080h;
import androidx.savedstate.C1240a;
import p012E.C0112i;
import p078a.InterfaceC0655b;
import p161x.AbstractC2503b;
import p161x.AbstractC2511j;
import p161x.C2522u;

/* JADX INFO: renamed from: androidx.appcompat.app.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0748d extends AbstractActivityC1080h implements InterfaceC0749e, C2522u.a, AbstractC0746b.c {

    /* JADX INFO: renamed from: B */
    private AbstractC0751g f2679B;

    /* JADX INFO: renamed from: C */
    private Resources f2680C;

    /* JADX INFO: renamed from: androidx.appcompat.app.d$a */
    class a implements C1240a.c {
        a() {
        }

        @Override // androidx.savedstate.C1240a.c
        /* JADX INFO: renamed from: a */
        public Bundle mo2629a() {
            Bundle bundle = new Bundle();
            AbstractActivityC0748d.this.m2798j0().mo2831D(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.d$b */
    class b implements InterfaceC0655b {
        b() {
        }

        @Override // p078a.InterfaceC0655b
        /* JADX INFO: renamed from: a */
        public void mo2494a(Context context) {
            AbstractC0751g abstractC0751gM2798j0 = AbstractActivityC0748d.this.m2798j0();
            abstractC0751gM2798j0.mo2852v();
            abstractC0751gM2798j0.mo2855z(AbstractActivityC0748d.this.getSavedStateRegistry().m6290b("androidx:appcompat"));
        }
    }

    public AbstractActivityC0748d() {
        m2795l0();
    }

    /* JADX INFO: renamed from: l0 */
    private void m2795l0() {
        getSavedStateRegistry().m6295h("androidx:appcompat", new a());
        m2519N(new b());
    }

    /* JADX INFO: renamed from: s0 */
    private boolean m2796s0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2522S();
        m2798j0().mo2842e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m2798j0().mo2845i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0745a abstractC0745aM2799k0 = m2799k0();
        if (getWindow().hasFeature(0)) {
            if (abstractC0745aM2799k0 == null || !abstractC0745aM2799k0.mo2697g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p161x.AbstractActivityC2508g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0745a abstractC0745aM2799k0 = m2799k0();
        if (keyCode == 82 && abstractC0745aM2799k0 != null && abstractC0745aM2799k0.mo2707q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i3) {
        return m2798j0().mo2846l(i3);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: g */
    public void mo2797g(AbstractC0772b abstractC0772b) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m2798j0().mo2850s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f2680C == null && C0908o0.m3864d()) {
            this.f2680C = new C0908o0(this, super.getResources());
        }
        Resources resources = this.f2680C;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.AbstractC0746b.c
    /* JADX INFO: renamed from: h */
    public AbstractC0746b.b mo2784h() {
        return m2798j0().mo2848p();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m2798j0().mo2853w();
    }

    /* JADX INFO: renamed from: j0 */
    public AbstractC0751g m2798j0() {
        if (this.f2679B == null) {
            this.f2679B = AbstractC0751g.m2821j(this, this);
        }
        return this.f2679B;
    }

    /* JADX INFO: renamed from: k0 */
    public AbstractC0745a m2799k0() {
        return m2798j0().mo2851u();
    }

    /* JADX INFO: renamed from: m0 */
    public void m2800m0(C2522u c2522u) {
        c2522u.m12049c(this);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: o */
    public void mo2802o(AbstractC0772b abstractC0772b) {
    }

    /* JADX INFO: renamed from: o0 */
    protected void m2803o0(int i3) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2798j0().mo2854y(configuration);
        if (this.f2680C != null) {
            this.f2680C.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m2805q0();
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m2798j0().mo2828A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (m2796s0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        AbstractC0745a abstractC0745aM2799k0 = m2799k0();
        if (menuItem.getItemId() != 16908332 || abstractC0745aM2799k0 == null || (abstractC0745aM2799k0.mo2700j() & 4) == 0) {
            return false;
        }
        return m2806r0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i3, Menu menu) {
        return super.onMenuOpened(i3, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m2798j0().mo2829B(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m2798j0().mo2830C();
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onStart() {
        super.onStart();
        m2798j0().mo2832E();
    }

    @Override // androidx.fragment.app.AbstractActivityC1080h, android.app.Activity
    protected void onStop() {
        super.onStop();
        m2798j0().mo2833F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        m2798j0().mo2841R(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0745a abstractC0745aM2799k0 = m2799k0();
        if (getWindow().hasFeature(0)) {
            if (abstractC0745aM2799k0 == null || !abstractC0745aM2799k0.mo2708r()) {
                super.openOptionsMenu();
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m2805q0() {
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m2806r0() {
        Intent intentMo2807t = mo2807t();
        if (intentMo2807t == null) {
            return false;
        }
        if (!m2811v0(intentMo2807t)) {
            m2810u0(intentMo2807t);
            return true;
        }
        C2522u c2522uM12047e = C2522u.m12047e(this);
        m2800m0(c2522uM12047e);
        m2804p0(c2522uM12047e);
        c2522uM12047e.m12051f();
        try {
            AbstractC2503b.m11890b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i3) {
        m2522S();
        m2798j0().mo2835K(i3);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i3) {
        super.setTheme(i3);
        m2798j0().mo2840Q(i3);
    }

    @Override // p161x.C2522u.a
    /* JADX INFO: renamed from: t */
    public Intent mo2807t() {
        return AbstractC2511j.m11926a(this);
    }

    /* JADX INFO: renamed from: t0 */
    public void m2808t0(Toolbar toolbar) {
        m2798j0().mo2839P(toolbar);
    }

    @Override // androidx.appcompat.app.InterfaceC0749e
    /* JADX INFO: renamed from: u */
    public AbstractC0772b mo2809u(AbstractC0772b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m2810u0(Intent intent) {
        AbstractC2511j.m11930e(this, intent);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m2811v0(Intent intent) {
        return AbstractC2511j.m11931f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m2522S();
        m2798j0().mo2836L(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2522S();
        m2798j0().mo2837M(view, layoutParams);
    }

    /* JADX INFO: renamed from: n0 */
    protected void m2801n0(C0112i c0112i) {
    }

    /* JADX INFO: renamed from: p0 */
    public void m2804p0(C2522u c2522u) {
    }
}
