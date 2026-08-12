package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.AbstractC1546q;
import com.google.android.material.internal.C1543n;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p016F0.AbstractC0140a;
import p016F0.AbstractC0148i;
import p016F0.AbstractC0149j;
import p019G0.AbstractC0176a;
import p067W0.AbstractC0557c;
import p067W0.C0559e;
import p076Z0.C0637h;
import p076Z0.C0641l;

/* JADX INFO: renamed from: com.google.android.material.badge.a */
/* JADX INFO: loaded from: classes.dex */
public class C1434a extends Drawable implements C1543n.b {

    /* JADX INFO: renamed from: n */
    private static final int f7015n = AbstractC0149j.f581n;

    /* JADX INFO: renamed from: o */
    private static final int f7016o = AbstractC0140a.f334b;

    /* JADX INFO: renamed from: a */
    private final WeakReference f7017a;

    /* JADX INFO: renamed from: b */
    private final C0637h f7018b;

    /* JADX INFO: renamed from: c */
    private final C1543n f7019c;

    /* JADX INFO: renamed from: d */
    private final Rect f7020d;

    /* JADX INFO: renamed from: e */
    private final BadgeState f7021e;

    /* JADX INFO: renamed from: f */
    private float f7022f;

    /* JADX INFO: renamed from: g */
    private float f7023g;

    /* JADX INFO: renamed from: h */
    private int f7024h;

    /* JADX INFO: renamed from: i */
    private float f7025i;

    /* JADX INFO: renamed from: j */
    private float f7026j;

    /* JADX INFO: renamed from: k */
    private float f7027k;

    /* JADX INFO: renamed from: l */
    private WeakReference f7028l;

    /* JADX INFO: renamed from: m */
    private WeakReference f7029m;

