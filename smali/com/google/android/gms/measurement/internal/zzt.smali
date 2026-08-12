.class final Lcom/google/android/gms/measurement/internal/zzt;
.super Lcom/google/android/gms/measurement/internal/zznr;
.source "SourceFile"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private zzc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/gms/measurement/internal/zzv;",
            ">;"
        }
    .end annotation
.end field

.field private zzd:Ljava/lang/Long;

.field private zze:Ljava/lang/Long;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zznv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zznr;-><init>(Lcom/google/android/gms/measurement/internal/zznv;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final zza(Ljava/lang/Integer;)Lcom/google/android/gms/measurement/internal/zzv;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/zzv;

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzv;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzv;-><init>(Lcom/google/android/gms/measurement/internal/zzt;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzac;)V

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private final zza(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzo;",
            ">;)V"
        }
    .end annotation

    .line 160
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 161
    :cond_0
    new-instance v0, Landroidx/collection/a;

    invoke-direct {v0}, Landroidx/collection/a;-><init>()V

    .line 162
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfy$zzo;

    .line 163
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    move-result-object v2

    .line 164
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_2

    .line 165
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/zzal;->zzg(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 166
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    :cond_2
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 168
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 169
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v1

    const-string v2, "Skipping failed audience ID"

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 170
    :cond_4
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 171
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x1

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfo$zze;

    .line 172
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v8

    const/4 v9, 0x2

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(I)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    .line 173
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v8

    .line 174
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v8

    .line 175
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_3

    :cond_5
    move-object v10, v9

    .line 176
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v11

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zze()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lcom/google/android/gms/measurement/internal/zzgh;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 177
    const-string v12, "Evaluating filter. audience, filter, property"

    invoke-virtual {v8, v12, v4, v10, v11}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v8

    .line 179
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v8

    .line 180
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzns;->g_()Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Lcom/google/android/gms/internal/measurement/zzfo$zze;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "Filter definition"

    invoke-virtual {v8, v11, v10}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    :cond_6
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    move-result v8

    const/16 v10, 0x100

    if-le v8, v10, :cond_7

    goto :goto_4

    .line 182
    :cond_7
    new-instance v8, Lcom/google/android/gms/measurement/internal/zzz;

    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-direct {v8, p0, v9, v5, v7}, Lcom/google/android/gms/measurement/internal/zzz;-><init>(Lcom/google/android/gms/measurement/internal/zzt;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzfo$zze;)V

    .line 183
    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzd:Ljava/lang/Long;

    iget-object v10, p0, Lcom/google/android/gms/measurement/internal/zzt;->zze:Ljava/lang/Long;

    .line 184
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    move-result v7

    invoke-direct {p0, v5, v7}, Lcom/google/android/gms/measurement/internal/zzt;->zza(II)Z

    move-result v7

    .line 185
    invoke-virtual {v8, v9, v10, v1, v7}, Lcom/google/android/gms/measurement/internal/zzz;->zza(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/zzfy$zzo;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 186
    invoke-direct {p0, v4}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/measurement/internal/zzv;

    move-result-object v9

    .line 187
    invoke-virtual {v9, v8}, Lcom/google/android/gms/measurement/internal/zzv;->zza(Lcom/google/android/gms/measurement/internal/zzaa;)V

    goto/16 :goto_2

    .line 188
    :cond_8
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 189
    :cond_9
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v5

    .line 190
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 191
    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 192
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :cond_a
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 193
    const-string v8, "Invalid property filter ID. appId, id"

    invoke-virtual {v5, v8, v6, v7}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v7, 0x0

    :cond_b
    :goto_5
    if-nez v7, :cond_3

    .line 194
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_c
    :goto_6
    return-void
.end method

.method private final zza(Ljava/util/List;Z)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzf;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 121
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_6

    .line 122
    :cond_0
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzy;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/zzy;-><init>(Lcom/google/android/gms/measurement/internal/zzt;Lcom/google/android/gms/measurement/internal/zzac;)V

    .line 123
    new-instance v3, Landroidx/collection/a;

    invoke-direct {v3}, Landroidx/collection/a;-><init>()V

    .line 124
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 125
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 126
    invoke-virtual {v1, v6, v5}, Lcom/google/android/gms/measurement/internal/zzy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfy$zzf;)Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    move-result-object v10

    if-eqz v10, :cond_b

    .line 127
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v6

    iget-object v12, v0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v7

    .line 128
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v12, v8}, Lcom/google/android/gms/measurement/internal/zzal;->zzd(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzbb;

    move-result-object v8

    if-nez v8, :cond_1

    .line 129
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v8

    .line 130
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgo;->zzu()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v8

    .line 131
    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 132
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzja;->zzi()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v6

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 133
    const-string v7, "Event aggregate wasn\'t created during raw event logging. appId, event"

    invoke-virtual {v8, v7, v9, v6}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    new-instance v11, Lcom/google/android/gms/measurement/internal/zzbb;

    .line 135
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v13

    .line 136
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    move-result-wide v20

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v14, 0x1

    const-wide/16 v16, 0x1

    const-wide/16 v18, 0x1

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v11 .. v27}, Lcom/google/android/gms/measurement/internal/zzbb;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object/from16 v30, v1

    move-object/from16 v29, v3

    move-object v13, v11

    goto :goto_1

    .line 137
    :cond_1
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzbb;

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zza:Ljava/lang/String;

    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzb:Ljava/lang/String;

    iget-wide v5, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzc:J

    const-wide/16 v15, 0x1

    add-long/2addr v5, v15

    move-object/from16 v29, v3

    iget-wide v2, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzd:J

    add-long v17, v2, v15

    iget-wide v2, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zze:J

    add-long v19, v2, v15

    iget-wide v2, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzf:J

    move-object/from16 v30, v1

    move-wide/from16 v21, v2

    iget-wide v1, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzg:J

    iget-object v3, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzh:Ljava/lang/Long;

    iget-object v7, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzi:Ljava/lang/Long;

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzj:Ljava/lang/Long;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzbb;->zzk:Ljava/lang/Boolean;

    move-wide/from16 v23, v1

    move-object/from16 v25, v3

    move-wide v15, v5

    move-object/from16 v26, v7

    move-object/from16 v28, v8

    move-object/from16 v27, v9

    invoke-direct/range {v12 .. v28}, Lcom/google/android/gms/measurement/internal/zzbb;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object v13, v12

    .line 138
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v1

    invoke-virtual {v1, v13}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Lcom/google/android/gms/measurement/internal/zzbb;)V

    .line 139
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 140
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzja;->zze()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/measurement/internal/zzbh;->zzcy:Lcom/google/android/gms/measurement/internal/zzfz;

    const/4 v3, 0x0

    .line 141
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/zzag;->zzf(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfz;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-nez p2, :cond_2

    goto :goto_3

    :cond_2
    move-object v2, v3

    move-object/from16 v3, v29

    :goto_2
    move-object/from16 v1, v30

    goto/16 :goto_0

    :cond_3
    const/4 v3, 0x0

    .line 142
    :cond_4
    :goto_3
    iget-wide v11, v13, Lcom/google/android/gms/measurement/internal/zzbb;->zzc:J

    .line 143
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v29

    .line 144
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_5

    .line 145
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v5

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v5, v6, v1}, Lcom/google/android/gms/measurement/internal/zzal;->zzf(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 146
    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_5
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 148
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 149
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v7

    const-string v8, "Skipping failed audience ID"

    invoke-virtual {v7, v8, v6}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    .line 150
    :cond_7
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 151
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v7, 0x1

    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 152
    new-instance v8, Lcom/google/android/gms/measurement/internal/zzx;

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-direct {v8, v0, v9, v15, v7}, Lcom/google/android/gms/measurement/internal/zzx;-><init>(Lcom/google/android/gms/measurement/internal/zzt;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzfo$zzb;)V

    move-object v9, v7

    move-object v7, v8

    .line 153
    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzt;->zzd:Ljava/lang/Long;

    move-object v14, v9

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/zzt;->zze:Ljava/lang/Long;

    .line 154
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v14

    invoke-direct {v0, v15, v14}, Lcom/google/android/gms/measurement/internal/zzt;->zza(II)Z

    move-result v14

    .line 155
    invoke-virtual/range {v7 .. v14}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/zzfy$zzf;JLcom/google/android/gms/measurement/internal/zzbb;Z)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 156
    invoke-direct {v0, v6}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/measurement/internal/zzv;

    move-result-object v9

    .line 157
    invoke-virtual {v9, v7}, Lcom/google/android/gms/measurement/internal/zzv;->zza(Lcom/google/android/gms/measurement/internal/zzaa;)V

    move v7, v8

    goto :goto_5

    .line 158
    :cond_8
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v7, v8

    :cond_9
    if-nez v7, :cond_6

    .line 159
    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move-object v1, v3

    move-object v3, v2

    move-object v2, v1

    goto/16 :goto_2

    :cond_b
    move-object/from16 v31, v3

    move-object v3, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v3

    move-object v3, v2

    move-object/from16 v2, v31

    goto/16 :goto_0

    :cond_c
    :goto_6
    return-void
