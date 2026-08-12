package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.LayoutInflaterFactory2C0753i;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.widget.C0896i0;
import androidx.appcompat.widget.InterfaceC0831H;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p024I.AbstractC0211h;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: androidx.appcompat.app.F */
/* JADX INFO: loaded from: classes.dex */
class C0741F extends AbstractC0745a {

    /* JADX INFO: renamed from: a */
    final InterfaceC0831H f2595a;

    /* JADX INFO: renamed from: b */
    final Window.Callback f2596b;

    /* JADX INFO: renamed from: c */
    final LayoutInflaterFactory2C0753i.g f2597c;

    /* JADX INFO: renamed from: d */
    boolean f2598d;

    /* JADX INFO: renamed from: e */
    private boolean f2599e;

    /* JADX INFO: renamed from: f */
    private boolean f2600f;

    /* JADX INFO: renamed from: g */
    private ArrayList f2601g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final Runnable f2602h = new a();

    /* JADX INFO: renamed from: i */
    private final Toolbar.InterfaceC0871h f2603i;

    /* JADX INFO: renamed from: androidx.appcompat.app.F$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0741F.this.m2695C();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.F$b */
    class b implements Toolbar.InterfaceC0871h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0871h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0741F.this.f2596b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.F$c */
    private final class c implements InterfaceC0791j.a {

        /* JADX INFO: renamed from: a */
        private boolean f2606a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: a */
        public void mo2717a(C0786e c0786e, boolean z2) {
            if (this.f2606a) {
                return;
            }
            this.f2606a = true;
            C0741F.this.f2595a.mo3428i();
            C0741F.this.f2596b.onPanelClosed(108, c0786e);
            this.f2606a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: b */
        public boolean mo2718b(C0786e c0786e) {
            C0741F.this.f2596b.onMenuOpened(108, c0786e);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.F$d */
    private final class d implements C0786e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
            if (C0741F.this.f2595a.mo3421b()) {
                C0741F.this.f2596b.onPanelClosed(108, c0786e);
            } else if (C0741F.this.f2596b.onPreparePanel(0, null, c0786e)) {
                C0741F.this.f2596b.onMenuOpened(108, c0786e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.F$e */
    private class e implements LayoutInflaterFactory2C0753i.g {
        e() {
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.g
        /* JADX INFO: renamed from: a */
        public boolean mo2721a(int i3) {
            if (i3 != 0) {
                return false;
            }
            C0741F c0741f = C0741F.this;
            if (c0741f.f2598d) {
                return false;
            }
            c0741f.f2595a.mo3423d();
            C0741F.this.f2598d = true;
            return false;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0753i.g
        public View onCreatePanelView(int i3) {
            if (i3 == 0) {
                return new View(C0741F.this.f2595a.mo3422c());
            }
            return null;
        }
    }

    C0741F(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f2603i = bVar;
        AbstractC0211h.m610g(toolbar);
        C0896i0 c0896i0 = new C0896i0(toolbar, false);
        this.f2595a = c0896i0;
        this.f2596b = (Window.Callback) AbstractC0211h.m610g(callback);
        c0896i0.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c0896i0.setWindowTitle(charSequence);
        this.f2597c = new e();
    }

    /* JADX INFO: renamed from: B */
    private Menu m2694B() {
        if (!this.f2599e) {
            this.f2595a.mo3429j(new c(), new d());
            this.f2599e = true;
        }
        return this.f2595a.mo3437r();
    }

    /* JADX INFO: renamed from: C */
    void m2695C() {
        Menu menuM2694B = m2694B();
        C0786e c0786e = menuM2694B instanceof C0786e ? (C0786e) menuM2694B : null;
        if (c0786e != null) {
            c0786e.m3160i0();
        }
        try {
            menuM2694B.clear();
            if (!this.f2596b.onCreatePanelMenu(0, menuM2694B) || !this.f2596b.onPreparePanel(0, null, menuM2694B)) {
                menuM2694B.clear();
            }
            if (c0786e != null) {
                c0786e.m3159h0();
            }
        } catch (Throwable th) {
            if (c0786e != null) {
                c0786e.m3159h0();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m2696D(int i3, int i4) {
        this.f2595a.mo3435p((i3 & i4) | ((~i4) & this.f2595a.mo3436q()));
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: g */
    public boolean mo2697g() {
        return this.f2595a.mo3425f();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: h */
    public boolean mo2698h() {
        if (!this.f2595a.mo3434o()) {
            return false;
        }
        this.f2595a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: i */
    public void mo2699i(boolean z2) {
        if (z2 == this.f2600f) {
            return;
        }
        this.f2600f = z2;
        if (this.f2601g.size() <= 0) {
            return;
        }
        AbstractC0740E.m2693a(this.f2601g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: j */
    public int mo2700j() {
        return this.f2595a.mo3436q();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: k */
    public Context mo2701k() {
        return this.f2595a.mo3422c();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: l */
    public void mo2702l() {
        this.f2595a.mo3430k(8);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: m */
    public boolean mo2703m() {
        this.f2595a.mo3432m().removeCallbacks(this.f2602h);
        AbstractC0268W.m759a0(this.f2595a.mo3432m(), this.f2602h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: n */
    public void mo2704n(Configuration configuration) {
        super.mo2704n(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: o */
    void mo2705o() {
        this.f2595a.mo3432m().removeCallbacks(this.f2602h);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: p */
    public boolean mo2706p(int i3, KeyEvent keyEvent) {
        Menu menuM2694B = m2694B();
        if (menuM2694B == null) {
            return false;
        }
        menuM2694B.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM2694B.performShortcut(i3, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: q */
    public boolean mo2707q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2708r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: r */
    public boolean mo2708r() {
        return this.f2595a.mo3426g();
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: s */
    public void mo2709s(boolean z2) {
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: t */
    public void mo2710t(boolean z2) {
        m2696D(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: u */
    public void mo2711u(boolean z2) {
        m2696D(z2 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: v */
    public void mo2712v(int i3) {
        this.f2595a.mo3439t(i3);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: w */
    public void mo2713w(Drawable drawable) {
        this.f2595a.mo3444y(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: x */
    public void mo2714x(boolean z2) {
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: y */
    public void mo2715y(CharSequence charSequence) {
        this.f2595a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0745a
    /* JADX INFO: renamed from: z */
    public void mo2716z() {
        this.f2595a.mo3430k(0);
    }
}
