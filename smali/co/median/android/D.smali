.class public abstract Lco/median/android/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "co.median.android.D"

.field public static b:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lco/median/android/s;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lco/median/android/s;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lco/median/android/s;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static b(Lo0/h;Landroid/content/Context;)V
    .locals 6

    .line 1
    instance-of v0, p0, Lco/median/android/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lco/median/android/D;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Expected webview to be of class LeanWebView and not "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, v0, p0}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v1, p0

    .line 45
    check-cast v1, Lco/median/android/s;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-boolean p1, p1, Lo0/a;->r:Z

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMinimumFontSize(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMinimumLogicalFontSize(I)V

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x2

    .line 90
    invoke-virtual {v2, p1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-virtual {v5, v1, v4}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 101
    .line 102
    .line 103
    iget-object v5, v0, Lo0/a;->t:Lo0/a$a;

    .line 104
    .line 105
    invoke-virtual {v5}, Lo0/a$a;->b()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 119
    .line 120
    .line 121
    sget-object v5, Lco/median/android/D;->b:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_4

    .line 128
    .line 129
    iget-object v5, v0, Lo0/a;->z:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_2

    .line 136
    .line 137
    iget-object p0, v0, Lo0/a;->z:Ljava/lang/String;

    .line 138
    .line 139
    sput-object p0, Lco/median/android/D;->b:Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_2
    iget-object v5, v0, Lo0/a;->k:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_3

    .line 149
    .line 150
    new-instance v5, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-interface {p0}, Lo0/h;->getDefaultUserAgent()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p0, " "

    .line 163
    .line 164
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    iget-object p0, v0, Lo0/a;->k:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    sput-object p0, Lco/median/android/D;->b:Ljava/lang/String;

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_3
    invoke-interface {p0}, Lo0/h;->getDefaultUserAgent()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    sput-object p0, Lco/median/android/D;->b:Ljava/lang/String;

    .line 184
    .line 185
    :cond_4
    :goto_1
    sget-object p0, Lco/median/android/D;->b:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v2, p0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget p0, v0, Lo0/a;->f1:I

    .line 191
    .line 192
    if-ne p0, v4, :cond_5

    .line 193
    .line 194
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    iget-boolean p0, v0, Lo0/a;->i:Z

    .line 199
    .line 200
    invoke-virtual {v2, p0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 201
    .line 202
    .line 203
    :goto_2
    iget-object p0, v0, Lo0/a;->V0:Lq0/d;

    .line 204
    .line 205
    invoke-virtual {p0}, Lq0/d;->d()Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    invoke-virtual {v2, p0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 213
    .line 214
    .line 215
    iget p0, v0, Lo0/a;->u:I

    .line 216
    .line 217
    if-lez p0, :cond_6

    .line 218
    .line 219
    invoke-virtual {v2, p0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 220
    .line 221
    .line 222
    :cond_6
    iget-boolean p0, v0, Lo0/a;->s:Z

    .line 223
    .line 224
    if-eqz p0, :cond_7

    .line 225
    .line 226
    invoke-virtual {v1, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 227
    .line 228
    .line 229
    :cond_7
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 230
    .line 231
    const/16 v0, 0x1a

    .line 232
    .line 233
    const/4 v2, 0x0

    .line 234
    if-lt p0, v0, :cond_8

    .line 235
    .line 236
    invoke-virtual {v1, p1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_8
    invoke-virtual {v1, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public static c(Lo0/h;Lco/median/android/MainActivity;)V
    .locals 3

    .line 1
    instance-of v0, p0, Lco/median/android/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lco/median/android/D;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Expected webview to be of class LeanWebView and not "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, v0, p0}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    move-object v0, p0

    .line 41
    check-cast v0, Lco/median/android/s;

    .line 42
    .line 43
    invoke-static {v0, p1}, Lco/median/android/D;->b(Lo0/h;Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lco/median/android/B;

    .line 47
    .line 48
    invoke-direct {v1, p1}, Lco/median/android/B;-><init>(Lco/median/android/MainActivity;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v1, p0}, Lco/median/android/B;->R(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lco/median/android/q;

    .line 59
    .line 60
    invoke-direct {p0, p1, v1}, Lco/median/android/q;-><init>(Lco/median/android/MainActivity;Lco/median/android/B;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lco/median/android/s;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Lm0/N;

    .line 67
    .line 68
    invoke-direct {p0, p1, v1}, Lm0/N;-><init>(Lco/median/android/MainActivity;Lco/median/android/B;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Lco/median/android/s;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lco/median/android/MainActivity;->H1()Lco/median/android/d;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lco/median/android/d;->E(Lco/median/android/B;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    const-string p0, "median_status_checker"

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lco/median/android/MainActivity;->S1()Lco/median/android/MainActivity$l;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1, p0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string p0, "gonative_file_writer_sharer"

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lco/median/android/MainActivity;->J1()Lco/median/android/g;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Lco/median/android/g;->j()Lco/median/android/g$b;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1, p0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string p0, "JSBridge"

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Lco/median/android/C;

    .line 120
    .line 121
    new-instance v2, Lm0/q1;

    .line 122
    .line 123
    invoke-direct {v2, p1}, Lm0/q1;-><init>(Lco/median/android/MainActivity;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, v2}, Lco/median/android/C;-><init>(Lco/median/android/C$a;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1, p0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Lco/median/android/GoNativeApplication;

    .line 137
    .line 138
    iget-object p0, p0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 139
    .line 140
    invoke-virtual {p0, p1, v0}, Lo0/b;->z(Lo0/g;Landroid/webkit/WebView;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lco/median/android/MainActivity;->j2()Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_2

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, Lco/median/android/GoNativeApplication;

    .line 154
    .line 155
    invoke-virtual {p0}, Lco/median/android/GoNativeApplication;->i()Landroid/os/Message;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-eqz p0, :cond_2

    .line 160
    .line 161
    iget-object p1, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    .line 164
    .line 165
    if-eqz p1, :cond_2

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 171
    .line 172
    .line 173
    :cond_2
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lo0/a;->S0:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Lm0/U;->b(Landroid/content/Context;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "distribution"

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const-string v0, "debug"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const-string v0, "adhoc"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    :cond_0
    const/4 p0, 0x1

    .line 40
    invoke-static {p0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method
