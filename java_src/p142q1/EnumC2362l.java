package p142q1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q1.l */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2362l implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: e */
    private static final Handler f10819e = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f10819e.post(runnable);
    }
}
