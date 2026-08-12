package p061U0;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import androidx.vectordrawable.graphics.drawable.C1289h;
import p016F0.AbstractC0143d;

/* JADX INFO: renamed from: U0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0548o extends AbstractC0545l {

    /* JADX INFO: renamed from: r */
    private AbstractC0546m f1941r;

    /* JADX INFO: renamed from: s */
    private AbstractC0547n f1942s;

    /* JADX INFO: renamed from: t */
    private Drawable f1943t;

    C0548o(Context context, AbstractC0536c abstractC0536c, AbstractC0546m abstractC0546m, AbstractC0547n abstractC0547n) {
        super(context, abstractC0536c);
        m2054A(abstractC0546m);
        m2058z(abstractC0547n);
    }

    /* JADX INFO: renamed from: v */
    static C0548o m2052v(Context context, C0541h c0541h, C0537d c0537d) {
        C0548o c0548o = new C0548o(context, c0541h, c0537d, c0541h.f1883o == 1 ? new C0539f(context, c0541h) : new C0538e(c0541h));
        c0548o.m2055B(C1289h.m6509b(context.getResources(), AbstractC0143d.f446b, null));
        return c0548o;
    }

    /* JADX INFO: renamed from: y */
    private boolean m2053y() {
        C0534a c0534a = this.f1906c;
        return c0534a != null && c0534a.m1914a(this.f1904a.getContentResolver()) == 0.0f;
    }

    /* JADX INFO: renamed from: A */
    void m2054A(AbstractC0546m abstractC0546m) {
        this.f1941r = abstractC0546m;
    }

    /* JADX INFO: renamed from: B */
    public void m2055B(Drawable drawable) {
        this.f1943t = drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061U0.C0548o.draw(android.graphics.Canvas):void");
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1941r.mo1953e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1941r.mo1954f();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo2019j() {
        return super.mo2019j();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo2020l() {
        return super.mo2020l();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo2021m() {
        return super.mo2021m();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void mo2022o(AbstractC1283b abstractC1283b) {
        super.mo2022o(abstractC1283b);
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo2023s(boolean z2, boolean z3, boolean z4) {
        return super.mo2023s(z2, z3, z4);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i3) {
        super.setAlpha(i3);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3);
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p061U0.AbstractC0545l, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: t */
    boolean mo2024t(boolean z2, boolean z3, boolean z4) {
        Drawable drawable;
        boolean zMo2024t = super.mo2024t(z2, z3, z4);
        if (m2053y() && (drawable = this.f1943t) != null) {
            return drawable.setVisible(z2, z3);
        }
        if (!isRunning()) {
            this.f1942s.mo1969a();
        }
        if (!z2 || !z4) {
            return zMo2024t;
        }
        this.f1942s.mo1973g();
        return zMo2024t;
    }

    @Override // p061U0.AbstractC0545l
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo2025u(AbstractC1283b abstractC1283b) {
        return super.mo2025u(abstractC1283b);
    }

    /* JADX INFO: renamed from: w */
    AbstractC0547n m2056w() {
        return this.f1942s;
    }

    /* JADX INFO: renamed from: x */
    AbstractC0546m m2057x() {
        return this.f1941r;
    }

    /* JADX INFO: renamed from: z */
    void m2058z(AbstractC0547n abstractC0547n) {
        this.f1942s = abstractC0547n;
        abstractC0547n.m2051e(this);
    }
}
