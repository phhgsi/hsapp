.class public final Landroidx/lifecycle/LifecycleCoroutineScopeImpl;
.super Landroidx/lifecycle/i;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# instance fields
.field private final d:Landroidx/lifecycle/h;

.field private final e:LN1/i;


# virtual methods
.method public d(Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->i()Landroidx/lifecycle/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, Landroidx/lifecycle/h$b;->d:Landroidx/lifecycle/h$b;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-gtz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->i()Landroidx/lifecycle/h;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p0}, Landroidx/lifecycle/h;->c(Landroidx/lifecycle/m;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->f()LN1/i;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x1

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-static {p1, v0, p2, v0}, Lf2/j0;->d(LN1/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public f()LN1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->e:LN1/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Landroidx/lifecycle/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LifecycleCoroutineScopeImpl;->d:Landroidx/lifecycle/h;

    .line 2
    .line 3
    return-object v0
.end method
