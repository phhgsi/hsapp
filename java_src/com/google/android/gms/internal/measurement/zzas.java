package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        double d3;
        byte b3;
        int i3;
        zzas zzasVar;
        int i4;
        int i5;
        zzh zzhVar2;
        String strZzf;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                b3 = str.equals(str4) ? (byte) 0 : (byte) -1;
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                if (str.equals(str6)) {
                    str4 = str2;
                    b3 = 1;
                } else {
                    b3 = -1;
                    str4 = str2;
                }
                break;
            case -1464939364:
                str5 = "charAt";
                str7 = "toLocaleLowerCase";
                if (str.equals(str7)) {
                    str4 = str2;
                    str6 = "toString";
                    b3 = 2;
                } else {
                    b3 = -1;
                    str4 = str2;
                    str6 = "toString";
                }
                d3 = 0.0d;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    b3 = 3;
                    d3 = 0.0d;
                } else {
                    b3 = -1;
                    str4 = str2;
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d3 = 0.0d;
                }
                break;
            case -1354795244:
                b3 = !str.equals("concat") ? (byte) -1 : (byte) 4;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case -1137582698:
                b3 = !str.equals("toLowerCase") ? (byte) -1 : (byte) 5;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case -906336856:
                b3 = !str.equals("search") ? (byte) -1 : (byte) 6;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case -726908483:
                b3 = !str.equals("toLocaleUpperCase") ? (byte) -1 : (byte) 7;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case -467511597:
                b3 = !str.equals("lastIndexOf") ? (byte) -1 : (byte) 8;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case -399551817:
                b3 = !str.equals("toUpperCase") ? (byte) -1 : (byte) 9;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 3568674:
                b3 = !str.equals(str3) ? (byte) -1 : (byte) 10;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 103668165:
                b3 = !str.equals("match") ? (byte) -1 : (byte) 11;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 109526418:
                b3 = !str.equals("slice") ? (byte) -1 : (byte) 12;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 109648666:
                b3 = !str.equals("split") ? (byte) -1 : (byte) 13;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 530542161:
                b3 = !str.equals("substring") ? (byte) -1 : (byte) 14;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 1094496948:
                b3 = !str.equals("replace") ? (byte) -1 : (byte) 15;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            case 1943291465:
                b3 = !str.equals("indexOf") ? (byte) -1 : (byte) 16;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
            default:
                b3 = -1;
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d3 = 0.0d;
                break;
        }
        switch (b3) {
            case 0:
                zzg.zza(str4, 1, list);
                String str8 = this.zza;
                zzaq zzaqVarZza = zzhVar.zza(list.get(0));
                if ("length".equals(zzaqVarZza.zzf())) {
                    return zzaq.zzh;
                }
                double dDoubleValue = zzaqVarZza.zze().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i3 = (int) dDoubleValue) < 0 || i3 >= str8.length()) ? zzaq.zzi : zzaq.zzh;
            case 1:
                zzg.zza(str6, 0, list);
                return this;
            case 2:
                zzg.zza(str7, 0, list);
                return new zzas(this.zza.toLowerCase());
            case 3:
                zzg.zzc(str5, 1, list);
                int iZza = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                String str9 = this.zza;
                return (iZza < 0 || iZza >= str9.length()) ? zzaq.zzj : new zzas(String.valueOf(str9.charAt(iZza)));
            case 4:
                zzasVar = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(zzasVar.zza);
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        sb.append(zzhVar.zza(list.get(i6)).zzf());
                    }
                    return new zzas(sb.toString());
                }
                return zzasVar;
            case 5:
                zzg.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.zzc("search", 1, list);
                return Pattern.compile(!list.isEmpty() ? zzhVar.zza(list.get(0)).zzf() : zzaq.zzc.zzf()).matcher(this.zza).find() ? new zzai(Double.valueOf(r0.start())) : new zzai(Double.valueOf(-1.0d));
            case 7:
                zzg.zza("toLocaleUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase());
            case 8:
                zzg.zzc("lastIndexOf", 2, list);
                String str10 = this.zza;
                String strZzf2 = list.size() <= 0 ? zzaq.zzc.zzf() : zzhVar.zza(list.get(0)).zzf();
                return new zzai(Double.valueOf(str10.lastIndexOf(strZzf2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.zza(list.get(1)).zze().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.zza(r4)))));
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 10:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                zzg.zzc("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzhVar.zza(list.get(0)).zzf()).matcher(this.zza);
                return matcher.find() ? new zzaf(new zzas(matcher.group())) : zzaq.zzd;
            case 12:
                zzg.zzc("slice", 2, list);
                String str11 = this.zza;
                double dZza = zzg.zza(!list.isEmpty() ? zzhVar.zza(list.get(0)).zze().doubleValue() : d3);
                int iMax = (int) (dZza < d3 ? Math.max(((double) str11.length()) + dZza, d3) : Math.min(dZza, str11.length()));
                double dZza2 = zzg.zza(list.size() > 1 ? zzhVar.zza(list.get(1)).zze().doubleValue() : str11.length());
                return new zzas(str11.substring(iMax, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str11.length()) + dZza2, 0.0d) : Math.min(dZza2, str11.length()))) - iMax) + iMax));
            case 13:
                zzg.zzc("split", 2, list);
                String str12 = this.zza;
                if (str12.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzf3 = zzhVar.zza(list.get(0)).zzf();
                    long jZzc = list.size() > 1 ? zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) : 2147483647L;
                    if (jZzc == 0) {
                        return new zzaf();
                    }
                    String[] strArrSplit = str12.split(Pattern.quote(strZzf3), ((int) jZzc) + 1);
                    int length = strArrSplit.length;
                    if (!strZzf3.isEmpty() || strArrSplit.length <= 0) {
                        i4 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i4 = zIsEmpty;
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            length = strArrSplit.length - 1;
                            i4 = zIsEmpty;
                        }
                    }
                    if (strArrSplit.length > jZzc) {
                        length--;
                    }
                    while (i4 < length) {
                        arrayList.add(new zzas(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new zzaf(arrayList);
            case 14:
                zzg.zzc("substring", 2, list);
                String str13 = this.zza;
                int iZza2 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                int iZza3 = list.size() > 1 ? (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()) : str13.length();
                int iMin = Math.min(Math.max(iZza2, 0), str13.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str13.length());
                return new zzas(str13.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                zzasVar = this;
                zzg.zzc("replace", 2, list);
                zzaq zzaqVarZza2 = zzaq.zzc;
                String strZzf4 = zzaqVarZza2.zzf();
                if (!list.isEmpty()) {
                    strZzf4 = zzhVar.zza(list.get(0)).zzf();
                    if (list.size() > 1) {
                        zzaqVarZza2 = zzhVar.zza(list.get(1));
                    }
                }
                String str14 = zzasVar.zza;
                int iIndexOf = str14.indexOf(strZzf4);
                if (iIndexOf >= 0) {
                    if (zzaqVarZza2 instanceof zzal) {
                        i5 = 0;
                        zzaqVarZza2 = ((zzal) zzaqVarZza2).zza(zzhVar, Arrays.asList(new zzas(strZzf4), new zzai(Double.valueOf(iIndexOf)), zzasVar));
                    } else {
                        i5 = 0;
                    }
                    return new zzas(str14.substring(i5, iIndexOf) + zzaqVarZza2.zzf() + str14.substring(iIndexOf + strZzf4.length()));
                }
                return zzasVar;
            case 16:
                zzg.zzc("indexOf", 2, list);
                String str15 = this.zza;
                if (list.size() <= 0) {
                    strZzf = zzaq.zzc.zzf();
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    strZzf = zzhVar2.zza(list.get(0)).zzf();
                }
                return new zzai(Double.valueOf(str15.indexOf(strZzf, (int) zzg.zza(list.size() < 2 ? d3 : zzhVar2.zza(list.get(1)).zze().doubleValue()))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
