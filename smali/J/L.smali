.class public final LJ/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/L$b;,
        LJ/L$c;,
        LJ/L$a;
    }
.end annotation


# instance fields
.field private final a:LJ/L$c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LJ/L$b;

    invoke-direct {v0, p1}, LJ/L$b;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LJ/L;->a:LJ/L$c;

    return-void

    .line 4
    :cond_0
    new-instance v0, LJ/L$a;

    invoke-direct {v0, p1}, LJ/L$a;-><init>(Landroid/view/View;)V

    iput-object v0, p0, LJ/L;->a:LJ/L$c;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LJ/L$b;

    invoke-direct {v0, p1}, LJ/L$b;-><init>(Landroid/view/WindowInsetsController;)V

    iput-object v0, p0, LJ/L;->a:LJ/L$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/L;->a:LJ/L$c;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/L$c;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ/L;->a:LJ/L$c;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ/L$c;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
