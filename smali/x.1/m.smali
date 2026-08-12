.class Lx/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/m$e;,
        Lx/m$c;,
        Lx/m$a;,
        Lx/m$b;,
        Lx/m$d;,
        Lx/m$f;,
        Lx/m$g;,
        Lx/m$h;,
        Lx/m$i;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/Notification$Builder;

.field private final c:Lx/l$e;

.field private d:Landroid/widget/RemoteViews;

.field private e:Landroid/widget/RemoteViews;

.field private final f:Ljava/util/List;

.field private final g:Landroid/os/Bundle;

.field private h:I

.field private i:Landroid/widget/RemoteViews;


# direct methods
.method constructor <init>(Lx/l$e;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx/m;->f:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lx/m;->g:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, Lx/m;->c:Lx/l$e;

    .line 19
    .line 20
    iget-object v0, p1, Lx/l$e;->a:Landroid/content/Context;

    .line 21
    .line 22
    iput-object v0, p0, Lx/m;->a:Landroid/content/Context;

    .line 23
    .line 24
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v2, 0x1a

    .line 27
    .line 28
    if-lt v1, v2, :cond_0

    .line 29
    .line 30
    iget-object v1, p1, Lx/l$e;->L:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lx/m$e;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v1, Landroid/app/Notification$Builder;

    .line 40
    .line 41
    iget-object v3, p1, Lx/l$e;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 47
    .line 48
    :goto_0
    iget-object v1, p1, Lx/l$e;->S:Landroid/app/Notification;

    .line 49
    .line 50
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 51
    .line 52
    iget-wide v4, v1, Landroid/app/Notification;->when:J

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v4, v1, Landroid/app/Notification;->icon:I

    .line 59
    .line 60
    iget v5, v1, Landroid/app/Notification;->iconLevel:I

    .line 61
    .line 62
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v4, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget-object v4, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 73
    .line 74
    iget-object v5, p1, Lx/l$e;->j:Landroid/widget/RemoteViews;

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-object v4, v1, Landroid/app/Notification;->vibrate:[J

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget v4, v1, Landroid/app/Notification;->ledARGB:I

    .line 87
    .line 88
    iget v5, v1, Landroid/app/Notification;->ledOnMS:I

    .line 89
    .line 90
    iget v6, v1, Landroid/app/Notification;->ledOffMS:I

    .line 91
    .line 92
    invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget v4, v1, Landroid/app/Notification;->flags:I

    .line 97
    .line 98
    const/4 v5, 0x2

    .line 99
    and-int/2addr v4, v5

    .line 100
    const/4 v6, 0x1

    .line 101
    const/4 v7, 0x0

    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    move v4, v6

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    move v4, v7

    .line 107
    :goto_1
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget v4, v1, Landroid/app/Notification;->flags:I

    .line 112
    .line 113
    and-int/lit8 v4, v4, 0x8

    .line 114
    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    move v4, v6

    .line 118
    goto :goto_2

    .line 119
    :cond_2
    move v4, v7

    .line 120
    :goto_2
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    iget v4, v1, Landroid/app/Notification;->flags:I

    .line 125
    .line 126
    and-int/lit8 v4, v4, 0x10

    .line 127
    .line 128
    if-eqz v4, :cond_3

    .line 129
    .line 130
    move v4, v6

    .line 131
    goto :goto_3

    .line 132
    :cond_3
    move v4, v7

    .line 133
    :goto_3
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget v4, v1, Landroid/app/Notification;->defaults:I

    .line 138
    .line 139
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-object v4, p1, Lx/l$e;->e:Ljava/lang/CharSequence;

    .line 144
    .line 145
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v4, p1, Lx/l$e;->f:Ljava/lang/CharSequence;

    .line 150
    .line 151
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-object v4, p1, Lx/l$e;->l:Ljava/lang/CharSequence;

    .line 156
    .line 157
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v4, p1, Lx/l$e;->h:Landroid/app/PendingIntent;

    .line 162
    .line 163
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-object v4, v1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 168
    .line 169
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget-object v4, p1, Lx/l$e;->i:Landroid/app/PendingIntent;

    .line 174
    .line 175
    iget v8, v1, Landroid/app/Notification;->flags:I

    .line 176
    .line 177
    and-int/lit16 v8, v8, 0x80

    .line 178
    .line 179
    if-eqz v8, :cond_4

    .line 180
    .line 181
    move v8, v6

    .line 182
    goto :goto_4

    .line 183
    :cond_4
    move v8, v7

    .line 184
    :goto_4
    invoke-virtual {v3, v4, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    iget v4, p1, Lx/l$e;->m:I

    .line 189
    .line 190
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    iget v4, p1, Lx/l$e;->u:I

    .line 195
    .line 196
    iget v8, p1, Lx/l$e;->v:I

    .line 197
    .line 198
    iget-boolean v9, p1, Lx/l$e;->w:Z

    .line 199
    .line 200
    invoke-virtual {v3, v4, v8, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 201
    .line 202
    .line 203
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 204
    .line 205
    iget-object v4, p1, Lx/l$e;->k:Landroidx/core/graphics/drawable/IconCompat;

    .line 206
    .line 207
    const/4 v8, 0x0

    .line 208
    if-nez v4, :cond_5

    .line 209
    .line 210
    move-object v0, v8

    .line 211
    goto :goto_5

    .line 212
    :cond_5
    invoke-virtual {v4, v0}, Landroidx/core/graphics/drawable/IconCompat;->m(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_5
    invoke-static {v3, v0}, Lx/m$c;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 220
    .line 221
    iget-object v3, p1, Lx/l$e;->r:Ljava/lang/CharSequence;

    .line 222
    .line 223
    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-boolean v3, p1, Lx/l$e;->p:Z

    .line 228
    .line 229
    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget v3, p1, Lx/l$e;->n:I

    .line 234
    .line 235
    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 236
    .line 237
    .line 238
    iget-object v0, p1, Lx/l$e;->b:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    move v4, v7

    .line 245
    :goto_6
    if-ge v4, v3, :cond_6

    .line 246
    .line 247
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    add-int/lit8 v4, v4, 0x1

    .line 252
    .line 253
    check-cast v9, Lx/l$a;

    .line 254
    .line 255
    invoke-direct {p0, v9}, Lx/m;->b(Lx/l$a;)V

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_6
    iget-object v0, p1, Lx/l$e;->E:Landroid/os/Bundle;

    .line 260
    .line 261
    if-eqz v0, :cond_7

    .line 262
    .line 263
    iget-object v3, p0, Lx/m;->g:Landroid/os/Bundle;

    .line 264
    .line 265
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 266
    .line 267
    .line 268
    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 269
    .line 270
    iget-object v3, p1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    .line 271
    .line 272
    iput-object v3, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    .line 273
    .line 274
    iget-object v3, p1, Lx/l$e;->J:Landroid/widget/RemoteViews;

    .line 275
    .line 276
    iput-object v3, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    .line 277
    .line 278
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 279
    .line 280
    iget-boolean v4, p1, Lx/l$e;->o:Z

    .line 281
    .line 282
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 283
    .line 284
    .line 285
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 286
    .line 287
    iget-boolean v4, p1, Lx/l$e;->A:Z

    .line 288
    .line 289
    invoke-static {v3, v4}, Lx/m$a;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 290
    .line 291
    .line 292
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 293
    .line 294
    iget-object v4, p1, Lx/l$e;->x:Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {v3, v4}, Lx/m$a;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 297
    .line 298
    .line 299
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 300
    .line 301
    iget-object v4, p1, Lx/l$e;->z:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v3, v4}, Lx/m$a;->i(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 304
    .line 305
    .line 306
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 307
    .line 308
    iget-boolean v4, p1, Lx/l$e;->y:Z

    .line 309
    .line 310
    invoke-static {v3, v4}, Lx/m$a;->g(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 311
    .line 312
    .line 313
    iget v3, p1, Lx/l$e;->P:I

    .line 314
    .line 315
    iput v3, p0, Lx/m;->h:I

    .line 316
    .line 317
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 318
    .line 319
    iget-object v4, p1, Lx/l$e;->D:Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v3, v4}, Lx/m$b;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 322
    .line 323
    .line 324
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 325
    .line 326
    iget v4, p1, Lx/l$e;->F:I

    .line 327
    .line 328
    invoke-static {v3, v4}, Lx/m$b;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 329
    .line 330
    .line 331
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 332
    .line 333
    iget v4, p1, Lx/l$e;->G:I

    .line 334
    .line 335
    invoke-static {v3, v4}, Lx/m$b;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 336
    .line 337
    .line 338
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 339
    .line 340
    iget-object v4, p1, Lx/l$e;->H:Landroid/app/Notification;

    .line 341
    .line 342
    invoke-static {v3, v4}, Lx/m$b;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 343
    .line 344
    .line 345
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 346
    .line 347
    iget-object v4, v1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 348
    .line 349
    iget-object v9, v1, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 350
    .line 351
    invoke-static {v3, v4, v9}, Lx/m$b;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 352
    .line 353
    .line 354
    const/16 v3, 0x1c

    .line 355
    .line 356
    if-ge v0, v3, :cond_8

    .line 357
    .line 358
    iget-object v0, p1, Lx/l$e;->c:Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-static {v0}, Lx/m;->g(Ljava/util/List;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    iget-object v4, p1, Lx/l$e;->V:Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-static {v0, v4}, Lx/m;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    goto :goto_7

    .line 371
    :cond_8
    iget-object v0, p1, Lx/l$e;->V:Ljava/util/ArrayList;

    .line 372
    .line 373
    :goto_7
    if-eqz v0, :cond_9

    .line 374
    .line 375
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    if-nez v4, :cond_9

    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-eqz v4, :cond_9

    .line 390
    .line 391
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, Ljava/lang/String;

    .line 396
    .line 397
    iget-object v9, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 398
    .line 399
    invoke-static {v9, v4}, Lx/m$b;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 400
    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_9
    iget-object v0, p1, Lx/l$e;->K:Landroid/widget/RemoteViews;

    .line 404
    .line 405
    iput-object v0, p0, Lx/m;->i:Landroid/widget/RemoteViews;

    .line 406
    .line 407
    iget-object v0, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-lez v0, :cond_c

    .line 414
    .line 415
    invoke-virtual {p1}, Lx/l$e;->c()Landroid/os/Bundle;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    const-string v4, "android.car.EXTENSIONS"

    .line 420
    .line 421
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    if-nez v0, :cond_a

    .line 426
    .line 427
    new-instance v0, Landroid/os/Bundle;

    .line 428
    .line 429
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 430
    .line 431
    .line 432
    :cond_a
    new-instance v9, Landroid/os/Bundle;

    .line 433
    .line 434
    invoke-direct {v9, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    new-instance v10, Landroid/os/Bundle;

    .line 438
    .line 439
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 440
    .line 441
    .line 442
    move v11, v7

    .line 443
    :goto_9
    iget-object v12, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 446
    .line 447
    .line 448
    move-result v12

    .line 449
    if-ge v11, v12, :cond_b

    .line 450
    .line 451
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    iget-object v13, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v13

    .line 461
    check-cast v13, Lx/l$a;

    .line 462
    .line 463
    invoke-static {v13}, Lx/n;->a(Lx/l$a;)Landroid/os/Bundle;

    .line 464
    .line 465
    .line 466
    move-result-object v13

    .line 467
    invoke-virtual {v10, v12, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 468
    .line 469
    .line 470
    add-int/lit8 v11, v11, 0x1

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_b
    const-string v11, "invisible_actions"

    .line 474
    .line 475
    invoke-virtual {v0, v11, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1}, Lx/l$e;->c()Landroid/os/Bundle;

    .line 482
    .line 483
    .line 484
    move-result-object v10

    .line 485
    invoke-virtual {v10, v4, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 486
    .line 487
    .line 488
    iget-object v0, p0, Lx/m;->g:Landroid/os/Bundle;

    .line 489
    .line 490
    invoke-virtual {v0, v4, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 491
    .line 492
    .line 493
    :cond_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 494
    .line 495
    iget-object v4, p1, Lx/l$e;->U:Ljava/lang/Object;

    .line 496
    .line 497
    if-eqz v4, :cond_d

    .line 498
    .line 499
    iget-object v9, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 500
    .line 501
    invoke-static {v9, v4}, Lx/m$c;->c(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    .line 502
    .line 503
    .line 504
    :cond_d
    const/16 v4, 0x18

    .line 505
    .line 506
    if-lt v0, v4, :cond_10

    .line 507
    .line 508
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 509
    .line 510
    iget-object v9, p1, Lx/l$e;->E:Landroid/os/Bundle;

    .line 511
    .line 512
    invoke-virtual {v4, v9}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 513
    .line 514
    .line 515
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 516
    .line 517
    iget-object v9, p1, Lx/l$e;->t:[Ljava/lang/CharSequence;

    .line 518
    .line 519
    invoke-static {v4, v9}, Lx/m$d;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 520
    .line 521
    .line 522
    iget-object v4, p1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    .line 523
    .line 524
    if-eqz v4, :cond_e

    .line 525
    .line 526
    iget-object v9, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 527
    .line 528
    invoke-static {v9, v4}, Lx/m$d;->c(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 529
    .line 530
    .line 531
    :cond_e
    iget-object v4, p1, Lx/l$e;->J:Landroid/widget/RemoteViews;

    .line 532
    .line 533
    if-eqz v4, :cond_f

    .line 534
    .line 535
    iget-object v9, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 536
    .line 537
    invoke-static {v9, v4}, Lx/m$d;->b(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 538
    .line 539
    .line 540
    :cond_f
    iget-object v4, p1, Lx/l$e;->K:Landroid/widget/RemoteViews;

    .line 541
    .line 542
    if-eqz v4, :cond_10

    .line 543
    .line 544
    iget-object v9, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 545
    .line 546
    invoke-static {v9, v4}, Lx/m$d;->d(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 547
    .line 548
    .line 549
    :cond_10
    if-lt v0, v2, :cond_12

    .line 550
    .line 551
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 552
    .line 553
    iget v9, p1, Lx/l$e;->M:I

    .line 554
    .line 555
    invoke-static {v4, v9}, Lx/m$e;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 556
    .line 557
    .line 558
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 559
    .line 560
    iget-object v9, p1, Lx/l$e;->s:Ljava/lang/CharSequence;

    .line 561
    .line 562
    invoke-static {v4, v9}, Lx/m$e;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 563
    .line 564
    .line 565
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 566
    .line 567
    iget-object v9, p1, Lx/l$e;->N:Ljava/lang/String;

    .line 568
    .line 569
    invoke-static {v4, v9}, Lx/m$e;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 570
    .line 571
    .line 572
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 573
    .line 574
    iget-wide v9, p1, Lx/l$e;->O:J

    .line 575
    .line 576
    invoke-static {v4, v9, v10}, Lx/m$e;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    .line 577
    .line 578
    .line 579
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 580
    .line 581
    iget v9, p1, Lx/l$e;->P:I

    .line 582
    .line 583
    invoke-static {v4, v9}, Lx/m$e;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 584
    .line 585
    .line 586
    iget-boolean v4, p1, Lx/l$e;->C:Z

    .line 587
    .line 588
    if-eqz v4, :cond_11

    .line 589
    .line 590
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 591
    .line 592
    iget-boolean v9, p1, Lx/l$e;->B:Z

    .line 593
    .line 594
    invoke-static {v4, v9}, Lx/m$e;->c(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 595
    .line 596
    .line 597
    :cond_11
    iget-object v4, p1, Lx/l$e;->L:Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-nez v4, :cond_12

    .line 604
    .line 605
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 606
    .line 607
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    invoke-virtual {v4, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-virtual {v4, v7, v7, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 620
    .line 621
    .line 622
    :cond_12
    if-lt v0, v3, :cond_14

    .line 623
    .line 624
    iget-object v3, p1, Lx/l$e;->c:Ljava/util/ArrayList;

    .line 625
    .line 626
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    if-nez v4, :cond_13

    .line 635
    .line 636
    goto :goto_a

    .line 637
    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    invoke-static {p1}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    throw v8

    .line 645
    :cond_14
    :goto_a
    const/16 v3, 0x1d

    .line 646
    .line 647
    if-lt v0, v3, :cond_15

    .line 648
    .line 649
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 650
    .line 651
    iget-boolean v4, p1, Lx/l$e;->R:Z

    .line 652
    .line 653
    invoke-static {v3, v4}, Lx/m$g;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    .line 654
    .line 655
    .line 656
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 657
    .line 658
    invoke-static {v8}, Lx/l$d;->a(Lx/l$d;)Landroid/app/Notification$BubbleMetadata;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    invoke-static {v3, v4}, Lx/m$g;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    .line 663
    .line 664
    .line 665
    :cond_15
    const/16 v3, 0x1f

    .line 666
    .line 667
    if-lt v0, v3, :cond_16

    .line 668
    .line 669
    iget v3, p1, Lx/l$e;->Q:I

    .line 670
    .line 671
    if-eqz v3, :cond_16

    .line 672
    .line 673
    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 674
    .line 675
    invoke-static {v4, v3}, Lx/m$h;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 676
    .line 677
    .line 678
    :cond_16
    const/16 v3, 0x24

    .line 679
    .line 680
    if-lt v0, v3, :cond_17

    .line 681
    .line 682
    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 683
    .line 684
    iget-object v4, p1, Lx/l$e;->g:Ljava/lang/String;

    .line 685
    .line 686
    invoke-static {v3, v4}, Lx/m$i;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 687
    .line 688
    .line 689
    :cond_17
    iget-boolean p1, p1, Lx/l$e;->T:Z

    .line 690
    .line 691
    if-eqz p1, :cond_1a

    .line 692
    .line 693
    iget-object p1, p0, Lx/m;->c:Lx/l$e;

    .line 694
    .line 695
    iget-boolean p1, p1, Lx/l$e;->y:Z

    .line 696
    .line 697
    if-eqz p1, :cond_18

    .line 698
    .line 699
    iput v5, p0, Lx/m;->h:I

    .line 700
    .line 701
    goto :goto_b

    .line 702
    :cond_18
    iput v6, p0, Lx/m;->h:I

    .line 703
    .line 704
    :goto_b
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 705
    .line 706
    invoke-virtual {p1, v8}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 707
    .line 708
    .line 709
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 710
    .line 711
    invoke-virtual {p1, v8}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 712
    .line 713
    .line 714
    iget p1, v1, Landroid/app/Notification;->defaults:I

    .line 715
    .line 716
    and-int/lit8 p1, p1, -0x4

    .line 717
    .line 718
    iput p1, v1, Landroid/app/Notification;->defaults:I

    .line 719
    .line 720
    iget-object v1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 721
    .line 722
    invoke-virtual {v1, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 723
    .line 724
    .line 725
    if-lt v0, v2, :cond_1a

    .line 726
    .line 727
    iget-object p1, p0, Lx/m;->c:Lx/l$e;

    .line 728
    .line 729
    iget-object p1, p1, Lx/l$e;->x:Ljava/lang/String;

    .line 730
    .line 731
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 732
    .line 733
    .line 734
    move-result p1

    .line 735
    if-eqz p1, :cond_19

    .line 736
    .line 737
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 738
    .line 739
    const-string v0, "silent"

    .line 740
    .line 741
    invoke-static {p1, v0}, Lx/m$a;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 742
    .line 743
    .line 744
    :cond_19
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 745
    .line 746
    iget v0, p0, Lx/m;->h:I

    .line 747
    .line 748
    invoke-static {p1, v0}, Lx/m$e;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    .line 749
    .line 750
    .line 751
    :cond_1a
    return-void
.end method

.method private b(Lx/l$a;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lx/l$a;->d()Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->l()Landroid/graphics/drawable/Icon;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Lx/l$a;->h()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lx/l$a;->a()Landroid/app/PendingIntent;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v1, v2}, Lx/m$c;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lx/l$a;->e()[Lx/s;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lx/l$a;->e()[Lx/s;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lx/s;->b([Lx/s;)[Landroid/app/RemoteInput;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    array-length v2, v1

    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_1
    if-ge v3, v2, :cond_1

    .line 42
    .line 43
    aget-object v4, v1, v3

    .line 44
    .line 45
    invoke-static {v0, v4}, Lx/m$a;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p1}, Lx/l$a;->c()Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    new-instance v1, Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-virtual {p1}, Lx/l$a;->c()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 70
    .line 71
    .line 72
    :goto_2
    const-string v2, "android.support.allowGeneratedReplies"

    .line 73
    .line 74
    invoke-virtual {p1}, Lx/l$a;->b()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    const/16 v3, 0x18

    .line 84
    .line 85
    if-lt v2, v3, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Lx/l$a;->b()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-static {v0, v3}, Lx/m$d;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 92
    .line 93
    .line 94
    :cond_3
    const-string v3, "android.support.action.semanticAction"

    .line 95
    .line 96
    invoke-virtual {p1}, Lx/l$a;->f()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    const/16 v3, 0x1c

    .line 104
    .line 105
    if-lt v2, v3, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, Lx/l$a;->f()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v0, v3}, Lx/m$f;->a(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    .line 112
    .line 113
    .line 114
    :cond_4
    const/16 v3, 0x1d

    .line 115
    .line 116
    if-lt v2, v3, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1}, Lx/l$a;->j()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v0, v3}, Lx/m$g;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 123
    .line 124
    .line 125
    :cond_5
    const/16 v3, 0x1f

    .line 126
    .line 127
    if-lt v2, v3, :cond_6

    .line 128
    .line 129
    invoke-virtual {p1}, Lx/l$a;->i()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-static {v0, v2}, Lx/m$h;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    .line 134
    .line 135
    .line 136
    :cond_6
    const-string v2, "android.support.action.showsUserInterface"

    .line 137
    .line 138
    invoke-virtual {p1}, Lx/l$a;->g()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1}, Lx/m$a;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 149
    .line 150
    invoke-static {v0}, Lx/m$a;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {p1, v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private static e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_1
    new-instance v0, Landroidx/collection/b;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v1, v2

    .line 18
    invoke-direct {v0, v1}, Landroidx/collection/b;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroidx/collection/b;->addAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/collection/b;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    new-instance p0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method private static g(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method private h(Landroid/app/Notification;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 3
    .line 4
    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 5
    .line 6
    iget v0, p1, Landroid/app/Notification;->defaults:I

    .line 7
    .line 8
    and-int/lit8 v0, v0, -0x4

    .line 9
    .line 10
    iput v0, p1, Landroid/app/Notification;->defaults:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Landroid/app/Notification;
    .locals 3

    .line 1
    iget-object v0, p0, Lx/m;->c:Lx/l$e;

    .line 2
    .line 3
    iget-object v0, v0, Lx/l$e;->q:Lx/l$f;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lx/l$f;->b(Lx/k;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lx/l$f;->e(Lx/k;)Landroid/widget/RemoteViews;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lx/m;->d()Landroid/app/Notification;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object v1, p0, Lx/m;->c:Lx/l$e;

    .line 28
    .line 29
    iget-object v1, v1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 34
    .line 35
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lx/l$f;->d(Lx/k;)Landroid/widget/RemoteViews;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    iput-object v1, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 44
    .line 45
    :cond_4
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget-object v1, p0, Lx/m;->c:Lx/l$e;

    .line 48
    .line 49
    iget-object v1, v1, Lx/l$e;->q:Lx/l$f;

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Lx/l$f;->f(Lx/k;)Landroid/widget/RemoteViews;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iput-object v1, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 58
    .line 59
    :cond_5
    if-eqz v0, :cond_6

    .line 60
    .line 61
    invoke-static {v2}, Lx/l;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lx/l$f;->a(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-object v2
.end method

.method protected d()Landroid/app/Notification;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/16 v1, 0x18

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x2

    .line 18
    if-lt v0, v1, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v1, p0, Lx/m;->h:I

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-static {v0}, Lx/m$a;->e(Landroid/app/Notification;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0x200

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget v1, p0, Lx/m;->h:I

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-static {v0}, Lx/m$a;->e(Landroid/app/Notification;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 56
    .line 57
    and-int/lit16 v1, v1, 0x200

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    iget v1, p0, Lx/m;->h:I

    .line 62
    .line 63
    if-ne v1, v2, :cond_2

    .line 64
    .line 65
    invoke-direct {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v0

    .line 69
    :cond_3
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 70
    .line 71
    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 87
    .line 88
    :cond_4
    iget-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    .line 93
    .line 94
    :cond_5
    iget-object v1, p0, Lx/m;->i:Landroid/widget/RemoteViews;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iput-object v1, v0, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    .line 99
    .line 100
    :cond_6
    iget v1, p0, Lx/m;->h:I

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    invoke-static {v0}, Lx/m$a;->e(Landroid/app/Notification;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 111
    .line 112
    and-int/lit16 v1, v1, 0x200

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    iget v1, p0, Lx/m;->h:I

    .line 117
    .line 118
    if-ne v1, v3, :cond_7

    .line 119
    .line 120
    invoke-direct {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-static {v0}, Lx/m$a;->e(Landroid/app/Notification;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 130
    .line 131
    and-int/lit16 v1, v1, 0x200

    .line 132
    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    iget v1, p0, Lx/m;->h:I

    .line 136
    .line 137
    if-ne v1, v2, :cond_8

    .line 138
    .line 139
    invoke-direct {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    return-object v0
.end method

.method f()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/m;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method
