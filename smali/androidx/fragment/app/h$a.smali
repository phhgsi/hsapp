.class Landroidx/fragment/app/h$a;
.super Landroidx/fragment/app/m;
.source "SourceFile"

# interfaces
.implements Landroidx/core/content/c;
.implements Landroidx/core/content/d;
.implements Lx/p;
.implements Lx/q;
.implements Landroidx/lifecycle/K;
.implements Landroidx/activity/I;
.implements Lb/e;
.implements Lf0/d;
.implements Landroidx/fragment/app/w;
.implements LJ/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic f:Landroidx/fragment/app/h;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/h$a;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public C()Landroidx/fragment/app/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroidx/fragment/app/h;->h0(Landroidx/fragment/app/Fragment;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->c()Landroidx/activity/OnBackPressedDispatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->d(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->f(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/J;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getViewModelStore()Landroidx/lifecycle/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->i(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public j(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->j(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public k(LJ/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->k(LJ/y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->l(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public n(LJ/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->n(LJ/y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->p(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->q(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r(LI/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->r(LI/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public s()Lb/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->s()Lb/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/h;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic u()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/h$a;->C()Landroidx/fragment/app/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public v()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public x(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h$a;->f:Landroidx/fragment/app/h;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lx/b;->e(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
