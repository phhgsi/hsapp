package p150t0;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: t0.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2434j {
    /* JADX INFO: renamed from: a */
    static Executor m11718a() {
        return new ExecutorC2437m(Executors.newSingleThreadExecutor());
    }
}
