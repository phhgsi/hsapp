package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0772b;
import androidx.appcompat.view.menu.C0786e;
import p027J.AbstractC0268W;
import p027J.C0282e0;
import p091d.AbstractC1760a;
import p091d.AbstractC1765f;
import p091d.AbstractC1766g;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0879a {

    /* JADX INFO: renamed from: i */
    private CharSequence f3118i;

    /* JADX INFO: renamed from: j */
    private CharSequence f3119j;

    /* JADX INFO: renamed from: k */
    private View f3120k;

    /* JADX INFO: renamed from: l */
    private View f3121l;

    /* JADX INFO: renamed from: m */
    private View f3122m;

    /* JADX INFO: renamed from: n */
    private LinearLayout f3123n;

    /* JADX INFO: renamed from: o */
    private TextView f3124o;

    /* JADX INFO: renamed from: p */
    private TextView f3125p;

    /* JADX INFO: renamed from: q */
    private int f3126q;

    /* JADX INFO: renamed from: r */
    private int f3127r;

    /* JADX INFO: renamed from: s */
    private boolean f3128s;

    /* JADX INFO: renamed from: t */
    private int f3129t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class ViewOnClickListenerC0797a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0772b f3130a;

        ViewOnClickListenerC0797a(AbstractC0772b abstractC0772b) {
            this.f3130a = abstractC0772b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f3130a.mo2754c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m3263i() {
        if (this.f3123n == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC1766g.f8835a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3123n = linearLayout;
            this.f3124o = (TextView) linearLayout.findViewById(AbstractC1765f.f8813e);
            this.f3125p = (TextView) this.f3123n.findViewById(AbstractC1765f.f8812d);
            if (this.f3126q != 0) {
                this.f3124o.setTextAppearance(getContext(), this.f3126q);
            }
            if (this.f3127r != 0) {
                this.f3125p.setTextAppearance(getContext(), this.f3127r);
            }
        }
        this.f3124o.setText(this.f3118i);
        this.f3125p.setText(this.f3119j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3118i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3119j);
        this.f3125p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3123n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3123n.getParent() == null) {
            addView(this.f3123n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0879a
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ C0282e0 mo3264f(int i3, long j3) {
        return super.mo3264f(i3, j3);
    }

    /* JADX INFO: renamed from: g */
    public void m3265g() {
        if (this.f3120k == null) {
            m3268k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0879a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0879a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f3119j;
    }

    public CharSequence getTitle() {
        return this.f3118i;
    }

    /* JADX INFO: renamed from: h */
    public void m3266h(AbstractC0772b abstractC0772b) {
        View view = this.f3120k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3129t, (ViewGroup) this, false);
            this.f3120k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f3120k);
        }
        View viewFindViewById = this.f3120k.findViewById(AbstractC1765f.f8817i);
        this.f3121l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0797a(abstractC0772b));
        C0786e c0786e = (C0786e) abstractC0772b.mo2756e();
        ActionMenuPresenter actionMenuPresenter = this.f3613d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m3301B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f3613d = actionMenuPresenter2;
        actionMenuPresenter2.m3311M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0786e.m3150c(this.f3613d, this.f3611b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f3613d.mo3075r(this);
        this.f3612c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3612c, layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public boolean m3267j() {
        return this.f3128s;
    }

    /* JADX INFO: renamed from: k */
    public void m3268k() {
        removeAllViews();
        this.f3122m = null;
        this.f3612c = null;
        this.f3613d = null;
        View view = this.f3121l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m3269l() {
        ActionMenuPresenter actionMenuPresenter = this.f3613d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m3312N();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f3613d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m3303E();
            this.f3613d.m3304F();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0879a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        boolean zM3878b = AbstractC0910p0.m3878b(this);
        int paddingRight = zM3878b ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3120k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3120k.getLayoutParams();
            int i7 = zM3878b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = zM3878b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM3737d = AbstractC0879a.m3737d(paddingRight, i7, zM3878b);
            paddingRight = AbstractC0879a.m3737d(iM3737d + m3739e(this.f3120k, iM3737d, paddingTop, paddingTop2, zM3878b), i8, zM3878b);
        }
        int iM3739e = paddingRight;
        LinearLayout linearLayout = this.f3123n;
        if (linearLayout != null && this.f3122m == null && linearLayout.getVisibility() != 8) {
            iM3739e += m3739e(this.f3123n, iM3739e, paddingTop, paddingTop2, zM3878b);
        }
        View view2 = this.f3122m;
        if (view2 != null) {
            m3739e(view2, iM3739e, paddingTop, paddingTop2, zM3878b);
        }
        int paddingLeft = zM3878b ? getPaddingLeft() : (i5 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3612c;
        if (actionMenuView != null) {
            m3739e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM3878b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i3);
        int size2 = this.f3614e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i4);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f3120k;
        if (view != null) {
            int iM3738c = m3738c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3120k.getLayoutParams();
            paddingLeft = iM3738c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3612c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m3738c(this.f3612c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f3123n;
        if (linearLayout != null && this.f3122m == null) {
            if (this.f3128s) {
                this.f3123n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3123n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f3123n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m3738c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f3122m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                iMin = Math.min(i7, iMin);
            }
            this.f3122m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(iMin, i8));
        }
        if (this.f3614e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // androidx.appcompat.widget.AbstractC0879a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0879a
    public void setContentHeight(int i3) {
        this.f3614e = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3122m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3122m = view;
        if (view != null && (linearLayout = this.f3123n) != null) {
            removeView(linearLayout);
            this.f3123n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3119j = charSequence;
        m3263i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3118i = charSequence;
        m3263i();
        AbstractC0268W.m779k0(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f3128s) {
            requestLayout();
        }
        this.f3128s = z2;
    }

    @Override // androidx.appcompat.widget.AbstractC0879a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i3) {
        super.setVisibility(i3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8706g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, AbstractC1769j.f9132y, i3, 0);
        setBackground(c0888e0M3765v.m3772g(AbstractC1769j.f9137z));
        this.f3126q = c0888e0M3765v.m3779n(AbstractC1769j.f8891D, 0);
        this.f3127r = c0888e0M3765v.m3779n(AbstractC1769j.f8886C, 0);
        this.f3614e = c0888e0M3765v.m3778m(AbstractC1769j.f8881B, 0);
        this.f3129t = c0888e0M3765v.m3779n(AbstractC1769j.f8876A, AbstractC1766g.f8838d);
        c0888e0M3765v.m3786x();
    }
}
