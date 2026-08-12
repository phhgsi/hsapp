.class public abstract LL/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL/e$c;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/view/View;LL/f;ILandroid/os/Bundle;)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    and-int/2addr p2, v2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, LL/f;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LL/f;->e()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Landroid/os/Parcelable;

    .line 19
    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    new-instance p3, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    move-object p3, v0

    .line 34
    :goto_0
    const-string v0, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 35
    .line 36
    invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception p0

    .line 41
    const-string p1, "InputConnectionCompat"

    .line 42
    .line 43
    const-string p2, "Can\'t insert content from IME; requestPermission() failed"

    .line 44
    .line 45
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 50
    .line 51
    invoke-virtual {p1}, LL/f;->b()Landroid/content/ClipDescription;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Landroid/content/ClipData$Item;

    .line 56
    .line 57
    invoke-virtual {p1}, LL/f;->a()Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-direct {v1, v3}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p2, v0, v1}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, LJ/d$a;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p2, v1}, LJ/d$a;-><init>(Landroid/content/ClipData;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, LL/f;->c()Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0, p1}, LJ/d$a;->d(Landroid/net/Uri;)LJ/d$a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1, p3}, LJ/d$a;->b(Landroid/os/Bundle;)LJ/d$a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p0, p1}, LJ/W;->Y(Landroid/view/View;LJ/d;)LJ/d;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-nez p0, :cond_2

    .line 94
    .line 95
    return v2

    .line 96
    :cond_2
    :goto_2
    const/4 p0, 0x0

    .line 97
    return p0
.end method

.method private static b(Landroid/view/View;)LL/e$c;
    .locals 1

    .line 1
    invoke-static {p0}, LI/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, LL/d;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LL/d;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static c(Landroid/view/View;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    .line 1
    invoke-static {p0}, LL/e;->b(Landroid/view/View;)LL/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p2, p0}, LL/e;->d(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LL/e$c;)Landroid/view/inputmethod/InputConnection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LL/e$c;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .line 1
    const-string v0, "inputConnection must be non-null"

    .line 2
    .line 3
    invoke-static {p0, v0}, LI/c;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "editorInfo must be non-null"

    .line 7
    .line 8
    invoke-static {p1, v0}, LI/c;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string v0, "onCommitContentListener must be non-null"

    .line 12
    .line 13
    invoke-static {p2, v0}, LI/c;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x19

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-lt v0, v1, :cond_0

    .line 22
    .line 23
    new-instance p1, LL/e$a;

    .line 24
    .line 25
    invoke-direct {p1, p0, v2, p2}, LL/e$a;-><init>(Landroid/view/inputmethod/InputConnection;ZLL/e$c;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-static {p1}, LL/c;->a(Landroid/view/inputmethod/EditorInfo;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    array-length p1, p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance p1, LL/e$b;

    .line 38
    .line 39
    invoke-direct {p1, p0, v2, p2}, LL/e$b;-><init>(Landroid/view/inputmethod/InputConnection;ZLL/e$c;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method static e(Ljava/lang/String;Landroid/os/Bundle;LL/e$c;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"

    .line 6
    .line 7
    invoke-static {v1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move p0, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v1, "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"

    .line 16
    .line 17
    invoke-static {v1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_b

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    :goto_0
    const/4 v1, 0x0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    :try_start_0
    const-string v2, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    move-object v2, v1

    .line 32
    goto :goto_7

    .line 33
    :cond_2
    const-string v2, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"

    .line 34
    .line 35
    :goto_1
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroid/os/ResultReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    :try_start_1
    const-string v3, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_7

    .line 48
    :cond_3
    const-string v3, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"

    .line 49
    .line 50
    :goto_2
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/net/Uri;

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    const-string v4, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const-string v4, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"

    .line 62
    .line 63
    :goto_3
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Landroid/content/ClipDescription;

    .line 68
    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    const-string v5, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const-string v5, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"

    .line 75
    .line 76
    :goto_4
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Landroid/net/Uri;

    .line 81
    .line 82
    if-eqz p0, :cond_6

    .line 83
    .line 84
    const-string v6, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_6
    const-string v6, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"

    .line 88
    .line 89
    :goto_5
    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    const-string p0, "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_7
    const-string p0, "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"

    .line 99
    .line 100
    :goto_6
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Landroid/os/Bundle;

    .line 105
    .line 106
    if-eqz v3, :cond_8

    .line 107
    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    new-instance p1, LL/f;

    .line 111
    .line 112
    invoke-direct {p1, v3, v4, v5}, LL/f;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p2, p1, v6, p0}, LL/e$c;->a(LL/f;ILandroid/os/Bundle;)Z

    .line 116
    .line 117
    .line 118
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    :cond_8
    if-eqz v2, :cond_9

    .line 120
    .line 121
    invoke-virtual {v2, v0, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    :cond_9
    return v0

    .line 125
    :goto_7
    if-eqz v2, :cond_a

    .line 126
    .line 127
    invoke-virtual {v2, v0, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 128
    .line 129
    .line 130
    :cond_a
    throw p0

    .line 131
    :cond_b
    return v0
.end method
