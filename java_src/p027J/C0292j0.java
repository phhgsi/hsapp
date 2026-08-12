package p027J;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p027J.C0318w0;
import p060U.C0530a;
import p158w.AbstractC2485c;
import p167z.C2572e;

/* JADX INFO: renamed from: J.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0292j0 {

    /* JADX INFO: renamed from: a */
    private e f1333a;

    /* JADX INFO: renamed from: J.j0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        C0318w0 f1336a;

        /* JADX INFO: renamed from: b */
        private final int f1337b;

        public b(int i3) {
            this.f1337b = i3;
        }

        /* JADX INFO: renamed from: a */
        public final int m994a() {
            return this.f1337b;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo995b(C0292j0 c0292j0);

        /* JADX INFO: renamed from: c */
        public abstract void mo996c(C0292j0 c0292j0);

        /* JADX INFO: renamed from: d */
        public abstract C0318w0 mo997d(C0318w0 c0318w0, List list);

        /* JADX INFO: renamed from: e */
        public abstract a mo998e(C0292j0 c0292j0, a aVar);
    }

    /* JADX INFO: renamed from: J.j0$c */
    private static class c extends e {

        /* JADX INFO: renamed from: f */
        private static final Interpolator f1338f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        private static final Interpolator f1339g = new C0530a();

        /* JADX INFO: renamed from: h */
        private static final Interpolator f1340h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        private static final Interpolator f1341i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: J.j0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            final b f1342a;

            /* JADX INFO: renamed from: b */
            private C0318w0 f1343b;

            /* JADX INFO: renamed from: J.j0$c$a$a, reason: collision with other inner class name */
            class C2607a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C0292j0 f1344a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C0318w0 f1345b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0318w0 f1346c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f1347d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ View f1348e;

                C2607a(C0292j0 c0292j0, C0318w0 c0318w0, C0318w0 c0318w02, int i3, View view) {
                    this.f1344a = c0292j0;
                    this.f1345b = c0318w0;
                    this.f1346c = c0318w02;
                    this.f1347d = i3;
                    this.f1348e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1344a.m989e(valueAnimator.getAnimatedFraction());
                    c.m1005k(this.f1348e, c.m1009o(this.f1345b, this.f1346c, this.f1344a.m987b(), this.f1347d), Collections.singletonList(this.f1344a));
                }
            }

            /* JADX INFO: renamed from: J.j0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C0292j0 f1350a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ View f1351b;

                b(C0292j0 c0292j0, View view) {
                    this.f1350a = c0292j0;
                    this.f1351b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f1350a.m989e(1.0f);
                    c.m1003i(this.f1351b, this.f1350a);
                }
            }

            /* JADX INFO: renamed from: J.j0$c$a$c, reason: collision with other inner class name */
            class RunnableC2608c implements Runnable {

                /* JADX INFO: renamed from: d */
                final /* synthetic */ View f1353d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ C0292j0 f1354e;

                /* JADX INFO: renamed from: f */
                final /* synthetic */ a f1355f;

                /* JADX INFO: renamed from: g */
                final /* synthetic */ ValueAnimator f1356g;

                RunnableC2608c(View view, C0292j0 c0292j0, a aVar, ValueAnimator valueAnimator) {
                    this.f1353d = view;
                    this.f1354e = c0292j0;
                    this.f1355f = aVar;
                    this.f1356g = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m1006l(this.f1353d, this.f1354e, this.f1355f);
                    this.f1356g.start();
                }
            }

            a(View view, b bVar) {
                this.f1342a = bVar;
                C0318w0 c0318w0M735D = AbstractC0268W.m735D(view);
                this.f1343b = c0318w0M735D != null ? new C0318w0.a(c0318w0M735D).m1100a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f1343b = C0318w0.m1076z(windowInsets, view);
                    return c.m1007m(view, windowInsets);
                }
                C0318w0 c0318w0M1076z = C0318w0.m1076z(windowInsets, view);
                if (this.f1343b == null) {
                    this.f1343b = AbstractC0268W.m735D(view);
                }
                if (this.f1343b == null) {
                    this.f1343b = c0318w0M1076z;
                    return c.m1007m(view, windowInsets);
                }
                b bVarM1008n = c.m1008n(view);
                if (bVarM1008n != null && Objects.equals(bVarM1008n.f1336a, c0318w0M1076z)) {
                    return c.m1007m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.m999e(c0318w0M1076z, this.f1343b, iArr, iArr2);
                int i3 = iArr[0];
                int i4 = iArr2[0];
                int i5 = i3 | i4;
                if (i5 == 0) {
                    this.f1343b = c0318w0M1076z;
                    return c.m1007m(view, windowInsets);
                }
                C0318w0 c0318w0 = this.f1343b;
                C0292j0 c0292j0 = new C0292j0(i5, c.m1001g(i3, i4), (C0318w0.p.m1139a() & i5) != 0 ? 160L : 250L);
                c0292j0.m989e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0292j0.m986a());
                a aVarM1000f = c.m1000f(c0318w0M1076z, c0318w0, i5);
                c.m1004j(view, c0292j0, c0318w0M1076z, false);
                duration.addUpdateListener(new C2607a(c0292j0, c0318w0M1076z, c0318w0, i5, view));
                duration.addListener(new b(c0292j0, view));
                ViewTreeObserverOnPreDrawListenerC0241I.m668a(view, new RunnableC2608c(view, c0292j0, aVarM1000f, duration));
                this.f1343b = c0318w0M1076z;
                return c.m1007m(view, windowInsets);
            }
        }

        c(int i3, Interpolator interpolator, long j3) {
            super(i3, interpolator, j3);
        }

        /* JADX INFO: renamed from: e */
        static void m999e(C0318w0 c0318w0, C0318w0 c0318w02, int[] iArr, int[] iArr2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                C2572e c2572eM1082f = c0318w0.m1082f(i3);
                C2572e c2572eM1082f2 = c0318w02.m1082f(i3);
                int i4 = c2572eM1082f.f11899a;
                int i5 = c2572eM1082f2.f11899a;
                boolean z2 = i4 > i5 || c2572eM1082f.f11900b > c2572eM1082f2.f11900b || c2572eM1082f.f11901c > c2572eM1082f2.f11901c || c2572eM1082f.f11902d > c2572eM1082f2.f11902d;
                if (z2 != (i4 < i5 || c2572eM1082f.f11900b < c2572eM1082f2.f11900b || c2572eM1082f.f11901c < c2572eM1082f2.f11901c || c2572eM1082f.f11902d < c2572eM1082f2.f11902d)) {
                    if (z2) {
                        iArr[0] = iArr[0] | i3;
                    } else {
                        iArr2[0] = iArr2[0] | i3;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        static a m1000f(C0318w0 c0318w0, C0318w0 c0318w02, int i3) {
            C2572e c2572eM1082f = c0318w0.m1082f(i3);
            C2572e c2572eM1082f2 = c0318w02.m1082f(i3);
            return new a(C2572e.m12271b(Math.min(c2572eM1082f.f11899a, c2572eM1082f2.f11899a), Math.min(c2572eM1082f.f11900b, c2572eM1082f2.f11900b), Math.min(c2572eM1082f.f11901c, c2572eM1082f2.f11901c), Math.min(c2572eM1082f.f11902d, c2572eM1082f2.f11902d)), C2572e.m12271b(Math.max(c2572eM1082f.f11899a, c2572eM1082f2.f11899a), Math.max(c2572eM1082f.f11900b, c2572eM1082f2.f11900b), Math.max(c2572eM1082f.f11901c, c2572eM1082f2.f11901c), Math.max(c2572eM1082f.f11902d, c2572eM1082f2.f11902d)));
        }

        /* JADX INFO: renamed from: g */
        static Interpolator m1001g(int i3, int i4) {
            if ((C0318w0.p.m1139a() & i3) != 0) {
                return f1338f;
            }
            if ((C0318w0.p.m1139a() & i4) != 0) {
                return f1339g;
            }
            if ((i3 & C0318w0.p.m1142d()) != 0) {
                return f1340h;
            }
            if ((C0318w0.p.m1142d() & i4) != 0) {
                return f1341i;
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        private static View.OnApplyWindowInsetsListener m1002h(View view, b bVar) {
            return new a(view, bVar);
        }

        /* JADX INFO: renamed from: i */
        static void m1003i(View view, C0292j0 c0292j0) {
            b bVarM1008n = m1008n(view);
            if (bVarM1008n != null) {
                bVarM1008n.mo995b(c0292j0);
                if (bVarM1008n.m994a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    m1003i(viewGroup.getChildAt(i3), c0292j0);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        static void m1004j(View view, C0292j0 c0292j0, C0318w0 c0318w0, boolean z2) {
            b bVarM1008n = m1008n(view);
            if (bVarM1008n != null) {
                bVarM1008n.f1336a = c0318w0;
                if (!z2) {
                    bVarM1008n.mo996c(c0292j0);
                    z2 = bVarM1008n.m994a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    m1004j(viewGroup.getChildAt(i3), c0292j0, c0318w0, z2);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        static void m1005k(View view, C0318w0 c0318w0, List list) {
            b bVarM1008n = m1008n(view);
            if (bVarM1008n != null) {
                c0318w0 = bVarM1008n.mo997d(c0318w0, list);
                if (bVarM1008n.m994a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    m1005k(viewGroup.getChildAt(i3), c0318w0, list);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        static void m1006l(View view, C0292j0 c0292j0, a aVar) {
            b bVarM1008n = m1008n(view);
            if (bVarM1008n != null) {
                bVarM1008n.mo998e(c0292j0, aVar);
                if (bVarM1008n.m994a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    m1006l(viewGroup.getChildAt(i3), c0292j0, aVar);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        static WindowInsets m1007m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC2485c.f11522M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: n */
        static b m1008n(View view) {
            Object tag = view.getTag(AbstractC2485c.f11529T);
            if (tag instanceof a) {
                return ((a) tag).f1342a;
            }
            return null;
        }

        /* JADX INFO: renamed from: o */
        static C0318w0 m1009o(C0318w0 c0318w0, C0318w0 c0318w02, float f3, int i3) {
            C0318w0.a aVar = new C0318w0.a(c0318w0);
            for (int i4 = 1; i4 <= 512; i4 <<= 1) {
                if ((i3 & i4) == 0) {
                    aVar.m1101b(i4, c0318w0.m1082f(i4));
                } else {
                    C2572e c2572eM1082f = c0318w0.m1082f(i4);
                    C2572e c2572eM1082f2 = c0318w02.m1082f(i4);
                    float f4 = 1.0f - f3;
                    aVar.m1101b(i4, C0318w0.m1074p(c2572eM1082f, (int) (((double) ((c2572eM1082f.f11899a - c2572eM1082f2.f11899a) * f4)) + 0.5d), (int) (((double) ((c2572eM1082f.f11900b - c2572eM1082f2.f11900b) * f4)) + 0.5d), (int) (((double) ((c2572eM1082f.f11901c - c2572eM1082f2.f11901c) * f4)) + 0.5d), (int) (((double) ((c2572eM1082f.f11902d - c2572eM1082f2.f11902d) * f4)) + 0.5d)));
                }
            }
            return aVar.m1100a();
        }

        /* JADX INFO: renamed from: p */
        static void m1010p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM1002h = bVar != null ? m1002h(view, bVar) : null;
            view.setTag(AbstractC2485c.f11529T, onApplyWindowInsetsListenerM1002h);
            if (view.getTag(AbstractC2485c.f11521L) == null && view.getTag(AbstractC2485c.f11522M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM1002h);
            }
        }
    }

    /* JADX INFO: renamed from: J.j0$e */
    private static class e {

        /* JADX INFO: renamed from: a */
        private final int f1363a;

        /* JADX INFO: renamed from: b */
        private float f1364b;

        /* JADX INFO: renamed from: c */
        private final Interpolator f1365c;

        /* JADX INFO: renamed from: d */
        private final long f1366d;

        /* JADX INFO: renamed from: e */
        private float f1367e = 1.0f;

        e(int i3, Interpolator interpolator, long j3) {
            this.f1363a = i3;
            this.f1365c = interpolator;
            this.f1366d = j3;
        }

        /* JADX INFO: renamed from: a */
        public long mo1015a() {
            return this.f1366d;
        }

        /* JADX INFO: renamed from: b */
        public float mo1016b() {
            Interpolator interpolator = this.f1365c;
            return interpolator != null ? interpolator.getInterpolation(this.f1364b) : this.f1364b;
        }

        /* JADX INFO: renamed from: c */
        public int mo1017c() {
            return this.f1363a;
        }

        /* JADX INFO: renamed from: d */
        public void mo1018d(float f3) {
            this.f1364b = f3;
        }
    }

    public C0292j0(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1333a = new d(i3, interpolator, j3);
        } else {
            this.f1333a = new c(i3, interpolator, j3);
        }
    }

    /* JADX INFO: renamed from: d */
    static void m984d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.m1014h(view, bVar);
        } else {
            c.m1010p(view, bVar);
        }
    }

    /* JADX INFO: renamed from: f */
    static C0292j0 m985f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C0292j0(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public long m986a() {
        return this.f1333a.mo1015a();
    }

    /* JADX INFO: renamed from: b */
    public float m987b() {
        return this.f1333a.mo1016b();
    }

    /* JADX INFO: renamed from: c */
    public int m988c() {
        return this.f1333a.mo1017c();
    }

    /* JADX INFO: renamed from: e */
    public void m989e(float f3) {
        this.f1333a.mo1018d(f3);
    }

    /* JADX INFO: renamed from: J.j0$d */
    private static class d extends e {

        /* JADX INFO: renamed from: f */
        private final WindowInsetsAnimation f1358f;

        /* JADX INFO: renamed from: J.j0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            private final b f1359a;

            /* JADX INFO: renamed from: b */
            private List f1360b;

            /* JADX INFO: renamed from: c */
            private ArrayList f1361c;

            /* JADX INFO: renamed from: d */
            private final HashMap f1362d;

            a(b bVar) {
                super(bVar.m994a());
                this.f1362d = new HashMap();
                this.f1359a = bVar;
            }

            /* JADX INFO: renamed from: a */
            private C0292j0 m1019a(WindowInsetsAnimation windowInsetsAnimation) {
                C0292j0 c0292j0 = (C0292j0) this.f1362d.get(windowInsetsAnimation);
                if (c0292j0 != null) {
                    return c0292j0;
                }
                C0292j0 c0292j0M985f = C0292j0.m985f(windowInsetsAnimation);
                this.f1362d.put(windowInsetsAnimation, c0292j0M985f);
                return c0292j0M985f;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1359a.mo995b(m1019a(windowInsetsAnimation));
                this.f1362d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f1359a.mo996c(m1019a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f1361c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f1361c = arrayList2;
                    this.f1360b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM1064a = AbstractC0314u0.m1064a(list.get(size));
                    C0292j0 c0292j0M1019a = m1019a(windowInsetsAnimationM1064a);
                    c0292j0M1019a.m989e(windowInsetsAnimationM1064a.getFraction());
                    this.f1361c.add(c0292j0M1019a);
                }
                return this.f1359a.mo997d(C0318w0.m1075y(windowInsets), this.f1360b).m1099x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f1359a.mo998e(m1019a(windowInsetsAnimation), a.m990d(bounds)).m993c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f1358f = windowInsetsAnimation;
        }

        /* JADX INFO: renamed from: e */
        public static WindowInsetsAnimation.Bounds m1011e(a aVar) {
            AbstractC0308r0.m1051a();
            return AbstractC0306q0.m1041a(aVar.m991a().m12274e(), aVar.m992b().m12274e());
        }

        /* JADX INFO: renamed from: f */
        public static C2572e m1012f(WindowInsetsAnimation.Bounds bounds) {
            return C2572e.m12273d(bounds.getUpperBound());
        }

        /* JADX INFO: renamed from: g */
        public static C2572e m1013g(WindowInsetsAnimation.Bounds bounds) {
            return C2572e.m12273d(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: h */
        public static void m1014h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // p027J.C0292j0.e
        /* JADX INFO: renamed from: a */
        public long mo1015a() {
            return this.f1358f.getDurationMillis();
        }

        @Override // p027J.C0292j0.e
        /* JADX INFO: renamed from: b */
        public float mo1016b() {
            return this.f1358f.getInterpolatedFraction();
        }

        @Override // p027J.C0292j0.e
        /* JADX INFO: renamed from: c */
        public int mo1017c() {
            return this.f1358f.getTypeMask();
        }

        @Override // p027J.C0292j0.e
        /* JADX INFO: renamed from: d */
        public void mo1018d(float f3) {
            this.f1358f.setFraction(f3);
        }

        d(int i3, Interpolator interpolator, long j3) {
            this(AbstractC0304p0.m1039a(i3, interpolator, j3));
        }
    }

    /* JADX INFO: renamed from: J.j0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final C2572e f1334a;

        /* JADX INFO: renamed from: b */
        private final C2572e f1335b;

        public a(C2572e c2572e, C2572e c2572e2) {
            this.f1334a = c2572e;
            this.f1335b = c2572e2;
        }

        /* JADX INFO: renamed from: d */
        public static a m990d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        /* JADX INFO: renamed from: a */
        public C2572e m991a() {
            return this.f1334a;
        }

        /* JADX INFO: renamed from: b */
        public C2572e m992b() {
            return this.f1335b;
        }

        /* JADX INFO: renamed from: c */
        public WindowInsetsAnimation.Bounds m993c() {
            return d.m1011e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f1334a + " upper=" + this.f1335b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f1334a = d.m1013g(bounds);
            this.f1335b = d.m1012f(bounds);
        }
    }

    private C0292j0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1333a = new d(windowInsetsAnimation);
        }
    }
}
