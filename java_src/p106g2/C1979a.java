package p106g2;

import android.os.Looper;
import java.util.List;
import p102f2.AbstractC1953q0;
import p110h2.InterfaceC2010q;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1979a implements InterfaceC2010q {
    @Override // p110h2.InterfaceC2010q
    /* JADX INFO: renamed from: a */
    public String mo10045a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p110h2.InterfaceC2010q
    /* JADX INFO: renamed from: b */
    public AbstractC1953q0 mo10046b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C1981c(AbstractC1983e.m10051a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p110h2.InterfaceC2010q
    /* JADX INFO: renamed from: c */
    public int mo10047c() {
        return 1073741823;
    }
}
