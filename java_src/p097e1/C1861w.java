package p097e1;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: e1.w */
/* JADX INFO: loaded from: classes.dex */
final class C1861w extends AbstractRunnableC1855q {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ IBinder f9295e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ ServiceConnectionC1864z f9296f;

    C1861w(ServiceConnectionC1864z serviceConnectionC1864z, IBinder iBinder) {
        this.f9296f = serviceConnectionC1864z;
        this.f9295e = iBinder;
    }

    @Override // p097e1.AbstractRunnableC1855q
    /* JADX INFO: renamed from: a */
    public final void mo9559a() {
        this.f9296f.f9298a.f9268m = AbstractBinderC1848j.m9645e(this.f9295e);
        C1836A.m9624q(this.f9296f.f9298a);
        this.f9296f.f9298a.f9262g = false;
        Iterator it = this.f9296f.f9298a.f9259d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f9296f.f9298a.f9259d.clear();
    }
}
