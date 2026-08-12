.class public abstract Lk0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/webkit/WebSettings;)Ll0/k;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Ll0/n;->c()Ll0/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ll0/q;->a(Landroid/webkit/WebSettings;)Ll0/k;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v2, 0x1e

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v1, "android.webkit.WebSettingsWrapper"

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const-string p0, "WebSettingsCompat"

    .line 34
    .line 35
    const-string v1, "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."

    .line 36
    .line 37
    invoke-static {p0, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 38
    .line 39
    .line 40
    new-instance p0, Ll0/l;

    .line 41
    .line 42
    invoke-direct {p0}, Ll0/l;-><init>()V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    throw v0
.end method

.method public static b(Landroid/webkit/WebSettings;I)V
    .locals 2

    .line 1
    sget-object v0, Ll0/m;->T:Ll0/a$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0/a$h;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1}, Ll0/g;->a(Landroid/webkit/WebSettings;I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Ll0/a;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lk0/a;->a(Landroid/webkit/WebSettings;)Ll0/k;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, p1}, Ll0/k;->a(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {}, Ll0/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0
.end method

.method public static c(Landroid/webkit/WebSettings;I)V
    .locals 1

    .line 1
    sget-object v0, Ll0/m;->U:Ll0/a$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0/a;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lk0/a;->a(Landroid/webkit/WebSettings;)Ll0/k;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Ll0/k;->b(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Ll0/m;->a()Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    throw p0
.end method
