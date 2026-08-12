package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C0921a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p113i1.AbstractC2035h;

/* JADX INFO: loaded from: classes.dex */
public final class zzgu implements zzhb {
    private static final Map<Uri, zzgu> zza = new C0921a();
    private static final String[] zzb = {"key", AppMeasurementSdk.ConditionalUserProperty.VALUE};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzgz> zzi;

    private zzgu(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgw zzgwVar = new zzgw(this, null);
        this.zzf = zzgwVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        AbstractC2035h.m10240i(contentResolver);
        AbstractC2035h.m10240i(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgwVar);
    }

    public static zzgu zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgu zzguVar;
        synchronized (zzgu.class) {
            Map<Uri, zzgu> map = zza;
            zzguVar = map.get(uri);
            if (zzguVar == null) {
                try {
                    zzgu zzguVar2 = new zzgu(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzguVar2);
                    } catch (SecurityException unused) {
                    }
                    zzguVar = zzguVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzguVar;
    }

    static synchronized void zzc() {
        try {
            for (zzgu zzguVar : zza.values()) {
                zzguVar.zzc.unregisterContentObserver(zzguVar.zzf);
            }
            zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzha.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzgx
                    @Override // com.google.android.gms.internal.measurement.zzhd
                    public final Object zza() {
                        return this.zza.zzb();
                    }
                });
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (SQLiteException | IllegalStateException | SecurityException e3) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e3);
            return Collections.EMPTY_MAP;
        }
    }

    final /* synthetic */ Map zzb() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.zzc.acquireUnstableContentProviderClient(this.zzd);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.zzd, zzb, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map map = Collections.EMPTY_MAP;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return map;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map2 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map2;
                }
                Map c0921a = count <= 256 ? new C0921a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c0921a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c0921a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map3 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map3;
            } finally {
            }
        } catch (RemoteException e3) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e3);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator<zzgz> it = this.zzi.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhb
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> mapZze = this.zzh;
        if (mapZze == null) {
            synchronized (this.zzg) {
                try {
                    mapZze = this.zzh;
                    if (mapZze == null) {
                        mapZze = zze();
                        this.zzh = mapZze;
                    }
                } finally {
                }
            }
        }
        return mapZze != null ? mapZze : Collections.EMPTY_MAP;
    }
}
