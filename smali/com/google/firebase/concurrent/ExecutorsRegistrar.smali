.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field static final a:Lp1/x;

.field static final b:Lp1/x;

.field static final c:Lp1/x;

.field static final d:Lp1/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp1/x;

    .line 2
    .line 3
    new-instance v1, Lq1/b;

    .line 4
    .line 5
    invoke-direct {v1}, Lq1/b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lp1/x;-><init>(LA1/b;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lp1/x;

    .line 12
    .line 13
    new-instance v0, Lp1/x;

    .line 14
    .line 15
    new-instance v1, Lq1/c;

    .line 16
    .line 17
    invoke-direct {v1}, Lq1/c;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Lp1/x;-><init>(LA1/b;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lp1/x;

    .line 24
    .line 25
    new-instance v0, Lp1/x;

    .line 26
    .line 27
    new-instance v1, Lq1/d;

    .line 28
    .line 29
    invoke-direct {v1}, Lq1/d;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Lp1/x;-><init>(LA1/b;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lp1/x;

    .line 36
    .line 37
    new-instance v0, Lp1/x;

    .line 38
    .line 39
    new-instance v1, Lq1/e;

    .line 40
    .line 41
    invoke-direct {v1}, Lq1/e;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Lp1/x;-><init>(LA1/b;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lp1/x;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lp1/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lp1/x;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp1/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic b()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    const-string v0, "Firebase Scheduler"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public static synthetic c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->l()Landroid/os/StrictMode$ThreadPolicy;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "Firebase Lite"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v2, v3, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public static synthetic d(Lp1/e;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    sget-object p0, Lq1/l;->d:Lq1/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lp1/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lp1/x;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp1/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic f()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->i()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Firebase Background"

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    invoke-static {v1, v2, v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public static synthetic g(Lp1/e;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lp1/x;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp1/x;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic h()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    const-string v0, "Firebase Blocking"

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method private static i()Landroid/os/StrictMode$ThreadPolicy;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectResourceMismatches()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x1a

    .line 16
    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lq1/a;->a(Landroid/os/StrictMode$ThreadPolicy$Builder;)Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method private static j(Ljava/lang/String;I)Ljava/util/concurrent/ThreadFactory;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/firebase/concurrent/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/google/firebase/concurrent/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private static k(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/concurrent/b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/firebase/concurrent/b;-><init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static l()Landroid/os/StrictMode$ThreadPolicy;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method private static m(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/firebase/concurrent/o;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Lp1/x;

    .line 4
    .line 5
    invoke-virtual {v1}, Lp1/x;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lcom/google/firebase/concurrent/o;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 11

    .line 1
    const-class v0, Lo1/a;

    .line 2
    .line 3
    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-class v3, Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    invoke-static {v0, v3}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-class v5, Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    invoke-static {v0, v5}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v6, 0x2

    .line 22
    new-array v7, v6, [Lp1/E;

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    aput-object v4, v7, v8

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    aput-object v0, v7, v4

    .line 29
    .line 30
    invoke-static {v2, v7}, Lp1/c;->f(Lp1/E;[Lp1/E;)Lp1/c$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Lq1/f;

    .line 35
    .line 36
    invoke-direct {v2}, Lq1/f;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lp1/c$b;->d()Lp1/c;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v2, Lo1/b;

    .line 48
    .line 49
    invoke-static {v2, v1}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-static {v2, v3}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-static {v2, v5}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-array v10, v6, [Lp1/E;

    .line 62
    .line 63
    aput-object v9, v10, v8

    .line 64
    .line 65
    aput-object v2, v10, v4

    .line 66
    .line 67
    invoke-static {v7, v10}, Lp1/c;->f(Lp1/E;[Lp1/E;)Lp1/c$b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v7, Lq1/g;

    .line 72
    .line 73
    invoke-direct {v7}, Lq1/g;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v7}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Lp1/c$b;->d()Lp1/c;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-class v7, Lo1/c;

    .line 85
    .line 86
    invoke-static {v7, v1}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v7, v3}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v7, v5}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    new-array v9, v6, [Lp1/E;

    .line 99
    .line 100
    aput-object v3, v9, v8

    .line 101
    .line 102
    aput-object v7, v9, v4

    .line 103
    .line 104
    invoke-static {v1, v9}, Lp1/c;->f(Lp1/E;[Lp1/E;)Lp1/c$b;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v3, Lq1/h;

    .line 109
    .line 110
    invoke-direct {v3}, Lq1/h;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lp1/c$b;->d()Lp1/c;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-class v3, Lo1/d;

    .line 122
    .line 123
    invoke-static {v3, v5}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Lp1/c;->e(Lp1/E;)Lp1/c$b;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    new-instance v5, Lq1/i;

    .line 132
    .line 133
    invoke-direct {v5}, Lq1/i;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v5}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Lp1/c$b;->d()Lp1/c;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const/4 v5, 0x4

    .line 145
    new-array v5, v5, [Lp1/c;

    .line 146
    .line 147
    aput-object v0, v5, v8

    .line 148
    .line 149
    aput-object v2, v5, v4

    .line 150
    .line 151
    aput-object v1, v5, v6

    .line 152
    .line 153
    const/4 v0, 0x3

    .line 154
    aput-object v3, v5, v0

    .line 155
    .line 156
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    return-object v0
.end method
