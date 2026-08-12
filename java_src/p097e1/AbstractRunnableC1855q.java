package p097e1;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: e1.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1855q implements Runnable {

    /* JADX INFO: renamed from: d */
    private final TaskCompletionSource f9287d;

    AbstractRunnableC1855q() {
        this.f9287d = null;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo9559a();

    /* JADX INFO: renamed from: b */
    final TaskCompletionSource m9652b() {
        return this.f9287d;
    }

    /* JADX INFO: renamed from: c */
    public final void m9653c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f9287d;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo9559a();
        } catch (Exception e3) {
            m9653c(e3);
        }
    }

    public AbstractRunnableC1855q(TaskCompletionSource taskCompletionSource) {
        this.f9287d = taskCompletionSource;
    }
}
