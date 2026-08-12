package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p092d0.ExecutorC1782m;

/* JADX INFO: renamed from: androidx.profileinstaller.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1170i {

    /* JADX INFO: renamed from: a */
    private static final c f5521a = new a();

    /* JADX INFO: renamed from: b */
    static final c f5522b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.i$a */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: a */
        public void mo5272a(int i3, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: b */
        public void mo5273b(int i3, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.i$b */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: a */
        public void mo5272a(int i3, Object obj) {
            Log.d("ProfileInstaller", i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.AbstractC1170i.c
        /* JADX INFO: renamed from: b */
        public void mo5273b(int i3, Object obj) {
            String str;
            switch (i3) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i3 == 6 || i3 == 7 || i3 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.i$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo5272a(int i3, Object obj);

        /* JADX INFO: renamed from: b */
        void mo5273b(int i3, Object obj);
    }

    /* JADX INFO: renamed from: b */
    static boolean m5323b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* JADX INFO: renamed from: c */
    static void m5324c(Context context, Executor executor, c cVar) {
        m5323b(context.getFilesDir());
        m5327f(executor, cVar, 11, null);
    }

    /* JADX INFO: renamed from: d */
    static boolean m5325d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j3 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z2 = j3 == packageInfo.lastUpdateTime;
                if (z2) {
                    cVar.mo5273b(2, null);
                }
                return z2;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    static void m5326e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    static void m5327f(Executor executor, final c cVar, final int i3, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo5273b(i3, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    private static boolean m5328g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C1165d c1165d = new C1165d(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c1165d.m5298e()) {
            return false;
        }
        boolean zM5301m = c1165d.m5299h().m5300l().m5301m();
        if (zM5301m) {
            m5326e(packageInfo, file);
        }
        return zM5301m;
    }

    /* JADX INFO: renamed from: h */
    public static void m5329h(Context context) {
        m5330i(context, new ExecutorC1782m(), f5521a);
    }

    /* JADX INFO: renamed from: i */
    public static void m5330i(Context context, Executor executor, c cVar) {
        m5331j(context, executor, cVar, false);
    }

    /* JADX INFO: renamed from: j */
    static void m5331j(Context context, Executor executor, c cVar, boolean z2) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2 && m5325d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                AbstractC1176o.m5376c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m5328g(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z2) {
                z3 = true;
            }
            AbstractC1176o.m5376c(context, z3);
        } catch (PackageManager.NameNotFoundException e3) {
            cVar.mo5273b(7, e3);
            AbstractC1176o.m5376c(context, false);
        }
    }

    /* JADX INFO: renamed from: k */
    static void m5332k(Context context, Executor executor, c cVar) {
        try {
            m5326e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m5327f(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e3) {
            m5327f(executor, cVar, 7, e3);
        }
    }
}
