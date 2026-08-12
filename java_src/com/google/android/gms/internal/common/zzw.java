package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    protected zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i3 = this.zze;
        while (true) {
            int i4 = this.zze;
            if (i4 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i4);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i3) {
                int i5 = iZzc + 1;
                this.zze = i5;
                if (i5 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i3 < iZzd) {
                    this.zzb.charAt(i3);
                }
                if (i3 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i3 != iZzd) {
                    break;
                }
                i3 = this.zze;
            }
        }
        int i6 = this.zzf;
        if (i6 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i3) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i6 - 1;
        }
        return this.zzb.subSequence(i3, iZzd).toString();
    }

    abstract int zzc(int i3);

    abstract int zzd(int i3);
}
