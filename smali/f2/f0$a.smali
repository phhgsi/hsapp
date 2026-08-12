.class public abstract Lf2/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lf2/f0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Lf2/f0;->A(Ljava/util/concurrent/CancellationException;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static b(Lf2/f0;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LN1/i$b$a;->a(LN1/i$b;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c(Lf2/f0;LN1/i$c;)LN1/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->b(LN1/i$b;LN1/i$c;)LN1/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static d(Lf2/f0;LN1/i$c;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->c(LN1/i$b;LN1/i$c;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static e(Lf2/f0;LN1/i;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->d(LN1/i$b;LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
