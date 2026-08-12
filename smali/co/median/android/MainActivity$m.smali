.class public Lco/median/android/MainActivity$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "m"
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lco/median/android/MainActivity$m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity$m;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lco/median/android/MainActivity$m;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity$m;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string p2, "OK"

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, p2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private synthetic d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onUserLoggedIn(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-static {}, Lco/median/android/MainActivity;->k1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "User logged in: "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    const-string v1, "_median_push"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "fcm_token"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    iget-object v1, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 52
    .line 53
    invoke-static {v1, v0, p1}, Lco/median/android/MainActivity;->j1(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public showDialog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lm0/L0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lm0/L0;-><init>(Lco/median/android/MainActivity$m;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showToast(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$m;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lm0/M0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lm0/M0;-><init>(Lco/median/android/MainActivity$m;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
