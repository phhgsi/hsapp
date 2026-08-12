package androidx.core.content;

import android.content.Context;
import android.os.Process;
import p024I.AbstractC0206c;
import p161x.AbstractC2507f;

/* JADX INFO: renamed from: androidx.core.content.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0969e {
    /* JADX INFO: renamed from: a */
    public static int m4231a(Context context, String str, int i3, int i4, String str2) {
        if (context.checkPermission(str, i3, i4) == -1) {
            return -1;
        }
        String strM11913c = AbstractC2507f.m11913c(str);
        if (strM11913c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i4);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i4 || !AbstractC0206c.m596a(context.getPackageName(), str2)) ? AbstractC2507f.m11912b(context, strM11913c, str2) : AbstractC2507f.m11911a(context, i4, strM11913c, str2)) == 0 ? 0 : -2;
    }

    /* JADX INFO: renamed from: b */
    public static int m4232b(Context context, String str) {
        return m4231a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
