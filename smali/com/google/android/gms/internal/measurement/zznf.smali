.class public final Lcom/google/android/gms/internal/measurement/zznf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/k;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zznf;


# instance fields
.field private final zzb:Li1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li1/k;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zznf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zznf;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/zznf;->zza:Lcom/google/android/gms/internal/measurement/zznf;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/measurement/zznh;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zznh;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li1/l;->b(Ljava/lang/Object;)Li1/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zznf;->zzb:Li1/k;

    .line 14
    .line 15
    return-void
.end method

.method public static zza()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zznf;->zza:Lcom/google/android/gms/internal/measurement/zznf;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zznf;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzne;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzne;->zza()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zznf;->zzb:Li1/k;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/k;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzne;

    .line 8
    .line 9
    return-object v0
.end method
