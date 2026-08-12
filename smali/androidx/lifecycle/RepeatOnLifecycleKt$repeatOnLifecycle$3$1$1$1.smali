.class final Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# instance fields
.field final synthetic d:Landroidx/lifecycle/h$a;

.field final synthetic e:LX1/r;

.field final synthetic f:Lf2/z;

.field final synthetic g:Landroidx/lifecycle/h$a;

.field final synthetic h:Lf2/i;

.field final synthetic i:LW1/p;


# virtual methods
.method public final d(Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V
    .locals 7

    .line 1
    const-string v0, "<anonymous parameter 0>"

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
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->d:Landroidx/lifecycle/h$a;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-ne p2, p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->e:LX1/r;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->f:Lf2/z;

    .line 19
    .line 20
    new-instance v4, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;

    .line 21
    .line 22
    iget-object p2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->i:LW1/p;

    .line 23
    .line 24
    invoke-direct {v4, v0, p2, v0}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;-><init>(Lk2/a;LW1/p;LN1/e;)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, Lf2/f;->d(Lf2/z;LN1/i;Lf2/B;LW1/p;ILjava/lang/Object;)Lf2/f0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p1, LX1/r;->d:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->g:Landroidx/lifecycle/h$a;

    .line 39
    .line 40
    if-ne p2, p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->e:LX1/r;

    .line 43
    .line 44
    iget-object p1, p1, LX1/r;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lf2/f0;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-static {p1, v0, v1, v0}, Lf2/f0$a;->a(Lf2/f0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->e:LX1/r;

    .line 55
    .line 56
    iput-object v0, p1, LX1/r;->d:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_2
    sget-object p1, Landroidx/lifecycle/h$a;->ON_DESTROY:Landroidx/lifecycle/h$a;

    .line 59
    .line 60
    if-ne p2, p1, :cond_3

    .line 61
    .line 62
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->h:Lf2/i;

    .line 63
    .line 64
    sget-object p2, LL1/m;->d:LL1/m$a;

    .line 65
    .line 66
    sget-object p2, LL1/t;->a:LL1/t;

    .line 67
    .line 68
    invoke-static {p2}, LL1/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p1, p2}, LN1/e;->j(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
.end method
