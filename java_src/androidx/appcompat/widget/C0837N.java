package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C0985f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000A.AbstractC0000a;
import p027J.C0282e0;
import p091d.AbstractC1760a;
import p099f.AbstractC1884c;

/* JADX INFO: renamed from: androidx.appcompat.widget.N */
/* JADX INFO: loaded from: classes.dex */
class C0837N extends ListView {

    /* JADX INFO: renamed from: a */
    private final Rect f3297a;

    /* JADX INFO: renamed from: b */
    private int f3298b;

    /* JADX INFO: renamed from: c */
    private int f3299c;

    /* JADX INFO: renamed from: d */
    private int f3300d;

    /* JADX INFO: renamed from: e */
    private int f3301e;

    /* JADX INFO: renamed from: f */
    private int f3302f;

    /* JADX INFO: renamed from: g */
    private d f3303g;

    /* JADX INFO: renamed from: h */
    private boolean f3304h;

    /* JADX INFO: renamed from: i */
    private boolean f3305i;

    /* JADX INFO: renamed from: j */
    private boolean f3306j;

    /* JADX INFO: renamed from: k */
    private C0282e0 f3307k;

    /* JADX INFO: renamed from: l */
    private C0985f f3308l;

    /* JADX INFO: renamed from: m */
    f f3309m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m3471a(View view, float f3, float f4) {
            view.drawableHotspotChanged(f3, f4);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private static Method f3310a;

        /* JADX INFO: renamed from: b */
        private static Method f3311b;

        /* JADX INFO: renamed from: c */
        private static Method f3312c;

        /* JADX INFO: renamed from: d */
        private static boolean f3313d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f3310a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f3311b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f3312c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f3313d = true;
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        static boolean m3472a() {
            return f3313d;
        }

        /* JADX INFO: renamed from: b */
        static void m3473b(C0837N c0837n, int i3, View view) {
            try {
                f3310a.invoke(c0837n, Integer.valueOf(i3), view, Boolean.FALSE, -1, -1);
                f3311b.invoke(c0837n, Integer.valueOf(i3));
                f3312c.invoke(c0837n, Integer.valueOf(i3));
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static boolean m3474a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* JADX INFO: renamed from: b */
        static void m3475b(AbsListView absListView, boolean z2) {
            absListView.setSelectedChildViewEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$d */
    private static class d extends AbstractC1884c {

        /* JADX INFO: renamed from: b */
        private boolean f3314b;

        d(Drawable drawable) {
            super(drawable);
            this.f3314b = true;
        }

        /* JADX INFO: renamed from: b */
        void m3476b(boolean z2) {
            this.f3314b = z2;
        }

        @Override // p099f.AbstractC1884c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f3314b) {
                super.draw(canvas);
            }
        }

        @Override // p099f.AbstractC1884c, android.graphics.drawable.Drawable
        public void setHotspot(float f3, float f4) {
            if (this.f3314b) {
                super.setHotspot(f3, f4);
            }
        }

        @Override // p099f.AbstractC1884c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i3, int i4, int i5, int i6) {
            if (this.f3314b) {
                super.setHotspotBounds(i3, i4, i5, i6);
            }
        }

        @Override // p099f.AbstractC1884c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f3314b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p099f.AbstractC1884c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f3314b) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$e */
    static class e {

        /* JADX INFO: renamed from: a */
        private static final Field f3315a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            f3315a = declaredField;
        }

        /* JADX INFO: renamed from: a */
        static boolean m3477a(AbsListView absListView) {
            Field field = f3315a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        static void m3478b(AbsListView absListView, boolean z2) {
            Field field = f3315a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z2));
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.N$f */
    private class f implements Runnable {
        f() {
        }

        /* JADX INFO: renamed from: a */
        public void m3479a() {
            C0837N c0837n = C0837N.this;
            c0837n.f3309m = null;
            c0837n.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: b */
        public void m3480b() {
            C0837N.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0837N c0837n = C0837N.this;
            c0837n.f3309m = null;
            c0837n.drawableStateChanged();
        }
    }

    C0837N(Context context, boolean z2) {
        super(context, null, AbstractC1760a.f8683A);
        this.f3297a = new Rect();
        this.f3298b = 0;
        this.f3299c = 0;
        this.f3300d = 0;
        this.f3301e = 0;
        this.f3305i = z2;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    private void m3457a() {
        this.f3306j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3302f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0282e0 c0282e0 = this.f3307k;
        if (c0282e0 != null) {
            c0282e0.m961c();
            this.f3307k = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3458b(View view, int i3) {
        performItemClick(view, i3, getItemIdAtPosition(i3));
    }

    /* JADX INFO: renamed from: c */
    private void m3459c(Canvas canvas) {
        Drawable selector;
        if (this.f3297a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f3297a);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: f */
    private void m3460f(int i3, View view) {
        Rect rect = this.f3297a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3298b;
        rect.top -= this.f3299c;
        rect.right += this.f3300d;
        rect.bottom += this.f3301e;
        boolean zM3465k = m3465k();
        if (view.isEnabled() != zM3465k) {
            m3466l(!zM3465k);
            if (i3 != -1) {
                refreshDrawableState();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m3461g(int i3, View view) {
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i3 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m3460f(i3, view);
        if (z2) {
            Rect rect = this.f3297a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC0000a.m10k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3462h(int i3, View view, float f3, float f4) {
        m3461g(i3, view);
        Drawable selector = getSelector();
        if (selector == null || i3 == -1) {
            return;
        }
        AbstractC0000a.m10k(selector, f3, f4);
    }

    /* JADX INFO: renamed from: i */
    private void m3463i(View view, int i3, float f3, float f4) {
        View childAt;
        this.f3306j = true;
        a.m3471a(this, f3, f4);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f3302f;
        if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f3302f = i3;
        a.m3471a(view, f3 - view.getLeft(), f4 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m3462h(i3, view, f3, f4);
        m3464j(false);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: j */
    private void m3464j(boolean z2) {
        d dVar = this.f3303g;
        if (dVar != null) {
            dVar.m3476b(z2);
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m3465k() {
        return Build.VERSION.SDK_INT >= 33 ? c.m3474a(this) : e.m3477a(this);
    }

    /* JADX INFO: renamed from: l */
    private void m3466l(boolean z2) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.m3475b(this, z2);
        } else {
            e.m3478b(this, z2);
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m3467m() {
        return this.f3306j;
    }

    /* JADX INFO: renamed from: n */
    private void m3468n() {
        Drawable selector = getSelector();
        if (selector != null && m3467m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX INFO: renamed from: d */
    public int mo3469d(int i3, int i4, int i5, int i6, int i7) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i3, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i6) {
                return (i7 < 0 || i8 <= i7 || i10 <= 0 || measuredHeight == i6) ? i6 : i10;
            }
            if (i7 >= 0 && i8 >= i7) {
                i10 = measuredHeight;
            }
            i8++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m3459c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f3309m != null) {
            return;
        }
        super.drawableStateChanged();
        m3464j(true);
        m3468n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo3470e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m3463i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m3458b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m3457a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f3308l
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f3308l = r9
        L5a:
            androidx.core.widget.f r9 = r7.f3308l
            r9.m4323m(r1)
            androidx.core.widget.f r9 = r7.f3308l
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.f r8 = r7.f3308l
            if (r8 == 0) goto L6c
            r8.m4323m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0837N.mo3470e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f3305i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f3305i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f3305i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f3305i && this.f3304h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f3309m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3309m == null) {
            f fVar = new f();
            this.f3309m = fVar;
            fVar.m3480b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i3 < 30 || !b.m3472a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.m3473b(this, iPointToPosition, childAt);
                }
            }
            m3468n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3302f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f3309m;
        if (fVar != null) {
            fVar.m3479a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z2) {
        this.f3304h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f3303g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3298b = rect.left;
        this.f3299c = rect.top;
        this.f3300d = rect.right;
        this.f3301e = rect.bottom;
    }
}
