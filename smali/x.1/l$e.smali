.class public Lx/l$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$e$a;
    }
.end annotation


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Ljava/lang/String;

.field E:Landroid/os/Bundle;

.field F:I

.field G:I

.field H:Landroid/app/Notification;

.field I:Landroid/widget/RemoteViews;

.field J:Landroid/widget/RemoteViews;

.field K:Landroid/widget/RemoteViews;

.field L:Ljava/lang/String;

.field M:I

.field N:Ljava/lang/String;

.field O:J

.field P:I

.field Q:I

.field R:Z

.field S:Landroid/app/Notification;

.field T:Z

.field U:Ljava/lang/Object;

.field public V:Ljava/util/ArrayList;

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field d:Ljava/util/ArrayList;

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;

.field g:Ljava/lang/String;

.field h:Landroid/app/PendingIntent;

.field i:Landroid/app/PendingIntent;

.field j:Landroid/widget/RemoteViews;

.field k:Landroidx/core/graphics/drawable/IconCompat;

.field l:Ljava/lang/CharSequence;

.field m:I

.field n:I

.field o:Z

.field p:Z

.field q:Lx/l$f;

.field r:Ljava/lang/CharSequence;

.field s:Ljava/lang/CharSequence;

.field t:[Ljava/lang/CharSequence;

.field u:I

.field v:I

.field w:Z

.field x:Ljava/lang/String;

.field y:Z

.field z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Lx/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->c:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lx/l$e;->o:Z

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lx/l$e;->A:Z

    .line 7
    iput v1, p0, Lx/l$e;->F:I

    .line 8
    iput v1, p0, Lx/l$e;->G:I

    .line 9
    iput v1, p0, Lx/l$e;->M:I

    .line 10
    iput v1, p0, Lx/l$e;->P:I

    .line 11
    iput v1, p0, Lx/l$e;->Q:I

    .line 12
    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 13
    iput-object p1, p0, Lx/l$e;->a:Landroid/content/Context;

    .line 14
    iput-object p2, p0, Lx/l$e;->L:Ljava/lang/String;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 16
    iget-object p1, p0, Lx/l$e;->S:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    .line 17
    iput v1, p0, Lx/l$e;->n:I

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx/l$e;->V:Ljava/util/ArrayList;

    .line 19
    iput-boolean v0, p0, Lx/l$e;->R:Z

    return-void
.end method

.method protected static d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method

.method private m(IZ)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 4
    .line 5
    iget v0, p2, Landroid/app/Notification;->flags:I

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p2, Landroid/app/Notification;->flags:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p2, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 12
    .line 13
    iget v0, p2, Landroid/app/Notification;->flags:I

    .line 14
    .line 15
    not-int p1, p1

    .line 16
    and-int/2addr p1, v0

    .line 17
    iput p1, p2, Landroid/app/Notification;->flags:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lx/l$e;
    .locals 2

    .line 1
    iget-object v0, p0, Lx/l$e;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lx/l$a;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3}, Lx/l$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public b()Landroid/app/Notification;
    .locals 1

    .line 1
    new-instance v0, Lx/m;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx/m;-><init>(Lx/l$e;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lx/m;->c()Landroid/app/Notification;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    .line 13
    .line 14
    return-object v0
.end method

.method public e(Z)Lx/l$e;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lx/l$e;->m(IZ)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lx/l$e;
    .locals 0

    .line 1
    iput-object p1, p0, Lx/l$e;->L:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Lx/l$e;
    .locals 0

    .line 1
    iput p1, p0, Lx/l$e;->F:I

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Landroid/app/PendingIntent;)Lx/l$e;
    .locals 0

    .line 1
    iput-object p1, p0, Lx/l$e;->h:Landroid/app/PendingIntent;

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 0

    .line 1
    invoke-static {p1}, Lx/l$e;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lx/l$e;->f:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0
.end method

.method public j(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 0

    .line 1
    invoke-static {p1}, Lx/l$e;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lx/l$e;->e:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0
.end method

.method public k(I)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput p1, v0, Landroid/app/Notification;->defaults:I

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, v0, Landroid/app/Notification;->flags:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, v0, Landroid/app/Notification;->flags:I

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public l(Landroid/app/PendingIntent;)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 4
    .line 5
    return-object p0
.end method

.method public n(Landroid/graphics/Bitmap;)Lx/l$e;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lx/l$e;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lx/l;->b(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, Lx/l$e;->k:Landroidx/core/graphics/drawable/IconCompat;

    .line 16
    .line 17
    return-object p0
.end method

.method public o(III)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    .line 4
    .line 5
    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    .line 6
    .line 7
    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    .line 17
    .line 18
    and-int/lit8 p2, p2, -0x2

    .line 19
    .line 20
    or-int/2addr p1, p2

    .line 21
    iput p1, v0, Landroid/app/Notification;->flags:I

    .line 22
    .line 23
    return-object p0
.end method

.method public p(Z)Lx/l$e;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx/l$e;->A:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public q(I)Lx/l$e;
    .locals 0

    .line 1
    iput p1, p0, Lx/l$e;->m:I

    .line 2
    .line 3
    return-object p0
.end method

.method public r(I)Lx/l$e;
    .locals 0

    .line 1
    iput p1, p0, Lx/l$e;->n:I

    .line 2
    .line 3
    return-object p0
.end method

.method public s(Z)Lx/l$e;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx/l$e;->o:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public t(I)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput p1, v0, Landroid/app/Notification;->icon:I

    .line 4
    .line 5
    return-object p0
.end method

.method public u(Landroid/net/Uri;)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 7
    .line 8
    invoke-static {}, Lx/l$e$a;->b()Landroid/media/AudioAttributes$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x4

    .line 13
    invoke-static {p1, v0}, Lx/l$e$a;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-static {p1, v0}, Lx/l$e$a;->d(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 23
    .line 24
    invoke-static {p1}, Lx/l$e$a;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 29
    .line 30
    return-object p0
.end method

.method public v(Lx/l$f;)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->q:Lx/l$f;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lx/l$e;->q:Lx/l$f;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lx/l$f;->g(Lx/l$e;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-object p0
.end method

.method public w(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    invoke-static {p1}, Lx/l$e;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 8
    .line 9
    return-object p0
.end method

.method public x([J)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    .line 4
    .line 5
    return-object p0
.end method

.method public y(I)Lx/l$e;
    .locals 0

    .line 1
    iput p1, p0, Lx/l$e;->G:I

    .line 2
    .line 3
    return-object p0
.end method

.method public z(J)Lx/l$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$e;->S:Landroid/app/Notification;

    .line 2
    .line 3
    iput-wide p1, v0, Landroid/app/Notification;->when:J

    .line 4
    .line 5
    return-object p0
.end method
