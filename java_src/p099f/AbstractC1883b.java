package p099f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import p000A.AbstractC0000a;

/* JADX INFO: renamed from: f.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1883b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    private d f9325a;

    /* JADX INFO: renamed from: b */
    private Rect f9326b;

    /* JADX INFO: renamed from: c */
    private Drawable f9327c;

    /* JADX INFO: renamed from: d */
    private Drawable f9328d;

    /* JADX INFO: renamed from: f */
    private boolean f9330f;

    /* JADX INFO: renamed from: h */
    private boolean f9332h;

    /* JADX INFO: renamed from: i */
    private Runnable f9333i;

    /* JADX INFO: renamed from: j */
    private long f9334j;

    /* JADX INFO: renamed from: k */
    private long f9335k;

    /* JADX INFO: renamed from: l */
    private c f9336l;

    /* JADX INFO: renamed from: e */
    private int f9329e = 255;

    /* JADX INFO: renamed from: g */
    private int f9331g = -1;

    /* JADX INFO: renamed from: f.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1883b.this.m9724a(true);
            AbstractC1883b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f.b$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static boolean m9728a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* JADX INFO: renamed from: b */
        public static void m9729b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* JADX INFO: renamed from: c */
        public static Resources m9730c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: renamed from: f.b$d */
    static abstract class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A */
        int f9339A;

        /* JADX INFO: renamed from: B */
        int f9340B;

        /* JADX INFO: renamed from: C */
        boolean f9341C;

        /* JADX INFO: renamed from: D */
        ColorFilter f9342D;

        /* JADX INFO: renamed from: E */
        boolean f9343E;

        /* JADX INFO: renamed from: F */
        ColorStateList f9344F;

        /* JADX INFO: renamed from: G */
        PorterDuff.Mode f9345G;

        /* JADX INFO: renamed from: H */
        boolean f9346H;

        /* JADX INFO: renamed from: I */
        boolean f9347I;

        /* JADX INFO: renamed from: a */
        final AbstractC1883b f9348a;

        /* JADX INFO: renamed from: b */
        Resources f9349b;

        /* JADX INFO: renamed from: c */
        int f9350c;

        /* JADX INFO: renamed from: d */
        int f9351d;

        /* JADX INFO: renamed from: e */
        int f9352e;

        /* JADX INFO: renamed from: f */
        SparseArray f9353f;

        /* JADX INFO: renamed from: g */
        Drawable[] f9354g;

        /* JADX INFO: renamed from: h */
        int f9355h;

        /* JADX INFO: renamed from: i */
        boolean f9356i;

        /* JADX INFO: renamed from: j */
        boolean f9357j;

        /* JADX INFO: renamed from: k */
        Rect f9358k;

        /* JADX INFO: renamed from: l */
        boolean f9359l;

        /* JADX INFO: renamed from: m */
        boolean f9360m;

        /* JADX INFO: renamed from: n */
        int f9361n;

        /* JADX INFO: renamed from: o */
        int f9362o;

        /* JADX INFO: renamed from: p */
        int f9363p;

        /* JADX INFO: renamed from: q */
        int f9364q;

        /* JADX INFO: renamed from: r */
        boolean f9365r;

        /* JADX INFO: renamed from: s */
        int f9366s;

        /* JADX INFO: renamed from: t */
        boolean f9367t;

        /* JADX INFO: renamed from: u */
        boolean f9368u;

        /* JADX INFO: renamed from: v */
        boolean f9369v;

        /* JADX INFO: renamed from: w */
        boolean f9370w;

        /* JADX INFO: renamed from: x */
        boolean f9371x;

        /* JADX INFO: renamed from: y */
        boolean f9372y;

        /* JADX INFO: renamed from: z */
        int f9373z;

        d(d dVar, AbstractC1883b abstractC1883b, Resources resources) {
            this.f9356i = false;
            this.f9359l = false;
            this.f9371x = true;
            this.f9339A = 0;
            this.f9340B = 0;
            this.f9348a = abstractC1883b;
            this.f9349b = resources != null ? resources : dVar != null ? dVar.f9349b : null;
            int iM9723f = AbstractC1883b.m9723f(resources, dVar != null ? dVar.f9350c : 0);
            this.f9350c = iM9723f;
            if (dVar == null) {
                this.f9354g = new Drawable[10];
                this.f9355h = 0;
                return;
            }
            this.f9351d = dVar.f9351d;
            this.f9352e = dVar.f9352e;
            this.f9369v = true;
            this.f9370w = true;
            this.f9356i = dVar.f9356i;
            this.f9359l = dVar.f9359l;
            this.f9371x = dVar.f9371x;
            this.f9372y = dVar.f9372y;
            this.f9373z = dVar.f9373z;
            this.f9339A = dVar.f9339A;
            this.f9340B = dVar.f9340B;
            this.f9341C = dVar.f9341C;
            this.f9342D = dVar.f9342D;
            this.f9343E = dVar.f9343E;
            this.f9344F = dVar.f9344F;
            this.f9345G = dVar.f9345G;
            this.f9346H = dVar.f9346H;
            this.f9347I = dVar.f9347I;
            if (dVar.f9350c == iM9723f) {
                if (dVar.f9357j) {
                    this.f9358k = dVar.f9358k != null ? new Rect(dVar.f9358k) : null;
                    this.f9357j = true;
                }
                if (dVar.f9360m) {
                    this.f9361n = dVar.f9361n;
                    this.f9362o = dVar.f9362o;
                    this.f9363p = dVar.f9363p;
                    this.f9364q = dVar.f9364q;
                    this.f9360m = true;
                }
            }
            if (dVar.f9365r) {
                this.f9366s = dVar.f9366s;
                this.f9365r = true;
            }
            if (dVar.f9367t) {
                this.f9368u = dVar.f9368u;
                this.f9367t = true;
            }
            Drawable[] drawableArr = dVar.f9354g;
            this.f9354g = new Drawable[drawableArr.length];
            this.f9355h = dVar.f9355h;
            SparseArray sparseArray = dVar.f9353f;
            if (sparseArray != null) {
                this.f9353f = sparseArray.clone();
            } else {
                this.f9353f = new SparseArray(this.f9355h);
            }
            int i3 = this.f9355h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f9353f.put(i4, constantState);
                    } else {
                        this.f9354g[i4] = drawableArr[i4];
                    }
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private void m9733e() {
            SparseArray sparseArray = this.f9353f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.f9354g[this.f9353f.keyAt(i3)] = m9734s(((Drawable.ConstantState) this.f9353f.valueAt(i3)).newDrawable(this.f9349b));
                }
                this.f9353f = null;
            }
        }

        /* JADX INFO: renamed from: s */
        private Drawable m9734s(Drawable drawable) {
            AbstractC0000a.m12m(drawable, this.f9373z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f9348a);
            return drawableMutate;
        }

        /* JADX INFO: renamed from: a */
        public final int m9735a(Drawable drawable) {
            int i3 = this.f9355h;
            if (i3 >= this.f9354g.length) {
                mo9748o(i3, i3 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9348a);
            this.f9354g[i3] = drawable;
            this.f9355h++;
            this.f9352e = drawable.getChangingConfigurations() | this.f9352e;
            m9749p();
            this.f9358k = null;
            this.f9357j = false;
            this.f9360m = false;
            this.f9369v = false;
            return i3;
        }

        /* JADX INFO: renamed from: b */
        final void m9736b(Resources.Theme theme) {
            if (theme != null) {
                m9733e();
                int i3 = this.f9355h;
                Drawable[] drawableArr = this.f9354g;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null && AbstractC0000a.m1b(drawable)) {
                        AbstractC0000a.m0a(drawableArr[i4], theme);
                        this.f9352e |= drawableArr[i4].getChangingConfigurations();
                    }
                }
                m9756y(b.m9730c(theme));
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m9737c() {
            if (this.f9369v) {
                return this.f9370w;
            }
            m9733e();
            this.f9369v = true;
            int i3 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4].getConstantState() == null) {
                    this.f9370w = false;
                    return false;
                }
            }
            this.f9370w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i3 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f9353f.get(i4);
                    if (constantState != null && b.m9728a(constantState)) {
                        return true;
                    }
                } else if (AbstractC0000a.m1b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        protected void m9738d() {
            this.f9360m = true;
            m9733e();
            int i3 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            this.f9362o = -1;
            this.f9361n = -1;
            this.f9364q = 0;
            this.f9363p = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9361n) {
                    this.f9361n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9362o) {
                    this.f9362o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9363p) {
                    this.f9363p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9364q) {
                    this.f9364q = minimumHeight;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        final int m9739f() {
            return this.f9354g.length;
        }

        /* JADX INFO: renamed from: g */
        public final Drawable m9740g(int i3) {
            int iIndexOfKey;
            Drawable drawable = this.f9354g[i3];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f9353f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i3)) < 0) {
                return null;
            }
            Drawable drawableM9734s = m9734s(((Drawable.ConstantState) this.f9353f.valueAt(iIndexOfKey)).newDrawable(this.f9349b));
            this.f9354g[i3] = drawableM9734s;
            this.f9353f.removeAt(iIndexOfKey);
            if (this.f9353f.size() == 0) {
                this.f9353f = null;
            }
            return drawableM9734s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9351d | this.f9352e;
        }

        /* JADX INFO: renamed from: h */
        public final int m9741h() {
            return this.f9355h;
        }

        /* JADX INFO: renamed from: i */
        public final int m9742i() {
            if (!this.f9360m) {
                m9738d();
            }
            return this.f9362o;
        }

        /* JADX INFO: renamed from: j */
        public final int m9743j() {
            if (!this.f9360m) {
                m9738d();
            }
            return this.f9364q;
        }

        /* JADX INFO: renamed from: k */
        public final int m9744k() {
            if (!this.f9360m) {
                m9738d();
            }
            return this.f9363p;
        }

        /* JADX INFO: renamed from: l */
        public final Rect m9745l() {
            Rect rect = null;
            if (this.f9356i) {
                return null;
            }
            Rect rect2 = this.f9358k;
            if (rect2 != null || this.f9357j) {
                return rect2;
            }
            m9733e();
            Rect rect3 = new Rect();
            int i3 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i5 = rect3.left;
                    if (i5 > rect.left) {
                        rect.left = i5;
                    }
                    int i6 = rect3.top;
                    if (i6 > rect.top) {
                        rect.top = i6;
                    }
                    int i7 = rect3.right;
                    if (i7 > rect.right) {
                        rect.right = i7;
                    }
                    int i8 = rect3.bottom;
                    if (i8 > rect.bottom) {
                        rect.bottom = i8;
                    }
                }
            }
            this.f9357j = true;
            this.f9358k = rect;
            return rect;
        }

        /* JADX INFO: renamed from: m */
        public final int m9746m() {
            if (!this.f9360m) {
                m9738d();
            }
            return this.f9361n;
        }

        /* JADX INFO: renamed from: n */
        public final int m9747n() {
            if (this.f9365r) {
                return this.f9366s;
            }
            m9733e();
            int i3 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            int opacity = i3 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i4 = 1; i4 < i3; i4++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i4].getOpacity());
            }
            this.f9366s = opacity;
            this.f9365r = true;
            return opacity;
        }

        /* JADX INFO: renamed from: o */
        public void mo9748o(int i3, int i4) {
            Drawable[] drawableArr = new Drawable[i4];
            Drawable[] drawableArr2 = this.f9354g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i3);
            }
            this.f9354g = drawableArr;
        }

        /* JADX INFO: renamed from: p */
        void m9749p() {
            this.f9365r = false;
            this.f9367t = false;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m9750q() {
            return this.f9359l;
        }

        /* JADX INFO: renamed from: r */
        abstract void mo9716r();

        /* JADX INFO: renamed from: t */
        public final void m9751t(boolean z2) {
            this.f9359l = z2;
        }

        /* JADX INFO: renamed from: u */
        public final void m9752u(int i3) {
            this.f9339A = i3;
        }

        /* JADX INFO: renamed from: v */
        public final void m9753v(int i3) {
            this.f9340B = i3;
        }

        /* JADX INFO: renamed from: w */
        final boolean m9754w(int i3, int i4) {
            int i5 = this.f9355h;
            Drawable[] drawableArr = this.f9354g;
            boolean z2 = false;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    boolean zM12m = AbstractC0000a.m12m(drawable, i3);
                    if (i6 == i4) {
                        z2 = zM12m;
                    }
                }
            }
            this.f9373z = i3;
            return z2;
        }

        /* JADX INFO: renamed from: x */
        public final void m9755x(boolean z2) {
            this.f9356i = z2;
        }

        /* JADX INFO: renamed from: y */
        final void m9756y(Resources resources) {
            if (resources != null) {
                this.f9349b = resources;
                int iM9723f = AbstractC1883b.m9723f(resources, this.f9350c);
                int i3 = this.f9350c;
                this.f9350c = iM9723f;
                if (i3 != iM9723f) {
                    this.f9360m = false;
                    this.f9357j = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m9721d(Drawable drawable) {
        if (this.f9336l == null) {
            this.f9336l = new c();
        }
        drawable.setCallback(this.f9336l.m9732b(drawable.getCallback()));
        try {
            if (this.f9325a.f9339A <= 0 && this.f9330f) {
                drawable.setAlpha(this.f9329e);
            }
            d dVar = this.f9325a;
            if (dVar.f9343E) {
                drawable.setColorFilter(dVar.f9342D);
            } else {
                if (dVar.f9346H) {
                    AbstractC0000a.m14o(drawable, dVar.f9344F);
                }
                d dVar2 = this.f9325a;
                if (dVar2.f9347I) {
                    AbstractC0000a.m15p(drawable, dVar2.f9345G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9325a.f9371x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC0000a.m12m(drawable, AbstractC0000a.m5f(this));
            AbstractC0000a.m9j(drawable, this.f9325a.f9341C);
            Rect rect = this.f9326b;
            if (rect != null) {
                AbstractC0000a.m11l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f9336l.m9731a());
        } catch (Throwable th) {
            drawable.setCallback(this.f9336l.m9731a());
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m9722e() {
        return isAutoMirrored() && AbstractC0000a.m5f(this) == 1;
    }

    /* JADX INFO: renamed from: f */
    static int m9723f(Resources resources, int i3) {
        if (resources != null) {
            i3 = resources.getDisplayMetrics().densityDpi;
        }
        if (i3 == 0) {
            return 160;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m9724a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9330f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9327c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f9334j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f9329e
            r3.setAlpha(r9)
            r13.f9334j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            f.b$d r10 = r13.f9325a
            int r10 = r10.f9339A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f9329e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f9334j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f9328d
            if (r9 == 0) goto L61
            long r10 = r13.f9335k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f9328d = r0
            r13.f9335k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$d r4 = r13.f9325a
            int r4 = r4.f9340B
            int r3 = r3 / r4
            int r4 = r13.f9329e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f9335k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f9333i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099f.AbstractC1883b.m9724a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f9325a.m9736b(theme);
    }

    /* JADX INFO: renamed from: b */
    abstract d mo9701b();

    /* JADX INFO: renamed from: c */
    int m9725c() {
        return this.f9331g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f9325a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9328d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m9726g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9331g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f9325a
            int r0 = r0.f9340B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f9328d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f9327c
            if (r0 == 0) goto L29
            r9.f9328d = r0
            f.b$d r0 = r9.f9325a
            int r0 = r0.f9340B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9335k = r0
            goto L35
        L29:
            r9.f9328d = r4
            r9.f9335k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f9327c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$d r0 = r9.f9325a
            int r1 = r0.f9355h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m9740g(r10)
            r9.f9327c = r0
            r9.f9331g = r10
            if (r0 == 0) goto L5a
            f.b$d r10 = r9.f9325a
            int r10 = r10.f9339A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9334j = r2
        L51:
            r9.m9721d(r0)
            goto L5a
        L55:
            r9.f9327c = r4
            r10 = -1
            r9.f9331g = r10
        L5a:
            long r0 = r9.f9334j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f9335k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f9333i
            if (r10 != 0) goto L73
            f.b$a r10 = new f.b$a
            r10.<init>()
            r9.f9333i = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m9724a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p099f.AbstractC1883b.m9726g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9329e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9325a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f9325a.m9737c()) {
            return null;
        }
        this.f9325a.f9351d = getChangingConfigurations();
        return this.f9325a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f9327c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9326b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f9325a.m9750q()) {
            return this.f9325a.m9742i();
        }
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f9325a.m9750q()) {
            return this.f9325a.m9746m();
        }
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f9325a.m9750q()) {
            return this.f9325a.m9743j();
        }
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f9325a.m9750q()) {
            return this.f9325a.m9744k();
        }
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9327c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9325a.m9747n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            b.m9729b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM9745l = this.f9325a.m9745l();
        if (rectM9745l != null) {
            rect.set(rectM9745l);
            padding = (rectM9745l.right | ((rectM9745l.left | rectM9745l.top) | rectM9745l.bottom)) != 0;
        } else {
            Drawable drawable = this.f9327c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m9722e()) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return padding;
    }

    /* JADX INFO: renamed from: h */
    void mo9702h(d dVar) {
        this.f9325a = dVar;
        int i3 = this.f9331g;
        if (i3 >= 0) {
            Drawable drawableM9740g = dVar.m9740g(i3);
            this.f9327c = drawableM9740g;
            if (drawableM9740g != null) {
                m9721d(drawableM9740g);
            }
        }
        this.f9328d = null;
    }

    /* JADX INFO: renamed from: i */
    final void m9727i(Resources resources) {
        this.f9325a.m9756y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f9325a;
        if (dVar != null) {
            dVar.m9749p();
        }
        if (drawable != this.f9327c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9325a.f9341C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f9328d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9328d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f9327c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9330f) {
                this.f9327c.setAlpha(this.f9329e);
            }
        }
        if (this.f9335k != 0) {
            this.f9335k = 0L;
            z2 = true;
        }
        if (this.f9334j != 0) {
            this.f9334j = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9332h && super.mutate() == this) {
            d dVarMo9701b = mo9701b();
            dVarMo9701b.mo9716r();
            mo9702h(dVarMo9701b);
            this.f9332h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9328d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9327c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i3) {
        return this.f9325a.m9754w(i3, m9725c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i3) {
        Drawable drawable = this.f9328d;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.f9327c;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9328d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9327c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.f9327c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (this.f9330f && this.f9329e == i3) {
            return;
        }
        this.f9330f = true;
        this.f9329e = i3;
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            if (this.f9334j == 0) {
                drawable.setAlpha(i3);
            } else {
                m9724a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        d dVar = this.f9325a;
        if (dVar.f9341C != z2) {
            dVar.f9341C = z2;
            Drawable drawable = this.f9327c;
            if (drawable != null) {
                AbstractC0000a.m9j(drawable, z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f9325a;
        dVar.f9343E = true;
        if (dVar.f9342D != colorFilter) {
            dVar.f9342D = colorFilter;
            Drawable drawable = this.f9327c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        d dVar = this.f9325a;
        if (dVar.f9371x != z2) {
            dVar.f9371x = z2;
            Drawable drawable = this.f9327c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            AbstractC0000a.m10k(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Rect rect = this.f9326b;
        if (rect == null) {
            this.f9326b = new Rect(i3, i4, i5, i6);
        } else {
            rect.set(i3, i4, i5, i6);
        }
        Drawable drawable = this.f9327c;
        if (drawable != null) {
            AbstractC0000a.m11l(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f9325a;
        dVar.f9346H = true;
        if (dVar.f9344F != colorStateList) {
            dVar.f9344F = colorStateList;
            AbstractC0000a.m14o(this.f9327c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f9325a;
        dVar.f9347I = true;
        if (dVar.f9345G != mode) {
            dVar.f9345G = mode;
            AbstractC0000a.m15p(this.f9327c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f9328d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f9327c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f9327c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: f.b$c */
    static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        private Drawable.Callback f9338a;

        c() {
        }

        /* JADX INFO: renamed from: a */
        public Drawable.Callback m9731a() {
            Drawable.Callback callback = this.f9338a;
            this.f9338a = null;
            return callback;
        }

        /* JADX INFO: renamed from: b */
        public c m9732b(Drawable.Callback callback) {
            this.f9338a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
            Drawable.Callback callback = this.f9338a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j3);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9338a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
