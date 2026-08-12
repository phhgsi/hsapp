.class public final Lm0/W0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Lco/median/android/widget/GoNativeDrawerLayout;

.field private c:Landroidx/appcompat/app/b;

.field private final d:Lcom/google/android/material/navigation/NavigationView;

.field private final e:Landroid/widget/RelativeLayout;

.field private final f:Landroid/widget/ExpandableListView;

.field private final g:Lm0/V;

.field private final h:Ljava/util/Map;

.field private i:Z

.field private j:Z

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 2

    .line 1
    const-string v0, "main"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    const v0, 0x7f0900b8

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "findViewById(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, Lco/median/android/widget/GoNativeDrawerLayout;

    .line 24
    .line 25
    iput-object v0, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 26
    .line 27
    const v0, 0x7f090151

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 38
    .line 39
    iput-object v0, p0, Lm0/W0;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 40
    .line 41
    const v1, 0x7f0900e8

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 49
    .line 50
    iput-object v1, p0, Lm0/W0;->e:Landroid/widget/RelativeLayout;

    .line 51
    .line 52
    const v1, 0x7f0900b9

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/widget/ExpandableListView;

    .line 60
    .line 61
    iput-object v0, p0, Lm0/W0;->f:Landroid/widget/ExpandableListView;

    .line 62
    .line 63
    new-instance v1, Lm0/V;

    .line 64
    .line 65
    invoke-direct {v1, p1, v0}, Lm0/V;-><init>(Lco/median/android/MainActivity;Landroid/widget/ExpandableListView;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lm0/W0;->g:Lm0/V;

    .line 69
    .line 70
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lm0/W0;->h:Ljava/util/Map;

    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Lm0/W0;->i:Z

    .line 79
    .line 80
    iput-boolean v0, p0, Lm0/W0;->j:Z

    .line 81
    .line 82
    const-string v0, "default"

    .line 83
    .line 84
    iput-object v0, p0, Lm0/W0;->k:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v0, Lm0/W0$a;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Lm0/W0$a;-><init>(Lm0/W0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lo0/a;->a(Lo0/d$a;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public static synthetic a(Lm0/W0;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lm0/W0;->n(Lm0/W0;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lm0/W0;)Lco/median/android/widget/GoNativeDrawerLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method private final g(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/W0;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, p1, v1}, Lco/median/android/A;->d(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method private final k(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm0/W0;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, v0, Lo0/a;->W:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 18
    .line 19
    xor-int/lit8 v2, p1, 0x1

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p0, Lm0/W0;->j:Z

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    iget-boolean v1, v0, Lo0/a;->x0:Z

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    :cond_2
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object v1, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    const v2, 0x7f090212

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v1, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->t(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v0, Lo0/a;->P0:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iget-object p1, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const v2, 0x7f070055

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iget-object v2, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 87
    .line 88
    const v3, 0x7f0603d4

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v3}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    new-instance v3, Ln0/a;

    .line 96
    .line 97
    iget-object v4, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 98
    .line 99
    iget-object v0, v0, Lo0/a;->P0:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v3, v4, v0, p1, v2}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/a;->w(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_0
    return-void
.end method

.method private final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Lo0/a;->J0:Z

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v0, Lo0/a;->K0:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lm0/W0;->e:Landroid/widget/RelativeLayout;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean v1, v0, Lo0/a;->J0:Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lm0/W0;->e:Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    const v3, 0x7f090058

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/widget/ImageView;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, Lm0/W0;->e:Landroid/widget/RelativeLayout;

    .line 43
    .line 44
    const v2, 0x7f090059

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    iget-boolean v2, v0, Lo0/a;->K0:Z

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lo0/a;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    const/4 v0, 0x4

    .line 66
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method private static final n(Lm0/W0;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm0/W0;->e()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lm0/W0;->g(Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/W0;->g:Lm0/V;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm0/V;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lo0/a;->u(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p0, p1}, Lm0/W0;->k(Z)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 20
    .line 21
    const v1, 0x800003

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->s(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 v1, 0x1

    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 32
    .line 33
    iget-boolean v0, v0, Lo0/a;->f0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m1()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 47
    :goto_0
    invoke-virtual {p1, v1}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Lco/median/android/MainActivity;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/W0;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->F(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final i(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "menuItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b;->h(Landroid/view/MenuItem;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    return v1
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm0/W0;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 8
    .line 9
    iget-object v2, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const v3, 0x7f0603c1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lm0/W0;->g:Lm0/V;

    .line 26
    .line 27
    invoke-virtual {v0}, Lm0/V;->m()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Lm0/W0;->i:Z

    .line 2
    .line 3
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 12
    .line 13
    iget-object v1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 14
    .line 15
    new-instance v2, Lm0/W0$b;

    .line 16
    .line 17
    invoke-direct {v2, p0, v0, p1, v1}, Lm0/W0$b;-><init>(Lm0/W0;Lo0/a;Lco/median/android/MainActivity;Lco/median/android/widget/GoNativeDrawerLayout;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    invoke-virtual {v2, p1}, Landroidx/appcompat/app/b;->j(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroidx/appcompat/app/b;->e()Lf/d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    const v1, 0x7f0603d4

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v0}, Lf/d;->c(I)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 41
    .line 42
    :cond_0
    iget-object p1, p0, Lm0/W0;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 43
    .line 44
    new-instance v0, Lm0/V0;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lm0/V0;-><init>(Lm0/W0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$d;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lm0/W0;->l()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lm0/W0;->k:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lm0/W0;->r(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final o(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p1, p0, Lm0/W0;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->Q(Landroidx/drawerlayout/widget/DrawerLayout$d;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final p(Landroid/content/res/Configuration;)LL1/t;
    .locals 1

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b;->g(Landroid/content/res/Configuration;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, LL1/t;->a:LL1/t;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public final q()LL1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/W0;->c:Landroidx/appcompat/app/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/app/b;->l()V

    .line 6
    .line 7
    .line 8
    sget-object v0, LL1/t;->a:LL1/t;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm0/W0;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lm0/W0;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Lo0/a;->X:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lorg/json/JSONArray;

    .line 21
    .line 22
    iget-object v0, p0, Lm0/W0;->g:Lm0/V;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lm0/V;->n(Lorg/json/JSONArray;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
