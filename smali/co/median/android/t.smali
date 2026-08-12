.class public final Lco/median/android/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/t$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:J

.field private c:Lco/median/android/t$a;

.field private final d:Lb/b;

.field private final e:Lb/b;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 10
    .line 11
    const-wide/16 v0, 0x3e8

    .line 12
    .line 13
    iput-wide v0, p0, Lco/median/android/t;->b:J

    .line 14
    .line 15
    const-string v0, "null cannot be cast to non-null type androidx.activity.ComponentActivity"

    .line 16
    .line 17
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Landroidx/activity/ComponentActivity;

    .line 22
    .line 23
    new-instance v2, Lc/b;

    .line 24
    .line 25
    invoke-direct {v2}, Lc/b;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lm0/Y;

    .line 29
    .line 30
    invoke-direct {v3, p0}, Lm0/Y;-><init>(Lco/median/android/t;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lco/median/android/t;->d:Lb/b;

    .line 38
    .line 39
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Landroidx/activity/ComponentActivity;

    .line 43
    .line 44
    new-instance v0, Lc/e;

    .line 45
    .line 46
    invoke-direct {v0}, Lc/e;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lm0/Z;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lm0/Z;-><init>(Lco/median/android/t;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0, v1}, Landroidx/activity/ComponentActivity;->W(Lc/a;Lb/a;)Lb/b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lco/median/android/t;->e:Lb/b;

    .line 59
    .line 60
    return-void
.end method

.method public static synthetic a(LW1/l;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/t;->j(LW1/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lco/median/android/t;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/t;->m(Lco/median/android/t;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lco/median/android/t;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/t;->k(Lco/median/android/t;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lco/median/android/t;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/t;->l(Lco/median/android/t;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic e(Lco/median/android/t;Lcom/google/android/gms/location/LocationSettingsResponse;)LL1/t;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lco/median/android/t;->i(Lco/median/android/t;Lcom/google/android/gms/location/LocationSettingsResponse;)LL1/t;

    move-result-object p0

    return-object p0
.end method

.method private final f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 2
    .line 3
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 10
    .line 11
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 12
    .line 13
    invoke-static {v1, v2}, Landroidx/core/content/b;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private static final i(Lco/median/android/t;Lcom/google/android/gms/location/LocationSettingsResponse;)LL1/t;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/t;->c:Lco/median/android/t$a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-interface {p0, p1}, Lco/median/android/t$a;->a(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, LL1/t;->a:LL1/t;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final j(LW1/l;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LW1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k(Lco/median/android/t;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroidx/activity/result/IntentSenderRequest$a;

    .line 11
    .line 12
    check-cast p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/ResolvableApiException;->getResolution()Landroid/app/PendingIntent;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v1, "getResolution(...)"

    .line 19
    .line 20
    invoke-static {p1, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1}, Landroidx/activity/result/IntentSenderRequest$a;-><init>(Landroid/app/PendingIntent;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/activity/result/IntentSenderRequest$a;->a()Landroidx/activity/result/IntentSenderRequest;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p0, p0, Lco/median/android/t;->e:Lb/b;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method private static final l(Lco/median/android/t;Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, -0x1

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lco/median/android/t;->c:Lco/median/android/t$a;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-interface {p0, p1}, Lco/median/android/t$a;->a(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p0, p0, Lco/median/android/t;->c:Lco/median/android/t$a;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-interface {p0, p1}, Lco/median/android/t$a;->a(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private static final m(Lco/median/android/t;Ljava/util/Map;)V
    .locals 3

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p1, v1

    .line 39
    :goto_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lco/median/android/t;->g()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    iget-object p0, p0, Lco/median/android/t;->c:Lco/median/android/t$a;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    invoke-interface {p0, v1}, Lco/median/android/t$a;->a(Z)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method private final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 2
    .line 3
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx/b;->e(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 12
    .line 13
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lx/b;->e(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 24
    .line 25
    const v1, 0x7f1200ea

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lco/median/android/t;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lco/median/android/t;->n()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/t;->d:Lb/b;

    .line 11
    .line 12
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 13
    .line 14
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 15
    .line 16
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Lcom/google/android/gms/location/LocationRequest$Builder;

    .line 25
    .line 26
    const/16 v1, 0x64

    .line 27
    .line 28
    iget-wide v2, p0, Lco/median/android/t;->b:J

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/location/LocationRequest$Builder;-><init>(IJ)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest$Builder;->build()Lcom/google/android/gms/location/LocationRequest;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "build(...)"

    .line 38
    .line 39
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 43
    .line 44
    invoke-direct {v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->addLocationRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "addLocationRequest(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lco/median/android/t;->a:Landroid/app/Activity;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/android/gms/location/LocationServices;->getSettingsClient(Landroid/app/Activity;)Lcom/google/android/gms/location/SettingsClient;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "getSettingsClient(...)"

    .line 63
    .line 64
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->build()Lcom/google/android/gms/location/LocationSettingsRequest;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v1, v0}, Lcom/google/android/gms/location/SettingsClient;->checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "checkLocationSettings(...)"

    .line 76
    .line 77
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lm0/a0;

    .line 81
    .line 82
    invoke-direct {v1, p0}, Lm0/a0;-><init>(Lco/median/android/t;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lm0/b0;

    .line 86
    .line 87
    invoke-direct {v2, v1}, Lm0/b0;-><init>(LW1/l;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 91
    .line 92
    .line 93
    new-instance v1, Lm0/c0;

    .line 94
    .line 95
    invoke-direct {v1, p0}, Lm0/c0;-><init>(Lco/median/android/t;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final h(Lco/median/android/t$a;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lco/median/android/t;->c:Lco/median/android/t$a;

    .line 7
    .line 8
    invoke-virtual {p0}, Lco/median/android/t;->g()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
