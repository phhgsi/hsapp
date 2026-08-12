.class public Lco/median/android/MainActivity;
.super Landroidx/appcompat/app/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Observer;
.implements Lo0/g;
.implements Lco/median/android/widget/b$j;
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/MainActivity$m;,
        Lco/median/android/MainActivity$i;,
        Lco/median/android/MainActivity$l;,
        Lco/median/android/MainActivity$k;,
        Lco/median/android/MainActivity$j;
    }
.end annotation


# static fields
.field private static final I0:Ljava/lang/String; = "co.median.android.MainActivity"


# instance fields
.field private A0:Lm0/P0;

.field private B0:Ljava/lang/String;

.field private C0:Ljava/lang/String;

.field private D:Z

.field private D0:Lco/median/android/A;

.field private E:Lco/median/android/widget/WebViewContainerView;

.field private E0:Z

.field private F:Lo0/h;

.field private F0:Lm0/Y0;

.field G:Z

.field private G0:F

.field private H:Ljava/util/Stack;

.field private H0:F

.field private I:Landroid/view/View;

.field private J:Ljava/lang/String;

.field private K:Lco/median/android/widget/MedianProgressView;

.field private L:Lco/median/android/MySwipeRefreshLayout;

.field private M:Lco/median/android/widget/SwipeHistoryNavigationLayout;

.field private N:Landroid/widget/RelativeLayout;

.field private O:Landroid/net/ConnectivityManager;

.field private P:Lco/median/android/z;

.field private Q:Lm0/e;

.field private R:Lm0/W0;

.field private S:Z

.field private T:Z

.field private U:Landroid/os/Handler;

.field private V:F

.field private W:Z

.field private X:Ljava/lang/String;

.field private final Y:Ljava/lang/Runnable;

.field private Z:Lco/median/android/d;

.field private a0:Lco/median/android/g;

.field private b0:Lco/median/android/u;

.field private c0:Lco/median/android/y;

.field private d0:Lco/median/android/MainActivity$i;

.field private e0:Lm0/X;

.field private f0:Z

.field protected g0:Ljava/lang/String;

.field protected h0:Ljava/lang/String;

.field private i0:Ljava/util/Stack;

.field private j0:Lco/median/android/t;

.field private k0:Ljava/util/ArrayList;

.field private l0:Ljava/util/ArrayList;

.field private m0:Ljava/lang/String;

.field private n0:Landroid/telephony/SignalStrength;

.field private o0:Z

.field private p0:Lb/b;

.field private q0:Lb/b;

.field private r0:Lb/b;

.field private s0:Lco/median/android/B;

.field private t0:Ljava/lang/String;

.field private u0:Z

.field private v0:Z

.field private w0:LG/u;

.field private x0:Ljava/lang/String;

.field private y0:Ljava/lang/String;

