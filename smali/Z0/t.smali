.class public LZ0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ0/t$b;
    }
.end annotation


# instance fields
.field final a:I

.field final b:LZ0/l;

.field final c:[[I

.field final d:[LZ0/l;

.field final e:LZ0/s;

.field final f:LZ0/s;

.field final g:LZ0/s;

.field final h:LZ0/s;


# direct methods
.method private constructor <init>(LZ0/t$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LZ0/t$b;->b(LZ0/t$b;)I

    move-result v0

    iput v0, p0, LZ0/t;->a:I

    .line 4
    invoke-static {p1}, LZ0/t$b;->c(LZ0/t$b;)LZ0/l;

    move-result-object v0

    iput-object v0, p0, LZ0/t;->b:LZ0/l;

    .line 5
    invoke-static {p1}, LZ0/t$b;->d(LZ0/t$b;)[[I

    move-result-object v0

    iput-object v0, p0, LZ0/t;->c:[[I

    .line 6
    invoke-static {p1}, LZ0/t$b;->e(LZ0/t$b;)[LZ0/l;

    move-result-object v0

    iput-object v0, p0, LZ0/t;->d:[LZ0/l;

    .line 7
    invoke-static {p1}, LZ0/t$b;->f(LZ0/t$b;)LZ0/s;

    move-result-object v0

    iput-object v0, p0, LZ0/t;->e:LZ0/s;

    .line 8
    invoke-static {p1}, LZ0/t$b;->g(LZ0/t$b;)LZ0/s;

    move-result-object v0

    iput-object v0, p0, LZ0/t;->f:LZ0/s;

    .line 9
    invoke-static {p1}, LZ0/t$b;->h(LZ0/t$b;)LZ0/s;

    move-result-object v0

    iput-object v0, p0, LZ0/t;->g:LZ0/s;

    .line 10
    invoke-static {p1}, LZ0/t$b;->a(LZ0/t$b;)LZ0/s;

    move-result-object p1

    iput-object p1, p0, LZ0/t;->h:LZ0/s;

    return-void
.end method

.method synthetic constructor <init>(LZ0/t$b;LZ0/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ0/t;-><init>(LZ0/t$b;)V

    return-void
.end method

.method static synthetic a(LZ0/t$b;Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LZ0/t;->g(LZ0/t$b;Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/content/res/TypedArray;I)LZ0/t;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    const/4 p2, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "xml"

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_1
    new-instance v0, LZ0/t$b;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1, p2}, LZ0/t$b;-><init>(Landroid/content/Context;ILZ0/t$a;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, LZ0/t$b;->j()LZ0/t;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private e([I)I
    .locals 3

    .line 1
    iget-object v0, p0, LZ0/t;->c:[[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    iget v2, p0, LZ0/t;->a:I

    .line 5
    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    aget-object v2, v0, v1

    .line 9
    .line 10
    invoke-static {v2, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, -0x1

    .line 21
    return p1
.end method

.method private static g(LZ0/t$b;Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 11

    .line 1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr v0, v1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eq v2, v1, :cond_7

    .line 12
    .line 13
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-ge v3, v0, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    if-eq v2, v4, :cond_7

    .line 21
    .line 22
    :cond_1
    const/4 v4, 0x2

    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    if-gt v3, v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "item"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    if-nez p4, :cond_3

    .line 46
    .line 47
    sget-object v4, LF0/k;->Y3:[I

    .line 48
    .line 49
    invoke-virtual {v2, p3, v4}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    sget-object v2, LF0/k;->Y3:[I

    .line 55
    .line 56
    invoke-virtual {p4, p3, v2, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_1
    sget v4, LF0/k;->Z3:I

    .line 61
    .line 62
    invoke-virtual {v2, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    sget v5, LF0/k;->a4:I

    .line 67
    .line 68
    invoke-virtual {v2, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {p1, v4, v5}, LZ0/l;->b(Landroid/content/Context;II)LZ0/l$b;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v4}, LZ0/l$b;->m()LZ0/l;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 81
    .line 82
    .line 83
    invoke-interface {p3}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    new-array v5, v2, [I

    .line 88
    .line 89
    move v6, v3

    .line 90
    move v7, v6

    .line 91
    :goto_2
    if-ge v6, v2, :cond_6

    .line 92
    .line 93
    invoke-interface {p3, v6}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    sget v9, LF0/a;->N:I

    .line 98
    .line 99
    if-eq v8, v9, :cond_5

    .line 100
    .line 101
    sget v9, LF0/a;->O:I

    .line 102
    .line 103
    if-eq v8, v9, :cond_5

    .line 104
    .line 105
    add-int/lit8 v9, v7, 0x1

    .line 106
    .line 107
    invoke-interface {p3, v6, v3}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    neg-int v8, v8

    .line 115
    :goto_3
    aput v8, v5, v7

    .line 116
    .line 117
    move v7, v9

    .line 118
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    invoke-static {v5, v7}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {p0, v2, v4}, LZ0/t$b;->i([ILZ0/l;)LZ0/t$b;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    return-void
.end method

.method public static h(I)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0x5

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0xa

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    shr-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    or-int/2addr p0, v0

    .line 10
    return p0
.end method


# virtual methods
.method public c(Z)LZ0/l;
    .locals 1

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget-object p1, p0, LZ0/t;->e:LZ0/s;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LZ0/t;->f:LZ0/s;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LZ0/t;->g:LZ0/s;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, LZ0/t;->h:LZ0/s;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, LZ0/t;->b:LZ0/l;

    .line 21
    .line 22
    invoke-virtual {p1}, LZ0/l;->w()LZ0/l$b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, LZ0/t;->e:LZ0/s;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, LZ0/s;->e()LZ0/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, LZ0/l$b;->D(LZ0/d;)LZ0/l$b;

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, LZ0/t;->f:LZ0/s;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, LZ0/s;->e()LZ0/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, LZ0/l$b;->H(LZ0/d;)LZ0/l$b;

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, LZ0/t;->g:LZ0/s;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, LZ0/s;->e()LZ0/d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, LZ0/l$b;->v(LZ0/d;)LZ0/l$b;

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, LZ0/t;->h:LZ0/s;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, LZ0/s;->e()LZ0/d;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, LZ0/l$b;->z(LZ0/d;)LZ0/l$b;

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-virtual {p1}, LZ0/l$b;->m()LZ0/l;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_5
    :goto_0
    iget-object p1, p0, LZ0/t;->b:LZ0/l;

    .line 76
    .line 77
    return-object p1
.end method

.method protected d([I)LZ0/l;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LZ0/t;->e([I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    .line 8
    .line 9
    invoke-direct {p0, v0}, LZ0/t;->e([I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :cond_0
    iget-object v1, p0, LZ0/t;->e:LZ0/s;

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, LZ0/t;->f:LZ0/s;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, LZ0/t;->g:LZ0/s;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, LZ0/t;->h:LZ0/s;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, LZ0/t;->d:[LZ0/l;

    .line 30
    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-object v1, p0, LZ0/t;->d:[LZ0/l;

    .line 35
    .line 36
    aget-object v0, v1, v0

    .line 37
    .line 38
    invoke-virtual {v0}, LZ0/l;->w()LZ0/l$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, LZ0/t;->e:LZ0/s;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p1}, LZ0/s;->d([I)LZ0/d;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, LZ0/l$b;->D(LZ0/d;)LZ0/l$b;

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, LZ0/t;->f:LZ0/s;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v1, p1}, LZ0/s;->d([I)LZ0/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, LZ0/l$b;->H(LZ0/d;)LZ0/l$b;

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-object v1, p0, LZ0/t;->g:LZ0/s;

    .line 65
    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {v1, p1}, LZ0/s;->d([I)LZ0/d;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, LZ0/l$b;->v(LZ0/d;)LZ0/l$b;

    .line 73
    .line 74
    .line 75
    :cond_4
    iget-object v1, p0, LZ0/t;->h:LZ0/s;

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v1, p1}, LZ0/s;->d([I)LZ0/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v0, p1}, LZ0/l$b;->z(LZ0/d;)LZ0/l$b;

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {v0}, LZ0/l$b;->m()LZ0/l;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1
.end method

.method public f()Z
    .locals 2

    .line 1
    iget v0, p0, LZ0/t;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-gt v0, v1, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, LZ0/t;->e:LZ0/s;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, LZ0/s;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LZ0/t;->f:LZ0/s;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, LZ0/s;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, LZ0/t;->g:LZ0/s;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, LZ0/s;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, LZ0/t;->h:LZ0/s;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, LZ0/s;->h()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/4 v0, 0x0

    .line 48
    return v0

    .line 49
    :cond_4
    :goto_0
    return v1
.end method

.method public i()LZ0/t$b;
    .locals 1

    .line 1
    new-instance v0, LZ0/t$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LZ0/t$b;-><init>(LZ0/t;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
