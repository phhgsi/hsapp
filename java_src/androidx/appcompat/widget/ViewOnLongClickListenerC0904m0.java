package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p027J.AbstractC0268W;
import p027J.AbstractC0272Z;

/* JADX INFO: renamed from: androidx.appcompat.widget.m0 */
/* JADX INFO: loaded from: classes.dex */
class ViewOnLongClickListenerC0904m0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k */
    private static ViewOnLongClickListenerC0904m0 f3724k;

    /* JADX INFO: renamed from: l */
    private static ViewOnLongClickListenerC0904m0 f3725l;

    /* JADX INFO: renamed from: a */
    private final View f3726a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f3727b;

    /* JADX INFO: renamed from: c */
    private final int f3728c;

    /* JADX INFO: renamed from: d */
    private final Runnable f3729d = new Runnable() { // from class: androidx.appcompat.widget.k0
        @Override // java.lang.Runnable
        public final void run() {
            this.f3718d.m3855h(false);
        }
    };

    /* JADX INFO: renamed from: e */
    private final Runnable f3730e = new Runnable() { // from class: androidx.appcompat.widget.l0
        @Override // java.lang.Runnable
        public final void run() {
            this.f3721d.m3854d();
        }
    };

    /* JADX INFO: renamed from: f */
    private int f3731f;

    /* JADX INFO: renamed from: g */
    private int f3732g;

    /* JADX INFO: renamed from: h */
    private C0906n0 f3733h;

    /* JADX INFO: renamed from: i */
    private boolean f3734i;

    /* JADX INFO: renamed from: j */
    private boolean f3735j;

    private ViewOnLongClickListenerC0904m0(View view, CharSequence charSequence) {
        this.f3726a = view;
        this.f3727b = charSequence;
        this.f3728c = AbstractC0272Z.m886g(ViewConfiguration.get(view.getContext()));
        m3849c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    private void m3848b() {
        this.f3726a.removeCallbacks(this.f3729d);
    }

    /* JADX INFO: renamed from: c */
    private void m3849c() {
        this.f3735j = true;
    }

    /* JADX INFO: renamed from: e */
    private void m3850e() {
        this.f3726a.postDelayed(this.f3729d, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: f */
    private static void m3851f(ViewOnLongClickListenerC0904m0 viewOnLongClickListenerC0904m0) {
        ViewOnLongClickListenerC0904m0 viewOnLongClickListenerC0904m02 = f3724k;
        if (viewOnLongClickListenerC0904m02 != null) {
            viewOnLongClickListenerC0904m02.m3848b();
        }
        f3724k = viewOnLongClickListenerC0904m0;
        if (viewOnLongClickListenerC0904m0 != null) {
            viewOnLongClickListenerC0904m0.m3850e();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3852g(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0904m0 viewOnLongClickListenerC0904m0 = f3724k;
        if (viewOnLongClickListenerC0904m0 != null && viewOnLongClickListenerC0904m0.f3726a == view) {
            m3851f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0904m0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0904m0 viewOnLongClickListenerC0904m02 = f3725l;
        if (viewOnLongClickListenerC0904m02 != null && viewOnLongClickListenerC0904m02.f3726a == view) {
            viewOnLongClickListenerC0904m02.m3854d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: i */
    private boolean m3853i(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (!this.f3735j && Math.abs(x2 - this.f3731f) <= this.f3728c && Math.abs(y2 - this.f3732g) <= this.f3728c) {
            return false;
        }
        this.f3731f = x2;
        this.f3732g = y2;
        this.f3735j = false;
        return true;
    }

    /* JADX INFO: renamed from: d */
    void m3854d() {
        if (f3725l == this) {
            f3725l = null;
            C0906n0 c0906n0 = this.f3733h;
            if (c0906n0 != null) {
                c0906n0.m3859c();
                this.f3733h = null;
                m3849c();
                this.f3726a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3724k == this) {
            m3851f(null);
        }
        this.f3726a.removeCallbacks(this.f3730e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h */
    public void m3855h(boolean z2) {
        long longPressTimeout;
        long j3;
        long j4;
        if (this.f3726a.isAttachedToWindow()) {
            m3851f(null);
            ViewOnLongClickListenerC0904m0 viewOnLongClickListenerC0904m0 = f3725l;
            if (viewOnLongClickListenerC0904m0 != null) {
                viewOnLongClickListenerC0904m0.m3854d();
            }
            f3725l = this;
            this.f3734i = z2;
            C0906n0 c0906n0 = new C0906n0(this.f3726a.getContext());
            this.f3733h = c0906n0;
            c0906n0.m3861e(this.f3726a, this.f3731f, this.f3732g, this.f3734i, this.f3727b);
            this.f3726a.addOnAttachStateChangeListener(this);
            if (this.f3734i) {
                j4 = 2500;
            } else {
                if ((AbstractC0268W.m740I(this.f3726a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            this.f3726a.removeCallbacks(this.f3730e);
            this.f3726a.postDelayed(this.f3730e, j4);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3733h != null && this.f3734i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3726a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m3849c();
                m3854d();
            }
        } else if (this.f3726a.isEnabled() && this.f3733h == null && m3853i(motionEvent)) {
            m3851f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f3731f = view.getWidth() / 2;
        this.f3732g = view.getHeight() / 2;
        m3855h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m3854d();
    }
}
