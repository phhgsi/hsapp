package p150t0;

import java.util.concurrent.Executor;
import p162x0.AbstractC2523a;

/* JADX INFO: renamed from: t0.m */
/* JADX INFO: loaded from: classes.dex */
class ExecutorC2437m implements Executor {

    /* JADX INFO: renamed from: d */
    private final Executor f11412d;

    /* JADX INFO: renamed from: t0.m$a */
    static class a implements Runnable {

        /* JADX INFO: renamed from: d */
        private final Runnable f11413d;

        a(Runnable runnable) {
            this.f11413d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11413d.run();
            } catch (Exception e3) {
                AbstractC2523a.m12056d("Executor", "Background execution failure.", e3);
            }
        }
    }

    ExecutorC2437m(Executor executor) {
        this.f11412d = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11412d.execute(new a(runnable));
    }
}
