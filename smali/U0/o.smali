.class public final LU0/o;
.super LU0/l;
.source "SourceFile"


# instance fields
.field private r:LU0/m;

.field private s:LU0/n;

.field private t:Landroid/graphics/drawable/Drawable;


# direct methods
.method constructor <init>(Landroid/content/Context;LU0/c;LU0/m;LU0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LU0/l;-><init>(Landroid/content/Context;LU0/c;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, LU0/o;->A(LU0/m;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p4}, LU0/o;->z(LU0/n;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method static v(Landroid/content/Context;LU0/h;LU0/d;)LU0/o;
    .locals 3

    .line 1
    new-instance v0, LU0/o;

    .line 2
    .line 3
    iget v1, p1, LU0/h;->o:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    new-instance v1, LU0/f;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, LU0/f;-><init>(Landroid/content/Context;LU0/h;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, LU0/e;

    .line 15
    .line 16
    invoke-direct {v1, p1}, LU0/e;-><init>(LU0/h;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-direct {v0, p0, p1, p2, v1}, LU0/o;-><init>(Landroid/content/Context;LU0/c;LU0/m;LU0/n;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget p1, LF0/d;->b:I

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-static {p0, p1, p2}, Landroidx/vectordrawable/graphics/drawable/h;->b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroidx/vectordrawable/graphics/drawable/h;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, LU0/o;->B(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method private y()Z
    .locals 3

    .line 1
    iget-object v0, p0, LU0/l;->c:LU0/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, LU0/l;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2}, LU0/a;->a(Landroid/content/ContentResolver;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    cmpl-float v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    return v1
.end method


# virtual methods
.method A(LU0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/o;->r:LU0/m;

    .line 2
    .line 3
    return-void
.end method

.method public B(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/o;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_8

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_8

    .line 16
    .line 17
    iget-object v0, p0, LU0/l;->p:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    invoke-direct {p0}, LU0/o;->y()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v8, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LU0/o;->t:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, LU0/o;->t:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    iget-object v2, p0, LU0/l;->b:LU0/c;

    .line 48
    .line 49
    iget-object v2, v2, LU0/c;->e:[I

    .line 50
    .line 51
    aget v2, v2, v8

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LU0/o;->t:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LU0/o;->r:LU0/m;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p0}, LU0/l;->h()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {p0}, LU0/o;->m()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {p0}, LU0/o;->l()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    move-object v1, p1

    .line 84
    invoke-virtual/range {v0 .. v5}, LU0/m;->h(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 88
    .line 89
    iget v9, v0, LU0/c;->i:I

    .line 90
    .line 91
    invoke-virtual {p0}, LU0/o;->getAlpha()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    iget-object v0, p0, LU0/l;->b:LU0/c;

    .line 96
    .line 97
    instance-of v1, v0, LU0/h;

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    move-object v1, v0

    .line 103
    check-cast v1, LU0/h;

    .line 104
    .line 105
    iget-boolean v1, v1, LU0/h;->s:Z

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    move v10, v2

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    move v10, v8

    .line 112
    :goto_0
    if-eqz v10, :cond_3

    .line 113
    .line 114
    if-nez v9, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0, v8}, LU0/c;->b(Z)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    move v11, v2

    .line 123
    goto :goto_1

    .line 124
    :cond_3
    move v11, v8

    .line 125
    :goto_1
    if-eqz v11, :cond_5

    .line 126
    .line 127
    iget-object v0, p0, LU0/o;->r:LU0/m;

    .line 128
    .line 129
    iget-object v2, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 130
    .line 131
    iget-object v1, p0, LU0/l;->b:LU0/c;

    .line 132
    .line 133
    iget v5, v1, LU0/c;->f:I

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v3, 0x0

    .line 137
    const/high16 v4, 0x3f800000    # 1.0f

    .line 138
    .line 139
    move-object v1, p1

    .line 140
    invoke-virtual/range {v0 .. v7}, LU0/m;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 141
    .line 142
    .line 143
    :cond_4
    move v7, v9

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    if-eqz v10, :cond_4

    .line 146
    .line 147
    iget-object v0, p0, LU0/o;->s:LU0/n;

    .line 148
    .line 149
    iget-object v0, v0, LU0/n;->b:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, LU0/m$a;

    .line 156
    .line 157
    iget-object v3, p0, LU0/o;->s:LU0/n;

    .line 158
    .line 159
    iget-object v3, v3, LU0/n;->b:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    sub-int/2addr v4, v2

    .line 166
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, LU0/m$a;

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 173
    .line 174
    .line 175
    iget v3, v2, LU0/m$a;->g:F

    .line 176
    .line 177
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 178
    .line 179
    .line 180
    iget-object v3, p0, LU0/o;->r:LU0/m;

    .line 181
    .line 182
    iget-object v4, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 183
    .line 184
    iget v2, v2, LU0/m$a;->b:F

    .line 185
    .line 186
    iget v0, v0, LU0/m$a;->a:F

    .line 187
    .line 188
    const/high16 v5, 0x3f800000    # 1.0f

    .line 189
    .line 190
    add-float/2addr v0, v5

    .line 191
    iget-object v5, p0, LU0/l;->b:LU0/c;

    .line 192
    .line 193
    iget v5, v5, LU0/c;->f:I

    .line 194
    .line 195
    move-object v1, v4

    .line 196
    move v4, v0

    .line 197
    move-object v0, v3

    .line 198
    move v3, v2

    .line 199
    move-object v2, v1

    .line 200
    move-object v1, p1

    .line 201
    move v7, v9

    .line 202
    invoke-virtual/range {v0 .. v7}, LU0/m;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 206
    .line 207
    .line 208
    :goto_2
    iget-object v0, p0, LU0/o;->s:LU0/n;

    .line 209
    .line 210
    iget-object v0, v0, LU0/n;->b:Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-ge v8, v0, :cond_7

    .line 217
    .line 218
    iget-object v0, p0, LU0/o;->s:LU0/n;

    .line 219
    .line 220
    iget-object v0, v0, LU0/n;->b:Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, LU0/m$a;

    .line 227
    .line 228
    invoke-virtual {p0}, LU0/l;->i()F

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    iput v2, v0, LU0/m$a;->f:F

    .line 233
    .line 234
    iget-object v2, p0, LU0/o;->r:LU0/m;

    .line 235
    .line 236
    iget-object v3, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 237
    .line 238
    invoke-virtual {p0}, LU0/o;->getAlpha()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    invoke-virtual {v2, p1, v3, v0, v4}, LU0/m;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;LU0/m$a;I)V

    .line 243
    .line 244
    .line 245
    if-lez v8, :cond_6

    .line 246
    .line 247
    if-nez v11, :cond_6

    .line 248
    .line 249
    if-eqz v10, :cond_6

    .line 250
    .line 251
    iget-object v2, p0, LU0/o;->s:LU0/n;

    .line 252
    .line 253
    iget-object v2, v2, LU0/n;->b:Ljava/util/List;

    .line 254
    .line 255
    add-int/lit8 v3, v8, -0x1

    .line 256
    .line 257
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, LU0/m$a;

    .line 262
    .line 263
    iget-object v3, p0, LU0/o;->r:LU0/m;

    .line 264
    .line 265
    iget-object v4, p0, LU0/l;->n:Landroid/graphics/Paint;

    .line 266
    .line 267
    iget v2, v2, LU0/m$a;->b:F

    .line 268
    .line 269
    iget v0, v0, LU0/m$a;->a:F

    .line 270
    .line 271
    iget-object v5, p0, LU0/l;->b:LU0/c;

    .line 272
    .line 273
    iget v5, v5, LU0/c;->f:I

    .line 274
    .line 275
    move-object v1, v4

    .line 276
    move v4, v0

    .line 277
    move-object v0, v3

    .line 278
    move v3, v2

    .line 279
    move-object v2, v1

    .line 280
    move-object v1, p1

    .line 281
    invoke-virtual/range {v0 .. v7}, LU0/m;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 282
    .line 283
    .line 284
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 288
    .line 289
    .line 290
    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->getAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/o;->r:LU0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/m;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, LU0/o;->r:LU0/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/m;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->getOpacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->isRunning()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic l()Z
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic m()Z
    .locals 1

    .line 1
    invoke-super {p0}, LU0/l;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic o(Landroidx/vectordrawable/graphics/drawable/b;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LU0/l;->o(Landroidx/vectordrawable/graphics/drawable/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic s(ZZZ)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, LU0/l;->s(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LU0/l;->setAlpha(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LU0/l;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, LU0/l;->setVisible(ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge synthetic start()V
    .locals 0

    .line 1
    invoke-super {p0}, LU0/l;->start()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    .line 1
    invoke-super {p0}, LU0/l;->stop()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method t(ZZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, LU0/l;->t(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, LU0/o;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LU0/o;->t:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-virtual {p0}, LU0/o;->isRunning()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    iget-object p2, p0, LU0/o;->s:LU0/n;

    .line 27
    .line 28
    invoke-virtual {p2}, LU0/n;->a()V

    .line 29
    .line 30
    .line 31
    :cond_1
    if-eqz p1, :cond_3

    .line 32
    .line 33
    if-nez p3, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    iget-object p1, p0, LU0/o;->s:LU0/n;

    .line 37
    .line 38
    invoke-virtual {p1}, LU0/n;->g()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return v0
.end method

.method public bridge synthetic u(Landroidx/vectordrawable/graphics/drawable/b;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, LU0/l;->u(Landroidx/vectordrawable/graphics/drawable/b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method w()LU0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/o;->s:LU0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method x()LU0/m;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/o;->r:LU0/m;

    .line 2
    .line 3
    return-object v0
.end method

.method z(LU0/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/o;->s:LU0/n;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, LU0/n;->e(LU0/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
