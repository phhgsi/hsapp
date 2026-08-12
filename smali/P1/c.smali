.class public abstract LP1/c;
.super LP1/a;
.source "SourceFile"


# instance fields
.field private final e:LN1/i;

.field private transient f:LN1/e;


# direct methods
.method public constructor <init>(LN1/e;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, LN1/e;->c()LN1/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, LP1/c;-><init>(LN1/e;LN1/i;)V

    return-void
.end method

.method public constructor <init>(LN1/e;LN1/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP1/a;-><init>(LN1/e;)V

    .line 2
    iput-object p2, p0, LP1/c;->e:LN1/i;

    return-void
.end method


# virtual methods
.method public c()LN1/i;
    .locals 1

    .line 1
    iget-object v0, p0, LP1/c;->e:LN1/i;

    .line 2
    .line 3
    invoke-static {v0}, LX1/k;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected l()V
    .locals 3

    .line 1
    iget-object v0, p0, LP1/c;->f:LN1/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LP1/c;->c()LN1/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LN1/f;->a:LN1/f$b;

    .line 12
    .line 13
    invoke-interface {v1, v2}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, LN1/f;

    .line 21
    .line 22
    invoke-interface {v1, v0}, LN1/f;->q(LN1/e;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, LP1/b;->d:LP1/b;

    .line 26
    .line 27
    iput-object v0, p0, LP1/c;->f:LN1/e;

    .line 28
    .line 29
    return-void
.end method

.method public final m()LN1/e;
    .locals 2

    .line 1
    iget-object v0, p0, LP1/c;->f:LN1/e;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, LP1/c;->c()LN1/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, LN1/f;->a:LN1/f$b;

    .line 10
    .line 11
    invoke-interface {v0, v1}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LN1/f;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p0}, LN1/f;->l(LN1/e;)LN1/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    move-object v0, p0

    .line 26
    :cond_1
    iput-object v0, p0, LP1/c;->f:LN1/e;

    .line 27
    .line 28
    :cond_2
    return-object v0
.end method
