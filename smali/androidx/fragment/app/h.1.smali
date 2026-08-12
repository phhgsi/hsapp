.class public abstract Landroidx/fragment/app/h;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"

# interfaces
.implements Lx/b$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/h$a;
    }
.end annotation


# instance fields
.field A:Z

.field final w:Landroidx/fragment/app/k;

.field final x:Landroidx/lifecycle/o;

.field y:Z

.field z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/h$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/fragment/app/h$a;-><init>(Landroidx/fragment/app/h;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Landroidx/fragment/app/k;->b(Landroidx/fragment/app/m;)Landroidx/fragment/app/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/o;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Landroidx/lifecycle/o;-><init>(Landroidx/lifecycle/n;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Landroidx/fragment/app/h;->A:Z

    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/fragment/app/h;->e0()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic Y(Landroidx/fragment/app/h;Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/k;->a(Landroidx/fragment/app/Fragment;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic Z(Landroidx/fragment/app/h;Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a0(Landroidx/fragment/app/h;)Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/h;->f0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/h$a;->ON_STOP:Landroidx/lifecycle/h$a;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic b0(Landroidx/fragment/app/h;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private e0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/fragment/app/d;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Landroidx/fragment/app/d;-><init>(Landroidx/fragment/app/h;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "android:support:lifecycle"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/a;->h(Ljava/lang/String;Landroidx/savedstate/a$c;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/e;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/h;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->r(LI/a;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroidx/fragment/app/f;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/h;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->O(LI/a;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Landroidx/fragment/app/g;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/h;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->N(La/b;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static g0(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/h$b;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->t0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getHost()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, p1}, Landroidx/fragment/app/h;->g0(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/h$b;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    or-int/2addr v0, v2

    .line 40
    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/D;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/fragment/app/D;->getLifecycle()Landroidx/lifecycle/h;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v4, Landroidx/lifecycle/h$b;->g:Landroidx/lifecycle/h$b;

    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroidx/lifecycle/h$b;->b(Landroidx/lifecycle/h$b;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/D;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroidx/fragment/app/D;->g(Landroidx/lifecycle/h$b;)V

    .line 64
    .line 65
    .line 66
    move v0, v3

    .line 67
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/o;

    .line 68
    .line 69
    invoke-virtual {v2}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/h$b;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    sget-object v4, Landroidx/lifecycle/h$b;->g:Landroidx/lifecycle/h$b;

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Landroidx/lifecycle/h$b;->b(Landroidx/lifecycle/h$b;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/o;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroidx/lifecycle/o;->m(Landroidx/lifecycle/h$b;)V

    .line 84
    .line 85
    .line 86
    move v0, v3

    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return v0
.end method


# virtual methods
.method public final b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method final c0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/k;->n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d0()Landroidx/fragment/app/FragmentManager;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->l()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Lx/g;->v([Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Local FragmentActivity "

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, " State:"

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "  "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "mCreated="

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v1, p0, Landroidx/fragment/app/h;->y:Z

    .line 61
    .line 62
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 63
    .line 64
    .line 65
    const-string v1, " mResumed="

    .line 66
    .line 67
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Landroidx/fragment/app/h;->z:Z

    .line 71
    .line 72
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 73
    .line 74
    .line 75
    const-string v1, " mStopped="

    .line 76
    .line 77
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Landroidx/fragment/app/h;->A:Z

    .line 81
    .line 82
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/n;)Landroidx/loader/app/a;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v0, p2, p3, p4}, Landroidx/loader/app/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/fragment/app/k;->l()Landroidx/fragment/app/FragmentManager;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/FragmentManager;->X(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method f0()V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/h;->d0()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/lifecycle/h$b;->f:Landroidx/lifecycle/h$b;

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroidx/fragment/app/h;->g0(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/h$b;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void
.end method

.method public h0(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/h$a;->ON_RESUME:Landroidx/lifecycle/h$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/k;->h()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/h$a;->ON_CREATE:Landroidx/lifecycle/h$a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/k;->e()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/h;->c0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/h;->c0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/k;->f()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 10
    .line 11
    sget-object v1, Landroidx/lifecycle/h$a;->ON_DESTROY:Landroidx/lifecycle/h$a;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v0, 0x6

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroidx/fragment/app/k;->d(Landroid/view/MenuItem;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/h;->z:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/k;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 13
    .line 14
    sget-object v1, Landroidx/lifecycle/h$a;->ON_PAUSE:Landroidx/lifecycle/h$a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method protected onPostResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/h;->i0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/h;->z:Z

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/k;->k()Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/h;->A:Z

    .line 11
    .line 12
    iget-boolean v0, p0, Landroidx/fragment/app/h;->y:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Landroidx/fragment/app/h;->y:Z

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/fragment/app/k;->c()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/k;->k()Z

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 30
    .line 31
    sget-object v1, Landroidx/lifecycle/h$a;->ON_START:Landroidx/lifecycle/h$a;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/fragment/app/k;->i()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/k;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/h;->A:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/h;->f0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/h;->w:Landroidx/fragment/app/k;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/k;->j()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/h;->x:Landroidx/lifecycle/o;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/h$a;->ON_STOP:Landroidx/lifecycle/h$a;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/o;->h(Landroidx/lifecycle/h$a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
