.class abstract LU0/l;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field private static final q:Landroid/util/Property;


# instance fields
.field final a:Landroid/content/Context;

.field final b:LU0/c;

.field c:LU0/a;

.field private d:Landroid/animation/ValueAnimator;

.field private e:Landroid/animation/ValueAnimator;

.field private f:Z

.field private g:Z

.field private h:F

.field private i:F

.field private j:Ljava/util/List;

.field private k:Landroidx/vectordrawable/graphics/drawable/b;

.field private l:Z

.field private m:F

.field final n:Landroid/graphics/Paint;

.field private o:I

.field p:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LU0/l$c;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Float;

    .line 4
    .line 5
    const-string v2, "growFraction"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LU0/l$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LU0/l;->q:Landroid/util/Property;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Landroid/content/Context;LU0/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, LU0/l;->i:F

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 14
    .line 15
    iput-object p1, p0, LU0/l;->a:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, LU0/l;->b:LU0/c;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LU0/l;->p:Landroid/graphics/Rect;

    .line 25
    .line 26
    new-instance p1, LU0/a;

    .line 27
    .line 28
    invoke-direct {p1}, LU0/a;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LU0/l;->c:LU0/a;

    .line 32
    .line 33
    const/16 p1, 0xff

    .line 34
    .line 35
    invoke-virtual {p0, p1}, LU0/l;->setAlpha(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method static synthetic a(LU0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LU0/l;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic b(LU0/l;ZZ)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic c(LU0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LU0/l;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private varargs d([Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LU0/l;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LU0/l;->l:Z

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v0, p0, LU0/l;->l:Z

    .line 19
    .line 20
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    iget-object v0, p0, LU0/l;->k:Landroidx/vectordrawable/graphics/drawable/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroidx/vectordrawable/graphics/drawable/b;->b(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v1, p0, LU0/l;->l:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/vectordrawable/graphics/drawable/b;

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Landroidx/vectordrawable/graphics/drawable/b;->b(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, LU0/l;->k:Landroidx/vectordrawable/graphics/drawable/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroidx/vectordrawable/graphics/drawable/b;->c(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v1, p0, LU0/l;->l:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroidx/vectordrawable/graphics/drawable/b;

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Landroidx/vectordrawable/graphics/drawable/b;->c(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method private varargs g([Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LU0/l;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LU0/l;->l:Z

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->end()V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v0, p0, LU0/l;->l:Z

    .line 19
    .line 20
    return-void
.end method

.method private k()Z
    .locals 1

    .line 1
    instance-of v0, p0, LU0/k;

    .line 2
    .line 3
    return v0
.end method

.method private n()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    const-wide/16 v2, 0x1f4

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, LU0/l;->q:Landroid/util/Property;

    .line 9
    .line 10
    new-array v4, v0, [F

    .line 11
    .line 12
    fill-array-data v4, :array_0

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v1, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    sget-object v4, LG0/a;->b:Landroid/animation/TimeInterpolator;

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    invoke-direct {p0, v1}, LU0/l;->r(Landroid/animation/ValueAnimator;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v1, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    sget-object v1, LU0/l;->q:Landroid/util/Property;

    .line 41
    .line 42
    new-array v0, v0, [F

    .line 43
    .line 44
    fill-array-data v0, :array_1

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    sget-object v1, LG0/a;->b:Landroid/animation/TimeInterpolator;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 64
    .line 65
    invoke-direct {p0, v0}, LU0/l;->q(Landroid/animation/ValueAnimator;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private q(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Cannot set hideAnimator while the current hideAnimator is running."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    new-instance v0, LU0/l$b;

    .line 23
    .line 24
    invoke-direct {v0, p0}, LU0/l$b;-><init>(LU0/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private r(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Cannot set showAnimator while the current showAnimator is running."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    new-instance v0, LU0/l$a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, LU0/l$a;-><init>(LU0/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, LU0/l;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method h()F
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/c;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 10
    .line 11
    invoke-virtual {v0}, LU0/c;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    iget-boolean v0, p0, LU0/l;->g:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-boolean v0, p0, LU0/l;->f:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget v0, p0, LU0/l;->m:F

    .line 30
    .line 31
    return v0

    .line 32
    :cond_2
    :goto_0
    iget v0, p0, LU0/l;->h:F

    .line 33
    .line 34
    return v0
.end method

.method i()F
    .locals 6

    .line 1
    iget v0, p0, LU0/l;->i:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v2, v0, v1

    .line 5
    .line 6
    if-lez v2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 10
    .line 11
    invoke-direct {p0}, LU0/l;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v2}, LU0/c;->b(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 22
    .line 23
    iget v0, v0, LU0/c;->m:I

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, LU0/l;->c:LU0/a;

    .line 28
    .line 29
    iget-object v2, p0, LU0/l;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, LU0/a;->a(Landroid/content/ContentResolver;)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    cmpl-float v2, v0, v1

    .line 40
    .line 41
    if-lez v2, :cond_3

    .line 42
    .line 43
    invoke-direct {p0}, LU0/l;->k()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v2, p0, LU0/l;->b:LU0/c;

    .line 50
    .line 51
    iget v2, v2, LU0/c;->j:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v2, p0, LU0/l;->b:LU0/c;

    .line 55
    .line 56
    iget v2, v2, LU0/c;->k:I

    .line 57
    .line 58
    :goto_0
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 59
    .line 60
    int-to-float v2, v2

    .line 61
    mul-float/2addr v2, v3

    .line 62
    iget-object v3, p0, LU0/l;->b:LU0/c;

    .line 63
    .line 64
    iget v3, v3, LU0/c;->m:I

    .line 65
    .line 66
    int-to-float v3, v3

    .line 67
    div-float/2addr v2, v3

    .line 68
    mul-float/2addr v2, v0

    .line 69
    float-to-int v0, v2

    .line 70
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    int-to-long v4, v0

    .line 75
    rem-long/2addr v2, v4

    .line 76
    long-to-float v2, v2

    .line 77
    int-to-float v0, v0

    .line 78
    div-float/2addr v2, v0

    .line 79
    cmpg-float v0, v2, v1

    .line 80
    .line 81
    if-gez v0, :cond_2

    .line 82
    .line 83
    const/high16 v0, 0x3f800000    # 1.0f

    .line 84
    .line 85
    rem-float/2addr v2, v0

    .line 86
    add-float/2addr v2, v0

    .line 87
    :cond_2
    return v2

    .line 88
    :cond_3
    return v1
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU0/l;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LU0/l;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0, v0}, LU0/l;->s(ZZZ)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, LU0/l;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_2
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, LU0/l;->f:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_2
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public o(Landroidx/vectordrawable/graphics/drawable/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method p(F)V
    .locals 1

    .line 1
    iget v0, p0, LU0/l;->m:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, LU0/l;->m:F

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public s(ZZZ)Z
    .locals 2

    .line 1
    iget-object v0, p0, LU0/l;->c:LU0/a;

    .line 2
    .line 3
    iget-object v1, p0, LU0/l;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LU0/a;->a(Landroid/content/ContentResolver;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    cmpl-float p3, v0, p3

    .line 17
    .line 18
    if-lez p3, :cond_0

    .line 19
    .line 20
    const/4 p3, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p3, 0x0

    .line 23
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, LU0/l;->t(ZZZ)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public setAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, LU0/l;->o:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LU0/l;->s(ZZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public start()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v0, v1}, LU0/l;->t(ZZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1, v0}, LU0/l;->t(ZZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method t(ZZZ)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0}, LU0/l;->n()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v1, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    :goto_0
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, LU0/l;->e:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object v3, p0, LU0/l;->d:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    :goto_1
    if-nez p3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    new-array p2, v0, [Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    aput-object v3, p2, v2

    .line 40
    .line 41
    invoke-direct {p0, p2}, LU0/l;->d([Landroid/animation/ValueAnimator;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    new-array p2, v0, [Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    aput-object v1, p2, v2

    .line 57
    .line 58
    invoke-direct {p0, p2}, LU0/l;->g([Landroid/animation/ValueAnimator;)V

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :cond_5
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-eqz p3, :cond_6

    .line 71
    .line 72
    return v2

    .line 73
    :cond_6
    if-eqz p1, :cond_8

    .line 74
    .line 75
    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    move p3, v2

    .line 83
    goto :goto_4

    .line 84
    :cond_8
    :goto_3
    move p3, v0

    .line 85
    :goto_4
    if-eqz p1, :cond_9

    .line 86
    .line 87
    iget-object p1, p0, LU0/l;->b:LU0/c;

    .line 88
    .line 89
    invoke-virtual {p1}, LU0/c;->d()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    goto :goto_5

    .line 94
    :cond_9
    iget-object p1, p0, LU0/l;->b:LU0/c;

    .line 95
    .line 96
    invoke-virtual {p1}, LU0/c;->c()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_5
    if-nez p1, :cond_a

    .line 101
    .line 102
    new-array p1, v0, [Landroid/animation/ValueAnimator;

    .line 103
    .line 104
    aput-object v1, p1, v2

    .line 105
    .line 106
    invoke-direct {p0, p1}, LU0/l;->g([Landroid/animation/ValueAnimator;)V

    .line 107
    .line 108
    .line 109
    return p3

    .line 110
    :cond_a
    if-nez p2, :cond_c

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/animation/Animator;->isPaused()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_b

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->resume()V

    .line 120
    .line 121
    .line 122
    return p3

    .line 123
    :cond_c
    :goto_6
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 124
    .line 125
    .line 126
    return p3
.end method

.method public u(Landroidx/vectordrawable/graphics/drawable/b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LU0/l;->j:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LU0/l;->j:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, LU0/l;->j:Ljava/util/List;

    .line 26
    .line 27
    :cond_0
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
.end method
