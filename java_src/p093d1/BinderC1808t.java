package p093d1;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097e1.C1854p;
import p105g1.C1978a;

/* JADX INFO: renamed from: d1.t */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1808t extends AbstractBinderC1807s {

    /* JADX INFO: renamed from: d */
    private final String f9190d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C1809u f9191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC1808t(C1809u c1809u, TaskCompletionSource taskCompletionSource, String str) {
        super(c1809u, new C1854p("OnRequestInstallCallback"), taskCompletionSource);
        this.f9191e = c1809u;
        this.f9190d = str;
    }

    @Override // p093d1.AbstractBinderC1807s, p097e1.InterfaceC1851m
    /* JADX INFO: renamed from: a */
    public final void mo9560a(Bundle bundle) {
        super.mo9560a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f9188b.trySetException(new C1978a(bundle.getInt("error.code", -2)));
        } else {
            this.f9188b.trySetResult(C1809u.m9564d(this.f9191e, bundle, this.f9190d));
        }
    }
}
