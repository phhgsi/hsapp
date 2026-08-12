.class final Lm0/O0$a$b;
.super LP1/k;
.source "SourceFile"

# interfaces
.implements LW1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/O0$a;->k(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field h:I

.field final synthetic i:Lm0/s;

.field final synthetic j:Landroid/content/Context;

.field final synthetic k:Ljava/io/File;


# direct methods
.method constructor <init>(Lm0/s;Landroid/content/Context;Ljava/io/File;LN1/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/O0$a$b;->i:Lm0/s;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/O0$a$b;->j:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lm0/O0$a$b;->k:Ljava/io/File;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, LP1/k;-><init>(ILN1/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lf2/z;

    .line 2
    .line 3
    check-cast p2, LN1/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm0/O0$a$b;->n(Lf2/z;LN1/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final g(Ljava/lang/Object;LN1/e;)LN1/e;
    .locals 3

    .line 1
    new-instance p1, Lm0/O0$a$b;

    .line 2
    .line 3
    iget-object v0, p0, Lm0/O0$a$b;->i:Lm0/s;

    .line 4
    .line 5
    iget-object v1, p0, Lm0/O0$a$b;->j:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lm0/O0$a$b;->k:Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lm0/O0$a$b;-><init>(Lm0/s;Landroid/content/Context;Ljava/io/File;LN1/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, LO1/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lm0/O0$a$b;->h:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lm0/O0$a$b;->i:Lm0/s;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lm0/O0$a$b;->j:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v1, p0, Lm0/O0$a$b;->k:Ljava/io/File;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lm0/O0;->a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1, v0}, Lm0/s;->a(Landroid/net/Uri;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, LL1/t;->a:LL1/t;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final n(Lf2/z;LN1/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lm0/O0$a$b;->g(Ljava/lang/Object;LN1/e;)LN1/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lm0/O0$a$b;

    .line 6
    .line 7
    sget-object p2, LL1/t;->a:LL1/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lm0/O0$a$b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
