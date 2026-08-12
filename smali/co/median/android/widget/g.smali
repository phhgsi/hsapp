.class public final Lco/median/android/widget/g;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private final a:Landroid/widget/ImageView;

.field private final b:Landroid/widget/TextView;

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const v0, 0x7f0c008c

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    const p1, 0x7f0900f1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "findViewById(...)"

    .line 29
    .line 30
    invoke-static {p1, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Landroid/widget/ImageView;

    .line 34
    .line 35
    iput-object p1, p0, Lco/median/android/widget/g;->a:Landroid/widget/ImageView;

    .line 36
    .line 37
    const p1, 0x7f0901fc

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1, v0}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Landroid/widget/TextView;

    .line 48
    .line 49
    iput-object p1, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 50
    .line 51
    const/high16 p1, -0x80000000

    .line 52
    .line 53
    iput p1, p0, Lco/median/android/widget/g;->c:I

    .line 54
    .line 55
    const/4 p1, -0x1

    .line 56
    iput p1, p0, Lco/median/android/widget/g;->d:I

    .line 57
    .line 58
    iput p1, p0, Lco/median/android/widget/g;->e:I

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    move-object v1, p2

    .line 62
    move-object v2, p3

    .line 63
    move-object v3, p4

    .line 64
    move v4, p5

    .line 65
    move v5, p6

    .line 66
    invoke-virtual/range {v0 .. v5}, Lco/median/android/widget/g;->m(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static synthetic a(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/widget/g;->h(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/widget/g;->f(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/widget/g;->j(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic d(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/widget/g;->l(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final f(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 11
    .line 12
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lco/median/android/widget/g;->a:Landroid/widget/ImageView;

    .line 27
    .line 28
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static final h(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 11
    .line 12
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    iget-object p0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static final j(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 11
    .line 12
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lco/median/android/widget/g;->a:Landroid/widget/ImageView;

    .line 27
    .line 28
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private static final l(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const-string v0, "anim"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 11
    .line 12
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    iget-object p0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 5

    .line 1
    new-instance v0, Landroid/animation/ArgbEvaluator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lco/median/android/widget/g;->d:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, p0, Lco/median/android/widget/g;->e:I

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x2

    .line 19
    new-array v3, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object v1, v3, v4

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    aput-object v2, v3, v1

    .line 26
    .line 27
    invoke-static {v0, v3}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lco/median/android/widget/c;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lco/median/android/widget/c;-><init>(Lco/median/android/widget/g;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v1, 0x64

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getText(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v0, p0, Lco/median/android/widget/g;->c:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    filled-new-array {v0, v1}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-wide/16 v1, 0x12c

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 33
    .line 34
    .line 35
    new-instance v1, Lco/median/android/widget/d;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lco/median/android/widget/d;-><init>(Lco/median/android/widget/g;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final getActiveColor()I
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/widget/g;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final getInactiveColor()I
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/widget/g;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxTextWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/widget/g;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()V
    .locals 5

    .line 1
    new-instance v0, Landroid/animation/ArgbEvaluator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lco/median/android/widget/g;->e:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, p0, Lco/median/android/widget/g;->d:I

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x2

    .line 19
    new-array v3, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object v1, v3, v4

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    aput-object v2, v3, v1

    .line 26
    .line 27
    invoke-static {v0, v3}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lco/median/android/widget/f;

    .line 32
    .line 33
    invoke-direct {v1, p0}, Lco/median/android/widget/f;-><init>(Lco/median/android/widget/g;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v1, 0xc8

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getText(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 37
    .line 38
    iget-object v2, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget v0, p0, Lco/median/android/widget/g;->c:I

    .line 44
    .line 45
    filled-new-array {v1, v0}, [I

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Lco/median/android/widget/e;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lco/median/android/widget/e;-><init>(Lco/median/android/widget/g;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    .line 60
    .line 61
    const-wide/16 v1, 0x12c

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final m(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lco/median/android/widget/g;->a:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lco/median/android/widget/g;->setText(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x0

    .line 19
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 20
    .line 21
    iget-object p2, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    iput p4, p0, Lco/median/android/widget/g;->d:I

    .line 27
    .line 28
    iput p5, p0, Lco/median/android/widget/g;->e:I

    .line 29
    .line 30
    iget-object p1, p0, Lco/median/android/widget/g;->a:Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final setActiveColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/widget/g;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public final setInactiveColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/widget/g;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxTextWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/widget/g;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, -0x2

    .line 8
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->measure(II)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput p1, p0, Lco/median/android/widget/g;->c:I

    .line 36
    .line 37
    iget-object p1, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 44
    .line 45
    iget-object v0, p0, Lco/median/android/widget/g;->b:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
