package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzs {
    zzu(int i3, int i4, Bundle bundle) {
        super(i3, i4, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final boolean zzb() {
        return false;
    }
}
