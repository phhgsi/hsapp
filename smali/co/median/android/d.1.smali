.class public Lco/median/android/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/d$d;,
        Lco/median/android/d$e;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/String; = "co.median.android.d"

.field private static k:Landroid/net/Uri;


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Lco/median/android/d$d;

.field private final c:Lb/b;

.field private d:Lco/median/android/B;

.field private e:Ljava/lang/String;

.field private f:Lco/median/android/DownloadService;

.field private g:Z

.field private h:Lco/median/android/d$e;

.field private final i:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lco/median/android/MainActivity;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/d;->g:Z

    .line 6
    .line 7
    new-instance v0, Lco/median/android/d$a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lco/median/android/d$a;-><init>(Lco/median/android/d;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lco/median/android/d;->i:Landroid/content/ServiceConnection;

    .line 13
    .line 14
    iput-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, Lo0/a;->V0:Lq0/d;

    .line 21
    .line 22
    invoke-virtual {v1}, Lq0/d;->a()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x1c

    .line 31
    .line 32
    if-le v2, v3, :cond_0

    .line 33
    .line 34
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 35
    .line 36
    iput-object v1, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Lq0/d;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 46
    .line 47
    iput-object v1, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object v1, Lco/median/android/d$d;->e:Lco/median/android/d$d;

    .line 51
    .line 52
    iput-object v1, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object v1, Lco/median/android/d$d;->e:Lco/median/android/d$d;

    .line 56
    .line 57
    iput-object v1, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 58
    .line 59
    :goto_0
    new-instance v1, Landroid/content/Intent;

    .line 60
    .line 61
    const-class v2, Lco/median/android/DownloadService;

    .line 62
    .line 63
    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {p1, v1, v0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 68
    .line 69
    .line 70
    new-instance v0, Lc/b;

    .line 71
    .line 72
    invoke-direct {v0}, Lc/b;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lm0/t;

    .line 76
    .line 77
    invoke-direct {v1, p0, p1}, Lm0/t;-><init>(Lco/median/android/d;Lco/median/android/MainActivity;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lco/median/android/d;->c:Lb/b;

    .line 85
    .line 86
    return-void
.end method

.method private static B(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Landroid/app/Activity;

    .line 3
    .line 4
    new-instance v1, Lm0/u;

    .line 5
    .line 6
    invoke-direct {v1, p0, p1, p2}, Lm0/u;-><init>(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "success"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string v1, "error"

    .line 20
    .line 21
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1, v0}, Lco/median/android/d;->B(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    :goto_0
    return-void
.end method

.method public static D(Lo0/g;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "success"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1, v0}, Lco/median/android/d;->B(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    :goto_0
    return-void
.end method

.method private F(Lco/median/android/d$e;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v0, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 10
    .line 11
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 16
    .line 17
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iput-object p1, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 26
    .line 27
    iget-object p1, p0, Lco/median/android/d;->c:Lb/b;

    .line 28
    .line 29
    filled-new-array {v1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Lb/b;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_1
    return v2
.end method

.method private G(Lco/median/android/d$e;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/d;->f:Lco/median/android/DownloadService;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 4
    .line 5
    new-instance v2, Lco/median/android/d$c;

    .line 6
    .line 7
    invoke-direct {v2, p0, p2}, Lco/median/android/d$c;-><init>(Lco/median/android/d;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1, v2}, Lco/median/android/DownloadService;->h(Lco/median/android/d$e;Lco/median/android/d$d;Lco/median/android/DownloadService$b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lco/median/android/d;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lco/median/android/d;->j:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p3, Ljava/lang/Exception;

    .line 12
    .line 13
    const-string p4, "DownloadService not bound."

    .line 14
    .line 15
    invoke-direct {p3, p4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p4, "verifyAndStartDownload: Unable to start download."

    .line 19
    .line 20
    invoke-virtual {p1, p2, p4, p3}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Lco/median/android/d$e;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v3, p3

    .line 30
    move v4, p4

    .line 31
    move v5, p5

    .line 32
    move-object v7, p6

    .line 33
    invoke-direct/range {v0 .. v7}, Lco/median/android/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0}, Lco/median/android/d;->F(Lco/median/android/d$e;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-direct {p0, v0, v7}, Lco/median/android/d;->G(Lco/median/android/d$e;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static J(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const p2, 0x10000001

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    sput-object p1, Lco/median/android/d;->k:Landroid/net/Uri;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p0

    .line 26
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object p2, Lco/median/android/d;->j:Ljava/lang/String;

    .line 31
    .line 32
    const-string p3, "viewFile: Exception:"

    .line 33
    .line 34
    invoke-virtual {p1, p2, p3, p0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const p2, 0x7f120069

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance p2, Lm0/x;

    .line 50
    .line 51
    invoke-direct {p2, p0, p1}, Lm0/x;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    :goto_0
    return-void
.end method

.method public static synthetic a(Lo0/g;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lo0/g;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(Lco/median/android/d;Lco/median/android/MainActivity;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/d;->z(Lco/median/android/MainActivity;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lco/median/android/d;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/d;->x(ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lco/median/android/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/d;->y(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method static bridge synthetic f(Lco/median/android/d;)Lco/median/android/MainActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    return-object p0
.end method

.method static bridge synthetic g(Lco/median/android/d;)Lco/median/android/DownloadService;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/d;->f:Lco/median/android/DownloadService;

    return-object p0
.end method

.method static bridge synthetic h(Lco/median/android/d;Lco/median/android/DownloadService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/d;->f:Lco/median/android/DownloadService;

    return-void
.end method

.method static bridge synthetic i(Lco/median/android/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/d;->g:Z

    return-void
.end method

.method private j(Landroid/net/Uri;)V
    .locals 2

    .line 1
    sget-object v0, Lco/median/android/d;->j:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "addFileToGallery: Adding to Albums . . ."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/content/Intent;

    .line 9
    .line 10
    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/ContentValues;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "_display_name"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "mime_type"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "relative_path"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, Lco/median/android/d;->q(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-static {p3, p0, v0, p1, p2}, Lco/median/android/d;->l(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method private static l(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1, p0, p2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3, p4}, Lco/median/android/d;->n(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :catch_0
    invoke-static {p0, p1, p2, p3, p4}, Lco/median/android/d;->n(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "."

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p0}, Lco/median/android/d;->v(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method private static n(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p4}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    const-string v0, "_display_name"

    .line 10
    .line 11
    invoke-static {p1, p0, p3, p4}, Lco/median/android/d;->u(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-virtual {p2, v0, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0, p2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object p0

    .line 23
    :catch_0
    invoke-static {p0, p1, p2, p3}, Lco/median/android/d;->o(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method private static o(Landroid/net/Uri;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "_display_name"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p3, "_"

    .line 12
    .line 13
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p2, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0, p2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object p0

    .line 35
    :catch_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method private static p(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "_display_name"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const-string v4, "_display_name=?"

    .line 8
    .line 9
    filled-new-array {p2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 30
    .line 31
    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    :try_start_3
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    throw p1

    .line 45
    :cond_0
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    sget-object p1, Lco/median/android/d;->j:Ljava/lang/String;

    .line 54
    .line 55
    const-string p2, "externalFileExists: "

    .line 56
    .line 57
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_1
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method private static q(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "external"

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static r(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "_display_name"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v2, p0

    .line 11
    move-object v1, p1

    .line 12
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p1, 0x0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    return-object p1
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static u(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    move-object v1, p2

    .line 3
    move v2, v0

    .line 4
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v4, "."

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p0, p1, v3}, Lco/median/android/d;->p(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, " ("

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v3, ")"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    add-int/2addr v2, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v1
.end method

.method public static v(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/16 v0, 0x2e

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "_"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v4, Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {v4, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move v0, v3

    .line 62
    :goto_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    add-int/2addr v0, v3

    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    new-instance v5, Ljava/io/File;

    .line 91
    .line 92
    invoke-direct {v5, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v4, v5

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method private synthetic x(ZLjava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    const p2, 0x7f120066

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    const v1, 0x7f120067

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x1

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p2, v2, v0

    .line 30
    .line 31
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private synthetic y(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const v1, 0x7f120067

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    new-array v2, v2, [Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object p1, v2, v3

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {v0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private synthetic z(Lco/median/android/MainActivity;Ljava/util/Map;)V
    .locals 4

    .line 1
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 2
    .line 3
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {v1, p2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    const-string p2, "Unable to save download, storage permission denied"

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    iget-object p2, p2, Lco/median/android/d$e;->g:Ljava/lang/String;

    .line 37
    .line 38
    const-string v0, "Unable to save download, storage permission denied."

    .line 39
    .line 40
    invoke-static {p1, p2, v0}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p2, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    iget-boolean v0, p0, Lco/median/android/d;->g:Z

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-boolean v0, p2, Lco/median/android/d$e;->f:Z

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Lco/median/android/MainActivity;->J1()Lco/median/android/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p2, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 63
    .line 64
    iget-object v0, p2, Lco/median/android/d$e;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, p2, Lco/median/android/d$e;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-boolean v3, p2, Lco/median/android/d$e;->e:Z

    .line 69
    .line 70
    iget-object p2, p2, Lco/median/android/d$e;->g:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1, v3, p2}, Lco/median/android/g;->i(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object p1, p2, Lco/median/android/d$e;->g:Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {p0, p2, p1}, Lco/median/android/d;->G(Lco/median/android/d$e;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iput-object v2, p0, Lco/median/android/d;->h:Lco/median/android/d$e;

    .line 82
    .line 83
    :cond_2
    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .line 1
    sget-object v0, Lco/median/android/d;->k:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lco/median/android/d;->j:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "onAppResume: Deleting file after viewing: "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    sget-object v2, Lco/median/android/d;->k:Landroid/net/Uri;

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Lco/median/android/d;->k:Landroid/net/Uri;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v1, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void
.end method

.method public E(Lco/median/android/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/d;->d:Lco/median/android/B;

    .line 2
    .line 3
    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lco/median/android/d;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 6
    .line 7
    iget-object v1, p0, Lco/median/android/d;->i:Landroid/content/ServiceConnection;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lco/median/android/d;->g:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 7

    .line 1
    iget-object p2, p0, Lco/median/android/d;->d:Lco/median/android/B;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Lco/median/android/B;->I()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    new-instance p5, Lco/median/android/d$b;

    .line 13
    .line 14
    invoke-direct {p5, p0}, Lco/median/android/d$b;-><init>(Lco/median/android/d;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    invoke-static {p1, p3, p4}, Lo0/j;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    :goto_0
    move-object v2, p2

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 p2, 0x0

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    const-string p2, "blob:"

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_5

    .line 41
    .line 42
    iget-object p2, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 43
    .line 44
    if-eqz p2, :cond_5

    .line 45
    .line 46
    iget-object p2, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 47
    .line 48
    sget-object p3, Lco/median/android/d$d;->e:Lco/median/android/d$d;

    .line 49
    .line 50
    if-ne p2, p3, :cond_3

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    :goto_2
    move v4, p2

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/4 p2, 0x0

    .line 56
    goto :goto_2

    .line 57
    :goto_3
    new-instance v0, Lco/median/android/d$e;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    const-string v5, ""

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    invoke-direct/range {v0 .. v5}, Lco/median/android/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, v0}, Lco/median/android/d;->F(Lco/median/android/d$e;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 74
    .line 75
    invoke-virtual {p1}, Lco/median/android/MainActivity;->J1()Lco/median/android/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string p2, ""

    .line 80
    .line 81
    invoke-virtual {p1, v1, v2, v4, p2}, Lco/median/android/g;->i(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    move-object v1, p1

    .line 86
    iput-object v1, p0, Lco/median/android/d;->e:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz p4, :cond_6

    .line 89
    .line 90
    const-string p1, "application/force-download"

    .line 91
    .line 92
    invoke-virtual {p4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    const-string p1, "application/octet-stream"

    .line 99
    .line 100
    invoke-virtual {p4, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    :cond_6
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-eqz p2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-nez p3, :cond_7

    .line 121
    .line 122
    invoke-virtual {p1, p2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    move-object v3, p1

    .line 129
    goto :goto_4

    .line 130
    :cond_7
    move-object v3, p4

    .line 131
    :goto_4
    const/4 v5, 0x0

    .line 132
    const-string v6, ""

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    move-object v0, p0

    .line 136
    invoke-direct/range {v0 .. v6}, Lco/median/android/d;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/d;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public w(Landroid/net/Uri;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lco/median/android/d;->b:Lco/median/android/d$d;

    .line 5
    .line 6
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 7
    .line 8
    if-ne v0, v1, :cond_3

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lco/median/android/d;->j(Landroid/net/Uri;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    invoke-static {p3, p1, p2, p4}, Lco/median/android/d;->J(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 25
    .line 26
    new-instance p2, Lm0/v;

    .line 27
    .line 28
    invoke-direct {p2, p0, p3, p5}, Lm0/v;-><init>(Lco/median/android/d;ZLjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_3
    if-eqz p4, :cond_4

    .line 36
    .line 37
    iget-object p3, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    const/4 p4, 0x1

    .line 40
    invoke-static {p3, p1, p2, p4}, Lco/median/android/d;->J(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_4
    iget-object p1, p0, Lco/median/android/d;->a:Lco/median/android/MainActivity;

    .line 45
    .line 46
    new-instance p2, Lm0/w;

    .line 47
    .line 48
    invoke-direct {p2, p0, p5}, Lm0/w;-><init>(Lco/median/android/d;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
