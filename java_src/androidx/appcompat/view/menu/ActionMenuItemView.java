package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.widget.AbstractC0898j0;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0824B;
import p091d.AbstractC1769j;
import p111i.InterfaceC2024e;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0824B implements InterfaceC0792k.a, View.OnClickListener, ActionMenuView.InterfaceC0811a {

    /* JADX INFO: renamed from: h */
    C0788g f2888h;

    /* JADX INFO: renamed from: i */
    private CharSequence f2889i;

    /* JADX INFO: renamed from: j */
    private Drawable f2890j;

    /* JADX INFO: renamed from: k */
    C0786e.b f2891k;

    /* JADX INFO: renamed from: l */
    private AbstractViewOnTouchListenerC0839P f2892l;

    /* JADX INFO: renamed from: m */
    AbstractC0781b f2893m;

    /* JADX INFO: renamed from: n */
    private boolean f2894n;

    /* JADX INFO: renamed from: o */
    private boolean f2895o;

    /* JADX INFO: renamed from: p */
    private int f2896p;

    /* JADX INFO: renamed from: q */
    private int f2897q;

    /* JADX INFO: renamed from: r */
    private int f2898r;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0780a extends AbstractViewOnTouchListenerC0839P {
        public C0780a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
        /* JADX INFO: renamed from: b */
        public InterfaceC2024e mo3050b() {
            AbstractC0781b abstractC0781b = ActionMenuItemView.this.f2893m;
            if (abstractC0781b != null) {
                return abstractC0781b.mo3052a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P
        /* JADX INFO: renamed from: c */
        protected boolean mo3051c() {
            InterfaceC2024e interfaceC2024eMo3050b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0786e.b bVar = actionMenuItemView.f2891k;
            return bVar != null && bVar.mo3053a(actionMenuItemView.f2888h) && (interfaceC2024eMo3050b = mo3050b()) != null && interfaceC2024eMo3050b.mo3085c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0781b {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC2024e mo3052a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: t */
    private boolean m3043t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    private void m3044u() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f2889i);
        if (this.f2890j != null && (!this.f2888h.m3179B() || (!this.f2894n && !this.f2895o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f2889i : null);
        CharSequence contentDescription = this.f2888h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z4 ? null : this.f2888h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2888h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            AbstractC0898j0.m3829a(this, z4 ? null : this.f2888h.getTitle());
        } else {
            AbstractC0898j0.m3829a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0811a
    /* JADX INFO: renamed from: a */
    public boolean mo3045a() {
        return m3049s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0811a
    /* JADX INFO: renamed from: b */
    public boolean mo3046b() {
        return m3049s() && this.f2888h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: d */
    public boolean mo3047d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    /* JADX INFO: renamed from: e */
    public void mo3048e(C0788g c0788g, int i3) {
        this.f2888h = c0788g;
        setIcon(c0788g.getIcon());
        setTitle(c0788g.m3184i(this));
        setId(c0788g.getItemId());
        setVisibility(c0788g.isVisible() ? 0 : 8);
        setEnabled(c0788g.isEnabled());
        if (c0788g.hasSubMenu() && this.f2892l == null) {
            this.f2892l = new C0780a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k.a
    public C0788g getItemData() {
        return this.f2888h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0786e.b bVar = this.f2891k;
        if (bVar != null) {
            bVar.mo3053a(this.f2888h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2894n = m3043t();
        m3044u();
    }

    @Override // androidx.appcompat.widget.C0824B, android.widget.TextView, android.view.View
    protected void onMeasure(int i3, int i4) {
        int i5;
        boolean zM3049s = m3049s();
        if (zM3049s && (i5 = this.f2897q) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2896p) : this.f2896p;
        if (mode != 1073741824 && this.f2896p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i4);
        }
        if (zM3049s || this.f2890j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2890j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0839P abstractViewOnTouchListenerC0839P;
        if (this.f2888h.hasSubMenu() && (abstractViewOnTouchListenerC0839P = this.f2892l) != null && abstractViewOnTouchListenerC0839P.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public boolean m3049s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f2895o != z2) {
            this.f2895o = z2;
            C0788g c0788g = this.f2888h;
            if (c0788g != null) {
                c0788g.m3180c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2890j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f2898r;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3044u();
    }

    public void setItemInvoker(C0786e.b bVar) {
        this.f2891k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i3, int i4, int i5, int i6) {
        this.f2897q = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC0781b abstractC0781b) {
        this.f2893m = abstractC0781b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2889i = charSequence;
        m3044u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Resources resources = context.getResources();
        this.f2894n = m3043t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9117v, i3, 0);
        this.f2896p = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1769j.f9122w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2898r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2897q = -1;
        setSaveEnabled(false);
    }
}
