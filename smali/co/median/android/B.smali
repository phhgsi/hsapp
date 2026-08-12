.class public Lco/median/android/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/B$k;
    }
.end annotation


# static fields
.field private static final r:Ljava/lang/String; = "co.median.android.B"


# instance fields
.field private a:Lco/median/android/MainActivity;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lm0/O;

.field private g:Landroid/os/Handler;

.field private h:Lco/median/android/E;

.field private i:Z

.field private j:Z

.field private k:D

.field private l:Ljava/lang/String;

.field private m:Z

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private p:Z

.field private q:Landroid/webkit/ValueCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lco/median/android/MainActivity;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 10
    .line 11
    sget-object v0, Lco/median/android/E;->d:Lco/median/android/E;

    .line 12
    .line 13
    iput-object v0, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lco/median/android/B;->i:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lco/median/android/B;->j:Z

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    iput-object v1, p0, Lco/median/android/B;->l:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean v0, p0, Lco/median/android/B;->m:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lco/median/android/B;->p:Z

    .line 27
    .line 28
    iput-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    new-instance p1, Lm0/O;

    .line 31
    .line 32
    invoke-direct {p1}, Lm0/O;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lco/median/android/B;->f:Lm0/O;

    .line 36
    .line 37
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 46
    .line 47
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, p0}, Lco/median/android/A;->k(Lco/median/android/B;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v1, p1, Lo0/a;->O:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v2, "median_profile_picker.parseJson(eval("

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v2, p1, Lo0/a;->O:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v2}, Lo0/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, "))"

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Lco/median/android/B;->b:Ljava/lang/String;

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v3, "gonative_profile_picker.parseJson(eval("

    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v3, p1, Lo0/a;->O:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v3}, Lo0/j;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, p0, Lco/median/android/B;->c:Ljava/lang/String;

    .line 121
    .line 122
    :cond_1
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 129
    .line 130
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    const/4 v0, 0x1

    .line 137
    iput-boolean v0, p0, Lco/median/android/B;->j:Z

    .line 138
    .line 139
    :cond_2
    iget p1, p1, Lo0/a;->R:I

    .line 140
    .line 141
    int-to-double v0, p1

    .line 142
    iput-wide v0, p0, Lco/median/android/B;->k:D

    .line 143
    .line 144
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 151
    .line 152
    invoke-virtual {p1}, Lco/median/android/GoNativeApplication;->d()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lco/median/android/B;->n:Ljava/lang/String;

    .line 157
    .line 158
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 165
    .line 166
    invoke-virtual {p1}, Lco/median/android/GoNativeApplication;->e()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iput-object p1, p0, Lco/median/android/B;->o:Ljava/lang/String;

    .line 171
    .line 172
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 179
    .line 180
    invoke-virtual {p1}, Lco/median/android/GoNativeApplication;->k()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    iput-boolean p1, p0, Lco/median/android/B;->p:Z

    .line 185
    .line 186
    return-void
.end method

