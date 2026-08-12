package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C0929i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p113i1.AbstractC2034g;

/* JADX INFO: loaded from: classes.dex */
public final class zzhg {

    public static class zza {
        private static volatile AbstractC2034g zza;

        private zza() {
        }

        public static AbstractC2034g zza(Context context) {
            AbstractC2034g abstractC2034g;
            AbstractC2034g abstractC2034gZza;
            AbstractC2034g abstractC2034g2 = zza;
            if (abstractC2034g2 != null) {
                return abstractC2034g2;
            }
            synchronized (zza.class) {
                try {
                    abstractC2034g = zza;
                    if (abstractC2034g == null) {
                        new zzhg();
                        if (zzhk.zza(Build.TYPE, Build.TAGS)) {
                            if (zzgs.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            abstractC2034gZza = zzhg.zza(context);
                        } else {
                            abstractC2034gZza = AbstractC2034g.m10230a();
                        }
                        abstractC2034g = abstractC2034gZza;
                        zza = abstractC2034g;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return abstractC2034g;
        }
    }

    private static zzhh zza(Context context, File file) {
        BufferedReader bufferedReader;
        C0929i c0929i;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                c0929i = new C0929i();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                zzgy zzgyVar = new zzgy(c0929i);
                bufferedReader.close();
                return zzgyVar;
            }
            String[] strArrSplit = line.split(" ", 3);
            if (strArrSplit.length != 3) {
                Log.e("HermeticFileOverrides", "Invalid: " + line);
            } else {
                String strZza = zza(strArrSplit[0]);
                String strDecode = Uri.decode(zza(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String strZza2 = zza(strArrSplit[2]);
                    strDecode2 = Uri.decode(strZza2);
                    if (strDecode2.length() < 1024 || strDecode2 == strZza2) {
                        map.put(strZza2, strDecode2);
                    }
                }
                C0929i c0929i2 = (C0929i) c0929i.get(strZza);
                if (c0929i2 == null) {
                    c0929i2 = new C0929i();
                    c0929i.put(strZza, c0929i2);
                }
                c0929i2.put(strDecode, strDecode2);
            }
            throw new RuntimeException(e3);
        }
    }

    private static AbstractC2034g zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? AbstractC2034g.m10231d(file) : AbstractC2034g.m10230a();
        } catch (RuntimeException e3) {
            Log.e("HermeticFileOverrides", "no data dir", e3);
            return AbstractC2034g.m10230a();
        }
    }

    static AbstractC2034g zza(Context context) {
        AbstractC2034g abstractC2034gM10230a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC2034g abstractC2034gZzb = zzb(context);
            if (abstractC2034gZzb.mo10221c()) {
                abstractC2034gM10230a = AbstractC2034g.m10231d(zza(context, (File) abstractC2034gZzb.mo10220b()));
            } else {
                abstractC2034gM10230a = AbstractC2034g.m10230a();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return abstractC2034gM10230a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
