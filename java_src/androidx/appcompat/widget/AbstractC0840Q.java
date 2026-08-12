package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p027J.AbstractC0268W;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0840Q extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private boolean f3328a;

    /* JADX INFO: renamed from: b */
    private int f3329b;

    /* JADX INFO: renamed from: c */
    private int f3330c;

    /* JADX INFO: renamed from: d */
    private int f3331d;

    /* JADX INFO: renamed from: e */
    private int f3332e;

    /* JADX INFO: renamed from: f */
    private int f3333f;

    /* JADX INFO: renamed from: g */
    private float f3334g;

    /* JADX INFO: renamed from: h */
    private boolean f3335h;

    /* JADX INFO: renamed from: i */
    private int[] f3336i;

    /* JADX INFO: renamed from: j */
    private int[] f3337j;

    /* JADX INFO: renamed from: k */
    private Drawable f3338k;

    /* JADX INFO: renamed from: l */
    private int f3339l;

    /* JADX INFO: renamed from: m */
    private int f3340m;

    /* JADX INFO: renamed from: n */
    private int f3341n;

    /* JADX INFO: renamed from: o */
    private int f3342o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Q$a */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i3, int i4) {
            super(i3, i4);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public AbstractC0840Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: A */
    private void m3489A(View view, int i3, int i4, int i5, int i6) {
        view.layout(i3, i4, i5 + i3, i6 + i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3490k(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.m3499s(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.Q$a r1 = (androidx.appcompat.widget.AbstractC0840Q.a) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L37
        L36:
            r4 = r11
        L37:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3490k(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3491l(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.m3499s(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.Q$a r1 = (androidx.appcompat.widget.AbstractC0840Q.a) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L37
        L36:
            r6 = r11
        L37:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3491l(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: g */
    void m3492g(Canvas canvas) {
        int right;
        int left;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean zM3878b = AbstractC0910p0.m3878b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View viewM3499s = m3499s(i4);
            if (viewM3499s != null && viewM3499s.getVisibility() != 8 && m3500t(i4)) {
                a aVar = (a) viewM3499s.getLayoutParams();
                m3495j(canvas, zM3878b ? viewM3499s.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewM3499s.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f3339l);
            }
        }
        if (m3500t(virtualChildCount)) {
            View viewM3499s2 = m3499s(virtualChildCount - 1);
            if (viewM3499s2 != null) {
                a aVar2 = (a) viewM3499s2.getLayoutParams();
                if (zM3878b) {
                    left = viewM3499s2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i3 = this.f3339l;
                    right = left - i3;
                } else {
                    right = viewM3499s2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zM3878b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f3339l;
                right = left - i3;
            }
            m3495j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f3329b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f3329b;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3329b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f3330c;
        if (this.f3331d == 1 && (i3 = this.f3332e & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3333f) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3333f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3329b;
    }

    public Drawable getDividerDrawable() {
        return this.f3338k;
    }

    public int getDividerPadding() {
        return this.f3342o;
    }

    public int getDividerWidth() {
        return this.f3339l;
    }

    public int getGravity() {
        return this.f3332e;
    }

    public int getOrientation() {
        return this.f3331d;
    }

    public int getShowDividers() {
        return this.f3341n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3334g;
    }

    /* JADX INFO: renamed from: h */
    void m3493h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewM3499s = m3499s(i3);
            if (viewM3499s != null && viewM3499s.getVisibility() != 8 && m3500t(i3)) {
                m3494i(canvas, (viewM3499s.getTop() - ((LinearLayout.LayoutParams) ((a) viewM3499s.getLayoutParams())).topMargin) - this.f3340m);
            }
        }
        if (m3500t(virtualChildCount)) {
            View viewM3499s2 = m3499s(virtualChildCount - 1);
            m3494i(canvas, viewM3499s2 == null ? (getHeight() - getPaddingBottom()) - this.f3340m : viewM3499s2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewM3499s2.getLayoutParams())).bottomMargin);
        }
    }

    /* JADX INFO: renamed from: i */
    void m3494i(Canvas canvas, int i3) {
        this.f3338k.setBounds(getPaddingLeft() + this.f3342o, i3, (getWidth() - getPaddingRight()) - this.f3342o, this.f3340m + i3);
        this.f3338k.draw(canvas);
    }

    /* JADX INFO: renamed from: j */
    void m3495j(Canvas canvas, int i3) {
        this.f3338k.setBounds(i3, getPaddingTop() + this.f3342o, this.f3339l + i3, (getHeight() - getPaddingBottom()) - this.f3342o);
        this.f3338k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i3 = this.f3331d;
        if (i3 == 0) {
            return new a(-2, -2);
        }
        if (i3 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f3338k == null) {
            return;
        }
        if (this.f3331d == 1) {
            m3493h(canvas);
        } else {
            m3492g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        if (this.f3331d == 1) {
            m3502v(i3, i4, i5, i6);
        } else {
            m3501u(i3, i4, i5, i6);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        if (this.f3331d == 1) {
            m3506z(i3, i4);
        } else {
            m3504x(i3, i4);
        }
    }

    /* JADX INFO: renamed from: p */
    int m3496p(View view, int i3) {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    int m3497q(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: r */
    int m3498r(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: s */
    View m3499s(int i3) {
        return getChildAt(i3);
    }

    public void setBaselineAligned(boolean z2) {
        this.f3328a = z2;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f3329b = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3338k) {
            return;
        }
        this.f3338k = drawable;
        if (drawable != null) {
            this.f3339l = drawable.getIntrinsicWidth();
            this.f3340m = drawable.getIntrinsicHeight();
        } else {
            this.f3339l = 0;
            this.f3340m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f3342o = i3;
    }

    public void setGravity(int i3) {
        if (this.f3332e != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3332e = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3332e;
        if ((8388615 & i5) != i4) {
            this.f3332e = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3335h = z2;
    }

    public void setOrientation(int i3) {
        if (this.f3331d != i3) {
            this.f3331d = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f3341n) {
            requestLayout();
        }
        this.f3341n = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3332e;
        if ((i5 & 112) != i4) {
            this.f3332e = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f3334g = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    protected boolean m3500t(int i3) {
        if (i3 == 0) {
            return (this.f3341n & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f3341n & 4) != 0;
        }
        if ((this.f3341n & 2) != 0) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3501u(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3501u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3502v(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f3332e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f3333f
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f3333f
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.m3499s(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.m3505y(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.Q$a r10 = (androidx.appcompat.widget.AbstractC0840Q.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = r11.getLayoutDirection()
            int r3 = p027J.AbstractC0309s.m1053b(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.m3500t(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f3340m
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.m3497q(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.m3489A(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.m3498r(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.m3496p(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3502v(int, int, int, int):void");
    }

    /* JADX INFO: renamed from: w */
    void m3503w(View view, int i3, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3504x(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3504x(int, int):void");
    }

    /* JADX INFO: renamed from: y */
    int m3505y(int i3) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3506z(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0840Q.m3506z(int, int):void");
    }

    public AbstractC0840Q(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3328a = true;
        this.f3329b = -1;
        this.f3330c = 0;
        this.f3332e = 8388659;
        int[] iArr = AbstractC1769j.f9054i1;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context, attributeSet, iArr, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        int iM3776k = c0888e0M3765v.m3776k(AbstractC1769j.f9064k1, -1);
        if (iM3776k >= 0) {
            setOrientation(iM3776k);
        }
        int iM3776k2 = c0888e0M3765v.m3776k(AbstractC1769j.f9059j1, -1);
        if (iM3776k2 >= 0) {
            setGravity(iM3776k2);
        }
        boolean zM3766a = c0888e0M3765v.m3766a(AbstractC1769j.f9069l1, true);
        if (!zM3766a) {
            setBaselineAligned(zM3766a);
        }
        this.f3334g = c0888e0M3765v.m3774i(AbstractC1769j.f9079n1, -1.0f);
        this.f3329b = c0888e0M3765v.m3776k(AbstractC1769j.f9074m1, -1);
        this.f3335h = c0888e0M3765v.m3766a(AbstractC1769j.f9094q1, false);
        setDividerDrawable(c0888e0M3765v.m3772g(AbstractC1769j.f9084o1));
        this.f3341n = c0888e0M3765v.m3776k(AbstractC1769j.f9099r1, 0);
        this.f3342o = c0888e0M3765v.m3771f(AbstractC1769j.f9089p1, 0);
        c0888e0M3765v.m3786x();
    }
}
