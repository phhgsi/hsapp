package p075Z;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: Z.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0624b {
    /* JADX INFO: renamed from: a */
    public static SharedPreferences m2211a(Context context) {
        return context.getSharedPreferences(m2213c(context), m2212b());
    }

    /* JADX INFO: renamed from: b */
    private static int m2212b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private static String m2213c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
