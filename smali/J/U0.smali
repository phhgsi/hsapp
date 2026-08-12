.class public final LJ/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/U0$f;,
        LJ/U0$g;,
        LJ/U0$d;,
        LJ/U0$c;,
        LJ/U0$b;,
        LJ/U0$a;,
        LJ/U0$e;
    }
.end annotation


# instance fields
.field private final a:LJ/U0$g;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LJ/L;

    invoke-direct {v0, p2}, LJ/L;-><init>(Landroid/view/View;)V

    .line 7
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt p2, v1, :cond_0

    .line 8
    new-instance p2, LJ/U0$f;

    invoke-direct {p2, p1, p0, v0}, LJ/U0$f;-><init>(Landroid/view/Window;LJ/U0;LJ/L;)V

    iput-object p2, p0, LJ/U0;->a:LJ/U0$g;

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt p2, v1, :cond_1

    .line 9
    new-instance p2, LJ/U0$d;

    invoke-direct {p2, p1, p0, v0}, LJ/U0$d;-><init>(Landroid/view/Window;LJ/U0;LJ/L;)V

    iput-object p2, p0, LJ/U0;->a:LJ/U0$g;

    return-void

    :cond_1
    const/16 v1, 0x1a

    if-lt p2, v1, :cond_2

    .line 10
    new-instance p2, LJ/U0$c;

    invoke-direct {p2, p1, v0}, LJ/U0$c;-><init>(Landroid/view/Window;LJ/L;)V

    iput-object p2, p0, LJ/U0;->a:LJ/U0$g;

    return-void

    .line 11
    :cond_2
    new-instance p2, LJ/U0$b;

    invoke-direct {p2, p1, v0}, LJ/U0$b;-><init>(Landroid/view/Window;LJ/L;)V

    iput-object p2, p0, LJ/U0;->a:LJ/U0$g;

    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LJ/U0$f;

    new-instance v1, LJ/L;

    invoke-direct {v1, p1}, LJ/L;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, LJ/U0$f;-><init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V

    iput-object v0, p0, LJ/U0;->a:LJ/U0$g;

    return-void

    .line 4
    :cond_0
    new-instance v0, LJ/U0$d;

    new-instance v1, LJ/L;

    invoke-direct {v1, p1}, LJ/L;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, p0, v1}, LJ/U0$d;-><init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V

    iput-object v0, p0, LJ/U0;->a:LJ/U0$g;

    return-void
.end method

.method public static f(Landroid/view/WindowInsetsController;)LJ/U0;
    .locals 1

    .line 1
    new-instance v0, LJ/U0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJ/U0;-><init>(Landroid/view/WindowInsetsController;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0;->a:LJ/U0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/U0$g;->a(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0;->a:LJ/U0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/U0$g;->b(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0;->a:LJ/U0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/U0$g;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0;->a:LJ/U0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/U0$g;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0;->a:LJ/U0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/U0$g;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
