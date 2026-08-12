.class public abstract Lcom/google/android/material/internal/k;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/drawable/Drawable;

.field b:Landroid/graphics/Rect;

.field private c:Landroid/graphics/Rect;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/google/android/material/internal/k;->d:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/google/android/material/internal/k;->e:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/google/android/material/internal/k;->f:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/material/internal/k;->g:Z

    .line 19
    .line 20
    sget-object v3, LF0/k;->W5:[I

    .line 21
    .line 22
    sget v5, LF0/j;->i:I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    new-array v6, v1, [I

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move v4, p3

    .line 30
    invoke-static/range {v1 .. v6}, Lcom/google/android/material/internal/q;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget p2, LF0/k;->X5:I

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iput-object p2, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lcom/google/android/material/internal/k$a;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lcom/google/android/material/internal/k$a;-><init>(Lcom/google/android/material/internal/k;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1}, LJ/W;->s0(Landroid/view/View;LJ/F;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lcom/google/android/material/internal/k;->b:Landroid/graphics/Rect;

    .line 13
    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-float v4, v4

    .line 34
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 35
    .line 36
    .line 37
    iget-boolean v3, p0, Lcom/google/android/material/internal/k;->d:Z

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    iget-object v3, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 43
    .line 44
    iget-object v5, p0, Lcom/google/android/material/internal/k;->b:Landroid/graphics/Rect;

    .line 45
    .line 46
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    invoke-virtual {v3, v4, v4, v0, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    iget-object v5, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/material/internal/k;->e:Z

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 68
    .line 69
    iget-object v5, p0, Lcom/google/android/material/internal/k;->b:Landroid/graphics/Rect;

    .line 70
    .line 71
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    sub-int v5, v1, v5

    .line 74
    .line 75
    invoke-virtual {v3, v4, v5, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    iget-object v5, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 81
    .line 82
    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    iget-boolean v3, p0, Lcom/google/android/material/internal/k;->f:Z

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    iget-object v3, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 95
    .line 96
    iget-object v5, p0, Lcom/google/android/material/internal/k;->b:Landroid/graphics/Rect;

    .line 97
    .line 98
    iget v6, v5, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    iget v7, v5, Landroid/graphics/Rect;->left:I

    .line 101
    .line 102
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 103
    .line 104
    sub-int v5, v1, v5

    .line 105
    .line 106
    invoke-virtual {v3, v4, v6, v7, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    iget-object v4, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 112
    .line 113
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 114
    .line 115
    .line 116
    iget-object v3, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    iget-boolean v3, p0, Lcom/google/android/material/internal/k;->g:Z

    .line 122
    .line 123
    if-eqz v3, :cond_3

    .line 124
    .line 125
    iget-object v3, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 126
    .line 127
    iget-object v4, p0, Lcom/google/android/material/internal/k;->b:Landroid/graphics/Rect;

    .line 128
    .line 129
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 130
    .line 131
    sub-int v5, v0, v5

    .line 132
    .line 133
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 134
    .line 135
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 136
    .line 137
    sub-int/2addr v1, v4

    .line 138
    invoke-virtual {v3, v5, v6, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    iget-object v1, p0, Lcom/google/android/material/internal/k;->c:Landroid/graphics/Rect;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 151
    .line 152
    .line 153
    :cond_3
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 154
    .line 155
    .line 156
    :cond_4
    return-void
.end method

.method protected abstract e(LJ/w0;)V
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setDrawBottomInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/k;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawLeftInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/k;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawRightInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/k;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawTopInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/k;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public setScrimInsetForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/k;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method
