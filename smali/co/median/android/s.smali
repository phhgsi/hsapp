.class public Lco/median/android/s;
.super Landroid/webkit/WebView;
.source "SourceFile"

# interfaces
.implements Lo0/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/s$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/webkit/WebViewClient;

.field private c:Landroid/webkit/WebChromeClient;

.field private d:Z

.field private e:Landroid/view/GestureDetector;

.field private f:Z

.field private g:Ljava/lang/String;

.field h:Landroid/view/GestureDetector$SimpleOnGestureListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lco/median/android/s;->a:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lco/median/android/s;->b:Landroid/webkit/WebViewClient;

    .line 16
    .line 17
    iput-object v0, p0, Lco/median/android/s;->c:Landroid/webkit/WebChromeClient;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lco/median/android/s;->d:Z

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lco/median/android/s;->f:Z

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    iput-object v0, p0, Lco/median/android/s;->g:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v0, Lco/median/android/s$a;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lco/median/android/s$a;-><init>(Lco/median/android/s;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lco/median/android/s;->h:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 35
    .line 36
    new-instance v0, Landroid/view/GestureDetector;

    .line 37
    .line 38
    iget-object v1, p0, Lco/median/android/s;->h:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 39
    .line 40
    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lco/median/android/s;->e:Landroid/view/GestureDetector;

    .line 44
    .line 45
    return-void
.end method

.method static bridge synthetic g(Lco/median/android/s;)Lco/median/android/s$b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static h()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public canGoForward()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    add-int/2addr v1, v2

    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v3, "file:///android_asset/offline.html"

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    return v2

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    return v0

    .line 44
    :cond_1
    invoke-super {p0}, Landroid/webkit/WebView;->canGoForward()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/s;->c:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lco/median/android/q;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lco/median/android/q;

    .line 10
    .line 11
    invoke-virtual {v0}, Lco/median/android/q;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public getDefaultUserAgent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/s;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxHorizontalScroll()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public getOnSwipeListener()Lco/median/android/s$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getWebViewScrollX()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getWebViewScrollY()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public goBack()V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "file:///android_asset/offline.html"

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr v1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_1
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget-object v0, p0, Lco/median/android/s;->b:Landroid/webkit/WebViewClient;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, p0, v2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-super {p0, v1}, Landroid/webkit/WebView;->goBackOrForward(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    invoke-super {p0}, Landroid/webkit/WebView;->goBack()V

    .line 61
    .line 62
    .line 63
    :goto_2
    return-void
.end method

.method public goForward()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v2, "file:///android_asset/offline.html"

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x2

    .line 34
    add-int/2addr v1, v2

    .line 35
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->goBackOrForward(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :cond_1
    invoke-super {p0}, Landroid/webkit/WebView;->goForward()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public i()V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "file:///android_asset/offline.html"

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v2, 0x0

    .line 34
    :goto_1
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lco/median/android/s;->g:Ljava/lang/String;

    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lco/median/android/s;->goBack()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    :catch_0
    return-void
.end method

.method public j(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/s;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    iput-object p1, p0, Lco/median/android/s;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/webkit/WebView;->stopLoading()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lco/median/android/s;->reload()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "file:///offline.html"

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "file:///android_asset/offline.html"

    .line 13
    .line 14
    :cond_1
    const-string v0, "javascript:"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/s;->b:Landroid/webkit/WebViewClient;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    return-void

    .line 34
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lco/median/android/s;->e:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public reload()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/s;->b:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v1, v0, Lm0/N;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    check-cast v0, Lm0/N;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, p0, v1, v2}, Lm0/N;->f(Landroid/webkit/WebView;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-super {p0}, Landroid/webkit/WebView;->reload()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void

    .line 27
    :cond_2
    :goto_0
    invoke-super {p0}, Landroid/webkit/WebView;->reload()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public scrollTo(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->scrollTo(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCheckLoginSignup(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/s;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public setOnSwipeListener(Lco/median/android/s$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/s;->c:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/s;->b:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public zoomBy(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->zoomBy(F)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lco/median/android/s;->f:Z

    .line 6
    .line 7
    return-void
.end method

.method public zoomOut()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/s;->f:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/webkit/WebView;->zoomOut()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method
