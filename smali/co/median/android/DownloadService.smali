.class public Lco/median/android/DownloadService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/DownloadService$a;,
        Lco/median/android/DownloadService$b;,
        Lco/median/android/DownloadService$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Lco/median/android/d;

.field private final c:Ljava/util/Map;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lco/median/android/DownloadService;->a:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lco/median/android/DownloadService;->c:Ljava/util/Map;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lco/median/android/DownloadService;->d:I

    .line 24
    .line 25
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/DownloadService;)I
    .locals 0

    .line 1
    iget p0, p0, Lco/median/android/DownloadService;->d:I

    return p0
.end method

.method static bridge synthetic b(Lco/median/android/DownloadService;)Lco/median/android/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/DownloadService;->b:Lco/median/android/d;

    return-object p0
.end method

.method static bridge synthetic c(Lco/median/android/DownloadService;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/DownloadService;->a:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic d(Lco/median/android/DownloadService;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/DownloadService;->e:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic e(Lco/median/android/DownloadService;I)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/DownloadService;->d:I

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/DownloadService;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lco/median/android/DownloadService$c;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lco/median/android/DownloadService$c;->i()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lco/median/android/DownloadService$c;->c()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public g(Lco/median/android/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/DownloadService;->b:Lco/median/android/d;

    .line 2
    .line 3
    return-void
.end method

.method public h(Lco/median/android/d$e;Lco/median/android/d$d;Lco/median/android/DownloadService$b;)V
    .locals 8

    .line 1
    iget-object v1, p1, Lco/median/android/d$e;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p1, Lco/median/android/d$e;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p1, Lco/median/android/d$e;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v4, p1, Lco/median/android/d$e;->d:Z

    .line 8
    .line 9
    iget-boolean v5, p1, Lco/median/android/d$e;->e:Z

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    move-object v6, p2

    .line 13
    move-object v7, p3

    .line 14
    invoke-virtual/range {v0 .. v7}, Lco/median/android/DownloadService;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLco/median/android/d$d;Lco/median/android/DownloadService$b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLco/median/android/d$d;Lco/median/android/DownloadService$b;)V
    .locals 9

    .line 1
    new-instance v0, Lco/median/android/DownloadService$c;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    move v6, p5

    .line 9
    move-object v7, p6

    .line 10
    move-object/from16 v8, p7

    .line 11
    .line 12
    invoke-direct/range {v0 .. v8}, Lco/median/android/DownloadService$c;-><init>(Lco/median/android/DownloadService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLco/median/android/d$d;Lco/median/android/DownloadService$b;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lco/median/android/DownloadService;->c:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v0}, Lco/median/android/DownloadService$c;->h()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lco/median/android/DownloadService$c;->l()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    new-instance p1, Lco/median/android/DownloadService$a;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lco/median/android/DownloadService$a;-><init>(Lco/median/android/DownloadService;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lo0/a;->z:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lco/median/android/DownloadService;->e:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string p3, "action_cancel_download"

    .line 6
    .line 7
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const-string p2, "download_id"

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Lco/median/android/DownloadService;->f(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p1, 0x2

    .line 24
    return p1
.end method
