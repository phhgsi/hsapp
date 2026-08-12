package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1162a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static File m5286a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static File m5287a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m5284a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m5284a(file2) && z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    static void m5285b(Context context, ProfileInstallReceiver.C1158a c1158a) {
        if (m5284a(Build.VERSION.SDK_INT >= 24 ? b.m5287a(context) : a.m5286a(context))) {
            c1158a.mo5273b(14, null);
        } else {
            c1158a.mo5273b(15, null);
        }
    }
}
