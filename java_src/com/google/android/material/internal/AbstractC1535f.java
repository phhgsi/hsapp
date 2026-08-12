package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.internal.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1535f {
    /* JADX INFO: renamed from: a */
    private static String m8382a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8383b() {
        return m8382a().equals("meizu");
    }
}
