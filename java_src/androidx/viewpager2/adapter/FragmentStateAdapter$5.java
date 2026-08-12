package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC1126h;
import androidx.lifecycle.InterfaceC1130l;
import androidx.lifecycle.InterfaceC1132n;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC1130l {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Handler f6332d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Runnable f6333e;

    @Override // androidx.lifecycle.InterfaceC1130l
    /* JADX INFO: renamed from: d */
    public void mo2537d(InterfaceC1132n interfaceC1132n, AbstractC1126h.a aVar) {
        if (aVar == AbstractC1126h.a.ON_DESTROY) {
            this.f6332d.removeCallbacks(this.f6333e);
            interfaceC1132n.getLifecycle().mo5134c(this);
        }
    }
}
