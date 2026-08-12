package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p026I1.AbstractC0220e;
import p026I1.AbstractC0223h;
import p026I1.C0218c;
import p166y1.C2551f;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m9106a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m9110e(installerPackageName) : "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m9107b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m9108c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m9109d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    /* JADX INFO: renamed from: e */
    private static String m9110e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0218c.m617c());
        arrayList.add(C2551f.m12200g());
        arrayList.add(AbstractC0223h.m625b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC0223h.m625b("fire-core", "21.0.0"));
        arrayList.add(AbstractC0223h.m625b("device-name", m9110e(Build.PRODUCT)));
        arrayList.add(AbstractC0223h.m625b("device-model", m9110e(Build.DEVICE)));
        arrayList.add(AbstractC0223h.m625b("device-brand", m9110e(Build.BRAND)));
        arrayList.add(AbstractC0223h.m626c("android-target-sdk", new AbstractC0223h.a() { // from class: m1.g
            @Override // p026I1.AbstractC0223h.a
            /* JADX INFO: renamed from: a */
            public final String mo627a(Object obj) {
                return FirebaseCommonRegistrar.m9108c((Context) obj);
            }
        }));
        arrayList.add(AbstractC0223h.m626c("android-min-sdk", new AbstractC0223h.a() { // from class: m1.h
            @Override // p026I1.AbstractC0223h.a
            /* JADX INFO: renamed from: a */
            public final String mo627a(Object obj) {
                return FirebaseCommonRegistrar.m9107b((Context) obj);
            }
        }));
        arrayList.add(AbstractC0223h.m626c("android-platform", new AbstractC0223h.a() { // from class: m1.i
            @Override // p026I1.AbstractC0223h.a
            /* JADX INFO: renamed from: a */
            public final String mo627a(Object obj) {
                return FirebaseCommonRegistrar.m9109d((Context) obj);
            }
        }));
        arrayList.add(AbstractC0223h.m626c("android-installer", new AbstractC0223h.a() { // from class: m1.j
            @Override // p026I1.AbstractC0223h.a
            /* JADX INFO: renamed from: a */
            public final String mo627a(Object obj) {
                return FirebaseCommonRegistrar.m9106a((Context) obj);
            }
        }));
        String strM622a = AbstractC0220e.m622a();
        if (strM622a != null) {
            arrayList.add(AbstractC0223h.m625b("kotlin", strM622a));
        }
        return arrayList;
    }
}
