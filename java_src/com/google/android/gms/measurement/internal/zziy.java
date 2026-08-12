package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zziy implements Callable<List<zzno>> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzic zzc;

    zziy(zzic zzicVar, zzo zzoVar, Bundle bundle) {
        this.zza = zzoVar;
        this.zzb = bundle;
        this.zzc = zzicVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzno> call() {
        this.zzc.zza.zzr();
        zznv zznvVar = this.zzc.zza;
        zzo zzoVar = this.zza;
        Bundle bundle = this.zzb;
        zznvVar.zzl().zzt();
        if (!zzpn.zza() || !zznvVar.zze().zze(zzoVar.zza, zzbh.zzch) || zzoVar.zza == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zznvVar.zzj().zzg().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i3 = 0; i3 < intArray.length; i3++) {
                        zzal zzalVarZzf = zznvVar.zzf();
                        String str = zzoVar.zza;
                        int i4 = intArray[i3];
                        long j3 = longArray[i3];
                        Preconditions.checkNotEmpty(str);
                        zzalVarZzf.zzt();
                        zzalVarZzf.zzal();
                        try {
                            int iDelete = zzalVarZzf.m7259e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i4), String.valueOf(j3)});
                            zzalVarZzf.zzj().zzp().zza("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i4), Long.valueOf(j3));
                        } catch (SQLiteException e3) {
                            zzalVarZzf.zzj().zzg().zza("Error pruning trigger URIs. appId", zzgo.zza(str), e3);
                        }
                    }
                }
            }
        }
        return zznvVar.zzf().zzk(zzoVar.zza);
    }
}
