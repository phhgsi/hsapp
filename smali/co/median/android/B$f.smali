.class Lco/median/android/B$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/B;->T(Lo0/h;Ljava/lang/String;ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo0/h;

.field final synthetic e:Lco/median/android/B;


# direct methods
.method constructor <init>(Lco/median/android/B;Lo0/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/B$f;->e:Lco/median/android/B;

    .line 2
    .line 3
    iput-object p2, p0, Lco/median/android/B$f;->d:Lo0/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/B$f;->e:Lco/median/android/B;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/B;->i(Lco/median/android/B;)Lco/median/android/MainActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lco/median/android/B$f;->d:Lo0/h;

    .line 12
    .line 13
    invoke-interface {v1}, Lo0/h;->getUrl()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-boolean v0, v0, Lo0/a;->p0:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string v0, "file:///android_asset/offline.html"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lco/median/android/B$f;->d:Lo0/h;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Lo0/h;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
