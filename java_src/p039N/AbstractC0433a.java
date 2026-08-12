package p039N;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.C0930j;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import p027J.AbstractC0268W;
import p027J.C0273a;
import p030K.AbstractC0330A;
import p030K.C0356y;
import p030K.C0357z;
import p039N.AbstractC0434b;

/* JADX INFO: renamed from: N.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0433a extends C0273a {

    /* JADX INFO: renamed from: n */
    private static final Rect f1542n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    private static final AbstractC0434b.a f1543o = new a();

    /* JADX INFO: renamed from: p */
    private static final AbstractC0434b.b f1544p = new b();

    /* JADX INFO: renamed from: h */
    private final AccessibilityManager f1549h;

    /* JADX INFO: renamed from: i */
    private final View f1550i;

    /* JADX INFO: renamed from: j */
    private c f1551j;

    /* JADX INFO: renamed from: d */
    private final Rect f1545d = new Rect();

    /* JADX INFO: renamed from: e */
    private final Rect f1546e = new Rect();

    /* JADX INFO: renamed from: f */
    private final Rect f1547f = new Rect();

    /* JADX INFO: renamed from: g */
    private final int[] f1548g = new int[2];

    /* JADX INFO: renamed from: k */
    int f1552k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    int f1553l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    private int f1554m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: N.a$a */
    class a implements AbstractC0434b.a {
        a() {
        }

        @Override // p039N.AbstractC0434b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1524a(C0356y c0356y, Rect rect) {
            c0356y.m1276m(rect);
        }
    }

    /* JADX INFO: renamed from: N.a$b */
    class b implements AbstractC0434b.b {
        b() {
        }

        @Override // p039N.AbstractC0434b.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0356y mo1526a(C0930j c0930j, int i3) {
            return (C0356y) c0930j.m3958j(i3);
        }

        @Override // p039N.AbstractC0434b.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo1527b(C0930j c0930j) {
            return c0930j.m3957i();
        }
    }

    /* JADX INFO: renamed from: N.a$c */
    private class c extends C0357z {
        c() {
        }

        @Override // p030K.C0357z
        /* JADX INFO: renamed from: b */
        public C0356y mo1321b(int i3) {
            return C0356y.m1208g0(AbstractC0433a.this.m1509H(i3));
        }

        @Override // p030K.C0357z
        /* JADX INFO: renamed from: d */
        public C0356y mo1323d(int i3) {
            int i4 = i3 == 2 ? AbstractC0433a.this.f1552k : AbstractC0433a.this.f1553l;
            if (i4 == Integer.MIN_VALUE) {
                return null;
            }
            return mo1321b(i4);
        }

        @Override // p030K.C0357z
        /* JADX INFO: renamed from: f */
        public boolean mo1325f(int i3, int i4, Bundle bundle) {
            return AbstractC0433a.this.m1517P(i3, i4, bundle);
        }
    }

    public AbstractC0433a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1550i = view;
        this.f1549h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC0268W.m802w(view) == 0) {
            AbstractC0268W.m789p0(view, 1);
        }
    }

    /* JADX INFO: renamed from: D */
    private static Rect m1489D(View view, int i3, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i3 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i3 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i3 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    /* JADX INFO: renamed from: E */
    private boolean m1490E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f1550i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f1550i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: F */
    private static int m1491F(int i3) {
        if (i3 == 19) {
            return 33;
        }
        if (i3 != 21) {
            return i3 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX INFO: renamed from: G */
    private boolean m1492G(int i3, Rect rect) {
        C0356y c0356y;
        C0930j c0930jM1504y = m1504y();
        int i4 = this.f1553l;
        C0356y c0356y2 = i4 == Integer.MIN_VALUE ? null : (C0356y) c0930jM1504y.m3952d(i4);
        if (i3 == 1 || i3 == 2) {
            c0356y = (C0356y) AbstractC0434b.m1533d(c0930jM1504y, f1544p, f1543o, c0356y2, i3, AbstractC0268W.m806y(this.f1550i) == 1, false);
        } else {
            if (i3 != 17 && i3 != 33 && i3 != 66 && i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i5 = this.f1553l;
            if (i5 != Integer.MIN_VALUE) {
                m1505z(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m1489D(this.f1550i, i3, rect2);
            }
            c0356y = (C0356y) AbstractC0434b.m1532c(c0930jM1504y, f1544p, f1543o, c0356y2, rect2, i3);
        }
        return m1518T(c0356y != null ? c0930jM1504y.m3955g(c0930jM1504y.m3954f(c0356y)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: Q */
    private boolean m1493Q(int i3, int i4, Bundle bundle) {
        return i4 != 1 ? i4 != 2 ? i4 != 64 ? i4 != 128 ? mo1511J(i3, i4, bundle) : m1497n(i3) : m1495S(i3) : m1520o(i3) : m1518T(i3);
    }

    /* JADX INFO: renamed from: R */
    private boolean m1494R(int i3, Bundle bundle) {
        return AbstractC0268W.m755X(this.f1550i, i3, bundle);
    }

    /* JADX INFO: renamed from: S */
    private boolean m1495S(int i3) {
        int i4;
        if (!this.f1549h.isEnabled() || !this.f1549h.isTouchExplorationEnabled() || (i4 = this.f1552k) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            m1497n(i4);
        }
        this.f1552k = i3;
        this.f1550i.invalidate();
        m1519U(i3, 32768);
        return true;
    }

    /* JADX INFO: renamed from: V */
    private void m1496V(int i3) {
        int i4 = this.f1554m;
        if (i4 == i3) {
            return;
        }
        this.f1554m = i3;
        m1519U(i3, 128);
        m1519U(i4, 256);
    }

    /* JADX INFO: renamed from: n */
    private boolean m1497n(int i3) {
        if (this.f1552k != i3) {
            return false;
        }
        this.f1552k = Integer.MIN_VALUE;
        this.f1550i.invalidate();
        m1519U(i3, 65536);
        return true;
    }

    /* JADX INFO: renamed from: p */
    private boolean m1498p() {
        int i3 = this.f1553l;
        return i3 != Integer.MIN_VALUE && mo1511J(i3, 16, null);
    }

    /* JADX INFO: renamed from: q */
    private AccessibilityEvent m1499q(int i3, int i4) {
        return i3 != -1 ? m1500r(i3, i4) : m1501s(i4);
    }

    /* JADX INFO: renamed from: r */
    private AccessibilityEvent m1500r(int i3, int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        C0356y c0356yM1509H = m1509H(i3);
        accessibilityEventObtain.getText().add(c0356yM1509H.m1228G());
        accessibilityEventObtain.setContentDescription(c0356yM1509H.m1291v());
        accessibilityEventObtain.setScrollable(c0356yM1509H.m1262a0());
        accessibilityEventObtain.setPassword(c0356yM1509H.m1260Z());
        accessibilityEventObtain.setEnabled(c0356yM1509H.m1250S());
        accessibilityEventObtain.setChecked(c0356yM1509H.m1244P());
        m1513L(i3, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c0356yM1509H.m1286s());
        AbstractC0330A.m1174c(accessibilityEventObtain, this.f1550i, i3);
        accessibilityEventObtain.setPackageName(this.f1550i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: s */
    private AccessibilityEvent m1501s(int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        this.f1550i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: t */
    private C0356y m1502t(int i3) {
        C0356y c0356yM1206f0 = C0356y.m1206f0();
        c0356yM1206f0.m1296x0(true);
        c0356yM1206f0.m1299z0(true);
        c0356yM1206f0.m1287s0("android.view.View");
        Rect rect = f1542n;
        c0356yM1206f0.m1280o0(rect);
        c0356yM1206f0.m1282p0(rect);
        c0356yM1206f0.m1231H0(this.f1550i);
        mo1515N(i3, c0356yM1206f0);
        if (c0356yM1206f0.m1228G() == null && c0356yM1206f0.m1291v() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c0356yM1206f0.m1276m(this.f1546e);
        if (this.f1546e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM1274k = c0356yM1206f0.m1274k();
        if ((iM1274k & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM1274k & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c0356yM1206f0.m1227F0(this.f1550i.getContext().getPackageName());
        c0356yM1206f0.m1245P0(this.f1550i, i3);
        if (this.f1552k == i3) {
            c0356yM1206f0.m1277m0(true);
            c0356yM1206f0.m1261a(128);
        } else {
            c0356yM1206f0.m1277m0(false);
            c0356yM1206f0.m1261a(64);
        }
        boolean z2 = this.f1553l == i3;
        if (z2) {
            c0356yM1206f0.m1261a(2);
        } else if (c0356yM1206f0.m1254U()) {
            c0356yM1206f0.m1261a(1);
        }
        c0356yM1206f0.m1219A0(z2);
        this.f1550i.getLocationOnScreen(this.f1548g);
        c0356yM1206f0.m1278n(this.f1545d);
        if (this.f1545d.equals(rect)) {
            c0356yM1206f0.m1276m(this.f1545d);
            if (c0356yM1206f0.f1424b != -1) {
                C0356y c0356yM1206f02 = C0356y.m1206f0();
                for (int i4 = c0356yM1206f0.f1424b; i4 != -1; i4 = c0356yM1206f02.f1424b) {
                    c0356yM1206f02.m1233I0(this.f1550i, -1);
                    c0356yM1206f02.m1280o0(f1542n);
                    mo1515N(i4, c0356yM1206f02);
                    c0356yM1206f02.m1276m(this.f1546e);
                    Rect rect2 = this.f1545d;
                    Rect rect3 = this.f1546e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c0356yM1206f02.m1273j0();
            }
            this.f1545d.offset(this.f1548g[0] - this.f1550i.getScrollX(), this.f1548g[1] - this.f1550i.getScrollY());
        }
        if (this.f1550i.getLocalVisibleRect(this.f1547f)) {
            this.f1547f.offset(this.f1548g[0] - this.f1550i.getScrollX(), this.f1548g[1] - this.f1550i.getScrollY());
            if (this.f1545d.intersect(this.f1547f)) {
                c0356yM1206f0.m1282p0(this.f1545d);
                if (m1490E(this.f1545d)) {
                    c0356yM1206f0.m1253T0(true);
                }
            }
        }
        return c0356yM1206f0;
    }

    /* JADX INFO: renamed from: u */
    private C0356y m1503u() {
        C0356y c0356yM1210h0 = C0356y.m1210h0(this.f1550i);
        AbstractC0268W.m753V(this.f1550i, c0356yM1210h0);
        ArrayList arrayList = new ArrayList();
        mo1508C(arrayList);
        if (c0356yM1210h0.m1284r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0356yM1210h0.m1267d(this.f1550i, ((Integer) arrayList.get(i3)).intValue());
        }
        return c0356yM1210h0;
    }

    /* JADX INFO: renamed from: y */
    private C0930j m1504y() {
        ArrayList arrayList = new ArrayList();
        mo1508C(arrayList);
        C0930j c0930j = new C0930j();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            c0930j.m3956h(((Integer) arrayList.get(i3)).intValue(), m1502t(((Integer) arrayList.get(i3)).intValue()));
        }
        return c0930j;
    }

    /* JADX INFO: renamed from: z */
    private void m1505z(int i3, Rect rect) {
        m1509H(i3).m1276m(rect);
    }

    /* JADX INFO: renamed from: A */
    public final int m1506A() {
        return this.f1553l;
    }

    /* JADX INFO: renamed from: B */
    protected abstract int mo1507B(float f3, float f4);

    /* JADX INFO: renamed from: C */
    protected abstract void mo1508C(List list);

    /* JADX INFO: renamed from: H */
    C0356y m1509H(int i3) {
        return i3 == -1 ? m1503u() : m1502t(i3);
    }

    /* JADX INFO: renamed from: I */
    public final void m1510I(boolean z2, int i3, Rect rect) {
        int i4 = this.f1553l;
        if (i4 != Integer.MIN_VALUE) {
            m1520o(i4);
        }
        if (z2) {
            m1492G(i3, rect);
        }
    }

    /* JADX INFO: renamed from: J */
    protected abstract boolean mo1511J(int i3, int i4, Bundle bundle);

    /* JADX INFO: renamed from: M */
    protected abstract void mo1514M(C0356y c0356y);

    /* JADX INFO: renamed from: N */
    protected abstract void mo1515N(int i3, C0356y c0356y);

    /* JADX INFO: renamed from: O */
    protected abstract void mo1516O(int i3, boolean z2);

    /* JADX INFO: renamed from: P */
    boolean m1517P(int i3, int i4, Bundle bundle) {
        return i3 != -1 ? m1493Q(i3, i4, bundle) : m1494R(i4, bundle);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m1518T(int i3) {
        int i4;
        if ((!this.f1550i.isFocused() && !this.f1550i.requestFocus()) || (i4 = this.f1553l) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            m1520o(i4);
        }
        if (i3 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1553l = i3;
        mo1516O(i3, true);
        m1519U(i3, 8);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m1519U(int i3, int i4) {
        ViewParent parent;
        if (i3 == Integer.MIN_VALUE || !this.f1549h.isEnabled() || (parent = this.f1550i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f1550i, m1499q(i3, i4));
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: b */
    public C0357z mo902b(View view) {
        if (this.f1551j == null) {
            this.f1551j = new c();
        }
        return this.f1551j;
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: f */
    public void mo904f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo904f(view, accessibilityEvent);
        m1512K(accessibilityEvent);
    }

    @Override // p027J.C0273a
    /* JADX INFO: renamed from: g */
    public void mo905g(View view, C0356y c0356y) {
        super.mo905g(view, c0356y);
        mo1514M(c0356y);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1520o(int i3) {
        if (this.f1553l != i3) {
            return false;
        }
        this.f1553l = Integer.MIN_VALUE;
        mo1516O(i3, false);
        m1519U(i3, 8);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1521v(MotionEvent motionEvent) {
        if (this.f1549h.isEnabled() && this.f1549h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f1554m == Integer.MIN_VALUE) {
                    return false;
                }
                m1496V(Integer.MIN_VALUE);
                return true;
            }
            int iMo1507B = mo1507B(motionEvent.getX(), motionEvent.getY());
            m1496V(iMo1507B);
            if (iMo1507B != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1522w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = m1491F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.m1492G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.m1498p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.m1492G(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.m1492G(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p039N.AbstractC0433a.m1522w(android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: x */
    public final int m1523x() {
        return this.f1552k;
    }

    /* JADX INFO: renamed from: K */
    protected void m1512K(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: L */
    protected void m1513L(int i3, AccessibilityEvent accessibilityEvent) {
    }
}
