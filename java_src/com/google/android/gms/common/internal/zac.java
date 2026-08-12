package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0929i;
import com.google.android.gms.base.C1385R;
import com.google.android.gms.common.C1387R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p012E.AbstractC0109f;

/* JADX INFO: loaded from: classes.dex */
public final class zac {
    private static final C0929i zaa = new C0929i();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i3) {
        Resources resources = context.getResources();
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(C1385R.string.common_google_play_services_enable_button) : resources.getString(C1385R.string.common_google_play_services_update_button) : resources.getString(C1385R.string.common_google_play_services_install_button);
    }

    public static String zac(Context context, int i3) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i3 == 1) {
            return resources.getString(C1385R.string.common_google_play_services_install_text, strZaa);
        }
        if (i3 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(C1385R.string.common_google_play_services_wear_update_text) : resources.getString(C1385R.string.common_google_play_services_update_text, strZaa);
        }
        if (i3 == 3) {
            return resources.getString(C1385R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i3 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i3 == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i3 == 9) {
            return resources.getString(C1385R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i3 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i3) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return resources.getString(C1385R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(C1387R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    public static String zad(Context context, int i3) {
        return (i3 == 6 || i3 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i3);
    }

    public static String zae(Context context, int i3) {
        String strZah = i3 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i3);
        return strZah == null ? context.getResources().getString(C1385R.string.common_google_play_services_notification_ticker) : strZah;
    }

    public static String zaf(Context context, int i3) {
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(C1385R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C1385R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C1385R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i3);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(C1387R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        C0929i c0929i = zaa;
        synchronized (c0929i) {
            try {
                Locale localeM341d = AbstractC0109f.m331a(context.getResources().getConfiguration()).m341d(0);
                if (!localeM341d.equals(zab)) {
                    c0929i.clear();
                    zab = localeM341d;
                }
                String str2 = (String) c0929i.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c0929i.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
