.class public Lco/median/android/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/y$a;,
        Lco/median/android/y$b;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/String; = "co.median.android.y"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lorg/json/JSONObject;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lco/median/android/y;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lco/median/android/y;->d:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/y;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/y;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Lco/median/android/y;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/y;->b:Lorg/json/JSONObject;

    return-object p0
.end method

.method static bridge synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/y;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/String;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lco/median/android/y;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/y;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lco/median/android/y$a;

    .line 20
    .line 21
    invoke-static {v1}, Lco/median/android/y$a;->b(Lco/median/android/y$a;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {p1, v2}, Lo0/j;->h(Ljava/lang/String;Ljava/util/List;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Lco/median/android/y$a;->c()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public e(Lorg/json/JSONArray;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/y;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v2, "url"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    sget-object v1, Lco/median/android/y;->e:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "Invalid registration: endpoint url is null"

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-string v3, "urlRegex"

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lo0/j;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v3, Lco/median/android/y$a;

    .line 50
    .line 51
    invoke-direct {v3, p0, v2, v1}, Lco/median/android/y$a;-><init>(Lco/median/android/y;Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lco/median/android/y;->d:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_2
    return-void
.end method
