package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import p091d.AbstractC1761b;

/* JADX INFO: renamed from: androidx.appcompat.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C0771a {

    /* JADX INFO: renamed from: a */
    private Context f2815a;

    private C0771a(Context context) {
        this.f2815a = context;
    }

    /* JADX INFO: renamed from: b */
    public static C0771a m2998b(Context context) {
        return new C0771a(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2999a() {
        return this.f2815a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: c */
    public int m3000c() {
        return this.f2815a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m3001d() {
        Configuration configuration = this.f2815a.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600) {
            return 5;
        }
        if (i3 > 960 && i4 > 720) {
            return 5;
        }
        if (i3 > 720 && i4 > 960) {
            return 5;
        }
        if (i3 >= 500) {
            return 4;
        }
        if (i3 > 640 && i4 > 480) {
            return 4;
        }
        if (i3 <= 480 || i4 <= 640) {
            return i3 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3002e() {
        return this.f2815a.getResources().getBoolean(AbstractC1761b.f8726a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m3003f() {
        return true;
    }
}
