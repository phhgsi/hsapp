.class final Lm0/O0$a;
.super LP1/k;
.source "SourceFile"

# interfaces
.implements LW1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/O0;->b(Landroid/content/Context;Landroid/net/Uri;Lm0/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field h:Ljava/lang/Object;

.field i:Ljava/lang/Object;

.field j:Ljava/lang/Object;

.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:I

.field n:I

.field o:I

.field p:I

.field q:I

.field r:I

.field s:I

.field t:I

.field u:I

.field v:F

.field w:I

.field final synthetic x:Landroid/content/Context;

.field final synthetic y:Landroid/net/Uri;

.field final synthetic z:Lm0/s;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lm0/s;LN1/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/O0$a;->x:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/O0$a;->y:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Lm0/O0$a;->z:Lm0/s;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, LP1/k;-><init>(ILN1/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lf2/z;

    .line 2
    .line 3
    check-cast p2, LN1/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm0/O0$a;->n(Lf2/z;LN1/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final g(Ljava/lang/Object;LN1/e;)LN1/e;
    .locals 3

    .line 1
    new-instance p1, Lm0/O0$a;

    .line 2
    .line 3
    iget-object v0, p0, Lm0/O0$a;->x:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lm0/O0$a;->y:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v2, p0, Lm0/O0$a;->z:Lm0/s;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lm0/O0$a;-><init>(Landroid/content/Context;Landroid/net/Uri;Lm0/s;LN1/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, LO1/b;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Lm0/O0$a;->w:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v5, :cond_2

    .line 16
    .line 17
    if-eq v0, v4, :cond_1

    .line 18
    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    iget-object v0, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Exception;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    goto/16 :goto_a

    .line 31
    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget-object v0, v1, Lm0/O0$a;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/io/File;

    .line 43
    .line 44
    iget-object v0, v1, Lm0/O0$a;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/io/File;

    .line 47
    .line 48
    iget-object v0, v1, Lm0/O0$a;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Landroid/graphics/Bitmap;

    .line 51
    .line 52
    iget-object v0, v1, Lm0/O0$a;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget-object v0, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Landroid/content/ContentResolver;

    .line 59
    .line 60
    :try_start_0
    invoke-static/range {p1 .. p1}, LL1/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto/16 :goto_8

    .line 69
    .line 70
    :cond_2
    iget-object v0, v1, Lm0/O0$a;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Landroid/graphics/Bitmap;

    .line 73
    .line 74
    iget-object v0, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/content/ContentResolver;

    .line 77
    .line 78
    :try_start_1
    invoke-static/range {p1 .. p1}, LL1/n;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-static/range {p1 .. p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :try_start_2
    iget-object v0, v1, Lm0/O0$a;->x:Landroid/content/Context;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v7, v1, Lm0/O0$a;->y:Landroid/net/Uri;

    .line 92
    .line 93
    invoke-virtual {v0, v7}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 94
    .line 95
    .line 96
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    if-eqz v7, :cond_4

    .line 98
    .line 99
    :try_start_3
    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    :try_start_4
    invoke-static {v7, v6}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object v4, v0

    .line 109
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 110
    :catchall_1
    move-exception v0

    .line 111
    :try_start_6
    invoke-static {v7, v4}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_4
    move-object v8, v6

    .line 116
    :goto_0
    if-nez v8, :cond_6

    .line 117
    .line 118
    invoke-static {}, Lf2/M;->c()Lf2/q0;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    new-instance v7, Lm0/O0$a$a;

    .line 123
    .line 124
    iget-object v9, v1, Lm0/O0$a;->z:Lm0/s;

    .line 125
    .line 126
    invoke-direct {v7, v9, v6}, Lm0/O0$a$a;-><init>(Lm0/s;LN1/e;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v8}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v1, Lm0/O0$a;->i:Ljava/lang/Object;

    .line 140
    .line 141
    iput v5, v1, Lm0/O0$a;->w:I

    .line 142
    .line 143
    invoke-static {v4, v7, v1}, Lf2/f;->e(LN1/i;LW1/p;LN1/e;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v2, :cond_5

    .line 148
    .line 149
    goto/16 :goto_9

    .line 150
    .line 151
    :cond_5
    :goto_1
    sget-object v0, LL1/t;->a:LL1/t;

    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_6
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-le v9, v7, :cond_7

    .line 163
    .line 164
    move v10, v5

    .line 165
    goto :goto_2

    .line 166
    :cond_7
    const/4 v10, 0x0

    .line 167
    :goto_2
    if-eqz v10, :cond_8

    .line 168
    .line 169
    move v11, v7

    .line 170
    goto :goto_3

    .line 171
    :cond_8
    move v11, v9

    .line 172
    :goto_3
    if-eqz v10, :cond_9

    .line 173
    .line 174
    move v12, v9

    .line 175
    goto :goto_4

    .line 176
    :cond_9
    move v12, v7

    .line 177
    :goto_4
    const/high16 v13, 0x43f00000    # 480.0f

    .line 178
    .line 179
    int-to-float v14, v11

    .line 180
    div-float/2addr v13, v14

    .line 181
    int-to-float v14, v12

    .line 182
    mul-float/2addr v14, v13

    .line 183
    float-to-int v14, v14

    .line 184
    if-eqz v10, :cond_a

    .line 185
    .line 186
    const/16 v3, 0x1e0

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_a
    move v3, v14

    .line 190
    :goto_5
    if-eqz v10, :cond_b

    .line 191
    .line 192
    move v4, v14

    .line 193
    goto :goto_6

    .line 194
    :cond_b
    const/16 v4, 0x1e0

    .line 195
    .line 196
    :goto_6
    invoke-static {v8, v3, v4, v5}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    const-string v15, "createScaledBitmap(...)"

    .line 201
    .line 202
    invoke-static {v5, v15}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    if-nez v15, :cond_c

    .line 210
    .line 211
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 212
    .line 213
    .line 214
    :cond_c
    new-instance v15, Ljava/io/File;

    .line 215
    .line 216
    iget-object v6, v1, Lm0/O0$a;->x:Landroid/content/Context;

    .line 217
    .line 218
    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    move-object/from16 v16, v0

    .line 223
    .line 224
    const-string v0, "downloads"

    .line 225
    .line 226
    invoke-direct {v15, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_d

    .line 234
    .line 235
    invoke-virtual {v15}, Ljava/io/File;->mkdirs()Z

    .line 236
    .line 237
    .line 238
    :cond_d
    new-instance v0, Ljava/io/File;

    .line 239
    .line 240
    const-string v6, "temp_capture_image.jpg"

    .line 241
    .line 242
    invoke-direct {v0, v15, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    new-instance v6, Ljava/io/FileOutputStream;

    .line 246
    .line 247
    invoke-direct {v6, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 248
    .line 249
    .line 250
    move-object/from16 v17, v8

    .line 251
    .line 252
    :try_start_7
    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 253
    .line 254
    move-object/from16 v18, v15

    .line 255
    .line 256
    const/16 v15, 0x5a

    .line 257
    .line 258
    invoke-virtual {v5, v8, v15, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 259
    .line 260
    .line 261
    const/4 v8, 0x0

    .line 262
    :try_start_8
    invoke-static {v6, v8}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    invoke-static {}, Lf2/M;->c()Lf2/q0;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    new-instance v15, Lm0/O0$a$b;

    .line 270
    .line 271
    iget-object v8, v1, Lm0/O0$a;->z:Lm0/s;

    .line 272
    .line 273
    move-object/from16 v19, v5

    .line 274
    .line 275
    iget-object v5, v1, Lm0/O0$a;->x:Landroid/content/Context;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 276
    .line 277
    move-object/from16 v20, v2

    .line 278
    .line 279
    const/4 v2, 0x0

    .line 280
    :try_start_9
    invoke-direct {v15, v8, v5, v0, v2}, Lm0/O0$a$b;-><init>(Lm0/s;Landroid/content/Context;Ljava/io/File;LN1/e;)V

    .line 281
    .line 282
    .line 283
    invoke-static/range {v16 .. v16}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    iput-object v2, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-static/range {v17 .. v17}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    iput-object v2, v1, Lm0/O0$a;->i:Ljava/lang/Object;

    .line 294
    .line 295
    invoke-static/range {v19 .. v19}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    iput-object v2, v1, Lm0/O0$a;->j:Ljava/lang/Object;

    .line 300
    .line 301
    invoke-static/range {v18 .. v18}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iput-object v2, v1, Lm0/O0$a;->k:Ljava/lang/Object;

    .line 306
    .line 307
    invoke-static {v0}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iput-object v0, v1, Lm0/O0$a;->l:Ljava/lang/Object;

    .line 312
    .line 313
    iput v7, v1, Lm0/O0$a;->m:I

    .line 314
    .line 315
    iput v9, v1, Lm0/O0$a;->n:I

    .line 316
    .line 317
    iput v10, v1, Lm0/O0$a;->o:I

    .line 318
    .line 319
    iput v11, v1, Lm0/O0$a;->p:I

    .line 320
    .line 321
    iput v12, v1, Lm0/O0$a;->q:I

    .line 322
    .line 323
    iput v13, v1, Lm0/O0$a;->v:F

    .line 324
    .line 325
    const/16 v0, 0x1e0

    .line 326
    .line 327
    iput v0, v1, Lm0/O0$a;->r:I

    .line 328
    .line 329
    iput v14, v1, Lm0/O0$a;->s:I

    .line 330
    .line 331
    iput v3, v1, Lm0/O0$a;->t:I

    .line 332
    .line 333
    iput v4, v1, Lm0/O0$a;->u:I

    .line 334
    .line 335
    const/4 v0, 0x2

    .line 336
    iput v0, v1, Lm0/O0$a;->w:I

    .line 337
    .line 338
    invoke-static {v6, v15, v1}, Lf2/f;->e(LN1/i;LW1/p;LN1/e;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    .line 342
    move-object/from16 v2, v20

    .line 343
    .line 344
    if-ne v0, v2, :cond_e

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_e
    :goto_7
    :try_start_a
    check-cast v0, LL1/t;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :catch_1
    move-exception v0

    .line 351
    move-object/from16 v2, v20

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :catchall_2
    move-exception v0

    .line 355
    move-object v3, v0

    .line 356
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 357
    :catchall_3
    move-exception v0

    .line 358
    :try_start_c
    invoke-static {v6, v3}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 362
    :goto_8
    invoke-static {}, Lf2/M;->c()Lf2/q0;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    new-instance v4, Lm0/O0$a$c;

    .line 367
    .line 368
    iget-object v5, v1, Lm0/O0$a;->z:Lm0/s;

    .line 369
    .line 370
    const/4 v8, 0x0

    .line 371
    invoke-direct {v4, v5, v0, v8}, Lm0/O0$a$c;-><init>(Lm0/s;Ljava/lang/Exception;LN1/e;)V

    .line 372
    .line 373
    .line 374
    invoke-static {v0}, LP1/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iput-object v0, v1, Lm0/O0$a;->h:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v8, v1, Lm0/O0$a;->i:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v8, v1, Lm0/O0$a;->j:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v8, v1, Lm0/O0$a;->k:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v8, v1, Lm0/O0$a;->l:Ljava/lang/Object;

    .line 387
    .line 388
    const/4 v5, 0x3

    .line 389
    iput v5, v1, Lm0/O0$a;->w:I

    .line 390
    .line 391
    invoke-static {v3, v4, v1}, Lf2/f;->e(LN1/i;LW1/p;LN1/e;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-ne v0, v2, :cond_f

    .line 396
    .line 397
    :goto_9
    return-object v2

    .line 398
    :cond_f
    :goto_a
    check-cast v0, LL1/t;

    .line 399
    .line 400
    :goto_b
    sget-object v0, LL1/t;->a:LL1/t;

    .line 401
    .line 402
    return-object v0
.end method

.method public final n(Lf2/z;LN1/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lm0/O0$a;->g(Ljava/lang/Object;LN1/e;)LN1/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lm0/O0$a;

    .line 6
    .line 7
    sget-object p2, LL1/t;->a:LL1/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lm0/O0$a;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
