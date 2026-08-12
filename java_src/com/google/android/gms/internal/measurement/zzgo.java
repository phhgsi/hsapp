package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgo implements zzgq {
    @Override // com.google.android.gms.internal.measurement.zzgq
    public final String zza(ContentResolver contentResolver, String str) throws zzgt {
        Uri uri = zzgi.zza;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzgt("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return string;
                } finally {
                }
            } catch (RemoteException e3) {
                throw new zzgt("ContentProvider query failed", e3);
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgr<T> zzgrVar) throws zzgt {
        Uri uri = zzgi.zzb;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
            try {
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (cursorQuery != null) {
                            T t2 = (T) zzgrVar.zza(cursorQuery.getCount());
                            while (cursorQuery.moveToNext()) {
                                t2.put(cursorQuery.getString(0), cursorQuery.getString(1));
                            }
                            if (cursorQuery.isAfterLast()) {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                return t2;
                            }
                            throw new zzgt("Cursor read incomplete (ContentProvider dead?)");
                        }
                        throw new zzgt("ContentProvider query returned null cursor");
                    } finally {
                    }
                } catch (RemoteException e3) {
                    throw new zzgt("ContentProvider query failed", e3);
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        } else {
            throw new zzgt("Unable to acquire ContentProviderClient");
        }
    }
}
