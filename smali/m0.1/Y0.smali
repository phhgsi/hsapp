.class public final Lm0/Y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/Y0$a;
    }
.end annotation


# static fields
.field public static final k:Lm0/Y0$a;


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Z

.field private c:LJ/U0;

.field private d:Landroidx/activity/K;

.field private e:Landroidx/activity/K;

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm0/Y0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm0/Y0$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm0/Y0;->k:Lm0/Y0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 2

    .line 1
    const-string v0, "mainActivity"

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
    iput-object p1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x23

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lm0/Y0;->b:Z

    .line 21
    .line 22
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Lo0/a;->F0:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lm0/Y0;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, Lo0/a;->G0:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p1, p0, Lm0/Y0;->j:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(Lm0/Y0;Landroid/view/View;LJ/w0;)LJ/w0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lm0/Y0;->j(Lm0/Y0;Landroid/view/View;LJ/w0;)LJ/w0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;I)Landroidx/activity/K;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm0/Y0;->e(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Landroidx/activity/K;->e:Landroidx/activity/K$a;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p2}, Landroidx/activity/K$a;->b(II)Landroidx/activity/K;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Landroidx/activity/K;->e:Landroidx/activity/K$a;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/activity/K$a;->a(I)Landroidx/activity/K;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final e(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v2, 0x2dddaf

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq v0, v2, :cond_3

    .line 17
    .line 18
    const v2, 0x2eef76

    .line 19
    .line 20
    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    const v2, 0x6233516

    .line 24
    .line 25
    .line 26
    if-eq v0, v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v0, "light"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "dark"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return v3

    .line 45
    :cond_3
    const-string v0, "auto"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_4

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    iget-object p1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 65
    .line 66
    and-int/lit8 p1, p1, 0x30

    .line 67
    .line 68
    const/16 v0, 0x10

    .line 69
    .line 70
    if-eq p1, v0, :cond_6

    .line 71
    .line 72
    const/16 v0, 0x20

    .line 73
    .line 74
    if-eq p1, v0, :cond_5

    .line 75
    .line 76
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "SystemBarManager"

    .line 81
    .line 82
    const-string v2, "isLightMode: Current mode is undefined"

    .line 83
    .line 84
    invoke-virtual {p1, v0, v2}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    return v3

    .line 89
    :cond_6
    :goto_0
    return v1
.end method

.method private static final j(Lm0/Y0;Landroid/view/View;LJ/w0;)LJ/w0;
    .locals 5

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 12
    .line 13
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, LJ/w0$p;->d()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p2, v1}, LJ/w0;->f(I)Lz/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "getInsets(...)"

    .line 26
    .line 27
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, v0, Lo0/a;->H0:Z

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget v2, v1, Lz/e;->b:I

    .line 38
    .line 39
    :goto_0
    invoke-static {}, LJ/w0$p;->a()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p2, v4}, LJ/w0;->f(I)Lz/e;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget p2, p2, Lz/e;->d:I

    .line 48
    .line 49
    if-lez p2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget p2, v1, Lz/e;->d:I

    .line 53
    .line 54
    :goto_1
    iget-boolean v0, v0, Lo0/a;->I0:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    move p2, v3

    .line 59
    :cond_2
    iget-boolean v0, p0, Lm0/Y0;->b:Z

    .line 60
    .line 61
    if-eqz v0, :cond_8

    .line 62
    .line 63
    iget v0, v1, Lz/e;->a:I

    .line 64
    .line 65
    iget v4, v1, Lz/e;->c:I

    .line 66
    .line 67
    invoke-virtual {p1, v0, v3, v4, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lm0/Y0;->h:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    const-string p1, "mainLayout"

    .line 76
    .line 77
    invoke-static {p1}, LX1/k;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object p1, v0

    .line 81
    :cond_3
    invoke-virtual {p1, v3, v2, v3, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lm0/Y0;->f:Landroid/view/View;

    .line 85
    .line 86
    const-string p2, "statusBarBackgroundView"

    .line 87
    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    invoke-static {p2}, LX1/k;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v0

    .line 94
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget v2, v1, Lz/e;->b:I

    .line 99
    .line 100
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 101
    .line 102
    iget-object v2, p0, Lm0/Y0;->f:Landroid/view/View;

    .line 103
    .line 104
    if-nez v2, :cond_5

    .line 105
    .line 106
    invoke-static {p2}, LX1/k;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    move-object v2, v0

    .line 110
    :cond_5
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lm0/Y0;->g:Landroid/view/View;

    .line 114
    .line 115
    const-string p2, "systemNavBarBackgroundView"

    .line 116
    .line 117
    if-nez p1, :cond_6

    .line 118
    .line 119
    invoke-static {p2}, LX1/k;->n(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object p1, v0

    .line 123
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iget v1, v1, Lz/e;->d:I

    .line 128
    .line 129
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 130
    .line 131
    iget-object p0, p0, Lm0/Y0;->g:Landroid/view/View;

    .line 132
    .line 133
    if-nez p0, :cond_7

    .line 134
    .line 135
    invoke-static {p2}, LX1/k;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    move-object v0, p0

    .line 140
    :goto_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    iget p0, v1, Lz/e;->a:I

    .line 145
    .line 146
    iget v0, v1, Lz/e;->c:I

    .line 147
    .line 148
    invoke-virtual {p1, p0, v2, v0, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 149
    .line 150
    .line 151
    :goto_3
    sget-object p0, LJ/w0;->b:LJ/w0;

    .line 152
    .line 153
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0603c6

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lm0/Y0;->i:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "currentStatusBarStyle"

    .line 18
    .line 19
    invoke-static {v1, v3}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, Lm0/Y0;->c(Ljava/lang/String;I)Landroidx/activity/K;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lm0/Y0;->d:Landroidx/activity/K;

    .line 27
    .line 28
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const v1, 0x7f0603d0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lm0/Y0;->j:Ljava/lang/String;

    .line 42
    .line 43
    const-string v3, "currentSystemNavBarStyle"

    .line 44
    .line 45
    invoke-static {v1, v3}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v1, v0}, Lm0/Y0;->c(Ljava/lang/String;I)Landroidx/activity/K;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lm0/Y0;->e:Landroidx/activity/K;

    .line 53
    .line 54
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    iget-object v1, p0, Lm0/Y0;->d:Landroidx/activity/K;

    .line 57
    .line 58
    if-nez v1, :cond_0

    .line 59
    .line 60
    const-string v1, "statusBarStyle"

    .line 61
    .line 62
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object v1, v2

    .line 66
    :cond_0
    iget-object v3, p0, Lm0/Y0;->e:Landroidx/activity/K;

    .line 67
    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    const-string v3, "systemNavBarStyle"

    .line 71
    .line 72
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move-object v2, v3

    .line 77
    :goto_0
    invoke-static {v0, v1, v2}, Landroidx/activity/r;->a(Landroidx/activity/ComponentActivity;Landroidx/activity/K;Landroidx/activity/K;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "insetsController"

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lm0/Y0;->c:LJ/U0;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    invoke-static {}, LJ/w0$p;->d()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {v0, p1}, LJ/U0;->a(I)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    invoke-virtual {v0, p1}, LJ/U0;->d(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p1, p0, Lm0/Y0;->c:LJ/U0;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v0, p1

    .line 36
    :goto_1
    invoke-static {}, LJ/w0$p;->d()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v0, p1}, LJ/U0;->e(I)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-virtual {v0, p1}, LJ/U0;->d(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f0603c6

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0, v1}, Lm0/Y0;->g(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const v2, 0x7f0603d0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0, v0}, Lm0/Y0;->h(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lm0/Y0;->k(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lm0/Y0;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final g(I)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lm0/Y0;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lm0/Y0;->f:Landroid/view/View;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "statusBarBackgroundView"

    .line 11
    .line 12
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v0

    .line 17
    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Lm0/Y0;->i:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "currentStatusBarStyle"

    .line 24
    .line 25
    invoke-static {v0, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, p1}, Lm0/Y0;->c(Ljava/lang/String;I)Landroidx/activity/K;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lm0/Y0;->d:Landroidx/activity/K;

    .line 33
    .line 34
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    const-string p1, "statusBarStyle"

    .line 39
    .line 40
    invoke-static {p1}, LX1/k;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v1

    .line 44
    :cond_2
    iget-object v2, p0, Lm0/Y0;->e:Landroidx/activity/K;

    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    const-string v2, "systemNavBarStyle"

    .line 49
    .line 50
    invoke-static {v2}, LX1/k;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move-object v1, v2

    .line 55
    :goto_1
    invoke-static {v0, p1, v1}, Landroidx/activity/r;->a(Landroidx/activity/ComponentActivity;Landroidx/activity/K;Landroidx/activity/K;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final h(I)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lm0/Y0;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lm0/Y0;->g:Landroid/view/View;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "systemNavBarBackgroundView"

    .line 11
    .line 12
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v0

    .line 17
    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Lm0/Y0;->j:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "currentSystemNavBarStyle"

    .line 24
    .line 25
    invoke-static {v0, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, p1}, Lm0/Y0;->c(Ljava/lang/String;I)Landroidx/activity/K;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lm0/Y0;->e:Landroidx/activity/K;

    .line 33
    .line 34
    iget-object p1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    iget-object v0, p0, Lm0/Y0;->d:Landroidx/activity/K;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    const-string v0, "statusBarStyle"

    .line 41
    .line 42
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :cond_2
    iget-object v2, p0, Lm0/Y0;->e:Landroidx/activity/K;

    .line 47
    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    const-string v2, "systemNavBarStyle"

    .line 51
    .line 52
    invoke-static {v2}, LX1/k;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move-object v1, v2

    .line 57
    :goto_1
    invoke-static {p1, v0, v1}, Landroidx/activity/r;->a(Landroidx/activity/ComponentActivity;Landroidx/activity/K;Landroidx/activity/K;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f090111

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "findViewById(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 19
    .line 20
    iput-object v0, p0, Lm0/Y0;->h:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 21
    .line 22
    const v0, 0x7f0901e2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lm0/Y0;->f:Landroid/view/View;

    .line 33
    .line 34
    const v0, 0x7f0901eb

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lm0/Y0;->g:Landroid/view/View;

    .line 45
    .line 46
    iget-boolean v0, p0, Lm0/Y0;->b:Z

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lm0/Y0;->f:Landroid/view/View;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const-string v0, "statusBarBackgroundView"

    .line 56
    .line 57
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v1

    .line 61
    :cond_0
    const/16 v2, 0x8

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lm0/Y0;->g:Landroid/view/View;

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    const-string v0, "systemNavBarBackgroundView"

    .line 71
    .line 72
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move-object v1, v0

    .line 77
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_2
    new-instance v0, Lm0/X0;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Lm0/X0;-><init>(Lm0/Y0;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v0}, LJ/W;->s0(Landroid/view/View;LJ/F;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object v0, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {p1, v0}, LJ/i0;->a(Landroid/view/Window;Landroid/view/View;)LJ/U0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string v0, "getInsetsController(...)"

    .line 109
    .line 110
    invoke-static {p1, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lm0/Y0;->c:LJ/U0;

    .line 114
    .line 115
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 116
    .line 117
    const/16 v0, 0x1d

    .line 118
    .line 119
    if-lt p1, v0, :cond_3

    .line 120
    .line 121
    iget-object p1, p0, Lm0/Y0;->a:Lco/median/android/MainActivity;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-static {p1, v0}, Landroidx/activity/x;->a(Landroid/view/Window;Z)V

    .line 129
    .line 130
    .line 131
    :cond_3
    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Lm0/Y0;->i:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Lm0/Y0;->c:LJ/U0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "insetsController"

    .line 17
    .line 18
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1}, Lm0/Y0;->e(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, LJ/U0;->c(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput-object p1, p0, Lm0/Y0;->j:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Lm0/Y0;->c:LJ/U0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "insetsController"

    .line 17
    .line 18
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1}, Lm0/Y0;->e(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p1}, LJ/U0;->b(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    return-void
.end method
