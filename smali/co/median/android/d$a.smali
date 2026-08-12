.class Lco/median/android/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/d;


# direct methods
.method constructor <init>(Lco/median/android/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    check-cast p2, Lco/median/android/DownloadService$a;

    .line 2
    .line 3
    iget-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 4
    .line 5
    invoke-virtual {p2}, Lco/median/android/DownloadService$a;->a()Lco/median/android/DownloadService;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p1, p2}, Lco/median/android/d;->h(Lco/median/android/d;Lco/median/android/DownloadService;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 13
    .line 14
    invoke-static {p1}, Lco/median/android/d;->g(Lco/median/android/d;)Lco/median/android/DownloadService;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lco/median/android/DownloadService;->g(Lco/median/android/d;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-static {p1, p2}, Lco/median/android/d;->i(Lco/median/android/d;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lco/median/android/d;->h(Lco/median/android/d;Lco/median/android/DownloadService;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lco/median/android/d$a;->a:Lco/median/android/d;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0}, Lco/median/android/d;->i(Lco/median/android/d;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
