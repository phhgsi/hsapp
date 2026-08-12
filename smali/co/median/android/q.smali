.class Lco/median/android/q;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Lco/median/android/B;

.field private final c:Z

.field private d:Landroid/view/View;

.field private e:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private f:Z

.field private g:J


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Lco/median/android/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/q;->f:Z

    .line 6
    .line 7
    iput-object p1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 8
    .line 9
    iput-object p2, p0, Lco/median/android/q;->b:Lco/median/android/B;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lco/median/android/q;->g:J

    .line 14
    .line 15
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-boolean p1, p1, Lo0/a;->d1:Z

    .line 20
    .line 21
    iput-boolean p1, p0, Lco/median/android/q;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-string p1, "GoNative WebView"

    .line 26
    .line 27
    const-string p2, "Web Console logs enabled"

    .line 28
    .line 29
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public static synthetic a(Landroid/webkit/JsResult;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroid/webkit/JsResult;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroid/webkit/JsPromptResult;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroid/webkit/JsResult;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/webkit/JsResult;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroid/webkit/JsResult;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lco/median/android/q;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lco/median/android/q;->k(Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic h(Landroid/webkit/JsPromptResult;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Landroid/widget/EditText;Landroid/webkit/JsPromptResult;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private synthetic k(Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    const/4 p3, 0x1

    .line 5
    invoke-interface {p1, p2, p3, v0}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-interface {p1, p2, v0, v0}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Lco/median/android/q;->g:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/q;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lco/median/android/q;->onHideCustomView()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lco/median/android/MainActivity;->m2()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lco/median/android/q;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    sget-object v0, Lco/median/android/q$b;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    aget v0, v0, v2

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    if-eq v0, v3, :cond_2

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    if-eq v0, v3, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    if-eq v0, v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, Ljava/lang/Exception;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v4, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "[console.error]"

    .line 51
    .line 52
    invoke-virtual {v0, p1, v3, v4, v2}, Lo0/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string v0, "[console.warn]"

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v0, "[console.debug]"

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const-string v0, "[console.log]"

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_0
    return v1
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lco/median/android/q;->b:Lco/median/android/B;

    .line 2
    .line 3
    invoke-virtual {p2, p1, p4}, Lco/median/android/B;->q(Landroid/webkit/WebView;Landroid/os/Message;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lo0/a;->V0:Lq0/d;

    .line 8
    .line 9
    invoke-virtual {v0}, Lq0/d;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p2, p1, v1, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iget-wide v4, p0, Lco/median/android/q;->g:J

    .line 25
    .line 26
    sub-long/2addr v2, v4

    .line 27
    const-wide/16 v4, 0x3e8

    .line 28
    .line 29
    cmp-long v0, v2, v4

    .line 30
    .line 31
    if-gez v0, :cond_1

    .line 32
    .line 33
    invoke-interface {p2, p1, v1, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    invoke-virtual {v0}, Lco/median/android/MainActivity;->P1()Lco/median/android/t;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lco/median/android/h;

    .line 44
    .line 45
    invoke-direct {v1, p0, p2, p1}, Lco/median/android/h;-><init>(Lco/median/android/q;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lco/median/android/t;->h(Lco/median/android/t$a;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public onHideCustomView()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lco/median/android/q;->d:Landroid/view/View;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/q;->f:Z

    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v0}, Lco/median/android/MainActivity;->K1()Landroid/widget/RelativeLayout;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lco/median/android/q;->e:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 30
    .line 31
    iget-boolean v1, p0, Lco/median/android/q;->f:Z

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->C3(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0

    .line 1
    new-instance p1, LP0/b;

    .line 2
    .line 3
    iget-object p2, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, LP0/b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p3}, LP0/b;->u(Ljava/lang/CharSequence;)LP0/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Lco/median/android/l;

    .line 13
    .line 14
    invoke-direct {p2, p4}, Lco/median/android/l;-><init>(Landroid/webkit/JsResult;)V

    .line 15
    .line 16
    .line 17
    const p3, 0x7f1200e2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p3, p2}, LP0/b;->y(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Lco/median/android/m;

    .line 25
    .line 26
    invoke-direct {p2, p4}, Lco/median/android/m;-><init>(Landroid/webkit/JsResult;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, LP0/b;->w(Landroid/content/DialogInterface$OnDismissListener;)LP0/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/appcompat/app/c$a;->n()Landroidx/appcompat/app/c;

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method public onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/q;->b:Lco/median/android/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/B;->n()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 0

    .line 1
    new-instance p1, LP0/b;

    .line 2
    .line 3
    iget-object p2, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, LP0/b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p3}, LP0/b;->u(Ljava/lang/CharSequence;)LP0/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Lco/median/android/n;

    .line 13
    .line 14
    invoke-direct {p2, p4}, Lco/median/android/n;-><init>(Landroid/webkit/JsResult;)V

    .line 15
    .line 16
    .line 17
    const p3, 0x7f1200e2

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p3, p2}, LP0/b;->y(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Lco/median/android/o;

    .line 25
    .line 26
    invoke-direct {p2, p4}, Lco/median/android/o;-><init>(Landroid/webkit/JsResult;)V

    .line 27
    .line 28
    .line 29
    const p3, 0x7f120034

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p3, p2}, LP0/b;->v(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p2, Lco/median/android/p;

    .line 37
    .line 38
    invoke-direct {p2, p4}, Lco/median/android/p;-><init>(Landroid/webkit/JsResult;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, LP0/b;->w(Landroid/content/DialogInterface$OnDismissListener;)LP0/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/appcompat/app/c$a;->n()Landroidx/appcompat/app/c;

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 0

    .line 1
    new-instance p1, Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object p2, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, LP0/b;

    .line 12
    .line 13
    iget-object p4, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-direct {p2, p4}, LP0/b;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p3}, LP0/b;->u(Ljava/lang/CharSequence;)LP0/b;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2, p1}, LP0/b;->B(Landroid/view/View;)LP0/b;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance p3, Lco/median/android/i;

    .line 27
    .line 28
    invoke-direct {p3, p1, p5}, Lco/median/android/i;-><init>(Landroid/widget/EditText;Landroid/webkit/JsPromptResult;)V

    .line 29
    .line 30
    .line 31
    const p1, 0x7f1200e2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1, p3}, LP0/b;->y(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Lco/median/android/j;

    .line 39
    .line 40
    invoke-direct {p2, p5}, Lco/median/android/j;-><init>(Landroid/webkit/JsPromptResult;)V

    .line 41
    .line 42
    .line 43
    const p3, 0x7f120034

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p3, p2}, LP0/b;->v(ILandroid/content/DialogInterface$OnClickListener;)LP0/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p2, Lco/median/android/k;

    .line 51
    .line 52
    invoke-direct {p2, p5}, Lco/median/android/k;-><init>(Landroid/webkit/JsPromptResult;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, LP0/b;->w(Landroid/content/DialogInterface$OnDismissListener;)LP0/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/appcompat/app/c$a;->n()Landroidx/appcompat/app/c;

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    return p1
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    array-length v3, v0

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    const-string v4, "android.webkit.resource.AUDIO_CAPTURE"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-string v3, "android.permission.RECORD_AUDIO"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    const-string v3, "android.permission.MODIFY_AUDIO_SETTINGS"

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    aget-object v3, v0, v2

    .line 36
    .line 37
    const-string v4, "android.webkit.resource.VIDEO_CAPTURE"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    const-string v3, "android.permission.CAMERA"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-array v0, v0, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, [Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 66
    .line 67
    new-instance v2, Lco/median/android/q$a;

    .line 68
    .line 69
    invoke-direct {v2, p0, p1}, Lco/median/android/q$a;-><init>(Lco/median/android/q;Landroid/webkit/PermissionRequest;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0, v2}, Lco/median/android/MainActivity;->R1([Ljava/lang/String;Lco/median/android/MainActivity$j;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lco/median/android/MainActivity;->F3()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/MainActivity;->K1()Landroid/widget/RelativeLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lco/median/android/q;->d:Landroid/view/View;

    .line 11
    .line 12
    iput-object p2, p0, Lco/median/android/q;->e:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    iput-boolean p2, p0, Lco/median/android/q;->f:Z

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-direct {p2, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lco/median/android/q;->a:Lco/median/android/MainActivity;

    .line 31
    .line 32
    iget-boolean p2, p0, Lco/median/android/q;->f:Z

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->C3(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lco/median/android/q;->b:Lco/median/android/B;

    .line 2
    .line 3
    invoke-virtual {p1}, Lco/median/android/B;->m()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x3

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    iget-object p1, p0, Lco/median/android/q;->b:Lco/median/android/B;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lco/median/android/B;->H(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1
.end method
