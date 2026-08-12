.class public abstract Lt/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lt/b$a;

.field private static b:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt/h;->a:Lt/b$a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lt/h;->b:I

    .line 10
    .line 11
    sput v0, Lt/h;->c:I

    .line 12
    .line 13
    return-void
.end method

.method private static a(ILs/e;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ls/e;->A()Ls/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Ls/e;->Q()Ls/e$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ls/e;->K()Ls/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ls/e;->K()Ls/e;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ls/f;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Ls/e;->A()Ls/e$b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Ls/e$b;->d:Ls/e$b;

    .line 30
    .line 31
    :cond_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Ls/e;->Q()Ls/e$b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, Ls/e$b;->d:Ls/e$b;

    .line 38
    .line 39
    :cond_2
    sget-object v1, Ls/e$b;->d:Ls/e$b;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x1

    .line 44
    if-eq p0, v1, :cond_5

    .line 45
    .line 46
    invoke-virtual {p1}, Ls/e;->k0()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_5

    .line 51
    .line 52
    sget-object v5, Ls/e$b;->e:Ls/e$b;

    .line 53
    .line 54
    if-eq p0, v5, :cond_5

    .line 55
    .line 56
    sget-object v5, Ls/e$b;->f:Ls/e$b;

    .line 57
    .line 58
    if-ne p0, v5, :cond_3

    .line 59
    .line 60
    iget v6, p1, Ls/e;->v:I

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    iget v6, p1, Ls/e;->c0:F

    .line 65
    .line 66
    cmpl-float v6, v6, v2

    .line 67
    .line 68
    if-nez v6, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ls/e;->X(I)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_5

    .line 75
    .line 76
    :cond_3
    if-ne p0, v5, :cond_4

    .line 77
    .line 78
    iget v5, p1, Ls/e;->v:I

    .line 79
    .line 80
    if-ne v5, v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Ls/e;->T()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-virtual {p1, v3, v5}, Ls/e;->a0(II)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move v5, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_5
    :goto_1
    move v5, v4

    .line 96
    :goto_2
    if-eq v0, v1, :cond_8

    .line 97
    .line 98
    invoke-virtual {p1}, Ls/e;->l0()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_8

    .line 103
    .line 104
    sget-object v1, Ls/e$b;->e:Ls/e$b;

    .line 105
    .line 106
    if-eq v0, v1, :cond_8

    .line 107
    .line 108
    sget-object v1, Ls/e$b;->f:Ls/e$b;

    .line 109
    .line 110
    if-ne v0, v1, :cond_6

    .line 111
    .line 112
    iget v0, p1, Ls/e;->w:I

    .line 113
    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    iget v0, p1, Ls/e;->c0:F

    .line 117
    .line 118
    cmpl-float v0, v0, v2

    .line 119
    .line 120
    if-nez v0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p1, v4}, Ls/e;->X(I)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    :cond_6
    if-ne p0, v1, :cond_7

    .line 129
    .line 130
    iget p0, p1, Ls/e;->w:I

    .line 131
    .line 132
    if-ne p0, v4, :cond_7

    .line 133
    .line 134
    invoke-virtual {p1}, Ls/e;->x()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-virtual {p1, v4, p0}, Ls/e;->a0(II)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_7

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_7
    move p0, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_8
    :goto_3
    move p0, v4

    .line 148
    :goto_4
    iget p1, p1, Ls/e;->c0:F

    .line 149
    .line 150
    cmpl-float p1, p1, v2

    .line 151
    .line 152
    if-lez p1, :cond_a

    .line 153
    .line 154
    if-nez v5, :cond_9

    .line 155
    .line 156
    if-eqz p0, :cond_a

    .line 157
    .line 158
    :cond_9
    return v4

    .line 159
    :cond_a
    if-eqz v5, :cond_b

    .line 160
    .line 161
    if-eqz p0, :cond_b

    .line 162
    .line 163
    return v4

    .line 164
    :cond_b
    return v3
.end method

