.class LG/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:I

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Z

.field private g:LG/g$d;

.field private h:LG/g$e;

.field private i:LG/u;


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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 10
    .line 11
    new-instance p1, LG/h;

    .line 12
    .line 13
    invoke-direct {p1}, LG/h;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LG/g$b;->g:LG/g$d;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(LG/u;LG/g$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG/g$b;->f(LG/u;LG/g$e;)V

    return-void
.end method

.method public static synthetic b()Z
    .locals 1

    .line 1
    invoke-static {}, LG/g$b;->o()Z

    move-result v0

    return v0
.end method

.method public static final synthetic c(LG/g$b;)LG/u;
    .locals 0

    .line 1
    iget-object p0, p0, LG/g$b;->i:LG/u;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LG/g$b;LG/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/g$b;->i:LG/u;

    .line 2
    .line 3
    return-void
.end method

.method private static final f(LG/u;LG/g$e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LG/u;->a()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, LG/g$e;->a(LG/u;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final g(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    sget v0, LG/e;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/widget/ImageView;

    .line 8
    .line 9
    iget-boolean v0, p0, LG/g$b;->f:Z

    .line 10
    .line 11
    const v1, 0x3f2aaaab

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v2, LG/d;->a:I

    .line 21
    .line 22
    invoke-static {v0, v2}, Le/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget v3, LG/c;->b:I

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    mul-float/2addr v2, v1

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    new-instance v1, LG/a;

    .line 40
    .line 41
    invoke-direct {v1, v0, v2}, LG/a;-><init>(Landroid/graphics/drawable/Drawable;F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v2, LG/c;->a:I

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    mul-float v2, v0, v1

    .line 59
    .line 60
    :cond_1
    :goto_0
    new-instance v0, LG/a;

    .line 61
    .line 62
    invoke-direct {v0, p2, v2}, LG/a;-><init>(Landroid/graphics/drawable/Drawable;F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private static final o()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method


# virtual methods
.method public final e(LG/u;)V
    .locals 3

    .line 1
    const-string v0, "splashScreenViewProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG/g$b;->h:LG/g$e;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, LG/g$b;->h:LG/g$e;

    .line 13
    .line 14
    invoke-virtual {p1}, LG/u;->a()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LG/i;

    .line 19
    .line 20
    invoke-direct {v2, p1, v0}, LG/i;-><init>(LG/u;LG/g$e;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final h()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LG/g$d;
    .locals 1

    .line 1
    iget-object v0, p0, LG/g$b;->g:LG/g$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()V
    .locals 5

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget v2, LG/b;->d:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v2, p0, LG/g$b;->c:Ljava/lang/Integer;

    .line 28
    .line 29
    iget v2, v0, Landroid/util/TypedValue;->data:I

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, p0, LG/g$b;->d:Ljava/lang/Integer;

    .line 36
    .line 37
    :cond_0
    sget v2, LG/b;->c:I

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 46
    .line 47
    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    .line 48
    .line 49
    invoke-static {v2, v4}, Le/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, p0, LG/g$b;->e:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    :cond_1
    sget v2, LG/b;->b:I

    .line 56
    .line 57
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 64
    .line 65
    sget v4, LG/c;->b:I

    .line 66
    .line 67
    if-ne v2, v4, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/4 v3, 0x0

    .line 71
    :goto_0
    iput-boolean v3, p0, LG/g$b;->f:Z

    .line 72
    .line 73
    :cond_3
    invoke-static {v1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, v0}, LG/g$b;->m(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    .line 77
    .line 78
    .line 79
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
    iput-object p1, p0, LG/g$b;->g:LG/g$d;

    .line 7
    .line 8
    iget-object p1, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 9
    .line 10
    const v0, 0x1020002

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, LG/g$b$a;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, LG/g$b$a;-><init>(LG/g$b;Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public l(LG/g$e;)V
    .locals 4

    .line 1
    const-string v0, "exitAnimationListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LG/g$b;->h:LG/g$e;

    .line 7
    .line 8
    new-instance p1, LG/u;

    .line 9
    .line 10
    iget-object v0, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-direct {p1, v0}, LG/u;-><init>(Landroid/app/Activity;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LG/g$b;->c:Ljava/lang/Integer;

    .line 16
    .line 17
    iget-object v1, p0, LG/g$b;->d:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p1}, LG/u;->a()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iget-object v0, p0, LG/g$b;->e:Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-direct {p0, v2, v0}, LG/g$b;->g(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    new-instance v0, LG/g$b$b;

    .line 74
    .line 75
    invoke-direct {v0, p0, p1}, LG/g$b$b;-><init>(LG/g$b;LG/u;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method protected final m(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V
    .locals 2

    .line 1
    const-string v0, "currentTheme"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typedValue"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, LG/b;->a:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget p1, p2, Landroid/util/TypedValue;->resourceId:I

    .line 21
    .line 22
    iput p1, p0, LG/g$b;->b:I

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p2, p0, LG/g$b;->a:Landroid/app/Activity;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final n(LG/g$d;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LG/g$b;->g:LG/g$d;

    .line 7
    .line 8
    return-void
.end method
