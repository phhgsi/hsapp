package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p027J.AbstractC0268W;
import p027J.C0282e0;
import p027J.InterfaceC0284f0;
import p091d.AbstractC1760a;
import p091d.AbstractC1769j;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0879a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final a f3610a;

    /* JADX INFO: renamed from: b */
    protected final Context f3611b;

    /* JADX INFO: renamed from: c */
    protected ActionMenuView f3612c;

    /* JADX INFO: renamed from: d */
    protected ActionMenuPresenter f3613d;

    /* JADX INFO: renamed from: e */
    protected int f3614e;

    /* JADX INFO: renamed from: f */
    protected C0282e0 f3615f;

    /* JADX INFO: renamed from: g */
    private boolean f3616g;

    /* JADX INFO: renamed from: h */
    private boolean f3617h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    protected class a implements InterfaceC0284f0 {

        /* JADX INFO: renamed from: a */
        private boolean f3618a = false;

        /* JADX INFO: renamed from: b */
        int f3619b;

        protected a() {
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: a */
        public void mo971a(View view) {
            this.f3618a = true;
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: b */
        public void mo972b(View view) {
            if (this.f3618a) {
                return;
            }
            AbstractC0879a abstractC0879a = AbstractC0879a.this;
            abstractC0879a.f3615f = null;
            AbstractC0879a.super.setVisibility(this.f3619b);
        }

        @Override // p027J.InterfaceC0284f0
        /* JADX INFO: renamed from: c */
        public void mo973c(View view) {
            AbstractC0879a.super.setVisibility(0);
            this.f3618a = false;
        }

        /* JADX INFO: renamed from: d */
        public a m3740d(C0282e0 c0282e0, int i3) {
            AbstractC0879a.this.f3615f = c0282e0;
            this.f3619b = i3;
            return this;
        }
    }

    AbstractC0879a(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3610a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC1760a.f8700a, typedValue, true) || typedValue.resourceId == 0) {
            this.f3611b = context;
        } else {
            this.f3611b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: renamed from: d */
    protected static int m3737d(int i3, int i4, boolean z2) {
        return z2 ? i3 - i4 : i3 + i4;
    }

    /* JADX INFO: renamed from: c */
    protected int m3738c(View view, int i3, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i4);
        return Math.max(0, (i3 - view.getMeasuredWidth()) - i5);
    }

    /* JADX INFO: renamed from: e */
    protected int m3739e(View view, int i3, int i4, int i5, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i4 + ((i5 - measuredHeight) / 2);
        if (z2) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: f */
    public C0282e0 mo3264f(int i3, long j3) {
        C0282e0 c0282e0 = this.f3615f;
        if (c0282e0 != null) {
            c0282e0.m961c();
        }
        if (i3 != 0) {
            C0282e0 c0282e0M960b = AbstractC0268W.m766e(this).m960b(0.0f);
            c0282e0M960b.m963e(j3);
            c0282e0M960b.m965g(this.f3610a.m3740d(c0282e0M960b, i3));
            return c0282e0M960b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0282e0 c0282e0M960b2 = AbstractC0268W.m766e(this).m960b(1.0f);
        c0282e0M960b2.m963e(j3);
        c0282e0M960b2.m965g(this.f3610a.m3740d(c0282e0M960b2, i3));
        return c0282e0M960b2;
    }

    public int getAnimatedVisibility() {
        return this.f3615f != null ? this.f3610a.f3619b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3614e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1769j.f9006a, AbstractC1760a.f8702c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(AbstractC1769j.f9057j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f3613d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m3307I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3617h = false;
        }
        if (!this.f3617h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3617h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3617h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3616g = false;
        }
        if (!this.f3616g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3616g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3616g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i3);

    @Override // android.view.View
    public void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            C0282e0 c0282e0 = this.f3615f;
            if (c0282e0 != null) {
                c0282e0.m961c();
            }
            super.setVisibility(i3);
        }
    }
}
