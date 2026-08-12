package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {
    private static zzv zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzp zzd = new zzp(this, null);
    private int zze = 1;

    zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zzv zzb(Context context) {
        try {
            if (zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                zza = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private final synchronized int zzf() {
        int i3;
        i3 = this.zze;
        this.zze = i3 + 1;
        return i3;
    }

    private final synchronized Task zzg(zzs zzsVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(zzsVar.toString()));
            }
            if (!this.zzd.zzg(zzsVar)) {
                zzp zzpVar = new zzp(this, null);
                this.zzd = zzpVar;
                zzpVar.zzg(zzsVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzsVar.zzb.getTask();
    }

    public final Task zzc(int i3, Bundle bundle) {
        return zzg(new zzr(zzf(), i3, bundle));
    }

    public final Task zzd(int i3, Bundle bundle) {
        return zzg(new zzu(zzf(), i3, bundle));
    }
}