.end method

.method private final zza(II)Z
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/zzv;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 196
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/zzv;->zza(Lcom/google/android/gms/measurement/internal/zzv;)Ljava/util/BitSet;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method private final zzu()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzd;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzv;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Lcom/google/android/gms/measurement/internal/zzv;->zza(I)Lcom/google/android/gms/internal/measurement/zzfy$zzd;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd;->zzd()Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zznr;->zzal()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzt()V

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    new-instance v6, Landroid/content/ContentValues;

    .line 82
    .line 83
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v7, "app_id"

    .line 87
    .line 88
    invoke-virtual {v6, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v7, "audience_id"

    .line 92
    .line 93
    invoke-virtual {v6, v7, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 94
    .line 95
    .line 96
    const-string v2, "current_results"

    .line 97
    .line 98
    invoke-virtual {v6, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 99
    .line 100
    .line 101
    :try_start_0
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzal;->e_()Landroid/database/sqlite/SQLiteDatabase;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    const-string v3, "audience_filter_values"

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x5

    .line 109
    invoke-virtual {v2, v3, v7, v6, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    const-wide/16 v6, -0x1

    .line 114
    .line 115
    cmp-long v2, v2, v6

    .line 116
    .line 117
    if-nez v2, :cond_0

    .line 118
    .line 119
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzgo;->zzg()Lcom/google/android/gms/measurement/internal/zzgq;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-string v3, "Failed to insert filter results (got -1). appId"

    .line 128
    .line 129
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :catch_0
    move-exception v2

    .line 138
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzg()Lcom/google/android/gms/measurement/internal/zzgq;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "Error storing filter results. appId"

    .line 147
    .line 148
    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v3, v4, v5, v2}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_1
    return-object v0
.end method


# virtual methods
.method final zza(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzf;",
            ">;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzo;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzd;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 5
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method final zza(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzf;",
            ">;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzo;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfy$zzd;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p6

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    .line 9
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 10
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzb:Ljava/util/Set;

    .line 11
    new-instance v0, Landroidx/collection/a;

    invoke-direct {v0}, Landroidx/collection/a;-><init>()V

    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    move-object/from16 v0, p4

    .line 12
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzd:Ljava/lang/Long;

    move-object/from16 v0, p5

    .line 13
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zze:Ljava/lang/Long;

    .line 14
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v12, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 15
    const-string v3, "_s"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v12

    .line 16
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzja;->zze()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/measurement/internal/zzbh;->zzbp:Lcom/google/android/gms/measurement/internal/zzfz;

    .line 18
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzag;->zzf(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfz;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v14, 0x1

    goto :goto_1

    :cond_2
    move v14, v12

    .line 19
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzja;->zze()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/measurement/internal/zzbh;->zzbo:Lcom/google/android/gms/measurement/internal/zzfz;

    .line 21
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/zzag;->zzf(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfz;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v15, 0x1

    goto :goto_2

    :cond_3
    move v15, v12

    :goto_2
    if-eqz v2, :cond_4

    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zznr;->zzal()V

    .line 24
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzt()V

    .line 25
    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 27
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "current_session_count"

    invoke-virtual {v0, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 28
    :try_start_0
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzal;->e_()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    .line 29
    const-string v6, "events"

    const-string v7, "app_id = ?"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v0, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzgo;->zzg()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v3

    const-string v5, "Error resetting session-scoped event counts. appId"

    .line 32
    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 33
    invoke-virtual {v3, v5, v4, v0}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    :cond_4
    :goto_3
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    if-eqz v15, :cond_5

    if-eqz v14, :cond_5

    .line 35
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzal;->zzn(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 36
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/zzal;->zzm(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 37
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1f

    .line 38
    new-instance v4, Ljava/util/HashSet;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz v2, :cond_e

    .line 39
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    .line 40
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->zzh()Lcom/google/android/gms/measurement/internal/zzal;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzal;->zzo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 41
    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    new-instance v2, Landroidx/collection/a;

    invoke-direct {v2}, Landroidx/collection/a;-><init>()V

    .line 44
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_d

    .line 45
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 46
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 47
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v12, v16

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_6

    .line 48
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_7

    :cond_6
    move-object/from16 v16, v4

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    const/16 p5, 0x1

    goto/16 :goto_9

    :cond_7
    const/16 p5, 0x1

    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->g_()Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v13

    move-object/from16 v16, v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzi()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v13, v4, v12}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 50
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_c

    .line 51
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjt;->zzcd()Lcom/google/android/gms/internal/measurement/zzjt$zzb;

    move-result-object v13

    .line 52
    check-cast v13, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzb()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v13

    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v4

    .line 53
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzns;->g_()Lcom/google/android/gms/measurement/internal/zzoo;

    move-result-object v13

    move-object/from16 v17, v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzk()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v13, v4, v12}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 54
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzd()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v13

    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzd(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 55
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzh()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    check-cast v6, Lcom/google/android/gms/internal/measurement/zzfy$zze;

    .line 57
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zza()I

    move-result v18

    move-object/from16 v20, v7

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 58
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object/from16 v6, v19

    move-object/from16 v7, v20

    goto :goto_5

    :cond_9
    move-object/from16 v19, v6

    move-object/from16 v20, v7

    .line 59
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zza()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v6

    .line 60
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 61
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzj()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/zzfy$zzn;

    .line 63
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzb()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 64
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 65
    :cond_b
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzc()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v5

    .line 66
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 67
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzjt;

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    invoke-interface {v2, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    move-object/from16 v4, v16

    move-object/from16 v6, v19

    move-object/from16 v7, v20

    :goto_8
    const/4 v12, 0x0

    goto/16 :goto_4

    :cond_c
    move-object/from16 v4, v16

    goto :goto_8

    .line 68
    :goto_9
    invoke-interface {v2, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_d
    move-object/from16 v16, v4

    const/16 p5, 0x1

    move-object v12, v2

    goto :goto_a

    :cond_e
    move-object/from16 v16, v4

    const/16 p5, 0x1

    move-object v12, v3

    .line 69
    :goto_a
    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_b
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 70
    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    move-object v5, v4

    .line 71
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    move-object v6, v5

    .line 72
    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    move-object v7, v6

    .line 73
    new-instance v6, Landroidx/collection/a;

    invoke-direct {v6}, Landroidx/collection/a;-><init>()V

    if-eqz v7, :cond_12

    .line 74
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zza()I

    move-result v8

    if-nez v8, :cond_f

    goto :goto_f

    .line 75
    :cond_f
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzh()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/google/android/gms/internal/measurement/zzfy$zze;

    .line 76
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zzf()Z

    move-result v17

    if-eqz v17, :cond_11

    .line 77
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zza()I

    move-result v17

    move-object/from16 v18, v7

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 78
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zze()Z

    move-result v17

    if-eqz v17, :cond_10

    .line 79
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zzb()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    move-object/from16 v25, v16

    move-object/from16 v16, v8

    move-object/from16 v8, v25

    goto :goto_d

    :cond_10
    move-object/from16 v16, v8

    const/4 v8, 0x0

    .line 80
    :goto_d
    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_11
    move-object/from16 v18, v7

    move-object/from16 v16, v8

    :goto_e
    move-object/from16 v8, v16

    move-object/from16 v7, v18

    goto :goto_c

    :cond_12
    :goto_f
    move-object/from16 v18, v7

    .line 81
    new-instance v7, Landroidx/collection/a;

    invoke-direct {v7}, Landroidx/collection/a;-><init>()V

    if-eqz v18, :cond_15

    .line 82
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzc()I

    move-result v8

    if-nez v8, :cond_13

    goto :goto_12

    .line 83
    :cond_13
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzj()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_15

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v8

    move-object/from16 v8, v16

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfy$zzn;

    .line 84
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzf()Z

    move-result v16

    if-eqz v16, :cond_14

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza()I

    move-result v16

    if-lez v16, :cond_14

    .line 85
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzb()I

    move-result v16

    move-object/from16 v19, v12

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 86
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza()I

    move-result v16

    move-object/from16 v20, v13

    add-int/lit8 v13, v16, -0x1

    invoke-virtual {v8, v13}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza(I)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 87
    invoke-interface {v7, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :cond_14
    move-object/from16 v19, v12

    move-object/from16 v20, v13

    :goto_11
    move-object/from16 v8, v17

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    goto :goto_10

    :cond_15
    :goto_12
    move-object/from16 v19, v12

    move-object/from16 v20, v13

    if-eqz v18, :cond_18

    const/4 v8, 0x0

    .line 88
    :goto_13
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzd()I

    move-result v12

    shl-int/lit8 v12, v12, 0x6

    if-ge v8, v12, :cond_18

    .line 89
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzk()Ljava/util/List;

    move-result-object v12

    invoke-static {v12, v8}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Ljava/util/List;I)Z

    move-result v12

    if-eqz v12, :cond_16

    .line 90
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzja;->zzj()Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object v12

    .line 91
    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/zzgo;->zzp()Lcom/google/android/gms/measurement/internal/zzgq;

    move-result-object v12

    .line 92
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move/from16 v16, v14

    const-string v14, "Filter already evaluated. audience ID, filter ID"

    invoke-virtual {v12, v14, v2, v13}, Lcom/google/android/gms/measurement/internal/zzgq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    invoke-virtual {v5, v8}, Ljava/util/BitSet;->set(I)V

    .line 94
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzi()Ljava/util/List;

    move-result-object v12

    invoke-static {v12, v8}, Lcom/google/android/gms/measurement/internal/zzoo;->zza(Ljava/util/List;I)Z

    move-result v12

    if-eqz v12, :cond_17

    .line 95
    invoke-virtual {v4, v8}, Ljava/util/BitSet;->set(I)V

    goto :goto_14

    :cond_16
    move/from16 v16, v14

    .line 96
    :cond_17
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_14
    add-int/lit8 v8, v8, 0x1

    move/from16 v14, v16

    goto :goto_13

    :cond_18
    move/from16 v16, v14

    .line 97
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    if-eqz v15, :cond_1d

    if-eqz v16, :cond_1d

    .line 98
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    if-eqz v12, :cond_1d

    .line 99
    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/zzt;->zze:Ljava/lang/Long;

    if-eqz v13, :cond_1d

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzd:Ljava/lang/Long;

    if-nez v13, :cond_19

    goto :goto_16

    .line 100
    :cond_19
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_15
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 101
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v14

    move-object/from16 v17, v0

    .line 102
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zze:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    const-wide/16 v23, 0x3e8

    div-long v21, v21, v23

    .line 103
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 104
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzd:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    div-long v21, v21, v23

    .line 105
    :cond_1a
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 106
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v6, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    :cond_1b
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 108
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v7, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1c
    move-object/from16 v0, v17

    goto :goto_15

    :cond_1d
    :goto_16
    move-object/from16 v17, v0

    .line 109
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzv;

    move-object v12, v2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzt;->zza:Ljava/lang/String;

    move-object v13, v3

    move-object v3, v8

    const/4 v8, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/measurement/internal/zzv;-><init>(Lcom/google/android/gms/measurement/internal/zzt;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfy$zzm;Ljava/util/BitSet;Ljava/util/BitSet;Ljava/util/Map;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/zzac;)V

    .line 110
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzt;->zzc:Ljava/util/Map;

    invoke-interface {v2, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v13

    move/from16 v14, v16

    move-object/from16 v0, v17

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    goto/16 :goto_b

    :cond_1e
    :goto_17
    const/4 v12, 0x0

    goto :goto_18

    :cond_1f
    const/16 p5, 0x1

    goto :goto_17

    .line 111
    :goto_18
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 112
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzja;->zze()Lcom/google/android/gms/measurement/internal/zzag;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/measurement/internal/zzbh;->zzcy:Lcom/google/android/gms/measurement/internal/zzfz;

    .line 113
    invoke-virtual {v0, v12, v2}, Lcom/google/android/gms/measurement/internal/zzag;->zzf(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfz;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 114
    invoke-direct {v1, v9, v11}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/util/List;Z)V

    if-eqz v11, :cond_20

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 116
    :cond_20
    invoke-direct {v1, v10}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/util/List;)V

    .line 117
    invoke-direct {v1}, Lcom/google/android/gms/measurement/internal/zzt;->zzu()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_21
    move/from16 v2, p5

    .line 118
    invoke-direct {v1, v9, v2}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/util/List;Z)V

    .line 119
    invoke-direct {v1, v10}, Lcom/google/android/gms/measurement/internal/zzt;->zza(Ljava/util/List;)V

    .line 120
    invoke-direct {v1}, Lcom/google/android/gms/measurement/internal/zzt;->zzu()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final zzc()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
