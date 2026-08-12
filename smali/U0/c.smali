.class public abstract LU0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:F

.field public d:Z

.field public e:[I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:F


# direct methods
.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, LU0/c;->e:[I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget v2, LF0/c;->v0:I

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sget-object v4, LF0/k;->S:[I

    .line 20
    .line 21
    new-array v7, v0, [I

    .line 22
    .line 23
    move-object v2, p1

    .line 24
    move-object v3, p2

    .line 25
    move v5, p3

    .line 26
    move v6, p4

    .line 27
    invoke-static/range {v2 .. v7}, Lcom/google/android/material/internal/q;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget p2, LF0/k;->c0:I

    .line 32
    .line 33
    invoke-static {v2, p1, p2, v1}, LW0/c;->d(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, LU0/c;->a:I

    .line 38
    .line 39
    sget p2, LF0/k;->b0:I

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const/high16 p3, 0x3f800000    # 1.0f

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    iget p4, p2, Landroid/util/TypedValue;->type:I

    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    if-ne p4, v1, :cond_0

    .line 53
    .line 54
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    invoke-static {p2, p4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iget p4, p0, LU0/c;->a:I

    .line 69
    .line 70
    div-int/lit8 p4, p4, 0x2

    .line 71
    .line 72
    invoke-static {p2, p4}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, LU0/c;->b:I

    .line 77
    .line 78
    iput-boolean v0, p0, LU0/c;->d:Z

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const/4 v1, 0x6

    .line 82
    if-ne p4, v1, :cond_1

    .line 83
    .line 84
    invoke-virtual {p2, p3, p3}, Landroid/util/TypedValue;->getFraction(FF)F

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    const/high16 p4, 0x3f000000    # 0.5f

    .line 89
    .line 90
    invoke-static {p2, p4}, Ljava/lang/Math;->min(FF)F

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    iput p2, p0, LU0/c;->c:F

    .line 95
    .line 96
    const/4 p2, 0x1

    .line 97
    iput-boolean p2, p0, LU0/c;->d:Z

    .line 98
    .line 99
    :cond_1
    :goto_0
    sget p2, LF0/k;->Y:I

    .line 100
    .line 101
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput p2, p0, LU0/c;->g:I

    .line 106
    .line 107
    sget p2, LF0/k;->T:I

    .line 108
    .line 109
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iput p2, p0, LU0/c;->h:I

    .line 114
    .line 115
    sget p2, LF0/k;->W:I

    .line 116
    .line 117
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iput p2, p0, LU0/c;->i:I

    .line 122
    .line 123
    sget p2, LF0/k;->f0:I

    .line 124
    .line 125
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    sget p4, LF0/k;->g0:I

    .line 134
    .line 135
    invoke-virtual {p1, p4, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 136
    .line 137
    .line 138
    move-result p4

    .line 139
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 140
    .line 141
    .line 142
    move-result p4

    .line 143
    iput p4, p0, LU0/c;->j:I

    .line 144
    .line 145
    sget p4, LF0/k;->h0:I

    .line 146
    .line 147
    invoke-virtual {p1, p4, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    iput p2, p0, LU0/c;->k:I

    .line 156
    .line 157
    sget p2, LF0/k;->d0:I

    .line 158
    .line 159
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    iput p2, p0, LU0/c;->l:I

    .line 168
    .line 169
    sget p2, LF0/k;->e0:I

    .line 170
    .line 171
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    iput p2, p0, LU0/c;->m:I

    .line 176
    .line 177
    sget p2, LF0/k;->U:I

    .line 178
    .line 179
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    iput p2, p0, LU0/c;->n:F

    .line 184
    .line 185
    invoke-direct {p0, v2, p1}, LU0/c;->e(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0, v2, p1}, LU0/c;->f(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method private e(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 4

    .line 1
    sget v0, LF0/k;->V:I

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, -0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget p2, Ld/a;->w:I

    .line 11
    .line 12
    invoke-static {p1, p2, v2}, LO0/a;->b(Landroid/content/Context;II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    filled-new-array {p1}, [I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LU0/c;->e:[I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget v1, v1, Landroid/util/TypedValue;->type:I

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    filled-new-array {p1}, [I

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, LU0/c;->e:[I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, LU0/c;->e:[I

    .line 56
    .line 57
    array-length p1, p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string p2, "indicatorColors cannot be empty when indicatorColor is not used."

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method private f(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 2

    .line 1
    sget v0, LF0/k;->a0:I

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, LU0/c;->f:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object p2, p0, LU0/c;->e:[I

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    aget p2, p2, v0

    .line 21
    .line 22
    iput p2, p0, LU0/c;->f:I

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const p2, 0x1010033

    .line 29
    .line 30
    .line 31
    filled-new-array {p2}, [I

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const p2, 0x3e4ccccd    # 0.2f

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    const/high16 p1, 0x437f0000    # 255.0f

    .line 50
    .line 51
    mul-float/2addr p2, p1

    .line 52
    float-to-int p1, p2

    .line 53
    iget p2, p0, LU0/c;->f:I

    .line 54
    .line 55
    invoke-static {p2, p1}, LO0/a;->a(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, p0, LU0/c;->f:I

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-boolean v0, p0, LU0/c;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LU0/c;->a:I

    .line 6
    .line 7
    int-to-float v0, v0

    .line 8
    iget v1, p0, LU0/c;->c:F

    .line 9
    .line 10
    mul-float/2addr v0, v1

    .line 11
    float-to-int v0, v0

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, p0, LU0/c;->b:I

    .line 14
    .line 15
    return v0
.end method

.method public b(Z)Z
    .locals 1

    .line 1
    iget v0, p0, LU0/c;->l:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget v0, p0, LU0/c;->k:I

    .line 8
    .line 9
    if-gtz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget p1, p0, LU0/c;->j:I

    .line 14
    .line 15
    if-lez p1, :cond_2

    .line 16
    .line 17
    :cond_1
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_2
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget v0, p0, LU0/c;->h:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget v0, p0, LU0/c;->g:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public g()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LU0/c;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LU0/c;->c:F

    .line 6
    .line 7
    const/high16 v1, 0x3f000000    # 0.5f

    .line 8
    .line 9
    cmpl-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method h()V
    .locals 2

    .line 1
    iget v0, p0, LU0/c;->i:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "indicatorTrackGapSize must be >= 0."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
