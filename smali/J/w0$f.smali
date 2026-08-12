.class LJ/w0$f;
.super LJ/w0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ/w0$e;-><init>()V

    return-void
.end method

.method constructor <init>(LJ/w0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LJ/w0$e;-><init>(LJ/w0;)V

    return-void
.end method


# virtual methods
.method c(ILz/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$c;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-static {p1}, LJ/w0$r;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lz/e;->e()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {v0, p1, p2}, LJ/D0;->a(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    .line 12
    .line 13
    .line 14
    return-void
.end method
