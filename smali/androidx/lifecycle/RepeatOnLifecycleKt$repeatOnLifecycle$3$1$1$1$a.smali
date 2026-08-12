.class final Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;
.super LP1/k;
.source "SourceFile"

# interfaces
.implements LW1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;->d(Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field h:Ljava/lang/Object;

.field i:Ljava/lang/Object;

.field j:I

.field final synthetic k:LW1/p;


# direct methods
.method constructor <init>(Lk2/a;LW1/p;LN1/e;)V
    .locals 0

    .line 1
    iput-object p2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->k:LW1/p;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, LP1/k;-><init>(ILN1/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lf2/z;

    check-cast p2, LN1/e;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->n(Lf2/z;LN1/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;LN1/e;)LN1/e;
    .locals 2

    .line 1
    new-instance p1, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->k:LW1/p;

    .line 5
    .line 6
    invoke-direct {p1, v0, v1, p2}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;-><init>(Lk2/a;LW1/p;LN1/e;)V

    .line 7
    .line 8
    .line 9
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, LO1/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->j:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    if-eq v1, v4, :cond_0

    .line 15
    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->h:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v0}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-static {p1}, LL1/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LW1/p;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v2}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :try_start_1
    new-instance p1, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a;

    .line 46
    .line 47
    invoke-direct {p1, v1, v3}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a;-><init>(LW1/p;LN1/e;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->h:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v3, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->i:Ljava/lang/Object;

    .line 53
    .line 54
    iput v4, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->j:I

    .line 55
    .line 56
    invoke-static {p1, p0}, Lf2/A;->b(LW1/p;LN1/e;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    :goto_0
    sget-object p1, LL1/t;->a:LL1/t;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    throw v3

    .line 66
    :catchall_0
    throw v3

    .line 67
    :cond_3
    invoke-static {p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->k:LW1/p;

    .line 71
    .line 72
    iput-object v3, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->h:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object p1, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->i:Ljava/lang/Object;

    .line 75
    .line 76
    iput v2, p0, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->j:I

    .line 77
    .line 78
    throw v3
.end method

.method public final n(Lf2/z;LN1/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->g(Ljava/lang/Object;LN1/e;)LN1/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;

    .line 6
    .line 7
    sget-object p2, LL1/t;->a:LL1/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
