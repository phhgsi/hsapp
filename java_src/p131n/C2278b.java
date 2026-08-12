package p131n;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import p131n.C2277a;

/* JADX INFO: renamed from: n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2278b {

    /* JADX INFO: renamed from: a */
    public final Intent f10440a;

    /* JADX INFO: renamed from: b */
    public final Bundle f10441b;

    /* JADX INFO: renamed from: n.b$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static ActivityOptions m10875a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: renamed from: n.b$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        static String m10876a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: n.b$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        static void m10877a(ActivityOptions activityOptions, boolean z2) {
            activityOptions.setShareIdentityEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: n.b$d */
    private static class d {
        /* JADX INFO: renamed from: a */
        static void m10878a(ActivityOptions activityOptions, boolean z2) {
            activityOptions.setAllowPassThroughOnTouchOutside(z2);
        }
    }

    /* JADX INFO: renamed from: n.b$e */
    public static final class e {

        /* JADX INFO: renamed from: c */
        private ArrayList f10444c;

        /* JADX INFO: renamed from: d */
        private ActivityOptions f10445d;

        /* JADX INFO: renamed from: e */
        private ArrayList f10446e;

        /* JADX INFO: renamed from: f */
        private SparseArray f10447f;

        /* JADX INFO: renamed from: g */
        private Bundle f10448g;

        /* JADX INFO: renamed from: j */
        private boolean f10451j;

        /* JADX INFO: renamed from: k */
        private ArrayList f10452k;

        /* JADX INFO: renamed from: a */
        private final Intent f10442a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b */
        private final C2277a.a f10443b = new C2277a.a();

        /* JADX INFO: renamed from: h */
        private int f10449h = 0;

        /* JADX INFO: renamed from: i */
        private boolean f10450i = true;

        /* JADX INFO: renamed from: b */
        private void m10879b() {
            if (this.f10445d == null) {
                this.f10445d = a.m10875a();
            }
            d.m10878a(this.f10445d, C2278b.m10874a(this.f10442a));
        }

        /* JADX INFO: renamed from: c */
        private void m10880c() {
            String strM10876a = b.m10876a();
            if (TextUtils.isEmpty(strM10876a)) {
                return;
            }
            Bundle bundleExtra = this.f10442a.hasExtra("com.android.browser.headers") ? this.f10442a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strM10876a);
            this.f10442a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* JADX INFO: renamed from: e */
        private void m10881e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f10442a.putExtras(bundle);
        }

        /* JADX INFO: renamed from: f */
        private void m10882f() {
            if (this.f10445d == null) {
                this.f10445d = a.m10875a();
            }
            c.m10877a(this.f10445d, this.f10451j);
        }

        /* JADX INFO: renamed from: a */
        public C2278b m10883a() {
            if (!this.f10442a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m10881e(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f10444c;
            if (arrayList != null) {
                this.f10442a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f10446e;
            if (arrayList2 != null) {
                this.f10442a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f10442a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f10450i);
            this.f10442a.putExtras(this.f10443b.m10871a().m10870a());
            Bundle bundle = this.f10448g;
            if (bundle != null) {
                this.f10442a.putExtras(bundle);
            }
            if (this.f10447f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f10447f);
                this.f10442a.putExtras(bundle2);
            }
            this.f10442a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f10449h);
            ArrayList arrayList3 = this.f10452k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f10442a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f10452k);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                m10880c();
            }
            if (i3 >= 34) {
                m10882f();
            }
            if (i3 >= 36) {
                m10879b();
            }
            ActivityOptions activityOptions = this.f10445d;
            return new C2278b(this.f10442a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        /* JADX INFO: renamed from: d */
        public e m10884d(C2277a c2277a) {
            this.f10448g = c2277a.m10870a();
            return this;
        }
    }

    C2278b(Intent intent, Bundle bundle) {
        this.f10440a = intent;
        this.f10441b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10874a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }
}
