package p027J;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: renamed from: J.J */
/* JADX INFO: loaded from: classes.dex */
public class C0243J {

    /* JADX INFO: renamed from: a */
    private final d f1259a;

    /* JADX INFO: renamed from: J.J$b */
    private static class b implements d {

        /* JADX INFO: renamed from: a */
        private final ScrollFeedbackProvider f1260a;

        b(View view) {
            this.f1260a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // p027J.C0243J.d
        /* JADX INFO: renamed from: a */
        public void mo674a(int i3, int i4, int i5, boolean z2) {
            this.f1260a.onScrollLimit(i3, i4, i5, z2);
        }

        @Override // p027J.C0243J.d
        /* JADX INFO: renamed from: b */
        public void mo675b(int i3, int i4, int i5, int i6) {
            this.f1260a.onScrollProgress(i3, i4, i5, i6);
        }
    }

    /* JADX INFO: renamed from: J.J$d */
    private interface d {
        /* JADX INFO: renamed from: a */
        void mo674a(int i3, int i4, int i5, boolean z2);

        /* JADX INFO: renamed from: b */
        void mo675b(int i3, int i4, int i5, int i6);
    }

    private C0243J(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1259a = new b(view);
        } else {
            this.f1259a = new c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0243J m671a(View view) {
        return new C0243J(view);
    }

    /* JADX INFO: renamed from: b */
    public void m672b(int i3, int i4, int i5, boolean z2) {
        this.f1259a.mo674a(i3, i4, i5, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m673c(int i3, int i4, int i5, int i6) {
        this.f1259a.mo675b(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: J.J$c */
    private static class c implements d {
        private c() {
        }

        @Override // p027J.C0243J.d
        /* JADX INFO: renamed from: a */
        public void mo674a(int i3, int i4, int i5, boolean z2) {
        }

        @Override // p027J.C0243J.d
        /* JADX INFO: renamed from: b */
        public void mo675b(int i3, int i4, int i5, int i6) {
        }
    }
}
