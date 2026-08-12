package p039N;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p027J.AbstractC0268W;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: loaded from: classes.dex */
public class C0435c {

    /* JADX INFO: renamed from: x */
    private static final Interpolator f1560x = new a();

    /* JADX INFO: renamed from: a */
    private int f1561a;

    /* JADX INFO: renamed from: b */
    private int f1562b;

    /* JADX INFO: renamed from: d */
    private float[] f1564d;

    /* JADX INFO: renamed from: e */
    private float[] f1565e;

    /* JADX INFO: renamed from: f */
    private float[] f1566f;

    /* JADX INFO: renamed from: g */
    private float[] f1567g;

    /* JADX INFO: renamed from: h */
    private int[] f1568h;

    /* JADX INFO: renamed from: i */
    private int[] f1569i;

    /* JADX INFO: renamed from: j */
    private int[] f1570j;

    /* JADX INFO: renamed from: k */
    private int f1571k;

    /* JADX INFO: renamed from: l */
    private VelocityTracker f1572l;

    /* JADX INFO: renamed from: m */
    private float f1573m;

    /* JADX INFO: renamed from: n */
    private float f1574n;

    /* JADX INFO: renamed from: o */
    private int f1575o;

    /* JADX INFO: renamed from: p */
    private final int f1576p;

    /* JADX INFO: renamed from: q */
    private int f1577q;

    /* JADX INFO: renamed from: r */
    private OverScroller f1578r;

    /* JADX INFO: renamed from: s */
    private final c f1579s;

    /* JADX INFO: renamed from: t */
    private View f1580t;

    /* JADX INFO: renamed from: u */
    private boolean f1581u;

    /* JADX INFO: renamed from: v */
    private final ViewGroup f1582v;

    /* JADX INFO: renamed from: c */
    private int f1563c = -1;

    /* JADX INFO: renamed from: w */
    private final Runnable f1583w = new b();

