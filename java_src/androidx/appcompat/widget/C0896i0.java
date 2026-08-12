package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0791j;
import p027J.AbstractC0268W;
import p027J.AbstractC0286g0;
import p027J.C0282e0;
import p091d.AbstractC1760a;
import p091d.AbstractC1764e;
import p091d.AbstractC1765f;
import p091d.AbstractC1767h;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;
import p111i.C2020a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i0 */
/* JADX INFO: loaded from: classes.dex */
public class C0896i0 implements InterfaceC0831H {

    /* JADX INFO: renamed from: a */
    Toolbar f3680a;

    /* JADX INFO: renamed from: b */
    private int f3681b;

    /* JADX INFO: renamed from: c */
    private View f3682c;

    /* JADX INFO: renamed from: d */
    private View f3683d;

    /* JADX INFO: renamed from: e */
    private Drawable f3684e;

    /* JADX INFO: renamed from: f */
    private Drawable f3685f;

    /* JADX INFO: renamed from: g */
    private Drawable f3686g;

    /* JADX INFO: renamed from: h */
    private boolean f3687h;

    /* JADX INFO: renamed from: i */
    CharSequence f3688i;

    /* JADX INFO: renamed from: j */
    private CharSequence f3689j;

    /* JADX INFO: renamed from: k */
    private CharSequence f3690k;

    /* JADX INFO: renamed from: l */
    Window.Callback f3691l;

    /* JADX INFO: renamed from: m */
    boolean f3692m;

    /* JADX INFO: renamed from: n */
    private ActionMenuPresenter f3693n;

    /* JADX INFO: renamed from: o */
    private int f3694o;

    /* JADX INFO: renamed from: p */
    private int f3695p;

    /* JADX INFO: renamed from: q */
    private Drawable f3696q;

    /* JADX INFO: renamed from: androidx.appcompat.widget.i0$a */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final C2020a f3697a;

