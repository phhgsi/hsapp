package p076Z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p016F0.AbstractC0150k;

/* JADX INFO: renamed from: Z0.l */
/* JADX INFO: loaded from: classes.dex */
public class C0641l {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0633d f2229m = new C0639j(0.5f);

    /* JADX INFO: renamed from: a */
    AbstractC0634e f2230a;

    /* JADX INFO: renamed from: b */
    AbstractC0634e f2231b;

    /* JADX INFO: renamed from: c */
    AbstractC0634e f2232c;

    /* JADX INFO: renamed from: d */
    AbstractC0634e f2233d;

    /* JADX INFO: renamed from: e */
    InterfaceC0633d f2234e;

    /* JADX INFO: renamed from: f */
    InterfaceC0633d f2235f;

    /* JADX INFO: renamed from: g */
    InterfaceC0633d f2236g;

    /* JADX INFO: renamed from: h */
    InterfaceC0633d f2237h;

    /* JADX INFO: renamed from: i */
    C0636g f2238i;

    /* JADX INFO: renamed from: j */
    C0636g f2239j;

    /* JADX INFO: renamed from: k */
    C0636g f2240k;

    /* JADX INFO: renamed from: l */
    C0636g f2241l;

    /* JADX INFO: renamed from: Z0.l$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC0633d mo2290a(InterfaceC0633d interfaceC0633d);
    }

    /* JADX INFO: renamed from: a */
    public static b m2304a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public static b m2305b(Context context, int i3, int i4) {
        return m2306c(context, i3, i4, 0);
    }

    /* JADX INFO: renamed from: c */
    private static b m2306c(Context context, int i3, int i4, int i5) {
        return m2307d(context, i3, i4, new C0630a(i5));
    }

