.class LW0/e$a;
.super Ly/k$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW0/e;->g(Landroid/content/Context;LW0/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LW0/g;

.field final synthetic b:LW0/e;


# direct methods
.method constructor <init>(LW0/e;LW0/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW0/e$a;->b:LW0/e;

    .line 2
    .line 3
    iput-object p2, p0, LW0/e$a;->a:LW0/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ly/k$e;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LW0/e$a;->b:LW0/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, LW0/e;->c(LW0/e;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LW0/e$a;->a:LW0/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LW0/g;->a(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, LW0/e$a;->b:LW0/e;

    .line 2
    .line 3
    iget v1, v0, LW0/e;->f:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {v0, p1}, LW0/e;->b(LW0/e;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LW0/e$a;->b:LW0/e;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {p1, v0}, LW0/e;->c(LW0/e;Z)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LW0/e$a;->a:LW0/g;

    .line 19
    .line 20
    iget-object v0, p0, LW0/e$a;->b:LW0/e;

    .line 21
    .line 22
    invoke-static {v0}, LW0/e;->a(LW0/e;)Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v0, v1}, LW0/g;->b(Landroid/graphics/Typeface;Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
