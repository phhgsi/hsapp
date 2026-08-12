.class public final Lco/median/android/widget/SwipeHistoryNavigationLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/widget/SwipeHistoryNavigationLayout$a;
    }
.end annotation


# instance fields
.field private A:F

.field private B:Z

.field private C:F

.field private D:F

.field private E:Z

.field private F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

.field private final a:Lco/median/android/widget/g;

.field private final b:Lco/median/android/widget/g;

.field private final c:Landroid/widget/EdgeEffect;

.field private final d:F

.field private final e:F

.field private final f:Landroid/graphics/drawable/Drawable;

.field private final g:Landroid/graphics/drawable/Drawable;

.field private final h:Landroid/graphics/drawable/Drawable;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private k:I

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:F

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/median/android/widget/SwipeHistoryNavigationLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILX1/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0700a5

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d:F

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    const/16 v1, 0xa0

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float/2addr p3, v0

    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->e:F

    const/high16 p3, 0x7fc00000    # Float.NaN

    .line 6
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 7
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 8
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 9
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 10
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    const v0, 0x3d4ccccd    # 0.05f

    .line 11
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->q:F

    const v0, 0x3e23d70a    # 0.16f

    .line 12
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->r:F

    const/high16 v0, 0x42a00000    # 80.0f

    .line 13
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->s:F

    const/high16 v0, 0x41f00000    # 30.0f

    .line 14
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    const/high16 v0, -0x80000000

    .line 15
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 16
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->y:F

    .line 17
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 18
    iput p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 19
    new-instance p3, Lco/median/android/widget/SwipeHistoryNavigationLayout$b;

    invoke-direct {p3}, Lco/median/android/widget/SwipeHistoryNavigationLayout$b;-><init>()V

    iput-object p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget-object v0, Lm0/U0;->g2:[I

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x1

    .line 21
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 22
    iput-object v4, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Landroid/graphics/drawable/Drawable;

    const/4 p3, 0x3

    .line 23
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-nez p3, :cond_0

    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0800a2

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    .line 26
    invoke-static {p3, v0, v2}, Ly/k;->f(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    :cond_0
    move-object v5, p3

    .line 27
    iput-object v5, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Landroid/graphics/drawable/Drawable;

    const/4 p3, 0x5

    .line 28
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-nez p3, :cond_1

    .line 29
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f0800a3

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    .line 31
    invoke-static {p3, v0, v2}, Ly/k;->f(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 32
    :cond_1
    iput-object p3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->h:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x4

    .line 33
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, ""

    :cond_2
    move-object v6, v0

    .line 34
    iput-object v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->i:Ljava/lang/String;

    .line 35
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0603c9

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ly/k;->d(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result v0

    const/4 v2, 0x2

    .line 36
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    iput v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->j:I

    .line 37
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0603c7

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ly/k;->d(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result v0

    .line 38
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 39
    new-instance v2, Lco/median/android/widget/g;

    .line 40
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    move-object v3, p1

    .line 41
    invoke-direct/range {v2 .. v8}, Lco/median/android/widget/g;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V

    iput-object v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 42
    new-instance v2, Lco/median/android/widget/g;

    .line 43
    const-string v6, ""

    .line 44
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    move-object v5, p3

    .line 45
    invoke-direct/range {v2 .. v8}, Lco/median/android/widget/g;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V

    iput-object v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 46
    new-instance p1, Landroid/widget/EdgeEffect;

    invoke-direct {p1, v3}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 47
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILX1/g;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/median/android/widget/SwipeHistoryNavigationLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final a(F)Z
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 2
    .line 3
    cmpg-float p1, p1, v0

    .line 4
    .line 5
    if-gtz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method private final b(F)Z
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 2
    .line 3
    cmpl-float p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method private final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Lco/median/android/widget/g;->i()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Lco/median/android/widget/g;->g()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 21
    .line 22
    invoke-virtual {v0}, Lco/median/android/widget/g;->i()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 26
    .line 27
    invoke-virtual {v0}, Lco/median/android/widget/g;->g()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 4
    .line 5
    invoke-interface {v1}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->f()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lco/median/android/widget/g;->setText(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 2
    .line 3
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 4
    .line 5
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 6
    .line 7
    sub-float/2addr v1, v2

    .line 8
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 9
    .line 10
    int-to-float v2, v2

    .line 11
    sub-float/2addr v1, v2

    .line 12
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d:F

    .line 13
    .line 14
    sub-float/2addr v1, v2

    .line 15
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 16
    .line 17
    sub-float/2addr v3, v2

    .line 18
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 2
    .line 3
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 7
    .line 8
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 9
    .line 10
    sub-float/2addr v2, v3

    .line 11
    sub-float/2addr v1, v2

    .line 12
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d:F

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    int-to-float v3, v3

    .line 16
    div-float/2addr v2, v3

    .line 17
    add-float/2addr v1, v2

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-float v2, v2

    .line 23
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 24
    .line 25
    sub-float/2addr v2, v3

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private final g()Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 5
    .line 6
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 7
    .line 8
    .line 9
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 10
    .line 11
    const-wide/16 v4, 0x190

    .line 12
    .line 13
    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 25
    .line 26
    invoke-interface {v3}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->b()Z

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 36
    .line 37
    new-array v1, v1, [F

    .line 38
    .line 39
    aput v7, v1, v2

    .line 40
    .line 41
    aput v8, v1, v0

    .line 42
    .line 43
    invoke-static {v3, v6, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c()V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 66
    .line 67
    invoke-interface {v3}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->g()Z

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/view/View;->getTranslationX()F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 77
    .line 78
    new-array v1, v1, [F

    .line 79
    .line 80
    aput v7, v1, v2

    .line 81
    .line 82
    aput v8, v1, v0

    .line 83
    .line 84
    invoke-static {v3, v6, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_0
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 95
    .line 96
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 97
    .line 98
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 99
    .line 100
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 101
    .line 102
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    return v0
.end method

.method private final h()V
    .locals 0

    .line 1
    return-void
.end method

.method private final i()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 6
    .line 7
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 14
    .line 15
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->e()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 19
    .line 20
    invoke-virtual {v0}, Lco/median/android/widget/g;->e()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 24
    .line 25
    invoke-virtual {v0}, Lco/median/android/widget/g;->k()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 34
    .line 35
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 42
    .line 43
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->d()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 47
    .line 48
    invoke-virtual {v0}, Lco/median/android/widget/g;->e()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 52
    .line 53
    invoke-virtual {v0}, Lco/median/android/widget/g;->k()V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v2, v3

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sub-int/2addr v2, v3

    .line 59
    const/high16 v3, 0x42b40000    # 90.0f

    .line 60
    .line 61
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    int-to-float v3, v3

    .line 69
    int-to-float v4, v1

    .line 70
    neg-float v4, v4

    .line 71
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    invoke-virtual {v3, v2, v1}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 80
    .line 81
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 90
    :goto_2
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-static {p0}, LJ/W;->Z(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void
.end method

.method public final getSwipeNavListener()Lco/median/android/widget/SwipeHistoryNavigationLayout$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onFinishInflate()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    const/4 v2, -0x2

    .line 9
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 18
    .line 19
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    .line 21
    const/16 v3, 0x10

    .line 22
    .line 23
    invoke-direct {v1, v2, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 2
    .line 3
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    const/4 v2, 0x1

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_4

    .line 32
    .line 33
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Z

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:F

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-direct {p0, v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a(F)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 58
    .line 59
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->h()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    float-to-int v0, v0

    .line 72
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 73
    .line 74
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d()V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-direct {p0, v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b(F)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_d

    .line 88
    .line 89
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 90
    .line 91
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_d

    .line 96
    .line 97
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 104
    .line 105
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->h()V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    const/4 v4, 0x2

    .line 118
    if-ne v3, v4, :cond_b

    .line 119
    .line 120
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    sub-float/2addr v0, v3

    .line 127
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:F

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    sub-float/2addr v3, p1

    .line 138
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 143
    .line 144
    if-eqz v3, :cond_6

    .line 145
    .line 146
    return v2

    .line 147
    :cond_6
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 148
    .line 149
    if-nez v3, :cond_7

    .line 150
    .line 151
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 152
    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    :cond_7
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 156
    .line 157
    cmpl-float v4, v0, v3

    .line 158
    .line 159
    if-gtz v4, :cond_8

    .line 160
    .line 161
    cmpl-float v3, p1, v3

    .line 162
    .line 163
    if-lez v3, :cond_a

    .line 164
    .line 165
    :cond_8
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Z

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Z

    .line 170
    .line 171
    float-to-double v3, p1

    .line 172
    float-to-double v5, v0

    .line 173
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 174
    .line 175
    .line 176
    move-result-wide v3

    .line 177
    double-to-float p1, v3

    .line 178
    float-to-double v3, p1

    .line 179
    const-wide v5, 0x3fe0c152382d7365L    # 0.5235987755982988

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    cmpl-double p1, v3, v5

    .line 185
    .line 186
    if-lez p1, :cond_9

    .line 187
    .line 188
    return v1

    .line 189
    :cond_9
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 196
    .line 197
    .line 198
    return v2

    .line 199
    :cond_a
    return v1

    .line 200
    :cond_b
    :goto_2
    if-nez v0, :cond_c

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-ne v0, v2, :cond_d

    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 211
    .line 212
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:F

    .line 213
    .line 214
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 215
    .line 216
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 217
    .line 218
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 219
    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    return v2

    .line 223
    :cond_d
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 9
    .line 10
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d:F

    .line 11
    .line 12
    neg-float p3, p3

    .line 13
    iput p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    int-to-float p3, p3

    .line 25
    iget p4, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->d:F

    .line 26
    .line 27
    add-float/2addr p3, p4

    .line 28
    iput p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 29
    .line 30
    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    int-to-float p2, p2

    .line 38
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->q:F

    .line 39
    .line 40
    mul-float/2addr p2, p3

    .line 41
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    int-to-float p2, p2

    .line 48
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 49
    .line 50
    sub-float/2addr p2, p3

    .line 51
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    int-to-float p2, p2

    .line 58
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->r:F

    .line 59
    .line 60
    mul-float/2addr p2, p3

    .line 61
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v3, v4, :cond_7

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->y:F

    .line 31
    .line 32
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 33
    .line 34
    iput v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 35
    .line 36
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 37
    .line 38
    int-to-float v3, v3

    .line 39
    sub-float/2addr v0, v3

    .line 40
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 45
    .line 46
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 51
    .line 52
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 59
    .line 60
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 61
    .line 62
    cmpl-float v0, v0, v3

    .line 63
    .line 64
    if-ltz v0, :cond_2

    .line 65
    .line 66
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->e()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 75
    .line 76
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->c()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 83
    .line 84
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 85
    .line 86
    cmpl-float v0, v0, v3

    .line 87
    .line 88
    if-ltz v0, :cond_4

    .line 89
    .line 90
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 91
    .line 92
    invoke-interface {v0}, Lco/median/android/widget/SwipeHistoryNavigationLayout$a;->a()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 103
    .line 104
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 105
    .line 106
    cmpl-float v4, v0, v3

    .line 107
    .line 108
    if-lez v4, :cond_4

    .line 109
    .line 110
    sub-float/2addr v0, v3

    .line 111
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c:Landroid/widget/EdgeEffect;

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    int-to-float v4, v4

    .line 122
    div-float/2addr v0, v4

    .line 123
    invoke-virtual {v3, v0}, Landroid/widget/EdgeEffect;->onPull(F)V

    .line 124
    .line 125
    .line 126
    move v0, v1

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    :goto_1
    move v0, v2

    .line 129
    :goto_2
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:F

    .line 130
    .line 131
    iget v4, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 132
    .line 133
    iget v5, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->s:F

    .line 134
    .line 135
    add-float/2addr v4, v5

    .line 136
    iget v5, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->e:F

    .line 137
    .line 138
    add-float/2addr v4, v5

    .line 139
    cmpl-float v3, v3, v4

    .line 140
    .line 141
    if-lez v3, :cond_5

    .line 142
    .line 143
    iget-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 144
    .line 145
    if-nez v2, :cond_6

    .line 146
    .line 147
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 148
    .line 149
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->i()V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    iget-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 154
    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:Z

    .line 158
    .line 159
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->c()V

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_3
    move v2, v0

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    :goto_4
    if-nez v0, :cond_8

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-ne v0, v1, :cond_9

    .line 172
    .line 173
    invoke-direct {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_9
    :goto_5
    if-eqz v2, :cond_a

    .line 186
    .line 187
    invoke-static {p0}, LJ/W;->Z(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    return p1
.end method

.method public final setActiveColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->b:Lco/median/android/widget/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lco/median/android/widget/g;->setActiveColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a:Lco/median/android/widget/g;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lco/median/android/widget/g;->setActiveColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSwipeNavListener(Lco/median/android/widget/SwipeHistoryNavigationLayout$a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->F:Lco/median/android/widget/SwipeHistoryNavigationLayout$a;

    .line 7
    .line 8
    return-void
.end method
