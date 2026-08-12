package p097e1;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: e1.t */
/* JADX INFO: loaded from: classes.dex */
final class C1858t extends AbstractRunnableC1855q {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ TaskCompletionSource f9291e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ AbstractRunnableC1855q f9292f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C1836A f9293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1858t(C1836A c1836a, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC1855q abstractRunnableC1855q) {
        super(taskCompletionSource);
        this.f9293g = c1836a;
        this.f9291e = taskCompletionSource2;
        this.f9292f = abstractRunnableC1855q;
    }

    @Override // p097e1.AbstractRunnableC1855q
    /* JADX INFO: renamed from: a */
    public final void mo9559a() {
        synchronized (this.f9293g.f9261f) {
            try {
                C1836A.m9621n(this.f9293g, this.f9291e);
                if (this.f9293g.f9266k.getAndIncrement() > 0) {
                    this.f9293g.f9257b.m9650c("Already connected to the service.", new Object[0]);
                }
                C1836A.m9623p(this.f9293g, this.f9292f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
