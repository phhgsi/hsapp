package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p027J.AbstractC0268W;
import p027J.C0318w0;
import p027J.InterfaceC0235F;

/* JADX INFO: renamed from: com.google.android.material.internal.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1540k extends FrameLayout {

    /* JADX INFO: renamed from: a */
    Drawable f7768a;

    /* JADX INFO: renamed from: b */
    Rect f7769b;

    /* JADX INFO: renamed from: c */
    private Rect f7770c;

    /* JADX INFO: renamed from: d */
    private boolean f7771d;

    /* JADX INFO: renamed from: e */
    private boolean f7772e;

    /* JADX INFO: renamed from: f */
    private boolean f7773f;

    /* JADX INFO: renamed from: g */
    private boolean f7774g;

    /* JADX INFO: renamed from: com.google.android.material.internal.k$a */
    class a implements InterfaceC0235F {
        a() {
        }

        @Override // p027J.InterfaceC0235F
        /* JADX INFO: renamed from: a */
        public C0318w0 mo662a(View view, C0318w0 c0318w0) {
            AbstractC1540k abstractC1540k = AbstractC1540k.this;
            if (abstractC1540k.f7769b == null) {
                abstractC1540k.f7769b = new Rect();
            }
            AbstractC1540k.this.f7769b.set(c0318w0.m1086j(), c0318w0.m1088l(), c0318w0.m1087k(), c0318w0.m1085i());
            AbstractC1540k.this.mo8453e(c0318w0);
            AbstractC1540k.this.setWillNotDraw(!c0318w0.m1090n() || AbstractC1540k.this.f7768a == null);
            AbstractC1540k.this.postInvalidateOnAnimation();
            return c0318w0.m1079c();
        }
    }

    public AbstractC1540k(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7770c = new Rect();
        this.f7771d = true;
        this.f7772e = true;
        this.f7773f = true;
        this.f7774g = true;
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context, attributeSet, AbstractC0150k.f798W5, i3, AbstractC0149j.f576i, new int[0]);
        this.f7768a = typedArrayM8488i.getDrawable(AbstractC0150k.f807X5);
        typedArrayM8488i.recycle();
        setWillNotDraw(true);
        AbstractC0268W.m795s0(this, new a());
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7769b == null || this.f7768a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f7771d) {
            this.f7770c.set(0, 0, width, this.f7769b.top);
            this.f7768a.setBounds(this.f7770c);
            this.f7768a.draw(canvas);
        }
        if (this.f7772e) {
            this.f7770c.set(0, height - this.f7769b.bottom, width, height);
            this.f7768a.setBounds(this.f7770c);
            this.f7768a.draw(canvas);
        }
        if (this.f7773f) {
            Rect rect = this.f7770c;
            Rect rect2 = this.f7769b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f7768a.setBounds(this.f7770c);
            this.f7768a.draw(canvas);
        }
        if (this.f7774g) {
            Rect rect3 = this.f7770c;
            Rect rect4 = this.f7769b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f7768a.setBounds(this.f7770c);
            this.f7768a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo8453e(C0318w0 c0318w0);

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f7768a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f7768a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
        this.f7772e = z2;
    }

    public void setDrawLeftInsetForeground(boolean z2) {
        this.f7773f = z2;
    }

    public void setDrawRightInsetForeground(boolean z2) {
        this.f7774g = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.f7771d = z2;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f7768a = drawable;
    }
}
