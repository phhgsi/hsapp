package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.C0921a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends zznr {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    zzt(zznv zznvVar) {
        super(zznvVar);
    }

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzvVar = new zzv(this, this.zza);
        this.zzc.put(num, zzvVar);
        return zzvVar;
    }

    private final List<zzfy.zzd> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.zzc.keySet();
        setKeySet.removeAll(this.zzb);
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            zzv zzvVar = this.zzc.get(num);
            Preconditions.checkNotNull(zzvVar);
            zzfy.zzd zzdVarZza = zzvVar.zza(iIntValue);
            arrayList.add(zzdVarZza);
            zzal zzalVarZzh = zzh();
            String str = this.zza;
            zzfy.zzm zzmVarZzd = zzdVarZza.zzd();
            zzalVarZzh.zzal();
            zzalVarZzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzmVarZzd);
            byte[] bArrZzca = zzmVarZzd.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrZzca);
            try {
                if (zzalVarZzh.m7259e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzalVarZzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(str));
                }
            } catch (SQLiteException e3) {
                zzalVarZzh.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(str), e3);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l3, Long l4) {
        return zza(str, list, list2, l3, l4, false);
    }

    final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l3, Long l4, boolean z2) {
        boolean z3;
        boolean z4;
        HashSet hashSet;
        Map<Integer, zzfy.zzm> map;
        List<zzfo.zzb> list3;
        boolean z5;
        Map<Integer, zzfy.zzm> map2;
        Iterator it;
        zzfy.zzm zzmVar;
        Iterator<zzfy.zze> it2;
        Long l5;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new C0921a();
        this.zzd = l3;
        this.zze = l4;
        Iterator<zzfy.zzf> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(it4.next().zzg())) {
                z3 = true;
                break;
            }
        }
        boolean z6 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbp);
        boolean z7 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbo);
        if (z3) {
            zzal zzalVarZzh = zzh();
            String str2 = this.zza;
            zzalVarZzh.zzal();
            zzalVarZzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzalVarZzh.m7259e_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e3) {
                zzalVarZzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzgo.zza(str2), e3);
            }
        }
        Map<Integer, List<zzfo.zzb>> mapZzn = Collections.EMPTY_MAP;
        if (z7 && z6) {
            mapZzn = zzh().zzn(this.zza);
        }
        Map<Integer, zzfy.zzm> mapZzm = zzh().zzm(this.zza);
        if (mapZzm.isEmpty()) {
            z4 = true;
        } else {
            HashSet hashSet3 = new HashSet(mapZzm.keySet());
            if (z3) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> mapZzo = zzh().zzo(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(mapZzm);
                C0921a c0921a = new C0921a();
                if (!mapZzm.isEmpty()) {
                    Iterator<Integer> it5 = mapZzm.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer next = it5.next();
                        next.intValue();
                        zzfy.zzm zzmVar2 = mapZzm.get(next);
                        List<Integer> list4 = mapZzo.get(next);
                        if (list4 != null && !list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            List<Long> listZza = mo7261g_().zza(zzmVar2.zzi(), list4);
                            if (listZza.isEmpty()) {
                                hashSet3 = hashSet2;
                            } else {
                                zzfy.zzm.zza zzaVarZzb = zzmVar2.zzcd().zzb().zzb(listZza);
                                zzaVarZzb.zzd().zzd(mo7261g_().zza(zzmVar2.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfy.zze zzeVar : zzmVar2.zzh()) {
                                    Map<Integer, List<Integer>> map4 = mapZzo;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    mapZzo = map4;
                                    it5 = it6;
                                }
                                map3 = mapZzo;
                                it3 = it5;
                                zzaVarZzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfy.zzn zznVar : zzmVar2.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzaVarZzb.zzc().zzc(arrayList2);
                                c0921a.put(next, (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzb.zzai()));
                            }
                        } else {
                            hashSet2 = hashSet3;
                            map3 = mapZzo;
                            it3 = it5;
                            c0921a.put(next, zzmVar2);
                        }
                        hashSet3 = hashSet2;
                        mapZzo = map3;
                        it5 = it3;
                    }
                }
                hashSet = hashSet3;
                z4 = true;
                map = c0921a;
            } else {
                hashSet = hashSet3;
                z4 = true;
                map = mapZzm;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num = (Integer) it7.next();
                num.intValue();
                zzfy.zzm zzmVar3 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                zzfy.zzm zzmVar4 = zzmVar3;
                C0921a c0921a2 = new C0921a();
                if (zzmVar4 != null && zzmVar4.zza() != 0) {
                    Iterator<zzfy.zze> it8 = zzmVar4.zzh().iterator();
                    while (it8.hasNext()) {
                        zzfy.zze next2 = it8.next();
                        if (next2.zzf()) {
                            zzmVar = zzmVar4;
                            Integer numValueOf = Integer.valueOf(next2.zza());
                            if (next2.zze()) {
                                Long lValueOf = Long.valueOf(next2.zzb());
                                it2 = it8;
                                l5 = lValueOf;
                            } else {
                                it2 = it8;
                                l5 = null;
                            }
                            c0921a2.put(numValueOf, l5);
                        } else {
                            zzmVar = zzmVar4;
                            it2 = it8;
                        }
                        it8 = it2;
                        zzmVar4 = zzmVar;
                    }
                }
                zzfy.zzm zzmVar5 = zzmVar4;
                C0921a c0921a3 = new C0921a();
                if (zzmVar5 != null && zzmVar5.zzc() != 0) {
                    Iterator<zzfy.zzn> it9 = zzmVar5.zzj().iterator();
                    while (it9.hasNext()) {
                        Iterator<zzfy.zzn> it10 = it9;
                        zzfy.zzn next3 = it9.next();
                        if (!next3.zzf() || next3.zza() <= 0) {
                            map2 = map;
                            it = it7;
                        } else {
                            map2 = map;
                            it = it7;
                            c0921a3.put(Integer.valueOf(next3.zzb()), Long.valueOf(next3.zza(next3.zza() - 1)));
                        }
                        it9 = it10;
                        map = map2;
                        it7 = it;
                    }
                }
                Map<Integer, zzfy.zzm> map5 = map;
                Iterator it11 = it7;
                if (zzmVar5 != null) {
                    int i3 = 0;
                    while (i3 < (zzmVar5.zzd() << 6)) {
                        if (zzoo.zza(zzmVar5.zzk(), i3)) {
                            z5 = z6;
                            zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzoo.zza(zzmVar5.zzi(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            z6 = z5;
                        } else {
                            z5 = z6;
                        }
                        c0921a2.remove(Integer.valueOf(i3));
                        i3++;
                        z6 = z5;
                    }
                }
                boolean z8 = z6;
                zzfy.zzm zzmVar6 = mapZzm.get(num);
                if (z7 && z8 && (list3 = mapZzn.get(num)) != null && this.zze != null && this.zzd != null) {
                    for (zzfo.zzb zzbVar : list3) {
                        int iZzb = zzbVar.zzb();
                        Map<Integer, List<zzfo.zzb>> map6 = mapZzn;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        if (c0921a2.containsKey(Integer.valueOf(iZzb))) {
                            c0921a2.put(Integer.valueOf(iZzb), Long.valueOf(jLongValue));
                        }
                        if (c0921a3.containsKey(Integer.valueOf(iZzb))) {
                            c0921a3.put(Integer.valueOf(iZzb), Long.valueOf(jLongValue));
                        }
                        mapZzn = map6;
                    }
                }
                this.zzc.put(num, new zzv(this, this.zza, zzmVar6, bitSet, bitSet2, c0921a2, c0921a3));
                mapZzm = mapZzm;
                z6 = z8;
                mapZzn = mapZzn;
                map = map5;
                it7 = it11;
            }
        }
        if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zzf(null, zzbh.zzcy)) {
            zza(list, z2);
            if (z2) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, z4);
        zza(list2);
        return zzu();
    }

    private final void zza(List<zzfy.zzf> list, boolean z2) {
        C0921a c0921a;
        zzy zzyVar;
        zzbb zzbbVar;
        zzac zzacVar;
        if (list.isEmpty()) {
            return;
        }
        zzac zzacVar2 = null;
        zzy zzyVar2 = new zzy(this);
        C0921a c0921a2 = new C0921a();
        for (zzfy.zzf zzfVar : list) {
            zzfy.zzf zzfVarZza = zzyVar2.zza(this.zza, zzfVar);
            if (zzfVarZza != null) {
                zzal zzalVarZzh = zzh();
                String str = this.zza;
                String strZzg = zzfVarZza.zzg();
                zzbb zzbbVarZzd = zzalVarZzh.zzd(str, zzfVar.zzg());
                if (zzbbVarZzd == null) {
                    zzalVarZzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzgo.zza(str), zzalVarZzh.zzi().zza(strZzg));
                    zzyVar = zzyVar2;
                    c0921a = c0921a2;
                    zzbbVar = new zzbb(str, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    c0921a = c0921a2;
                    zzyVar = zzyVar2;
                    zzbbVar = new zzbb(zzbbVarZzd.zza, zzbbVarZzd.zzb, zzbbVarZzd.zzc + 1, zzbbVarZzd.zzd + 1, zzbbVarZzd.zze + 1, zzbbVarZzd.zzf, zzbbVarZzd.zzg, zzbbVarZzd.zzh, zzbbVarZzd.zzi, zzbbVarZzd.zzj, zzbbVarZzd.zzk);
                }
                zzh().zza(zzbbVar);
                if (com.google.android.gms.internal.measurement.zznm.zza()) {
                    zzacVar = null;
                    if (zze().zzf(null, zzbh.zzcy) && z2) {
                        zzacVar2 = null;
                        c0921a2 = c0921a;
                    }
                    zzyVar2 = zzyVar;
                } else {
                    zzacVar = null;
                }
                long j3 = zzbbVar.zzc;
                String strZzg2 = zzfVarZza.zzg();
                C0921a c0921a3 = c0921a;
                Map<Integer, List<zzfo.zzb>> mapZzf = (Map) c0921a3.get(strZzg2);
                if (mapZzf == null) {
                    mapZzf = zzh().zzf(this.zza, strZzg2);
                    c0921a3.put(strZzg2, mapZzf);
                }
                for (Integer num : mapZzf.keySet()) {
                    int iIntValue = num.intValue();
                    if (this.zzb.contains(num)) {
                        zzj().zzp().zza("Skipping failed audience ID", num);
                    } else {
                        Iterator<zzfo.zzb> it = mapZzf.get(num).iterator();
                        boolean z3 = true;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            zzfo.zzb next = it.next();
                            zzx zzxVar = new zzx(this, this.zza, iIntValue, next);
                            boolean zZza = zzxVar.zza(this.zzd, this.zze, zzfVarZza, j3, zzbbVar, zza(iIntValue, next.zzb()));
                            if (zZza) {
                                zza(num).zza(zzxVar);
                                z3 = zZza;
                            } else {
                                this.zzb.add(num);
                                z3 = zZza;
                                break;
                            }
                        }
                        if (!z3) {
                            this.zzb.add(num);
                        }
                    }
                }
                zzac zzacVar3 = zzacVar;
                c0921a2 = c0921a3;
                zzacVar2 = zzacVar3;
                zzyVar2 = zzyVar;
            } else {
                c0921a2 = c0921a2;
                zzacVar2 = zzacVar2;
            }
        }
    }

    private final void zza(List<zzfy.zzo> list) {
        zzfo.zze next;
        if (list.isEmpty()) {
            return;
        }
        C0921a c0921a = new C0921a();
        for (zzfy.zzo zzoVar : list) {
            String strZzg = zzoVar.zzg();
            Map<Integer, List<zzfo.zze>> mapZzg = (Map) c0921a.get(strZzg);
            if (mapZzg == null) {
                mapZzg = zzh().zzg(this.zza, strZzg);
                c0921a.put(strZzg, mapZzg);
            }
            Iterator<Integer> it = mapZzg.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer next2 = it.next();
                    int iIntValue = next2.intValue();
                    if (this.zzb.contains(next2)) {
                        zzj().zzp().zza("Skipping failed audience ID", next2);
                        break;
                    }
                    Iterator<zzfo.zze> it2 = mapZzg.get(next2).iterator();
                    boolean zZza = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        if (zzj().zza(2)) {
                            zzj().zzp().zza("Evaluating filter. audience, filter, property", next2, next.zzi() ? Integer.valueOf(next.zza()) : null, zzi().zzc(next.zze()));
                            zzj().zzp().zza("Filter definition", mo7261g_().zza(next));
                        }
                        if (!next.zzi() || next.zza() > 256) {
                            break;
                        }
                        zzz zzzVar = new zzz(this, this.zza, iIntValue, next);
                        zZza = zzzVar.zza(this.zzd, this.zze, zzoVar, zza(iIntValue, next.zza()));
                        if (zZza) {
                            zza(next2).zza(zzzVar);
                        } else {
                            this.zzb.add(next2);
                            break;
                        }
                    }
                    zzj().zzu().zza("Invalid property filter ID. appId, id", zzgo.zza(this.zza), String.valueOf(next.zzi() ? Integer.valueOf(next.zza()) : null));
                    zZza = false;
                    if (!zZza) {
                        this.zzb.add(next2);
                    }
                }
            }
        }
    }

    private final boolean zza(int i3, int i4) {
        zzv zzvVar = this.zzc.get(Integer.valueOf(i3));
        if (zzvVar == null) {
            return false;
        }
        return zzvVar.zzd.get(i4);
    }
}
