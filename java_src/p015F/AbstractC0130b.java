package p015F;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: F.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0130b {
    /* JADX INFO: renamed from: a */
    static Handler m369a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