.method private static b(ILs/e;Lt/b$b;Z)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ls/e;->d0()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget v3, Lt/h;->b:I

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    add-int/2addr v3, v4

    .line 18
    sput v3, Lt/h;->b:I

    .line 19
    .line 20
    instance-of v3, v0, Ls/f;

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Ls/e;->j0()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, p0, 0x1

    .line 31
    .line 32
    invoke-static {v3, v0}, Lt/h;->a(ILs/e;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    new-instance v5, Lt/b$a;

    .line 39
    .line 40
    invoke-direct {v5}, Lt/b$a;-><init>()V

    .line 41
    .line 42
    .line 43
    sget v6, Lt/b$a;->k:I

    .line 44
    .line 45
    invoke-static {v3, v0, v1, v5, v6}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-object v3, Ls/d$b;->e:Ls/d$b;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ls/e;->o(Ls/d$b;)Ls/d;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v5, Ls/d$b;->g:Ls/d$b;

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ls/e;->o(Ls/d$b;)Ls/d;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v3}, Ls/d;->e()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v5}, Ls/d;->e()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {v3}, Ls/d;->d()Ljava/util/HashSet;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/4 v9, 0x0

    .line 73
    const/16 v10, 0x8

    .line 74
    .line 75
    if-eqz v8, :cond_c

    .line 76
    .line 77
    invoke-virtual {v3}, Ls/d;->n()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_c

    .line 82
    .line 83
    invoke-virtual {v3}, Ls/d;->d()Ljava/util/HashSet;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_c

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Ls/d;

    .line 102
    .line 103
    iget-object v11, v8, Ls/d;->d:Ls/e;

    .line 104
    .line 105
    add-int/lit8 v12, p0, 0x1

    .line 106
    .line 107
    invoke-static {v12, v11}, Lt/h;->a(ILs/e;)Z

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    invoke-virtual {v11}, Ls/e;->j0()Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v14, :cond_3

    .line 116
    .line 117
    if-eqz v13, :cond_3

    .line 118
    .line 119
    new-instance v14, Lt/b$a;

    .line 120
    .line 121
    invoke-direct {v14}, Lt/b$a;-><init>()V

    .line 122
    .line 123
    .line 124
    sget v15, Lt/b$a;->k:I

    .line 125
    .line 126
    invoke-static {v12, v11, v1, v14, v15}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-virtual {v11}, Ls/e;->A()Ls/e$b;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    sget-object v15, Ls/e$b;->f:Ls/e$b;

    .line 134
    .line 135
    if-ne v14, v15, :cond_8

    .line 136
    .line 137
    if-eqz v13, :cond_4

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    invoke-virtual {v11}, Ls/e;->A()Ls/e$b;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    if-ne v13, v15, :cond_2

    .line 145
    .line 146
    iget v13, v11, Ls/e;->z:I

    .line 147
    .line 148
    if-ltz v13, :cond_2

    .line 149
    .line 150
    iget v13, v11, Ls/e;->y:I

    .line 151
    .line 152
    if-ltz v13, :cond_2

    .line 153
    .line 154
    invoke-virtual {v11}, Ls/e;->S()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eq v13, v10, :cond_5

    .line 159
    .line 160
    iget v13, v11, Ls/e;->v:I

    .line 161
    .line 162
    if-nez v13, :cond_2

    .line 163
    .line 164
    invoke-virtual {v11}, Ls/e;->v()F

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    cmpl-float v13, v13, v9

    .line 169
    .line 170
    if-nez v13, :cond_2

    .line 171
    .line 172
    :cond_5
    invoke-virtual {v11}, Ls/e;->f0()Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    if-nez v13, :cond_2

    .line 177
    .line 178
    invoke-virtual {v11}, Ls/e;->i0()Z

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    if-nez v13, :cond_2

    .line 183
    .line 184
    iget-object v13, v11, Ls/e;->N:Ls/d;

    .line 185
    .line 186
    if-ne v8, v13, :cond_6

    .line 187
    .line 188
    iget-object v13, v11, Ls/e;->P:Ls/d;

    .line 189
    .line 190
    iget-object v13, v13, Ls/d;->f:Ls/d;

    .line 191
    .line 192
    if-eqz v13, :cond_6

    .line 193
    .line 194
    invoke-virtual {v13}, Ls/d;->n()Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-nez v13, :cond_7

    .line 199
    .line 200
    :cond_6
    iget-object v13, v11, Ls/e;->P:Ls/d;

    .line 201
    .line 202
    if-ne v8, v13, :cond_2

    .line 203
    .line 204
    iget-object v8, v11, Ls/e;->N:Ls/d;

    .line 205
    .line 206
    iget-object v8, v8, Ls/d;->f:Ls/d;

    .line 207
    .line 208
    if-eqz v8, :cond_2

    .line 209
    .line 210
    invoke-virtual {v8}, Ls/d;->n()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_2

    .line 215
    .line 216
    :cond_7
    invoke-virtual {v11}, Ls/e;->f0()Z

    .line 217
    .line 218
    .line 219
    move-result v8

    .line 220
    if-nez v8, :cond_2

    .line 221
    .line 222
    invoke-static {v12, v0, v1, v11, v2}, Lt/h;->e(ILs/e;Lt/b$b;Ls/e;Z)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_8
    :goto_1
    invoke-virtual {v11}, Ls/e;->j0()Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-eqz v13, :cond_9

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_9
    iget-object v13, v11, Ls/e;->N:Ls/d;

    .line 236
    .line 237
    if-ne v8, v13, :cond_a

    .line 238
    .line 239
    iget-object v14, v11, Ls/e;->P:Ls/d;

    .line 240
    .line 241
    iget-object v14, v14, Ls/d;->f:Ls/d;

    .line 242
    .line 243
    if-nez v14, :cond_a

    .line 244
    .line 245
    invoke-virtual {v13}, Ls/d;->f()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    add-int/2addr v8, v6

    .line 250
    invoke-virtual {v11}, Ls/e;->T()I

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    add-int/2addr v13, v8

    .line 255
    invoke-virtual {v11, v8, v13}, Ls/e;->z0(II)V

    .line 256
    .line 257
    .line 258
    invoke-static {v12, v11, v1, v2}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_a
    iget-object v14, v11, Ls/e;->P:Ls/d;

    .line 264
    .line 265
    if-ne v8, v14, :cond_b

    .line 266
    .line 267
    iget-object v15, v13, Ls/d;->f:Ls/d;

    .line 268
    .line 269
    if-nez v15, :cond_b

    .line 270
    .line 271
    invoke-virtual {v14}, Ls/d;->f()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    sub-int v8, v6, v8

    .line 276
    .line 277
    invoke-virtual {v11}, Ls/e;->T()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    sub-int v13, v8, v13

    .line 282
    .line 283
    invoke-virtual {v11, v13, v8}, Ls/e;->z0(II)V

    .line 284
    .line 285
    .line 286
    invoke-static {v12, v11, v1, v2}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_b
    if-ne v8, v13, :cond_2

    .line 292
    .line 293
    iget-object v8, v14, Ls/d;->f:Ls/d;

    .line 294
    .line 295
    if-eqz v8, :cond_2

    .line 296
    .line 297
    invoke-virtual {v8}, Ls/d;->n()Z

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    if-eqz v8, :cond_2

    .line 302
    .line 303
    invoke-virtual {v11}, Ls/e;->f0()Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-nez v8, :cond_2

    .line 308
    .line 309
    invoke-static {v12, v1, v11, v2}, Lt/h;->d(ILt/b$b;Ls/e;Z)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_c
    instance-of v3, v0, Ls/h;

    .line 315
    .line 316
    if-eqz v3, :cond_d

    .line 317
    .line 318
    return-void

    .line 319
    :cond_d
    invoke-virtual {v5}, Ls/d;->d()Ljava/util/HashSet;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    if-eqz v3, :cond_19

    .line 324
    .line 325
    invoke-virtual {v5}, Ls/d;->n()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_19

    .line 330
    .line 331
    invoke-virtual {v5}, Ls/d;->d()Ljava/util/HashSet;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    :cond_e
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-eqz v5, :cond_19

    .line 344
    .line 345
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    check-cast v5, Ls/d;

    .line 350
    .line 351
    iget-object v6, v5, Ls/d;->d:Ls/e;

    .line 352
    .line 353
    add-int/lit8 v8, p0, 0x1

    .line 354
    .line 355
    invoke-static {v8, v6}, Lt/h;->a(ILs/e;)Z

    .line 356
    .line 357
    .line 358
    move-result v11

    .line 359
    invoke-virtual {v6}, Ls/e;->j0()Z

    .line 360
    .line 361
    .line 362
    move-result v12

    .line 363
    if-eqz v12, :cond_f

    .line 364
    .line 365
    if-eqz v11, :cond_f

    .line 366
    .line 367
    new-instance v12, Lt/b$a;

    .line 368
    .line 369
    invoke-direct {v12}, Lt/b$a;-><init>()V

    .line 370
    .line 371
    .line 372
    sget v13, Lt/b$a;->k:I

    .line 373
    .line 374
    invoke-static {v8, v6, v1, v12, v13}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 375
    .line 376
    .line 377
    :cond_f
    iget-object v12, v6, Ls/e;->N:Ls/d;

    .line 378
    .line 379
    if-ne v5, v12, :cond_10

    .line 380
    .line 381
    iget-object v12, v6, Ls/e;->P:Ls/d;

    .line 382
    .line 383
    iget-object v12, v12, Ls/d;->f:Ls/d;

    .line 384
    .line 385
    if-eqz v12, :cond_10

    .line 386
    .line 387
    invoke-virtual {v12}, Ls/d;->n()Z

    .line 388
    .line 389
    .line 390
    move-result v12

    .line 391
    if-nez v12, :cond_11

    .line 392
    .line 393
    :cond_10
    iget-object v12, v6, Ls/e;->P:Ls/d;

    .line 394
    .line 395
    if-ne v5, v12, :cond_12

    .line 396
    .line 397
    iget-object v12, v6, Ls/e;->N:Ls/d;

    .line 398
    .line 399
    iget-object v12, v12, Ls/d;->f:Ls/d;

    .line 400
    .line 401
    if-eqz v12, :cond_12

    .line 402
    .line 403
    invoke-virtual {v12}, Ls/d;->n()Z

    .line 404
    .line 405
    .line 406
    move-result v12

    .line 407
    if-eqz v12, :cond_12

    .line 408
    .line 409
    :cond_11
    move v12, v4

    .line 410
    goto :goto_3

    .line 411
    :cond_12
    const/4 v12, 0x0

    .line 412
    :goto_3
    invoke-virtual {v6}, Ls/e;->A()Ls/e$b;

    .line 413
    .line 414
    .line 415
    move-result-object v13

    .line 416
    sget-object v14, Ls/e$b;->f:Ls/e$b;

    .line 417
    .line 418
    if-ne v13, v14, :cond_15

    .line 419
    .line 420
    if-eqz v11, :cond_13

    .line 421
    .line 422
    goto :goto_4

    .line 423
    :cond_13
    invoke-virtual {v6}, Ls/e;->A()Ls/e$b;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    if-ne v5, v14, :cond_e

    .line 428
    .line 429
    iget v5, v6, Ls/e;->z:I

    .line 430
    .line 431
    if-ltz v5, :cond_e

    .line 432
    .line 433
    iget v5, v6, Ls/e;->y:I

    .line 434
    .line 435
    if-ltz v5, :cond_e

    .line 436
    .line 437
    invoke-virtual {v6}, Ls/e;->S()I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    if-eq v5, v10, :cond_14

    .line 442
    .line 443
    iget v5, v6, Ls/e;->v:I

    .line 444
    .line 445
    if-nez v5, :cond_e

    .line 446
    .line 447
    invoke-virtual {v6}, Ls/e;->v()F

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    cmpl-float v5, v5, v9

    .line 452
    .line 453
    if-nez v5, :cond_e

    .line 454
    .line 455
    :cond_14
    invoke-virtual {v6}, Ls/e;->f0()Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    if-nez v5, :cond_e

    .line 460
    .line 461
    invoke-virtual {v6}, Ls/e;->i0()Z

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    if-nez v5, :cond_e

    .line 466
    .line 467
    if-eqz v12, :cond_e

    .line 468
    .line 469
    invoke-virtual {v6}, Ls/e;->f0()Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-nez v5, :cond_e

    .line 474
    .line 475
    invoke-static {v8, v0, v1, v6, v2}, Lt/h;->e(ILs/e;Lt/b$b;Ls/e;Z)V

    .line 476
    .line 477
    .line 478
    goto/16 :goto_2

    .line 479
    .line 480
    :cond_15
    :goto_4
    invoke-virtual {v6}, Ls/e;->j0()Z

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    if-eqz v11, :cond_16

    .line 485
    .line 486
    goto/16 :goto_2

    .line 487
    .line 488
    :cond_16
    iget-object v11, v6, Ls/e;->N:Ls/d;

    .line 489
    .line 490
    if-ne v5, v11, :cond_17

    .line 491
    .line 492
    iget-object v13, v6, Ls/e;->P:Ls/d;

    .line 493
    .line 494
    iget-object v13, v13, Ls/d;->f:Ls/d;

    .line 495
    .line 496
    if-nez v13, :cond_17

    .line 497
    .line 498
    invoke-virtual {v11}, Ls/d;->f()I

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    add-int/2addr v5, v7

    .line 503
    invoke-virtual {v6}, Ls/e;->T()I

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    add-int/2addr v11, v5

    .line 508
    invoke-virtual {v6, v5, v11}, Ls/e;->z0(II)V

    .line 509
    .line 510
    .line 511
    invoke-static {v8, v6, v1, v2}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 512
    .line 513
    .line 514
    goto/16 :goto_2

    .line 515
    .line 516
    :cond_17
    iget-object v13, v6, Ls/e;->P:Ls/d;

    .line 517
    .line 518
    if-ne v5, v13, :cond_18

    .line 519
    .line 520
    iget-object v5, v11, Ls/d;->f:Ls/d;

    .line 521
    .line 522
    if-nez v5, :cond_18

    .line 523
    .line 524
    invoke-virtual {v13}, Ls/d;->f()I

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    sub-int v5, v7, v5

    .line 529
    .line 530
    invoke-virtual {v6}, Ls/e;->T()I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    sub-int v11, v5, v11

    .line 535
    .line 536
    invoke-virtual {v6, v11, v5}, Ls/e;->z0(II)V

    .line 537
    .line 538
    .line 539
    invoke-static {v8, v6, v1, v2}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_2

    .line 543
    .line 544
    :cond_18
    if-eqz v12, :cond_e

    .line 545
    .line 546
    invoke-virtual {v6}, Ls/e;->f0()Z

    .line 547
    .line 548
    .line 549
    move-result v5

    .line 550
    if-nez v5, :cond_e

    .line 551
    .line 552
    invoke-static {v8, v1, v6, v2}, Lt/h;->d(ILt/b$b;Ls/e;Z)V

    .line 553
    .line 554
    .line 555
    goto/16 :goto_2

    .line 556
    .line 557
    :cond_19
    invoke-virtual {v0}, Ls/e;->n0()V

    .line 558
    .line 559
    .line 560
    return-void
