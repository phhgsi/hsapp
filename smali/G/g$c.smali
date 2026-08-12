.class final LG/g$c;
.super LG/g$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private j:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field private k:Z

.field private final l:Landroid/view/ViewGroup$OnHierarchyChangeListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LG/g$b;-><init>(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LG/g$c;->k:Z

    .line 11
    .line 12
    new-instance v0, LG/g$c$a;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, LG/g$c$a;-><init>(LG/g$c;Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LG/g$c;->l:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic p(LG/g$c;LG/g$e;Landroid/window/SplashScreenView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LG/g$c;->t(LG/g$c;LG/g$e;Landroid/window/SplashScreenView;)V

    return-void
.end method

.method private final q()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const v3, 0x1010451

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-virtual {v1, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget v3, v0, Landroid/util/TypedValue;->data:I

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const v3, 0x1010452

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    iget v3, v0, Landroid/util/TypedValue;->data:I

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    const v3, 0x1010450

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget v3, v0, Landroid/util/TypedValue;->data:I

    .line 61
    .line 62
    const/high16 v4, -0x80000000

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Landroid/view/Window;->addFlags(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v2, v4}, Landroid/view/Window;->clearFlags(I)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const-string v4, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 78
    .line 79
    invoke-static {v3, v4}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    check-cast v3, Landroid/view/ViewGroup;

    .line 83
    .line 84
    invoke-static {v1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3, v0}, LG/x;->a(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 92
    .line 93
    .line 94
    iget-boolean v0, p0, LG/g$c;->k:Z

    .line 95
    .line 96
    invoke-static {v2, v0}, LG/m;->a(Landroid/view/Window;Z)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private static final t(LG/g$c;LG/g$e;Landroid/window/SplashScreenView;)V
    .locals 2

    .line 1
    const-string v0, "splashScreenView"

    .line 2
    .line 3
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, LG/g$c;->q()V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v0, LG/u;

    .line 16
    .line 17
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p2, p0}, LG/u;-><init>(Landroid/window/SplashScreenView;Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v0}, LG/g$e;->a(LG/u;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public j()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getTheme(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroid/util/TypedValue;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, LG/g$b;->m(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    .line 20
    .line 21
    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v1, 0x21

    .line 25
    .line 26
    if-ge v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 41
    .line 42
    invoke-static {v0, v1}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v0, Landroid/view/ViewGroup;

    .line 46
    .line 47
    iget-object v1, p0, LG/g$c;->l:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public k(LG/g$d;)V
    .locals 2

    .line 1
    const-string v0, "keepOnScreenCondition"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LG/g$b;->n(LG/g$d;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const v0, 0x1020002

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, LG/g$c;->j:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, LG/g$c;->j:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance v1, LG/g$c$b;

    .line 40
    .line 41
    invoke-direct {v1, p0, p1}, LG/g$c$b;-><init>(LG/g$c;Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, LG/g$c;->j:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public l(LG/g$e;)V
    .locals 2

    .line 1
    const-string v0, "exitAnimationListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LG/g$b;->h()Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LG/k;->a(Landroid/app/Activity;)Landroid/window/SplashScreen;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LG/p;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, LG/p;-><init>(LG/g$c;LG/g$e;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, LG/l;->a(Landroid/window/SplashScreen;Landroid/window/SplashScreen$OnExitAnimationListener;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final r(Landroid/window/SplashScreenView;)Z
    .locals 4

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LG/j;->a()Landroid/view/WindowInsets$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LG/n;->a(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "build(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/graphics/Rect;

    .line 20
    .line 21
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    const v3, 0x7fffffff

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2, v2, v3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, LG/o;->a(Landroid/window/SplashScreenView;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-ne v0, p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    return p1

    .line 48
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 49
    return p1
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LG/g$c;->k:Z

    .line 2
    .line 3
    return-void
.end method
