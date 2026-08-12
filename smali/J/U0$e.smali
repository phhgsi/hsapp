.class abstract LJ/U0$e;
.super LJ/U0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Window;LJ/U0;LJ/L;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJ/U0$d;-><init>(Landroid/view/Window;LJ/U0;LJ/L;)V

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LJ/U0$d;-><init>(Landroid/view/WindowInsetsController;LJ/U0;LJ/L;)V

    return-void
.end method


# virtual methods
.method d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/U0$d;->b:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    invoke-static {v0, p1}, LJ/W0;->a(Landroid/view/WindowInsetsController;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