.end method

.method private static c(ILs/a;Lt/b$b;IZ)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ls/a;->n1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    invoke-static {p0, p1, p2, p4}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method private static d(ILt/b$b;Ls/e;Z)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ls/e;->y()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Ls/e;->N:Ls/d;

    .line 6
    .line 7
    iget-object v1, v1, Ls/d;->f:Ls/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p2, Ls/e;->P:Ls/d;

    .line 14
    .line 15
    iget-object v2, v2, Ls/d;->f:Ls/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Ls/d;->e()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p2, Ls/e;->N:Ls/d;

    .line 22
    .line 23
    invoke-virtual {v3}, Ls/d;->f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    iget-object v4, p2, Ls/e;->P:Ls/d;

    .line 29
    .line 30
    invoke-virtual {v4}, Ls/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    const/high16 v5, 0x3f000000    # 0.5f

    .line 37
    .line 38
    if-ne v1, v2, :cond_0

    .line 39
    .line 40
    move v0, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v3

    .line 43
    move v2, v4

    .line 44
    :goto_0
    invoke-virtual {p2}, Ls/e;->T()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int v4, v2, v1

    .line 49
    .line 50
    sub-int/2addr v4, v3

    .line 51
    if-le v1, v2, :cond_1

    .line 52
    .line 53
    sub-int v4, v1, v2

    .line 54
    .line 55
    sub-int/2addr v4, v3

    .line 56
    :cond_1
    if-lez v4, :cond_2

    .line 57
    .line 58
    int-to-float v4, v4

    .line 59
    mul-float/2addr v0, v4

    .line 60
    add-float/2addr v0, v5

    .line 61
    :goto_1
    float-to-int v0, v0

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    int-to-float v4, v4

    .line 64
    mul-float/2addr v0, v4

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    add-int/2addr v0, v1

    .line 67
    add-int v4, v0, v3

    .line 68
    .line 69
    if-le v1, v2, :cond_3

    .line 70
    .line 71
    sub-int v4, v0, v3

    .line 72
    .line 73
    :cond_3
    invoke-virtual {p2, v0, v4}, Ls/e;->z0(II)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 p0, p0, 0x1

    .line 77
    .line 78
    invoke-static {p0, p2, p1, p3}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private static e(ILs/e;Lt/b$b;Ls/e;Z)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Ls/e;->y()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p3, Ls/e;->N:Ls/d;

    .line 6
    .line 7
    iget-object v1, v1, Ls/d;->f:Ls/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p3, Ls/e;->N:Ls/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Ls/d;->f()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    iget-object v2, p3, Ls/e;->P:Ls/d;

    .line 21
    .line 22
    iget-object v2, v2, Ls/d;->f:Ls/d;

    .line 23
    .line 24
    invoke-virtual {v2}, Ls/d;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p3, Ls/e;->P:Ls/d;

    .line 29
    .line 30
    invoke-virtual {v3}, Ls/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    if-lt v2, v1, :cond_4

    .line 36
    .line 37
    invoke-virtual {p3}, Ls/e;->T()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p3}, Ls/e;->S()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/high16 v6, 0x3f000000    # 0.5f

    .line 48
    .line 49
    if-eq v4, v5, :cond_3

    .line 50
    .line 51
    iget v4, p3, Ls/e;->v:I

    .line 52
    .line 53
    const/4 v5, 0x2

    .line 54
    if-ne v4, v5, :cond_1

    .line 55
    .line 56
    instance-of v3, p1, Ls/f;

    .line 57
    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Ls/e;->T()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Ls/e;->K()Ls/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ls/e;->T()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_0
    invoke-virtual {p3}, Ls/e;->y()F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    mul-float/2addr v3, v6

    .line 78
    int-to-float p1, p1

    .line 79
    mul-float/2addr v3, p1

    .line 80
    float-to-int v3, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    if-nez v4, :cond_2

    .line 83
    .line 84
    sub-int v3, v2, v1

    .line 85
    .line 86
    :cond_2
    :goto_1
    iget p1, p3, Ls/e;->y:I

    .line 87
    .line 88
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    iget p1, p3, Ls/e;->z:I

    .line 93
    .line 94
    if-lez p1, :cond_3

    .line 95
    .line 96
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    :cond_3
    sub-int/2addr v2, v1

    .line 101
    sub-int/2addr v2, v3

    .line 102
    int-to-float p1, v2

    .line 103
    mul-float/2addr v0, p1

    .line 104
    add-float/2addr v0, v6

    .line 105
    float-to-int p1, v0

    .line 106
    add-int/2addr v1, p1

    .line 107
    add-int/2addr v3, v1

    .line 108
    invoke-virtual {p3, v1, v3}, Ls/e;->z0(II)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 p0, p0, 0x1

    .line 112
    .line 113
    invoke-static {p0, p3, p2, p4}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method

