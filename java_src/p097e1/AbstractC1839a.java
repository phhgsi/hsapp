package p097e1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1839a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f9270a;

    /* JADX INFO: renamed from: b */
    private final String f9271b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected AbstractC1839a(IBinder iBinder, String str) {
        this.f9270a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9270a;
    }

    /* JADX INFO: renamed from: d */
    protected final Parcel m9634d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f9271b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: e */
    protected final void m9635e(int i3, Parcel parcel) {
        try {
            this.f9270a.transact(i3, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
