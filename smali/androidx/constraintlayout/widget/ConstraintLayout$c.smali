.class Landroidx/constraintlayout/widget/ConstraintLayout$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
.end method

.method private d(III)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/high16 v2, 0x40000000    # 2.0f

    .line 21
    .line 22
    if-ne p1, v2, :cond_2

    .line 23
    .line 24
    const/high16 p1, -0x80000000

    .line 25
    .line 26
    if-eq v1, p1, :cond_1

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    :cond_1
    if-ne p3, p2, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    return p1
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

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
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-static {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    :goto_1
    if-ge v1, v0, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-static {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Landroidx/constraintlayout/widget/c;

    .line 44
    .line 45
    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/widget/c;->l(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
.end method

.method public final b(Ls/e;Lt/b$a;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_e

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Ls/e;->S()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Ls/e;->g0()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iput v5, v2, Lt/b$a;->e:I

    .line 27
    .line 28
    iput v5, v2, Lt/b$a;->f:I

    .line 29
    .line 30
    iput v5, v2, Lt/b$a;->g:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {v1}, Ls/e;->K()Ls/e;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_e

    .line 40
    .line 41
    :cond_2
    iget-object v3, v2, Lt/b$a;->a:Ls/e$b;

    .line 42
    .line 43
    iget-object v4, v2, Lt/b$a;->b:Ls/e$b;

    .line 44
    .line 45
    iget v6, v2, Lt/b$a;->c:I

    .line 46
    .line 47
    iget v7, v2, Lt/b$a;->d:I

    .line 48
    .line 49
    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->b:I

    .line 50
    .line 51
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->c:I

    .line 52
    .line 53
    add-int/2addr v8, v9

    .line 54
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    .line 55
    .line 56
    invoke-virtual {v1}, Ls/e;->s()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    check-cast v10, Landroid/view/View;

    .line 61
    .line 62
    sget-object v11, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:[I

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    aget v12, v11, v12

    .line 69
    .line 70
    const/4 v13, 0x4

    .line 71
    const/4 v14, 0x3

    .line 72
    const/4 v15, 0x2

    .line 73
    const/4 v5, 0x1

    .line 74
    if-eq v12, v5, :cond_b

    .line 75
    .line 76
    if-eq v12, v15, :cond_a

    .line 77
    .line 78
    if-eq v12, v14, :cond_9

    .line 79
    .line 80
    if-eq v12, v13, :cond_3

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    .line 85
    .line 86
    const/4 v12, -0x2

    .line 87
    invoke-static {v6, v9, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    iget v9, v1, Ls/e;->v:I

    .line 92
    .line 93
    if-ne v9, v5, :cond_4

    .line 94
    .line 95
    move v9, v5

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    const/4 v9, 0x0

    .line 98
    :goto_0
    iget v12, v2, Lt/b$a;->j:I

    .line 99
    .line 100
    sget v13, Lt/b$a;->l:I

    .line 101
    .line 102
    if-eq v12, v13, :cond_5

    .line 103
    .line 104
    sget v13, Lt/b$a;->m:I

    .line 105
    .line 106
    if-ne v12, v13, :cond_c

    .line 107
    .line 108
    :cond_5
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    invoke-virtual {v1}, Ls/e;->x()I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-ne v12, v13, :cond_6

    .line 117
    .line 118
    move v12, v5

    .line 119
    goto :goto_1

    .line 120
    :cond_6
    const/4 v12, 0x0

    .line 121
    :goto_1
    iget v13, v2, Lt/b$a;->j:I

    .line 122
    .line 123
    sget v14, Lt/b$a;->m:I

    .line 124
    .line 125
    if-eq v13, v14, :cond_8

    .line 126
    .line 127
    if-eqz v9, :cond_8

    .line 128
    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    if-nez v12, :cond_8

    .line 132
    .line 133
    :cond_7
    invoke-virtual {v1}, Ls/e;->k0()Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_c

    .line 138
    .line 139
    :cond_8
    invoke-virtual {v1}, Ls/e;->T()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/high16 v12, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-static {v6, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    goto :goto_2

    .line 150
    :cond_9
    const/high16 v12, 0x40000000    # 2.0f

    .line 151
    .line 152
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    .line 153
    .line 154
    invoke-virtual {v1}, Ls/e;->B()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    add-int/2addr v9, v13

    .line 159
    const/4 v13, -0x1

    .line 160
    invoke-static {v6, v9, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    goto :goto_2

    .line 165
    :cond_a
    const/high16 v12, 0x40000000    # 2.0f

    .line 166
    .line 167
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    .line 168
    .line 169
    const/4 v13, -0x2

    .line 170
    invoke-static {v6, v9, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    goto :goto_2

    .line 175
    :cond_b
    const/high16 v12, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-static {v6, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    :cond_c
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    aget v9, v11, v9

    .line 186
    .line 187
    if-eq v9, v5, :cond_15

    .line 188
    .line 189
    if-eq v9, v15, :cond_14

    .line 190
    .line 191
    const/4 v7, 0x3

    .line 192
    if-eq v9, v7, :cond_13

    .line 193
    .line 194
    const/4 v7, 0x4

    .line 195
    if-eq v9, v7, :cond_d

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    goto :goto_5

    .line 199
    :cond_d
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    .line 200
    .line 201
    const/4 v13, -0x2

    .line 202
    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    iget v8, v1, Ls/e;->w:I

    .line 207
    .line 208
    if-ne v8, v5, :cond_e

    .line 209
    .line 210
    move v8, v5

    .line 211
    goto :goto_3

    .line 212
    :cond_e
    const/4 v8, 0x0

    .line 213
    :goto_3
    iget v9, v2, Lt/b$a;->j:I

    .line 214
    .line 215
    sget v11, Lt/b$a;->l:I

    .line 216
    .line 217
    if-eq v9, v11, :cond_f

    .line 218
    .line 219
    sget v11, Lt/b$a;->m:I

    .line 220
    .line 221
    if-ne v9, v11, :cond_16

    .line 222
    .line 223
    :cond_f
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    invoke-virtual {v1}, Ls/e;->T()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-ne v9, v11, :cond_10

    .line 232
    .line 233
    move v9, v5

    .line 234
    goto :goto_4

    .line 235
    :cond_10
    const/4 v9, 0x0

    .line 236
    :goto_4
    iget v11, v2, Lt/b$a;->j:I

    .line 237
    .line 238
    sget v12, Lt/b$a;->m:I

    .line 239
    .line 240
    if-eq v11, v12, :cond_12

    .line 241
    .line 242
    if-eqz v8, :cond_12

    .line 243
    .line 244
    if-eqz v8, :cond_11

    .line 245
    .line 246
    if-nez v9, :cond_12

    .line 247
    .line 248
    :cond_11
    invoke-virtual {v1}, Ls/e;->l0()Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_16

    .line 253
    .line 254
    :cond_12
    invoke-virtual {v1}, Ls/e;->x()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    const/high16 v12, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    goto :goto_5

    .line 265
    :cond_13
    const/high16 v12, 0x40000000    # 2.0f

    .line 266
    .line 267
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    .line 268
    .line 269
    invoke-virtual {v1}, Ls/e;->R()I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    add-int/2addr v8, v9

    .line 274
    const/4 v13, -0x1

    .line 275
    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    goto :goto_5

    .line 280
    :cond_14
    const/high16 v12, 0x40000000    # 2.0f

    .line 281
    .line 282
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    .line 283
    .line 284
    const/4 v13, -0x2

    .line 285
    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    goto :goto_5

    .line 290
    :cond_15
    const/high16 v12, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    :cond_16
    :goto_5
    invoke-virtual {v1}, Ls/e;->K()Ls/e;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    check-cast v8, Ls/f;

    .line 301
    .line 302
    if-eqz v8, :cond_17

    .line 303
    .line 304
    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 305
    .line 306
    invoke-static {v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    const/16 v11, 0x100

    .line 311
    .line 312
    invoke-static {v9, v11}, Ls/k;->b(II)Z

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    if-eqz v9, :cond_17

    .line 317
    .line 318
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    invoke-virtual {v1}, Ls/e;->T()I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    if-ne v9, v11, :cond_17

    .line 327
    .line 328
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    invoke-virtual {v8}, Ls/e;->T()I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    if-ge v9, v11, :cond_17

    .line 337
    .line 338
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    invoke-virtual {v1}, Ls/e;->x()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-ne v9, v11, :cond_17

    .line 347
    .line 348
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    invoke-virtual {v8}, Ls/e;->x()I

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    if-ge v9, v8, :cond_17

    .line 357
    .line 358
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    invoke-virtual {v1}, Ls/e;->p()I

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    if-ne v8, v9, :cond_17

    .line 367
    .line 368
    invoke-virtual {v1}, Ls/e;->j0()Z

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    if-nez v8, :cond_17

    .line 373
    .line 374
    invoke-virtual {v1}, Ls/e;->C()I

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    invoke-virtual {v1}, Ls/e;->T()I

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    invoke-direct {v0, v8, v6, v9}, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d(III)Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-eqz v8, :cond_17

    .line 387
    .line 388
    invoke-virtual {v1}, Ls/e;->D()I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    invoke-virtual {v1}, Ls/e;->x()I

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    invoke-direct {v0, v8, v7, v9}, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d(III)Z

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    if-eqz v8, :cond_17

    .line 401
    .line 402
    invoke-virtual {v1}, Ls/e;->T()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    iput v3, v2, Lt/b$a;->e:I

    .line 407
    .line 408
    invoke-virtual {v1}, Ls/e;->x()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    iput v3, v2, Lt/b$a;->f:I

    .line 413
    .line 414
    invoke-virtual {v1}, Ls/e;->p()I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    iput v1, v2, Lt/b$a;->g:I

    .line 419
    .line 420
    return-void

    .line 421
    :cond_17
    sget-object v8, Ls/e$b;->f:Ls/e$b;

    .line 422
    .line 423
    if-ne v3, v8, :cond_18

    .line 424
    .line 425
    move v9, v5

    .line 426
    goto :goto_6

    .line 427
    :cond_18
    const/4 v9, 0x0

    .line 428
    :goto_6
    if-ne v4, v8, :cond_19

    .line 429
    .line 430
    move v8, v5

    .line 431
    goto :goto_7

    .line 432
    :cond_19
    const/4 v8, 0x0

    .line 433
    :goto_7
    sget-object v11, Ls/e$b;->g:Ls/e$b;

    .line 434
    .line 435
    if-eq v4, v11, :cond_1b

    .line 436
    .line 437
    sget-object v12, Ls/e$b;->d:Ls/e$b;

    .line 438
    .line 439
    if-ne v4, v12, :cond_1a

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_1a
    const/4 v4, 0x0

    .line 443
    goto :goto_9

    .line 444
    :cond_1b
    :goto_8
    move v4, v5

    .line 445
    :goto_9
    if-eq v3, v11, :cond_1d

    .line 446
    .line 447
    sget-object v11, Ls/e$b;->d:Ls/e$b;

    .line 448
    .line 449
    if-ne v3, v11, :cond_1c

    .line 450
    .line 451
    goto :goto_a

    .line 452
    :cond_1c
    const/4 v3, 0x0

    .line 453
    goto :goto_b

    .line 454
    :cond_1d
    :goto_a
    move v3, v5

    .line 455
    :goto_b
    const/4 v11, 0x0

    .line 456
    if-eqz v9, :cond_1e

    .line 457
    .line 458
    iget v12, v1, Ls/e;->c0:F

    .line 459
    .line 460
    cmpl-float v12, v12, v11

    .line 461
    .line 462
    if-lez v12, :cond_1e

    .line 463
    .line 464
    move v12, v5

    .line 465
    goto :goto_c

    .line 466
    :cond_1e
    const/4 v12, 0x0

    .line 467
    :goto_c
    if-eqz v8, :cond_1f

    .line 468
    .line 469
    iget v13, v1, Ls/e;->c0:F

    .line 470
    .line 471
    cmpl-float v11, v13, v11

    .line 472
    .line 473
    if-lez v11, :cond_1f

    .line 474
    .line 475
    move v11, v5

    .line 476
    goto :goto_d

    .line 477
    :cond_1f
    const/4 v11, 0x0

    .line 478
    :goto_d
    if-nez v10, :cond_20

    .line 479
    .line 480
    :goto_e
    return-void

    .line 481
    :cond_20
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 482
    .line 483
    .line 484
    move-result-object v13

    .line 485
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 486
    .line 487
    iget v14, v2, Lt/b$a;->j:I

    .line 488
    .line 489
    sget v15, Lt/b$a;->l:I

    .line 490
    .line 491
    if-eq v14, v15, :cond_22

    .line 492
    .line 493
    sget v15, Lt/b$a;->m:I

    .line 494
    .line 495
    if-eq v14, v15, :cond_22

    .line 496
    .line 497
    if-eqz v9, :cond_22

    .line 498
    .line 499
    iget v9, v1, Ls/e;->v:I

    .line 500
    .line 501
    if-nez v9, :cond_22

    .line 502
    .line 503
    if-eqz v8, :cond_22

    .line 504
    .line 505
    iget v8, v1, Ls/e;->w:I

    .line 506
    .line 507
    if-eqz v8, :cond_21

    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_21
    const/4 v0, -0x1

    .line 511
    const/4 v5, 0x0

    .line 512
    const/4 v14, 0x0

    .line 513
    const/4 v15, 0x0

    .line 514
    goto/16 :goto_17

    .line 515
    .line 516
    :cond_22
    :goto_f
    instance-of v8, v10, Landroidx/constraintlayout/widget/k;

    .line 517
    .line 518
    if-eqz v8, :cond_23

    .line 519
    .line 520
    instance-of v8, v1, Ls/l;

    .line 521
    .line 522
    if-eqz v8, :cond_23

    .line 523
    .line 524
    move-object v8, v1

    .line 525
    check-cast v8, Ls/l;

    .line 526
    .line 527
    move-object v9, v10

    .line 528
    check-cast v9, Landroidx/constraintlayout/widget/k;

    .line 529
    .line 530
    invoke-virtual {v9, v8, v6, v7}, Landroidx/constraintlayout/widget/k;->p(Ls/l;II)V

    .line 531
    .line 532
    .line 533
    goto :goto_10

    .line 534
    :cond_23
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    .line 535
    .line 536
    .line 537
    :goto_10
    invoke-virtual {v1, v6, v7}, Ls/e;->P0(II)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 541
    .line 542
    .line 543
    move-result v8

    .line 544
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 545
    .line 546
    .line 547
    move-result v9

    .line 548
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 549
    .line 550
    .line 551
    move-result v14

    .line 552
    iget v15, v1, Ls/e;->y:I

    .line 553
    .line 554
    if-lez v15, :cond_24

    .line 555
    .line 556
    invoke-static {v15, v8}, Ljava/lang/Math;->max(II)I

    .line 557
    .line 558
    .line 559
    move-result v15

    .line 560
    goto :goto_11

    .line 561
    :cond_24
    move v15, v8

    .line 562
    :goto_11
    iget v5, v1, Ls/e;->z:I

    .line 563
    .line 564
    if-lez v5, :cond_25

    .line 565
    .line 566
    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    .line 567
    .line 568
    .line 569
    move-result v15

    .line 570
    :cond_25
    iget v5, v1, Ls/e;->B:I

    .line 571
    .line 572
    if-lez v5, :cond_26

    .line 573
    .line 574
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    :goto_12
    move/from16 v16, v3

    .line 579
    .line 580
    goto :goto_13

    .line 581
    :cond_26
    move v5, v9

    .line 582
    goto :goto_12

    .line 583
    :goto_13
    iget v3, v1, Ls/e;->C:I

    .line 584
    .line 585
    if-lez v3, :cond_27

    .line 586
    .line 587
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    :cond_27
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 592
    .line 593
    invoke-static {v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    const/4 v0, 0x1

    .line 598
    invoke-static {v3, v0}, Ls/k;->b(II)Z

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    if-nez v3, :cond_29

    .line 603
    .line 604
    const/high16 v0, 0x3f000000    # 0.5f

    .line 605
    .line 606
    if-eqz v12, :cond_28

    .line 607
    .line 608
    if-eqz v4, :cond_28

    .line 609
    .line 610
    iget v3, v1, Ls/e;->c0:F

    .line 611
    .line 612
    int-to-float v4, v5

    .line 613
    mul-float/2addr v4, v3

    .line 614
    add-float/2addr v4, v0

    .line 615
    float-to-int v15, v4

    .line 616
    goto :goto_14

    .line 617
    :cond_28
    if-eqz v11, :cond_29

    .line 618
    .line 619
    if-eqz v16, :cond_29

    .line 620
    .line 621
    iget v3, v1, Ls/e;->c0:F

    .line 622
    .line 623
    int-to-float v4, v15

    .line 624
    div-float/2addr v4, v3

    .line 625
    add-float/2addr v4, v0

    .line 626
    float-to-int v5, v4

    .line 627
    :cond_29
    :goto_14
    if-ne v8, v15, :cond_2b

    .line 628
    .line 629
    if-eq v9, v5, :cond_2a

    .line 630
    .line 631
    goto :goto_16

    .line 632
    :cond_2a
    :goto_15
    const/4 v0, -0x1

    .line 633
    goto :goto_17

    .line 634
    :cond_2b
    :goto_16
    const/high16 v12, 0x40000000    # 2.0f

    .line 635
    .line 636
    if-eq v8, v15, :cond_2c

    .line 637
    .line 638
    invoke-static {v15, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    :cond_2c
    if-eq v9, v5, :cond_2d

    .line 643
    .line 644
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 645
    .line 646
    .line 647
    move-result v7

    .line 648
    :cond_2d
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v6, v7}, Ls/e;->P0(II)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 655
    .line 656
    .line 657
    move-result v15

    .line 658
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 659
    .line 660
    .line 661
    move-result v5

    .line 662
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 663
    .line 664
    .line 665
    move-result v14

    .line 666
    goto :goto_15

    .line 667
    :goto_17
    if-eq v14, v0, :cond_2e

    .line 668
    .line 669
    const/4 v0, 0x1

    .line 670
    goto :goto_18

    .line 671
    :cond_2e
    const/4 v0, 0x0

    .line 672
    :goto_18
    iget v3, v2, Lt/b$a;->c:I

    .line 673
    .line 674
    if-ne v15, v3, :cond_30

    .line 675
    .line 676
    iget v3, v2, Lt/b$a;->d:I

    .line 677
    .line 678
    if-eq v5, v3, :cond_2f

    .line 679
    .line 680
    goto :goto_19

    .line 681
    :cond_2f
    const/4 v3, 0x0

    .line 682
    goto :goto_1a

    .line 683
    :cond_30
    :goto_19
    const/4 v3, 0x1

    .line 684
    :goto_1a
    iput-boolean v3, v2, Lt/b$a;->i:Z

    .line 685
    .line 686
    iget-boolean v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f0:Z

    .line 687
    .line 688
    if-eqz v3, :cond_31

    .line 689
    .line 690
    const/4 v0, 0x1

    .line 691
    :cond_31
    if-eqz v0, :cond_32

    .line 692
    .line 693
    const/4 v13, -0x1

    .line 694
    if-eq v14, v13, :cond_32

    .line 695
    .line 696
    invoke-virtual {v1}, Ls/e;->p()I

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    if-eq v1, v14, :cond_32

    .line 701
    .line 702
    const/4 v1, 0x1

    .line 703
    iput-boolean v1, v2, Lt/b$a;->i:Z

    .line 704
    .line 705
    :cond_32
    iput v15, v2, Lt/b$a;->e:I

    .line 706
    .line 707
    iput v5, v2, Lt/b$a;->f:I

    .line 708
    .line 709
    iput-boolean v0, v2, Lt/b$a;->h:Z

    .line 710
    .line 711
    iput v14, v2, Lt/b$a;->g:I

    .line 712
    .line 713
    return-void
.end method

.method public c(IIIIII)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->b:I

    .line 2
    .line 3
    iput p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->c:I

    .line 4
    .line 5
    iput p5, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    .line 6
    .line 7
    iput p6, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->e:I

    .line 8
    .line 9
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    .line 10
    .line 11
    iput p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    .line 12
    .line 13
    return-void
.end method