    private C1434a(Context context, int i3, int i4, int i5, BadgeState.State state) {
        this.f7017a = new WeakReference(context);
        AbstractC1546q.m8482c(context);
        this.f7020d = new Rect();
        C1543n c1543n = new C1543n(this);
        this.f7019c = c1543n;
        c1543n.m8472g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i3, i4, i5, state);
        this.f7021e = badgeState;
        this.f7018b = new C0637h(C0641l.m2305b(context, m7477A() ? badgeState.m7401m() : badgeState.m7397i(), m7477A() ? badgeState.m7400l() : badgeState.m7396h()).m2351m());
        m7487M();
    }

    /* JADX INFO: renamed from: A */
    private boolean m7477A() {
        return m7509C() || m7508B();
    }

    /* JADX INFO: renamed from: D */
    private void m7478D() {
        this.f7019c.m8472g().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: E */
    private void m7479E() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f7021e.m7393e());
        if (this.f7018b.m2255B() != colorStateListValueOf) {
            this.f7018b.m2274c0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: F */
    private void m7480F() {
        this.f7019c.m8476l(true);
        m7482H();
        m7489Q();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: G */
    private void m7481G() {
        WeakReference weakReference = this.f7028l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f7028l.get();
        WeakReference weakReference2 = this.f7029m;
        m7511P(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    /* JADX INFO: renamed from: H */
    private void m7482H() {
        Context context = (Context) this.f7017a.get();
        if (context == null) {
            return;
        }
        this.f7018b.setShapeAppearanceModel(C0641l.m2305b(context, m7477A() ? this.f7021e.m7401m() : this.f7021e.m7397i(), m7477A() ? this.f7021e.m7400l() : this.f7021e.m7396h()).m2351m());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: I */
    private void m7483I() {
        C0559e c0559e;
        Context context = (Context) this.f7017a.get();
        if (context == null || this.f7019c.m8470e() == (c0559e = new C0559e(context, this.f7021e.m7382A()))) {
            return;
        }
        this.f7019c.m8475k(c0559e, context);
        m7484J();
        m7489Q();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: J */
    private void m7484J() {
        this.f7019c.m8472g().setColor(this.f7021e.m7398j());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: K */
    private void m7485K() {
        m7490R();
        this.f7019c.m8476l(true);
        m7489Q();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: L */
    private void m7486L() {
        setVisible(this.f7021e.m7388G(), false);
    }

    /* JADX INFO: renamed from: M */
    private void m7487M() {
        m7482H();
        m7483I();
        m7485K();
        m7480F();
        m7478D();
        m7479E();
        m7484J();
        m7481G();
        m7489Q();
        m7486L();
    }

    /* JADX INFO: renamed from: O */
    private static void m7488O(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* JADX INFO: renamed from: Q */
    private void m7489Q() {
        Context context = (Context) this.f7017a.get();
        WeakReference weakReference = this.f7028l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f7020d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f7029m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        m7493d(rect2, view);
        AbstractC1435b.m7527g(this.f7020d, this.f7022f, this.f7023g, this.f7026j, this.f7027k);
        float f3 = this.f7025i;
        if (f3 != -1.0f) {
            this.f7018b.m2270Y(f3);
        }
        if (rect.equals(this.f7020d)) {
            return;
        }
        this.f7018b.setBounds(this.f7020d);
    }

    /* JADX INFO: renamed from: R */
    private void m7490R() {
        if (m7516n() != -2) {
            this.f7024h = ((int) Math.pow(10.0d, ((double) m7516n()) - 1.0d)) - 1;
        } else {
            this.f7024h = m7517o();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7491b(View view) {
        ViewParent viewParentM7514j = m7514j();
        if (viewParentM7514j == null) {
            viewParentM7514j = view.getParent();
        }
        if ((viewParentM7514j instanceof View) && (viewParentM7514j.getParent() instanceof View)) {
            m7492c(view, (View) viewParentM7514j.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private void m7492c(View view, View view2) {
        float y2;
        float x2;
        ViewParent parent;
        boolean z2;
        FrameLayout frameLayoutM7514j = m7514j();
        if (frameLayoutM7514j == null) {
            float y3 = view.getY();
            x2 = view.getX();
            parent = view.getParent();
            y2 = y3;
        } else {
            y2 = 0.0f;
            x2 = 0.0f;
            parent = frameLayoutM7514j;
        }
        while (true) {
            z2 = parent instanceof View;
            if (!z2 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y2 += view3.getY();
            x2 += view3.getX();
            parent = parent.getParent();
        }
        if (z2) {
            float fM7505x = m7505x(y2);
            float fM7499m = m7499m(x2);
            View view4 = (View) parent;
            float fM7497h = m7497h(view4.getHeight(), y2);
            float fM7502s = m7502s(view4.getWidth(), x2);
            if (fM7505x < 0.0f) {
                this.f7023g += Math.abs(fM7505x);
            }
            if (fM7499m < 0.0f) {
                this.f7022f += Math.abs(fM7499m);
            }
            if (fM7497h > 0.0f) {
                this.f7023g -= Math.abs(fM7497h);
            }
            if (fM7502s > 0.0f) {
                this.f7022f -= Math.abs(fM7502s);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m7493d(Rect rect, View view) {
        float f3 = m7477A() ? this.f7021e.f6975d : this.f7021e.f6974c;
        this.f7025i = f3;
        if (f3 != -1.0f) {
            this.f7026j = f3;
            this.f7027k = f3;
        } else {
            this.f7026j = Math.round((m7477A() ? this.f7021e.f6978g : this.f7021e.f6976e) / 2.0f);
            this.f7027k = Math.round((m7477A() ? this.f7021e.f6979h : this.f7021e.f6977f) / 2.0f);
        }
        if (m7477A()) {
            String strM7496g = m7496g();
            this.f7026j = Math.max(this.f7026j, (this.f7019c.m8473h(strM7496g) / 2.0f) + this.f7021e.m7395g());
            float fMax = Math.max(this.f7027k, (this.f7019c.m8471f(strM7496g) / 2.0f) + this.f7021e.m7399k());
            this.f7027k = fMax;
            this.f7026j = Math.max(this.f7026j, fMax);
        }
        int iM7507z = m7507z();
        int iM7394f = this.f7021e.m7394f();
        if (iM7394f == 8388691 || iM7394f == 8388693) {
            this.f7023g = rect.bottom - iM7507z;
        } else {
            this.f7023g = rect.top + iM7507z;
        }
        int iM7506y = m7506y();
        int iM7394f2 = this.f7021e.m7394f();
        if (iM7394f2 == 8388659 || iM7394f2 == 8388691) {
            this.f7022f = this.f7021e.f6983l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f7026j) - ((this.f7027k * 2.0f) - iM7506y) : (rect.right - this.f7026j) + ((this.f7027k * 2.0f) - iM7506y) : view.getLayoutDirection() == 0 ? (rect.left - this.f7026j) + iM7506y : (rect.right + this.f7026j) - iM7506y;
        } else {
            this.f7022f = this.f7021e.f6983l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f7026j) - iM7506y : (rect.left - this.f7026j) + iM7506y : view.getLayoutDirection() == 0 ? (rect.right - this.f7026j) + ((this.f7027k * 2.0f) - iM7506y) : (rect.left + this.f7026j) - ((this.f7027k * 2.0f) - iM7506y);
        }
        if (this.f7021e.m7387F()) {
            m7491b(view);
        } else {
            m7492c(view, null);
        }
    }

    /* JADX INFO: renamed from: e */
    static C1434a m7494e(Context context, BadgeState.State state) {
        return new C1434a(context, 0, f7016o, f7015n, state);
    }

    /* JADX INFO: renamed from: f */
    private void m7495f(Canvas canvas) {
        String strM7496g = m7496g();
        if (strM7496g != null) {
            Rect rect = new Rect();
            this.f7019c.m8472g().getTextBounds(strM7496g, 0, strM7496g.length(), rect);
            float fExactCenterY = this.f7023g - rect.exactCenterY();
            canvas.drawText(strM7496g, this.f7022f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f7019c.m8472g());
        }
    }

    /* JADX INFO: renamed from: g */
    private String m7496g() {
        if (m7509C()) {
            return m7503v();
        }
        if (m7508B()) {
            return m7500q();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private float m7497h(float f3, float f4) {
        return ((this.f7023g + this.f7027k) - f3) + f4;
    }

    /* JADX INFO: renamed from: k */
    private CharSequence m7498k() {
        return this.f7021e.m7404p();
    }

    /* JADX INFO: renamed from: m */
    private float m7499m(float f3) {
        return (this.f7022f - this.f7026j) + f3;
    }

    /* JADX INFO: renamed from: q */
    private String m7500q() {
        if (this.f7024h == -2 || m7518p() <= this.f7024h) {
            return NumberFormat.getInstance(this.f7021e.m7412x()).format(m7518p());
        }
        Context context = (Context) this.f7017a.get();
        return context == null ? "" : String.format(this.f7021e.m7412x(), context.getString(AbstractC0148i.f556p), Integer.valueOf(this.f7024h), "+");
    }

    /* JADX INFO: renamed from: r */
    private String m7501r() {
        Context context;
        if (this.f7021e.m7405q() == 0 || (context = (Context) this.f7017a.get()) == null) {
            return null;
        }
        return (this.f7024h == -2 || m7518p() <= this.f7024h) ? context.getResources().getQuantityString(this.f7021e.m7405q(), m7518p(), Integer.valueOf(m7518p())) : context.getString(this.f7021e.m7402n(), Integer.valueOf(this.f7024h));
    }

    /* JADX INFO: renamed from: s */
    private float m7502s(float f3, float f4) {
        return ((this.f7022f + this.f7026j) - f3) + f4;
    }

    /* JADX INFO: renamed from: v */
    private String m7503v() {
        String strM7520u = m7520u();
        int iM7516n = m7516n();
        if (iM7516n == -2 || strM7520u == null || strM7520u.length() <= iM7516n) {
            return strM7520u;
        }
        Context context = (Context) this.f7017a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(AbstractC0148i.f549i), strM7520u.substring(0, iM7516n - 1), "…");
    }

    /* JADX INFO: renamed from: w */
    private CharSequence m7504w() {
        CharSequence charSequenceM7403o = this.f7021e.m7403o();
        return charSequenceM7403o != null ? charSequenceM7403o : m7520u();
    }

    /* JADX INFO: renamed from: x */
    private float m7505x(float f3) {
        return (this.f7023g - this.f7027k) + f3;
    }

    /* JADX INFO: renamed from: y */
    private int m7506y() {
        int iM7406r = m7477A() ? this.f7021e.m7406r() : this.f7021e.m7407s();
        if (this.f7021e.f6982k == 1) {
            iM7406r += m7477A() ? this.f7021e.f6981j : this.f7021e.f6980i;
        }
        return iM7406r + this.f7021e.m7390b();
    }

    /* JADX INFO: renamed from: z */
    private int m7507z() {
        int iM7384C = this.f7021e.m7384C();
        if (m7477A()) {
            iM7384C = this.f7021e.m7383B();
            Context context = (Context) this.f7017a.get();
            if (context != null) {
                iM7384C = AbstractC0176a.m484c(iM7384C, iM7384C - this.f7021e.m7408t(), AbstractC0176a.m483b(0.0f, 1.0f, 0.3f, 1.0f, AbstractC0557c.m2082f(context) - 1.0f));
            }
        }
        if (this.f7021e.f6982k == 0) {
            iM7384C -= Math.round(this.f7027k);
        }
        return iM7384C + this.f7021e.m7391c();
    }

    /* JADX INFO: renamed from: B */
    public boolean m7508B() {
        return !this.f7021e.m7386E() && this.f7021e.m7385D();
    }

    /* JADX INFO: renamed from: C */
    public boolean m7509C() {
        return this.f7021e.m7386E();
    }

    /* JADX INFO: renamed from: N */
    public void m7510N(int i3) {
        BadgeState badgeState = this.f7021e;
        if (badgeState.f6983l != i3) {
            badgeState.f6983l = i3;
            m7489Q();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m7511P(View view, FrameLayout frameLayout) {
        this.f7028l = new WeakReference(view);
        this.f7029m = new WeakReference(frameLayout);
        m7488O(view);
        m7489Q();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.C1543n.b
    /* JADX INFO: renamed from: a */
    public void mo7512a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f7018b.draw(canvas);
        if (m7477A()) {
            m7495f(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7021e.m7392d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7020d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7020d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m7513i() {
        if (isVisible()) {
            return m7509C() ? m7504w() : m7508B() ? m7501r() : m7498k();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public FrameLayout m7514j() {
        WeakReference weakReference = this.f7029m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public int m7515l() {
        return this.f7021e.m7407s();
    }

    /* JADX INFO: renamed from: n */
    public int m7516n() {
        return this.f7021e.m7409u();
    }

    /* JADX INFO: renamed from: o */
    public int m7517o() {
        return this.f7021e.m7410v();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C1543n.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: p */
    public int m7518p() {
        if (this.f7021e.m7385D()) {
            return this.f7021e.m7411w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f7021e.m7389I(i3);
        m7478D();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: t */
    BadgeState.State m7519t() {
        return this.f7021e.m7413y();
    }

    /* JADX INFO: renamed from: u */
    public String m7520u() {
        return this.f7021e.m7414z();
    }
}
