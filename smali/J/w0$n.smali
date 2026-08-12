.class LJ/w0$n;
.super LJ/w0$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "n"
.end annotation


# static fields
.field static final s:LJ/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LJ/L0;->a()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LJ/w0;->y(Landroid/view/WindowInsets;)LJ/w0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LJ/w0$n;->s:LJ/w0;

    .line 10
    .line 11
    return-void
.end method

.method constructor <init>(LJ/w0;LJ/w0$n;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LJ/w0$m;-><init>(LJ/w0;LJ/w0$m;)V

    return-void
.end method

.method constructor <init>(LJ/w0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LJ/w0$m;-><init>(LJ/w0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public g(I)Lz/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$h;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, LJ/w0$r;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, LJ/K0;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lz/e;->d(Landroid/graphics/Insets;)Lz/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
