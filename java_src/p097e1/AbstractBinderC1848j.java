package p097e1;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: e1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1848j extends AbstractBinderC1845g implements InterfaceC1849k {
    /* JADX INFO: renamed from: e */
    public static InterfaceC1849k m9645e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1849k ? (InterfaceC1849k) iInterfaceQueryLocalInterface : new C1847i(iBinder);
    }
}
