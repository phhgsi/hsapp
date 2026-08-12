package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0791j;
import p027J.AbstractC0309s;
import p091d.AbstractC1763d;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.i */
/* JADX INFO: loaded from: classes.dex */
public class C0790i {

    /* JADX INFO: renamed from: a */
    private final Context f3049a;

    /* JADX INFO: renamed from: b */
    private final C0786e f3050b;

    /* JADX INFO: renamed from: c */
    private final boolean f3051c;

    /* JADX INFO: renamed from: d */
    private final int f3052d;

    /* JADX INFO: renamed from: e */
    private final int f3053e;

    /* JADX INFO: renamed from: f */
    private View f3054f;

    /* JADX INFO: renamed from: g */
    private int f3055g;

    /* JADX INFO: renamed from: h */
    private boolean f3056h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0791j.a f3057i;

    /* JADX INFO: renamed from: j */
    private AbstractC0789h f3058j;

    /* JADX INFO: renamed from: k */
    private PopupWindow.OnDismissListener f3059k;

    /* JADX INFO: renamed from: l */
    private final PopupWindow.OnDismissListener f3060l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.i$a */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0790i.this.mo3212e();
        }
    }

    public C0790i(Context context, C0786e c0786e, View view, boolean z2, int i3) {
        this(context, c0786e, view, z2, i3, 0);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0789h m3207a() {
        Display defaultDisplay = ((WindowManager) this.f3049a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC0789h viewOnKeyListenerC0783b = Math.min(point.x, point.y) >= this.f3049a.getResources().getDimensionPixelSize(AbstractC1763d.f8735a) ? new ViewOnKeyListenerC0783b(this.f3049a, this.f3054f, this.f3052d, this.f3053e, this.f3051c) : new ViewOnKeyListenerC0793l(this.f3049a, this.f3050b, this.f3054f, this.f3052d, this.f3053e, this.f3051c);
        viewOnKeyListenerC0783b.mo3091o(this.f3050b);
        viewOnKeyListenerC0783b.mo3097x(this.f3060l);
        viewOnKeyListenerC0783b.mo3093s(this.f3054f);
        viewOnKeyListenerC0783b.mo3071n(this.f3057i);
        viewOnKeyListenerC0783b.mo3094u(this.f3056h);
        viewOnKeyListenerC0783b.mo3095v(this.f3055g);
        return viewOnKeyListenerC0783b;
    }

    /* JADX INFO: renamed from: l */
    private void m3208l(int i3, int i4, boolean z2, boolean z3) {
        AbstractC0789h abstractC0789hM3210c = m3210c();
        abstractC0789hM3210c.mo3098y(z3);
        if (z2) {
            if ((AbstractC0309s.m1053b(this.f3055g, this.f3054f.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f3054f.getWidth();
            }
            abstractC0789hM3210c.mo3096w(i3);
            abstractC0789hM3210c.mo3099z(i4);
            int i5 = (int) ((this.f3049a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC0789hM3210c.m3206t(new Rect(i3 - i5, i4 - i5, i3 + i5, i4 + i5));
        }
        abstractC0789hM3210c.mo3086e();
    }

    /* JADX INFO: renamed from: b */
    public void m3209b() {
        if (m3211d()) {
            this.f3058j.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0789h m3210c() {
        if (this.f3058j == null) {
            this.f3058j = m3207a();
        }
        return this.f3058j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3211d() {
        AbstractC0789h abstractC0789h = this.f3058j;
        return abstractC0789h != null && abstractC0789h.mo3085c();
    }

    /* JADX INFO: renamed from: e */
    protected void mo3212e() {
        this.f3058j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3059k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3213f(View view) {
        this.f3054f = view;
    }

    /* JADX INFO: renamed from: g */
    public void m3214g(boolean z2) {
        this.f3056h = z2;
        AbstractC0789h abstractC0789h = this.f3058j;
        if (abstractC0789h != null) {
            abstractC0789h.mo3094u(z2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m3215h(int i3) {
        this.f3055g = i3;
    }

    /* JADX INFO: renamed from: i */
    public void m3216i(PopupWindow.OnDismissListener onDismissListener) {
        this.f3059k = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m3217j(InterfaceC0791j.a aVar) {
        this.f3057i = aVar;
        AbstractC0789h abstractC0789h = this.f3058j;
        if (abstractC0789h != null) {
            abstractC0789h.mo3071n(aVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3218k() {
        if (!m3219m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m3219m() {
        if (m3211d()) {
            return true;
        }
        if (this.f3054f == null) {
            return false;
        }
        m3208l(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m3220n(int i3, int i4) {
        if (m3211d()) {
            return true;
        }
        if (this.f3054f == null) {
            return false;
        }
        m3208l(i3, i4, true, true);
        return true;
    }

    public C0790i(Context context, C0786e c0786e, View view, boolean z2, int i3, int i4) {
        this.f3055g = 8388611;
        this.f3060l = new a();
        this.f3049a = context;
        this.f3050b = c0786e;
        this.f3054f = view;
        this.f3051c = z2;
        this.f3052d = i3;
        this.f3053e = i4;
    }
}
