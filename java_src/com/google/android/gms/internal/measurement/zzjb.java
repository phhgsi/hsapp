package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzjb implements zzlr {
    private final zziw zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjb(zziw zziwVar) {
        zziw zziwVar2 = (zziw) zzjv.zza(zziwVar, "input");
        this.zza = zziwVar2;
        zziwVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final double zza() throws zzke {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final float zzb() throws zzke {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzc() {
        int i3 = this.zzd;
        if (i3 != 0) {
            this.zzb = i3;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i4 = this.zzb;
        return (i4 == 0 || i4 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zze() throws zzke {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzf() throws zzke {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzg() throws zzke {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzh() throws zzke {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzi() throws zzke {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzj() throws zzke {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzk() throws zzke {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzl() throws zzke {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzm() throws zzke {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzn() throws zzke {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final long zzo() throws zzke {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final zzik zzp() throws zzke {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final String zzq() throws zzke {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final String zzr() throws zzke {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzs() throws zzke {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzt() {
        int i3;
        if (this.zza.zzt() || (i3 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i3);
    }

    private final <T> void zzd(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws zzkb {
        int iZzj = this.zza.zzj();
        zziw zziwVar = this.zza;
        if (zziwVar.zza >= zziwVar.zzb) {
            throw zzkb.zzh();
        }
        int iZzb = zziwVar.zzb(iZzj);
        this.zza.zza++;
        zzluVar.zza(t2, this, zzjgVar);
        this.zza.zzc(0);
        r5.zza--;
        this.zza.zzd(iZzb);
    }

    public static zzjb zza(zziw zziwVar) {
        zzjb zzjbVar = zziwVar.zzc;
        return zzjbVar != null ? zzjbVar : new zzjb(zziwVar);
    }

    private final <T> T zzb(zzlu<T> zzluVar, zzjg zzjgVar) throws zzkb {
        T tZza = zzluVar.zza();
        zzd(tZza, zzluVar, zzjgVar);
        zzluVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zze(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzjwVar.zzd(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i3 == 5) {
                do {
                    zzjwVar.zzd(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i4 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzf(List<Long> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzknVar.zza(this.zza.zzk());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzknVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzg(List<Float> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjs) {
            zzjs zzjsVar = (zzjs) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzjsVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i3 == 5) {
                do {
                    zzjsVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i4 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzh(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzjwVar.zzd(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzjwVar.zzd(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzi(List<Long> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzknVar.zza(this.zza.zzl());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzknVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzj(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzjwVar.zzd(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i3 == 5) {
                do {
                    zzjwVar.zzd(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i4 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzk(List<Long> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzknVar.zza(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzknVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzl(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzjwVar.zzd(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzjwVar.zzd(this.zza.zzh());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzm(List<Long> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzknVar.zza(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzknVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzn(List<String> list) throws zzke {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzo(List<String> list) throws zzke {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzp(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzjwVar.zzd(this.zza.zzj());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzjwVar.zzd(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzq(List<Long> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzknVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzknVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    private final Object zza(zzms zzmsVar, Class<?> cls, zzjg zzjgVar) throws zzke {
        switch (zzja.zza[zzmsVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzlq.zza().zza((Class) cls), zzjgVar);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t2, zzlu<T> zzluVar, zzjg zzjgVar) {
        int i3 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzluVar.zza(t2, this, zzjgVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzkb.zzg();
            }
        } finally {
            this.zzc = i3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zzb(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws zzkb {
        zzb(2);
        zzd(t2, zzluVar, zzjgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzb(List<zzik> list) throws zzke {
        int iZzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzd(List<Integer> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zzjwVar.zzd(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzjwVar.zzd(this.zza.zzd());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zzb(List<T> list, zzlu<T> zzluVar, zzjg zzjgVar) throws zzke {
        int iZzi;
        int i3 = this.zzb;
        if ((i3 & 7) == 2) {
            do {
                list.add(zzb(zzluVar, zzjgVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i3);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzc(List<Double> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzje) {
            zzje zzjeVar = (zzje) list;
            int i3 = this.zzb & 7;
            if (i3 == 1) {
                do {
                    zzjeVar.zza(this.zza.zza());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzj = this.zza.zzj();
                zzd(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    zzjeVar.zza(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzj2 = this.zza.zzj();
            zzd(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    private final void zzb(int i3) throws zzke {
        if ((this.zzb & 7) != i3) {
            throw zzkb.zza();
        }
    }

    private final <T> T zza(zzlu<T> zzluVar, zzjg zzjgVar) {
        T tZza = zzluVar.zza();
        zzc(tZza, zzluVar, zzjgVar);
        zzluVar.zzd(tZza);
        return tZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final <T> void zza(T t2, zzlu<T> zzluVar, zzjg zzjgVar) throws zzke {
        zzb(3);
        zzc(t2, zzluVar, zzjgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zza(List<Boolean> list) throws zzkb {
        int iZzi;
        int iZzi2;
        if (list instanceof zzii) {
            zzii zziiVar = (zzii) list;
            int i3 = this.zzb & 7;
            if (i3 == 0) {
                do {
                    zziiVar.zza(this.zza.zzu());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            if (i3 == 2) {
                int iZzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zziiVar.zza(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zza(iZzc);
                return;
            }
            throw zzkb.zza();
        }
        int i4 = this.zzb & 7;
        if (i4 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        if (i4 == 2) {
            int iZzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc2);
            zza(iZzc2);
            return;
        }
        throw zzkb.zza();
    }

    private static void zzd(int i3) throws zzkb {
        if ((i3 & 7) != 0) {
            throw zzkb.zzg();
        }
    }

    private static void zzc(int i3) throws zzkb {
        if ((i3 & 3) != 0) {
            throw zzkb.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    @Deprecated
    public final <T> void zza(List<T> list, zzlu<T> zzluVar, zzjg zzjgVar) throws zzke {
        int iZzi;
        int i3 = this.zzb;
        if ((i3 & 7) == 3) {
            do {
                list.add(zza(zzluVar, zzjgVar));
                if (this.zza.zzt() || this.zzd != 0) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == i3);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r7.zza.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzkt<K, V> r9, com.google.android.gms.internal.measurement.zzjg r10) throws com.google.android.gms.internal.measurement.zzke {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.measurement.zziw r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.measurement.zziw r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L39
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5d
            com.google.android.gms.internal.measurement.zziw r5 = r7.zza     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L48
            if (r4 == r0) goto L3b
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzkb r4 = new com.google.android.gms.internal.measurement.zzkb     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            throw r4     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
        L39:
            r8 = move-exception
            goto L66
        L3b:
            com.google.android.gms.internal.measurement.zzms r4 = r9.zzc     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            V r5 = r9.zzd     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            goto L14
        L48:
            com.google.android.gms.internal.measurement.zzms r4 = r9.zza     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzke -> L50
            goto L14
        L50:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L57
            goto L14
        L57:
            com.google.android.gms.internal.measurement.zzkb r8 = new com.google.android.gms.internal.measurement.zzkb     // Catch: java.lang.Throwable -> L39
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Throwable -> L39
        L5d:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.zziw r8 = r7.zza
            r8.zzd(r1)
            return
        L66:
            com.google.android.gms.internal.measurement.zziw r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjb.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkt, com.google.android.gms.internal.measurement.zzjg):void");
    }

    private final void zza(List<String> list, boolean z2) throws zzke {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzkj) && !z2) {
                zzkj zzkjVar = (zzkj) list;
                do {
                    zzkjVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi2 = this.zza.zzi();
                    }
                } while (iZzi2 == this.zzb);
                this.zzd = iZzi2;
                return;
            }
            do {
                list.add(z2 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        throw zzkb.zza();
    }

    private final void zza(int i3) throws zzkb {
        if (this.zza.zzc() != i3) {
            throw zzkb.zzi();
        }
    }
}
