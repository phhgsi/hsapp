.class public final Lj2/a$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# static fields
.field private static final synthetic l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final d:Lj2/o;

.field private final e:LX1/r;

.field public f:Lj2/a$d;

.field private g:J

.field private h:J

.field private i:I

.field private volatile indexInArray:I

.field public j:Z

.field final synthetic k:Lj2/a;

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field private volatile synthetic workerCtl$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lj2/a$c;

    .line 2
    .line 3
    const-string v1, "workerCtl$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lj2/a$c;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>(Lj2/a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lj2/a$c;->k:Lj2/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 4
    new-instance p1, Lj2/o;

    invoke-direct {p1}, Lj2/o;-><init>()V

    iput-object p1, p0, Lj2/a$c;->d:Lj2/o;

    .line 5
    new-instance p1, LX1/r;

    invoke-direct {p1}, LX1/r;-><init>()V

    iput-object p1, p0, Lj2/a$c;->e:LX1/r;

    .line 6
    sget-object p1, Lj2/a$d;->g:Lj2/a$d;

    iput-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 7
    sget-object p1, Lj2/a;->o:Lh2/y;

    iput-object p1, p0, Lj2/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    long-to-int p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x2a

    .line 9
    :goto_0
    iput p1, p0, Lj2/a$c;->i:I

    return-void
.end method

.method public constructor <init>(Lj2/a;I)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lj2/a$c;-><init>(Lj2/a;)V

    .line 11
    invoke-virtual {p0, p2}, Lj2/a$c;->q(I)V

    return-void
.end method

