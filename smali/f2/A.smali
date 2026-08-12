.class public abstract Lf2/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN1/i;)Lf2/z;
    .locals 3

    .line 1
    new-instance v0, Lh2/d;

    .line 2
    .line 3
    sget-object v1, Lf2/f0;->c:Lf2/f0$b;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2, v1, v2}, Lf2/j0;->b(Lf2/f0;ILjava/lang/Object;)Lf2/p;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p0, v1}, LN1/i;->p(LN1/i;)LN1/i;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-direct {v0, p0}, Lh2/d;-><init>(LN1/i;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static final b(LW1/p;LN1/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lh2/x;

    .line 2
    .line 3
    invoke-interface {p1}, LN1/e;->c()LN1/i;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Lh2/x;-><init>(LN1/i;LN1/e;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v0, p0}, Li2/b;->b(Lh2/x;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, LO1/b;->e()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, LP1/g;->c(LN1/e;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object p0
.end method
