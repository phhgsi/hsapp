.class public final synthetic Lm0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/l;


# instance fields
.field public final synthetic d:Lco/median/android/t;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a0;->d:Lco/median/android/t;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/a0;->d:Lco/median/android/t;

    check-cast p1, Lcom/google/android/gms/location/LocationSettingsResponse;

    invoke-static {v0, p1}, Lco/median/android/t;->e(Lco/median/android/t;Lcom/google/android/gms/location/LocationSettingsResponse;)LL1/t;

    move-result-object p1

    return-object p1
.end method
