.class public Lco/median/android/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/g$b;,
        Lco/median/android/g$a;
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/String; = "g"


# instance fields
.field private final a:Lco/median/android/d$d;

.field private b:Ljava/lang/String;

.field private final c:Lco/median/android/g$b;

.field private final d:Lco/median/android/MainActivity;

.field private final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lco/median/android/g$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lco/median/android/g$b;-><init>(Lco/median/android/g;Lm0/J;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lco/median/android/g;->c:Lco/median/android/g$b;

    .line 11
    .line 12
    iput-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 13
    .line 14
    new-instance v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 20
    .line 21
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, Lo0/a;->V0:Lq0/d;

    .line 26
    .line 27
    invoke-virtual {p1}, Lq0/d;->a()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    sget-object p1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 34
    .line 35
    iput-object p1, p0, Lco/median/android/g;->a:Lco/median/android/d$d;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-object p1, Lco/median/android/d$d;->e:Lco/median/android/d$d;

    .line 39
    .line 40
    iput-object p1, p0, Lco/median/android/g;->a:Lco/median/android/d$d;

    .line 41
    .line 42
    return-void
.end method

.method public static synthetic a(Lco/median/android/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/g;->l()V

    return-void
.end method

.method public static synthetic b(Lco/median/android/g;Lco/median/android/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/g;->k(Lco/median/android/g$a;)V

    return-void
.end method

.method public static synthetic c(Lco/median/android/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/g;->n()V

    return-void
.end method

.method public static synthetic d(Lco/median/android/g;Lco/median/android/g$a;[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lco/median/android/g;->m(Lco/median/android/g$a;[Ljava/lang/String;[I)V

    return-void
.end method

.method static bridge synthetic e(Lco/median/android/g;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/g;->o(Lorg/json/JSONObject;)V

    return-void
.end method

.method static bridge synthetic f(Lco/median/android/g;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/g;->p(Lorg/json/JSONObject;)V

    return-void
.end method

.method static bridge synthetic g(Lco/median/android/g;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/g;->q(Lorg/json/JSONObject;)V

    return-void
.end method

.method static bridge synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method private synthetic k(Lco/median/android/g$a;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lco/median/android/g$a;->g:Landroid/net/Uri;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ".fileprovider"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Landroidx/core/content/FileProvider;->h(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p1, Lco/median/android/g$a;->g:Landroid/net/Uri;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p1, Lco/median/android/g$a;->g:Landroid/net/Uri;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 52
    .line 53
    iget-object p1, p1, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v2, p0, Lco/median/android/g;->a:Lco/median/android/d$d;

    .line 56
    .line 57
    sget-object v3, Lco/median/android/d$d;->e:Lco/median/android/d$d;

    .line 58
    .line 59
    if-ne v2, v3, :cond_2

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_0
    invoke-static {v1, v0, p1, v2}, Lco/median/android/d;->J(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private synthetic l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "medianGotStoragePermissions()"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private synthetic m(Lco/median/android/g$a;[Ljava/lang/String;[I)V
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    :try_start_0
    aget p3, p3, p2

    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lco/median/android/g;->r(Lco/median/android/g$a;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 11
    .line 12
    new-instance p3, Lm0/I;

    .line 13
    .line 14
    invoke-direct {p3, p0}, Lm0/I;-><init>(Lco/median/android/g;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p2

    .line 22
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "IO Error"

    .line 29
    .line 30
    invoke-virtual {p3, v0, v1, p2}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    iget-object p3, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 34
    .line 35
    iget-object p1, p1, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "IO Error - "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p3, p1, p2}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private synthetic n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "medianGotStoragePermissions()"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private o(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lco/median/android/g$a;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v2, "data"

    .line 26
    .line 27
    invoke-static {p1, v2}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v2, ";base64,"

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, -0x1

    .line 41
    if-ne v2, v3, :cond_3

    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :cond_3
    add-int/lit8 v2, v2, 0x8

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-wide v2, v1, Lco/median/android/g$a;->i:J

    .line 56
    .line 57
    array-length v4, p1

    .line 58
    int-to-long v4, v4

    .line 59
    add-long/2addr v2, v4

    .line 60
    iget-wide v4, v1, Lco/median/android/g$a;->c:J

    .line 61
    .line 62
    cmp-long v2, v2, v4

    .line 63
    .line 64
    if-lez v2, :cond_4

    .line 65
    .line 66
    :try_start_0
    iget-object p1, v1, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 69
    .line 70
    .line 71
    iget-object p1, v1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    :catch_0
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    .line 86
    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v3, "Received too many bytes. Expected "

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-wide v4, v1, Lco/median/android/g$a;->c:J

    .line 98
    .line 99
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {p1, v0, v2}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 110
    .line 111
    iget-object v0, v1, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 112
    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-wide v3, v1, Lco/median/android/g$a;->c:J

    .line 122
    .line 123
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {p1, v0, v1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    iget-object v0, v1, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 137
    .line 138
    .line 139
    iget-wide v2, v1, Lco/median/android/g$a;->i:J

    .line 140
    .line 141
    array-length p1, p1

    .line 142
    int-to-long v4, p1

    .line 143
    add-long/2addr v2, v4

    .line 144
    iput-wide v2, v1, Lco/median/android/g$a;->i:J

    .line 145
    .line 146
    return-void
.end method

.method private p(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "id"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const-string v3, "Unable to retrieve download info on file end."

    .line 13
    .line 14
    const-string v4, " for fileEnd"

    .line 15
    .line 16
    const-string v5, "Invalid identifier "

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1, v0, v1}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 48
    .line 49
    iget-object v0, p0, Lco/median/android/g;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1, v0, v3}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    iget-object v2, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lco/median/android/g$a;

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {p1, v0, v1}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 93
    .line 94
    iget-object v0, p0, Lco/median/android/g;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {p1, v0, v3}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    iget-object v1, v2, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 101
    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 105
    .line 106
    .line 107
    :cond_2
    const-string v1, "error"

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_3

    .line 118
    .line 119
    iget-object v0, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 120
    .line 121
    iget-object v1, v2, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0, v1, p1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    iget-boolean p1, v2, Lco/median/android/g$a;->k:Z

    .line 128
    .line 129
    if-eqz p1, :cond_4

    .line 130
    .line 131
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 132
    .line 133
    new-instance v0, Lco/median/android/e;

    .line 134
    .line 135
    invoke-direct {v0, p0, v2}, Lco/median/android/e;-><init>(Lco/median/android/g;Lco/median/android/g$a;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    iget-object p1, v2, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz p1, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_5

    .line 151
    .line 152
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 153
    .line 154
    const v1, 0x7f120067

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    iget-object v3, v2, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const/16 v3, 0x2e

    .line 172
    .line 173
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-object v3, v2, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const/4 v3, 0x1

    .line 186
    new-array v3, v3, [Ljava/lang/Object;

    .line 187
    .line 188
    aput-object v1, v3, v0

    .line 189
    .line 190
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    goto :goto_0

    .line 195
    :cond_5
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 196
    .line 197
    const v1, 0x7f120065

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    :goto_0
    iget-object v1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 205
    .line 206
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 211
    .line 212
    .line 213
    :goto_1
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 214
    .line 215
    iget-object v0, v2, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {p1, v0}, Lco/median/android/d;->D(Lo0/g;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method private q(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "Unable to retrieve download info on file start."

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lco/median/android/g;->f:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "Invalid file id"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 27
    .line 28
    iget-object v0, p0, Lco/median/android/g;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1, v0, v2}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v1, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lco/median/android/g$a;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 45
    .line 46
    iget-object v0, p0, Lco/median/android/g;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, v0, v2}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    iget-object v1, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x1

    .line 59
    const-string v3, "download"

    .line 60
    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    iget-object v1, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, Lco/median/android/d;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    iget-object v1, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v4, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iput-object v3, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget-object v1, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iget-object v4, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    add-int/2addr v4, v2

    .line 103
    sub-int/2addr v3, v4

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 110
    .line 111
    :goto_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v3, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v3}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iput-object v1, v0, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    const-string v1, "name"

    .line 125
    .line 126
    invoke-static {p1, v1}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iput-object v1, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    iput-object v3, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 139
    .line 140
    :cond_4
    :goto_1
    const-string v1, "size"

    .line 141
    .line 142
    const-wide/16 v3, -0x1

    .line 143
    .line 144
    invoke-virtual {p1, v1, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v3

    .line 148
    const-wide/16 v5, 0x0

    .line 149
    .line 150
    cmp-long v1, v3, v5

    .line 151
    .line 152
    if-lez v1, :cond_9

    .line 153
    .line 154
    const-wide/32 v5, 0x40000000

    .line 155
    .line 156
    .line 157
    cmp-long v1, v3, v5

    .line 158
    .line 159
    if-lez v1, :cond_5

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    iput-wide v3, v0, Lco/median/android/g$a;->c:J

    .line 163
    .line 164
    iget-object v1, v0, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_6

    .line 171
    .line 172
    const-string v1, "type"

    .line 173
    .line 174
    invoke-static {p1, v1}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, v0, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_6

    .line 185
    .line 186
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sget-object v1, Lco/median/android/g;->f:Ljava/lang/String;

    .line 191
    .line 192
    const-string v2, "Invalid file type"

    .line 193
    .line 194
    invoke-virtual {p1, v1, v2}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 198
    .line 199
    iget-object v0, v0, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 200
    .line 201
    const-string v1, "Invalid file type."

    .line 202
    .line 203
    invoke-static {p1, v0, v1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_6
    iget-object p1, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget-object v1, v0, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iput-object p1, v0, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 226
    .line 227
    :cond_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 228
    .line 229
    const/16 v1, 0x1d

    .line 230
    .line 231
    if-ge p1, v1, :cond_8

    .line 232
    .line 233
    iget-object p1, p0, Lco/median/android/g;->a:Lco/median/android/d$d;

    .line 234
    .line 235
    sget-object v1, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 236
    .line 237
    if-ne p1, v1, :cond_8

    .line 238
    .line 239
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 240
    .line 241
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 242
    .line 243
    filled-new-array {v1}, [Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    new-instance v2, Lco/median/android/f;

    .line 248
    .line 249
    invoke-direct {v2, p0, v0}, Lco/median/android/f;-><init>(Lco/median/android/g;Lco/median/android/g$a;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, v1, v2}, Lco/median/android/MainActivity;->R1([Ljava/lang/String;Lco/median/android/MainActivity$j;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_8
    invoke-direct {p0, v0, v2}, Lco/median/android/g;->r(Lco/median/android/g$a;Z)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 260
    .line 261
    new-instance v0, Lm0/H;

    .line 262
    .line 263
    invoke-direct {v0, p0}, Lm0/H;-><init>(Lco/median/android/g;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_9
    :goto_2
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    sget-object v1, Lco/median/android/g;->f:Ljava/lang/String;

    .line 275
    .line 276
    const-string v2, "Invalid file size"

    .line 277
    .line 278
    invoke-virtual {p1, v1, v2}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object p1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 282
    .line 283
    iget-object v0, v0, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 284
    .line 285
    const-string v1, "Invalid file size."

    .line 286
    .line 287
    invoke-static {p1, v0, v1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method private r(Lco/median/android/g$a;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object p2, p0, Lco/median/android/g;->a:Lco/median/android/d$d;

    .line 4
    .line 5
    sget-object v0, Lco/median/android/d$d;->d:Lco/median/android/d$d;

    .line 6
    .line 7
    if-ne p2, v0, :cond_1

    .line 8
    .line 9
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v0, 0x1c

    .line 12
    .line 13
    if-le p2, v0, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object v0, p1, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, Lco/median/android/g$a;->d:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p2, v0, v1, v2}, Lco/median/android/d;->k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p1, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 42
    .line 43
    iput-object v0, p1, Lco/median/android/g$a;->g:Landroid/net/Uri;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object v0, p1, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p1, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p2, v0, v1}, Lco/median/android/d;->m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 61
    .line 62
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 63
    .line 64
    new-instance v0, Ljava/io/FileOutputStream;

    .line 65
    .line 66
    iget-object v1, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p1, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-object p2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object v0, p1, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v1, p1, Lco/median/android/g$a;->e:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p2, v0, v1}, Lco/median/android/d;->m(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iput-object p2, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 92
    .line 93
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 94
    .line 95
    new-instance v0, Ljava/io/FileOutputStream;

    .line 96
    .line 97
    iget-object v1, p1, Lco/median/android/g$a;->f:Ljava/io/File;

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p1, Lco/median/android/g$a;->h:Ljava/io/OutputStream;

    .line 106
    .line 107
    :cond_2
    :goto_0
    const-wide/16 v0, 0x0

    .line 108
    .line 109
    iput-wide v0, p1, Lco/median/android/g$a;->i:J

    .line 110
    .line 111
    iget-object p2, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 112
    .line 113
    iget-object v0, p1, Lco/median/android/g$a;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public i(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string v0, "blob:"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    iput-object p4, p0, Lco/median/android/g;->b:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v0, Lco/median/android/g$a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lco/median/android/g$a;-><init>(Lm0/J;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lco/median/android/g$a;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p4, v0, Lco/median/android/g$a;->j:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean p3, v0, Lco/median/android/g$a;->k:Z

    .line 36
    .line 37
    iget-object p2, p0, Lco/median/android/g;->e:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :try_start_0
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p3, Ljava/io/BufferedInputStream;

    .line 48
    .line 49
    iget-object v1, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "BlobDownloader.js"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {p3, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p3, p2}, Lm0/P;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget-object p3, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 72
    .line 73
    invoke-virtual {p3, p2}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p2, "medianDownloadBlobUrl(%s, \'%s\', \'%s\')"

    .line 77
    .line 78
    invoke-static {p1}, Lo0/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p3, v0, Lco/median/android/g$a;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v0, v0, Lco/median/android/g$a;->b:Ljava/lang/String;

    .line 85
    .line 86
    const/4 v1, 0x3

    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    aput-object p1, v1, v2

    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    aput-object p3, v1, p1

    .line 94
    .line 95
    const/4 p1, 0x2

    .line 96
    aput-object v0, v1, p1

    .line 97
    .line 98
    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object p2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catch_0
    move-exception p1

    .line 109
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    sget-object p3, Lco/median/android/g;->f:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p2, p3, v0, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Lco/median/android/g;->d:Lco/median/android/MainActivity;

    .line 123
    .line 124
    new-instance p3, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v0, "IO Error - "

    .line 130
    .line 131
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p2, p4, p1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_1
    :goto_0
    return-void
.end method

.method public j()Lco/median/android/g$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/g;->c:Lco/median/android/g$b;

    .line 2
    .line 3
    return-object v0
.end method
