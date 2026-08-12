.class LJ/U0$d;
.super LJ/U0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:LJ/U0;

.field final b:Landroid/view/WindowInsetsController;

.field final c:LJ/L;

.field private final d:Landroidx/collection/i;

.field protected e:Landroid/view/Window;


# direct methods
.method constructor <init>(Landroid/view/Window;LJ/U0;LJ/L;)V
    .locals 1

    .line 1
    invoke-static {p1}, LJ/V0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, LJ/U0$d;-><init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V

    .line 2
    iput-object p1, p0, LJ/U0$d;->e:Landroid/view/Window;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V
    .locals 1

    .line 3
    invoke-direct {p0}, LJ/U0$g;-><init>()V

    .line 4
    new-instance v0, Landroidx/collection/i;

    invoke-direct {v0}, Landroidx/collection/i;-><init>()V

    iput-object v0, p0, LJ/U0$d;->d:Landroidx/collection/i;

    .line 5
    iput-object p1, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 6
    iput-object p2, p0, LJ/U0$d;->a:LJ/U0;

    .line 7
    iput-object p3, p0, LJ/U0$d;->c:LJ/L;

    return-void
.end method


# virtual methods
.method a(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ/U0$d;->c:LJ/L;

    .line 6
    .line 7
    invoke-virtual {v0}, LJ/L;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 11
    .line 12
    and-int/lit8 p1, p1, -0x9

    .line 13
    .line 14
    invoke-static {v0, p1}, LJ/Q;->a(Landroid/view/WindowInsetsController;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LJ/U0$d;->f(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 13
    .line 14
    invoke-static {p1, v0, v0}, LG/w;->a(Landroid/view/WindowInsetsController;II)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object p1, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0}, LJ/U0$d;->g(I)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object p1, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p1, v1, v0}, LG/w;->a(Landroid/view/WindowInsetsController;II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, LJ/U0$d;->f(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    invoke-static {p1, v1, v1}, LG/w;->a(Landroid/view/WindowInsetsController;II)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object p1, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LJ/U0$d;->g(I)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object p1, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0, v1}, LG/w;->a(Landroid/view/WindowInsetsController;II)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const v2, 0x1538b9a6

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    const/16 v1, 0x1000

    .line 23
    .line 24
    const/16 v2, 0x800

    .line 25
    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, v2}, LJ/U0$d;->g(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, LJ/U0$d;->f(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0, v1}, LJ/U0$d;->g(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v2}, LJ/U0$d;->f(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const/16 p1, 0x1800

    .line 47
    .line 48
    invoke-virtual {p0, p1}, LJ/U0$d;->g(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    iget-object v0, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 53
    .line 54
    invoke-static {v0, p1}, LJ/W0;->a(Landroid/view/WindowInsetsController;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method e(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ/U0$d;->c:LJ/L;

    .line 6
    .line 7
    invoke-virtual {v0}, LJ/L;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 11
    .line 12
    and-int/lit8 p1, p1, -0x9

    .line 13
    .line 14
    invoke-static {v0, p1}, LJ/N;->a(Landroid/view/WindowInsetsController;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method protected f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    or-int/2addr p1, v1

    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected g(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ/U0$d;->e:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
