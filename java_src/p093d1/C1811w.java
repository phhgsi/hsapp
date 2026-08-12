package p093d1;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: d1.w */
/* JADX INFO: loaded from: classes.dex */
final class C1811w {

    /* JADX INFO: renamed from: a */
    private final Context f9200a;

    C1811w(Context context) {
        this.f9200a = context;
    }

    /* JADX INFO: renamed from: b */
    private static long m9571b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM9571b = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jM9571b += m9571b(file2);
            }
        }
        return jM9571b;
    }

    /* JADX INFO: renamed from: a */
    final long m9572a() {
        return m9571b(new File(this.f9200a.getFilesDir(), "assetpacks"));
    }
}
