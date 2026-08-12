package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.AbstractActivityC1080h;
import androidx.fragment.app.Fragment;
import com.google.android.gms.base.C1385R;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import p083b.AbstractC1294b;
import p128m0.AbstractC2218i0;
import p161x.AbstractC2513l;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i3 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i3, int i4) {
        return getErrorDialog(activity, i3, i4, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i3, String str) {
        return super.getErrorResolutionIntent(context, i3, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i3, int i4) {
        return super.getErrorResolutionPendingIntent(context, i3, i4);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i3) {
        return super.getErrorString(i3);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i3) {
        return super.isUserResolvableError(i3);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i3);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaccVarZaa = zacc.zaa(activity);
        zaccVarZaa.zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zaccVarZaa.zad();
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i3, int i4) {
        return showErrorDialogFragment(activity, i3, i4, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i3) {
        zae(context, i3, null, getErrorResolutionPendingIntent(context, i3, 0, "n"));
    }

    final Dialog zaa(Context context, int i3, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(context, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strZab = com.google.android.gms.common.internal.zac.zab(context, i3);
        DialogInterface.OnClickListener onClickListener2 = zagVar;
        if (strZab != null) {
            if (zagVar == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strZab, onClickListener2);
        }
        String strZaf = com.google.android.gms.common.internal.zac.zaf(context, i3);
        if (strZaf != null) {
            builder.setTitle(strZaf);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i3)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1080h) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((AbstractActivityC1080h) activity).m4929d0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void zae(Context context, int i3, String str, PendingIntent pendingIntent) {
        int i4;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i3), null), new IllegalArgumentException());
        if (i3 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZae = com.google.android.gms.common.internal.zac.zae(context, i3);
        String strZad = com.google.android.gms.common.internal.zac.zad(context, i3);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        AbstractC2513l.e eVarM11980v = new AbstractC2513l.e(context).m11974p(true).m11964e(true).m11969j(strZae).m11980v(new AbstractC2513l.c().m11956h(strZad));
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            eVarM11980v.m11978t(context.getApplicationInfo().icon).m11976r(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                eVarM11980v.m11961a(C1385R.drawable.common_full_open_on_phone, resources.getString(C1385R.string.common_open_on_phone), pendingIntent);
            } else {
                eVarM11980v.m11967h(pendingIntent);
            }
        } else {
            eVarM11980v.m11978t(android.R.drawable.stat_sys_warning).m11981w(resources.getString(C1385R.string.common_google_play_services_notification_ticker)).m11984z(System.currentTimeMillis()).m11967h(pendingIntent).m11968i(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C1385R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC2218i0.m10781a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarM11980v.m11965f(str2);
        }
        Notification notificationM11962b = eVarM11980v.m11962b();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, notificationM11962b);
    }

    final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i3, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i3, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i3) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i3, true), zap.zaa | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i3, zag.zab(activity, getErrorResolutionIntent(activity, i3, "d"), i4), onCancelListener, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i3) {
        return super.isGooglePlayServicesAvailable(context, i3);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i3, i4, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i3 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public Dialog getErrorDialog(Fragment fragment, int i3, int i4) {
        return getErrorDialog(fragment, i3, i4, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i3, AbstractC1294b abstractC1294b, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i3, null, onCancelListener, new zac(this, activity, i3, abstractC1294b));
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Fragment fragment, int i3, int i4, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i3, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i3, "d"), i4), onCancelListener, null);
    }
}
