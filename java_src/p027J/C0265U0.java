package p027J;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C0929i;

/* JADX INFO: renamed from: J.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265U0 {

    /* JADX INFO: renamed from: a */
    private final g f1273a;

    /* JADX INFO: renamed from: J.U0$a */
    private static class a extends g {

        /* JADX INFO: renamed from: a */
        protected final Window f1274a;

        /* JADX INFO: renamed from: b */
        private final C0247L f1275b;

        a(Window window, C0247L c0247l) {
            this.f1274a = window;
            this.f1275b = c0247l;
        }

        /* JADX INFO: renamed from: f */
        private void m716f(int i3) {
            if (i3 == 1) {
                m721g(4);
            } else if (i3 == 2) {
                m721g(2);
            } else {
                if (i3 != 8) {
                    return;
                }
                this.f1275b.m678a();
            }
        }

        /* JADX INFO: renamed from: i */
        private void m717i(int i3) {
            if (i3 == 1) {
                m723j(4);
                m724k(1024);
            } else if (i3 == 2) {
                m723j(2);
            } else {
                if (i3 != 8) {
                    return;
                }
                this.f1275b.m679b();
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: a */
        void mo718a(int i3) {
            for (int i4 = 1; i4 <= 512; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    m716f(i4);
                }
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: d */
        void mo719d(int i3) {
            this.f1274a.getDecorView().setTag(356039078, Integer.valueOf(i3));
            if (i3 == 0) {
                m723j(6144);
                return;
            }
            if (i3 == 1) {
                m723j(4096);
                m721g(2048);
            } else {
                if (i3 != 2) {
                    return;
                }
                m723j(2048);
                m721g(4096);
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: e */
        void mo720e(int i3) {
            for (int i4 = 1; i4 <= 512; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    m717i(i4);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        protected void m721g(int i3) {
            View decorView = this.f1274a.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: h */
        protected void m722h(int i3) {
            this.f1274a.addFlags(i3);
        }

        /* JADX INFO: renamed from: j */
        protected void m723j(int i3) {
            View decorView = this.f1274a.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: k */
        protected void m724k(int i3) {
            this.f1274a.clearFlags(i3);
        }
    }

    /* JADX INFO: renamed from: J.U0$b */
    private static class b extends a {
        b(Window window, C0247L c0247l) {
            super(window, c0247l);
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: c */
        public void mo725c(boolean z2) {
            if (!z2) {
                m723j(8192);
                return;
            }
            m724k(67108864);
            m722h(Integer.MIN_VALUE);
            m721g(8192);
        }
    }

    /* JADX INFO: renamed from: J.U0$c */
    private static class c extends b {
        c(Window window, C0247L c0247l) {
            super(window, c0247l);
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: b */
        public void mo726b(boolean z2) {
            if (!z2) {
                m723j(16);
                return;
            }
            m724k(134217728);
            m722h(Integer.MIN_VALUE);
            m721g(16);
        }
    }

    /* JADX INFO: renamed from: J.U0$e */
    private static class e extends d {
        e(Window window, C0265U0 c0265u0, C0247L c0247l) {
            super(window, c0265u0, c0247l);
        }

        @Override // p027J.C0265U0.d, p027J.C0265U0.g
        /* JADX INFO: renamed from: d */
        void mo719d(int i3) {
            this.f1277b.setSystemBarsBehavior(i3);
        }

        e(WindowInsetsController windowInsetsController, C0265U0 c0265u0, C0247L c0247l) {
            super(windowInsetsController, c0265u0, c0247l);
        }
    }

    /* JADX INFO: renamed from: J.U0$f */
    private static class f extends e {
        f(Window window, C0265U0 c0265u0, C0247L c0247l) {
            super(window, c0265u0, c0247l);
        }

        f(WindowInsetsController windowInsetsController, C0265U0 c0265u0, C0247L c0247l) {
            super(windowInsetsController, c0265u0, c0247l);
        }
    }

    private C0265U0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1273a = new f(windowInsetsController, this, new C0247L(windowInsetsController));
        } else {
            this.f1273a = new d(windowInsetsController, this, new C0247L(windowInsetsController));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0265U0 m710f(WindowInsetsController windowInsetsController) {
        return new C0265U0(windowInsetsController);
    }

    /* JADX INFO: renamed from: a */
    public void m711a(int i3) {
        this.f1273a.mo718a(i3);
    }

    /* JADX INFO: renamed from: b */
    public void m712b(boolean z2) {
        this.f1273a.mo726b(z2);
    }

    /* JADX INFO: renamed from: c */
    public void m713c(boolean z2) {
        this.f1273a.mo725c(z2);
    }

    /* JADX INFO: renamed from: d */
    public void m714d(int i3) {
        this.f1273a.mo719d(i3);
    }

    /* JADX INFO: renamed from: e */
    public void m715e(int i3) {
        this.f1273a.mo720e(i3);
    }

    /* JADX INFO: renamed from: J.U0$d */
    private static class d extends g {

        /* JADX INFO: renamed from: a */
        final C0265U0 f1276a;

        /* JADX INFO: renamed from: b */
        final WindowInsetsController f1277b;

        /* JADX INFO: renamed from: c */
        final C0247L f1278c;

        /* JADX INFO: renamed from: d */
        private final C0929i f1279d;

        /* JADX INFO: renamed from: e */
        protected Window f1280e;

        d(Window window, C0265U0 c0265u0, C0247L c0247l) {
            this(window.getInsetsController(), c0265u0, c0247l);
            this.f1280e = window;
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: a */
        void mo718a(int i3) {
            if ((i3 & 8) != 0) {
                this.f1278c.m678a();
            }
            this.f1277b.hide(i3 & (-9));
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: b */
        public void mo726b(boolean z2) {
            if (z2) {
                if (this.f1280e != null) {
                    m727f(16);
                }
                this.f1277b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f1280e != null) {
                    m728g(16);
                }
                this.f1277b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: c */
        public void mo725c(boolean z2) {
            if (z2) {
                if (this.f1280e != null) {
                    m727f(8192);
                }
                this.f1277b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f1280e != null) {
                    m728g(8192);
                }
                this.f1277b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: d */
        void mo719d(int i3) {
            Window window = this.f1280e;
            if (window == null) {
                this.f1277b.setSystemBarsBehavior(i3);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i3));
            if (i3 == 0) {
                m728g(6144);
                return;
            }
            if (i3 == 1) {
                m728g(4096);
                m727f(2048);
            } else {
                if (i3 != 2) {
                    return;
                }
                m728g(2048);
                m727f(4096);
            }
        }

        @Override // p027J.C0265U0.g
        /* JADX INFO: renamed from: e */
        void mo720e(int i3) {
            if ((i3 & 8) != 0) {
                this.f1278c.m679b();
            }
            this.f1277b.show(i3 & (-9));
        }

        /* JADX INFO: renamed from: f */
        protected void m727f(int i3) {
            View decorView = this.f1280e.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        protected void m728g(int i3) {
            View decorView = this.f1280e.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, C0265U0 c0265u0, C0247L c0247l) {
            this.f1279d = new C0929i();
            this.f1277b = windowInsetsController;
            this.f1276a = c0265u0;
            this.f1278c = c0247l;
        }
    }

    public C0265U0(Window window, View view) {
        C0247L c0247l = new C0247L(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            this.f1273a = new f(window, this, c0247l);
            return;
        }
        if (i3 >= 30) {
            this.f1273a = new d(window, this, c0247l);
        } else if (i3 >= 26) {
            this.f1273a = new c(window, c0247l);
        } else {
            this.f1273a = new b(window, c0247l);
        }
    }

    /* JADX INFO: renamed from: J.U0$g */
    private static class g {
        g() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo718a(int i3);

        /* JADX INFO: renamed from: c */
        public abstract void mo725c(boolean z2);

        /* JADX INFO: renamed from: d */
        abstract void mo719d(int i3);

        /* JADX INFO: renamed from: e */
        abstract void mo720e(int i3);

        /* JADX INFO: renamed from: b */
        public void mo726b(boolean z2) {
        }
    }
}
