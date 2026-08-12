package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p076Z0.C0637h;
import p076Z0.C0641l;

/* JADX INFO: renamed from: com.google.android.material.textfield.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1618h extends C0637h {

    /* JADX INFO: renamed from: J */
    b f8171J;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    private static class c extends AbstractC1618h {
        c(b bVar) {
            super(bVar);
        }

        @Override // p076Z0.C0637h
        /* JADX INFO: renamed from: w */
        protected void mo2287w(Canvas canvas) {
            if (this.f8171J.f8172x.isEmpty()) {
                super.mo2287w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f8171J.f8172x);
            } else {
                canvas.clipRect(this.f8171J.f8172x, Region.Op.DIFFERENCE);
            }
            super.mo2287w(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: t0 */
    static AbstractC1618h m8859t0(C0641l c0641l) {
        if (c0641l == null) {
            c0641l = new C0641l();
        }
        return m8860u0(new b(c0641l, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static AbstractC1618h m8860u0(b bVar) {
        return new c(bVar);
    }

    @Override // p076Z0.C0637h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f8171J = new b(this.f8171J);
        return this;
    }

    /* JADX INFO: renamed from: v0 */
    boolean m8861v0() {
        return !this.f8171J.f8172x.isEmpty();
    }

    /* JADX INFO: renamed from: w0 */
    void m8862w0() {
        m8863x0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: x0 */
    void m8863x0(float f3, float f4, float f5, float f6) {
        if (f3 == this.f8171J.f8172x.left && f4 == this.f8171J.f8172x.top && f5 == this.f8171J.f8172x.right && f6 == this.f8171J.f8172x.bottom) {
            return;
        }
        this.f8171J.f8172x.set(f3, f4, f5, f6);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: y0 */
    void m8864y0(RectF rectF) {
        m8863x0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends C0637h.c {

        /* JADX INFO: renamed from: x */
        private final RectF f8172x;

        @Override // p076Z0.C0637h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC1618h abstractC1618hM8860u0 = AbstractC1618h.m8860u0(this);
            abstractC1618hM8860u0.invalidateSelf();
            return abstractC1618hM8860u0;
        }

        private b(C0641l c0641l, RectF rectF) {
            super(c0641l, null);
            this.f8172x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f8172x = bVar.f8172x;
        }
    }

    private AbstractC1618h(b bVar) {
        super(bVar);
        this.f8171J = bVar;
    }
}
