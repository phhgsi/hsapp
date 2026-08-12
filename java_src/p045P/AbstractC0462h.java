package p045P;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.appcompat.app.AbstractC0740E;
import java.util.ArrayList;
import p027J.AbstractC0268W;
import p045P.C0457c;

/* JADX INFO: renamed from: P.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0462h implements C0457c.c {

    /* JADX INFO: renamed from: d */
    final Object f1643d;

    /* JADX INFO: renamed from: e */
    final AbstractC0463i f1644e;

    /* JADX INFO: renamed from: j */
    private float f1649j;

    /* JADX INFO: renamed from: m */
    private C0457c f1652m;

    /* JADX INFO: renamed from: n */
    public static final p f1627n = new f("translationX");

    /* JADX INFO: renamed from: o */
    public static final p f1628o = new g("translationY");

    /* JADX INFO: renamed from: p */
    public static final p f1629p = new h("translationZ");

    /* JADX INFO: renamed from: q */
    public static final p f1630q = new i("scaleX");

    /* JADX INFO: renamed from: r */
    public static final p f1631r = new j("scaleY");

    /* JADX INFO: renamed from: s */
    public static final p f1632s = new k("rotation");

    /* JADX INFO: renamed from: t */
    public static final p f1633t = new l("rotationX");

    /* JADX INFO: renamed from: u */
    public static final p f1634u = new m("rotationY");

    /* JADX INFO: renamed from: v */
    public static final p f1635v = new n("x");

    /* JADX INFO: renamed from: w */
    public static final p f1636w = new a("y");

    /* JADX INFO: renamed from: x */
    public static final p f1637x = new b("z");

    /* JADX INFO: renamed from: y */
    public static final p f1638y = new c("alpha");

    /* JADX INFO: renamed from: z */
    public static final p f1639z = new d("scrollX");

    /* JADX INFO: renamed from: A */
    public static final p f1626A = new e("scrollY");

    /* JADX INFO: renamed from: a */
    float f1640a = 0.0f;

    /* JADX INFO: renamed from: b */
    float f1641b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    boolean f1642c = false;

    /* JADX INFO: renamed from: f */
    boolean f1645f = false;

    /* JADX INFO: renamed from: g */
    float f1646g = Float.MAX_VALUE;

    /* JADX INFO: renamed from: h */
    float f1647h = -Float.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    private long f1648i = 0;

    /* JADX INFO: renamed from: k */
    private final ArrayList f1650k = new ArrayList();

    /* JADX INFO: renamed from: l */
    private final ArrayList f1651l = new ArrayList();

    /* JADX INFO: renamed from: P.h$a */
    class a extends p {
        a(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getY();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setY(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$b */
    class b extends p {
        b(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return AbstractC0268W.m741J(view);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            AbstractC0268W.m809z0(view, f3);
        }
    }

    /* JADX INFO: renamed from: P.h$c */
    class c extends p {
        c(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getAlpha();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setAlpha(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$d */
    class d extends p {
        d(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getScrollX();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setScrollX((int) f3);
        }
    }

    /* JADX INFO: renamed from: P.h$e */
    class e extends p {
        e(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getScrollY();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setScrollY((int) f3);
        }
    }

    /* JADX INFO: renamed from: P.h$f */
    class f extends p {
        f(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getTranslationX();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setTranslationX(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$g */
    class g extends p {
        g(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getTranslationY();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setTranslationY(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$h */
    class h extends p {
        h(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return AbstractC0268W.m738G(view);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            AbstractC0268W.m805x0(view, f3);
        }
    }

    /* JADX INFO: renamed from: P.h$i */
    class i extends p {
        i(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getScaleX();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setScaleX(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$j */
    class j extends p {
        j(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getScaleY();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setScaleY(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$k */
    class k extends p {
        k(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getRotation();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setRotation(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$l */
    class l extends p {
        l(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getRotationX();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setRotationX(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$m */
    class m extends p {
        m(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getRotationY();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setRotationY(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$n */
    class n extends p {
        n(String str) {
            super(str, null);
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo1681a(View view) {
            return view.getX();
        }

        @Override // p045P.AbstractC0463i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo1682b(View view, float f3) {
            view.setX(f3);
        }
    }

    /* JADX INFO: renamed from: P.h$o */
    static class o {

        /* JADX INFO: renamed from: a */
        float f1653a;

        /* JADX INFO: renamed from: b */
        float f1654b;

        o() {
        }
    }

    /* JADX INFO: renamed from: P.h$p */
    public static abstract class p extends AbstractC0463i {
        /* synthetic */ p(String str, f fVar) {
            this(str);
        }

        private p(String str) {
            super(str);
        }
    }

    AbstractC0462h(Object obj, AbstractC0463i abstractC0463i) {
        this.f1643d = obj;
        this.f1644e = abstractC0463i;
        if (abstractC0463i == f1632s || abstractC0463i == f1633t || abstractC0463i == f1634u) {
            this.f1649j = 0.1f;
            return;
        }
        if (abstractC0463i == f1638y) {
            this.f1649j = 0.00390625f;
        } else if (abstractC0463i == f1630q || abstractC0463i == f1631r) {
            this.f1649j = 0.002f;
        } else {
            this.f1649j = 1.0f;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1670b(boolean z2) {
        this.f1645f = false;
        m1674c().m1659k(this);
        this.f1648i = 0L;
        this.f1642c = false;
        for (int i3 = 0; i3 < this.f1650k.size(); i3++) {
            if (this.f1650k.get(i3) != null) {
                AbstractC0740E.m2693a(this.f1650k.get(i3));
                throw null;
            }
        }
        m1672g(this.f1650k);
    }

    /* JADX INFO: renamed from: d */
    private float m1671d() {
        return this.f1644e.mo1681a(this.f1643d);
    }

    /* JADX INFO: renamed from: g */
    private static void m1672g(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m1673k() {
        if (this.f1645f) {
            return;
        }
        this.f1645f = true;
        if (!this.f1642c) {
            this.f1641b = m1671d();
        }
        float f3 = this.f1641b;
        if (f3 > this.f1646g || f3 < this.f1647h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        m1674c().m1655d(this, 0L);
    }

    @Override // p045P.C0457c.c
    /* JADX INFO: renamed from: a */
    public boolean mo1661a(long j3) {
        long j4 = this.f1648i;
        if (j4 == 0) {
            this.f1648i = j3;
            m1677h(this.f1641b);
            return false;
        }
        long j5 = j3 - j4;
        this.f1648i = j3;
        float fM1657g = m1674c().m1657g();
        boolean zMo1680l = mo1680l(fM1657g == 0.0f ? 2147483647L : (long) (j5 / fM1657g));
        float fMin = Math.min(this.f1641b, this.f1646g);
        this.f1641b = fMin;
        float fMax = Math.max(fMin, this.f1647h);
        this.f1641b = fMax;
        m1677h(fMax);
        if (zMo1680l) {
            m1670b(false);
        }
        return zMo1680l;
    }

    /* JADX INFO: renamed from: c */
    public C0457c m1674c() {
        C0457c c0457c = this.f1652m;
        return c0457c != null ? c0457c : C0457c.m1653h();
    }

    /* JADX INFO: renamed from: e */
    float m1675e() {
        return this.f1649j * 0.75f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1676f() {
        return this.f1645f;
    }

    /* JADX INFO: renamed from: h */
    void m1677h(float f3) {
        this.f1644e.mo1682b(this.f1643d, f3);
        for (int i3 = 0; i3 < this.f1651l.size(); i3++) {
            if (this.f1651l.get(i3) != null) {
                AbstractC0740E.m2693a(this.f1651l.get(i3));
                throw null;
            }
        }
        m1672g(this.f1651l);
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0462h m1678i(float f3) {
        this.f1641b = f3;
        this.f1642c = true;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void mo1679j() {
        if (!m1674c().m1658j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1645f) {
            return;
        }
        m1673k();
    }

    /* JADX INFO: renamed from: l */
    abstract boolean mo1680l(long j3);
}
