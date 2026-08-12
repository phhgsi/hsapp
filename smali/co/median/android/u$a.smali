.class Lco/median/android/u$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lco/median/android/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lco/median/android/u$a;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lco/median/android/u$a;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lco/median/android/u;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aget-object p1, p1, v3

    .line 17
    .line 18
    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object p1, v1

    .line 22
    move v4, v3

    .line 23
    :cond_1
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto :goto_3

    .line 31
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {p1, v5}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 39
    .line 40
    .line 41
    const-string v6, "User-Agent"

    .line 42
    .line 43
    invoke-static {v0}, Lco/median/android/u;->a(Lco/median/android/u;)Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v7}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget-object v7, v7, Lo0/a;->z:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, v6, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/16 v7, 0x12d

    .line 64
    .line 65
    if-eq v6, v7, :cond_4

    .line 66
    .line 67
    const/16 v7, 0x12e

    .line 68
    .line 69
    if-ne v6, v7, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move v5, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_1
    new-instance v6, Ljava/net/URL;

    .line 75
    .line 76
    const-string v7, "Location"

    .line 77
    .line 78
    invoke-virtual {p1, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-direct {v6, v2, v7}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    move-object v2, v6

    .line 88
    :goto_2
    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    if-eqz v5, :cond_5

    .line 95
    .line 96
    const/16 v5, 0xa

    .line 97
    .line 98
    if-lt v4, v5, :cond_1

    .line 99
    .line 100
    :cond_5
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :goto_3
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {}, Lco/median/android/u;->d()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v0, v2, v3, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 125
    .line 126
    .line 127
    return-object v1
.end method

.method protected b(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lco/median/android/u$a;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lco/median/android/u;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, p1}, Lm0/f1;->d(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    invoke-static {v0, v1}, Lco/median/android/u;->c(Lco/median/android/u;Z)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lco/median/android/u;->e(Lco/median/android/u;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Observable;->notifyObservers()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-static {v0}, Lco/median/android/u;->a(Lco/median/android/u;)Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v2, Lo0/a;->F:Ljava/util/List;

    .line 41
    .line 42
    move v4, v1

    .line 43
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-ge v4, v5, :cond_4

    .line 48
    .line 49
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-virtual {v5, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    iget-object p1, v2, Lo0/a;->G:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lorg/json/JSONObject;

    .line 72
    .line 73
    const-string v2, "loggedIn"

    .line 74
    .line 75
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-static {v0, v1}, Lco/median/android/u;->c(Lco/median/android/u;Z)V

    .line 80
    .line 81
    .line 82
    const-string v1, "menuName"

    .line 83
    .line 84
    invoke-static {p1, v1}, Lo0/a;->j(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-nez p1, :cond_2

    .line 89
    .line 90
    invoke-static {v0}, Lco/median/android/u;->b(Lco/median/android/u;)Z

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-static {v0}, Lco/median/android/u;->f(Lco/median/android/u;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/Observable;->notifyObservers()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    :goto_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lco/median/android/u$a;->a([Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lco/median/android/u$a;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
