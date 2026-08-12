.class Lco/median/android/DownloadService$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/DownloadService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/net/HttpURLConnection;

.field private e:Ljava/io/InputStream;

.field private f:Ljava/io/FileOutputStream;

.field private g:Ljava/io/File;

.field private h:Landroid/net/Uri;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Z

.field private final n:Lco/median/android/d$d;

.field private final o:Lco/median/android/DownloadService$b;

.field p:Ljava/util/concurrent/atomic/AtomicReference;

.field private q:Z

.field final synthetic r:Lco/median/android/DownloadService;


# direct methods
.method public constructor <init>(Lco/median/android/DownloadService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLco/median/android/d$d;Lco/median/android/DownloadService$b;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 11
    .line 12
    invoke-static {p1}, Lco/median/android/DownloadService;->a(Lco/median/android/DownloadService;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1, v2}, Lco/median/android/DownloadService;->e(Lco/median/android/DownloadService;I)V

    .line 19
    .line 20
    .line 21
    iput v1, p0, Lco/median/android/DownloadService$c;->a:I

    .line 22
    .line 23
    iput-object p2, p0, Lco/median/android/DownloadService$c;->b:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p3, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p4, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 28
    .line 29
    iput-boolean v0, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 30
    .line 31
    iput-boolean p5, p0, Lco/median/android/DownloadService$c;->l:Z

    .line 32
    .line 33
    iput-boolean p6, p0, Lco/median/android/DownloadService$c;->m:Z

    .line 34
    .line 35
    iput-object p7, p0, Lco/median/android/DownloadService$c;->n:Lco/median/android/d$d;

    .line 36
    .line 37
    iput-object p8, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 38
    .line 39
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lco/median/android/DownloadService$c;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    return-void
.end method

.method public static synthetic a(Lco/median/android/DownloadService$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->k()V

    return-void
.end method

.method public static synthetic b(Lco/median/android/DownloadService$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->j()V

    return-void
.end method

.method private e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ";"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v4, "download"

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const-string v2, "filename="

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v5, -0x1

    .line 53
    if-eq v2, v5, :cond_1

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x9

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eq v1, v5, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 77
    .line 78
    :cond_1
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iput-object v4, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 87
    .line 88
    :cond_2
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_3

    .line 95
    .line 96
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v1}, Lco/median/android/d;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    iput-object v1, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    iget-object v2, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    sub-int/2addr v4, v1

    .line 131
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iput-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v2, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 148
    .line 149
    :cond_3
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->g()V

    .line 150
    .line 151
    .line 152
    const-string v1, ";base64"

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_4

    .line 159
    .line 160
    const-string v1, ";base64,"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    add-int/lit8 v1, v1, 0x8

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v1, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 177
    .line 178
    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_4
    const-string v1, ","

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v1, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 195
    .line 196
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method private f()V
    .locals 9

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/DownloadService$c;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    iput-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    iget-object v2, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 23
    .line 24
    invoke-static {v2}, Lco/median/android/DownloadService;->d(Lco/median/android/DownloadService;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "User-Agent"

    .line 29
    .line 30
    invoke-virtual {v0, v3, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    const/16 v2, 0x1388

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v2, 0xc8

    .line 52
    .line 53
    const-string v3, "DownloadService"

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    if-eq v0, v2, :cond_0

    .line 57
    .line 58
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v2, "Server returned HTTP "

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v2, " "

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v3, v1}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v4, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 103
    .line 104
    iget-object v0, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "Response code: "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-object v2, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v2, ". "

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget-object v2, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v0, v1}, Lco/median/android/DownloadService$b;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    int-to-double v5, v0

    .line 154
    const-wide/high16 v7, 0x4130000000000000L    # 1048576.0

    .line 155
    .line 156
    div-double/2addr v5, v7

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v2, "startDownload: File size in MB: "

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 178
    .line 179
    const-string v2, "Content-Type"

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_1

    .line 186
    .line 187
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 188
    .line 189
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 194
    .line 195
    :cond_1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    const/4 v2, -0x1

    .line 202
    const-string v5, "download"

    .line 203
    .line 204
    if-nez v0, :cond_4

    .line 205
    .line 206
    iget-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v0}, Lco/median/android/d;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iput-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_2

    .line 219
    .line 220
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iput-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_2
    iget-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v6, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v0, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    iput-object v5, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_3
    iget-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    iget-object v6, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    add-int/2addr v6, v1

    .line 260
    sub-int/2addr v5, v6

    .line 261
    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 266
    .line 267
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    iget-object v1, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iput-object v0, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_4
    iget-object v0, p0, Lco/median/android/DownloadService$c;->b:Ljava/lang/String;

    .line 281
    .line 282
    iget-object v6, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 283
    .line 284
    const-string v7, "Content-Disposition"

    .line 285
    .line 286
    invoke-virtual {v6, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    iget-object v7, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v0, v6, v7}, Lo0/j;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    const/16 v6, 0x2e

    .line 297
    .line 298
    invoke-virtual {v0, v6}, Ljava/lang/String;->lastIndexOf(I)I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-ne v6, v2, :cond_5

    .line 303
    .line 304
    iput-object v0, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 305
    .line 306
    const-string v0, ""

    .line 307
    .line 308
    iput-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 309
    .line 310
    goto :goto_0

    .line 311
    :cond_5
    if-nez v6, :cond_6

    .line 312
    .line 313
    iput-object v5, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iput-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 320
    .line 321
    goto :goto_0

    .line 322
    :cond_6
    invoke-virtual {v0, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    iput-object v5, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 327
    .line 328
    add-int/2addr v6, v1

    .line 329
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iput-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 334
    .line 335
    :goto_0
    iget-object v0, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 336
    .line 337
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_7

    .line 342
    .line 343
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iget-object v1, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    iput-object v0, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 354
    .line 355
    :cond_7
    :goto_1
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->g()V

    .line 356
    .line 357
    .line 358
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    iget-object v1, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    iput-object v1, p0, Lco/median/android/DownloadService$c;->e:Ljava/io/InputStream;

    .line 371
    .line 372
    const/16 v1, 0x1000

    .line 373
    .line 374
    new-array v1, v1, [B

    .line 375
    .line 376
    move v5, v4

    .line 377
    :goto_2
    iget-object v6, p0, Lco/median/android/DownloadService$c;->e:Ljava/io/InputStream;

    .line 378
    .line 379
    invoke-virtual {v6, v1}, Ljava/io/InputStream;->read([B)I

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    if-eq v6, v2, :cond_8

    .line 384
    .line 385
    iget-boolean v7, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 386
    .line 387
    if-eqz v7, :cond_8

    .line 388
    .line 389
    iget-object v7, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 390
    .line 391
    invoke-virtual {v7, v1, v4, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 392
    .line 393
    .line 394
    add-int/2addr v5, v6

    .line 395
    mul-int/lit8 v6, v5, 0x64

    .line 396
    .line 397
    div-int/2addr v6, v0

    .line 398
    new-instance v7, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const-string v8, "startDownload: Download progress: "

    .line 404
    .line 405
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    .line 417
    .line 418
    goto :goto_2

    .line 419
    :cond_8
    return-void
.end method

.method private g()V
    .locals 5

    .line 1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->n:Lco/median/android/d$d;

    .line 2
    .line 3
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_4

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1c

    .line 10
    .line 11
    if-le v0, v1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v1, p0, Lco/median/android/DownloadService$c;->l:Z

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 29
    .line 30
    const-string v3, "image"

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v4, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v3, v4}, Lco/median/android/d;->k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 54
    .line 55
    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0, v1, v3, v4}, Lco/median/android/d;->k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 62
    .line 63
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->l:Z

    .line 64
    .line 65
    :goto_0
    iget-object v1, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    iget-object v2, p0, Lco/median/android/DownloadService$c;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 70
    .line 71
    invoke-static {v1, v0}, Lco/median/android/d;->r(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/io/FileOutputStream;

    .line 85
    .line 86
    iput-object v0, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 90
    .line 91
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 92
    .line 93
    invoke-static {v0}, Lco/median/android/DownloadService;->c(Lco/median/android/DownloadService;)Landroid/os/Handler;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Lco/median/android/c;

    .line 98
    .line 99
    invoke-direct {v1, p0}, Lco/median/android/c;-><init>(Lco/median/android/DownloadService$c;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v2, "Error creating file - filename: "

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, ", mimetype: "

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const-string v2, "DownloadService"

    .line 139
    .line 140
    invoke-virtual {v0, v2, v1}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->l:Z

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v2, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v0, v1, v2}, Lco/median/android/d;->m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v2, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v0, v1, v2}, Lco/median/android/d;->m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iput-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 180
    .line 181
    :goto_1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 182
    .line 183
    iget-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ljava/io/FileOutputStream;

    .line 193
    .line 194
    iget-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 195
    .line 196
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 197
    .line 198
    .line 199
    iput-object v0, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 200
    .line 201
    return-void

    .line 202
    :cond_4
    const/4 v0, 0x1

    .line 203
    iput-boolean v0, p0, Lco/median/android/DownloadService$c;->m:Z

    .line 204
    .line 205
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 206
    .line 207
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v1, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, p0, Lco/median/android/DownloadService$c;->j:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v0, v1, v2}, Lco/median/android/d;->m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iput-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 220
    .line 221
    iget-object v1, p0, Lco/median/android/DownloadService$c;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Ljava/io/FileOutputStream;

    .line 231
    .line 232
    iget-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 233
    .line 234
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 235
    .line 236
    .line 237
    iput-object v0, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 238
    .line 239
    return-void
.end method

.method private synthetic j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 2
    .line 3
    const v1, 0x7f120064

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private synthetic k()V
    .locals 9

    .line 1
    const-string v0, "DownloadService"

    .line 2
    .line 3
    const-string v1, "startDownload: Thread started"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    iget-object v0, p0, Lco/median/android/DownloadService$c;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const v5, 0x2eefaa

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x2

    .line 31
    const/4 v7, 0x1

    .line 32
    if-eq v4, v5, :cond_2

    .line 33
    .line 34
    const v5, 0x310888    # 4.503E-39f

    .line 35
    .line 36
    .line 37
    if-eq v4, v5, :cond_1

    .line 38
    .line 39
    const v5, 0x5f008eb

    .line 40
    .line 41
    .line 42
    if-eq v4, v5, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v4, "https"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    move v3, v7

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_1
    const-string v4, "http"

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    move v3, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const-string v4, "data"

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    move v3, v6

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    const/4 v3, -0x1

    .line 82
    :goto_1
    if-eqz v3, :cond_6

    .line 83
    .line 84
    if-eq v3, v7, :cond_6

    .line 85
    .line 86
    if-eq v3, v6, :cond_5

    .line 87
    .line 88
    iget-object v3, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 89
    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v5, "Unsupported URI scheme: "

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v3, v0}, Lco/median/android/DownloadService$b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 115
    .line 116
    if-nez v0, :cond_4

    .line 117
    .line 118
    iget-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 123
    .line 124
    .line 125
    :cond_4
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 126
    .line 127
    iput-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 128
    .line 129
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 130
    .line 131
    invoke-virtual {p0}, Lco/median/android/DownloadService$c;->d()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_5
    :try_start_1
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->e()V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    invoke-direct {p0}, Lco/median/android/DownloadService$c;->f()V

    .line 140
    .line 141
    .line 142
    :goto_3
    iput-boolean v7, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 143
    .line 144
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 145
    .line 146
    iget-object v0, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 147
    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    iget-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 151
    .line 152
    if-eqz v0, :cond_7

    .line 153
    .line 154
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 155
    .line 156
    new-instance v3, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v4, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v4, ".fileprovider"

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget-object v4, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 184
    .line 185
    invoke-static {v0, v3, v4}, Landroidx/core/content/FileProvider;->h(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iput-object v0, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 190
    .line 191
    :cond_7
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 192
    .line 193
    invoke-static {v0}, Lco/median/android/DownloadService;->b(Lco/median/android/DownloadService;)Lco/median/android/d;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    iget-object v0, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 200
    .line 201
    invoke-static {v0}, Lco/median/android/DownloadService;->b(Lco/median/android/DownloadService;)Lco/median/android/d;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    iget-object v4, p0, Lco/median/android/DownloadService$c;->h:Landroid/net/Uri;

    .line 206
    .line 207
    iget-object v5, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 208
    .line 209
    iget-boolean v6, p0, Lco/median/android/DownloadService$c;->l:Z

    .line 210
    .line 211
    iget-boolean v7, p0, Lco/median/android/DownloadService$c;->m:Z

    .line 212
    .line 213
    iget-object v0, p0, Lco/median/android/DownloadService$c;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    move-object v8, v0

    .line 220
    check-cast v8, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual/range {v3 .. v8}, Lco/median/android/d;->w(Landroid/net/Uri;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_8
    iget-object v0, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 226
    .line 227
    invoke-interface {v0}, Lco/median/android/DownloadService$b;->onSuccess()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    .line 229
    .line 230
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 231
    .line 232
    if-nez v0, :cond_4

    .line 233
    .line 234
    iget-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 235
    .line 236
    if-eqz v0, :cond_4

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :goto_4
    :try_start_2
    iget-object v3, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 240
    .line 241
    new-instance v4, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v5, "Unexpected error occurred: "

    .line 247
    .line 248
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v3, v0}, Lco/median/android/DownloadService$b;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 263
    .line 264
    .line 265
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 266
    .line 267
    if-nez v0, :cond_9

    .line 268
    .line 269
    iget-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 270
    .line 271
    if-eqz v0, :cond_9

    .line 272
    .line 273
    :goto_5
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 274
    .line 275
    .line 276
    :cond_9
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 277
    .line 278
    iput-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 279
    .line 280
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 281
    .line 282
    invoke-virtual {p0}, Lco/median/android/DownloadService$c;->d()V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :catch_1
    :try_start_3
    iget-object v0, p0, Lco/median/android/DownloadService$c;->o:Lco/median/android/DownloadService$b;

    .line 287
    .line 288
    new-instance v3, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v4, "Failed to create download file. filename = "

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    iget-object v4, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string v4, ", mimetype = "

    .line 304
    .line 305
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    iget-object v4, p0, Lco/median/android/DownloadService$c;->k:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v4, "."

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-interface {v0, v3}, Lco/median/android/DownloadService$b;->a(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 323
    .line 324
    .line 325
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 326
    .line 327
    if-nez v0, :cond_9

    .line 328
    .line 329
    iget-object v0, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 330
    .line 331
    if-eqz v0, :cond_9

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :goto_6
    return-void

    .line 335
    :goto_7
    iget-boolean v3, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 336
    .line 337
    if-nez v3, :cond_a

    .line 338
    .line 339
    iget-object v3, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 340
    .line 341
    if-eqz v3, :cond_a

    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 344
    .line 345
    .line 346
    :cond_a
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 347
    .line 348
    iput-object v1, p0, Lco/median/android/DownloadService$c;->g:Ljava/io/File;

    .line 349
    .line 350
    iput-boolean v2, p0, Lco/median/android/DownloadService$c;->q:Z

    .line 351
    .line 352
    invoke-virtual {p0}, Lco/median/android/DownloadService$c;->d()V

    .line 353
    .line 354
    .line 355
    throw v0
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, Lco/median/android/DownloadService$c;->r:Lco/median/android/DownloadService;

    .line 12
    .line 13
    const v4, 0x7f120051

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, " "

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lco/median/android/DownloadService$c;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public d()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lco/median/android/DownloadService$c;->e:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    iget-object v0, p0, Lco/median/android/DownloadService$c;->f:Ljava/io/FileOutputStream;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lco/median/android/DownloadService$c;->d:Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_1
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "DownloadService"

    .line 31
    .line 32
    const-string v3, "startDownload: "

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/DownloadService$c;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public l()V
    .locals 2

    .line 1
    const-string v0, "DownloadService"

    .line 2
    .line 3
    const-string v1, "startDownload: Starting download"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lco/median/android/DownloadService$c;->c:Z

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Thread;

    .line 12
    .line 13
    new-instance v1, Lco/median/android/b;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lco/median/android/b;-><init>(Lco/median/android/DownloadService$c;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
