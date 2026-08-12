.class public Lco/median/android/widget/WebViewContainerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/ViewGroup;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lco/median/android/widget/WebViewContainerView;->b:Z

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lco/median/android/widget/WebViewContainerView;->a(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-boolean v2, v2, Lo0/a;->S0:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string v2, "co.median.plugins.android.geckoview.GNGeckoView"

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-array v3, v1, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v4, Landroid/content/Context;

    .line 20
    .line 21
    aput-object v4, v3, v0

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-array v3, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p1, v3, v0

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    iput-object p1, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 38
    .line 39
    iput-boolean v1, p0, Lco/median/android/widget/WebViewContainerView;->b:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Lco/median/android/s;

    .line 48
    .line 49
    invoke-direct {v0, p1}, Lco/median/android/s;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 53
    .line 54
    :goto_0
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    const/4 v0, -0x1

    .line 57
    invoke-direct {p1, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 66
    .line 67
    const v0, 0x7f090231

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public b(Lco/median/android/MainActivity;Z)V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x4

    .line 6
    iget-boolean v5, p0, Lco/median/android/widget/WebViewContainerView;->b:Z

    .line 7
    .line 8
    if-eqz v5, :cond_0

    .line 9
    .line 10
    :try_start_0
    const-string v5, "co.median.plugins.android.geckoview.WebViewSetup"

    .line 11
    .line 12
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    const-string v6, "setupWebviewForActivity"

    .line 17
    .line 18
    new-array v7, v4, [Ljava/lang/Class;

    .line 19
    .line 20
    const-class v8, Landroid/app/Activity;

    .line 21
    .line 22
    aput-object v8, v7, v3

    .line 23
    .line 24
    const-class v8, Lo0/h;

    .line 25
    .line 26
    aput-object v8, v7, v2

    .line 27
    .line 28
    const-class v8, Lo0/b;

    .line 29
    .line 30
    aput-object v8, v7, v1

    .line 31
    .line 32
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    aput-object v8, v7, v0

    .line 35
    .line 36
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v7, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 41
    .line 42
    check-cast v7, Lo0/h;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, Lco/median/android/GoNativeApplication;

    .line 49
    .line 50
    iget-object v8, v8, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 51
    .line 52
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    new-array v4, v4, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object p1, v4, v3

    .line 59
    .line 60
    aput-object v7, v4, v2

    .line 61
    .line 62
    aput-object v8, v4, v1

    .line 63
    .line 64
    aput-object p2, v4, v0

    .line 65
    .line 66
    invoke-virtual {v6, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto :goto_0

    .line 72
    :catch_1
    move-exception p1

    .line 73
    goto :goto_0

    .line 74
    :catch_2
    move-exception p1

    .line 75
    goto :goto_0

    .line 76
    :catch_3
    move-exception p1

    .line 77
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_0
    invoke-virtual {p0}, Lco/median/android/widget/WebViewContainerView;->getWebview()Lo0/h;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {p2, p1}, Lco/median/android/D;->c(Lo0/h;Lco/median/android/MainActivity;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public getWebview()Lo0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/WebViewContainerView;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    check-cast v0, Lo0/h;

    .line 4
    .line 5
    return-object v0
.end method
