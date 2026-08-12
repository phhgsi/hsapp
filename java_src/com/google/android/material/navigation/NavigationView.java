package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.C0702b;
import androidx.appcompat.view.C0777g;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.widget.C0888e0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.drawable.AbstractC1519d;
import com.google.android.material.internal.AbstractC1531b;
import com.google.android.material.internal.AbstractC1540k;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.AbstractC1551v;
import com.google.android.material.internal.C1537h;
import com.google.android.material.internal.C1538i;
import java.util.Objects;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p019G0.AbstractC0176a;
import p027J.C0318w0;
import p031K0.AbstractC0358a;
import p058T0.C0523c;
import p058T0.C0527g;
import p058T0.InterfaceC0522b;
import p067W0.AbstractC0557c;
import p070X0.AbstractC0595a;
import p076Z0.AbstractC0638i;
import p076Z0.AbstractC0645p;
import p076Z0.C0637h;
import p076Z0.C0641l;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends AbstractC1540k implements InterfaceC0522b {

    /* JADX INFO: renamed from: h */
    private final C1537h f7827h;

    /* JADX INFO: renamed from: i */
    private final C1538i f7828i;

    /* JADX INFO: renamed from: j */
    InterfaceC1563d f7829j;

    /* JADX INFO: renamed from: k */
    private final int f7830k;

    /* JADX INFO: renamed from: l */
    private final int[] f7831l;

    /* JADX INFO: renamed from: m */
    private MenuInflater f7832m;

    /* JADX INFO: renamed from: n */
    private ViewTreeObserver.OnGlobalLayoutListener f7833n;

    /* JADX INFO: renamed from: o */
    private boolean f7834o;

    /* JADX INFO: renamed from: p */
    private boolean f7835p;

    /* JADX INFO: renamed from: q */
    private boolean f7836q;

    /* JADX INFO: renamed from: r */
    private boolean f7837r;

    /* JADX INFO: renamed from: s */
    private int f7838s;

    /* JADX INFO: renamed from: t */
    private final boolean f7839t;

    /* JADX INFO: renamed from: u */
    private final int f7840u;

    /* JADX INFO: renamed from: v */
    private final AbstractC0645p f7841v;

    /* JADX INFO: renamed from: w */
    private final C0527g f7842w;

    /* JADX INFO: renamed from: x */
    private final C0523c f7843x;

    /* JADX INFO: renamed from: y */
    private final DrawerLayout.InterfaceC0998d f7844y;

    /* JADX INFO: renamed from: z */
    private static final int[] f7826z = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private static final int[] f7824A = {-16842910};

    /* JADX INFO: renamed from: B */
    private static final int f7825B = AbstractC0149j.f575h;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$a */
    class C1560a extends DrawerLayout.AbstractC1000f {
        C1560a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: c */
        public void mo4484c(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final C0523c c0523c = navigationView.f7843x;
                Objects.requireNonNull(c0523c);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0523c.m1884d();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0998d
        /* JADX INFO: renamed from: d */
        public void mo4485d(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f7843x.m1885e();
                NavigationView.this.m8537u();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$b */
    class C1561b implements C0786e.a {
        C1561b() {
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            InterfaceC1563d interfaceC1563d = NavigationView.this.f7829j;
            return interfaceC1563d != null && interfaceC1563d.mo8550a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$c */
    class ViewTreeObserverOnGlobalLayoutListenerC1562c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC1562c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f7831l);
            boolean z2 = true;
            boolean z3 = NavigationView.this.f7831l[1] == 0;
            NavigationView.this.f7828i.m8393E(z3);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z3 && navigationView2.m8546t());
            boolean z4 = NavigationView.this.getLayoutDirection() == 1;
            boolean z5 = NavigationView.this.f7831l[0] == 0 || NavigationView.this.f7831l[0] + NavigationView.this.getWidth() == 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawLeftInsetForeground(z5 && (!z4 ? !navigationView3.m8545s() : !navigationView3.m8544r()));
            Activity activityM8372a = AbstractC1531b.m8372a(NavigationView.this.getContext());
            if (activityM8372a != null) {
                Rect rectM8508a = AbstractC1551v.m8508a(activityM8372a);
                boolean z6 = rectM8508a.height() - NavigationView.this.getHeight() == NavigationView.this.f7831l[1];
                boolean z7 = Color.alpha(activityM8372a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView4 = NavigationView.this;
                navigationView4.setDrawBottomInsetForeground(z6 && z7 && navigationView4.m8543q());
                boolean z8 = rectM8508a.width() == NavigationView.this.f7831l[0] || rectM8508a.width() - NavigationView.this.getWidth() == NavigationView.this.f7831l[0];
                NavigationView navigationView5 = NavigationView.this;
                if (!z8 || (!z4 ? !navigationView5.m8544r() : !navigationView5.m8545s())) {
                    z2 = false;
                }
                navigationView5.setDrawRightInsetForeground(z2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$d */
    public interface InterfaceC1563d {
        /* JADX INFO: renamed from: a */
        boolean mo8550a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f319L);
    }

    private MenuInflater getMenuInflater() {
        if (this.f7832m == null) {
            this.f7832m = new C0777g(getContext());
        }
        return this.f7832m;
    }

    /* JADX INFO: renamed from: k */
    private ColorStateList m8533k(int i3) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i3, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM9608a = AbstractC1832a.m9608a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC1760a.f8722w, typedValue, true)) {
            return null;
        }
        int i4 = typedValue.data;
        int defaultColor = colorStateListM9608a.getDefaultColor();
        int[] iArr = f7824A;
        return new ColorStateList(new int[][]{iArr, f7826z, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM9608a.getColorForState(iArr, defaultColor), i4, defaultColor});
    }

    /* JADX INFO: renamed from: l */
    private Drawable m8534l(C0888e0 c0888e0) {
        return m8535m(c0888e0, AbstractC0557c.m2078b(getContext(), c0888e0, AbstractC0150k.f627D5));
    }

    /* JADX INFO: renamed from: m */
    private Drawable m8535m(C0888e0 c0888e0, ColorStateList colorStateList) {
        C0637h c0637h = new C0637h(C0641l.m2305b(getContext(), c0888e0.m3779n(AbstractC0150k.f609B5, 0), c0888e0.m3779n(AbstractC0150k.f618C5, 0)).m2351m());
        c0637h.m2274c0(colorStateList);
        return new InsetDrawable((Drawable) c0637h, c0888e0.m3771f(AbstractC0150k.f654G5, 0), c0888e0.m3771f(AbstractC0150k.f663H5, 0), c0888e0.m3771f(AbstractC0150k.f645F5, 0), c0888e0.m3771f(AbstractC0150k.f636E5, 0));
    }

    /* JADX INFO: renamed from: n */
    private boolean m8536n(C0888e0 c0888e0) {
        return c0888e0.m3784s(AbstractC0150k.f609B5) || c0888e0.m3784s(AbstractC0150k.f618C5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m8537u() {
        if (!this.f7839t || this.f7838s == 0) {
            return;
        }
        this.f7838s = 0;
        m8538v(getWidth(), getHeight());
    }

    /* JADX INFO: renamed from: v */
    private void m8538v(int i3, int i4) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.C0999e)) {
            if ((this.f7838s > 0 || this.f7839t) && (getBackground() instanceof C0637h)) {
                boolean z2 = Gravity.getAbsoluteGravity(((DrawerLayout.C0999e) getLayoutParams()).f4795a, getLayoutDirection()) == 3;
                C0637h c0637h = (C0637h) getBackground();
                C0641l.b bVarM2352o = c0637h.m2261H().m2326w().m2352o(this.f7838s);
                if (z2) {
                    bVarM2352o.m2345C(0.0f);
                    bVarM2352o.m2358u(0.0f);
                } else {
                    bVarM2352o.m2349G(0.0f);
                    bVarM2352o.m2362y(0.0f);
                }
                C0641l c0641lM2351m = bVarM2352o.m2351m();
                c0637h.setShapeAppearanceModel(c0641lM2351m);
                this.f7841v.m2434f(this, c0641lM2351m);
                this.f7841v.m2433e(this, new RectF(0.0f, 0.0f, i3, i4));
                this.f7841v.m2436h(this, true);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    private Pair m8539w() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.C0999e)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.C0999e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    /* JADX INFO: renamed from: x */
    private void m8540x() {
        this.f7833n = new ViewTreeObserverOnGlobalLayoutListenerC1562c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f7833n);
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: a */
    public void mo1877a() {
        Pair pairM8539w = m8539w();
        DrawerLayout drawerLayout = (DrawerLayout) pairM8539w.first;
        C0702b c0702bM1874c = this.f7842w.m1874c();
        if (c0702bM1874c == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m4460h(this);
            return;
        }
        this.f7842w.m1901h(c0702bM1874c, ((DrawerLayout.C0999e) pairM8539w.second).f4795a, AbstractC1566c.m8552b(drawerLayout, this), AbstractC1566c.m8553c(drawerLayout));
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: b */
    public void mo1878b(C0702b c0702b) {
        m8539w();
        this.f7842w.m1902j(c0702b);
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: c */
    public void mo1879c(C0702b c0702b) {
        this.f7842w.m1904l(c0702b, ((DrawerLayout.C0999e) m8539w().second).f4795a);
        if (this.f7839t) {
            this.f7838s = AbstractC0176a.m484c(0, this.f7840u, this.f7842w.m1872a(c0702b.m2627a()));
            m8538v(getWidth(), getHeight());
        }
    }

    @Override // p058T0.InterfaceC0522b
    /* JADX INFO: renamed from: d */
    public void mo1880d() {
        m8539w();
        this.f7842w.m1900f();
        m8537u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f7841v.m2432d(canvas, new AbstractC0358a.a() { // from class: com.google.android.material.navigation.n
            @Override // p031K0.AbstractC0358a.a
            /* JADX INFO: renamed from: a */
            public final void mo1327a(Canvas canvas2) {
                super/*android.widget.FrameLayout*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.AbstractC1540k
    /* JADX INFO: renamed from: e */
    protected void mo8453e(C0318w0 c0318w0) {
        this.f7828i.m8416g(c0318w0);
    }

    C0527g getBackHelper() {
        return this.f7842w;
    }

    public MenuItem getCheckedItem() {
        return this.f7828i.m8417o();
    }

    public int getDividerInsetEnd() {
        return this.f7828i.m8418p();
    }

    public int getDividerInsetStart() {
        return this.f7828i.m8419q();
    }

    public int getHeaderCount() {
        return this.f7828i.m8420r();
    }

    public Drawable getItemBackground() {
        return this.f7828i.m8421s();
    }

    public int getItemHorizontalPadding() {
        return this.f7828i.m8422t();
    }

    public int getItemIconPadding() {
        return this.f7828i.m8423u();
    }

    public ColorStateList getItemIconTintList() {
        return this.f7828i.m8426x();
    }

    public int getItemMaxLines() {
        return this.f7828i.m8424v();
    }

    public ColorStateList getItemTextColor() {
        return this.f7828i.m8425w();
    }

    public int getItemVerticalPadding() {
        return this.f7828i.m8427y();
    }

    public Menu getMenu() {
        return this.f7827h;
    }

    public int getSubheaderInsetEnd() {
        return this.f7828i.m8390A();
    }

    public int getSubheaderInsetStart() {
        return this.f7828i.m8391B();
    }

    /* JADX INFO: renamed from: o */
    public View m8541o(int i3) {
        return this.f7828i.m8392D(i3);
    }

    @Override // com.google.android.material.internal.AbstractC1540k, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0638i.m2300e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f7843x.m1883b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.m4449Q(this.f7844y);
            drawerLayout.m4455c(this.f7844y);
            if (drawerLayout.m4440F(this)) {
                this.f7843x.m1884d();
            }
        }
    }

    @Override // com.google.android.material.internal.AbstractC1540k, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f7833n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).m4449Q(this.f7844y);
        }
        this.f7843x.m1885e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), this.f7830k), 1073741824);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.f7830k, 1073741824);
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        this.f7827h.m3140T(savedState.f7845f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f7845f = bundle;
        this.f7827h.m3142V(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        m8538v(i3, i4);
    }

    /* JADX INFO: renamed from: p */
    public void m8542p(int i3) {
        this.f7828i.m8414Z(true);
        getMenuInflater().inflate(i3, this.f7827h);
        this.f7828i.m8414Z(false);
        this.f7828i.mo3068i(false);
    }

    /* JADX INFO: renamed from: q */
    public boolean m8543q() {
        return this.f7835p;
    }

    /* JADX INFO: renamed from: r */
    public boolean m8544r() {
        return this.f7837r;
    }

    /* JADX INFO: renamed from: s */
    public boolean m8545s() {
        return this.f7836q;
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f7835p = z2;
    }

    public void setCheckedItem(int i3) {
        MenuItem menuItemFindItem = this.f7827h.findItem(i3);
        if (menuItemFindItem != null) {
            this.f7828i.m8394F((C0788g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i3) {
        this.f7828i.m8395G(i3);
    }

    public void setDividerInsetStart(int i3) {
        this.f7828i.m8396H(i3);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        AbstractC0638i.m2299d(this, f3);
    }

    public void setEndInsetScrimEnabled(boolean z2) {
        this.f7837r = z2;
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        this.f7841v.m2435g(this, z2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f7828i.m8398J(drawable);
    }

    public void setItemBackgroundResource(int i3) {
        setItemBackground(getContext().getDrawable(i3));
    }

    public void setItemHorizontalPadding(int i3) {
        this.f7828i.m8400L(i3);
    }

    public void setItemHorizontalPaddingResource(int i3) {
        this.f7828i.m8400L(getResources().getDimensionPixelSize(i3));
    }

    public void setItemIconPadding(int i3) {
        this.f7828i.m8401M(i3);
    }

    public void setItemIconPaddingResource(int i3) {
        this.f7828i.m8401M(getResources().getDimensionPixelSize(i3));
    }

    public void setItemIconSize(int i3) {
        this.f7828i.m8402N(i3);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f7828i.m8403O(colorStateList);
    }

    public void setItemMaxLines(int i3) {
        this.f7828i.m8404P(i3);
    }

    public void setItemTextAppearance(int i3) {
        this.f7828i.m8405Q(i3);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.f7828i.m8406R(z2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f7828i.m8407S(colorStateList);
    }

    public void setItemVerticalPadding(int i3) {
        this.f7828i.m8408T(i3);
    }

    public void setItemVerticalPaddingResource(int i3) {
        this.f7828i.m8408T(getResources().getDimensionPixelSize(i3));
    }

    public void setNavigationItemSelectedListener(InterfaceC1563d interfaceC1563d) {
        this.f7829j = interfaceC1563d;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i3) {
        super.setOverScrollMode(i3);
        C1538i c1538i = this.f7828i;
        if (c1538i != null) {
            c1538i.m8409U(i3);
        }
    }

    public void setStartInsetScrimEnabled(boolean z2) {
        this.f7836q = z2;
    }

    public void setSubheaderInsetEnd(int i3) {
        this.f7828i.m8411W(i3);
    }

    public void setSubheaderInsetStart(int i3) {
        this.f7828i.m8412X(i3);
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.f7834o = z2;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8546t() {
        return this.f7834o;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1559a();

        /* JADX INFO: renamed from: f */
        public Bundle f7845f;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        class C1559a implements Parcelable.ClassLoaderCreator {
            C1559a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i3) {
                return new SavedState[i3];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7845f = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeBundle(this.f7845f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i3) {
        int i4;
        int i5 = f7825B;
        super(AbstractC1313a.m6668d(context, attributeSet, i3, i5), attributeSet, i3);
        C1538i c1538i = new C1538i();
        this.f7828i = c1538i;
        this.f7831l = new int[2];
        this.f7834o = true;
        this.f7835p = true;
        this.f7836q = true;
        this.f7837r = true;
        this.f7838s = 0;
        this.f7841v = AbstractC0645p.m2428a(this);
        this.f7842w = new C0527g(this);
        this.f7843x = new C0523c(this);
        this.f7844y = new C1560a();
        Context context2 = getContext();
        C1537h c1537h = new C1537h(context2);
        this.f7827h = c1537h;
        C0888e0 c0888e0M8489j = AbstractC1546q.m8489j(context2, attributeSet, AbstractC0150k.f924j5, i3, i5, new int[0]);
        int i6 = AbstractC0150k.f934k5;
        if (c0888e0M8489j.m3784s(i6)) {
            setBackground(c0888e0M8489j.m3772g(i6));
        }
        int iM3771f = c0888e0M8489j.m3771f(AbstractC0150k.f993q5, 0);
        this.f7838s = iM3771f;
        this.f7839t = iM3771f == 0;
        this.f7840u = getResources().getDimensionPixelSize(AbstractC0142c.f369C);
        Drawable background = getBackground();
        ColorStateList colorStateListM8253f = AbstractC1519d.m8253f(background);
        if (background == null || colorStateListM8253f != null) {
            C0637h c0637h = new C0637h(C0641l.m2308e(context2, attributeSet, i3, i5).m2351m());
            if (colorStateListM8253f != null) {
                c0637h.m2274c0(colorStateListM8253f);
            }
            c0637h.m2266Q(context2);
            setBackground(c0637h);
        }
        if (c0888e0M8489j.m3784s(AbstractC0150k.f1002r5)) {
            setElevation(c0888e0M8489j.m3771f(r2, 0));
        }
        setFitsSystemWindows(c0888e0M8489j.m3766a(AbstractC0150k.f944l5, false));
        this.f7830k = c0888e0M8489j.m3771f(AbstractC0150k.f954m5, 0);
        int i7 = AbstractC0150k.f726O5;
        ColorStateList colorStateListM3768c = c0888e0M8489j.m3784s(i7) ? c0888e0M8489j.m3768c(i7) : null;
        int i8 = AbstractC0150k.f753R5;
        int iM3779n = c0888e0M8489j.m3784s(i8) ? c0888e0M8489j.m3779n(i8, 0) : 0;
        if (iM3779n == 0 && colorStateListM3768c == null) {
            colorStateListM3768c = m8533k(R.attr.textColorSecondary);
        }
        int i9 = AbstractC0150k.f1065y5;
        ColorStateList colorStateListM3768c2 = c0888e0M8489j.m3784s(i9) ? c0888e0M8489j.m3768c(i9) : m8533k(R.attr.textColorSecondary);
        int i10 = AbstractC0150k.f672I5;
        int iM3779n2 = c0888e0M8489j.m3784s(i10) ? c0888e0M8489j.m3779n(i10, 0) : 0;
        boolean zM3766a = c0888e0M8489j.m3766a(AbstractC0150k.f681J5, true);
        int i11 = AbstractC0150k.f1056x5;
        if (c0888e0M8489j.m3784s(i11)) {
            setItemIconSize(c0888e0M8489j.m3771f(i11, 0));
        }
        int i12 = AbstractC0150k.f690K5;
        ColorStateList colorStateListM3768c3 = c0888e0M8489j.m3784s(i12) ? c0888e0M8489j.m3768c(i12) : null;
        if (iM3779n2 == 0 && colorStateListM3768c3 == null) {
            colorStateListM3768c3 = m8533k(R.attr.textColorPrimary);
        }
        Drawable drawableM3772g = c0888e0M8489j.m3772g(AbstractC0150k.f1029u5);
        if (drawableM3772g == null && m8536n(c0888e0M8489j)) {
            drawableM3772g = m8534l(c0888e0M8489j);
            ColorStateList colorStateListM2078b = AbstractC0557c.m2078b(context2, c0888e0M8489j, AbstractC0150k.f600A5);
            if (colorStateListM2078b != null) {
                c1538i.m8399K(new RippleDrawable(AbstractC0595a.m2128d(colorStateListM2078b), null, m8535m(c0888e0M8489j, null)));
            }
        }
        int i13 = AbstractC0150k.f1038v5;
        if (c0888e0M8489j.m3784s(i13)) {
            i4 = 0;
            setItemHorizontalPadding(c0888e0M8489j.m3771f(i13, 0));
        } else {
            i4 = 0;
        }
        int i14 = AbstractC0150k.f699L5;
        if (c0888e0M8489j.m3784s(i14)) {
            setItemVerticalPadding(c0888e0M8489j.m3771f(i14, i4));
        }
        setDividerInsetStart(c0888e0M8489j.m3771f(AbstractC0150k.f984p5, i4));
        setDividerInsetEnd(c0888e0M8489j.m3771f(AbstractC0150k.f974o5, i4));
        setSubheaderInsetStart(c0888e0M8489j.m3771f(AbstractC0150k.f744Q5, i4));
        setSubheaderInsetEnd(c0888e0M8489j.m3771f(AbstractC0150k.f735P5, i4));
        setTopInsetScrimEnabled(c0888e0M8489j.m3766a(AbstractC0150k.f762S5, this.f7834o));
        setBottomInsetScrimEnabled(c0888e0M8489j.m3766a(AbstractC0150k.f964n5, this.f7835p));
        setStartInsetScrimEnabled(c0888e0M8489j.m3766a(AbstractC0150k.f717N5, this.f7836q));
        setEndInsetScrimEnabled(c0888e0M8489j.m3766a(AbstractC0150k.f1011s5, this.f7837r));
        int iM3771f2 = c0888e0M8489j.m3771f(AbstractC0150k.f1047w5, 0);
        setItemMaxLines(c0888e0M8489j.m3776k(AbstractC0150k.f1074z5, 1));
        c1537h.mo3143W(new C1561b());
        c1538i.m8397I(1);
        c1538i.mo3064d(context2, c1537h);
        if (iM3779n != 0) {
            c1538i.m8413Y(iM3779n);
        }
        c1538i.m8410V(colorStateListM3768c);
        c1538i.m8403O(colorStateListM3768c2);
        c1538i.m8409U(getOverScrollMode());
        if (iM3779n2 != 0) {
            c1538i.m8405Q(iM3779n2);
        }
        c1538i.m8406R(zM3766a);
        c1538i.m8407S(colorStateListM3768c3);
        c1538i.m8398J(drawableM3772g);
        c1538i.m8401M(iM3771f2);
        c1537h.m3149b(c1538i);
        addView((View) c1538i.m8428z(this));
        int i15 = AbstractC0150k.f708M5;
        if (c0888e0M8489j.m3784s(i15)) {
            m8542p(c0888e0M8489j.m3779n(i15, 0));
        }
        int i16 = AbstractC0150k.f1020t5;
        if (c0888e0M8489j.m3784s(i16)) {
            m8541o(c0888e0M8489j.m3779n(i16, 0));
        }
        c0888e0M8489j.m3786x();
        m8540x();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f7827h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f7828i.m8394F((C0788g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
