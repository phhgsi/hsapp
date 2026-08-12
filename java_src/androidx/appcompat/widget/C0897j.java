package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0873V;
import p091d.AbstractC1760a;
import p091d.AbstractC1762c;
import p091d.AbstractC1763d;
import p091d.AbstractC1764e;
import p095e.AbstractC1832a;
import p167z.AbstractC2571d;

/* JADX INFO: renamed from: androidx.appcompat.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0897j {

    /* JADX INFO: renamed from: b */
    private static final PorterDuff.Mode f3702b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    private static C0897j f3703c;

    /* JADX INFO: renamed from: a */
    private C0873V f3704a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.j$a */
    class a implements C0873V.f {

        /* JADX INFO: renamed from: a */
        private final int[] f3705a = {AbstractC1764e.f8765R, AbstractC1764e.f8763P, AbstractC1764e.f8767a};

        /* JADX INFO: renamed from: b */
        private final int[] f3706b = {AbstractC1764e.f8781o, AbstractC1764e.f8749B, AbstractC1764e.f8786t, AbstractC1764e.f8782p, AbstractC1764e.f8783q, AbstractC1764e.f8785s, AbstractC1764e.f8784r};

        /* JADX INFO: renamed from: c */
        private final int[] f3707c = {AbstractC1764e.f8762O, AbstractC1764e.f8764Q, AbstractC1764e.f8777k, AbstractC1764e.f8758K, AbstractC1764e.f8759L, AbstractC1764e.f8760M, AbstractC1764e.f8761N};

        /* JADX INFO: renamed from: d */
        private final int[] f3708d = {AbstractC1764e.f8789w, AbstractC1764e.f8775i, AbstractC1764e.f8788v};

        /* JADX INFO: renamed from: e */
        private final int[] f3709e = {AbstractC1764e.f8757J, AbstractC1764e.f8766S};

        /* JADX INFO: renamed from: f */
        private final int[] f3710f = {AbstractC1764e.f8769c, AbstractC1764e.f8773g, AbstractC1764e.f8770d, AbstractC1764e.f8774h};

        a() {
        }

        /* JADX INFO: renamed from: f */
        private boolean m3821f(int[] iArr, int i3) {
            for (int i4 : iArr) {
                if (i4 == i3) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: g */
        private ColorStateList m3822g(Context context) {
            return m3823h(context, 0);
        }

        /* JADX INFO: renamed from: h */
        private ColorStateList m3823h(Context context, int i3) {
            int iM3743c = AbstractC0880a0.m3743c(context, AbstractC1760a.f8719t);
            return new ColorStateList(new int[][]{AbstractC0880a0.f3622b, AbstractC0880a0.f3625e, AbstractC0880a0.f3623c, AbstractC0880a0.f3629i}, new int[]{AbstractC0880a0.m3742b(context, AbstractC1760a.f8717r), AbstractC2571d.m12265g(iM3743c, i3), AbstractC2571d.m12265g(iM3743c, i3), i3});
        }

        /* JADX INFO: renamed from: i */
        private ColorStateList m3824i(Context context) {
            return m3823h(context, AbstractC0880a0.m3743c(context, AbstractC1760a.f8716q));
        }

        /* JADX INFO: renamed from: j */
        private ColorStateList m3825j(Context context) {
            return m3823h(context, AbstractC0880a0.m3743c(context, AbstractC1760a.f8717r));
        }

        /* JADX INFO: renamed from: k */
        private ColorStateList m3826k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i3 = AbstractC1760a.f8723x;
            ColorStateList colorStateListM3745e = AbstractC0880a0.m3745e(context, i3);
            if (colorStateListM3745e == null || !colorStateListM3745e.isStateful()) {
                iArr[0] = AbstractC0880a0.f3622b;
                iArr2[0] = AbstractC0880a0.m3742b(context, i3);
                iArr[1] = AbstractC0880a0.f3626f;
                iArr2[1] = AbstractC0880a0.m3743c(context, AbstractC1760a.f8718s);
                iArr[2] = AbstractC0880a0.f3629i;
                iArr2[2] = AbstractC0880a0.m3743c(context, i3);
            } else {
                int[] iArr3 = AbstractC0880a0.f3622b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM3745e.getColorForState(iArr3, 0);
                iArr[1] = AbstractC0880a0.f3626f;
                iArr2[1] = AbstractC0880a0.m3743c(context, AbstractC1760a.f8718s);
                iArr[2] = AbstractC0880a0.f3629i;
                iArr2[2] = colorStateListM3745e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: l */
        private LayerDrawable m3827l(C0873V c0873v, Context context, int i3) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
            Drawable drawableM3691j = c0873v.m3691j(context, AbstractC1764e.f8753F);
            Drawable drawableM3691j2 = c0873v.m3691j(context, AbstractC1764e.f8754G);
            if ((drawableM3691j instanceof BitmapDrawable) && drawableM3691j.getIntrinsicWidth() == dimensionPixelSize && drawableM3691j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM3691j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM3691j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM3691j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM3691j2 instanceof BitmapDrawable) && drawableM3691j2.getIntrinsicWidth() == dimensionPixelSize && drawableM3691j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM3691j2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM3691j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM3691j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: m */
        private void m3828m(Drawable drawable, int i3, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C0897j.f3702b;
            }
            drawableMutate.setColorFilter(C0897j.m3814e(i3, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.C0873V.f
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo3703a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0897j.m3812a()
                int[] r1 = r6.f3705a
                boolean r1 = r6.m3821f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = p091d.AbstractC1760a.f8720u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f3707c
                boolean r1 = r6.m3821f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = p091d.AbstractC1760a.f8718s
                goto L11
            L20:
                int[] r1 = r6.f3708d
                boolean r1 = r6.m3821f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = p091d.AbstractC1764e.f8787u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = p091d.AbstractC1764e.f8778l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L65
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.AbstractC0880a0.m3743c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0897j.m3814e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L64
                r9.setAlpha(r0)
            L64:
                return r2
            L65:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0897j.a.mo3703a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0873V.f
        /* JADX INFO: renamed from: b */
        public PorterDuff.Mode mo3704b(int i3) {
            if (i3 == AbstractC1764e.f8755H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0873V.f
        /* JADX INFO: renamed from: c */
        public Drawable mo3705c(C0873V c0873v, Context context, int i3) {
            if (i3 == AbstractC1764e.f8776j) {
                return new LayerDrawable(new Drawable[]{c0873v.m3691j(context, AbstractC1764e.f8775i), c0873v.m3691j(context, AbstractC1764e.f8777k)});
            }
            if (i3 == AbstractC1764e.f8791y) {
                return m3827l(c0873v, context, AbstractC1763d.f8741g);
            }
            if (i3 == AbstractC1764e.f8790x) {
                return m3827l(c0873v, context, AbstractC1763d.f8742h);
            }
            if (i3 == AbstractC1764e.f8792z) {
                return m3827l(c0873v, context, AbstractC1763d.f8743i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0873V.f
        /* JADX INFO: renamed from: d */
        public ColorStateList mo3706d(Context context, int i3) {
            if (i3 == AbstractC1764e.f8779m) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8731e);
            }
            if (i3 == AbstractC1764e.f8756I) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8734h);
            }
            if (i3 == AbstractC1764e.f8755H) {
                return m3826k(context);
            }
            if (i3 == AbstractC1764e.f8772f) {
                return m3825j(context);
            }
            if (i3 == AbstractC1764e.f8768b) {
                return m3822g(context);
            }
            if (i3 == AbstractC1764e.f8771e) {
                return m3824i(context);
            }
            if (i3 == AbstractC1764e.f8751D || i3 == AbstractC1764e.f8752E) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8733g);
            }
            if (m3821f(this.f3706b, i3)) {
                return AbstractC0880a0.m3745e(context, AbstractC1760a.f8720u);
            }
            if (m3821f(this.f3709e, i3)) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8730d);
            }
            if (m3821f(this.f3710f, i3)) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8729c);
            }
            if (i3 == AbstractC1764e.f8748A) {
                return AbstractC1832a.m9608a(context, AbstractC1762c.f8732f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0873V.f
        /* JADX INFO: renamed from: e */
        public boolean mo3707e(Context context, int i3, Drawable drawable) {
            if (i3 == AbstractC1764e.f8750C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i4 = AbstractC1760a.f8720u;
                m3828m(drawableFindDrawableByLayerId, AbstractC0880a0.m3743c(context, i4), C0897j.f3702b);
                m3828m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0880a0.m3743c(context, i4), C0897j.f3702b);
                m3828m(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC0880a0.m3743c(context, AbstractC1760a.f8718s), C0897j.f3702b);
                return true;
            }
            if (i3 != AbstractC1764e.f8791y && i3 != AbstractC1764e.f8790x && i3 != AbstractC1764e.f8792z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m3828m(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC0880a0.m3742b(context, AbstractC1760a.f8720u), C0897j.f3702b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i5 = AbstractC1760a.f8718s;
            m3828m(drawableFindDrawableByLayerId2, AbstractC0880a0.m3743c(context, i5), C0897j.f3702b);
            m3828m(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC0880a0.m3743c(context, i5), C0897j.f3702b);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0897j m3813b() {
        try {
            if (f3703c == null) {
                m3815h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3703c;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m3814e(int i3, PorterDuff.Mode mode) {
        return C0873V.m3684l(i3, mode);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m3815h() {
        if (f3703c == null) {
            C0897j c0897j = new C0897j();
            f3703c = c0897j;
            c0897j.f3704a = C0873V.m3682h();
            f3703c.f3704a.m3697u(new a());
        }
    }

    /* JADX INFO: renamed from: i */
    static void m3816i(Drawable drawable, C0884c0 c0884c0, int[] iArr) {
        C0873V.m3690w(drawable, c0884c0, iArr);
    }

    /* JADX INFO: renamed from: c */
    public synchronized Drawable m3817c(Context context, int i3) {
        return this.f3704a.m3691j(context, i3);
    }

    /* JADX INFO: renamed from: d */
    synchronized Drawable m3818d(Context context, int i3, boolean z2) {
        return this.f3704a.m3692k(context, i3, z2);
    }

    /* JADX INFO: renamed from: f */
    synchronized ColorStateList m3819f(Context context, int i3) {
        return this.f3704a.m3693m(context, i3);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m3820g(Context context) {
        this.f3704a.m3695s(context);
    }
}