.method public static final synthetic a(Lj2/a$c;)Lj2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lj2/a$c;->k:Lj2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method private final b(I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lj2/a$c;->k:Lj2/a;

    .line 5
    .line 6
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-wide/32 v1, -0x200000

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 17
    .line 18
    sget-object v0, Lj2/a$d;->h:Lj2/a$d;

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Lj2/a$d;->g:Lj2/a$d;

    .line 23
    .line 24
    iput-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method private final c(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Lj2/a$d;->e:Lj2/a$d;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lj2/a$c;->u(Lj2/a$d;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lj2/a$c;->k:Lj2/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lj2/a;->C()V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method private final d(Lj2/h;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lj2/h;->e:Lj2/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/i;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lj2/a$c;->k(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lj2/a$c;->c(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lj2/a$c;->k:Lj2/a;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lj2/a;->x(Lj2/h;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Lj2/a$c;->b(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final e(Z)Lj2/h;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lj2/a$c;->k:Lj2/a;

    .line 4
    .line 5
    iget p1, p1, Lj2/a;->d:I

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lj2/a$c;->m(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lj2/a$c;->o()Lj2/h;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object v0, p0, Lj2/a$c;->d:Lj2/o;

    .line 28
    .line 29
    invoke-virtual {v0}, Lj2/o;->k()Lj2/h;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    if-nez p1, :cond_4

    .line 37
    .line 38
    invoke-direct {p0}, Lj2/a$c;->o()Lj2/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_3
    invoke-direct {p0}, Lj2/a$c;->o()Lj2/h;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    const/4 p1, 0x3

    .line 53
    invoke-direct {p0, p1}, Lj2/a$c;->v(I)Lj2/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method private final f()Lj2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lj2/a$c;->d:Lj2/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj2/o;->l()Lj2/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 10
    .line 11
    iget-object v0, v0, Lj2/a;->i:Lj2/d;

    .line 12
    .line 13
    invoke-virtual {v0}, Lh2/o;->e()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lj2/h;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, v0}, Lj2/a$c;->v(I)Lj2/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    return-object v0
.end method

.method public static final synthetic j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lj2/a$c;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final k(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lj2/a$c;->g:J

    .line 4
    .line 5
    iget-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 6
    .line 7
    sget-object v0, Lj2/a$d;->f:Lj2/a$d;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lj2/a$d;->e:Lj2/a$d;

    .line 12
    .line 13
    iput-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private final l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lj2/a;->o:Lh2/y;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private final n()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lj2/a$c;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v4, p0, Lj2/a$c;->k:Lj2/a;

    .line 14
    .line 15
    iget-wide v4, v4, Lj2/a;->f:J

    .line 16
    .line 17
    add-long/2addr v0, v4

    .line 18
    iput-wide v0, p0, Lj2/a$c;->g:J

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 21
    .line 22
    iget-wide v0, v0, Lj2/a;->f:J

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iget-wide v4, p0, Lj2/a$c;->g:J

    .line 32
    .line 33
    sub-long/2addr v0, v4

    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-ltz v0, :cond_1

    .line 37
    .line 38
    iput-wide v2, p0, Lj2/a$c;->g:J

    .line 39
    .line 40
    invoke-direct {p0}, Lj2/a$c;->w()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method private final o()Lj2/h;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lj2/a$c;->m(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 9
    .line 10
    iget-object v0, v0, Lj2/a;->h:Lj2/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lh2/o;->e()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lj2/h;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 22
    .line 23
    iget-object v0, v0, Lj2/a;->i:Lj2/d;

    .line 24
    .line 25
    invoke-virtual {v0}, Lh2/o;->e()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lj2/h;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 33
    .line 34
    iget-object v0, v0, Lj2/a;->i:Lj2/d;

    .line 35
    .line 36
    invoke-virtual {v0}, Lh2/o;->e()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lj2/h;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 46
    .line 47
    iget-object v0, v0, Lj2/a;->h:Lj2/d;

    .line 48
    .line 49
    invoke-virtual {v0}, Lh2/o;->e()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lj2/h;

    .line 54
    .line 55
    return-object v0
.end method

.method private final p()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move v1, v0

    .line 3
    :goto_1
    iget-object v2, p0, Lj2/a$c;->k:Lj2/a;

    .line 4
    .line 5
    invoke-virtual {v2}, Lj2/a;->isTerminated()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 12
    .line 13
    sget-object v3, Lj2/a$d;->h:Lj2/a$d;

    .line 14
    .line 15
    if-eq v2, v3, :cond_3

    .line 16
    .line 17
    iget-boolean v2, p0, Lj2/a$c;->j:Z

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lj2/a$c;->g(Z)Lj2/h;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iput-wide v3, p0, Lj2/a$c;->h:J

    .line 28
    .line 29
    invoke-direct {p0, v2}, Lj2/a$c;->d(Lj2/h;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-boolean v0, p0, Lj2/a$c;->j:Z

    .line 34
    .line 35
    iget-wide v5, p0, Lj2/a$c;->h:J

    .line 36
    .line 37
    cmp-long v2, v5, v3

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v1, Lj2/a$d;->f:Lj2/a$d;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lj2/a$c;->u(Lj2/a$d;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 51
    .line 52
    .line 53
    iget-wide v1, p0, Lj2/a$c;->h:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 56
    .line 57
    .line 58
    iput-wide v3, p0, Lj2/a$c;->h:J

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-direct {p0}, Lj2/a$c;->t()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v0, Lj2/a$d;->h:Lj2/a$d;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lj2/a$c;->u(Lj2/a$d;)Z

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private final s()Z
    .locals 9

    .line 1
    iget-object v0, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 2
    .line 3
    sget-object v1, Lj2/a$d;->d:Lj2/a$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v4, p0, Lj2/a$c;->k:Lj2/a;

    .line 10
    .line 11
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    const-wide v7, 0x7ffffc0000000000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v7, v5

    .line 25
    const/16 v1, 0x2a

    .line 26
    .line 27
    shr-long/2addr v7, v1

    .line 28
    long-to-int v1, v7

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_2
    const-wide v7, 0x40000000000L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    sub-long v7, v5, v7

    .line 39
    .line 40
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    sget-object v0, Lj2/a$d;->d:Lj2/a$d;

    .line 51
    .line 52
    iput-object v0, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 53
    .line 54
    return v2
.end method

.method private final t()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lj2/a$c;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lj2/a;->v(Lj2/a$c;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Lj2/a$c;->j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-direct {p0}, Lj2/a$c;->l()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-static {}, Lj2/a$c;->j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ne v0, v1, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Lj2/a;->isTerminated()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 46
    .line 47
    sget-object v2, Lj2/a$d;->h:Lj2/a$d;

    .line 48
    .line 49
    if-ne v0, v2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object v0, Lj2/a$d;->f:Lj2/a$d;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lj2/a$c;->u(Lj2/a$d;)Z

    .line 55
    .line 56
    .line 57
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lj2/a$c;->n()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method private final v(I)Lj2/h;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj2/a$c;->k:Lj2/a;

    .line 4
    .line 5
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/32 v3, 0x1fffff

    .line 14
    .line 15
    .line 16
    and-long/2addr v1, v3

    .line 17
    long-to-int v1, v1

    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Lj2/a$c;->m(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v4, v0, Lj2/a$c;->k:Lj2/a;

    .line 28
    .line 29
    const-wide v5, 0x7fffffffffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    move-wide v8, v5

    .line 36
    :goto_0
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    if-ge v7, v1, :cond_5

    .line 39
    .line 40
    const/4 v12, 0x1

    .line 41
    add-int/2addr v2, v12

    .line 42
    if-le v2, v1, :cond_1

    .line 43
    .line 44
    move v2, v12

    .line 45
    :cond_1
    iget-object v12, v4, Lj2/a;->j:Lh2/w;

    .line 46
    .line 47
    invoke-virtual {v12, v2}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    check-cast v12, Lj2/a$c;

    .line 52
    .line 53
    if-eqz v12, :cond_3

    .line 54
    .line 55
    if-eq v12, v0, :cond_3

    .line 56
    .line 57
    iget-object v12, v12, Lj2/a$c;->d:Lj2/o;

    .line 58
    .line 59
    iget-object v13, v0, Lj2/a$c;->e:LX1/r;

    .line 60
    .line 61
    move/from16 v14, p1

    .line 62
    .line 63
    invoke-virtual {v12, v14, v13}, Lj2/o;->r(ILX1/r;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    const-wide/16 v15, -0x1

    .line 68
    .line 69
    cmp-long v15, v12, v15

    .line 70
    .line 71
    if-nez v15, :cond_2

    .line 72
    .line 73
    iget-object v1, v0, Lj2/a$c;->e:LX1/r;

    .line 74
    .line 75
    iget-object v2, v1, LX1/r;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lj2/h;

    .line 78
    .line 79
    iput-object v3, v1, LX1/r;->d:Ljava/lang/Object;

    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    cmp-long v10, v12, v10

    .line 83
    .line 84
    if-lez v10, :cond_4

    .line 85
    .line 86
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move/from16 v14, p1

    .line 92
    .line 93
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    cmp-long v1, v8, v5

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    move-wide v8, v10

    .line 102
    :goto_2
    iput-wide v8, v0, Lj2/a$c;->h:J

    .line 103
    .line 104
    return-object v3
.end method

.method private final w()V
    .locals 8

    .line 1
    iget-object v0, p0, Lj2/a$c;->k:Lj2/a;

    .line 2
    .line 3
    iget-object v1, v0, Lj2/a;->j:Lh2/w;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lj2/a;->isTerminated()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/32 v4, 0x1fffff

    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    long-to-int v2, v2

    .line 27
    iget v3, v0, Lj2/a;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    if-gt v2, v3, :cond_1

    .line 30
    .line 31
    monitor-exit v1

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_2
    invoke-static {}, Lj2/a$c;->j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, -0x1

    .line 38
    const/4 v6, 0x1

    .line 39
    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 40
    .line 41
    .line 42
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    monitor-exit v1

    .line 46
    return-void

    .line 47
    :cond_2
    :try_start_3
    iget v2, p0, Lj2/a$c;->indexInArray:I

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {p0, v3}, Lj2/a$c;->q(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0, v2, v3}, Lj2/a;->w(Lj2/a$c;II)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    and-long/2addr v4, v6

    .line 65
    long-to-int v3, v4

    .line 66
    if-eq v3, v2, :cond_3

    .line 67
    .line 68
    iget-object v4, v0, Lj2/a;->j:Lh2/w;

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v4}, LX1/k;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    check-cast v4, Lj2/a$c;

    .line 78
    .line 79
    iget-object v5, v0, Lj2/a;->j:Lh2/w;

    .line 80
    .line 81
    invoke-virtual {v5, v2, v4}, Lh2/w;->c(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Lj2/a$c;->q(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4, v3, v2}, Lj2/a;->w(Lj2/a$c;II)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_0
    iget-object v0, v0, Lj2/a;->j:Lh2/w;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    invoke-virtual {v0, v3, v2}, Lh2/w;->c(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v0, LL1/t;->a:LL1/t;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    .line 101
    monitor-exit v1

    .line 102
    sget-object v0, Lj2/a$d;->h:Lj2/a$d;

    .line 103
    .line 104
    iput-object v0, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 105
    .line 106
    return-void

    .line 107
    :goto_1
    monitor-exit v1

    .line 108
    throw v0
.end method


# virtual methods
.method public final g(Z)Lj2/h;
    .locals 1

    .line 1
    invoke-direct {p0}, Lj2/a$c;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lj2/a$c;->e(Z)Lj2/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-direct {p0}, Lj2/a$c;->f()Lj2/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lj2/a$c;->indexInArray:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lj2/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m(I)I
    .locals 3

    .line 1
    iget v0, p0, Lj2/a$c;->i:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lj2/a$c;->i:I

    .line 13
    .line 14
    add-int/lit8 v1, p1, -0x1

    .line 15
    .line 16
    and-int v2, v1, p1

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    and-int p1, v0, v1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    rem-int/2addr v0, p1

    .line 28
    return v0
.end method

.method public final q(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lj2/a$c;->k:Lj2/a;

    .line 7
    .line 8
    iget-object v1, v1, Lj2/a;->g:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lj2/a$c;->indexInArray:I

    .line 38
    .line 39
    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj2/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public run()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj2/a$c;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final u(Lj2/a$d;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 2
    .line 3
    sget-object v1, Lj2/a$d;->d:Lj2/a$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lj2/a$c;->k:Lj2/a;

    .line 13
    .line 14
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-wide v4, 0x40000000000L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    :cond_1
    if-eq v0, p1, :cond_2

    .line 27
    .line 28
    iput-object p1, p0, Lj2/a$c;->f:Lj2/a$d;

    .line 29
    .line 30
    :cond_2
    return v1
.end method
