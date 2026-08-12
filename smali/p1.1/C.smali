.class Lp1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA1/b;


# static fields
.field private static final c:LA1/a;

.field private static final d:LA1/b;


# instance fields
.field private a:LA1/a;

.field private volatile b:LA1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp1/A;

    .line 2
    .line 3
    invoke-direct {v0}, Lp1/A;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp1/C;->c:LA1/a;

    .line 7
    .line 8
    new-instance v0, Lp1/B;

    .line 9
    .line 10
    invoke-direct {v0}, Lp1/B;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lp1/C;->d:LA1/b;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>(LA1/a;LA1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp1/C;->a:LA1/a;

    .line 5
    .line 6
    iput-object p2, p0, Lp1/C;->b:LA1/b;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static synthetic b(LA1/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method static c()Lp1/C;
    .locals 3

    .line 1
    new-instance v0, Lp1/C;

    .line 2
    .line 3
    sget-object v1, Lp1/C;->c:LA1/a;

    .line 4
    .line 5
    sget-object v2, Lp1/C;->d:LA1/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lp1/C;-><init>(LA1/a;LA1/b;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method d(LA1/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/C;->b:LA1/b;

    .line 2
    .line 3
    sget-object v1, Lp1/C;->d:LA1/b;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lp1/C;->a:LA1/a;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lp1/C;->a:LA1/a;

    .line 12
    .line 13
    iput-object p1, p0, Lp1/C;->b:LA1/b;

    .line 14
    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    invoke-interface {v0, p1}, LA1/a;->a(LA1/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "provide() can be called only once."

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/C;->b:LA1/b;

    .line 2
    .line 3
    invoke-interface {v0}, LA1/b;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
