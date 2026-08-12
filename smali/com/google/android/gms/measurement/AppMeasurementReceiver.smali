.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super LV/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/zzhj$zza;


# instance fields
.field private zza:Lcom/google/android/gms/measurement/internal/zzhj;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LV/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final doGoAsync()Landroid/content/BroadcastReceiver$PendingResult;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final doStartService(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LV/a;->startWakefulService(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->zza:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzhj;-><init>(Lcom/google/android/gms/measurement/internal/zzhj$zza;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->zza:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->zza:Lcom/google/android/gms/measurement/internal/zzhj;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/zzhj;->zza(Landroid/content/Context;Landroid/content/Intent;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
