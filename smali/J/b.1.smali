.class public abstract LJ/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/b$b;,
        LJ/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:LJ/b$a;

.field private c:LJ/b$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(Landroid/view/MenuItem;)Landroid/view/View;
.end method

.method public abstract d()Z
.end method

.method public abstract e(Landroid/view/SubMenu;)V
.end method

.method public abstract f()Z
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LJ/b;->c:LJ/b$b;

    .line 3
    .line 4
    iput-object v0, p0, LJ/b;->b:LJ/b$a;

    .line 5
    .line 6
    return-void
.end method

.method public h(LJ/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ/b;->b:LJ/b$a;

    .line 2
    .line 3
    return-void
.end method

.method public abstract i(LJ/b$b;)V
.end method
