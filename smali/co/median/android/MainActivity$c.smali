.class Lco/median/android/MainActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lco/median/android/MainActivity;


# direct methods
.method constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$c;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lco/median/android/MainActivity$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity$c;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$c;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/MainActivity;->r1()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$c;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lco/median/android/x;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lco/median/android/x;-><init>(Lco/median/android/MainActivity$c;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lco/median/android/MainActivity$c;->d:Lco/median/android/MainActivity;

    .line 12
    .line 13
    invoke-static {v0}, Lco/median/android/MainActivity;->X0(Lco/median/android/MainActivity;)Landroid/os/Handler;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lco/median/android/MainActivity$c;->d:Lco/median/android/MainActivity;

    .line 18
    .line 19
    invoke-static {v1}, Lco/median/android/MainActivity;->a1(Lco/median/android/MainActivity;)Ljava/lang/Runnable;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-wide/16 v2, 0x64

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method
