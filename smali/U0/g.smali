.class public LU0/g;
.super LU0/b;
.source "SourceFile"


# static fields
.field public static final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, LF0/j;->r:I

    .line 2
    .line 3
    sput v0, LU0/g;->q:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LU0/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, LF0/a;->f:I

    invoke-direct {p0, p1, p2, v0}, LU0/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    sget v0, LU0/g;->q:I

    invoke-direct {p0, p1, p2, p3, v0}, LU0/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    invoke-direct {p0}, LU0/g;->t()V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LU0/b;->k:Z

    return-void
.end method

.method private t()V
    .locals 3

    .line 1
    new-instance v0, LU0/d;

    .line 2
    .line 3
    iget-object v1, p0, LU0/b;->a:LU0/c;

    .line 4
    .line 5
    check-cast v1, LU0/h;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LU0/d;-><init>(LU0/h;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, LU0/b;->a:LU0/c;

    .line 15
    .line 16
    check-cast v2, LU0/h;

    .line 17
    .line 18
    invoke-static {v1, v2, v0}, LU0/o;->v(Landroid/content/Context;LU0/h;LU0/d;)LU0/o;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, v1}, LU0/b;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, LU0/b;->a:LU0/c;

    .line 30
    .line 31
    check-cast v2, LU0/h;

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, LU0/k;->A(Landroid/content/Context;LU0/h;LU0/d;)LU0/k;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, LU0/b;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public getIndeterminateAnimationType()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iget v0, v0, LU0/h;->o:I

    .line 6
    .line 7
    return v0
.end method

.method public getIndicatorDirection()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iget v0, v0, LU0/h;->r:I

    .line 6
    .line 7
    return v0
.end method

.method public getIndicatorInset()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iget v0, v0, LU0/h;->q:I

    .line 6
    .line 7
    return v0
.end method

.method public getIndicatorSize()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iget v0, v0, LU0/h;->p:I

    .line 6
    .line 7
    return v0
.end method

.method bridge synthetic i(Landroid/content/Context;Landroid/util/AttributeSet;)LU0/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LU0/g;->s(Landroid/content/Context;Landroid/util/AttributeSet;)LU0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method s(Landroid/content/Context;Landroid/util/AttributeSet;)LU0/h;
    .locals 1

    .line 1
    new-instance v0, LU0/h;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LU0/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public setIndeterminateAnimationType(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iget v0, v0, LU0/h;->o:I

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, LU0/b;->r()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_2
    :goto_0
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, LU0/h;

    .line 35
    .line 36
    iput p1, v1, LU0/h;->o:I

    .line 37
    .line 38
    check-cast v0, LU0/h;

    .line 39
    .line 40
    invoke-virtual {v0}, LU0/c;->h()V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    new-instance p1, LU0/f;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, LU0/b;->a:LU0/c;

    .line 53
    .line 54
    check-cast v1, LU0/h;

    .line 55
    .line 56
    invoke-direct {p1, v0, v1}, LU0/f;-><init>(Landroid/content/Context;LU0/h;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    new-instance p1, LU0/e;

    .line 61
    .line 62
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 63
    .line 64
    check-cast v0, LU0/h;

    .line 65
    .line 66
    invoke-direct {p1, v0}, LU0/e;-><init>(LU0/h;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0}, LU0/b;->getIndeterminateDrawable()LU0/o;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, p1}, LU0/o;->z(LU0/n;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, LU0/b;->o()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, LU0/b;->invalidate()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    check-cast v0, LU0/h;

    .line 4
    .line 5
    iput p1, v0, LU0/h;->r:I

    .line 6
    .line 7
    invoke-virtual {p0}, LU0/b;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LU0/h;

    .line 5
    .line 6
    iget v1, v1, LU0/h;->q:I

    .line 7
    .line 8
    if-eq v1, p1, :cond_0

    .line 9
    .line 10
    check-cast v0, LU0/h;

    .line 11
    .line 12
    iput p1, v0, LU0/h;->q:I

    .line 13
    .line 14
    invoke-virtual {p0}, LU0/b;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LU0/b;->getTrackThickness()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, LU0/b;->a:LU0/c;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, LU0/h;

    .line 15
    .line 16
    iget v1, v1, LU0/h;->p:I

    .line 17
    .line 18
    if-eq v1, p1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, LU0/h;

    .line 22
    .line 23
    iput p1, v1, LU0/h;->p:I

    .line 24
    .line 25
    check-cast v0, LU0/h;

    .line 26
    .line 27
    invoke-virtual {v0}, LU0/c;->h()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LU0/b;->invalidate()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LU0/b;->setTrackThickness(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU0/b;->a:LU0/c;

    .line 5
    .line 6
    check-cast p1, LU0/h;

    .line 7
    .line 8
    invoke-virtual {p1}, LU0/c;->h()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
