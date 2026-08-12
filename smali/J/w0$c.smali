.class LJ/w0$c;
.super LJ/w0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LJ/w0$g;-><init>()V

    .line 2
    invoke-static {}, LG/j;->a()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(LJ/w0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LJ/w0$g;-><init>(LJ/w0;)V

    .line 4
    invoke-virtual {p1}, LJ/w0;->x()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LJ/C0;->a(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LG/j;->a()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method b()LJ/w0;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ/w0$g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, LG/n;->a(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LJ/w0;->y(Landroid/view/WindowInsets;)LJ/w0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LJ/w0$g;->b:[Lz/e;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LJ/w0;->s([Lz/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method d(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz/e;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LJ/A0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method e(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz/e;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LJ/y0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method f(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz/e;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LJ/z0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method g(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz/e;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LJ/x0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method h(Lz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lz/e;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, LJ/B0;->a(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method
