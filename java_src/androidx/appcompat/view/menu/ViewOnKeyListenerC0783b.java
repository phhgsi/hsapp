package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0791j;
import androidx.appcompat.widget.C0872U;
import androidx.appcompat.widget.InterfaceC0862T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027J.AbstractC0309s;
import p091d.AbstractC1763d;
import p091d.AbstractC1766g;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0783b extends AbstractC0789h implements InterfaceC0791j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    private static final int f2930B = AbstractC1766g.f8839e;

    /* JADX INFO: renamed from: A */
    boolean f2931A;

    /* JADX INFO: renamed from: b */
    private final Context f2932b;

    /* JADX INFO: renamed from: c */
    private final int f2933c;

    /* JADX INFO: renamed from: d */
    private final int f2934d;

    /* JADX INFO: renamed from: e */
    private final int f2935e;

    /* JADX INFO: renamed from: f */
    private final boolean f2936f;

    /* JADX INFO: renamed from: g */
    final Handler f2937g;

    /* JADX INFO: renamed from: o */
    private View f2945o;

    /* JADX INFO: renamed from: p */
    View f2946p;

    /* JADX INFO: renamed from: r */
    private boolean f2948r;

    /* JADX INFO: renamed from: s */
    private boolean f2949s;

    /* JADX INFO: renamed from: t */
    private int f2950t;

    /* JADX INFO: renamed from: u */
    private int f2951u;

    /* JADX INFO: renamed from: w */
    private boolean f2953w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0791j.a f2954x;

    /* JADX INFO: renamed from: y */
    ViewTreeObserver f2955y;

    /* JADX INFO: renamed from: z */
    private PopupWindow.OnDismissListener f2956z;

    /* JADX INFO: renamed from: h */
    private final List f2938h = new ArrayList();

    /* JADX INFO: renamed from: i */
    final List f2939i = new ArrayList();

    /* JADX INFO: renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f2940j = new a();

    /* JADX INFO: renamed from: k */
    private final View.OnAttachStateChangeListener f2941k = new b();

    /* JADX INFO: renamed from: l */
    private final InterfaceC0862T f2942l = new c();

    /* JADX INFO: renamed from: m */
    private int f2943m = 0;

    /* JADX INFO: renamed from: n */
    private int f2944n = 0;

    /* JADX INFO: renamed from: v */
    private boolean f2952v = false;

    /* JADX INFO: renamed from: q */
    private int f2947q = m3082G();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0783b.this.mo3085c() || ViewOnKeyListenerC0783b.this.f2939i.size() <= 0 || ((d) ViewOnKeyListenerC0783b.this.f2939i.get(0)).f2964a.m3512B()) {
                return;
            }
            View view = ViewOnKeyListenerC0783b.this.f2946p;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0783b.this.dismiss();
                return;
            }
            Iterator it = ViewOnKeyListenerC0783b.this.f2939i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f2964a.mo3086e();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0783b.this.f2955y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0783b.this.f2955y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0783b viewOnKeyListenerC0783b = ViewOnKeyListenerC0783b.this;
                viewOnKeyListenerC0783b.f2955y.removeGlobalOnLayoutListener(viewOnKeyListenerC0783b.f2940j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    class c implements InterfaceC0862T {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ d f2960d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ MenuItem f2961e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ C0786e f2962f;

            a(d dVar, MenuItem menuItem, C0786e c0786e) {
                this.f2960d = dVar;
                this.f2961e = menuItem;
                this.f2962f = c0786e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f2960d;
                if (dVar != null) {
                    ViewOnKeyListenerC0783b.this.f2931A = true;
                    dVar.f2965b.m3154e(false);
                    ViewOnKeyListenerC0783b.this.f2931A = false;
                }
                if (this.f2961e.isEnabled() && this.f2961e.hasSubMenu()) {
                    this.f2962f.m3136O(this.f2961e, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0862T
        /* JADX INFO: renamed from: a */
        public void mo3100a(C0786e c0786e, MenuItem menuItem) {
            ViewOnKeyListenerC0783b.this.f2937g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0783b.this.f2939i.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (c0786e == ((d) ViewOnKeyListenerC0783b.this.f2939i.get(i3)).f2965b) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return;
            }
            int i4 = i3 + 1;
            ViewOnKeyListenerC0783b.this.f2937g.postAtTime(new a(i4 < ViewOnKeyListenerC0783b.this.f2939i.size() ? (d) ViewOnKeyListenerC0783b.this.f2939i.get(i4) : null, menuItem, c0786e), c0786e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0862T
        /* JADX INFO: renamed from: b */
        public void mo3101b(C0786e c0786e, MenuItem menuItem) {
            ViewOnKeyListenerC0783b.this.f2937g.removeCallbacksAndMessages(c0786e);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        public final C0872U f2964a;

        /* JADX INFO: renamed from: b */
        public final C0786e f2965b;

        /* JADX INFO: renamed from: c */
        public final int f2966c;

        public d(C0872U c0872u, C0786e c0786e, int i3) {
            this.f2964a = c0872u;
            this.f2965b = c0786e;
            this.f2966c = i3;
        }

        /* JADX INFO: renamed from: a */
        public ListView m3102a() {
            return this.f2964a.mo3088g();
        }
    }

    public ViewOnKeyListenerC0783b(Context context, View view, int i3, int i4, boolean z2) {
        this.f2932b = context;
        this.f2945o = view;
        this.f2934d = i3;
        this.f2935e = i4;
        this.f2936f = z2;
        Resources resources = context.getResources();
        this.f2933c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1763d.f8736b));
        this.f2937g = new Handler();
    }

    /* JADX INFO: renamed from: C */
    private C0872U m3078C() {
        C0872U c0872u = new C0872U(this.f2932b, null, this.f2934d, this.f2935e);
        c0872u.m3670U(this.f2942l);
        c0872u.m3521L(this);
        c0872u.m3520K(this);
        c0872u.m3513D(this.f2945o);
        c0872u.m3516G(this.f2944n);
        c0872u.m3519J(true);
        c0872u.m3518I(2);
        return c0872u;
    }

    /* JADX INFO: renamed from: D */
    private int m3079D(C0786e c0786e) {
        int size = this.f2939i.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (c0786e == ((d) this.f2939i.get(i3)).f2965b) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    private MenuItem m3080E(C0786e c0786e, C0786e c0786e2) {
        int size = c0786e.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = c0786e.getItem(i3);
            if (item.hasSubMenu() && c0786e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    private View m3081F(d dVar, C0786e c0786e) {
        C0785d c0785d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM3080E = m3080E(dVar.f2965b, c0786e);
        if (menuItemM3080E == null) {
            return null;
        }
        ListView listViewM3102a = dVar.m3102a();
        ListAdapter adapter = listViewM3102a.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0785d = (C0785d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0785d = (C0785d) adapter;
            headersCount = 0;
        }
        int count = c0785d.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            }
            if (menuItemM3080E == c0785d.getItem(i3)) {
                break;
            }
            i3++;
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewM3102a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM3102a.getChildCount()) {
            return listViewM3102a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    private int m3082G() {
        return this.f2945o.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: H */
    private int m3083H(int i3) {
        List list = this.f2939i;
        ListView listViewM3102a = ((d) list.get(list.size() - 1)).m3102a();
        int[] iArr = new int[2];
        listViewM3102a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2946p.getWindowVisibleDisplayFrame(rect);
        return this.f2947q == 1 ? (iArr[0] + listViewM3102a.getWidth()) + i3 > rect.right ? 0 : 1 : iArr[0] - i3 < 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: I */
    private void m3084I(C0786e c0786e) {
        d dVar;
        View viewM3081F;
        int i3;
        int i4;
        int i5;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2932b);
        C0785d c0785d = new C0785d(c0786e, layoutInflaterFrom, this.f2936f, f2930B);
        if (!mo3085c() && this.f2952v) {
            c0785d.m3112d(true);
        } else if (mo3085c()) {
            c0785d.m3112d(AbstractC0789h.m3202A(c0786e));
        }
        int iM3204r = AbstractC0789h.m3204r(c0785d, null, this.f2932b, this.f2933c);
        C0872U c0872uM3078C = m3078C();
        c0872uM3078C.mo3354p(c0785d);
        c0872uM3078C.m3515F(iM3204r);
        c0872uM3078C.m3516G(this.f2944n);
        if (this.f2939i.size() > 0) {
            List list = this.f2939i;
            dVar = (d) list.get(list.size() - 1);
            viewM3081F = m3081F(dVar, c0786e);
        } else {
            dVar = null;
            viewM3081F = null;
        }
        if (viewM3081F != null) {
            c0872uM3078C.m3671V(false);
            c0872uM3078C.m3668S(null);
            int iM3083H = m3083H(iM3204r);
            boolean z2 = iM3083H == 1;
            this.f2947q = iM3083H;
            if (Build.VERSION.SDK_INT >= 26) {
                c0872uM3078C.m3513D(viewM3081F);
                i4 = 0;
                i3 = 0;
            } else {
                int[] iArr = new int[2];
                this.f2945o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM3081F.getLocationOnScreen(iArr2);
                if ((this.f2944n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2945o.getWidth();
                    iArr2[0] = iArr2[0] + viewM3081F.getWidth();
                }
                i3 = iArr2[0] - iArr[0];
                i4 = iArr2[1] - iArr[1];
            }
            if ((this.f2944n & 5) == 5) {
                if (!z2) {
                    iM3204r = viewM3081F.getWidth();
                    i5 = i3 - iM3204r;
                }
                i5 = i3 + iM3204r;
            } else {
                if (z2) {
                    iM3204r = viewM3081F.getWidth();
                    i5 = i3 + iM3204r;
                }
                i5 = i3 - iM3204r;
            }
            c0872uM3078C.m3531l(i5);
            c0872uM3078C.m3523N(true);
            c0872uM3078C.m3530j(i4);
        } else {
            if (this.f2948r) {
                c0872uM3078C.m3531l(this.f2950t);
            }
            if (this.f2949s) {
                c0872uM3078C.m3530j(this.f2951u);
            }
            c0872uM3078C.m3517H(m3205q());
        }
        this.f2939i.add(new d(c0872uM3078C, c0786e, this.f2947q));
        c0872uM3078C.mo3086e();
        ListView listViewMo3088g = c0872uM3078C.mo3088g();
        listViewMo3088g.setOnKeyListener(this);
        if (dVar == null && this.f2953w && c0786e.m3173z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC1766g.f8846l, (ViewGroup) listViewMo3088g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0786e.m3173z());
            listViewMo3088g.addHeaderView(frameLayout, null, false);
            c0872uM3078C.mo3086e();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: a */
    public void mo3061a(C0786e c0786e, boolean z2) {
        int iM3079D = m3079D(c0786e);
        if (iM3079D < 0) {
            return;
        }
        int i3 = iM3079D + 1;
        if (i3 < this.f2939i.size()) {
            ((d) this.f2939i.get(i3)).f2965b.m3154e(false);
        }
        d dVar = (d) this.f2939i.remove(iM3079D);
        dVar.f2965b.m3138R(this);
        if (this.f2931A) {
            dVar.f2964a.m3669T(null);
            dVar.f2964a.m3514E(0);
        }
        dVar.f2964a.dismiss();
        int size = this.f2939i.size();
        if (size > 0) {
            this.f2947q = ((d) this.f2939i.get(size - 1)).f2966c;
        } else {
            this.f2947q = m3082G();
        }
        if (size != 0) {
            if (z2) {
                ((d) this.f2939i.get(0)).f2965b.m3154e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0791j.a aVar = this.f2954x;
        if (aVar != null) {
            aVar.mo2717a(c0786e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2955y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2955y.removeGlobalOnLayoutListener(this.f2940j);
            }
            this.f2955y = null;
        }
        this.f2946p.removeOnAttachStateChangeListener(this.f2941k);
        this.f2956z.onDismiss();
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: c */
    public boolean mo3085c() {
        return this.f2939i.size() > 0 && ((d) this.f2939i.get(0)).f2964a.mo3085c();
    }

    @Override // p111i.InterfaceC2024e
    public void dismiss() {
        int size = this.f2939i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f2939i.toArray(new d[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                d dVar = dVarArr[i3];
                if (dVar.f2964a.mo3085c()) {
                    dVar.f2964a.dismiss();
                }
            }
        }
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: e */
    public void mo3086e() {
        if (mo3085c()) {
            return;
        }
        Iterator it = this.f2938h.iterator();
        while (it.hasNext()) {
            m3084I((C0786e) it.next());
        }
        this.f2938h.clear();
        View view = this.f2945o;
        this.f2946p = view;
        if (view != null) {
            boolean z2 = this.f2955y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2955y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2940j);
            }
            this.f2946p.addOnAttachStateChangeListener(this.f2941k);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: f */
    public void mo3087f(Parcelable parcelable) {
    }

    @Override // p111i.InterfaceC2024e
    /* JADX INFO: renamed from: g */
    public ListView mo3088g() {
        if (this.f2939i.isEmpty()) {
            return null;
        }
        return ((d) this.f2939i.get(r0.size() - 1)).m3102a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: h */
    public boolean mo3067h(SubMenuC0794m subMenuC0794m) {
        for (d dVar : this.f2939i) {
            if (subMenuC0794m == dVar.f2965b) {
                dVar.m3102a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0794m.hasVisibleItems()) {
            return false;
        }
        mo3091o(subMenuC0794m);
        InterfaceC0791j.a aVar = this.f2954x;
        if (aVar != null) {
            aVar.mo2718b(subMenuC0794m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0791j
    /* JADX INFO: renamed from: i */
    public void mo3068i(boolean z2) {
        Iterator it = this.f2939i.iterator();
        while (it.hasNext()) {
            AbstractC0789h.m3203B(((d) it.next()).m3102a().getAdapter()).notifyDataSetChanged();
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
    /* JADX INFO: renamed from: n */
    public void mo3071n(InterfaceC0791j.a aVar) {
        this.f2954x = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: o */
    public void mo3091o(C0786e c0786e) {
        c0786e.m3150c(this, this.f2932b);
        if (mo3085c()) {
            m3084I(c0786e);
        } else {
            this.f2938h.add(c0786e);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f2939i.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f2939i.get(i3);
            if (!dVar.f2964a.mo3085c()) {
                break;
            } else {
                i3++;
            }
        }
        if (dVar != null) {
            dVar.f2965b.m3154e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: p */
    protected boolean mo3092p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: s */
    public void mo3093s(View view) {
        if (this.f2945o != view) {
            this.f2945o = view;
            this.f2944n = AbstractC0309s.m1053b(this.f2943m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: u */
    public void mo3094u(boolean z2) {
        this.f2952v = z2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: v */
    public void mo3095v(int i3) {
        if (this.f2943m != i3) {
            this.f2943m = i3;
            this.f2944n = AbstractC0309s.m1053b(i3, this.f2945o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: w */
    public void mo3096w(int i3) {
        this.f2948r = true;
        this.f2950t = i3;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: x */
    public void mo3097x(PopupWindow.OnDismissListener onDismissListener) {
        this.f2956z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: y */
    public void mo3098y(boolean z2) {
        this.f2953w = z2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0789h
    /* JADX INFO: renamed from: z */
    public void mo3099z(int i3) {
        this.f2949s = true;
        this.f2951u = i3;
    }
}
