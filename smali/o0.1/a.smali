.class public Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/a$a;,
        Lo0/a$b;,
        Lo0/a$c;
    }
.end annotation


# static fields
.field private static r1:Lo0/a;


# instance fields
.field public A:Ljava/lang/String;

.field public A0:F

.field public B:Ljava/lang/String;

.field public B0:D

.field public C:Ljava/lang/String;

.field public C0:Z

.field public D:Ljava/lang/String;

.field public D0:Z

.field public E:Lorg/json/JSONObject;

.field public E0:Ljava/lang/String;

.field public F:Ljava/util/List;

.field public F0:Ljava/lang/String;

.field public G:Ljava/util/List;

.field public G0:Ljava/lang/String;

.field public H:Z

.field public H0:Z

.field public I:Ljava/util/Map;

.field public I0:Z

.field public J:Ljava/lang/String;

.field public J0:Z

.field public K:Z

.field public K0:Z

.field public L:Z

.field public L0:I

.field public M:Z

.field public M0:Ljava/lang/Integer;

.field public N:Z

.field public N0:D

.field public O:Ljava/lang/String;

.field public O0:Ljava/lang/Boolean;

.field public P:Ljava/lang/String;

.field public P0:Ljava/lang/String;

.field public Q:Ljava/lang/String;

.field public Q0:Lo0/a$c;

.field public R:I

.field public R0:Lorg/json/JSONObject;

.field public S:F

.field public S0:Z

.field public T:Lo0/a$b;

.field public T0:Z

.field public U:Lo0/a$b;

.field public U0:Z

.field public V:Lo0/a$b;

.field public V0:Lq0/d;

.field public W:Z

.field public W0:Lq0/a;

.field public X:Ljava/util/Map;

.field public X0:Z

.field public Y:Ljava/util/Map;

.field public Y0:Lq0/c;

.field public Z:Z

.field public Z0:Lorg/json/JSONObject;

.field public a:Ljava/lang/Exception;

.field public a0:Lorg/json/JSONArray;

.field public a1:Lorg/json/JSONObject;

.field private final b:Lo0/d;

.field public b0:Ljava/util/ArrayList;

.field public b1:Lorg/json/JSONArray;

.field public c:Ljava/lang/String;

.field public c0:Ljava/util/ArrayList;

.field public c1:Lorg/json/JSONObject;

.field public d:Ljava/lang/String;

.field public d0:Z

.field public d1:Z

.field public e:Ljava/lang/String;

.field public e0:Z

.field public e1:I

.field public f:Ljava/lang/String;

.field public f0:Z

.field public f1:I

.field public g:Ljava/lang/String;

.field public g0:Ljava/util/ArrayList;

.field public g1:Z

.field public h:Z

.field public h0:Z

.field public h1:Lorg/json/JSONObject;

.field public i:Z

.field public i0:Ljava/util/ArrayList;

.field private i1:Z

.field public j:Ljava/lang/String;

.field public j0:Ljava/util/ArrayList;

.field private j1:Ljava/util/List;

.field public k:Ljava/lang/String;

.field public k0:Lo0/k;

.field private k1:Z

.field public l:Ljava/lang/String;

.field public l0:Lorg/json/JSONArray;

.field public l1:Z

.field public m:Ljava/lang/String;

.field public m0:Z

.field public m1:Z

.field public n:Z

.field public n0:Z

.field public n1:Z

.field public o:I

.field public o0:Lorg/json/JSONArray;

.field public o1:Z

.field public p:Z

.field public p0:Z

.field public p1:Lorg/json/JSONArray;

.field public q:I

.field public q0:I

.field private q1:Ljava/util/Map;

.field public r:Z

.field public r0:Ljava/util/List;

.field public s:Z

.field public s0:Ljava/util/List;

.field public t:Lo0/a$a;

.field public t0:Z

.field public u:I

.field public u0:Ljava/util/ArrayList;

.field public v:Ljava/util/List;

.field public v0:Ljava/util/ArrayList;

.field public w:Lorg/json/JSONArray;

.field public w0:Ljava/util/Map;

.field public x:Lorg/json/JSONArray;

.field public x0:Z

.field public y:Lorg/json/JSONArray;

.field public y0:Z

.field public z:Ljava/lang/String;

