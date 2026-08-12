.class public Lco/median/android/MainActivity$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "l"
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$l;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lco/median/android/MainActivity$l;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity$l;->lambda$onReadyState$0(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onReadyState$0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$l;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lco/median/android/MainActivity;->e1(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReadyState(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$l;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lm0/K0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lm0/K0;-><init>(Lco/median/android/MainActivity$l;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
