.class public final LJ/w0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LJ/w0$g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LJ/w0$f;

    invoke-direct {v0}, LJ/w0$f;-><init>()V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LJ/w0$e;

    invoke-direct {v0}, LJ/w0$e;-><init>()V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, LJ/w0$d;

    invoke-direct {v0}, LJ/w0$d;-><init>()V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, LJ/w0$c;

    invoke-direct {v0}, LJ/w0$c;-><init>()V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    .line 7
    :cond_3
    new-instance v0, LJ/w0$b;

    invoke-direct {v0}, LJ/w0$b;-><init>()V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void
.end method

.method public constructor <init>(LJ/w0;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 10
    new-instance v0, LJ/w0$f;

    invoke-direct {v0, p1}, LJ/w0$f;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 11
    new-instance v0, LJ/w0$e;

    invoke-direct {v0, p1}, LJ/w0$e;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 12
    new-instance v0, LJ/w0$d;

    invoke-direct {v0, p1}, LJ/w0$d;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 13
    new-instance v0, LJ/w0$c;

    invoke-direct {v0, p1}, LJ/w0$c;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void

    .line 14
    :cond_3
    new-instance v0, LJ/w0$b;

    invoke-direct {v0, p1}, LJ/w0$b;-><init>(LJ/w0;)V

    iput-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    return-void
.end method


# virtual methods
.method public a()LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/w0$g;->b()LJ/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(ILz/e;)LJ/w0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LJ/w0$g;->c(ILz/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Lz/e;)LJ/w0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$g;->e(Lz/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(Lz/e;)LJ/w0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LJ/w0$a;->a:LJ/w0$g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ/w0$g;->g(Lz/e;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
