.class public Lm0/N;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field private final a:Lco/median/android/B;

.field private final b:Lco/median/android/MainActivity;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;Lco/median/android/B;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lm0/N;->c:Z

    .line 6
    .line 7
    iput-object p2, p0, Lm0/N;->a:Lco/median/android/B;

    .line 8
    .line 9
    iput-object p1, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lm0/N;Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lm0/N;->d(Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic b(Lm0/N;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm0/N;->e(Ljava/lang/String;)V

    return-void
.end method

.method private c(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lm0/N;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 6
    .line 7
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m2()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Lco/median/android/MainActivity;->j2()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lm0/N;->c:Z

    .line 23
    .line 24
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "User-Agent"

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    sget-object v2, Lco/median/android/D;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    new-instance v0, Landroid/webkit/WebResourceResponse;

    .line 45
    .line 46
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    new-array v3, v3, [B

    .line 50
    .line 51
    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 52
    .line 53
    .line 54
    const-string v3, "text/plain"

    .line 55
    .line 56
    const-string v4, "UTF-8"

    .line 57
    .line 58
    invoke-direct {v0, v3, v4, v2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    .line 59
    .line 60
    .line 61
    const/16 v2, 0xcc

    .line 62
    .line 63
    const-string v3, "No Content"

    .line 64
    .line 65
    invoke-virtual {v0, v2, v3}, Landroid/webkit/WebResourceResponse;->setStatusCodeAndReasonPhrase(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    sget-object v3, Lco/median/android/D;->b:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 78
    .line 79
    new-instance v3, Lm0/L;

    .line 80
    .line 81
    invoke-direct {v3, p0, p1, v2}, Lm0/L;-><init>(Lm0/N;Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_0
    const/4 p1, 0x0

    .line 89
    return-object p1
.end method

.method private synthetic d(Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, p1, p2}, Lco/median/android/MainActivity;->O2(Ljava/lang/String;Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private synthetic e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->U2(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 2
    .line 3
    check-cast p1, Lo0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lco/median/android/B;->r(Lo0/h;Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Landroid/webkit/WebView;Ljava/lang/String;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 2
    .line 3
    check-cast p1, Lo0/h;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, p3, v1}, Lco/median/android/B;->T(Lo0/h;Ljava/lang/String;ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 2
    .line 3
    check-cast p1, Lo0/h;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lco/median/android/B;->J(Lo0/h;Landroid/os/Message;Landroid/os/Message;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lco/median/android/B;->K(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 5
    .line 6
    check-cast p1, Lo0/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lco/median/android/B;->L(Lo0/h;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm0/N;->a:Lco/median/android/B;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lco/median/android/B;->M(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1, p2}, Lco/median/android/B;->N(Ljava/lang/String;Landroid/webkit/ClientCertRequest;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    check-cast p1, Lo0/h;

    invoke-virtual {v0, p1, p2, p3, p4}, Lco/median/android/B;->O(Lo0/h;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    check-cast p1, Lo0/h;

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result v1

    .line 3
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {v0, p1, v1, p3, p2}, Lco/median/android/B;->O(Lo0/h;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lm0/N;->a:Lco/median/android/B;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p2, p3, p1}, Lco/median/android/B;->P(Landroid/net/http/SslError;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p2, 0x0

    .line 25
    :goto_0
    iget-object p1, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 26
    .line 27
    new-instance v0, Lm0/M;

    .line 28
    .line 29
    invoke-direct {v0, p0, p2}, Lm0/M;-><init>(Lm0/N;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1
.end method

.method public onScaleChanged(Landroid/webkit/WebView;FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    .line 5
    .line 6
    invoke-virtual {p1, p3}, Lco/median/android/MainActivity;->j3(F)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 2
    invoke-direct {p0, p2}, Lm0/N;->c(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lco/median/android/GoNativeApplication;

    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    iget-object v1, p0, Lm0/N;->b:Lco/median/android/MainActivity;

    invoke-virtual {v0, v1, p2}, Lo0/b;->j(Lo0/g;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 4
    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 5
    const-string v2, "GET"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 7
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lm0/N;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    check-cast p1, Lco/median/android/s;

    invoke-virtual {v0, p1, p2}, Lco/median/android/B;->x(Lco/median/android/s;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 3

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 3
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lm0/N;->a:Lco/median/android/B;

    check-cast p1, Lo0/h;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 5
    invoke-static {p2}, Lm0/K;->a(Landroid/webkit/WebResourceRequest;)Z

    move-result p2

    .line 6
    invoke-virtual {v1, p1, v0, v2, p2}, Lco/median/android/B;->T(Lo0/h;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1

    .line 7
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/N;->a:Lco/median/android/B;

    check-cast p1, Lo0/h;

    invoke-virtual {v0, p1, p2}, Lco/median/android/B;->S(Lo0/h;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
