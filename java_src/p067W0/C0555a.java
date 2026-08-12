package p067W0;

import android.graphics.Typeface;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0555a extends AbstractC0561g {

    /* JADX INFO: renamed from: a */
    private final Typeface f1949a;

    /* JADX INFO: renamed from: b */
    private final a f1950b;

    /* JADX INFO: renamed from: c */
    private boolean f1951c;

    /* JADX INFO: renamed from: W0.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2068a(Typeface typeface);
    }

    public C0555a(a aVar, Typeface typeface) {
        this.f1949a = typeface;
        this.f1950b = aVar;
    }

    /* JADX INFO: renamed from: d */
    private void m2064d(Typeface typeface) {
        if (this.f1951c) {
            return;
        }
        this.f1950b.mo2068a(typeface);
    }

    @Override // p067W0.AbstractC0561g
    /* JADX INFO: renamed from: a */
    public void mo2065a(int i3) {
        m2064d(this.f1949a);
    }

    @Override // p067W0.AbstractC0561g
    /* JADX INFO: renamed from: b */
    public void mo2066b(Typeface typeface, boolean z2) {
        m2064d(typeface);
    }

    /* JADX INFO: renamed from: c */
    public void m2067c() {
        this.f1951c = true;
    }
}
