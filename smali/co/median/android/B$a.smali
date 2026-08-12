.class Lco/median/android/B$a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/B;->q(Landroid/webkit/WebView;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/B;


# direct methods
.method constructor <init>(Lco/median/android/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/B$a;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lco/median/android/B$a;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-static {p1}, Lco/median/android/B;->i(Lco/median/android/B;)Lco/median/android/MainActivity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->R2(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Landroid/content/Intent;

    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/B$a;->a:Lco/median/android/B;

    .line 16
    .line 17
    invoke-static {v0}, Lco/median/android/B;->i(Lco/median/android/B;)Lco/median/android/MainActivity;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-class v1, Lco/median/android/MainActivity;

    .line 26
    .line 27
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "isRoot"

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    const-string v0, "url"

    .line 37
    .line 38
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    const-string p2, "ignoreInterceptMaxWindows"

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lco/median/android/B$a;->a:Lco/median/android/B;

    .line 48
    .line 49
    invoke-static {p2}, Lco/median/android/B;->i(Lco/median/android/B;)Lco/median/android/MainActivity;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/16 v0, 0x190

    .line 54
    .line 55
    invoke-virtual {p2, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void
.end method
