.class abstract LO1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LW1/p;Ljava/lang/Object;LN1/e;)LN1/e;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "completion"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, LP1/g;->a(LN1/e;)LN1/e;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    instance-of v0, p0, LP1/a;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p0, LP1/a;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, LP1/a;->g(Ljava/lang/Object;LN1/e;)LN1/e;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-interface {p2}, LN1/e;->c()LN1/i;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, LN1/j;->d:LN1/j;

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    new-instance v0, LO1/c$a;

    .line 35
    .line 36
    invoke-direct {v0, p2, p0, p1}, LO1/c$a;-><init>(LN1/e;LW1/p;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    new-instance v1, LO1/c$b;

    .line 41
    .line 42
    invoke-direct {v1, p2, v0, p0, p1}, LO1/c$b;-><init>(LN1/e;LN1/i;LW1/p;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v1
.end method

.method private static final b(LN1/e;)LN1/e;
    .locals 2

    .line 1
    invoke-interface {p0}, LN1/e;->c()LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LN1/j;->d:LN1/j;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, LO1/c$c;

    .line 10
    .line 11
    invoke-direct {v0, p0}, LO1/c$c;-><init>(LN1/e;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v1, LO1/c$d;

    .line 16
    .line 17
    invoke-direct {v1, p0, v0}, LO1/c$d;-><init>(LN1/e;LN1/i;)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public static c(LN1/e;)LN1/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, LP1/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, LP1/c;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, LP1/c;->m()LN1/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    return-object v0

    .line 25
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static d(LW1/p;Ljava/lang/Object;LN1/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "completion"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, LP1/g;->a(LN1/e;)LN1/e;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, LO1/c;->b(LN1/e;)LN1/e;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {p0, v0}, LX1/u;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, LW1/p;

    .line 25
    .line 26
    invoke-interface {p0, p1, p2}, LW1/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
