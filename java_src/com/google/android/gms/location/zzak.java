package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.location.zzeo;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p006C.AbstractC0084a;

/* JADX INFO: loaded from: classes.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;
    private static final StringBuilder zzd;

    static {
        Locale locale = Locale.ROOT;
        zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb) {
        sb.ensureCapacity(100);
        if (location == null) {
            sb.append((String) null);
            return sb;
        }
        sb.append("{");
        sb.append(location.getProvider());
        sb.append(", ");
        if (AbstractC0084a.m207i(location)) {
            sb.append("mock, ");
        }
        DecimalFormat decimalFormat = zzb;
        sb.append(decimalFormat.format(location.getLatitude()));
        sb.append(",");
        sb.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb.append("±");
            sb.append(zzc.format(location.getAccuracy()));
            sb.append("m");
        }
        if (location.hasAltitude()) {
            sb.append(", alt=");
            DecimalFormat decimalFormat2 = zzc;
            sb.append(decimalFormat2.format(location.getAltitude()));
            if (AbstractC0084a.m206h(location)) {
                sb.append("±");
                sb.append(decimalFormat2.format(AbstractC0084a.m203e(location)));
            }
            sb.append("m");
        }
        if (location.hasSpeed()) {
            sb.append(", spd=");
            DecimalFormat decimalFormat3 = zzc;
            sb.append(decimalFormat3.format(location.getSpeed()));
            if (AbstractC0084a.m205g(location)) {
                sb.append("±");
                sb.append(decimalFormat3.format(AbstractC0084a.m202d(location)));
            }
            sb.append("m/s");
        }
        if (location.hasBearing()) {
            sb.append(", brg=");
            DecimalFormat decimalFormat4 = zzc;
            sb.append(decimalFormat4.format(location.getBearing()));
            if (AbstractC0084a.m204f(location)) {
                sb.append("±");
                sb.append(decimalFormat4.format(AbstractC0084a.m200b(location)));
            }
            sb.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb.append(", fl=");
            sb.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb.append(", lv=");
            sb.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb.append(", ert=");
        sb.append(zzeo.zza(AbstractC0084a.m201c(location) + jCurrentTimeMillis));
        sb.append('}');
        return sb;
    }
}
