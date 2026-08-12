.class public Lh2/x;
.super Lf2/a;
.source "SourceFile"

# interfaces
.implements LP1/d;


# instance fields
.field public final g:LN1/e;


# direct methods
.method public constructor <init>(LN1/i;LN1/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lf2/a;-><init>(LN1/i;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lh2/x;->g:LN1/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method protected A0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/x;->g:LN1/e;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lf2/u;->a(Ljava/lang/Object;LN1/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LN1/e;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected final b0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final e()LP1/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lh2/x;->g:LN1/e;

    .line 2
    .line 3
    instance-of v1, v0, LP1/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LP1/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method protected t(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh2/x;->g:LN1/e;

    .line 2
    .line 3
    invoke-static {v0}, LO1/b;->c(LN1/e;)LN1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lh2/x;->g:LN1/e;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lf2/u;->a(Ljava/lang/Object;LN1/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v0, p1, v1, v2, v1}, Lh2/i;->c(LN1/e;Ljava/lang/Object;LW1/l;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
