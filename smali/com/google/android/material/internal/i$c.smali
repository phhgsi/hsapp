.class Lcom/google/android/material/internal/i$c;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/internal/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final d:Ljava/util/ArrayList;

.field private e:Landroidx/appcompat/view/menu/g;

.field private f:Z

.field final synthetic g:Lcom/google/android/material/internal/i;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->J()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method static synthetic A(Lcom/google/android/material/internal/i$c;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/internal/i$c;->B(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private B(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, p1

    .line 3
    :goto_0
    if-ge v0, p1, :cond_2

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 6
    .line 7
    iget-object v2, v2, Lcom/google/android/material/internal/i;->f:Lcom/google/android/material/internal/i$c;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 17
    .line 18
    iget-object v2, v2, Lcom/google/android/material/internal/i;->f:Lcom/google/android/material/internal/i$c;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x3

    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return v1
.end method

.method private C(II)V
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/android/material/internal/i$g;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lcom/google/android/material/internal/i$g;->b:Z

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method private J()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v2, Lcom/google/android/material/internal/i$d;

    .line 17
    .line 18
    invoke-direct {v2}, Lcom/google/android/material/internal/i$d;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/google/android/material/internal/i;->d:Landroidx/appcompat/view/menu/e;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->G()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, -0x1

    .line 38
    move v4, v2

    .line 39
    move v5, v4

    .line 40
    move v6, v5

    .line 41
    :goto_0
    if-ge v4, v1, :cond_e

    .line 42
    .line 43
    iget-object v7, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 44
    .line 45
    iget-object v7, v7, Lcom/google/android/material/internal/i;->d:Landroidx/appcompat/view/menu/e;

    .line 46
    .line 47
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/e;->G()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, Landroidx/appcompat/view/menu/g;

    .line 56
    .line 57
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->isChecked()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v7}, Lcom/google/android/material/internal/i$c;->M(Landroidx/appcompat/view/menu/g;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->isCheckable()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_2

    .line 71
    .line 72
    invoke-virtual {v7, v2}, Landroidx/appcompat/view/menu/g;->t(Z)V

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->hasSubMenu()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_9

    .line 80
    .line 81
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->getSubMenu()Landroid/view/SubMenu;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-interface {v8}, Landroid/view/Menu;->hasVisibleItems()Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-eqz v9, :cond_d

    .line 90
    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    iget-object v9, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 94
    .line 95
    new-instance v10, Lcom/google/android/material/internal/i$f;

    .line 96
    .line 97
    iget-object v11, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 98
    .line 99
    iget v11, v11, Lcom/google/android/material/internal/i;->B:I

    .line 100
    .line 101
    invoke-direct {v10, v11, v2}, Lcom/google/android/material/internal/i$f;-><init>(II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_3
    iget-object v9, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 108
    .line 109
    new-instance v10, Lcom/google/android/material/internal/i$g;

    .line 110
    .line 111
    invoke-direct {v10, v7}, Lcom/google/android/material/internal/i$g;-><init>(Landroidx/appcompat/view/menu/g;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    iget-object v7, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-interface {v8}, Landroid/view/Menu;->size()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    move v10, v2

    .line 128
    move v11, v10

    .line 129
    :goto_1
    if-ge v10, v9, :cond_8

    .line 130
    .line 131
    invoke-interface {v8, v10}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, Landroidx/appcompat/view/menu/g;

    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/appcompat/view/menu/g;->isVisible()Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-eqz v13, :cond_7

    .line 142
    .line 143
    if-nez v11, :cond_4

    .line 144
    .line 145
    invoke-virtual {v12}, Landroidx/appcompat/view/menu/g;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    if-eqz v13, :cond_4

    .line 150
    .line 151
    move v11, v0

    .line 152
    :cond_4
    invoke-virtual {v12}, Landroidx/appcompat/view/menu/g;->isCheckable()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_5

    .line 157
    .line 158
    invoke-virtual {v12, v2}, Landroidx/appcompat/view/menu/g;->t(Z)V

    .line 159
    .line 160
    .line 161
    :cond_5
    invoke-virtual {v12}, Landroidx/appcompat/view/menu/g;->isChecked()Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_6

    .line 166
    .line 167
    invoke-virtual {p0, v12}, Lcom/google/android/material/internal/i$c;->M(Landroidx/appcompat/view/menu/g;)V

    .line 168
    .line 169
    .line 170
    :cond_6
    iget-object v13, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 171
    .line 172
    new-instance v14, Lcom/google/android/material/internal/i$g;

    .line 173
    .line 174
    invoke-direct {v14, v12}, Lcom/google/android/material/internal/i$g;-><init>(Landroidx/appcompat/view/menu/g;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_8
    if-eqz v11, :cond_d

    .line 184
    .line 185
    iget-object v8, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    invoke-direct {p0, v7, v8}, Lcom/google/android/material/internal/i$c;->C(II)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_9
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->getGroupId()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    if-eq v8, v3, :cond_b

    .line 200
    .line 201
    iget-object v3, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-eqz v3, :cond_a

    .line 212
    .line 213
    move v5, v0

    .line 214
    goto :goto_2

    .line 215
    :cond_a
    move v5, v2

    .line 216
    :goto_2
    if-eqz v4, :cond_c

    .line 217
    .line 218
    add-int/lit8 v6, v6, 0x1

    .line 219
    .line 220
    iget-object v3, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 221
    .line 222
    new-instance v9, Lcom/google/android/material/internal/i$f;

    .line 223
    .line 224
    iget-object v10, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 225
    .line 226
    iget v10, v10, Lcom/google/android/material/internal/i;->B:I

    .line 227
    .line 228
    invoke-direct {v9, v10, v10}, Lcom/google/android/material/internal/i$f;-><init>(II)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_b
    if-nez v5, :cond_c

    .line 236
    .line 237
    invoke-virtual {v7}, Landroidx/appcompat/view/menu/g;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    if-eqz v3, :cond_c

    .line 242
    .line 243
    iget-object v3, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-direct {p0, v6, v3}, Lcom/google/android/material/internal/i$c;->C(II)V

    .line 250
    .line 251
    .line 252
    move v5, v0

    .line 253
    :cond_c
    :goto_3
    new-instance v3, Lcom/google/android/material/internal/i$g;

    .line 254
    .line 255
    invoke-direct {v3, v7}, Lcom/google/android/material/internal/i$g;-><init>(Landroidx/appcompat/view/menu/g;)V

    .line 256
    .line 257
    .line 258
    iput-boolean v5, v3, Lcom/google/android/material/internal/i$g;->b:Z

    .line 259
    .line 260
    iget-object v7, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move v3, v8

    .line 266
    :cond_d
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_e
    iput-boolean v2, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 271
    .line 272
    return-void
.end method

.method private L(Landroid/view/View;IZ)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/internal/i$c$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/material/internal/i$c$a;-><init>(Lcom/google/android/material/internal/i$c;IZ)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, LJ/W;->i0(Landroid/view/View;LJ/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private P()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v1, v1, Lcom/google/android/material/internal/i$f;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->j(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method private Q()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v1, v1, Lcom/google/android/material/internal/i$g;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->j(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method private R()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

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
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    instance-of v1, v1, Lcom/google/android/material/internal/i$g;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->j(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method static synthetic x(Lcom/google/android/material/internal/i$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->R()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic y(Lcom/google/android/material/internal/i$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->Q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic z(Lcom/google/android/material/internal/i$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->P()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public D()Landroid/os/Bundle;
    .locals 7

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->e:Landroidx/appcompat/view/menu/g;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v2, "android:menu:checked"

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->getItemId()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    if-ge v3, v2, :cond_3

    .line 32
    .line 33
    iget-object v4, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lcom/google/android/material/internal/i$e;

    .line 40
    .line 41
    instance-of v5, v4, Lcom/google/android/material/internal/i$g;

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    check-cast v4, Lcom/google/android/material/internal/i$g;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/g;->getActionView()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v5, 0x0

    .line 59
    :goto_1
    if-eqz v5, :cond_2

    .line 60
    .line 61
    new-instance v6, Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 62
    .line 63
    invoke-direct {v6}, Lcom/google/android/material/internal/ParcelableSparseArray;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/g;->getItemId()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const-string v2, "android:menu:action_views"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public E()Landroidx/appcompat/view/menu/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->e:Landroidx/appcompat/view/menu/g;

    .line 2
    .line 3
    return-object v0
.end method

.method F()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 4
    .line 5
    iget-object v2, v2, Lcom/google/android/material/internal/i;->f:Lcom/google/android/material/internal/i$c;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/google/android/material/internal/i$c;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v0, v2, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 14
    .line 15
    iget-object v2, v2, Lcom/google/android/material/internal/i;->f:Lcom/google/android/material/internal/i$c;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-ne v2, v3, :cond_1

    .line 25
    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v1
.end method

.method public G(Lcom/google/android/material/internal/i$l;I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/material/internal/i$c;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Lcom/google/android/material/internal/i$f;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$C;->a:Landroid/view/View;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 25
    .line 26
    iget v0, v0, Lcom/google/android/material/internal/i;->t:I

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/google/android/material/internal/i$f;->b()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 33
    .line 34
    iget v2, v2, Lcom/google/android/material/internal/i;->u:I

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/google/android/material/internal/i$f;->a()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$C;->a:Landroid/view/View;

    .line 45
    .line 46
    check-cast p1, Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/google/android/material/internal/i$g;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/g;->getTitle()Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 68
    .line 69
    iget v0, v0, Lcom/google/android/material/internal/i;->h:I

    .line 70
    .line 71
    invoke-static {p1, v0}, Landroidx/core/widget/i;->m(Landroid/widget/TextView;I)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 75
    .line 76
    iget v0, v0, Lcom/google/android/material/internal/i;->v:I

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v3, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 83
    .line 84
    iget v3, v3, Lcom/google/android/material/internal/i;->w:I

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/google/android/material/internal/i;->i:Landroid/content/res/ColorStateList;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/material/internal/i$c;->L(Landroid/view/View;IZ)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$C;->a:Landroid/view/View;

    .line 107
    .line 108
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/google/android/material/internal/i;->m:Landroid/content/res/ColorStateList;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 118
    .line 119
    iget v0, v0, Lcom/google/android/material/internal/i;->j:I

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextAppearance(I)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/google/android/material/internal/i;->l:Landroid/content/res/ColorStateList;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 134
    .line 135
    iget-object v0, v0, Lcom/google/android/material/internal/i;->n:Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_0

    .line 148
    :cond_5
    const/4 v0, 0x0

    .line 149
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 153
    .line 154
    iget-object v0, v0, Lcom/google/android/material/internal/i;->o:Landroid/graphics/drawable/RippleDrawable;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/graphics/drawable/RippleDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/e;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Lcom/google/android/material/internal/i$g;

    .line 176
    .line 177
    iget-boolean v1, v0, Lcom/google/android/material/internal/i$g;->b:Z

    .line 178
    .line 179
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setNeedsEmptyIcon(Z)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 183
    .line 184
    iget v2, v1, Lcom/google/android/material/internal/i;->p:I

    .line 185
    .line 186
    iget v1, v1, Lcom/google/android/material/internal/i;->q:I

    .line 187
    .line 188
    invoke-virtual {p1, v2, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 189
    .line 190
    .line 191
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 192
    .line 193
    iget v1, v1, Lcom/google/android/material/internal/i;->r:I

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconPadding(I)V

    .line 196
    .line 197
    .line 198
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 199
    .line 200
    iget-boolean v2, v1, Lcom/google/android/material/internal/i;->x:Z

    .line 201
    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    iget v1, v1, Lcom/google/android/material/internal/i;->s:I

    .line 205
    .line 206
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconSize(I)V

    .line 207
    .line 208
    .line 209
    :cond_7
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 210
    .line 211
    invoke-static {v1}, Lcom/google/android/material/internal/i;->c(Lcom/google/android/material/internal/i;)I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setMaxLines(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 223
    .line 224
    iget-boolean v1, v1, Lcom/google/android/material/internal/i;->k:Z

    .line 225
    .line 226
    invoke-virtual {p1, v0, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->D(Landroidx/appcompat/view/menu/g;Z)V

    .line 227
    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/i$c;->L(Landroid/view/View;IZ)V

    .line 231
    .line 232
    .line 233
    return-void
.end method

.method public H(Landroid/view/ViewGroup;I)Lcom/google/android/material/internal/i$l;
    .locals 2

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p2, v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    if-eq p2, p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Lcom/google/android/material/internal/i$b;

    .line 15
    .line 16
    iget-object p2, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 17
    .line 18
    iget-object p2, p2, Lcom/google/android/material/internal/i;->b:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    invoke-direct {p1, p2}, Lcom/google/android/material/internal/i$b;-><init>(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    new-instance p2, Lcom/google/android/material/internal/i$j;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/material/internal/i;->g:Landroid/view/LayoutInflater;

    .line 29
    .line 30
    invoke-direct {p2, v0, p1}, Lcom/google/android/material/internal/i$j;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :cond_2
    new-instance p2, Lcom/google/android/material/internal/i$k;

    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/google/android/material/internal/i;->g:Landroid/view/LayoutInflater;

    .line 39
    .line 40
    invoke-direct {p2, v0, p1}, Lcom/google/android/material/internal/i$k;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_3
    new-instance p2, Lcom/google/android/material/internal/i$i;

    .line 45
    .line 46
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->g:Lcom/google/android/material/internal/i;

    .line 47
    .line 48
    iget-object v1, v0, Lcom/google/android/material/internal/i;->g:Landroid/view/LayoutInflater;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/google/android/material/internal/i;->D:Landroid/view/View$OnClickListener;

    .line 51
    .line 52
    invoke-direct {p2, v1, p1, v0}, Lcom/google/android/material/internal/i$i;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    return-object p2
.end method

.method public I(Lcom/google/android/material/internal/i$l;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/internal/i$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$C;->a:Landroid/view/View;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuItemView;->E()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public K(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const-string v0, "android:menu:checked"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iput-boolean v2, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-ge v3, v2, :cond_1

    .line 21
    .line 22
    iget-object v4, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Lcom/google/android/material/internal/i$e;

    .line 29
    .line 30
    instance-of v5, v4, Lcom/google/android/material/internal/i$g;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    check-cast v4, Lcom/google/android/material/internal/i$g;

    .line 35
    .line 36
    invoke-virtual {v4}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4}, Landroidx/appcompat/view/menu/g;->getItemId()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-ne v5, v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lcom/google/android/material/internal/i$c;->M(Landroidx/appcompat/view/menu/g;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    iput-boolean v1, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 56
    .line 57
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->J()V

    .line 58
    .line 59
    .line 60
    :cond_2
    const-string v0, "android:menu:action_views"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    :goto_2
    if-ge v1, v0, :cond_7

    .line 75
    .line 76
    iget-object v2, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lcom/google/android/material/internal/i$e;

    .line 83
    .line 84
    instance-of v3, v2, Lcom/google/android/material/internal/i$g;

    .line 85
    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    check-cast v2, Lcom/google/android/material/internal/i$g;

    .line 90
    .line 91
    invoke-virtual {v2}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-nez v2, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->getActionView()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-nez v3, :cond_5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    invoke-virtual {v2}, Landroidx/appcompat/view/menu/g;->getItemId()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 114
    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    invoke-virtual {v3, v2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    return-void
.end method

.method public M(Landroidx/appcompat/view/menu/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->e:Landroidx/appcompat/view/menu/g;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->isCheckable()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->e:Landroidx/appcompat/view/menu/g;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/g;->setChecked(Z)Landroid/view/MenuItem;

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/internal/i$c;->e:Landroidx/appcompat/view/menu/g;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/g;->setChecked(Z)Landroid/view/MenuItem;

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_0
    return-void
.end method

.method public N(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/i$c;->f:Z

    .line 2
    .line 3
    return-void
.end method

.method public O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0}, Lcom/google/android/material/internal/i$c;->J()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->i()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p0, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->k(II)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(I)J
    .locals 2

    .line 1
    int-to-long v0, p1

    return-wide v0
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/i$c;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/material/internal/i$e;

    .line 8
    .line 9
    instance-of v0, p1, Lcom/google/android/material/internal/i$f;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    return p1

    .line 15
    :cond_0
    instance-of v0, p1, Lcom/google/android/material/internal/i$d;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    return p1

    .line 21
    :cond_1
    instance-of v0, p1, Lcom/google/android/material/internal/i$g;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    check-cast p1, Lcom/google/android/material/internal/i$g;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/android/material/internal/i$g;->a()Landroidx/appcompat/view/menu/g;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/g;->hasSubMenu()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_2
    const/4 p1, 0x0

    .line 40
    return p1

    .line 41
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Unknown item type."

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public bridge synthetic m(Landroidx/recyclerview/widget/RecyclerView$C;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/material/internal/i$l;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/internal/i$c;->G(Lcom/google/android/material/internal/i$l;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic o(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/internal/i$c;->H(Landroid/view/ViewGroup;I)Lcom/google/android/material/internal/i$l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic t(Landroidx/recyclerview/widget/RecyclerView$C;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/material/internal/i$l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/i$c;->I(Lcom/google/android/material/internal/i$l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