.method private synthetic A(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lco/median/android/B;->m:Z

    .line 9
    .line 10
    sget-object p1, Lco/median/android/B;->r:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "Custom CSS Injection Success"

    .line 13
    .line 14
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object p1, Lco/median/android/B;->r:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "Custom CSS Injection Failed"

    .line 21
    .line 22
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private synthetic B(Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;[Ljava/lang/String;[I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p3

    .line 4
    if-ge v1, v2, :cond_5

    .line 5
    .line 6
    aget-object v2, p3, v1

    .line 7
    .line 8
    aget v3, p4, v1

    .line 9
    .line 10
    const-string v4, "android.permission.CAMERA"

    .line 11
    .line 12
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, -0x1

    .line 17
    const/4 v6, 0x1

    .line 18
    if-eqz v4, :cond_2

    .line 19
    .line 20
    if-ne v3, v5, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 29
    .line 30
    const p2, 0x7f1200fb

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lco/median/android/B;->m()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p2, v0}, Lm0/F;->p(Z)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-nez v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2, v6}, Lm0/F;->p(Z)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    const-string v4, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 54
    .line 55
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    if-ne v3, v5, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2, v0}, Lm0/F;->o(Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    if-nez v3, :cond_4

    .line 68
    .line 69
    invoke-virtual {p2, v6}, Lm0/F;->o(Z)V

    .line 70
    .line 71
    .line 72
    :cond_4
    :goto_2
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 73
    .line 74
    invoke-virtual {v2, p0}, Lco/median/android/MainActivity;->f3(Lco/median/android/B;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 78
    .line 79
    invoke-virtual {v2}, Lco/median/android/MainActivity;->I1()Lb/b;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, p2}, Lb/b;->a(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return-void
.end method

.method private synthetic C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/MainActivity;->u3()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic D(Lo0/a;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lco/median/android/MainActivity;->g3(F)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    invoke-virtual {v0}, Lco/median/android/MainActivity;->E1()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    cmpg-float v0, v0, v1

    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Lco/median/android/MainActivity;->j3(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 27
    .line 28
    iget p1, p1, Lo0/a;->S:F

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lco/median/android/MainActivity;->e3(F)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private synthetic E(Landroid/webkit/ClientCertRequest;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/webkit/ClientCertRequest;->ignore()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Lco/median/android/B$k;

    .line 8
    .line 9
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-direct {v0, v1, p1}, Lco/median/android/B$k;-><init>(Landroid/app/Activity;Landroid/webkit/ClientCertRequest;)V

    .line 12
    .line 13
    .line 14
    filled-new-array {p2}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private synthetic F(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lco/median/android/MainActivity;->p3(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private synthetic G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/MainActivity;->w3()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private Q(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/U;->b(Landroid/content/Context;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lco/median/android/B;->p:Z

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "isFirstLaunch"

    .line 14
    .line 15
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v1}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(Lco/median/android/B;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/B;->A(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lco/median/android/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/B;->G()V

    return-void
.end method

.method public static synthetic c(Lco/median/android/B;Lo0/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/B;->D(Lo0/a;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lco/median/android/B;Landroid/webkit/ClientCertRequest;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/B;->E(Landroid/webkit/ClientCertRequest;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lo0/h;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lo0/h;->stopLoading()V

    .line 2
    .line 3
    .line 4
    const-string v0, "file:///android_asset/offline.html"

    .line 5
    .line 6
    invoke-interface {p0, v0}, Lo0/h;->b(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic f(Lco/median/android/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/B;->C()V

    return-void
.end method

.method public static synthetic g(Lco/median/android/B;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/B;->F(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lco/median/android/B;Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lco/median/android/B;->B(Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;[Ljava/lang/String;[I)V

    return-void
.end method

.method static bridge synthetic i(Lco/median/android/B;)Lco/median/android/MainActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    return-object p0
.end method

.method static bridge synthetic j(Lco/median/android/B;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    return-object p0
.end method

.method static bridge synthetic k(Lco/median/android/B;Landroid/webkit/ValueCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    return-void
.end method

.method static bridge synthetic l()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    return-object v0
.end method

.method private o()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "(function() {var parent = document.getElementsByTagName(\'head\').item(0);var style = document.createElement(\'style\');style.type = \'text/css\';style.id = \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "median-custom-css"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "\';style.innerHTML = window.atob(\'"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lco/median/android/B;->n:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "\');parent.appendChild(style);return document.getElementById(\'"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "\') !== null;})()"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method private p(Landroid/os/Message;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lco/median/android/GoNativeApplication;->p(Landroid/os/Message;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroid/content/Intent;

    .line 11
    .line 12
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, Lco/median/android/MainActivity;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "isRoot"

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    const-string v0, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    const-string p2, "ignoreInterceptMaxWindows"

    .line 38
    .line 39
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 43
    .line 44
    const/16 v0, 0x190

    .line 45
    .line 46
    invoke-virtual {p2, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private u()V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/B;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lco/median/android/B;->m:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    invoke-direct {p0}, Lco/median/android/B;->o()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lm0/l1;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lm0/l1;-><init>(Lco/median/android/B;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lco/median/android/MainActivity;->a3(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lco/median/android/B;->r:Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, "Error injecting customCSS via javascript"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method private v(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lo0/j;->a(Ljava/lang/String;Landroid/app/Activity;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    :try_start_0
    iget-object p1, p0, Lco/median/android/B;->e:Ljava/lang/String;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 20
    .line 21
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "GoNativeJSBridgeLibrary.js"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1}, Lm0/P;->b(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lco/median/android/B;->e:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 49
    .line 50
    iget-object v0, p0, Lco/median/android/B;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 56
    .line 57
    invoke-virtual {p1}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 62
    .line 63
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lo0/b;->i(Lo0/g;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 69
    .line 70
    const-string v0, "median_library_ready"

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-static {v0, v1}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 81
    .line 82
    const-string v0, "gonative_library_ready"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p1, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lco/median/android/B;->r:Ljava/lang/String;

    .line 92
    .line 93
    const-string v0, "GoNative JSBridgeLibrary Injection Success"

    .line 94
    .line 95
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :goto_1
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    .line 100
    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v2, "GoNative JSBridgeLibrary Injection Error:- "

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    :goto_2
    return-void
.end method

.method private w()V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/B;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "javascript:(function() {var parent = document.getElementsByTagName(\'head\').item(0);var script = document.createElement(\'script\');script.type = \'text/javascript\';script.innerHTML = window.atob(\'"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lco/median/android/B;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "\');parent.appendChild(script)})()"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "Custom JS Injection Success"

    .line 42
    .line 43
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 48
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lco/median/android/B;->r:Ljava/lang/String;

    .line 53
    .line 54
    const-string v3, "Error injecting customJS via javascript"

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void
.end method

.method private y(Landroid/net/Uri;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    const-string v2, "http"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "https"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, v0, Lo0/a;->k0:Lo0/k;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2}, Lo0/k;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lo0/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "internal"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1

    .line 54
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v0, v0, Lo0/a;->Q:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v3, p1}, Lm0/r;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 v3, 0x1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    return v3

    .line 74
    :cond_2
    if-eqz v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v4, "."

    .line 88
    .line 89
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    :cond_3
    return v3

    .line 106
    :cond_4
    :goto_0
    return v1
.end method

.method private z(Ljava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    const-string v1, "data:image/"

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    :try_start_0
    const-string v1, ","

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    add-int/2addr v1, v2

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v3, v1

    .line 35
    const/16 v4, 0xa

    .line 36
    .line 37
    if-ge v3, v4, :cond_1

    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    const-string v3, "data:image/gif"

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/16 v4, 0x8

    .line 47
    .line 48
    const/16 v5, 0xff

    .line 49
    .line 50
    if-eqz v3, :cond_4

    .line 51
    .line 52
    new-instance p1, Ljava/lang/String;

    .line 53
    .line 54
    const-string v3, "US-ASCII"

    .line 55
    .line 56
    const/4 v6, 0x6

    .line 57
    invoke-direct {p1, v1, v0, v6, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v3, "GIF87a"

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    const-string v3, "GIF89a"

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    return v0

    .line 77
    :cond_2
    aget-byte p1, v1, v6

    .line 78
    .line 79
    and-int/2addr p1, v5

    .line 80
    const/4 v3, 0x7

    .line 81
    aget-byte v3, v1, v3

    .line 82
    .line 83
    and-int/2addr v3, v5

    .line 84
    shl-int/2addr v3, v4

    .line 85
    or-int/2addr p1, v3

    .line 86
    aget-byte v3, v1, v4

    .line 87
    .line 88
    and-int/2addr v3, v5

    .line 89
    const/16 v6, 0x9

    .line 90
    .line 91
    aget-byte v1, v1, v6

    .line 92
    .line 93
    and-int/2addr v1, v5

    .line 94
    shl-int/2addr v1, v4

    .line 95
    or-int/2addr v1, v3

    .line 96
    if-ne p1, v2, :cond_3

    .line 97
    .line 98
    if-ne v1, v2, :cond_3

    .line 99
    .line 100
    return v2

    .line 101
    :cond_3
    return v0

    .line 102
    :cond_4
    const-string v3, "data:image/png"

    .line 103
    .line 104
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_7

    .line 109
    .line 110
    array-length p1, v1

    .line 111
    const/16 v3, 0x18

    .line 112
    .line 113
    if-ge p1, v3, :cond_5

    .line 114
    .line 115
    return v0

    .line 116
    :cond_5
    const/16 p1, 0x10

    .line 117
    .line 118
    aget-byte v6, v1, p1

    .line 119
    .line 120
    and-int/2addr v6, v5

    .line 121
    shl-int/2addr v6, v3

    .line 122
    const/16 v7, 0x11

    .line 123
    .line 124
    aget-byte v7, v1, v7

    .line 125
    .line 126
    and-int/2addr v7, v5

    .line 127
    shl-int/2addr v7, p1

    .line 128
    or-int/2addr v6, v7

    .line 129
    const/16 v7, 0x12

    .line 130
    .line 131
    aget-byte v7, v1, v7

    .line 132
    .line 133
    and-int/2addr v7, v5

    .line 134
    shl-int/2addr v7, v4

    .line 135
    or-int/2addr v6, v7

    .line 136
    const/16 v7, 0x13

    .line 137
    .line 138
    aget-byte v7, v1, v7

    .line 139
    .line 140
    and-int/2addr v7, v5

    .line 141
    or-int/2addr v6, v7

    .line 142
    const/16 v7, 0x14

    .line 143
    .line 144
    aget-byte v7, v1, v7

    .line 145
    .line 146
    and-int/2addr v7, v5

    .line 147
    shl-int/lit8 v3, v7, 0x18

    .line 148
    .line 149
    const/16 v7, 0x15

    .line 150
    .line 151
    aget-byte v7, v1, v7

    .line 152
    .line 153
    and-int/2addr v7, v5

    .line 154
    shl-int/lit8 p1, v7, 0x10

    .line 155
    .line 156
    or-int/2addr p1, v3

    .line 157
    const/16 v3, 0x16

    .line 158
    .line 159
    aget-byte v3, v1, v3

    .line 160
    .line 161
    and-int/2addr v3, v5

    .line 162
    shl-int/2addr v3, v4

    .line 163
    or-int/2addr p1, v3

    .line 164
    const/16 v3, 0x17

    .line 165
    .line 166
    aget-byte v1, v1, v3

    .line 167
    .line 168
    and-int/2addr v1, v5

    .line 169
    or-int/2addr p1, v1

    .line 170
    if-ne v6, v2, :cond_6

    .line 171
    .line 172
    if-ne p1, v2, :cond_6

    .line 173
    .line 174
    return v2

    .line 175
    :cond_6
    return v0

    .line 176
    :cond_7
    const-string v3, "data:image/jpeg"

    .line 177
    .line 178
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_b

    .line 183
    .line 184
    const/4 p1, 0x2

    .line 185
    move v3, p1

    .line 186
    :goto_0
    array-length v6, v1

    .line 187
    if-ge v3, v6, :cond_b

    .line 188
    .line 189
    aget-byte v6, v1, v3

    .line 190
    .line 191
    and-int/2addr v6, v5

    .line 192
    if-eq v6, v5, :cond_8

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_8
    add-int/lit8 v6, v3, 0x1

    .line 196
    .line 197
    aget-byte v6, v1, v6

    .line 198
    .line 199
    and-int/2addr v6, v5

    .line 200
    const/16 v7, 0xc0

    .line 201
    .line 202
    if-eq v6, v7, :cond_a

    .line 203
    .line 204
    const/16 v7, 0xc2

    .line 205
    .line 206
    if-ne v6, v7, :cond_9

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_9
    add-int/lit8 v6, v3, 0x2

    .line 210
    .line 211
    aget-byte v6, v1, v6

    .line 212
    .line 213
    and-int/2addr v6, v5

    .line 214
    shl-int/2addr v6, v4

    .line 215
    add-int/lit8 v7, v3, 0x3

    .line 216
    .line 217
    aget-byte v7, v1, v7

    .line 218
    .line 219
    and-int/2addr v7, v5

    .line 220
    or-int/2addr v6, v7

    .line 221
    add-int/2addr v6, p1

    .line 222
    add-int/2addr v3, v6

    .line 223
    goto :goto_0

    .line 224
    :cond_a
    :goto_1
    add-int/lit8 p1, v3, 0x5

    .line 225
    .line 226
    aget-byte p1, v1, p1

    .line 227
    .line 228
    and-int/2addr p1, v5

    .line 229
    shl-int/2addr p1, v4

    .line 230
    add-int/lit8 v6, v3, 0x6

    .line 231
    .line 232
    aget-byte v6, v1, v6

    .line 233
    .line 234
    and-int/2addr v6, v5

    .line 235
    or-int/2addr p1, v6

    .line 236
    add-int/lit8 v6, v3, 0x7

    .line 237
    .line 238
    aget-byte v6, v1, v6

    .line 239
    .line 240
    and-int/2addr v6, v5

    .line 241
    shl-int/2addr v6, v4

    .line 242
    add-int/2addr v3, v4

    .line 243
    aget-byte v1, v1, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    .line 245
    and-int/2addr v1, v5

    .line 246
    or-int/2addr v1, v6

    .line 247
    if-ne v1, v2, :cond_b

    .line 248
    .line 249
    if-ne p1, v2, :cond_b

    .line 250
    .line 251
    return v2

    .line 252
    :catch_0
    :cond_b
    :goto_2
    return v0
.end method


# virtual methods
.method public H(Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)V
    .locals 7

    .line 1
    iput-object p1, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    .line 2
    .line 3
    new-instance p1, Lm0/F;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Lm0/F;-><init>(Landroid/webkit/WebChromeClient$FileChooserParams;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lm0/F;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Lco/median/android/MainActivity;->f3(Lco/median/android/B;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 27
    .line 28
    invoke-virtual {p2}, Lco/median/android/MainActivity;->I1()Lb/b;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2, p1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 42
    .line 43
    const-string v2, "android.permission.CAMERA"

    .line 44
    .line 45
    invoke-static {v1, v2}, Lo0/l;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v3, 0x1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {p1, v3}, Lm0/F;->p(Z)V

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-static {}, Lm0/A;->r()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 64
    .line 65
    const-string v4, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 66
    .line 67
    invoke-static {v2, v4}, Lo0/l;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iget-object v5, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 72
    .line 73
    invoke-static {v5}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v5, v5, Lo0/a;->W0:Lq0/a;

    .line 78
    .line 79
    invoke-virtual {v5}, Lq0/a;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    const/4 v6, 0x0

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Lm0/F;->o(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    if-eqz v2, :cond_4

    .line 91
    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-virtual {p1, v6}, Lm0/F;->o(Z)V

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 108
    .line 109
    new-array v2, v6, [Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, [Ljava/lang/String;

    .line 116
    .line 117
    new-instance v2, Lm0/n1;

    .line 118
    .line 119
    invoke-direct {v2, p0, p2, p1}, Lm0/n1;-><init>(Lco/median/android/B;Landroid/webkit/WebChromeClient$FileChooserParams;Lm0/F;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0, v2}, Lco/median/android/MainActivity;->R1([Ljava/lang/String;Lco/median/android/MainActivity$j;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 127
    .line 128
    invoke-virtual {p2, p0}, Lco/median/android/MainActivity;->f3(Lco/median/android/B;)V

    .line 129
    .line 130
    .line 131
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 132
    .line 133
    invoke-virtual {p2}, Lco/median/android/MainActivity;->I1()Lb/b;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p2, p1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method protected I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lco/median/android/E;->g:Lco/median/android/E;

    .line 8
    .line 9
    iput-object v0, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 10
    .line 11
    return-void
.end method

.method public J(Lo0/h;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/os/Message;->sendToTarget()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/B;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Lco/median/android/B;->u()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public L(Lo0/h;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    iput-object p1, p0, Lco/median/android/B;->l:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 23
    .line 24
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lco/median/android/A;->g()V

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "onpagefinished "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    sget-object v0, Lco/median/android/E;->g:Lco/median/android/E;

    .line 54
    .line 55
    iput-object v0, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Lco/median/android/B;->R(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 61
    .line 62
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz p2, :cond_3

    .line 67
    .line 68
    iget-object v1, v0, Lo0/a;->r0:Ljava/util/List;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/util/regex/Pattern;

    .line 87
    .line 88
    invoke-virtual {v2, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-direct {p0}, Lco/median/android/B;->u()V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lco/median/android/B;->w()V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 106
    .line 107
    invoke-virtual {v1}, Lco/median/android/MainActivity;->o3()V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 111
    .line 112
    new-instance v2, Lm0/i1;

    .line 113
    .line 114
    invoke-direct {v2, p0}, Lm0/i1;-><init>(Lco/median/android/B;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1, p2}, Lm0/f1;->d(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {p0, v1}, Lco/median/android/B;->y(Landroid/net/Uri;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    new-instance v2, Lco/median/android/B$g;

    .line 140
    .line 141
    invoke-direct {v2, p0}, Lco/median/android/B$g;-><init>(Lco/median/android/B;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-boolean v1, v0, Lo0/a;->n:Z

    .line 148
    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    iget-object v1, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 152
    .line 153
    invoke-direct {p0, v1}, Lco/median/android/B;->v(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    iget-object v1, v0, Lo0/a;->A:Ljava/lang/String;

    .line 157
    .line 158
    const/4 v2, 0x1

    .line 159
    if-eqz v1, :cond_9

    .line 160
    .line 161
    iget-boolean v1, p0, Lco/median/android/B;->i:Z

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 166
    .line 167
    invoke-virtual {v1}, Lco/median/android/MainActivity;->D3()V

    .line 168
    .line 169
    .line 170
    :cond_6
    iget-object v1, v0, Lo0/a;->C:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {p2, v1}, Lo0/j;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_8

    .line 177
    .line 178
    iget-object v1, v0, Lo0/a;->B:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {p2, v1}, Lo0/j;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_7

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_7
    const/4 v1, 0x0

    .line 188
    goto :goto_1

    .line 189
    :cond_8
    :goto_0
    move v1, v2

    .line 190
    :goto_1
    iput-boolean v1, p0, Lco/median/android/B;->i:Z

    .line 191
    .line 192
    :cond_9
    iget-object v1, v0, Lo0/a;->P:Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v1, :cond_a

    .line 195
    .line 196
    invoke-interface {p1, v1}, Lo0/h;->a(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :cond_a
    iget-object v1, p0, Lco/median/android/B;->b:Ljava/lang/String;

    .line 200
    .line 201
    if-eqz v1, :cond_b

    .line 202
    .line 203
    invoke-interface {p1, v1}, Lo0/h;->a(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_b
    iget-object v1, p0, Lco/median/android/B;->c:Ljava/lang/String;

    .line 207
    .line 208
    if-eqz v1, :cond_c

    .line 209
    .line 210
    invoke-interface {p1, v1}, Lo0/h;->a(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_c
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 214
    .line 215
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->p1(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 219
    .line 220
    iget-object p2, p1, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 221
    .line 222
    if-eqz p2, :cond_d

    .line 223
    .line 224
    const/4 v1, 0x0

    .line 225
    iput-object v1, p1, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_d
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 231
    .line 232
    invoke-virtual {p1}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Lco/median/android/GoNativeApplication;->h()Lm0/o1;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 241
    .line 242
    invoke-virtual {p1, p2}, Lm0/o1;->n(Landroid/app/Activity;)V

    .line 243
    .line 244
    .line 245
    iget-object p1, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 246
    .line 247
    if-eqz p1, :cond_e

    .line 248
    .line 249
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 250
    .line 251
    invoke-static {p1, p2}, Lo0/j;->a(Ljava/lang/String;Landroid/app/Activity;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    :cond_e
    if-eqz v2, :cond_f

    .line 256
    .line 257
    const-string p1, "median_device_info"

    .line 258
    .line 259
    invoke-direct {p0, p1}, Lco/median/android/B;->Q(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string p1, "gonative_device_info"

    .line 263
    .line 264
    invoke-direct {p0, p1}, Lco/median/android/B;->Q(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_f
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 268
    .line 269
    invoke-virtual {p1}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 274
    .line 275
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 276
    .line 277
    invoke-virtual {p1, p2, v2}, Lo0/b;->w(Lo0/g;Z)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 281
    .line 282
    invoke-virtual {p1}, Lco/median/android/MainActivity;->X1()Lo0/h;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    new-instance p2, Lm0/j1;

    .line 287
    .line 288
    invoke-direct {p2, p0, v0}, Lm0/j1;-><init>(Lco/median/android/B;Lo0/a;)V

    .line 289
    .line 290
    .line 291
    const-string v0, "window.devicePixelRatio"

    .line 292
    .line 293
    invoke-interface {p1, v0, p2}, Lo0/h;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 294
    .line 295
    .line 296
    return-void
.end method

.method public M(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->j3(F)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v0}, Lco/median/android/MainActivity;->O1()Lco/median/android/s;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lco/median/android/s;->j(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    :cond_0
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 30
    .line 31
    invoke-virtual {v0}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lco/median/android/A;->h()V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v0, Lco/median/android/E;->f:Lco/median/android/E;

    .line 39
    .line 40
    iput-object v0, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 41
    .line 42
    iget-object v0, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lco/median/android/B;->f:Lm0/O;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lm0/O;->c(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lm0/f1;->d(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 65
    .line 66
    invoke-static {v1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, Lo0/a;->A:Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-direct {p0, v0}, Lco/median/android/B;->y(Landroid/net/Uri;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 81
    .line 82
    invoke-virtual {v0}, Lco/median/android/MainActivity;->D3()V

    .line 83
    .line 84
    .line 85
    :cond_2
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 86
    .line 87
    invoke-virtual {v0}, Lco/median/android/MainActivity;->x3()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->q1(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 96
    .line 97
    invoke-virtual {v0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->h()Lm0/o1;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lm0/o1;->o()V

    .line 106
    .line 107
    .line 108
    const-string v0, "file:///android_asset/offline.html"

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 117
    .line 118
    invoke-virtual {p1}, Lco/median/android/MainActivity;->y1()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 123
    .line 124
    invoke-virtual {p1}, Lco/median/android/MainActivity;->X2()V

    .line 125
    .line 126
    .line 127
    :goto_0
    const/4 p1, 0x0

    .line 128
    iput-boolean p1, p0, Lco/median/android/B;->m:Z

    .line 129
    .line 130
    return-void
.end method

.method public N(Ljava/lang/String;Landroid/webkit/ClientCertRequest;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    new-instance v1, Lm0/k1;

    .line 5
    .line 6
    invoke-direct {v1, p0, p2}, Lm0/k1;-><init>(Lco/median/android/B;Landroid/webkit/ClientCertRequest;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getKeyTypes()[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPrincipals()[Ljava/security/Principal;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getHost()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPort()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static/range {v0 .. v6}, Landroid/security/KeyChain;->choosePrivateKeyAlias(Landroid/app/Activity;Landroid/security/KeyChainAliasCallback;[Ljava/lang/String;[Ljava/security/Principal;Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public O(Lo0/h;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-string v0, "net::ERR_CACHE_MISS"

    .line 4
    .line 5
    invoke-virtual {p3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 12
    .line 13
    new-instance p3, Lco/median/android/B$h;

    .line 14
    .line 15
    invoke-direct {p3, p0, p1}, Lco/median/android/B$h;-><init>(Lco/median/android/B;Lo0/h;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 23
    .line 24
    invoke-static {p3}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iget-boolean p3, p3, Lo0/a;->p0:Z

    .line 29
    .line 30
    if-eqz p3, :cond_3

    .line 31
    .line 32
    iget-object p3, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 33
    .line 34
    sget-object v0, Lco/median/android/E;->f:Lco/median/android/E;

    .line 35
    .line 36
    if-eq p3, v0, :cond_1

    .line 37
    .line 38
    sget-object v0, Lco/median/android/E;->e:Lco/median/android/E;

    .line 39
    .line 40
    if-ne p3, v0, :cond_3

    .line 41
    .line 42
    :cond_1
    iget-object p3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 43
    .line 44
    invoke-virtual {p3}, Lco/median/android/MainActivity;->i2()Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-nez p3, :cond_2

    .line 49
    .line 50
    const/4 p3, -0x2

    .line 51
    if-ne p2, p3, :cond_3

    .line 52
    .line 53
    if-eqz p4, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    invoke-interface {p1}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    :cond_2
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 72
    .line 73
    new-instance p3, Lm0/m1;

    .line 74
    .line 75
    invoke-direct {p3, p1}, Lm0/m1;-><init>(Lo0/h;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 83
    .line 84
    new-instance p2, Lco/median/android/B$i;

    .line 85
    .line 86
    invoke-direct {p2, p0}, Lco/median/android/B$i;-><init>(Lco/median/android/B;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public P(Landroid/net/http/SslError;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const v0, 0x7f1200f6

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const v0, 0x7f1200f5

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const v0, 0x7f1200f4

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 31
    .line 32
    invoke-static {v2}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-boolean v2, v2, Lo0/a;->M:Z

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " - Error url: "

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p1, " - Source page: "

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/Exception;

    .line 94
    .line 95
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v0, p1, v2, v1}, Lo0/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public R(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lo0/b;->B(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public S(Lo0/h;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, v0}, Lco/median/android/B;->T(Lo0/h;Ljava/lang/String;ZZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public T(Lo0/h;Ljava/lang/String;ZZ)Z
    .locals 4

    .line 1
    const/4 p3, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return p3

    .line 5
    :cond_0
    const-string v0, "data:"

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-direct {p0, p2}, Lco/median/android/B;->z(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lco/median/android/B;->r:Ljava/lang/String;

    .line 20
    .line 21
    new-instance p4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v0, "shouldOverrideUrlLoading: Detected 1x1 pixel tracking image. Allowing WebView to load. URL: "

    .line 27
    .line 28
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return p3

    .line 42
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lco/median/android/B;->U(Lo0/h;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-boolean p1, p0, Lco/median/android/B;->j:Z

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 55
    .line 56
    .line 57
    :cond_2
    if-eqz p4, :cond_3

    .line 58
    .line 59
    iput-object p2, p0, Lco/median/android/B;->l:Ljava/lang/String;

    .line 60
    .line 61
    sget-object p1, Lco/median/android/E;->g:Lco/median/android/E;

    .line 62
    .line 63
    iput-object p1, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 64
    .line 65
    iget-object p1, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 66
    .line 67
    const/4 p2, 0x0

    .line 68
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 72
    .line 73
    invoke-virtual {p1}, Lco/median/android/MainActivity;->u3()V

    .line 74
    .line 75
    .line 76
    :cond_3
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_4
    iput-boolean p3, p0, Lco/median/android/B;->j:Z

    .line 79
    .line 80
    iget-object p4, p0, Lco/median/android/B;->f:Lm0/O;

    .line 81
    .line 82
    invoke-virtual {p4, p2}, Lm0/O;->c(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 86
    .line 87
    invoke-virtual {p2}, Lco/median/android/MainActivity;->d2()V

    .line 88
    .line 89
    .line 90
    sget-object p2, Lco/median/android/E;->e:Lco/median/android/E;

    .line 91
    .line 92
    iput-object p2, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 93
    .line 94
    iget-wide v0, p0, Lco/median/android/B;->k:D

    .line 95
    .line 96
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-nez p2, :cond_5

    .line 101
    .line 102
    iget-wide v0, p0, Lco/median/android/B;->k:D

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_5

    .line 109
    .line 110
    iget-wide v0, p0, Lco/median/android/B;->k:D

    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    cmpl-double p2, v0, v2

    .line 115
    .line 116
    if-lez p2, :cond_5

    .line 117
    .line 118
    iget-object p2, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 119
    .line 120
    new-instance p4, Lco/median/android/B$f;

    .line 121
    .line 122
    invoke-direct {p4, p0, p1}, Lco/median/android/B$f;-><init>(Lco/median/android/B;Lo0/h;)V

    .line 123
    .line 124
    .line 125
    iget-wide v0, p0, Lco/median/android/B;->k:D

    .line 126
    .line 127
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    mul-double/2addr v0, v2

    .line 133
    double-to-long v0, v0

    .line 134
    invoke-virtual {p2, p4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 135
    .line 136
    .line 137
    :cond_5
    return p3
.end method

.method public U(Lo0/h;Ljava/lang/String;Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "file:///android_asset/"

    .line 6
    .line 7
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    const-string v1, "blob:"

    .line 15
    .line 16
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    return v0

    .line 23
    :cond_2
    const/4 v1, 0x1

    .line 24
    invoke-interface {p1, v1}, Lo0/h;->setCheckLoginSignup(Z)V

    .line 25
    .line 26
    .line 27
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_9

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "gonative-bridge"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_9

    .line 48
    .line 49
    if-eqz p3, :cond_3

    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    :try_start_0
    const-string p1, "json"

    .line 53
    .line 54
    invoke-virtual {v2, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Lorg/json/JSONArray;

    .line 59
    .line 60
    invoke-direct {p2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-ge v0, p1, :cond_8

    .line 68
    .line 69
    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    const-string p3, "command"

    .line 77
    .line 78
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-eqz p3, :cond_5

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    const-string p3, "pop"

    .line 90
    .line 91
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    if-eqz p3, :cond_6

    .line 96
    .line 97
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 98
    .line 99
    invoke-virtual {p1}, Lco/median/android/MainActivity;->m2()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    const-string p3, "clearPools"

    .line 112
    .line 113
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_7

    .line 118
    .line 119
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 120
    .line 121
    invoke-virtual {p1}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Lco/median/android/GoNativeApplication;->h()Lm0/o1;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lm0/o1;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    :cond_7
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :catch_0
    :cond_8
    return v1

    .line 136
    :cond_9
    iget-object v3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 137
    .line 138
    invoke-static {v3}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    const-string v5, "median"

    .line 147
    .line 148
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    const-string v6, "gonative"

    .line 153
    .line 154
    if-nez v4, :cond_a

    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_b

    .line 165
    .line 166
    :cond_a
    iget-object v4, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v4, :cond_b

    .line 169
    .line 170
    iget-object v7, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 171
    .line 172
    invoke-static {v4, v7}, Lo0/j;->a(Ljava/lang/String;Landroid/app/Activity;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_b

    .line 177
    .line 178
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    sget-object p2, Lco/median/android/B;->r:Ljava/lang/String;

    .line 183
    .line 184
    new-instance p3, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v0, "URL not authorized for native bridge: "

    .line 190
    .line 191
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    invoke-virtual {p1, p2, p3}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return v1

    .line 207
    :cond_b
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_28

    .line 216
    .line 217
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_c

    .line 226
    .line 227
    goto/16 :goto_7

    .line 228
    .line 229
    :cond_c
    invoke-virtual {v3}, Lo0/a;->h()Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    if-eqz v4, :cond_f

    .line 234
    .line 235
    invoke-virtual {v3}, Lo0/a;->h()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    check-cast v4, Ljava/lang/String;

    .line 244
    .line 245
    if-nez v4, :cond_d

    .line 246
    .line 247
    invoke-virtual {v3}, Lo0/a;->h()Ljava/util/Map;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    const-string v5, "*"

    .line 252
    .line 253
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    check-cast v4, Ljava/lang/String;

    .line 258
    .line 259
    :cond_d
    if-eqz v4, :cond_f

    .line 260
    .line 261
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-nez v5, :cond_f

    .line 266
    .line 267
    if-eqz p3, :cond_e

    .line 268
    .line 269
    return v1

    .line 270
    :cond_e
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 271
    .line 272
    new-instance p2, Lco/median/android/B$b;

    .line 273
    .line 274
    invoke-direct {p2, p0, v4}, Lco/median/android/B$b;-><init>(Lco/median/android/B;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 278
    .line 279
    .line 280
    return v1

    .line 281
    :cond_f
    invoke-direct {p0, v2}, Lco/median/android/B;->y(Landroid/net/Uri;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    const/4 v5, 0x0

    .line 286
    if-nez v4, :cond_18

    .line 287
    .line 288
    if-eqz p3, :cond_10

    .line 289
    .line 290
    return v1

    .line 291
    :cond_10
    iget-object p1, v3, Lo0/a;->k0:Lo0/k;

    .line 292
    .line 293
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    invoke-virtual {p1, p2}, Lo0/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    const-string p2, "appbrowser"

    .line 302
    .line 303
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_11

    .line 308
    .line 309
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 310
    .line 311
    invoke-virtual {p1, v2}, Lco/median/android/MainActivity;->S2(Landroid/net/Uri;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_11
    sget-object p1, Lco/median/android/B;->r:Ljava/lang/String;

    .line 317
    .line 318
    new-instance p2, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string p3, "processing dynamic link: "

    .line 324
    .line 325
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p2

    .line 335
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    :try_start_1
    const-string p1, "intent"

    .line 339
    .line 340
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-eqz p1, :cond_12

    .line 349
    .line 350
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {p1, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 359
    .line 360
    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_5

    .line 364
    .line 365
    :catch_1
    move-exception p1

    .line 366
    goto :goto_3

    .line 367
    :catch_2
    move-exception p1

    .line 368
    goto :goto_4

    .line 369
    :cond_12
    const-string p1, "http"

    .line 370
    .line 371
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-nez p1, :cond_14

    .line 380
    .line 381
    const-string p1, "https"

    .line 382
    .line 383
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p2

    .line 387
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-eqz p1, :cond_13

    .line 392
    .line 393
    goto :goto_2

    .line 394
    :cond_13
    new-instance p1, Landroid/content/Intent;

    .line 395
    .line 396
    const-string p2, "android.intent.action.VIEW"

    .line 397
    .line 398
    invoke-direct {p1, p2, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 399
    .line 400
    .line 401
    :try_start_2
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 402
    .line 403
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1

    .line 404
    .line 405
    .line 406
    goto :goto_5

    .line 407
    :catch_3
    move-exception p2

    .line 408
    move-object v5, p1

    .line 409
    move-object p1, p2

    .line 410
    goto :goto_4

    .line 411
    :cond_14
    :goto_2
    :try_start_3
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 412
    .line 413
    invoke-virtual {p1, v2}, Lco/median/android/MainActivity;->T2(Landroid/net/Uri;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_1

    .line 414
    .line 415
    .line 416
    goto :goto_5

    .line 417
    :goto_3
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 418
    .line 419
    .line 420
    move-result-object p2

    .line 421
    sget-object p3, Lco/median/android/B;->r:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {p2, p3, v0, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :goto_4
    if-eqz v5, :cond_16

    .line 432
    .line 433
    const-string p2, "browser_fallback_url"

    .line 434
    .line 435
    invoke-virtual {v5, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 440
    .line 441
    .line 442
    move-result p3

    .line 443
    if-nez p3, :cond_15

    .line 444
    .line 445
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 446
    .line 447
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    goto :goto_5

    .line 451
    :cond_15
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 452
    .line 453
    const p3, 0x7f120025

    .line 454
    .line 455
    .line 456
    invoke-static {p2, p3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    invoke-virtual {p2}, Landroid/widget/Toast;->show()V

    .line 461
    .line 462
    .line 463
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 464
    .line 465
    .line 466
    move-result-object p2

    .line 467
    sget-object v0, Lco/median/android/B;->r:Ljava/lang/String;

    .line 468
    .line 469
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 470
    .line 471
    invoke-virtual {v2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object p3

    .line 475
    invoke-virtual {p2, v0, p3, p1, v1}, Lo0/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 476
    .line 477
    .line 478
    :cond_16
    :goto_5
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 479
    .line 480
    invoke-virtual {p1}, Lco/median/android/MainActivity;->N1()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    const-string p2, "app_links"

    .line 485
    .line 486
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-eqz p1, :cond_17

    .line 491
    .line 492
    invoke-virtual {p0}, Lco/median/android/B;->s()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    if-nez p1, :cond_17

    .line 497
    .line 498
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 499
    .line 500
    invoke-virtual {v3}, Lo0/a;->e()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p2

    .line 504
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_17
    return v1

    .line 508
    :cond_18
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 509
    .line 510
    invoke-virtual {v2}, Lco/median/android/MainActivity;->n2()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-nez v2, :cond_19

    .line 515
    .line 516
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 517
    .line 518
    const/high16 v4, -0x40800000    # -1.0f

    .line 519
    .line 520
    invoke-virtual {v2, v4}, Lco/median/android/MainActivity;->h3(F)V

    .line 521
    .line 522
    .line 523
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 524
    .line 525
    invoke-virtual {v2, v0}, Lco/median/android/MainActivity;->l3(Z)V

    .line 526
    .line 527
    .line 528
    :cond_19
    iget-boolean v2, v3, Lo0/a;->g1:Z

    .line 529
    .line 530
    if-eqz v2, :cond_1b

    .line 531
    .line 532
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 533
    .line 534
    invoke-virtual {v2}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    iget-object v4, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 539
    .line 540
    invoke-virtual {v4}, Lco/median/android/MainActivity;->C1()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-virtual {v2, v4}, Lco/median/android/r;->h(Ljava/lang/String;)Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    if-eqz v4, :cond_1a

    .line 549
    .line 550
    iget-object v4, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 551
    .line 552
    invoke-virtual {v4}, Lco/median/android/MainActivity;->C1()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-virtual {v2, v4, v0}, Lco/median/android/r;->n(Ljava/lang/String;Z)V

    .line 557
    .line 558
    .line 559
    goto :goto_6

    .line 560
    :cond_1a
    iget v4, v3, Lo0/a;->f1:I

    .line 561
    .line 562
    if-lez v4, :cond_1b

    .line 563
    .line 564
    invoke-virtual {v2}, Lco/median/android/r;->g()I

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-le v4, v1, :cond_1b

    .line 569
    .line 570
    invoke-virtual {v2}, Lco/median/android/r;->g()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    iget v4, v3, Lo0/a;->f1:I

    .line 575
    .line 576
    if-lt v2, v4, :cond_1b

    .line 577
    .line 578
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 579
    .line 580
    invoke-virtual {v2, p2}, Lco/median/android/MainActivity;->R2(Ljava/lang/String;)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_1b

    .line 585
    .line 586
    return v1

    .line 587
    :cond_1b
    :goto_6
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 588
    .line 589
    invoke-virtual {v2}, Lco/median/android/MainActivity;->V1()I

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    iget-object v4, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 594
    .line 595
    invoke-virtual {v4, p2}, Lco/median/android/MainActivity;->K3(Ljava/lang/String;)I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-ltz v2, :cond_20

    .line 600
    .line 601
    if-ltz v4, :cond_20

    .line 602
    .line 603
    const-string v6, "postLoadJavascript"

    .line 604
    .line 605
    const-string v7, "url"

    .line 606
    .line 607
    if-le v4, v2, :cond_1e

    .line 608
    .line 609
    if-eqz p3, :cond_1c

    .line 610
    .line 611
    return v1

    .line 612
    :cond_1c
    new-instance p1, Landroid/content/Intent;

    .line 613
    .line 614
    iget-object p3, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 615
    .line 616
    invoke-virtual {p3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 617
    .line 618
    .line 619
    move-result-object p3

    .line 620
    const-class v4, Lco/median/android/MainActivity;

    .line 621
    .line 622
    invoke-direct {p1, p3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 623
    .line 624
    .line 625
    const-string p3, "isRoot"

    .line 626
    .line 627
    invoke-virtual {p1, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 628
    .line 629
    .line 630
    invoke-virtual {p1, v7, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 631
    .line 632
    .line 633
    const-string p2, "parentUrlLevel"

    .line 634
    .line 635
    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 636
    .line 637
    .line 638
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 639
    .line 640
    iget-object p2, p2, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 641
    .line 642
    invoke-virtual {p1, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 643
    .line 644
    .line 645
    iget-boolean p2, v3, Lo0/a;->g1:Z

    .line 646
    .line 647
    if-eqz p2, :cond_1d

    .line 648
    .line 649
    const-string p2, "ignoreInterceptMaxWindows"

    .line 650
    .line 651
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 652
    .line 653
    .line 654
    :cond_1d
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 655
    .line 656
    const/16 p3, 0x190

    .line 657
    .line 658
    invoke-virtual {p2, p1, p3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 659
    .line 660
    .line 661
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 662
    .line 663
    iput-object v5, p1, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 664
    .line 665
    iput-object v5, p1, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 666
    .line 667
    return v1

    .line 668
    :cond_1e
    if-ge v4, v2, :cond_20

    .line 669
    .line 670
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 671
    .line 672
    invoke-virtual {v2}, Lco/median/android/MainActivity;->Q1()I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-gt v4, v2, :cond_20

    .line 677
    .line 678
    if-eqz p3, :cond_1f

    .line 679
    .line 680
    return v1

    .line 681
    :cond_1f
    new-instance p1, Landroid/content/Intent;

    .line 682
    .line 683
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1, v7, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 687
    .line 688
    .line 689
    const-string p2, "urlLevel"

    .line 690
    .line 691
    invoke-virtual {p1, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 692
    .line 693
    .line 694
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 695
    .line 696
    iget-object p2, p2, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 697
    .line 698
    invoke-virtual {p1, v6, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 699
    .line 700
    .line 701
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 702
    .line 703
    const/4 p3, -0x1

    .line 704
    invoke-virtual {p2, p3, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 705
    .line 706
    .line 707
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 708
    .line 709
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 710
    .line 711
    .line 712
    return v1

    .line 713
    :cond_20
    if-ltz v4, :cond_21

    .line 714
    .line 715
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 716
    .line 717
    invoke-virtual {v2, v4}, Lco/median/android/MainActivity;->n3(I)V

    .line 718
    .line 719
    .line 720
    :cond_21
    if-nez p3, :cond_22

    .line 721
    .line 722
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 723
    .line 724
    new-instance v3, Lm0/g1;

    .line 725
    .line 726
    invoke-direct {v3, p0, p2}, Lm0/g1;-><init>(Lco/median/android/B;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 730
    .line 731
    .line 732
    :cond_22
    iget-object v2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 733
    .line 734
    invoke-virtual {v2}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    invoke-virtual {v2}, Lco/median/android/GoNativeApplication;->h()Lm0/o1;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-virtual {v2, p2}, Lm0/o1;->s(Ljava/lang/String;)Landroid/util/Pair;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v4, Lo0/h;

    .line 749
    .line 750
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v3, Lm0/p1;

    .line 753
    .line 754
    if-eqz p3, :cond_23

    .line 755
    .line 756
    if-eqz v4, :cond_23

    .line 757
    .line 758
    return v1

    .line 759
    :cond_23
    if-eqz v4, :cond_24

    .line 760
    .line 761
    sget-object p3, Lm0/p1;->d:Lm0/p1;

    .line 762
    .line 763
    if-ne v3, p3, :cond_24

    .line 764
    .line 765
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 766
    .line 767
    new-instance p3, Lco/median/android/B$c;

    .line 768
    .line 769
    invoke-direct {p3, p0, v4, p2}, Lco/median/android/B$c;-><init>(Lco/median/android/B;Lo0/h;Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2, v4}, Lm0/o1;->k(Lo0/h;)V

    .line 776
    .line 777
    .line 778
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 779
    .line 780
    invoke-virtual {v2, p1}, Lm0/o1;->n(Landroid/app/Activity;)V

    .line 781
    .line 782
    .line 783
    return v1

    .line 784
    :cond_24
    if-eqz v4, :cond_25

    .line 785
    .line 786
    sget-object p3, Lm0/p1;->f:Lm0/p1;

    .line 787
    .line 788
    if-ne v3, p3, :cond_25

    .line 789
    .line 790
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 791
    .line 792
    new-instance p3, Lco/median/android/B$d;

    .line 793
    .line 794
    invoke-direct {p3, p0, v4, p2}, Lco/median/android/B$d;-><init>(Lco/median/android/B;Lo0/h;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 798
    .line 799
    .line 800
    return v1

    .line 801
    :cond_25
    if-eqz v4, :cond_26

    .line 802
    .line 803
    sget-object p3, Lm0/p1;->e:Lm0/p1;

    .line 804
    .line 805
    if-ne v3, p3, :cond_26

    .line 806
    .line 807
    iget-object p3, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 808
    .line 809
    invoke-static {p2, p3}, Lo0/j;->j(Ljava/lang/String;Ljava/lang/String;)Z

    .line 810
    .line 811
    .line 812
    move-result p3

    .line 813
    if-nez p3, :cond_26

    .line 814
    .line 815
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 816
    .line 817
    new-instance p3, Lco/median/android/B$e;

    .line 818
    .line 819
    invoke-direct {p3, p0, v4, p2}, Lco/median/android/B$e;-><init>(Lco/median/android/B;Lo0/h;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 823
    .line 824
    .line 825
    return v1

    .line 826
    :cond_26
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 827
    .line 828
    iget-boolean p2, p2, Lco/median/android/MainActivity;->G:Z

    .line 829
    .line 830
    if-eqz p2, :cond_27

    .line 831
    .line 832
    invoke-virtual {v2, p1}, Lm0/o1;->k(Lo0/h;)V

    .line 833
    .line 834
    .line 835
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 836
    .line 837
    iput-boolean v0, p1, Lco/median/android/MainActivity;->G:Z

    .line 838
    .line 839
    :cond_27
    return v0

    .line 840
    :cond_28
    :goto_7
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 841
    .line 842
    invoke-virtual {p1}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 843
    .line 844
    .line 845
    move-result-object p1

    .line 846
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 847
    .line 848
    iget-object p2, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 849
    .line 850
    invoke-virtual {p1, p2, v2}, Lo0/b;->g(Lo0/g;Landroid/net/Uri;)V

    .line 851
    .line 852
    .line 853
    return v1
.end method

.method public V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    new-instance v1, Lm0/h1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lm0/h1;-><init>(Lco/median/android/B;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 6
    .line 7
    sget-object v2, Lco/median/android/E;->e:Lco/median/android/E;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lco/median/android/B;->V()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public q(Landroid/webkit/WebView;Landroid/os/Message;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Lo0/a;->g1:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, v0, Lo0/a;->f1:I

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 16
    .line 17
    invoke-virtual {v1}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lco/median/android/r;->g()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget v2, v0, Lo0/a;->f1:I

    .line 26
    .line 27
    if-lt v1, v2, :cond_0

    .line 28
    .line 29
    new-instance v0, Landroid/webkit/WebView;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lco/median/android/B$a;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lco/median/android/B$a;-><init>(Lco/median/android/B;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    iget-boolean p1, v0, Lo0/a;->g1:Z

    .line 58
    .line 59
    invoke-direct {p0, p2, p1}, Lco/median/android/B;->p(Landroid/os/Message;Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public r(Lo0/h;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lco/median/android/MainActivity;->W1()Lco/median/android/A;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lco/median/android/A;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 19
    .line 20
    sget-object v0, Lco/median/android/E;->e:Lco/median/android/E;

    .line 21
    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    sget-object p1, Lco/median/android/E;->f:Lco/median/android/E;

    .line 25
    .line 26
    iput-object p1, p0, Lco/median/android/B;->h:Lco/median/android/E;

    .line 27
    .line 28
    iget-object p1, p0, Lco/median/android/B;->g:Landroid/os/Handler;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    if-nez p3, :cond_2

    .line 35
    .line 36
    const-string p1, "file:///android_asset/offline.html"

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lco/median/android/MainActivity;->l1(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public t(Lm0/G;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lm0/G;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lm0/G;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lm0/G;->a()[Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    check-cast p1, [Landroid/net/Uri;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    aget-object p1, p1, v0

    .line 24
    .line 25
    iget-object v0, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    new-instance v1, Lco/median/android/B$j;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Lco/median/android/B$j;-><init>(Lco/median/android/B;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1, v1}, Lm0/O0;->b(Landroid/content/Context;Landroid/net/Uri;Lm0/s;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Lm0/G;->a()[Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {v0, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Lco/median/android/B;->q:Landroid/webkit/ValueCallback;

    .line 49
    .line 50
    :cond_1
    return-void

    .line 51
    :cond_2
    invoke-virtual {p0}, Lco/median/android/B;->m()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public x(Lco/median/android/s;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B;->f:Lm0/O;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/B;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    iget-object v2, p0, Lco/median/android/B;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2, v2}, Lm0/O;->b(Landroid/app/Activity;Lo0/h;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
