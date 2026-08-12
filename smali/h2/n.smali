.class public Lh2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/n$a;
    }
.end annotation


# static fields
.field private static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;

.field private volatile synthetic _removedRef$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "_next$volatile"

    .line 2
    .line 3
    const-class v1, Lh2/n;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lh2/n;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    const-string v0, "_prev$volatile"

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lh2/n;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    const-string v0, "_removedRef$volatile"

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lh2/n;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lh2/n;->_next$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p0, p0, Lh2/n;->_prev$volatile:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic f(Lh2/n;Lh2/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh2/n;->k(Lh2/n;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final i(Lh2/u;)Lh2/n;
    .locals 7

    .line 1
    :goto_0
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lh2/n;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move-object v2, v0

    .line 13
    :goto_1
    move-object v3, v1

    .line 14
    :goto_2
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-ne v4, p0, :cond_1

    .line 23
    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lh2/n;->r()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    if-ne v4, p1, :cond_4

    .line 46
    .line 47
    :cond_3
    :goto_3
    return-object v2

    .line 48
    :cond_4
    instance-of v5, v4, Lh2/u;

    .line 49
    .line 50
    if-eqz v5, :cond_5

    .line 51
    .line 52
    check-cast v4, Lh2/u;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Lh2/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    instance-of v5, v4, Lh2/v;

    .line 59
    .line 60
    if-eqz v5, :cond_8

    .line 61
    .line 62
    if-eqz v3, :cond_7

    .line 63
    .line 64
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v4, Lh2/v;

    .line 69
    .line 70
    iget-object v4, v4, Lh2/v;->a:Lh2/n;

    .line 71
    .line 72
    invoke-static {v5, v3, v2, v4}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_6
    move-object v2, v3

    .line 80
    goto :goto_1

    .line 81
    :cond_7
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lh2/n;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_8
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 93
    .line 94
    invoke-static {v4, v3}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v3, v4

    .line 98
    check-cast v3, Lh2/n;

    .line 99
    .line 100
    move-object v6, v3

    .line 101
    move-object v3, v2

    .line 102
    move-object v2, v6

    .line 103
    goto :goto_2
.end method

.method private final j(Lh2/n;)Lh2/n;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p1}, Lh2/n;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lh2/n;

    .line 17
    .line 18
    goto :goto_0
.end method

.method private final k(Lh2/n;)V
    .locals 3

    .line 1
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lh2/n;

    .line 10
    .line 11
    invoke-virtual {p0}, Lh2/n;->l()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eq v2, p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2, p1, v1, p0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lh2/n;->r()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p1, v0}, Lh2/n;->i(Lh2/u;)Lh2/n;

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void
.end method

.method private static final synthetic o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lh2/n;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final synthetic p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lh2/n;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final synthetic q()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lh2/n;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final u()Lh2/v;
    .locals 2

    .line 1
    invoke-static {}, Lh2/n;->q()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lh2/v;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lh2/v;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lh2/v;-><init>(Lh2/n;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lh2/n;->q()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final h(Lh2/n;)Z
    .locals 1

    .line 1
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lh2/n;->l()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, p0, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p0, p0, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lh2/n;->k(Lh2/n;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method public final l()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Lh2/u;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    check-cast v1, Lh2/u;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lh2/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0
.end method

.method public final m()Lh2/n;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh2/n;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lh2/v;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lh2/v;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, v1, Lh2/v;->a:Lh2/n;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    return-object v1

    .line 22
    :cond_2
    :goto_1
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 23
    .line 24
    invoke-static {v0, v1}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v0, Lh2/n;

    .line 28
    .line 29
    return-object v0
.end method

.method public final n()Lh2/n;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lh2/n;->i(Lh2/u;)Lh2/n;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lh2/n;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Lh2/n;->j(Lh2/n;)Lh2/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    return-object v0
.end method

.method public r()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh2/n;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lh2/v;

    .line 6
    .line 7
    return v0
.end method

.method public s()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh2/n;->t()Lh2/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

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

.method public final t()Lh2/n;
    .locals 4

    .line 1
    :cond_0
    invoke-virtual {p0}, Lh2/n;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lh2/v;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast v0, Lh2/v;

    .line 10
    .line 11
    iget-object v0, v0, Lh2/v;->a:Lh2/n;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    if-ne v0, p0, :cond_2

    .line 15
    .line 16
    check-cast v0, Lh2/n;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_2
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    .line 20
    .line 21
    invoke-static {v0, v1}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Lh2/n;

    .line 26
    .line 27
    invoke-direct {v1}, Lh2/n;->u()Lh2/v;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v1, v0}, Lh2/n;->i(Lh2/u;)Lh2/n;

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lh2/n$b;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lh2/n$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x40

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lf2/D;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method public final v(Lh2/n;Lh2/n;Lh2/n$a;)I
    .locals 1

    .line 1
    invoke-static {}, Lh2/n;->p()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p3, Lh2/n$a;->c:Lh2/n;

    .line 16
    .line 17
    invoke-static {}, Lh2/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1, p0, p2, p3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_0
    invoke-virtual {p3, p0}, Lh2/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x2

    .line 38
    return p1
.end method
