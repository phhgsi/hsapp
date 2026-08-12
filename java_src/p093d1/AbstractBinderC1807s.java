package p093d1;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097e1.AbstractBinderC1850l;
import p097e1.C1854p;

/* JADX INFO: renamed from: d1.s */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBinderC1807s extends AbstractBinderC1850l {

    /* JADX INFO: renamed from: a */
    final C1854p f9187a;

    /* JADX INFO: renamed from: b */
    final TaskCompletionSource f9188b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1809u f9189c;

    AbstractBinderC1807s(C1809u c1809u, C1854p c1854p, TaskCompletionSource taskCompletionSource) {
        this.f9189c = c1809u;
        this.f9187a = c1854p;
        this.f9188b = taskCompletionSource;
    }

    @Override // p097e1.InterfaceC1851m
    /* JADX INFO: renamed from: a */
    public void mo9560a(Bundle bundle) {
        this.f9189c.f9194a.m9632u(this.f9188b);
        this.f9187a.m9650c("onRequestInfo", new Object[0]);
    }

    @Override // p097e1.InterfaceC1851m
    /* JADX INFO: renamed from: c */
    public void mo9561c(Bundle bundle) {
        this.f9189c.f9194a.m9632u(this.f9188b);
        this.f9187a.m9650c("onCompleteUpdate", new Object[0]);
    }
}