.method private static f(ILt/b$b;Ls/e;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ls/e;->O()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, Ls/e;->O:Ls/d;

    .line 6
    .line 7
    iget-object v1, v1, Ls/d;->f:Ls/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p2, Ls/e;->Q:Ls/d;

    .line 14
    .line 15
    iget-object v2, v2, Ls/d;->f:Ls/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Ls/d;->e()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p2, Ls/e;->O:Ls/d;

    .line 22
    .line 23
    invoke-virtual {v3}, Ls/d;->f()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    iget-object v4, p2, Ls/e;->Q:Ls/d;

    .line 29
    .line 30
    invoke-virtual {v4}, Ls/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int v4, v2, v4

    .line 35
    .line 36
    const/high16 v5, 0x3f000000    # 0.5f

    .line 37
    .line 38
    if-ne v1, v2, :cond_0

    .line 39
    .line 40
    move v0, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v3

    .line 43
    move v2, v4

    .line 44
    :goto_0
    invoke-virtual {p2}, Ls/e;->x()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int v4, v2, v1

    .line 49
    .line 50
    sub-int/2addr v4, v3

    .line 51
    if-le v1, v2, :cond_1

    .line 52
    .line 53
    sub-int v4, v1, v2

    .line 54
    .line 55
    sub-int/2addr v4, v3

    .line 56
    :cond_1
    if-lez v4, :cond_2

    .line 57
    .line 58
    int-to-float v4, v4

    .line 59
    mul-float/2addr v0, v4

    .line 60
    add-float/2addr v0, v5

    .line 61
    :goto_1
    float-to-int v0, v0

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    int-to-float v4, v4

    .line 64
    mul-float/2addr v0, v4

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    add-int v4, v1, v0

    .line 67
    .line 68
    add-int v5, v4, v3

    .line 69
    .line 70
    if-le v1, v2, :cond_3

    .line 71
    .line 72
    sub-int v4, v1, v0

    .line 73
    .line 74
    sub-int v5, v4, v3

    .line 75
    .line 76
    :cond_3
    invoke-virtual {p2, v4, v5}, Ls/e;->C0(II)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 p0, p0, 0x1

    .line 80
    .line 81
    invoke-static {p0, p2, p1}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static g(ILs/e;Lt/b$b;Ls/e;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Ls/e;->O()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p3, Ls/e;->O:Ls/d;

    .line 6
    .line 7
    iget-object v1, v1, Ls/d;->f:Ls/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls/d;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p3, Ls/e;->O:Ls/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Ls/d;->f()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    iget-object v2, p3, Ls/e;->Q:Ls/d;

    .line 21
    .line 22
    iget-object v2, v2, Ls/d;->f:Ls/d;

    .line 23
    .line 24
    invoke-virtual {v2}, Ls/d;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p3, Ls/e;->Q:Ls/d;

    .line 29
    .line 30
    invoke-virtual {v3}, Ls/d;->f()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v2, v3

    .line 35
    if-lt v2, v1, :cond_4

    .line 36
    .line 37
    invoke-virtual {p3}, Ls/e;->x()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p3}, Ls/e;->S()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    const/high16 v6, 0x3f000000    # 0.5f

    .line 48
    .line 49
    if-eq v4, v5, :cond_3

    .line 50
    .line 51
    iget v4, p3, Ls/e;->w:I

    .line 52
    .line 53
    const/4 v5, 0x2

    .line 54
    if-ne v4, v5, :cond_1

    .line 55
    .line 56
    instance-of v3, p1, Ls/f;

    .line 57
    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Ls/e;->x()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Ls/e;->K()Ls/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ls/e;->x()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_0
    mul-float v3, v0, v6

    .line 74
    .line 75
    int-to-float p1, p1

    .line 76
    mul-float/2addr v3, p1

    .line 77
    float-to-int v3, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    if-nez v4, :cond_2

    .line 80
    .line 81
    sub-int v3, v2, v1

    .line 82
    .line 83
    :cond_2
    :goto_1
    iget p1, p3, Ls/e;->B:I

    .line 84
    .line 85
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    iget p1, p3, Ls/e;->C:I

    .line 90
    .line 91
    if-lez p1, :cond_3

    .line 92
    .line 93
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    :cond_3
    sub-int/2addr v2, v1

    .line 98
    sub-int/2addr v2, v3

    .line 99
    int-to-float p1, v2

    .line 100
    mul-float/2addr v0, p1

    .line 101
    add-float/2addr v0, v6

    .line 102
    float-to-int p1, v0

    .line 103
    add-int/2addr v1, p1

    .line 104
    add-int/2addr v3, v1

    .line 105
    invoke-virtual {p3, v1, v3}, Ls/e;->C0(II)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 p0, p0, 0x1

    .line 109
    .line 110
    invoke-static {p0, p3, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    return-void
.end method

.method public static h(Ls/f;Lt/b$b;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ls/e;->A()Ls/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ls/e;->Q()Ls/e$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    sput v2, Lt/h;->b:I

    .line 11
    .line 12
    sput v2, Lt/h;->c:I

    .line 13
    .line 14
    invoke-virtual {p0}, Ls/e;->s0()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ls/m;->l1()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    move v5, v2

    .line 26
    :goto_0
    if-ge v5, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Ls/e;

    .line 33
    .line 34
    invoke-virtual {v6}, Ls/e;->s0()V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Ls/f;->J1()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    sget-object v6, Ls/e$b;->d:Ls/e$b;

    .line 45
    .line 46
    if-ne v0, v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Ls/e;->T()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p0, v2, v0}, Ls/e;->z0(II)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {p0, v2}, Ls/e;->A0(I)V

    .line 57
    .line 58
    .line 59
    :goto_1
    move v0, v2

    .line 60
    move v6, v0

    .line 61
    move v7, v6

    .line 62
    :goto_2
    const/high16 v8, 0x3f000000    # 0.5f

    .line 63
    .line 64
    const/4 v9, -0x1

    .line 65
    const/4 v10, 0x1

    .line 66
    if-ge v0, v4, :cond_7

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    check-cast v11, Ls/e;

    .line 73
    .line 74
    instance-of v12, v11, Ls/h;

    .line 75
    .line 76
    if-eqz v12, :cond_5

    .line 77
    .line 78
    check-cast v11, Ls/h;

    .line 79
    .line 80
    invoke-virtual {v11}, Ls/h;->m1()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-ne v12, v10, :cond_6

    .line 85
    .line 86
    invoke-virtual {v11}, Ls/h;->n1()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eq v6, v9, :cond_2

    .line 91
    .line 92
    invoke-virtual {v11}, Ls/h;->n1()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {v11, v6}, Ls/h;->q1(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_2
    invoke-virtual {v11}, Ls/h;->o1()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eq v6, v9, :cond_3

    .line 105
    .line 106
    invoke-virtual {p0}, Ls/e;->k0()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0}, Ls/e;->T()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    invoke-virtual {v11}, Ls/h;->o1()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    sub-int/2addr v6, v8

    .line 121
    invoke-virtual {v11, v6}, Ls/h;->q1(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    invoke-virtual {p0}, Ls/e;->k0()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_4

    .line 130
    .line 131
    invoke-virtual {v11}, Ls/h;->p1()F

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-virtual {p0}, Ls/e;->T()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    int-to-float v9, v9

    .line 140
    mul-float/2addr v6, v9

    .line 141
    add-float/2addr v6, v8

    .line 142
    float-to-int v6, v6

    .line 143
    invoke-virtual {v11, v6}, Ls/h;->q1(I)V

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_3
    move v6, v10

    .line 147
    goto :goto_4

    .line 148
    :cond_5
    instance-of v8, v11, Ls/a;

    .line 149
    .line 150
    if-eqz v8, :cond_6

    .line 151
    .line 152
    check-cast v11, Ls/a;

    .line 153
    .line 154
    invoke-virtual {v11}, Ls/a;->r1()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_6

    .line 159
    .line 160
    move v7, v10

    .line 161
    :cond_6
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    if-eqz v6, :cond_9

    .line 165
    .line 166
    move v0, v2

    .line 167
    :goto_5
    if-ge v0, v4, :cond_9

    .line 168
    .line 169
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    check-cast v6, Ls/e;

    .line 174
    .line 175
    instance-of v11, v6, Ls/h;

    .line 176
    .line 177
    if-eqz v11, :cond_8

    .line 178
    .line 179
    check-cast v6, Ls/h;

    .line 180
    .line 181
    invoke-virtual {v6}, Ls/h;->m1()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    if-ne v11, v10, :cond_8

    .line 186
    .line 187
    invoke-static {v2, v6, p1, v5}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 188
    .line 189
    .line 190
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_9
    invoke-static {v2, p0, p1, v5}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 194
    .line 195
    .line 196
    if-eqz v7, :cond_b

    .line 197
    .line 198
    move v0, v2

    .line 199
    :goto_6
    if-ge v0, v4, :cond_b

    .line 200
    .line 201
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Ls/e;

    .line 206
    .line 207
    instance-of v7, v6, Ls/a;

    .line 208
    .line 209
    if-eqz v7, :cond_a

    .line 210
    .line 211
    check-cast v6, Ls/a;

    .line 212
    .line 213
    invoke-virtual {v6}, Ls/a;->r1()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-nez v7, :cond_a

    .line 218
    .line 219
    invoke-static {v2, v6, p1, v2, v5}, Lt/h;->c(ILs/a;Lt/b$b;IZ)V

    .line 220
    .line 221
    .line 222
    :cond_a
    add-int/lit8 v0, v0, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_b
    sget-object v0, Ls/e$b;->d:Ls/e$b;

    .line 226
    .line 227
    if-ne v1, v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {p0}, Ls/e;->x()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-virtual {p0, v2, v0}, Ls/e;->C0(II)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_c
    invoke-virtual {p0, v2}, Ls/e;->B0(I)V

    .line 238
    .line 239
    .line 240
    :goto_7
    move v0, v2

    .line 241
    move v1, v0

    .line 242
    move v6, v1

    .line 243
    :goto_8
    if-ge v0, v4, :cond_12

    .line 244
    .line 245
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    check-cast v7, Ls/e;

    .line 250
    .line 251
    instance-of v11, v7, Ls/h;

    .line 252
    .line 253
    if-eqz v11, :cond_10

    .line 254
    .line 255
    check-cast v7, Ls/h;

    .line 256
    .line 257
    invoke-virtual {v7}, Ls/h;->m1()I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    if-nez v11, :cond_11

    .line 262
    .line 263
    invoke-virtual {v7}, Ls/h;->n1()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eq v1, v9, :cond_d

    .line 268
    .line 269
    invoke-virtual {v7}, Ls/h;->n1()I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    invoke-virtual {v7, v1}, Ls/h;->q1(I)V

    .line 274
    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_d
    invoke-virtual {v7}, Ls/h;->o1()I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eq v1, v9, :cond_e

    .line 282
    .line 283
    invoke-virtual {p0}, Ls/e;->l0()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_e

    .line 288
    .line 289
    invoke-virtual {p0}, Ls/e;->x()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-virtual {v7}, Ls/h;->o1()I

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    sub-int/2addr v1, v11

    .line 298
    invoke-virtual {v7, v1}, Ls/h;->q1(I)V

    .line 299
    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_e
    invoke-virtual {p0}, Ls/e;->l0()Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_f

    .line 307
    .line 308
    invoke-virtual {v7}, Ls/h;->p1()F

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {p0}, Ls/e;->x()I

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    int-to-float v11, v11

    .line 317
    mul-float/2addr v1, v11

    .line 318
    add-float/2addr v1, v8

    .line 319
    float-to-int v1, v1

    .line 320
    invoke-virtual {v7, v1}, Ls/h;->q1(I)V

    .line 321
    .line 322
    .line 323
    :cond_f
    :goto_9
    move v1, v10

    .line 324
    goto :goto_a

    .line 325
    :cond_10
    instance-of v11, v7, Ls/a;

    .line 326
    .line 327
    if-eqz v11, :cond_11

    .line 328
    .line 329
    check-cast v7, Ls/a;

    .line 330
    .line 331
    invoke-virtual {v7}, Ls/a;->r1()I

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    if-ne v7, v10, :cond_11

    .line 336
    .line 337
    move v6, v10

    .line 338
    :cond_11
    :goto_a
    add-int/lit8 v0, v0, 0x1

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_12
    if-eqz v1, :cond_14

    .line 342
    .line 343
    move v0, v2

    .line 344
    :goto_b
    if-ge v0, v4, :cond_14

    .line 345
    .line 346
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Ls/e;

    .line 351
    .line 352
    instance-of v7, v1, Ls/h;

    .line 353
    .line 354
    if-eqz v7, :cond_13

    .line 355
    .line 356
    check-cast v1, Ls/h;

    .line 357
    .line 358
    invoke-virtual {v1}, Ls/h;->m1()I

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    if-nez v7, :cond_13

    .line 363
    .line 364
    invoke-static {v10, v1, p1}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 365
    .line 366
    .line 367
    :cond_13
    add-int/lit8 v0, v0, 0x1

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_14
    invoke-static {v2, p0, p1}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 371
    .line 372
    .line 373
    if-eqz v6, :cond_16

    .line 374
    .line 375
    move p0, v2

    .line 376
    :goto_c
    if-ge p0, v4, :cond_16

    .line 377
    .line 378
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ls/e;

    .line 383
    .line 384
    instance-of v1, v0, Ls/a;

    .line 385
    .line 386
    if-eqz v1, :cond_15

    .line 387
    .line 388
    check-cast v0, Ls/a;

    .line 389
    .line 390
    invoke-virtual {v0}, Ls/a;->r1()I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-ne v1, v10, :cond_15

    .line 395
    .line 396
    invoke-static {v2, v0, p1, v10, v5}, Lt/h;->c(ILs/a;Lt/b$b;IZ)V

    .line 397
    .line 398
    .line 399
    :cond_15
    add-int/lit8 p0, p0, 0x1

    .line 400
    .line 401
    goto :goto_c

    .line 402
    :cond_16
    move p0, v2

    .line 403
    :goto_d
    if-ge p0, v4, :cond_1a

    .line 404
    .line 405
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    check-cast v0, Ls/e;

    .line 410
    .line 411
    invoke-virtual {v0}, Ls/e;->j0()Z

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    if-eqz v1, :cond_19

    .line 416
    .line 417
    invoke-static {v2, v0}, Lt/h;->a(ILs/e;)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-eqz v1, :cond_19

    .line 422
    .line 423
    sget-object v1, Lt/h;->a:Lt/b$a;

    .line 424
    .line 425
    sget v6, Lt/b$a;->k:I

    .line 426
    .line 427
    invoke-static {v2, v0, p1, v1, v6}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 428
    .line 429
    .line 430
    instance-of v1, v0, Ls/h;

    .line 431
    .line 432
    if-eqz v1, :cond_18

    .line 433
    .line 434
    move-object v1, v0

    .line 435
    check-cast v1, Ls/h;

    .line 436
    .line 437
    invoke-virtual {v1}, Ls/h;->m1()I

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-nez v1, :cond_17

    .line 442
    .line 443
    invoke-static {v2, v0, p1}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 444
    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_17
    invoke-static {v2, v0, p1, v5}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 448
    .line 449
    .line 450
    goto :goto_e

    .line 451
    :cond_18
    invoke-static {v2, v0, p1, v5}, Lt/h;->b(ILs/e;Lt/b$b;Z)V

    .line 452
    .line 453
    .line 454
    invoke-static {v2, v0, p1}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 455
    .line 456
    .line 457
    :cond_19
    :goto_e
    add-int/lit8 p0, p0, 0x1

    .line 458
    .line 459
    goto :goto_d

    .line 460
    :cond_1a
    return-void
.end method

.method private static i(ILs/e;Lt/b$b;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ls/e;->m0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget v0, Lt/h;->c:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    add-int/2addr v0, v1

    .line 12
    sput v0, Lt/h;->c:I

    .line 13
    .line 14
    instance-of v0, p1, Ls/f;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ls/e;->j0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    add-int/lit8 v0, p0, 0x1

    .line 25
    .line 26
    invoke-static {v0, p1}, Lt/h;->a(ILs/e;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    new-instance v2, Lt/b$a;

    .line 33
    .line 34
    invoke-direct {v2}, Lt/b$a;-><init>()V

    .line 35
    .line 36
    .line 37
    sget v3, Lt/b$a;->k:I

    .line 38
    .line 39
    invoke-static {v0, p1, p2, v2, v3}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    sget-object v0, Ls/d$b;->f:Ls/d$b;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ls/e;->o(Ls/d$b;)Ls/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v2, Ls/d$b;->h:Ls/d$b;

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Ls/e;->o(Ls/d$b;)Ls/d;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0}, Ls/d;->e()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v2}, Ls/d;->e()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {v0}, Ls/d;->d()Ljava/util/HashSet;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/4 v6, 0x0

    .line 67
    const/16 v7, 0x8

    .line 68
    .line 69
    if-eqz v5, :cond_c

    .line 70
    .line 71
    invoke-virtual {v0}, Ls/d;->n()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_c

    .line 76
    .line 77
    invoke-virtual {v0}, Ls/d;->d()Ljava/util/HashSet;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_c

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Ls/d;

    .line 96
    .line 97
    iget-object v8, v5, Ls/d;->d:Ls/e;

    .line 98
    .line 99
    add-int/lit8 v9, p0, 0x1

    .line 100
    .line 101
    invoke-static {v9, v8}, Lt/h;->a(ILs/e;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    invoke-virtual {v8}, Ls/e;->j0()Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_3

    .line 110
    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    new-instance v11, Lt/b$a;

    .line 114
    .line 115
    invoke-direct {v11}, Lt/b$a;-><init>()V

    .line 116
    .line 117
    .line 118
    sget v12, Lt/b$a;->k:I

    .line 119
    .line 120
    invoke-static {v9, v8, p2, v11, v12}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {v8}, Ls/e;->Q()Ls/e$b;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    sget-object v12, Ls/e$b;->f:Ls/e$b;

    .line 128
    .line 129
    if-ne v11, v12, :cond_8

    .line 130
    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    invoke-virtual {v8}, Ls/e;->Q()Ls/e$b;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    if-ne v10, v12, :cond_2

    .line 139
    .line 140
    iget v10, v8, Ls/e;->C:I

    .line 141
    .line 142
    if-ltz v10, :cond_2

    .line 143
    .line 144
    iget v10, v8, Ls/e;->B:I

    .line 145
    .line 146
    if-ltz v10, :cond_2

    .line 147
    .line 148
    invoke-virtual {v8}, Ls/e;->S()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eq v10, v7, :cond_5

    .line 153
    .line 154
    iget v10, v8, Ls/e;->w:I

    .line 155
    .line 156
    if-nez v10, :cond_2

    .line 157
    .line 158
    invoke-virtual {v8}, Ls/e;->v()F

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    cmpl-float v10, v10, v6

    .line 163
    .line 164
    if-nez v10, :cond_2

    .line 165
    .line 166
    :cond_5
    invoke-virtual {v8}, Ls/e;->h0()Z

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-nez v10, :cond_2

    .line 171
    .line 172
    invoke-virtual {v8}, Ls/e;->i0()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-nez v10, :cond_2

    .line 177
    .line 178
    iget-object v10, v8, Ls/e;->O:Ls/d;

    .line 179
    .line 180
    if-ne v5, v10, :cond_6

    .line 181
    .line 182
    iget-object v10, v8, Ls/e;->Q:Ls/d;

    .line 183
    .line 184
    iget-object v10, v10, Ls/d;->f:Ls/d;

    .line 185
    .line 186
    if-eqz v10, :cond_6

    .line 187
    .line 188
    invoke-virtual {v10}, Ls/d;->n()Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_7

    .line 193
    .line 194
    :cond_6
    iget-object v10, v8, Ls/e;->Q:Ls/d;

    .line 195
    .line 196
    if-ne v5, v10, :cond_2

    .line 197
    .line 198
    iget-object v5, v8, Ls/e;->O:Ls/d;

    .line 199
    .line 200
    iget-object v5, v5, Ls/d;->f:Ls/d;

    .line 201
    .line 202
    if-eqz v5, :cond_2

    .line 203
    .line 204
    invoke-virtual {v5}, Ls/d;->n()Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_2

    .line 209
    .line 210
    :cond_7
    invoke-virtual {v8}, Ls/e;->h0()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-nez v5, :cond_2

    .line 215
    .line 216
    invoke-static {v9, p1, p2, v8}, Lt/h;->g(ILs/e;Lt/b$b;Ls/e;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_8
    :goto_1
    invoke-virtual {v8}, Ls/e;->j0()Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_9

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_9
    iget-object v10, v8, Ls/e;->O:Ls/d;

    .line 230
    .line 231
    if-ne v5, v10, :cond_a

    .line 232
    .line 233
    iget-object v11, v8, Ls/e;->Q:Ls/d;

    .line 234
    .line 235
    iget-object v11, v11, Ls/d;->f:Ls/d;

    .line 236
    .line 237
    if-nez v11, :cond_a

    .line 238
    .line 239
    invoke-virtual {v10}, Ls/d;->f()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    add-int/2addr v5, v3

    .line 244
    invoke-virtual {v8}, Ls/e;->x()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    add-int/2addr v10, v5

    .line 249
    invoke-virtual {v8, v5, v10}, Ls/e;->C0(II)V

    .line 250
    .line 251
    .line 252
    invoke-static {v9, v8, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_a
    iget-object v11, v8, Ls/e;->Q:Ls/d;

    .line 258
    .line 259
    if-ne v5, v11, :cond_b

    .line 260
    .line 261
    iget-object v12, v11, Ls/d;->f:Ls/d;

    .line 262
    .line 263
    if-nez v12, :cond_b

    .line 264
    .line 265
    invoke-virtual {v11}, Ls/d;->f()I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    sub-int v5, v3, v5

    .line 270
    .line 271
    invoke-virtual {v8}, Ls/e;->x()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    sub-int v10, v5, v10

    .line 276
    .line 277
    invoke-virtual {v8, v10, v5}, Ls/e;->C0(II)V

    .line 278
    .line 279
    .line 280
    invoke-static {v9, v8, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_b
    if-ne v5, v10, :cond_2

    .line 286
    .line 287
    iget-object v5, v11, Ls/d;->f:Ls/d;

    .line 288
    .line 289
    if-eqz v5, :cond_2

    .line 290
    .line 291
    invoke-virtual {v5}, Ls/d;->n()Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-eqz v5, :cond_2

    .line 296
    .line 297
    invoke-static {v9, p2, v8}, Lt/h;->f(ILt/b$b;Ls/e;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_c
    instance-of v0, p1, Ls/h;

    .line 303
    .line 304
    if-eqz v0, :cond_d

    .line 305
    .line 306
    return-void

    .line 307
    :cond_d
    invoke-virtual {v2}, Ls/d;->d()Ljava/util/HashSet;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eqz v0, :cond_19

    .line 312
    .line 313
    invoke-virtual {v2}, Ls/d;->n()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_19

    .line 318
    .line 319
    invoke-virtual {v2}, Ls/d;->d()Ljava/util/HashSet;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    :cond_e
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_19

    .line 332
    .line 333
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ls/d;

    .line 338
    .line 339
    iget-object v3, v2, Ls/d;->d:Ls/e;

    .line 340
    .line 341
    add-int/lit8 v5, p0, 0x1

    .line 342
    .line 343
    invoke-static {v5, v3}, Lt/h;->a(ILs/e;)Z

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    invoke-virtual {v3}, Ls/e;->j0()Z

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    if-eqz v9, :cond_f

    .line 352
    .line 353
    if-eqz v8, :cond_f

    .line 354
    .line 355
    new-instance v9, Lt/b$a;

    .line 356
    .line 357
    invoke-direct {v9}, Lt/b$a;-><init>()V

    .line 358
    .line 359
    .line 360
    sget v10, Lt/b$a;->k:I

    .line 361
    .line 362
    invoke-static {v5, v3, p2, v9, v10}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 363
    .line 364
    .line 365
    :cond_f
    iget-object v9, v3, Ls/e;->O:Ls/d;

    .line 366
    .line 367
    if-ne v2, v9, :cond_10

    .line 368
    .line 369
    iget-object v9, v3, Ls/e;->Q:Ls/d;

    .line 370
    .line 371
    iget-object v9, v9, Ls/d;->f:Ls/d;

    .line 372
    .line 373
    if-eqz v9, :cond_10

    .line 374
    .line 375
    invoke-virtual {v9}, Ls/d;->n()Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    if-nez v9, :cond_11

    .line 380
    .line 381
    :cond_10
    iget-object v9, v3, Ls/e;->Q:Ls/d;

    .line 382
    .line 383
    if-ne v2, v9, :cond_12

    .line 384
    .line 385
    iget-object v9, v3, Ls/e;->O:Ls/d;

    .line 386
    .line 387
    iget-object v9, v9, Ls/d;->f:Ls/d;

    .line 388
    .line 389
    if-eqz v9, :cond_12

    .line 390
    .line 391
    invoke-virtual {v9}, Ls/d;->n()Z

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    if-eqz v9, :cond_12

    .line 396
    .line 397
    :cond_11
    move v9, v1

    .line 398
    goto :goto_3

    .line 399
    :cond_12
    const/4 v9, 0x0

    .line 400
    :goto_3
    invoke-virtual {v3}, Ls/e;->Q()Ls/e$b;

    .line 401
    .line 402
    .line 403
    move-result-object v10

    .line 404
    sget-object v11, Ls/e$b;->f:Ls/e$b;

    .line 405
    .line 406
    if-ne v10, v11, :cond_15

    .line 407
    .line 408
    if-eqz v8, :cond_13

    .line 409
    .line 410
    goto :goto_4

    .line 411
    :cond_13
    invoke-virtual {v3}, Ls/e;->Q()Ls/e$b;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    if-ne v2, v11, :cond_e

    .line 416
    .line 417
    iget v2, v3, Ls/e;->C:I

    .line 418
    .line 419
    if-ltz v2, :cond_e

    .line 420
    .line 421
    iget v2, v3, Ls/e;->B:I

    .line 422
    .line 423
    if-ltz v2, :cond_e

    .line 424
    .line 425
    invoke-virtual {v3}, Ls/e;->S()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eq v2, v7, :cond_14

    .line 430
    .line 431
    iget v2, v3, Ls/e;->w:I

    .line 432
    .line 433
    if-nez v2, :cond_e

    .line 434
    .line 435
    invoke-virtual {v3}, Ls/e;->v()F

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    cmpl-float v2, v2, v6

    .line 440
    .line 441
    if-nez v2, :cond_e

    .line 442
    .line 443
    :cond_14
    invoke-virtual {v3}, Ls/e;->h0()Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-nez v2, :cond_e

    .line 448
    .line 449
    invoke-virtual {v3}, Ls/e;->i0()Z

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    if-nez v2, :cond_e

    .line 454
    .line 455
    if-eqz v9, :cond_e

    .line 456
    .line 457
    invoke-virtual {v3}, Ls/e;->h0()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-nez v2, :cond_e

    .line 462
    .line 463
    invoke-static {v5, p1, p2, v3}, Lt/h;->g(ILs/e;Lt/b$b;Ls/e;)V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_2

    .line 467
    .line 468
    :cond_15
    :goto_4
    invoke-virtual {v3}, Ls/e;->j0()Z

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    if-eqz v8, :cond_16

    .line 473
    .line 474
    goto/16 :goto_2

    .line 475
    .line 476
    :cond_16
    iget-object v8, v3, Ls/e;->O:Ls/d;

    .line 477
    .line 478
    if-ne v2, v8, :cond_17

    .line 479
    .line 480
    iget-object v10, v3, Ls/e;->Q:Ls/d;

    .line 481
    .line 482
    iget-object v10, v10, Ls/d;->f:Ls/d;

    .line 483
    .line 484
    if-nez v10, :cond_17

    .line 485
    .line 486
    invoke-virtual {v8}, Ls/d;->f()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    add-int/2addr v2, v4

    .line 491
    invoke-virtual {v3}, Ls/e;->x()I

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    add-int/2addr v8, v2

    .line 496
    invoke-virtual {v3, v2, v8}, Ls/e;->C0(II)V

    .line 497
    .line 498
    .line 499
    invoke-static {v5, v3, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 500
    .line 501
    .line 502
    goto/16 :goto_2

    .line 503
    .line 504
    :cond_17
    iget-object v10, v3, Ls/e;->Q:Ls/d;

    .line 505
    .line 506
    if-ne v2, v10, :cond_18

    .line 507
    .line 508
    iget-object v2, v8, Ls/d;->f:Ls/d;

    .line 509
    .line 510
    if-nez v2, :cond_18

    .line 511
    .line 512
    invoke-virtual {v10}, Ls/d;->f()I

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    sub-int v2, v4, v2

    .line 517
    .line 518
    invoke-virtual {v3}, Ls/e;->x()I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    sub-int v8, v2, v8

    .line 523
    .line 524
    invoke-virtual {v3, v8, v2}, Ls/e;->C0(II)V

    .line 525
    .line 526
    .line 527
    invoke-static {v5, v3, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_2

    .line 531
    .line 532
    :cond_18
    if-eqz v9, :cond_e

    .line 533
    .line 534
    invoke-virtual {v3}, Ls/e;->h0()Z

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-nez v2, :cond_e

    .line 539
    .line 540
    invoke-static {v5, p2, v3}, Lt/h;->f(ILt/b$b;Ls/e;)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_2

    .line 544
    .line 545
    :cond_19
    sget-object v0, Ls/d$b;->i:Ls/d$b;

    .line 546
    .line 547
    invoke-virtual {p1, v0}, Ls/e;->o(Ls/d$b;)Ls/d;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v0}, Ls/d;->d()Ljava/util/HashSet;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    if-eqz v2, :cond_1e

    .line 556
    .line 557
    invoke-virtual {v0}, Ls/d;->n()Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_1e

    .line 562
    .line 563
    invoke-virtual {v0}, Ls/d;->e()I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    invoke-virtual {v0}, Ls/d;->d()Ljava/util/HashSet;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    :cond_1a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-eqz v3, :cond_1e

    .line 580
    .line 581
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, Ls/d;

    .line 586
    .line 587
    iget-object v4, v3, Ls/d;->d:Ls/e;

    .line 588
    .line 589
    add-int/lit8 v5, p0, 0x1

    .line 590
    .line 591
    invoke-static {v5, v4}, Lt/h;->a(ILs/e;)Z

    .line 592
    .line 593
    .line 594
    move-result v6

    .line 595
    invoke-virtual {v4}, Ls/e;->j0()Z

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    if-eqz v7, :cond_1b

    .line 600
    .line 601
    if-eqz v6, :cond_1b

    .line 602
    .line 603
    new-instance v7, Lt/b$a;

    .line 604
    .line 605
    invoke-direct {v7}, Lt/b$a;-><init>()V

    .line 606
    .line 607
    .line 608
    sget v8, Lt/b$a;->k:I

    .line 609
    .line 610
    invoke-static {v5, v4, p2, v7, v8}, Ls/f;->M1(ILs/e;Lt/b$b;Lt/b$a;I)Z

    .line 611
    .line 612
    .line 613
    :cond_1b
    invoke-virtual {v4}, Ls/e;->Q()Ls/e$b;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    sget-object v8, Ls/e$b;->f:Ls/e$b;

    .line 618
    .line 619
    if-ne v7, v8, :cond_1c

    .line 620
    .line 621
    if-eqz v6, :cond_1a

    .line 622
    .line 623
    :cond_1c
    invoke-virtual {v4}, Ls/e;->j0()Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-eqz v6, :cond_1d

    .line 628
    .line 629
    goto :goto_5

    .line 630
    :cond_1d
    iget-object v6, v4, Ls/e;->R:Ls/d;

    .line 631
    .line 632
    if-ne v3, v6, :cond_1a

    .line 633
    .line 634
    invoke-virtual {v3}, Ls/d;->f()I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    add-int/2addr v3, v2

    .line 639
    invoke-virtual {v4, v3}, Ls/e;->y0(I)V

    .line 640
    .line 641
    .line 642
    :try_start_0
    invoke-static {v5, v4, p2}, Lt/h;->i(ILs/e;Lt/b$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 643
    .line 644
    .line 645
    goto :goto_5

    .line 646
    :catchall_0
    move-exception p0

    .line 647
    throw p0

    .line 648
    :cond_1e
    invoke-virtual {p1}, Ls/e;->o0()V

    .line 649
    .line 650
    .line 651
    return-void
.end method
