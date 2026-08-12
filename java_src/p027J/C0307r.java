package p027J;

import android.os.Build;
import android.view.DisplayCutout;
import p024I.AbstractC0206c;

/* JADX INFO: renamed from: J.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0307r {

    /* JADX INFO: renamed from: a */
    private final DisplayCutout f1378a;

    /* JADX INFO: renamed from: J.r$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m1047a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: b */
        static int m1048b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: c */
        static int m1049c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: d */
        static int m1050d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0307r(DisplayCutout displayCutout) {
        this.f1378a = displayCutout;
    }

    /* JADX INFO: renamed from: e */
    static C0307r m1042e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0307r(displayCutout);
    }

    /* JADX INFO: renamed from: a */
    public int m1043a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1047a(this.f1378a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m1044b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1048b(this.f1378a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int m1045c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1049c(this.f1378a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m1046d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1050d(this.f1378a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0307r.class != obj.getClass()) {
            return false;
        }
        return AbstractC0206c.m596a(this.f1378a, ((C0307r) obj).f1378a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f1378a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1378a + "}";
    }
}
