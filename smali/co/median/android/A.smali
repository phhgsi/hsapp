.class public final Lco/median/android/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/A$a;
    }
.end annotation


# static fields
.field public static final f:Lco/median/android/A$a;


# instance fields
.field private final a:Lco/median/android/MainActivity;

.field private final b:Z

.field private final c:Lo0/h;

.field public d:Lco/median/android/B;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/median/android/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/median/android/A$a;-><init>(LX1/g;)V

    sput-object v0, Lco/median/android/A;->f:Lco/median/android/A$a;

    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;Z)V
    .locals 1

    .line 1
    const-string v0, "mainActivity"

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
    iput-object p1, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    iput-boolean p2, p0, Lco/median/android/A;->b:Z

    .line 12
    .line 13
    invoke-virtual {p1}, Lco/median/android/MainActivity;->X1()Lo0/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string p2, "getWebView(...)"

    .line 18
    .line 19
    invoke-static {p1, p2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lco/median/android/A;->c:Lo0/h;

    .line 23
    .line 24
    return-void
.end method

.method private final b(Ljava/lang/String;ZZ)V
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

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
    iget-boolean v0, p0, Lco/median/android/A;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-eqz p2, :cond_3

    .line 15
    .line 16
    iget-object p2, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 17
    .line 18
    invoke-virtual {p2}, Lco/median/android/MainActivity;->G1()Lm0/P0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string v0, "_median_url_changed"

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Lm0/P0;->a(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    const/4 p2, 0x2

    .line 31
    const/4 v0, 0x0

    .line 32
    const-string v1, "javascript:"

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {p1, v1, v2, p2, v0}, Le2/d;->i(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lco/median/android/A;->c:Lo0/h;

    .line 42
    .line 43
    invoke-interface {p2, p1}, Lo0/h;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    if-nez p3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lco/median/android/A;->a()Lco/median/android/B;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget-object p3, p0, Lco/median/android/A;->c:Lo0/h;

    .line 54
    .line 55
    invoke-virtual {p2, p3, p1, v2}, Lco/median/android/B;->U(Lo0/h;Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    invoke-direct {p0, p1}, Lco/median/android/A;->j(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p2, p0, Lco/median/android/A;->c:Lo0/h;

    .line 67
    .line 68
    invoke-interface {p2, p1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_0
    return-void
.end method

.method private final j(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

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
    iget-object v0, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    new-instance v1, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "url"

    .line 18
    .line 19
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "_median_url_changed"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lco/median/android/MainActivity;->f2(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lco/median/android/B;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/A;->d:Lco/median/android/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "urlNavigation"

    .line 7
    .line 8
    invoke-static {v0}, LX1/k;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lco/median/android/A;->e(Ljava/lang/String;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final d(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lco/median/android/A;->e(Ljava/lang/String;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final e(Ljava/lang/String;ZZ)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    iget-object v0, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v1, v0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "median_logout"

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-static {p1, v0, v2}, Le2/d;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    const-string v0, "gonative_logout"

    .line 21
    .line 22
    invoke-static {p1, v0, v2}, Le2/d;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/median/android/A;->b(Ljava/lang/String;ZZ)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    iget-object p2, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 34
    .line 35
    invoke-virtual {p2}, Lco/median/android/MainActivity;->P2()V

    .line 36
    .line 37
    .line 38
    :goto_1
    if-nez p3, :cond_3

    .line 39
    .line 40
    iget-object p2, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 41
    .line 42
    invoke-virtual {p2}, Lco/median/android/MainActivity;->T1()Lco/median/android/z;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    iget-object p2, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 49
    .line 50
    invoke-virtual {p2}, Lco/median/android/MainActivity;->T1()Lco/median/android/z;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2, p1, v1}, Lco/median/android/z;->m(Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_2
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 2

    .line 1
    const-string v0, "javascript"

    .line 2
    .line 3
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/median/android/A;->c:Lo0/h;

    .line 7
    .line 8
    invoke-interface {v0}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    :cond_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Le2/d;->s(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-static {p1, v0}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object p3, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Lco/median/android/MainActivity;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p3, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 40
    .line 41
    iput-object p2, p3, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object v0, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 45
    .line 46
    iput-object p2, v0, Lco/median/android/MainActivity;->g0:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p2, v0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, p1, p3, p4}, Lco/median/android/A;->b(Ljava/lang/String;ZZ)V

    .line 51
    .line 52
    .line 53
    :goto_0
    if-nez p4, :cond_3

    .line 54
    .line 55
    iget-object p3, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 56
    .line 57
    invoke-virtual {p3}, Lco/median/android/MainActivity;->T1()Lco/median/android/z;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Lco/median/android/A;->a:Lco/median/android/MainActivity;

    .line 64
    .line 65
    invoke-virtual {p3}, Lco/median/android/MainActivity;->T1()Lco/median/android/z;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p3, p1, p2}, Lco/median/android/z;->m(Ljava/lang/String;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/A;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lco/median/android/A;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/A;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lco/median/android/A;->e:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lco/median/android/A;->a()Lco/median/android/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lco/median/android/B;->M(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final k(Lco/median/android/B;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lco/median/android/A;->d:Lco/median/android/B;

    .line 7
    .line 8
    return-void
.end method
