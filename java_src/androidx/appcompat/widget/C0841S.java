package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.AbstractC0987h;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import p091d.AbstractC1760a;
import p091d.AbstractC1769j;
import p111i.InterfaceC2024e;

/* JADX INFO: renamed from: androidx.appcompat.widget.S */
/* JADX INFO: loaded from: classes.dex */
public class C0841S implements InterfaceC2024e {

    /* JADX INFO: renamed from: G */
    private static Method f3343G;

    /* JADX INFO: renamed from: H */
    private static Method f3344H;

    /* JADX INFO: renamed from: I */
    private static Method f3345I;

    /* JADX INFO: renamed from: A */
    private Runnable f3346A;

    /* JADX INFO: renamed from: B */
    final Handler f3347B;

    /* JADX INFO: renamed from: C */
    private final Rect f3348C;

    /* JADX INFO: renamed from: D */
    private Rect f3349D;

    /* JADX INFO: renamed from: E */
    private boolean f3350E;

    /* JADX INFO: renamed from: F */
    PopupWindow f3351F;

    /* JADX INFO: renamed from: a */
    private Context f3352a;

    /* JADX INFO: renamed from: b */
    private ListAdapter f3353b;

    /* JADX INFO: renamed from: c */
    C0837N f3354c;

    /* JADX INFO: renamed from: d */
    private int f3355d;

    /* JADX INFO: renamed from: e */
    private int f3356e;

    /* JADX INFO: renamed from: f */
    private int f3357f;

    /* JADX INFO: renamed from: g */
    private int f3358g;

    /* JADX INFO: renamed from: h */
    private int f3359h;

    /* JADX INFO: renamed from: i */
    private boolean f3360i;

    /* JADX INFO: renamed from: j */
    private boolean f3361j;

    /* JADX INFO: renamed from: k */
    private boolean f3362k;

    /* JADX INFO: renamed from: l */
    private int f3363l;

    /* JADX INFO: renamed from: m */
    private boolean f3364m;

    /* JADX INFO: renamed from: n */
    private boolean f3365n;

    /* JADX INFO: renamed from: o */
    int f3366o;

    /* JADX INFO: renamed from: p */
    private View f3367p;

    /* JADX INFO: renamed from: q */
    private int f3368q;

    /* JADX INFO: renamed from: r */
    private DataSetObserver f3369r;

    /* JADX INFO: renamed from: s */
    private View f3370s;

    /* JADX INFO: renamed from: t */
    private Drawable f3371t;

    /* JADX INFO: renamed from: u */
    private AdapterView.OnItemClickListener f3372u;

    /* JADX INFO: renamed from: v */
    private AdapterView.OnItemSelectedListener f3373v;

    /* JADX INFO: renamed from: w */
    final i f3374w;

    /* JADX INFO: renamed from: x */
    private final h f3375x;

    /* JADX INFO: renamed from: y */
    private final g f3376y;

