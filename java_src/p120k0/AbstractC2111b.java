package p120k0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p124l0.AbstractC2119c;
import p124l0.AbstractC2129m;
import p124l0.AbstractC2130n;
import p124l0.InterfaceC2131o;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2111b {

    /* JADX INFO: renamed from: a */
    private static final Uri f9846a = Uri.parse("*");

    /* JADX INFO: renamed from: b */
    private static final Uri f9847b = Uri.parse("");

    /* JADX INFO: renamed from: c */
    private static boolean f9848c = true;

    /* JADX INFO: renamed from: d */
    private static final WeakHashMap f9849d = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static PackageInfo m10568a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC2119c.m10580a();
        }
        try {
            return m10570c();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC2131o m10569b() {
        return AbstractC2130n.m10594d();
    }

    /* JADX INFO: renamed from: c */
    private static PackageInfo m10570c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10571d() {
        if (AbstractC2129m.f9877S.mo10578d()) {
            return m10569b().getStatics().isMultiProcessEnabled();
        }
        throw AbstractC2129m.m10588a();
    }
}
