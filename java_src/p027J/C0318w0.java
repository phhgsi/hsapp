package p027J;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p018G.AbstractC0161j;
import p024I.AbstractC0206c;
import p024I.AbstractC0211h;
import p167z.C2572e;

/* JADX INFO: renamed from: J.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C0318w0 {

    /* JADX INFO: renamed from: b */
    public static final C0318w0 f1386b;

    /* JADX INFO: renamed from: a */
    private final o f1387a;

    /* JADX INFO: renamed from: J.w0$d */
    private static class d extends c {
        d() {
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: c */
        void mo1111c(int i3, C2572e c2572e) {
            this.f1395c.setInsets(q.m1143a(i3), c2572e.m12274e());
        }

        d(C0318w0 c0318w0) {
            super(c0318w0);
        }
    }

    /* JADX INFO: renamed from: J.w0$e */
    private static class e extends d {
        e() {
        }

        e(C0318w0 c0318w0) {
            super(c0318w0);
        }
    }

    /* JADX INFO: renamed from: J.w0$f */
    private static class f extends e {
        f() {
        }

        @Override // p027J.C0318w0.d, p027J.C0318w0.g
        /* JADX INFO: renamed from: c */
        void mo1111c(int i3, C2572e c2572e) {
            this.f1395c.setInsets(r.m1144a(i3), c2572e.m12274e());
        }

        f(C0318w0 c0318w0) {
            super(c0318w0);
        }
    }

    /* JADX INFO: renamed from: J.w0$g */
    private static class g {

        /* JADX INFO: renamed from: a */
        private final C0318w0 f1396a;

        /* JADX INFO: renamed from: b */
        C2572e[] f1397b;

        g() {
            this(new C0318w0((C0318w0) null));
        }

        /* JADX INFO: renamed from: a */
        protected final void m1112a() {
            C2572e[] c2572eArr = this.f1397b;
            if (c2572eArr != null) {
                C2572e c2572eM1082f = c2572eArr[p.m1140b(1)];
                C2572e c2572eM1082f2 = this.f1397b[p.m1140b(2)];
                if (c2572eM1082f2 == null) {
                    c2572eM1082f2 = this.f1396a.m1082f(2);
                }
                if (c2572eM1082f == null) {
                    c2572eM1082f = this.f1396a.m1082f(1);
                }
                mo1107g(C2572e.m12270a(c2572eM1082f, c2572eM1082f2));
                C2572e c2572e = this.f1397b[p.m1140b(16)];
                if (c2572e != null) {
                    mo1109f(c2572e);
                }
                C2572e c2572e2 = this.f1397b[p.m1140b(32)];
                if (c2572e2 != null) {
                    mo1108d(c2572e2);
                }
                C2572e c2572e3 = this.f1397b[p.m1140b(64)];
                if (c2572e3 != null) {
                    mo1110h(c2572e3);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        abstract C0318w0 mo1105b();

        /* JADX INFO: renamed from: c */
        void mo1111c(int i3, C2572e c2572e) {
            if (this.f1397b == null) {
                this.f1397b = new C2572e[10];
            }
            for (int i4 = 1; i4 <= 512; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    this.f1397b[p.m1140b(i4)] = c2572e;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        abstract void mo1106e(C2572e c2572e);

        /* JADX INFO: renamed from: g */
        abstract void mo1107g(C2572e c2572e);

        g(C0318w0 c0318w0) {
            this.f1396a = c0318w0;
        }

        /* JADX INFO: renamed from: d */
        void mo1108d(C2572e c2572e) {
        }

        /* JADX INFO: renamed from: f */
        void mo1109f(C2572e c2572e) {
        }

        /* JADX INFO: renamed from: h */
        void mo1110h(C2572e c2572e) {
        }
    }

    /* JADX INFO: renamed from: J.w0$j */
    private static class j extends i {
        j(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: a */
        C0318w0 mo1134a() {
            return C0318w0.m1075y(this.f1403c.consumeDisplayCutout());
        }

        @Override // p027J.C0318w0.h, p027J.C0318w0.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f1403c, jVar.f1403c) && Objects.equals(this.f1407g, jVar.f1407g) && h.m1117z(this.f1408h, jVar.f1408h);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: f */
        C0307r mo1135f() {
            return C0307r.m1042e(this.f1403c.getDisplayCutout());
        }

        @Override // p027J.C0318w0.o
        public int hashCode() {
            return this.f1403c.hashCode();
        }

        j(C0318w0 c0318w0, j jVar) {
            super(c0318w0, jVar);
        }
    }

    /* JADX INFO: renamed from: J.w0$l */
    private static class l extends k {

        /* JADX INFO: renamed from: r */
        static final C0318w0 f1413r = C0318w0.m1075y(WindowInsets.CONSUMED);

        l(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
        }

        @Override // p027J.C0318w0.h, p027J.C0318w0.o
        /* JADX INFO: renamed from: g */
        public C2572e mo1120g(int i3) {
            return C2572e.m12273d(this.f1403c.getInsets(q.m1143a(i3)));
        }

        l(C0318w0 c0318w0, l lVar) {
            super(c0318w0, lVar);
        }

        @Override // p027J.C0318w0.h, p027J.C0318w0.o
        /* JADX INFO: renamed from: d */
        final void mo1118d(View view) {
        }
    }

    /* JADX INFO: renamed from: J.w0$m */
    private static class m extends l {
        m(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
        }

        m(C0318w0 c0318w0, m mVar) {
            super(c0318w0, mVar);
        }
    }

    /* JADX INFO: renamed from: J.w0$n */
    private static class n extends m {

        /* JADX INFO: renamed from: s */
        static final C0318w0 f1414s = C0318w0.m1075y(WindowInsets.CONSUMED);

        n(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
        }

        @Override // p027J.C0318w0.l, p027J.C0318w0.h, p027J.C0318w0.o
        /* JADX INFO: renamed from: g */
        public C2572e mo1120g(int i3) {
            return C2572e.m12273d(this.f1403c.getInsets(r.m1144a(i3)));
        }

        n(C0318w0 c0318w0, n nVar) {
            super(c0318w0, nVar);
        }
    }

    /* JADX INFO: renamed from: J.w0$p */
    public static final class p {
        /* JADX INFO: renamed from: a */
        public static int m1139a() {
            return 8;
        }

        /* JADX INFO: renamed from: b */
        static int m1140b(int i3) {
            if (i3 == 1) {
                return 0;
            }
            if (i3 == 2) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            if (i3 == 8) {
                return 3;
            }
            if (i3 == 16) {
                return 4;
            }
            if (i3 == 32) {
                return 5;
            }
            if (i3 == 64) {
                return 6;
            }
            if (i3 == 128) {
                return 7;
            }
            if (i3 == 256) {
                return 8;
            }
            if (i3 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i3);
        }

        /* JADX INFO: renamed from: c */
        public static int m1141c() {
            return 32;
        }

        /* JADX INFO: renamed from: d */
        public static int m1142d() {
            return 519;
        }
    }

    /* JADX INFO: renamed from: J.w0$q */
    private static final class q {
        /* JADX INFO: renamed from: a */
        static int m1143a(int i3) {
            int iStatusBars;
            int i4 = 0;
            for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                if ((i3 & i5) != 0) {
                    if (i5 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i4 |= iStatusBars;
                }
            }
            return i4;
        }
    }

    /* JADX INFO: renamed from: J.w0$r */
    private static final class r {
        /* JADX INFO: renamed from: a */
        static int m1144a(int i3) {
            int iStatusBars;
            int i4 = 0;
            for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                if ((i3 & i5) != 0) {
                    if (i5 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i5 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i4 |= iStatusBars;
                }
            }
            return i4;
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f1386b = n.f1414s;
        } else if (i3 >= 30) {
            f1386b = l.f1413r;
        } else {
            f1386b = o.f1415b;
        }
    }

    private C0318w0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f1387a = new n(this, windowInsets);
            return;
        }
        if (i3 >= 31) {
            this.f1387a = new m(this, windowInsets);
            return;
        }
        if (i3 >= 30) {
            this.f1387a = new l(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f1387a = new k(this, windowInsets);
        } else if (i3 >= 28) {
            this.f1387a = new j(this, windowInsets);
        } else {
            this.f1387a = new i(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: p */
    static C2572e m1074p(C2572e c2572e, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(0, c2572e.f11899a - i3);
        int iMax2 = Math.max(0, c2572e.f11900b - i4);
        int iMax3 = Math.max(0, c2572e.f11901c - i5);
        int iMax4 = Math.max(0, c2572e.f11902d - i6);
        return (iMax == i3 && iMax2 == i4 && iMax3 == i5 && iMax4 == i6) ? c2572e : C2572e.m12271b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: y */
    public static C0318w0 m1075y(WindowInsets windowInsets) {
        return m1076z(windowInsets, null);
    }

    /* JADX INFO: renamed from: z */
    public static C0318w0 m1076z(WindowInsets windowInsets, View view) {
        C0318w0 c0318w0 = new C0318w0((WindowInsets) AbstractC0211h.m610g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0318w0.m1096u(AbstractC0268W.m735D(view));
            c0318w0.m1080d(view.getRootView());
            c0318w0.m1098w(view.getWindowSystemUiVisibility());
        }
        return c0318w0;
    }

    /* JADX INFO: renamed from: a */
    public C0318w0 m1077a() {
        return this.f1387a.mo1134a();
    }

    /* JADX INFO: renamed from: b */
    public C0318w0 m1078b() {
        return this.f1387a.mo1129b();
    }

    /* JADX INFO: renamed from: c */
    public C0318w0 m1079c() {
        return this.f1387a.mo1130c();
    }

    /* JADX INFO: renamed from: d */
    void m1080d(View view) {
        this.f1387a.mo1118d(view);
    }

    /* JADX INFO: renamed from: e */
    public C0307r m1081e() {
        return this.f1387a.mo1135f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0318w0) {
            return AbstractC0206c.m596a(this.f1387a, ((C0318w0) obj).f1387a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C2572e m1082f(int i3) {
        return this.f1387a.mo1120g(i3);
    }

    /* JADX INFO: renamed from: g */
    public C2572e m1083g() {
        return this.f1387a.mo1131i();
    }

    /* JADX INFO: renamed from: h */
    public C2572e m1084h() {
        return this.f1387a.mo1137j();
    }

    public int hashCode() {
        o oVar = this.f1387a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public int m1085i() {
        return this.f1387a.mo1121k().f11902d;
    }

    /* JADX INFO: renamed from: j */
    public int m1086j() {
        return this.f1387a.mo1121k().f11899a;
    }

    /* JADX INFO: renamed from: k */
    public int m1087k() {
        return this.f1387a.mo1121k().f11901c;
    }

    /* JADX INFO: renamed from: l */
    public int m1088l() {
        return this.f1387a.mo1121k().f11900b;
    }

    /* JADX INFO: renamed from: m */
    public C2572e m1089m() {
        return this.f1387a.mo1121k();
    }

    /* JADX INFO: renamed from: n */
    public boolean m1090n() {
        return !this.f1387a.mo1121k().equals(C2572e.f11898e);
    }

    /* JADX INFO: renamed from: o */
    public C0318w0 m1091o(int i3, int i4, int i5, int i6) {
        return this.f1387a.mo1122m(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: q */
    public boolean m1092q() {
        return this.f1387a.mo1132n();
    }

    /* JADX INFO: renamed from: r */
    public C0318w0 m1093r(int i3, int i4, int i5, int i6) {
        return new a(this).m1103d(C2572e.m12271b(i3, i4, i5, i6)).m1100a();
    }

    /* JADX INFO: renamed from: s */
    void m1094s(C2572e[] c2572eArr) {
        this.f1387a.mo1124p(c2572eArr);
    }

    /* JADX INFO: renamed from: t */
    void m1095t(C2572e c2572e) {
        this.f1387a.mo1125q(c2572e);
    }

    /* JADX INFO: renamed from: u */
    void m1096u(C0318w0 c0318w0) {
        this.f1387a.mo1126r(c0318w0);
    }

    /* JADX INFO: renamed from: v */
    void m1097v(C2572e c2572e) {
        this.f1387a.mo1133s(c2572e);
    }

    /* JADX INFO: renamed from: w */
    void m1098w(int i3) {
        this.f1387a.mo1127t(i3);
    }

    /* JADX INFO: renamed from: x */
    public WindowInsets m1099x() {
        o oVar = this.f1387a;
        if (oVar instanceof h) {
            return ((h) oVar).f1403c;
        }
        return null;
    }

    /* JADX INFO: renamed from: J.w0$b */
    private static class b extends g {

        /* JADX INFO: renamed from: e */
        private static Field f1389e = null;

        /* JADX INFO: renamed from: f */
        private static boolean f1390f = false;

        /* JADX INFO: renamed from: g */
        private static Constructor f1391g = null;

        /* JADX INFO: renamed from: h */
        private static boolean f1392h = false;

        /* JADX INFO: renamed from: c */
        private WindowInsets f1393c;

        /* JADX INFO: renamed from: d */
        private C2572e f1394d;

        b() {
            this.f1393c = m1104i();
        }

        /* JADX INFO: renamed from: i */
        private static WindowInsets m1104i() {
            if (!f1390f) {
                try {
                    f1389e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
                }
                f1390f = true;
            }
            Field field = f1389e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
                }
            }
            if (!f1392h) {
                try {
                    f1391g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
                }
                f1392h = true;
            }
            Constructor constructor = f1391g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
                }
            }
            return null;
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: b */
        C0318w0 mo1105b() {
            m1112a();
            C0318w0 c0318w0M1075y = C0318w0.m1075y(this.f1393c);
            c0318w0M1075y.m1094s(this.f1397b);
            c0318w0M1075y.m1097v(this.f1394d);
            return c0318w0M1075y;
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: e */
        void mo1106e(C2572e c2572e) {
            this.f1394d = c2572e;
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: g */
        void mo1107g(C2572e c2572e) {
            WindowInsets windowInsets = this.f1393c;
            if (windowInsets != null) {
                this.f1393c = windowInsets.replaceSystemWindowInsets(c2572e.f11899a, c2572e.f11900b, c2572e.f11901c, c2572e.f11902d);
            }
        }

        b(C0318w0 c0318w0) {
            super(c0318w0);
            this.f1393c = c0318w0.m1099x();
        }
    }

    /* JADX INFO: renamed from: J.w0$c */
    private static class c extends g {

        /* JADX INFO: renamed from: c */
        final WindowInsets.Builder f1395c;

        c() {
            this.f1395c = AbstractC0161j.m456a();
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: b */
        C0318w0 mo1105b() {
            m1112a();
            C0318w0 c0318w0M1075y = C0318w0.m1075y(this.f1395c.build());
            c0318w0M1075y.m1094s(this.f1397b);
            return c0318w0M1075y;
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: d */
        void mo1108d(C2572e c2572e) {
            this.f1395c.setMandatorySystemGestureInsets(c2572e.m12274e());
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: e */
        void mo1106e(C2572e c2572e) {
            this.f1395c.setStableInsets(c2572e.m12274e());
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: f */
        void mo1109f(C2572e c2572e) {
            this.f1395c.setSystemGestureInsets(c2572e.m12274e());
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: g */
        void mo1107g(C2572e c2572e) {
            this.f1395c.setSystemWindowInsets(c2572e.m12274e());
        }

        @Override // p027J.C0318w0.g
        /* JADX INFO: renamed from: h */
        void mo1110h(C2572e c2572e) {
            this.f1395c.setTappableElementInsets(c2572e.m12274e());
        }

        c(C0318w0 c0318w0) {
            WindowInsets.Builder builderM456a;
            super(c0318w0);
            WindowInsets windowInsetsM1099x = c0318w0.m1099x();
            if (windowInsetsM1099x != null) {
                builderM456a = AbstractC0230C0.m653a(windowInsetsM1099x);
            } else {
                builderM456a = AbstractC0161j.m456a();
            }
            this.f1395c = builderM456a;
        }
    }

    /* JADX INFO: renamed from: J.w0$i */
    private static class i extends h {

        /* JADX INFO: renamed from: n */
        private C2572e f1409n;

        i(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
            this.f1409n = null;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: b */
        C0318w0 mo1129b() {
            return C0318w0.m1075y(this.f1403c.consumeStableInsets());
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: c */
        C0318w0 mo1130c() {
            return C0318w0.m1075y(this.f1403c.consumeSystemWindowInsets());
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: i */
        final C2572e mo1131i() {
            if (this.f1409n == null) {
                this.f1409n = C2572e.m12271b(this.f1403c.getStableInsetLeft(), this.f1403c.getStableInsetTop(), this.f1403c.getStableInsetRight(), this.f1403c.getStableInsetBottom());
            }
            return this.f1409n;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: n */
        boolean mo1132n() {
            return this.f1403c.isConsumed();
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: s */
        public void mo1133s(C2572e c2572e) {
            this.f1409n = c2572e;
        }

        i(C0318w0 c0318w0, i iVar) {
            super(c0318w0, iVar);
            this.f1409n = null;
            this.f1409n = iVar.f1409n;
        }
    }

    /* JADX INFO: renamed from: J.w0$h */
    private static class h extends o {

        /* JADX INFO: renamed from: i */
        private static boolean f1398i = false;

        /* JADX INFO: renamed from: j */
        private static Method f1399j;

        /* JADX INFO: renamed from: k */
        private static Class f1400k;

        /* JADX INFO: renamed from: l */
        private static Field f1401l;

        /* JADX INFO: renamed from: m */
        private static Field f1402m;

        /* JADX INFO: renamed from: c */
        final WindowInsets f1403c;

        /* JADX INFO: renamed from: d */
        private C2572e[] f1404d;

        /* JADX INFO: renamed from: e */
        private C2572e f1405e;

        /* JADX INFO: renamed from: f */
        private C0318w0 f1406f;

        /* JADX INFO: renamed from: g */
        C2572e f1407g;

        /* JADX INFO: renamed from: h */
        int f1408h;

        h(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0);
            this.f1405e = null;
            this.f1403c = windowInsets;
        }

        /* JADX INFO: renamed from: u */
        private C2572e m1113u(int i3, boolean z2) {
            C2572e c2572eM12270a = C2572e.f11898e;
            for (int i4 = 1; i4 <= 512; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    c2572eM12270a = C2572e.m12270a(c2572eM12270a, m1128v(i4, z2));
                }
            }
            return c2572eM12270a;
        }

        /* JADX INFO: renamed from: w */
        private C2572e m1114w() {
            C0318w0 c0318w0 = this.f1406f;
            return c0318w0 != null ? c0318w0.m1083g() : C2572e.f11898e;
        }

        /* JADX INFO: renamed from: x */
        private C2572e m1115x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1398i) {
                m1116y();
            }
            Method method = f1399j;
            if (method != null && f1400k != null && f1401l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1401l.get(f1402m.get(objInvoke));
                    if (rect != null) {
                        return C2572e.m12272c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: y */
        private static void m1116y() {
            try {
                f1399j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1400k = cls;
                f1401l = cls.getDeclaredField("mVisibleInsets");
                f1402m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1401l.setAccessible(true);
                f1402m.setAccessible(true);
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
            f1398i = true;
        }

        /* JADX INFO: renamed from: z */
        static boolean m1117z(int i3, int i4) {
            return (i3 & 6) == (i4 & 6);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: d */
        void mo1118d(View view) {
            C2572e c2572eM1115x = m1115x(view);
            if (c2572eM1115x == null) {
                c2572eM1115x = C2572e.f11898e;
            }
            mo1125q(c2572eM1115x);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: e */
        void mo1119e(C0318w0 c0318w0) {
            c0318w0.m1096u(this.f1406f);
            c0318w0.m1095t(this.f1407g);
            c0318w0.m1098w(this.f1408h);
        }

        @Override // p027J.C0318w0.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f1407g, hVar.f1407g) && m1117z(this.f1408h, hVar.f1408h);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: g */
        public C2572e mo1120g(int i3) {
            return m1113u(i3, false);
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: k */
        final C2572e mo1121k() {
            if (this.f1405e == null) {
                this.f1405e = C2572e.m12271b(this.f1403c.getSystemWindowInsetLeft(), this.f1403c.getSystemWindowInsetTop(), this.f1403c.getSystemWindowInsetRight(), this.f1403c.getSystemWindowInsetBottom());
            }
            return this.f1405e;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: m */
        C0318w0 mo1122m(int i3, int i4, int i5, int i6) {
            a aVar = new a(C0318w0.m1075y(this.f1403c));
            aVar.m1103d(C0318w0.m1074p(mo1121k(), i3, i4, i5, i6));
            aVar.m1102c(C0318w0.m1074p(mo1131i(), i3, i4, i5, i6));
            return aVar.m1100a();
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: o */
        boolean mo1123o() {
            return this.f1403c.isRound();
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: p */
        public void mo1124p(C2572e[] c2572eArr) {
            this.f1404d = c2572eArr;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: q */
        void mo1125q(C2572e c2572e) {
            this.f1407g = c2572e;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: r */
        void mo1126r(C0318w0 c0318w0) {
            this.f1406f = c0318w0;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: t */
        void mo1127t(int i3) {
            this.f1408h = i3;
        }

        /* JADX INFO: renamed from: v */
        protected C2572e m1128v(int i3, boolean z2) {
            C2572e c2572eM1083g;
            int i4;
            if (i3 == 1) {
                return z2 ? C2572e.m12271b(0, Math.max(m1114w().f11900b, mo1121k().f11900b), 0, 0) : (this.f1408h & 4) != 0 ? C2572e.f11898e : C2572e.m12271b(0, mo1121k().f11900b, 0, 0);
            }
            if (i3 == 2) {
                if (z2) {
                    C2572e c2572eM1114w = m1114w();
                    C2572e c2572eMo1131i = mo1131i();
                    return C2572e.m12271b(Math.max(c2572eM1114w.f11899a, c2572eMo1131i.f11899a), 0, Math.max(c2572eM1114w.f11901c, c2572eMo1131i.f11901c), Math.max(c2572eM1114w.f11902d, c2572eMo1131i.f11902d));
                }
                if ((this.f1408h & 2) != 0) {
                    return C2572e.f11898e;
                }
                C2572e c2572eMo1121k = mo1121k();
                C0318w0 c0318w0 = this.f1406f;
                c2572eM1083g = c0318w0 != null ? c0318w0.m1083g() : null;
                int iMin = c2572eMo1121k.f11902d;
                if (c2572eM1083g != null) {
                    iMin = Math.min(iMin, c2572eM1083g.f11902d);
                }
                return C2572e.m12271b(c2572eMo1121k.f11899a, 0, c2572eMo1121k.f11901c, iMin);
            }
            if (i3 != 8) {
                if (i3 == 16) {
                    return mo1137j();
                }
                if (i3 == 32) {
                    return mo1136h();
                }
                if (i3 == 64) {
                    return mo1138l();
                }
                if (i3 != 128) {
                    return C2572e.f11898e;
                }
                C0318w0 c0318w02 = this.f1406f;
                C0307r c0307rM1081e = c0318w02 != null ? c0318w02.m1081e() : mo1135f();
                return c0307rM1081e != null ? C2572e.m12271b(c0307rM1081e.m1044b(), c0307rM1081e.m1046d(), c0307rM1081e.m1045c(), c0307rM1081e.m1043a()) : C2572e.f11898e;
            }
            C2572e[] c2572eArr = this.f1404d;
            c2572eM1083g = c2572eArr != null ? c2572eArr[p.m1140b(8)] : null;
            if (c2572eM1083g != null) {
                return c2572eM1083g;
            }
            C2572e c2572eMo1121k2 = mo1121k();
            C2572e c2572eM1114w2 = m1114w();
            int i5 = c2572eMo1121k2.f11902d;
            if (i5 > c2572eM1114w2.f11902d) {
                return C2572e.m12271b(0, 0, 0, i5);
            }
            C2572e c2572e = this.f1407g;
            return (c2572e == null || c2572e.equals(C2572e.f11898e) || (i4 = this.f1407g.f11902d) <= c2572eM1114w2.f11902d) ? C2572e.f11898e : C2572e.m12271b(0, 0, 0, i4);
        }

        h(C0318w0 c0318w0, h hVar) {
            this(c0318w0, new WindowInsets(hVar.f1403c));
        }
    }

    /* JADX INFO: renamed from: J.w0$k */
    private static class k extends j {

        /* JADX INFO: renamed from: o */
        private C2572e f1410o;

        /* JADX INFO: renamed from: p */
        private C2572e f1411p;

        /* JADX INFO: renamed from: q */
        private C2572e f1412q;

        k(C0318w0 c0318w0, WindowInsets windowInsets) {
            super(c0318w0, windowInsets);
            this.f1410o = null;
            this.f1411p = null;
            this.f1412q = null;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: h */
        C2572e mo1136h() {
            if (this.f1411p == null) {
                this.f1411p = C2572e.m12273d(this.f1403c.getMandatorySystemGestureInsets());
            }
            return this.f1411p;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: j */
        C2572e mo1137j() {
            if (this.f1410o == null) {
                this.f1410o = C2572e.m12273d(this.f1403c.getSystemGestureInsets());
            }
            return this.f1410o;
        }

        @Override // p027J.C0318w0.o
        /* JADX INFO: renamed from: l */
        C2572e mo1138l() {
            if (this.f1412q == null) {
                this.f1412q = C2572e.m12273d(this.f1403c.getTappableElementInsets());
            }
            return this.f1412q;
        }

        @Override // p027J.C0318w0.h, p027J.C0318w0.o
        /* JADX INFO: renamed from: m */
        C0318w0 mo1122m(int i3, int i4, int i5, int i6) {
            return C0318w0.m1075y(this.f1403c.inset(i3, i4, i5, i6));
        }

        k(C0318w0 c0318w0, k kVar) {
            super(c0318w0, kVar);
            this.f1410o = null;
            this.f1411p = null;
            this.f1412q = null;
        }

        @Override // p027J.C0318w0.i, p027J.C0318w0.o
        /* JADX INFO: renamed from: s */
        public void mo1133s(C2572e c2572e) {
        }
    }

    /* JADX INFO: renamed from: J.w0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final g f1388a;

        public a() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f1388a = new f();
                return;
            }
            if (i3 >= 31) {
                this.f1388a = new e();
                return;
            }
            if (i3 >= 30) {
                this.f1388a = new d();
            } else if (i3 >= 29) {
                this.f1388a = new c();
            } else {
                this.f1388a = new b();
            }
        }

        /* JADX INFO: renamed from: a */
        public C0318w0 m1100a() {
            return this.f1388a.mo1105b();
        }

        /* JADX INFO: renamed from: b */
        public a m1101b(int i3, C2572e c2572e) {
            this.f1388a.mo1111c(i3, c2572e);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m1102c(C2572e c2572e) {
            this.f1388a.mo1106e(c2572e);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m1103d(C2572e c2572e) {
            this.f1388a.mo1107g(c2572e);
            return this;
        }

        public a(C0318w0 c0318w0) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f1388a = new f(c0318w0);
                return;
            }
            if (i3 >= 31) {
                this.f1388a = new e(c0318w0);
                return;
            }
            if (i3 >= 30) {
                this.f1388a = new d(c0318w0);
            } else if (i3 >= 29) {
                this.f1388a = new c(c0318w0);
            } else {
                this.f1388a = new b(c0318w0);
            }
        }
    }

    public C0318w0(C0318w0 c0318w0) {
        if (c0318w0 != null) {
            o oVar = c0318w0.f1387a;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34 && (oVar instanceof n)) {
                this.f1387a = new n(this, (n) oVar);
            } else if (i3 >= 31 && (oVar instanceof m)) {
                this.f1387a = new m(this, (m) oVar);
            } else if (i3 >= 30 && (oVar instanceof l)) {
                this.f1387a = new l(this, (l) oVar);
            } else if (i3 >= 29 && (oVar instanceof k)) {
                this.f1387a = new k(this, (k) oVar);
            } else if (i3 >= 28 && (oVar instanceof j)) {
                this.f1387a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f1387a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f1387a = new h(this, (h) oVar);
            } else {
                this.f1387a = new o(this);
            }
            oVar.mo1119e(this);
            return;
        }
        this.f1387a = new o(this);
    }

    /* JADX INFO: renamed from: J.w0$o */
    private static class o {

        /* JADX INFO: renamed from: b */
        static final C0318w0 f1415b = new a().m1100a().m1077a().m1078b().m1079c();

        /* JADX INFO: renamed from: a */
        final C0318w0 f1416a;

        o(C0318w0 c0318w0) {
            this.f1416a = c0318w0;
        }

        /* JADX INFO: renamed from: a */
        C0318w0 mo1134a() {
            return this.f1416a;
        }

        /* JADX INFO: renamed from: b */
        C0318w0 mo1129b() {
            return this.f1416a;
        }

        /* JADX INFO: renamed from: c */
        C0318w0 mo1130c() {
            return this.f1416a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return mo1123o() == oVar.mo1123o() && mo1132n() == oVar.mo1132n() && AbstractC0206c.m596a(mo1121k(), oVar.mo1121k()) && AbstractC0206c.m596a(mo1131i(), oVar.mo1131i()) && AbstractC0206c.m596a(mo1135f(), oVar.mo1135f());
        }

        /* JADX INFO: renamed from: f */
        C0307r mo1135f() {
            return null;
        }

        /* JADX INFO: renamed from: g */
        C2572e mo1120g(int i3) {
            return C2572e.f11898e;
        }

        /* JADX INFO: renamed from: h */
        C2572e mo1136h() {
            return mo1121k();
        }

        public int hashCode() {
            return AbstractC0206c.m597b(Boolean.valueOf(mo1123o()), Boolean.valueOf(mo1132n()), mo1121k(), mo1131i(), mo1135f());
        }

        /* JADX INFO: renamed from: i */
        C2572e mo1131i() {
            return C2572e.f11898e;
        }

        /* JADX INFO: renamed from: j */
        C2572e mo1137j() {
            return mo1121k();
        }

        /* JADX INFO: renamed from: k */
        C2572e mo1121k() {
            return C2572e.f11898e;
        }

        /* JADX INFO: renamed from: l */
        C2572e mo1138l() {
            return mo1121k();
        }

        /* JADX INFO: renamed from: m */
        C0318w0 mo1122m(int i3, int i4, int i5, int i6) {
            return f1415b;
        }

        /* JADX INFO: renamed from: n */
        boolean mo1132n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        boolean mo1123o() {
            return false;
        }

        /* JADX INFO: renamed from: d */
        void mo1118d(View view) {
        }

        /* JADX INFO: renamed from: e */
        void mo1119e(C0318w0 c0318w0) {
        }

        /* JADX INFO: renamed from: p */
        public void mo1124p(C2572e[] c2572eArr) {
        }

        /* JADX INFO: renamed from: q */
        void mo1125q(C2572e c2572e) {
        }

        /* JADX INFO: renamed from: r */
        void mo1126r(C0318w0 c0318w0) {
        }

        /* JADX INFO: renamed from: s */
        public void mo1133s(C2572e c2572e) {
        }

        /* JADX INFO: renamed from: t */
        void mo1127t(int i3) {
        }
    }
}
