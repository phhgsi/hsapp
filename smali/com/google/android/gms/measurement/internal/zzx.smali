.class final Lcom/google/android/gms/measurement/internal/zzx;
.super Lcom/google/android/gms/measurement/internal/zzaa;
.source "SourceFile"


# instance fields
.field private zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

.field private final synthetic zzh:Lcom/google/android/gms/measurement/internal/zzt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzt;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzfo$zzb;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/measurement/internal/zzaa;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method final zza()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v0

    return v0
.end method

.method final zza(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/zzfy$zzf;JLcom/google/android/gms/measurement/internal/zzbb;Z)Z
    .locals 14

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzja;->zze()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zza:Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/measurement/internal/zzbh;->zzbp:Lcom/google/android/gms/measurement/internal/zzfz;

    .line 4
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzag;->zzf(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfz;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object/from16 v3, p6

    .line 6
    iget-wide v3, v3, Lcom/google/android/gms/measurement/internal/zzbb;->zze:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p4

    .line 7
    :goto_1
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v5

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(I)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    .line 8
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v5

    .line 9
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v5

    iget v7, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zzb:I

    .line 10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 11
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 12
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzf()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 13
    const-string v10, "Evaluating filter. audience, filter, event"

    invoke-virtual {v5, v10, v7, v8, v9}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v5

    .line 15
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v5

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 16
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzns;->g_()Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v7

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Lcom/google/android/gms/internal/measurement/zzfo$zzb;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Filter definition"

    invoke-virtual {v5, v8, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    :cond_3
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    move-result v5

    if-eqz v5, :cond_2b

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v5

    const/16 v7, 0x100

    if-le v5, v7, :cond_4

    goto/16 :goto_f

    .line 18
    :cond_4
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzh()Z

    move-result v5

    .line 19
    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    move-result v7

    .line 20
    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    move-result v8

    if-nez v5, :cond_6

    if-nez v7, :cond_6

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    move v5, v1

    goto :goto_4

    :cond_6
    :goto_3
    move v5, v2

    :goto_4
    if-eqz p7, :cond_8

    if-nez v5, :cond_8

    .line 21
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zzb:I

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 25
    :cond_7
    const-string v1, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, v1, v0, v6}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2

    .line 26
    :cond_8
    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 27
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v8

    .line 28
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    move-result v9

    if-eqz v9, :cond_a

    .line 29
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zze()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    move-result-object v9

    invoke-static {v3, v4, v9}, Lcom/google/android/gms/measurement/internal/zzaa;->zza(JLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_9

    goto/16 :goto_b

    .line 30
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_a

    .line 31
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_b

    .line 32
    :cond_a
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 33
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzg()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 34
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_b

    .line 35
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 37
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 38
    const-string v7, "null or empty param name in filter. event"

    invoke-virtual {v3, v7, v4}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 39
    :cond_b
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 40
    :cond_c
    new-instance v4, Landroidx/collection/a;

    invoke-direct {v4}, Landroidx/collection/a;-><init>()V

    .line 41
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzh()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_d
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfy$zzh;

    .line 42
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 43
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzl()Z

    move-result v11

    if-eqz v11, :cond_f

    .line 44
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzl()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzd()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    goto :goto_7

    :cond_e
    move-object v10, v6

    :goto_7
    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 45
    :cond_f
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzj()Z

    move-result v11

    if-eqz v11, :cond_11

    .line 46
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzj()Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zza()D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    goto :goto_8

    :cond_10
    move-object v10, v6

    .line 47
    :goto_8
    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 48
    :cond_11
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzn()Z

    move-result v11

    if-eqz v11, :cond_12

    .line 49
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzh()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 50
    :cond_12
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 51
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 52
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 53
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 54
    const-string v8, "Unknown value for param. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 55
    :cond_13
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzg()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 56
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzg()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzf()Z

    move-result v9

    if-eqz v9, :cond_15

    move v9, v2

    goto :goto_9

    :cond_15
    move v9, v1

    .line 57
    :goto_9
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    move-result-object v10

    .line 58
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_16

    .line 59
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 60
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 61
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 62
    const-string v7, "Event has empty param name. event"

    invoke-virtual {v3, v7, v4}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 63
    :cond_16
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    .line 64
    instance-of v12, v11, Ljava/lang/Long;

    if-eqz v12, :cond_19

    .line 65
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    move-result v12

    if-nez v12, :cond_17

    .line 66
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 68
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 69
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 70
    const-string v8, "No number filter for long param. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 71
    :cond_17
    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    move-result-object v7

    invoke-static {v10, v11, v7}, Lcom/google/android/gms/measurement/internal/zzaa;->zza(JLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    move-result-object v7

    if-nez v7, :cond_18

    goto/16 :goto_b

    .line 72
    :cond_18
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v9, :cond_14

    .line 73
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_b

    .line 74
    :cond_19
    instance-of v12, v11, Ljava/lang/Double;

    if-eqz v12, :cond_1c

    .line 75
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    move-result v12

    if-nez v12, :cond_1a

    .line 76
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 77
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 78
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 79
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 80
    const-string v8, "No number filter for double param. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 81
    :cond_1a
    check-cast v11, Ljava/lang/Double;

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    move-result-object v7

    invoke-static {v10, v11, v7}, Lcom/google/android/gms/measurement/internal/zzaa;->zza(DLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    move-result-object v7

    if-nez v7, :cond_1b

    goto/16 :goto_b

    .line 82
    :cond_1b
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v9, :cond_14

    .line 83
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_b

    .line 84
    :cond_1c
    instance-of v12, v11, Ljava/lang/String;

    if-eqz v12, :cond_21

    .line 85
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzj()Z

    move-result v12

    if-eqz v12, :cond_1d

    .line 86
    check-cast v11, Ljava/lang/String;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzd()Lcom/google/android/gms/internal/measurement/zzfo$zzf;

    move-result-object v7

    iget-object v10, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v10

    invoke-static {v11, v7, v10}, Lcom/google/android/gms/measurement/internal/zzaa;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfo$zzf;Lcom/google/android/gms/measurement/internal/zzgo;)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_a

    .line 87
    :cond_1d
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    move-result v12

    if-eqz v12, :cond_20

    .line 88
    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/zzoo;->zzb(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1f

    .line 89
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/google/android/gms/measurement/internal/zzaa;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    move-result-object v7

    :goto_a
    if-nez v7, :cond_1e

    goto/16 :goto_b

    .line 90
    :cond_1e
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-ne v7, v9, :cond_14

    .line 91
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_b

    .line 92
    :cond_1f
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 93
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 94
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 95
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 96
    const-string v8, "Invalid param value for number filter. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    .line 97
    :cond_20
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 98
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 99
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 100
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 101
    const-string v8, "No filter for String param. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    :cond_21
    if-nez v11, :cond_22

    .line 102
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 103
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 104
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 105
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 106
    const-string v7, "Missing param for filter. event, param"

    invoke-virtual {v3, v7, v4, v6}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_b

    .line 108
    :cond_22
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 109
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 110
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    .line 111
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 112
    const-string v8, "Unknown param type. event, param"

    invoke-virtual {v3, v8, v4, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_b

    .line 113
    :cond_23
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    :goto_b
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    if-nez v6, :cond_24

    const-string v4, "null"

    goto :goto_c

    :cond_24
    move-object v4, v6

    :goto_c
    const-string v7, "Event filter result"

    invoke-virtual {v3, v7, v4}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v6, :cond_25

    return v1

    .line 115
    :cond_25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zzc:Ljava/lang/Boolean;

    .line 116
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_26

    return v2

    .line 117
    :cond_26
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zzd:Ljava/lang/Boolean;

    if-eqz v5, :cond_2a

    .line 118
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzk()Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 119
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 120
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    move-result v3

    if-eqz v3, :cond_28

    if-eqz v0, :cond_27

    .line 121
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_d

    :cond_27
    move-object p1, v1

    .line 122
    :goto_d
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zzf:Ljava/lang/Long;

    goto :goto_e

    :cond_28
    if-eqz v0, :cond_29

    .line 123
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    move-result p1

    if-eqz p1, :cond_29

    move-object/from16 v1, p2

    .line 124
    :cond_29
    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zze:Ljava/lang/Long;

    :cond_2a
    :goto_e
    return v2

    .line 125
    :cond_2b
    :goto_f
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzh:Lcom/google/android/gms/measurement/internal/zzt;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzaa;->zza:Ljava/lang/String;

    .line 127
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 128
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    move-result v2

    if-eqz v2, :cond_2c

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :cond_2c
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 129
    const-string v3, "Invalid event filter ID. appId, id"

    invoke-virtual {p1, v3, v0, v2}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1
.end method

.method final zzb()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzx;->zzg:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method final zzc()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
