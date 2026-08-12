.class public abstract Landroidx/appcompat/app/d;
.super Landroidx/fragment/app/h;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/app/e;
.implements Lx/u$a;
.implements Landroidx/appcompat/app/b$c;


# instance fields
.field private B:Landroidx/appcompat/app/g;

.field private C:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/h;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/appcompat/app/d;->l0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private l0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/appcompat/app/d$a;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Landroidx/appcompat/app/d$a;-><init>(Landroidx/appcompat/app/d;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "androidx:appcompat"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Landroidx/savedstate/a;->h(Ljava/lang/String;Landroidx/savedstate/a$c;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/appcompat/app/d$b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Landroidx/appcompat/app/d$b;-><init>(Landroidx/appcompat/app/d;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->N(La/b;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private s0(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->S()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/g;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->i(Landroid/content/Context;)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->g()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->q(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lx/g;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->l(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public g(Landroidx/appcompat/view/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->s()Landroid/view/MenuInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/d;->C:Landroid/content/res/Resources;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/appcompat/widget/o0;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/appcompat/widget/o0;

    .line 12
    .line 13
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/o0;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/appcompat/app/d;->C:Landroid/content/res/Resources;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/d;->C:Landroid/content/res/Resources;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    return-object v0
.end method

.method public h()Landroidx/appcompat/app/b$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->p()Landroidx/appcompat/app/b$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->w()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j0()Landroidx/appcompat/app/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/d;->B:Landroidx/appcompat/app/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p0}, Landroidx/appcompat/app/g;->j(Landroid/app/Activity;Landroidx/appcompat/app/e;)Landroidx/appcompat/app/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Landroidx/appcompat/app/d;->B:Landroidx/appcompat/app/g;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/d;->B:Landroidx/appcompat/app/g;

    .line 12
    .line 13
    return-object v0
.end method

.method public k0()Landroidx/appcompat/app/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->u()Landroidx/appcompat/app/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public m0(Lx/u;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lx/u;->c(Landroid/app/Activity;)Lx/u;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected n0(LE/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Landroidx/appcompat/view/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected o0(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->y(Landroid/content/res/Configuration;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/appcompat/app/d;->C:Landroid/content/res/Resources;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Landroidx/appcompat/app/d;->C:Landroid/content/res/Resources;

    .line 32
    .line 33
    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->q0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->A()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Landroidx/appcompat/app/d;->s0(Landroid/view/KeyEvent;)Z

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
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/h;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v0, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/appcompat/app/a;->j()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->r0()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->B(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->C()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->E()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/appcompat/app/g;->F()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Landroidx/appcompat/app/g;->R(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->r()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public p0(Lx/u;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q0()V
    .locals 0

    .line 1
    return-void
.end method

.method public r0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->t()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/d;->v0(Landroid/content/Intent;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lx/u;->e(Landroid/content/Context;)Lx/u;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/d;->m0(Lx/u;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/d;->p0(Lx/u;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lx/u;->f()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {p0}, Lx/b;->b(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/d;->u0(Landroid/content/Intent;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->S()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->K(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->S()V

    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->L(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->S()V

    .line 6
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/g;->M(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->Q(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public t()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-static {p0}, Lx/j;->a(Landroid/app/Activity;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public t0(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->j0()Landroidx/appcompat/app/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/g;->P(Landroidx/appcompat/widget/Toolbar;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public u(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public u0(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx/j;->e(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public v0(Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx/j;->f(Landroid/app/Activity;Landroid/content/Intent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
