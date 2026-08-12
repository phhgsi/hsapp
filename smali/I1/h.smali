.class public abstract LI1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI1/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;LI1/h$a;Lp1/e;)LI1/f;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lp1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/content/Context;

    .line 8
    .line 9
    invoke-interface {p1, p2}, LI1/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1}, LI1/f;->a(Ljava/lang/String;Ljava/lang/String;)LI1/f;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lp1/c;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LI1/f;->a(Ljava/lang/String;Ljava/lang/String;)LI1/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class p1, LI1/f;

    .line 6
    .line 7
    invoke-static {p0, p1}, Lp1/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lp1/c;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static c(Ljava/lang/String;LI1/h$a;)Lp1/c;
    .locals 2

    .line 1
    const-class v0, LI1/f;

    .line 2
    .line 3
    invoke-static {v0}, Lp1/c;->m(Ljava/lang/Class;)Lp1/c$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Lp1/r;->j(Ljava/lang/Class;)Lp1/r;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, LI1/g;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, LI1/g;-><init>(Ljava/lang/String;LI1/h$a;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lp1/c$b;->d()Lp1/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
