package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class zzmg {
    static String zza(zzik zzikVar) {
        zzmf zzmfVar = new zzmf(zzikVar);
        StringBuilder sb = new StringBuilder(zzmfVar.zza());
        for (int i3 = 0; i3 < zzmfVar.zza(); i3++) {
            byte bZza = zzmfVar.zza(i3);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
