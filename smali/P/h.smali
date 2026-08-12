.class public abstract LP/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/c$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP/h$p;,
        LP/h$o;
    }
.end annotation


# static fields
.field public static final A:LP/h$p;

.field public static final n:LP/h$p;

.field public static final o:LP/h$p;

.field public static final p:LP/h$p;

.field public static final q:LP/h$p;

.field public static final r:LP/h$p;

.field public static final s:LP/h$p;

.field public static final t:LP/h$p;

.field public static final u:LP/h$p;

.field public static final v:LP/h$p;

.field public static final w:LP/h$p;

.field public static final x:LP/h$p;

.field public static final y:LP/h$p;

.field public static final z:LP/h$p;


# instance fields
.field a:F

.field b:F

.field c:Z

.field final d:Ljava/lang/Object;

.field final e:LP/i;

.field f:Z

.field g:F

.field h:F

.field private i:J

.field private j:F

.field private final k:Ljava/util/ArrayList;

.field private final l:Ljava/util/ArrayList;

.field private m:LP/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP/h$f;

    .line 2
    .line 3
    const-string v1, "translationX"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LP/h$f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LP/h;->n:LP/h$p;

    .line 9
    .line 10
    new-instance v0, LP/h$g;

    .line 11
    .line 12
    const-string v1, "translationY"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LP/h$g;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LP/h;->o:LP/h$p;

    .line 18
    .line 19
    new-instance v0, LP/h$h;

    .line 20
    .line 21
    const-string v1, "translationZ"

    .line 22
    .line 23
    invoke-direct {v0, v1}, LP/h$h;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, LP/h;->p:LP/h$p;

    .line 27
    .line 28
    new-instance v0, LP/h$i;

    .line 29
    .line 30
    const-string v1, "scaleX"

    .line 31
    .line 32
    invoke-direct {v0, v1}, LP/h$i;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LP/h;->q:LP/h$p;

    .line 36
    .line 37
    new-instance v0, LP/h$j;

    .line 38
    .line 39
    const-string v1, "scaleY"

    .line 40
    .line 41
    invoke-direct {v0, v1}, LP/h$j;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, LP/h;->r:LP/h$p;

    .line 45
    .line 46
    new-instance v0, LP/h$k;

    .line 47
    .line 48
    const-string v1, "rotation"

    .line 49
    .line 50
    invoke-direct {v0, v1}, LP/h$k;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, LP/h;->s:LP/h$p;

    .line 54
    .line 55
    new-instance v0, LP/h$l;

    .line 56
    .line 57
    const-string v1, "rotationX"

    .line 58
    .line 59
    invoke-direct {v0, v1}, LP/h$l;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, LP/h;->t:LP/h$p;

    .line 63
    .line 64
    new-instance v0, LP/h$m;

    .line 65
    .line 66
    const-string v1, "rotationY"

    .line 67
    .line 68
    invoke-direct {v0, v1}, LP/h$m;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, LP/h;->u:LP/h$p;

    .line 72
    .line 73
    new-instance v0, LP/h$n;

    .line 74
    .line 75
    const-string v1, "x"

    .line 76
    .line 77
    invoke-direct {v0, v1}, LP/h$n;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sput-object v0, LP/h;->v:LP/h$p;

    .line 81
    .line 82
    new-instance v0, LP/h$a;

    .line 83
    .line 84
    const-string v1, "y"

    .line 85
    .line 86
    invoke-direct {v0, v1}, LP/h$a;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sput-object v0, LP/h;->w:LP/h$p;

    .line 90
    .line 91
    new-instance v0, LP/h$b;

    .line 92
    .line 93
    const-string v1, "z"

    .line 94
    .line 95
    invoke-direct {v0, v1}, LP/h$b;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    sput-object v0, LP/h;->x:LP/h$p;

    .line 99
    .line 100
    new-instance v0, LP/h$c;

    .line 101
    .line 102
    const-string v1, "alpha"

    .line 103
    .line 104
    invoke-direct {v0, v1}, LP/h$c;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, LP/h;->y:LP/h$p;

    .line 108
    .line 109
    new-instance v0, LP/h$d;

    .line 110
    .line 111
    const-string v1, "scrollX"

    .line 112
    .line 113
    invoke-direct {v0, v1}, LP/h$d;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v0, LP/h;->z:LP/h$p;

    .line 117
    .line 118
    new-instance v0, LP/h$e;

    .line 119
    .line 120
    const-string v1, "scrollY"

    .line 121
    .line 122
    invoke-direct {v0, v1}, LP/h$e;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    sput-object v0, LP/h;->A:LP/h$p;

    .line 126
    .line 127
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;LP/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LP/h;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, LP/h;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, LP/h;->c:Z

    .line 14
    .line 15
    iput-boolean v1, p0, LP/h;->f:Z

    .line 16
    .line 17
    iput v0, p0, LP/h;->g:F

    .line 18
    .line 19
    neg-float v0, v0

    .line 20
    iput v0, p0, LP/h;->h:F

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    iput-wide v0, p0, LP/h;->i:J

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LP/h;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LP/h;->l:Ljava/util/ArrayList;

    .line 39
    .line 40
    iput-object p1, p0, LP/h;->d:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p2, p0, LP/h;->e:LP/i;

    .line 43
    .line 44
    sget-object p1, LP/h;->s:LP/h$p;

    .line 45
    .line 46
    if-eq p2, p1, :cond_4

    .line 47
    .line 48
    sget-object p1, LP/h;->t:LP/h$p;

    .line 49
    .line 50
    if-eq p2, p1, :cond_4

    .line 51
    .line 52
    sget-object p1, LP/h;->u:LP/h$p;

    .line 53
    .line 54
    if-ne p2, p1, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object p1, LP/h;->y:LP/h$p;

    .line 58
    .line 59
    if-ne p2, p1, :cond_1

    .line 60
    .line 61
    const/high16 p1, 0x3b800000    # 0.00390625f

    .line 62
    .line 63
    iput p1, p0, LP/h;->j:F

    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    sget-object p1, LP/h;->q:LP/h$p;

    .line 67
    .line 68
    if-eq p2, p1, :cond_3

    .line 69
    .line 70
    sget-object p1, LP/h;->r:LP/h$p;

    .line 71
    .line 72
    if-ne p2, p1, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 76
    .line 77
    iput p1, p0, LP/h;->j:F

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    :goto_0
    const p1, 0x3b03126f    # 0.002f

    .line 81
    .line 82
    .line 83
    iput p1, p0, LP/h;->j:F

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 87
    .line 88
    .line 89
    iput p1, p0, LP/h;->j:F

    .line 90
    .line 91
    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LP/h;->f:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LP/h;->c()LP/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, LP/c;->k(LP/c$c;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, LP/h;->i:J

    .line 14
    .line 15
    iput-boolean p1, p0, LP/h;->c:Z

    .line 16
    .line 17
    :goto_0
    iget-object v0, p0, LP/h;->k:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge p1, v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LP/h;->k:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, LP/h;->k:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    throw p1

    .line 47
    :cond_1
    iget-object p1, p0, LP/h;->k:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-static {p1}, LP/h;->g(Ljava/util/ArrayList;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private d()F
    .locals 2

    .line 1
    iget-object v0, p0, LP/h;->e:LP/i;

    .line 2
    .line 3
    iget-object v1, p0, LP/h;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LP/i;->a(Ljava/lang/Object;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method private static g(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method private k()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LP/h;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LP/h;->f:Z

    .line 7
    .line 8
    iget-boolean v0, p0, LP/h;->c:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, LP/h;->d()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, LP/h;->b:F

    .line 17
    .line 18
    :cond_0
    iget v0, p0, LP/h;->b:F

    .line 19
    .line 20
    iget v1, p0, LP/h;->g:F

    .line 21
    .line 22
    cmpl-float v1, v0, v1

    .line 23
    .line 24
    if-gtz v1, :cond_1

    .line 25
    .line 26
    iget v1, p0, LP/h;->h:F

    .line 27
    .line 28
    cmpg-float v0, v0, v1

    .line 29
    .line 30
    if-ltz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, LP/h;->c()LP/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    invoke-virtual {v0, p0, v1, v2}, LP/c;->d(LP/c$c;J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v1, "Starting value need to be in between min value and max value"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_2
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, LP/h;->i:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, LP/h;->i:J

    .line 11
    .line 12
    iget p1, p0, LP/h;->b:F

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LP/h;->h(F)V

    .line 15
    .line 16
    .line 17
    return v3

    .line 18
    :cond_0
    sub-long v0, p1, v0

    .line 19
    .line 20
    iput-wide p1, p0, LP/h;->i:J

    .line 21
    .line 22
    invoke-virtual {p0}, LP/h;->c()LP/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LP/c;->g()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 p2, 0x0

    .line 31
    cmpl-float p2, p1, p2

    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    const-wide/32 p1, 0x7fffffff

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    long-to-float p2, v0

    .line 40
    div-float/2addr p2, p1

    .line 41
    float-to-long p1, p2

    .line 42
    :goto_0
    invoke-virtual {p0, p1, p2}, LP/h;->l(J)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget p2, p0, LP/h;->b:F

    .line 47
    .line 48
    iget v0, p0, LP/h;->g:F

    .line 49
    .line 50
    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p0, LP/h;->b:F

    .line 55
    .line 56
    iget v0, p0, LP/h;->h:F

    .line 57
    .line 58
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, LP/h;->b:F

    .line 63
    .line 64
    invoke-virtual {p0, p2}, LP/h;->h(F)V

    .line 65
    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-direct {p0, v3}, LP/h;->b(Z)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return p1
.end method

.method public c()LP/c;
    .locals 1

    .line 1
    iget-object v0, p0, LP/h;->m:LP/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, LP/c;->h()LP/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method e()F
    .locals 2

    .line 1
    iget v0, p0, LP/h;->j:F

    .line 2
    .line 3
    const/high16 v1, 0x3f400000    # 0.75f

    .line 4
    .line 5
    mul-float/2addr v0, v1

    .line 6
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LP/h;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method h(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LP/h;->e:LP/i;

    .line 2
    .line 3
    iget-object v1, p0, LP/h;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LP/i;->b(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, LP/h;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LP/h;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, LP/h;->l:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object p1, p0, LP/h;->l:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {p1}, LP/h;->g(Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public i(F)LP/h;
    .locals 0

    .line 1
    iput p1, p0, LP/h;->b:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, LP/h;->c:Z

    .line 5
    .line 6
    return-object p0
.end method

.method public j()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LP/h;->c()LP/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP/c;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, LP/h;->f:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, LP/h;->k()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 20
    .line 21
    const-string v1, "Animations may only be started on the same thread as the animation handler"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method abstract l(J)Z
.end method
