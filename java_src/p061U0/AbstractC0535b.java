package p061U0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import com.google.android.material.internal.AbstractC1546q;
import java.util.Arrays;
import p016F0.AbstractC0149j;
import p016F0.AbstractC0150k;
import p043O0.AbstractC0450a;
import p089c1.AbstractC1313a;
import p091d.AbstractC1760a;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535b extends ProgressBar {

    /* JADX INFO: renamed from: p */
    static final int f1806p = AbstractC0149j.f592y;

    /* JADX INFO: renamed from: a */
    AbstractC0536c f1807a;

    /* JADX INFO: renamed from: b */
    private int f1808b;

    /* JADX INFO: renamed from: c */
    private boolean f1809c;

    /* JADX INFO: renamed from: d */
    private boolean f1810d;

    /* JADX INFO: renamed from: e */
    private final int f1811e;

    /* JADX INFO: renamed from: f */
    private final int f1812f;

    /* JADX INFO: renamed from: g */
    private long f1813g;

    /* JADX INFO: renamed from: h */
    C0534a f1814h;

    /* JADX INFO: renamed from: i */
    private boolean f1815i;

    /* JADX INFO: renamed from: j */
    private int f1816j;

    /* JADX INFO: renamed from: k */
    boolean f1817k;

    /* JADX INFO: renamed from: l */
    private final Runnable f1818l;

    /* JADX INFO: renamed from: m */
    private final Runnable f1819m;

    /* JADX INFO: renamed from: n */
    private final AbstractC1283b f1820n;

    /* JADX INFO: renamed from: o */
    private final AbstractC1283b f1821o;

    /* JADX INFO: renamed from: U0.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0535b.this.m1923k();
        }
    }

    /* JADX INFO: renamed from: U0.b$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0535b.this.m1922j();
            AbstractC0535b.this.f1813g = -1L;
        }
    }

    /* JADX INFO: renamed from: U0.b$c */
    class c extends AbstractC1283b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1283b
        /* JADX INFO: renamed from: b */
        public void mo1933b(Drawable drawable) {
            AbstractC0535b.this.setIndeterminate(false);
            AbstractC0535b abstractC0535b = AbstractC0535b.this;
            abstractC0535b.m1931p(abstractC0535b.f1808b, AbstractC0535b.this.f1809c);
        }
    }

    /* JADX INFO: renamed from: U0.b$d */
    class d extends AbstractC1283b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1283b
        /* JADX INFO: renamed from: b */
        public void mo1933b(Drawable drawable) {
            super.mo1933b(drawable);
            if (AbstractC0535b.this.f1815i) {
                return;
            }
            AbstractC0535b abstractC0535b = AbstractC0535b.this;
            abstractC0535b.setVisibility(abstractC0535b.f1816j);
        }
    }

    protected AbstractC0535b(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(AbstractC1313a.m6668d(context, attributeSet, i3, f1806p), attributeSet, i3);
        this.f1813g = -1L;
        this.f1815i = false;
        this.f1816j = 4;
        this.f1818l = new a();
        this.f1819m = new b();
        this.f1820n = new c();
        this.f1821o = new d();
        Context context2 = getContext();
        this.f1807a = mo1928i(context2, attributeSet);
        TypedArray typedArrayM8488i = AbstractC1546q.m8488i(context2, attributeSet, AbstractC0150k.f756S, i3, i4, new int[0]);
        this.f1811e = typedArrayM8488i.getInt(AbstractC0150k.f819Z, -1);
        this.f1812f = Math.min(typedArrayM8488i.getInt(AbstractC0150k.f801X, -1), 1000);
        typedArrayM8488i.recycle();
        this.f1814h = new C0534a();
        this.f1810d = true;
    }

    private AbstractC0546m getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m2057x();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m2015C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m1922j() {
        ((AbstractC0545l) getCurrentDrawable()).mo2023s(false, false, true);
        if (m1924m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m1923k() {
        if (this.f1812f > 0) {
            this.f1813g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    private boolean m1924m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    private void m1925n() {
        m1930o();
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo2022o(this.f1821o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo2022o(this.f1821o);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1926q() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo2025u(this.f1821o);
            getIndeterminateDrawable().m2056w().mo1974h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo2025u(this.f1821o);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f1807a.f1833h;
    }

    public int[] getIndicatorColor() {
        return this.f1807a.f1830e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f1807a.f1834i;
    }

    public int getShowAnimationBehavior() {
        return this.f1807a.f1832g;
    }

    public int getTrackColor() {
        return this.f1807a.f1831f;
    }

    public int getTrackCornerRadius() {
        return this.f1807a.f1827b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f1807a.f1828c;
    }

    public int getTrackThickness() {
        return this.f1807a.f1826a;
    }

    public int getWaveAmplitude() {
        return this.f1807a.f1837l;
    }

    public int getWaveSpeed() {
        return this.f1807a.f1838m;
    }

    public int getWavelengthDeterminate() {
        return this.f1807a.f1835j;
    }

    public int getWavelengthIndeterminate() {
        return this.f1807a.f1836k;
    }

    /* JADX INFO: renamed from: h */
    protected void m1927h(boolean z2) {
        if (this.f1810d) {
            ((AbstractC0545l) getCurrentDrawable()).mo2023s(m1932r(), false, z2);
        }
    }

    /* JADX INFO: renamed from: i */
    abstract AbstractC0536c mo1928i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l */
    boolean m1929l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    void m1930o() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().m2056w().mo1971d(this.f1820n);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1925n();
        if (m1932r()) {
            m1923k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1819m);
        removeCallbacks(this.f1818l);
        ((AbstractC0545l) getCurrentDrawable()).mo2019j();
        m1926q();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        getCurrentDrawingDelegate().mo1955g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i3, int i4) {
        try {
            AbstractC0546m currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.mo1954f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i3) : currentDrawingDelegate.mo1954f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo1953e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i4) : currentDrawingDelegate.mo1953e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        m1927h(i3 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        m1927h(false);
    }

    /* JADX INFO: renamed from: p */
    public void m1931p(int i3, boolean z2) {
        if (!isIndeterminate()) {
            super.setProgress(i3);
            if (getProgressDrawable() == null || z2) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f1808b = i3;
            this.f1809c = z2;
            this.f1815i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f1814h.m1914a(getContext().getContentResolver()) == 0.0f) {
                this.f1820n.mo1933b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m2056w().mo1972f();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    boolean m1932r() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && m1929l();
    }

    public void setAnimatorDurationScaleProvider(C0534a c0534a) {
        this.f1814h = c0534a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f1906c = c0534a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f1906c = c0534a;
        }
    }

    public void setHideAnimationBehavior(int i3) {
        this.f1807a.f1833h = i3;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z2) {
        try {
            if (z2 == isIndeterminate()) {
                return;
            }
            AbstractC0545l abstractC0545l = (AbstractC0545l) getCurrentDrawable();
            if (abstractC0545l != null) {
                abstractC0545l.mo2019j();
            }
            super.setIndeterminate(z2);
            AbstractC0545l abstractC0545l2 = (AbstractC0545l) getCurrentDrawable();
            if (abstractC0545l2 != null) {
                abstractC0545l2.mo2023s(m1932r(), false, false);
            }
            if ((abstractC0545l2 instanceof C0548o) && m1932r()) {
                ((C0548o) abstractC0545l2).m2056w().mo1973g();
            }
            this.f1815i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1839n != f3) {
            abstractC0536c.f1839n = f3;
            getIndeterminateDrawable().m2056w().mo1970c();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof C0548o) {
            ((AbstractC0545l) drawable).mo2019j();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f1817k) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC0450a.m1630b(getContext(), AbstractC1760a.f8722w, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f1807a.f1830e = iArr;
        getIndeterminateDrawable().m2056w().mo1970c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1834i != i3) {
            abstractC0536c.f1834i = i3;
            abstractC0536c.m1941h();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i3) {
        if (isIndeterminate()) {
            return;
        }
        m1931p(i3, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof C0544k)) {
            if (this.f1817k) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            C0544k c0544k = (C0544k) drawable;
            c0544k.mo2019j();
            super.setProgressDrawable(c0544k);
            c0544k.m2018K(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i3) {
        this.f1807a.f1832g = i3;
        invalidate();
    }

    public void setTrackColor(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1831f != i3) {
            abstractC0536c.f1831f = i3;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1827b != i3) {
            abstractC0536c.f1827b = Math.min(i3, abstractC0536c.f1826a / 2);
            this.f1807a.f1829d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1828c != f3) {
            abstractC0536c.f1828c = Math.min(f3, 0.5f);
            this.f1807a.f1829d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1826a != i3) {
            abstractC0536c.f1826a = i3;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i3) {
        if (i3 != 0 && i3 != 4 && i3 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f1816j = i3;
    }

    public void setWaveAmplitude(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1837l != i3) {
            abstractC0536c.f1837l = Math.abs(i3);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i3) {
        this.f1807a.f1838m = i3;
        getProgressDrawable().m2017I(this.f1807a.f1838m != 0);
    }

    public void setWavelength(int i3) {
        setWavelengthDeterminate(i3);
        setWavelengthIndeterminate(i3);
    }

    public void setWavelengthDeterminate(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1835j != i3) {
            abstractC0536c.f1835j = Math.abs(i3);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i3) {
        AbstractC0536c abstractC0536c = this.f1807a;
        if (abstractC0536c.f1836k != i3) {
            abstractC0536c.f1836k = Math.abs(i3);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public C0548o getIndeterminateDrawable() {
        return (C0548o) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C0544k getProgressDrawable() {
        return (C0544k) super.getProgressDrawable();
    }
}
