.class abstract synthetic Lf2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/z;LN1/i;Lf2/B;LW1/p;)Lf2/G;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lf2/v;->e(Lf2/z;LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Lf2/B;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lf2/o0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, Lf2/o0;-><init>(LN1/i;LW1/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lf2/H;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, Lf2/H;-><init>(LN1/i;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lf2/a;->D0(Lf2/B;Ljava/lang/Object;LW1/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic b(Lf2/z;LN1/i;Lf2/B;LW1/p;ILjava/lang/Object;)Lf2/G;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, LN1/j;->d:LN1/j;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, Lf2/B;->d:Lf2/B;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf2/f;->a(Lf2/z;LN1/i;Lf2/B;LW1/p;)Lf2/G;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final c(Lf2/z;LN1/i;Lf2/B;LW1/p;)Lf2/f0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lf2/v;->e(Lf2/z;LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Lf2/B;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lf2/p0;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, Lf2/p0;-><init>(LN1/i;LW1/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lf2/v0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, Lf2/v0;-><init>(LN1/i;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lf2/a;->D0(Lf2/B;Ljava/lang/Object;LW1/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic d(Lf2/z;LN1/i;Lf2/B;LW1/p;ILjava/lang/Object;)Lf2/f0;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, LN1/j;->d:LN1/j;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, Lf2/B;->d:Lf2/B;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf2/f;->c(Lf2/z;LN1/i;Lf2/B;LW1/p;)Lf2/f0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(LN1/i;LW1/p;LN1/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p2}, LN1/e;->c()LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, Lf2/v;->d(LN1/i;LN1/i;)LN1/i;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lf2/j0;->e(LN1/i;)V

    .line 10
    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lh2/x;

    .line 15
    .line 16
    invoke-direct {v0, p0, p2}, Lh2/x;-><init>(LN1/i;LN1/e;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v0, p1}, Li2/b;->b(Lh2/x;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, LN1/f;->a:LN1/f$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, Lf2/z0;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, Lf2/z0;-><init>(LN1/i;LN1/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lf2/a;->c()LN1/i;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p0, v1}, Lh2/C;->c(LN1/i;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :try_start_0
    invoke-static {v0, v0, p1}, Li2/b;->b(Lh2/x;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0, v1}, Lh2/C;->a(LN1/i;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object p1, v0

    .line 65
    invoke-static {p0, v1}, Lh2/C;->a(LN1/i;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    new-instance v3, Lf2/J;

    .line 70
    .line 71
    invoke-direct {v3, p0, p2}, Lf2/J;-><init>(LN1/i;LN1/e;)V

    .line 72
    .line 73
    .line 74
    const/4 v6, 0x4

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    move-object v4, v3

    .line 78
    move-object v2, p1

    .line 79
    invoke-static/range {v2 .. v7}, Li2/a;->d(LW1/p;Ljava/lang/Object;LN1/e;LW1/l;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Lf2/J;->E0()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_0
    invoke-static {}, LO1/b;->e()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p0, p1, :cond_2

    .line 91
    .line 92
    invoke-static {p2}, LP1/g;->c(LN1/e;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    return-object p0
.end method
