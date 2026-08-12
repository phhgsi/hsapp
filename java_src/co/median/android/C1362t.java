package co.median.android;

import android.app.Activity;
import android.app.PendingIntent;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.content.AbstractC0966b;
import co.median.android.C1362t;
import co.median.android.jrejze.R;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import p035L1.C0388t;
import p068W1.InterfaceC0577l;
import p071X1.AbstractC0606k;
import p083b.AbstractC1294b;
import p083b.InterfaceC1293a;
import p087c.C1308b;
import p087c.C1311e;
import p161x.AbstractC2503b;

/* JADX INFO: renamed from: co.median.android.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1362t {

    /* JADX INFO: renamed from: a */
    private final Activity f6716a;

    /* JADX INFO: renamed from: b */
    private final long f6717b;

    /* JADX INFO: renamed from: c */
    private a f6718c;

    /* JADX INFO: renamed from: d */
    private final AbstractC1294b f6719d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1294b f6720e;

    /* JADX INFO: renamed from: co.median.android.t$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7037a(boolean z2);
    }

    public C1362t(Activity activity) {
        AbstractC0606k.m2145e(activity, "activity");
        this.f6716a = activity;
        this.f6717b = 1000L;
        AbstractC0606k.m2143c(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        this.f6719d = ((ComponentActivity) activity).m2525W(new C1308b(), new InterfaceC1293a() { // from class: m0.Y
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                C1362t.m7096m(this.f10268a, (Map) obj);
            }
        });
        AbstractC0606k.m2143c(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        this.f6720e = ((ComponentActivity) activity).m2525W(new C1311e(), new InterfaceC1293a() { // from class: m0.Z
            @Override // p083b.InterfaceC1293a
            /* JADX INFO: renamed from: a */
            public final void mo4866a(Object obj) {
                C1362t.m7095l(this.f10280a, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private final boolean m7091f() {
        return AbstractC0966b.checkSelfPermission(this.f6716a, "android.permission.ACCESS_FINE_LOCATION") == 0 && AbstractC0966b.checkSelfPermission(this.f6716a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C0388t m7092i(C1362t c1362t, LocationSettingsResponse locationSettingsResponse) {
        a aVar = c1362t.f6718c;
        if (aVar != null) {
            aVar.mo7037a(true);
        }
        return C0388t.f1507a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m7093j(InterfaceC0577l interfaceC0577l, Object obj) {
        interfaceC0577l.mo1406f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m7094k(C1362t c1362t, Exception exc) {
        AbstractC0606k.m2145e(exc, "e");
        if (exc instanceof ResolvableApiException) {
            PendingIntent resolution = ((ResolvableApiException) exc).getResolution();
            AbstractC0606k.m2144d(resolution, "getResolution(...)");
            c1362t.f6720e.m6590a(new IntentSenderRequest.C0721a(resolution).m2645a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m7095l(C1362t c1362t, ActivityResult activityResult) {
        AbstractC0606k.m2145e(activityResult, "result");
        if (activityResult.m2637d() == -1) {
            a aVar = c1362t.f6718c;
            if (aVar != null) {
                aVar.mo7037a(true);
                return;
            }
            return;
        }
        a aVar2 = c1362t.f6718c;
        if (aVar2 != null) {
            aVar2.mo7037a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m7096m(C1362t c1362t, Map map) {
        AbstractC0606k.m2145e(map, "permissions");
        Boolean bool = (Boolean) map.get("android.permission.ACCESS_FINE_LOCATION");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) map.get("android.permission.ACCESS_COARSE_LOCATION");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (zBooleanValue && zBooleanValue2) {
            c1362t.m7098g();
            return;
        }
        a aVar = c1362t.f6718c;
        if (aVar != null) {
            aVar.mo7037a(false);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m7097n() {
        if (AbstractC2503b.m11893e(this.f6716a, "android.permission.ACCESS_FINE_LOCATION") || AbstractC2503b.m11893e(this.f6716a, "android.permission.ACCESS_COARSE_LOCATION")) {
            Toast.makeText(this.f6716a, R.string.request_permission_explanation_geolocation, 0).show();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7098g() {
        if (!m7091f()) {
            m7097n();
            this.f6719d.m6590a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        LocationRequest locationRequestBuild = new LocationRequest.Builder(100, this.f6717b).build();
        AbstractC0606k.m2144d(locationRequestBuild, "build(...)");
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(locationRequestBuild);
        AbstractC0606k.m2144d(builderAddLocationRequest, "addLocationRequest(...)");
        SettingsClient settingsClient = LocationServices.getSettingsClient(this.f6716a);
        AbstractC0606k.m2144d(settingsClient, "getSettingsClient(...)");
        Task<LocationSettingsResponse> taskCheckLocationSettings = settingsClient.checkLocationSettings(builderAddLocationRequest.build());
        AbstractC0606k.m2144d(taskCheckLocationSettings, "checkLocationSettings(...)");
        final InterfaceC0577l interfaceC0577l = new InterfaceC0577l() { // from class: m0.a0
            @Override // p068W1.InterfaceC0577l
            /* JADX INFO: renamed from: f */
            public final Object mo1406f(Object obj) {
                return C1362t.m7092i(this.f10283d, (LocationSettingsResponse) obj);
            }
        };
        taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: m0.b0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C1362t.m7093j(interfaceC0577l, obj);
            }
        });
        taskCheckLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: m0.c0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C1362t.m7094k(this.f10292a, exc);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m7099h(a aVar) {
        AbstractC0606k.m2145e(aVar, "callback");
        this.f6718c = aVar;
        m7098g();
    }
}
