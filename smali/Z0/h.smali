.class public LZ0/h;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements LZ0/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ0/h$d;,
        LZ0/h$c;,
        LZ0/h$e;
    }
.end annotation


# static fields
.field private static final F:Ljava/lang/String; = "h"

.field static final G:LZ0/l;

.field private static final H:Landroid/graphics/Paint;

.field private static final I:[LZ0/h$e;


# instance fields
.field private A:LP/l;

.field B:[LP/k;

.field private C:[F

.field private D:[F

.field private E:LZ0/h$d;

.field private final a:LZ0/l$c;

.field private b:LZ0/h$c;

.field private final c:[LZ0/n$g;

.field private final d:[LZ0/n$g;

.field private final e:Ljava/util/BitSet;

.field private f:Z

.field private g:Z

.field private final h:Landroid/graphics/Matrix;

.field private final i:Landroid/graphics/Path;

.field private final j:Landroid/graphics/Path;

.field private final k:Landroid/graphics/RectF;

.field private final l:Landroid/graphics/RectF;

.field private final m:Landroid/graphics/Region;

.field private final n:Landroid/graphics/Region;

.field private final o:Landroid/graphics/Paint;

.field private final p:Landroid/graphics/Paint;

.field private final q:LY0/a;

.field private final r:LZ0/m$b;

.field private final s:LZ0/m;

.field private t:Landroid/graphics/PorterDuffColorFilter;

.field private u:Landroid/graphics/PorterDuffColorFilter;

.field private v:I

.field private final w:Landroid/graphics/RectF;

.field private x:Z

.field private y:Z

.field private z:LZ0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, LZ0/l;->a()LZ0/l$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v2, v1}, LZ0/l$b;->q(IF)LZ0/l$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LZ0/l$b;->m()LZ0/l;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LZ0/h;->G:LZ0/l;

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Paint;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LZ0/h;->H:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 30
    .line 31
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    invoke-direct {v1, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    new-array v0, v0, [LZ0/h$e;

    .line 41
    .line 42
    sput-object v0, LZ0/h;->I:[LZ0/h$e;

    .line 43
    .line 44
    :goto_0
    sget-object v0, LZ0/h;->I:[LZ0/h$e;

    .line 45
    .line 46
    array-length v1, v0

    .line 47
    if-ge v2, v1, :cond_0

    .line 48
    .line 49
    new-instance v1, LZ0/h$e;

    .line 50
    .line 51
    invoke-direct {v1, v2}, LZ0/h$e;-><init>(I)V

    .line 52
    .line 53
    .line 54
    aput-object v1, v0, v2

    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LZ0/l;

    invoke-direct {v0}, LZ0/l;-><init>()V

    invoke-direct {p0, v0}, LZ0/h;-><init>(LZ0/l;)V

    return-void
.end method

.method protected constructor <init>(LZ0/h$c;)V
    .locals 6

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 5
    new-instance v0, LZ0/h$a;

    invoke-direct {v0, p0}, LZ0/h$a;-><init>(LZ0/h;)V

    iput-object v0, p0, LZ0/h;->a:LZ0/l$c;

    const/4 v0, 0x4

    .line 6
    new-array v1, v0, [LZ0/n$g;

    iput-object v1, p0, LZ0/h;->c:[LZ0/n$g;

    .line 7
    new-array v1, v0, [LZ0/n$g;

    iput-object v1, p0, LZ0/h;->d:[LZ0/n$g;

    .line 8
    new-instance v1, Ljava/util/BitSet;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v1, p0, LZ0/h;->e:Ljava/util/BitSet;

    .line 9
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, LZ0/h;->h:Landroid/graphics/Matrix;

    .line 10
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 11
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LZ0/h;->j:Landroid/graphics/Path;

    .line 12
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LZ0/h;->k:Landroid/graphics/RectF;

    .line 13
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, LZ0/h;->l:Landroid/graphics/RectF;

    .line 14
    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iput-object v1, p0, LZ0/h;->m:Landroid/graphics/Region;

    .line 15
    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    iput-object v1, p0, LZ0/h;->n:Landroid/graphics/Region;

    .line 16
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 17
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 18
    new-instance v4, LY0/a;

    invoke-direct {v4}, LY0/a;-><init>()V

    iput-object v4, p0, LZ0/h;->q:LY0/a;

    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    if-ne v4, v5, :cond_0

    .line 20
    invoke-static {}, LZ0/m;->l()LZ0/m;

    move-result-object v4

    goto :goto_0

    .line 21
    :cond_0
    new-instance v4, LZ0/m;

    invoke-direct {v4}, LZ0/m;-><init>()V

    :goto_0
    iput-object v4, p0, LZ0/h;->s:LZ0/m;

    .line 22
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 23
    iput-boolean v2, p0, LZ0/h;->x:Z

    .line 24
    iput-boolean v2, p0, LZ0/h;->y:Z

    .line 25
    new-array v0, v0, [LP/k;

    iput-object v0, p0, LZ0/h;->B:[LP/k;

    .line 26
    iput-object p1, p0, LZ0/h;->b:LZ0/h$c;

    .line 27
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    invoke-direct {p0}, LZ0/h;->q0()Z

    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-direct {p0, p1}, LZ0/h;->m0([I)Z

    .line 31
    new-instance p1, LZ0/h$b;

    invoke-direct {p1, p0}, LZ0/h$b;-><init>(LZ0/h;)V

    iput-object p1, p0, LZ0/h;->r:LZ0/m$b;

    return-void
.end method

.method public constructor <init>(LZ0/l;)V
    .locals 2

    .line 3
    new-instance v0, LZ0/h$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZ0/h$c;-><init>(LZ0/l;LQ0/a;)V

    invoke-direct {p0, v0}, LZ0/h;-><init>(LZ0/h$c;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, LZ0/l;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)LZ0/l$b;

    move-result-object p1

    invoke-virtual {p1}, LZ0/l$b;->m()LZ0/l;

    move-result-object p1

    invoke-direct {p0, p1}, LZ0/h;-><init>(LZ0/l;)V

    return-void
.end method

.method private I()F
    .locals 2

    .line 1
    invoke-direct {p0}, LZ0/h;->P()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr v0, v1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method private N()Z
    .locals 3

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->r:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v1, v2, :cond_1

    .line 7
    .line 8
    iget v0, v0, LZ0/h$c;->s:I

    .line 9
    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LZ0/h;->X()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    return v2

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method private O()Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->w:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

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

.method private P()Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->w:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v0, v0, v1

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method private R()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private U(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LZ0/h;->N()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, LZ0/h;->W(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, LZ0/h;->x:Z

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, p1}, LZ0/h;->s(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    sub-float/2addr v0, v1

    .line 41
    float-to-int v0, v0

    .line 42
    iget-object v1, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    int-to-float v2, v2

    .line 57
    sub-float/2addr v1, v2

    .line 58
    float-to-int v1, v1

    .line 59
    if-ltz v0, :cond_2

    .line 60
    .line 61
    if-ltz v1, :cond_2

    .line 62
    .line 63
    iget-object v2, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    float-to-int v2, v2

    .line 70
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 71
    .line 72
    iget v3, v3, LZ0/h$c;->s:I

    .line 73
    .line 74
    mul-int/lit8 v3, v3, 0x2

    .line 75
    .line 76
    add-int/2addr v2, v3

    .line 77
    add-int/2addr v2, v0

    .line 78
    iget-object v3, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    float-to-int v3, v3

    .line 85
    iget-object v4, p0, LZ0/h;->b:LZ0/h$c;

    .line 86
    .line 87
    iget v4, v4, LZ0/h$c;->s:I

    .line 88
    .line 89
    mul-int/lit8 v4, v4, 0x2

    .line 90
    .line 91
    add-int/2addr v3, v4

    .line 92
    add-int/2addr v3, v1

    .line 93
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 94
    .line 95
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v3, Landroid/graphics/Canvas;

    .line 100
    .line 101
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 109
    .line 110
    iget-object v5, p0, LZ0/h;->b:LZ0/h$c;

    .line 111
    .line 112
    iget v5, v5, LZ0/h$c;->s:I

    .line 113
    .line 114
    sub-int/2addr v4, v5

    .line 115
    sub-int/2addr v4, v0

    .line 116
    int-to-float v0, v4

    .line 117
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 122
    .line 123
    iget-object v5, p0, LZ0/h;->b:LZ0/h$c;

    .line 124
    .line 125
    iget v5, v5, LZ0/h$c;->s:I

    .line 126
    .line 127
    sub-int/2addr v4, v5

    .line 128
    sub-int/2addr v4, v1

    .line 129
    int-to-float v1, v4

    .line 130
    neg-float v4, v0

    .line 131
    neg-float v5, v1

    .line 132
    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0, v3}, LZ0/h;->s(Landroid/graphics/Canvas;)V

    .line 136
    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string v0, "Invalid shadow bounds. Check that the treatments result in a valid path."

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1
.end method

.method private static V(II)I
    .locals 1

    .line 1
    ushr-int/lit8 v0, p1, 0x7

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    mul-int/2addr p0, p1

    .line 5
    ushr-int/lit8 p0, p0, 0x8

    .line 6
    .line 7
    return p0
.end method

.method private W(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ0/h;->F()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LZ0/h;->G()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v0, v0

    .line 10
    int-to-float v1, v1

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method static synthetic b(LZ0/h;)F
    .locals 0

    .line 1
    invoke-direct {p0}, LZ0/h;->I()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic c(LZ0/h;)Ljava/util/BitSet;
    .locals 0

    .line 1
    iget-object p0, p0, LZ0/h;->e:Ljava/util/BitSet;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LZ0/h;)[LZ0/n$g;
    .locals 0

    .line 1
    iget-object p0, p0, LZ0/h;->c:[LZ0/n$g;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LZ0/h;)[LZ0/n$g;
    .locals 0

    .line 1
    iget-object p0, p0, LZ0/h;->d:[LZ0/n$g;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(LZ0/h;)[F
    .locals 0

    .line 1
    iget-object p0, p0, LZ0/h;->C:[F

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(LZ0/h;)LZ0/h$d;
    .locals 0

    .line 1
    iget-object p0, p0, LZ0/h;->E:LZ0/h$d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(LZ0/h;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ0/h;->f:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic i(LZ0/h;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ0/h;->g:Z

    .line 2
    .line 3
    return p1
.end method

.method private j(Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, LZ0/h;->q(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iput p2, p0, LZ0/h;->v:I

    .line 12
    .line 13
    if-eq p2, p1, :cond_0

    .line 14
    .line 15
    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    .line 16
    .line 17
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    invoke-direct {p1, p2, v0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method private k(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, LZ0/h;->l(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 5
    .line 6
    iget v0, v0, LZ0/h$c;->k:F

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LZ0/h;->h:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LZ0/h;->h:Landroid/graphics/Matrix;

    .line 20
    .line 21
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 22
    .line 23
    iget v1, v1, LZ0/h$c;->k:F

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/high16 v3, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v2, v3

    .line 32
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    div-float/2addr p1, v3

    .line 37
    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LZ0/h;->h:Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object p1, p0, LZ0/h;->w:Landroid/graphics/RectF;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private m(Landroid/graphics/RectF;LZ0/l;[F)F
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LZ0/l;->v(Landroid/graphics/RectF;)Z

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, LZ0/l;->r()LZ0/d;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2, p1}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-static {p3}, LS0/a;->a([F)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2}, LZ0/l;->u()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    aget p1, p3, p1

    .line 32
    .line 33
    return p1

    .line 34
    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    .line 35
    .line 36
    return p1
.end method

.method private m0([I)Z
    .locals 4

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 15
    .line 16
    iget-object v2, v2, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v2, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 33
    .line 34
    iget-object v2, v2, LZ0/h$c;->f:Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 45
    .line 46
    iget-object v3, v3, LZ0/h$c;->f:Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eq v2, p1, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    .line 58
    .line 59
    return v1

    .line 60
    :cond_1
    return v0
.end method

.method private n()V
    .locals 7

    .line 1
    invoke-direct {p0}, LZ0/h;->p0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ0/h;->s:LZ0/m;

    .line 5
    .line 6
    iget-object v1, p0, LZ0/h;->z:LZ0/l;

    .line 7
    .line 8
    iget-object v2, p0, LZ0/h;->D:[F

    .line 9
    .line 10
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 11
    .line 12
    iget v3, v3, LZ0/h$c;->l:F

    .line 13
    .line 14
    invoke-direct {p0}, LZ0/h;->y()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x0

    .line 19
    iget-object v6, p0, LZ0/h;->j:Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v6}, LZ0/m;->f(LZ0/l;[FFLandroid/graphics/RectF;LZ0/m$b;Landroid/graphics/Path;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private n0([I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LZ0/h;->o0([IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private o(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LZ0/h;->q(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :cond_0
    iput p1, p0, LZ0/h;->v:I

    .line 17
    .line 18
    new-instance p3, Landroid/graphics/PorterDuffColorFilter;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    return-object p3
.end method

.method private o0([IZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 6
    .line 7
    iget-object v1, v1, LZ0/h$c;->b:LZ0/t;

    .line 8
    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v1, p0, LZ0/h;->A:LP/l;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v1, v2

    .line 26
    :goto_0
    or-int/2addr p2, v1

    .line 27
    iget-object v1, p0, LZ0/h;->C:[F

    .line 28
    .line 29
    const/4 v3, 0x4

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    new-array v1, v3, [F

    .line 33
    .line 34
    iput-object v1, p0, LZ0/h;->C:[F

    .line 35
    .line 36
    :cond_2
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 37
    .line 38
    iget-object v1, v1, LZ0/h$c;->b:LZ0/t;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, LZ0/t;->d([I)LZ0/l;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    if-ge v2, v3, :cond_5

    .line 45
    .line 46
    iget-object v1, p0, LZ0/h;->s:LZ0/m;

    .line 47
    .line 48
    invoke-virtual {v1, v2, p1}, LZ0/m;->h(ILZ0/l;)LZ0/d;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1, v0}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget-object v4, p0, LZ0/h;->C:[F

    .line 59
    .line 60
    aput v1, v4, v2

    .line 61
    .line 62
    :cond_3
    iget-object v4, p0, LZ0/h;->B:[LP/k;

    .line 63
    .line 64
    aget-object v4, v4, v2

    .line 65
    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {v4, v1}, LP/k;->m(F)V

    .line 69
    .line 70
    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    iget-object v1, p0, LZ0/h;->B:[LP/k;

    .line 74
    .line 75
    aget-object v1, v1, v2

    .line 76
    .line 77
    invoke-virtual {v1}, LP/k;->r()V

    .line 78
    .line 79
    .line 80
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    if-eqz p2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 86
    .line 87
    .line 88
    :cond_6
    :goto_2
    return-void
.end method

.method private p(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p4}, LZ0/h;->o(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/PorterDuffColorFilter;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_1
    :goto_0
    invoke-direct {p0, p3, p4}, LZ0/h;->j(Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private p0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, LZ0/h;->H()LZ0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LZ0/h;->a:LZ0/l$c;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LZ0/l;->z(LZ0/l$c;)LZ0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LZ0/h;->z:LZ0/l;

    .line 12
    .line 13
    iget-object v0, p0, LZ0/h;->C:[F

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, LZ0/h;->D:[F

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v1, p0, LZ0/h;->D:[F

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    array-length v0, v0

    .line 26
    new-array v0, v0, [F

    .line 27
    .line 28
    iput-object v0, p0, LZ0/h;->D:[F

    .line 29
    .line 30
    :cond_1
    invoke-direct {p0}, LZ0/h;->I()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    iget-object v2, p0, LZ0/h;->C:[F

    .line 36
    .line 37
    array-length v3, v2

    .line 38
    if-ge v1, v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, LZ0/h;->D:[F

    .line 41
    .line 42
    aget v2, v2, v1

    .line 43
    .line 44
    sub-float/2addr v2, v0

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    aput v2, v3, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void
.end method

.method private q0()Z
    .locals 7

    .line 1
    iget-object v0, p0, LZ0/h;->t:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    iget-object v1, p0, LZ0/h;->u:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 6
    .line 7
    iget-object v3, v2, LZ0/h$c;->h:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v2, v2, LZ0/h$c;->i:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    iget-object v4, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    invoke-direct {p0, v3, v2, v4, v5}, LZ0/h;->p(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, p0, LZ0/h;->t:Landroid/graphics/PorterDuffColorFilter;

    .line 19
    .line 20
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 21
    .line 22
    iget-object v3, v2, LZ0/h$c;->g:Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    iget-object v2, v2, LZ0/h$c;->i:Landroid/graphics/PorterDuff$Mode;

    .line 25
    .line 26
    iget-object v4, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct {p0, v3, v2, v4, v6}, LZ0/h;->p(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iput-object v2, p0, LZ0/h;->u:Landroid/graphics/PorterDuffColorFilter;

    .line 34
    .line 35
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 36
    .line 37
    iget-boolean v3, v2, LZ0/h$c;->v:Z

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    iget-object v3, p0, LZ0/h;->q:LY0/a;

    .line 42
    .line 43
    iget-object v2, v2, LZ0/h$c;->h:Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v2, v4, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v3, v2}, LY0/a;->d(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v2, p0, LZ0/h;->t:Landroid/graphics/PorterDuffColorFilter;

    .line 57
    .line 58
    invoke-static {v0, v2}, LI/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, LZ0/h;->u:Landroid/graphics/PorterDuffColorFilter;

    .line 65
    .line 66
    invoke-static {v1, v0}, LI/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return v6

    .line 74
    :cond_2
    :goto_0
    return v5
.end method

.method public static r(Landroid/content/Context;FLandroid/content/res/ColorStateList;)LZ0/h;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget p2, LF0/a;->i:I

    .line 4
    .line 5
    const-class v0, LZ0/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, p2, v0}, LO0/a;->c(Landroid/content/Context;ILjava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    new-instance v0, LZ0/h;

    .line 20
    .line 21
    invoke-direct {v0}, LZ0/h;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, LZ0/h;->Q(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, LZ0/h;->b0(F)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method private r0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LZ0/h;->M()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 6
    .line 7
    const/high16 v2, 0x3f400000    # 0.75f

    .line 8
    .line 9
    mul-float/2addr v2, v0

    .line 10
    float-to-double v2, v2

    .line 11
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    double-to-int v2, v2

    .line 16
    iput v2, v1, LZ0/h$c;->s:I

    .line 17
    .line 18
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 19
    .line 20
    const/high16 v2, 0x3e800000    # 0.25f

    .line 21
    .line 22
    mul-float/2addr v0, v2

    .line 23
    float-to-double v2, v0

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    double-to-int v0, v2

    .line 29
    iput v0, v1, LZ0/h$c;->t:I

    .line 30
    .line 31
    invoke-direct {p0}, LZ0/h;->q0()Z

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, LZ0/h;->R()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private s(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ0/h;->e:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LZ0/h;->F:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 17
    .line 18
    iget v0, v0, LZ0/h$c;->t:I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 23
    .line 24
    iget-object v1, p0, LZ0/h;->q:LY0/a;

    .line 25
    .line 26
    invoke-virtual {v1}, LY0/a;->c()Landroid/graphics/Paint;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    const/4 v1, 0x4

    .line 35
    if-ge v0, v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, LZ0/h;->c:[LZ0/n$g;

    .line 38
    .line 39
    aget-object v1, v1, v0

    .line 40
    .line 41
    iget-object v2, p0, LZ0/h;->q:LY0/a;

    .line 42
    .line 43
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 44
    .line 45
    iget v3, v3, LZ0/h$c;->s:I

    .line 46
    .line 47
    invoke-virtual {v1, v2, v3, p1}, LZ0/n$g;->a(LY0/a;ILandroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, LZ0/h;->d:[LZ0/n$g;

    .line 51
    .line 52
    aget-object v1, v1, v0

    .line 53
    .line 54
    iget-object v2, p0, LZ0/h;->q:LY0/a;

    .line 55
    .line 56
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 57
    .line 58
    iget v3, v3, LZ0/h$c;->s:I

    .line 59
    .line 60
    invoke-virtual {v1, v2, v3, p1}, LZ0/n$g;->a(LY0/a;ILandroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-boolean v0, p0, LZ0/h;->x:Z

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, LZ0/h;->F()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0}, LZ0/h;->G()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    neg-int v2, v0

    .line 79
    int-to-float v2, v2

    .line 80
    neg-int v3, v1

    .line 81
    int-to-float v3, v3

    .line 82
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 86
    .line 87
    sget-object v3, LZ0/h;->H:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    int-to-float v0, v0

    .line 93
    int-to-float v1, v1

    .line 94
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 95
    .line 96
    .line 97
    :cond_3
    return-void
.end method

.method private t(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v2, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v3, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 4
    .line 5
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 6
    .line 7
    iget-object v4, v0, LZ0/h$c;->a:LZ0/l;

    .line 8
    .line 9
    iget-object v5, p0, LZ0/h;->C:[F

    .line 10
    .line 11
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    invoke-direct/range {v0 .. v6}, LZ0/h;->u(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LZ0/l;[FLandroid/graphics/RectF;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private u(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LZ0/l;[FLandroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p6, p4, p5}, LZ0/h;->m(Landroid/graphics/RectF;LZ0/l;[F)F

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    const/4 p5, 0x0

    .line 6
    cmpl-float p5, p4, p5

    .line 7
    .line 8
    if-ltz p5, :cond_0

    .line 9
    .line 10
    iget-object p3, p0, LZ0/h;->b:LZ0/h$c;

    .line 11
    .line 12
    iget p3, p3, LZ0/h$c;->l:F

    .line 13
    .line 14
    mul-float/2addr p4, p3

    .line 15
    invoke-virtual {p1, p6, p4, p4, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private y()Landroid/graphics/RectF;
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->l:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, LZ0/h;->I()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, LZ0/h;->l:Landroid/graphics/RectF;

    .line 15
    .line 16
    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LZ0/h;->l:Landroid/graphics/RectF;

    .line 20
    .line 21
    return-object v0
.end method


# virtual methods
.method public A()F
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->p:F

    .line 4
    .line 5
    return v0
.end method

.method public B()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public C()F
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->l:F

    .line 4
    .line 5
    return v0
.end method

.method public D()F
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->o:F

    .line 4
    .line 5
    return v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget v0, p0, LZ0/h;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public F()I
    .locals 5

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->t:I

    .line 4
    .line 5
    int-to-double v1, v1

    .line 6
    iget v0, v0, LZ0/h$c;->u:I

    .line 7
    .line 8
    int-to-double v3, v0

    .line 9
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    mul-double/2addr v1, v3

    .line 18
    double-to-int v0, v1

    .line 19
    return v0
.end method

.method public G()I
    .locals 5

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->t:I

    .line 4
    .line 5
    int-to-double v1, v1

    .line 6
    iget v0, v0, LZ0/h$c;->u:I

    .line 7
    .line 8
    int-to-double v3, v0

    .line 9
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    mul-double/2addr v1, v3

    .line 18
    double-to-int v0, v1

    .line 19
    return v0
.end method

.method public H()LZ0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    return-object v0
.end method

.method public J()F
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->C:[F

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    aget v0, v0, v1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 10
    .line 11
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 12
    .line 13
    invoke-virtual {v0}, LZ0/l;->r()LZ0/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public K()F
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->C:[F

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget v0, v0, v1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 10
    .line 11
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 12
    .line 13
    invoke-virtual {v0}, LZ0/l;->t()LZ0/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public L()F
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->q:F

    .line 4
    .line 5
    return v0
.end method

.method public M()F
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ0/h;->A()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LZ0/h;->L()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-float/2addr v0, v1

    .line 10
    return v0
.end method

.method public Q(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    new-instance v1, LQ0/a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LQ0/a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, LZ0/h$c;->c:LQ0/a;

    .line 9
    .line 10
    invoke-direct {p0}, LZ0/h;->r0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public S()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->c:LQ0/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LQ0/a;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

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

.method public T()Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LZ0/l;->v(Landroid/graphics/RectF;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, LZ0/h;->C:[F

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, LS0/a;->a([F)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 26
    .line 27
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 28
    .line 29
    invoke-virtual {v0}, LZ0/l;->u()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return v0

    .line 38
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 39
    return v0
.end method

.method public X()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ0/h;->T()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Path;->isConvex()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x1d

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public Y(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LZ0/l;->x(F)LZ0/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LZ0/h;->setShapeAppearanceModel(LZ0/l;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public Z(LZ0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LZ0/l;->y(LZ0/d;)LZ0/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LZ0/h;->setShapeAppearanceModel(LZ0/l;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a0(LP/l;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ0/h;->A:LP/l;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iput-object p1, p0, LZ0/h;->A:LP/l;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, LZ0/h;->B:[LP/k;

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    aget-object v2, v1, v0

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, LP/k;

    .line 18
    .line 19
    sget-object v3, LZ0/h;->I:[LZ0/h$e;

    .line 20
    .line 21
    aget-object v3, v3, v0

    .line 22
    .line 23
    invoke-direct {v2, p0, v3}, LP/k;-><init>(Ljava/lang/Object;LP/i;)V

    .line 24
    .line 25
    .line 26
    aput-object v2, v1, v0

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, LZ0/h;->B:[LP/k;

    .line 29
    .line 30
    aget-object v1, v1, v0

    .line 31
    .line 32
    new-instance v2, LP/l;

    .line 33
    .line 34
    invoke-direct {v2}, LP/l;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, LP/l;->a()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3}, LP/l;->f(F)LP/l;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p1}, LP/l;->c()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {v2, v3}, LP/l;->h(F)LP/l;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, LP/k;->q(LP/l;)LP/k;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 v0, 0x1

    .line 64
    invoke-direct {p0, p1, v0}, LZ0/h;->o0([IZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public b0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->p:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, LZ0/h$c;->p:F

    .line 10
    .line 11
    invoke-direct {p0}, LZ0/h;->r0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public c0(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, v0, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, LZ0/h;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public d0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->l:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, LZ0/h$c;->l:F

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, LZ0/h;->f:Z

    .line 13
    .line 14
    iput-boolean p1, p0, LZ0/h;->g:Z

    .line 15
    .line 16
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v1, p0, LZ0/h;->t:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 15
    .line 16
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 17
    .line 18
    iget v2, v2, LZ0/h$c;->n:I

    .line 19
    .line 20
    invoke-static {v0, v2}, LZ0/h;->V(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 28
    .line 29
    iget-object v2, p0, LZ0/h;->u:Landroid/graphics/PorterDuffColorFilter;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 35
    .line 36
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 37
    .line 38
    iget v2, v2, LZ0/h$c;->m:F

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v2, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 50
    .line 51
    iget-object v3, p0, LZ0/h;->b:LZ0/h$c;

    .line 52
    .line 53
    iget v3, v3, LZ0/h$c;->n:I

    .line 54
    .line 55
    invoke-static {v1, v3}, LZ0/h;->V(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, LZ0/h;->O()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v3, 0x0

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-boolean v2, p0, LZ0/h;->f:Z

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v4, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 78
    .line 79
    invoke-direct {p0, v2, v4}, LZ0/h;->k(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 80
    .line 81
    .line 82
    iput-boolean v3, p0, LZ0/h;->f:Z

    .line 83
    .line 84
    :cond_0
    invoke-direct {p0, p1}, LZ0/h;->U(Landroid/graphics/Canvas;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, p1}, LZ0/h;->t(Landroid/graphics/Canvas;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-direct {p0}, LZ0/h;->P()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    iget-boolean v2, p0, LZ0/h;->g:Z

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    invoke-direct {p0}, LZ0/h;->n()V

    .line 101
    .line 102
    .line 103
    iput-boolean v3, p0, LZ0/h;->g:Z

    .line 104
    .line 105
    :cond_2
    invoke-virtual {p0, p1}, LZ0/h;->w(Landroid/graphics/Canvas;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object p1, p0, LZ0/h;->o:Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public e0(LZ0/h$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ0/h;->E:LZ0/h$d;

    .line 2
    .line 3
    return-void
.end method

.method public f0(IIII)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, v0, LZ0/h$c;->j:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, LZ0/h$c;->j:Landroid/graphics/Rect;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 15
    .line 16
    iget-object v0, v0, LZ0/h$c;->j:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public g0(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->o:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, LZ0/h$c;->o:F

    .line 10
    .line 11
    invoke-direct {p0}, LZ0/h;->r0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->n:I

    .line 4
    .line 5
    return v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v0, v0, LZ0/h$c;->r:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 21
    .line 22
    iget-object v1, v1, LZ0/h$c;->a:LZ0/l;

    .line 23
    .line 24
    iget-object v2, p0, LZ0/h;->C:[F

    .line 25
    .line 26
    invoke-direct {p0, v0, v1, v2}, LZ0/h;->m(Landroid/graphics/RectF;LZ0/l;[F)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x0

    .line 31
    cmpl-float v2, v1, v2

    .line 32
    .line 33
    if-ltz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, LZ0/h;->b:LZ0/h$c;

    .line 40
    .line 41
    iget v2, v2, LZ0/h$c;->l:F

    .line 42
    .line 43
    mul-float/2addr v1, v2

    .line 44
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-boolean v1, p0, LZ0/h;->f:Z

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 53
    .line 54
    invoke-direct {p0, v0, v1}, LZ0/h;->k(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-boolean v0, p0, LZ0/h;->f:Z

    .line 59
    .line 60
    :cond_3
    iget-object v0, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 61
    .line 62
    invoke-static {p1, v0}, Lcom/google/android/material/drawable/d;->j(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->j:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LZ0/h;->m:Landroid/graphics/Region;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, LZ0/h;->k(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LZ0/h;->n:Landroid/graphics/Region;

    .line 20
    .line 21
    iget-object v1, p0, LZ0/h;->i:Landroid/graphics/Path;

    .line 22
    .line 23
    iget-object v2, p0, LZ0/h;->m:Landroid/graphics/Region;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LZ0/h;->m:Landroid/graphics/Region;

    .line 29
    .line 30
    iget-object v1, p0, LZ0/h;->n:Landroid/graphics/Region;

    .line 31
    .line 32
    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LZ0/h;->m:Landroid/graphics/Region;

    .line 38
    .line 39
    return-object v0
.end method

.method public h0(LZ0/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, v0, LZ0/h$c;->b:LZ0/t;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LZ0/h$c;->b:LZ0/t;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, p1, v0}, LZ0/h;->o0([IZ)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public i0(FI)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LZ0/h;->l0(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, LZ0/h;->k0(Landroid/content/res/ColorStateList;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public invalidateSelf()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LZ0/h;->f:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LZ0/h;->g:Z

    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 8
    .line 9
    iget-object v0, v0, LZ0/h$c;->h:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 20
    .line 21
    iget-object v0, v0, LZ0/h$c;->g:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_5

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 32
    .line 33
    iget-object v0, v0, LZ0/h$c;->f:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_5

    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 44
    .line 45
    iget-object v0, v0, LZ0/h$c;->e:Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 56
    .line 57
    iget-object v0, v0, LZ0/h$c;->b:LZ0/t;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {v0}, LZ0/t;->f()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/4 v0, 0x0

    .line 69
    return v0

    .line 70
    :cond_5
    :goto_0
    const/4 v0, 0x1

    .line 71
    return v0
.end method

.method public j0(FLandroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LZ0/h;->l0(F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, LZ0/h;->k0(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public k0(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, v0, LZ0/h$c;->f:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LZ0/h$c;->f:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, LZ0/h;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method protected final l(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    .line 1
    iget-object v0, p0, LZ0/h;->s:LZ0/m;

    .line 2
    .line 3
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v2, LZ0/h$c;->a:LZ0/l;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, p0, LZ0/h;->C:[F

    .line 10
    .line 11
    iget v3, v3, LZ0/h$c;->l:F

    .line 12
    .line 13
    iget-object v5, p0, LZ0/h;->r:LZ0/m$b;

    .line 14
    .line 15
    move-object v4, p1

    .line 16
    move-object v6, p2

    .line 17
    invoke-virtual/range {v0 .. v6}, LZ0/m;->f(LZ0/l;[FFLandroid/graphics/RectF;LZ0/m$b;Landroid/graphics/Path;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public l0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iput p1, v0, LZ0/h$c;->m:F

    .line 4
    .line 5
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZ0/h$c;-><init>(LZ0/h$c;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 9
    .line 10
    return-object p0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LZ0/h;->f:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LZ0/h;->g:Z

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 10
    .line 11
    iget-object v0, v0, LZ0/h$c;->b:LZ0/t;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v1, p0, LZ0/h;->y:Z

    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, LZ0/h;->o0([IZ)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, LZ0/h;->y:Z

    .line 35
    .line 36
    return-void
.end method

.method protected onStateChange([I)Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v0, v0, LZ0/h$c;->b:LZ0/t;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, LZ0/h;->n0([I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0, p1}, LZ0/h;->m0([I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0}, LZ0/h;->q0()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez p1, :cond_2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 26
    :goto_1
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    :cond_3
    return p1
.end method

.method protected q(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ0/h;->M()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LZ0/h;->D()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-float/2addr v0, v1

    .line 10
    iget-object v1, p0, LZ0/h;->b:LZ0/h$c;

    .line 11
    .line 12
    iget-object v1, v1, LZ0/h$c;->c:LQ0/a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, p1, v0}, LQ0/a;->c(IF)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :cond_0
    return p1
.end method

.method public setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget v1, v0, LZ0/h$c;->n:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, LZ0/h$c;->n:I

    .line 8
    .line 9
    invoke-direct {p0}, LZ0/h;->R()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iput-object p1, v0, LZ0/h$c;->d:Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    invoke-direct {p0}, LZ0/h;->R()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShapeAppearanceModel(LZ0/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iput-object p1, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, v0, LZ0/h$c;->b:LZ0/t;

    .line 7
    .line 8
    iput-object p1, p0, LZ0/h;->C:[F

    .line 9
    .line 10
    iput-object p1, p0, LZ0/h;->D:[F

    .line 11
    .line 12
    invoke-virtual {p0}, LZ0/h;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LZ0/h;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iput-object p1, v0, LZ0/h$c;->h:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-direct {p0}, LZ0/h;->q0()Z

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, LZ0/h;->R()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v1, v0, LZ0/h$c;->i:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, LZ0/h$c;->i:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-direct {p0}, LZ0/h;->q0()Z

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, LZ0/h;->R()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method protected v(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/RectF;)V
    .locals 8

    .line 1
    iget-object v0, p0, LZ0/h;->b:LZ0/h$c;

    .line 2
    .line 3
    iget-object v5, v0, LZ0/h$c;->a:LZ0/l;

    .line 4
    .line 5
    iget-object v6, p0, LZ0/h;->C:[F

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v7, p4

    .line 12
    invoke-direct/range {v1 .. v7}, LZ0/h;->u(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LZ0/l;[FLandroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method protected w(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v2, p0, LZ0/h;->p:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v3, p0, LZ0/h;->j:Landroid/graphics/Path;

    .line 4
    .line 5
    iget-object v4, p0, LZ0/h;->z:LZ0/l;

    .line 6
    .line 7
    iget-object v5, p0, LZ0/h;->D:[F

    .line 8
    .line 9
    invoke-direct {p0}, LZ0/h;->y()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v6}, LZ0/h;->u(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;LZ0/l;[FLandroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method protected x()Landroid/graphics/RectF;
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/h;->k:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LZ0/h;->k:Landroid/graphics/RectF;

    .line 11
    .line 12
    return-object v0
.end method

.method public z()F
    .locals 8

    .line 1
    iget-object v0, p0, LZ0/h;->C:[F

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x3

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    aget v5, v0, v5

    .line 12
    .line 13
    aget v4, v0, v4

    .line 14
    .line 15
    add-float/2addr v5, v4

    .line 16
    aget v3, v0, v3

    .line 17
    .line 18
    sub-float/2addr v5, v3

    .line 19
    aget v0, v0, v2

    .line 20
    .line 21
    :goto_0
    sub-float/2addr v5, v0

    .line 22
    div-float/2addr v5, v1

    .line 23
    return v5

    .line 24
    :cond_0
    invoke-virtual {p0}, LZ0/h;->x()Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v6, p0, LZ0/h;->s:LZ0/m;

    .line 29
    .line 30
    invoke-virtual {p0}, LZ0/h;->H()LZ0/l;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v6, v5, v7}, LZ0/m;->h(ILZ0/l;)LZ0/d;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {v5, v0}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v6, p0, LZ0/h;->s:LZ0/m;

    .line 43
    .line 44
    invoke-virtual {p0}, LZ0/h;->H()LZ0/l;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v6, v4, v7}, LZ0/m;->h(ILZ0/l;)LZ0/d;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4, v0}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    add-float/2addr v5, v4

    .line 57
    iget-object v4, p0, LZ0/h;->s:LZ0/m;

    .line 58
    .line 59
    invoke-virtual {p0}, LZ0/h;->H()LZ0/l;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v4, v3, v6}, LZ0/m;->h(ILZ0/l;)LZ0/d;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3, v0}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    sub-float/2addr v5, v3

    .line 72
    iget-object v3, p0, LZ0/h;->s:LZ0/m;

    .line 73
    .line 74
    invoke-virtual {p0}, LZ0/h;->H()LZ0/l;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v3, v2, v4}, LZ0/m;->h(ILZ0/l;)LZ0/d;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2, v0}, LZ0/d;->a(Landroid/graphics/RectF;)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    goto :goto_0
.end method
