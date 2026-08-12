.class Landroidx/recyclerview/widget/RecyclerView$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "B"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field f:Landroid/widget/OverScroller;

.field g:Landroid/view/animation/Interpolator;

.field private h:Z

.field private i:Z

.field final synthetic j:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->I0:Landroid/view/animation/Interpolator;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->g:Landroid/view/animation/Interpolator;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->h:Z

    .line 12
    .line 13
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->i:Z

    .line 14
    .line 15
    new-instance v1, Landroid/widget/OverScroller;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 25
    .line 26
    return-void
.end method

.method private a(II)I
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-le p1, p2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move p1, p2

    .line 31
    :goto_2
    int-to-float p1, p1

    .line 32
    int-to-float p2, v1

    .line 33
    div-float/2addr p1, p2

    .line 34
    const/high16 p2, 0x3f800000    # 1.0f

    .line 35
    .line 36
    add-float/2addr p1, p2

    .line 37
    const/high16 p2, 0x43960000    # 300.0f

    .line 38
    .line 39
    mul-float/2addr p1, p2

    .line 40
    float-to-int p1, p1

    .line 41
    const/16 p2, 0x7d0

    .line 42
    .line 43
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method

.method private c()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    invoke-static {v0, p0}, LJ/W;->a0(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->e:I

    .line 9
    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->d:I

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->g:Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    sget-object v1, Landroidx/recyclerview/widget/RecyclerView;->I0:Landroid/view/animation/Interpolator;

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$B;->g:Landroid/view/animation/Interpolator;

    .line 19
    .line 20
    new-instance v0, Landroid/widget/OverScroller;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v0, v2, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 32
    .line 33
    :cond_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 34
    .line 35
    const/high16 v10, -0x80000000

    .line 36
    .line 37
    const v11, 0x7fffffff

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/high16 v8, -0x80000000

    .line 43
    .line 44
    const v9, 0x7fffffff

    .line 45
    .line 46
    .line 47
    move v6, p1

    .line 48
    move v7, p2

    .line 49
    invoke-virtual/range {v3 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$B;->d()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method d()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->i:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$B;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e(IIILandroid/view/animation/Interpolator;)V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$B;->a(II)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    :cond_0
    move v5, p3

    .line 10
    if-nez p4, :cond_1

    .line 11
    .line 12
    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->I0:Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    :cond_1
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->g:Landroid/view/animation/Interpolator;

    .line 15
    .line 16
    if-eq p3, p4, :cond_2

    .line 17
    .line 18
    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$B;->g:Landroid/view/animation/Interpolator;

    .line 19
    .line 20
    new-instance p3, Landroid/widget/OverScroller;

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p3, v0, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 32
    .line 33
    :cond_2
    const/4 p3, 0x0

    .line 34
    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->e:I

    .line 35
    .line 36
    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->d:I

    .line 37
    .line 38
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    const/4 p4, 0x2

    .line 41
    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    move v3, p1

    .line 49
    move v4, p2

    .line 50
    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$B;->d()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$B;->f()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$B;->i:Z

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$B;->h:Z

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->u()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->f:Landroid/widget/OverScroller;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_17

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$B;->d:I

    .line 39
    .line 40
    sub-int v8, v4, v6

    .line 41
    .line 42
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$B;->e:I

    .line 43
    .line 44
    sub-int v9, v5, v6

    .line 45
    .line 46
    iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->d:I

    .line 47
    .line 48
    iput v5, v0, Landroidx/recyclerview/widget/RecyclerView$B;->e:I

    .line 49
    .line 50
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    iget-object v10, v7, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 53
    .line 54
    aput v2, v10, v2

    .line 55
    .line 56
    aput v2, v10, v3

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x1

    .line 60
    invoke-virtual/range {v7 .. v12}, Landroidx/recyclerview/widget/RecyclerView;->F(II[I[II)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 69
    .line 70
    aget v5, v4, v2

    .line 71
    .line 72
    sub-int/2addr v8, v5

    .line 73
    aget v4, v4, v3

    .line 74
    .line 75
    sub-int/2addr v9, v4

    .line 76
    :cond_1
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/view/View;->getOverScrollMode()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    const/4 v5, 0x2

    .line 83
    if-eq v4, v5, :cond_2

    .line 84
    .line 85
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    .line 87
    invoke-virtual {v4, v8, v9}, Landroidx/recyclerview/widget/RecyclerView;->t(II)V

    .line 88
    .line 89
    .line 90
    :cond_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->l:Landroidx/recyclerview/widget/RecyclerView$h;

    .line 93
    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 97
    .line 98
    aput v2, v6, v2

    .line 99
    .line 100
    aput v2, v6, v3

    .line 101
    .line 102
    invoke-virtual {v4, v8, v9, v6}, Landroidx/recyclerview/widget/RecyclerView;->g1(II[I)V

    .line 103
    .line 104
    .line 105
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 106
    .line 107
    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 108
    .line 109
    aget v7, v6, v2

    .line 110
    .line 111
    aget v6, v6, v3

    .line 112
    .line 113
    sub-int/2addr v8, v7

    .line 114
    sub-int/2addr v9, v6

    .line 115
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 116
    .line 117
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$p;->g:Landroidx/recyclerview/widget/RecyclerView$y;

    .line 118
    .line 119
    if-eqz v4, :cond_5

    .line 120
    .line 121
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$y;->g()Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-nez v10, :cond_5

    .line 126
    .line 127
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$y;->h()Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_5

    .line 132
    .line 133
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 134
    .line 135
    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->h0:Landroidx/recyclerview/widget/RecyclerView$z;

    .line 136
    .line 137
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$z;->b()I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-nez v10, :cond_3

    .line 142
    .line 143
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$y;->r()V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_3
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$y;->f()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-lt v11, v10, :cond_4

    .line 152
    .line 153
    sub-int/2addr v10, v3

    .line 154
    invoke-virtual {v4, v10}, Landroidx/recyclerview/widget/RecyclerView$y;->p(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v7, v6}, Landroidx/recyclerview/widget/RecyclerView$y;->j(II)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_4
    invoke-virtual {v4, v7, v6}, Landroidx/recyclerview/widget/RecyclerView$y;->j(II)V

    .line 162
    .line 163
    .line 164
    :cond_5
    :goto_0
    move v13, v6

    .line 165
    move v12, v7

    .line 166
    :goto_1
    move v14, v8

    .line 167
    move v15, v9

    .line 168
    goto :goto_2

    .line 169
    :cond_6
    move v12, v2

    .line 170
    move v13, v12

    .line 171
    goto :goto_1

    .line 172
    :goto_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 173
    .line 174
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->o:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_7

    .line 181
    .line 182
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 185
    .line 186
    .line 187
    :cond_7
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    iget-object v4, v11, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 190
    .line 191
    aput v2, v4, v2

    .line 192
    .line 193
    aput v2, v4, v3

    .line 194
    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    const/16 v17, 0x1

    .line 198
    .line 199
    move-object/from16 v18, v4

    .line 200
    .line 201
    invoke-virtual/range {v11 .. v18}, Landroidx/recyclerview/widget/RecyclerView;->G(IIII[II[I)V

    .line 202
    .line 203
    .line 204
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 205
    .line 206
    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    .line 207
    .line 208
    aget v7, v6, v2

    .line 209
    .line 210
    sub-int/2addr v14, v7

    .line 211
    aget v6, v6, v3

    .line 212
    .line 213
    sub-int/2addr v15, v6

    .line 214
    if-nez v12, :cond_8

    .line 215
    .line 216
    if-eqz v13, :cond_9

    .line 217
    .line 218
    :cond_8
    invoke-virtual {v4, v12, v13}, Landroidx/recyclerview/widget/RecyclerView;->I(II)V

    .line 219
    .line 220
    .line 221
    :cond_9
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 222
    .line 223
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-nez v4, :cond_a

    .line 228
    .line 229
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 230
    .line 231
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 232
    .line 233
    .line 234
    :cond_a
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-ne v4, v6, :cond_b

    .line 243
    .line 244
    move v4, v3

    .line 245
    goto :goto_3

    .line 246
    :cond_b
    move v4, v2

    .line 247
    :goto_3
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-ne v6, v7, :cond_c

    .line 256
    .line 257
    move v6, v3

    .line 258
    goto :goto_4

    .line 259
    :cond_c
    move v6, v2

    .line 260
    :goto_4
    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    if-nez v7, :cond_f

    .line 265
    .line 266
    if-nez v4, :cond_d

    .line 267
    .line 268
    if-eqz v14, :cond_e

    .line 269
    .line 270
    :cond_d
    if-nez v6, :cond_f

    .line 271
    .line 272
    if-eqz v15, :cond_e

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_e
    move v4, v2

    .line 276
    goto :goto_6

    .line 277
    :cond_f
    :goto_5
    move v4, v3

    .line 278
    :goto_6
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 279
    .line 280
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 281
    .line 282
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$p;->g:Landroidx/recyclerview/widget/RecyclerView$y;

    .line 283
    .line 284
    if-eqz v6, :cond_10

    .line 285
    .line 286
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$y;->g()Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-eqz v6, :cond_10

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_10
    if-eqz v4, :cond_16

    .line 294
    .line 295
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 296
    .line 297
    invoke-virtual {v4}, Landroid/view/View;->getOverScrollMode()I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eq v4, v5, :cond_15

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    float-to-int v1, v1

    .line 308
    if-gez v14, :cond_11

    .line 309
    .line 310
    neg-int v4, v1

    .line 311
    goto :goto_7

    .line 312
    :cond_11
    if-lez v14, :cond_12

    .line 313
    .line 314
    move v4, v1

    .line 315
    goto :goto_7

    .line 316
    :cond_12
    move v4, v2

    .line 317
    :goto_7
    if-gez v15, :cond_13

    .line 318
    .line 319
    neg-int v1, v1

    .line 320
    goto :goto_8

    .line 321
    :cond_13
    if-lez v15, :cond_14

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_14
    move v1, v2

    .line 325
    :goto_8
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 326
    .line 327
    invoke-virtual {v5, v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(II)V

    .line 328
    .line 329
    .line 330
    :cond_15
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->E0:Z

    .line 331
    .line 332
    if-eqz v1, :cond_17

    .line 333
    .line 334
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 335
    .line 336
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->g0:Landroidx/recyclerview/widget/e$b;

    .line 337
    .line 338
    invoke-virtual {v1}, Landroidx/recyclerview/widget/e$b;->b()V

    .line 339
    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_16
    :goto_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$B;->d()V

    .line 343
    .line 344
    .line 345
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 346
    .line 347
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView;->f0:Landroidx/recyclerview/widget/e;

    .line 348
    .line 349
    if-eqz v4, :cond_17

    .line 350
    .line 351
    invoke-virtual {v4, v1, v12, v13}, Landroidx/recyclerview/widget/e;->f(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 352
    .line 353
    .line 354
    :cond_17
    :goto_a
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 355
    .line 356
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$p;

    .line 357
    .line 358
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$p;->g:Landroidx/recyclerview/widget/RecyclerView$y;

    .line 359
    .line 360
    if-eqz v1, :cond_18

    .line 361
    .line 362
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$y;->g()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_18

    .line 367
    .line 368
    invoke-virtual {v1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$y;->j(II)V

    .line 369
    .line 370
    .line 371
    :cond_18
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$B;->h:Z

    .line 372
    .line 373
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->i:Z

    .line 374
    .line 375
    if-eqz v1, :cond_19

    .line 376
    .line 377
    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$B;->c()V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_19
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 384
    .line 385
    .line 386
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$B;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 387
    .line 388
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->t1(I)V

    .line 389
    .line 390
    .line 391
    return-void
.end method
