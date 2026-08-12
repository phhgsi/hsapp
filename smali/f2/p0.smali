.class final Lf2/p0;
.super Lf2/v0;
.source "SourceFile"


# instance fields
.field private final g:LN1/e;


# direct methods
.method public constructor <init>(LN1/i;LW1/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lf2/v0;-><init>(LN1/i;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p0, p0}, LO1/b;->a(LW1/p;Ljava/lang/Object;LN1/e;)LN1/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lf2/p0;->g:LN1/e;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/p0;->g:LN1/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Li2/a;->b(LN1/e;LN1/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