    /* JADX INFO: renamed from: N.c$a */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: N.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0435c.this.m1571K(0);
        }
    }

    private C0435c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1582v = viewGroup;
        this.f1579s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i3 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1576p = i3;
        this.f1575o = i3;
        this.f1562b = viewConfiguration.getScaledTouchSlop();
        this.f1573m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1574n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1578r = new OverScroller(context, f1560x);
    }

    /* JADX INFO: renamed from: D */
    private boolean m1545D(int i3) {
        if (m1568C(i3)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: G */
    private void m1546G() {
        this.f1572l.computeCurrentVelocity(1000, this.f1573m);
        m1560p(m1552g(this.f1572l.getXVelocity(this.f1563c), this.f1574n, this.f1573m), m1552g(this.f1572l.getYVelocity(this.f1563c), this.f1574n, this.f1573m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [N.c$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    private void m1547H(float f3, float f4, int i3) {
        boolean zM1550c = m1550c(f3, f4, i3, 1);
        ?? r02 = zM1550c;
        if (m1550c(f4, f3, i3, 4)) {
            r02 = (zM1550c ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (m1550c(f3, f4, i3, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (m1550c(f4, f3, i3, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f1569i;
            iArr[i3] = iArr[i3] | r04;
            this.f1579s.mo1594f(r04, i3);
        }
    }

    /* JADX INFO: renamed from: I */
    private void m1548I(float f3, float f4, int i3) {
        m1563s(i3);
        float[] fArr = this.f1564d;
        this.f1566f[i3] = f3;
        fArr[i3] = f3;
        float[] fArr2 = this.f1565e;
        this.f1567g[i3] = f4;
        fArr2[i3] = f4;
        this.f1568h[i3] = m1565y((int) f3, (int) f4);
        this.f1571k |= 1 << i3;
    }

    /* JADX INFO: renamed from: J */
    private void m1549J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (m1545D(pointerId)) {
                float x2 = motionEvent.getX(i3);
                float y2 = motionEvent.getY(i3);
                this.f1566f[pointerId] = x2;
                this.f1567g[pointerId] = y2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m1550c(float f3, float f4, int i3, int i4) {
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        if ((this.f1568h[i3] & i4) == i4 && (this.f1577q & i4) != 0 && (this.f1570j[i3] & i4) != i4 && (this.f1569i[i3] & i4) != i4) {
            int i5 = this.f1562b;
            if (fAbs > i5 || fAbs2 > i5) {
                if (fAbs < fAbs2 * 0.5f && this.f1579s.mo1595g(i4)) {
                    int[] iArr = this.f1570j;
                    iArr[i3] = iArr[i3] | i4;
                    return false;
                }
                if ((this.f1569i[i3] & i4) == 0 && fAbs > this.f1562b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private boolean m1551f(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f1579s.mo1592d(view) > 0;
        boolean z3 = this.f1579s.mo1593e(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f3) > ((float) this.f1562b) : z3 && Math.abs(f4) > ((float) this.f1562b);
        }
        float f5 = (f3 * f3) + (f4 * f4);
        int i3 = this.f1562b;
        return f5 > ((float) (i3 * i3));
    }

    /* JADX INFO: renamed from: g */
    private float m1552g(float f3, float f4, float f5) {
        float fAbs = Math.abs(f3);
        if (fAbs < f4) {
            return 0.0f;
        }
        return fAbs > f5 ? f3 > 0.0f ? f5 : -f5 : f3;
    }

    /* JADX INFO: renamed from: h */
    private int m1553h(int i3, int i4, int i5) {
        int iAbs = Math.abs(i3);
        if (iAbs < i4) {
            return 0;
        }
        return iAbs > i5 ? i3 > 0 ? i5 : -i5 : i3;
    }

    /* JADX INFO: renamed from: i */
    private void m1554i() {
        float[] fArr = this.f1564d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f1565e, 0.0f);
        Arrays.fill(this.f1566f, 0.0f);
        Arrays.fill(this.f1567g, 0.0f);
        Arrays.fill(this.f1568h, 0);
        Arrays.fill(this.f1569i, 0);
        Arrays.fill(this.f1570j, 0);
        this.f1571k = 0;
    }

    /* JADX INFO: renamed from: j */
    private void m1555j(int i3) {
        if (this.f1564d == null || !m1568C(i3)) {
            return;
        }
        this.f1564d[i3] = 0.0f;
        this.f1565e[i3] = 0.0f;
        this.f1566f[i3] = 0.0f;
        this.f1567g[i3] = 0.0f;
        this.f1568h[i3] = 0;
        this.f1569i[i3] = 0;
        this.f1570j[i3] = 0;
        this.f1571k = (~(1 << i3)) & this.f1571k;
    }

    /* JADX INFO: renamed from: k */
    private int m1556k(int i3, int i4, int i5) {
        if (i3 == 0) {
            return 0;
        }
        int width = this.f1582v.getWidth();
        float f3 = width / 2;
        float fM1561q = f3 + (m1561q(Math.min(1.0f, Math.abs(i3) / width)) * f3);
        int iAbs = Math.abs(i4);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM1561q / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: l */
    private int m1557l(View view, int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float f5;
        float f6;
        int iM1553h = m1553h(i5, (int) this.f1574n, (int) this.f1573m);
        int iM1553h2 = m1553h(i6, (int) this.f1574n, (int) this.f1573m);
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i4);
        int iAbs3 = Math.abs(iM1553h);
        int iAbs4 = Math.abs(iM1553h2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (iM1553h != 0) {
            f3 = iAbs3;
            f4 = i7;
        } else {
            f3 = iAbs;
            f4 = i8;
        }
        float f7 = f3 / f4;
        if (iM1553h2 != 0) {
            f5 = iAbs4;
            f6 = i7;
        } else {
            f5 = iAbs2;
            f6 = i8;
        }
        return (int) ((m1556k(i3, iM1553h, this.f1579s.mo1592d(view)) * f7) + (m1556k(i4, iM1553h2, this.f1579s.mo1593e(view)) * (f5 / f6)));
    }

    /* JADX INFO: renamed from: n */
    public static C0435c m1558n(ViewGroup viewGroup, float f3, c cVar) {
        C0435c c0435cM1559o = m1559o(viewGroup, cVar);
        c0435cM1559o.f1562b = (int) (c0435cM1559o.f1562b * (1.0f / f3));
        return c0435cM1559o;
    }

    /* JADX INFO: renamed from: o */
    public static C0435c m1559o(ViewGroup viewGroup, c cVar) {
        return new C0435c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* JADX INFO: renamed from: p */
    private void m1560p(float f3, float f4) {
        this.f1581u = true;
        this.f1579s.mo1600l(this.f1580t, f3, f4);
        this.f1581u = false;
        if (this.f1561a == 1) {
            m1571K(0);
        }
    }

    /* JADX INFO: renamed from: q */
    private float m1561q(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: r */
    private void m1562r(int i3, int i4, int i5, int i6) {
        int left = this.f1580t.getLeft();
        int top = this.f1580t.getTop();
        if (i5 != 0) {
            i3 = this.f1579s.mo1589a(this.f1580t, i3, i5);
            AbstractC0268W.m750S(this.f1580t, i3 - left);
        }
        int i7 = i3;
        if (i6 != 0) {
            i4 = this.f1579s.mo1590b(this.f1580t, i4, i6);
            AbstractC0268W.m751T(this.f1580t, i4 - top);
        }
        int i8 = i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        this.f1579s.mo1599k(this.f1580t, i7, i8, i7 - left, i8 - top);
    }

    /* JADX INFO: renamed from: s */
    private void m1563s(int i3) {
        float[] fArr = this.f1564d;
        if (fArr == null || fArr.length <= i3) {
            int i4 = i3 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1565e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1566f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1567g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1568h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1569i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1570j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1564d = fArr2;
            this.f1565e = fArr3;
            this.f1566f = fArr4;
            this.f1567g = fArr5;
            this.f1568h = iArr;
            this.f1569i = iArr2;
            this.f1570j = iArr3;
        }
    }

    /* JADX INFO: renamed from: u */
    private boolean m1564u(int i3, int i4, int i5, int i6) {
        int left = this.f1580t.getLeft();
        int top = this.f1580t.getTop();
        int i7 = i3 - left;
        int i8 = i4 - top;
        if (i7 == 0 && i8 == 0) {
            this.f1578r.abortAnimation();
            m1571K(0);
            return false;
        }
        this.f1578r.startScroll(left, top, i7, i8, m1557l(this.f1580t, i7, i8, i5, i6));
        m1571K(2);
        return true;
    }

    /* JADX INFO: renamed from: y */
    private int m1565y(int i3, int i4) {
        int i5 = i3 < this.f1582v.getLeft() + this.f1575o ? 1 : 0;
        if (i4 < this.f1582v.getTop() + this.f1575o) {
            i5 |= 4;
        }
        if (i3 > this.f1582v.getRight() - this.f1575o) {
            i5 |= 2;
        }
        return i4 > this.f1582v.getBottom() - this.f1575o ? i5 | 8 : i5;
    }

    /* JADX INFO: renamed from: A */
    public int m1566A() {
        return this.f1561a;
    }

    /* JADX INFO: renamed from: B */
    public boolean m1567B(int i3, int i4) {
        return m1569E(this.f1580t, i3, i4);
    }

    /* JADX INFO: renamed from: C */
    public boolean m1568C(int i3) {
        return ((1 << i3) & this.f1571k) != 0;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1569E(View view, int i3, int i4) {
        return view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom();
    }

    /* JADX INFO: renamed from: F */
    public void m1570F(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1579a();
        }
        if (this.f1572l == null) {
            this.f1572l = VelocityTracker.obtain();
        }
        this.f1572l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM1584t = m1584t((int) x2, (int) y2);
            m1548I(x2, y2, pointerId);
            m1578R(viewM1584t, pointerId);
            int i5 = this.f1568h[pointerId];
            int i6 = this.f1577q;
            if ((i5 & i6) != 0) {
                this.f1579s.mo1596h(i5 & i6, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1561a == 1) {
                m1546G();
            }
            m1579a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1561a == 1) {
                if (m1545D(this.f1563c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1563c);
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float y3 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f1566f;
                    int i7 = this.f1563c;
                    int i8 = (int) (x3 - fArr[i7]);
                    int i9 = (int) (y3 - this.f1567g[i7]);
                    m1562r(this.f1580t.getLeft() + i8, this.f1580t.getTop() + i9, i8, i9);
                    m1549J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i4 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i4);
                if (m1545D(pointerId2)) {
                    float x4 = motionEvent.getX(i4);
                    float y4 = motionEvent.getY(i4);
                    float f3 = x4 - this.f1564d[pointerId2];
                    float f4 = y4 - this.f1565e[pointerId2];
                    m1547H(f3, f4, pointerId2);
                    if (this.f1561a != 1) {
                        View viewM1584t2 = m1584t((int) x4, (int) y4);
                        if (m1551f(viewM1584t2, f3, f4) && m1578R(viewM1584t2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i4++;
            }
            m1549J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f1561a == 1) {
                m1560p(0.0f, 0.0f);
            }
            m1579a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y5 = motionEvent.getY(actionIndex);
            m1548I(x5, y5, pointerId3);
            if (this.f1561a != 0) {
                if (m1567B((int) x5, (int) y5)) {
                    m1578R(this.f1580t, pointerId3);
                    return;
                }
                return;
            } else {
                m1578R(m1584t((int) x5, (int) y5), pointerId3);
                int i10 = this.f1568h[pointerId3];
                int i11 = this.f1577q;
                if ((i10 & i11) != 0) {
                    this.f1579s.mo1596h(i10 & i11, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1561a == 1 && pointerId4 == this.f1563c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i4 >= pointerCount2) {
                    i3 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i4);
                if (pointerId5 != this.f1563c) {
                    View viewM1584t3 = m1584t((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                    View view = this.f1580t;
                    if (viewM1584t3 == view && m1578R(view, pointerId5)) {
                        i3 = this.f1563c;
                        break;
                    }
                }
                i4++;
            }
            if (i3 == -1) {
                m1546G();
            }
        }
        m1555j(pointerId4);
    }

    /* JADX INFO: renamed from: K */
    void m1571K(int i3) {
        this.f1582v.removeCallbacks(this.f1583w);
        if (this.f1561a != i3) {
            this.f1561a = i3;
            this.f1579s.mo1598j(i3);
            if (this.f1561a == 0) {
                this.f1580t = null;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m1572L(int i3) {
        this.f1575o = i3;
    }

    /* JADX INFO: renamed from: M */
    public void m1573M(int i3) {
        this.f1577q = i3;
    }

    /* JADX INFO: renamed from: N */
    public void m1574N(float f3) {
        this.f1574n = f3;
    }

    /* JADX INFO: renamed from: O */
    public boolean m1575O(int i3, int i4) {
        if (this.f1581u) {
            return m1564u(i3, i4, (int) this.f1572l.getXVelocity(this.f1563c), (int) this.f1572l.getYVelocity(this.f1563c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1576P(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039N.C0435c.m1576P(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: Q */
    public boolean m1577Q(View view, int i3, int i4) {
        this.f1580t = view;
        this.f1563c = -1;
        boolean zM1564u = m1564u(i3, i4, 0, 0);
        if (!zM1564u && this.f1561a == 0 && this.f1580t != null) {
            this.f1580t = null;
        }
        return zM1564u;
    }

    /* JADX INFO: renamed from: R */
    boolean m1578R(View view, int i3) {
        if (view == this.f1580t && this.f1563c == i3) {
            return true;
        }
        if (view == null || !this.f1579s.mo1601m(view, i3)) {
            return false;
        }
        this.f1563c = i3;
        m1580b(view, i3);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m1579a() {
        this.f1563c = -1;
        m1554i();
        VelocityTracker velocityTracker = this.f1572l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1572l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1580b(View view, int i3) {
        if (view.getParent() == this.f1582v) {
            this.f1580t = view;
            this.f1563c = i3;
            this.f1579s.mo1597i(view, i3);
            m1571K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1582v + ")");
    }

    /* JADX INFO: renamed from: d */
    public boolean m1581d(int i3) {
        int length = this.f1564d.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (m1582e(i3, i4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m1582e(int i3, int i4) {
        if (!m1568C(i4)) {
            return false;
        }
        boolean z2 = (i3 & 1) == 1;
        boolean z3 = (i3 & 2) == 2;
        float f3 = this.f1566f[i4] - this.f1564d[i4];
        float f4 = this.f1567g[i4] - this.f1565e[i4];
        if (!z2 || !z3) {
            return z2 ? Math.abs(f3) > ((float) this.f1562b) : z3 && Math.abs(f4) > ((float) this.f1562b);
        }
        float f5 = (f3 * f3) + (f4 * f4);
        int i5 = this.f1562b;
        return f5 > ((float) (i5 * i5));
    }

    /* JADX INFO: renamed from: m */
    public boolean m1583m(boolean z2) {
        if (this.f1561a == 2) {
            boolean zComputeScrollOffset = this.f1578r.computeScrollOffset();
            int currX = this.f1578r.getCurrX();
            int currY = this.f1578r.getCurrY();
            int left = currX - this.f1580t.getLeft();
            int top = currY - this.f1580t.getTop();
            if (left != 0) {
                AbstractC0268W.m750S(this.f1580t, left);
            }
            if (top != 0) {
                AbstractC0268W.m751T(this.f1580t, top);
            }
            if (left != 0 || top != 0) {
                this.f1579s.mo1599k(this.f1580t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f1578r.getFinalX() && currY == this.f1578r.getFinalY()) {
                this.f1578r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z2) {
                    this.f1582v.post(this.f1583w);
                } else {
                    m1571K(0);
                }
            }
        }
        return this.f1561a == 2;
    }

    /* JADX INFO: renamed from: t */
    public View m1584t(int i3, int i4) {
        for (int childCount = this.f1582v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1582v.getChildAt(this.f1579s.m1591c(childCount));
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public View m1585v() {
        return this.f1580t;
    }

    /* JADX INFO: renamed from: w */
    public int m1586w() {
        return this.f1576p;
    }

    /* JADX INFO: renamed from: x */
    public int m1587x() {
        return this.f1575o;
    }

    /* JADX INFO: renamed from: z */
    public int m1588z() {
        return this.f1562b;
    }

    /* JADX INFO: renamed from: N.c$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo1589a(View view, int i3, int i4);

        /* JADX INFO: renamed from: b */
        public abstract int mo1590b(View view, int i3, int i4);

        /* JADX INFO: renamed from: d */
        public int mo1592d(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public int mo1593e(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public boolean mo1595g(int i3) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo1598j(int i3);

        /* JADX INFO: renamed from: k */
        public abstract void mo1599k(View view, int i3, int i4, int i5, int i6);

        /* JADX INFO: renamed from: l */
        public abstract void mo1600l(View view, float f3, float f4);

        /* JADX INFO: renamed from: m */
        public abstract boolean mo1601m(View view, int i3);

        /* JADX INFO: renamed from: c */
        public int m1591c(int i3) {
            return i3;
        }

        /* JADX INFO: renamed from: f */
        public void mo1594f(int i3, int i4) {
        }

        /* JADX INFO: renamed from: h */
        public void mo1596h(int i3, int i4) {
        }

        /* JADX INFO: renamed from: i */
        public void mo1597i(View view, int i3) {
        }
    }
}
