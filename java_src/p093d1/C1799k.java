package p093d1;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p101f1.InterfaceC1892a;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes.dex */
final class C1799k implements InterfaceC1892a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Activity f9172a;

    C1799k(C1800l c1800l, Activity activity) {
        this.f9172a = activity;
    }

    @Override // p101f1.InterfaceC1892a
    /* JADX INFO: renamed from: a */
    public final void mo9555a(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) throws IntentSender.SendIntentException {
        this.f9172a.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
