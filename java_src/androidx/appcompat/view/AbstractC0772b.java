package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.view.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0772b {

    /* JADX INFO: renamed from: a */
    private Object f2816a;

    /* JADX INFO: renamed from: b */
    private boolean f2817b;

    /* JADX INFO: renamed from: androidx.appcompat.view.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo2929a(AbstractC0772b abstractC0772b, Menu menu);

        /* JADX INFO: renamed from: b */
        void mo2930b(AbstractC0772b abstractC0772b);

        /* JADX INFO: renamed from: c */
        boolean mo2931c(AbstractC0772b abstractC0772b, MenuItem menuItem);

        /* JADX INFO: renamed from: d */
        boolean mo2932d(AbstractC0772b abstractC0772b, Menu menu);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2754c();

    /* JADX INFO: renamed from: d */
    public abstract View mo2755d();

    /* JADX INFO: renamed from: e */
    public abstract Menu mo2756e();

    /* JADX INFO: renamed from: f */
    public abstract MenuInflater mo2757f();

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo2758g();

    /* JADX INFO: renamed from: h */
    public Object m3004h() {
        return this.f2816a;
    }

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo2759i();

    /* JADX INFO: renamed from: j */
    public boolean m3005j() {
        return this.f2817b;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2760k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo2761l();

    /* JADX INFO: renamed from: m */
    public abstract void mo2762m(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo2763n(int i3);

    /* JADX INFO: renamed from: o */
    public abstract void mo2764o(CharSequence charSequence);

    /* JADX INFO: renamed from: p */
    public void m3006p(Object obj) {
        this.f2816a = obj;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo2765q(int i3);

    /* JADX INFO: renamed from: r */
    public abstract void mo2766r(CharSequence charSequence);

    /* JADX INFO: renamed from: s */
    public void mo2767s(boolean z2) {
        this.f2817b = z2;
    }
}
