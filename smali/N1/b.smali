.class public abstract LN1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/i$c;


# instance fields
.field private final d:LW1/l;

.field private final e:LN1/i$c;


# direct methods
.method public constructor <init>(LN1/i$c;LW1/l;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "safeCast"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LN1/b;->d:LW1/l;

    .line 15
    .line 16
    instance-of p2, p1, LN1/b;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    check-cast p1, LN1/b;

    .line 21
    .line 22
    iget-object p1, p1, LN1/b;->e:LN1/i$c;

    .line 23
    .line 24
    :cond_0
    iput-object p1, p0, LN1/b;->e:LN1/i$c;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(LN1/i$c;)Z
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eq p1, p0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, LN1/b;->e:LN1/i$c;

    .line 9
    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 16
    return p1
.end method

.method public final b(LN1/i$b;)LN1/i$b;
    .locals 1

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN1/b;->d:LW1/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LW1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LN1/i$b;

    .line 13
    .line 14
    return-object p1
.end method
