package p149t;

import p146s.C2382d;
import p146s.C2383e;

/* JADX INFO: renamed from: t.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2424p implements InterfaceC2412d {

    /* JADX INFO: renamed from: a */
    public int f11328a;

    /* JADX INFO: renamed from: b */
    C2383e f11329b;

    /* JADX INFO: renamed from: c */
    C2421m f11330c;

    /* JADX INFO: renamed from: d */
    protected C2383e.b f11331d;

    /* JADX INFO: renamed from: e */
    C2415g f11332e = new C2415g(this);

    /* JADX INFO: renamed from: f */
    public int f11333f = 0;

    /* JADX INFO: renamed from: g */
    boolean f11334g = false;

    /* JADX INFO: renamed from: h */
    public C2414f f11335h = new C2414f(this);

    /* JADX INFO: renamed from: i */
    public C2414f f11336i = new C2414f(this);

    /* JADX INFO: renamed from: j */
    protected b f11337j = b.NONE;

    /* JADX INFO: renamed from: t.p$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f11338a;

        static {
            int[] iArr = new int[C2382d.b.values().length];
            f11338a = iArr;
            try {
                iArr[C2382d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11338a[C2382d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11338a[C2382d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11338a[C2382d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11338a[C2382d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: t.p$b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC2424p(C2383e c2383e) {
        this.f11329b = c2383e;
    }

    /* JADX INFO: renamed from: l */
    private void m11651l(int i3, int i4) {
        int i5 = this.f11328a;
        if (i5 == 0) {
            this.f11332e.mo11618d(m11654g(i4, i3));
            return;
        }
        if (i5 == 1) {
            this.f11332e.mo11618d(Math.min(m11654g(this.f11332e.f11296m, i3), i4));
            return;
        }
        if (i5 == 2) {
            C2383e c2383eM11282K = this.f11329b.m11282K();
            if (c2383eM11282K != null) {
                if ((i3 == 0 ? c2383eM11282K.f10940e : c2383eM11282K.f10942f).f11332e.f11284j) {
                    C2383e c2383e = this.f11329b;
                    this.f11332e.mo11618d(m11654g((int) ((r9.f11281g * (i3 == 0 ? c2383e.f10898A : c2383e.f10904D)) + 0.5f), i3));
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 3) {
            return;
        }
        C2383e c2383e2 = this.f11329b;
        AbstractC2424p abstractC2424p = c2383e2.f10940e;
        C2383e.b bVar = abstractC2424p.f11331d;
        C2383e.b bVar2 = C2383e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC2424p.f11328a == 3) {
            C2422n c2422n = c2383e2.f10942f;
            if (c2422n.f11331d == bVar2 && c2422n.f11328a == 3) {
                return;
            }
        }
        if (i3 == 0) {
            abstractC2424p = c2383e2.f10942f;
        }
        if (abstractC2424p.f11332e.f11284j) {
            float fM11357v = c2383e2.m11357v();
            this.f11332e.mo11618d(i3 == 1 ? (int) ((abstractC2424p.f11332e.f11281g / fM11357v) + 0.5f) : (int) ((fM11357v * abstractC2424p.f11332e.f11281g) + 0.5f));
        }
    }

    @Override // p149t.InterfaceC2412d
    /* JADX INFO: renamed from: a */
    public abstract void mo11596a(InterfaceC2412d interfaceC2412d);

    /* JADX INFO: renamed from: b */
    protected final void m11652b(C2414f c2414f, C2414f c2414f2, int i3) {
        c2414f.f11286l.add(c2414f2);
        c2414f.f11280f = i3;
        c2414f2.f11285k.add(c2414f);
    }

    /* JADX INFO: renamed from: c */
    protected final void m11653c(C2414f c2414f, C2414f c2414f2, int i3, C2415g c2415g) {
        c2414f.f11286l.add(c2414f2);
        c2414f.f11286l.add(this.f11332e);
        c2414f.f11282h = i3;
        c2414f.f11283i = c2415g;
        c2414f2.f11285k.add(c2414f);
        c2415g.f11285k.add(c2414f);
    }

    /* JADX INFO: renamed from: d */
    abstract void mo11597d();

    /* JADX INFO: renamed from: e */
    abstract void mo11598e();

    /* JADX INFO: renamed from: f */
    abstract void mo11599f();

    /* JADX INFO: renamed from: g */
    protected final int m11654g(int i3, int i4) {
        if (i4 == 0) {
            C2383e c2383e = this.f11329b;
            int i5 = c2383e.f10982z;
            int iMax = Math.max(c2383e.f10980y, i3);
            if (i5 > 0) {
                iMax = Math.min(i5, i3);
            }
            if (iMax != i3) {
                return iMax;
            }
        } else {
            C2383e c2383e2 = this.f11329b;
            int i6 = c2383e2.f10902C;
            int iMax2 = Math.max(c2383e2.f10900B, i3);
            if (i6 > 0) {
                iMax2 = Math.min(i6, i3);
            }
            if (iMax2 != i3) {
                return iMax2;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: h */
    protected final C2414f m11655h(C2382d c2382d) {
        C2382d c2382d2 = c2382d.f10882f;
        if (c2382d2 == null) {
            return null;
        }
        C2383e c2383e = c2382d2.f10880d;
        int i3 = a.f11338a[c2382d2.f10881e.ordinal()];
        if (i3 == 1) {
            return c2383e.f10940e.f11335h;
        }
        if (i3 == 2) {
            return c2383e.f10940e.f11336i;
        }
        if (i3 == 3) {
            return c2383e.f10942f.f11335h;
        }
        if (i3 == 4) {
            return c2383e.f10942f.f11310k;
        }
        if (i3 != 5) {
            return null;
        }
        return c2383e.f10942f.f11336i;
    }

    /* JADX INFO: renamed from: i */
    protected final C2414f m11656i(C2382d c2382d, int i3) {
        C2382d c2382d2 = c2382d.f10882f;
        if (c2382d2 == null) {
            return null;
        }
        C2383e c2383e = c2382d2.f10880d;
        AbstractC2424p abstractC2424p = i3 == 0 ? c2383e.f10940e : c2383e.f10942f;
        int i4 = a.f11338a[c2382d2.f10881e.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2424p.f11336i;
        }
        return abstractC2424p.f11335h;
    }

    /* JADX INFO: renamed from: j */
    public long mo11600j() {
        if (this.f11332e.f11284j) {
            return r0.f11281g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public boolean m11657k() {
        return this.f11334g;
    }

    /* JADX INFO: renamed from: m */
    abstract boolean mo11601m();

    /* JADX INFO: renamed from: n */
    protected void m11658n(InterfaceC2412d interfaceC2412d, C2382d c2382d, C2382d c2382d2, int i3) {
        C2414f c2414fM11655h = m11655h(c2382d);
        C2414f c2414fM11655h2 = m11655h(c2382d2);
        if (c2414fM11655h.f11284j && c2414fM11655h2.f11284j) {
            int iM11243f = c2414fM11655h.f11281g + c2382d.m11243f();
            int iM11243f2 = c2414fM11655h2.f11281g - c2382d2.m11243f();
            int i4 = iM11243f2 - iM11243f;
            if (!this.f11332e.f11284j && this.f11331d == C2383e.b.MATCH_CONSTRAINT) {
                m11651l(i3, i4);
            }
            C2415g c2415g = this.f11332e;
            if (c2415g.f11284j) {
                if (c2415g.f11281g == i4) {
                    this.f11335h.mo11618d(iM11243f);
                    this.f11336i.mo11618d(iM11243f2);
                    return;
                }
                C2383e c2383e = this.f11329b;
                float fM11363y = i3 == 0 ? c2383e.m11363y() : c2383e.m11290O();
                if (c2414fM11655h == c2414fM11655h2) {
                    iM11243f = c2414fM11655h.f11281g;
                    iM11243f2 = c2414fM11655h2.f11281g;
                    fM11363y = 0.5f;
                }
                this.f11335h.mo11618d((int) (iM11243f + 0.5f + (((iM11243f2 - iM11243f) - this.f11332e.f11281g) * fM11363y)));
                this.f11336i.mo11618d(this.f11335h.f11281g + this.f11332e.f11281g);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    protected void m11659o(InterfaceC2412d interfaceC2412d) {
    }

    /* JADX INFO: renamed from: p */
    protected void m11660p(InterfaceC2412d interfaceC2412d) {
    }
}
