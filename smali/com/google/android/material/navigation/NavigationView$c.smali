.class Lcom/google/android/material/navigation/NavigationView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/NavigationView;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    aget v0, v0, v1

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 26
    .line 27
    invoke-static {v3}, Lcom/google/android/material/navigation/NavigationView;->j(Lcom/google/android/material/navigation/NavigationView;)Lcom/google/android/material/internal/i;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v0}, Lcom/google/android/material/internal/i;->E(Z)V

    .line 32
    .line 33
    .line 34
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/google/android/material/navigation/NavigationView;->t()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move v0, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v0, v2

    .line 47
    :goto_1
    invoke-virtual {v3, v0}, Lcom/google/android/material/internal/k;->setDrawTopInsetForeground(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-ne v0, v1, :cond_2

    .line 57
    .line 58
    move v0, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move v0, v2

    .line 61
    :goto_2
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 62
    .line 63
    invoke-static {v3}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    aget v3, v3, v2

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 72
    .line 73
    invoke-static {v3}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    aget v3, v3, v2

    .line 78
    .line 79
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    add-int/2addr v3, v4

    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move v3, v2

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    :goto_3
    move v3, v1

    .line 92
    :goto_4
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 93
    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/google/android/material/navigation/NavigationView;->r()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    invoke-virtual {v4}, Lcom/google/android/material/navigation/NavigationView;->s()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    :goto_5
    move v3, v1

    .line 112
    goto :goto_6

    .line 113
    :cond_6
    move v3, v2

    .line 114
    :goto_6
    invoke-virtual {v4, v3}, Lcom/google/android/material/internal/k;->setDrawLeftInsetForeground(Z)V

    .line 115
    .line 116
    .line 117
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 118
    .line 119
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v3}, Lcom/google/android/material/internal/b;->a(Landroid/content/Context;)Landroid/app/Activity;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-eqz v3, :cond_e

    .line 128
    .line 129
    invoke-static {v3}, Lcom/google/android/material/internal/v;->a(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    iget-object v6, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 138
    .line 139
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    sub-int/2addr v5, v6

    .line 144
    iget-object v6, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 145
    .line 146
    invoke-static {v6}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    aget v6, v6, v1

    .line 151
    .line 152
    if-ne v5, v6, :cond_7

    .line 153
    .line 154
    move v5, v1

    .line 155
    goto :goto_7

    .line 156
    :cond_7
    move v5, v2

    .line 157
    :goto_7
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Landroid/view/Window;->getNavigationBarColor()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_8

    .line 170
    .line 171
    move v3, v1

    .line 172
    goto :goto_8

    .line 173
    :cond_8
    move v3, v2

    .line 174
    :goto_8
    iget-object v6, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 175
    .line 176
    if-eqz v5, :cond_9

    .line 177
    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    invoke-virtual {v6}, Lcom/google/android/material/navigation/NavigationView;->q()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    move v3, v1

    .line 187
    goto :goto_9

    .line 188
    :cond_9
    move v3, v2

    .line 189
    :goto_9
    invoke-virtual {v6, v3}, Lcom/google/android/material/internal/k;->setDrawBottomInsetForeground(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 197
    .line 198
    invoke-static {v5}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    aget v5, v5, v2

    .line 203
    .line 204
    if-eq v3, v5, :cond_b

    .line 205
    .line 206
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 211
    .line 212
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    sub-int/2addr v3, v4

    .line 217
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 218
    .line 219
    invoke-static {v4}, Lcom/google/android/material/navigation/NavigationView;->i(Lcom/google/android/material/navigation/NavigationView;)[I

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    aget v4, v4, v2

    .line 224
    .line 225
    if-ne v3, v4, :cond_a

    .line 226
    .line 227
    goto :goto_a

    .line 228
    :cond_a
    move v3, v2

    .line 229
    goto :goto_b

    .line 230
    :cond_b
    :goto_a
    move v3, v1

    .line 231
    :goto_b
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationView$c;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 232
    .line 233
    if-eqz v3, :cond_d

    .line 234
    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    invoke-virtual {v4}, Lcom/google/android/material/navigation/NavigationView;->s()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_d

    .line 242
    .line 243
    goto :goto_c

    .line 244
    :cond_c
    invoke-virtual {v4}, Lcom/google/android/material/navigation/NavigationView;->r()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_d

    .line 249
    .line 250
    goto :goto_c

    .line 251
    :cond_d
    move v1, v2

    .line 252
    :goto_c
    invoke-virtual {v4, v1}, Lcom/google/android/material/internal/k;->setDrawRightInsetForeground(Z)V

    .line 253
    .line 254
    .line 255
    :cond_e
    return-void
.end method
