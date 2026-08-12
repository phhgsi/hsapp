package p076Z0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import p031K0.AbstractC0358a;

/* JADX INFO: renamed from: Z0.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0645p {

    /* JADX INFO: renamed from: c */
    C0641l f2302c;

    /* JADX INFO: renamed from: a */
    boolean f2300a = false;

    /* JADX INFO: renamed from: b */
    boolean f2301b = false;

    /* JADX INFO: renamed from: d */
    RectF f2303d = new RectF();

    /* JADX INFO: renamed from: e */
    final Path f2304e = new Path();

    /* JADX INFO: renamed from: a */
    public static AbstractC0645p m2428a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new C0647r(view) : new C0646q(view);
    }

    /* JADX INFO: renamed from: c */
    private boolean m2429c() {
        RectF rectF = this.f2303d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    /* JADX INFO: renamed from: j */
    private void m2430j() {
        if (!m2429c() || this.f2302c == null) {
            return;
        }
        C0642m.m2371l().m2376e(this.f2302c, 1.0f, this.f2303d, this.f2304e);
    }

    /* JADX INFO: renamed from: b */
    abstract void mo2431b(View view);

    /* JADX INFO: renamed from: d */
    public void m2432d(Canvas canvas, AbstractC0358a.a aVar) {
        if (!mo2437i() || this.f2304e.isEmpty()) {
            aVar.mo1327a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f2304e);
        aVar.mo1327a(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m2433e(View view, RectF rectF) {
        this.f2303d = rectF;
        m2430j();
        mo2431b(view);
    }

    /* JADX INFO: renamed from: f */
    public void m2434f(View view, C0641l c0641l) {
        this.f2302c = c0641l;
        m2430j();
        mo2431b(view);
    }

    /* JADX INFO: renamed from: g */
    public void m2435g(View view, boolean z2) {
        if (z2 != this.f2300a) {
            this.f2300a = z2;
            mo2431b(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2436h(View view, boolean z2) {
        this.f2301b = z2;
        mo2431b(view);
    }

    /* JADX INFO: renamed from: i */
    abstract boolean mo2437i();
}
