package p097e1;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1850l extends AbstractBinderC1845g implements InterfaceC1851m {
    public AbstractBinderC1850l() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // p097e1.AbstractBinderC1845g
    /* JADX INFO: renamed from: d */
    protected final boolean mo9640d(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 == 2) {
            Bundle bundle = (Bundle) AbstractC1846h.m9641a(parcel, Bundle.CREATOR);
            AbstractC1846h.m9642b(parcel);
            mo9560a(bundle);
            return true;
        }
        if (i3 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) AbstractC1846h.m9641a(parcel, Bundle.CREATOR);
        AbstractC1846h.m9642b(parcel);
        mo9561c(bundle2);
        return true;
    }
}