    /* JADX INFO: renamed from: z */
    private final e f3377z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM3535t = C0841S.this.m3535t();
            if (viewM3535t == null || viewM3535t.getWindowToken() == null) {
                return;
            }
            C0841S.this.mo3086e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$b */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            C0837N c0837n;
            if (i3 == -1 || (c0837n = C0841S.this.f3354c) == null) {
                return;
            }
            c0837n.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static int m3541a(PopupWindow popupWindow, View view, int i3, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i3, z2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static void m3542a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* JADX INFO: renamed from: b */
        static void m3543b(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$e */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0841S.this.m3533r();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$f */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0841S.this.mo3085c()) {
                C0841S.this.mo3086e();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0841S.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$g */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i3) {
            if (i3 != 1 || C0841S.this.m3511A() || C0841S.this.f3351F.getContentView() == null) {
                return;
            }
            C0841S c0841s = C0841S.this;
            c0841s.f3347B.removeCallbacks(c0841s.f3374w);
            C0841S.this.f3374w.run();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$h */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0841S.this.f3351F) != null && popupWindow.isShowing() && x2 >= 0 && x2 < C0841S.this.f3351F.getWidth() && y2 >= 0 && y2 < C0841S.this.f3351F.getHeight()) {
                C0841S c0841s = C0841S.this;
                c0841s.f3347B.postDelayed(c0841s.f3374w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0841S c0841s2 = C0841S.this;
            c0841s2.f3347B.removeCallbacks(c0841s2.f3374w);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$i */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0837N c0837n = C0841S.this.f3354c;
            if (c0837n == null || !c0837n.isAttachedToWindow() || C0841S.this.f3354c.getCount() <= C0841S.this.f3354c.getChildCount()) {
                return;
            }
            int childCount = C0841S.this.f3354c.getChildCount();
            C0841S c0841s = C0841S.this;
            if (childCount <= c0841s.f3366o) {
                c0841s.f3351F.setInputMethodMode(2);
                C0841S.this.mo3086e();
            }
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i3 <= 28) {
            try {
                f3343G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3345I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f3344H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0841S(Context context) {
        this(context, null, AbstractC1760a.f8688F);
    }

    /* JADX INFO: renamed from: C */
    private void m3507C() {
        View view = this.f3367p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3367p);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m3508O(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m3543b(this.f3351F, z2);
            return;
        }
        Method method = f3343G;
        if (method != null) {
            try {
                method.invoke(this.f3351F, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private int m3509q() {
        int measuredHeight;
        int i3;
        int iMakeMeasureSpec;
        View view;
        int i4;
        if (this.f3354c == null) {
            Context context = this.f3352a;
            this.f3346A = new a();
            C0837N c0837nMo3534s = mo3534s(context, !this.f3350E);
            this.f3354c = c0837nMo3534s;
            Drawable drawable = this.f3371t;
            if (drawable != null) {
                c0837nMo3534s.setSelector(drawable);
            }
            this.f3354c.setAdapter(this.f3353b);
            this.f3354c.setOnItemClickListener(this.f3372u);
            this.f3354c.setFocusable(true);
            this.f3354c.setFocusableInTouchMode(true);
            this.f3354c.setOnItemSelectedListener(new b());
            this.f3354c.setOnScrollListener(this.f3376y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3373v;
            if (onItemSelectedListener != null) {
                this.f3354c.setOnItemSelectedListener(onItemSelectedListener);
            }
            C0837N c0837n = this.f3354c;
            View view2 = this.f3367p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.f3368q;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c0837n, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f3368q);
                } else {
                    linearLayout.addView(c0837n, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.f3356e;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c0837n;
            }
            this.f3351F.setContentView(view);
        } else {
            View view3 = this.f3367p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f3351F.getBackground();
        if (background != null) {
            background.getPadding(this.f3348C);
            Rect rect = this.f3348C;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.f3360i) {
                this.f3358g = -i7;
            }
        } else {
            this.f3348C.setEmpty();
            i3 = 0;
        }
        int iM3510u = m3510u(m3535t(), this.f3358g, this.f3351F.getInputMethodMode() == 2);
        if (this.f3364m || this.f3355d == -1) {
            return iM3510u + i3;
        }
        int i8 = this.f3356e;
        if (i8 == -2) {
            int i9 = this.f3352a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f3348C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.f3352a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f3348C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo3469d = this.f3354c.mo3469d(iMakeMeasureSpec, 0, -1, iM3510u - measuredHeight, -1);
        if (iMo3469d > 0) {
            measuredHeight += i3 + this.f3354c.getPaddingTop() + this.f3354c.getPaddingBottom();
        }
        return iMo3469d + measuredHeight;
    }

    /* JADX INFO: renamed from: u */
    private int m3510u(View view, int i3, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.m3541a(this.f3351F, view, i3, z2);
        }
        Method method = f3344H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f3351F, view, Integer.valueOf(i3), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3351F.getMaxAvailableHeight(view, i3);
    }

    /* JADX INFO: renamed from: A */
    public boolean m3511A() {
        return this.f3351F.getInputMethodMode() == 2;
    }

    /* JADX INFO: renamed from: B */
    public boolean m3512B() {
        return this.f3350E;
    }

    /* JADX INFO: renamed from: D */
    public void m3513D(View view) {
        this.f3370s = view;
    }

    /* JADX INFO: renamed from: E */
    public void m3514E(int i3) {
        this.f3351F.setAnimationStyle(i3);
    }

    /* JADX INFO: renamed from: F */
    public void m3515F(int i3) {
        Drawable background = this.f3351F.getBackground();
        if (background == null) {
            m3526R(i3);
            return;
        }
        background.getPadding(this.f3348C);
        Rect rect = this.f3348C;
        this.f3356e = rect.left + rect.right + i3;
    }

    /* JADX INFO: renamed from: G */
    public void m3516G(int i3) {
        this.f3363l = i3;
    }

    /* JADX INFO: renamed from: H */
    public void m3517H(Rect rect) {
        this.f3349D = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: I */
    public void m3518I(int i3) {
        this.f3351F.setInputMethodMode(i3);
    }

    /* JADX INFO: renamed from: J */
    public void m3519J(boolean z2) {
        this.f3350E = z2;
        this.f3351F.setFocusable(z2);
    }

    /* JADX INFO: renamed from: K */
    public void m3520K(PopupWindow.OnDismissListener onDismissListener) {
        this.f3351F.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: L */
    public void m3521L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3372u = onItemClickListener;
    }

    /* JADX INFO: renamed from: M */
    public void m3522M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f3373v = onItemSelectedListener;
    }

    /* JADX INFO: renamed from: N */
    public void m3523N(boolean z2) {
        this.f3362k = true;
        this.f3361j = z2;
    }

    /* JADX INFO: renamed from: P */
    public void m3524P(int i3) {
        this.f3368q = i3;
    }

    /* JADX INFO: renamed from: Q */
    public void m3525Q(int i3) {
        C0837N c0837n = this.f3354c;
        if (!mo3085c() || c0837n == null) {
            return;
        }
        c0837n.setListSelectionHidden(false);
        c0837n.setSelection(i3);
        if (c0837n.getChoiceMode() != 0) {
            c0837n.setItemChecked(i3, true);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m3526R(int i3) {
        this.f3356e = i3;
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: c */
    public boolean mo3085c() {
        return this.f3351F.isShowing();
    }

    /* JADX INFO: renamed from: d */
    public int m3527d() {
        return this.f3357f;
    }

    @Override // p111i.InterfaceC2024e
    public void dismiss() {
        this.f3351F.dismiss();
        m3507C();
        this.f3351F.setContentView(null);
        this.f3354c = null;
        this.f3347B.removeCallbacks(this.f3374w);
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: e */
    public void mo3086e() {
        int iM3509q = m3509q();
        boolean zM3511A = m3511A();
        AbstractC0987h.m4378b(this.f3351F, this.f3359h);
        if (this.f3351F.isShowing()) {
            if (m3535t().isAttachedToWindow()) {
                int width = this.f3356e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m3535t().getWidth();
                }
                int i3 = this.f3355d;
                if (i3 == -1) {
                    if (!zM3511A) {
                        iM3509q = -1;
                    }
                    if (zM3511A) {
                        this.f3351F.setWidth(this.f3356e == -1 ? -1 : 0);
                        this.f3351F.setHeight(0);
                    } else {
                        this.f3351F.setWidth(this.f3356e == -1 ? -1 : 0);
                        this.f3351F.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    iM3509q = i3;
                }
                this.f3351F.setOutsideTouchable((this.f3365n || this.f3364m) ? false : true);
                this.f3351F.update(m3535t(), this.f3357f, this.f3358g, width < 0 ? -1 : width, iM3509q < 0 ? -1 : iM3509q);
                return;
            }
            return;
        }
        int width2 = this.f3356e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m3535t().getWidth();
        }
        int i4 = this.f3355d;
        if (i4 == -1) {
            iM3509q = -1;
        } else if (i4 != -2) {
            iM3509q = i4;
        }
        this.f3351F.setWidth(width2);
        this.f3351F.setHeight(iM3509q);
        m3508O(true);
        this.f3351F.setOutsideTouchable((this.f3365n || this.f3364m) ? false : true);
        this.f3351F.setTouchInterceptor(this.f3375x);
        if (this.f3362k) {
            AbstractC0987h.m4377a(this.f3351F, this.f3361j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3345I;
            if (method != null) {
                try {
                    method.invoke(this.f3351F, this.f3349D);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            d.m3542a(this.f3351F, this.f3349D);
        }
        AbstractC0987h.m4379c(this.f3351F, m3535t(), this.f3357f, this.f3358g, this.f3363l);
        this.f3354c.setSelection(-1);
        if (!this.f3350E || this.f3354c.isInTouchMode()) {
            m3533r();
        }
        if (this.f3350E) {
            return;
        }
        this.f3347B.post(this.f3377z);
    }

    /* JADX INFO: renamed from: f */
    public Drawable m3528f() {
        return this.f3351F.getBackground();
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: g */
    public ListView mo3088g() {
        return this.f3354c;
    }

    /* JADX INFO: renamed from: i */
    public void m3529i(Drawable drawable) {
        this.f3351F.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: j */
    public void m3530j(int i3) {
        this.f3358g = i3;
        this.f3360i = true;
    }

    /* JADX INFO: renamed from: l */
    public void m3531l(int i3) {
        this.f3357f = i3;
    }

    /* JADX INFO: renamed from: n */
    public int m3532n() {
        if (this.f3360i) {
            return this.f3358g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo3354p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3369r;
        if (dataSetObserver == null) {
            this.f3369r = new f();
        } else {
            ListAdapter listAdapter2 = this.f3353b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3353b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3369r);
        }
        C0837N c0837n = this.f3354c;
        if (c0837n != null) {
            c0837n.setAdapter(this.f3353b);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m3533r() {
        C0837N c0837n = this.f3354c;
        if (c0837n != null) {
            c0837n.setListSelectionHidden(true);
            c0837n.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    C0837N mo3534s(Context context, boolean z2) {
        return new C0837N(context, z2);
    }

    /* JADX INFO: renamed from: t */
    public View m3535t() {
        return this.f3370s;
    }

    /* JADX INFO: renamed from: v */
    public Object m3536v() {
        if (mo3085c()) {
            return this.f3354c.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public long m3537w() {
        if (mo3085c()) {
            return this.f3354c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: x */
    public int m3538x() {
        if (mo3085c()) {
            return this.f3354c.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public View m3539y() {
        if (mo3085c()) {
            return this.f3354c.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public int m3540z() {
        return this.f3356e;
    }

    public C0841S(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public C0841S(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f3355d = -2;
        this.f3356e = -2;
        this.f3359h = 1002;
        this.f3363l = 0;
        this.f3364m = false;
        this.f3365n = false;
        this.f3366o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f3368q = 0;
        this.f3374w = new i();
        this.f3375x = new h();
        this.f3376y = new g();
        this.f3377z = new e();
        this.f3348C = new Rect();
        this.f3352a = context;
        this.f3347B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1769j.f9109t1, i3, i4);
        this.f3357f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC1769j.f9114u1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC1769j.f9119v1, 0);
        this.f3358g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3360i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0913s c0913s = new C0913s(context, attributeSet, i3, i4);
        this.f3351F = c0913s;
        c0913s.setInputMethodMode(1);
    }
}
