.class Lco/median/android/y$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lco/median/android/y$a;

.field private b:Lco/median/android/y;

.field private c:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lco/median/android/y$a;Lco/median/android/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lco/median/android/y$b;->a:Lco/median/android/y$a;

    .line 5
    .line 6
    iput-object p3, p0, Lco/median/android/y$b;->b:Lco/median/android/y;

    .line 7
    .line 8
    iput-object p1, p0, Lco/median/android/y$b;->c:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 1
    new-instance p1, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/median/android/y$b;->b:Lco/median/android/y;

    .line 7
    .line 8
    invoke-static {v0}, Lco/median/android/y;->a(Lco/median/android/y;)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lm0/U;->b(Landroid/content/Context;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lco/median/android/y$b;->c:Landroid/content/Context;

    .line 20
    .line 21
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 22
    .line 23
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->c()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lco/median/android/y$b;->c:Landroid/content/Context;

    .line 30
    .line 31
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 32
    .line 33
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->c()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lco/median/android/y$b;->b:Lco/median/android/y;

    .line 41
    .line 42
    invoke-static {v0}, Lco/median/android/y;->b(Lco/median/android/y;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lco/median/android/y$b;->b:Lco/median/android/y;

    .line 49
    .line 50
    invoke-static {v0}, Lco/median/android/y;->b(Lco/median/android/y;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v3, "customData_"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v3, p0, Lco/median/android/y$b;->b:Lco/median/android/y;

    .line 88
    .line 89
    invoke-static {v3}, Lco/median/android/y;->b(Lco/median/android/y;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Ljava/net/URL;

    .line 107
    .line 108
    iget-object v1, p0, Lco/median/android/y$b;->a:Lco/median/android/y$a;

    .line 109
    .line 110
    invoke-static {v1}, Lco/median/android/y$a;->a(Lco/median/android/y$a;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 122
    .line 123
    const-string v1, "POST"

    .line 124
    .line 125
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-string v1, "Content-Type"

    .line 129
    .line 130
    const-string v2, "application/json"

    .line 131
    .line 132
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v1, 0x1

    .line 136
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 137
    .line 138
    .line 139
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const-string v3, "UTF-8"

    .line 146
    .line 147
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    const/16 v0, 0xc8

    .line 168
    .line 169
    if-lt p1, v0, :cond_2

    .line 170
    .line 171
    const/16 v0, 0x12b

    .line 172
    .line 173
    if-le p1, v0, :cond_3

    .line 174
    .line 175
    :cond_2
    invoke-static {}, Lco/median/android/y;->c()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v2, "Recevied status code "

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string p1, " when posting to "

    .line 193
    .line 194
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lco/median/android/y$b;->a:Lco/median/android/y$a;

    .line 198
    .line 199
    invoke-static {p1}, Lco/median/android/y$a;->a(Lco/median/android/y$a;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :catch_0
    move-exception p1

    .line 215
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {}, Lco/median/android/y;->c()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const-string v3, "Error posting to "

    .line 229
    .line 230
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    iget-object v3, p0, Lco/median/android/y$b;->a:Lco/median/android/y$a;

    .line 234
    .line 235
    invoke-static {v3}, Lco/median/android/y$a;->a(Lco/median/android/y$a;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 247
    .line 248
    .line 249
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 250
    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lco/median/android/y$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
