.class Landroidx/transition/v$b;
.super Landroidx/transition/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Landroidx/transition/v;


# direct methods
.method constructor <init>(Landroidx/transition/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/transition/k;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    .line 2
    .line 3
    iget-boolean v0, p1, Landroidx/transition/v;->S:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/transition/k;->f0()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Landroidx/transition/v;->S:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public g(Landroidx/transition/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    .line 2
    .line 3
    iget v1, v0, Landroidx/transition/v;->R:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, v0, Landroidx/transition/v;->R:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, v0, Landroidx/transition/v;->S:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/transition/k;->p()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/k;->U(Landroidx/transition/k$g;)Landroidx/transition/k;

    .line 18
    .line 19
    .line 20
    return-void
.end method
