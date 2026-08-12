package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.C0921a;

/* JADX INFO: loaded from: classes.dex */
public final class zzhk {
    private static final C0921a zza = new C0921a();

    public static synchronized Uri zza(String str) {
        Uri uri;
        C0921a c0921a = zza;
        uri = (Uri) c0921a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c0921a.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return str + "#" + context.getPackageName();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
