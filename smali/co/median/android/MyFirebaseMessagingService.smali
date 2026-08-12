.class public Lco/median/android/MyFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Lco/median/android/MyFirebaseMessagingService;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MyFirebaseMessagingService;->w(Ljava/lang/String;)V

    return-void
.end method

.method private v(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x1388

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return-object p1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "Error downloading image: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "MyFirebaseMsgService"

    .line 59
    .line 60
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1
.end method

.method private synthetic w(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    const-string v1, "MyFirebaseMsgService"

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 6
    .line 7
    const-string v3, "/api/save_fcm_token.php"

    .line 8
    .line 9
    invoke-static {p0, v3}, Lm0/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    const-string v3, "POST"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 29
    .line 30
    .line 31
    const/16 v3, 0x2710

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 37
    .line 38
    .line 39
    const-string v3, "Content-Type"

    .line 40
    .line 41
    const-string v4, "application/x-www-form-urlencoded"

    .line 42
    .line 43
    invoke-virtual {v2, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "fcm_token="

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, "&platform=android"

    .line 64
    .line 65
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v3, "Token sent to server, response code: "

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    new-instance p1, Ljava/io/BufferedReader;

    .line 114
    .line 115
    new-instance v0, Ljava/io/InputStreamReader;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-eqz v2, :cond_0

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :catch_0
    move-exception p1

    .line 143
    goto :goto_1

    .line 144
    :cond_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    .line 145
    .line 146
    .line 147
    new-instance p1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v2, "Server response: "

    .line 153
    .line 154
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v2, "Error sending token to server: "

    .line 178
    .line 179
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method private x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x24000000

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    const-string v1, "click_url"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    :cond_0
    if-eqz p5, :cond_1

    .line 21
    .line 22
    const-string p4, "flash_msg"

    .line 23
    .line 24
    invoke-virtual {v0, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    :cond_1
    if-eqz p6, :cond_2

    .line 28
    .line 29
    const-string p4, "is_external_url"

    .line 30
    .line 31
    invoke-virtual {v0, p4, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide p4

    .line 38
    long-to-int p4, p4

    .line 39
    const/high16 p5, 0x44000000    # 512.0f

    .line 40
    .line 41
    invoke-static {p0, p4, v0, p5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    const-string p5, "notification"

    .line 46
    .line 47
    invoke-virtual {p0, p5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p5

    .line 51
    check-cast p5, Landroid/app/NotificationManager;

    .line 52
    .line 53
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v0, 0x1a

    .line 56
    .line 57
    const-string v1, "fcm_default_channel"

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    if-lt p6, v0, :cond_3

    .line 61
    .line 62
    const-string p6, "General Notifications"

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    invoke-static {v1, p6, v0}, Lm0/i0;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 66
    .line 67
    .line 68
    move-result-object p6

    .line 69
    const-string v0, "Alerts from Admin"

    .line 70
    .line 71
    invoke-static {p6, v0}, Lm0/d0;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p6, v2}, Lm0/f0;->a(Landroid/app/NotificationChannel;Z)V

    .line 75
    .line 76
    .line 77
    invoke-static {p6, v2}, Lm0/e0;->a(Landroid/app/NotificationChannel;Z)V

    .line 78
    .line 79
    .line 80
    invoke-static {p6, v2}, Lm0/g0;->a(Landroid/app/NotificationChannel;Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {p5, p6}, Lm0/h0;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    new-instance p6, Lx/l$e;

    .line 87
    .line 88
    invoke-direct {p6, p0, v1}, Lx/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const v0, 0x1080093

    .line 92
    .line 93
    .line 94
    invoke-virtual {p6, v0}, Lx/l$e;->t(I)Lx/l$e;

    .line 95
    .line 96
    .line 97
    move-result-object p6

    .line 98
    invoke-virtual {p6, p1}, Lx/l$e;->j(Ljava/lang/CharSequence;)Lx/l$e;

    .line 99
    .line 100
    .line 101
    move-result-object p6

    .line 102
    invoke-virtual {p6, p2}, Lx/l$e;->i(Ljava/lang/CharSequence;)Lx/l$e;

    .line 103
    .line 104
    .line 105
    move-result-object p6

    .line 106
    invoke-virtual {p6, v2}, Lx/l$e;->e(Z)Lx/l$e;

    .line 107
    .line 108
    .line 109
    move-result-object p6

    .line 110
    invoke-virtual {p6, v2}, Lx/l$e;->r(I)Lx/l$e;

    .line 111
    .line 112
    .line 113
    move-result-object p6

    .line 114
    const/4 v0, -0x1

    .line 115
    invoke-virtual {p6, v0}, Lx/l$e;->k(I)Lx/l$e;

    .line 116
    .line 117
    .line 118
    move-result-object p6

    .line 119
    invoke-virtual {p6, p4}, Lx/l$e;->h(Landroid/app/PendingIntent;)Lx/l$e;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    if-eqz p3, :cond_4

    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result p6

    .line 129
    if-nez p6, :cond_4

    .line 130
    .line 131
    invoke-direct {p0, p3}, Lco/median/android/MyFirebaseMessagingService;->v(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    if-eqz p3, :cond_5

    .line 136
    .line 137
    invoke-virtual {p4, p3}, Lx/l$e;->n(Landroid/graphics/Bitmap;)Lx/l$e;

    .line 138
    .line 139
    .line 140
    move-result-object p6

    .line 141
    new-instance v0, Lx/l$b;

    .line 142
    .line 143
    invoke-direct {v0}, Lx/l$b;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p3}, Lx/l$b;->i(Landroid/graphics/Bitmap;)Lx/l$b;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    const/4 v0, 0x0

    .line 151
    invoke-virtual {p3, v0}, Lx/l$b;->h(Landroid/graphics/Bitmap;)Lx/l$b;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-virtual {p3, p1}, Lx/l$b;->j(Ljava/lang/CharSequence;)Lx/l$b;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1, p2}, Lx/l$b;->k(Ljava/lang/CharSequence;)Lx/l$b;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p6, p1}, Lx/l$e;->v(Lx/l$f;)Lx/l$e;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_4
    if-eqz p2, :cond_5

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result p3

    .line 173
    if-nez p3, :cond_5

    .line 174
    .line 175
    new-instance p3, Lx/l$c;

    .line 176
    .line 177
    invoke-direct {p3}, Lx/l$c;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3, p2}, Lx/l$c;->h(Ljava/lang/CharSequence;)Lx/l$c;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p2, p1}, Lx/l$c;->i(Ljava/lang/CharSequence;)Lx/l$c;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p4, p1}, Lx/l$e;->v(Lx/l$f;)Lx/l$e;

    .line 189
    .line 190
    .line 191
    :cond_5
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 192
    .line 193
    .line 194
    move-result-wide p1

    .line 195
    long-to-int p1, p1

    .line 196
    invoke-virtual {p4}, Lx/l$e;->b()Landroid/app/Notification;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p5, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method private y(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lm0/Q0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lm0/Q0;-><init>(Lco/median/android/MyFirebaseMessagingService;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public p(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 13

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "From: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getFrom()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "MyFirebaseMsgService"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    const-string v0, "power"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/os/PowerManager;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const v2, 0x1000000a

    .line 38
    .line 39
    .line 40
    const-string v3, "MyApp::NotificationWakeLock"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-wide/16 v2, 0x1388

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const-string v3, "New Notification"

    .line 60
    .line 61
    const-string v4, "Tap to view."

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Lcom/google/firebase/messaging/RemoteMessage$b;->d()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Lcom/google/firebase/messaging/RemoteMessage$b;->d()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    :cond_1
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Lcom/google/firebase/messaging/RemoteMessage$b;->a()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Lcom/google/firebase/messaging/RemoteMessage$b;->a()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    :cond_2
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lcom/google/firebase/messaging/RemoteMessage$b;->b()Landroid/net/Uri;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->d()Lcom/google/firebase/messaging/RemoteMessage$b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage$b;->b()Landroid/net/Uri;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :cond_3
    move-object v7, v3

    .line 125
    move-object v8, v4

    .line 126
    const-string p1, "click_url"

    .line 127
    .line 128
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Ljava/lang/String;

    .line 133
    .line 134
    if-nez p1, :cond_4

    .line 135
    .line 136
    const-string p1, "url"

    .line 137
    .line 138
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/lang/String;

    .line 143
    .line 144
    :cond_4
    move-object v10, p1

    .line 145
    const-string p1, "flash"

    .line 146
    .line 147
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ljava/lang/String;

    .line 152
    .line 153
    if-nez p1, :cond_5

    .line 154
    .line 155
    const-string p1, "flash_msg"

    .line 156
    .line 157
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Ljava/lang/String;

    .line 162
    .line 163
    :cond_5
    move-object v11, p1

    .line 164
    const-string p1, "image_url"

    .line 165
    .line 166
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    move-object v5, p1

    .line 177
    check-cast v5, Ljava/lang/String;

    .line 178
    .line 179
    :cond_6
    const-string p1, "image"

    .line 180
    .line 181
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_7

    .line 186
    .line 187
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    move-object v5, p1

    .line 192
    check-cast v5, Ljava/lang/String;

    .line 193
    .line 194
    :cond_7
    move-object v9, v5

    .line 195
    new-instance p1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v2, "Title: "

    .line 201
    .line 202
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v2, ", Body: "

    .line 209
    .line 210
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    new-instance p1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const-string v2, "Click URL: "

    .line 229
    .line 230
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v2, ", Flash: "

    .line 237
    .line 238
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v2, ", Image: "

    .line 245
    .line 246
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    .line 258
    .line 259
    const-string p1, "is_external_url"

    .line 260
    .line 261
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, Ljava/lang/String;

    .line 266
    .line 267
    if-nez p1, :cond_8

    .line 268
    .line 269
    const-string p1, "external"

    .line 270
    .line 271
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    check-cast p1, Ljava/lang/String;

    .line 276
    .line 277
    :cond_8
    move-object v6, p0

    .line 278
    move-object v12, p1

    .line 279
    invoke-direct/range {v6 .. v12}, Lco/median/android/MyFirebaseMessagingService;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Refreshed token: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "MyFirebaseMsgService"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    const-string v0, "_median_push"

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "fcm_token"

    .line 35
    .line 36
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lco/median/android/MyFirebaseMessagingService;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
