package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p111i.InterfaceC2024e;

/* JADX INFO: renamed from: androidx.appcompat.widget.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0839P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final float f3317a;

    /* JADX INFO: renamed from: b */
    private final int f3318b;

    /* JADX INFO: renamed from: c */
    private final int f3319c;

    /* JADX INFO: renamed from: d */
    final View f3320d;

    /* JADX INFO: renamed from: e */
    private Runnable f3321e;

    /* JADX INFO: renamed from: f */
    private Runnable f3322f;

    /* JADX INFO: renamed from: g */
    private boolean f3323g;

    /* JADX INFO: renamed from: h */
    private int f3324h;

    /* JADX INFO: renamed from: i */
    private final int[] f3325i = new int[2];

    /* JADX INFO: renamed from: androidx.appcompat.widget.P$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0839P.this.f3320d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.P$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0839P.this.m3488e();
        }
    }

    public AbstractViewOnTouchListenerC0839P(View view) {
        this.f3320d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3317a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3318b = tapTimeout;
        this.f3319c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: a */
    private void m3482a() {
        Runnable runnable = this.f3322f;
        if (runnable != null) {
            this.f3320d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3321e;
        if (runnable2 != null) {
            this.f3320d.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m3483f(MotionEvent motionEvent) {
        C0837N c0837n;
        View view = this.f3320d;
        InterfaceC2024e interfaceC2024eMo3050b = mo3050b();
        if (interfaceC2024eMo3050b != null && interfaceC2024eMo3050b.mo3085c() && (c0837n = (C0837N) interfaceC2024eMo3050b.mo3088g()) != null && c0837n.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m3486i(view, motionEventObtainNoHistory);
            m3487j(c0837n, motionEventObtainNoHistory);
            boolean zMo3470e = c0837n.mo3470e(motionEventObtainNoHistory, this.f3324h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zMo3470e && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3484g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f3320d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f3324h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f3317a
            boolean r6 = m3485h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m3482a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m3482a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f3324h = r6
            java.lang.Runnable r6 = r5.f3321e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.P$a r6 = new androidx.appcompat.widget.P$a
            r6.<init>()
            r5.f3321e = r6
        L52:
            java.lang.Runnable r6 = r5.f3321e
            int r1 = r5.f3318b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f3322f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.P$b r6 = new androidx.appcompat.widget.P$b
            r6.<init>()
            r5.f3322f = r6
        L65:
            java.lang.Runnable r6 = r5.f3322f
            int r1 = r5.f3319c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0839P.m3484g(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: h */
    private static boolean m3485h(View view, float f3, float f4, float f5) {
        float f6 = -f5;
        return f3 >= f6 && f4 >= f6 && f3 < ((float) (view.getRight() - view.getLeft())) + f5 && f4 < ((float) (view.getBottom() - view.getTop())) + f5;
    }

    /* JADX INFO: renamed from: i */
    private boolean m3486i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f3325i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: j */
    private boolean m3487j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f3325i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC2024e mo3050b();

    /* JADX INFO: renamed from: c */
    protected abstract boolean mo3051c();

    /* JADX INFO: renamed from: d */
    protected boolean mo3315d() {
        InterfaceC2024e interfaceC2024eMo3050b = mo3050b();
        if (interfaceC2024eMo3050b == null || !interfaceC2024eMo3050b.mo3085c()) {
            return true;
        }
        interfaceC2024eMo3050b.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: e */
    void m3488e() {
        m3482a();
        View view = this.f3320d;
        if (view.isEnabled() && !view.isLongClickable() && mo3051c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f3323g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.f3323g;
        if (z3) {
            z2 = m3483f(motionEvent) || !mo3315d();
        } else {
            z2 = m3484g(motionEvent) && mo3051c();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3320d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f3323g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3323g = false;
        this.f3324h = -1;
        Runnable runnable = this.f3321e;
        if (runnable != null) {
            this.f3320d.removeCallbacks(runnable);
        }
    }
}
