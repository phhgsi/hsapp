package p135o0;

import android.content.Context;
import androidx.core.content.AbstractC0966b;

/* JADX INFO: renamed from: o0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2298l {
    /* JADX INFO: renamed from: a */
    public static boolean m10976a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10977b(Context context, String str) {
        return AbstractC0966b.checkSelfPermission(context, str) == 0;
    }
}
