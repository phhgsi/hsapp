.class public abstract Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0/b;->a:Landroid/app/Application;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public B(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(Lo0/g;LG/u;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public b()Ljava/util/Map;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lo0/b;->e()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :cond_1
    :goto_0
    return-object v1
.end method

.method public c(Lo0/g;)Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object p1
.end method

.method public d(Lo0/g;Z)Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object p1
.end method

.method protected abstract e()Ljava/util/List;
.end method

.method public f(Lo0/g;)Lp0/a;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public g(Lo0/g;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Lo0/g;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Lo0/g;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public k(Lo0/g;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Lo0/g;Landroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public n(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Lo0/g;IILandroid/content/Intent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lo0/f;->c(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(Lo0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public v(ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public w(Lo0/g;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public x(Lo0/g;Landroid/os/Bundle;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public y(Lo0/g;I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(Lo0/g;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    return-void
.end method
