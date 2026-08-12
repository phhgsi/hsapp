package p061U0;

import android.content.Context;
import android.util.AttributeSet;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0149j;

/* JADX INFO: renamed from: U0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0540g extends AbstractC0535b {

    /* JADX INFO: renamed from: q */
    public static final int f1882q = AbstractC0149j.f585r;

    public C0540g(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: t */
    private void m2001t() {
        C0537d c0537d = new C0537d((C0541h) this.f1807a);
        setIndeterminateDrawable(C0548o.m2052v(getContext(), (C0541h) this.f1807a, c0537d));
        setProgressDrawable(C0544k.m2003A(getContext(), (C0541h) this.f1807a, c0537d));
    }

    public int getIndeterminateAnimationType() {
        return ((C0541h) this.f1807a).f1883o;
    }

    public int getIndicatorDirection() {
        return ((C0541h) this.f1807a).f1886r;
    }

    public int getIndicatorInset() {
        return ((C0541h) this.f1807a).f1885q;
    }

    public int getIndicatorSize() {
        return ((C0541h) this.f1807a).f1884p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p061U0.AbstractC0535b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0541h mo1928i(Context context, AttributeSet attributeSet) {
        return new C0541h(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i3) {
        if (((C0541h) this.f1807a).f1883o == i3) {
            return;
        }
        if (m1932r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        AbstractC0536c abstractC0536c = this.f1807a;
        ((C0541h) abstractC0536c).f1883o = i3;
        ((C0541h) abstractC0536c).m1941h();
        getIndeterminateDrawable().m2058z(i3 == 1 ? new C0539f(getContext(), (C0541h) this.f1807a) : new C0538e((C0541h) this.f1807a));
        m1930o();
        invalidate();
    }

    public void setIndicatorDirection(int i3) {
        ((C0541h) this.f1807a).f1886r = i3;
        invalidate();
    }

    public void setIndicatorInset(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (((C0541h) abstractC0536c).f1885q != i3) {
            ((C0541h) abstractC0536c).f1885q = i3;
            invalidate();
        }
    }

    public void setIndicatorSize(int i3) {
        int iMax = Math.max(i3, getTrackThickness() * 2);
        AbstractC0536c abstractC0536c = this.f1807a;
        if (((C0541h) abstractC0536c).f1884p != iMax) {
            ((C0541h) abstractC0536c).f1884p = iMax;
            ((C0541h) abstractC0536c).m1941h();
            requestLayout();
            invalidate();
        }
    }

    @Override // p061U0.AbstractC0535b
    public void setTrackThickness(int i3) {
        super.setTrackThickness(i3);
        ((C0541h) this.f1807a).m1941h();
    }

    public C0540g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0140a.f338f);
    }

    public C0540g(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3, f1882q);
        m2001t();
        this.f1817k = true;
    }
}
