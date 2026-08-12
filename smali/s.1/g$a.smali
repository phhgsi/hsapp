.class Ls/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ls/e;

.field c:I

.field private d:Ls/d;

.field private e:Ls/d;

.field private f:Ls/d;

.field private g:Ls/d;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field final synthetic r:Ls/g;


# direct methods
.method public constructor <init>(Ls/g;ILs/d;Ls/d;Ls/d;Ls/d;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Ls/g$a;->r:Ls/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Ls/g$a;->b:Ls/e;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Ls/g$a;->c:I

    .line 11
    .line 12
    iput v0, p0, Ls/g$a;->h:I

    .line 13
    .line 14
    iput v0, p0, Ls/g$a;->i:I

    .line 15
    .line 16
    iput v0, p0, Ls/g$a;->j:I

    .line 17
    .line 18
    iput v0, p0, Ls/g$a;->k:I

    .line 19
    .line 20
    iput v0, p0, Ls/g$a;->l:I

    .line 21
    .line 22
    iput v0, p0, Ls/g$a;->m:I

    .line 23
    .line 24
    iput v0, p0, Ls/g$a;->n:I

    .line 25
    .line 26
    iput v0, p0, Ls/g$a;->o:I

    .line 27
    .line 28
    iput v0, p0, Ls/g$a;->p:I

    .line 29
    .line 30
    iput v0, p0, Ls/g$a;->q:I

    .line 31
    .line 32
    iput p2, p0, Ls/g$a;->a:I

    .line 33
    .line 34
    iput-object p3, p0, Ls/g$a;->d:Ls/d;

    .line 35
    .line 36
    iput-object p4, p0, Ls/g$a;->e:Ls/d;

    .line 37
    .line 38
    iput-object p5, p0, Ls/g$a;->f:Ls/d;

    .line 39
    .line 40
    iput-object p6, p0, Ls/g$a;->g:Ls/d;

    .line 41
    .line 42
    invoke-virtual {p1}, Ls/l;->t1()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput p2, p0, Ls/g$a;->h:I

    .line 47
    .line 48
    invoke-virtual {p1}, Ls/l;->v1()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iput p2, p0, Ls/g$a;->i:I

    .line 53
    .line 54
    invoke-virtual {p1}, Ls/l;->u1()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput p2, p0, Ls/g$a;->j:I

    .line 59
    .line 60
    invoke-virtual {p1}, Ls/l;->s1()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Ls/g$a;->k:I

    .line 65
    .line 66
    iput p7, p0, Ls/g$a;->q:I

    .line 67
    .line 68
    return-void
.end method

.method static synthetic a(Ls/g$a;)Ls/e;
    .locals 0

    .line 1
    iget-object p0, p0, Ls/g$a;->b:Ls/e;

    .line 2
    .line 3
    return-object p0
.end method

.method private h()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ls/g$a;->l:I

    .line 3
    .line 4
    iput v0, p0, Ls/g$a;->m:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Ls/g$a;->b:Ls/e;

    .line 8
    .line 9
    iput v0, p0, Ls/g$a;->c:I

    .line 10
    .line 11
    iget v1, p0, Ls/g$a;->o:I

    .line 12
    .line 13
    move v2, v0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_7

    .line 15
    .line 16
    iget v3, p0, Ls/g$a;->n:I

    .line 17
    .line 18
    add-int/2addr v3, v2

    .line 19
    iget-object v4, p0, Ls/g$a;->r:Ls/g;

    .line 20
    .line 21
    invoke-static {v4}, Ls/g;->X1(Ls/g;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-lt v3, v4, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    iget-object v3, p0, Ls/g$a;->r:Ls/g;

    .line 30
    .line 31
    invoke-static {v3}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, p0, Ls/g$a;->n:I

    .line 36
    .line 37
    add-int/2addr v4, v2

    .line 38
    aget-object v3, v3, v4

    .line 39
    .line 40
    iget v4, p0, Ls/g$a;->a:I

    .line 41
    .line 42
    const/16 v5, 0x8

    .line 43
    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {v3}, Ls/e;->T()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v6, p0, Ls/g$a;->r:Ls/g;

    .line 51
    .line 52
    invoke-static {v6}, Ls/g;->J1(Ls/g;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-virtual {v3}, Ls/e;->S()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-ne v7, v5, :cond_1

    .line 61
    .line 62
    move v6, v0

    .line 63
    :cond_1
    iget v5, p0, Ls/g$a;->l:I

    .line 64
    .line 65
    add-int/2addr v4, v6

    .line 66
    add-int/2addr v5, v4

    .line 67
    iput v5, p0, Ls/g$a;->l:I

    .line 68
    .line 69
    iget-object v4, p0, Ls/g$a;->r:Ls/g;

    .line 70
    .line 71
    iget v5, p0, Ls/g$a;->q:I

    .line 72
    .line 73
    invoke-static {v4, v3, v5}, Ls/g;->W1(Ls/g;Ls/e;I)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    iget-object v5, p0, Ls/g$a;->b:Ls/e;

    .line 78
    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    iget v5, p0, Ls/g$a;->c:I

    .line 82
    .line 83
    if-ge v5, v4, :cond_6

    .line 84
    .line 85
    :cond_2
    iput-object v3, p0, Ls/g$a;->b:Ls/e;

    .line 86
    .line 87
    iput v4, p0, Ls/g$a;->c:I

    .line 88
    .line 89
    iput v4, p0, Ls/g$a;->m:I

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    iget-object v4, p0, Ls/g$a;->r:Ls/g;

    .line 93
    .line 94
    iget v6, p0, Ls/g$a;->q:I

    .line 95
    .line 96
    invoke-static {v4, v3, v6}, Ls/g;->V1(Ls/g;Ls/e;I)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    iget-object v6, p0, Ls/g$a;->r:Ls/g;

    .line 101
    .line 102
    iget v7, p0, Ls/g$a;->q:I

    .line 103
    .line 104
    invoke-static {v6, v3, v7}, Ls/g;->W1(Ls/g;Ls/e;I)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    iget-object v7, p0, Ls/g$a;->r:Ls/g;

    .line 109
    .line 110
    invoke-static {v7}, Ls/g;->K1(Ls/g;)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-virtual {v3}, Ls/e;->S()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-ne v8, v5, :cond_4

    .line 119
    .line 120
    move v7, v0

    .line 121
    :cond_4
    iget v5, p0, Ls/g$a;->m:I

    .line 122
    .line 123
    add-int/2addr v6, v7

    .line 124
    add-int/2addr v5, v6

    .line 125
    iput v5, p0, Ls/g$a;->m:I

    .line 126
    .line 127
    iget-object v5, p0, Ls/g$a;->b:Ls/e;

    .line 128
    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    iget v5, p0, Ls/g$a;->c:I

    .line 132
    .line 133
    if-ge v5, v4, :cond_6

    .line 134
    .line 135
    :cond_5
    iput-object v3, p0, Ls/g$a;->b:Ls/e;

    .line 136
    .line 137
    iput v4, p0, Ls/g$a;->c:I

    .line 138
    .line 139
    iput v4, p0, Ls/g$a;->l:I

    .line 140
    .line 141
    :cond_6
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_7
    :goto_2
    return-void
.end method


# virtual methods
.method public b(Ls/e;)V
    .locals 6

    .line 1
    iget v0, p0, Ls/g$a;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Ls/g$a;->r:Ls/g;

    .line 9
    .line 10
    iget v3, p0, Ls/g$a;->q:I

    .line 11
    .line 12
    invoke-static {v0, p1, v3}, Ls/g;->V1(Ls/g;Ls/e;I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Ls/e;->A()Ls/e$b;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ls/e$b;->f:Ls/e$b;

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    iget v0, p0, Ls/g$a;->p:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Ls/g$a;->p:I

    .line 29
    .line 30
    move v0, v2

    .line 31
    :cond_0
    iget-object v3, p0, Ls/g$a;->r:Ls/g;

    .line 32
    .line 33
    invoke-static {v3}, Ls/g;->J1(Ls/g;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1}, Ls/e;->S()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v2, v3

    .line 45
    :goto_0
    iget v1, p0, Ls/g$a;->l:I

    .line 46
    .line 47
    add-int/2addr v0, v2

    .line 48
    add-int/2addr v1, v0

    .line 49
    iput v1, p0, Ls/g$a;->l:I

    .line 50
    .line 51
    iget-object v0, p0, Ls/g$a;->r:Ls/g;

    .line 52
    .line 53
    iget v1, p0, Ls/g$a;->q:I

    .line 54
    .line 55
    invoke-static {v0, p1, v1}, Ls/g;->W1(Ls/g;Ls/e;I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, Ls/g$a;->b:Ls/e;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iget v1, p0, Ls/g$a;->c:I

    .line 64
    .line 65
    if-ge v1, v0, :cond_7

    .line 66
    .line 67
    :cond_2
    iput-object p1, p0, Ls/g$a;->b:Ls/e;

    .line 68
    .line 69
    iput v0, p0, Ls/g$a;->c:I

    .line 70
    .line 71
    iput v0, p0, Ls/g$a;->m:I

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    iget-object v0, p0, Ls/g$a;->r:Ls/g;

    .line 75
    .line 76
    iget v3, p0, Ls/g$a;->q:I

    .line 77
    .line 78
    invoke-static {v0, p1, v3}, Ls/g;->V1(Ls/g;Ls/e;I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v3, p0, Ls/g$a;->r:Ls/g;

    .line 83
    .line 84
    iget v4, p0, Ls/g$a;->q:I

    .line 85
    .line 86
    invoke-static {v3, p1, v4}, Ls/g;->W1(Ls/g;Ls/e;I)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {p1}, Ls/e;->Q()Ls/e$b;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget-object v5, Ls/e$b;->f:Ls/e$b;

    .line 95
    .line 96
    if-ne v4, v5, :cond_4

    .line 97
    .line 98
    iget v3, p0, Ls/g$a;->p:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    iput v3, p0, Ls/g$a;->p:I

    .line 103
    .line 104
    move v3, v2

    .line 105
    :cond_4
    iget-object v4, p0, Ls/g$a;->r:Ls/g;

    .line 106
    .line 107
    invoke-static {v4}, Ls/g;->K1(Ls/g;)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {p1}, Ls/e;->S()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-ne v5, v1, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    move v2, v4

    .line 119
    :goto_1
    iget v1, p0, Ls/g$a;->m:I

    .line 120
    .line 121
    add-int/2addr v3, v2

    .line 122
    add-int/2addr v1, v3

    .line 123
    iput v1, p0, Ls/g$a;->m:I

    .line 124
    .line 125
    iget-object v1, p0, Ls/g$a;->b:Ls/e;

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    iget v1, p0, Ls/g$a;->c:I

    .line 130
    .line 131
    if-ge v1, v0, :cond_7

    .line 132
    .line 133
    :cond_6
    iput-object p1, p0, Ls/g$a;->b:Ls/e;

    .line 134
    .line 135
    iput v0, p0, Ls/g$a;->c:I

    .line 136
    .line 137
    iput v0, p0, Ls/g$a;->l:I

    .line 138
    .line 139
    :cond_7
    :goto_2
    iget p1, p0, Ls/g$a;->o:I

    .line 140
    .line 141
    add-int/lit8 p1, p1, 0x1

    .line 142
    .line 143
    iput p1, p0, Ls/g$a;->o:I

    .line 144
    .line 145
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ls/g$a;->c:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Ls/g$a;->b:Ls/e;

    .line 6
    .line 7
    iput v0, p0, Ls/g$a;->l:I

    .line 8
    .line 9
    iput v0, p0, Ls/g$a;->m:I

    .line 10
    .line 11
    iput v0, p0, Ls/g$a;->n:I

    .line 12
    .line 13
    iput v0, p0, Ls/g$a;->o:I

    .line 14
    .line 15
    iput v0, p0, Ls/g$a;->p:I

    .line 16
    .line 17
    return-void
.end method

.method public d(ZIZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ls/g$a;->o:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    iget v4, v0, Ls/g$a;->n:I

    .line 10
    .line 11
    add-int/2addr v4, v3

    .line 12
    iget-object v5, v0, Ls/g$a;->r:Ls/g;

    .line 13
    .line 14
    invoke-static {v5}, Ls/g;->X1(Ls/g;)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-lt v4, v5, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v4, v0, Ls/g$a;->r:Ls/g;

    .line 22
    .line 23
    invoke-static {v4}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget v5, v0, Ls/g$a;->n:I

    .line 28
    .line 29
    add-int/2addr v5, v3

    .line 30
    aget-object v4, v4, v5

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v4}, Ls/e;->r0()V

    .line 35
    .line 36
    .line 37
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    :goto_1
    if-eqz v1, :cond_38

    .line 41
    .line 42
    iget-object v3, v0, Ls/g$a;->b:Ls/e;

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    goto/16 :goto_16

    .line 47
    .line 48
    :cond_3
    if-eqz p3, :cond_4

    .line 49
    .line 50
    if-nez p2, :cond_4

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    move v4, v2

    .line 55
    :goto_2
    const/4 v5, -0x1

    .line 56
    move v6, v2

    .line 57
    move v7, v5

    .line 58
    move v8, v7

    .line 59
    :goto_3
    if-ge v6, v1, :cond_9

    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    add-int/lit8 v9, v1, -0x1

    .line 64
    .line 65
    sub-int/2addr v9, v6

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    move v9, v6

    .line 68
    :goto_4
    iget v10, v0, Ls/g$a;->n:I

    .line 69
    .line 70
    add-int/2addr v10, v9

    .line 71
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 72
    .line 73
    invoke-static {v11}, Ls/g;->X1(Ls/g;)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-lt v10, v11, :cond_6

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    iget-object v10, v0, Ls/g$a;->r:Ls/g;

    .line 81
    .line 82
    invoke-static {v10}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iget v11, v0, Ls/g$a;->n:I

    .line 87
    .line 88
    add-int/2addr v11, v9

    .line 89
    aget-object v9, v10, v11

    .line 90
    .line 91
    invoke-virtual {v9}, Ls/e;->S()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-nez v9, :cond_8

    .line 96
    .line 97
    if-ne v7, v5, :cond_7

    .line 98
    .line 99
    move v7, v6

    .line 100
    :cond_7
    move v8, v6

    .line 101
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    :goto_5
    iget v6, v0, Ls/g$a;->a:I

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    if-nez v6, :cond_22

    .line 108
    .line 109
    iget-object v6, v0, Ls/g$a;->b:Ls/e;

    .line 110
    .line 111
    iget-object v10, v0, Ls/g$a;->r:Ls/g;

    .line 112
    .line 113
    invoke-static {v10}, Ls/g;->Z1(Ls/g;)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    invoke-virtual {v6, v10}, Ls/e;->Y0(I)V

    .line 118
    .line 119
    .line 120
    iget v10, v0, Ls/g$a;->i:I

    .line 121
    .line 122
    if-lez p2, :cond_a

    .line 123
    .line 124
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 125
    .line 126
    invoke-static {v11}, Ls/g;->K1(Ls/g;)I

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    add-int/2addr v10, v11

    .line 131
    :cond_a
    iget-object v11, v6, Ls/e;->O:Ls/d;

    .line 132
    .line 133
    iget-object v12, v0, Ls/g$a;->e:Ls/d;

    .line 134
    .line 135
    invoke-virtual {v11, v12, v10}, Ls/d;->a(Ls/d;I)Z

    .line 136
    .line 137
    .line 138
    if-eqz p3, :cond_b

    .line 139
    .line 140
    iget-object v10, v6, Ls/e;->Q:Ls/d;

    .line 141
    .line 142
    iget-object v11, v0, Ls/g$a;->g:Ls/d;

    .line 143
    .line 144
    iget v12, v0, Ls/g$a;->k:I

    .line 145
    .line 146
    invoke-virtual {v10, v11, v12}, Ls/d;->a(Ls/d;I)Z

    .line 147
    .line 148
    .line 149
    :cond_b
    if-lez p2, :cond_c

    .line 150
    .line 151
    iget-object v10, v0, Ls/g$a;->e:Ls/d;

    .line 152
    .line 153
    iget-object v10, v10, Ls/d;->d:Ls/e;

    .line 154
    .line 155
    iget-object v10, v10, Ls/e;->Q:Ls/d;

    .line 156
    .line 157
    iget-object v11, v6, Ls/e;->O:Ls/d;

    .line 158
    .line 159
    invoke-virtual {v10, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 160
    .line 161
    .line 162
    :cond_c
    iget-object v10, v0, Ls/g$a;->r:Ls/g;

    .line 163
    .line 164
    invoke-static {v10}, Ls/g;->a2(Ls/g;)I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    const/4 v11, 0x3

    .line 169
    if-ne v10, v11, :cond_10

    .line 170
    .line 171
    invoke-virtual {v6}, Ls/e;->W()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-nez v10, :cond_10

    .line 176
    .line 177
    move v10, v2

    .line 178
    :goto_6
    if-ge v10, v1, :cond_10

    .line 179
    .line 180
    if-eqz p1, :cond_d

    .line 181
    .line 182
    add-int/lit8 v12, v1, -0x1

    .line 183
    .line 184
    sub-int/2addr v12, v10

    .line 185
    goto :goto_7

    .line 186
    :cond_d
    move v12, v10

    .line 187
    :goto_7
    iget v13, v0, Ls/g$a;->n:I

    .line 188
    .line 189
    add-int/2addr v13, v12

    .line 190
    iget-object v14, v0, Ls/g$a;->r:Ls/g;

    .line 191
    .line 192
    invoke-static {v14}, Ls/g;->X1(Ls/g;)I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-lt v13, v14, :cond_e

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_e
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 200
    .line 201
    invoke-static {v13}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    iget v14, v0, Ls/g$a;->n:I

    .line 206
    .line 207
    add-int/2addr v14, v12

    .line 208
    aget-object v12, v13, v14

    .line 209
    .line 210
    invoke-virtual {v12}, Ls/e;->W()Z

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    if-eqz v13, :cond_f

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_f
    add-int/lit8 v10, v10, 0x1

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_10
    :goto_8
    move-object v12, v6

    .line 221
    :goto_9
    move v10, v2

    .line 222
    :goto_a
    if-ge v10, v1, :cond_38

    .line 223
    .line 224
    if-eqz p1, :cond_11

    .line 225
    .line 226
    add-int/lit8 v13, v1, -0x1

    .line 227
    .line 228
    sub-int/2addr v13, v10

    .line 229
    goto :goto_b

    .line 230
    :cond_11
    move v13, v10

    .line 231
    :goto_b
    iget v14, v0, Ls/g$a;->n:I

    .line 232
    .line 233
    add-int/2addr v14, v13

    .line 234
    iget-object v15, v0, Ls/g$a;->r:Ls/g;

    .line 235
    .line 236
    invoke-static {v15}, Ls/g;->X1(Ls/g;)I

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    if-lt v14, v15, :cond_12

    .line 241
    .line 242
    goto/16 :goto_16

    .line 243
    .line 244
    :cond_12
    iget-object v14, v0, Ls/g$a;->r:Ls/g;

    .line 245
    .line 246
    invoke-static {v14}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    iget v15, v0, Ls/g$a;->n:I

    .line 251
    .line 252
    add-int/2addr v15, v13

    .line 253
    aget-object v14, v14, v15

    .line 254
    .line 255
    if-nez v10, :cond_13

    .line 256
    .line 257
    iget-object v15, v14, Ls/e;->N:Ls/d;

    .line 258
    .line 259
    const/16 v16, 0x1

    .line 260
    .line 261
    iget-object v3, v0, Ls/g$a;->d:Ls/d;

    .line 262
    .line 263
    iget v11, v0, Ls/g$a;->h:I

    .line 264
    .line 265
    invoke-virtual {v14, v15, v3, v11}, Ls/e;->k(Ls/d;Ls/d;I)V

    .line 266
    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_13
    const/16 v16, 0x1

    .line 270
    .line 271
    :goto_c
    if-nez v13, :cond_19

    .line 272
    .line 273
    iget-object v3, v0, Ls/g$a;->r:Ls/g;

    .line 274
    .line 275
    invoke-static {v3}, Ls/g;->b2(Ls/g;)I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    const/high16 v11, 0x3f800000    # 1.0f

    .line 280
    .line 281
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 282
    .line 283
    invoke-static {v13}, Ls/g;->c2(Ls/g;)F

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    if-eqz p1, :cond_14

    .line 288
    .line 289
    sub-float v13, v11, v13

    .line 290
    .line 291
    :cond_14
    iget v15, v0, Ls/g$a;->n:I

    .line 292
    .line 293
    if-nez v15, :cond_16

    .line 294
    .line 295
    iget-object v15, v0, Ls/g$a;->r:Ls/g;

    .line 296
    .line 297
    invoke-static {v15}, Ls/g;->L1(Ls/g;)I

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    if-eq v15, v5, :cond_16

    .line 302
    .line 303
    iget-object v3, v0, Ls/g$a;->r:Ls/g;

    .line 304
    .line 305
    invoke-static {v3}, Ls/g;->L1(Ls/g;)I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz p1, :cond_15

    .line 310
    .line 311
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 312
    .line 313
    invoke-static {v13}, Ls/g;->M1(Ls/g;)F

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    :goto_d
    sub-float/2addr v11, v13

    .line 318
    :goto_e
    move v13, v11

    .line 319
    goto :goto_f

    .line 320
    :cond_15
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 321
    .line 322
    invoke-static {v11}, Ls/g;->M1(Ls/g;)F

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    goto :goto_e

    .line 327
    :cond_16
    if-eqz p3, :cond_18

    .line 328
    .line 329
    iget-object v15, v0, Ls/g$a;->r:Ls/g;

    .line 330
    .line 331
    invoke-static {v15}, Ls/g;->N1(Ls/g;)I

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-eq v15, v5, :cond_18

    .line 336
    .line 337
    iget-object v3, v0, Ls/g$a;->r:Ls/g;

    .line 338
    .line 339
    invoke-static {v3}, Ls/g;->N1(Ls/g;)I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-eqz p1, :cond_17

    .line 344
    .line 345
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 346
    .line 347
    invoke-static {v13}, Ls/g;->O1(Ls/g;)F

    .line 348
    .line 349
    .line 350
    move-result v13

    .line 351
    goto :goto_d

    .line 352
    :cond_17
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 353
    .line 354
    invoke-static {v11}, Ls/g;->O1(Ls/g;)F

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    goto :goto_e

    .line 359
    :cond_18
    :goto_f
    invoke-virtual {v14, v3}, Ls/e;->H0(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v14, v13}, Ls/e;->G0(F)V

    .line 363
    .line 364
    .line 365
    :cond_19
    add-int/lit8 v3, v1, -0x1

    .line 366
    .line 367
    if-ne v10, v3, :cond_1a

    .line 368
    .line 369
    iget-object v3, v14, Ls/e;->P:Ls/d;

    .line 370
    .line 371
    iget-object v11, v0, Ls/g$a;->f:Ls/d;

    .line 372
    .line 373
    iget v13, v0, Ls/g$a;->j:I

    .line 374
    .line 375
    invoke-virtual {v14, v3, v11, v13}, Ls/e;->k(Ls/d;Ls/d;I)V

    .line 376
    .line 377
    .line 378
    :cond_1a
    if-eqz v9, :cond_1c

    .line 379
    .line 380
    iget-object v3, v14, Ls/e;->N:Ls/d;

    .line 381
    .line 382
    iget-object v11, v9, Ls/e;->P:Ls/d;

    .line 383
    .line 384
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 385
    .line 386
    invoke-static {v13}, Ls/g;->J1(Ls/g;)I

    .line 387
    .line 388
    .line 389
    move-result v13

    .line 390
    invoke-virtual {v3, v11, v13}, Ls/d;->a(Ls/d;I)Z

    .line 391
    .line 392
    .line 393
    if-ne v10, v7, :cond_1b

    .line 394
    .line 395
    iget-object v3, v14, Ls/e;->N:Ls/d;

    .line 396
    .line 397
    iget v11, v0, Ls/g$a;->h:I

    .line 398
    .line 399
    invoke-virtual {v3, v11}, Ls/d;->u(I)V

    .line 400
    .line 401
    .line 402
    :cond_1b
    iget-object v3, v9, Ls/e;->P:Ls/d;

    .line 403
    .line 404
    iget-object v11, v14, Ls/e;->N:Ls/d;

    .line 405
    .line 406
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 407
    .line 408
    .line 409
    add-int/lit8 v3, v8, 0x1

    .line 410
    .line 411
    if-ne v10, v3, :cond_1c

    .line 412
    .line 413
    iget-object v3, v9, Ls/e;->P:Ls/d;

    .line 414
    .line 415
    iget v9, v0, Ls/g$a;->j:I

    .line 416
    .line 417
    invoke-virtual {v3, v9}, Ls/d;->u(I)V

    .line 418
    .line 419
    .line 420
    :cond_1c
    if-eq v14, v6, :cond_21

    .line 421
    .line 422
    iget-object v3, v0, Ls/g$a;->r:Ls/g;

    .line 423
    .line 424
    invoke-static {v3}, Ls/g;->a2(Ls/g;)I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    const/4 v9, 0x3

    .line 429
    if-ne v3, v9, :cond_1d

    .line 430
    .line 431
    invoke-virtual {v12}, Ls/e;->W()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_1d

    .line 436
    .line 437
    if-eq v14, v12, :cond_1d

    .line 438
    .line 439
    invoke-virtual {v14}, Ls/e;->W()Z

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    if-eqz v3, :cond_1d

    .line 444
    .line 445
    iget-object v3, v14, Ls/e;->R:Ls/d;

    .line 446
    .line 447
    iget-object v11, v12, Ls/e;->R:Ls/d;

    .line 448
    .line 449
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 450
    .line 451
    .line 452
    goto :goto_10

    .line 453
    :cond_1d
    iget-object v3, v0, Ls/g$a;->r:Ls/g;

    .line 454
    .line 455
    invoke-static {v3}, Ls/g;->a2(Ls/g;)I

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_20

    .line 460
    .line 461
    move/from16 v11, v16

    .line 462
    .line 463
    if-eq v3, v11, :cond_1f

    .line 464
    .line 465
    if-eqz v4, :cond_1e

    .line 466
    .line 467
    iget-object v3, v14, Ls/e;->O:Ls/d;

    .line 468
    .line 469
    iget-object v11, v0, Ls/g$a;->e:Ls/d;

    .line 470
    .line 471
    iget v13, v0, Ls/g$a;->i:I

    .line 472
    .line 473
    invoke-virtual {v3, v11, v13}, Ls/d;->a(Ls/d;I)Z

    .line 474
    .line 475
    .line 476
    iget-object v3, v14, Ls/e;->Q:Ls/d;

    .line 477
    .line 478
    iget-object v11, v0, Ls/g$a;->g:Ls/d;

    .line 479
    .line 480
    iget v13, v0, Ls/g$a;->k:I

    .line 481
    .line 482
    invoke-virtual {v3, v11, v13}, Ls/d;->a(Ls/d;I)Z

    .line 483
    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_1e
    iget-object v3, v14, Ls/e;->O:Ls/d;

    .line 487
    .line 488
    iget-object v11, v6, Ls/e;->O:Ls/d;

    .line 489
    .line 490
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 491
    .line 492
    .line 493
    iget-object v3, v14, Ls/e;->Q:Ls/d;

    .line 494
    .line 495
    iget-object v11, v6, Ls/e;->Q:Ls/d;

    .line 496
    .line 497
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 498
    .line 499
    .line 500
    goto :goto_10

    .line 501
    :cond_1f
    iget-object v3, v14, Ls/e;->Q:Ls/d;

    .line 502
    .line 503
    iget-object v11, v6, Ls/e;->Q:Ls/d;

    .line 504
    .line 505
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 506
    .line 507
    .line 508
    goto :goto_10

    .line 509
    :cond_20
    iget-object v3, v14, Ls/e;->O:Ls/d;

    .line 510
    .line 511
    iget-object v11, v6, Ls/e;->O:Ls/d;

    .line 512
    .line 513
    invoke-virtual {v3, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 514
    .line 515
    .line 516
    goto :goto_10

    .line 517
    :cond_21
    const/4 v9, 0x3

    .line 518
    :goto_10
    add-int/lit8 v10, v10, 0x1

    .line 519
    .line 520
    move v11, v9

    .line 521
    move-object v9, v14

    .line 522
    goto/16 :goto_a

    .line 523
    .line 524
    :cond_22
    iget-object v3, v0, Ls/g$a;->b:Ls/e;

    .line 525
    .line 526
    iget-object v6, v0, Ls/g$a;->r:Ls/g;

    .line 527
    .line 528
    invoke-static {v6}, Ls/g;->b2(Ls/g;)I

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    invoke-virtual {v3, v6}, Ls/e;->H0(I)V

    .line 533
    .line 534
    .line 535
    iget v6, v0, Ls/g$a;->h:I

    .line 536
    .line 537
    if-lez p2, :cond_23

    .line 538
    .line 539
    iget-object v10, v0, Ls/g$a;->r:Ls/g;

    .line 540
    .line 541
    invoke-static {v10}, Ls/g;->J1(Ls/g;)I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    add-int/2addr v6, v10

    .line 546
    :cond_23
    if-eqz p1, :cond_25

    .line 547
    .line 548
    iget-object v10, v3, Ls/e;->P:Ls/d;

    .line 549
    .line 550
    iget-object v11, v0, Ls/g$a;->f:Ls/d;

    .line 551
    .line 552
    invoke-virtual {v10, v11, v6}, Ls/d;->a(Ls/d;I)Z

    .line 553
    .line 554
    .line 555
    if-eqz p3, :cond_24

    .line 556
    .line 557
    iget-object v6, v3, Ls/e;->N:Ls/d;

    .line 558
    .line 559
    iget-object v10, v0, Ls/g$a;->d:Ls/d;

    .line 560
    .line 561
    iget v11, v0, Ls/g$a;->j:I

    .line 562
    .line 563
    invoke-virtual {v6, v10, v11}, Ls/d;->a(Ls/d;I)Z

    .line 564
    .line 565
    .line 566
    :cond_24
    if-lez p2, :cond_27

    .line 567
    .line 568
    iget-object v6, v0, Ls/g$a;->f:Ls/d;

    .line 569
    .line 570
    iget-object v6, v6, Ls/d;->d:Ls/e;

    .line 571
    .line 572
    iget-object v6, v6, Ls/e;->N:Ls/d;

    .line 573
    .line 574
    iget-object v10, v3, Ls/e;->P:Ls/d;

    .line 575
    .line 576
    invoke-virtual {v6, v10, v2}, Ls/d;->a(Ls/d;I)Z

    .line 577
    .line 578
    .line 579
    goto :goto_11

    .line 580
    :cond_25
    iget-object v10, v3, Ls/e;->N:Ls/d;

    .line 581
    .line 582
    iget-object v11, v0, Ls/g$a;->d:Ls/d;

    .line 583
    .line 584
    invoke-virtual {v10, v11, v6}, Ls/d;->a(Ls/d;I)Z

    .line 585
    .line 586
    .line 587
    if-eqz p3, :cond_26

    .line 588
    .line 589
    iget-object v6, v3, Ls/e;->P:Ls/d;

    .line 590
    .line 591
    iget-object v10, v0, Ls/g$a;->f:Ls/d;

    .line 592
    .line 593
    iget v11, v0, Ls/g$a;->j:I

    .line 594
    .line 595
    invoke-virtual {v6, v10, v11}, Ls/d;->a(Ls/d;I)Z

    .line 596
    .line 597
    .line 598
    :cond_26
    if-lez p2, :cond_27

    .line 599
    .line 600
    iget-object v6, v0, Ls/g$a;->d:Ls/d;

    .line 601
    .line 602
    iget-object v6, v6, Ls/d;->d:Ls/e;

    .line 603
    .line 604
    iget-object v6, v6, Ls/e;->P:Ls/d;

    .line 605
    .line 606
    iget-object v10, v3, Ls/e;->N:Ls/d;

    .line 607
    .line 608
    invoke-virtual {v6, v10, v2}, Ls/d;->a(Ls/d;I)Z

    .line 609
    .line 610
    .line 611
    :cond_27
    :goto_11
    move v6, v2

    .line 612
    :goto_12
    if-ge v6, v1, :cond_38

    .line 613
    .line 614
    iget v10, v0, Ls/g$a;->n:I

    .line 615
    .line 616
    add-int/2addr v10, v6

    .line 617
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 618
    .line 619
    invoke-static {v11}, Ls/g;->X1(Ls/g;)I

    .line 620
    .line 621
    .line 622
    move-result v11

    .line 623
    if-lt v10, v11, :cond_28

    .line 624
    .line 625
    goto/16 :goto_16

    .line 626
    .line 627
    :cond_28
    iget-object v10, v0, Ls/g$a;->r:Ls/g;

    .line 628
    .line 629
    invoke-static {v10}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 630
    .line 631
    .line 632
    move-result-object v10

    .line 633
    iget v11, v0, Ls/g$a;->n:I

    .line 634
    .line 635
    add-int/2addr v11, v6

    .line 636
    aget-object v10, v10, v11

    .line 637
    .line 638
    if-nez v6, :cond_2b

    .line 639
    .line 640
    iget-object v11, v10, Ls/e;->O:Ls/d;

    .line 641
    .line 642
    iget-object v12, v0, Ls/g$a;->e:Ls/d;

    .line 643
    .line 644
    iget v13, v0, Ls/g$a;->i:I

    .line 645
    .line 646
    invoke-virtual {v10, v11, v12, v13}, Ls/e;->k(Ls/d;Ls/d;I)V

    .line 647
    .line 648
    .line 649
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 650
    .line 651
    invoke-static {v11}, Ls/g;->Z1(Ls/g;)I

    .line 652
    .line 653
    .line 654
    move-result v11

    .line 655
    iget-object v12, v0, Ls/g$a;->r:Ls/g;

    .line 656
    .line 657
    invoke-static {v12}, Ls/g;->P1(Ls/g;)F

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    iget v13, v0, Ls/g$a;->n:I

    .line 662
    .line 663
    if-nez v13, :cond_29

    .line 664
    .line 665
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 666
    .line 667
    invoke-static {v13}, Ls/g;->Q1(Ls/g;)I

    .line 668
    .line 669
    .line 670
    move-result v13

    .line 671
    if-eq v13, v5, :cond_29

    .line 672
    .line 673
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 674
    .line 675
    invoke-static {v11}, Ls/g;->Q1(Ls/g;)I

    .line 676
    .line 677
    .line 678
    move-result v11

    .line 679
    iget-object v12, v0, Ls/g$a;->r:Ls/g;

    .line 680
    .line 681
    invoke-static {v12}, Ls/g;->R1(Ls/g;)F

    .line 682
    .line 683
    .line 684
    move-result v12

    .line 685
    goto :goto_13

    .line 686
    :cond_29
    if-eqz p3, :cond_2a

    .line 687
    .line 688
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 689
    .line 690
    invoke-static {v13}, Ls/g;->S1(Ls/g;)I

    .line 691
    .line 692
    .line 693
    move-result v13

    .line 694
    if-eq v13, v5, :cond_2a

    .line 695
    .line 696
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 697
    .line 698
    invoke-static {v11}, Ls/g;->S1(Ls/g;)I

    .line 699
    .line 700
    .line 701
    move-result v11

    .line 702
    iget-object v12, v0, Ls/g$a;->r:Ls/g;

    .line 703
    .line 704
    invoke-static {v12}, Ls/g;->T1(Ls/g;)F

    .line 705
    .line 706
    .line 707
    move-result v12

    .line 708
    :cond_2a
    :goto_13
    invoke-virtual {v10, v11}, Ls/e;->Y0(I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v10, v12}, Ls/e;->X0(F)V

    .line 712
    .line 713
    .line 714
    :cond_2b
    add-int/lit8 v11, v1, -0x1

    .line 715
    .line 716
    if-ne v6, v11, :cond_2c

    .line 717
    .line 718
    iget-object v11, v10, Ls/e;->Q:Ls/d;

    .line 719
    .line 720
    iget-object v12, v0, Ls/g$a;->g:Ls/d;

    .line 721
    .line 722
    iget v13, v0, Ls/g$a;->k:I

    .line 723
    .line 724
    invoke-virtual {v10, v11, v12, v13}, Ls/e;->k(Ls/d;Ls/d;I)V

    .line 725
    .line 726
    .line 727
    :cond_2c
    if-eqz v9, :cond_2e

    .line 728
    .line 729
    iget-object v11, v10, Ls/e;->O:Ls/d;

    .line 730
    .line 731
    iget-object v12, v9, Ls/e;->Q:Ls/d;

    .line 732
    .line 733
    iget-object v13, v0, Ls/g$a;->r:Ls/g;

    .line 734
    .line 735
    invoke-static {v13}, Ls/g;->K1(Ls/g;)I

    .line 736
    .line 737
    .line 738
    move-result v13

    .line 739
    invoke-virtual {v11, v12, v13}, Ls/d;->a(Ls/d;I)Z

    .line 740
    .line 741
    .line 742
    if-ne v6, v7, :cond_2d

    .line 743
    .line 744
    iget-object v11, v10, Ls/e;->O:Ls/d;

    .line 745
    .line 746
    iget v12, v0, Ls/g$a;->i:I

    .line 747
    .line 748
    invoke-virtual {v11, v12}, Ls/d;->u(I)V

    .line 749
    .line 750
    .line 751
    :cond_2d
    iget-object v11, v9, Ls/e;->Q:Ls/d;

    .line 752
    .line 753
    iget-object v12, v10, Ls/e;->O:Ls/d;

    .line 754
    .line 755
    invoke-virtual {v11, v12, v2}, Ls/d;->a(Ls/d;I)Z

    .line 756
    .line 757
    .line 758
    const/16 v16, 0x1

    .line 759
    .line 760
    add-int/lit8 v11, v8, 0x1

    .line 761
    .line 762
    if-ne v6, v11, :cond_2e

    .line 763
    .line 764
    iget-object v9, v9, Ls/e;->Q:Ls/d;

    .line 765
    .line 766
    iget v11, v0, Ls/g$a;->k:I

    .line 767
    .line 768
    invoke-virtual {v9, v11}, Ls/d;->u(I)V

    .line 769
    .line 770
    .line 771
    :cond_2e
    if-eq v10, v3, :cond_32

    .line 772
    .line 773
    const/4 v9, 0x2

    .line 774
    if-eqz p1, :cond_33

    .line 775
    .line 776
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 777
    .line 778
    invoke-static {v11}, Ls/g;->U1(Ls/g;)I

    .line 779
    .line 780
    .line 781
    move-result v11

    .line 782
    if-eqz v11, :cond_31

    .line 783
    .line 784
    const/4 v12, 0x1

    .line 785
    if-eq v11, v12, :cond_30

    .line 786
    .line 787
    if-eq v11, v9, :cond_2f

    .line 788
    .line 789
    goto :goto_14

    .line 790
    :cond_2f
    iget-object v9, v10, Ls/e;->N:Ls/d;

    .line 791
    .line 792
    iget-object v11, v3, Ls/e;->N:Ls/d;

    .line 793
    .line 794
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 795
    .line 796
    .line 797
    iget-object v9, v10, Ls/e;->P:Ls/d;

    .line 798
    .line 799
    iget-object v11, v3, Ls/e;->P:Ls/d;

    .line 800
    .line 801
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 802
    .line 803
    .line 804
    goto :goto_14

    .line 805
    :cond_30
    iget-object v9, v10, Ls/e;->N:Ls/d;

    .line 806
    .line 807
    iget-object v11, v3, Ls/e;->N:Ls/d;

    .line 808
    .line 809
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 810
    .line 811
    .line 812
    goto :goto_14

    .line 813
    :cond_31
    iget-object v9, v10, Ls/e;->P:Ls/d;

    .line 814
    .line 815
    iget-object v11, v3, Ls/e;->P:Ls/d;

    .line 816
    .line 817
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 818
    .line 819
    .line 820
    :cond_32
    :goto_14
    const/4 v12, 0x1

    .line 821
    goto :goto_15

    .line 822
    :cond_33
    iget-object v11, v0, Ls/g$a;->r:Ls/g;

    .line 823
    .line 824
    invoke-static {v11}, Ls/g;->U1(Ls/g;)I

    .line 825
    .line 826
    .line 827
    move-result v11

    .line 828
    if-eqz v11, :cond_37

    .line 829
    .line 830
    const/4 v12, 0x1

    .line 831
    if-eq v11, v12, :cond_36

    .line 832
    .line 833
    if-eq v11, v9, :cond_34

    .line 834
    .line 835
    goto :goto_15

    .line 836
    :cond_34
    if-eqz v4, :cond_35

    .line 837
    .line 838
    iget-object v9, v10, Ls/e;->N:Ls/d;

    .line 839
    .line 840
    iget-object v11, v0, Ls/g$a;->d:Ls/d;

    .line 841
    .line 842
    iget v13, v0, Ls/g$a;->h:I

    .line 843
    .line 844
    invoke-virtual {v9, v11, v13}, Ls/d;->a(Ls/d;I)Z

    .line 845
    .line 846
    .line 847
    iget-object v9, v10, Ls/e;->P:Ls/d;

    .line 848
    .line 849
    iget-object v11, v0, Ls/g$a;->f:Ls/d;

    .line 850
    .line 851
    iget v13, v0, Ls/g$a;->j:I

    .line 852
    .line 853
    invoke-virtual {v9, v11, v13}, Ls/d;->a(Ls/d;I)Z

    .line 854
    .line 855
    .line 856
    goto :goto_15

    .line 857
    :cond_35
    iget-object v9, v10, Ls/e;->N:Ls/d;

    .line 858
    .line 859
    iget-object v11, v3, Ls/e;->N:Ls/d;

    .line 860
    .line 861
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 862
    .line 863
    .line 864
    iget-object v9, v10, Ls/e;->P:Ls/d;

    .line 865
    .line 866
    iget-object v11, v3, Ls/e;->P:Ls/d;

    .line 867
    .line 868
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 869
    .line 870
    .line 871
    goto :goto_15

    .line 872
    :cond_36
    iget-object v9, v10, Ls/e;->P:Ls/d;

    .line 873
    .line 874
    iget-object v11, v3, Ls/e;->P:Ls/d;

    .line 875
    .line 876
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 877
    .line 878
    .line 879
    goto :goto_15

    .line 880
    :cond_37
    const/4 v12, 0x1

    .line 881
    iget-object v9, v10, Ls/e;->N:Ls/d;

    .line 882
    .line 883
    iget-object v11, v3, Ls/e;->N:Ls/d;

    .line 884
    .line 885
    invoke-virtual {v9, v11, v2}, Ls/d;->a(Ls/d;I)Z

    .line 886
    .line 887
    .line 888
    :goto_15
    add-int/lit8 v6, v6, 0x1

    .line 889
    .line 890
    move-object v9, v10

    .line 891
    goto/16 :goto_12

    .line 892
    .line 893
    :cond_38
    :goto_16
    return-void
.end method

.method public e()I
    .locals 2

    .line 1
    iget v0, p0, Ls/g$a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Ls/g$a;->m:I

    .line 7
    .line 8
    iget-object v1, p0, Ls/g$a;->r:Ls/g;

    .line 9
    .line 10
    invoke-static {v1}, Ls/g;->K1(Ls/g;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    return v0

    .line 16
    :cond_0
    iget v0, p0, Ls/g$a;->m:I

    .line 17
    .line 18
    return v0
.end method

.method public f()I
    .locals 2

    .line 1
    iget v0, p0, Ls/g$a;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ls/g$a;->l:I

    .line 6
    .line 7
    iget-object v1, p0, Ls/g$a;->r:Ls/g;

    .line 8
    .line 9
    invoke-static {v1}, Ls/g;->J1(Ls/g;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    return v0

    .line 15
    :cond_0
    iget v0, p0, Ls/g$a;->l:I

    .line 16
    .line 17
    return v0
.end method

.method public g(I)V
    .locals 8

    .line 1
    iget v0, p0, Ls/g$a;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, p0, Ls/g$a;->o:I

    .line 7
    .line 8
    div-int v5, p1, v0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :goto_0
    if-ge p1, v1, :cond_4

    .line 12
    .line 13
    iget v0, p0, Ls/g$a;->n:I

    .line 14
    .line 15
    add-int/2addr v0, p1

    .line 16
    iget-object v2, p0, Ls/g$a;->r:Ls/g;

    .line 17
    .line 18
    invoke-static {v2}, Ls/g;->X1(Ls/g;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-lt v0, v2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    iget-object v0, p0, Ls/g$a;->r:Ls/g;

    .line 26
    .line 27
    invoke-static {v0}, Ls/g;->Y1(Ls/g;)[Ls/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v2, p0, Ls/g$a;->n:I

    .line 32
    .line 33
    add-int/2addr v2, p1

    .line 34
    aget-object v3, v0, v2

    .line 35
    .line 36
    iget v0, p0, Ls/g$a;->a:I

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {v3}, Ls/e;->A()Ls/e$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v2, Ls/e$b;->f:Ls/e$b;

    .line 47
    .line 48
    if-ne v0, v2, :cond_3

    .line 49
    .line 50
    iget v0, v3, Ls/e;->v:I

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    iget-object v2, p0, Ls/g$a;->r:Ls/g;

    .line 55
    .line 56
    sget-object v4, Ls/e$b;->d:Ls/e$b;

    .line 57
    .line 58
    invoke-virtual {v3}, Ls/e;->Q()Ls/e$b;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v3}, Ls/e;->x()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-virtual/range {v2 .. v7}, Ls/l;->x1(Ls/e;Ls/e$b;ILs/e$b;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {v3}, Ls/e;->Q()Ls/e$b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v2, Ls/e$b;->f:Ls/e$b;

    .line 77
    .line 78
    if-ne v0, v2, :cond_3

    .line 79
    .line 80
    iget v0, v3, Ls/e;->w:I

    .line 81
    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    iget-object v2, p0, Ls/g$a;->r:Ls/g;

    .line 85
    .line 86
    invoke-virtual {v3}, Ls/e;->A()Ls/e$b;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move v7, v5

    .line 91
    invoke-virtual {v3}, Ls/e;->T()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    sget-object v6, Ls/e$b;->d:Ls/e$b;

    .line 96
    .line 97
    invoke-virtual/range {v2 .. v7}, Ls/l;->x1(Ls/e;Ls/e$b;ILs/e$b;I)V

    .line 98
    .line 99
    .line 100
    move v5, v7

    .line 101
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    :goto_2
    invoke-direct {p0}, Ls/g$a;->h()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls/g$a;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public j(ILs/d;Ls/d;Ls/d;Ls/d;IIIII)V
    .locals 0

    .line 1
    iput p1, p0, Ls/g$a;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ls/g$a;->d:Ls/d;

    .line 4
    .line 5
    iput-object p3, p0, Ls/g$a;->e:Ls/d;

    .line 6
    .line 7
    iput-object p4, p0, Ls/g$a;->f:Ls/d;

    .line 8
    .line 9
    iput-object p5, p0, Ls/g$a;->g:Ls/d;

    .line 10
    .line 11
    iput p6, p0, Ls/g$a;->h:I

    .line 12
    .line 13
    iput p7, p0, Ls/g$a;->i:I

    .line 14
    .line 15
    iput p8, p0, Ls/g$a;->j:I

    .line 16
    .line 17
    iput p9, p0, Ls/g$a;->k:I

    .line 18
    .line 19
    iput p10, p0, Ls/g$a;->q:I

    .line 20
    .line 21
    return-void
.end method
