.class public abstract synthetic Lp1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lp1/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lp1/E;->b(Ljava/lang/Class;)Lp1/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lp1/e;->f(Lp1/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Lp1/e;Lp1/E;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lp1/e;->e(Lp1/E;)LA1/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, LA1/b;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static c(Lp1/e;Ljava/lang/Class;)LA1/b;
    .locals 0

    .line 1
    invoke-static {p1}, Lp1/E;->b(Ljava/lang/Class;)Lp1/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lp1/e;->e(Lp1/E;)LA1/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(Lp1/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p1}, Lp1/E;->b(Ljava/lang/Class;)Lp1/E;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lp1/e;->b(Lp1/E;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static e(Lp1/e;Lp1/E;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lp1/e;->g(Lp1/E;)LA1/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, LA1/b;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Set;

    .line 10
    .line 11
    return-object p0
.end method
