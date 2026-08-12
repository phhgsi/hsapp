package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.C0935d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.profileinstaller.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1176o {

    /* JADX INFO: renamed from: a */
    private static final C0935d f5530a = C0935d.m4000s();

    /* JADX INFO: renamed from: b */
    private static final Object f5531b = new Object();

    /* JADX INFO: renamed from: c */
    private static c f5532c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.o$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static PackageInfo m5377a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.o$b */
    static class b {

        /* JADX INFO: renamed from: a */
        final int f5533a;

        /* JADX INFO: renamed from: b */
        final int f5534b;

        /* JADX INFO: renamed from: c */
        final long f5535c;

        /* JADX INFO: renamed from: d */
        final long f5536d;

        b(int i3, int i4, long j3, long j4) {
            this.f5533a = i3;
            this.f5534b = i4;
            this.f5535c = j3;
            this.f5536d = j4;
        }

        /* JADX INFO: renamed from: a */
        static b m5378a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        /* JADX INFO: renamed from: b */
        void m5379b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f5533a);
                dataOutputStream.writeInt(this.f5534b);
                dataOutputStream.writeLong(this.f5535c);
                dataOutputStream.writeLong(this.f5536d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f5534b == bVar.f5534b && this.f5535c == bVar.f5535c && this.f5533a == bVar.f5533a && this.f5536d == bVar.f5536d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f5534b), Long.valueOf(this.f5535c), Integer.valueOf(this.f5533a), Long.valueOf(this.f5536d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.o$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        final int f5537a;

        /* JADX INFO: renamed from: b */
        private final boolean f5538b;

        /* JADX INFO: renamed from: c */
        private final boolean f5539c;

        c(int i3, boolean z2, boolean z3) {
            this.f5537a = i3;
            this.f5539c = z3;
            this.f5538b = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m5374a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m5377a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    private static c m5375b(int i3, boolean z2, boolean z3) {
        c cVar = new c(i3, z2, z3);
        f5532c = cVar;
        f5530a.mo3979o(cVar);
        return f5532c;
    }

    /* JADX INFO: renamed from: c */
    static c m5376c(Context context, boolean z2) {
        b bVarM5378a;
        int i3;
        c cVar;
        if (!z2 && (cVar = f5532c) != null) {
            return cVar;
        }
        synchronized (f5531b) {
            if (!z2) {
                try {
                    c cVar2 = f5532c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            if (i4 >= 28 && i4 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long jM5374a = m5374a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarM5378a = b.m5378a(file3);
                        } catch (IOException unused) {
                            return m5375b(131072, z3, z4);
                        }
                    } else {
                        bVarM5378a = null;
                    }
                    if (bVarM5378a != null && bVarM5378a.f5535c == jM5374a && (i3 = bVarM5378a.f5534b) != 2) {
                        i5 = i3;
                    } else if (z3) {
                        i5 = 1;
                    } else if (z4) {
                        i5 = 2;
                    }
                    if (z2 && z4 && i5 != 1) {
                        i5 = 2;
                    }
                    if (bVarM5378a != null && bVarM5378a.f5534b == 2 && i5 == 1 && length < bVarM5378a.f5536d) {
                        i5 = 3;
                    }
                    int i6 = i5;
                    b bVar = new b(1, i6, jM5374a, length2);
                    if (bVarM5378a == null || !bVarM5378a.equals(bVar)) {
                        try {
                            bVar.m5379b(file3);
                        } catch (IOException unused2) {
                            i6 = 196608;
                        }
                    }
                    return m5375b(i6, z3, z4);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return m5375b(65536, z3, z4);
                }
            }
            return m5375b(262144, false, false);
        }
    }
}
