.class abstract Ld2/m;
.super Ld2/i;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Ld2/m;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LW1/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld2/m;->l(LW1/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Iterable;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-static {p0}, Ld2/m;->h(Ljava/lang/Iterable;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/util/Iterator;)Ld2/f;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld2/m$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ld2/m$a;-><init>(Ljava/util/Iterator;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ld2/m;->e(Ld2/f;)Ld2/f;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final e(Ld2/f;)Ld2/f;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Ld2/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ld2/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ld2/a;-><init>(Ld2/f;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static f()Ld2/f;
    .locals 1

    .line 1
    sget-object v0, Ld2/b;->a:Ld2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final g(Ld2/f;LW1/l;)Ld2/f;
    .locals 2

    .line 1
    instance-of v0, p0, Ld2/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ld2/q;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ld2/q;->c(LW1/l;)Ld2/f;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ld2/d;

    .line 13
    .line 14
    new-instance v1, Ld2/l;

    .line 15
    .line 16
    invoke-direct {v1}, Ld2/l;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0, v1, p1}, Ld2/d;-><init>(Ld2/f;LW1/l;LW1/l;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private static final h(Ljava/lang/Iterable;)Ljava/util/Iterator;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static j(Ld2/f;)Ld2/f;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld2/k;

    .line 7
    .line 8
    invoke-direct {v0}, Ld2/k;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Ld2/m;->g(Ld2/f;LW1/l;)Ld2/f;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static k(LW1/a;)Ld2/f;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld2/e;

    .line 7
    .line 8
    new-instance v1, Ld2/j;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ld2/j;-><init>(LW1/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Ld2/e;-><init>(LW1/a;LW1/l;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ld2/m;->e(Ld2/f;)Ld2/f;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private static final l(LW1/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LW1/a;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
