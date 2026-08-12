.class final Ld1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld1/b;


# instance fields
.field private final a:Ld1/u;

.field private final b:Ld1/i;

.field private final c:Landroid/content/Context;

.field private final d:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ld1/u;Ld1/i;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Ld1/l;->d:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p1, p0, Ld1/l;->a:Ld1/u;

    .line 16
    .line 17
    iput-object p2, p0, Ld1/l;->b:Ld1/i;

    .line 18
    .line 19
    iput-object p3, p0, Ld1/l;->c:Landroid/content/Context;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    iget-object v0, p0, Ld1/l;->a:Ld1/u;

    .line 2
    .line 3
    iget-object v1, p0, Ld1/l;->c:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ld1/u;->c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final b(Ld1/a;ILandroid/app/Activity;I)Z
    .locals 1

    .line 1
    invoke-static {p2}, Ld1/d;->c(I)Ld1/d;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    new-instance v0, Ld1/k;

    .line 10
    .line 11
    invoke-direct {v0, p0, p3}, Ld1/k;-><init>(Ld1/l;Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, p2, p4}, Ld1/l;->c(Ld1/a;Lf1/a;Ld1/d;I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final c(Ld1/a;Lf1/a;Ld1/d;I)Z
    .locals 8

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Ld1/a;->b(Ld1/d;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ld1/a;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ld1/a;->f()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p3}, Ld1/a;->d(Ld1/d;)Landroid/app/PendingIntent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v0, p2

    .line 37
    move v2, p4

    .line 38
    invoke-interface/range {v0 .. v7}, Lf1/a;->a(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method
