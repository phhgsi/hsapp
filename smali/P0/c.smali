.class public abstract LP0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;II)Landroid/graphics/Rect;
    .locals 6

    .line 1
    sget-object v2, LF0/k;->j2:[I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v5, v0, [I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move v3, p1

    .line 9
    move v4, p2

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/q;->i(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget p1, LF0/k;->m2:I

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    sget v1, LF0/c;->Y:I

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    sget p2, LF0/k;->n2:I

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget v2, LF0/c;->Z:I

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    sget v1, LF0/k;->l2:I

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget v3, LF0/c;->X:I

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    sget v2, LF0/k;->k2:I

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget v4, LF0/c;->W:I

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {p0, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    const/4 v0, 0x1

    .line 94
    if-ne p0, v0, :cond_0

    .line 95
    .line 96
    move v3, v1

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    move v3, p1

    .line 99
    :goto_0
    if-ne p0, v0, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move p1, v1

    .line 103
    :goto_1
    new-instance p0, Landroid/graphics/Rect;

    .line 104
    .line 105
    invoke-direct {p0, v3, p2, p1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 106
    .line 107
    .line 108
    return-object p0
.end method

.method public static b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)Landroid/graphics/drawable/InsetDrawable;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/drawable/InsetDrawable;

    .line 2
    .line 3
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 6
    .line 7
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 8
    .line 9
    iget v5, p1, Landroid/graphics/Rect;->bottom:I

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
