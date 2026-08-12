.class final LU0/d;
.super LU0/m;
.source "SourceFile"


# instance fields
.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:I

.field private m:F

.field private n:Z

.field private o:F

.field private final p:Landroid/graphics/RectF;

.field private final q:Landroid/util/Pair;


# direct methods
.method constructor <init>(LU0/h;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LU0/m;-><init>(LU0/c;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LU0/d;->p:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance p1, Landroid/util/Pair;

    .line 12
    .line 13
    new-instance v0, LU0/m$b;

    .line 14
    .line 15
    invoke-direct {v0, p0}, LU0/m$b;-><init>(LU0/m;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, LU0/m$b;

    .line 19
    .line 20
    invoke-direct {v1, p0}, LU0/m$b;-><init>(LU0/m;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LU0/d;->q:Landroid/util/Pair;

    .line 27
    .line 28
    return-void
.end method

.method private j(Landroid/graphics/Path;LU0/m$b;LU0/m$b;)V
    .locals 9

    .line 1
    iget v0, p0, LU0/d;->j:F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    div-float/2addr v0, v1

    .line 6
    const v1, 0x3ef5c28f    # 0.48f

    .line 7
    .line 8
    .line 9
    mul-float/2addr v0, v1

    .line 10
    new-instance v1, LU0/m$b;

    .line 11
    .line 12
    invoke-direct {v1, p0, p2}, LU0/m$b;-><init>(LU0/m;LU0/m$b;)V

    .line 13
    .line 14
    .line 15
    new-instance p2, LU0/m$b;

    .line 16
    .line 17
    invoke-direct {p2, p0, p3}, LU0/m$b;-><init>(LU0/m;LU0/m$b;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, LU0/m$b;->b(F)V

    .line 21
    .line 22
    .line 23
    neg-float v0, v0

    .line 24
    invoke-virtual {p2, v0}, LU0/m$b;->b(F)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, LU0/m$b;->a:[F

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aget v3, v0, v1

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    aget v4, v0, v2

    .line 34
    .line 35
    iget-object p2, p2, LU0/m$b;->a:[F

    .line 36
    .line 37
    aget v5, p2, v1

    .line 38
    .line 39
    aget v6, p2, v2

    .line 40
    .line 41
    iget-object p2, p3, LU0/m$b;->a:[F

    .line 42
    .line 43
    aget v7, p2, v1

    .line 44
    .line 45
    aget v8, p2, v2

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private k(Landroid/graphics/PathMeasure;Landroid/graphics/Path;Landroid/util/Pair;FFFF)V
    .locals 5

    .line 1
    iget v0, p0, LU0/d;->h:F

    .line 2
    .line 3
    mul-float/2addr v0, p6

    .line 4
    iget-boolean p6, p0, LU0/d;->n:Z

    .line 5
    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    iget-object p6, p0, LU0/m;->a:LU0/c;

    .line 9
    .line 10
    check-cast p6, LU0/h;

    .line 11
    .line 12
    iget p6, p6, LU0/c;->j:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p6, p0, LU0/m;->a:LU0/c;

    .line 16
    .line 17
    check-cast p6, LU0/h;

    .line 18
    .line 19
    iget p6, p6, LU0/c;->k:I

    .line 20
    .line 21
    :goto_0
    iget v1, p0, LU0/d;->i:F

    .line 22
    .line 23
    iget v2, p0, LU0/d;->m:F

    .line 24
    .line 25
    cmpl-float v2, v1, v2

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, LU0/m;->d:Landroid/graphics/PathMeasure;

    .line 30
    .line 31
    if-ne p1, v2, :cond_2

    .line 32
    .line 33
    iget v2, p0, LU0/d;->k:F

    .line 34
    .line 35
    cmpl-float v2, v0, v2

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    iget v2, p0, LU0/d;->l:I

    .line 40
    .line 41
    if-eq p6, v2, :cond_2

    .line 42
    .line 43
    :cond_1
    iput v0, p0, LU0/d;->k:F

    .line 44
    .line 45
    iput p6, p0, LU0/d;->l:I

    .line 46
    .line 47
    iput v1, p0, LU0/d;->m:F

    .line 48
    .line 49
    invoke-virtual {p0}, LU0/d;->g()V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p2}, Landroid/graphics/Path;->rewind()V

    .line 53
    .line 54
    .line 55
    const/4 p6, 0x0

    .line 56
    const/high16 v0, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {p5, p6, v0}, LD/a;->a(FFF)F

    .line 59
    .line 60
    .line 61
    move-result p5

    .line 62
    iget-object v1, p0, LU0/m;->a:LU0/c;

    .line 63
    .line 64
    check-cast v1, LU0/h;

    .line 65
    .line 66
    iget-boolean v2, p0, LU0/d;->n:Z

    .line 67
    .line 68
    invoke-virtual {v1, v2}, LU0/c;->b(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget v1, p0, LU0/d;->i:F

    .line 75
    .line 76
    float-to-double v1, v1

    .line 77
    const-wide v3, 0x401921fb54442d18L    # 6.283185307179586

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    mul-double/2addr v1, v3

    .line 83
    iget v3, p0, LU0/d;->j:F

    .line 84
    .line 85
    float-to-double v3, v3

    .line 86
    div-double/2addr v1, v3

    .line 87
    double-to-float v1, v1

    .line 88
    div-float/2addr p7, v1

    .line 89
    add-float/2addr p4, p7

    .line 90
    const/high16 v1, 0x43b40000    # 360.0f

    .line 91
    .line 92
    mul-float/2addr p7, v1

    .line 93
    sub-float/2addr p6, p7

    .line 94
    :cond_3
    rem-float/2addr p4, v0

    .line 95
    invoke-virtual {p1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 96
    .line 97
    .line 98
    move-result p7

    .line 99
    mul-float/2addr p7, p4

    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    div-float/2addr p7, v0

    .line 103
    add-float/2addr p4, p5

    .line 104
    invoke-virtual {p1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 105
    .line 106
    .line 107
    move-result p5

    .line 108
    mul-float/2addr p4, p5

    .line 109
    div-float/2addr p4, v0

    .line 110
    const/4 p5, 0x1

    .line 111
    invoke-virtual {p1, p7, p4, p2, p5}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 112
    .line 113
    .line 114
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p5, LU0/m$b;

    .line 117
    .line 118
    invoke-virtual {p5}, LU0/m$b;->c()V

    .line 119
    .line 120
    .line 121
    iget-object v0, p5, LU0/m$b;->a:[F

    .line 122
    .line 123
    iget-object v1, p5, LU0/m$b;->b:[F

    .line 124
    .line 125
    invoke-virtual {p1, p7, v0, v1}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 126
    .line 127
    .line 128
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p3, LU0/m$b;

    .line 131
    .line 132
    invoke-virtual {p3}, LU0/m$b;->c()V

    .line 133
    .line 134
    .line 135
    iget-object p7, p3, LU0/m$b;->a:[F

    .line 136
    .line 137
    iget-object v0, p3, LU0/m$b;->b:[F

    .line 138
    .line 139
    invoke-virtual {p1, p4, p7, v0}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 148
    .line 149
    invoke-virtual {p1, p6}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p5, p6}, LU0/m$b;->d(F)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3, p6}, LU0/m$b;->d(F)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 159
    .line 160
    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method private l(Landroid/graphics/PathMeasure;Landroid/graphics/Path;F)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Path;->rewind()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-boolean v1, p0, LU0/d;->n:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LU0/m;->a:LU0/c;

    .line 13
    .line 14
    check-cast v1, LU0/h;

    .line 15
    .line 16
    iget v1, v1, LU0/c;->j:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, LU0/m;->a:LU0/c;

    .line 20
    .line 21
    check-cast v1, LU0/h;

    .line 22
    .line 23
    iget v1, v1, LU0/c;->k:I

    .line 24
    .line 25
    :goto_0
    int-to-float v1, v1

    .line 26
    div-float v1, v0, v1

    .line 27
    .line 28
    const/high16 v2, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float/2addr v1, v2

    .line 31
    float-to-int v1, v1

    .line 32
    const/4 v3, 0x3

    .line 33
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    mul-int/lit8 v1, v1, 0x2

    .line 38
    .line 39
    int-to-float v3, v1

    .line 40
    div-float/2addr v0, v3

    .line 41
    iput v0, p0, LU0/d;->j:F

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    move v4, v3

    .line 50
    :goto_1
    if-ge v4, v1, :cond_1

    .line 51
    .line 52
    new-instance v5, LU0/m$b;

    .line 53
    .line 54
    invoke-direct {v5, p0}, LU0/m$b;-><init>(LU0/m;)V

    .line 55
    .line 56
    .line 57
    iget v6, p0, LU0/d;->j:F

    .line 58
    .line 59
    int-to-float v7, v4

    .line 60
    mul-float/2addr v6, v7

    .line 61
    iget-object v8, v5, LU0/m$b;->a:[F

    .line 62
    .line 63
    iget-object v9, v5, LU0/m$b;->b:[F

    .line 64
    .line 65
    invoke-virtual {p1, v6, v8, v9}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 66
    .line 67
    .line 68
    new-instance v6, LU0/m$b;

    .line 69
    .line 70
    invoke-direct {v6, p0}, LU0/m$b;-><init>(LU0/m;)V

    .line 71
    .line 72
    .line 73
    iget v8, p0, LU0/d;->j:F

    .line 74
    .line 75
    mul-float/2addr v7, v8

    .line 76
    div-float/2addr v8, v2

    .line 77
    add-float/2addr v7, v8

    .line 78
    iget-object v8, v6, LU0/m$b;->a:[F

    .line 79
    .line 80
    iget-object v9, v6, LU0/m$b;->b:[F

    .line 81
    .line 82
    invoke-virtual {p1, v7, v8, v9}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    mul-float v5, p3, v2

    .line 89
    .line 90
    invoke-virtual {v6, v5}, LU0/m$b;->a(F)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, LU0/m$b;

    .line 104
    .line 105
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, LU0/m$b;

    .line 113
    .line 114
    iget-object p3, p1, LU0/m$b;->a:[F

    .line 115
    .line 116
    aget v1, p3, v3

    .line 117
    .line 118
    const/4 v2, 0x1

    .line 119
    aget p3, p3, v2

    .line 120
    .line 121
    invoke-virtual {p2, v1, p3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    if-ge v2, p3, :cond_2

    .line 129
    .line 130
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    check-cast p3, LU0/m$b;

    .line 135
    .line 136
    invoke-direct {p0, p2, p1, p3}, LU0/d;->j(Landroid/graphics/Path;LU0/m$b;LU0/m$b;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    move-object p1, p3

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    return-void
.end method

.method private m(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V
    .locals 13

    cmpl-float v1, p4, p3

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    sub-float v1, p4, p3

    goto :goto_0

    :cond_0
    add-float v1, p4, v2

    sub-float v1, v1, p3

    :goto_0
    rem-float v3, p3, v2

    const/4 v8, 0x0

    cmpg-float v4, v3, v8

    if-gez v4, :cond_1

    add-float/2addr v3, v2

    .line 1
    :cond_1
    iget v4, p0, LU0/d;->o:F

    cmpg-float v4, v4, v2

    if-gez v4, :cond_2

    add-float v11, v3, v1

    cmpl-float v4, v11, v2

    if-lez v4, :cond_2

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    .line 2
    invoke-direct/range {v0 .. v10}, LU0/d;->m(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    move/from16 v7, p7

    move v4, v11

    .line 3
    invoke-direct/range {v0 .. v10}, LU0/d;->m(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    return-void

    .line 4
    :cond_2
    iget v5, p0, LU0/d;->g:F

    iget v6, p0, LU0/d;->i:F

    div-float/2addr v5, v6

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v5

    double-to-float v5, v5

    const v6, 0x3f7d70a4    # 0.99f

    sub-float v6, v1, v6

    cmpl-float v7, v6, v8

    const/high16 v9, 0x40000000    # 2.0f

    if-ltz v7, :cond_3

    mul-float/2addr v6, v5

    const/high16 v7, 0x43340000    # 180.0f

    div-float/2addr v6, v7

    const v7, 0x3c23d70a    # 0.01f

    div-float/2addr v6, v7

    add-float/2addr v1, v6

    if-nez p10, :cond_3

    div-float/2addr v6, v9

    sub-float/2addr v3, v6

    .line 5
    :cond_3
    iget v6, p0, LU0/d;->o:F

    sub-float v6, v2, v6

    invoke-static {v6, v2, v3}, LS0/a;->c(FFF)F

    move-result v2

    .line 6
    iget v3, p0, LU0/d;->o:F

    invoke-static {v8, v3, v1}, LS0/a;->c(FFF)F

    move-result v1

    move/from16 v6, p6

    int-to-float v3, v6

    .line 7
    iget v6, p0, LU0/d;->i:F

    div-float/2addr v3, v6

    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v3, v6

    move/from16 v7, p7

    int-to-float v6, v7

    .line 8
    iget v7, p0, LU0/d;->i:F

    div-float/2addr v6, v7

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v6, v6

    const/high16 v7, 0x43b40000    # 360.0f

    mul-float/2addr v1, v7

    sub-float/2addr v1, v3

    sub-float/2addr v1, v6

    mul-float/2addr v2, v7

    add-float/2addr v2, v3

    cmpg-float v3, v1, v8

    if-gtz v3, :cond_4

    goto/16 :goto_5

    .line 9
    :cond_4
    iget-object v3, p0, LU0/m;->a:LU0/c;

    check-cast v3, LU0/h;

    iget-boolean v6, p0, LU0/d;->n:Z

    .line 10
    invoke-virtual {v3, v6}, LU0/c;->b(Z)Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    if-eqz p10, :cond_5

    cmpl-float v3, p8, v8

    if-lez v3, :cond_5

    move v3, v6

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    .line 11
    :goto_1
    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    move/from16 v6, p5

    .line 12
    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    iget v6, p0, LU0/d;->f:F

    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 14
    iget v6, p0, LU0/d;->g:F

    mul-float/2addr v6, v9

    mul-float v10, v5, v9

    cmpg-float v11, v1, v10

    const/high16 v12, 0x42b40000    # 90.0f

    if-gez v11, :cond_9

    div-float/2addr v1, v10

    mul-float/2addr v5, v1

    add-float/2addr v2, v5

    .line 15
    new-instance v5, LU0/m$b;

    invoke-direct {v5, p0}, LU0/m$b;-><init>(LU0/m;)V

    if-nez v3, :cond_6

    add-float/2addr v2, v12

    .line 16
    invoke-virtual {v5, v2}, LU0/m$b;->d(F)V

    .line 17
    iget v2, p0, LU0/d;->i:F

    neg-float v2, v2

    invoke-virtual {v5, v2}, LU0/m$b;->a(F)V

    goto :goto_2

    :cond_6
    div-float/2addr v2, v7

    .line 18
    iget-object v3, p0, LU0/m;->d:Landroid/graphics/PathMeasure;

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v3

    mul-float/2addr v2, v3

    div-float/2addr v2, v9

    .line 19
    iget v3, p0, LU0/d;->h:F

    mul-float v3, v3, p8

    .line 20
    iget v7, p0, LU0/d;->i:F

    iget v8, p0, LU0/d;->m:F

    cmpl-float v8, v7, v8

    if-nez v8, :cond_7

    iget v8, p0, LU0/d;->k:F

    cmpl-float v8, v3, v8

    if-eqz v8, :cond_8

    .line 21
    :cond_7
    iput v3, p0, LU0/d;->k:F

    .line 22
    iput v7, p0, LU0/d;->m:F

    .line 23
    invoke-virtual {p0}, LU0/d;->g()V

    .line 24
    :cond_8
    iget-object v3, p0, LU0/m;->d:Landroid/graphics/PathMeasure;

    iget-object v7, v5, LU0/m$b;->a:[F

    iget-object v8, v5, LU0/m$b;->b:[F

    invoke-virtual {v3, v2, v7, v8}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 25
    :goto_2
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    iget v2, p0, LU0/d;->f:F

    move-object/from16 p3, p0

    move-object/from16 p4, p1

    move-object/from16 p5, p2

    move/from16 p9, v1

    move/from16 p8, v2

    move-object/from16 p6, v5

    move/from16 p7, v6

    invoke-direct/range {p3 .. p9}, LU0/d;->o(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FFF)V

    return-void

    :cond_9
    move v9, v6

    .line 27
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    iget-object v6, p0, LU0/m;->a:LU0/c;

    check-cast v6, LU0/h;

    invoke-virtual {v6}, LU0/c;->g()Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_3

    :cond_a
    sget-object v6, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_3
    invoke-virtual {p2, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    add-float/2addr v2, v5

    sub-float/2addr v1, v10

    .line 29
    iget-object v5, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, LU0/m$b;

    invoke-virtual {v5}, LU0/m$b;->c()V

    .line 30
    iget-object v5, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, LU0/m$b;

    invoke-virtual {v5}, LU0/m$b;->c()V

    if-nez v3, :cond_b

    .line 31
    iget-object v3, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, LU0/m$b;

    add-float v5, v2, v12

    invoke-virtual {v3, v5}, LU0/m$b;->d(F)V

    .line 32
    iget-object v3, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, LU0/m$b;

    iget v5, p0, LU0/d;->i:F

    neg-float v5, v5

    invoke-virtual {v3, v5}, LU0/m$b;->a(F)V

    .line 33
    iget-object v3, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, LU0/m$b;

    add-float v5, v2, v1

    add-float/2addr v5, v12

    invoke-virtual {v3, v5}, LU0/m$b;->d(F)V

    .line 34
    iget-object v3, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, LU0/m$b;

    iget v5, p0, LU0/d;->i:F

    neg-float v5, v5

    invoke-virtual {v3, v5}, LU0/m$b;->a(F)V

    .line 35
    iget-object v3, p0, LU0/d;->p:Landroid/graphics/RectF;

    iget v5, p0, LU0/d;->i:F

    neg-float v6, v5

    neg-float v7, v5

    invoke-virtual {v3, v6, v7, v5, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 36
    iget-object v3, p0, LU0/d;->p:Landroid/graphics/RectF;

    const/4 v5, 0x0

    move-object/from16 p3, p1

    move-object/from16 p8, p2

    move/from16 p6, v1

    move/from16 p5, v2

    move-object/from16 p4, v3

    move/from16 p7, v5

    invoke-virtual/range {p3 .. p8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_4

    .line 37
    :cond_b
    iget-object v3, p0, LU0/m;->d:Landroid/graphics/PathMeasure;

    move v4, v2

    iget-object v2, p0, LU0/m;->c:Landroid/graphics/Path;

    move v5, v1

    move-object v1, v3

    iget-object v3, p0, LU0/d;->q:Landroid/util/Pair;

    div-float/2addr v4, v7

    div-float/2addr v5, v7

    move-object v0, p0

    move/from16 v6, p8

    move/from16 v7, p9

    invoke-direct/range {v0 .. v7}, LU0/d;->k(Landroid/graphics/PathMeasure;Landroid/graphics/Path;Landroid/util/Pair;FFFF)V

    .line 38
    iget-object v1, p0, LU0/m;->c:Landroid/graphics/Path;

    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 39
    :goto_4
    iget-object v1, p0, LU0/m;->a:LU0/c;

    check-cast v1, LU0/h;

    invoke-virtual {v1}, LU0/c;->g()Z

    move-result v1

    if-nez v1, :cond_c

    iget v1, p0, LU0/d;->g:F

    cmpl-float v1, v1, v8

    if-lez v1, :cond_c

    .line 40
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    iget-object v1, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, LU0/m$b;

    iget v3, p0, LU0/d;->f:F

    move-object/from16 p3, p0

    move-object/from16 p4, p1

    move-object/from16 p5, p2

    move-object/from16 p6, v1

    move/from16 p8, v3

    move/from16 p7, v9

    invoke-direct/range {p3 .. p8}, LU0/d;->n(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FF)V

    .line 42
    iget-object v1, p0, LU0/d;->q:Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, LU0/m$b;

    iget v2, p0, LU0/d;->f:F

    move-object/from16 p6, v1

    move/from16 p8, v2

    invoke-direct/range {p3 .. p8}, LU0/d;->n(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FF)V

    :cond_c
    :goto_5
    return-void
.end method

.method private n(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FF)V
    .locals 7

    .line 1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move v4, p4

    .line 8
    move v5, p5

    .line 9
    invoke-direct/range {v0 .. v6}, LU0/d;->o(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FFF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private o(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$b;FFF)V
    .locals 5

    .line 1
    iget v0, p0, LU0/d;->f:F

    .line 2
    .line 3
    invoke-static {p5, v0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    iget v0, p0, LU0/d;->g:F

    .line 8
    .line 9
    mul-float/2addr v0, p5

    .line 10
    iget v1, p0, LU0/d;->f:F

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float v2, p4, v1

    .line 16
    .line 17
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v3, Landroid/graphics/RectF;

    .line 22
    .line 23
    neg-float p4, p4

    .line 24
    div-float/2addr p4, v1

    .line 25
    neg-float v4, p5

    .line 26
    div-float/2addr v4, v1

    .line 27
    div-float/2addr p5, v1

    .line 28
    invoke-direct {v3, p4, v4, v2, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 32
    .line 33
    .line 34
    iget-object p4, p3, LU0/m$b;->a:[F

    .line 35
    .line 36
    const/4 p5, 0x0

    .line 37
    aget p5, p4, p5

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    aget p4, p4, v1

    .line 41
    .line 42
    invoke-virtual {p1, p5, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p3, LU0/m$b;->b:[F

    .line 46
    .line 47
    invoke-virtual {p0, p3}, LU0/m;->i([F)F

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p6, p6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v3, v0, v0, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private p()I
    .locals 2

    .line 1
    iget-object v0, p0, LU0/m;->a:LU0/c;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LU0/h;

    .line 5
    .line 6
    iget v1, v1, LU0/h;->p:I

    .line 7
    .line 8
    check-cast v0, LU0/h;

    .line 9
    .line 10
    iget v0, v0, LU0/h;->q:I

    .line 11
    .line 12
    mul-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    add-int/2addr v1, v0

    .line 15
    return v1
.end method


# virtual methods
.method a(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p0}, LU0/d;->f()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    div-float/2addr v0, v1

    .line 12
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    invoke-virtual {p0}, LU0/d;->e()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    div-float/2addr v1, v2

    .line 23
    iget-object v2, p0, LU0/m;->a:LU0/c;

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, LU0/h;

    .line 27
    .line 28
    iget v3, v3, LU0/h;->p:I

    .line 29
    .line 30
    int-to-float v3, v3

    .line 31
    const/high16 v4, 0x40000000    # 2.0f

    .line 32
    .line 33
    div-float/2addr v3, v4

    .line 34
    check-cast v2, LU0/h;

    .line 35
    .line 36
    iget v2, v2, LU0/h;->q:I

    .line 37
    .line 38
    int-to-float v2, v2

    .line 39
    add-float/2addr v3, v2

    .line 40
    mul-float v2, v3, v0

    .line 41
    .line 42
    mul-float v5, v3, v1

    .line 43
    .line 44
    iget v6, p2, Landroid/graphics/Rect;->left:I

    .line 45
    .line 46
    int-to-float v6, v6

    .line 47
    add-float/2addr v2, v6

    .line 48
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 49
    .line 50
    int-to-float p2, p2

    .line 51
    add-float/2addr v5, p2

    .line 52
    invoke-virtual {p1, v2, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 53
    .line 54
    .line 55
    const/high16 p2, -0x3d4c0000    # -90.0f

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, LU0/m;->a:LU0/c;

    .line 64
    .line 65
    check-cast p2, LU0/h;

    .line 66
    .line 67
    iget p2, p2, LU0/h;->r:I

    .line 68
    .line 69
    const/high16 v0, 0x3f800000    # 1.0f

    .line 70
    .line 71
    if-eqz p2, :cond_0

    .line 72
    .line 73
    const/high16 p2, -0x40800000    # -1.0f

    .line 74
    .line 75
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 76
    .line 77
    .line 78
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v1, 0x1d

    .line 81
    .line 82
    if-ne p2, v1, :cond_0

    .line 83
    .line 84
    const p2, 0x3dcccccd    # 0.1f

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 88
    .line 89
    .line 90
    :cond_0
    neg-float p2, v3

    .line 91
    invoke-virtual {p1, p2, p2, v3, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, LU0/m;->a:LU0/c;

    .line 95
    .line 96
    move-object p2, p1

    .line 97
    check-cast p2, LU0/h;

    .line 98
    .line 99
    iget p2, p2, LU0/c;->a:I

    .line 100
    .line 101
    int-to-float p2, p2

    .line 102
    mul-float/2addr p2, p3

    .line 103
    iput p2, p0, LU0/d;->f:F

    .line 104
    .line 105
    move-object p2, p1

    .line 106
    check-cast p2, LU0/h;

    .line 107
    .line 108
    iget p2, p2, LU0/c;->a:I

    .line 109
    .line 110
    const/4 v1, 0x2

    .line 111
    div-int/2addr p2, v1

    .line 112
    check-cast p1, LU0/h;

    .line 113
    .line 114
    invoke-virtual {p1}, LU0/c;->a()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    int-to-float p1, p1

    .line 123
    mul-float/2addr p1, p3

    .line 124
    iput p1, p0, LU0/d;->g:F

    .line 125
    .line 126
    iget-object p1, p0, LU0/m;->a:LU0/c;

    .line 127
    .line 128
    move-object p2, p1

    .line 129
    check-cast p2, LU0/h;

    .line 130
    .line 131
    iget p2, p2, LU0/c;->l:I

    .line 132
    .line 133
    int-to-float p2, p2

    .line 134
    mul-float/2addr p2, p3

    .line 135
    iput p2, p0, LU0/d;->h:F

    .line 136
    .line 137
    move-object p2, p1

    .line 138
    check-cast p2, LU0/h;

    .line 139
    .line 140
    iget p2, p2, LU0/h;->p:I

    .line 141
    .line 142
    move-object v2, p1

    .line 143
    check-cast v2, LU0/h;

    .line 144
    .line 145
    iget v2, v2, LU0/c;->a:I

    .line 146
    .line 147
    sub-int/2addr p2, v2

    .line 148
    int-to-float p2, p2

    .line 149
    div-float/2addr p2, v4

    .line 150
    iput p2, p0, LU0/d;->i:F

    .line 151
    .line 152
    if-nez p4, :cond_1

    .line 153
    .line 154
    if-eqz p5, :cond_7

    .line 155
    .line 156
    :cond_1
    sub-float v2, v0, p3

    .line 157
    .line 158
    move-object v3, p1

    .line 159
    check-cast v3, LU0/h;

    .line 160
    .line 161
    iget v3, v3, LU0/c;->a:I

    .line 162
    .line 163
    int-to-float v3, v3

    .line 164
    mul-float/2addr v2, v3

    .line 165
    div-float/2addr v2, v4

    .line 166
    if-eqz p4, :cond_2

    .line 167
    .line 168
    move-object v3, p1

    .line 169
    check-cast v3, LU0/h;

    .line 170
    .line 171
    iget v3, v3, LU0/c;->g:I

    .line 172
    .line 173
    if-eq v3, v1, :cond_3

    .line 174
    .line 175
    :cond_2
    const/4 v3, 0x1

    .line 176
    if-eqz p5, :cond_4

    .line 177
    .line 178
    move-object v4, p1

    .line 179
    check-cast v4, LU0/h;

    .line 180
    .line 181
    iget v4, v4, LU0/c;->h:I

    .line 182
    .line 183
    if-ne v4, v3, :cond_4

    .line 184
    .line 185
    :cond_3
    add-float/2addr p2, v2

    .line 186
    iput p2, p0, LU0/d;->i:F

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_4
    if-eqz p4, :cond_5

    .line 190
    .line 191
    move-object p4, p1

    .line 192
    check-cast p4, LU0/h;

    .line 193
    .line 194
    iget p4, p4, LU0/c;->g:I

    .line 195
    .line 196
    if-eq p4, v3, :cond_6

    .line 197
    .line 198
    :cond_5
    if-eqz p5, :cond_7

    .line 199
    .line 200
    move-object p4, p1

    .line 201
    check-cast p4, LU0/h;

    .line 202
    .line 203
    iget p4, p4, LU0/c;->h:I

    .line 204
    .line 205
    if-ne p4, v1, :cond_7

    .line 206
    .line 207
    :cond_6
    sub-float/2addr p2, v2

    .line 208
    iput p2, p0, LU0/d;->i:F

    .line 209
    .line 210
    :cond_7
    :goto_0
    if-eqz p5, :cond_8

    .line 211
    .line 212
    check-cast p1, LU0/h;

    .line 213
    .line 214
    iget p1, p1, LU0/c;->h:I

    .line 215
    .line 216
    const/4 p2, 0x3

    .line 217
    if-ne p1, p2, :cond_8

    .line 218
    .line 219
    iput p3, p0, LU0/d;->o:F

    .line 220
    .line 221
    return-void

    .line 222
    :cond_8
    iput v0, p0, LU0/d;->o:F

    .line 223
    .line 224
    return-void
.end method

.method b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 0

    .line 1
    return-void
.end method

.method c(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$a;I)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    iget v1, v0, LU0/m$a;->c:I

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-static {v1, v2}, LO0/a;->a(II)I

    .line 8
    .line 9
    .line 10
    move-result v7

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    iget v1, v0, LU0/m$a;->g:F

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v0, LU0/m$a;->h:Z

    .line 20
    .line 21
    iput-boolean v1, p0, LU0/d;->n:Z

    .line 22
    .line 23
    iget v5, v0, LU0/m$a;->a:F

    .line 24
    .line 25
    iget v6, v0, LU0/m$a;->b:F

    .line 26
    .line 27
    iget v8, v0, LU0/m$a;->d:I

    .line 28
    .line 29
    iget v10, v0, LU0/m$a;->e:F

    .line 30
    .line 31
    iget v11, v0, LU0/m$a;->f:F

    .line 32
    .line 33
    const/4 v12, 0x1

    .line 34
    move v9, v8

    .line 35
    move-object v2, p0

    .line 36
    move-object v3, p1

    .line 37
    move-object v4, p2

    .line 38
    invoke-direct/range {v2 .. v12}, LU0/d;->m(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V
    .locals 11

    .line 1
    invoke-static/range {p5 .. p6}, LO0/a;->a(II)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LU0/d;->n:Z

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move v3, p3

    .line 17
    move v4, p4

    .line 18
    move/from16 v6, p7

    .line 19
    .line 20
    invoke-direct/range {v0 .. v10}, LU0/d;->m(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method e()I
    .locals 1

    .line 1
    invoke-direct {p0}, LU0/d;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method f()I
    .locals 1

    .line 1
    invoke-direct {p0}, LU0/d;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method g()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 9
    .line 10
    const/high16 v2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    const/4 v3, 0x2

    .line 19
    if-ge v2, v3, :cond_0

    .line 20
    .line 21
    iget-object v4, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/high16 v10, 0x3f800000    # 1.0f

    .line 25
    .line 26
    const/high16 v5, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const v6, 0x3f0d6289

    .line 29
    .line 30
    .line 31
    const v7, 0x3f0d6289

    .line 32
    .line 33
    .line 34
    const/high16 v8, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 37
    .line 38
    .line 39
    iget-object v11, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 40
    .line 41
    const/high16 v16, -0x40800000    # -1.0f

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    const v12, -0x40f29d77

    .line 46
    .line 47
    .line 48
    const/high16 v13, 0x3f800000    # 1.0f

    .line 49
    .line 50
    const/high16 v14, -0x40800000    # -1.0f

    .line 51
    .line 52
    const v15, 0x3f0d6289

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {v11 .. v17}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    const/high16 v9, -0x40800000    # -1.0f

    .line 62
    .line 63
    const/high16 v4, -0x40800000    # -1.0f

    .line 64
    .line 65
    const v5, -0x40f29d77

    .line 66
    .line 67
    .line 68
    const v6, -0x40f29d77

    .line 69
    .line 70
    .line 71
    const/high16 v7, -0x40800000    # -1.0f

    .line 72
    .line 73
    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 74
    .line 75
    .line 76
    iget-object v10, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 77
    .line 78
    const/high16 v15, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const v11, 0x3f0d6289

    .line 83
    .line 84
    .line 85
    const/high16 v12, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v14, -0x40f29d77

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    iget-object v2, v0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 102
    .line 103
    iget v3, v0, LU0/d;->i:F

    .line 104
    .line 105
    invoke-virtual {v2, v3, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 109
    .line 110
    iget-object v3, v0, LU0/m;->e:Landroid/graphics/Matrix;

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, LU0/m;->a:LU0/c;

    .line 116
    .line 117
    check-cast v2, LU0/h;

    .line 118
    .line 119
    iget-boolean v3, v0, LU0/d;->n:Z

    .line 120
    .line 121
    invoke-virtual {v2, v3}, LU0/c;->b(Z)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_1

    .line 126
    .line 127
    iget-object v2, v0, LU0/m;->d:Landroid/graphics/PathMeasure;

    .line 128
    .line 129
    iget-object v3, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 130
    .line 131
    invoke-virtual {v2, v3, v1}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 132
    .line 133
    .line 134
    iget-object v2, v0, LU0/m;->d:Landroid/graphics/PathMeasure;

    .line 135
    .line 136
    iget-object v3, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 137
    .line 138
    iget v4, v0, LU0/d;->k:F

    .line 139
    .line 140
    invoke-direct {v0, v2, v3, v4}, LU0/d;->l(Landroid/graphics/PathMeasure;Landroid/graphics/Path;F)V

    .line 141
    .line 142
    .line 143
    :cond_1
    iget-object v2, v0, LU0/m;->d:Landroid/graphics/PathMeasure;

    .line 144
    .line 145
    iget-object v3, v0, LU0/m;->b:Landroid/graphics/Path;

    .line 146
    .line 147
    invoke-virtual {v2, v3, v1}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 148
    .line 149
    .line 150
    return-void
.end method
