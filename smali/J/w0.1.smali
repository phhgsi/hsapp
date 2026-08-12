.class public LJ/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/w0$n;,
        LJ/w0$o;,
        LJ/w0$m;,
        LJ/w0$l;,
        LJ/w0$k;,
        LJ/w0$j;,
        LJ/w0$i;,
        LJ/w0$h;,
        LJ/w0$p;,
        LJ/w0$a;,
        LJ/w0$r;,
        LJ/w0$q;,
        LJ/w0$f;,
        LJ/w0$e;,
        LJ/w0$d;,
        LJ/w0$c;,
        LJ/w0$b;,
        LJ/w0$g;
    }
.end annotation


# static fields
.field public static final b:LJ/w0;


# instance fields
.field private final a:LJ/w0$o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, LJ/w0$n;->s:LJ/w0;

    .line 8
    .line 9
    sput-object v0, LJ/w0;->b:LJ/w0;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/16 v1, 0x1e

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    sget-object v0, LJ/w0$l;->r:LJ/w0;

    .line 17
    .line 18
    sput-object v0, LJ/w0;->b:LJ/w0;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v0, LJ/w0$o;->b:LJ/w0;

    .line 22
    .line 23
    sput-object v0, LJ/w0;->b:LJ/w0;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(LJ/w0;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_7

    .line 10
    iget-object p1, p1, LJ/w0;->a:LJ/w0$o;

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LJ/w0$n;

    if-eqz v1, :cond_0

    .line 12
    new-instance v0, LJ/w0$n;

    move-object v1, p1

    check-cast v1, LJ/w0$n;

    invoke-direct {v0, p0, v1}, LJ/w0$n;-><init>(LJ/w0;LJ/w0$n;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 13
    instance-of v1, p1, LJ/w0$m;

    if-eqz v1, :cond_1

    .line 14
    new-instance v0, LJ/w0$m;

    move-object v1, p1

    check-cast v1, LJ/w0$m;

    invoke-direct {v0, p0, v1}, LJ/w0$m;-><init>(LJ/w0;LJ/w0$m;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 15
    instance-of v1, p1, LJ/w0$l;

    if-eqz v1, :cond_2

    .line 16
    new-instance v0, LJ/w0$l;

    move-object v1, p1

    check-cast v1, LJ/w0$l;

    invoke-direct {v0, p0, v1}, LJ/w0$l;-><init>(LJ/w0;LJ/w0$l;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 17
    instance-of v1, p1, LJ/w0$k;

    if-eqz v1, :cond_3

    .line 18
    new-instance v0, LJ/w0$k;

    move-object v1, p1

    check-cast v1, LJ/w0$k;

    invoke-direct {v0, p0, v1}, LJ/w0$k;-><init>(LJ/w0;LJ/w0$k;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 19
    instance-of v0, p1, LJ/w0$j;

    if-eqz v0, :cond_4

    .line 20
    new-instance v0, LJ/w0$j;

    move-object v1, p1

    check-cast v1, LJ/w0$j;

    invoke-direct {v0, p0, v1}, LJ/w0$j;-><init>(LJ/w0;LJ/w0$j;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    .line 21
    :cond_4
    instance-of v0, p1, LJ/w0$i;

    if-eqz v0, :cond_5

    .line 22
    new-instance v0, LJ/w0$i;

    move-object v1, p1

    check-cast v1, LJ/w0$i;

    invoke-direct {v0, p0, v1}, LJ/w0$i;-><init>(LJ/w0;LJ/w0$i;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    .line 23
    :cond_5
    instance-of v0, p1, LJ/w0$h;

    if-eqz v0, :cond_6

    .line 24
    new-instance v0, LJ/w0$h;

    move-object v1, p1

    check-cast v1, LJ/w0$h;

    invoke-direct {v0, p0, v1}, LJ/w0$h;-><init>(LJ/w0;LJ/w0$h;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    goto :goto_0

    .line 25
    :cond_6
    new-instance v0, LJ/w0$o;

    invoke-direct {v0, p0}, LJ/w0$o;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 26
    :goto_0
    invoke-virtual {p1, p0}, LJ/w0$o;->e(LJ/w0;)V

    return-void

    .line 27
    :cond_7
    new-instance p1, LJ/w0$o;

    invoke-direct {p1, p0}, LJ/w0$o;-><init>(LJ/w0;)V

    iput-object p1, p0, LJ/w0;->a:LJ/w0$o;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LJ/w0$n;

    invoke-direct {v0, p0, p1}, LJ/w0$n;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LJ/w0$m;

    invoke-direct {v0, p0, p1}, LJ/w0$m;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, LJ/w0$l;

    invoke-direct {v0, p0, p1}, LJ/w0$l;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, LJ/w0$k;

    invoke-direct {v0, p0, p1}, LJ/w0$k;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 7
    new-instance v0, LJ/w0$j;

    invoke-direct {v0, p0, p1}, LJ/w0$j;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void

    .line 8
    :cond_4
    new-instance v0, LJ/w0$i;

    invoke-direct {v0, p0, p1}, LJ/w0$i;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LJ/w0;->a:LJ/w0$o;

    return-void
.end method

.method static p(Lz/e;IIII)Lz/e;
    .locals 5

    .line 1
    iget v0, p0, Lz/e;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, Lz/e;->b:I

    .line 10
    .line 11
    sub-int/2addr v2, p2

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lz/e;->c:I

    .line 17
    .line 18
    sub-int/2addr v3, p3

    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, Lz/e;->d:I

    .line 24
    .line 25
    sub-int/2addr v4, p4

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, p1, :cond_0

    .line 31
    .line 32
    if-ne v2, p2, :cond_0

    .line 33
    .line 34
    if-ne v3, p3, :cond_0

    .line 35
    .line 36
    if-ne v1, p4, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0, v2, v3, v1}, Lz/e;->b(IIII)Lz/e;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static y(Landroid/view/WindowInsets;)LJ/w0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, LJ/w0;->z(Landroid/view/WindowInsets;Landroid/view/View;)LJ/w0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static z(Landroid/view/WindowInsets;Landroid/view/View;)LJ/w0;
    .locals 1

    .line 1
    new-instance v0, LJ/w0;

    .line 2
    .line 3
    invoke-static {p0}, LI/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/WindowInsets;

    .line 8
    .line 9
    invoke-direct {v0, p0}, LJ/w0;-><init>(Landroid/view/WindowInsets;)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, LJ/W;->D(Landroid/view/View;)LJ/w0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, LJ/w0;->u(LJ/w0;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, LJ/w0;->d(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-virtual {v0, p0}, LJ/w0;->w(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->a()LJ/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->b()LJ/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->c()LJ/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->d(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()LJ/r;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->f()LJ/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LJ/w0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LJ/w0;

    .line 12
    .line 13
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 14
    .line 15
    iget-object p1, p1, LJ/w0;->a:LJ/w0$o;

    .line 16
    .line 17
    invoke-static {v0, p1}, LI/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public f(I)Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->g(I)Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public g()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->i()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->j()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, LJ/w0$o;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lz/e;->d:I

    .line 8
    .line 9
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lz/e;->a:I

    .line 8
    .line 9
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lz/e;->c:I

    .line 8
    .line 9
    return v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lz/e;->b:I

    .line 8
    .line 9
    return v0
.end method

.method public m()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public n()Z
    .locals 2

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->k()Lz/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lz/e;->e:Lz/e;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lz/e;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    return v0
.end method

.method public o(IIII)LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LJ/w0$o;->m(IIII)LJ/w0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$o;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r(IIII)LJ/w0;
    .locals 1

    .line 1
    new-instance v0, LJ/w0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJ/w0$a;-><init>(LJ/w0;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3, p4}, Lz/e;->b(IIII)Lz/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LJ/w0$a;->d(Lz/e;)LJ/w0$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, LJ/w0$a;->a()LJ/w0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method s([Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->p([Lz/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method t(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->q(Lz/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method u(LJ/w0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->r(LJ/w0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method v(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->s(Lz/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method w(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$o;->t(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, LJ/w0;->a:LJ/w0$o;

    .line 2
    .line 3
    instance-of v1, v0, LJ/w0$h;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LJ/w0$h;

    .line 8
    .line 9
    iget-object v0, v0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method
