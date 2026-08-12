package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0771a;
import androidx.appcompat.view.menu.AbstractC0782a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.C0790i;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.view.menu.SubMenuC0794m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000A.AbstractC0000a;
import p027J.AbstractC0275b;
import p091d.AbstractC1760a;
import p091d.AbstractC1766g;
import p111i.InterfaceC2024e;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends AbstractC0782a implements AbstractC0275b.a {

    /* JADX INFO: renamed from: A */
    RunnableC0807c f3170A;

    /* JADX INFO: renamed from: B */
    private C0806b f3171B;

    /* JADX INFO: renamed from: C */
    final C0810f f3172C;

    /* JADX INFO: renamed from: D */
    int f3173D;

    /* JADX INFO: renamed from: k */
    C0808d f3174k;

    /* JADX INFO: renamed from: l */
    private Drawable f3175l;

    /* JADX INFO: renamed from: m */
    private boolean f3176m;

    /* JADX INFO: renamed from: n */
    private boolean f3177n;

    /* JADX INFO: renamed from: o */
    private boolean f3178o;

    /* JADX INFO: renamed from: p */
    private int f3179p;

    /* JADX INFO: renamed from: q */
    private int f3180q;

    /* JADX INFO: renamed from: r */
    private int f3181r;

    /* JADX INFO: renamed from: s */
    private boolean f3182s;

    /* JADX INFO: renamed from: t */
    private boolean f3183t;

    /* JADX INFO: renamed from: u */
    private boolean f3184u;

    /* JADX INFO: renamed from: v */
    private boolean f3185v;

    /* JADX INFO: renamed from: w */
    private int f3186w;

    /* JADX INFO: renamed from: x */
    private final SparseBooleanArray f3187x;

    /* JADX INFO: renamed from: y */
    C0809e f3188y;

    /* JADX INFO: renamed from: z */
    C0805a f3189z;

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0804a();

        /* JADX INFO: renamed from: d */
        public int f3190d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0804a implements Parcelable.Creator {
            C0804a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f3190d);
        }

        SavedState(Parcel parcel) {
            this.f3190d = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0805a extends C0790i {
        public C0805a(Context context, SubMenuC0794m subMenuC0794m, View view) {
            super(context, subMenuC0794m, view, false, AbstractC1760a.f8708i);
            if (!((C0788g) subMenuC0794m.getItem()).m3187l()) {
                View view2 = ActionMenuPresenter.this.f3174k;
                m3213f(view2 == null ? (View) ((AbstractC0782a) ActionMenuPresenter.this).f2928i : view2);
            }
            m3217j(ActionMenuPresenter.this.f3172C);
        }

        @Override // androidx.appcompat.view.menu.C0790i
        /* JADX INFO: renamed from: e */
        protected void mo3212e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f3189z = null;
            actionMenuPresenter.f3173D = 0;
            super.mo3212e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0806b extends ActionMenuItemView.AbstractC0781b {
        C0806b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0781b
        /* JADX INFO: renamed from: a */
        public InterfaceC2024e mo3052a() {
            C0805a c0805a = ActionMenuPresenter.this.f3189z;
            if (c0805a != null) {
                return c0805a.m3210c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class RunnableC0807c implements Runnable {

        /* JADX INFO: renamed from: d */
        private C0809e f3193d;

        public RunnableC0807c(C0809e c0809e) {
            this.f3193d = c0809e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0782a) ActionMenuPresenter.this).f2922c != null) {
                ((AbstractC0782a) ActionMenuPresenter.this).f2922c.m3152d();
            }
            View view = (View) ((AbstractC0782a) ActionMenuPresenter.this).f2928i;
            if (view != null && view.getWindowToken() != null && this.f3193d.m3219m()) {
                ActionMenuPresenter.this.f3188y = this.f3193d;
            }
            ActionMenuPresenter.this.f3170A = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0808d extends C0911q implements ActionMenuView.InterfaceC0811a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class a extends AbstractViewOnTouchListenerC0839P {

            /* JADX INFO: renamed from: j */
            final /* synthetic */ ActionMenuPresenter f3196j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f3196j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
            /* JADX INFO: renamed from: b */
            public InterfaceC2024e mo3050b() {
                C0809e c0809e = ActionMenuPresenter.this.f3188y;
                if (c0809e == null) {
                    return null;
                }
                return c0809e.m3210c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
            /* JADX INFO: renamed from: c */
            public boolean mo3051c() {
                ActionMenuPresenter.this.m3312N();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
            /* JADX INFO: renamed from: d */
            public boolean mo3315d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f3170A != null) {
                    return false;
                }
                actionMenuPresenter.m3303E();
                return true;
            }
        }

        public C0808d(Context context) {
            super(context, null, AbstractC1760a.f8707h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC0898j0.m3829a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0811a
        /* JADX INFO: renamed from: a */
        public boolean mo3045a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0811a
        /* JADX INFO: renamed from: b */
        public boolean mo3046b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m3312N();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i3, int i4, int i5, int i6) {
            boolean frame = super.setFrame(i3, i4, i5, i6);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC0000a.m11l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0809e extends C0790i {
        public C0809e(Context context, C0786e c0786e, View view, boolean z2) {
            super(context, c0786e, view, z2, AbstractC1760a.f8708i);
            m3215h(8388613);
            m3217j(ActionMenuPresenter.this.f3172C);
        }

        @Override // androidx.appcompat.view.menu.C0790i
        /* JADX INFO: renamed from: e */
        protected void mo3212e() {
            if (((AbstractC0782a) ActionMenuPresenter.this).f2922c != null) {
                ((AbstractC0782a) ActionMenuPresenter.this).f2922c.close();
            }
            ActionMenuPresenter.this.f3188y = null;
            super.mo3212e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0810f implements InterfaceC0791j.a {
        C0810f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: a */
        public void mo2717a(C0786e c0786e, boolean z2) {
            if (c0786e instanceof SubMenuC0794m) {
                c0786e.mo3127F().m3154e(false);
            }
            InterfaceC0791j.a aVarM3073p = ActionMenuPresenter.this.m3073p();
            if (aVarM3073p != null) {
                aVarM3073p.mo2717a(c0786e, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: b */
        public boolean mo2718b(C0786e c0786e) {
            if (c0786e == ((AbstractC0782a) ActionMenuPresenter.this).f2922c) {
                return false;
            }
            ActionMenuPresenter.this.f3173D = ((SubMenuC0794m) c0786e).getItem().getItemId();
            InterfaceC0791j.a aVarM3073p = ActionMenuPresenter.this.m3073p();
            if (aVarM3073p != null) {
                return aVarM3073p.mo2718b(c0786e);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, AbstractC1766g.f8837c, AbstractC1766g.f8836b);
        this.f3187x = new SparseBooleanArray();
        this.f3172C = new C0810f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    private View m3294C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2928i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof InterfaceC0792k.a) && ((InterfaceC0792k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public boolean m3301B() {
        return m3303E() | m3304F();
    }

    /* JADX INFO: renamed from: D */
    public Drawable m3302D() {
        C0808d c0808d = this.f3174k;
        if (c0808d != null) {
            return c0808d.getDrawable();
        }
        if (this.f3176m) {
            return this.f3175l;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public boolean m3303E() {
        Object obj;
        RunnableC0807c runnableC0807c = this.f3170A;
        if (runnableC0807c != null && (obj = this.f2928i) != null) {
            ((View) obj).removeCallbacks(runnableC0807c);
            this.f3170A = null;
            return true;
        }
        C0809e c0809e = this.f3188y;
        if (c0809e == null) {
            return false;
        }
        c0809e.m3209b();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m3304F() {
        C0805a c0805a = this.f3189z;
        if (c0805a == null) {
            return false;
        }
        c0805a.m3209b();
        return true;
    }

    /* JADX INFO: renamed from: G */
    public boolean m3305G() {
        return this.f3170A != null || m3306H();
    }

    /* JADX INFO: renamed from: H */
    public boolean m3306H() {
        C0809e c0809e = this.f3188y;
        return c0809e != null && c0809e.m3211d();
    }

    /* JADX INFO: renamed from: I */
    public void m3307I(Configuration configuration) {
        if (!this.f3182s) {
            this.f3181r = C0771a.m2998b(this.f2921b).m3001d();
        }
        C0786e c0786e = this.f2922c;
        if (c0786e != null) {
            c0786e.mo3135N(true);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3308J(boolean z2) {
        this.f3185v = z2;
    }

    /* JADX INFO: renamed from: K */
    public void m3309K(ActionMenuView actionMenuView) {
        this.f2928i = actionMenuView;
        actionMenuView.mo3054b(this.f2922c);
    }

    /* JADX INFO: renamed from: L */
    public void m3310L(Drawable drawable) {
        C0808d c0808d = this.f3174k;
        if (c0808d != null) {
            c0808d.setImageDrawable(drawable);
        } else {
            this.f3176m = true;
            this.f3175l = drawable;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m3311M(boolean z2) {
        this.f3177n = z2;
        this.f3178o = true;
    }

    /* JADX INFO: renamed from: N */
    public boolean m3312N() {
        C0786e c0786e;
        if (!this.f3177n || m3306H() || (c0786e = this.f2922c) == null || this.f2928i == null || this.f3170A != null || c0786e.m3124B().isEmpty()) {
            return false;
        }
        RunnableC0807c runnableC0807c = new RunnableC0807c(new C0809e(this.f2921b, this.f2922c, this.f3174k, true));
        this.f3170A = runnableC0807c;
        ((View) this.f2928i).post(runnableC0807c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a, androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        m3301B();
        super.mo3061a(c0786e, z2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a, androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: d */
    public void mo3064d(Context context, C0786e c0786e) {
        super.mo3064d(context, c0786e);
        Resources resources = context.getResources();
        C0771a c0771aM2998b = C0771a.m2998b(context);
        if (!this.f3178o) {
            this.f3177n = c0771aM2998b.m3003f();
        }
        if (!this.f3184u) {
            this.f3179p = c0771aM2998b.m3000c();
        }
        if (!this.f3182s) {
            this.f3181r = c0771aM2998b.m3001d();
        }
        int measuredWidth = this.f3179p;
        if (this.f3177n) {
            if (this.f3174k == null) {
                C0808d c0808d = new C0808d(this.f2920a);
                this.f3174k = c0808d;
                if (this.f3176m) {
                    c0808d.setImageDrawable(this.f3175l);
                    this.f3175l = null;
                    this.f3176m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3174k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3174k.getMeasuredWidth();
        } else {
            this.f3174k = null;
        }
        this.f3180q = measuredWidth;
        this.f3186w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a
    /* JADX INFO: renamed from: e */
    public void mo3065e(C0788g c0788g, InterfaceC0792k.a aVar) {
        aVar.mo3048e(c0788g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2928i);
        if (this.f3171B == null) {
            this.f3171B = new C0806b();
        }
        actionMenuItemView.setPopupCallback(this.f3171B);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
        int i3;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i3 = ((SavedState) parcelable).f3190d) > 0 && (menuItemFindItem = this.f2922c.findItem(i3)) != null) {
            mo3067h((SubMenuC0794m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a, androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        boolean z2 = false;
        if (!subMenuC0794m.hasVisibleItems()) {
            return false;
        }
        SubMenuC0794m subMenuC0794m2 = subMenuC0794m;
        while (subMenuC0794m2.m3222j0() != this.f2922c) {
            subMenuC0794m2 = (SubMenuC0794m) subMenuC0794m2.m3222j0();
        }
        View viewM3294C = m3294C(subMenuC0794m2.getItem());
        if (viewM3294C == null) {
            return false;
        }
        this.f3173D = subMenuC0794m.getItem().getItemId();
        int size = subMenuC0794m.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = subMenuC0794m.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0805a c0805a = new C0805a(this.f2921b, subMenuC0794m, viewM3294C);
        this.f3189z = c0805a;
        c0805a.m3214g(z2);
        this.f3189z.m3218k();
        super.mo3067h(subMenuC0794m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a, androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        super.mo3068i(z2);
        ((View) this.f2928i).requestLayout();
        C0786e c0786e = this.f2922c;
        boolean z3 = false;
        if (c0786e != null) {
            ArrayList arrayListM3168u = c0786e.m3168u();
            int size = arrayListM3168u.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0275b abstractC0275bMo80a = ((C0788g) arrayListM3168u.get(i3)).mo80a();
                if (abstractC0275bMo80a != null) {
                    abstractC0275bMo80a.m918h(this);
                }
            }
        }
        C0786e c0786e2 = this.f2922c;
        ArrayList arrayListM3124B = c0786e2 != null ? c0786e2.m3124B() : null;
        if (this.f3177n && arrayListM3124B != null) {
            int size2 = arrayListM3124B.size();
            if (size2 == 1) {
                z3 = !((C0788g) arrayListM3124B.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f3174k == null) {
                this.f3174k = new C0808d(this.f2920a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3174k.getParent();
            if (viewGroup != this.f2928i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3174k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2928i;
                actionMenuView.addView(this.f3174k, actionMenuView.m3322F());
            }
        } else {
            C0808d c0808d = this.f3174k;
            if (c0808d != null) {
                Object parent = c0808d.getParent();
                Object obj = this.f2928i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3174k);
                }
            }
        }
        ((ActionMenuView) this.f2928i).setOverflowReserved(this.f3177n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: j */
    public boolean mo3089j() {
        ArrayList arrayListM3128G;
        int size;
        int i3;
        int iM3316L;
        ?? r02;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0786e c0786e = actionMenuPresenter.f2922c;
        View view = null;
        ?? r3 = 0;
        if (c0786e != null) {
            arrayListM3128G = c0786e.m3128G();
            size = arrayListM3128G.size();
        } else {
            arrayListM3128G = null;
            size = 0;
        }
        int i5 = actionMenuPresenter.f3181r;
        int i6 = actionMenuPresenter.f3180q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2928i;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C0788g c0788g = (C0788g) arrayListM3128G.get(i9);
            if (c0788g.m3190o()) {
                i7++;
            } else if (c0788g.m3189n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f3185v && c0788g.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f3177n && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f3187x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f3183t) {
            int i11 = actionMenuPresenter.f3186w;
            iM3316L = i6 / i11;
            i3 = i11 + ((i6 % i11) / iM3316L);
        } else {
            i3 = 0;
            iM3316L = 0;
        }
        int i12 = 0;
        int i13 = 0;
        ?? r03 = actionMenuPresenter;
        while (i12 < size) {
            ?? r15 = (C0788g) arrayListM3128G.get(i12);
            if (r15.m3190o()) {
                View viewMo3074q = r03.mo3074q(r15, view, viewGroup);
                if (r03.f3183t) {
                    iM3316L -= ActionMenuView.m3316L(viewMo3074q, i3, iM3316L, iMakeMeasureSpec, r3);
                } else {
                    viewMo3074q.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo3074q.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.m3196u(true);
                r02 = r3;
                i4 = size;
            } else if (r15.m3189n()) {
                int groupId2 = r15.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!r03.f3183t || iM3316L > 0);
                boolean z5 = z4;
                i4 = size;
                if (z4) {
                    View viewMo3074q2 = r03.mo3074q(r15, null, viewGroup);
                    if (r03.f3183t) {
                        int iM3316L2 = ActionMenuView.m3316L(viewMo3074q2, i3, iM3316L, iMakeMeasureSpec, 0);
                        iM3316L -= iM3316L2;
                        if (iM3316L2 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewMo3074q2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = viewMo3074q2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!r03.f3183t ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        C0788g c0788g2 = (C0788g) arrayListM3128G.get(i14);
                        if (c0788g2.getGroupId() == groupId2) {
                            if (c0788g2.m3187l()) {
                                i10++;
                            }
                            c0788g2.m3196u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                r15.m3196u(z4);
                r02 = 0;
            } else {
                r02 = r3;
                i4 = size;
                r15.m3196u(r02);
            }
            i12++;
            r3 = r02;
            size = i4;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: k */
    public Parcelable mo3090k() {
        SavedState savedState = new SavedState();
        savedState.f3190d = this.f3173D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a
    /* JADX INFO: renamed from: o */
    public boolean mo3072o(ViewGroup viewGroup, int i3) {
        if (viewGroup.getChildAt(i3) == this.f3174k) {
            return false;
        }
        return super.mo3072o(viewGroup, i3);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a
    /* JADX INFO: renamed from: q */
    public View mo3074q(C0788g c0788g, View view, ViewGroup viewGroup) {
        View actionView = c0788g.getActionView();
        if (actionView == null || c0788g.m3185j()) {
            actionView = super.mo3074q(c0788g, view, viewGroup);
        }
        actionView.setVisibility(c0788g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a
    /* JADX INFO: renamed from: r */
    public InterfaceC0792k mo3075r(ViewGroup viewGroup) {
        InterfaceC0792k interfaceC0792k = this.f2928i;
        InterfaceC0792k interfaceC0792kMo3075r = super.mo3075r(viewGroup);
        if (interfaceC0792k != interfaceC0792kMo3075r) {
            ((ActionMenuView) interfaceC0792kMo3075r).setPresenter(this);
        }
        return interfaceC0792kMo3075r;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0782a
    /* JADX INFO: renamed from: t */
    public boolean mo3077t(int i3, C0788g c0788g) {
        return c0788g.m3187l();
    }
}
