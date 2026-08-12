.class abstract synthetic Lf2/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/f0;)Lf2/p;
    .locals 1

    .line 1
    new-instance v0, Lf2/i0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lf2/i0;-><init>(Lf2/f0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(Lf2/f0;ILjava/lang/Object;)Lf2/p;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0}, Lf2/j0;->a(Lf2/f0;)Lf2/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final c(LN1/i;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 1
    sget-object v0, Lf2/f0;->c:Lf2/f0$b;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf2/f0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lf2/f0;->A(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic d(LN1/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1}, Lf2/j0;->c(LN1/i;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final e(LN1/i;)V
    .locals 1

    .line 1
    sget-object v0, Lf2/f0;->c:Lf2/f0$b;

    .line 2
    .line 3
    invoke-interface {p0, v0}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf2/f0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lf2/j0;->f(Lf2/f0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static final f(Lf2/f0;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lf2/f0;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p0}, Lf2/f0;->v()Ljava/util/concurrent/CancellationException;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method

.method public static final g(Lf2/f0;ZZLf2/c0;)Lf2/N;
    .locals 1

    .line 1
    instance-of v0, p0, Lf2/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lf2/m0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lf2/m0;->Z(ZZLf2/c0;)Lf2/N;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lf2/k0$a;

    .line 13
    .line 14
    invoke-direct {v0, p3}, Lf2/k0$a;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1, p2, v0}, Lf2/f0;->d(ZZLW1/l;)Lf2/N;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic h(Lf2/f0;ZZLf2/c0;ILjava/lang/Object;)Lf2/N;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf2/j0;->g(Lf2/f0;ZZLf2/c0;)Lf2/N;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