.field private z0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/d;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/MainActivity;->D:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lco/median/android/MainActivity;->G:Z

    .line 8
    .line 9
    new-instance v1, Ljava/util/Stack;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lco/median/android/MainActivity;->O:Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    iput-boolean v0, p0, Lco/median/android/MainActivity;->T:Z

    .line 20
    .line 21
    new-instance v2, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lco/median/android/MainActivity;->U:Landroid/os/Handler;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput v2, p0, Lco/median/android/MainActivity;->V:F

    .line 30
    .line 31
    iput-boolean v0, p0, Lco/median/android/MainActivity;->W:Z

    .line 32
    .line 33
    new-instance v2, Lco/median/android/MainActivity$c;

    .line 34
    .line 35
    invoke-direct {v2, p0}, Lco/median/android/MainActivity$c;-><init>(Lco/median/android/MainActivity;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lco/median/android/MainActivity;->Y:Ljava/lang/Runnable;

    .line 39
    .line 40
    iput-boolean v0, p0, Lco/median/android/MainActivity;->f0:Z

    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lco/median/android/MainActivity;->k0:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance v2, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 55
    .line 56
    iput-boolean v0, p0, Lco/median/android/MainActivity;->o0:Z

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    iput-object v2, p0, Lco/median/android/MainActivity;->t0:Ljava/lang/String;

    .line 61
    .line 62
    iput-boolean v0, p0, Lco/median/android/MainActivity;->u0:Z

    .line 63
    .line 64
    iput-object v1, p0, Lco/median/android/MainActivity;->y0:Ljava/lang/String;

    .line 65
    .line 66
    iput-boolean v0, p0, Lco/median/android/MainActivity;->z0:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Lco/median/android/MainActivity;->E0:Z

    .line 69
    .line 70
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    iput v0, p0, Lco/median/android/MainActivity;->G0:F

    .line 73
    .line 74
    const/high16 v0, -0x40800000    # -1.0f

    .line 75
    .line 76
    iput v0, p0, Lco/median/android/MainActivity;->H0:F

    .line 77
    .line 78
    return-void
.end method

.method public static synthetic A0(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->w2(Ljava/lang/String;)V

    return-void
.end method

.method private A1(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lm0/r;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lm0/r;->d(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Lco/median/android/MainActivity;->M2(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lm0/s0;

    .line 20
    .line 21
    invoke-direct {v2, p0, p1, v0}, Lm0/s0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private synthetic A2(Lco/median/android/GoNativeApplication;LG/u;)V
    .locals 2

    .line 1
    iput-object p2, p0, Lco/median/android/MainActivity;->w0:LG/u;

    .line 2
    .line 3
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 4
    .line 5
    new-instance v0, Lm0/F0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lm0/F0;-><init>(Lco/median/android/MainActivity;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0, p2, v0}, Lo0/b;->a(Lo0/g;LG/u;Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lm0/G0;

    .line 23
    .line 24
    invoke-direct {p2, p0}, Lm0/G0;-><init>(Lco/median/android/MainActivity;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v0, 0x1b58

    .line 28
    .line 29
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private A3(ZI)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean p1, p1, Lo0/a;->z0:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lco/median/android/MainActivity$g;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lco/median/android/MainActivity$g;-><init>(Lco/median/android/MainActivity;)V

    .line 19
    .line 20
    .line 21
    int-to-long v1, p2

    .line 22
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2}, Lco/median/android/widget/b;->setRefreshing(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static synthetic B0(Lco/median/android/MainActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->B2()Z

    move-result p0

    return p0
.end method

.method private B1(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    const/16 v1, 0xbb8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 18
    .line 19
    .line 20
    const-string v1, "GET"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/16 v2, 0xc8

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/io/BufferedReader;

    .line 41
    .line 42
    new-instance v2, Ljava/io/InputStreamReader;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lorg/json/JSONObject;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v1, "active_url"

    .line 83
    .line 84
    const-string v2, "https://hamareshikshak.educationportal3.mp.gov.in"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "cache_duration_minutes"

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-static {p0, v1, v0}, Lm0/r;->f(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :goto_1
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v3, "Error fetching dynamic route from "

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    :cond_1
    const/4 p1, 0x0

    .line 124
    return-object p1
.end method

.method private synthetic B2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public static synthetic C0(Lco/median/android/MainActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->C2(Ljava/lang/Boolean;)V

    return-void
.end method

.method private synthetic C2(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lco/median/android/MainActivity;->t0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lco/median/android/MainActivity;->Z2(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic D0(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->K2(Ljava/lang/String;)V

    return-void
.end method

.method private D1(Landroid/os/Bundle;)I
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 13
    .line 14
    .line 15
    array-length p1, p1

    .line 16
    return p1
.end method

.method private synthetic D2(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string p1, "median_appbrowser_closed"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic E0(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->x2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic E2(Lm0/G;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->s0:Lco/median/android/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lco/median/android/B;->t(Lm0/G;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private E3(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :try_start_0
    const-string p1, "loggedIn"

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lm0/W0;->r(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const-string p1, "default"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lm0/W0;->r(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_0
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    return-void
.end method

.method public static synthetic F0(Lco/median/android/MainActivity;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->D2(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method private F1()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "http://www.google.com"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "android.intent.action.VIEW"

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/high16 v2, 0x10000

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return-object v0
.end method

.method private synthetic F2()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->getWebViewScrollY()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static synthetic G0(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->I2()V

    return-void
.end method

.method private synthetic G2(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lco/median/android/r;->i(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 21
    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public static synthetic H0(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->x1()V

    return-void
.end method

.method private synthetic H2(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I0(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->y2(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic I2()V
    .locals 0

    return-void
.end method

.method private I3(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x30

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const-string p1, ""

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "dark"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string p1, "light"

    .line 20
    .line 21
    :goto_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lm0/Y0;->f(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 27
    .line 28
    invoke-virtual {p1}, Lm0/e;->s()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lco/median/android/MainActivity;->P:Lco/median/android/z;

    .line 32
    .line 33
    invoke-virtual {p1}, Lco/median/android/z;->l()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 37
    .line 38
    invoke-virtual {p1}, Lm0/W0;->j()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->r3(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static synthetic J0(Lco/median/android/MainActivity;Ld1/b;Ld1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->q2(Ld1/b;Ld1/a;)V

    return-void
.end method

.method private synthetic J2(Ljava/lang/String;Lco/median/android/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p2, p1}, Lco/median/android/r;->o(Lco/median/android/r$b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private J3(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v1, "/"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    :cond_2
    const-string v0, "http://"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v1, "https://"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1

    .line 76
    :cond_4
    :goto_0
    return v0
.end method

.method public static synthetic K0(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->L2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic K2(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 4
    .line 5
    const-string v2, "/api/save_fcm_token.php"

    .line 6
    .line 7
    invoke-static {p0, v2}, Lm0/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    const-string v2, "POST"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x2710

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    .line 36
    .line 37
    const-string v2, "Content-Type"

    .line 38
    .line 39
    const-string v3, "application/x-www-form-urlencoded"

    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "fcm_token="

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p1, "&platform=android"

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v3, "FCM Token sent to server, response: "

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    new-instance p1, Ljava/io/BufferedReader;

    .line 114
    .line 115
    new-instance v0, Ljava/io/InputStreamReader;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 125
    .line 126
    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_0

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :catch_0
    move-exception p1

    .line 143
    goto :goto_1

    .line 144
    :cond_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    .line 145
    .line 146
    .line 147
    sget-object p1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 148
    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v2, "Server response: "

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :goto_1
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 175
    .line 176
    new-instance v1, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v2, "Error sending FCM token: "

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public static synthetic L0(Lco/median/android/MainActivity;Lco/median/android/GoNativeApplication;LG/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->A2(Lco/median/android/GoNativeApplication;LG/u;)V

    return-void
.end method

.method private synthetic L2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 4
    .line 5
    const-string v2, "/api/save_fcm_token.php"

    .line 6
    .line 7
    invoke-static {p0, v2}, Lm0/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    const-string v2, "POST"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x2710

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 35
    .line 36
    .line 37
    const-string v2, "Content-Type"

    .line 38
    .line 39
    const-string v3, "application/x-www-form-urlencoded"

    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "fcm_token="

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p1, "&platform=android&username="

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-static {p2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    sget-object p2, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v1, "FCM Token sent with username, response: "

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catch_0
    move-exception p1

    .line 122
    sget-object p2, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v1, "Error sending FCM token with username: "

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method private L3()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic M0(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->t2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private M2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lm0/r;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p2, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    sget-object p2, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Loading URL: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 34
    .line 35
    invoke-interface {p2, p1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public static synthetic N0(Lco/median/android/MainActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->F2()Z

    move-result p0

    return p0
.end method

.method public static synthetic O0(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->u2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic P0(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "clearWebviewCookies: onReceiveValue callback: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic Q0(Lco/median/android/MainActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->H2(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private Q2()Z
    .locals 4

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lo0/a;->n0:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 12
    .line 13
    invoke-interface {v0}, Lo0/h;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lm0/W0;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 31
    .line 32
    invoke-virtual {v0}, Lm0/W0;->e()V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-virtual {p0}, Lco/median/android/MainActivity;->m1()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lco/median/android/MainActivity;->Y1()V

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    iget-object v0, p0, Lco/median/android/MainActivity;->i0:Ljava/util/Stack;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v2, 0x0

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Lco/median/android/MainActivity;->i0:Ljava/util/Stack;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/os/Bundle;

    .line 62
    .line 63
    new-instance v3, Lco/median/android/s;

    .line 64
    .line 65
    invoke-direct {v3, p0}, Lco/median/android/s;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v0}, Lco/median/android/s;->e(Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3, v2, v1}, Lco/median/android/MainActivity;->B3(Lo0/h;ZZ)V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :cond_4
    return v2
.end method

.method public static synthetic R0(Lco/median/android/MainActivity;Lm0/G;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->E2(Lm0/G;)V

    return-void
.end method

.method public static synthetic S0(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->W2()V

    return-void
.end method

.method public static synthetic T0(Lco/median/android/MainActivity;Ljava/lang/String;Lo0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->v2(Ljava/lang/String;Lo0/b;)V

    return-void
.end method

.method public static synthetic U0(Lco/median/android/MainActivity;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->r2(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private U1(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "targetUrl"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    const-string v1, "android.intent.action.VIEW"

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, ".http"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const-string v3, ".https"

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    const-string v0, "https"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const-string v0, "http"

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    :cond_4
    :goto_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_5
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_6
    return-object v0
.end method

.method public static synthetic V0(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->s2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic W0(Lco/median/android/MainActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->m0:Ljava/lang/String;

    return-object p0
.end method

.method private W2()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->w0:LG/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LG/u;->a()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [F

    .line 13
    .line 14
    fill-array-data v2, :array_0

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v1, 0x64

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 32
    .line 33
    .line 34
    new-instance v1, Lco/median/android/MainActivity$h;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lco/median/android/MainActivity$h;-><init>(Lco/median/android/MainActivity;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    nop

    .line 47
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static bridge synthetic X0(Lco/median/android/MainActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->U:Landroid/os/Handler;

    return-object p0
.end method

.method static bridge synthetic Y0(Lco/median/android/MainActivity;)Lo0/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    return-object p0
.end method

.method private Y2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Lo0/h;->getProgress()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x64

    .line 11
    .line 12
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 16
    .line 17
    invoke-interface {v0}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v1, "file:///android_asset/offline.html"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    invoke-virtual {p0}, Lco/median/android/MainActivity;->i2()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_4
    iget-object v0, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method static bridge synthetic Z0(Lco/median/android/MainActivity;)LG/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->w0:LG/u;

    return-object p0
.end method

.method private Z1()V
    .locals 1

    .line 1
    invoke-static {}, Lco/median/android/s;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lco/median/android/MainActivity;->d2()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 11
    .line 12
    invoke-interface {v0}, Lo0/h;->goForward()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method static bridge synthetic a1(Lco/median/android/MainActivity;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->Y:Ljava/lang/Runnable;

    return-object p0
.end method

.method static bridge synthetic b1(Lco/median/android/MainActivity;)Lco/median/android/MySwipeRefreshLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    return-object p0
.end method

.method private b2(Landroid/content/Intent;)Z
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
    const-string v1, "click_url"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "is_external_url"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "flash_msg"

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    new-instance v3, Lm0/t0;

    .line 32
    .line 33
    invoke-direct {v3, p0, p1}, Lm0/t0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    if-eqz v1, :cond_8

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_8

    .line 46
    .line 47
    sget-object p1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v4, "Processing notification URL: "

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {p1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    const-string p1, "true"

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const/4 v3, 0x1

    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    const-string p1, "1"

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move p1, v0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_0
    move p1, v3

    .line 90
    :goto_1
    const-string v2, "http"

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-static {p0, v1}, Lm0/r;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    xor-int/2addr p1, v3

    .line 105
    :cond_4
    if-eqz p1, :cond_5

    .line 106
    .line 107
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    .line 108
    .line 109
    const-string v2, "android.intent.action.VIEW"

    .line 110
    .line 111
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {p1, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    return v0

    .line 122
    :catch_0
    move-exception p1

    .line 123
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 124
    .line 125
    const-string v2, "Error opening external URL"

    .line 126
    .line 127
    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_7

    .line 136
    .line 137
    const-string p1, "/"

    .line 138
    .line 139
    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_6

    .line 144
    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :cond_6
    invoke-static {p0, v1}, Lm0/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :cond_7
    iput-object v1, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 165
    .line 166
    return v3

    .line 167
    :cond_8
    :goto_2
    return v0
.end method

.method private b3(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->O:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-string v0, "DISCONNECTED"

    .line 26
    .line 27
    :goto_1
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "connected"

    .line 33
    .line 34
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v1, "type"

    .line 38
    .line 39
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "cdmaDbm"

    .line 52
    .line 53
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getCdmaDbm()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "cdmaEcio"

    .line 63
    .line 64
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getCdmaEcio()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v1, "evdoDbm"

    .line 74
    .line 75
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoDbm()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    const-string v1, "evdoEcio"

    .line 85
    .line 86
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoEcio()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v1, "evdoSnr"

    .line 96
    .line 97
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoSnr()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    const-string v1, "gsmBitErrorRate"

    .line 107
    .line 108
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getGsmBitErrorRate()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v1, "gsmSignalStrength"

    .line 118
    .line 119
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getGsmSignalStrength()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string v1, "level"

    .line 129
    .line 130
    iget-object v3, p0, Lco/median/android/MainActivity;->n0:Landroid/telephony/SignalStrength;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getLevel()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v1, "cellSignalStrength"

    .line 140
    .line 141
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catch_0
    move-exception p1

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    :goto_2
    invoke-static {p1, v2}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :goto_3
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 160
    .line 161
    const-string v2, "JSON error sending connectivity"

    .line 162
    .line 163
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method static bridge synthetic c1(Lco/median/android/MainActivity;LG/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity;->w0:LG/u;

    return-void
.end method

.method private c2(Landroid/content/Intent;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    const-string v0, "load_url"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "click_url"

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_1
    const-string v3, "url"

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_2
    const-string v4, "is_external_url"

    .line 28
    .line 29
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v1, :cond_9

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-nez v6, :cond_9

    .line 40
    .line 41
    sget-object v6, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v7, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v8, "Notification URL received: "

    .line 49
    .line 50
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    const-string v7, "true"

    .line 64
    .line 65
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const/4 v8, 0x1

    .line 70
    if-nez v7, :cond_4

    .line 71
    .line 72
    const-string v7, "1"

    .line 73
    .line 74
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/4 v5, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    :goto_0
    move v5, v8

    .line 84
    :goto_1
    const-string v7, "http"

    .line 85
    .line 86
    if-nez v5, :cond_5

    .line 87
    .line 88
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_5

    .line 93
    .line 94
    invoke-static {p0, v1}, Lm0/r;->e(Landroid/content/Context;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    xor-int/2addr v5, v8

    .line 99
    :cond_5
    if-eqz v5, :cond_6

    .line 100
    .line 101
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v7, "Opening external URL in browser: "

    .line 107
    .line 108
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    .line 122
    .line 123
    const-string v6, "android.intent.action.VIEW"

    .line 124
    .line 125
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {v5, v6, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :catch_0
    move-exception v1

    .line 137
    sget-object v5, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 138
    .line 139
    new-instance v6, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v7, "Error opening external URL: "

    .line 145
    .line 146
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-nez v5, :cond_8

    .line 169
    .line 170
    const-string v5, "/"

    .line 171
    .line 172
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-nez v7, :cond_7

    .line 177
    .line 178
    new-instance v7, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :cond_7
    invoke-static {p0, v1}, Lm0/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    :cond_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v7, "Loading internal URL in WebView: "

    .line 203
    .line 204
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    new-instance v5, Landroid/os/Handler;

    .line 218
    .line 219
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 224
    .line 225
    .line 226
    new-instance v6, Lm0/q0;

    .line 227
    .line 228
    invoke-direct {v6, p0, v1}, Lm0/q0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const-wide/16 v7, 0x1f4

    .line 232
    .line 233
    invoke-virtual {v5, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 234
    .line 235
    .line 236
    :goto_2
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v4}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    const-string v0, "flash_msg"

    .line 249
    .line 250
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const-string v2, "flash"

    .line 255
    .line 256
    if-nez v1, :cond_a

    .line 257
    .line 258
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    :cond_a
    if-eqz v1, :cond_b

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-nez v3, :cond_b

    .line 269
    .line 270
    new-instance v3, Lm0/r0;

    .line 271
    .line 272
    invoke-direct {v3, p0, v1}, Lm0/r0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_b
    :goto_3
    return-void
.end method

.method private c3(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lm0/B0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lm0/B0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method static bridge synthetic d1(Lco/median/android/MainActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->n1()Z

    move-result p0

    return p0
.end method

.method private d3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lm0/C0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lm0/C0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method static bridge synthetic e1(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->s1(Ljava/lang/String;)V

    return-void
.end method

.method private e2()V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "webviewDatabase"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "databasePath "

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, " exists"

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {}, Lm0/f1;->a()Lm0/f1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p0}, Lm0/f1;->c(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lco/median/android/a;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Lco/median/android/a;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lco/median/android/a;->b()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->g()Lco/median/android/y;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lco/median/android/MainActivity;->c0:Lco/median/android/y;

    .line 73
    .line 74
    return-void
.end method

.method static bridge synthetic f1(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->Z1()V

    return-void
.end method

.method static bridge synthetic g1(Lco/median/android/MainActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->Q2()Z

    move-result p0

    return p0
.end method

.method private g2(Landroid/net/Uri;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, Lo0/a;->s0:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    return v0
.end method

.method static bridge synthetic h1(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->Y2()V

    return-void
.end method

.method private h2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static bridge synthetic i1(Lco/median/android/MainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->b3(Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic j1(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->d3(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static bridge synthetic k1()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    return-object v0
.end method

.method private k2(Landroid/location/Location;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private k3(Lo0/a$b;)V
    .locals 2

    .line 1
    sget-object v0, Lco/median/android/MainActivity$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x6

    .line 20
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    const/4 p1, -0x1

    .line 29
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private l2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private m3()V
    .locals 3

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lo0/a;->T:Lo0/a$b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lco/median/android/MainActivity;->k3(Lo0/a$b;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const v2, 0x7f050003

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lo0/a;->V:Lo0/a$b;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lco/median/android/MainActivity;->k3(Lo0/a$b;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget-object v1, v0, Lo0/a;->U:Lo0/a$b;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-direct {p0, v1}, Lco/median/android/MainActivity;->k3(Lo0/a$b;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-boolean v0, v0, Lo0/a;->p:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    sget-object v0, Lo0/a$b;->d:Lo0/a$b;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lco/median/android/MainActivity;->k3(Lo0/a$b;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void
.end method

.method private n1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->canGoForward()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private o1()V
    .locals 3

    .line 1
    invoke-static {p0}, Ld1/c;->a(Landroid/content/Context;)Ld1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ld1/b;->a()Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lm0/x0;

    .line 10
    .line 11
    invoke-direct {v2, p0, v0}, Lm0/x0;-><init>(Lco/median/android/MainActivity;Ld1/b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ld1/b;->a()Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lm0/y0;

    .line 22
    .line 23
    invoke-direct {v2, p0, v0}, Lm0/y0;-><init>(Lco/median/android/MainActivity;Ld1/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private synthetic p2(Ld1/b;Ld1/a;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ld1/a;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p2, v0}, Ld1/a;->a(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x4d2

    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1, p2, v0, p0, v1}, Ld1/b;->b(Ld1/a;ILandroid/app/Activity;I)Z
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private synthetic q2(Ld1/b;Ld1/a;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ld1/a;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/16 v1, 0x4d2

    .line 10
    .line 11
    :try_start_0
    invoke-interface {p1, p2, v0, p0, v1}, Ld1/b;->b(Ld1/a;ILandroid/app/Activity;I)Z
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private q3()V
    .locals 0

    .line 1
    return-void
.end method

.method private synthetic r2(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "FCM token fetch failed"

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "FCM Token: "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    const-string v0, "_median_push"

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "fcm_token"

    .line 59
    .line 60
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->c3(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private r3(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "FORCE_DARK"

    .line 2
    .line 3
    invoke-static {v0}, Lk0/c;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "Dark mode feature is not supported"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 18
    .line 19
    invoke-interface {v0}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string v0, "dark"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x2

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 36
    .line 37
    invoke-interface {p1}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, v1}, Lk0/a;->b(Landroid/webkit/WebSettings;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string v0, "light"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 55
    .line 56
    invoke-interface {p1}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, v0}, Lk0/a;->b(Landroid/webkit/WebSettings;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 73
    .line 74
    and-int/lit8 p1, p1, 0x30

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    const/16 v2, 0x10

    .line 79
    .line 80
    if-eq p1, v2, :cond_5

    .line 81
    .line 82
    const/16 v0, 0x20

    .line 83
    .line 84
    if-eq p1, v0, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 88
    .line 89
    invoke-interface {p1}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v1}, Lk0/a;->b(Landroid/webkit/WebSettings;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 98
    .line 99
    invoke-interface {p1}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1, v0}, Lk0/a;->b(Landroid/webkit/WebSettings;I)V

    .line 104
    .line 105
    .line 106
    :goto_0
    const-string p1, "FORCE_DARK_STRATEGY"

    .line 107
    .line 108
    invoke-static {p1}, Lk0/c;->a(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_6

    .line 113
    .line 114
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 115
    .line 116
    invoke-interface {p1}, Lo0/h;->getSettings()Landroid/webkit/WebSettings;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const/4 v0, 0x1

    .line 121
    invoke-static {p1, v0}, Lk0/a;->c(Landroid/webkit/WebSettings;I)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->o3()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method private s1(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v0, v0, Lo0/a;->B0:D

    .line 6
    .line 7
    const-string v2, "loading"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "complete"

    .line 14
    .line 15
    const-string v4, "interactive"

    .line 16
    .line 17
    if-nez v2, :cond_4

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-boolean v2, p0, Lco/median/android/MainActivity;->f0:Z

    .line 45
    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-direct {p0, v0, v1}, Lco/median/android/MainActivity;->v3(D)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p0}, Lco/median/android/MainActivity;->u3()V

    .line 65
    .line 66
    .line 67
    :goto_0
    iget-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-direct {p0}, Lco/median/android/MainActivity;->z3()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 76
    iput-boolean v0, p0, Lco/median/android/MainActivity;->f0:Z

    .line 77
    .line 78
    :cond_5
    :goto_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    return-void

    .line 92
    :cond_7
    :goto_3
    invoke-direct {p0}, Lco/median/android/MainActivity;->x1()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private synthetic s2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->M2(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private t1()V
    .locals 0

    return-void
.end method

.method private synthetic t2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->M2(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private t3(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "Security Alert"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lco/median/android/MainActivity$a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lco/median/android/MainActivity$a;-><init>(Lco/median/android/MainActivity;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "Exit"

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private synthetic u2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "https://hamareshikshak.educationportal3.mp.gov.in/app_route.json"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lco/median/android/MainActivity;->B1(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "https://shikshak.educationportal3.in/app_route.json"

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lco/median/android/MainActivity;->B1(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance p2, Lm0/D0;

    .line 18
    .line 19
    invoke-direct {p2, p0, p1, v0}, Lm0/D0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance v0, Lm0/E0;

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, p2}, Lm0/E0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private synthetic v2(Ljava/lang/String;Lo0/b;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, p0, v0}, Lo0/b;->h(Lo0/g;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p2, p0, p1}, Lo0/b;->g(Lo0/g;Landroid/net/Uri;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private v3(D)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpl-double v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/MainActivity;->U:Landroid/os/Handler;

    .line 8
    .line 9
    new-instance v1, Lm0/p0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lm0/p0;-><init>(Lco/median/android/MainActivity;)V

    .line 12
    .line 13
    .line 14
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    mul-double/2addr p1, v2

    .line 20
    double-to-int p1, p1

    .line 21
    int-to-long p1, p1

    .line 22
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->u3()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic w0(Lco/median/android/MainActivity;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->G2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private synthetic w2(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "Important Alert"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "OK"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic x0(Lco/median/android/MainActivity;Ljava/lang/String;Lco/median/android/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->J2(Ljava/lang/String;Lco/median/android/r;)V

    return-void
.end method

.method private x1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lco/median/android/MainActivity;->z3()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lco/median/android/MainActivity;->E0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lco/median/android/MainActivity;->W2()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private synthetic x2(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "Important Alert"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "OK"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic y0(Lco/median/android/MainActivity;Ld1/b;Ld1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/MainActivity;->p2(Ld1/b;Ld1/a;)V

    return-void
.end method

.method private synthetic y2(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "Actually loading URL: "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    sget-object p1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 34
    .line 35
    const-string v0, "WebView is null, cannot load URL"

    .line 36
    .line 37
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private y3()V
    .locals 7

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroid/location/LocationManager;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 14
    .line 15
    invoke-static {p0, v0}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 22
    .line 23
    invoke-static {p0, v0}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    :cond_1
    :try_start_0
    const-string v0, "gps"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v2, "gps"

    .line 38
    .line 39
    const-wide/16 v3, 0x7d0

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v6, p0

    .line 43
    invoke-virtual/range {v1 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    const-string v0, "network"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const-string v2, "network"

    .line 58
    .line 59
    const-wide/16 v3, 0x7d0

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    move-object v6, p0

    .line 63
    invoke-virtual/range {v1 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :goto_1
    sget-object v1, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 68
    .line 69
    const-string v2, "Error starting location monitoring"

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_2
    return-void
.end method

.method public static synthetic z0(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lco/median/android/MainActivity;->z2()V

    return-void
.end method

.method private z1()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->n()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->q()Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lm0/w0;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lm0/w0;-><init>(Lco/median/android/MainActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private synthetic z2()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lco/median/android/MainActivity;->W2()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lco/median/android/MainActivity;->E0:Z

    .line 11
    .line 12
    return-void
.end method

.method private z3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->U:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/MainActivity;->Y:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public B3(Lo0/h;ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    .line 2
    .line 3
    iget-boolean v1, p0, Lco/median/android/MainActivity;->S:Z

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lco/median/android/widget/WebViewContainerView;->b(Lco/median/android/MainActivity;Z)V

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->scrollTo(II)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 16
    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    new-instance p3, Landroid/os/Bundle;

    .line 22
    .line 23
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 27
    .line 28
    invoke-interface {v1, p3}, Lo0/h;->c(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lco/median/android/MainActivity;->i0:Ljava/util/Stack;

    .line 32
    .line 33
    invoke-virtual {v1, p3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Lo0/h;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    instance-of v1, p3, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    check-cast p3, Landroid/view/ViewGroup;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    check-cast v1, Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Landroid/view/ViewGroup;

    .line 59
    .line 60
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    move-object v2, p1

    .line 68
    check-cast v2, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p3, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {v2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    .line 79
    .line 80
    move-object p3, v0

    .line 81
    check-cast p3, Lco/median/android/s;

    .line 82
    .line 83
    invoke-static {p3}, Lco/median/android/D;->a(Lco/median/android/s;)V

    .line 84
    .line 85
    .line 86
    iget-boolean p3, p0, Lco/median/android/MainActivity;->G:Z

    .line 87
    .line 88
    if-nez p3, :cond_2

    .line 89
    .line 90
    check-cast v0, Lo0/h;

    .line 91
    .line 92
    invoke-interface {v0}, Lo0/h;->destroy()V

    .line 93
    .line 94
    .line 95
    :cond_2
    iput-boolean p2, p0, Lco/median/android/MainActivity;->G:Z

    .line 96
    .line 97
    iput-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 98
    .line 99
    iget-object p1, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 108
    .line 109
    :cond_3
    return-void
.end method

.method public C1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public C3(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->l()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v1, v1, Lo0/a;->x0:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/appcompat/app/a;->z()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 27
    .line 28
    invoke-interface {v0}, Lo0/h;->clearFocus()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lm0/Y0;->d(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    if-eqz p1, :cond_4

    .line 39
    .line 40
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p1, p1, Lo0/a;->T:Lo0/a$b;

    .line 45
    .line 46
    sget-object v0, Lo0/a$b;->f:Lo0/a$b;

    .line 47
    .line 48
    if-eq p1, v0, :cond_4

    .line 49
    .line 50
    const/4 p1, 0x4

    .line 51
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    invoke-direct {p0}, Lco/median/android/MainActivity;->m3()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public D3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lco/median/android/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/u;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public E1()F
    .locals 1

    .line 1
    iget v0, p0, Lco/median/android/MainActivity;->H0:F

    .line 2
    .line 3
    return v0
.end method

.method public F3()V
    .locals 1

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lo0/a;->h0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 10
    .line 11
    invoke-interface {v0}, Lo0/h;->getTitle()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public G1()Lm0/P0;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->A0:Lm0/P0;

    .line 2
    .line 3
    return-object v0
.end method

.method public G3(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lm0/Y0;->k(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public H1()Lco/median/android/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lco/median/android/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public H3(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lm0/Y0;->l(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public I1()Lb/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->r0:Lb/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public J1()Lco/median/android/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->a0:Lco/median/android/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public K1()Landroid/widget/RelativeLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->N:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public K3(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lo0/a;->i0:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/regex/Pattern;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, Lo0/a;->j0:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, -0x1

    .line 53
    return p1
.end method

.method public L1()Lco/median/android/GoNativeApplication;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 6
    .line 7
    return-object v0
.end method

.method public M1()Lco/median/android/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->j()Lco/median/android/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public N1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->x0:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public N2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lco/median/android/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lco/median/android/A;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public O1()Lco/median/android/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    check-cast v0, Lco/median/android/s;

    .line 4
    .line 5
    return-object v0
.end method

.method public O2(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    check-cast v0, Landroid/webkit/WebView;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public P1()Lco/median/android/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->j0:Lco/median/android/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public P2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->stopLoading()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lco/median/android/MainActivity;->u1()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Lco/median/android/MainActivity;->E3(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lco/median/android/u;

    .line 14
    .line 15
    invoke-virtual {v0}, Lco/median/android/u;->g()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 19
    .line 20
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lo0/a;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v0, v1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public Q1()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lco/median/android/r;->e(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public R1([Ljava/lang/String;Lco/median/android/MainActivity$j;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_2

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-static {p0, v3}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lco/median/android/MainActivity;->k0:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v1, Lco/median/android/MainActivity$k;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2}, Lco/median/android/MainActivity$k;-><init>(Lco/median/android/MainActivity;[Ljava/lang/String;Lco/median/android/MainActivity$j;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    const/16 p2, 0xc7

    .line 27
    .line 28
    invoke-static {p0, p1, p2}, Lx/b;->d(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-eqz p2, :cond_4

    .line 36
    .line 37
    array-length v0, p1

    .line 38
    new-array v2, v0, [I

    .line 39
    .line 40
    move v3, v1

    .line 41
    :goto_1
    if-ge v3, v0, :cond_3

    .line 42
    .line 43
    aput v1, v2, v3

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    invoke-interface {p2, p1, v2}, Lco/median/android/MainActivity$j;->a([Ljava/lang/String;[I)V

    .line 49
    .line 50
    .line 51
    :cond_4
    return-void
.end method

.method public R2(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, v0, Lo0/a;->m0:Z

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Lo0/a;->e()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p1, v2}, Lo0/j;->i(Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, p0, Lco/median/android/MainActivity;->S:Z

    .line 25
    .line 26
    iget-object v3, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Lco/median/android/r;->l(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v4, -0x1

    .line 34
    invoke-virtual {v1, v3, v4, v4}, Lco/median/android/r;->q(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lco/median/android/MainActivity;->e2()V

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Lm0/e;->z(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 50
    .line 51
    invoke-virtual {v3, p1, v2}, Lm0/e;->x(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v3, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lm0/W0;->m(Z)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 64
    .line 65
    iget-boolean v0, v0, Lo0/a;->W:Z

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Lm0/W0;->o(Z)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 71
    .line 72
    invoke-virtual {v0}, Lm0/W0;->q()LL1/t;

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v1, v0, v2}, Lco/median/android/r;->n(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-virtual {v1, v0}, Lco/median/android/r;->j(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lco/median/android/w;

    .line 85
    .line 86
    invoke-direct {v0, p0, p1, v1}, Lco/median/android/w;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Lco/median/android/r;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0}, Lco/median/android/r;->o(Lco/median/android/r$b;)V

    .line 90
    .line 91
    .line 92
    return v2

    .line 93
    :cond_2
    invoke-virtual {v1}, Lco/median/android/r;->d()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v1, p1}, Lco/median/android/r;->j(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lco/median/android/r;->k(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    return p1
.end method

.method public S1()Lco/median/android/MainActivity$l;
    .locals 1

    .line 1
    new-instance v0, Lco/median/android/MainActivity$l;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lco/median/android/MainActivity$l;-><init>(Lco/median/android/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public S2(Landroid/net/Uri;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Ln/a$a;

    .line 5
    .line 6
    invoke-direct {v0}, Ln/a$a;-><init>()V

    .line 7
    .line 8
    .line 9
    const v1, 0x7f060037

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ln/a$a;->c(I)Ln/a$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const v1, 0x7f0603d4

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Ln/a$a;->b(I)Ln/a$a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ln/a$a;->a()Ln/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ln/b$e;

    .line 36
    .line 37
    invoke-direct {v1}, Ln/b$e;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ln/b$e;->d(Ln/a;)Ln/b$e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ln/b$e;->a()Ln/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, v0, Ln/b;->a:Landroid/content/Intent;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lco/median/android/MainActivity;->q0:Lb/b;

    .line 54
    .line 55
    iget-object v0, v0, Ln/b;->a:Landroid/content/Intent;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lb/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    instance-of v1, v0, Landroid/content/ActivityNotFoundException;

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    const p1, 0x7f120025

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v3, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v2, v3, p1, v0, v1}, Lo0/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v2, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v4, "openAppBrowser: launchError - uri: "

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v1, v2, p1, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return-void
.end method

.method public T1()Lco/median/android/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->P:Lco/median/android/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public T2(Landroid/net/Uri;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v1, "android.intent.action.VIEW"

    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x10000000

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->g2(Landroid/net/Uri;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Lco/median/android/MainActivity;->F1()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :goto_1
    instance-of v1, v0, Landroid/content/ActivityNotFoundException;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const p1, 0x7f120025

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v2, v3, p1, v0, v1}, Lo0/f;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v4, "openExternalBrowser: launchError - uri: "

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v1, v2, p1, v0}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    return-void
.end method

.method public U2(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "WebView renderer crashed. Recreating WebView and reloading: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    new-instance v0, Lco/median/android/s;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lco/median/android/s;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p0}, Lco/median/android/D;->c(Lo0/h;Lco/median/android/MainActivity;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    .line 39
    .line 40
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iput-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 60
    .line 61
    :cond_2
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    :cond_3
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Lo0/a;->e()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :cond_4
    if-eqz p1, :cond_5

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 86
    .line 87
    invoke-interface {v0, p1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
.end method

.method public V1()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lco/median/android/r;->f(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public V2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const-string v1, "file:///android_asset/offline.html"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 18
    .line 19
    invoke-interface {v0}, Lo0/h;->canGoBack()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lco/median/android/MainActivity;->O1()Lco/median/android/s;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lco/median/android/s;->i()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 38
    .line 39
    invoke-interface {v1, v0}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->D3()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-object v1, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v1, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public W1()Lco/median/android/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lco/median/android/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public X1()Lo0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public X2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    .line 10
    .line 11
    iget-boolean v0, v0, Lo0/a;->d0:Z

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lco/median/android/widget/b;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public Y1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lco/median/android/s;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lco/median/android/MainActivity;->d2()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 16
    .line 17
    invoke-interface {v0}, Lo0/h;->goBack()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public Z2(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-static {p0}, Lm0/U;->b(Landroid/content/Context;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 10
    .line 11
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "isFirstLaunch"

    .line 20
    .line 21
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lo0/b;->c(Lo0/g;)Ljava/util/Map;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lco/median/android/MainActivity;->a3(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public a2(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 13
    .line 14
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 15
    .line 16
    new-instance v1, Lm0/A0;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1, v0}, Lm0/A0;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Lo0/b;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public a3(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p2, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lo0/h;->f(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    iget-object p2, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 13
    .line 14
    invoke-interface {p2, p1}, Lo0/h;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d2()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lo0/b;->u(Lo0/g;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v0, v0, Lo0/a;->z0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lco/median/android/MainActivity;->T:Z

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lco/median/android/widget/MedianProgressView;->f()V

    .line 25
    .line 26
    .line 27
    iget-boolean v0, p0, Lco/median/android/MainActivity;->W:Z

    .line 28
    .line 29
    const/high16 v1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lco/median/android/MainActivity;->I:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->I:Landroid/view/View;

    .line 40
    .line 41
    iget v2, p0, Lco/median/android/MainActivity;->V:F

    .line 42
    .line 43
    sub-float/2addr v1, v2

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 48
    .line 49
    invoke-direct {p0, v0, v1}, Lco/median/android/MainActivity;->v3(D)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public e3(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget v0, p0, Lco/median/android/MainActivity;->G0:F

    .line 8
    .line 9
    mul-float/2addr p1, v0

    .line 10
    iget v0, p0, Lco/median/android/MainActivity;->H0:F

    .line 11
    .line 12
    div-float/2addr p1, v0

    .line 13
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 14
    .line 15
    check-cast v0, Landroid/webkit/WebView;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->zoomBy(F)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f2(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->A0:Lm0/P0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lm0/P0;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public f3(Lco/median/android/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity;->s0:Lco/median/android/B;

    .line 2
    .line 3
    return-void
.end method

.method public g3(F)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/MainActivity;->G0:F

    .line 2
    .line 3
    return-void
.end method

.method public h3(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public i2()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->O:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public i3(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/app/Activity;->registerForContextMenu(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterForContextMenu(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public j2()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public j3(F)V
    .locals 0

    .line 1
    iput p1, p0, Lco/median/android/MainActivity;->H0:F

    .line 2
    .line 3
    return-void
.end method

.method public l1(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->H:Ljava/util/Stack;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->p1(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-wide v0, 0x3fd3333333333333L    # 0.3

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v0, v1}, Lco/median/android/MainActivity;->v3(D)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public l3(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/MainActivity;->o0:Z

    .line 2
    .line 3
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->V2()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/16 v1, 0x3e8

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lco/median/android/MainActivity;->A3(ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public m1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lo0/h;->canGoBack()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public m2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->S:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public n2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->o0:Z

    .line 2
    .line 3
    return v0
.end method

.method public n3(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lco/median/android/r;->p(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o2()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lco/median/android/r;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public o3()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v0, v1, v2

    .line 8
    .line 9
    const-string v0, "document.documentElement.setAttribute(\'data-color-scheme-option\', \'%s\');"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Lo0/h;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1
    const/16 v0, 0x4d2

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    if-eq p2, v1, :cond_7

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/h;->onActivityResult(IILandroid/content/Intent;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 20
    .line 21
    invoke-virtual {v0, p0, p1, p2, p3}, Lo0/b;->o(Lo0/g;IILandroid/content/Intent;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    const-string v2, "exit"

    .line 28
    .line 29
    invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 36
    .line 37
    .line 38
    :cond_1
    if-eqz p3, :cond_2

    .line 39
    .line 40
    const-string v2, "url"

    .line 41
    .line 42
    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "success"

    .line 47
    .line 48
    invoke-virtual {p3, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x0

    .line 54
    move v3, v0

    .line 55
    :goto_0
    const/16 v4, 0x12c

    .line 56
    .line 57
    if-ne p1, v4, :cond_4

    .line 58
    .line 59
    if-ne p2, v1, :cond_4

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iget-object v4, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 68
    .line 69
    invoke-interface {v4, v0}, Lo0/h;->setCheckLoginSignup(Z)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 73
    .line 74
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Lo0/a;->e()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v0, v4}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v0, v0, Lo0/a;->W:Z

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-direct {p0, v3}, Lco/median/android/MainActivity;->E3(Z)V

    .line 94
    .line 95
    .line 96
    :cond_4
    const/16 v0, 0x190

    .line 97
    .line 98
    if-ne p1, v0, :cond_7

    .line 99
    .line 100
    if-ne p2, v1, :cond_7

    .line 101
    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    const-string p1, "urlLevel"

    .line 105
    .line 106
    invoke-virtual {p3, p1, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p2, v0}, Lco/median/android/r;->e(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eq p1, v1, :cond_6

    .line 121
    .line 122
    if-eq p2, v1, :cond_6

    .line 123
    .line 124
    if-le p1, p2, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-virtual {p0, v1, p3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_6
    :goto_2
    const-string p1, "postLoadJavascript"

    .line 135
    .line 136
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p0, v2}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/d;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v0, v0, Lo0/a;->W:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lm0/W0;->p(Landroid/content/res/Configuration;)LL1/t;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lo0/b;->t(Lo0/g;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->I3(Landroid/content/res/Configuration;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lco/median/android/MainActivity;->C0:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->v1(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    const/4 v2, 0x2

    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lco/median/android/MainActivity;->C0:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->T2(Landroid/net/Uri;)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public onContextMenuClosed(Landroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onContextMenuClosed(Landroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
    const-string p1, ""

    .line 5
    .line 6
    iput-object p1, p0, Lco/median/android/MainActivity;->C0:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-static {p0}, Lco/median/android/DeviceLicenseManager;->checkLicense(Landroid/app/Activity;)V

    .line 1
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lco/median/android/GoNativeApplication;->j()Lco/median/android/r;

    move-result-object v2

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "isRoot"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lco/median/android/MainActivity;->S:Z

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v6, "source"

    invoke-virtual {v3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->x0:Ljava/lang/String;

    .line 6
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "default"

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lco/median/android/MainActivity;->x0:Ljava/lang/String;

    :goto_0
    iput-object v3, p0, Lco/median/android/MainActivity;->x0:Ljava/lang/String;

    .line 7
    iget-boolean v3, p0, Lco/median/android/MainActivity;->S:Z

    const/4 v6, 0x0

    if-eqz v3, :cond_3

    .line 8
    invoke-static {p0}, LG/g;->c(Landroid/app/Activity;)LG/g;

    move-result-object v3

    if-eqz p1, :cond_1

    .line 9
    const-string v7, "configurationChanged"

    .line 10
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_1

    :cond_1
    move v7, v6

    .line 11
    :goto_1
    iget-object v8, v0, Lo0/a;->Q0:Lo0/a$c;

    invoke-virtual {v8}, Lo0/a$c;->a()Z

    move-result v8

    if-eqz v8, :cond_2

    if-nez v7, :cond_2

    .line 12
    new-instance v7, Lm0/H0;

    invoke-direct {v7, p0, v1}, Lm0/H0;-><init>(Lco/median/android/MainActivity;Lco/median/android/GoNativeApplication;)V

    invoke-virtual {v3, v7}, LG/g;->e(LG/g$e;)V

    goto :goto_2

    .line 13
    :cond_2
    new-instance v7, Lm0/k0;

    invoke-direct {v7, p0}, Lm0/k0;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {v3, v7}, LG/g;->d(LG/g$d;)V

    .line 14
    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-direct {v3, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v7, Lm0/l0;

    invoke-direct {v7, p0}, Lm0/l0;-><init>(Lco/median/android/MainActivity;)V

    const-wide/16 v8, 0x1b58

    invoke-virtual {v3, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    :cond_3
    :goto_2
    new-instance v3, Lm0/Y0;

    invoke-direct {v3, p0}, Lm0/Y0;-><init>(Lco/median/android/MainActivity;)V

    iput-object v3, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    .line 16
    invoke-virtual {v3}, Lm0/Y0;->b()V

    .line 17
    iget-boolean v3, v0, Lo0/a;->h:Z

    if-eqz v3, :cond_4

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    const/16 v7, 0x80

    invoke-virtual {v3, v7}, Landroid/view/Window;->addFlags(I)V

    .line 19
    :cond_4
    iget v3, v0, Lo0/a;->A0:F

    iput v3, p0, Lco/median/android/MainActivity;->V:F

    .line 20
    invoke-static {p0}, Lm0/e1;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    .line 21
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1e

    if-gt v3, v7, :cond_7

    if-eqz p1, :cond_5

    .line 22
    const-string v7, "ignoreThemeSetup"

    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    goto :goto_3

    :cond_5
    move v7, v6

    :goto_3
    if-eqz v7, :cond_6

    .line 23
    sget-object v7, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    const-string v8, "onCreate: configuration change from setupAppTheme(), ignoring theme setup"

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 24
    :cond_6
    iget-object v7, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    invoke-static {v7}, Lm0/e1;->f(Ljava/lang/String;)V

    :cond_7
    :goto_4
    const/16 v7, 0x1a

    if-lt v3, v7, :cond_8

    const/4 v7, 0x4

    .line 25
    const-string v8, "fcm_default_channel"

    const-string v9, "General Notifications"

    invoke-static {v8, v9, v7}, Lm0/i0;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v7

    .line 26
    const-string v8, "Alerts from Admin"

    invoke-static {v7, v8}, Lm0/d0;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 27
    invoke-static {v7, v5}, Lm0/e0;->a(Landroid/app/NotificationChannel;Z)V

    .line 28
    invoke-static {v7, v5}, Lm0/f0;->a(Landroid/app/NotificationChannel;Z)V

    .line 29
    invoke-static {v7, v5}, Lm0/g0;->a(Landroid/app/NotificationChannel;Z)V

    .line 30
    const-class v8, Landroid/app/NotificationManager;

    invoke-virtual {p0, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/app/NotificationManager;

    if-eqz v8, :cond_8

    .line 31
    invoke-static {v8, v7}, Lm0/h0;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_8
    const/16 v7, 0x21

    if-lt v3, v7, :cond_9

    .line 32
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    invoke-static {p0, v3}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_9

    .line 33
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xc7

    invoke-static {p0, v3, v7}, Lx/b;->d(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 34
    :cond_9
    invoke-direct {p0}, Lco/median/android/MainActivity;->z1()V

    .line 35
    invoke-super {p0, p1}, Landroidx/fragment/app/h;->onCreate(Landroid/os/Bundle;)V

    .line 36
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v7, "urlLevel"

    const/4 v8, -0x1

    invoke-virtual {v3, v7, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 38
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v9

    const-string v10, "parentUrlLevel"

    invoke-virtual {v9, v10, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    if-eqz p1, :cond_a

    .line 39
    const-string v9, "activityId"

    iget-object v11, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    invoke-virtual {p1, v9, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 40
    iget-boolean v9, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {p1, v4, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    .line 41
    invoke-virtual {p1, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 42
    invoke-virtual {p1, v10, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    .line 43
    :cond_a
    iget-object v4, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    iget-boolean v7, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v2, v4, v7}, Lco/median/android/r;->b(Ljava/lang/String;Z)V

    .line 44
    iget-object v4, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    invoke-virtual {v2, v4, v3, v8}, Lco/median/android/r;->q(Ljava/lang/String;II)V

    .line 45
    iget-boolean v3, v0, Lo0/a;->g1:Z

    if-eqz v3, :cond_b

    .line 46
    iget-object v3, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 47
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v7, "ignoreInterceptMaxWindows"

    invoke-virtual {v4, v7, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 48
    invoke-virtual {v2, v3, v4}, Lco/median/android/r;->n(Ljava/lang/String;Z)V

    .line 49
    :cond_b
    iget-boolean v2, p0, Lco/median/android/MainActivity;->S:Z

    if-eqz v2, :cond_c

    .line 50
    invoke-direct {p0}, Lco/median/android/MainActivity;->e2()V

    .line 51
    :cond_c
    invoke-virtual {v1}, Lco/median/android/GoNativeApplication;->f()Lco/median/android/u;

    move-result-object v2

    iput-object v2, p0, Lco/median/android/MainActivity;->b0:Lco/median/android/u;

    .line 52
    new-instance v2, Lco/median/android/g;

    invoke-direct {v2, p0}, Lco/median/android/g;-><init>(Lco/median/android/MainActivity;)V

    iput-object v2, p0, Lco/median/android/MainActivity;->a0:Lco/median/android/g;

    .line 53
    new-instance v2, Lco/median/android/d;

    invoke-direct {v2, p0}, Lco/median/android/d;-><init>(Lco/median/android/MainActivity;)V

    iput-object v2, p0, Lco/median/android/MainActivity;->Z:Lco/median/android/d;

    .line 54
    new-instance v2, Lm0/P0;

    invoke-direct {v2, p0}, Lm0/P0;-><init>(Lo0/g;)V

    iput-object v2, p0, Lco/median/android/MainActivity;->A0:Lm0/P0;

    .line 55
    new-instance v2, Lc/c;

    invoke-direct {v2}, Lc/c;-><init>()V

    new-instance v3, Lm0/m0;

    invoke-direct {v3, p0}, Lm0/m0;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {p0, v2, v3}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    move-result-object v2

    iput-object v2, p0, Lco/median/android/MainActivity;->p0:Lb/b;

    .line 56
    new-instance v2, Lc/d;

    invoke-direct {v2}, Lc/d;-><init>()V

    new-instance v3, Lm0/n0;

    invoke-direct {v3, p0}, Lm0/n0;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {p0, v2, v3}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    move-result-object v2

    iput-object v2, p0, Lco/median/android/MainActivity;->q0:Lb/b;

    .line 57
    new-instance v2, Lm0/A;

    invoke-direct {v2}, Lm0/A;-><init>()V

    new-instance v3, Lm0/I0;

    invoke-direct {v3, p0}, Lm0/I0;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {p0, v2, v3}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    move-result-object v2

    iput-object v2, p0, Lco/median/android/MainActivity;->r0:Lb/b;

    .line 58
    new-instance v2, Lco/median/android/t;

    invoke-direct {v2, p0}, Lco/median/android/t;-><init>(Landroid/app/Activity;)V

    iput-object v2, p0, Lco/median/android/MainActivity;->j0:Lco/median/android/t;

    .line 59
    invoke-virtual {v1}, Lco/median/android/GoNativeApplication;->h()Lm0/o1;

    move-result-object v2

    invoke-virtual {v2, p0}, Lm0/o1;->m(Landroid/app/Activity;)V

    .line 60
    const-string v2, "connectivity"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    iput-object v2, p0, Lco/median/android/MainActivity;->O:Landroid/net/ConnectivityManager;

    const v2, 0x7f0c001c

    .line 61
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/d;->setContentView(I)V

    .line 62
    iget-object v2, v1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    iget-boolean v3, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v2, p0, v3}, Lo0/b;->k(Lo0/g;Z)V

    const v2, 0x1020002

    .line 63
    invoke-virtual {p0, v2}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 64
    iget-object v3, p0, Lco/median/android/MainActivity;->F0:Lm0/Y0;

    invoke-virtual {v3, v2}, Lm0/Y0;->i(Landroid/view/ViewGroup;)V

    .line 65
    iget-boolean v3, v0, Lo0/a;->p:Z

    if-eqz v3, :cond_d

    .line 66
    invoke-virtual {p0, v5}, Lco/median/android/MainActivity;->C3(Z)V

    .line 67
    :cond_d
    invoke-direct {p0}, Lco/median/android/MainActivity;->m3()V

    const v3, 0x7f0900dd

    .line 68
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    iput-object v3, p0, Lco/median/android/MainActivity;->N:Landroid/widget/RelativeLayout;

    const v3, 0x7f0901e9

    .line 69
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/median/android/MySwipeRefreshLayout;

    iput-object v3, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    .line 70
    iget-boolean v4, v0, Lo0/a;->d0:Z

    invoke-virtual {v3, v4}, Lco/median/android/widget/b;->setEnabled(Z)V

    .line 71
    iget-object v3, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    invoke-virtual {v3, p0}, Lco/median/android/widget/b;->setOnRefreshListener(Lco/median/android/widget/b$j;)V

    .line 72
    iget-object v3, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    new-instance v4, Lm0/J0;

    invoke-direct {v4, p0}, Lm0/J0;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {v3, v4}, Lco/median/android/MySwipeRefreshLayout;->setCanChildScrollUpCallback(Lco/median/android/MySwipeRefreshLayout$a;)V

    .line 73
    invoke-virtual {v0}, Lo0/a;->i()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 74
    iput-boolean v6, v0, Lo0/a;->f0:Z

    :cond_e
    const v3, 0x7f0901e8

    .line 75
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/median/android/widget/SwipeHistoryNavigationLayout;

    iput-object v3, p0, Lco/median/android/MainActivity;->M:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 76
    iget-boolean v4, v0, Lo0/a;->f0:Z

    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 77
    iget-object v3, p0, Lco/median/android/MainActivity;->M:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    new-instance v4, Lco/median/android/MainActivity$d;

    invoke-direct {v4, p0, v0}, Lco/median/android/MainActivity$d;-><init>(Lco/median/android/MainActivity;Lo0/a;)V

    invoke-virtual {v3, v4}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->setSwipeNavListener(Lco/median/android/widget/SwipeHistoryNavigationLayout$a;)V

    .line 78
    iget-object v3, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    const v4, 0x7f0603ba

    invoke-static {p0, v4}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    move-result v7

    filled-new-array {v7}, [I

    move-result-object v7

    invoke-virtual {v3, v7}, Lco/median/android/widget/b;->setColorSchemeColors([I)V

    .line 79
    iget-object v3, p0, Lco/median/android/MainActivity;->M:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    invoke-static {p0, v4}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->setActiveColor(I)V

    .line 80
    iget-object v3, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    const v4, 0x7f0603c8

    .line 81
    invoke-static {p0, v4}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v3, v7}, Lco/median/android/widget/b;->setProgressBackgroundColorSchemeColor(I)V

    .line 82
    iget-object v3, p0, Lco/median/android/MainActivity;->M:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    invoke-static {p0, v4}, Landroidx/core/content/b;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    const v3, 0x7f090194

    .line 83
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/median/android/widget/MedianProgressView;

    iput-object v3, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    .line 84
    iget-object v3, v1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    invoke-virtual {v3, p0}, Lo0/b;->f(Lo0/g;)Lp0/a;

    .line 85
    iget-object v3, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    invoke-virtual {v3}, Lco/median/android/widget/MedianProgressView;->e()V

    .line 86
    new-instance v3, Lm0/r1;

    invoke-direct {v3}, Lm0/r1;-><init>()V

    invoke-static {v3}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 87
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "postLoadJavascript"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 88
    const-string v3, "_median_push"

    invoke-virtual {p0, v3, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "fcm_token"

    const-string v7, ""

    invoke-interface {v3, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 89
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "javascript:(function() {  var attempts = 0;  var interval = setInterval(function() {    if (typeof saveTokenToDatabase === \'function\') {      saveTokenToDatabase(\'"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\');      clearInterval(interval);      console.log(\'FCM Token injected\');    } else {      attempts++;      if (attempts >= 10) clearInterval(interval);    }  }, 1000);})()"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 91
    iget-object v4, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    if-nez v4, :cond_f

    .line 92
    iput-object v3, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    goto :goto_5

    .line 93
    :cond_f
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ";"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 94
    :cond_10
    :goto_5
    iget-object v3, p0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    iput-object v3, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 95
    new-instance v3, Ljava/util/Stack;

    invoke-direct {v3}, Ljava/util/Stack;-><init>()V

    iput-object v3, p0, Lco/median/android/MainActivity;->i0:Ljava/util/Stack;

    .line 96
    new-instance v3, Lco/median/android/z;

    const v4, 0x7f09006c

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-direct {v3, p0, v4}, Lco/median/android/z;-><init>(Lco/median/android/MainActivity;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V

    iput-object v3, p0, Lco/median/android/MainActivity;->P:Lco/median/android/z;

    .line 97
    invoke-virtual {v3, v6}, Lco/median/android/z;->q(Z)V

    .line 98
    new-instance v3, Lm0/e;

    invoke-direct {v3, p0}, Lm0/e;-><init>(Lco/median/android/MainActivity;)V

    iput-object v3, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 99
    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v3, v4}, Lm0/e;->z(Z)V

    .line 100
    new-instance v3, Lm0/W0;

    invoke-direct {v3, p0}, Lm0/W0;-><init>(Lco/median/android/MainActivity;)V

    iput-object v3, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 101
    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v3, v4}, Lm0/W0;->m(Z)V

    .line 102
    iget-boolean v3, v0, Lo0/a;->x0:Z

    if-nez v3, :cond_11

    iget-boolean v3, v0, Lo0/a;->W:Z

    if-nez v3, :cond_11

    .line 103
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->k0()Landroidx/appcompat/app/a;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Landroidx/appcompat/app/a;->l()V

    :cond_11
    const v3, 0x7f090233

    .line 104
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->I:Landroid/view/View;

    const v3, 0x7f090232

    .line 105
    invoke-virtual {p0, v3}, Landroidx/appcompat/app/d;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/median/android/widget/WebViewContainerView;

    iput-object v3, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    .line 106
    invoke-virtual {v3}, Lco/median/android/widget/WebViewContainerView;->getWebview()Lo0/h;

    move-result-object v3

    iput-object v3, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 107
    new-instance v3, Lco/median/android/A;

    iget-boolean v4, v0, Lo0/a;->n:Z

    xor-int/2addr v4, v5

    invoke-direct {v3, p0, v4}, Lco/median/android/A;-><init>(Lco/median/android/MainActivity;Z)V

    iput-object v3, p0, Lco/median/android/MainActivity;->D0:Lco/median/android/A;

    .line 108
    iget-object v3, p0, Lco/median/android/MainActivity;->E:Lco/median/android/widget/WebViewContainerView;

    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v3, p0, v4}, Lco/median/android/widget/WebViewContainerView;->b(Lco/median/android/MainActivity;Z)V

    .line 109
    iget-object v3, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    invoke-direct {p0, v3}, Lco/median/android/MainActivity;->r3(Ljava/lang/String;)V

    .line 110
    iget-object v3, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    instance-of v4, v3, Landroid/webkit/WebView;

    if-eqz v4, :cond_12

    .line 111
    check-cast v3, Landroid/webkit/WebView;

    new-instance v4, Lco/median/android/MainActivity$m;

    invoke-direct {v4, p0}, Lco/median/android/MainActivity$m;-><init>(Lco/median/android/MainActivity;)V

    const-string v7, "AndroidInterface"

    invoke-virtual {v3, v4, v7}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_12
    if-eqz p1, :cond_14

    .line 112
    const-string v3, "webViewState"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_13

    .line 113
    iget-object v4, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    invoke-interface {v4, v3}, Lo0/h;->e(Landroid/os/Bundle;)V

    move v3, v5

    goto :goto_6

    :cond_13
    move v3, v6

    .line 114
    :goto_6
    const-string v4, "scrollX"

    invoke-virtual {p1, v4, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 115
    const-string v7, "scrollY"

    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 116
    iget-object v7, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    invoke-interface {v7, v4, p1}, Lo0/h;->scrollTo(II)V

    goto :goto_7

    :cond_14
    move v3, v6

    :goto_7
    const/4 p1, 0x0

    if-eqz v3, :cond_15

    .line 117
    iget-object v3, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    invoke-interface {v3}, Lo0/h;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_15

    .line 118
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    invoke-interface {v1}, Lo0/h;->getUrl()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_d

    .line 119
    :cond_15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-direct {p0, v3}, Lco/median/android/MainActivity;->b2(Landroid/content/Intent;)Z

    move-result v3

    if-eqz v3, :cond_16

    .line 120
    iget-object v3, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    goto :goto_9

    .line 121
    :cond_16
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "url"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 122
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_17
    move-object v3, p1

    :goto_8
    if-nez v3, :cond_1a

    .line 123
    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    if-eqz v4, :cond_1a

    .line 124
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    move-result-object v3

    invoke-virtual {v3}, Lo0/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_18

    .line 125
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    move-result-object v3

    invoke-virtual {v3}, Lo0/a;->e()Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    .line 126
    :cond_18
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    move-result-object v3

    iget-object v3, v3, Lo0/a;->c:Ljava/lang/String;

    if-eqz v3, :cond_19

    .line 127
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://median.co/share/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    move-result-object v4

    iget-object v4, v4, Lo0/a;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    .line 128
    :cond_19
    const-string v3, "https://median.co/"

    :cond_1a
    :goto_9
    if-eqz v3, :cond_1d

    .line 129
    iget-object v1, v1, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    iget-boolean v4, p0, Lco/median/android/MainActivity;->S:Z

    invoke-virtual {v1, p0, v4}, Lo0/b;->d(Lo0/g;Z)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_1c

    .line 130
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1c

    .line 131
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    .line 132
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 133
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v7, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_a

    .line 134
    :cond_1b
    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_1c
    move-object v1, v3

    .line 135
    :goto_b
    iput-object v1, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 136
    iget-object v3, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    if-eqz v3, :cond_1f

    .line 137
    sget-object v3, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Fetching dynamic route for URL: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    invoke-direct {p0, v1}, Lco/median/android/MainActivity;->A1(Ljava/lang/String;)V

    goto :goto_d

    .line 139
    :cond_1d
    invoke-virtual {p0}, Lco/median/android/MainActivity;->j2()Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_c

    .line 140
    :cond_1e
    invoke-static {}, Lo0/f;->b()Lo0/f;

    move-result-object v1

    sget-object v4, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    const-string v7, "No url specified for MainActivity"

    invoke-virtual {v1, v4, v7}, Lo0/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    move-object v1, v3

    .line 141
    :cond_1f
    :goto_d
    invoke-virtual {p0, v6}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 142
    const-string v4, "undefinedUrl"

    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 143
    iput-object p1, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 144
    :cond_20
    invoke-direct {p0}, Lco/median/android/MainActivity;->q3()V

    .line 145
    iget-object p1, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    invoke-virtual {p1, v1, v5}, Lm0/e;->x(Ljava/lang/String;Z)V

    .line 146
    iget-object p1, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    iget-boolean v1, p0, Lco/median/android/MainActivity;->S:Z

    if-eqz v1, :cond_21

    iget-boolean v1, v0, Lo0/a;->W:Z

    if-eqz v1, :cond_21

    move v6, v5

    :cond_21
    invoke-virtual {p1, v6}, Lm0/W0;->o(Z)V

    .line 147
    new-instance p1, Lm0/X;

    invoke-direct {p1, p0, v2}, Lm0/X;-><init>(Lco/median/android/MainActivity;Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lco/median/android/MainActivity;->e0:Lm0/X;

    .line 148
    new-instance p1, Lco/median/android/MainActivity$e;

    invoke-direct {p1, p0}, Lco/median/android/MainActivity$e;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {v0, p1}, Lo0/a;->a(Lo0/d$a;)V

    .line 149
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    move-result-object p1

    new-instance v1, Lco/median/android/v;

    invoke-direct {v1, p0}, Lco/median/android/v;-><init>(Lco/median/android/MainActivity;)V

    invoke-virtual {p1, v1}, Lco/median/android/r;->a(Lco/median/android/r$c;)V

    .line 150
    invoke-direct {p0}, Lco/median/android/MainActivity;->L3()V

    .line 151
    iget-boolean p1, v0, Lo0/a;->S0:Z

    if-eqz p1, :cond_22

    .line 152
    invoke-direct {p0}, Lco/median/android/MainActivity;->W2()V

    .line 153
    :cond_22
    iget-object p1, v0, Lo0/a;->Y0:Lq0/c;

    invoke-virtual {p1}, Lq0/c;->a()Z

    move-result p1

    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->i3(Z)V

    .line 154
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object p1

    new-instance v0, Lco/median/android/MainActivity$f;

    invoke-direct {v0, p0, v5}, Lco/median/android/MainActivity$f;-><init>(Lco/median/android/MainActivity;Z)V

    invoke-virtual {p1, v0}, Landroidx/activity/OnBackPressedDispatcher;->h(Landroidx/activity/F;)V

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 5
    .line 6
    invoke-interface {p2}, Lo0/h;->getHitTestResult()Landroid/webkit/WebView$HitTestResult;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Landroid/webkit/WebView$HitTestResult;->getExtra()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-virtual {p2}, Landroid/webkit/WebView$HitTestResult;->getType()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x7

    .line 25
    if-eq p2, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object p3, p0, Lco/median/android/MainActivity;->C0:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lco/median/android/MainActivity;->C0:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, p2}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object p2, p2, Lo0/a;->Y0:Lq0/c;

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p2}, Lq0/c;->a()Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p2}, Lq0/c;->b()Lq0/c$a;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-virtual {p3}, Lq0/c$a;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-nez p3, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p2}, Lq0/c;->b()Lq0/c$a;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {p3}, Lq0/c$a;->a()Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    const/4 v0, 0x0

    .line 72
    if-eqz p3, :cond_2

    .line 73
    .line 74
    const/4 p3, 0x1

    .line 75
    const v1, 0x7f12001c

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0, p3, v0, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {p2}, Lq0/c;->b()Lq0/c$a;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p2}, Lq0/c$a;->c()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_3

    .line 90
    .line 91
    const/4 p2, 0x2

    .line 92
    const p3, 0x7f12001d

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v0, p2, v0, p3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getMenuInflater()Landroid/view/MenuInflater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x7f0e0000

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lm0/e;->g(Landroid/view/Menu;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 p1, 0x1

    .line 18
    return p1
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/d;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Lo0/b;->l(Lo0/g;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lco/median/android/GoNativeApplication;->j()Lco/median/android/r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lco/median/android/r;->k(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lco/median/android/d;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lco/median/android/d;->H()V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Lo0/h;->stopLoading()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 37
    .line 38
    invoke-interface {v0}, Lo0/h;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 47
    .line 48
    check-cast v1, Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->G:Z

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 58
    .line 59
    invoke-interface {v0}, Lo0/h;->destroy()V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lco/median/android/u;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/util/Observable;->deleteObserver(Ljava/util/Observer;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x21

    .line 8
    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lco/median/android/MainActivity;->Q2()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lo0/b;->v(ILandroid/view/KeyEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/d;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->k2(Landroid/location/Location;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Spoofed Location Detected! Coordinates: "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, ", "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    new-instance p1, Lm0/o0;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lm0/o0;-><init>(Lco/median/android/MainActivity;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    const-string p1, "location"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroid/location/LocationManager;

    .line 60
    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->c2(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->U1(Landroid/content/Intent;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 20
    .line 21
    invoke-interface {p1}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->N2(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lco/median/android/MainActivity;->J:Ljava/lang/String;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 38
    .line 39
    invoke-interface {p1}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, v0, p1}, Lco/median/android/MainActivity;->J3(Ljava/lang/String;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Lco/median/android/MainActivity;->D0:Lco/median/android/A;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {p1, v0, v1}, Lco/median/android/A;->d(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :cond_2
    sget-object v0, Lco/median/android/MainActivity;->I0:Ljava/lang/String;

    .line 57
    .line 58
    const-string v1, "Received intent without url"

    .line 59
    .line 60
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 68
    .line 69
    invoke-virtual {v0, p0, p1}, Lo0/b;->m(Lo0/g;Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lm0/W0;->i(Landroid/view/MenuItem;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v2, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne v0, v2, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lm0/e;->l()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 34
    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Lo0/b;->n(Lo0/g;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lco/median/android/MainActivity;->D:Z

    .line 15
    .line 16
    invoke-direct {p0}, Lco/median/android/MainActivity;->z3()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Lo0/b;->A()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 32
    .line 33
    invoke-interface {v0}, Lo0/h;->onPause()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->d0:Lco/median/android/MainActivity$i;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/d;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    iget-boolean v1, p0, Lco/median/android/MainActivity;->S:Z

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1, v1}, Lo0/b;->x(Lo0/g;Landroid/os/Bundle;Z)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lm0/W0;->q()LL1/t;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/h;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p0, p1, p2, p3}, Lo0/b;->y(Lo0/g;I[Ljava/lang/String;[I)V

    .line 11
    .line 12
    .line 13
    const/16 v0, 0xc7

    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    iget-object p1, p0, Lco/median/android/MainActivity;->k0:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lco/median/android/MainActivity$k;

    .line 35
    .line 36
    iget-object v1, v0, Lco/median/android/MainActivity$k;->a:[Ljava/lang/String;

    .line 37
    .line 38
    array-length v1, v1

    .line 39
    array-length v2, p2

    .line 40
    if-eq v1, v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    :goto_1
    iget-object v2, v0, Lco/median/android/MainActivity$k;->a:[Ljava/lang/String;

    .line 45
    .line 46
    array-length v3, v2

    .line 47
    if-ge v1, v3, :cond_3

    .line 48
    .line 49
    array-length v3, p2

    .line 50
    if-ge v1, v3, :cond_3

    .line 51
    .line 52
    aget-object v2, v2, v1

    .line 53
    .line 54
    aget-object v3, p2, v1

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v0, v0, Lco/median/android/MainActivity$k;->b:Lco/median/android/MainActivity$j;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-interface {v0, p2, p3}, Lco/median/android/MainActivity$j;->a([Ljava/lang/String;[I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    iget-object p1, p0, Lco/median/android/MainActivity;->k0:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    iget-object p1, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-lez p1, :cond_6

    .line 92
    .line 93
    iget-object p1, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_6

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Landroid/content/Intent;

    .line 110
    .line 111
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    :goto_3
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/h;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lco/median/android/MainActivity;->t1()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lco/median/android/MainActivity;->o1()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lco/median/android/MainActivity;->y3()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lco/median/android/r;->m(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lco/median/android/GoNativeApplication;->o(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lo0/b;->p(Lo0/g;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-interface {v0}, Lo0/h;->onResume()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-boolean v2, p0, Lco/median/android/MainActivity;->D:Z

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iput-boolean v1, p0, Lco/median/android/MainActivity;->D:Z

    .line 52
    .line 53
    iget-boolean v0, v0, Lo0/a;->n:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const-string v0, "median_app_resumed"

    .line 58
    .line 59
    invoke-static {v0, v3}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "gonative_app_resumed"

    .line 67
    .line 68
    invoke-static {v0, v3}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-string v0, "_median_app_resumed"

    .line 77
    .line 78
    invoke-static {v0, v3}, Lo0/j;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_0
    invoke-direct {p0}, Lco/median/android/MainActivity;->Y2()V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lco/median/android/MainActivity$i;

    .line 89
    .line 90
    invoke-direct {v0, p0, v3}, Lco/median/android/MainActivity$i;-><init>(Lco/median/android/MainActivity;Lm0/N0;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lco/median/android/MainActivity;->d0:Lco/median/android/MainActivity$i;

    .line 94
    .line 95
    new-instance v1, Landroid/content/IntentFilter;

    .line 96
    .line 97
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 98
    .line 99
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lco/median/android/u;

    .line 106
    .line 107
    invoke-virtual {v0}, Lco/median/android/u;->g()V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lco/median/android/d;

    .line 111
    .line 112
    invoke-virtual {v0}, Lco/median/android/d;->A()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "configurationChanged"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 17
    .line 18
    invoke-interface {v2, v0}, Lo0/h;->c(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "webViewState"

    .line 22
    .line 23
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "activityId"

    .line 27
    .line 28
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lco/median/android/r;->i(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const-string v2, "isRoot"

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lco/median/android/r;->f(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const-string v2, "urlLevel"

    .line 59
    .line 60
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lco/median/android/MainActivity;->M1()Lco/median/android/r;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lco/median/android/r;->e(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const-string v2, "parentUrlLevel"

    .line 74
    .line 75
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 79
    .line 80
    invoke-interface {v0}, Lo0/h;->getWebViewScrollX()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const-string v2, "scrollX"

    .line 85
    .line 86
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 90
    .line 91
    invoke-interface {v0}, Lo0/h;->getWebViewScrollY()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    const-string v2, "scrollY"

    .line 96
    .line 97
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    :cond_0
    iget-boolean v0, p0, Lco/median/android/MainActivity;->u0:Z

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    const-string v0, "ignoreThemeSetup"

    .line 105
    .line 106
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->D1(Landroid/os/Bundle;)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const v1, 0x7d000

    .line 114
    .line 115
    .line 116
    if-le v0, v1, :cond_2

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/os/Bundle;->clear()V

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/d;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lo0/b;->q(Lo0/g;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lo0/a;->V0:Lq0/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Lq0/d;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Lm0/o;->d(Lco/median/android/MainActivity;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const-string v0, "location"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/location/LocationManager;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/d;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L1()Lco/median/android/GoNativeApplication;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->l:Lo0/b;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lo0/b;->r(Lo0/g;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lco/median/android/MainActivity;->S:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-boolean v0, v0, Lo0/a;->L:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-interface {v0, v1}, Lo0/h;->clearCache(Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const-string v0, "location"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/location/LocationManager;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public p1(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lco/median/android/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lco/median/android/d;->t()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, p1, v1}, Lm0/e;->x(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->P:Lco/median/android/z;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lco/median/android/z;->f(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lm0/e;->m(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lco/median/android/MainActivity;->c0:Lco/median/android/y;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lco/median/android/y;->d(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lm0/W0;->c(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_5
    :goto_0
    return-void
.end method

.method public p3(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2}, Lm0/e;->x(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public q1(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->P:Lco/median/android/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lco/median/android/z;->e(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lm0/W0;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lm0/W0;->d(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public r1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "if (median_status_checker && typeof median_status_checker.onReadyState === \'function\') median_status_checker.onReadyState(document.readyState);"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lo0/h;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public s3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v2, Ljava/net/URI;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :catch_0
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    new-instance p2, Landroid/content/Intent;

    .line 77
    .line 78
    const-string v0, "android.intent.action.SEND"

    .line 79
    .line 80
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "text/plain"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const-string v0, "android.intent.extra.TEXT"

    .line 89
    .line 90
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    const p1, 0x7f120021

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p2, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lm0/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm0/e;->w(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public u1()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lm0/u0;

    .line 6
    .line 7
    invoke-direct {v1}, Lm0/u0;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v2, Lm0/v0;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lm0/v0;-><init>(Landroid/webkit/CookieManager;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public u3()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/MainActivity;->W:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lco/median/android/MainActivity;->f0:Z

    .line 5
    .line 6
    iget-boolean v1, p0, Lco/median/android/MainActivity;->T:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    .line 11
    .line 12
    invoke-virtual {v0}, Lco/median/android/widget/MedianProgressView;->d()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-boolean v0, p0, Lco/median/android/MainActivity;->T:Z

    .line 17
    .line 18
    iget-object v0, p0, Lco/median/android/MainActivity;->I:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-wide/16 v1, 0x12c

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-wide/16 v1, 0x96

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    .line 41
    .line 42
    invoke-virtual {v0}, Lco/median/android/widget/MedianProgressView;->b()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 0

    .line 1
    instance-of p2, p1, Lco/median/android/u;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    check-cast p1, Lco/median/android/u;

    .line 6
    .line 7
    invoke-virtual {p1}, Lco/median/android/u;->h()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-direct {p0, p1}, Lco/median/android/MainActivity;->E3(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public v1(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "clipboard"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/ClipboardManager;

    .line 15
    .line 16
    const-string v1, "copy"

    .line 17
    .line 18
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public w1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lm0/W0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm0/W0;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w3()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/MainActivity;->W:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lco/median/android/MainActivity;->T:Z

    .line 5
    .line 6
    iput-boolean v0, p0, Lco/median/android/MainActivity;->f0:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lco/median/android/MainActivity;->z3()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lco/median/android/MainActivity;->I:Landroid/view/View;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lco/median/android/MainActivity;->K:Lco/median/android/widget/MedianProgressView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lco/median/android/widget/MedianProgressView;->d()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public x3()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Y:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->L:Lco/median/android/MySwipeRefreshLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lco/median/android/widget/b;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method
