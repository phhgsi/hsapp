.class LJ/w0$k;
.super LJ/w0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# instance fields
.field private o:Lz/e;

.field private p:Lz/e;

.field private q:Lz/e;


# direct methods
.method constructor <init>(LJ/w0;LJ/w0$k;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, LJ/w0$j;-><init>(LJ/w0;LJ/w0$j;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, LJ/w0$k;->o:Lz/e;

    .line 7
    iput-object p1, p0, LJ/w0$k;->p:Lz/e;

    .line 8
    iput-object p1, p0, LJ/w0$k;->q:Lz/e;

    return-void
.end method

.method constructor <init>(LJ/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LJ/w0$j;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LJ/w0$k;->o:Lz/e;

    .line 3
    iput-object p1, p0, LJ/w0$k;->p:Lz/e;

    .line 4
    iput-object p1, p0, LJ/w0$k;->q:Lz/e;

    return-void
.end method


# virtual methods
.method h()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$k;->p:Lz/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LJ/I0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lz/e;->d(Landroid/graphics/Insets;)Lz/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LJ/w0$k;->p:Lz/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LJ/w0$k;->p:Lz/e;

    .line 18
    .line 19
    return-object v0
.end method

.method j()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$k;->o:Lz/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LJ/J0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lz/e;->d(Landroid/graphics/Insets;)Lz/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LJ/w0$k;->o:Lz/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LJ/w0$k;->o:Lz/e;

    .line 18
    .line 19
    return-object v0
.end method

.method l()Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$k;->q:Lz/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LJ/G0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lz/e;->d(Landroid/graphics/Insets;)Lz/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LJ/w0$k;->q:Lz/e;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LJ/w0$k;->q:Lz/e;

    .line 18
    .line 19
    return-object v0
.end method

.method m(IIII)LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, LJ/H0;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LJ/w0;->y(Landroid/view/WindowInsets;)LJ/w0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public s(Lz/e;)V
    .locals 0

    .line 1
    return-void
.end method
