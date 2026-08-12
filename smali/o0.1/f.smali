.class public Lo0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo0/f;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lo0/f;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lo0/f;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized b()Lo0/f;
    .locals 2

    .line 1
    const-class v0, Lo0/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lo0/f;->b:Lo0/f;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lo0/f;

    .line 9
    .line 10
    invoke-direct {v1}, Lo0/f;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lo0/f;->b:Lo0/f;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lo0/f;->b:Lo0/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method private synthetic d(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo0/f;->a:Landroid/content/Context;

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
.method public c(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lo0/f;->a:Landroid/content/Context;

    .line 6
    .line 7
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string p2, "null"

    .line 5
    .line 6
    :goto_0
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p2, v0

    .line 9
    :goto_0
    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    if-eqz p2, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    move-object p2, v0

    .line 17
    :goto_1
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    if-ne p4, p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lo0/f;->a:Landroid/content/Context;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    iget-object p3, p0, Lo0/f;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    new-instance p3, Lo0/e;

    .line 25
    .line 26
    invoke-direct {p3, p0, p2}, Lo0/e;-><init>(Lo0/f;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    :cond_0
    return-void
.end method
