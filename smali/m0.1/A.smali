.class public final Lm0/A;
.super Lc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/A$a;
    }
.end annotation


# static fields
.field public static final k:Lm0/A$a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lq0/a;

.field private c:Landroid/net/Uri;

.field private d:Landroid/net/Uri;

.field private e:Ljava/util/List;

.field private f:Lm0/F;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm0/A$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm0/A$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm0/A;->k:Lm0/A$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/a;-><init>()V

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
    iput-object v0, p0, Lm0/A;->e:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method private final d(Landroid/content/Intent;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p0, v2, v0, v1}, Lm0/A;->k(Lm0/A;ZILjava/lang/Object;)Landroid/net/Uri;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lm0/A;->c:Landroid/net/Uri;

    .line 9
    .line 10
    const-string v1, "output"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final e(Landroid/content/Intent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/A;->b:Lq0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "cameraConfig"

    .line 6
    .line 7
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lq0/a;->c:Lq0/b;

    .line 12
    .line 13
    sget-object v1, Lq0/b;->e:Lq0/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "android.intent.extra.videoQuality"

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {p0, v2}, Lm0/A;->j(Z)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lm0/A;->d:Landroid/net/Uri;

    .line 33
    .line 34
    const-string v1, "output"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final f()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-direct {p0}, Lm0/A;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lm0/A;->w()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Lm0/A;->x()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-static {v0}, LM1/m;->l(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/content/Intent;

    .line 21
    .line 22
    return-object v0
.end method

.method private final g(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 8

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyyMMdd_HHmmss"

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/Date;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "toLowerCase(...)"

    .line 28
    .line 29
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "image"

    .line 33
    .line 34
    invoke-static {v1, v2}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    new-instance v1, LL1/p;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v3, "IMG_"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ".jpg"

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "image/jpeg"

    .line 65
    .line 66
    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 67
    .line 68
    invoke-direct {v1, v0, v2, v3}, LL1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string v2, "video"

    .line 73
    .line 74
    invoke-static {v1, v2}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_a

    .line 79
    .line 80
    new-instance v1, LL1/p;

    .line 81
    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v3, "VID_"

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, ".mp4"

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v2, "video/mp4"

    .line 105
    .line 106
    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 107
    .line 108
    invoke-direct {v1, v0, v2, v3}, LL1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    invoke-virtual {v1}, LL1/p;->a()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1}, LL1/p;->b()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v1}, LL1/p;->c()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Landroid/net/Uri;

    .line 128
    .line 129
    sget-object v3, Lm0/A;->k:Lm0/A$a;

    .line 130
    .line 131
    invoke-virtual {v3}, Lm0/A$a;->a()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const-string v4, "context"

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    if-eqz v3, :cond_2

    .line 139
    .line 140
    iget-object v3, p0, Lm0/A;->a:Landroid/content/Context;

    .line 141
    .line 142
    if-nez v3, :cond_1

    .line 143
    .line 144
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v3, v5

    .line 148
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    new-instance v6, Landroid/content/ContentValues;

    .line 153
    .line 154
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v7, "_display_name"

    .line 158
    .line 159
    invoke-virtual {v6, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v0, "mime_type"

    .line 163
    .line 164
    invoke-virtual {v6, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 168
    .line 169
    new-instance v2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v0, "/Camera"

    .line 178
    .line 179
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v2, "relative_path"

    .line 187
    .line 188
    invoke-virtual {v6, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, LL1/t;->a:LL1/t;

    .line 192
    .line 193
    invoke-virtual {v3, v1, v6}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    goto :goto_1

    .line 198
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 199
    .line 200
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const-string v3, "Camera"

    .line 207
    .line 208
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 212
    .line 213
    .line 214
    new-instance v2, Ljava/io/File;

    .line 215
    .line 216
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lm0/A;->a:Landroid/content/Context;

    .line 220
    .line 221
    if-nez v0, :cond_3

    .line 222
    .line 223
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object v0, v5

    .line 227
    :cond_3
    iget-object v1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 228
    .line 229
    if-nez v1, :cond_4

    .line 230
    .line 231
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    move-object v1, v5

    .line 235
    :cond_4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v1, ".fileprovider"

    .line 248
    .line 249
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-static {v0, v1, v2}, Landroidx/core/content/FileProvider;->h(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    :goto_1
    if-eqz v0, :cond_9

    .line 261
    .line 262
    :try_start_0
    iget-object v1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 263
    .line 264
    if-nez v1, :cond_5

    .line 265
    .line 266
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    move-object v1, v5

    .line 270
    goto :goto_2

    .line 271
    :catch_0
    move-exception v0

    .line 272
    goto :goto_5

    .line 273
    :cond_5
    :goto_2
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 278
    .line 279
    .line 280
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    if-eqz v1, :cond_8

    .line 282
    .line 283
    :try_start_1
    iget-object v2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 284
    .line 285
    if-nez v2, :cond_6

    .line 286
    .line 287
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    move-object v2, v5

    .line 291
    goto :goto_3

    .line 292
    :catchall_0
    move-exception v0

    .line 293
    goto :goto_4

    .line 294
    :cond_6
    :goto_3
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 299
    .line 300
    .line 301
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    if-eqz v2, :cond_7

    .line 303
    .line 304
    const/4 v3, 0x0

    .line 305
    const/4 v4, 0x2

    .line 306
    :try_start_2
    invoke-static {v1, v2, v3, v4, v5}, LU1/a;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 307
    .line 308
    .line 309
    :try_start_3
    invoke-static {v2, v5}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 310
    .line 311
    .line 312
    :try_start_4
    invoke-static {v1, v5}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    invoke-direct {p0}, Lm0/A;->l()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 316
    .line 317
    .line 318
    return-object v0

    .line 319
    :catchall_1
    move-exception v0

    .line 320
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 321
    :catchall_2
    move-exception v3

    .line 322
    :try_start_6
    invoke-static {v2, v0}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    throw v3

    .line 326
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 327
    .line 328
    new-instance v3, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    const-string v4, "Failed to open output stream for "

    .line 334
    .line 335
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 349
    :goto_4
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 350
    :catchall_3
    move-exception v2

    .line 351
    :try_start_8
    invoke-static {v1, v0}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    throw v2

    .line 355
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 356
    .line 357
    new-instance v1, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const-string v2, "Failed to open input stream for "

    .line 363
    .line 364
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 378
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 381
    .line 382
    .line 383
    const-string v2, "Failed to copy "

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    const-string p2, " to gallery"

    .line 392
    .line 393
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    const-string v1, "FileUploadContract"

    .line 401
    .line 402
    invoke-static {v1, p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 403
    .line 404
    .line 405
    :cond_9
    return-object p1

    .line 406
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 407
    .line 408
    new-instance v0, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const-string v1, "Unsupported media type: "

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw p1
.end method

.method private final j(Z)Landroid/net/Uri;
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "temp_video_recording.mp4"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "temp_capture_image.jpg"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/io/File;

    .line 9
    .line 10
    iget-object v1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "context"

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object v1, v2

    .line 21
    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v4, "downloads"

    .line 26
    .line 27
    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 37
    .line 38
    .line 39
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 40
    .line 41
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object p1, v2

    .line 52
    :cond_3
    iget-object v0, p0, Lm0/A;->a:Landroid/content/Context;

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object v2, v0

    .line 61
    :goto_1
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v0, ".fileprovider"

    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p1, v0, v1}, Landroidx/core/content/FileProvider;->h(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object p1
.end method

.method static synthetic k(Lm0/A;ZILjava/lang/Object;)Landroid/net/Uri;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lm0/A;->j(Z)Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lm0/A;->c:Landroid/net/Uri;

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v3, p0, Lm0/A;->a:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v3, v2

    .line 16
    :cond_0
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v0, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lm0/A;->c:Landroid/net/Uri;

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lm0/A;->d:Landroid/net/Uri;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v3, p0, Lm0/A;->a:Landroid/content/Context;

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v3, v2

    .line 37
    :cond_2
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1, v0, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lm0/A;->d:Landroid/net/Uri;

    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method private final m()Landroid/content/Intent;
    .locals 11

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.GET_CONTENT"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lm0/A;->e:Ljava/util/List;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Ljava/lang/Iterable;

    .line 12
    .line 13
    const/16 v9, 0x3e

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const-string v3, ", "

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    invoke-static/range {v2 .. v10}, LM1/m;->q(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LW1/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lm0/A;->e:Ljava/util/List;

    .line 31
    .line 32
    check-cast v1, Ljava/util/Collection;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    new-array v2, v2, [Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, [Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "android.intent.extra.MIME_TYPES"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 49
    .line 50
    iget-boolean v2, p0, Lm0/A;->g:Z

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const-string v1, "android.intent.category.OPENABLE"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Lm0/A;->u(Landroid/content/Intent;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 71
    .line 72
    const-string v2, "samsung"

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-static {v1, v2, v3}, Le2/d;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    new-instance v0, Landroid/content/Intent;

    .line 82
    .line 83
    const-string v1, "com.sec.android.app.myfiles.PICK_DATA"

    .line 84
    .line 85
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v1, "CONTENT_TYPE"

    .line 89
    .line 90
    const-string v2, "*/*"

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    const-string v1, "android.intent.category.DEFAULT"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    :cond_0
    return-object v0
.end method

.method private final n()Landroid/content/Intent;
    .locals 3

    .line 1
    invoke-direct {p0}, Lm0/A;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "android.intent.action.PICK"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/content/Intent;

    .line 10
    .line 11
    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 18
    .line 19
    sget-object v2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method private final o(Landroid/net/Uri;Landroid/content/Context;)Z
    .locals 8

    .line 1
    const-string v0, "_size"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v3, p1

    .line 16
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-ltz p2, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    cmp-long p2, v3, v5

    .line 42
    .line 43
    if-lez p2, :cond_0

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p2, v1

    .line 48
    :goto_0
    :try_start_2
    invoke-static {p1, v2}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return p2

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p2, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {p1, v2}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :goto_1
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_4
    invoke-static {p1, p2}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 65
    :catch_0
    :cond_2
    :goto_2
    return v1
.end method

.method private final p(Landroid/net/Uri;Landroid/content/Context;)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    const/16 p2, 0x400

    .line 12
    .line 13
    :try_start_1
    new-array p2, p2, [B

    .line 14
    .line 15
    new-instance v0, LX1/q;

    .line 16
    .line 17
    invoke-direct {v0}, LX1/q;-><init>()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, LX1/q;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eq v1, v2, :cond_1

    .line 29
    .line 30
    if-lez v1, :cond_0

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    :try_start_2
    invoke-static {p1, v3}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return p2

    .line 37
    :cond_1
    invoke-static {p1, v3}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p2

    .line 42
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    :try_start_4
    invoke-static {p1, p2}, LU1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 48
    :catch_0
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 49
    return p1
.end method

.method private final q()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/A;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lm0/A;->f:Lm0/F;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lm0/F;->g()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_1
    return v1
.end method

.method public static final r()Z
    .locals 1

    .line 1
    sget-object v0, Lm0/A;->k:Lm0/A$a;

    invoke-virtual {v0}, Lm0/A$a;->a()Z

    move-result v0

    return v0
.end method

.method private final s()Z
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.PICK"

    .line 4
    .line 5
    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lm0/A;->u(Landroid/content/Intent;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, LM1/m;->l(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 26
    .line 27
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 28
    .line 29
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "com.google.android.apps.photos"

    .line 32
    .line 33
    invoke-static {v0, v1}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    const/4 v0, 0x0

    .line 41
    return v0
.end method

.method private final t(Landroid/net/Uri;Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lm0/A;->o(Landroid/net/Uri;Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lm0/A;->p(Landroid/net/Uri;Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method private final u(Landroid/content/Intent;)Ljava/util/List;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "context"

    .line 7
    .line 8
    if-lt v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lm0/A;->a:Landroid/content/Context;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v0

    .line 19
    :goto_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-wide/32 v1, 0x10000

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lm0/y;->a(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, p1, v1}, Lm0/z;->a(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    iget-object v0, p0, Lm0/A;->a:Landroid/content/Context;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object v2, v0

    .line 47
    :goto_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/high16 v1, 0x10000

    .line 52
    .line 53
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method

.method private final w()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "context"

    .line 11
    .line 12
    invoke-static {v1}, LX1/k;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :cond_0
    invoke-static {v1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-boolean v1, v1, Lo0/a;->X0:Z

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 26
    .line 27
    const-string v2, "android.media.action.IMAGE_CAPTURE"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v1}, Lm0/A;->d(Landroid/content/Intent;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v1}, Lm0/A;->u(Landroid/content/Intent;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 54
    .line 55
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 56
    .line 57
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v5, Landroid/content/Intent;

    .line 60
    .line 61
    invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    new-instance v6, Landroid/content/ComponentName;

    .line 65
    .line 66
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 67
    .line 68
    iget-object v7, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v6, v7, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    :goto_1
    return-object v0
.end method

.method private final x()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lm0/A;->j:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v2, "android.media.action.VIDEO_CAPTURE"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v1}, Lm0/A;->e(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v1}, Lm0/A;->u(Landroid/content/Intent;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 40
    .line 41
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 42
    .line 43
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v5, Landroid/content/Intent;

    .line 46
    .line 47
    invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Landroid/content/ComponentName;

    .line 51
    .line 52
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 53
    .line 54
    iget-object v7, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v6, v7, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    :goto_1
    return-object v0
.end method

.method private final y()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/A;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lm0/A;->f:Lm0/F;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lm0/F;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_1
    return v1
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 1
    check-cast p2, Lm0/F;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lm0/A;->i(Landroid/content/Context;Lm0/F;)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic c(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lm0/A;->v(ILandroid/content/Intent;)Lm0/G;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final h()Landroid/content/Intent;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lm0/A;->q()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lm0/A;->w()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lm0/A;->y()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-direct {p0}, Lm0/A;->x()Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-direct {p0}, Lm0/A;->q()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-direct {p0}, Lm0/A;->y()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    xor-int/2addr v1, v2

    .line 41
    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    .line 42
    .line 43
    const v3, 0x7f120039

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const-string v5, "context"

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-direct {p0}, Lm0/A;->n()Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-boolean v6, p0, Lm0/A;->g:Z

    .line 56
    .line 57
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 61
    .line 62
    if-nez v2, :cond_2

    .line 63
    .line 64
    invoke-static {v5}, LX1/k;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object v4, v2

    .line 69
    :goto_0
    invoke-virtual {v4, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    iget-object v1, p0, Lm0/A;->f:Lm0/F;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1}, Lm0/F;->n()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v6, 0x1

    .line 87
    if-ne v1, v6, :cond_5

    .line 88
    .line 89
    invoke-direct {p0}, Lm0/A;->s()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    new-instance v1, Landroid/content/Intent;

    .line 96
    .line 97
    const-string v6, "android.intent.action.PICK"

    .line 98
    .line 99
    sget-object v7, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 100
    .line 101
    invoke-direct {v1, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 102
    .line 103
    .line 104
    const-string v6, "image/*, video/*"

    .line 105
    .line 106
    invoke-virtual {v1, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    const-string v6, "image/*"

    .line 110
    .line 111
    const-string v7, "video/*"

    .line 112
    .line 113
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    const-string v7, "android.intent.extra.MIME_TYPES"

    .line 118
    .line 119
    invoke-virtual {v1, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 120
    .line 121
    .line 122
    iget-boolean v6, p0, Lm0/A;->g:Z

    .line 123
    .line 124
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 128
    .line 129
    if-nez v2, :cond_4

    .line 130
    .line 131
    invoke-static {v5}, LX1/k;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    move-object v4, v2

    .line 136
    :goto_1
    invoke-virtual {v4, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    invoke-direct {p0}, Lm0/A;->m()Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 150
    .line 151
    if-nez v2, :cond_6

    .line 152
    .line 153
    invoke-static {v5}, LX1/k;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move-object v4, v2

    .line 158
    :goto_2
    invoke-virtual {v4, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :goto_3
    const/4 v2, 0x0

    .line 167
    new-array v2, v2, [Landroid/os/Parcelable;

    .line 168
    .line 169
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, [Landroid/os/Parcelable;

    .line 174
    .line 175
    const-string v2, "android.intent.extra.INITIAL_INTENTS"

    .line 176
    .line 177
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object v1
.end method

.method public i(Landroid/content/Context;Lm0/F;)Landroid/content/Intent;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "input"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm0/A;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lm0/A;->f:Lm0/F;

    .line 14
    .line 15
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p1, Lo0/a;->W0:Lq0/a;

    .line 20
    .line 21
    const-string v1, "cameraConfig"

    .line 22
    .line 23
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lm0/A;->b:Lq0/a;

    .line 27
    .line 28
    iget-boolean p1, p1, Lo0/a;->X0:Z

    .line 29
    .line 30
    iput-boolean p1, p0, Lm0/A;->j:Z

    .line 31
    .line 32
    invoke-virtual {p2}, Lm0/F;->k()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput-boolean p1, p0, Lm0/A;->i:Z

    .line 37
    .line 38
    invoke-virtual {p2}, Lm0/F;->j()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput-boolean p1, p0, Lm0/A;->h:Z

    .line 43
    .line 44
    invoke-virtual {p2}, Lm0/F;->m()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lm0/A;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {p2}, Lm0/F;->l()Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/4 v0, 0x1

    .line 59
    if-ne p1, v0, :cond_0

    .line 60
    .line 61
    iput-boolean v0, p0, Lm0/A;->g:Z

    .line 62
    .line 63
    :cond_0
    invoke-virtual {p2}, Lm0/F;->l()Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-direct {p0}, Lm0/A;->f()Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_1
    invoke-virtual {p0}, Lm0/A;->h()Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
.end method

.method public v(ILandroid/content/Intent;)Lm0/G;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, -0x1

    .line 4
    if-eq p1, v2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lm0/A;->l()V

    .line 7
    .line 8
    .line 9
    new-instance v3, Lm0/G;

    .line 10
    .line 11
    const/4 v7, 0x4

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-direct/range {v3 .. v8}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 17
    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    const-string v2, "video"

    .line 21
    .line 22
    const-string v3, "context"

    .line 23
    .line 24
    const-string v4, "cameraConfig"

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz p2, :cond_b

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-eqz v6, :cond_8

    .line 34
    .line 35
    iget-object v6, p0, Lm0/A;->d:Landroid/net/Uri;

    .line 36
    .line 37
    if-eqz v6, :cond_7

    .line 38
    .line 39
    iget-object v7, p0, Lm0/A;->a:Landroid/content/Context;

    .line 40
    .line 41
    if-nez v7, :cond_1

    .line 42
    .line 43
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v7, v5

    .line 47
    :cond_1
    invoke-direct {p0, v6, v7}, Lm0/A;->t(Landroid/net/Uri;Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_7

    .line 52
    .line 53
    invoke-static {p1, p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    aget-object v3, v3, v1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object v3, v5

    .line 63
    :goto_0
    invoke-virtual {v6}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_4

    .line 74
    .line 75
    :cond_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    :cond_4
    invoke-static {v7, v3}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_7

    .line 82
    .line 83
    iget-object p1, p0, Lm0/A;->b:Lq0/a;

    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move-object v5, p1

    .line 92
    :goto_1
    iget-boolean p1, v5, Lq0/a;->a:Z

    .line 93
    .line 94
    if-eqz p1, :cond_6

    .line 95
    .line 96
    iget-boolean p1, p0, Lm0/A;->h:Z

    .line 97
    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    invoke-direct {p0, v6, v2}, Lm0/A;->g(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    :cond_6
    new-instance v7, Lm0/G;

    .line 105
    .line 106
    new-array v9, v0, [Landroid/net/Uri;

    .line 107
    .line 108
    aput-object v6, v9, v1

    .line 109
    .line 110
    const/4 v11, 0x4

    .line 111
    const/4 v12, 0x0

    .line 112
    const/4 v8, 0x1

    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-direct/range {v7 .. v12}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 115
    .line 116
    .line 117
    return-object v7

    .line 118
    :cond_7
    new-instance v0, Lm0/G;

    .line 119
    .line 120
    invoke-static {p1, p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/4 v4, 0x4

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v1, 0x1

    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct/range {v0 .. v5}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_8
    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_b

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-static {v1, p2}, Lb2/d;->f(II)Lb2/c;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    :cond_9
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    move-object v2, p2

    .line 162
    check-cast v2, LM1/B;

    .line 163
    .line 164
    invoke-virtual {v2}, LM1/B;->a()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {p1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_a
    new-instance v3, Lm0/G;

    .line 183
    .line 184
    new-array p1, v1, [Landroid/net/Uri;

    .line 185
    .line 186
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    move-object v5, p1

    .line 191
    check-cast v5, [Landroid/net/Uri;

    .line 192
    .line 193
    const/4 v7, 0x4

    .line 194
    const/4 v8, 0x0

    .line 195
    const/4 v4, 0x1

    .line 196
    const/4 v6, 0x0

    .line 197
    invoke-direct/range {v3 .. v8}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 198
    .line 199
    .line 200
    return-object v3

    .line 201
    :cond_b
    iget-object p1, p0, Lm0/A;->c:Landroid/net/Uri;

    .line 202
    .line 203
    if-eqz p1, :cond_11

    .line 204
    .line 205
    iget-object p2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 206
    .line 207
    if-nez p2, :cond_c

    .line 208
    .line 209
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    move-object p2, v5

    .line 213
    :cond_c
    invoke-direct {p0, p1, p2}, Lm0/A;->t(Landroid/net/Uri;Landroid/content/Context;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-eqz p2, :cond_11

    .line 218
    .line 219
    iget-object p2, p0, Lm0/A;->b:Lq0/a;

    .line 220
    .line 221
    if-nez p2, :cond_d

    .line 222
    .line 223
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    move-object p2, v5

    .line 227
    :cond_d
    iget-boolean p2, p2, Lq0/a;->a:Z

    .line 228
    .line 229
    if-eqz p2, :cond_e

    .line 230
    .line 231
    iget-boolean p2, p0, Lm0/A;->h:Z

    .line 232
    .line 233
    if-eqz p2, :cond_e

    .line 234
    .line 235
    const-string p2, "image"

    .line 236
    .line 237
    invoke-direct {p0, p1, p2}, Lm0/A;->g(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    :cond_e
    iget-object p2, p0, Lm0/A;->b:Lq0/a;

    .line 242
    .line 243
    if-nez p2, :cond_f

    .line 244
    .line 245
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_f
    move-object v5, p2

    .line 250
    :goto_3
    iget-object p2, v5, Lq0/a;->c:Lq0/b;

    .line 251
    .line 252
    sget-object v2, Lq0/b;->d:Lq0/b;

    .line 253
    .line 254
    if-ne p2, v2, :cond_10

    .line 255
    .line 256
    move p2, v0

    .line 257
    goto :goto_4

    .line 258
    :cond_10
    move p2, v1

    .line 259
    :goto_4
    new-instance v2, Lm0/G;

    .line 260
    .line 261
    new-array v3, v0, [Landroid/net/Uri;

    .line 262
    .line 263
    aput-object p1, v3, v1

    .line 264
    .line 265
    invoke-direct {v2, v0, v3, p2}, Lm0/G;-><init>(Z[Landroid/net/Uri;Z)V

    .line 266
    .line 267
    .line 268
    return-object v2

    .line 269
    :cond_11
    iget-object p1, p0, Lm0/A;->d:Landroid/net/Uri;

    .line 270
    .line 271
    if-eqz p1, :cond_15

    .line 272
    .line 273
    iget-object p2, p0, Lm0/A;->a:Landroid/content/Context;

    .line 274
    .line 275
    if-nez p2, :cond_12

    .line 276
    .line 277
    invoke-static {v3}, LX1/k;->n(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    move-object p2, v5

    .line 281
    :cond_12
    invoke-direct {p0, p1, p2}, Lm0/A;->t(Landroid/net/Uri;Landroid/content/Context;)Z

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    if-eqz p2, :cond_15

    .line 286
    .line 287
    iget-object p2, p0, Lm0/A;->b:Lq0/a;

    .line 288
    .line 289
    if-nez p2, :cond_13

    .line 290
    .line 291
    invoke-static {v4}, LX1/k;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_13
    move-object v5, p2

    .line 296
    :goto_5
    iget-boolean p2, v5, Lq0/a;->a:Z

    .line 297
    .line 298
    if-eqz p2, :cond_14

    .line 299
    .line 300
    iget-boolean p2, p0, Lm0/A;->h:Z

    .line 301
    .line 302
    if-eqz p2, :cond_14

    .line 303
    .line 304
    invoke-direct {p0, p1, v2}, Lm0/A;->g(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    :cond_14
    new-instance v2, Lm0/G;

    .line 309
    .line 310
    new-array v4, v0, [Landroid/net/Uri;

    .line 311
    .line 312
    aput-object p1, v4, v1

    .line 313
    .line 314
    const/4 v6, 0x4

    .line 315
    const/4 v7, 0x0

    .line 316
    const/4 v3, 0x1

    .line 317
    const/4 v5, 0x0

    .line 318
    invoke-direct/range {v2 .. v7}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 319
    .line 320
    .line 321
    return-object v2

    .line 322
    :cond_15
    invoke-direct {p0}, Lm0/A;->l()V

    .line 323
    .line 324
    .line 325
    new-instance v3, Lm0/G;

    .line 326
    .line 327
    const/4 v7, 0x4

    .line 328
    const/4 v8, 0x0

    .line 329
    const/4 v4, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    const/4 v6, 0x0

    .line 332
    invoke-direct/range {v3 .. v8}, Lm0/G;-><init>(Z[Landroid/net/Uri;ZILX1/g;)V

    .line 333
    .line 334
    .line 335
    return-object v3
.end method
