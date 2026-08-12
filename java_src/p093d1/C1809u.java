package p093d1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p097e1.AbstractC1838C;
import p097e1.AbstractC1841c;
import p097e1.AbstractC1852n;
import p097e1.C1836A;
import p097e1.C1854p;
import p105g1.C1978a;

/* JADX INFO: renamed from: d1.u */
/* JADX INFO: loaded from: classes.dex */
final class C1809u {

    /* JADX INFO: renamed from: e */
    private static final C1854p f9192e = new C1854p("AppUpdateService");

    /* JADX INFO: renamed from: f */
    private static final Intent f9193f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    C1836A f9194a;

    /* JADX INFO: renamed from: b */
    private final String f9195b;

    /* JADX INFO: renamed from: c */
    private final Context f9196c;

    /* JADX INFO: renamed from: d */
    private final C1811w f9197d;

    C1809u(Context context, C1811w c1811w) {
        this.f9195b = context.getPackageName();
        this.f9196c = context;
        this.f9197d = c1811w;
        if (AbstractC1841c.m9637a(context)) {
            this.f9194a = new C1836A(AbstractC1838C.m9633a(context), f9192e, "AppUpdateService", f9193f, C1805q.f9183a, null);
        }
    }

    /* JADX INFO: renamed from: b */
    static /* bridge */ /* synthetic */ Bundle m9563b(C1809u c1809u, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(m9567g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(c1809u.f9196c.getPackageManager().getPackageInfo(c1809u.f9196c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f9192e.m9648a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    static /* bridge */ /* synthetic */ C1789a m9564d(C1809u c1809u, Bundle bundle, String str) {
        int i3 = bundle.getInt("version.code", -1);
        int i4 = bundle.getInt("update.availability");
        int i5 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i6 = bundle.getInt("in.app.update.priority", 0);
        long j3 = bundle.getLong("bytes.downloaded");
        long j4 = bundle.getLong("total.bytes.to.download");
        long j5 = bundle.getLong("additional.size.required");
        long jM9572a = c1809u.f9197d.m9572a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", m9569i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", m9569i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", m9569i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", m9569i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C1789a.m9537e(str, i3, i4, i5, numValueOf, i6, j3, j4, j5, jM9572a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* JADX INFO: renamed from: g */
    private static Bundle m9567g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapM9646a = AbstractC1852n.m9646a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapM9646a.get("java")).intValue());
        if (mapM9646a.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapM9646a.get("native")).intValue());
        }
        if (mapM9646a.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapM9646a.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    /* JADX INFO: renamed from: h */
    private static Task m9568h() {
        f9192e.m9648a("onError(%d)", -9);
        return Tasks.forException(new C1978a(-9));
    }

    /* JADX INFO: renamed from: i */
    private static HashSet m9569i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public final Task m9570c(String str) {
        if (this.f9194a == null) {
            return m9568h();
        }
        f9192e.m9650c("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9194a.m9630s(new C1806r(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