        a() {
            this.f3697a = new C2020a(C0896i0.this.f3680a.getContext(), 0, R.id.home, 0, 0, C0896i0.this.f3688i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0896i0 c0896i0 = C0896i0.this;
            Window.Callback callback = c0896i0.f3691l;
            if (callback == null || !c0896i0.f3692m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f3697a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.i0$b */
    class b extends AbstractC0286g0 {

        /* JADX INFO: renamed from: a */
        private boolean f3699a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3700b;

        b(int i3) {
            this.f3700b = i3;
        }

        @Override // p027J.AbstractC0286g0, p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: a */
        public void mo971a(View view) {
            this.f3699a = true;
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            if (this.f3699a) {
                return;
            }
            C0896i0.this.f3680a.setVisibility(this.f3700b);
        }

        @Override // p027J.AbstractC0286g0, p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: c */
        public void mo973c(View view) {
            C0896i0.this.f3680a.setVisibility(0);
        }
    }

    public C0896i0(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, AbstractC1767h.f8855a, AbstractC1764e.f8780n);
    }

    /* JADX INFO: renamed from: A */
    private int m3801A() {
        if (this.f3680a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3696q = this.f3680a.getNavigationIcon();
        return 15;
    }

    /* JADX INFO: renamed from: H */
    private void m3802H(CharSequence charSequence) {
        this.f3688i = charSequence;
        if ((this.f3681b & 8) != 0) {
            this.f3680a.setTitle(charSequence);
            if (this.f3687h) {
                AbstractC0268W.m779k0(this.f3680a.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private void m3803I() {
        if ((this.f3681b & 4) != 0) {
            if (TextUtils.isEmpty(this.f3690k)) {
                this.f3680a.setNavigationContentDescription(this.f3695p);
            } else {
                this.f3680a.setNavigationContentDescription(this.f3690k);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    private void m3804J() {
        if ((this.f3681b & 4) == 0) {
            this.f3680a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f3680a;
        Drawable drawable = this.f3686g;
        if (drawable == null) {
            drawable = this.f3696q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: K */
    private void m3805K() {
        Drawable drawable;
        int i3 = this.f3681b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.f3685f) == null) {
            drawable = this.f3684e;
        }
        this.f3680a.setLogo(drawable);
    }

    /* JADX INFO: renamed from: B */
    public void m3806B(View view) {
        View view2 = this.f3683d;
        if (view2 != null && (this.f3681b & 16) != 0) {
            this.f3680a.removeView(view2);
        }
        this.f3683d = view;
        if (view == null || (this.f3681b & 16) == 0) {
            return;
        }
        this.f3680a.addView(view);
    }

    /* JADX INFO: renamed from: C */
    public void m3807C(int i3) {
        if (i3 == this.f3695p) {
            return;
        }
        this.f3695p = i3;
        if (TextUtils.isEmpty(this.f3680a.getNavigationContentDescription())) {
            mo3439t(this.f3695p);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3808D(Drawable drawable) {
        this.f3685f = drawable;
        m3805K();
    }

    /* JADX INFO: renamed from: E */
    public void m3809E(CharSequence charSequence) {
        this.f3690k = charSequence;
        m3803I();
    }

    /* JADX INFO: renamed from: F */
    public void m3810F(CharSequence charSequence) {
        this.f3689j = charSequence;
        if ((this.f3681b & 8) != 0) {
            this.f3680a.setSubtitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m3811G(CharSequence charSequence) {
        this.f3687h = true;
        m3802H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: a */
    public void mo3420a(Menu menu, InterfaceC0791j.a aVar) {
        if (this.f3693n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f3680a.getContext());
            this.f3693n = actionMenuPresenter;
            actionMenuPresenter.m3076s(AbstractC1765f.f8815g);
        }
        this.f3693n.mo3071n(aVar);
        this.f3680a.m3643M((C0786e) menu, this.f3693n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: b */
    public boolean mo3421b() {
        return this.f3680a.m3640D();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: c */
    public Context mo3422c() {
        return this.f3680a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public void collapseActionView() {
        this.f3680a.m3651e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: d */
    public void mo3423d() {
        this.f3692m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: e */
    public boolean mo3424e() {
        return this.f3680a.m3639C();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: f */
    public boolean mo3425f() {
        return this.f3680a.m3658y();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: g */
    public boolean mo3426g() {
        return this.f3680a.m3647S();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public CharSequence getTitle() {
        return this.f3680a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: h */
    public boolean mo3427h() {
        return this.f3680a.m3650d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: i */
    public void mo3428i() {
        this.f3680a.m3652f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: j */
    public void mo3429j(InterfaceC0791j.a aVar, C0786e.a aVar2) {
        this.f3680a.m3644N(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: k */
    public void mo3430k(int i3) {
        this.f3680a.setVisibility(i3);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: l */
    public void mo3431l(AbstractC0877Y abstractC0877Y) {
        View view = this.f3682c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f3680a;
            if (parent == toolbar) {
                toolbar.removeView(this.f3682c);
            }
        }
        this.f3682c = abstractC0877Y;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: m */
    public ViewGroup mo3432m() {
        return this.f3680a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: n */
    public void mo3433n(boolean z2) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: o */
    public boolean mo3434o() {
        return this.f3680a.m3657x();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: p */
    public void mo3435p(int i3) {
        View view;
        int i4 = this.f3681b ^ i3;
        this.f3681b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    m3803I();
                }
                m3804J();
            }
            if ((i4 & 3) != 0) {
                m3805K();
            }
            if ((i4 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    this.f3680a.setTitle(this.f3688i);
                    this.f3680a.setSubtitle(this.f3689j);
                } else {
                    this.f3680a.setTitle((CharSequence) null);
                    this.f3680a.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f3683d) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                this.f3680a.addView(view);
            } else {
                this.f3680a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: q */
    public int mo3436q() {
        return this.f3681b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: r */
    public Menu mo3437r() {
        return this.f3680a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: s */
    public void mo3438s(int i3) {
        m3808D(i3 != 0 ? AbstractC1832a.m9609b(mo3422c(), i3) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public void setIcon(int i3) {
        setIcon(i3 != 0 ? AbstractC1832a.m9609b(mo3422c(), i3) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public void setWindowCallback(Window.Callback callback) {
        this.f3691l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f3687h) {
            return;
        }
        m3802H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: t */
    public void mo3439t(int i3) {
        m3809E(i3 == 0 ? null : mo3422c().getString(i3));
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: u */
    public int mo3440u() {
        return this.f3694o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: v */
    public C0282e0 mo3441v(int i3, long j3) {
        return AbstractC0268W.m766e(this.f3680a).m960b(i3 == 0 ? 1.0f : 0.0f).m963e(j3).m965g(new b(i3));
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: w */
    public void mo3442w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: x */
    public void mo3443x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: y */
    public void mo3444y(Drawable drawable) {
        this.f3686g = drawable;
        m3804J();
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    /* JADX INFO: renamed from: z */
    public void mo3445z(boolean z2) {
        this.f3680a.setCollapsible(z2);
    }

    public C0896i0(Toolbar toolbar, boolean z2, int i3, int i4) {
        Drawable drawable;
        this.f3694o = 0;
        this.f3695p = 0;
        this.f3680a = toolbar;
        this.f3688i = toolbar.getTitle();
        this.f3689j = toolbar.getSubtitle();
        this.f3687h = this.f3688i != null;
        this.f3686g = toolbar.getNavigationIcon();
        C0888e0 c0888e0M3765v = C0888e0.m3765v(toolbar.getContext(), null, AbstractC1769j.f9006a, AbstractC1760a.f8702c, 0);
        this.f3696q = c0888e0M3765v.m3772g(AbstractC1769j.f9067l);
        if (z2) {
            CharSequence charSequenceM3781p = c0888e0M3765v.m3781p(AbstractC1769j.f9097r);
            if (!TextUtils.isEmpty(charSequenceM3781p)) {
                m3811G(charSequenceM3781p);
            }
            CharSequence charSequenceM3781p2 = c0888e0M3765v.m3781p(AbstractC1769j.f9087p);
            if (!TextUtils.isEmpty(charSequenceM3781p2)) {
                m3810F(charSequenceM3781p2);
            }
            Drawable drawableM3772g = c0888e0M3765v.m3772g(AbstractC1769j.f9077n);
            if (drawableM3772g != null) {
                m3808D(drawableM3772g);
            }
            Drawable drawableM3772g2 = c0888e0M3765v.m3772g(AbstractC1769j.f9072m);
            if (drawableM3772g2 != null) {
                setIcon(drawableM3772g2);
            }
            if (this.f3686g == null && (drawable = this.f3696q) != null) {
                mo3444y(drawable);
            }
            mo3435p(c0888e0M3765v.m3776k(AbstractC1769j.f9047h, 0));
            int iM3779n = c0888e0M3765v.m3779n(AbstractC1769j.f9042g, 0);
            if (iM3779n != 0) {
                m3806B(LayoutInflater.from(this.f3680a.getContext()).inflate(iM3779n, (ViewGroup) this.f3680a, false));
                mo3435p(this.f3681b | 16);
            }
            int iM3778m = c0888e0M3765v.m3778m(AbstractC1769j.f9057j, 0);
            if (iM3778m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3680a.getLayoutParams();
                layoutParams.height = iM3778m;
                this.f3680a.setLayoutParams(layoutParams);
            }
            int iM3770e = c0888e0M3765v.m3770e(AbstractC1769j.f9036f, -1);
            int iM3770e2 = c0888e0M3765v.m3770e(AbstractC1769j.f9030e, -1);
            if (iM3770e >= 0 || iM3770e2 >= 0) {
                this.f3680a.m3642L(Math.max(iM3770e, 0), Math.max(iM3770e2, 0));
            }
            int iM3779n2 = c0888e0M3765v.m3779n(AbstractC1769j.f9102s, 0);
            if (iM3779n2 != 0) {
                Toolbar toolbar2 = this.f3680a;
                toolbar2.m3646P(toolbar2.getContext(), iM3779n2);
            }
            int iM3779n3 = c0888e0M3765v.m3779n(AbstractC1769j.f9092q, 0);
            if (iM3779n3 != 0) {
                Toolbar toolbar3 = this.f3680a;
                toolbar3.m3645O(toolbar3.getContext(), iM3779n3);
            }
            int iM3779n4 = c0888e0M3765v.m3779n(AbstractC1769j.f9082o, 0);
            if (iM3779n4 != 0) {
                this.f3680a.setPopupTheme(iM3779n4);
            }
        } else {
            this.f3681b = m3801A();
        }
        c0888e0M3765v.m3786x();
        m3807C(i3);
        this.f3690k = this.f3680a.getNavigationContentDescription();
        this.f3680a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0831H
    public void setIcon(Drawable drawable) {
        this.f3684e = drawable;
        m3805K();
    }
}
