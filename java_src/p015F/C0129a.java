package p015F;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import p015F.AbstractC0137i;
import p015F.AbstractC0138j;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
class C0129a {

    /* JADX INFO: renamed from: a */
    private final AbstractC0138j.c f251a;

    /* JADX INFO: renamed from: b */
    private final Executor f252b;

    /* JADX INFO: renamed from: F.a$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC0138j.c f253d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Typeface f254e;

        a(AbstractC0138j.c cVar, Typeface typeface) {
            this.f253d = cVar;
            this.f254e = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f253d.mo419b(this.f254e);
        }
    }

    /* JADX INFO: renamed from: F.a$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC0138j.c f256d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f257e;

        b(AbstractC0138j.c cVar, int i3) {
            this.f256d = cVar;
            this.f257e = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f256d.mo418a(this.f257e);
        }
    }

    C0129a(AbstractC0138j.c cVar, Executor executor) {
        this.f251a = cVar;
        this.f252b = executor;
    }

    /* JADX INFO: renamed from: a */
    private void m366a(int i3) {
        this.f252b.execute(new b(this.f251a, i3));
    }

    /* JADX INFO: renamed from: c */
    private void m367c(Typeface typeface) {
        this.f252b.execute(new a(this.f251a, typeface));
    }

    /* JADX INFO: renamed from: b */
    void m368b(AbstractC0137i.e eVar) {
        if (eVar.m399a()) {
            m367c(eVar.f288a);
        } else {
            m366a(eVar.f289b);
        }
    }
}
