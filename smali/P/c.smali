.class public LP/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP/c$f;,
        LP/c$b;,
        LP/c$e;,
        LP/c$d;,
        LP/c$c;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/ThreadLocal;


# instance fields
.field private final a:Landroidx/collection/i;

.field final b:Ljava/util/ArrayList;

.field private final c:LP/c$b;

.field private final d:Ljava/lang/Runnable;

.field private e:LP/j;

.field f:J

.field private g:Z

.field public h:F

.field public i:LP/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP/c;->j:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LP/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/collection/i;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/collection/i;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LP/c;->a:Landroidx/collection/i;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, LP/c$b;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, p0, v1}, LP/c$b;-><init>(LP/c;LP/c$a;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LP/c;->c:LP/c$b;

    .line 25
    .line 26
    new-instance v0, LP/b;

    .line 27
    .line 28
    invoke-direct {v0, p0}, LP/b;-><init>(LP/c;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LP/c;->d:Ljava/lang/Runnable;

    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    iput-wide v0, p0, LP/c;->f:J

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, LP/c;->g:Z

    .line 39
    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    .line 42
    iput v0, p0, LP/c;->h:F

    .line 43
    .line 44
    iput-object p1, p0, LP/c;->e:LP/j;

    .line 45
    .line 46
    return-void
.end method

.method public static synthetic a(LP/c;)V
    .locals 0

    .line 1
    iget-object p0, p0, LP/c;->c:LP/c$b;

    .line 2
    .line 3
    invoke-virtual {p0}, LP/c$b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic b(LP/c;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, LP/c;->d:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LP/c;)LP/j;
    .locals 0

    .line 1
    iget-object p0, p0, LP/c;->e:LP/j;

    .line 2
    .line 3
    return-object p0
.end method

.method private e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LP/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v1, 0x21

    .line 42
    .line 43
    if-lt v0, v1, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, LP/c;->i:LP/c$e;

    .line 46
    .line 47
    invoke-interface {v0}, LP/c$e;->a()Z

    .line 48
    .line 49
    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, LP/c;->g:Z

    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method static h()LP/c;
    .locals 3

    .line 1
    sget-object v0, LP/c;->j:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, LP/c;

    .line 10
    .line 11
    new-instance v2, LP/c$f;

    .line 12
    .line 13
    invoke-direct {v2}, LP/c$f;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, LP/c;-><init>(LP/j;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, LP/c;

    .line 27
    .line 28
    return-object v0
.end method

.method private i(LP/c$c;J)Z
    .locals 4

    .line 1
    iget-object v0, p0, LP/c;->a:Landroidx/collection/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long p2, v2, p2

    .line 18
    .line 19
    if-gez p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, LP/c;->a:Landroidx/collection/i;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroidx/collection/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method


# virtual methods
.method d(LP/c$c;J)V
    .locals 3

    .line 1
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LP/c;->e:LP/j;

    .line 10
    .line 11
    iget-object v1, p0, LP/c;->d:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-interface {v0, v1}, LP/j;->a(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x21

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {}, LP/a;->a()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, LP/c;->h:F

    .line 27
    .line 28
    iget-object v0, p0, LP/c;->i:LP/c$e;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, LP/c$d;

    .line 33
    .line 34
    invoke-direct {v0, p0}, LP/c$d;-><init>(LP/c;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, LP/c;->i:LP/c$e;

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, LP/c;->i:LP/c$e;

    .line 40
    .line 41
    invoke-interface {v0}, LP/c$e;->b()Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    cmp-long v0, p2, v0

    .line 60
    .line 61
    if-lez v0, :cond_3

    .line 62
    .line 63
    iget-object v0, p0, LP/c;->a:Landroidx/collection/i;

    .line 64
    .line 65
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    add-long/2addr v1, p2

    .line 70
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v0, p1, p2}, Landroidx/collection/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
.end method

.method f(J)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    iget-object v3, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    iget-object v3, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, LP/c$c;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-direct {p0, v3, v0, v1}, LP/c;->i(LP/c$c;J)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-interface {v3, p1, p2}, LP/c$c;->a(J)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-direct {p0}, LP/c;->e()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, LP/c;->h:F

    .line 2
    .line 3
    return v0
.end method

.method j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LP/c;->e:LP/j;

    .line 2
    .line 3
    invoke-interface {v0}, LP/j;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method k(LP/c$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/c;->a:Landroidx/collection/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LP/c;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, LP/c;->g:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method
