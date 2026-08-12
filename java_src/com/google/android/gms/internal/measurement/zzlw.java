package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    static int zza(int i3, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzb(i3, true);
    }

    static int zzb(int i3, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjc.zzi(i3));
    }

    static int zzc(int i3, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzf(i3, 0);
    }

    static int zzd(int i3, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjc.zzc(i3, 0L);
    }

    static int zze(int i3, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjc.zzi(i3));
    }

    static int zzf(int i3, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzjc.zzi(i3));
    }

    static int zzg(int i3, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjc.zzi(i3));
    }

    static int zzh(int i3, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjc.zzi(i3));
    }

    static int zzi(int i3, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzjc.zzi(i3));
    }

    static int zzj(int i3, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjc.zzi(i3));
    }

    public static void zzk(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzk(i3, list, z2);
    }

    public static void zzl(int i3, List<Long> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzl(i3, list, z2);
    }

    public static void zzm(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzm(i3, list, z2);
    }

    public static void zzn(int i3, List<Long> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzn(i3, list, z2);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i3, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = size * zzjc.zzi(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZzi += zzjc.zzb(list.get(i4));
        }
        return iZzi;
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzd = 0;
            while (i3 < size) {
                iZzd += zzjc.zzd(list.get(i3).intValue());
                i3++;
            }
            return iZzd;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzd2 = 0;
        while (i3 < size) {
            iZzd2 += zzjc.zzd(zzjwVar.zzb(i3));
            i3++;
        }
        return iZzd2;
    }

    public static void zzc(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i3, list, z2);
    }

    public static void zzd(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i3, list, z2);
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzf = 0;
            while (i3 < size) {
                iZzf += zzjc.zzf(list.get(i3).intValue());
                i3++;
            }
            return iZzf;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzf2 = 0;
        while (i3 < size) {
            iZzf2 += zzjc.zzf(zzjwVar.zzb(i3));
            i3++;
        }
        return iZzf2;
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkn)) {
            int iZzd = 0;
            while (i3 < size) {
                iZzd += zzjc.zzd(list.get(i3).longValue());
                i3++;
            }
            return iZzd;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzd2 = 0;
        while (i3 < size) {
            iZzd2 += zzjc.zzd(zzknVar.zzb(i3));
            i3++;
        }
        return iZzd2;
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzh = 0;
            while (i3 < size) {
                iZzh += zzjc.zzh(list.get(i3).intValue());
                i3++;
            }
            return iZzh;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzh2 = 0;
        while (i3 < size) {
            iZzh2 += zzjc.zzh(zzjwVar.zzb(i3));
            i3++;
        }
        return iZzh2;
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkn)) {
            int iZzf = 0;
            while (i3 < size) {
                iZzf += zzjc.zzf(list.get(i3).longValue());
                i3++;
            }
            return iZzf;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzf2 = 0;
        while (i3 < size) {
            iZzf2 += zzjc.zzf(zzknVar.zzb(i3));
            i3++;
        }
        return iZzf2;
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzj = 0;
            while (i3 < size) {
                iZzj += zzjc.zzj(list.get(i3).intValue());
                i3++;
            }
            return iZzj;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzj2 = 0;
        while (i3 < size) {
            iZzj2 += zzjc.zzj(zzjwVar.zzb(i3));
            i3++;
        }
        return iZzj2;
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkn)) {
            int iZzg = 0;
            while (i3 < size) {
                iZzg += zzjc.zzg(list.get(i3).longValue());
                i3++;
            }
            return iZzg;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzg2 = 0;
        while (i3 < size) {
            iZzg2 += zzjc.zzg(zzknVar.zzb(i3));
            i3++;
        }
        return iZzg2;
    }

    static int zza(int i3, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzb = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iZzb += zzjc.zzb(i3, list.get(i4), zzluVar);
        }
        return iZzb;
    }

    static int zzb(int i3, List<?> list, zzlu<?> zzluVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof zzkk) {
                iZza = zzjc.zza((zzkk) obj);
            } else {
                iZza = zzjc.zza((zzlc) obj, zzluVar);
            }
            iZzi += iZza;
        }
        return iZzi;
    }

    public static void zze(int i3, List<Long> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i3, list, z2);
    }

    public static void zzf(int i3, List<Float> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i3, list, z2);
    }

    public static void zzg(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i3, list, z2);
    }

    public static void zzh(int i3, List<Long> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i3, list, z2);
    }

    public static void zzi(int i3, List<Integer> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i3, list, z2);
    }

    public static void zzj(int i3, List<Long> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i3, list, z2);
    }

    static int zza(int i3, Object obj, zzlu<?> zzluVar) {
        if (obj instanceof zzkk) {
            return zzjc.zzb(i3, (zzkk) obj);
        }
        return zzjc.zzc(i3, (zzlc) obj, zzluVar);
    }

    public static zzmk<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i3, List<Integer> list, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Integer num = list.get(i5);
                int iIntValue = num.intValue();
                if (zzjxVar.zza(iIntValue)) {
                    if (i5 != i4) {
                        list.set(i4, num);
                    }
                    i4++;
                } else {
                    ub = (UB) zza(obj, i3, iIntValue, ub, zzmkVar);
                }
            }
            if (i4 != size) {
                list.subList(i4, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzjxVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i3, iIntValue2, ub, zzmkVar);
                it.remove();
            }
        }
        return ub;
    }

    static int zzb(int i3, List<?> list) {
        int iZzb;
        int iZzb2;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i3) * size;
        if (!(list instanceof zzkj)) {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzik) {
                    iZzb = zzjc.zzb((zzik) obj);
                } else {
                    iZzb = zzjc.zzb((String) obj);
                }
                iZzi += iZzb;
                i4++;
            }
            return iZzi;
        }
        zzkj zzkjVar = (zzkj) list;
        while (i4 < size) {
            Object objZza = zzkjVar.zza(i4);
            if (objZza instanceof zzik) {
                iZzb2 = zzjc.zzb((zzik) objZza);
            } else {
                iZzb2 = zzjc.zzb((String) objZza);
            }
            iZzi += iZzb2;
            i4++;
        }
        return iZzi;
    }

    static <UT, UB> UB zza(Object obj, int i3, int i4, UB ub, zzmk<UT, UB> zzmkVar) {
        if (ub == null) {
            ub = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub, i3, i4);
        return ub;
    }

    public static void zzb(int i3, List<Double> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i3, list, z2);
    }

    static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t2, T t3) {
        zzjm<T> zzjmVarZza = zzjiVar.zza(t3);
        if (zzjmVarZza.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t2).zza((zzjm) zzjmVarZza);
    }

    public static void zzb(int i3, List<?> list, zznb zznbVar, zzlu<?> zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i3, list, (zzlu) zzluVar);
    }

    public static void zzb(int i3, List<String> list, zznb zznbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i3, list);
    }

    static <T> void zza(zzkv zzkvVar, T t2, T t3, long j3) {
        zzml.zza(t2, j3, zzkvVar.zza(zzml.zze(t2, j3), zzml.zze(t3, j3)));
    }

    static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t2, T t3) {
        zzmkVar.zzc(t2, zzmkVar.zza(zzmkVar.zzd(t2), zzmkVar.zzd(t3)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    public static void zza(int i3, List<Boolean> list, zznb zznbVar, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i3, list, z2);
    }

    public static void zza(int i3, List<zzik> list, zznb zznbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i3, list);
    }

    public static void zza(int i3, List<?> list, zznb zznbVar, zzlu<?> zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i3, list, (zzlu) zzluVar);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
