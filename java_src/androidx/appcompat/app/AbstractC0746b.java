package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p099f.C1885d;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0746b implements DrawerLayout.InterfaceC0998d {

    /* JADX INFO: renamed from: a */
    private final b f2660a;

    /* JADX INFO: renamed from: b */
    private final DrawerLayout f2661b;

    /* JADX INFO: renamed from: c */
    private C1885d f2662c;

    /* JADX INFO: renamed from: d */
    private boolean f2663d;

    /* JADX INFO: renamed from: e */
    private Drawable f2664e;

    /* JADX INFO: renamed from: f */
    boolean f2665f;

    /* JADX INFO: renamed from: g */
    private boolean f2666g;

    /* JADX INFO: renamed from: h */
    private final int f2667h;

    /* JADX INFO: renamed from: i */
    private final int f2668i;

    /* JADX INFO: renamed from: j */
    View.OnClickListener f2669j;

    /* JADX INFO: renamed from: k */
    private boolean f2670k;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC0746b abstractC0746b = AbstractC0746b.this;
            if (abstractC0746b.f2665f) {
                abstractC0746b.m2779m();
                return;
            }
            View.OnClickListener onClickListener = abstractC0746b.f2669j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2780a(Drawable drawable, int i3);

        /* JADX INFO: renamed from: b */
        boolean mo2781b();

        /* JADX INFO: renamed from: c */
        Drawable mo2782c();

        /* JADX INFO: renamed from: d */
        Context mo2783d();
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$c */
    public interface c {
        /* JADX INFO: renamed from: h */
        b mo2784h();
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$d */
    private static class d implements b {

        /* JADX INFO: renamed from: a */
        private final Activity f2672a;

        d(Activity activity) {
            this.f2672a = activity;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: a */
        public void mo2780a(Drawable drawable, int i3) {
            ActionBar actionBar = this.f2672a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i3);
            }
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: b */
        public boolean mo2781b() {
            ActionBar actionBar = this.f2672a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: c */
        public Drawable mo2782c() {
            TypedArray typedArrayObtainStyledAttributes = mo2783d().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: d */
        public Context mo2783d() {
            ActionBar actionBar = this.f2672a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f2672a;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$e */
    static class e implements b {

        /* JADX INFO: renamed from: a */
        final Toolbar f2673a;

        /* JADX INFO: renamed from: b */
        final Drawable f2674b;

        /* JADX INFO: renamed from: c */
        final CharSequence f2675c;

        e(Toolbar toolbar) {
            this.f2673a = toolbar;
            this.f2674b = toolbar.getNavigationIcon();
            this.f2675c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: a */
        public void mo2780a(Drawable drawable, int i3) {
            this.f2673a.setNavigationIcon(drawable);
            m2785e(i3);
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: b */
        public boolean mo2781b() {
            return true;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: c */
        public Drawable mo2782c() {
            return this.f2674b;
        }

        @Override // androidx.appcompat.app.AbstractC0746b.b
        /* JADX INFO: renamed from: d */
        public Context mo2783d() {
            return this.f2673a.getContext();
        }

        /* JADX INFO: renamed from: e */
        public void m2785e(int i3) {
            if (i3 == 0) {
                this.f2673a.setNavigationContentDescription(this.f2675c);
            } else {
                this.f2673a.setNavigationContentDescription(i3);
            }
        }
    }

    public AbstractC0746b(Activity activity, DrawerLayout drawerLayout, int i3, int i4) {
        this(activity, null, drawerLayout, null, i3, i4);
    }

    /* JADX INFO: renamed from: k */
    private void m2769k(float f3) {
        if (f3 == 1.0f) {
            this.f2662c.m9764g(true);
        } else if (f3 == 0.0f) {
            this.f2662c.m9764g(false);
        }
        this.f2662c.m9762e(f3);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
    /* JADX INFO: renamed from: a */
    public void mo2770a(int i3) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
    /* JADX INFO: renamed from: b */
    public void mo2771b(View view, float f3) {
        if (this.f2663d) {
            m2769k(Math.min(1.0f, Math.max(0.0f, f3)));
        } else {
            m2769k(0.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public C1885d m2772e() {
        return this.f2662c;
    }

    /* JADX INFO: renamed from: f */
    Drawable m2773f() {
        return this.f2660a.mo2782c();
    }

    /* JADX INFO: renamed from: g */
    public void m2774g(Configuration configuration) {
        if (!this.f2666g) {
            this.f2664e = m2773f();
        }
        m2778l();
    }

    /* JADX INFO: renamed from: h */
    public boolean m2775h(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f2665f) {
            return false;
        }
        m2779m();
        return true;
    }

    /* JADX INFO: renamed from: i */
    void m2776i(Drawable drawable, int i3) {
        if (!this.f2670k && !this.f2660a.mo2781b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f2670k = true;
        }
        this.f2660a.mo2780a(drawable, i3);
    }

    /* JADX INFO: renamed from: j */
    public void m2777j(boolean z2) {
        if (z2 != this.f2665f) {
            if (z2) {
                m2776i(this.f2662c, this.f2661b.m4439E(8388611) ? this.f2668i : this.f2667h);
            } else {
                m2776i(this.f2664e, 0);
            }
            this.f2665f = z2;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2778l() {
        if (this.f2661b.m4439E(8388611)) {
            m2769k(1.0f);
        } else {
            m2769k(0.0f);
        }
        if (this.f2665f) {
            m2776i(this.f2662c, this.f2661b.m4439E(8388611) ? this.f2668i : this.f2667h);
        }
    }

    /* JADX INFO: renamed from: m */
    void m2779m() {
        int iM4470s = this.f2661b.m4470s(8388611);
        if (this.f2661b.m4442H(8388611) && iM4470s != 2) {
            this.f2661b.m4458f(8388611);
        } else if (iM4470s != 1) {
            this.f2661b.m4445M(8388611);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AbstractC0746b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C1885d c1885d, int i3, int i4) {
        this.f2663d = true;
        this.f2665f = true;
        this.f2670k = false;
        if (toolbar != null) {
            this.f2660a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f2660a = ((c) activity).mo2784h();
        } else {
            this.f2660a = new d(activity);
        }
        this.f2661b = drawerLayout;
        this.f2667h = i3;
        this.f2668i = i4;
        if (c1885d == null) {
            this.f2662c = new C1885d(this.f2660a.mo2783d());
        } else {
            this.f2662c = c1885d;
        }
        this.f2664e = m2773f();
    }
}
