.class public Lm0/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/o1$d;
    }
.end annotation


# instance fields
.field private a:Lm0/O;

.field private b:Z

.field private c:Ljava/util/Map;

.field private d:Ljava/util/Map;

.field private e:Lm0/o1$d;

.field private f:Ljava/util/List;

.field private g:Ljava/util/Set;

.field private h:Lo0/h;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:Ljava/lang/String;

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm0/o1$d;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lm0/o1$d;-><init>(Lm0/o1;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm0/o1;->e:Lm0/o1$d;

    .line 10
    .line 11
    return-void
.end method

.method static bridge synthetic a(Lm0/o1;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->i:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic b(Lm0/o1;)Lo0/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->h:Lo0/h;

    return-object p0
.end method

.method static bridge synthetic c(Lm0/o1;)Lm0/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->a:Lm0/O;

    return-object p0
.end method

.method static bridge synthetic d(Lm0/o1;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->c:Ljava/util/Map;

    return-object p0
.end method

.method static bridge synthetic e(Lm0/o1;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->g:Ljava/util/Set;

    return-object p0
.end method

.method static bridge synthetic f(Lm0/o1;)Lm0/o1$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/o1;->e:Lm0/o1$d;

    return-object p0
.end method

.method static bridge synthetic g(Lm0/o1;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o1;->i:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic h(Lm0/o1;Lo0/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o1;->h:Lo0/h;

    return-void
.end method

.method static bridge synthetic i(Lm0/o1;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/o1;->j:Z

    return-void
.end method

.method static bridge synthetic j(Lm0/o1;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm0/o1;->q(Landroid/app/Activity;)V

    return-void
.end method

.method private p(Landroid/app/Activity;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lo0/a;->p1:Lorg/json/JSONArray;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_9

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_8

    .line 23
    .line 24
    const-string v4, "urls"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_8

    .line 31
    .line 32
    new-instance v4, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    move v5, v1

    .line 38
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-ge v5, v6, :cond_7

    .line 43
    .line 44
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->isNull(I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    sget-object v6, Lm0/p1;->g:Lm0/p1;

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    instance-of v8, v7, Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    move-object v8, v7

    .line 62
    check-cast v8, Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 v8, 0x0

    .line 66
    :goto_2
    if-nez v8, :cond_5

    .line 67
    .line 68
    instance-of v9, v7, Lorg/json/JSONObject;

    .line 69
    .line 70
    if-eqz v9, :cond_5

    .line 71
    .line 72
    check-cast v7, Lorg/json/JSONObject;

    .line 73
    .line 74
    const-string v8, "url"

    .line 75
    .line 76
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    const-string v9, "disown"

    .line 81
    .line 82
    invoke-static {v7, v9}, Lo0/a;->j(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-eqz v7, :cond_5

    .line 87
    .line 88
    const-string v9, "reload"

    .line 89
    .line 90
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_3

    .line 95
    .line 96
    sget-object v6, Lm0/p1;->e:Lm0/p1;

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const-string v9, "never"

    .line 100
    .line 101
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_4

    .line 106
    .line 107
    sget-object v6, Lm0/p1;->f:Lm0/p1;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    const-string v9, "always"

    .line 111
    .line 112
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_5

    .line 117
    .line 118
    sget-object v6, Lm0/p1;->d:Lm0/p1;

    .line 119
    .line 120
    :cond_5
    :goto_3
    if-eqz v8, :cond_6

    .line 121
    .line 122
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v7, p0, Lm0/o1;->d:Ljava/util/Map;

    .line 126
    .line 127
    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_6
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_7
    iget-object v3, p0, Lm0/o1;->f:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_9
    iget-object v0, p0, Lm0/o1;->k:Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v0, :cond_a

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lm0/o1;->s(Ljava/lang/String;)Landroid/util/Pair;

    .line 147
    .line 148
    .line 149
    :cond_a
    invoke-direct {p0, p1}, Lm0/o1;->q(Landroid/app/Activity;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method private q(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/o1;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lm0/o1;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lm0/o1;->h:Lo0/h;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lm0/o1;->i:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Lm0/o1$b;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lm0/o1$b;-><init>(Lm0/o1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Lm0/o1;->j:Z

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Lm0/o1;->g:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lm0/o1;->g:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    iput-object v0, p0, Lm0/o1;->i:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p0, Lm0/o1;->a:Lm0/O;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lm0/O;->c(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lm0/o1$c;

    .line 58
    .line 59
    invoke-direct {v1, p0, p1, v0}, Lm0/o1$c;-><init>(Lm0/o1;Landroid/app/Activity;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
.end method

.method private r(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lm0/o1;->f:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-object v0
.end method


# virtual methods
.method public k(Lo0/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-ne v2, p1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lm0/o1;->g:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/o1;->h:Lo0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lo0/h;->stopLoading()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lm0/o1;->j:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lm0/o1;->h:Lo0/h;

    .line 13
    .line 14
    iput-object v0, p0, Lm0/o1;->i:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lm0/o1;->k:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public m(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/o1;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lm0/o1;->b:Z

    .line 8
    .line 9
    new-instance v0, Lm0/O;

    .line 10
    .line 11
    invoke-direct {v0}, Lm0/O;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lm0/o1;->a:Lm0/O;

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lm0/o1;->d:Ljava/util/Map;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lm0/o1;->f:Ljava/util/List;

    .line 36
    .line 37
    new-instance v0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lm0/o1;->g:Ljava/util/Set;

    .line 43
    .line 44
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Lm0/o1$a;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1}, Lm0/o1$a;-><init>(Lm0/o1;Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lo0/a;->a(Lo0/d$a;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, p1}, Lm0/o1;->p(Landroid/app/Activity;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public n(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm0/o1;->l:Z

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lm0/o1;->q(Landroid/app/Activity;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lm0/o1;->l:Z

    .line 3
    .line 4
    iget-object v0, p0, Lm0/o1;->h:Lo0/h;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lo0/h;->stopLoading()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lm0/o1;->j:Z

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public s(Ljava/lang/String;)Landroid/util/Pair;
    .locals 2

    .line 1
    iput-object p1, p0, Lm0/o1;->k:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lm0/o1;->r(Ljava/lang/String;)Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_1

    .line 12
    .line 13
    new-instance v1, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lm0/o1;->i:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lm0/o1;->g:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lm0/o1;->c:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lo0/h;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    new-instance p1, Landroid/util/Pair;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {p1, v0, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_2
    iget-object v1, p0, Lm0/o1;->d:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lm0/p1;

    .line 63
    .line 64
    new-instance v1, Landroid/util/Pair;

    .line 65
    .line 66
    invoke-direct {v1, v0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method
