package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, "output");
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, List<Double> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzje)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).doubleValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZza = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZza += zzjc.zza(list.get(i5).doubleValue());
            }
            this.zza.zzc(iZza);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).doubleValue());
                i4++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (!z2) {
            while (i4 < zzjeVar.size()) {
                this.zza.zzb(i3, zzjeVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZza2 = 0;
        for (int i6 = 0; i6 < zzjeVar.size(); i6++) {
            iZza2 += zzjc.zza(zzjeVar.zzb(i6));
        }
        this.zza.zzc(iZza2);
        while (i4 < zzjeVar.size()) {
            this.zza.zzb(zzjeVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzd = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzd += zzjc.zzd(list.get(i5).intValue());
            }
            this.zza.zzc(iZzd);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zzb(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzd2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZzd2 += zzjc.zzd(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZzd2);
        while (i4 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zza(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZze = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZze += zzjc.zze(list.get(i5).intValue());
            }
            this.zza.zzc(iZze);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zza(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZze2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZze2 += zzjc.zze(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZze2);
        while (i4 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i3, List<Long> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zza(i3, list.get(i4).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzc = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzc += zzjc.zzc(list.get(i5).longValue());
            }
            this.zza.zzc(iZzc);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i4 < zzknVar.size()) {
                this.zza.zza(i3, zzknVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzc2 = 0;
        for (int i6 = 0; i6 < zzknVar.size(); i6++) {
            iZzc2 += zzjc.zzc(zzknVar.zzb(i6));
        }
        this.zza.zzc(iZzc2);
        while (i4 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i3, List<Float> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjs)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).floatValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZza = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZza += zzjc.zza(list.get(i5).floatValue());
            }
            this.zza.zzc(iZza);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).floatValue());
                i4++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (!z2) {
            while (i4 < zzjsVar.size()) {
                this.zza.zzb(i3, zzjsVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZza2 = 0;
        for (int i6 = 0; i6 < zzjsVar.size(); i6++) {
            iZza2 += zzjc.zza(zzjsVar.zzb(i6));
        }
        this.zza.zzc(iZza2);
        while (i4 < zzjsVar.size()) {
            this.zza.zzb(zzjsVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzf = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzf += zzjc.zzf(list.get(i5).intValue());
            }
            this.zza.zzc(iZzf);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zzb(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzf2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZzf2 += zzjc.zzf(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZzf2);
        while (i4 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i3, List<Long> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzd = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzd += zzjc.zzd(list.get(i5).longValue());
            }
            this.zza.zzc(iZzd);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i4 < zzknVar.size()) {
                this.zza.zzb(i3, zzknVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzd2 = 0;
        for (int i6 = 0; i6 < zzknVar.size(); i6++) {
            iZzd2 += zzjc.zzd(zzknVar.zzb(i6));
        }
        this.zza.zzc(iZzd2);
        while (i4 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zza(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzg = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzg += zzjc.zzg(list.get(i5).intValue());
            }
            this.zza.zzc(iZzg);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zza(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzg2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZzg2 += zzjc.zzg(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZzg2);
        while (i4 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i3, List<Long> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zza(i3, list.get(i4).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZze = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZze += zzjc.zze(list.get(i5).longValue());
            }
            this.zza.zzc(iZze);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i4 < zzknVar.size()) {
                this.zza.zza(i3, zzknVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZze2 = 0;
        for (int i6 = 0; i6 < zzknVar.size(); i6++) {
            iZze2 += zzjc.zze(zzknVar.zzb(i6));
        }
        this.zza.zzc(iZze2);
        while (i4 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzk(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzh = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzh += zzjc.zzh(list.get(i5).intValue());
            }
            this.zza.zzc(iZzh);
            while (i4 < list.size()) {
                this.zza.zzk(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zzk(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzh2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZzh2 += zzjc.zzh(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZzh2);
        while (i4 < zzjwVar.size()) {
            this.zza.zzk(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i3, List<Long> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzh(i3, list.get(i4).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzf = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzf += zzjc.zzf(list.get(i5).longValue());
            }
            this.zza.zzc(iZzf);
            while (i4 < list.size()) {
                this.zza.zzh(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i4 < zzknVar.size()) {
                this.zza.zzh(i3, zzknVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzf2 = 0;
        for (int i6 = 0; i6 < zzknVar.size(); i6++) {
            iZzf2 += zzjc.zzf(zzknVar.zzb(i6));
        }
        this.zza.zzc(iZzf2);
        while (i4 < zzknVar.size()) {
            this.zza.zzh(zzknVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i3, List<Integer> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzd(i3, list.get(i4).intValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzj = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzj += zzjc.zzj(list.get(i5).intValue());
            }
            this.zza.zzc(iZzj);
            while (i4 < list.size()) {
                this.zza.zzc(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i4 < zzjwVar.size()) {
                this.zza.zzd(i3, zzjwVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzj2 = 0;
        for (int i6 = 0; i6 < zzjwVar.size(); i6++) {
            iZzj2 += zzjc.zzj(zzjwVar.zzb(i6));
        }
        this.zza.zzc(iZzj2);
        while (i4 < zzjwVar.size()) {
            this.zza.zzc(zzjwVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i3, List<Long> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i4 < list.size()) {
                    this.zza.zzb(i3, list.get(i4).longValue());
                    i4++;
                }
                return;
            }
            this.zza.zzc(i3, 2);
            int iZzg = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                iZzg += zzjc.zzg(list.get(i5).longValue());
            }
            this.zza.zzc(iZzg);
            while (i4 < list.size()) {
                this.zza.zzb(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i4 < zzknVar.size()) {
                this.zza.zzb(i3, zzknVar.zzb(i4));
                i4++;
            }
            return;
        }
        this.zza.zzc(i3, 2);
        int iZzg2 = 0;
        for (int i6 = 0; i6 < zzknVar.size(); i6++) {
            iZzg2 += zzjc.zzg(zzknVar.zzb(i6));
        }
        this.zza.zzc(iZzg2);
        while (i4 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i4));
            i4++;
        }
    }

    public static zzjf zza(zzjc zzjcVar) {
        zzjf zzjfVar = zzjcVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, boolean z2) {
        this.zza.zza(i3, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, List<Boolean> list, boolean z2) {
        int i4 = 0;
        if (!(list instanceof zzii)) {
            if (z2) {
                this.zza.zzc(i3, 2);
                int iZza = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    iZza += zzjc.zza(list.get(i5).booleanValue());
                }
                this.zza.zzc(iZza);
                while (i4 < list.size()) {
                    this.zza.zzb(list.get(i4).booleanValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                this.zza.zza(i3, list.get(i4).booleanValue());
                i4++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (z2) {
            this.zza.zzc(i3, 2);
            int iZza2 = 0;
            for (int i6 = 0; i6 < zziiVar.size(); i6++) {
                iZza2 += zzjc.zza(zziiVar.zzb(i6));
            }
            this.zza.zzc(iZza2);
            while (i4 < zziiVar.size()) {
                this.zza.zzb(zziiVar.zzb(i4));
                i4++;
            }
            return;
        }
        while (i4 < zziiVar.size()) {
            this.zza.zza(i3, zziiVar.zzb(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, int i4) {
        this.zza.zza(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i3, int i4) {
        this.zza.zza(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i3, int i4) {
        this.zza.zzk(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i3, int i4) {
        this.zza.zzd(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, long j3) {
        this.zza.zzb(i3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i3, long j3) {
        this.zza.zzb(i3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i3, long j3) {
        this.zza.zzh(i3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, Object obj, zzlu zzluVar) {
        this.zza.zza(i3, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, zzik zzikVar) {
        this.zza.zza(i3, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, List<?> list, zzlu zzluVar) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzb(i3, list.get(i4), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i3, int i4) {
        this.zza.zzb(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, List<zzik> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zza(i3, list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i3, long j3) {
        this.zza.zza(i3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i3) {
        this.zza.zzc(i3, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, double d3) {
        this.zza.zzb(i3, d3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i3, List<String> list) {
        int i4 = 0;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i4 < list.size()) {
                Object objZza = zzkjVar.zza(i4);
                if (objZza instanceof String) {
                    this.zza.zza(i3, (String) objZza);
                } else {
                    this.zza.zza(i3, (zzik) objZza);
                }
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zza(i3, list.get(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i3) {
        this.zza.zzc(i3, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, int i4) {
        this.zza.zzb(i3, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, long j3) {
        this.zza.zza(i3, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, float f3) {
        this.zza.zzb(i3, f3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, Object obj, zzlu zzluVar) {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i3, 3);
        zzluVar.zza((zzlc) obj, zzjcVar.zza);
        zzjcVar.zzc(i3, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, List<?> list, zzlu zzluVar) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zza(i3, list.get(i4), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i3, zzkt<K, V> zzktVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i3, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, Object obj) {
        if (obj instanceof zzik) {
            this.zza.zzb(i3, (zzik) obj);
        } else {
            this.zza.zza(i3, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i3, String str) {
        this.zza.zza(i3, str);
    }
}
