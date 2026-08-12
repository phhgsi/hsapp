.class public final Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# instance fields
.field final synthetic d:Landroidx/lifecycle/h$b;

.field final synthetic e:Landroidx/lifecycle/h;

.field final synthetic f:Lf2/i;

.field final synthetic g:LW1/a;


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
    sget-object p1, Landroidx/lifecycle/h$a;->Companion:Landroidx/lifecycle/h$a$a;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->d:Landroidx/lifecycle/h$b;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/lifecycle/h$a$a;->c(Landroidx/lifecycle/h$b;)Landroidx/lifecycle/h$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p2, p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->e:Landroidx/lifecycle/h;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroidx/lifecycle/h;->c(Landroidx/lifecycle/m;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->f:Lf2/i;

    .line 27
    .line 28
    iget-object p2, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->g:LW1/a;

    .line 29
    .line 30
    :try_start_0
    sget-object v0, LL1/m;->d:LL1/m$a;

    .line 31
    .line 32
    invoke-interface {p2}, LW1/a;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p2}, LL1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    sget-object v0, LL1/m;->d:LL1/m$a;

    .line 43
    .line 44
    invoke-static {p2}, LL1/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, LL1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :goto_0
    invoke-interface {p1, p2}, LN1/e;->j(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    sget-object p1, Landroidx/lifecycle/h$a;->ON_DESTROY:Landroidx/lifecycle/h$a;

    .line 57
    .line 58
    if-ne p2, p1, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->e:Landroidx/lifecycle/h;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Landroidx/lifecycle/h;->c(Landroidx/lifecycle/m;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;->f:Lf2/i;

    .line 66
    .line 67
    sget-object p2, LL1/m;->d:LL1/m$a;

    .line 68
    .line 69
    new-instance p2, Landroidx/lifecycle/j;

    .line 70
    .line 71
    invoke-direct {p2}, Landroidx/lifecycle/j;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {p2}, LL1/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p2}, LL1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {p1, p2}, LN1/e;->j(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :goto_1
    return-void
.end method
