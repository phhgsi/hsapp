.class public abstract LN1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/i$b;


# instance fields
.field private final d:LN1/i$c;


# direct methods
.method public constructor <init>(LN1/i$c;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LN1/a;->d:LN1/i$c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b(LN1/i$c;)LN1/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->b(LN1/i$b;LN1/i$c;)LN1/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()LN1/i$c;
    .locals 1

    .line 1
    iget-object v0, p0, LN1/a;->d:LN1/i$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LN1/i$b$a;->a(LN1/i$b;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(LN1/i;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->d(LN1/i$b;LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public r(LN1/i$c;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->c(LN1/i$b;LN1/i$c;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
