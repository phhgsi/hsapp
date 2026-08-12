package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzar {
    private final String zza;
    private long zzb = -1;
    private final /* synthetic */ zzal zzc;

    public zzar(zzal zzalVar, String str) {
        this.zzc = zzalVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    public final List<zzap> zza() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = this.zzc.m7259e_().query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.zza, String.valueOf(this.zzb)}, null, null, "rowid", "1000");
            } catch (SQLiteException e3) {
                this.zzc.zzj().zzg().zza("Data loss. Error querying raw events batch. appId", zzgo.zza(this.zza), e3);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!cursorQuery.moveToFirst()) {
                List<zzap> list = Collections.EMPTY_LIST;
                cursorQuery.close();
                return list;
            }
            do {
                long j3 = cursorQuery.getLong(0);
                long j4 = cursorQuery.getLong(3);
                boolean z2 = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j3 > this.zzb) {
                    this.zzb = j3;
                }
                try {
                    zzfy.zzf.zza zzaVar = (zzfy.zzf.zza) zzoo.zza(zzfy.zzf.zze(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    zzaVar.zza(string).zzb(cursorQuery.getLong(2));
                    arrayList.add(new zzap(j3, j4, z2, (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai())));
                } catch (IOException e4) {
                    this.zzc.zzj().zzg().zza("Data loss. Failed to merge raw event. appId", zzgo.zza(this.zza), e4);
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
