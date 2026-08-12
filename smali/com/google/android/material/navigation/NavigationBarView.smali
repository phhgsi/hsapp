.class public abstract Lcom/google/android/material/navigation/NavigationBarView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationBarView$c;,
        Lcom/google/android/material/navigation/NavigationBarView$b;,
        Lcom/google/android/material/navigation/NavigationBarView$SavedState;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/material/navigation/h;

.field private final b:Lcom/google/android/material/navigation/k;

.field private final c:Lcom/google/android/material/navigation/NavigationBarPresenter;

.field private d:Landroid/view/MenuInflater;

.field private e:Lcom/google/android/material/navigation/NavigationBarView$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 10

    .line 1
    invoke-static {p1, p2, p3, p4}, Lc1/a;->d(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/google/android/material/navigation/NavigationBarPresenter;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v2, LF0/k;->J4:[I

    .line 20
    .line 21
    sget v6, LF0/k;->b5:I

    .line 22
    .line 23
    sget v7, LF0/k;->Z4:I

    .line 24
    .line 25
    filled-new-array {v6, v7}, [I

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    move-object v1, p2

    .line 30
    move v3, p3

    .line 31
    move v4, p4

    .line 32
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/q;->j(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroidx/appcompat/widget/e0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p3, Lcom/google/android/material/navigation/h;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getMaxItemCount()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-direct {p3, v0, p4, v2, v5}, Lcom/google/android/material/navigation/h;-><init>(Landroid/content/Context;Ljava/lang/Class;IZ)V

    .line 51
    .line 52
    .line 53
    iput-object p3, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationBarView;->c(Landroid/content/Context;)Lcom/google/android/material/navigation/k;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    iput-object p4, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p4, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getCollapsedMaxItemCount()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p4, v2}, Lcom/google/android/material/navigation/k;->setCollapsedMaxItemCount(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p4}, Lcom/google/android/material/navigation/NavigationBarPresenter;->e(Lcom/google/android/material/navigation/k;)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-virtual {p1, v2}, Lcom/google/android/material/navigation/NavigationBarPresenter;->c(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4, p1}, Lcom/google/android/material/navigation/k;->setPresenter(Lcom/google/android/material/navigation/NavigationBarPresenter;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p1}, Landroidx/appcompat/view/menu/e;->b(Landroidx/appcompat/view/menu/j;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {p1, v5, p3}, Lcom/google/android/material/navigation/NavigationBarPresenter;->d(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    .line 93
    .line 94
    .line 95
    sget p1, LF0/k;->V4:I

    .line 96
    .line 97
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_0

    .line 102
    .line 103
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->c(I)Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p4, p1}, Lcom/google/android/material/navigation/k;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    const p1, 0x1010038

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, p1}, Lcom/google/android/material/navigation/k;->e(I)Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p4, p1}, Lcom/google/android/material/navigation/k;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    sget p1, LF0/k;->U4:I

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    sget v8, LF0/c;->r0:I

    .line 128
    .line 129
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemIconSize(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v6}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    const/4 v5, 0x0

    .line 145
    if-eqz p1, :cond_1

    .line 146
    .line 147
    invoke-virtual {p2, v6, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextAppearanceInactive(I)V

    .line 152
    .line 153
    .line 154
    :cond_1
    invoke-virtual {p2, v7}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_2

    .line 159
    .line 160
    invoke-virtual {p2, v7, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextAppearanceActive(I)V

    .line 165
    .line 166
    .line 167
    :cond_2
    sget p1, LF0/k;->O4:I

    .line 168
    .line 169
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_3

    .line 174
    .line 175
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setHorizontalItemTextAppearanceInactive(I)V

    .line 180
    .line 181
    .line 182
    :cond_3
    sget p1, LF0/k;->N4:I

    .line 183
    .line 184
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_4

    .line 189
    .line 190
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setHorizontalItemTextAppearanceActive(I)V

    .line 195
    .line 196
    .line 197
    :cond_4
    sget p1, LF0/k;->a5:I

    .line 198
    .line 199
    invoke-virtual {p2, p1, v2}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 204
    .line 205
    .line 206
    sget p1, LF0/k;->c5:I

    .line 207
    .line 208
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_5

    .line 213
    .line 214
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->c(I)Landroid/content/res/ColorStateList;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 219
    .line 220
    .line 221
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-static {p1}, Lcom/google/android/material/drawable/d;->f(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    if-eqz p1, :cond_6

    .line 230
    .line 231
    if-eqz v6, :cond_8

    .line 232
    .line 233
    :cond_6
    invoke-static {v0, v1, v3, v4}, LZ0/l;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)LZ0/l$b;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1}, LZ0/l$b;->m()LZ0/l;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    new-instance v1, LZ0/h;

    .line 242
    .line 243
    invoke-direct {v1, p1}, LZ0/h;-><init>(LZ0/l;)V

    .line 244
    .line 245
    .line 246
    if-eqz v6, :cond_7

    .line 247
    .line 248
    invoke-virtual {v1, v6}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 249
    .line 250
    .line 251
    :cond_7
    invoke-virtual {v1, v0}, LZ0/h;->Q(Landroid/content/Context;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 255
    .line 256
    .line 257
    :cond_8
    sget p1, LF0/k;->X4:I

    .line 258
    .line 259
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemPaddingTop(I)V

    .line 270
    .line 271
    .line 272
    :cond_9
    sget p1, LF0/k;->W4:I

    .line 273
    .line 274
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_a

    .line 279
    .line 280
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemPaddingBottom(I)V

    .line 285
    .line 286
    .line 287
    :cond_a
    sget p1, LF0/k;->K4:I

    .line 288
    .line 289
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_b

    .line 294
    .line 295
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setActiveIndicatorLabelPadding(I)V

    .line 300
    .line 301
    .line 302
    :cond_b
    sget p1, LF0/k;->P4:I

    .line 303
    .line 304
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_c

    .line 309
    .line 310
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setIconLabelHorizontalSpacing(I)V

    .line 315
    .line 316
    .line 317
    :cond_c
    sget p1, LF0/k;->M4:I

    .line 318
    .line 319
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_d

    .line 324
    .line 325
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->f(II)I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    int-to-float p1, p1

    .line 330
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setElevation(F)V

    .line 331
    .line 332
    .line 333
    :cond_d
    sget p1, LF0/k;->L4:I

    .line 334
    .line 335
    invoke-static {v0, p2, p1}, LW0/c;->b(Landroid/content/Context;Landroidx/appcompat/widget/e0;I)Landroid/content/res/ColorStateList;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 348
    .line 349
    .line 350
    sget p1, LF0/k;->f5:I

    .line 351
    .line 352
    const/4 v1, -0x1

    .line 353
    invoke-virtual {p2, p1, v1}, Landroidx/appcompat/widget/e0;->l(II)I

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setLabelVisibilityMode(I)V

    .line 358
    .line 359
    .line 360
    sget p1, LF0/k;->T4:I

    .line 361
    .line 362
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->l(II)I

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemIconGravity(I)V

    .line 367
    .line 368
    .line 369
    sget p1, LF0/k;->S4:I

    .line 370
    .line 371
    const/16 v3, 0x31

    .line 372
    .line 373
    invoke-virtual {p2, p1, v3}, Landroidx/appcompat/widget/e0;->l(II)I

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemGravity(I)V

    .line 378
    .line 379
    .line 380
    sget p1, LF0/k;->R4:I

    .line 381
    .line 382
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    if-eqz p1, :cond_e

    .line 387
    .line 388
    invoke-virtual {p4, p1}, Lcom/google/android/material/navigation/k;->setItemBackgroundRes(I)V

    .line 389
    .line 390
    .line 391
    goto :goto_1

    .line 392
    :cond_e
    sget p1, LF0/k;->Y4:I

    .line 393
    .line 394
    invoke-static {v0, p2, p1}, LW0/c;->b(Landroid/content/Context;Landroidx/appcompat/widget/e0;I)Landroid/content/res/ColorStateList;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 399
    .line 400
    .line 401
    :goto_1
    sget p1, LF0/k;->g5:I

    .line 402
    .line 403
    invoke-virtual {p2, p1, v2}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setMeasureBottomPaddingFromLabelBaseline(Z)V

    .line 408
    .line 409
    .line 410
    sget p1, LF0/k;->d5:I

    .line 411
    .line 412
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->a(IZ)Z

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setLabelFontScalingEnabled(Z)V

    .line 417
    .line 418
    .line 419
    sget p1, LF0/k;->e5:I

    .line 420
    .line 421
    invoke-virtual {p2, p1, v2}, Landroidx/appcompat/widget/e0;->l(II)I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setLabelMaxLines(I)V

    .line 426
    .line 427
    .line 428
    sget p1, LF0/k;->Q4:I

    .line 429
    .line 430
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-eqz p1, :cond_14

    .line 435
    .line 436
    invoke-virtual {p0, v2}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorEnabled(Z)V

    .line 437
    .line 438
    .line 439
    sget-object v3, LF0/k;->w4:[I

    .line 440
    .line 441
    invoke-virtual {v0, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    sget v3, LF0/k;->y4:I

    .line 446
    .line 447
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorWidth(I)V

    .line 452
    .line 453
    .line 454
    sget v4, LF0/k;->x4:I

    .line 455
    .line 456
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    invoke-virtual {p0, v4}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorHeight(I)V

    .line 461
    .line 462
    .line 463
    sget v4, LF0/k;->H4:I

    .line 464
    .line 465
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    invoke-virtual {p0, v4}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 470
    .line 471
    .line 472
    sget v6, LF0/k;->G4:I

    .line 473
    .line 474
    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    const/4 v8, -0x2

    .line 479
    if-eqz v7, :cond_10

    .line 480
    .line 481
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v9

    .line 489
    if-eqz v9, :cond_f

    .line 490
    .line 491
    goto :goto_2

    .line 492
    :cond_f
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-eqz v1, :cond_11

    .line 501
    .line 502
    :cond_10
    move v1, v8

    .line 503
    goto :goto_2

    .line 504
    :cond_11
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    :goto_2
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorExpandedWidth(I)V

    .line 509
    .line 510
    .line 511
    sget v1, LF0/k;->E4:I

    .line 512
    .line 513
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorExpandedHeight(I)V

    .line 518
    .line 519
    .line 520
    sget v1, LF0/k;->F4:I

    .line 521
    .line 522
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorExpandedMarginHorizontal(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    sget v3, LF0/c;->E:I

    .line 534
    .line 535
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    sget v3, LF0/k;->C4:I

    .line 540
    .line 541
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    sget v4, LF0/k;->B4:I

    .line 546
    .line 547
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-ne v4, v2, :cond_12

    .line 556
    .line 557
    move v4, v1

    .line 558
    goto :goto_3

    .line 559
    :cond_12
    move v4, v3

    .line 560
    :goto_3
    sget v6, LF0/k;->D4:I

    .line 561
    .line 562
    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    if-ne v7, v2, :cond_13

    .line 571
    .line 572
    goto :goto_4

    .line 573
    :cond_13
    move v3, v1

    .line 574
    :goto_4
    sget v1, LF0/k;->A4:I

    .line 575
    .line 576
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    invoke-virtual {p0, v4, v6, v3, v1}, Lcom/google/android/material/navigation/NavigationBarView;->f(IIII)V

    .line 581
    .line 582
    .line 583
    sget v1, LF0/k;->z4:I

    .line 584
    .line 585
    invoke-static {v0, p1, v1}, LW0/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 590
    .line 591
    .line 592
    sget v1, LF0/k;->I4:I

    .line 593
    .line 594
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    invoke-static {v0, v1, v5}, LZ0/l;->b(Landroid/content/Context;II)LZ0/l$b;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0}, LZ0/l$b;->m()LZ0/l;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorShapeAppearance(LZ0/l;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 610
    .line 611
    .line 612
    :cond_14
    sget p1, LF0/k;->h5:I

    .line 613
    .line 614
    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/e0;->s(I)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_15

    .line 619
    .line 620
    invoke-virtual {p2, p1, v5}, Landroidx/appcompat/widget/e0;->n(II)I

    .line 621
    .line 622
    .line 623
    move-result p1

    .line 624
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->d(I)V

    .line 625
    .line 626
    .line 627
    :cond_15
    invoke-virtual {p2}, Landroidx/appcompat/widget/e0;->x()V

    .line 628
    .line 629
    .line 630
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->g()Z

    .line 631
    .line 632
    .line 633
    move-result p1

    .line 634
    if-nez p1, :cond_16

    .line 635
    .line 636
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 637
    .line 638
    .line 639
    :cond_16
    new-instance p1, Lcom/google/android/material/navigation/NavigationBarView$a;

    .line 640
    .line 641
    invoke-direct {p1, p0}, Lcom/google/android/material/navigation/NavigationBarView$a;-><init>(Lcom/google/android/material/navigation/NavigationBarView;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p3, p1}, Landroidx/appcompat/view/menu/e;->W(Landroidx/appcompat/view/menu/e$a;)V

    .line 645
    .line 646
    .line 647
    return-void
.end method

.method static synthetic a(Lcom/google/android/material/navigation/NavigationBarView;)Lcom/google/android/material/navigation/NavigationBarView$b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lcom/google/android/material/navigation/NavigationBarView;)Lcom/google/android/material/navigation/NavigationBarView$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationBarView;->e:Lcom/google/android/material/navigation/NavigationBarView$c;

    .line 2
    .line 3
    return-object p0
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->d:Landroid/view/MenuInflater;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/view/g;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/appcompat/view/g;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->d:Landroid/view/MenuInflater;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->d:Landroid/view/MenuInflater;

    .line 17
    .line 18
    return-object v0
.end method

.method private setMeasureBottomPaddingFromLabelBaseline(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setMeasurePaddingFromLabelBaseline(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected abstract c(Landroid/content/Context;)Lcom/google/android/material/navigation/k;
.end method

.method public d(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationBarPresenter;->g(Z)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenuInflater()Landroid/view/MenuInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 12
    .line 13
    invoke-virtual {v0, p1, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarPresenter;->g(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Lcom/google/android/material/navigation/NavigationBarPresenter;->i(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method protected e()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public f(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/material/navigation/k;->o(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getActiveIndicatorLabelPadding()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getCollapsedMaxItemCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getMaxItemCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getHorizontalItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getHorizontalItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getHorizontalItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getHorizontalItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getIconLabelHorizontalSpacing()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getIconLabelHorizontalSpacing()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorExpandedHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorExpandedHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorExpandedMarginHorizontal()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorExpandedMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorExpandedWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorExpandedWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()LZ0/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorShapeAppearance()LZ0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemActiveIndicatorWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemBackgroundResource()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemBackgroundRes()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemIconGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemIconSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getIconTintList()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemPaddingBottom()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemRippleColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemTextColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract getMaxItemCount()I
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMenuView()Landroidx/appcompat/view/menu/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMenuViewGroup()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPresenter()Lcom/google/android/material/navigation/NavigationBarPresenter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScaleLabelTextWithFont()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getScaleLabelTextWithFont()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getSelectedItemId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, LZ0/i;->e(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->f:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->T(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationBarView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->f:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/e;->V(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setActiveIndicatorLabelPadding(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, LZ0/i;->d(Landroid/view/View;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setHorizontalItemTextAppearanceActive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setHorizontalItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHorizontalItemTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setHorizontalItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIconLabelHorizontalSpacing(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setIconLabelHorizontalSpacing(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorExpandedHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedMarginHorizontal(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorExpandedMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorExpandedWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(LZ0/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorShapeAppearance(LZ0/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemActiveIndicatorWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemBackgroundRes(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemGravity(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemGravity(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarPresenter;->i(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setItemIconGravity(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getItemIconGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemIconGravity(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarPresenter;->i(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemIconSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSizeRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemIconSize(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemPaddingBottom(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemPaddingTop(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelFontScalingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setLabelFontScalingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setLabelMaxLines(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/navigation/k;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setLabelVisibilityMode(I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarPresenter;->i(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setOnItemReselectedListener(Lcom/google/android/material/navigation/NavigationBarView$b;)V
    .locals 0

    return-void
.end method

.method public setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarView;->e:Lcom/google/android/material/navigation/NavigationBarView$c;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedItemId(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->a:Lcom/google/android/material/navigation/h;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarView;->c:Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, p1, v1, v2}, Landroidx/appcompat/view/menu/e;->P(Landroid/view/MenuItem;Landroidx/appcompat/view/menu/j;I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p1}, Landroid/view/MenuItem;->isCheckable()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarView;->b:Lcom/google/android/material/navigation/k;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
