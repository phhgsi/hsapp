package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import p091d.AbstractC1765f;
import p091d.AbstractC1769j;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private boolean f3108a;

    /* JADX INFO: renamed from: b */
    private View f3109b;

    /* JADX INFO: renamed from: c */
    private View f3110c;

    /* JADX INFO: renamed from: d */
    private View f3111d;

    /* JADX INFO: renamed from: e */
    Drawable f3112e;

    /* JADX INFO: renamed from: f */
    Drawable f3113f;

    /* JADX INFO: renamed from: g */
    Drawable f3114g;

    /* JADX INFO: renamed from: h */
    boolean f3115h;

    /* JADX INFO: renamed from: i */
    boolean f3116i;

    /* JADX INFO: renamed from: j */
    private int f3117j;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C0796a {
        /* JADX INFO: renamed from: a */
        public static void m3262a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0881b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9006a);
        this.f3112e = typedArrayObtainStyledAttributes.getDrawable(AbstractC1769j.f9012b);
        this.f3113f = typedArrayObtainStyledAttributes.getDrawable(AbstractC1769j.f9024d);
        this.f3117j = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC1769j.f9057j, -1);
        boolean z2 = true;
        if (getId() == AbstractC1765f.f8800H) {
            this.f3115h = true;
            this.f3114g = typedArrayObtainStyledAttributes.getDrawable(AbstractC1769j.f9018c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3115h ? this.f3112e != null || this.f3113f != null : this.f3114g != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    /* JADX INFO: renamed from: a */
    private int m3260a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    private boolean m3261b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3112e;
        if (drawable != null && drawable.isStateful()) {
            this.f3112e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3113f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3113f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3114g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3114g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f3109b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3112e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3113f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3114g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3110c = findViewById(AbstractC1765f.f8809a);
        this.f3111d = findViewById(AbstractC1765f.f8814f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3108a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
  0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            android.view.View r8 = r6.f3109b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f3115h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f3114g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f3112e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f3110c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f3112e
            android.view.View r9 = r6.f3110c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f3110c
            int r10 = r10.getTop()
            android.view.View r1 = r6.f3110c
            int r1 = r1.getRight()
            android.view.View r3 = r6.f3110c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f3111d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f3112e
            android.view.View r9 = r6.f3111d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f3111d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f3111d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f3111d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f3112e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f3116i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f3113f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        if (this.f3110c == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f3117j) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f3110c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        View view = this.f3109b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m3261b(this.f3110c) ? m3260a(this.f3110c) : !m3261b(this.f3111d) ? m3260a(this.f3111d) : 0) + m3260a(this.f3109b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i4) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3112e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3112e);
        }
        this.f3112e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3110c;
            if (view != null) {
                this.f3112e.setBounds(view.getLeft(), this.f3110c.getTop(), this.f3110c.getRight(), this.f3110c.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f3115h ? !(this.f3112e != null || this.f3113f != null) : this.f3114g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        C0796a.m3262a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3114g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3114g);
        }
        this.f3114g = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3115h && (drawable2 = this.f3114g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f3115h ? !(this.f3112e != null || this.f3113f != null) : this.f3114g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        C0796a.m3262a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3113f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3113f);
        }
        this.f3113f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3116i && (drawable2 = this.f3113f) != null) {
                drawable2.setBounds(this.f3109b.getLeft(), this.f3109b.getTop(), this.f3109b.getRight(), this.f3109b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f3115h ? !(this.f3112e != null || this.f3113f != null) : this.f3114g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        C0796a.m3262a(this);
    }

    public void setTabContainer(AbstractC0877Y abstractC0877Y) {
        View view = this.f3109b;
        if (view != null) {
            removeView(view);
        }
        this.f3109b = abstractC0877Y;
    }

    public void setTransitioning(boolean z2) {
        this.f3108a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f3112e;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f3113f;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f3114g;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f3112e && !this.f3115h) {
            return true;
        }
        if (drawable == this.f3113f && this.f3116i) {
            return true;
        }
        return (drawable == this.f3114g && this.f3115h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