.field public z0:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo0/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lo0/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo0/a;->b:Lo0/d;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lo0/a;->h:Z

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lo0/a;->i:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Lo0/a;->n:Z

    .line 18
    .line 19
    iput v0, p0, Lo0/a;->o:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lo0/a;->p:Z

    .line 22
    .line 23
    iput v0, p0, Lo0/a;->q:I

    .line 24
    .line 25
    iput-boolean v1, p0, Lo0/a;->r:Z

    .line 26
    .line 27
    iput-boolean v0, p0, Lo0/a;->s:Z

    .line 28
    .line 29
    sget-object v2, Lo0/a$a;->d:Lo0/a$a;

    .line 30
    .line 31
    iput-object v2, p0, Lo0/a;->t:Lo0/a$a;

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    iput v2, p0, Lo0/a;->u:I

    .line 35
    .line 36
    iput-boolean v0, p0, Lo0/a;->H:Z

    .line 37
    .line 38
    iput-boolean v0, p0, Lo0/a;->K:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lo0/a;->L:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lo0/a;->M:Z

    .line 43
    .line 44
    iput-boolean v1, p0, Lo0/a;->N:Z

    .line 45
    .line 46
    const/16 v2, 0xa

    .line 47
    .line 48
    iput v2, p0, Lo0/a;->R:I

    .line 49
    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    iput v3, p0, Lo0/a;->S:F

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    iput-object v3, p0, Lo0/a;->T:Lo0/a$b;

    .line 56
    .line 57
    iput-object v3, p0, Lo0/a;->U:Lo0/a$b;

    .line 58
    .line 59
    iput-object v3, p0, Lo0/a;->V:Lo0/a$b;

    .line 60
    .line 61
    iput-boolean v0, p0, Lo0/a;->W:Z

    .line 62
    .line 63
    new-instance v4, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v4, p0, Lo0/a;->X:Ljava/util/Map;

    .line 69
    .line 70
    new-instance v4, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v4, p0, Lo0/a;->Y:Ljava/util/Map;

    .line 76
    .line 77
    iput-boolean v0, p0, Lo0/a;->Z:Z

    .line 78
    .line 79
    iput-boolean v1, p0, Lo0/a;->d0:Z

    .line 80
    .line 81
    iput-boolean v0, p0, Lo0/a;->e0:Z

    .line 82
    .line 83
    iput-boolean v1, p0, Lo0/a;->f0:Z

    .line 84
    .line 85
    iput-boolean v1, p0, Lo0/a;->h0:Z

    .line 86
    .line 87
    iput-boolean v0, p0, Lo0/a;->m0:Z

    .line 88
    .line 89
    iput-boolean v0, p0, Lo0/a;->n0:Z

    .line 90
    .line 91
    iput-boolean v1, p0, Lo0/a;->p0:Z

    .line 92
    .line 93
    iput v2, p0, Lo0/a;->q0:I

    .line 94
    .line 95
    iput-boolean v0, p0, Lo0/a;->t0:Z

    .line 96
    .line 97
    iput-boolean v0, p0, Lo0/a;->x0:Z

    .line 98
    .line 99
    iput-boolean v0, p0, Lo0/a;->y0:Z

    .line 100
    .line 101
    iput-boolean v0, p0, Lo0/a;->z0:Z

    .line 102
    .line 103
    const/high16 v2, 0x3f000000    # 0.5f

    .line 104
    .line 105
    iput v2, p0, Lo0/a;->A0:F

    .line 106
    .line 107
    const-wide v4, 0x3fc999999999999aL    # 0.2

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    iput-wide v4, p0, Lo0/a;->B0:D

    .line 113
    .line 114
    iput-boolean v0, p0, Lo0/a;->C0:Z

    .line 115
    .line 116
    iput-boolean v0, p0, Lo0/a;->D0:Z

    .line 117
    .line 118
    const-string v2, "auto"

    .line 119
    .line 120
    iput-object v2, p0, Lo0/a;->E0:Ljava/lang/String;

    .line 121
    .line 122
    iput-object v2, p0, Lo0/a;->F0:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v2, p0, Lo0/a;->G0:Ljava/lang/String;

    .line 125
    .line 126
    iput-boolean v0, p0, Lo0/a;->H0:Z

    .line 127
    .line 128
    iput-boolean v0, p0, Lo0/a;->I0:Z

    .line 129
    .line 130
    iput-boolean v1, p0, Lo0/a;->J0:Z

    .line 131
    .line 132
    iput-boolean v1, p0, Lo0/a;->K0:Z

    .line 133
    .line 134
    iput v1, p0, Lo0/a;->L0:I

    .line 135
    .line 136
    iput-object v3, p0, Lo0/a;->M0:Ljava/lang/Integer;

    .line 137
    .line 138
    const-wide/high16 v4, 0x7ff8000000000000L    # Double.NaN

    .line 139
    .line 140
    iput-wide v4, p0, Lo0/a;->N0:D

    .line 141
    .line 142
    iput-object v3, p0, Lo0/a;->O0:Ljava/lang/Boolean;

    .line 143
    .line 144
    iput-object v3, p0, Lo0/a;->P0:Ljava/lang/String;

    .line 145
    .line 146
    new-instance v2, Lo0/a$c;

    .line 147
    .line 148
    invoke-direct {v2}, Lo0/a$c;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v2, p0, Lo0/a;->Q0:Lo0/a$c;

    .line 152
    .line 153
    iput-boolean v0, p0, Lo0/a;->S0:Z

    .line 154
    .line 155
    iput-boolean v0, p0, Lo0/a;->T0:Z

    .line 156
    .line 157
    iput-boolean v1, p0, Lo0/a;->U0:Z

    .line 158
    .line 159
    new-instance v2, Lq0/d;

    .line 160
    .line 161
    invoke-direct {v2}, Lq0/d;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object v2, p0, Lo0/a;->V0:Lq0/d;

    .line 165
    .line 166
    new-instance v2, Lq0/a;

    .line 167
    .line 168
    invoke-direct {v2}, Lq0/a;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v2, p0, Lo0/a;->W0:Lq0/a;

    .line 172
    .line 173
    iput-boolean v0, p0, Lo0/a;->X0:Z

    .line 174
    .line 175
    new-instance v2, Lq0/c;

    .line 176
    .line 177
    invoke-direct {v2}, Lq0/c;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object v2, p0, Lo0/a;->Y0:Lq0/c;

    .line 181
    .line 182
    iput-boolean v0, p0, Lo0/a;->d1:Z

    .line 183
    .line 184
    const/4 v2, 0x5

    .line 185
    iput v2, p0, Lo0/a;->e1:I

    .line 186
    .line 187
    iput v2, p0, Lo0/a;->f1:I

    .line 188
    .line 189
    iput-boolean v0, p0, Lo0/a;->g1:Z

    .line 190
    .line 191
    iput-boolean v0, p0, Lo0/a;->i1:Z

    .line 192
    .line 193
    iput-boolean v1, p0, Lo0/a;->k1:Z

    .line 194
    .line 195
    iput-boolean v0, p0, Lo0/a;->l1:Z

    .line 196
    .line 197
    iput-boolean v0, p0, Lo0/a;->m1:Z

    .line 198
    .line 199
    iput-boolean v0, p0, Lo0/a;->n1:Z

    .line 200
    .line 201
    iput-boolean v0, p0, Lo0/a;->o1:Z

    .line 202
    .line 203
    :try_start_0
    const-string v0, "appConfig.json"

    .line 204
    .line 205
    invoke-direct {p0, p1, v0}, Lo0/a;->s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v1, Lorg/json/JSONObject;

    .line 210
    .line 211
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-direct {p0, v1, p1}, Lo0/a;->l(Lorg/json/JSONObject;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :catch_0
    move-exception p1

    .line 219
    iput-object p1, p0, Lo0/a;->a:Ljava/lang/Exception;

    .line 220
    .line 221
    const-string v0, "AppConfig"

    .line 222
    .line 223
    const-string v1, "Error parsing appConfig.json"

    .line 224
    .line 225
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "customCSS.css"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lo0/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-boolean v0, p0, Lo0/a;->l1:Z

    .line 8
    .line 9
    const-string v0, "customJS.js"

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Lo0/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput-boolean v0, p0, Lo0/a;->m1:Z

    .line 16
    .line 17
    const-string v0, "androidCustomCSS.css"

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Lo0/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput-boolean v0, p0, Lo0/a;->n1:Z

    .line 24
    .line 25
    const-string v0, "androidCustomJS.js"

    .line 26
    .line 27
    invoke-direct {p0, p1, v0}, Lo0/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput-boolean p1, p0, Lo0/a;->o1:Z

    .line 32
    .line 33
    return-void
.end method

.method public static declared-synchronized f(Landroid/content/Context;)Lo0/a;
    .locals 2

    .line 1
    const-class v0, Lo0/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lo0/a;->r1:Lo0/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lo0/a;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, Lo0/a;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lo0/a;->r1:Lo0/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    sget-object p0, Lo0/a;->r1:Lo0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method

.method public static j(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private k(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    const-string v0, "active"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    const-string v0, "actions"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "actionSelection"

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v2, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lo0/a;->w0:Ljava/util/Map;

    .line 32
    .line 33
    move v2, v1

    .line 34
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v2, v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    const-string v4, "name"

    .line 47
    .line 48
    invoke-static {v3, v4}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    iget-object v5, p0, Lo0/a;->w0:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-eqz p1, :cond_4

    .line 63
    .line 64
    new-instance v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lo0/a;->u0:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lo0/a;->v0:Ljava/util/ArrayList;

    .line 77
    .line 78
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-ge v1, v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    const-string v2, "regex"

    .line 91
    .line 92
    invoke-static {v0, v2}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "id"

    .line 97
    .line 98
    invoke-static {v0, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    :try_start_0
    iget-object v3, p0, Lo0/a;->u0:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lo0/a;->v0:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    :catch_0
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    :goto_2
    return-void
.end method

.method private l(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "general"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lo0/a;->n(Lorg/json/JSONObject;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    const-string v0, "navigation"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lo0/a;->o(Lorg/json/JSONObject;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    const-string v0, "styling"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lo0/a;->r(Lorg/json/JSONObject;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    const-string v0, "permissions"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lo0/a;->p(Lorg/json/JSONObject;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    const-string v0, "contextMenu"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lo0/a;->m(Lorg/json/JSONObject;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    const-string v0, "services"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lo0/a;->c1:Lorg/json/JSONObject;

    .line 66
    .line 67
    const-string v0, "developmentTools"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    const-string v0, "enableWebConsoleLogs"

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iput-boolean p1, p0, Lo0/a;->d1:Z

    .line 83
    .line 84
    :cond_5
    invoke-direct {p0, p2}, Lo0/a;->c(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :goto_1
    iput-object p1, p0, Lo0/a;->a:Ljava/lang/Exception;

    .line 89
    .line 90
    const-string p2, "AppConfig"

    .line 91
    .line 92
    const-string v0, "Error in parseConfig"

    .line 93
    .line 94
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method private m(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    new-instance v0, Lq0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq0/c;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lo0/a;->Y0:Lq0/c;

    .line 7
    .line 8
    const-string v1, "enabled"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput-boolean v1, v0, Lq0/c;->a:Z

    .line 16
    .line 17
    const-string v0, "linkActions"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lo0/a;->Y0:Lq0/c;

    .line 26
    .line 27
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-array v1, v1, [Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, v0, Lq0/c;->b:[Ljava/lang/String;

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ge v2, v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lo0/a;->Y0:Lq0/c;

    .line 42
    .line 43
    iget-object v0, v0, Lq0/c;->b:[Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void
.end method

.method private n(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    const-string v0, "publicKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lo0/a;->c:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "deviceRegKey"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lo0/a;->d:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "appName"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lo0/a;->e:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "initialUrl"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lo0/a;->f:Ljava/lang/String;

    .line 32
    .line 33
    const-string v0, "androidPackageName"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lo0/a;->g:Ljava/lang/String;

    .line 40
    .line 41
    const-string v0, "keepScreenOn"

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput-boolean v0, p0, Lo0/a;->h:Z

    .line 49
    .line 50
    const-string v0, "enableWindowOpen"

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput-boolean v0, p0, Lo0/a;->i:Z

    .line 58
    .line 59
    const-string v0, "forceUserAgent"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lo0/a;->j:Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "userAgentAdd"

    .line 68
    .line 69
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lo0/a;->k:Ljava/lang/String;

    .line 74
    .line 75
    const-string v0, "androidForceUserAgent"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, p0, Lo0/a;->l:Ljava/lang/String;

    .line 82
    .line 83
    const-string v3, "androidUserAgentAdd"

    .line 84
    .line 85
    invoke-static {p1, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iput-object v3, p0, Lo0/a;->m:Ljava/lang/String;

    .line 90
    .line 91
    const-string v3, "injectMedianJS"

    .line 92
    .line 93
    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iput-boolean v2, p0, Lo0/a;->n:Z

    .line 98
    .line 99
    const-string v2, "forceSessionCookieExpiry"

    .line 100
    .line 101
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iput v2, p0, Lo0/a;->o:I

    .line 106
    .line 107
    const-string v2, "androidFullScreen"

    .line 108
    .line 109
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    iput-boolean v2, p0, Lo0/a;->p:Z

    .line 114
    .line 115
    const-string v2, "version"

    .line 116
    .line 117
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    iput v2, p0, Lo0/a;->q:I

    .line 122
    .line 123
    const-string v2, "nativeBridgeUrls"

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-eqz v2, :cond_0

    .line 130
    .line 131
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-lez v3, :cond_0

    .line 136
    .line 137
    invoke-static {v2}, Lo0/j;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iput-object v2, p0, Lo0/a;->v:Ljava/util/List;

    .line 142
    .line 143
    :cond_0
    const-string v2, "userAgentRegexes"

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iput-object v2, p0, Lo0/a;->w:Lorg/json/JSONArray;

    .line 150
    .line 151
    const-string v2, "replaceStrings"

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iput-object v2, p0, Lo0/a;->x:Lorg/json/JSONArray;

    .line 158
    .line 159
    const-string v2, "languages"

    .line 160
    .line 161
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iput-object v2, p0, Lo0/a;->y:Lorg/json/JSONArray;

    .line 166
    .line 167
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Lo0/a;->l:Ljava/lang/String;

    .line 172
    .line 173
    if-eqz v0, :cond_1

    .line 174
    .line 175
    iput-object v0, p0, Lo0/a;->z:Ljava/lang/String;

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_1
    iget-object v0, p0, Lo0/a;->j:Ljava/lang/String;

    .line 179
    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    iput-object v0, p0, Lo0/a;->z:Ljava/lang/String;

    .line 183
    .line 184
    :cond_2
    :goto_0
    const-string v0, "loginDetectionUrl"

    .line 185
    .line 186
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iput-object v0, p0, Lo0/a;->A:Ljava/lang/String;

    .line 191
    .line 192
    const-string v0, "loginUrl"

    .line 193
    .line 194
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, p0, Lo0/a;->C:Ljava/lang/String;

    .line 199
    .line 200
    const-string v0, "signupUrl"

    .line 201
    .line 202
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iput-object v0, p0, Lo0/a;->B:Ljava/lang/String;

    .line 207
    .line 208
    const-string v0, "userIdRegex"

    .line 209
    .line 210
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, p0, Lo0/a;->D:Ljava/lang/String;

    .line 215
    .line 216
    const-string v0, "loginConfig"

    .line 217
    .line 218
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iput-object v0, p0, Lo0/a;->E:Lorg/json/JSONObject;

    .line 223
    .line 224
    const-string v0, "loginDetect"

    .line 225
    .line 226
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_4

    .line 231
    .line 232
    new-instance v2, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object v2, p0, Lo0/a;->F:Ljava/util/List;

    .line 238
    .line 239
    new-instance v2, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 242
    .line 243
    .line 244
    iput-object v2, p0, Lo0/a;->G:Ljava/util/List;

    .line 245
    .line 246
    move v2, v1

    .line 247
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-ge v2, v3, :cond_4

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-eqz v3, :cond_3

    .line 258
    .line 259
    const-string v4, "regex"

    .line 260
    .line 261
    invoke-static {v3, v4}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-eqz v4, :cond_3

    .line 266
    .line 267
    :try_start_0
    iget-object v5, p0, Lo0/a;->F:Ljava/util/List;

    .line 268
    .line 269
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    iget-object v4, p0, Lo0/a;->G:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    .line 280
    .line 281
    :catch_0
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_4
    const-string v0, "interceptHtml"

    .line 285
    .line 286
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    iput-boolean v0, p0, Lo0/a;->H:Z

    .line 291
    .line 292
    const-string v0, "clearCache"

    .line 293
    .line 294
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    iput-boolean v0, p0, Lo0/a;->L:Z

    .line 299
    .line 300
    const-string v0, "screenOrientation"

    .line 301
    .line 302
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    if-eqz p1, :cond_6

    .line 307
    .line 308
    const-string v0, "androidPhone"

    .line 309
    .line 310
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    const-string v1, "androidTablet"

    .line 315
    .line 316
    invoke-static {p1, v1}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    if-eqz v0, :cond_5

    .line 321
    .line 322
    invoke-direct {p0, v0}, Lo0/a;->q(Ljava/lang/String;)Lo0/a$b;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iput-object v0, p0, Lo0/a;->U:Lo0/a$b;

    .line 327
    .line 328
    iput-object v0, p0, Lo0/a;->T:Lo0/a$b;

    .line 329
    .line 330
    :cond_5
    if-eqz p1, :cond_6

    .line 331
    .line 332
    invoke-direct {p0, p1}, Lo0/a;->q(Ljava/lang/String;)Lo0/a$b;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    iput-object p1, p0, Lo0/a;->V:Lo0/a$b;

    .line 337
    .line 338
    :cond_6
    return-void
.end method

.method private o(Lorg/json/JSONObject;)V
    .locals 12

    .line 1
    const-string v0, "tabNavigation"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "items"

    .line 8
    .line 9
    const-string v2, "name"

    .line 10
    .line 11
    const-string v3, "regex"

    .line 12
    .line 13
    const-string v4, "active"

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iput-boolean v6, p0, Lo0/a;->Z:Z

    .line 23
    .line 24
    const-string v6, "tabSelectionConfig"

    .line 25
    .line 26
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    iput-object v7, p0, Lo0/a;->a0:Lorg/json/JSONArray;

    .line 31
    .line 32
    const-string v7, "tabMenus"

    .line 33
    .line 34
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    move v8, v5

    .line 41
    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-ge v8, v9, :cond_1

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    if-eqz v9, :cond_0

    .line 52
    .line 53
    invoke-static {v9, v2}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-eqz v10, :cond_0

    .line 62
    .line 63
    iget-object v11, p0, Lo0/a;->Y:Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {v11, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    new-instance v6, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v6, p0, Lo0/a;->b0:Ljava/util/ArrayList;

    .line 83
    .line 84
    new-instance v6, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v6, p0, Lo0/a;->c0:Ljava/util/ArrayList;

    .line 90
    .line 91
    move v6, v5

    .line 92
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-ge v6, v7, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-eqz v7, :cond_2

    .line 103
    .line 104
    invoke-static {v7, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const-string v9, "id"

    .line 109
    .line 110
    invoke-static {v7, v9}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    if-eqz v7, :cond_2

    .line 117
    .line 118
    :try_start_0
    iget-object v9, p0, Lo0/a;->b0:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-object v8, p0, Lo0/a;->c0:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    :catch_0
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const-string v0, "sidebarNavigation"

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const/4 v6, 0x1

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    const-string v7, "menuSelectionConfig"

    .line 145
    .line 146
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    iput-object v7, p0, Lo0/a;->h1:Lorg/json/JSONObject;

    .line 151
    .line 152
    const-string v7, "menus"

    .line 153
    .line 154
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    move v7, v5

    .line 161
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-ge v7, v8, :cond_5

    .line 166
    .line 167
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    if-eqz v8, :cond_4

    .line 172
    .line 173
    invoke-virtual {v8, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    invoke-static {v8, v2}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    if-eqz v10, :cond_4

    .line 186
    .line 187
    iget-object v11, p0, Lo0/a;->X:Ljava/util/Map;

    .line 188
    .line 189
    invoke-interface {v11, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    if-eqz v9, :cond_4

    .line 193
    .line 194
    if-eqz v8, :cond_4

    .line 195
    .line 196
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-lez v8, :cond_4

    .line 201
    .line 202
    iput-boolean v6, p0, Lo0/a;->W:Z

    .line 203
    .line 204
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_5
    const-string v0, "regexInternalExternal"

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_6

    .line 220
    .line 221
    const-string v1, "rules"

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v1, Lo0/k;

    .line 228
    .line 229
    invoke-direct {v1, v0}, Lo0/k;-><init>(Lorg/json/JSONArray;)V

    .line 230
    .line 231
    .line 232
    iput-object v1, p0, Lo0/a;->k0:Lo0/k;

    .line 233
    .line 234
    :cond_6
    const-string v0, "androidPullToRefresh"

    .line 235
    .line 236
    invoke-virtual {p1, v0, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    iput-boolean v0, p0, Lo0/a;->d0:Z

    .line 241
    .line 242
    const-string v0, "androidShowRefreshButton"

    .line 243
    .line 244
    invoke-virtual {p1, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    iput-boolean v0, p0, Lo0/a;->e0:Z

    .line 249
    .line 250
    const-string v0, "swipeGestures"

    .line 251
    .line 252
    invoke-virtual {p1, v0, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    iput-boolean v0, p0, Lo0/a;->f0:Z

    .line 257
    .line 258
    const-string v0, "navigationTitles"

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-eqz v0, :cond_a

    .line 265
    .line 266
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_a

    .line 271
    .line 272
    iput-boolean v6, p0, Lo0/a;->h0:Z

    .line 273
    .line 274
    const-string v1, "titles"

    .line 275
    .line 276
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eqz v0, :cond_a

    .line 281
    .line 282
    new-instance v1, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    iput-object v1, p0, Lo0/a;->g0:Ljava/util/ArrayList;

    .line 288
    .line 289
    move v1, v5

    .line 290
    :goto_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-ge v1, v2, :cond_a

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    if-eqz v2, :cond_9

    .line 301
    .line 302
    new-instance v7, Ljava/util/HashMap;

    .line 303
    .line 304
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-static {v2, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    const-string v9, "title"

    .line 312
    .line 313
    invoke-static {v2, v9}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    const-string v11, "showImage"

    .line 318
    .line 319
    invoke-virtual {v2, v11, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v8, :cond_7

    .line 324
    .line 325
    invoke-virtual {v7, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    :cond_7
    if-eqz v10, :cond_8

    .line 329
    .line 330
    invoke-virtual {v7, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v7, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    iget-object v2, p0, Lo0/a;->g0:Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_a
    const-string v0, "navigationLevels"

    .line 349
    .line 350
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-eqz v0, :cond_c

    .line 355
    .line 356
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_c

    .line 361
    .line 362
    const-string v1, "levels"

    .line 363
    .line 364
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-eqz v0, :cond_c

    .line 369
    .line 370
    new-instance v1, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 373
    .line 374
    .line 375
    iput-object v1, p0, Lo0/a;->i0:Ljava/util/ArrayList;

    .line 376
    .line 377
    new-instance v1, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 380
    .line 381
    .line 382
    iput-object v1, p0, Lo0/a;->j0:Ljava/util/ArrayList;

    .line 383
    .line 384
    move v1, v5

    .line 385
    :goto_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-ge v1, v2, :cond_c

    .line 390
    .line 391
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    if-eqz v2, :cond_b

    .line 396
    .line 397
    invoke-static {v2, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    const-string v7, "level"

    .line 402
    .line 403
    invoke-virtual {v2, v7, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v4, :cond_b

    .line 408
    .line 409
    :try_start_1
    iget-object v7, p0, Lo0/a;->i0:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    iget-object v4, p0, Lo0/a;->j0:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 425
    .line 426
    .line 427
    :catch_1
    :cond_b
    add-int/lit8 v1, v1, 0x1

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_c
    const-string v0, "deepLinkDomains"

    .line 431
    .line 432
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    if-eqz v0, :cond_f

    .line 437
    .line 438
    const-string v1, "domains"

    .line 439
    .line 440
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    if-eqz v1, :cond_e

    .line 445
    .line 446
    new-instance v2, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 449
    .line 450
    .line 451
    iput-object v2, p0, Lo0/a;->s0:Ljava/util/List;

    .line 452
    .line 453
    move v2, v5

    .line 454
    :goto_5
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-ge v2, v3, :cond_e

    .line 459
    .line 460
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    if-eqz v3, :cond_d

    .line 465
    .line 466
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-nez v4, :cond_d

    .line 471
    .line 472
    iget-object v4, p0, Lo0/a;->s0:Ljava/util/List;

    .line 473
    .line 474
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 478
    .line 479
    goto :goto_5

    .line 480
    :cond_e
    const-string v1, "enableAndroidApplinks"

    .line 481
    .line 482
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    iput-boolean v0, p0, Lo0/a;->t0:Z

    .line 487
    .line 488
    :cond_f
    const-string v0, "redirects"

    .line 489
    .line 490
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iput-object v0, p0, Lo0/a;->o0:Lorg/json/JSONArray;

    .line 495
    .line 496
    const-string v0, "ignorePageFinishedRegexes"

    .line 497
    .line 498
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    if-eqz v0, :cond_11

    .line 503
    .line 504
    new-instance v1, Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 507
    .line 508
    .line 509
    iput-object v1, p0, Lo0/a;->r0:Ljava/util/List;

    .line 510
    .line 511
    move v1, v5

    .line 512
    :goto_6
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    if-ge v1, v2, :cond_11

    .line 517
    .line 518
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    if-eqz v2, :cond_10

    .line 523
    .line 524
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-nez v3, :cond_10

    .line 529
    .line 530
    :try_start_2
    iget-object v3, p0, Lo0/a;->r0:Ljava/util/List;

    .line 531
    .line 532
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 537
    .line 538
    .line 539
    :catch_2
    :cond_10
    add-int/lit8 v1, v1, 0x1

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_11
    const-string v0, "maxWindows"

    .line 543
    .line 544
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    if-eqz v0, :cond_12

    .line 549
    .line 550
    const-string v1, "enabled"

    .line 551
    .line 552
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    iput-boolean v1, p0, Lo0/a;->g1:Z

    .line 557
    .line 558
    const-string v1, "numWindows"

    .line 559
    .line 560
    const/4 v2, 0x5

    .line 561
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 562
    .line 563
    .line 564
    move-result v1

    .line 565
    iput v1, p0, Lo0/a;->e1:I

    .line 566
    .line 567
    iput v1, p0, Lo0/a;->f1:I

    .line 568
    .line 569
    const-string v1, "autoClose"

    .line 570
    .line 571
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    iput-boolean v0, p0, Lo0/a;->m0:Z

    .line 576
    .line 577
    :cond_12
    const-string v0, "androidShowOfflinePage"

    .line 578
    .line 579
    invoke-virtual {p1, v0, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    iput-boolean v0, p0, Lo0/a;->p0:Z

    .line 584
    .line 585
    const-string v0, "androidConnectionOfflineTime"

    .line 586
    .line 587
    const/16 v1, 0xa

    .line 588
    .line 589
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    iput v0, p0, Lo0/a;->q0:I

    .line 594
    .line 595
    const-string v0, "toolbarNavigation"

    .line 596
    .line 597
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    iput-object v0, p0, Lo0/a;->Z0:Lorg/json/JSONObject;

    .line 602
    .line 603
    const-string v0, "actionConfig"

    .line 604
    .line 605
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    if-eqz p1, :cond_13

    .line 610
    .line 611
    iput-object p1, p0, Lo0/a;->a1:Lorg/json/JSONObject;

    .line 612
    .line 613
    const-string v0, "actionSelection"

    .line 614
    .line 615
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    iput-object v0, p0, Lo0/a;->b1:Lorg/json/JSONArray;

    .line 620
    .line 621
    invoke-direct {p0, p1}, Lo0/a;->k(Lorg/json/JSONObject;)V

    .line 622
    .line 623
    .line 624
    :cond_13
    return-void
.end method

.method private p(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    const-string v0, "usesGeolocation"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput-boolean v0, p0, Lo0/a;->T0:Z

    .line 9
    .line 10
    const-string v0, "androidDownloadToPublicStorage"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, Lo0/a;->U0:Z

    .line 18
    .line 19
    new-instance v0, Lq0/d;

    .line 20
    .line 21
    invoke-direct {v0}, Lq0/d;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lo0/a;->V0:Lq0/d;

    .line 25
    .line 26
    iget-boolean v3, p0, Lo0/a;->T0:Z

    .line 27
    .line 28
    iput-boolean v3, v0, Lq0/d;->f:Z

    .line 29
    .line 30
    const-string v3, "enableWebRTCamera"

    .line 31
    .line 32
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iput-boolean v3, v0, Lq0/d;->a:Z

    .line 37
    .line 38
    iget-object v0, p0, Lo0/a;->V0:Lq0/d;

    .line 39
    .line 40
    const-string v3, "enableWebRTCMicrophone"

    .line 41
    .line 42
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    iput-boolean v3, v0, Lq0/d;->b:Z

    .line 47
    .line 48
    iget-object v0, p0, Lo0/a;->V0:Lq0/d;

    .line 49
    .line 50
    iget-boolean v3, p0, Lo0/a;->U0:Z

    .line 51
    .line 52
    iput-boolean v3, v0, Lq0/d;->d:Z

    .line 53
    .line 54
    iget-object v0, p0, Lo0/a;->W0:Lq0/a;

    .line 55
    .line 56
    const-string v3, "saveToGallery"

    .line 57
    .line 58
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Lq0/a;->c(Z)V

    .line 63
    .line 64
    .line 65
    const-string v0, "directCameraUploads"

    .line 66
    .line 67
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput-boolean p1, p0, Lo0/a;->X0:Z

    .line 72
    .line 73
    iget-object v0, p0, Lo0/a;->W0:Lq0/a;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lq0/a;->b(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private q(Ljava/lang/String;)Lo0/a$b;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sparse-switch v1, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :sswitch_0
    const-string v1, "landscape"

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x2

    .line 31
    goto :goto_0

    .line 32
    :sswitch_1
    const-string v1, "portrait"

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x1

    .line 42
    goto :goto_0

    .line 43
    :sswitch_2
    const-string v1, "sensor"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v0, 0x0

    .line 53
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    sget-object p1, Lo0/a$b;->d:Lo0/a$b;

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_0
    sget-object p1, Lo0/a$b;->f:Lo0/a$b;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_1
    sget-object p1, Lo0/a$b;->e:Lo0/a$b;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_2
    sget-object p1, Lo0/a$b;->g:Lo0/a$b;

    .line 66
    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :sswitch_data_0
    .sparse-switch
        -0x35ffac46 -> :sswitch_2
        0x2b77bb9b -> :sswitch_1
        0x5545f2bb -> :sswitch_0
    .end sparse-switch

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private r(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    const-string v0, "showActionBar"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput-boolean v0, p0, Lo0/a;->x0:Z

    .line 9
    .line 10
    const-string v0, "showNavigationBar"

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lo0/a;->y0:Z

    .line 17
    .line 18
    const-string v0, "disableAnimations"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput-boolean v0, p0, Lo0/a;->z0:Z

    .line 25
    .line 26
    const-string v0, "hideWebviewAlpha"

    .line 27
    .line 28
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 29
    .line 30
    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    double-to-float v0, v2

    .line 35
    iput v0, p0, Lo0/a;->A0:F

    .line 36
    .line 37
    const-string v0, "transitionInteractiveDelayMax"

    .line 38
    .line 39
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iput-wide v2, p0, Lo0/a;->B0:D

    .line 49
    .line 50
    const-string v0, "navigationTitleImage"

    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput-boolean v0, p0, Lo0/a;->C0:Z

    .line 57
    .line 58
    const-string v0, "androidHideTitleInActionBar"

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput-boolean v0, p0, Lo0/a;->D0:Z

    .line 65
    .line 66
    const-string v0, "androidTheme"

    .line 67
    .line 68
    const-string v2, "auto"

    .line 69
    .line 70
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lo0/a;->E0:Ljava/lang/String;

    .line 75
    .line 76
    const-string v0, "androidStatusBarStyle"

    .line 77
    .line 78
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lo0/a;->F0:Ljava/lang/String;

    .line 83
    .line 84
    const-string v0, "androidSystemNavBarStyle"

    .line 85
    .line 86
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lo0/a;->G0:Ljava/lang/String;

    .line 91
    .line 92
    const-string v0, "androidEnableOverlayInStatusBar"

    .line 93
    .line 94
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput-boolean v0, p0, Lo0/a;->H0:Z

    .line 99
    .line 100
    const-string v0, "androidEnableOverlayInSystemNavBar"

    .line 101
    .line 102
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iput-boolean v0, p0, Lo0/a;->I0:Z

    .line 107
    .line 108
    const-string v0, "androidShowLogoInSideBar"

    .line 109
    .line 110
    const/4 v2, 0x1

    .line 111
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput-boolean v0, p0, Lo0/a;->J0:Z

    .line 116
    .line 117
    const-string v0, "androidShowAppNameInSideBar"

    .line 118
    .line 119
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    iput-boolean v0, p0, Lo0/a;->K0:Z

    .line 124
    .line 125
    const-string v0, "androidInitialZoom"

    .line 126
    .line 127
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iput v0, p0, Lo0/a;->L0:I

    .line 132
    .line 133
    const-string v0, "androidWebviewTextZoom"

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_0

    .line 140
    .line 141
    const/16 v3, 0x64

    .line 142
    .line 143
    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, Lo0/a;->M0:Ljava/lang/Integer;

    .line 152
    .line 153
    :cond_0
    const-string v0, "forceViewportWidth"

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_1

    .line 160
    .line 161
    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    .line 162
    .line 163
    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    iput-wide v3, p0, Lo0/a;->N0:D

    .line 168
    .line 169
    :cond_1
    const-string v0, "pinchToZoom"

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_2

    .line 176
    .line 177
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-object v0, p0, Lo0/a;->O0:Ljava/lang/Boolean;

    .line 186
    .line 187
    :cond_2
    const-string v0, "stringViewport"

    .line 188
    .line 189
    invoke-static {p1, v0}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, Lo0/a;->J:Ljava/lang/String;

    .line 194
    .line 195
    const-string v0, "zoomableForceViewport"

    .line 196
    .line 197
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    iput-boolean v0, p0, Lo0/a;->K:Z

    .line 202
    .line 203
    const-string v0, "splashScreen"

    .line 204
    .line 205
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    iput-object p1, p0, Lo0/a;->R0:Lorg/json/JSONObject;

    .line 210
    .line 211
    if-eqz p1, :cond_3

    .line 212
    .line 213
    const-string v0, "android"

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-eqz p1, :cond_3

    .line 220
    .line 221
    new-instance v0, Lo0/a$c;

    .line 222
    .line 223
    invoke-direct {v0}, Lo0/a$c;-><init>()V

    .line 224
    .line 225
    .line 226
    iput-object v0, p0, Lo0/a;->Q0:Lo0/a$c;

    .line 227
    .line 228
    const-string v3, "showSplash"

    .line 229
    .line 230
    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    iput-boolean v2, v0, Lo0/a$c;->a:Z

    .line 235
    .line 236
    iget-object v0, p0, Lo0/a;->Q0:Lo0/a$c;

    .line 237
    .line 238
    const-string v2, "animated"

    .line 239
    .line 240
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    iput-boolean p1, v0, Lo0/a$c;->b:Z

    .line 245
    .line 246
    :cond_3
    return-void
.end method

.method private s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lo0/i;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lo0/i;->a(Ljava/io/Closeable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {v0}, Lo0/i;->a(Ljava/io/Closeable;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method


# virtual methods
.method public a(Lo0/d$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->b:Lo0/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo0/d;->a(Lo0/d$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, ""

    .line 7
    .line 8
    return-object v0
.end method

.method public g(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 7

    .line 1
    iget-object v0, p0, Lo0/a;->g0:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    :catch_0
    :cond_1
    if-ge v3, v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    check-cast v4, Ljava/util/HashMap;

    .line 23
    .line 24
    const-string v5, "regex"

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    instance-of v6, v5, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    :try_start_0
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 45
    .line 46
    .line 47
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    :goto_0
    return-object v1
.end method

.method public h()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->q1:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo0/a;->i1:Z

    .line 2
    .line 3
    return v0
.end method

.method public t(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo0/a;->C0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public u(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lo0/a;->W:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lo0/a;->k1:Z

    .line 10
    .line 11
    return p1

    .line 12
    :cond_1
    iget-object v0, p0, Lo0/a;->j1:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, Lo0/a;->j1:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/util/regex/Pattern;

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_4
    return v1

    .line 54
    :cond_5
    :goto_0
    iget-boolean p1, p0, Lo0/a;->k1:Z

    .line 55
    .line 56
    return p1
.end method

.method public v(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lo0/a;->w:Lorg/json/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v2, p0, Lo0/a;->w:Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v0, v2, :cond_2

    .line 17
    .line 18
    iget-object v2, p0, Lo0/a;->w:Lorg/json/JSONArray;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const-string v3, "regex"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "userAgent"

    .line 33
    .line 34
    invoke-static {v2, v4}, Lo0/j;->g(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    :try_start_0
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 51
    .line 52
    .line 53
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    return-object v2

    .line 57
    :catch_0
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    :goto_1
    return-object v1
.end method
