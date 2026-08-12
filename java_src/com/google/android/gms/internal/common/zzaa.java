package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzaa(int i3) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i3 = this.zzb;
        int i4 = i3 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i4) {
            int i5 = length + (length >> 1) + 1;
            if (i5 < i4) {
                int iHighestOneBit = Integer.highestOneBit(i3);
                i5 = iHighestOneBit + iHighestOneBit;
            }
            if (i5 < 0) {
                i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i5);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        this.zzb = i6 + 1;
        objArr2[i6] = obj;
        return this;
    }
}
