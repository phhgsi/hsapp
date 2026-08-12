.class public Lco/median/android/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationBarView$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/z$b;
    }
.end annotation


# static fields
.field private static final m:Ljava/lang/String; = "co.median.android.z"


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

.field private final c:Lo0/a;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lorg/json/JSONArray;

.field private g:Ljava/util/Map;

.field private final h:I

.field private i:I

.field private final j:Ljava/util/Map;

.field private k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lco/median/android/MainActivity;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lco/median/android/z;->j:Ljava/util/Map;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lco/median/android/z;->l:Z

    .line 13
    .line 14
    iput-object p1, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    iput-object p2, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 17
    .line 18
    invoke-virtual {p2, p0}, Lcom/google/android/material/navigation/NavigationBarView;->setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$c;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, Lco/median/android/z;->c:Lo0/a;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const v0, 0x7f0a0050

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lco/median/android/z;->h:I

    .line 39
    .line 40
    const p2, 0x7f0603d3

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iput p2, p0, Lco/median/android/z;->i:I

    .line 48
    .line 49
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lco/median/android/z$a;

    .line 54
    .line 55
    invoke-direct {p2, p0}, Lco/median/android/z$a;-><init>(Lco/median/android/z;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lo0/a;->a(Lo0/d$a;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lco/median/android/z;->i()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static synthetic b(Lco/median/android/z;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/z;->k(Z)V

    return-void
.end method

.method public static synthetic c(Lco/median/android/z;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/z;->j(I)V

    return-void
.end method

.method private d(IF)I
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr v0, p2

    .line 7
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const v0, 0xffffff

    .line 12
    .line 13
    .line 14
    and-int/2addr p1, v0

    .line 15
    shl-int/lit8 p2, p2, 0x18

    .line 16
    .line 17
    or-int/2addr p1, p2

    .line 18
    return p1
.end method

.method private g(I)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    if-ltz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    iget-object v0, p0, Lco/median/android/z;->j:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lco/median/android/z;->j:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/util/List;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    invoke-direct {p0, p1}, Lco/median/android/z;->h(Lorg/json/JSONObject;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lco/median/android/z;->j:Ljava/util/Map;

    .line 46
    .line 47
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    :goto_0
    return-object v1
.end method

.method private h(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "regex"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    invoke-static {p1}, Lo0/j;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private i()V
    .locals 6

    .line 1
    iget-object v0, p0, Lco/median/android/z;->c:Lo0/a;

    .line 2
    .line 3
    iget-object v1, v0, Lo0/a;->b0:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v0, v0, Lo0/a;->c0:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lco/median/android/z;->g:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v2, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ge v3, v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/util/regex/Pattern;

    .line 42
    .line 43
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lco/median/android/z;->c:Lo0/a;

    .line 50
    .line 51
    iget-object v0, v0, Lo0/a;->Y:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/util/Map$Entry;

    .line 72
    .line 73
    new-instance v3, Lco/median/android/z$b;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v3, v4}, Lco/median/android/z$b;-><init>(Lm0/c1;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lorg/json/JSONArray;

    .line 84
    .line 85
    iput-object v4, v3, Lco/median/android/z$b;->b:Lorg/json/JSONArray;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Ljava/util/regex/Pattern;

    .line 96
    .line 97
    iput-object v4, v3, Lco/median/android/z$b;->a:Ljava/util/regex/Pattern;

    .line 98
    .line 99
    iget-object v4, p0, Lco/median/android/z;->g:Ljava/util/Map;

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    :goto_2
    return-void
.end method

.method private synthetic j(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lco/median/android/z;->n(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private synthetic k(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private o(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lco/median/android/z;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lco/median/android/z;->q(Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v1, p0, Lco/median/android/z;->d:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void

    .line 23
    :cond_2
    :goto_0
    iput-object p1, p0, Lco/median/android/z;->d:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    invoke-static {v1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, Lo0/a;->Y:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lorg/json/JSONArray;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lco/median/android/z;->p(Lorg/json/JSONArray;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    :cond_3
    invoke-virtual {p0, v0}, Lco/median/android/z;->q(Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private p(Lorg/json/JSONArray;)V
    .locals 14

    .line 1
    iput-object p1, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, -0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    move v6, v3

    .line 32
    move v5, v4

    .line 33
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-ge v5, v7, :cond_b

    .line 38
    .line 39
    const/4 v7, 0x4

    .line 40
    if-le v5, v7, :cond_1

    .line 41
    .line 42
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v4, Lco/median/android/z;->m:Ljava/lang/String;

    .line 47
    .line 48
    const-string v5, "Tab menu items list should not have more than 5 items"

    .line 49
    .line 50
    invoke-virtual {p1, v4, v5}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-nez v7, :cond_2

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    const-string v8, "label"

    .line 64
    .line 65
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const-string v9, "icon"

    .line 70
    .line 71
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    const-string v10, "activeIcon"

    .line 76
    .line 77
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    const-string v11, "inactiveIcon"

    .line 82
    .line 83
    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-eqz v12, :cond_3

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    if-eqz v12, :cond_3

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-eqz v12, :cond_3

    .line 104
    .line 105
    const-string v12, "url"

    .line 106
    .line 107
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    if-eqz v12, :cond_3

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_5

    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_4

    .line 129
    .line 130
    move-object v9, v10

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const-string v9, "faw_question"

    .line 133
    .line 134
    :cond_5
    :goto_1
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-eqz v12, :cond_6

    .line 139
    .line 140
    move-object v10, v9

    .line 141
    :cond_6
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    if-eqz v12, :cond_7

    .line 146
    .line 147
    move-object v11, v9

    .line 148
    :cond_7
    iget-object v9, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 149
    .line 150
    iget v12, p0, Lco/median/android/z;->h:I

    .line 151
    .line 152
    iget v13, p0, Lco/median/android/z;->i:I

    .line 153
    .line 154
    invoke-static {v9, v10, v11, v12, v13}, Lm0/Q;->a(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;II)Lf/e;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    if-ge v5, v1, :cond_8

    .line 159
    .line 160
    invoke-interface {v0, v5}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    invoke-interface {v10, v8}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 167
    .line 168
    .line 169
    invoke-interface {v10, v9}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    invoke-interface {v0, v4, v5, v4, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-interface {v8, v9}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 178
    .line 179
    .line 180
    :cond_9
    :goto_2
    const-string v8, "selected"

    .line 181
    .line 182
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_a

    .line 187
    .line 188
    move v6, v5

    .line 189
    :cond_a
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_b
    :goto_4
    if-le v1, v2, :cond_d

    .line 194
    .line 195
    move p1, v2

    .line 196
    :goto_5
    if-ge p1, v1, :cond_d

    .line 197
    .line 198
    invoke-interface {v0, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-eqz v4, :cond_c

    .line 203
    .line 204
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-interface {v0, v4}, Landroid/view/Menu;->removeItem(I)V

    .line 209
    .line 210
    .line 211
    :cond_c
    add-int/lit8 p1, p1, 0x1

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_d
    if-le v6, v3, :cond_e

    .line 215
    .line 216
    new-instance p1, Landroid/os/Handler;

    .line 217
    .line 218
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 219
    .line 220
    .line 221
    new-instance v0, Lm0/b1;

    .line 222
    .line 223
    invoke-direct {v0, p0, v6}, Lm0/b1;-><init>(Lco/median/android/z;I)V

    .line 224
    .line 225
    .line 226
    const-wide/16 v1, 0xa

    .line 227
    .line 228
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 229
    .line 230
    .line 231
    :cond_e
    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "url"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "javascript"

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-boolean v2, p0, Lco/median/android/z;->l:Z

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iput-boolean v1, p0, Lco/median/android/z;->l:Z

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 46
    .line 47
    invoke-virtual {v2}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, v0, p1, v1, v1}, Lco/median/android/A;->f(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p1, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 56
    .line 57
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v0, v1, v1}, Lco/median/android/A;->e(Ljava/lang/String;ZZ)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return v1
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_4

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lco/median/android/z;->g(I)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/regex/Pattern;

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v0, 0x1

    .line 59
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_2
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lco/median/android/z;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    iget-boolean v0, p0, Lco/median/android/z;->k:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lco/median/android/z;->e(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lco/median/android/z;->c:Lo0/a;

    .line 19
    .line 20
    iget-object v1, v0, Lo0/a;->b0:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v0, v0, Lo0/a;->c0:Ljava/util/ArrayList;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-ge v2, v3, :cond_4

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/regex/Pattern;

    .line 41
    .line 42
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    const/4 v0, 0x0

    .line 63
    :goto_1
    invoke-direct {p0, v0}, Lco/median/android/z;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lco/median/android/z;->e(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_5
    :goto_2
    invoke-virtual {p0, v2}, Lco/median/android/z;->q(Z)V

    .line 73
    .line 74
    .line 75
    :cond_6
    :goto_3
    return-void
.end method

.method public l()V
    .locals 8

    .line 1
    iget-object v0, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 8
    .line 9
    iget-object v2, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const v3, 0x7f0603d1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const v2, 0x7f0603d3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, Lco/median/android/z;->i:I

    .line 39
    .line 40
    iget-object v1, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const v2, 0x7f0603d2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x2

    .line 54
    new-array v2, v1, [[I

    .line 55
    .line 56
    const v3, 0x10100a0

    .line 57
    .line 58
    .line 59
    filled-new-array {v3}, [I

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const/4 v5, 0x0

    .line 64
    aput-object v4, v2, v5

    .line 65
    .line 66
    const v4, -0x10100a0

    .line 67
    .line 68
    .line 69
    filled-new-array {v4}, [I

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v6, 0x1

    .line 74
    aput-object v4, v2, v6

    .line 75
    .line 76
    iget v4, p0, Lco/median/android/z;->i:I

    .line 77
    .line 78
    filled-new-array {v0, v4}, [I

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-instance v7, Landroid/content/res/ColorStateList;

    .line 83
    .line 84
    invoke-direct {v7, v2, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 88
    .line 89
    invoke-virtual {v2, v7}, Lcom/google/android/material/navigation/NavigationBarView;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 93
    .line 94
    invoke-virtual {v2, v7}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 98
    .line 99
    const/16 v4, 0x1d

    .line 100
    .line 101
    if-lt v2, v4, :cond_0

    .line 102
    .line 103
    iget-object v2, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 104
    .line 105
    invoke-virtual {v2}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const v4, 0x7f07032a

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v4}, Lm0/Z0;->a(Landroid/content/res/Resources;I)F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const v2, 0x3ec28f5c    # 0.38f

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-direct {p0, v0, v2}, Lco/median/android/z;->d(IF)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-direct {p0, v0, v2}, Lco/median/android/z;->d(IF)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    new-array v1, v1, [[I

    .line 129
    .line 130
    const v2, 0x10102fe

    .line 131
    .line 132
    .line 133
    filled-new-array {v2}, [I

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    aput-object v2, v1, v5

    .line 138
    .line 139
    filled-new-array {v3}, [I

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    aput-object v2, v1, v6

    .line 144
    .line 145
    filled-new-array {v4, v0}, [I

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 150
    .line 151
    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 155
    .line 156
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorEnabled(Z)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    const-string p2, ""

    .line 8
    .line 9
    :cond_1
    iget-object v1, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget-object v2, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 15
    .line 16
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_3

    .line 21
    .line 22
    iget-object v2, p0, Lco/median/android/z;->f:Lorg/json/JSONArray;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    const-string v3, "url"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "javascript"

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object v2, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lcom/google/android/material/navigation/NavigationBarView;->setSelectedItemId(I)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    return v0
.end method

.method public n(IZ)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lt p1, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-boolean p2, p0, Lco/median/android/z;->l:Z

    .line 17
    .line 18
    iget-object p2, p0, Lco/median/android/z;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setSelectedItemId(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public q(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/z;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lm0/a1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lm0/a1;-><init>(Lco/median/android/z;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
