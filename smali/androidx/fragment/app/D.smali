.class Landroidx/fragment/app/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g;
.implements Lf0/d;
.implements Landroidx/lifecycle/K;


# instance fields
.field private final a:Landroidx/fragment/app/Fragment;

.field private final b:Landroidx/lifecycle/J;

.field private c:Landroidx/lifecycle/o;

.field private d:Lf0/c;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/J;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/fragment/app/D;->d:Lf0/c;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/D;->a:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/fragment/app/D;->b:Landroidx/lifecycle/J;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/h$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method b()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/o;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/o;-><init>(Landroidx/lifecycle/n;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 11
    .line 12
    invoke-static {p0}, Lf0/c;->a(Lf0/d;)Lf0/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Landroidx/fragment/app/D;->d:Lf0/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf0/c;->c()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Landroidx/lifecycle/A;->c(Lf0/d;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->d:Lf0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf0/c;->d(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method f(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->d:Lf0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf0/c;->e(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method g(Landroidx/lifecycle/h$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/o;->m(Landroidx/lifecycle/h$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getDefaultViewModelCreationExtras()LX/a;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/D;->a:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_1
    new-instance v1, LX/d;

    .line 31
    .line 32
    invoke-direct {v1}, LX/d;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v2, Landroidx/lifecycle/G$a;->g:LX/a$b;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, LX/d;->c(LX/a$b;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    sget-object v0, Landroidx/lifecycle/A;->a:LX/a$b;

    .line 43
    .line 44
    invoke-virtual {v1, v0, p0}, LX/d;->c(LX/a$b;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Landroidx/lifecycle/A;->b:LX/a$b;

    .line 48
    .line 49
    invoke-virtual {v1, v0, p0}, LX/d;->c(LX/a$b;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroidx/fragment/app/D;->a:Landroidx/fragment/app/Fragment;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    sget-object v0, Landroidx/lifecycle/A;->c:LX/a$b;

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/fragment/app/D;->a:Landroidx/fragment/app/Fragment;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v0, v2}, LX/d;->c(LX/a$b;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-object v1
.end method

.method public getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/D;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/D;->c:Landroidx/lifecycle/o;

    .line 5
    .line 6
    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/D;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/D;->d:Lf0/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lf0/c;->b()Landroidx/savedstate/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/J;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/D;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/D;->b:Landroidx/lifecycle/J;

    .line 5
    .line 6
    return-object v0
.end method
