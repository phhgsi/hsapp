package p093d1;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097e1.AbstractRunnableC1855q;

/* JADX INFO: renamed from: d1.r */
/* JADX INFO: loaded from: classes.dex */
final class C1806r extends AbstractRunnableC1855q {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ String f9184e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ TaskCompletionSource f9185f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C1809u f9186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1806r(C1809u c1809u, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f9186g = c1809u;
        this.f9184e = str;
        this.f9185f = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, e1.k] */
    @Override // p097e1.AbstractRunnableC1855q
    /* JADX INFO: renamed from: a */
    protected final void mo9559a() {
        try {
            ?? M9629e = this.f9186g.f9194a.m9629e();
            C1809u c1809u = this.f9186g;
            M9629e.mo9644b(c1809u.f9195b, C1809u.m9563b(c1809u, this.f9184e), new BinderC1808t(this.f9186g, this.f9185f, this.f9184e));
        } catch (RemoteException e3) {
            C1809u.f9192e.m9649b(e3, "requestUpdateInfo(%s)", this.f9184e);
            this.f9185f.trySetException(new RuntimeException(e3));
        }
    }
}
