.class public Lt/c;
.super Lt/p;
.source "SourceFile"


# instance fields
.field k:Ljava/util/ArrayList;

.field private l:I


# direct methods
.method public constructor <init>(Ls/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt/p;-><init>(Ls/e;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput p2, p0, Lt/p;->f:I

    .line 12
    .line 13
    invoke-direct {p0}, Lt/c;->q()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private q()V
    .locals 7

    .line 1
    iget-object v0, p0, Lt/p;->b:Ls/e;

    .line 2
    .line 3
    iget v1, p0, Lt/p;->f:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls/e;->L(I)Ls/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    move-object v6, v1

    .line 10
    move-object v1, v0

    .line 11
    move-object v0, v6

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lt/p;->f:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ls/e;->L(I)Ls/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object v1, p0, Lt/p;->b:Ls/e;

    .line 22
    .line 23
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget v2, p0, Lt/p;->f:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ls/e;->N(I)Lt/p;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget v0, p0, Lt/p;->f:I

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ls/e;->J(I)Ls/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_1
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 43
    .line 44
    iget v2, p0, Lt/p;->f:I

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ls/e;->N(I)Lt/p;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget v1, p0, Lt/p;->f:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ls/e;->J(I)Ls/e;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x0

    .line 67
    :cond_2
    :goto_2
    const/4 v3, 0x1

    .line 68
    if-ge v2, v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    check-cast v4, Lt/p;

    .line 77
    .line 78
    iget v5, p0, Lt/p;->f:I

    .line 79
    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    iget-object v3, v4, Lt/p;->b:Ls/e;

    .line 83
    .line 84
    iput-object p0, v3, Ls/e;->c:Lt/c;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    if-ne v5, v3, :cond_2

    .line 88
    .line 89
    iget-object v3, v4, Lt/p;->b:Ls/e;

    .line 90
    .line 91
    iput-object p0, v3, Ls/e;->d:Lt/c;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget v0, p0, Lt/p;->f:I

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    iget-object v0, p0, Lt/p;->b:Ls/e;

    .line 99
    .line 100
    invoke-virtual {v0}, Ls/e;->K()Ls/e;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ls/f;

    .line 105
    .line 106
    invoke-virtual {v0}, Ls/f;->J1()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-le v0, v3, :cond_5

    .line 119
    .line 120
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v1, v3

    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lt/p;

    .line 132
    .line 133
    iget-object v0, v0, Lt/p;->b:Ls/e;

    .line 134
    .line 135
    iput-object v0, p0, Lt/p;->b:Ls/e;

    .line 136
    .line 137
    :cond_5
    iget v0, p0, Lt/p;->f:I

    .line 138
    .line 139
    if-nez v0, :cond_6

    .line 140
    .line 141
    iget-object v0, p0, Lt/p;->b:Ls/e;

    .line 142
    .line 143
    invoke-virtual {v0}, Ls/e;->z()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    goto :goto_3

    .line 148
    :cond_6
    iget-object v0, p0, Lt/p;->b:Ls/e;

    .line 149
    .line 150
    invoke-virtual {v0}, Ls/e;->P()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    :goto_3
    iput v0, p0, Lt/c;->l:I

    .line 155
    .line 156
    return-void
.end method

.method private r()Ls/e;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lt/p;

    .line 17
    .line 18
    iget-object v2, v1, Lt/p;->b:Ls/e;

    .line 19
    .line 20
    invoke-virtual {v2}, Ls/e;->S()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x8

    .line 25
    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, Lt/p;->b:Ls/e;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    return-object v0
.end method

.method private s()Ls/e;
    .locals 4

    .line 1
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lt/p;

    .line 18
    .line 19
    iget-object v2, v1, Lt/p;->b:Ls/e;

    .line 20
    .line 21
    invoke-virtual {v2}, Ls/e;->S()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v3, 0x8

    .line 26
    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    iget-object v0, v1, Lt/p;->b:Ls/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method


# virtual methods
.method public a(Lt/d;)V
    .locals 26

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lt/p;->h:Lt/f;

    iget-boolean v1, v1, Lt/f;->j:Z

    if-eqz v1, :cond_55

    iget-object v1, v0, Lt/p;->i:Lt/f;

    iget-boolean v1, v1, Lt/f;->j:Z

    if-nez v1, :cond_0

    goto/16 :goto_34

    .line 2
    :cond_0
    iget-object v1, v0, Lt/p;->b:Ls/e;

    invoke-virtual {v1}, Ls/e;->K()Ls/e;

    move-result-object v1

    .line 3
    instance-of v2, v1, Ls/f;

    if-eqz v2, :cond_1

    .line 4
    check-cast v1, Ls/f;

    invoke-virtual {v1}, Ls/f;->J1()Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, v0, Lt/p;->i:Lt/f;

    iget v2, v2, Lt/f;->g:I

    iget-object v4, v0, Lt/p;->h:Lt/f;

    iget v4, v4, Lt/f;->g:I

    sub-int/2addr v2, v4

    .line 6
    iget-object v4, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    const/4 v6, -0x1

    const/16 v7, 0x8

    if-ge v5, v4, :cond_2

    .line 7
    iget-object v8, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt/p;

    .line 8
    iget-object v8, v8, Lt/p;->b:Ls/e;

    invoke-virtual {v8}, Ls/e;->S()I

    move-result v8

    if-ne v8, v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move v5, v6

    :cond_3
    add-int/lit8 v8, v4, -0x1

    move v9, v8

    :goto_2
    if-ltz v9, :cond_5

    .line 9
    iget-object v10, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lt/p;

    .line 10
    iget-object v10, v10, Lt/p;->b:Ls/e;

    invoke-virtual {v10}, Ls/e;->S()I

    move-result v10

    if-ne v10, v7, :cond_4

    add-int/lit8 v9, v9, -0x1

    goto :goto_2

    :cond_4
    move v6, v9

    :cond_5
    const/4 v9, 0x0

    :goto_3
    const/4 v11, 0x2

    if-ge v9, v11, :cond_14

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_4
    if-ge v13, v4, :cond_11

    const/16 p1, 0x0

    .line 11
    iget-object v10, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lt/p;

    .line 12
    iget-object v3, v10, Lt/p;->b:Ls/e;

    invoke-virtual {v3}, Ls/e;->S()I

    move-result v3

    if-ne v3, v7, :cond_6

    move/from16 v20, v1

    goto/16 :goto_9

    :cond_6
    add-int/lit8 v16, v16, 0x1

    if-lez v13, :cond_7

    if-lt v13, v5, :cond_7

    .line 13
    iget-object v3, v10, Lt/p;->h:Lt/f;

    iget v3, v3, Lt/f;->f:I

    add-int/2addr v14, v3

    .line 14
    :cond_7
    iget-object v3, v10, Lt/p;->e:Lt/g;

    iget v11, v3, Lt/f;->g:I

    .line 15
    iget-object v7, v10, Lt/p;->d:Ls/e$b;

    sget-object v12, Ls/e$b;->f:Ls/e$b;

    if-eq v7, v12, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_b

    .line 16
    iget v3, v0, Lt/p;->f:I

    if-nez v3, :cond_9

    iget-object v12, v10, Lt/p;->b:Ls/e;

    iget-object v12, v12, Ls/e;->e:Lt/l;

    iget-object v12, v12, Lt/p;->e:Lt/g;

    iget-boolean v12, v12, Lt/f;->j:Z

    if-nez v12, :cond_9

    goto/16 :goto_34

    :cond_9
    const/4 v12, 0x1

    if-ne v3, v12, :cond_a

    .line 17
    iget-object v3, v10, Lt/p;->b:Ls/e;

    iget-object v3, v3, Ls/e;->f:Lt/n;

    iget-object v3, v3, Lt/p;->e:Lt/g;

    iget-boolean v3, v3, Lt/f;->j:Z

    if-nez v3, :cond_a

    goto/16 :goto_34

    :cond_a
    move/from16 v20, v1

    goto :goto_7

    :cond_b
    move/from16 v20, v1

    const/4 v12, 0x1

    .line 18
    iget v1, v10, Lt/p;->a:I

    if-ne v1, v12, :cond_c

    if-nez v9, :cond_c

    .line 19
    iget v11, v3, Lt/g;->m:I

    add-int/lit8 v15, v15, 0x1

    :goto_6
    const/4 v7, 0x1

    goto :goto_7

    .line 20
    :cond_c
    iget-boolean v1, v3, Lt/f;->j:Z

    if-eqz v1, :cond_d

    goto :goto_6

    :cond_d
    :goto_7
    if-nez v7, :cond_e

    add-int/lit8 v15, v15, 0x1

    .line 21
    iget-object v1, v10, Lt/p;->b:Ls/e;

    iget-object v1, v1, Ls/e;->B0:[F

    iget v3, v0, Lt/p;->f:I

    aget v1, v1, v3

    cmpl-float v3, v1, p1

    if-ltz v3, :cond_f

    add-float v17, v17, v1

    goto :goto_8

    :cond_e
    add-int/2addr v14, v11

    :cond_f
    :goto_8
    if-ge v13, v8, :cond_10

    if-ge v13, v6, :cond_10

    .line 22
    iget-object v1, v10, Lt/p;->i:Lt/f;

    iget v1, v1, Lt/f;->f:I

    neg-int v1, v1

    add-int/2addr v14, v1

    :cond_10
    :goto_9
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, v20

    const/16 v7, 0x8

    const/4 v11, 0x2

    goto/16 :goto_4

    :cond_11
    move/from16 v20, v1

    const/16 p1, 0x0

    if-lt v14, v2, :cond_13

    if-nez v15, :cond_12

    goto :goto_a

    :cond_12
    add-int/lit8 v9, v9, 0x1

    move/from16 v1, v20

    const/16 v7, 0x8

    goto/16 :goto_3

    :cond_13
    :goto_a
    move/from16 v1, v16

    goto :goto_b

    :cond_14
    move/from16 v20, v1

    const/16 p1, 0x0

    move/from16 v17, p1

    const/4 v1, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 23
    :goto_b
    iget-object v3, v0, Lt/p;->h:Lt/f;

    iget v3, v3, Lt/f;->g:I

    if-eqz v20, :cond_15

    .line 24
    iget-object v3, v0, Lt/p;->i:Lt/f;

    iget v3, v3, Lt/f;->g:I

    :cond_15
    const/high16 v7, 0x3f000000    # 0.5f

    if-le v14, v2, :cond_17

    const/high16 v9, 0x40000000    # 2.0f

    if-eqz v20, :cond_16

    sub-int v10, v14, v2

    int-to-float v10, v10

    div-float/2addr v10, v9

    add-float/2addr v10, v7

    float-to-int v9, v10

    add-int/2addr v3, v9

    goto :goto_c

    :cond_16
    sub-int v10, v14, v2

    int-to-float v10, v10

    div-float/2addr v10, v9

    add-float/2addr v10, v7

    float-to-int v9, v10

    sub-int/2addr v3, v9

    :cond_17
    :goto_c
    if-lez v15, :cond_25

    sub-int v9, v2, v14

    int-to-float v9, v9

    int-to-float v10, v15

    div-float v10, v9, v10

    add-float/2addr v10, v7

    float-to-int v10, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_d
    if-ge v11, v4, :cond_1f

    .line 25
    iget-object v13, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lt/p;

    move/from16 v16, v7

    .line 26
    iget-object v7, v13, Lt/p;->b:Ls/e;

    invoke-virtual {v7}, Ls/e;->S()I

    move-result v7

    move/from16 v21, v3

    const/16 v3, 0x8

    if-ne v7, v3, :cond_19

    :cond_18
    move/from16 v22, v9

    move/from16 v23, v10

    move/from16 v24, v11

    move/from16 v25, v12

    goto/16 :goto_14

    .line 27
    :cond_19
    iget-object v3, v13, Lt/p;->d:Ls/e$b;

    sget-object v7, Ls/e$b;->f:Ls/e$b;

    if-ne v3, v7, :cond_18

    iget-object v3, v13, Lt/p;->e:Lt/g;

    iget-boolean v7, v3, Lt/f;->j:Z

    if-nez v7, :cond_18

    cmpl-float v7, v17, p1

    if-lez v7, :cond_1a

    .line 28
    iget-object v7, v13, Lt/p;->b:Ls/e;

    iget-object v7, v7, Ls/e;->B0:[F

    move-object/from16 v22, v7

    iget v7, v0, Lt/p;->f:I

    aget v7, v22, v7

    mul-float/2addr v7, v9

    div-float v7, v7, v17

    add-float v7, v7, v16

    float-to-int v7, v7

    :goto_e
    move/from16 v22, v9

    goto :goto_f

    :cond_1a
    move v7, v10

    goto :goto_e

    .line 29
    :goto_f
    iget v9, v0, Lt/p;->f:I

    if-nez v9, :cond_1b

    .line 30
    iget-object v9, v13, Lt/p;->b:Ls/e;

    move/from16 v23, v10

    iget v10, v9, Ls/e;->z:I

    .line 31
    iget v9, v9, Ls/e;->y:I

    :goto_10
    move/from16 v24, v11

    goto :goto_11

    :cond_1b
    move/from16 v23, v10

    .line 32
    iget-object v9, v13, Lt/p;->b:Ls/e;

    iget v10, v9, Ls/e;->C:I

    .line 33
    iget v9, v9, Ls/e;->B:I

    goto :goto_10

    .line 34
    :goto_11
    iget v11, v13, Lt/p;->a:I

    move/from16 v25, v12

    const/4 v12, 0x1

    if-ne v11, v12, :cond_1c

    .line 35
    iget v3, v3, Lt/g;->m:I

    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_12

    :cond_1c
    move v3, v7

    .line 36
    :goto_12
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-lez v10, :cond_1d

    .line 37
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_1d
    if-eq v3, v7, :cond_1e

    add-int/lit8 v12, v25, 0x1

    move v7, v3

    goto :goto_13

    :cond_1e
    move/from16 v12, v25

    .line 38
    :goto_13
    iget-object v3, v13, Lt/p;->e:Lt/g;

    invoke-virtual {v3, v7}, Lt/g;->d(I)V

    goto :goto_15

    :goto_14
    move/from16 v12, v25

    :goto_15
    add-int/lit8 v11, v24, 0x1

    move/from16 v7, v16

    move/from16 v3, v21

    move/from16 v9, v22

    move/from16 v10, v23

    goto/16 :goto_d

    :cond_1f
    move/from16 v21, v3

    move/from16 v16, v7

    move/from16 v25, v12

    if-lez v25, :cond_23

    sub-int v15, v15, v25

    const/4 v3, 0x0

    const/4 v14, 0x0

    :goto_16
    if-ge v3, v4, :cond_23

    .line 39
    iget-object v7, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt/p;

    .line 40
    iget-object v9, v7, Lt/p;->b:Ls/e;

    invoke-virtual {v9}, Ls/e;->S()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_20

    goto :goto_17

    :cond_20
    if-lez v3, :cond_21

    if-lt v3, v5, :cond_21

    .line 41
    iget-object v9, v7, Lt/p;->h:Lt/f;

    iget v9, v9, Lt/f;->f:I

    add-int/2addr v14, v9

    .line 42
    :cond_21
    iget-object v9, v7, Lt/p;->e:Lt/g;

    iget v9, v9, Lt/f;->g:I

    add-int/2addr v14, v9

    if-ge v3, v8, :cond_22

    if-ge v3, v6, :cond_22

    .line 43
    iget-object v7, v7, Lt/p;->i:Lt/f;

    iget v7, v7, Lt/f;->f:I

    neg-int v7, v7

    add-int/2addr v14, v7

    :cond_22
    :goto_17
    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    .line 44
    :cond_23
    iget v3, v0, Lt/c;->l:I

    const/4 v7, 0x2

    if-ne v3, v7, :cond_24

    if-nez v25, :cond_24

    const/4 v3, 0x0

    .line 45
    iput v3, v0, Lt/c;->l:I

    goto :goto_18

    :cond_24
    const/4 v3, 0x0

    goto :goto_18

    :cond_25
    move/from16 v21, v3

    move/from16 v16, v7

    const/4 v3, 0x0

    const/4 v7, 0x2

    :goto_18
    if-le v14, v2, :cond_26

    .line 46
    iput v7, v0, Lt/c;->l:I

    :cond_26
    if-lez v1, :cond_27

    if-nez v15, :cond_27

    if-ne v5, v6, :cond_27

    .line 47
    iput v7, v0, Lt/c;->l:I

    .line 48
    :cond_27
    iget v7, v0, Lt/c;->l:I

    const/4 v12, 0x1

    if-ne v7, v12, :cond_37

    if-le v1, v12, :cond_28

    sub-int/2addr v2, v14

    sub-int/2addr v1, v12

    .line 49
    div-int/2addr v2, v1

    goto :goto_19

    :cond_28
    if-ne v1, v12, :cond_29

    sub-int/2addr v2, v14

    const/16 v18, 0x2

    .line 50
    div-int/lit8 v2, v2, 0x2

    goto :goto_19

    :cond_29
    move v2, v3

    :goto_19
    if-lez v15, :cond_2a

    move v2, v3

    :cond_2a
    move/from16 v1, v21

    :goto_1a
    if-ge v3, v4, :cond_55

    if-eqz v20, :cond_2b

    add-int/lit8 v7, v3, 0x1

    sub-int v7, v4, v7

    goto :goto_1b

    :cond_2b
    move v7, v3

    .line 51
    :goto_1b
    iget-object v9, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt/p;

    .line 52
    iget-object v9, v7, Lt/p;->b:Ls/e;

    invoke-virtual {v9}, Ls/e;->S()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_2c

    .line 53
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    .line 54
    iget-object v7, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    goto :goto_22

    :cond_2c
    if-lez v3, :cond_2e

    if-eqz v20, :cond_2d

    sub-int/2addr v1, v2

    goto :goto_1c

    :cond_2d
    add-int/2addr v1, v2

    :cond_2e
    :goto_1c
    if-lez v3, :cond_30

    if-lt v3, v5, :cond_30

    if-eqz v20, :cond_2f

    .line 55
    iget-object v9, v7, Lt/p;->h:Lt/f;

    iget v9, v9, Lt/f;->f:I

    sub-int/2addr v1, v9

    goto :goto_1d

    .line 56
    :cond_2f
    iget-object v9, v7, Lt/p;->h:Lt/f;

    iget v9, v9, Lt/f;->f:I

    add-int/2addr v1, v9

    :cond_30
    :goto_1d
    if-eqz v20, :cond_31

    .line 57
    iget-object v9, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    goto :goto_1e

    .line 58
    :cond_31
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    .line 59
    :goto_1e
    iget-object v9, v7, Lt/p;->e:Lt/g;

    iget v10, v9, Lt/f;->g:I

    .line 60
    iget-object v11, v7, Lt/p;->d:Ls/e$b;

    sget-object v12, Ls/e$b;->f:Ls/e$b;

    if-ne v11, v12, :cond_32

    iget v11, v7, Lt/p;->a:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_32

    .line 61
    iget v10, v9, Lt/g;->m:I

    :cond_32
    if-eqz v20, :cond_33

    sub-int/2addr v1, v10

    goto :goto_1f

    :cond_33
    add-int/2addr v1, v10

    :goto_1f
    if-eqz v20, :cond_34

    .line 62
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    :goto_20
    const/4 v12, 0x1

    goto :goto_21

    .line 63
    :cond_34
    iget-object v9, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    goto :goto_20

    .line 64
    :goto_21
    iput-boolean v12, v7, Lt/p;->g:Z

    if-ge v3, v8, :cond_36

    if-ge v3, v6, :cond_36

    if-eqz v20, :cond_35

    .line 65
    iget-object v7, v7, Lt/p;->i:Lt/f;

    iget v7, v7, Lt/f;->f:I

    neg-int v7, v7

    sub-int/2addr v1, v7

    goto :goto_22

    .line 66
    :cond_35
    iget-object v7, v7, Lt/p;->i:Lt/f;

    iget v7, v7, Lt/f;->f:I

    neg-int v7, v7

    add-int/2addr v1, v7

    :cond_36
    :goto_22
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1a

    :cond_37
    if-nez v7, :cond_44

    sub-int/2addr v2, v14

    const/16 v19, 0x1

    add-int/lit8 v1, v1, 0x1

    .line 67
    div-int/2addr v2, v1

    if-lez v15, :cond_38

    move v2, v3

    :cond_38
    move/from16 v1, v21

    :goto_23
    if-ge v3, v4, :cond_55

    if-eqz v20, :cond_39

    add-int/lit8 v7, v3, 0x1

    sub-int v7, v4, v7

    goto :goto_24

    :cond_39
    move v7, v3

    .line 68
    :goto_24
    iget-object v9, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt/p;

    .line 69
    iget-object v9, v7, Lt/p;->b:Ls/e;

    invoke-virtual {v9}, Ls/e;->S()I

    move-result v9

    const/16 v10, 0x8

    if-ne v9, v10, :cond_3a

    .line 70
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    .line 71
    iget-object v7, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    goto :goto_2a

    :cond_3a
    if-eqz v20, :cond_3b

    sub-int/2addr v1, v2

    goto :goto_25

    :cond_3b
    add-int/2addr v1, v2

    :goto_25
    if-lez v3, :cond_3d

    if-lt v3, v5, :cond_3d

    if-eqz v20, :cond_3c

    .line 72
    iget-object v9, v7, Lt/p;->h:Lt/f;

    iget v9, v9, Lt/f;->f:I

    sub-int/2addr v1, v9

    goto :goto_26

    .line 73
    :cond_3c
    iget-object v9, v7, Lt/p;->h:Lt/f;

    iget v9, v9, Lt/f;->f:I

    add-int/2addr v1, v9

    :cond_3d
    :goto_26
    if-eqz v20, :cond_3e

    .line 74
    iget-object v9, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    goto :goto_27

    .line 75
    :cond_3e
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    .line 76
    :goto_27
    iget-object v9, v7, Lt/p;->e:Lt/g;

    iget v10, v9, Lt/f;->g:I

    .line 77
    iget-object v11, v7, Lt/p;->d:Ls/e$b;

    sget-object v12, Ls/e$b;->f:Ls/e$b;

    if-ne v11, v12, :cond_3f

    iget v11, v7, Lt/p;->a:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_3f

    .line 78
    iget v9, v9, Lt/g;->m:I

    invoke-static {v10, v9}, Ljava/lang/Math;->min(II)I

    move-result v10

    :cond_3f
    if-eqz v20, :cond_40

    sub-int/2addr v1, v10

    goto :goto_28

    :cond_40
    add-int/2addr v1, v10

    :goto_28
    if-eqz v20, :cond_41

    .line 79
    iget-object v9, v7, Lt/p;->h:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    goto :goto_29

    .line 80
    :cond_41
    iget-object v9, v7, Lt/p;->i:Lt/f;

    invoke-virtual {v9, v1}, Lt/f;->d(I)V

    :goto_29
    if-ge v3, v8, :cond_43

    if-ge v3, v6, :cond_43

    if-eqz v20, :cond_42

    .line 81
    iget-object v7, v7, Lt/p;->i:Lt/f;

    iget v7, v7, Lt/f;->f:I

    neg-int v7, v7

    sub-int/2addr v1, v7

    goto :goto_2a

    .line 82
    :cond_42
    iget-object v7, v7, Lt/p;->i:Lt/f;

    iget v7, v7, Lt/f;->f:I

    neg-int v7, v7

    add-int/2addr v1, v7

    :cond_43
    :goto_2a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_23

    :cond_44
    const/4 v1, 0x2

    if-ne v7, v1, :cond_55

    .line 83
    iget v1, v0, Lt/p;->f:I

    if-nez v1, :cond_45

    iget-object v1, v0, Lt/p;->b:Ls/e;

    invoke-virtual {v1}, Ls/e;->y()F

    move-result v1

    goto :goto_2b

    :cond_45
    iget-object v1, v0, Lt/p;->b:Ls/e;

    .line 84
    invoke-virtual {v1}, Ls/e;->O()F

    move-result v1

    :goto_2b
    if-eqz v20, :cond_46

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float v1, v7, v1

    :cond_46
    sub-int/2addr v2, v14

    int-to-float v2, v2

    mul-float/2addr v2, v1

    add-float v2, v2, v16

    float-to-int v1, v2

    if-ltz v1, :cond_47

    if-lez v15, :cond_48

    :cond_47
    move v1, v3

    :cond_48
    if-eqz v20, :cond_49

    sub-int v1, v21, v1

    goto :goto_2c

    :cond_49
    add-int v1, v21, v1

    :goto_2c
    if-ge v3, v4, :cond_55

    if-eqz v20, :cond_4a

    add-int/lit8 v2, v3, 0x1

    sub-int v2, v4, v2

    goto :goto_2d

    :cond_4a
    move v2, v3

    .line 85
    :goto_2d
    iget-object v7, v0, Lt/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt/p;

    .line 86
    iget-object v7, v2, Lt/p;->b:Ls/e;

    invoke-virtual {v7}, Ls/e;->S()I

    move-result v7

    const/16 v10, 0x8

    if-ne v7, v10, :cond_4b

    .line 87
    iget-object v7, v2, Lt/p;->h:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    .line 88
    iget-object v2, v2, Lt/p;->i:Lt/f;

    invoke-virtual {v2, v1}, Lt/f;->d(I)V

    const/4 v12, 0x1

    goto :goto_33

    :cond_4b
    if-lez v3, :cond_4d

    if-lt v3, v5, :cond_4d

    if-eqz v20, :cond_4c

    .line 89
    iget-object v7, v2, Lt/p;->h:Lt/f;

    iget v7, v7, Lt/f;->f:I

    sub-int/2addr v1, v7

    goto :goto_2e

    .line 90
    :cond_4c
    iget-object v7, v2, Lt/p;->h:Lt/f;

    iget v7, v7, Lt/f;->f:I

    add-int/2addr v1, v7

    :cond_4d
    :goto_2e
    if-eqz v20, :cond_4e

    .line 91
    iget-object v7, v2, Lt/p;->i:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    goto :goto_2f

    .line 92
    :cond_4e
    iget-object v7, v2, Lt/p;->h:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    .line 93
    :goto_2f
    iget-object v7, v2, Lt/p;->e:Lt/g;

    iget v9, v7, Lt/f;->g:I

    .line 94
    iget-object v11, v2, Lt/p;->d:Ls/e$b;

    sget-object v12, Ls/e$b;->f:Ls/e$b;

    if-ne v11, v12, :cond_4f

    iget v11, v2, Lt/p;->a:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_50

    .line 95
    iget v9, v7, Lt/g;->m:I

    goto :goto_30

    :cond_4f
    const/4 v12, 0x1

    :cond_50
    :goto_30
    if-eqz v20, :cond_51

    sub-int/2addr v1, v9

    goto :goto_31

    :cond_51
    add-int/2addr v1, v9

    :goto_31
    if-eqz v20, :cond_52

    .line 96
    iget-object v7, v2, Lt/p;->h:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    goto :goto_32

    .line 97
    :cond_52
    iget-object v7, v2, Lt/p;->i:Lt/f;

    invoke-virtual {v7, v1}, Lt/f;->d(I)V

    :goto_32
    if-ge v3, v8, :cond_54

    if-ge v3, v6, :cond_54

    if-eqz v20, :cond_53

    .line 98
    iget-object v2, v2, Lt/p;->i:Lt/f;

    iget v2, v2, Lt/f;->f:I

    neg-int v2, v2

    sub-int/2addr v1, v2

    goto :goto_33

    .line 99
    :cond_53
    iget-object v2, v2, Lt/p;->i:Lt/f;

    iget v2, v2, Lt/f;->f:I

    neg-int v2, v2

    add-int/2addr v1, v2

    :cond_54
    :goto_33
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2c

    :cond_55
    :goto_34
    return-void
.end method

.method d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    check-cast v4, Lt/p;

    .line 18
    .line 19
    invoke-virtual {v4}, Lt/p;->d()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ge v0, v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v3, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lt/p;

    .line 40
    .line 41
    iget-object v3, v3, Lt/p;->b:Ls/e;

    .line 42
    .line 43
    iget-object v4, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 44
    .line 45
    sub-int/2addr v0, v1

    .line 46
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lt/p;

    .line 51
    .line 52
    iget-object v0, v0, Lt/p;->b:Ls/e;

    .line 53
    .line 54
    iget v4, p0, Lt/p;->f:I

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    iget-object v1, v3, Ls/e;->N:Ls/d;

    .line 59
    .line 60
    iget-object v0, v0, Ls/e;->P:Ls/d;

    .line 61
    .line 62
    invoke-virtual {p0, v1, v2}, Lt/p;->i(Ls/d;I)Lt/f;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v1}, Ls/d;->f()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-direct {p0}, Lt/c;->r()Ls/e;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    iget-object v1, v4, Ls/e;->N:Ls/d;

    .line 77
    .line 78
    invoke-virtual {v1}, Ls/d;->f()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :cond_2
    if-eqz v3, :cond_3

    .line 83
    .line 84
    iget-object v4, p0, Lt/p;->h:Lt/f;

    .line 85
    .line 86
    invoke-virtual {p0, v4, v3, v1}, Lt/p;->b(Lt/f;Lt/f;I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {p0, v0, v2}, Lt/p;->i(Ls/d;I)Lt/f;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0}, Ls/d;->f()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-direct {p0}, Lt/c;->s()Ls/e;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget-object v0, v2, Ls/e;->P:Ls/d;

    .line 104
    .line 105
    invoke-virtual {v0}, Ls/d;->f()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    :cond_4
    if-eqz v1, :cond_9

    .line 110
    .line 111
    iget-object v2, p0, Lt/p;->i:Lt/f;

    .line 112
    .line 113
    neg-int v0, v0

    .line 114
    invoke-virtual {p0, v2, v1, v0}, Lt/p;->b(Lt/f;Lt/f;I)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    iget-object v2, v3, Ls/e;->O:Ls/d;

    .line 119
    .line 120
    iget-object v0, v0, Ls/e;->Q:Ls/d;

    .line 121
    .line 122
    invoke-virtual {p0, v2, v1}, Lt/p;->i(Ls/d;I)Lt/f;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v2}, Ls/d;->f()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-direct {p0}, Lt/c;->r()Ls/e;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    if-eqz v4, :cond_6

    .line 135
    .line 136
    iget-object v2, v4, Ls/e;->O:Ls/d;

    .line 137
    .line 138
    invoke-virtual {v2}, Ls/d;->f()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    :cond_6
    if-eqz v3, :cond_7

    .line 143
    .line 144
    iget-object v4, p0, Lt/p;->h:Lt/f;

    .line 145
    .line 146
    invoke-virtual {p0, v4, v3, v2}, Lt/p;->b(Lt/f;Lt/f;I)V

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-virtual {p0, v0, v1}, Lt/p;->i(Ls/d;I)Lt/f;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0}, Ls/d;->f()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-direct {p0}, Lt/c;->s()Ls/e;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    iget-object v0, v2, Ls/e;->Q:Ls/d;

    .line 164
    .line 165
    invoke-virtual {v0}, Ls/d;->f()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    :cond_8
    if-eqz v1, :cond_9

    .line 170
    .line 171
    iget-object v2, p0, Lt/p;->i:Lt/f;

    .line 172
    .line 173
    neg-int v0, v0

    .line 174
    invoke-virtual {p0, v2, v1, v0}, Lt/p;->b(Lt/f;Lt/f;I)V

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_1
    iget-object v0, p0, Lt/p;->h:Lt/f;

    .line 178
    .line 179
    iput-object p0, v0, Lt/f;->a:Lt/d;

    .line 180
    .line 181
    iget-object v0, p0, Lt/p;->i:Lt/f;

    .line 182
    .line 183
    iput-object p0, v0, Lt/f;->a:Lt/d;

    .line 184
    .line 185
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lt/p;

    .line 17
    .line 18
    invoke-virtual {v1}, Lt/p;->e()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method f()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt/p;->c:Lt/m;

    .line 3
    .line 4
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    check-cast v3, Lt/p;

    .line 20
    .line 21
    invoke-virtual {v3}, Lt/p;->f()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public j()J
    .locals 7

    .line 1
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v0, :cond_0

    .line 11
    .line 12
    iget-object v4, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lt/p;

    .line 19
    .line 20
    iget-object v5, v4, Lt/p;->h:Lt/f;

    .line 21
    .line 22
    iget v5, v5, Lt/f;->f:I

    .line 23
    .line 24
    int-to-long v5, v5

    .line 25
    add-long/2addr v1, v5

    .line 26
    invoke-virtual {v4}, Lt/p;->j()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    add-long/2addr v1, v5

    .line 31
    iget-object v4, v4, Lt/p;->i:Lt/f;

    .line 32
    .line 33
    iget v4, v4, Lt/f;->f:I

    .line 34
    .line 35
    int-to-long v4, v4

    .line 36
    add-long/2addr v1, v4

    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-wide v1
.end method

.method m()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lt/p;

    .line 18
    .line 19
    invoke-virtual {v3}, Lt/p;->m()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x1

    .line 30
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChainRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lt/p;->f:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "horizontal : "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "vertical : "

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lt/c;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_1
    if-ge v3, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    check-cast v4, Lt/p;

    .line 36
    .line 37
    const-string v5, "<"

    .line 38
    .line 39
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, "> "

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
