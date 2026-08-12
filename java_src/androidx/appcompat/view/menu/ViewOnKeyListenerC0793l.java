package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.widget.C0872U;
import p091d.AbstractC1763d;
import p091d.AbstractC1766g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.l */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0793l extends AbstractC0789h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0791j, View.OnKeyListener {

    /* JADX INFO: renamed from: v */
    private static final int f3062v = AbstractC1766g.f8847m;

    /* JADX INFO: renamed from: b */
    private final Context f3063b;

    /* JADX INFO: renamed from: c */
    private final C0786e f3064c;

    /* JADX INFO: renamed from: d */
    private final C0785d f3065d;

    /* JADX INFO: renamed from: e */
    private final boolean f3066e;

    /* JADX INFO: renamed from: f */
    private final int f3067f;

    /* JADX INFO: renamed from: g */
    private final int f3068g;

    /* JADX INFO: renamed from: h */
    private final int f3069h;

    /* JADX INFO: renamed from: i */
    final C0872U f3070i;

    /* JADX INFO: renamed from: l */
    private PopupWindow.OnDismissListener f3073l;

    /* JADX INFO: renamed from: m */
    private View f3074m;

    /* JADX INFO: renamed from: n */
    View f3075n;

    /* JADX INFO: renamed from: o */
    private InterfaceC0791j.a f3076o;

    /* JADX INFO: renamed from: p */
    ViewTreeObserver f3077p;

    /* JADX INFO: renamed from: q */
    private boolean f3078q;

    /* JADX INFO: renamed from: r */
    private boolean f3079r;

    /* JADX INFO: renamed from: s */
    private int f3080s;

    /* JADX INFO: renamed from: u */
    private boolean f3082u;

    /* JADX INFO: renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f3071j = new a();

    /* JADX INFO: renamed from: k */
    private final View.OnAttachStateChangeListener f3072k = new b();

    /* JADX INFO: renamed from: t */
    private int f3081t = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0793l.this.mo3085c() || ViewOnKeyListenerC0793l.this.f3070i.m3512B()) {
                return;
            }
            View view = ViewOnKeyListenerC0793l.this.f3075n;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0793l.this.dismiss();
            } else {
                ViewOnKeyListenerC0793l.this.f3070i.mo3086e();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.l$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0793l.this.f3077p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0793l.this.f3077p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0793l viewOnKeyListenerC0793l = ViewOnKeyListenerC0793l.this;
                viewOnKeyListenerC0793l.f3077p.removeGlobalOnLayoutListener(viewOnKeyListenerC0793l.f3071j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0793l(Context context, C0786e c0786e, View view, int i3, int i4, boolean z2) {
        this.f3063b = context;
        this.f3064c = c0786e;
        this.f3066e = z2;
        this.f3065d = new C0785d(c0786e, LayoutInflater.from(context), z2, f3062v);
        this.f3068g = i3;
        this.f3069h = i4;
        Resources resources = context.getResources();
        this.f3067f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1763d.f8736b));
        this.f3074m = view;
        this.f3070i = new C0872U(context, null, i3, i4);
        c0786e.m3150c(this, context);
    }

    /* JADX INFO: renamed from: C */
    private boolean m3221C() {
        View view;
        if (mo3085c()) {
            return true;
        }
        if (this.f3078q || (view = this.f3074m) == null) {
            return false;
        }
        this.f3075n = view;
        this.f3070i.m3520K(this);
        this.f3070i.m3521L(this);
        this.f3070i.m3519J(true);
        View view2 = this.f3075n;
        boolean z2 = this.f3077p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3077p = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3071j);
        }
        view2.addOnAttachStateChangeListener(this.f3072k);
        this.f3070i.m3513D(view2);
        this.f3070i.m3516G(this.f3081t);
        if (!this.f3079r) {
            this.f3080s = AbstractC0789h.m3204r(this.f3065d, null, this.f3063b, this.f3067f);
            this.f3079r = true;
        }
        this.f3070i.m3515F(this.f3080s);
        this.f3070i.m3518I(2);
        this.f3070i.m3517H(m3205q());
        this.f3070i.mo3086e();
        ListView listViewMo3088g = this.f3070i.mo3088g();
        listViewMo3088g.setOnKeyListener(this);
        if (this.f3082u && this.f3064c.m3173z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f3063b).inflate(AbstractC1766g.f8846l, (ViewGroup) listViewMo3088g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f3064c.m3173z());
            }
            frameLayout.setEnabled(false);
            listViewMo3088g.addHeaderView(frameLayout, null, false);
        }
        this.f3070i.mo3354p(this.f3065d);
        this.f3070i.mo3086e();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        if (c0786e != this.f3064c) {
            return;
        }
        dismiss();
        InterfaceC0791j.a aVar = this.f3076o;
        if (aVar != null) {
            aVar.mo2717a(c0786e, z2);
        }
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: c */
    public boolean mo3085c() {
        return !this.f3078q && this.f3070i.mo3085c();
    }

    @Override // p111i.InterfaceC2024e
    public void dismiss() {
        if (mo3085c()) {
            this.f3070i.dismiss();
        }
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: e */
    public void mo3086e() {
        if (!m3221C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: g */
    public ListView mo3088g() {
        return this.f3070i.mo3088g();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        if (subMenuC0794m.hasVisibleItems()) {
            C0790i c0790i = new C0790i(this.f3063b, subMenuC0794m, this.f3075n, this.f3066e, this.f3068g, this.f3069h);
            c0790i.m3217j(this.f3076o);
            c0790i.m3214g(AbstractC0789h.m3202A(subMenuC0794m));
            c0790i.m3216i(this.f3073l);
            this.f3073l = null;
            this.f3064c.m3154e(false);
            int iM3527d = this.f3070i.m3527d();
            int iM3532n = this.f3070i.m3532n();
            if ((Gravity.getAbsoluteGravity(this.f3081t, this.f3074m.getLayoutDirection()) & 7) == 5) {
                iM3527d += this.f3074m.getWidth();
            }
            if (c0790i.m3220n(iM3527d, iM3532n)) {
                InterfaceC0791j.a aVar = this.f3076o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo2718b(subMenuC0794m);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        this.f3079r = false;
        C0785d c0785d = this.f3065d;
        if (c0785d != null) {
            c0785d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: j */
    public boolean mo3089j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: k */
    public Parcelable mo3090k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: n */
    public void mo3071n(InterfaceC0791j.a aVar) {
        this.f3076o = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: o */
    public void mo3091o(C0786e c0786e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f3078q = true;
        this.f3064c.close();
        ViewTreeObserver viewTreeObserver = this.f3077p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3077p = this.f3075n.getViewTreeObserver();
            }
            this.f3077p.removeGlobalOnLayoutListener(this.f3071j);
            this.f3077p = null;
        }
        this.f3075n.removeOnAttachStateChangeListener(this.f3072k);
        PopupWindow.OnDismissListener onDismissListener = this.f3073l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: s */
    public void mo3093s(View view) {
        this.f3074m = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: u */
    public void mo3094u(boolean z2) {
        this.f3065d.m3112d(z2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: v */
    public void mo3095v(int i3) {
        this.f3081t = i3;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: w */
    public void mo3096w(int i3) {
        this.f3070i.m3531l(i3);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: x */
    public void mo3097x(PopupWindow.OnDismissListener onDismissListener) {
        this.f3073l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: y */
    public void mo3098y(boolean z2) {
        this.f3082u = z2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: z */
    public void mo3099z(int i3) {
        this.f3070i.m3530j(i3);
    }
}
