package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.InterfaceC0792k;
import androidx.appcompat.widget.AbstractC0840Q;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0840Q implements C0786e.b, InterfaceC0792k {

    /* JADX INFO: renamed from: A */
    InterfaceC0815e f3200A;

    /* JADX INFO: renamed from: p */
    private C0786e f3201p;

    /* JADX INFO: renamed from: q */
    private Context f3202q;

    /* JADX INFO: renamed from: r */
    private int f3203r;

    /* JADX INFO: renamed from: s */
    private boolean f3204s;

    /* JADX INFO: renamed from: t */
    private ActionMenuPresenter f3205t;

    /* JADX INFO: renamed from: u */
    private InterfaceC0791j.a f3206u;

    /* JADX INFO: renamed from: v */
    C0786e.a f3207v;

    /* JADX INFO: renamed from: w */
    private boolean f3208w;

    /* JADX INFO: renamed from: x */
    private int f3209x;

    /* JADX INFO: renamed from: y */
    private int f3210y;

    /* JADX INFO: renamed from: z */
    private int f3211z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0811a {
        /* JADX INFO: renamed from: a */
        boolean mo3045a();

        /* JADX INFO: renamed from: b */
        boolean mo3046b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0812b implements InterfaceC0791j.a {
        C0812b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: a */
        public void mo2717a(C0786e c0786e, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j.a
        /* JADX INFO: renamed from: b */
        public boolean mo2718b(C0786e c0786e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0813c extends AbstractC0840Q.a {

        /* JADX INFO: renamed from: a */
        public boolean f3212a;

        /* JADX INFO: renamed from: b */
        public int f3213b;

        /* JADX INFO: renamed from: c */
        public int f3214c;

        /* JADX INFO: renamed from: d */
        public boolean f3215d;

        /* JADX INFO: renamed from: e */
        public boolean f3216e;

        /* JADX INFO: renamed from: f */
        boolean f3217f;

        public C0813c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0813c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0813c(C0813c c0813c) {
            super((ViewGroup.LayoutParams) c0813c);
            this.f3212a = c0813c.f3212a;
        }

        public C0813c(int i3, int i4) {
            super(i3, i4);
            this.f3212a = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0814d implements C0786e.a {
        C0814d() {
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            InterfaceC0815e interfaceC0815e = ActionMenuView.this.f3200A;
            return interfaceC0815e != null && interfaceC0815e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
            C0786e.a aVar = ActionMenuView.this.f3207v;
            if (aVar != null) {
                aVar.mo2720b(c0786e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0815e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int m3316L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.C0813c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.m3049s()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f3212a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f3215d = r1
            r0.f3213b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m3316L(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX INFO: renamed from: M */
    private void m3317M(int i3, int i4) {
        long j3;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        ?? r3;
        int i7;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f3210y;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j4 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() == 8) {
                i7 = i12;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    int i17 = this.f3211z;
                    z3 = z5;
                    r3 = 0;
                    childAt.setPadding(i17, 0, i17, 0);
                } else {
                    z3 = z5;
                    r3 = 0;
                }
                C0813c c0813c = (C0813c) childAt.getLayoutParams();
                c0813c.f3217f = r3;
                c0813c.f3214c = r3;
                c0813c.f3213b = r3;
                c0813c.f3215d = r3;
                ((LinearLayout.LayoutParams) c0813c).leftMargin = r3;
                ((LinearLayout.LayoutParams) c0813c).rightMargin = r3;
                c0813c.f3216e = z3 && ((ActionMenuItemView) childAt).m3049s();
                int iM3316L = m3316L(childAt, i12, c0813c.f3212a ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM3316L);
                i7 = i12;
                if (c0813c.f3215d) {
                    i15++;
                }
                if (c0813c.f3212a) {
                    z4 = true;
                }
                i10 -= iM3316L;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM3316L == 1) {
                    j4 |= (long) (1 << i13);
                }
            }
            i13++;
            size2 = i16;
            i12 = i7;
        }
        int i18 = size2;
        int i19 = i12;
        char c3 = 2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            long j5 = 0;
            char c4 = c3;
            int i21 = 0;
            int i22 = 0;
            j3 = 1;
            while (i22 < childCount) {
                C0813c c0813c2 = (C0813c) getChildAt(i22).getLayoutParams();
                boolean z8 = z6;
                if (c0813c2.f3215d) {
                    int i23 = c0813c2.f3213b;
                    if (i23 < i20) {
                        j5 = 1 << i22;
                        i20 = i23;
                        i21 = 1;
                    } else if (i23 == i20) {
                        j5 |= 1 << i22;
                        i21++;
                    }
                }
                i22++;
                z6 = z8;
            }
            boolean z9 = z6;
            j4 |= j5;
            if (i21 > i10) {
                break;
            }
            int i24 = i20 + 1;
            int i25 = 0;
            while (i25 < childCount) {
                View childAt2 = getChildAt(i25);
                C0813c c0813c3 = (C0813c) childAt2.getLayoutParams();
                long j6 = 1 << i25;
                if ((j5 & j6) == 0) {
                    if (c0813c3.f3213b == i24) {
                        j4 |= j6;
                    }
                    i6 = i25;
                } else {
                    if (!z9 || !c0813c3.f3216e) {
                        i6 = i25;
                        z2 = true;
                    } else if (i10 == 1) {
                        int i26 = this.f3211z;
                        z2 = true;
                        i6 = i25;
                        childAt2.setPadding(i26 + i19, 0, i26, 0);
                    } else {
                        i6 = i25;
                        z2 = true;
                    }
                    c0813c3.f3213b++;
                    c0813c3.f3217f = z2;
                    i10--;
                }
                i25 = i6 + 1;
            }
            c3 = c4;
            z6 = z9;
            z7 = true;
        }
        j3 = 1;
        boolean z10 = !z4 && i14 == 1;
        if (i10 <= 0 || j4 == 0 || (i10 >= i14 - 1 && !z10 && iMax2 <= 1)) {
            i5 = 0;
        } else {
            float fBitCount = Long.bitCount(j4);
            if (z10) {
                i5 = 0;
            } else {
                if ((j4 & j3) != 0) {
                    i5 = 0;
                    if (!((C0813c) getChildAt(0).getLayoutParams()).f3216e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i5 = 0;
                }
                int i27 = childCount - 1;
                if ((j4 & ((long) (1 << i27))) != 0 && !((C0813c) getChildAt(i27).getLayoutParams()).f3216e) {
                    fBitCount -= 0.5f;
                }
            }
            int i28 = fBitCount > 0.0f ? (int) ((i10 * i19) / fBitCount) : i5;
            boolean z11 = z7;
            for (int i29 = i5; i29 < childCount; i29++) {
                if ((j4 & ((long) (1 << i29))) != 0) {
                    View childAt3 = getChildAt(i29);
                    C0813c c0813c4 = (C0813c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0813c4.f3214c = i28;
                        c0813c4.f3217f = true;
                        if (i29 == 0 && !c0813c4.f3216e) {
                            ((LinearLayout.LayoutParams) c0813c4).leftMargin = (-i28) / 2;
                        }
                        z11 = true;
                    } else if (c0813c4.f3212a) {
                        c0813c4.f3214c = i28;
                        c0813c4.f3217f = true;
                        ((LinearLayout.LayoutParams) c0813c4).rightMargin = (-i28) / 2;
                        z11 = true;
                    } else {
                        if (i29 != 0) {
                            ((LinearLayout.LayoutParams) c0813c4).leftMargin = i28 / 2;
                        }
                        if (i29 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0813c4).rightMargin = i28 / 2;
                        }
                    }
                }
            }
            z7 = z11;
        }
        if (z7) {
            for (int i30 = i5; i30 < childCount; i30++) {
                View childAt4 = getChildAt(i30);
                C0813c c0813c5 = (C0813c) childAt4.getLayoutParams();
                if (c0813c5.f3217f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0813c5.f3213b * i19) + c0813c5.f3214c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? iMax : i18);
    }

    /* JADX INFO: renamed from: B */
    public void m3318B() {
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m3301B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0840Q
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0813c generateDefaultLayoutParams() {
        C0813c c0813c = new C0813c(-2, -2);
        ((LinearLayout.LayoutParams) c0813c).gravity = 16;
        return c0813c;
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0813c generateLayoutParams(AttributeSet attributeSet) {
        return new C0813c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0840Q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0813c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0813c c0813c = layoutParams instanceof C0813c ? new C0813c((C0813c) layoutParams) : new C0813c(layoutParams);
        if (((LinearLayout.LayoutParams) c0813c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0813c).gravity = 16;
        }
        return c0813c;
    }

    /* JADX INFO: renamed from: F */
    public C0813c m3322F() {
        C0813c c0813cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c0813cGenerateDefaultLayoutParams.f3212a = true;
        return c0813cGenerateDefaultLayoutParams;
    }

    /* JADX INFO: renamed from: G */
    protected boolean m3323G(int i3) {
        boolean zMo3045a = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0811a)) {
            zMo3045a = ((InterfaceC0811a) childAt).mo3045a();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0811a)) ? zMo3045a : ((InterfaceC0811a) childAt2).mo3046b() | zMo3045a;
    }

    /* JADX INFO: renamed from: H */
    public boolean m3324H() {
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        return actionMenuPresenter != null && actionMenuPresenter.m3303E();
    }

    /* JADX INFO: renamed from: I */
    public boolean m3325I() {
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        return actionMenuPresenter != null && actionMenuPresenter.m3305G();
    }

    /* JADX INFO: renamed from: J */
    public boolean m3326J() {
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        return actionMenuPresenter != null && actionMenuPresenter.m3306H();
    }

    /* JADX INFO: renamed from: K */
    public boolean m3327K() {
        return this.f3204s;
    }

    /* JADX INFO: renamed from: N */
    public C0786e m3328N() {
        return this.f3201p;
    }

    /* JADX INFO: renamed from: O */
    public void m3329O(InterfaceC0791j.a aVar, C0786e.a aVar2) {
        this.f3206u = aVar;
        this.f3207v = aVar2;
    }

    /* JADX INFO: renamed from: P */
    public boolean m3330P() {
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        return actionMenuPresenter != null && actionMenuPresenter.m3312N();
    }

    @Override // androidx.appcompat.view.menu.C0786e.b
    /* JADX INFO: renamed from: a */
    public boolean mo3053a(C0788g c0788g) {
        return this.f3201p.m3136O(c0788g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0792k
    /* JADX INFO: renamed from: b */
    public void mo3054b(C0786e c0786e) {
        this.f3201p = c0786e;
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0813c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f3201p == null) {
            Context context = getContext();
            C0786e c0786e = new C0786e(context);
            this.f3201p = c0786e;
            c0786e.mo3143W(new C0814d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f3205t = actionMenuPresenter;
            actionMenuPresenter.m3311M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f3205t;
            InterfaceC0791j.a c0812b = this.f3206u;
            if (c0812b == null) {
                c0812b = new C0812b();
            }
            actionMenuPresenter2.mo3071n(c0812b);
            this.f3201p.m3150c(this.f3205t, this.f3202q);
            this.f3205t.m3309K(this);
        }
        return this.f3201p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3205t.m3302D();
    }

    public int getPopupTheme() {
        return this.f3203r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f3205t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo3068i(false);
            if (this.f3205t.m3306H()) {
                this.f3205t.m3303E();
                this.f3205t.m3312N();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3318B();
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int width;
        int paddingLeft;
        if (!this.f3208w) {
            super.onLayout(z2, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i5 - i3;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zM3878b = AbstractC0910p0.m3878b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0813c c0813c = (C0813c) childAt.getLayoutParams();
                if (c0813c.f3212a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m3323G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM3878b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0813c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0813c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0813c).leftMargin) + ((LinearLayout.LayoutParams) c0813c).rightMargin;
                    m3323G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zM3878b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0813c c0813c2 = (C0813c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0813c2.f3212a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c0813c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0813c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0813c c0813c3 = (C0813c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0813c3.f3212a) {
                int i20 = paddingLeft2 + ((LinearLayout.LayoutParams) c0813c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) c0813c3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0840Q, android.view.View
    protected void onMeasure(int i3, int i4) {
        C0786e c0786e;
        boolean z2 = this.f3208w;
        boolean z3 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f3208w = z3;
        if (z2 != z3) {
            this.f3209x = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f3208w && (c0786e = this.f3201p) != null && size != this.f3209x) {
            this.f3209x = size;
            c0786e.mo3135N(true);
        }
        int childCount = getChildCount();
        if (this.f3208w && childCount > 0) {
            m3317M(i3, i4);
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            C0813c c0813c = (C0813c) getChildAt(i5).getLayoutParams();
            ((LinearLayout.LayoutParams) c0813c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0813c).leftMargin = 0;
        }
        super.onMeasure(i3, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f3205t.m3308J(z2);
    }

    public void setOnMenuItemClickListener(InterfaceC0815e interfaceC0815e) {
        this.f3200A = interfaceC0815e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f3205t.m3310L(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.f3204s = z2;
    }

    public void setPopupTheme(int i3) {
        if (this.f3203r != i3) {
            this.f3203r = i3;
            if (i3 == 0) {
                this.f3202q = getContext();
            } else {
                this.f3202q = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f3205t = actionMenuPresenter;
        actionMenuPresenter.m3309K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f3210y = (int) (56.0f * f3);
        this.f3211z = (int) (f3 * 4.0f);
        this.f3202q = context;
        this.f3203r = 0;
    }
}
