package p058T0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.C0702b;
import p016F0.AbstractC0140a;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521a {

    /* JADX INFO: renamed from: a */
    private final TimeInterpolator f1777a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    protected final View f1778b;

    /* JADX INFO: renamed from: c */
    protected final int f1779c;

    /* JADX INFO: renamed from: d */
    protected final int f1780d;

    /* JADX INFO: renamed from: e */
    protected final int f1781e;

    /* JADX INFO: renamed from: f */
    private C0702b f1782f;

    public AbstractC0521a(View view) {
        this.f1778b = view;
        Context context = view.getContext();
        this.f1779c = AbstractC0528h.m1910f(context, AbstractC0140a.f358z, 300);
        this.f1780d = AbstractC0528h.m1910f(context, AbstractC0140a.f310C, 150);
        this.f1781e = AbstractC0528h.m1910f(context, AbstractC0140a.f309B, 100);
    }

    /* JADX INFO: renamed from: a */
    public float m1872a(float f3) {
        return this.f1777a.getInterpolation(f3);
    }

    /* JADX INFO: renamed from: b */
    protected C0702b m1873b() {
        if (this.f1782f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0702b c0702b = this.f1782f;
        this.f1782f = null;
        return c0702b;
    }

    /* JADX INFO: renamed from: c */
    public C0702b m1874c() {
        C0702b c0702b = this.f1782f;
        this.f1782f = null;
        return c0702b;
    }

    /* JADX INFO: renamed from: d */
    protected void m1875d(C0702b c0702b) {
        this.f1782f = c0702b;
    }

    /* JADX INFO: renamed from: e */
    protected C0702b m1876e(C0702b c0702b) {
        if (this.f1782f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0702b c0702b2 = this.f1782f;
        this.f1782f = c0702b;
        return c0702b2;
    }
}
