package p097e1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1845g extends Binder implements IInterface {
    protected AbstractBinderC1845g(String str) {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* JADX INFO: renamed from: d */
    protected abstract boolean mo9640d(int i3, Parcel parcel, Parcel parcel2, int i4);

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i4)) {
            return true;
        }
        return mo9640d(i3, parcel, parcel2, i4);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
