.class public Lm0/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String; = "m0.O"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm0/O;->b:Z

    .line 6
    .line 7
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v1, "; *"

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    array-length v1, p0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    aget-object v3, p0, v2

    .line 22
    .line 23
    const-string v4, "charset="

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const/16 p0, 0x8

    .line 32
    .line 33
    invoke-virtual {v3, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_2

    .line 11
    .line 12
    :cond_1
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/net/URL;

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {p1, v2}, Lm0/O;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    invoke-virtual {v1}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {p1, v2}, Lm0/O;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2
    invoke-virtual {v1}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {p1, v2}, Lm0/O;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    return v0

    .line 63
    :cond_3
    invoke-virtual {v1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    const-string v1, ""

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    move-object p1, v1

    .line 76
    :cond_4
    if-nez p0, :cond_5

    .line 77
    .line 78
    move-object p0, v1

    .line 79
    :cond_5
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sub-int/2addr v1, v2

    .line 88
    const/4 v2, 0x1

    .line 89
    if-gt v1, v2, :cond_9

    .line 90
    .line 91
    const/4 v3, -0x1

    .line 92
    if-ge v1, v3, :cond_6

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_6
    if-nez v1, :cond_7

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    return p0

    .line 102
    :cond_7
    const-string v3, "/"

    .line 103
    .line 104
    if-ne v1, v2, :cond_8

    .line 105
    .line 106
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    return p0

    .line 126
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0

    .line 145
    return p0

    .line 146
    :catch_0
    :cond_9
    :goto_0
    return v0
.end method


# virtual methods
.method public b(Landroid/app/Activity;Lo0/h;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const-string v5, "text/html"

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    iget-boolean v7, v6, Lo0/a;->H:Z

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    if-nez v7, :cond_1

    .line 19
    .line 20
    iget-object v7, v6, Lo0/a;->I:Ljava/util/Map;

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-eqz v7, :cond_1

    .line 29
    .line 30
    :cond_0
    return-object v8

    .line 31
    :cond_1
    iget-boolean v7, v1, Lm0/O;->b:Z

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    iput-object v0, v1, Lm0/O;->a:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v4, v1, Lm0/O;->b:Z

    .line 38
    .line 39
    :cond_2
    iget-object v7, v1, Lm0/O;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v7, v0}, Lm0/O;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-nez v7, :cond_3

    .line 46
    .line 47
    return-object v8

    .line 48
    :cond_3
    :try_start_0
    new-instance v7, Ljava/net/URL;

    .line 49
    .line 50
    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    const-string v10, "http"

    .line 58
    .line 59
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-nez v10, :cond_4

    .line 64
    .line 65
    const-string v10, "https"

    .line 66
    .line 67
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    if-nez v9, :cond_4

    .line 72
    .line 73
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 77
    .line 78
    .line 79
    return-object v8

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object v10, v8

    .line 82
    goto/16 :goto_10

    .line 83
    .line 84
    :catch_0
    move-exception v0

    .line 85
    move-object v2, v8

    .line 86
    move-object v10, v2

    .line 87
    goto/16 :goto_f

    .line 88
    .line 89
    :cond_4
    :try_start_1
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    check-cast v9, Ljava/net/HttpURLConnection;

    .line 94
    .line 95
    invoke-virtual {v9, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v6, v7}, Lo0/a;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    const-string v10, "User-Agent"

    .line 107
    .line 108
    if-eqz v7, :cond_5

    .line 109
    .line 110
    :try_start_2
    invoke-virtual {v9, v10, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    iget-object v7, v6, Lo0/a;->z:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_6

    .line 121
    .line 122
    iget-object v7, v6, Lo0/a;->z:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v9, v10, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    new-instance v7, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface/range {p2 .. p2}, Lo0/h;->getDefaultUserAgent()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v11, " "

    .line 141
    .line 142
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v11, v6, Lo0/a;->k:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v9, v10, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_0
    const-string v7, "Cache-Control"

    .line 158
    .line 159
    const-string v10, "no-cache"

    .line 160
    .line 161
    invoke-virtual {v9, v7, v10}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    if-eqz v2, :cond_7

    .line 165
    .line 166
    const-string v7, "Referer"

    .line 167
    .line 168
    invoke-virtual {v9, v7, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    const-string v2, "Accept-Language"

    .line 172
    .line 173
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v7}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v9, v2, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, Lm0/q;->a(Landroid/content/Context;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-eqz v2, :cond_8

    .line 189
    .line 190
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-eqz v7, :cond_8

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    check-cast v7, Ljava/util/Map$Entry;

    .line 209
    .line 210
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    check-cast v10, Ljava/lang/String;

    .line 215
    .line 216
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    check-cast v7, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v9, v10, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_8
    invoke-virtual {v9}, Ljava/net/URLConnection;->connect()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    const/16 v7, 0x12d

    .line 234
    .line 235
    if-eq v2, v7, :cond_15

    .line 236
    .line 237
    const/16 v7, 0x12e

    .line 238
    .line 239
    if-eq v2, v7, :cond_15

    .line 240
    .line 241
    const/16 v7, 0x12f

    .line 242
    .line 243
    if-eq v2, v7, :cond_15

    .line 244
    .line 245
    const/16 v7, 0x133

    .line 246
    .line 247
    if-ne v2, v7, :cond_9

    .line 248
    .line 249
    goto/16 :goto_d

    .line 250
    .line 251
    :cond_9
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    if-nez v0, :cond_a

    .line 256
    .line 257
    :try_start_3
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 258
    .line 259
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    .line 265
    .line 266
    :goto_2
    move-object v2, v0

    .line 267
    goto :goto_3

    .line 268
    :catch_1
    :try_start_4
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 269
    .line 270
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :goto_3
    :try_start_5
    invoke-static {v2}, Ljava/net/URLConnection;->guessContentTypeFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    goto :goto_5

    .line 283
    :catchall_1
    move-exception v0

    .line 284
    move-object v10, v8

    .line 285
    :goto_4
    move-object v8, v2

    .line 286
    goto/16 :goto_10

    .line 287
    .line 288
    :catch_2
    move-exception v0

    .line 289
    move-object v10, v8

    .line 290
    goto/16 :goto_f

    .line 291
    .line 292
    :cond_a
    move-object v2, v8

    .line 293
    :goto_5
    if-eqz v0, :cond_14

    .line 294
    .line 295
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-nez v7, :cond_b

    .line 300
    .line 301
    goto/16 :goto_c

    .line 302
    .line 303
    :cond_b
    invoke-static {v0}, Lm0/O;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 307
    const-string v7, "UTF-8"

    .line 308
    .line 309
    if-nez v0, :cond_c

    .line 310
    .line 311
    move-object v0, v7

    .line 312
    goto :goto_6

    .line 313
    :cond_c
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    const-string v11, "iso-8859-1"

    .line 318
    .line 319
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    if-eqz v10, :cond_d

    .line 324
    .line 325
    const-string v0, "windows-1252"
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 326
    .line 327
    :cond_d
    :goto_6
    if-nez v2, :cond_e

    .line 328
    .line 329
    :try_start_7
    new-instance v10, Ljava/io/BufferedInputStream;

    .line 330
    .line 331
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 332
    .line 333
    .line 334
    move-result-object v11

    .line 335
    invoke-direct {v10, v11}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 336
    .line 337
    .line 338
    :goto_7
    move-object v2, v10

    .line 339
    goto :goto_8

    .line 340
    :catch_3
    :try_start_8
    new-instance v10, Ljava/io/BufferedInputStream;

    .line 341
    .line 342
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    invoke-direct {v10, v11}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 347
    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_e
    :goto_8
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    if-gez v9, :cond_f

    .line 355
    .line 356
    const/16 v9, 0x2800

    .line 357
    .line 358
    :cond_f
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 359
    .line 360
    invoke-direct {v10, v9}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 361
    .line 362
    .line 363
    :try_start_9
    invoke-static {v2, v10}, Lm0/P;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 364
    .line 365
    .line 366
    :try_start_a
    invoke-virtual {v10, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0
    :try_end_a
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 370
    goto :goto_9

    .line 371
    :catchall_2
    move-exception v0

    .line 372
    goto :goto_4

    .line 373
    :catch_4
    move-exception v0

    .line 374
    goto/16 :goto_f

    .line 375
    .line 376
    :catch_5
    :try_start_b
    invoke-virtual {v10, v7}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    :goto_9
    const-string v11, "</head>"

    .line 381
    .line 382
    invoke-virtual {v0, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-ltz v11, :cond_13

    .line 387
    .line 388
    new-instance v12, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v3, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    iget-object v9, v6, Lo0/a;->J:Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v9, :cond_10

    .line 403
    .line 404
    const-string v9, "<meta name=\"viewport\" content=\""

    .line 405
    .line 406
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    iget-object v9, v6, Lo0/a;->J:Ljava/lang/String;

    .line 410
    .line 411
    invoke-static {v9}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v9

    .line 415
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v9, "\" />"

    .line 419
    .line 420
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    :cond_10
    iget-wide v13, v6, Lo0/a;->N0:D

    .line 424
    .line 425
    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    .line 426
    .line 427
    .line 428
    move-result v9

    .line 429
    if-nez v9, :cond_12

    .line 430
    .line 431
    iget-boolean v9, v6, Lo0/a;->K:Z

    .line 432
    .line 433
    if-eqz v9, :cond_11

    .line 434
    .line 435
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 436
    .line 437
    const-string v13, "<meta name=\"viewport\" content=\"width=%f,maximum-scale=1.0\" />"

    .line 438
    .line 439
    iget-wide v14, v6, Lo0/a;->N0:D

    .line 440
    .line 441
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    new-array v4, v4, [Ljava/lang/Object;

    .line 446
    .line 447
    aput-object v6, v4, v3

    .line 448
    .line 449
    invoke-static {v9, v13, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_11
    invoke-interface/range {p2 .. p2}, Lo0/h;->getWidth()I

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    int-to-float v9, v9

    .line 462
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 463
    .line 464
    .line 465
    move-result-object v13

    .line 466
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 467
    .line 468
    .line 469
    move-result-object v13

    .line 470
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 471
    .line 472
    div-float/2addr v9, v13

    .line 473
    float-to-double v13, v9

    .line 474
    move/from16 v16, v3

    .line 475
    .line 476
    move v15, v4

    .line 477
    iget-wide v3, v6, Lo0/a;->N0:D

    .line 478
    .line 479
    div-double/2addr v13, v3

    .line 480
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 481
    .line 482
    const-string v9, "<meta name=\"viewport\" content=\"width=%f,initial-scale=%f,minimum-scale=%f,maximum-scale=%f\" />"

    .line 483
    .line 484
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 493
    .line 494
    .line 495
    move-result-object v17

    .line 496
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 497
    .line 498
    .line 499
    move-result-object v13

    .line 500
    const/4 v14, 0x4

    .line 501
    new-array v14, v14, [Ljava/lang/Object;

    .line 502
    .line 503
    aput-object v3, v14, v16

    .line 504
    .line 505
    aput-object v4, v14, v15

    .line 506
    .line 507
    const/4 v3, 0x2

    .line 508
    aput-object v17, v14, v3

    .line 509
    .line 510
    const/4 v3, 0x3

    .line 511
    aput-object v13, v14, v3

    .line 512
    .line 513
    invoke-static {v6, v9, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    :cond_12
    :goto_a
    invoke-virtual {v0, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    goto :goto_b

    .line 532
    :cond_13
    sget-object v3, Lm0/O;->c:Ljava/lang/String;

    .line 533
    .line 534
    const-string v4, "could not find closing </head> tag"

    .line 535
    .line 536
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 537
    .line 538
    .line 539
    :goto_b
    new-instance v3, Landroid/webkit/WebResourceResponse;

    .line 540
    .line 541
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 542
    .line 543
    invoke-virtual {v0, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 548
    .line 549
    .line 550
    invoke-direct {v3, v5, v7, v4}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 551
    .line 552
    .line 553
    invoke-static {v2}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v10}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 557
    .line 558
    .line 559
    return-object v3

    .line 560
    :cond_14
    :goto_c
    invoke-static {v2}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 564
    .line 565
    .line 566
    return-object v8

    .line 567
    :cond_15
    :goto_d
    :try_start_c
    const-string v2, "Location"

    .line 568
    .line 569
    invoke-virtual {v9, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 574
    .line 575
    .line 576
    :try_start_d
    new-instance v3, Ljava/net/URL;

    .line 577
    .line 578
    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/net/MalformedURLException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 579
    .line 580
    .line 581
    goto :goto_e

    .line 582
    :catch_6
    :try_start_e
    new-instance v3, Ljava/net/URL;

    .line 583
    .line 584
    invoke-direct {v3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    new-instance v4, Ljava/net/URL;

    .line 588
    .line 589
    invoke-direct {v4, v3, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    :goto_e
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    if-nez v3, :cond_16

    .line 601
    .line 602
    move-object/from16 v3, p1

    .line 603
    .line 604
    move-object/from16 v4, p2

    .line 605
    .line 606
    invoke-virtual {v1, v3, v4, v2, v0}, Lm0/O;->b(Landroid/app/Activity;Lo0/h;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 607
    .line 608
    .line 609
    move-result-object v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 610
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 611
    .line 612
    .line 613
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 614
    .line 615
    .line 616
    return-object v0

    .line 617
    :cond_16
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 618
    .line 619
    .line 620
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 621
    .line 622
    .line 623
    return-object v8

    .line 624
    :goto_f
    :try_start_f
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    sget-object v4, Lm0/O;->c:Ljava/lang/String;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v3, v4, v5, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 635
    .line 636
    .line 637
    invoke-static {v2}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 638
    .line 639
    .line 640
    invoke-static {v10}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 641
    .line 642
    .line 643
    return-object v8

    .line 644
    :goto_10
    invoke-static {v8}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 645
    .line 646
    .line 647
    invoke-static {v10}, Lm0/P;->a(Ljava/io/Closeable;)V

    .line 648
    .line 649
    .line 650
    throw v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/O;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
