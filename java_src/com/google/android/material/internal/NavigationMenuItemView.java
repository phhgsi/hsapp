package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.widget.AbstractC0840Q;
import androidx.appcompat.widget.AbstractC0898j0;
import androidx.core.widget.AbstractC0988i;
import p000A.AbstractC0000a;
import p016F0.AbstractC0142c;
import p016F0.AbstractC0143d;
import p016F0.AbstractC0144e;
import p016F0.AbstractC0146g;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.C0356y;
import p091d.AbstractC1760a;
import p164y.AbstractC2538k;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1534e implements InterfaceC0792k.a {

    /* JADX INFO: renamed from: G */
    private static final int[] f7627G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private FrameLayout f7628A;

    /* JADX INFO: renamed from: B */
    private C0788g f7629B;

    /* JADX INFO: renamed from: C */
    private ColorStateList f7630C;

    /* JADX INFO: renamed from: D */
    private boolean f7631D;

    /* JADX INFO: renamed from: E */
    private Drawable f7632E;

    /* JADX INFO: renamed from: F */
    private final C0273a f7633F;

    /* JADX INFO: renamed from: v */
    private int f7634v;

    /* JADX INFO: renamed from: w */
    private boolean f7635w;

    /* JADX INFO: renamed from: x */
    boolean f7636x;

    /* JADX INFO: renamed from: y */
    boolean f7637y;

    /* JADX INFO: renamed from: z */
    private final CheckedTextView f7638z;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C1528a extends C0273a {
        C1528a() {
        }

        @Override // p027J.C0273a
        /* JADX INFO: renamed from: g */
        public void mo905g(View view, C0356y c0356y) {
            super.mo905g(view, c0356y);
            c0356y.m1283q0(NavigationMenuItemView.this.f7636x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: B */
    private void m8293B() {
        if (m8295F()) {
            this.f7638z.setVisibility(8);
            FrameLayout frameLayout = this.f7628A;
            if (frameLayout != null) {
                AbstractC0840Q.a aVar = (AbstractC0840Q.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f7628A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f7638z.setVisibility(0);
        FrameLayout frameLayout2 = this.f7628A;
        if (frameLayout2 != null) {
            AbstractC0840Q.a aVar2 = (AbstractC0840Q.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f7628A.setLayoutParams(aVar2);
        }
    }

    /* JADX INFO: renamed from: C */
    private StateListDrawable m8294C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC1760a.f8719t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f7627G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: F */
    private boolean m8295F() {
        return this.f7629B.getTitle() == null && this.f7629B.getIcon() == null && this.f7629B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7628A == null) {
                this.f7628A = (FrameLayout) ((ViewStub) findViewById(AbstractC0144e.f485e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f7628A.removeAllViews();
            this.f7628A.addView(view);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m8296D(C0788g c0788g, boolean z2) {
        this.f7637y = z2;
        mo3048e(c0788g, 0);
    }

    /* JADX INFO: renamed from: E */
    public void m8297E() {
        FrameLayout frameLayout = this.f7628A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f7638z.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        this.f7629B = c0788g;
        if (c0788g.getItemId() > 0) {
            setId(c0788g.getItemId());
        }
        setVisibility(c0788g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(m8294C());
        }
        setCheckable(c0788g.isCheckable());
        setChecked(c0788g.isChecked());
        setEnabled(c0788g.isEnabled());
        setTitle(c0788g.getTitle());
        setIcon(c0788g.getIcon());
        setActionView(c0788g.getActionView());
        setContentDescription(c0788g.getContentDescription());
        AbstractC0898j0.m3829a(this, c0788g.getTooltipText());
        m8293B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return this.f7629B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        C0788g c0788g = this.f7629B;
        if (c0788g != null && c0788g.isCheckable() && this.f7629B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7627G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f7636x != z2) {
            this.f7636x = z2;
            this.f7633F.mo909l(this.f7638z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.f7638z.setChecked(z2);
        CheckedTextView checkedTextView = this.f7638z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f7637y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7631D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC0000a.m17r(drawable).mutate();
                drawable.setTintList(this.f7630C);
            }
            int i3 = this.f7634v;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f7635w) {
            if (this.f7632E == null) {
                Drawable drawableM12140f = AbstractC2538k.m12140f(getResources(), AbstractC0143d.f455k, getContext().getTheme());
                this.f7632E = drawableM12140f;
                if (drawableM12140f != null) {
                    int i4 = this.f7634v;
                    drawableM12140f.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f7632E;
        }
        this.f7638z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.f7638z.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f7634v = i3;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f7630C = colorStateList;
        this.f7631D = colorStateList != null;
        C0788g c0788g = this.f7629B;
        if (c0788g != null) {
            setIcon(c0788g.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.f7638z.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f7635w = z2;
    }

    public void setTextAppearance(int i3) {
        AbstractC0988i.m4394m(this.f7638z, i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7638z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7638z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7637y = true;
        C1528a c1528a = new C1528a();
        this.f7633F = c1528a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(AbstractC0146g.f516g, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(AbstractC0142c.f411j));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC0144e.f486f);
        this.f7638z = checkedTextView;
        AbstractC0268W.m775i0(checkedTextView, c1528a);
    }
}
