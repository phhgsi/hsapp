package p027J;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: J.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0290i0 {

    /* JADX INFO: renamed from: J.i0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m980a(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: J.i0$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m981a(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z2);
        }
    }

    /* JADX INFO: renamed from: J.i0$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static void m982a(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0265U0 m978a(Window window, View view) {
        return new C0265U0(window, view);
    }

    /* JADX INFO: renamed from: b */
    public static void m979b(Window window, boolean z2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            c.m982a(window, z2);
        } else if (i3 >= 30) {
            b.m981a(window, z2);
        } else {
            a.m980a(window, z2);
        }
    }
}
