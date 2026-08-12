package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    public static double zza(double d3) {
        if (Double.isNaN(d3)) {
            return 0.0d;
        }
        if (Double.isInfinite(d3) || d3 == 0.0d || d3 == -0.0d) {
            return d3;
        }
        return ((double) (d3 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d3));
    }

    public static int zzb(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3) || d3 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d3 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d3))) % 4.294967296E9d);
    }

    public static long zzc(double d3) {
        return ((long) zzb(d3)) & 4294967295L;
    }

    public static void zzc(String str, int i3, List<zzaq> list) {
        if (list.size() > i3) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i3), Integer.valueOf(list.size())));
        }
    }

    public static void zzb(zzbv zzbvVar, int i3, List<zzaq> list) {
        zzb(zzbvVar.name(), i3, list);
    }

    public static int zza(zzh zzhVar) {
        int iZzb = zzb(zzhVar.zza("runtime.counter").zze().doubleValue() + 1.0d);
        if (iZzb <= 1000000) {
            zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(iZzb)));
            return iZzb;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void zzb(String str, int i3, List<zzaq> list) {
        if (list.size() < i3) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i3), Integer.valueOf(list.size())));
        }
    }

    public static zzbv zza(String str) {
        zzbv zzbvVarZza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zzbvVarZza != null) {
            return zzbvVarZza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean zzb(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double dZze = zzaqVar.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= 0.0d && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    public static Object zza(zzaq zzaqVar) {
        if (zzaq.zzd.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return zza((zzap) zzaqVar);
        }
        if (zzaqVar instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
            while (it.hasNext()) {
                Object objZza = zza(it.next());
                if (objZza != null) {
                    arrayList.add(objZza);
                }
            }
            return arrayList;
        }
        if (!zzaqVar.zze().isNaN()) {
            return zzaqVar.zze();
        }
        return zzaqVar.zzf();
    }

    public static Map<String, Object> zza(zzap zzapVar) {
        HashMap map = new HashMap();
        for (String str : zzapVar.zza()) {
            Object objZza = zza(zzapVar.zza(str));
            if (objZza != null) {
                map.put(str, objZza);
            }
        }
        return map;
    }

    public static void zza(zzbv zzbvVar, int i3, List<zzaq> list) {
        zza(zzbvVar.name(), i3, list);
    }

    public static void zza(String str, int i3, List<zzaq> list) {
        if (list.size() != i3) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i3), Integer.valueOf(list.size())));
        }
    }

    public static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue())) {
                return false;
            }
            return zzaqVar.zze().equals(zzaqVar2.zze());
        }
        if (zzaqVar instanceof zzas) {
            return zzaqVar.zzf().equals(zzaqVar2.zzf());
        }
        if (zzaqVar instanceof zzag) {
            return zzaqVar.zzd().equals(zzaqVar2.zzd());
        }
        return zzaqVar == zzaqVar2;
    }
}
