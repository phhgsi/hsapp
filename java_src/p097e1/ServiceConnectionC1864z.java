package p097e1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: e1.z */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1864z implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1836A f9298a;

    /* synthetic */ ServiceConnectionC1864z(C1836A c1836a, AbstractC1863y abstractC1863y) {
        this.f9298a = c1836a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9298a.f9257b.m9650c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f9298a.m9628c().post(new C1861w(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9298a.f9257b.m9650c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f9298a.m9628c().post(new C1862x(this));
    }
}
