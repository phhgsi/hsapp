package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzld {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzlc zzlcVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzlcVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i3, StringBuilder sb) {
        while (i3 > 0) {
            char[] cArr = zza;
            int length = i3 > cArr.length ? cArr.length : i3;
            sb.append(cArr, 0, length);
            i3 -= length;
        }
    }

    static void zza(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzmg.zza(zzik.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb.append(": \"");
            sb.append(zzmg.zza((zzik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjt) {
            sb.append(" {");
            zza((zzjt) obj, sb, i3 + 2);
            sb.append("\n");
            zza(i3, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i5 = i3 + 2;
            zza(sb, i5, "key", entry.getKey());
            zza(sb, i5, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            zza(i3, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzlc r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzld.zza(com.google.android.gms.internal.measurement.zzlc, java.lang.StringBuilder, int):void");
    }
}
