package p093d1;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import p101f1.InterfaceC1892a;

/* JADX INFO: renamed from: d1.l */
/* JADX INFO: loaded from: classes.dex */
final class C1800l implements InterfaceC1790b {

    /* JADX INFO: renamed from: a */
    private final C1809u f9173a;

    /* JADX INFO: renamed from: b */
    private final C1797i f9174b;

    /* JADX INFO: renamed from: c */
    private final Context f9175c;

    /* JADX INFO: renamed from: d */
    private final Handler f9176d = new Handler(Looper.getMainLooper());

    C1800l(C1809u c1809u, C1797i c1797i, Context context) {
        this.f9173a = c1809u;
        this.f9174b = c1797i;
        this.f9175c = context;
    }

    @Override // p093d1.InterfaceC1790b
    /* JADX INFO: renamed from: a */
    public final Task mo9545a() {
        return this.f9173a.m9570c(this.f9175c.getPackageName());
    }

    @Override // p093d1.InterfaceC1790b
    /* JADX INFO: renamed from: b */
    public final boolean mo9546b(C1789a c1789a, int i3, Activity activity, int i4) {
        AbstractC1792d abstractC1792dM9548c = AbstractC1792d.m9548c(i3);
        if (activity == null) {
            return false;
        }
        return m9556c(c1789a, new C1799k(this, activity), abstractC1792dM9548c, i4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9556c(C1789a c1789a, InterfaceC1892a interfaceC1892a, AbstractC1792d abstractC1792d, int i3) {
        if (c1789a == null || interfaceC1892a == null || abstractC1792d == null || !c1789a.m9540b(abstractC1792d) || c1789a.m9544g()) {
            return false;
        }
        c1789a.m9543f();
        interfaceC1892a.mo9555a(c1789a.m9542d(abstractC1792d).getIntentSender(), i3, null, 0, 0, 0, null);
        return true;
    }
}
