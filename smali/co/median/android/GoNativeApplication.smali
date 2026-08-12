.class public Lco/median/android/GoNativeApplication;
.super LY/b;
.source "SourceFile"


# static fields
.field private static final p:Ljava/lang/String; = "GoNativeApplication"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private e:Lco/median/android/u;

.field private f:Lco/median/android/y;

.field private g:Lm0/o1;

.field private h:Landroid/os/Message;

.field private i:Lco/median/android/r;

.field private j:Ljava/util/List;

.field private k:Z

.field public final l:Lo0/b;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, LY/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "customCSS.css"

    .line 5
    .line 6
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "customJS.js"

    .line 9
    .line 10
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "androidCustomCSS.css"

    .line 13
    .line 14
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "androidCustomJS.js"

    .line 17
    .line 18
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->d:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lco/median/android/GoNativeApplication;->k:Z

    .line 22
    .line 23
    new-instance v1, Lco/median/android/GoNativeApplication$a;

    .line 24
    .line 25
    invoke-direct {v1, p0, p0}, Lco/median/android/GoNativeApplication$a;-><init>(Lco/median/android/GoNativeApplication;Landroid/app/Application;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 29
    .line 30
    iput-boolean v0, p0, Lco/median/android/GoNativeApplication;->m:Z

    .line 31
    .line 32
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/GoNativeApplication;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/GoNativeApplication;->j:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic b(Lco/median/android/GoNativeApplication;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/GoNativeApplication;->j:Ljava/util/List;

    return-void
.end method

.method private l(Lo0/a;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lo0/a;->l1:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p1, Lo0/a;->n1:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p1, Lo0/a;->l1:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-string v1, "customCSS.css"

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-boolean p1, p1, Lo0/a;->n1:Z

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    const-string p1, "androidCustomCSS.css"

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :try_start_0
    invoke-direct {p0, v0}, Lco/median/android/GoNativeApplication;->n(Ljava/util/List;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v0, 0x2

    .line 51
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lco/median/android/GoNativeApplication;->n:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    move-exception p1

    .line 59
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lco/median/android/GoNativeApplication;->p:Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, "Error loading custom CSS files"

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void
.end method

.method private m(Lo0/a;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lo0/a;->m1:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p1, Lo0/a;->o1:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p1, Lo0/a;->m1:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-string v1, "customJS.js"

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-boolean p1, p1, Lo0/a;->o1:Z

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    const-string p1, "androidCustomJS.js"

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :try_start_0
    invoke-direct {p0, v0}, Lco/median/android/GoNativeApplication;->n(Ljava/util/List;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v0, 0x2

    .line 51
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lco/median/android/GoNativeApplication;->o:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    move-exception p1

    .line 59
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lco/median/android/GoNativeApplication;->p:Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, "Error loading custom JS files"

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void
.end method

.method private n(Ljava/util/List;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v1}, Lo0/i;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v3

    .line 51
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v5, Lco/median/android/GoNativeApplication;->p:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v6, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v7, "Error reading "

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v4, v5, v2, v3}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-static {v1}, Lo0/i;->a(Ljava/io/Closeable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method private q()V
    .locals 2

    .line 1
    invoke-static {p0}, Lm0/e1;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lm0/e1;->e(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p0, v0}, Lm0/e1;->g(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lm0/e1;->c(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo0/b;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lco/median/android/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->e:Lco/median/android/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lco/median/android/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->f:Lco/median/android/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lm0/o1;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->g:Lm0/o1;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Landroid/os/Message;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->h:Landroid/os/Message;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Lco/median/android/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->i:Lco/median/android/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/GoNativeApplication;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/GoNativeApplication;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public onCreate()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lco/median/android/GoNativeApplication;->q()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    invoke-static {v0}, Landroidx/appcompat/app/g;->J(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Lo0/b;->s(Landroid/app/Application;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v1, Lo0/a;->a:Ljava/lang/Exception;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v2, "Invalid appConfig json"

    .line 31
    .line 32
    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Lco/median/android/GoNativeApplication;->p:Ljava/lang/String;

    .line 44
    .line 45
    const-string v4, "AppConfig error"

    .line 46
    .line 47
    iget-object v5, v1, Lo0/a;->a:Ljava/lang/Exception;

    .line 48
    .line 49
    invoke-virtual {v2, v3, v4, v5}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    new-instance v2, Lco/median/android/u;

    .line 53
    .line 54
    invoke-direct {v2, p0}, Lco/median/android/u;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lco/median/android/GoNativeApplication;->e:Lco/median/android/u;

    .line 58
    .line 59
    iget-object v2, v1, Lo0/a;->l0:Lorg/json/JSONArray;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    new-instance v2, Lco/median/android/y;

    .line 64
    .line 65
    invoke-direct {v2, p0}, Lco/median/android/y;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lco/median/android/GoNativeApplication;->f:Lco/median/android/y;

    .line 69
    .line 70
    iget-object v3, v1, Lo0/a;->l0:Lorg/json/JSONArray;

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Lco/median/android/y;->e(Lorg/json/JSONArray;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-static {p0}, Lco/median/android/D;->d(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v2, Lm0/o1;

    .line 79
    .line 80
    invoke-direct {v2}, Lm0/o1;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Lco/median/android/GoNativeApplication;->g:Lm0/o1;

    .line 84
    .line 85
    new-instance v2, Lco/median/android/r;

    .line 86
    .line 87
    invoke-direct {v2}, Lco/median/android/r;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v2, p0, Lco/median/android/GoNativeApplication;->i:Lco/median/android/r;

    .line 91
    .line 92
    invoke-direct {p0, v1}, Lco/median/android/GoNativeApplication;->l(Lo0/a;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v1}, Lco/median/android/GoNativeApplication;->m(Lo0/a;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, LZ/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v2, 0x0

    .line 103
    const-string v3, "hasLaunched"

    .line 104
    .line 105
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    iput-boolean v0, p0, Lco/median/android/GoNativeApplication;->k:Z

    .line 112
    .line 113
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 122
    .line 123
    .line 124
    :cond_3
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, p1}, Lco/median/android/GoNativeApplication;->o(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public p(Landroid/os/Message;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/GoNativeApplication;->h:Landroid/os/Message;

    .line 2
    .line 3
    return-void
.end method
