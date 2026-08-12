.class public final synthetic Lm0/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/G0;->d:Lco/median/android/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/G0;->d:Lco/median/android/MainActivity;

    invoke-static {v0}, Lco/median/android/MainActivity;->S0(Lco/median/android/MainActivity;)V

    return-void
.end method
