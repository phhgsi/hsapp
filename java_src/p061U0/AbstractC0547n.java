package p061U0;

import androidx.vectordrawable.graphics.drawable.AbstractC1283b;
import java.util.ArrayList;
import java.util.List;
import p009D.AbstractC0091a;
import p061U0.AbstractC0546m;

/* JADX INFO: renamed from: U0.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0547n {

    /* JADX INFO: renamed from: a */
    protected C0548o f1939a;

    /* JADX INFO: renamed from: b */
    protected final List f1940b = new ArrayList();

    protected AbstractC0547n(int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            this.f1940b.add(new AbstractC0546m.a());
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo1969a();

    /* JADX INFO: renamed from: b */
    protected float m2050b(int i3, int i4, int i5) {
        return AbstractC0091a.m257a((i3 - i4) / i5, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1970c();

    /* JADX INFO: renamed from: d */
    public abstract void mo1971d(AbstractC1283b abstractC1283b);

    /* JADX INFO: renamed from: e */
    protected void m2051e(C0548o c0548o) {
        this.f1939a = c0548o;
    }

    /* JADX INFO: renamed from: f */
    abstract void mo1972f();

    /* JADX INFO: renamed from: g */
    abstract void mo1973g();

    /* JADX INFO: renamed from: h */
    public abstract void mo1974h();
}
