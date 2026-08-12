.class Lcom/google/android/material/button/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/material/button/MaterialButton;

.field private b:LZ0/l;

.field private c:LZ0/t;

.field private d:LP/l;

.field private e:LZ0/h$d;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Landroid/graphics/PorterDuff$Mode;

.field private m:Landroid/content/res/ColorStateList;

.field private n:Landroid/content/res/ColorStateList;

.field private o:Landroid/content/res/ColorStateList;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Landroid/graphics/drawable/LayerDrawable;

.field private w:I


# direct methods
.method constructor <init>(Lcom/google/android/material/button/MaterialButton;LZ0/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->q:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->r:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->s:Z

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->u:Z

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 17
    .line 18
    return-void
.end method

.method private L(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget v4, p0, Lcom/google/android/material/button/e;->h:I

    .line 26
    .line 27
    iget v5, p0, Lcom/google/android/material/button/e;->i:I

    .line 28
    .line 29
    iput p2, p0, Lcom/google/android/material/button/e;->i:I

    .line 30
    .line 31
    iput p1, p0, Lcom/google/android/material/button/e;->h:I

    .line 32
    .line 33
    iget-boolean v6, p0, Lcom/google/android/material/button/e;->r:Z

    .line 34
    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    invoke-direct {p0}, Lcom/google/android/material/button/e;->M()V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v6, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 41
    .line 42
    add-int/2addr v1, p1

    .line 43
    sub-int/2addr v1, v4

    .line 44
    add-int/2addr v3, p2

    .line 45
    sub-int/2addr v3, v5

    .line 46
    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private M()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/button/e;->a()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v1, p0, Lcom/google/android/material/button/e;->w:I

    .line 17
    .line 18
    int-to-float v1, v1

    .line 19
    invoke-virtual {v0, v1}, LZ0/h;->b0(F)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private N()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LZ0/h;->h0(LZ0/t;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LZ0/h;->setShapeAppearanceModel(LZ0/l;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, LZ0/h;->a0(LP/l;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/google/android/material/button/e;->p()LZ0/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, LZ0/h;->h0(LZ0/t;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v1, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, LZ0/h;->setShapeAppearanceModel(LZ0/l;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    iget-object v1, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0, v1}, LZ0/h;->a0(LP/l;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->f()LZ0/o;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object v1, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 60
    .line 61
    invoke-interface {v0, v1}, LZ0/o;->setShapeAppearanceModel(LZ0/l;)V

    .line 62
    .line 63
    .line 64
    instance-of v1, v0, LZ0/h;

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    check-cast v0, LZ0/h;

    .line 69
    .line 70
    iget-object v1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0, v1}, LZ0/h;->h0(LZ0/t;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {v0, v1}, LZ0/h;->a0(LP/l;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
.end method

.method private O()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/google/android/material/button/e;->p()LZ0/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v2, p0, Lcom/google/android/material/button/e;->k:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    iget-object v3, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, LZ0/h;->j0(FLandroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lcom/google/android/material/button/e;->k:I

    .line 22
    .line 23
    int-to-float v0, v0

    .line 24
    iget-boolean v2, p0, Lcom/google/android/material/button/e;->q:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 29
    .line 30
    sget v3, LF0/a;->i:I

    .line 31
    .line 32
    invoke-static {v2, v3}, LO0/a;->d(Landroid/view/View;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_0
    invoke-virtual {v1, v0, v2}, LZ0/h;->i0(FI)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method private P(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/InsetDrawable;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/drawable/InsetDrawable;

    .line 2
    .line 3
    iget v2, p0, Lcom/google/android/material/button/e;->f:I

    .line 4
    .line 5
    iget v3, p0, Lcom/google/android/material/button/e;->h:I

    .line 6
    .line 7
    iget v4, p0, Lcom/google/android/material/button/e;->g:I

    .line 8
    .line 9
    iget v5, p0, Lcom/google/android/material/button/e;->i:I

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method private a()Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, LZ0/h;

    .line 3
    .line 4
    iget-object v2, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 5
    .line 6
    invoke-direct {v1, v2}, LZ0/h;-><init>(LZ0/l;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v2}, LZ0/h;->h0(LZ0/t;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v2}, LZ0/h;->a0(LP/l;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v2, p0, Lcom/google/android/material/button/e;->e:LZ0/h$d;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1, v2}, LZ0/h;->e0(LZ0/h$d;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object v2, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, LZ0/h;->Q(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, LZ0/h;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1, v2}, LZ0/h;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v2, p0, Lcom/google/android/material/button/e;->k:I

    .line 52
    .line 53
    int-to-float v2, v2

    .line 54
    iget-object v3, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3}, LZ0/h;->j0(FLandroid/content/res/ColorStateList;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, LZ0/h;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 62
    .line 63
    invoke-direct {v2, v3}, LZ0/h;-><init>(LZ0/l;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2, v3}, LZ0/h;->h0(LZ0/t;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget-object v3, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 74
    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2, v3}, LZ0/h;->a0(LP/l;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-virtual {v2, v0}, LZ0/h;->setTint(I)V

    .line 81
    .line 82
    .line 83
    iget v3, p0, Lcom/google/android/material/button/e;->k:I

    .line 84
    .line 85
    int-to-float v3, v3

    .line 86
    iget-boolean v4, p0, Lcom/google/android/material/button/e;->q:Z

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    iget-object v4, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 91
    .line 92
    sget v5, LF0/a;->i:I

    .line 93
    .line 94
    invoke-static {v4, v5}, LO0/a;->d(Landroid/view/View;I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    goto :goto_0

    .line 99
    :cond_6
    move v4, v0

    .line 100
    :goto_0
    invoke-virtual {v2, v3, v4}, LZ0/h;->i0(FI)V

    .line 101
    .line 102
    .line 103
    new-instance v3, LZ0/h;

    .line 104
    .line 105
    iget-object v4, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 106
    .line 107
    invoke-direct {v3, v4}, LZ0/h;-><init>(LZ0/l;)V

    .line 108
    .line 109
    .line 110
    iput-object v3, p0, Lcom/google/android/material/button/e;->p:Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    iget-object v4, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 113
    .line 114
    if-eqz v4, :cond_7

    .line 115
    .line 116
    invoke-virtual {v3, v4}, LZ0/h;->h0(LZ0/t;)V

    .line 117
    .line 118
    .line 119
    :cond_7
    iget-object v3, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 120
    .line 121
    if-eqz v3, :cond_8

    .line 122
    .line 123
    iget-object v4, p0, Lcom/google/android/material/button/e;->p:Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    check-cast v4, LZ0/h;

    .line 126
    .line 127
    invoke-virtual {v4, v3}, LZ0/h;->a0(LP/l;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget-object v3, p0, Lcom/google/android/material/button/e;->p:Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    const/4 v4, -0x1

    .line 133
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 137
    .line 138
    iget-object v4, p0, Lcom/google/android/material/button/e;->o:Landroid/content/res/ColorStateList;

    .line 139
    .line 140
    invoke-static {v4}, LX0/a;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    new-instance v5, Landroid/graphics/drawable/LayerDrawable;

    .line 145
    .line 146
    const/4 v6, 0x2

    .line 147
    new-array v6, v6, [Landroid/graphics/drawable/Drawable;

    .line 148
    .line 149
    aput-object v2, v6, v0

    .line 150
    .line 151
    const/4 v0, 0x1

    .line 152
    aput-object v1, v6, v0

    .line 153
    .line 154
    invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, v5}, Lcom/google/android/material/button/e;->P(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/InsetDrawable;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v1, p0, Lcom/google/android/material/button/e;->p:Landroid/graphics/drawable/Drawable;

    .line 162
    .line 163
    invoke-direct {v3, v4, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 164
    .line 165
    .line 166
    iput-object v3, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 167
    .line 168
    return-object v3
.end method

.method private h(Z)LZ0/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/drawable/DrawableWrapper;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    .line 25
    .line 26
    xor-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, LZ0/h;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method private p()LZ0/h;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/button/e;->h(Z)LZ0/h;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->h:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/google/android/material/button/e;->L(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public B(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->i:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/button/e;->L(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method C(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->o:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/button/e;->o:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 24
    .line 25
    invoke-static {p1}, LX0/a;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method D(LZ0/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/google/android/material/button/e;->N()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method E(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/button/e;->q:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/button/e;->O()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method F(LZ0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/button/e;->N()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method G(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/button/e;->O()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method H(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->k:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/button/e;->k:I

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/button/e;->O()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method I(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LZ0/h;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method J(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, LZ0/h;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method K(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/button/e;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->j:I

    .line 2
    .line 3
    return v0
.end method

.method c()LP/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public f()LZ0/o;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x2

    .line 19
    if-le v0, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LZ0/o;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/button/e;->v:Landroid/graphics/drawable/LayerDrawable;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LZ0/o;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method g()LZ0/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/button/e;->h(Z)LZ0/h;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method i()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->o:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method j()LZ0/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 2
    .line 3
    return-object v0
.end method

.method k()LZ0/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 2
    .line 3
    return-object v0
.end method

.method l()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/e;->k:I

    .line 2
    .line 3
    return v0
.end method

.method n()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method o()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    return-object v0
.end method

.method q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/button/e;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/button/e;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/button/e;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method t(Landroid/content/res/TypedArray;)V
    .locals 5

    .line 1
    sget v0, LF0/k;->B2:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/google/android/material/button/e;->f:I

    .line 9
    .line 10
    sget v0, LF0/k;->C2:I

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/google/android/material/button/e;->g:I

    .line 17
    .line 18
    sget v0, LF0/k;->D2:I

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lcom/google/android/material/button/e;->h:I

    .line 25
    .line 26
    sget v0, LF0/k;->E2:I

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lcom/google/android/material/button/e;->i:I

    .line 33
    .line 34
    sget v0, LF0/k;->I2:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v4, -0x1

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lcom/google/android/material/button/e;->j:I

    .line 49
    .line 50
    iget-object v2, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 51
    .line 52
    int-to-float v0, v0

    .line 53
    invoke-virtual {v2, v0}, LZ0/l;->x(F)LZ0/l;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/google/android/material/button/e;->D(LZ0/l;)V

    .line 58
    .line 59
    .line 60
    iput-boolean v3, p0, Lcom/google/android/material/button/e;->s:Z

    .line 61
    .line 62
    :cond_0
    sget v0, LF0/k;->U2:I

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/google/android/material/button/e;->k:I

    .line 69
    .line 70
    sget v0, LF0/k;->H2:I

    .line 71
    .line 72
    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 77
    .line 78
    invoke-static {v0, v2}, Lcom/google/android/material/internal/t;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v2, LF0/k;->G2:I

    .line 91
    .line 92
    invoke-static {v0, p1, v2}, LW0/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget v2, LF0/k;->T2:I

    .line 105
    .line 106
    invoke-static {v0, p1, v2}, LW0/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/google/android/material/button/e;->n:Landroid/content/res/ColorStateList;

    .line 111
    .line 112
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget v2, LF0/k;->R2:I

    .line 119
    .line 120
    invoke-static {v0, p1, v2}, LW0/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, p0, Lcom/google/android/material/button/e;->o:Landroid/content/res/ColorStateList;

    .line 125
    .line 126
    sget v0, LF0/k;->F2:I

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->t:Z

    .line 133
    .line 134
    sget v0, LF0/k;->J2:I

    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iput v0, p0, Lcom/google/android/material/button/e;->w:I

    .line 141
    .line 142
    sget v0, LF0/k;->V2:I

    .line 143
    .line 144
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->u:Z

    .line 149
    .line 150
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iget-object v1, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iget-object v2, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 163
    .line 164
    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    iget-object v3, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 169
    .line 170
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    sget v4, LF0/k;->z2:I

    .line 175
    .line 176
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_1

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->v()V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_1
    invoke-direct {p0}, Lcom/google/android/material/button/e;->M()V

    .line 187
    .line 188
    .line 189
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 190
    .line 191
    iget v4, p0, Lcom/google/android/material/button/e;->f:I

    .line 192
    .line 193
    add-int/2addr v0, v4

    .line 194
    iget v4, p0, Lcom/google/android/material/button/e;->h:I

    .line 195
    .line 196
    add-int/2addr v1, v4

    .line 197
    iget v4, p0, Lcom/google/android/material/button/e;->g:I

    .line 198
    .line 199
    add-int/2addr v2, v4

    .line 200
    iget v4, p0, Lcom/google/android/material/button/e;->i:I

    .line 201
    .line 202
    add-int/2addr v3, v4

    .line 203
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method u(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, LZ0/h;->setTint(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method v()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->r:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/button/e;->m:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/button/e;->a:Lcom/google/android/material/button/MaterialButton;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/material/button/e;->l:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method w(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/button/e;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method x(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/button/e;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/button/e;->j:I

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/android/material/button/e;->j:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/google/android/material/button/e;->s:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/button/e;->b:LZ0/l;

    .line 17
    .line 18
    int-to-float p1, p1

    .line 19
    invoke-virtual {v0, p1}, LZ0/l;->x(F)LZ0/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lcom/google/android/material/button/e;->D(LZ0/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method y(LZ0/h$d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/material/button/e;->e:LZ0/h$d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/button/e;->g()LZ0/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LZ0/h;->e0(LZ0/h$d;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method z(LP/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/button/e;->d:LP/l;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/button/e;->c:LZ0/t;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/button/e;->N()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
