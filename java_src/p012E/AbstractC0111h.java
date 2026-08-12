package p012E;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p024I.AbstractC0211h;

/* JADX INFO: renamed from: E.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111h {

    /* JADX INFO: renamed from: E.h$a */
    private static class a implements Executor {

        /* JADX INFO: renamed from: d */
        private final Handler f232d;

        a(Handler handler) {
            this.f232d = (Handler) AbstractC0211h.m610g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f232d.post((Runnable) AbstractC0211h.m610g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f232d + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m335a(Handler handler) {
        return new a(handler);
    }
}
