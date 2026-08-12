package p012E;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0106c {

    /* JADX INFO: renamed from: E.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static Object m325a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m324a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m325a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
