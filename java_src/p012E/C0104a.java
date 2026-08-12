package p012E;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import p071X1.AbstractC0606k;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0104a {

    /* JADX INFO: renamed from: a */
    public static final C0104a f220a = new C0104a();

    /* JADX INFO: renamed from: b */
    public static final int f221b;

    /* JADX INFO: renamed from: c */
    public static final int f222c;

    /* JADX INFO: renamed from: d */
    public static final int f223d;

    /* JADX INFO: renamed from: e */
    public static final int f224e;

    /* JADX INFO: renamed from: E.a$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f225a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final int m321a(int i3) {
            return SdkExtensions.getExtensionVersion(i3);
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        f221b = i3 >= 30 ? a.f225a.m321a(30) : 0;
        f222c = i3 >= 30 ? a.f225a.m321a(31) : 0;
        f223d = i3 >= 30 ? a.f225a.m321a(33) : 0;
        f224e = i3 >= 30 ? a.f225a.m321a(1000000) : 0;
    }

    private C0104a() {
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m317a(String str, String str2) {
        AbstractC0606k.m2145e(str, "codename");
        AbstractC0606k.m2145e(str2, "buildCodename");
        if (AbstractC0606k.m2141a("REL", str2)) {
            return false;
        }
        Integer numM318b = m318b(str2);
        Integer numM318b2 = m318b(str);
        if (numM318b != null && numM318b2 != null) {
            return numM318b.intValue() >= numM318b2.intValue();
        }
        if (numM318b != null || numM318b2 != null) {
            return numM318b != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        AbstractC0606k.m2144d(upperCase, "toUpperCase(...)");
        String upperCase2 = str.toUpperCase(locale);
        AbstractC0606k.m2144d(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    /* JADX INFO: renamed from: b */
    private static final Integer m318b(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC0606k.m2144d(upperCase, "toUpperCase(...)");
        return AbstractC0606k.m2141a(upperCase, "BAKLAVA") ? 0 : null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m319c() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            return true;
        }
        if (i3 < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        AbstractC0606k.m2144d(str, "CODENAME");
        return m317a("UpsideDownCake", str);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m320d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            return true;
        }
        if (i3 < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        AbstractC0606k.m2144d(str, "CODENAME");
        return m317a("VanillaIceCream", str);
    }
}
