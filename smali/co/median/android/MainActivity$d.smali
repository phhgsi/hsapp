.class Lco/median/android/MainActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/widget/SwipeHistoryNavigationLayout$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo0/a;

.field final synthetic b:Lco/median/android/MainActivity;


# direct methods
.method constructor <init>(Lco/median/android/MainActivity;Lo0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lco/median/android/MainActivity$d;->a:Lo0/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/MainActivity;->Y0(Lco/median/android/MainActivity;)Lo0/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lo0/h;->getMaxHorizontalScroll()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-static {v0}, Lco/median/android/MainActivity;->Y0(Lco/median/android/MainActivity;)Lo0/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lo0/h;->getScrollX()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 24
    .line 25
    invoke-static {v1}, Lco/median/android/MainActivity;->Y0(Lco/median/android/MainActivity;)Lo0/h;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Lo0/h;->getMaxHorizontalScroll()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v0, v1, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    return v0

    .line 37
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 38
    .line 39
    invoke-static {v0}, Lco/median/android/MainActivity;->d1(Lco/median/android/MainActivity;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$d;->a:Lo0/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lo0/a;->f0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m1()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 16
    .line 17
    invoke-virtual {v0}, Lco/median/android/MainActivity;->Y1()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$d;->a:Lo0/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lo0/a;->f0:Z

    .line 4
    .line 5
    return v0
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$d;->a:Lo0/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lo0/a;->f0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 8
    .line 9
    invoke-static {v0}, Lco/median/android/MainActivity;->d1(Lco/median/android/MainActivity;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 16
    .line 17
    invoke-static {v0}, Lco/median/android/MainActivity;->f1(Lco/median/android/MainActivity;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/MainActivity;->Y0(Lco/median/android/MainActivity;)Lo0/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lo0/h;->getMaxHorizontalScroll()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-static {v0}, Lco/median/android/MainActivity;->Y0(Lco/median/android/MainActivity;)Lo0/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lo0/h;->getScrollX()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity$d;->b:Lco/median/android/MainActivity;

    .line 28
    .line 29
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m1()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method
