package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C0921a;
import androidx.collection.C0928h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzje;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzhl extends zznr implements zzai {
    final C0928h zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Set<String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzfr.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    zzhl(zznv zznvVar) {
        super(zznvVar);
        this.zzc = new C0921a();
        this.zzd = new C0921a();
        this.zze = new C0921a();
        this.zzf = new C0921a();
        this.zzh = new C0921a();
        this.zzj = new C0921a();
        this.zzk = new C0921a();
        this.zzl = new C0921a();
        this.zzi = new C0921a();
        this.zza = new zzho(this, 20);
        this.zzb = new zzhr(this);
    }

    private final void zzu(String str) throws Throwable {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzanVarZzf = zzh().zzf(str);
            if (zzanVarZzf != null) {
                zzfr.zzd.zza zzaVarZzcd = zza(str, zzanVarZzf.zza).zzcd();
                zza(str, zzaVarZzcd);
                this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())));
                this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
                zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
                this.zzj.put(str, zzaVarZzcd.zzc());
                this.zzk.put(str, zzanVarZzf.zzb);
                this.zzl.put(str, zzanVarZzf.zzc);
                return;
            }
            this.zzc.put(str, null);
            this.zze.put(str, null);
            this.zzd.put(str, null);
            this.zzf.put(str, null);
            this.zzh.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    /* JADX INFO: renamed from: g_ */
    public final /* bridge */ /* synthetic */ zzoo mo7261g_() {
        return super.mo7261g_();
    }

    final int zzb(String str, String str2) throws Throwable {
        Integer num;
        zzt();
        zzu(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    final boolean zzp(String str) throws Throwable {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    final long zza(String str) throws Throwable {
        String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZza);
        } catch (NumberFormatException e3) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzgo.zza(str), e3);
            return 0L;
        }
    }

    protected final zzfr.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzu(str);
        return this.zzh.get(str);
    }

    protected final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    protected final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    final String zzf(String str) {
        zzt();
        zzu(str);
        return this.zzj.get(str);
    }

    final Set<String> zzg(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str);
    }

    final SortedSet<String> zzh(String str) {
        zzt();
        zzu(str);
        TreeSet treeSet = new TreeSet();
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb != null) {
            Iterator<zzfr.zza.zzf> it = zzaVarZzb.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().zzb());
            }
        }
        return treeSet;
    }

    protected final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    public final boolean zzk(String str) {
        zzfr.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    final boolean zzl(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzm(String str) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        return zzaVarZzb == null || !zzaVarZzb.zzh() || zzaVarZzb.zzg();
    }

    final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    final boolean zzo(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
    }

    final boolean zzq(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    final boolean zzr(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    final boolean zzs(String str) throws Throwable {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    final boolean zzt(String str) throws Throwable {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("user_id");
    }

    final boolean zzd(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzu(str);
        if (zzl(str) && zzos.zzg(str2)) {
            return true;
        }
        if (zzn(str) && zzos.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    final zzje.zza zzb(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return null;
        }
        for (zzfr.zza.zzc zzcVar : zzaVarZzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    final boolean zzc(String str, zzje.zza zzaVar) throws Throwable {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return false;
        }
        Iterator<zzfr.zza.C2621zza> it = zzaVarZzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfr.zza.C2621zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfr.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzhl zzhlVar, String str) throws Throwable {
        zzhlVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzhlVar.zzk(str)) {
            return null;
        }
        if (zzhlVar.zzh.containsKey(str) && zzhlVar.zzh.get(str) != null) {
            zzhlVar.zza(str, zzhlVar.zzh.get(str));
        } else {
            zzhlVar.zzu(str);
        }
        return (com.google.android.gms.internal.measurement.zzb) zzhlVar.zza.snapshot().get(str);
    }

    final zzfr.zza zzb(String str) throws Throwable {
        zzt();
        zzu(str);
        zzfr.zzd zzdVarZzc = zzc(str);
        if (zzdVarZzc == null || !zzdVarZzc.zzo()) {
            return null;
        }
        return zzdVarZzc.zzd();
    }

    final boolean zzc(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzu(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final zzjh zza(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return zzjh.UNINITIALIZED;
        }
        for (zzfr.zza.C2621zza c2621zza : zzaVarZzb.zzf()) {
            if (zza(c2621zza.zzc()) == zzaVar) {
                int i3 = zzht.zzc[c2621zza.zzb().ordinal()];
                if (i3 == 1) {
                    return zzjh.DENIED;
                }
                if (i3 != 2) {
                    return zzjh.UNINITIALIZED;
                }
                return zzjh.GRANTED;
            }
        }
        return zzjh.UNINITIALIZED;
    }

    private static zzje.zza zza(zzfr.zza.zze zzeVar) {
        int i3 = zzht.zzb[zzeVar.ordinal()];
        if (i3 == 1) {
            return zzje.zza.AD_STORAGE;
        }
        if (i3 == 2) {
            return zzje.zza.ANALYTICS_STORAGE;
        }
        if (i3 == 3) {
            return zzje.zza.AD_USER_DATA;
        }
        if (i3 != 4) {
            return null;
        }
        return zzje.zza.AD_PERSONALIZATION;
    }

    private final zzfr.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfr.zzd.zzg();
        }
        try {
            zzfr.zzd zzdVar = (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) ((zzfr.zzd.zza) zzoo.zza(zzfr.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzkb e3) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e3);
            return zzfr.zzd.zzg();
        } catch (RuntimeException e4) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e4);
            return zzfr.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    public final String zza(String str, String str2) throws Throwable {
        zzt();
        zzu(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfr.zzd zzdVar) {
        C0921a c0921a = new C0921a();
        if (zzdVar != null) {
            for (zzfr.zzh zzhVar : zzdVar.zzn()) {
                c0921a.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return c0921a;
    }

    private final void zza(String str, zzfr.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C0921a c0921a = new C0921a();
        C0921a c0921a2 = new C0921a();
        C0921a c0921a3 = new C0921a();
        if (zzaVar != null) {
            Iterator<zzfr.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i3 = 0; i3 < zzaVar.zza(); i3++) {
                zzfr.zzc.zza zzaVarZzcd = zzaVar.zza(i3).zzcd();
                if (zzaVarZzcd.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String strZzb = zzaVarZzcd.zzb();
                    String strZzb2 = zzji.zzb(zzaVarZzcd.zzb());
                    if (!TextUtils.isEmpty(strZzb2)) {
                        zzaVarZzcd = zzaVarZzcd.zza(strZzb2);
                        zzaVar.zza(i3, zzaVarZzcd);
                    }
                    if (zzaVarZzcd.zze() && zzaVarZzcd.zzc()) {
                        c0921a.put(strZzb, Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzf() && zzaVarZzcd.zzd()) {
                        c0921a2.put(zzaVarZzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzg()) {
                        if (zzaVarZzcd.zza() >= 2 && zzaVarZzcd.zza() <= 65535) {
                            c0921a3.put(zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, c0921a);
        this.zzf.put(str, c0921a2);
        this.zzi.put(str, c0921a3);
    }

    private final void zza(final String str, zzfr.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgd.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhq(this.zza, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzhl zzhlVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzhl zzhlVar2 = zzhlVar;
                            String str3 = str2;
                            zzg zzgVarZze = zzhlVar2.zzh().zze(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (zzgVarZze != null) {
                                String strZzaf = zzgVarZze.zzaf();
                                if (strZzaf != null) {
                                    map.put("app_version", strZzaf);
                                }
                                map.put("app_version_int", Long.valueOf(zzgVarZze.zze()));
                                map.put("dynamite_version", Long.valueOf(zzgVarZze.zzo()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(this.zza.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgd.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza("EES program activity", it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    protected final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfr.zzd.zza zzaVarZzcd = zza(str, bArr).zzcd();
        if (zzaVarZzcd == null) {
            return false;
        }
        zza(str, zzaVarZzcd);
        zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        this.zzj.put(str, zzaVarZzcd.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())));
        zzh().zza(str, new ArrayList(zzaVarZzcd.zzd()));
        try {
            zzaVarZzcd.zzb();
            bArr = ((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai())).zzca();
        } catch (RuntimeException e3) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzgo.zza(str), e3);
        }
        zzal zzalVarZzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzalVarZzh.zzt();
        zzalVarZzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzalVarZzh.m7259e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzalVarZzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzgo.zza(str));
            }
        } catch (SQLiteException e4) {
            zzalVarZzh.zzj().zzg().zza("Error storing remote config. appId", zzgo.zza(str), e4);
        }
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzaVarZzcd.zzai()));
        return true;
    }
}
