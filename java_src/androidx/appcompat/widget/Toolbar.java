package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0745a;
import androidx.appcompat.view.C0777g;
import androidx.appcompat.view.InterfaceC0773c;
import androidx.appcompat.view.menu.C0786e;
import androidx.appcompat.view.menu.C0788g;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.view.menu.SubMenuC0794m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p027J.AbstractC0268W;
import p027J.AbstractC0309s;
import p027J.C0317w;
import p027J.InterfaceC0315v;
import p027J.InterfaceC0321y;
import p091d.AbstractC1760a;
import p091d.AbstractC1769j;
import p095e.AbstractC1832a;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0315v {

    /* JADX INFO: renamed from: A */
    private ColorStateList f3506A;

    /* JADX INFO: renamed from: B */
    private boolean f3507B;

    /* JADX INFO: renamed from: C */
    private boolean f3508C;

    /* JADX INFO: renamed from: D */
    private final ArrayList f3509D;

    /* JADX INFO: renamed from: E */
    private final ArrayList f3510E;

    /* JADX INFO: renamed from: F */
    private final int[] f3511F;

    /* JADX INFO: renamed from: G */
    final C0317w f3512G;

    /* JADX INFO: renamed from: H */
    private ArrayList f3513H;

    /* JADX INFO: renamed from: I */
    InterfaceC0871h f3514I;

    /* JADX INFO: renamed from: J */
    private final ActionMenuView.InterfaceC0815e f3515J;

    /* JADX INFO: renamed from: K */
    private C0896i0 f3516K;

    /* JADX INFO: renamed from: L */
    private ActionMenuPresenter f3517L;

    /* JADX INFO: renamed from: M */
    private C0869f f3518M;

    /* JADX INFO: renamed from: N */
    private InterfaceC0791j.a f3519N;

    /* JADX INFO: renamed from: O */
    C0786e.a f3520O;

    /* JADX INFO: renamed from: P */
    private boolean f3521P;

    /* JADX INFO: renamed from: Q */
    private OnBackInvokedCallback f3522Q;

    /* JADX INFO: renamed from: R */
    private OnBackInvokedDispatcher f3523R;

    /* JADX INFO: renamed from: S */
    private boolean f3524S;

    /* JADX INFO: renamed from: T */
    private final Runnable f3525T;

    /* JADX INFO: renamed from: a */
    ActionMenuView f3526a;

    /* JADX INFO: renamed from: b */
    private TextView f3527b;

    /* JADX INFO: renamed from: c */
    private TextView f3528c;

    /* JADX INFO: renamed from: d */
    private ImageButton f3529d;

    /* JADX INFO: renamed from: e */
    private ImageView f3530e;

    /* JADX INFO: renamed from: f */
    private Drawable f3531f;

    /* JADX INFO: renamed from: g */
    private CharSequence f3532g;

    /* JADX INFO: renamed from: h */
    ImageButton f3533h;

    /* JADX INFO: renamed from: i */
    View f3534i;

    /* JADX INFO: renamed from: j */
    private Context f3535j;

    /* JADX INFO: renamed from: k */
    private int f3536k;

    /* JADX INFO: renamed from: l */
    private int f3537l;

    /* JADX INFO: renamed from: m */
    private int f3538m;

    /* JADX INFO: renamed from: n */
    int f3539n;

    /* JADX INFO: renamed from: o */
    private int f3540o;

    /* JADX INFO: renamed from: p */
    private int f3541p;

    /* JADX INFO: renamed from: q */
    private int f3542q;

    /* JADX INFO: renamed from: r */
    private int f3543r;

    /* JADX INFO: renamed from: s */
    private int f3544s;

    /* JADX INFO: renamed from: t */
    private C0876X f3545t;

    /* JADX INFO: renamed from: u */
    private int f3546u;

    /* JADX INFO: renamed from: v */
    private int f3547v;

    /* JADX INFO: renamed from: w */
    private int f3548w;

    /* JADX INFO: renamed from: x */
    private CharSequence f3549x;

    /* JADX INFO: renamed from: y */
    private CharSequence f3550y;

    /* JADX INFO: renamed from: z */
    private ColorStateList f3551z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0864a implements ActionMenuView.InterfaceC0815e {
        C0864a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0815e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f3512G.m1071d(menuItem)) {
                return true;
            }
            InterfaceC0871h interfaceC0871h = Toolbar.this.f3514I;
            if (interfaceC0871h != null) {
                return interfaceC0871h.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    class RunnableC0865b implements Runnable {
        RunnableC0865b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m3647S();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0866c implements C0786e.a {
        C0866c() {
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: a */
        public boolean mo2719a(C0786e c0786e, MenuItem menuItem) {
            C0786e.a aVar = Toolbar.this.f3520O;
            return aVar != null && aVar.mo2719a(c0786e, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0786e.a
        /* JADX INFO: renamed from: b */
        public void mo2720b(C0786e c0786e) {
            if (!Toolbar.this.f3526a.m3326J()) {
                Toolbar.this.f3512G.m1072e(c0786e);
            }
            C0786e.a aVar = Toolbar.this.f3520O;
            if (aVar != null) {
                aVar.mo2720b(c0786e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    class ViewOnClickListenerC0867d implements View.OnClickListener {
        ViewOnClickListenerC0867d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m3651e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    static class C0868e {
        /* JADX INFO: renamed from: a */
        static OnBackInvokedDispatcher m3663a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        static OnBackInvokedCallback m3664b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0894h0(runnable);
        }

        /* JADX INFO: renamed from: c */
        static void m3665c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        static void m3666d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    private class C0869f implements InterfaceC0791j {

        /* JADX INFO: renamed from: a */
        C0786e f3558a;

        /* JADX INFO: renamed from: b */
        C0788g f3559b;

        C0869f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: a */
        public void mo3061a(C0786e c0786e, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: b */
        public int mo3062b() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: d */
        public void mo3064d(Context context, C0786e c0786e) {
            C0788g c0788g;
            C0786e c0786e2 = this.f3558a;
            if (c0786e2 != null && (c0788g = this.f3559b) != null) {
                c0786e2.mo3156f(c0788g);
            }
            this.f3558a = c0786e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: f */
        public void mo3087f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: h */
        public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: i */
        public void mo3068i(boolean z2) {
            if (this.f3559b != null) {
                C0786e c0786e = this.f3558a;
                if (c0786e != null) {
                    int size = c0786e.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (this.f3558a.getItem(i3) == this.f3559b) {
                            return;
                        }
                    }
                }
                mo3069l(this.f3558a, this.f3559b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: j */
        public boolean mo3089j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: k */
        public Parcelable mo3090k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: l */
        public boolean mo3069l(C0786e c0786e, C0788g c0788g) {
            KeyEvent.Callback callback = Toolbar.this.f3534i;
            if (callback instanceof InterfaceC0773c) {
                ((InterfaceC0773c) callback).mo3008f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3534i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3533h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3534i = null;
            toolbar3.m3649a();
            this.f3559b = null;
            Toolbar.this.requestLayout();
            c0788g.m3193r(false);
            Toolbar.this.m3648T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0791j
        /* JADX INFO: renamed from: m */
        public boolean mo3070m(C0786e c0786e, C0788g c0788g) {
            Toolbar.this.m3653g();
            ViewParent parent = Toolbar.this.f3533h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3533h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3533h);
            }
            Toolbar.this.f3534i = c0788g.getActionView();
            this.f3559b = c0788g;
            ViewParent parent2 = Toolbar.this.f3534i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f3534i);
                }
                C0870g c0870gGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0870gGenerateDefaultLayoutParams.f2659a = (toolbar4.f3539n & 112) | 8388611;
                c0870gGenerateDefaultLayoutParams.f3561b = 2;
                toolbar4.f3534i.setLayoutParams(c0870gGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3534i);
            }
            Toolbar.this.m3641K();
            Toolbar.this.requestLayout();
            c0788g.m3193r(true);
            KeyEvent.Callback callback = Toolbar.this.f3534i;
            if (callback instanceof InterfaceC0773c) {
                ((InterfaceC0773c) callback).mo3007c();
            }
            Toolbar.this.m3648T();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC0871h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1760a.f8699Q);
    }

    /* JADX INFO: renamed from: B */
    private boolean m3616B(View view) {
        return view.getParent() == this || this.f3510E.contains(view);
    }

    /* JADX INFO: renamed from: E */
    private int m3617E(View view, int i3, int[] iArr, int i4) {
        C0870g c0870g = (C0870g) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c0870g).leftMargin - iArr[0];
        int iMax = i3 + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        int iM3633s = m3633s(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM3633s, iMax + measuredWidth, view.getMeasuredHeight() + iM3633s);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c0870g).rightMargin;
    }

    /* JADX INFO: renamed from: F */
    private int m3618F(View view, int i3, int[] iArr, int i4) {
        C0870g c0870g = (C0870g) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) c0870g).rightMargin - iArr[1];
        int iMax = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int iM3633s = m3633s(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM3633s, iMax, view.getMeasuredHeight() + iM3633s);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0870g).leftMargin);
    }

    /* JADX INFO: renamed from: G */
    private int m3619G(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + iMax + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: H */
    private void m3620H(View view, int i3, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: I */
    private void m3621I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f3512G.m1069b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3513H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: J */
    private void m3622J() {
        removeCallbacks(this.f3525T);
        post(this.f3525T);
    }

    /* JADX INFO: renamed from: Q */
    private boolean m3623Q() {
        if (!this.f3521P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (m3624R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    private boolean m3624R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private void m3625b(List list, int i3) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM1053b = AbstractC0309s.m1053b(i3, getLayoutDirection());
        list.clear();
        if (!z2) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0870g c0870g = (C0870g) childAt.getLayoutParams();
                if (c0870g.f3561b == 0 && m3624R(childAt) && m3632r(c0870g.f2659a) == iM1053b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            C0870g c0870g2 = (C0870g) childAt2.getLayoutParams();
            if (c0870g2.f3561b == 0 && m3624R(childAt2) && m3632r(c0870g2.f2659a) == iM1053b) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3626c(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0870g c0870gGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0870g) layoutParams;
        c0870gGenerateDefaultLayoutParams.f3561b = 1;
        if (!z2 || this.f3534i == null) {
            addView(view, c0870gGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c0870gGenerateDefaultLayoutParams);
            this.f3510E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0777g(getContext());
    }

    /* JADX INFO: renamed from: h */
    private void m3627h() {
        if (this.f3545t == null) {
            this.f3545t = new C0876X();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m3628i() {
        if (this.f3530e == null) {
            this.f3530e = new C0911q(getContext());
        }
    }

    /* JADX INFO: renamed from: j */
    private void m3629j() {
        m3630l();
        if (this.f3526a.m3328N() == null) {
            C0786e c0786e = (C0786e) this.f3526a.getMenu();
            if (this.f3518M == null) {
                this.f3518M = new C0869f();
            }
            this.f3526a.setExpandedActionViewsExclusive(true);
            c0786e.m3150c(this.f3518M, this.f3535j);
            m3648T();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m3630l() {
        if (this.f3526a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3526a = actionMenuView;
            actionMenuView.setPopupTheme(this.f3536k);
            this.f3526a.setOnMenuItemClickListener(this.f3515J);
            this.f3526a.m3329O(this.f3519N, new C0866c());
            C0870g c0870gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0870gGenerateDefaultLayoutParams.f2659a = (this.f3539n & 112) | 8388613;
            this.f3526a.setLayoutParams(c0870gGenerateDefaultLayoutParams);
            m3626c(this.f3526a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m3631m() {
        if (this.f3529d == null) {
            this.f3529d = new C0907o(getContext(), null, AbstractC1760a.f8698P);
            C0870g c0870gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0870gGenerateDefaultLayoutParams.f2659a = (this.f3539n & 112) | 8388611;
            this.f3529d.setLayoutParams(c0870gGenerateDefaultLayoutParams);
        }
    }

    /* JADX INFO: renamed from: r */
    private int m3632r(int i3) {
        int layoutDirection = getLayoutDirection();
        int iM1053b = AbstractC0309s.m1053b(i3, layoutDirection) & 7;
        return (iM1053b == 1 || iM1053b == 3 || iM1053b == 5) ? iM1053b : layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: s */
    private int m3633s(View view, int i3) {
        C0870g c0870g = (C0870g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int iM3634t = m3634t(c0870g.f2659a);
        if (iM3634t == 48) {
            return getPaddingTop() - i4;
        }
        if (iM3634t == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0870g).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c0870g).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c0870g).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: t */
    private int m3634t(int i3) {
        int i4 = i3 & 112;
        return (i4 == 16 || i4 == 48 || i4 == 80) ? i4 : this.f3548w & 112;
    }

    /* JADX INFO: renamed from: u */
    private int m3635u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: v */
    private int m3636v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: w */
    private int m3637w(List list, int[] iArr) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int size = list.size();
        int i5 = 0;
        int measuredWidth = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            C0870g c0870g = (C0870g) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) c0870g).leftMargin - i3;
            int i7 = ((ViewGroup.MarginLayoutParams) c0870g).rightMargin - i4;
            int iMax = Math.max(0, i6);
            int iMax2 = Math.max(0, i7);
            int iMax3 = Math.max(0, -i6);
            int iMax4 = Math.max(0, -i7);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i5++;
            i4 = iMax4;
            i3 = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: A */
    public void m3638A() {
        ArrayList arrayList = this.f3513H;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        m3621I();
    }

    /* JADX INFO: renamed from: C */
    public boolean m3639C() {
        ActionMenuView actionMenuView = this.f3526a;
        return actionMenuView != null && actionMenuView.m3325I();
    }

    /* JADX INFO: renamed from: D */
    public boolean m3640D() {
        ActionMenuView actionMenuView = this.f3526a;
        return actionMenuView != null && actionMenuView.m3326J();
    }

    /* JADX INFO: renamed from: K */
    void m3641K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0870g) childAt.getLayoutParams()).f3561b != 2 && childAt != this.f3526a) {
                removeViewAt(childCount);
                this.f3510E.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m3642L(int i3, int i4) {
        m3627h();
        this.f3545t.m3716g(i3, i4);
    }

    /* JADX INFO: renamed from: M */
    public void m3643M(C0786e c0786e, ActionMenuPresenter actionMenuPresenter) {
        if (c0786e == null && this.f3526a == null) {
            return;
        }
        m3630l();
        C0786e c0786eM3328N = this.f3526a.m3328N();
        if (c0786eM3328N == c0786e) {
            return;
        }
        if (c0786eM3328N != null) {
            c0786eM3328N.m3138R(this.f3517L);
            c0786eM3328N.m3138R(this.f3518M);
        }
        if (this.f3518M == null) {
            this.f3518M = new C0869f();
        }
        actionMenuPresenter.m3308J(true);
        if (c0786e != null) {
            c0786e.m3150c(actionMenuPresenter, this.f3535j);
            c0786e.m3150c(this.f3518M, this.f3535j);
        } else {
            actionMenuPresenter.mo3064d(this.f3535j, null);
            this.f3518M.mo3064d(this.f3535j, null);
            actionMenuPresenter.mo3068i(true);
            this.f3518M.mo3068i(true);
        }
        this.f3526a.setPopupTheme(this.f3536k);
        this.f3526a.setPresenter(actionMenuPresenter);
        this.f3517L = actionMenuPresenter;
        m3648T();
    }

    /* JADX INFO: renamed from: N */
    public void m3644N(InterfaceC0791j.a aVar, C0786e.a aVar2) {
        this.f3519N = aVar;
        this.f3520O = aVar2;
        ActionMenuView actionMenuView = this.f3526a;
        if (actionMenuView != null) {
            actionMenuView.m3329O(aVar, aVar2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m3645O(Context context, int i3) {
        this.f3538m = i3;
        TextView textView = this.f3528c;
        if (textView != null) {
            textView.setTextAppearance(context, i3);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m3646P(Context context, int i3) {
        this.f3537l = i3;
        TextView textView = this.f3527b;
        if (textView != null) {
            textView.setTextAppearance(context, i3);
        }
    }

    /* JADX INFO: renamed from: S */
    public boolean m3647S() {
        ActionMenuView actionMenuView = this.f3526a;
        return actionMenuView != null && actionMenuView.m3330P();
    }

    /* JADX INFO: renamed from: T */
    void m3648T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM3663a = C0868e.m3663a(this);
            boolean z2 = m3657x() && onBackInvokedDispatcherM3663a != null && isAttachedToWindow() && this.f3524S;
            if (z2 && this.f3523R == null) {
                if (this.f3522Q == null) {
                    this.f3522Q = C0868e.m3664b(new Runnable() { // from class: androidx.appcompat.widget.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3661d.m3651e();
                        }
                    });
                }
                C0868e.m3665c(onBackInvokedDispatcherM3663a, this.f3522Q);
                this.f3523R = onBackInvokedDispatcherM3663a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f3523R) == null) {
                return;
            }
            C0868e.m3666d(onBackInvokedDispatcher, this.f3522Q);
            this.f3523R = null;
        }
    }

    /* JADX INFO: renamed from: a */
    void m3649a() {
        for (int size = this.f3510E.size() - 1; size >= 0; size--) {
            addView((View) this.f3510E.get(size));
        }
        this.f3510E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0870g);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3650d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f3526a) != null && actionMenuView.m3327K();
    }

    /* JADX INFO: renamed from: e */
    public void m3651e() {
        C0869f c0869f = this.f3518M;
        C0788g c0788g = c0869f == null ? null : c0869f.f3559b;
        if (c0788g != null) {
            c0788g.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3652f() {
        ActionMenuView actionMenuView = this.f3526a;
        if (actionMenuView != null) {
            actionMenuView.m3318B();
        }
    }

    /* JADX INFO: renamed from: g */
    void m3653g() {
        if (this.f3533h == null) {
            C0907o c0907o = new C0907o(getContext(), null, AbstractC1760a.f8698P);
            this.f3533h = c0907o;
            c0907o.setImageDrawable(this.f3531f);
            this.f3533h.setContentDescription(this.f3532g);
            C0870g c0870gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0870gGenerateDefaultLayoutParams.f2659a = (this.f3539n & 112) | 8388611;
            c0870gGenerateDefaultLayoutParams.f3561b = 2;
            this.f3533h.setLayoutParams(c0870gGenerateDefaultLayoutParams);
            this.f3533h.setOnClickListener(new ViewOnClickListenerC0867d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f3533h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f3533h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0876X c0876x = this.f3545t;
        if (c0876x != null) {
            return c0876x.m3710a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f3547v;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0876X c0876x = this.f3545t;
        if (c0876x != null) {
            return c0876x.m3711b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0876X c0876x = this.f3545t;
        if (c0876x != null) {
            return c0876x.m3712c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0876X c0876x = this.f3545t;
        if (c0876x != null) {
            return c0876x.m3713d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f3546u;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0786e c0786eM3328N;
        ActionMenuView actionMenuView = this.f3526a;
        return (actionMenuView == null || (c0786eM3328N = actionMenuView.m3328N()) == null || !c0786eM3328N.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3547v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3546u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3530e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3530e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m3629j();
        return this.f3526a.getMenu();
    }

    View getNavButtonView() {
        return this.f3529d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3529d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3529d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3517L;
    }

    public Drawable getOverflowIcon() {
        m3629j();
        return this.f3526a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f3535j;
    }

    public int getPopupTheme() {
        return this.f3536k;
    }

    public CharSequence getSubtitle() {
        return this.f3550y;
    }

    final TextView getSubtitleTextView() {
        return this.f3528c;
    }

    public CharSequence getTitle() {
        return this.f3549x;
    }

    public int getTitleMarginBottom() {
        return this.f3544s;
    }

    public int getTitleMarginEnd() {
        return this.f3542q;
    }

    public int getTitleMarginStart() {
        return this.f3541p;
    }

    public int getTitleMarginTop() {
        return this.f3543r;
    }

    final TextView getTitleTextView() {
        return this.f3527b;
    }

    public InterfaceC0831H getWrapper() {
        if (this.f3516K == null) {
            this.f3516K = new C0896i0(this, true);
        }
        return this.f3516K;
    }

    @Override // p027J.InterfaceC0315v
    /* JADX INFO: renamed from: k */
    public void mo1065k(InterfaceC0321y interfaceC0321y) {
        this.f3512G.m1073f(interfaceC0321y);
    }

    @Override // p027J.InterfaceC0315v
    /* JADX INFO: renamed from: n */
    public void mo1066n(InterfaceC0321y interfaceC0321y) {
        this.f3512G.m1068a(interfaceC0321y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0870g generateDefaultLayoutParams() {
        return new C0870g(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3648T();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3525T);
        m3648T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3508C = false;
        }
        if (!this.f3508C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3508C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3508C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i3, int i4) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f3511F;
        boolean zM3878b = AbstractC0910p0.m3878b(this);
        int i5 = !zM3878b ? 1 : 0;
        if (m3624R(this.f3529d)) {
            m3620H(this.f3529d, i3, 0, i4, 0, this.f3540o);
            measuredWidth = this.f3529d.getMeasuredWidth() + m3635u(this.f3529d);
            iMax = Math.max(0, this.f3529d.getMeasuredHeight() + m3636v(this.f3529d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3529d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m3624R(this.f3533h)) {
            m3620H(this.f3533h, i3, 0, i4, 0, this.f3540o);
            measuredWidth = this.f3533h.getMeasuredWidth() + m3635u(this.f3533h);
            iMax = Math.max(iMax, this.f3533h.getMeasuredHeight() + m3636v(this.f3533h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3533h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zM3878b ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m3624R(this.f3526a)) {
            m3620H(this.f3526a, i3, iMax3, i4, 0, this.f3540o);
            measuredWidth2 = this.f3526a.getMeasuredWidth() + m3635u(this.f3526a);
            iMax = Math.max(iMax, this.f3526a.getMeasuredHeight() + m3636v(this.f3526a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3526a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i5] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m3624R(this.f3534i)) {
            iArr = iArr2;
            iMax4 += m3619G(this.f3534i, i3, iMax4, i4, 0, iArr);
            iMax = Math.max(iMax, this.f3534i.getMeasuredHeight() + m3636v(this.f3534i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3534i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (m3624R(this.f3530e)) {
            iMax4 += m3619G(this.f3530e, i3, iMax4, i4, 0, iArr);
            iMax = Math.max(iMax, this.f3530e.getMeasuredHeight() + m3636v(this.f3530e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3530e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((C0870g) childAt.getLayoutParams()).f3561b == 0 && m3624R(childAt)) {
                iMax4 += m3619G(childAt, i3, iMax4, i4, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + m3636v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i7 = iMax4;
        int i8 = this.f3543r + this.f3544s;
        int i9 = this.f3541p + this.f3542q;
        if (m3624R(this.f3527b)) {
            m3619G(this.f3527b, i3, i7 + i9, i4, i8, iArr);
            int measuredWidth3 = this.f3527b.getMeasuredWidth() + m3635u(this.f3527b);
            int measuredHeight2 = this.f3527b.getMeasuredHeight() + m3636v(this.f3527b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3527b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (m3624R(this.f3528c)) {
            iMax2 = Math.max(iMax2, m3619G(this.f3528c, i3, i7 + i9, i4, i8 + measuredHeight, iArr));
            measuredHeight += this.f3528c.getMeasuredHeight() + m3636v(this.f3528c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3528c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates2), m3623Q() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m4418a());
        ActionMenuView actionMenuView = this.f3526a;
        C0786e c0786eM3328N = actionMenuView != null ? actionMenuView.m3328N() : null;
        int i3 = savedState.f3552f;
        if (i3 != 0 && this.f3518M != null && c0786eM3328N != null && (menuItemFindItem = c0786eM3328N.findItem(i3)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f3553g) {
            m3622J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        m3627h();
        this.f3545t.m3715f(i3 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0788g c0788g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0869f c0869f = this.f3518M;
        if (c0869f != null && (c0788g = c0869f.f3559b) != null) {
            savedState.f3552f = c0788g.getItemId();
        }
        savedState.f3553g = m3640D();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3507B = false;
        }
        if (!this.f3507B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3507B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3507B = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0870g generateLayoutParams(AttributeSet attributeSet) {
        return new C0870g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0870g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0870g ? new C0870g((C0870g) layoutParams) : layoutParams instanceof AbstractC0745a.a ? new C0870g((AbstractC0745a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0870g((ViewGroup.MarginLayoutParams) layoutParams) : new C0870g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f3524S != z2) {
            this.f3524S = z2;
            m3648T();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setCollapsible(boolean z2) {
        this.f3521P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3547v) {
            this.f3547v = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3546u) {
            this.f3546u = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC1832a.m9609b(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m3631m();
        this.f3529d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0871h interfaceC0871h) {
        this.f3514I = interfaceC0871h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m3629j();
        this.f3526a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f3536k != i3) {
            this.f3536k = i3;
            if (i3 == 0) {
                this.f3535j = getContext();
            } else {
                this.f3535j = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f3544s = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f3542q = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f3541p = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f3543r = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    /* JADX INFO: renamed from: x */
    public boolean m3657x() {
        C0869f c0869f = this.f3518M;
        return (c0869f == null || c0869f.f3559b == null) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m3658y() {
        ActionMenuView actionMenuView = this.f3526a;
        return actionMenuView != null && actionMenuView.m3324H();
    }

    /* JADX INFO: renamed from: z */
    public void m3659z(int i3) {
        getMenuInflater().inflate(i3, getMenu());
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0870g extends AbstractC0745a.a {

        /* JADX INFO: renamed from: b */
        int f3561b;

        public C0870g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3561b = 0;
        }

        /* JADX INFO: renamed from: a */
        void m3667a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0870g(int i3, int i4) {
            super(i3, i4);
            this.f3561b = 0;
            this.f2659a = 8388627;
        }

        public C0870g(C0870g c0870g) {
            super((AbstractC0745a.a) c0870g);
            this.f3561b = 0;
            this.f3561b = c0870g.f3561b;
        }

        public C0870g(AbstractC0745a.a aVar) {
            super(aVar);
            this.f3561b = 0;
        }

        public C0870g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3561b = 0;
            m3667a(marginLayoutParams);
        }

        public C0870g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3561b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3548w = 8388627;
        this.f3509D = new ArrayList();
        this.f3510E = new ArrayList();
        this.f3511F = new int[2];
        this.f3512G = new C0317w(new Runnable() { // from class: androidx.appcompat.widget.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3666d.m3638A();
            }
        });
        this.f3513H = new ArrayList();
        this.f3515J = new C0864a();
        this.f3525T = new RunnableC0865b();
        Context context2 = getContext();
        int[] iArr = AbstractC1769j.f9101r3;
        C0888e0 c0888e0M3765v = C0888e0.m3765v(context2, attributeSet, iArr, i3, 0);
        AbstractC0268W.m771g0(this, context, iArr, attributeSet, c0888e0M3765v.m3783r(), i3, 0);
        this.f3537l = c0888e0M3765v.m3779n(AbstractC1769j.f8975T3, 0);
        this.f3538m = c0888e0M3765v.m3779n(AbstractC1769j.f8930K3, 0);
        this.f3548w = c0888e0M3765v.m3777l(AbstractC1769j.f9106s3, this.f3548w);
        this.f3539n = c0888e0M3765v.m3777l(AbstractC1769j.f9111t3, 48);
        int iM3770e = c0888e0M3765v.m3770e(AbstractC1769j.f8945N3, 0);
        int i4 = AbstractC1769j.f8970S3;
        iM3770e = c0888e0M3765v.m3784s(i4) ? c0888e0M3765v.m3770e(i4, iM3770e) : iM3770e;
        this.f3544s = iM3770e;
        this.f3543r = iM3770e;
        this.f3542q = iM3770e;
        this.f3541p = iM3770e;
        int iM3770e2 = c0888e0M3765v.m3770e(AbstractC1769j.f8960Q3, -1);
        if (iM3770e2 >= 0) {
            this.f3541p = iM3770e2;
        }
        int iM3770e3 = c0888e0M3765v.m3770e(AbstractC1769j.f8955P3, -1);
        if (iM3770e3 >= 0) {
            this.f3542q = iM3770e3;
        }
        int iM3770e4 = c0888e0M3765v.m3770e(AbstractC1769j.f8965R3, -1);
        if (iM3770e4 >= 0) {
            this.f3543r = iM3770e4;
        }
        int iM3770e5 = c0888e0M3765v.m3770e(AbstractC1769j.f8950O3, -1);
        if (iM3770e5 >= 0) {
            this.f3544s = iM3770e5;
        }
        this.f3540o = c0888e0M3765v.m3771f(AbstractC1769j.f8900E3, -1);
        int iM3770e6 = c0888e0M3765v.m3770e(AbstractC1769j.f8880A3, Integer.MIN_VALUE);
        int iM3770e7 = c0888e0M3765v.m3770e(AbstractC1769j.f9126w3, Integer.MIN_VALUE);
        int iM3771f = c0888e0M3765v.m3771f(AbstractC1769j.f9136y3, 0);
        int iM3771f2 = c0888e0M3765v.m3771f(AbstractC1769j.f9141z3, 0);
        m3627h();
        this.f3545t.m3714e(iM3771f, iM3771f2);
        if (iM3770e6 != Integer.MIN_VALUE || iM3770e7 != Integer.MIN_VALUE) {
            this.f3545t.m3716g(iM3770e6, iM3770e7);
        }
        this.f3546u = c0888e0M3765v.m3770e(AbstractC1769j.f8885B3, Integer.MIN_VALUE);
        this.f3547v = c0888e0M3765v.m3770e(AbstractC1769j.f9131x3, Integer.MIN_VALUE);
        this.f3531f = c0888e0M3765v.m3772g(AbstractC1769j.f9121v3);
        this.f3532g = c0888e0M3765v.m3781p(AbstractC1769j.f9116u3);
        CharSequence charSequenceM3781p = c0888e0M3765v.m3781p(AbstractC1769j.f8940M3);
        if (!TextUtils.isEmpty(charSequenceM3781p)) {
            setTitle(charSequenceM3781p);
        }
        CharSequence charSequenceM3781p2 = c0888e0M3765v.m3781p(AbstractC1769j.f8925J3);
        if (!TextUtils.isEmpty(charSequenceM3781p2)) {
            setSubtitle(charSequenceM3781p2);
        }
        this.f3535j = getContext();
        setPopupTheme(c0888e0M3765v.m3779n(AbstractC1769j.f8920I3, 0));
        Drawable drawableM3772g = c0888e0M3765v.m3772g(AbstractC1769j.f8915H3);
        if (drawableM3772g != null) {
            setNavigationIcon(drawableM3772g);
        }
        CharSequence charSequenceM3781p3 = c0888e0M3765v.m3781p(AbstractC1769j.f8910G3);
        if (!TextUtils.isEmpty(charSequenceM3781p3)) {
            setNavigationContentDescription(charSequenceM3781p3);
        }
        Drawable drawableM3772g2 = c0888e0M3765v.m3772g(AbstractC1769j.f8890C3);
        if (drawableM3772g2 != null) {
            setLogo(drawableM3772g2);
        }
        CharSequence charSequenceM3781p4 = c0888e0M3765v.m3781p(AbstractC1769j.f8895D3);
        if (!TextUtils.isEmpty(charSequenceM3781p4)) {
            setLogoDescription(charSequenceM3781p4);
        }
        int i5 = AbstractC1769j.f8980U3;
        if (c0888e0M3765v.m3784s(i5)) {
            setTitleTextColor(c0888e0M3765v.m3768c(i5));
        }
        int i6 = AbstractC1769j.f8935L3;
        if (c0888e0M3765v.m3784s(i6)) {
            setSubtitleTextColor(c0888e0M3765v.m3768c(i6));
        }
        int i7 = AbstractC1769j.f8905F3;
        if (c0888e0M3765v.m3784s(i7)) {
            m3659z(c0888e0M3765v.m3779n(i7, 0));
        }
        c0888e0M3765v.m3786x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3653g();
        }
        ImageButton imageButton = this.f3533h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m3653g();
            this.f3533h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f3533h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f3531f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m3628i();
            if (!m3616B(this.f3530e)) {
                m3626c(this.f3530e, true);
            }
        } else {
            ImageView imageView = this.f3530e;
            if (imageView != null && m3616B(imageView)) {
                removeView(this.f3530e);
                this.f3510E.remove(this.f3530e);
            }
        }
        ImageView imageView2 = this.f3530e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3628i();
        }
        ImageView imageView = this.f3530e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3631m();
        }
        ImageButton imageButton = this.f3529d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AbstractC0898j0.m3829a(this.f3529d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3631m();
            if (!m3616B(this.f3529d)) {
                m3626c(this.f3529d, true);
            }
        } else {
            ImageButton imageButton = this.f3529d;
            if (imageButton != null && m3616B(imageButton)) {
                removeView(this.f3529d);
                this.f3510E.remove(this.f3529d);
            }
        }
        ImageButton imageButton2 = this.f3529d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3528c;
            if (textView != null && m3616B(textView)) {
                removeView(this.f3528c);
                this.f3510E.remove(this.f3528c);
            }
        } else {
            if (this.f3528c == null) {
                Context context = getContext();
                C0824B c0824b = new C0824B(context);
                this.f3528c = c0824b;
                c0824b.setSingleLine();
                this.f3528c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3538m;
                if (i3 != 0) {
                    this.f3528c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3506A;
                if (colorStateList != null) {
                    this.f3528c.setTextColor(colorStateList);
                }
            }
            if (!m3616B(this.f3528c)) {
                m3626c(this.f3528c, true);
            }
        }
        TextView textView2 = this.f3528c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3550y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3506A = colorStateList;
        TextView textView = this.f3528c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3527b;
            if (textView != null && m3616B(textView)) {
                removeView(this.f3527b);
                this.f3510E.remove(this.f3527b);
            }
        } else {
            if (this.f3527b == null) {
                Context context = getContext();
                C0824B c0824b = new C0824B(context);
                this.f3527b = c0824b;
                c0824b.setSingleLine();
                this.f3527b.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3537l;
                if (i3 != 0) {
                    this.f3527b.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3551z;
                if (colorStateList != null) {
                    this.f3527b.setTextColor(colorStateList);
                }
            }
            if (!m3616B(this.f3527b)) {
                m3626c(this.f3527b, true);
            }
        }
        TextView textView2 = this.f3527b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3549x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3551z = colorStateList;
        TextView textView = this.f3527b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0863a();

        /* JADX INFO: renamed from: f */
        int f3552f;

        /* JADX INFO: renamed from: g */
        boolean f3553g;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0863a implements Parcelable.ClassLoaderCreator {
            C0863a() {
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
            this.f3552f = parcel.readInt();
            this.f3553g = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f3552f);
            parcel.writeInt(this.f3553g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
