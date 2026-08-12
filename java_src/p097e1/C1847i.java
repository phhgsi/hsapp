package p097e1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1847i extends AbstractC1839a implements InterfaceC1849k {
    C1847i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097e1.InterfaceC1849k
    /* JADX INFO: renamed from: b */
    public final void mo9644b(String str, Bundle bundle, InterfaceC1851m interfaceC1851m) {
        Parcel parcelM9634d = m9634d();
        parcelM9634d.writeString(str);
        AbstractC1846h.m9643c(parcelM9634d, bundle);
        parcelM9634d.writeStrongBinder(interfaceC1851m);
        m9635e(2, parcelM9634d);
    }
}
