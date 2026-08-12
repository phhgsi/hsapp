.class public Lco/median/android/u;
.super Ljava/util/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/u$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String; = "co.median.android.u"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lco/median/android/u$a;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/Observable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lco/median/android/u;->b:Lco/median/android/u$a;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lco/median/android/u;->c:Z

    .line 9
    .line 10
    iput-object p1, p0, Lco/median/android/u;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p0}, Lco/median/android/u;->g()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method static bridge synthetic a(Lco/median/android/u;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/median/android/u;->a:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic b(Lco/median/android/u;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lco/median/android/u;->c:Z

    return p0
.end method

.method static bridge synthetic c(Lco/median/android/u;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lco/median/android/u;->c:Z

    return-void
.end method

.method static bridge synthetic d()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/u;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lco/median/android/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/Observable;->setChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic f(Lco/median/android/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/util/Observable;->setChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/u;->b:Lco/median/android/u$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lco/median/android/u;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lo0/a;->A:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    new-instance v0, Lco/median/android/u$a;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lco/median/android/u$a;-><init>(Lco/median/android/u;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lco/median/android/u;->b:Lco/median/android/u$a;

    .line 26
    .line 27
    iget-object v1, p0, Lco/median/android/u;->a:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v1, v1, Lo0/a;->A:Ljava/lang/String;

    .line 34
    .line 35
    filled-new-array {v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/u;->c:Z

    .line 2
    .line 3
    return v0
.end method
