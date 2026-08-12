.class Lco/median/android/MainActivity$i;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method private constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lco/median/android/MainActivity$i;->a:Lco/median/android/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lco/median/android/MainActivity;Lm0/N0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity$i;-><init>(Lco/median/android/MainActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lco/median/android/MainActivity$i;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lco/median/android/MainActivity;->h1(Lco/median/android/MainActivity;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lco/median/android/MainActivity$i;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-static {p1}, Lco/median/android/MainActivity;->W0(Lco/median/android/MainActivity;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lco/median/android/MainActivity$i;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    invoke-static {p1}, Lco/median/android/MainActivity;->W0(Lco/median/android/MainActivity;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p1, p2}, Lco/median/android/MainActivity;->i1(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