    /* JADX INFO: renamed from: d */
    private static b m2307d(Context context, int i3, int i4, InterfaceC0633d interfaceC0633d) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        if (i4 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i4, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0150k.f855c6);
        try {
            int i5 = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f865d6, 0);
            int i6 = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f895g6, i5);
            int i7 = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f905h6, i5);
            int i8 = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f885f6, i5);
            int i9 = typedArrayObtainStyledAttributes.getInt(AbstractC0150k.f875e6, i5);
            InterfaceC0633d interfaceC0633dM2311m = m2311m(typedArrayObtainStyledAttributes, AbstractC0150k.f915i6, interfaceC0633d);
            InterfaceC0633d interfaceC0633dM2311m2 = m2311m(typedArrayObtainStyledAttributes, AbstractC0150k.f945l6, interfaceC0633dM2311m);
            InterfaceC0633d interfaceC0633dM2311m3 = m2311m(typedArrayObtainStyledAttributes, AbstractC0150k.f955m6, interfaceC0633dM2311m);
            InterfaceC0633d interfaceC0633dM2311m4 = m2311m(typedArrayObtainStyledAttributes, AbstractC0150k.f935k6, interfaceC0633dM2311m);
            return new b().m2343A(i6, interfaceC0633dM2311m2).m2347E(i7, interfaceC0633dM2311m3).m2360w(i8, interfaceC0633dM2311m4).m2356s(i9, m2311m(typedArrayObtainStyledAttributes, AbstractC0150k.f925j6, interfaceC0633dM2311m));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public static b m2308e(Context context, AttributeSet attributeSet, int i3, int i4) {
        return m2309f(context, attributeSet, i3, i4, 0);
    }

    /* JADX INFO: renamed from: f */
    public static b m2309f(Context context, AttributeSet attributeSet, int i3, int i4, int i5) {
        return m2310g(context, attributeSet, i3, i4, new C0630a(i5));
    }

    /* JADX INFO: renamed from: g */
    public static b m2310g(Context context, AttributeSet attributeSet, int i3, int i4, InterfaceC0633d interfaceC0633d) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150k.f814Y3, i3, i4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f823Z3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(AbstractC0150k.f833a4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m2307d(context, resourceId, resourceId2, interfaceC0633d);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC0633d m2311m(TypedArray typedArray, int i3, InterfaceC0633d interfaceC0633d) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                return new C0630a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new C0639j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0633d;
    }

    /* JADX INFO: renamed from: h */
    public C0636g m2312h() {
        return this.f2240k;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC0634e m2313i() {
        return this.f2233d;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC0633d m2314j() {
        return this.f2237h;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC0634e m2315k() {
        return this.f2232c;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC0633d m2316l() {
        return this.f2236g;
    }

    /* JADX INFO: renamed from: n */
    public C0636g m2317n() {
        return this.f2241l;
    }

    /* JADX INFO: renamed from: o */
    public C0636g m2318o() {
        return this.f2239j;
    }

    /* JADX INFO: renamed from: p */
    public C0636g m2319p() {
        return this.f2238i;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0634e m2320q() {
        return this.f2230a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC0633d m2321r() {
        return this.f2234e;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC0634e m2322s() {
        return this.f2231b;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC0633d m2323t() {
        return this.f2235f;
    }

    public String toString() {
        return "[" + m2321r() + ", " + m2323t() + ", " + m2316l() + ", " + m2314j() + "]";
    }

    /* JADX INFO: renamed from: u */
    public boolean m2324u() {
        return (this.f2231b instanceof C0640k) && (this.f2230a instanceof C0640k) && (this.f2232c instanceof C0640k) && (this.f2233d instanceof C0640k);
    }

    /* JADX INFO: renamed from: v */
    public boolean m2325v(RectF rectF) {
        boolean z2 = this.f2241l.getClass().equals(C0636g.class) && this.f2239j.getClass().equals(C0636g.class) && this.f2238i.getClass().equals(C0636g.class) && this.f2240k.getClass().equals(C0636g.class);
        float fMo2214a = this.f2234e.mo2214a(rectF);
        return z2 && ((this.f2235f.mo2214a(rectF) > fMo2214a ? 1 : (this.f2235f.mo2214a(rectF) == fMo2214a ? 0 : -1)) == 0 && (this.f2237h.mo2214a(rectF) > fMo2214a ? 1 : (this.f2237h.mo2214a(rectF) == fMo2214a ? 0 : -1)) == 0 && (this.f2236g.mo2214a(rectF) > fMo2214a ? 1 : (this.f2236g.mo2214a(rectF) == fMo2214a ? 0 : -1)) == 0) && m2324u();
    }

    /* JADX INFO: renamed from: w */
    public b m2326w() {
        return new b(this);
    }

    /* JADX INFO: renamed from: x */
    public C0641l m2327x(float f3) {
        return m2326w().m2352o(f3).m2351m();
    }

    /* JADX INFO: renamed from: y */
    public C0641l m2328y(InterfaceC0633d interfaceC0633d) {
        return m2326w().m2353p(interfaceC0633d).m2351m();
    }

    /* JADX INFO: renamed from: z */
    public C0641l m2329z(c cVar) {
        return m2326w().m2346D(cVar.mo2290a(m2321r())).m2350H(cVar.mo2290a(m2323t())).m2359v(cVar.mo2290a(m2314j())).m2363z(cVar.mo2290a(m2316l())).m2351m();
    }

    private C0641l(b bVar) {
        this.f2230a = bVar.f2242a;
        this.f2231b = bVar.f2243b;
        this.f2232c = bVar.f2244c;
        this.f2233d = bVar.f2245d;
        this.f2234e = bVar.f2246e;
        this.f2235f = bVar.f2247f;
        this.f2236g = bVar.f2248g;
        this.f2237h = bVar.f2249h;
        this.f2238i = bVar.f2250i;
        this.f2239j = bVar.f2251j;
        this.f2240k = bVar.f2252k;
        this.f2241l = bVar.f2253l;
    }

    /* JADX INFO: renamed from: Z0.l$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private AbstractC0634e f2242a;

        /* JADX INFO: renamed from: b */
        private AbstractC0634e f2243b;

        /* JADX INFO: renamed from: c */
        private AbstractC0634e f2244c;

        /* JADX INFO: renamed from: d */
        private AbstractC0634e f2245d;

        /* JADX INFO: renamed from: e */
        private InterfaceC0633d f2246e;

        /* JADX INFO: renamed from: f */
        private InterfaceC0633d f2247f;

        /* JADX INFO: renamed from: g */
        private InterfaceC0633d f2248g;

        /* JADX INFO: renamed from: h */
        private InterfaceC0633d f2249h;

        /* JADX INFO: renamed from: i */
        private C0636g f2250i;

        /* JADX INFO: renamed from: j */
        private C0636g f2251j;

        /* JADX INFO: renamed from: k */
        private C0636g f2252k;

        /* JADX INFO: renamed from: l */
        private C0636g f2253l;

        public b() {
            this.f2242a = AbstractC0638i.m2297b();
            this.f2243b = AbstractC0638i.m2297b();
            this.f2244c = AbstractC0638i.m2297b();
            this.f2245d = AbstractC0638i.m2297b();
            this.f2246e = new C0630a(0.0f);
            this.f2247f = new C0630a(0.0f);
            this.f2248g = new C0630a(0.0f);
            this.f2249h = new C0630a(0.0f);
            this.f2250i = AbstractC0638i.m2298c();
            this.f2251j = AbstractC0638i.m2298c();
            this.f2252k = AbstractC0638i.m2298c();
            this.f2253l = AbstractC0638i.m2298c();
        }

        /* JADX INFO: renamed from: n */
        private static float m2342n(AbstractC0634e abstractC0634e) {
            if (abstractC0634e instanceof C0640k) {
                return ((C0640k) abstractC0634e).f2228a;
            }
            if (abstractC0634e instanceof C0635f) {
                return ((C0635f) abstractC0634e).f2165a;
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: A */
        public b m2343A(int i3, InterfaceC0633d interfaceC0633d) {
            return m2344B(AbstractC0638i.m2296a(i3)).m2346D(interfaceC0633d);
        }

        /* JADX INFO: renamed from: B */
        public b m2344B(AbstractC0634e abstractC0634e) {
            this.f2242a = abstractC0634e;
            float fM2342n = m2342n(abstractC0634e);
            if (fM2342n != -1.0f) {
                m2345C(fM2342n);
            }
            return this;
        }

        /* JADX INFO: renamed from: C */
        public b m2345C(float f3) {
            this.f2246e = new C0630a(f3);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m2346D(InterfaceC0633d interfaceC0633d) {
            this.f2246e = interfaceC0633d;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m2347E(int i3, InterfaceC0633d interfaceC0633d) {
            return m2348F(AbstractC0638i.m2296a(i3)).m2350H(interfaceC0633d);
        }

        /* JADX INFO: renamed from: F */
        public b m2348F(AbstractC0634e abstractC0634e) {
            this.f2243b = abstractC0634e;
            float fM2342n = m2342n(abstractC0634e);
            if (fM2342n != -1.0f) {
                m2349G(fM2342n);
            }
            return this;
        }

        /* JADX INFO: renamed from: G */
        public b m2349G(float f3) {
            this.f2247f = new C0630a(f3);
            return this;
        }

        /* JADX INFO: renamed from: H */
        public b m2350H(InterfaceC0633d interfaceC0633d) {
            this.f2247f = interfaceC0633d;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0641l m2351m() {
            return new C0641l(this);
        }

        /* JADX INFO: renamed from: o */
        public b m2352o(float f3) {
            return m2345C(f3).m2349G(f3).m2362y(f3).m2358u(f3);
        }

        /* JADX INFO: renamed from: p */
        public b m2353p(InterfaceC0633d interfaceC0633d) {
            return m2346D(interfaceC0633d).m2350H(interfaceC0633d).m2363z(interfaceC0633d).m2359v(interfaceC0633d);
        }

        /* JADX INFO: renamed from: q */
        public b m2354q(int i3, float f3) {
            return m2355r(AbstractC0638i.m2296a(i3)).m2352o(f3);
        }

        /* JADX INFO: renamed from: r */
        public b m2355r(AbstractC0634e abstractC0634e) {
            return m2344B(abstractC0634e).m2348F(abstractC0634e).m2361x(abstractC0634e).m2357t(abstractC0634e);
        }

        /* JADX INFO: renamed from: s */
        public b m2356s(int i3, InterfaceC0633d interfaceC0633d) {
            return m2357t(AbstractC0638i.m2296a(i3)).m2359v(interfaceC0633d);
        }

        /* JADX INFO: renamed from: t */
        public b m2357t(AbstractC0634e abstractC0634e) {
            this.f2245d = abstractC0634e;
            float fM2342n = m2342n(abstractC0634e);
            if (fM2342n != -1.0f) {
                m2358u(fM2342n);
            }
            return this;
        }

        /* JADX INFO: renamed from: u */
        public b m2358u(float f3) {
            this.f2249h = new C0630a(f3);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public b m2359v(InterfaceC0633d interfaceC0633d) {
            this.f2249h = interfaceC0633d;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public b m2360w(int i3, InterfaceC0633d interfaceC0633d) {
            return m2361x(AbstractC0638i.m2296a(i3)).m2363z(interfaceC0633d);
        }

        /* JADX INFO: renamed from: x */
        public b m2361x(AbstractC0634e abstractC0634e) {
            this.f2244c = abstractC0634e;
            float fM2342n = m2342n(abstractC0634e);
            if (fM2342n != -1.0f) {
                m2362y(fM2342n);
            }
            return this;
        }

        /* JADX INFO: renamed from: y */
        public b m2362y(float f3) {
            this.f2248g = new C0630a(f3);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public b m2363z(InterfaceC0633d interfaceC0633d) {
            this.f2248g = interfaceC0633d;
            return this;
        }

        public b(C0641l c0641l) {
            this.f2242a = AbstractC0638i.m2297b();
            this.f2243b = AbstractC0638i.m2297b();
            this.f2244c = AbstractC0638i.m2297b();
            this.f2245d = AbstractC0638i.m2297b();
            this.f2246e = new C0630a(0.0f);
            this.f2247f = new C0630a(0.0f);
            this.f2248g = new C0630a(0.0f);
            this.f2249h = new C0630a(0.0f);
            this.f2250i = AbstractC0638i.m2298c();
            this.f2251j = AbstractC0638i.m2298c();
            this.f2252k = AbstractC0638i.m2298c();
            this.f2253l = AbstractC0638i.m2298c();
            this.f2242a = c0641l.f2230a;
            this.f2243b = c0641l.f2231b;
            this.f2244c = c0641l.f2232c;
            this.f2245d = c0641l.f2233d;
            this.f2246e = c0641l.f2234e;
            this.f2247f = c0641l.f2235f;
            this.f2248g = c0641l.f2236g;
            this.f2249h = c0641l.f2237h;
            this.f2250i = c0641l.f2238i;
            this.f2251j = c0641l.f2239j;
            this.f2252k = c0641l.f2240k;
            this.f2253l = c0641l.f2241l;
        }
    }

    public C0641l() {
        this.f2230a = AbstractC0638i.m2297b();
        this.f2231b = AbstractC0638i.m2297b();
        this.f2232c = AbstractC0638i.m2297b();
        this.f2233d = AbstractC0638i.m2297b();
        this.f2234e = new C0630a(0.0f);
        this.f2235f = new C0630a(0.0f);
        this.f2236g = new C0630a(0.0f);
        this.f2237h = new C0630a(0.0f);
        this.f2238i = AbstractC0638i.m2298c();
        this.f2239j = AbstractC0638i.m2298c();
        this.f2240k = AbstractC0638i.m2298c();
        this.f2241l = AbstractC0638i.m2298c();
    }
}
