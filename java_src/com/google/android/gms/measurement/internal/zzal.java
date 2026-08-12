package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.C0921a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzje;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzal extends zznr {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzf = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzat zzl;
    private final zznl zzm;

    zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
    }

    private final String zzao() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))") + ")";
    }

    /* JADX INFO: renamed from: b_ */
    public final long m7256b_() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m7259e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying raw events", e3);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c_ */
    public final long m7257c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: renamed from: d_ */
    public final long m7258d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    /* JADX INFO: renamed from: e_ */
    final SQLiteDatabase m7259e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e3) {
            zzj().zzu().zza("Error opening database", e3);
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: f_ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m7260f_() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m7259e_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.zzgo r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.m7260f_():java.lang.String");
    }

    protected final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    protected final long zzb(String str, String str2) {
        long jZza;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase sQLiteDatabaseM7259e_ = m7259e_();
        sQLiteDatabaseM7259e_.beginTransaction();
        long j3 = 0;
        try {
            try {
                jZza = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseM7259e_.endTransaction();
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
        if (jZza == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseM7259e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(str), str2);
                return -1L;
            }
            jZza = 0;
            zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
            return j3;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put(str2, Long.valueOf(1 + jZza));
            if (sQLiteDatabaseM7259e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                return -1L;
            }
            sQLiteDatabaseM7259e_.setTransactionSuccessful();
            return jZza;
        } catch (SQLiteException e4) {
            long j4 = jZza;
            e = e4;
            j3 = j4;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzd(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.zzt()
            r5.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.m7259e_()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r3 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.mo7261g_()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.zzh()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzoo.zza(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.zza(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.zzgo r2 = r5.zzj()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgq r2 = r2.zzg()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    public final zzg zze(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor = null;
        try {
            cursorQuery = m7259e_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    zzg zzgVar = new zzg(this.zzg.zzk(), str);
                    if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.ANALYTICS_STORAGE)) {
                        zzgVar.zzb(cursorQuery.getString(0));
                    }
                    zzgVar.zzf(cursorQuery.getString(1));
                    if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.AD_STORAGE)) {
                        zzgVar.zzh(cursorQuery.getString(2));
                    }
                    zzgVar.zzq(cursorQuery.getLong(3));
                    zzgVar.zzr(cursorQuery.getLong(4));
                    zzgVar.zzp(cursorQuery.getLong(5));
                    zzgVar.zzd(cursorQuery.getString(6));
                    zzgVar.zzc(cursorQuery.getString(7));
                    zzgVar.zzn(cursorQuery.getLong(8));
                    zzgVar.zzk(cursorQuery.getLong(9));
                    zzgVar.zzb(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    zzgVar.zzj(cursorQuery.getLong(11));
                    zzgVar.zzh(cursorQuery.getLong(12));
                    zzgVar.zzg(cursorQuery.getLong(13));
                    zzgVar.zze(cursorQuery.getLong(14));
                    zzgVar.zzd(cursorQuery.getLong(15));
                    zzgVar.zzm(cursorQuery.getLong(16));
                    zzgVar.zzb(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    zzgVar.zze(cursorQuery.getString(18));
                    zzgVar.zzf(cursorQuery.getLong(19));
                    zzgVar.zzi(cursorQuery.getLong(20));
                    zzgVar.zzg(cursorQuery.getString(21));
                    zzgVar.zza(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    zzgVar.zza(cursorQuery.getString(24));
                    zzgVar.zzl(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        zzgVar.zza(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zza(zzbh.zzcy) || this.zzg.zzb(str).zza(zzje.zza.ANALYTICS_STORAGE)) {
                        zzgVar.zzj(cursorQuery.getString(28));
                    }
                    if (zzpu.zza() && zze().zza(zzbh.zzbx)) {
                        zzq();
                        if (zzos.zzf(str)) {
                            zzgVar.zzc((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            zzgVar.zzo(cursorQuery.getLong(39));
                            if (zze().zza(zzbh.zzby)) {
                                zzgVar.zzk(cursorQuery.getString(36));
                            }
                        }
                    }
                    zzgVar.zzt(cursorQuery.getLong(30));
                    zzgVar.zzs(cursorQuery.getLong(31));
                    if (zzpn.zza() && zze().zze(str, zzbh.zzch)) {
                        zzgVar.zza(cursorQuery.getInt(32));
                        zzgVar.zzc(cursorQuery.getLong(35));
                    }
                    zzgVar.zzd((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    zzgVar.zza(boolValueOf);
                    zzgVar.zzc(cursorQuery.getInt(37));
                    zzgVar.zzb(cursorQuery.getInt(38));
                    zzgVar.zzi(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                    if (zze().zza(zzbh.zzcw)) {
                        if (!cursorQuery.isNull(41)) {
                            zzgVar.zza(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzgVar.zzb(Long.valueOf(cursorQuery.getLong(42)));
                        }
                    }
                    if (zzov.zza() && zze().zze(str, zzbh.zzcu)) {
                        zzgVar.zza(cursorQuery.getBlob(43));
                    }
                    zzgVar.zzao();
                    if (cursorQuery.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for app, expected one. appId", zzgo.zza(str));
                    }
                    cursorQuery.close();
                    return zzgVar;
                } catch (SQLiteException e3) {
                    e = e3;
                    zzj().zzg().zza("Error querying app. appId", zzgo.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzan zzf(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzt()
            r10.zzal()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.m7259e_()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L31
            r2.close()
            return r1
        L31:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            if (r5 == 0) goto L5e
            com.google.android.gms.measurement.internal.zzgo r5 = r10.zzj()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgo.zza(r11)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r5.zza(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L58:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto L89
        L5c:
            r0 = move-exception
            goto L72
        L5e:
            if (r0 != 0) goto L64
            r2.close()
            return r1
        L64:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5c
            r2.close()
            return r5
        L6d:
            r0 = move-exception
            r11 = r0
            goto L89
        L70:
            r0 = move-exception
            r2 = r1
        L72:
            com.google.android.gms.measurement.internal.zzgo r3 = r10.zzj()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgo.zza(r11)     // Catch: java.lang.Throwable -> L58
            r3.zza(r4, r11, r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L88
            r2.close()
        L88:
            return r1
        L89:
            if (r1 == 0) goto L8e
            r1.close()
        L8e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzf(java.lang.String):com.google.android.gms.measurement.internal.zzan");
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzje zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzje.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzje zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzje zzjeVar = (zzje) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzau() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzau
            public final Object zza(Cursor cursor) {
                return zzje.zza(cursor.getString(0), cursor.getInt(1));
            }
        });
        return zzjeVar == null ? zzje.zza : zzjeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzoj zzj(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzoj");
    }

    public final List<zzno> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m7259e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e3);
                List<zzno> list = Collections.EMPTY_LIST;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return list;
            }
        } finally {
        }
    }

    public final List<zzop> zzl(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m7259e_().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j3 = cursorQuery.getLong(2);
                    Object objZza = zza(cursorQuery, 3);
                    if (objZza == null) {
                        zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzgo.zza(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new zzop(str2, str3, string, j3, objZza));
                        } catch (SQLiteException e3) {
                            e = e3;
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } finally {
            }
        } catch (SQLiteException e4) {
            e = e4;
            str2 = str;
        }
        zzj().zzg().zza("Error querying user properties. appId", zzgo.zza(str2), e);
        List<zzop> list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    final Map<Integer, zzfy.zzm> zzm(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m7259e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, zzfy.zzm> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                C0921a c0921a = new C0921a();
                do {
                    int i3 = cursorQuery.getInt(0);
                    try {
                        c0921a.put(Integer.valueOf(i3), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), cursorQuery.getBlob(1))).zzai()));
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i3), e3);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0921a;
            } catch (SQLiteException e4) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e4);
                Map<Integer, zzfy.zzm> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        C0921a c0921a = new C0921a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m7259e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i3 = cursorQuery.getInt(0);
                            List arrayList = (List) c0921a.get(Integer.valueOf(i3));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c0921a.put(Integer.valueOf(i3), arrayList);
                            }
                            arrayList.add(zzbVar);
                        }
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e3);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0921a;
            } catch (SQLiteException e4) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e4);
                Map<Integer, List<zzfo.zzb>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        C0921a c0921a = new C0921a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m7259e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    cursorRawQuery.close();
                    return map;
                }
                do {
                    int i3 = cursorRawQuery.getInt(0);
                    List arrayList = (List) c0921a.get(Integer.valueOf(i3));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        c0921a.put(Integer.valueOf(i3), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return c0921a;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e3);
                Map<Integer, List<Integer>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzp() {
        zzal();
        m7259e_().beginTransaction();
    }

    public final void zzq(String str) {
        zzbb zzbbVarZzd;
        zzi("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m7259e_().query("events", (String[]) Collections.singletonList(AppMeasurementSdk.ConditionalUserProperty.NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (zzbbVarZzd = zzd(str, string)) != null) {
                        zza("events_snapshot", zzbbVarZzd);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e3);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
    }

    public final boolean zzs(String str) {
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        String strZzao = zzao();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strZzao);
        return zzb(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean zzt(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r9.m7259e_()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            java.lang.String r4 = "select timestamp from raw_events where app_id=? and name = '_f' limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            android.database.Cursor r2 = r3.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            if (r3 != 0) goto L1b
            r2.close()
            return r1
        L1b:
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            com.google.android.gms.common.util.Clock r5 = r9.zzb()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            long r5 = r5.currentTimeMillis()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4c
            r7 = 15000(0x3a98, double:7.411E-320)
            long r3 = r3 + r7
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L30
            r3 = r0
            goto L31
        L30:
            r3 = r1
        L31:
            java.lang.String r4 = "select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            r5 = 0
            long r7 = r9.zza(r4, r10, r5)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L43
            r10 = r0
            goto L44
        L43:
            r10 = r1
        L44:
            r2.close()
            goto L61
        L48:
            r10 = move-exception
            goto L67
        L4a:
            r10 = move-exception
            goto L4e
        L4c:
            r10 = move-exception
            r3 = r1
        L4e:
            com.google.android.gms.measurement.internal.zzgo r4 = r9.zzj()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzg()     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "Error checking backfill conditions"
            r4.zza(r5, r10)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L60
            r2.close()
        L60:
            r10 = r1
        L61:
            if (r3 == 0) goto L66
            if (r10 != 0) goto L66
            return r0
        L66:
            return r1
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzt(java.lang.String):boolean");
    }

    public final void zzu() {
        zzal();
        m7259e_().endTransaction();
    }

    final void zzv() {
        int iDelete;
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zza.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zza.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (!zzaa() || (iDelete = m7259e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final void zzw() {
        zzal();
        m7259e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return m7259e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e3);
            return 0;
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void zzp(String str) {
        zzt();
        zzal();
        try {
            m7259e_().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error clearing default event params", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            m7259e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e3);
        }
    }

    final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C0921a c0921a = new C0921a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m7259e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i3 = cursorQuery.getInt(0);
                        List arrayList = (List) c0921a.get(Integer.valueOf(i3));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0921a.put(Integer.valueOf(i3), arrayList);
                        }
                        arrayList.add(zzeVar);
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e3);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0921a;
            } catch (SQLiteException e4) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e4);
                Map<Integer, List<zzfo.zze>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            m7259e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e3);
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return m7259e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e3);
            return 0L;
        }
    }

    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C0921a c0921a = new C0921a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m7259e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), cursorQuery.getBlob(1))).zzai());
                        int i3 = cursorQuery.getInt(0);
                        List arrayList = (List) c0921a.get(Integer.valueOf(i3));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c0921a.put(Integer.valueOf(i3), arrayList);
                        }
                        arrayList.add(zzbVar);
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e3);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c0921a;
            } catch (SQLiteException e4) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e4);
                Map<Integer, List<zzfo.zzb>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    public final long zza(zzfy.zzk zzkVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] bArrZzca = zzkVar.zzca();
        long jZza = mo7261g_().zza(bArrZzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(jZza));
        contentValues.put("metadata", bArrZzca);
        try {
            m7259e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jZza;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e3);
            throw e3;
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m7259e_().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j3 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j3;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Database error", str, e3);
                throw e3;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zza(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.m7259e_()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r3 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r3
        L18:
            r3 = move-exception
            goto L2e
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Database error"
            r5.zza(r6, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzf, java.lang.Long> zza(java.lang.String r6, java.lang.Long r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.zzt()
            r5.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.m7259e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.zza(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r4 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.zza(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzgo r7 = r5.zzj()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.zzgq r7 = r7.zzg()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.zza(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final zzaq zza(long j3, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return zza(j3, str, 1L, false, false, z4, false, z6, z7, z8);
    }

    public final zzaq zza(long j3, String str, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM7259e_ = m7259e_();
                Cursor cursorQuery = sQLiteDatabaseM7259e_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzgo.zza(str));
                    cursorQuery.close();
                    return zzaqVar;
                }
                if (cursorQuery.getLong(0) == j3) {
                    zzaqVar.zzb = cursorQuery.getLong(1);
                    zzaqVar.zza = cursorQuery.getLong(2);
                    zzaqVar.zzc = cursorQuery.getLong(3);
                    zzaqVar.zzd = cursorQuery.getLong(4);
                    zzaqVar.zze = cursorQuery.getLong(5);
                    zzaqVar.zzf = cursorQuery.getLong(6);
                    zzaqVar.zzg = cursorQuery.getLong(7);
                }
                if (z2) {
                    zzaqVar.zzb += j4;
                }
                if (z3) {
                    zzaqVar.zza += j4;
                }
                if (z4) {
                    zzaqVar.zzc += j4;
                }
                if (z5) {
                    zzaqVar.zzd += j4;
                }
                if (z6) {
                    zzaqVar.zze += j4;
                }
                if (z7) {
                    zzaqVar.zzf += j4;
                }
                if (z8) {
                    zzaqVar.zzg += j4;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j3));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaqVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaqVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaqVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaqVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaqVar.zze));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaqVar.zzf));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(zzaqVar.zzg));
                sQLiteDatabaseM7259e_.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzaqVar;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error updating daily counts. appId", zzgo.zza(str), e3);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaqVar;
            }
        } finally {
        }
    }

    public final zzop zze(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        Cursor cursor = null;
        try {
            cursorQuery = m7259e_().query("user_attributes", new String[]{"set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j3 = cursorQuery.getLong(0);
                    Object objZza = zza(cursorQuery, 1);
                    if (objZza == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzop zzopVar = new zzop(str3, cursorQuery.getString(2), str4, j3, objZza);
                        if (cursorQuery.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzgo.zza(str3));
                        }
                        cursorQuery.close();
                        return zzopVar;
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str3 = str;
                    str4 = str2;
                }
                sQLiteException = e;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            str3 = str;
            str4 = str2;
            sQLiteException = e5;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        zzj().zzg().zza("Error querying user property. appId", zzgo.zza(str3), zzi().zzc(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void zzb(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjeVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase sQLiteDatabaseM7259e_ = m7259e_();
        try {
            long jZzb = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (jZzb <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                Integer num = list.get(i3);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseM7259e_.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    final boolean zzb(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] bArrZzca = mo7261g_().zza(new zzbc(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzca();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzca);
        try {
            if (m7259e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    private final Object zza(Cursor cursor, int i3) {
        int type = cursor.getType(i3);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i3));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i3));
        }
        if (type == 3) {
            return cursor.getString(i3);
        }
        if (type != 4) {
            zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzau<T> r5) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.m7259e_()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.zzgo r4 = r2.zzj()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzp()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.zza(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzau):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.zzt()
            r3.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.m7259e_()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.zzgo r5 = r3.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzp()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.zza(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.zzgo r1 = r3.zzj()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zza(java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.m7259e_()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            java.lang.String r3 = r1.getString(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r3
        L18:
            r3 = move-exception
            goto L2e
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "Database error"
            r5.zza(r0, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }

    public final List<Pair<zzfy.zzk, Long>> zza(String str, int i3, int i4) {
        byte[] bArrZzc;
        long jZzc;
        long jZzc2;
        zzt();
        zzal();
        int i5 = 1;
        Preconditions.checkArgument(i3 > 0);
        Preconditions.checkArgument(i4 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m7259e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i3));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<zzfy.zzk, Long>> list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j3 = cursorQuery.getLong(0);
                    try {
                        bArrZzc = mo7261g_().zzc(cursorQuery.getBlob(i5));
                    } catch (IOException e3) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(str), e3);
                    }
                    if (!arrayList.isEmpty() && bArrZzc.length + length > i4) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) zzoo.zza(zzfy.zzk.zzw(), bArrZzc);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                jZzc = -1;
                                if (!it.hasNext()) {
                                    jZzc2 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    jZzc2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    jZzc = next2.zzc();
                                    break;
                                }
                            }
                            if (jZzc2 != jZzc) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            zzaVar.zzi(cursorQuery.getInt(2));
                        }
                        length += bArrZzc.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), Long.valueOf(j3)));
                    } catch (IOException e4) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(str), e4);
                    }
                    if (!cursorQuery.moveToNext() || length > i4) {
                        break;
                    }
                    i5 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e5) {
                zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(str), e5);
                List<Pair<zzfy.zzk, Long>> list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(String str, Bundle bundle) {
        zzal zzalVar = this;
        Preconditions.checkNotNull(bundle);
        zzalVar.zzt();
        zzalVar.zzal();
        String str2 = str;
        zzar zzarVar = new zzar(zzalVar, str2);
        List<zzap> listZza = zzarVar.zza();
        while (!listZza.isEmpty()) {
            for (zzap zzapVar : listZza) {
                zzoo zzooVarMo7261g_ = zzalVar.mo7261g_();
                zzfy.zzf zzfVar = zzapVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (!zzhVar.zzi().isEmpty()) {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzoo.zzb(zzhVar.zzi()));
                    } else {
                        zzooVarMo7261g_.zzj().zzg().zza("Unexpected parameter type for parameter", zzhVar);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strZzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(strZzg, string, bundle2, zzfVar.zzd());
                zzalVar.zzq().zza(zzgsVar.zzc, bundle);
                zzalVar.zza(zzapVar.zza, new zzbc(zzalVar.zzu, zzgsVar.zzb, str2, zzapVar.zzd.zzg(), zzapVar.zzd.zzd(), zzapVar.zzd.zzc(), zzgsVar.zzc), zzapVar.zzb, zzapVar.zzc);
                zzalVar = this;
                str2 = str;
            }
            listZza = zzarVar.zza();
            zzalVar = this;
            str2 = str;
        }
    }

    final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m7259e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error incrementing retry count. error", e3);
            }
        }
    }

    final void zza(Long l3) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l3);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l3 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m7259e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l3 + " AND retry_count < 2147483647");
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error incrementing retry count. error", e3);
            }
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    final void zza(String str, List<zzfo.zza> list) {
        boolean z2;
        boolean z3;
        Preconditions.checkNotNull(list);
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzfo.zza.C2620zza c2620zzaZzcd = list.get(i3).zzcd();
            if (c2620zzaZzcd.zza() != 0) {
                for (int i4 = 0; i4 < c2620zzaZzcd.zza(); i4++) {
                    zzfo.zzb.zza zzaVarZzcd = c2620zzaZzcd.zza(i4).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzaVarZzcd.clone());
                    String strZzb = zzji.zzb(zzaVarZzcd.zzb());
                    if (strZzb != null) {
                        zzaVar.zza(strZzb);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    for (int i5 = 0; i5 < zzaVarZzcd.zza(); i5++) {
                        zzfo.zzc zzcVarZza = zzaVarZzcd.zza(i5);
                        String strZza = zzjk.zza(zzcVarZza.zze());
                        if (strZza != null) {
                            zzaVar.zza(i5, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zzcVarZza.zzcd().zza(strZza).zzai()));
                            z3 = true;
                        }
                    }
                    if (z3) {
                        zzfo.zza.C2620zza c2620zzaZza = c2620zzaZzcd.zza(i4, zzaVar);
                        list.set(i3, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) c2620zzaZza.zzai()));
                        c2620zzaZzcd = c2620zzaZza;
                    }
                }
            }
            if (c2620zzaZzcd.zzb() != 0) {
                for (int i6 = 0; i6 < c2620zzaZzcd.zzb(); i6++) {
                    zzfo.zze zzeVarZzb = c2620zzaZzcd.zzb(i6);
                    String strZza2 = zzjj.zza(zzeVarZzb.zze());
                    if (strZza2 != null) {
                        c2620zzaZzcd = c2620zzaZzcd.zza(i6, zzeVarZzb.zzcd().zza(strZza2));
                        list.set(i3, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) c2620zzaZzcd.zzai()));
                    }
                }
            }
        }
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseM7259e_ = m7259e_();
        sQLiteDatabaseM7259e_.beginTransaction();
        try {
            zzal();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseM7259e_2 = m7259e_();
            sQLiteDatabaseM7259e_2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM7259e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfo.zza zzaVar2 : list) {
                zzal();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzgo.zza(str));
                } else {
                    int iZza = zzaVar2.zza();
                    Iterator<zzfo.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(iZza));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, iZza, it3.next())) {
                                                z2 = false;
                                                break;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, iZza, it4.next())) {
                                                    z2 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseM7259e_3 = m7259e_();
                                        sQLiteDatabaseM7259e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseM7259e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfo.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            sQLiteDatabaseM7259e_.setTransactionSuccessful();
            sQLiteDatabaseM7259e_.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseM7259e_.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.measurement.internal.zzg r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr)) {
            zzje zzjeVarZzi = zzi(str);
            zzje zzjeVar = zzje.zza;
            if (zzjeVarZzi == zzjeVar) {
                zzb(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzbb zzbbVar) {
        zza("events", zzbbVar);
    }

    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbbVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbbVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbbVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbbVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbbVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbbVar.zzg));
        contentValues.put("last_bundled_day", zzbbVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbbVar.zzi);
        contentValues.put("last_sampling_rate", zzbbVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbbVar.zze));
        Boolean bool = zzbbVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m7259e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e3);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM7259e_ = m7259e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
                return;
            }
            if (sQLiteDatabaseM7259e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseM7259e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e3);
        }
    }

    public final void zza(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final boolean zza(zzfy.zzk zzkVar, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbj());
        zzv();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < jCurrentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(zzkVar.zzz()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] bArrZzb = mo7261g_().zzb(zzkVar.zzca());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(bArrZzb.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put("data", bArrZzb);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (m7259e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzz()), e3);
                return false;
            }
        } catch (IOException e4) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzz()), e4);
            return false;
        }
    }

    private final boolean zza(String str, int i3, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i3), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i3));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (m7259e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    private final boolean zza(String str, int i3, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i3), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] bArrZzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i3));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", bArrZzca);
        try {
            if (m7259e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    public final boolean zza(zzbc zzbcVar, long j3, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = mo7261g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j3));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            if (m7259e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbcVar.zza), e3);
            return false;
        }
    }

    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        long j3 = zznoVar.zzb;
        zzfz<Long> zzfzVar = zzbh.zzbh;
        if (j3 < jCurrentTimeMillis - zzfzVar.zza(null).longValue() || zznoVar.zzb > zzfzVar.zza(null).longValue() + jCurrentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (m7259e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    public final boolean zza(String str, zzfy.zzj zzjVar, String str2, Map<String, String> map, zznt zzntVar) {
        int iDelete;
        zzt();
        zzal();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        zzt();
        zzal();
        if (zzaa()) {
            long jZza = zzn().zzb.zza();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jZza) > zzag.zzn()) {
                zzn().zzb.zza(jElapsedRealtime);
                zzt();
                zzal();
                if (zzaa() && (iDelete = m7259e_().delete("upload_queue", zzao(), new String[0])) > 0) {
                    zzj().zzp().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] bArrZzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i3 = 1;
            while (i3 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i3);
                i3++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (m7259e_().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e3);
            return false;
        }
    }

    public final boolean zza(String str, Long l3, long j3, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l3);
        byte[] bArrZzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l3);
        contentValues.put("children_to_process", Long.valueOf(j3));
        contentValues.put("main_event", bArrZzca);
        try {
            if (m7259e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e3);
            return false;
        }
    }

    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzaeVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzaeVar.zzc.zza);
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zzos.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put("triggered_event", zzos.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put("expired_event", zzos.zza((Parcelable) zzaeVar.zzk));
        try {
            if (m7259e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            return true;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e3);
            return true;
        }
    }

    private final boolean zza(long j3, zzbc zzbcVar, long j4, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] bArrZzca = mo7261g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j4));
        contentValues.put("data", bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            long jUpdate = m7259e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j3)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbcVar.zza), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbcVar.zza), e3);
            return false;
        }
    }

    public final boolean zza(zzop zzopVar) {
        Preconditions.checkNotNull(zzopVar);
        zzt();
        zzal();
        if (zze(zzopVar.zza, zzopVar.zzc) == null) {
            if (zzos.zzh(zzopVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzopVar.zza}) >= zze().zza(zzopVar.zza, zzbh.zzai, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzopVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzopVar.zza, zzopVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzopVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzopVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzopVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzopVar.zzd));
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzopVar.zze);
        try {
            if (m7259e_().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzopVar.zza));
            return true;
        } catch (SQLiteException e3) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzopVar.zza), e3);
            return true;
        }
    }
}
