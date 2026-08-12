package p167z;

import android.graphics.Paint;

/* JADX INFO: renamed from: z.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2573f {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f11903a = new ThreadLocal();

    /* JADX INFO: renamed from: z.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m12277a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12276a(Paint paint, String str) {
        return a.m12277a(paint, str);
    }
}
