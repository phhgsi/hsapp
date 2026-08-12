.class public abstract Landroidx/lifecycle/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/K;)LX/a;
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Landroidx/lifecycle/g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroidx/lifecycle/g;

    .line 11
    .line 12
    invoke-interface {p0}, Landroidx/lifecycle/g;->getDefaultViewModelCreationExtras()LX/a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, LX/a$a;->b:LX/a$a;

    .line 18
    .line 19
    return-object p0
.end method
