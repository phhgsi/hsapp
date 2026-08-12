.class public abstract Lj1/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lj1/G;
    .locals 1

    .line 1
    instance-of v0, p0, Lj1/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lj1/G;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lj1/k;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lj1/k;-><init>(Ljava/util/Comparator;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static c()Lj1/G;
    .locals 1

    .line 1
    sget-object v0, Lj1/D;->d:Lj1/D;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Lj1/o;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj1/o;->r(Ljava/util/Comparator;Ljava/lang/Iterable;)Lj1/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
.end method

.method d()Lj1/G;
    .locals 1

    .line 1
    invoke-static {}, Lj1/z;->b()Li1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lj1/G;->e(Li1/c;)Lj1/G;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public e(Li1/c;)Lj1/G;
    .locals 1

    .line 1
    new-instance v0, Lj1/f;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lj1/f;-><init>(Li1/c;Lj1/G;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
