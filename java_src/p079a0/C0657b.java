package p079a0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0657b {

    /* JADX INFO: renamed from: a */
    public static final C0657b f2344a = new C0657b();

    /* JADX INFO: renamed from: a0.b$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2345a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m2497a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private C0657b() {
    }

    /* JADX INFO: renamed from: a */
    public final int m2496a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f2345a.m2497a();
        }
        return 0;
    }
}
