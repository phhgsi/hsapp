.class Lco/median/android/MainActivity$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/MainActivity;->W2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lco/median/android/MainActivity;->Z0(Lco/median/android/MainActivity;)LG/u;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    invoke-static {p1}, Lco/median/android/MainActivity;->Z0(Lco/median/android/MainActivity;)LG/u;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, LG/u;->b()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p1, v0}, Lco/median/android/MainActivity;->c1(Lco/median/android/MainActivity;LG/u;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 25
    .line 26
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, Lo0/a;->F0:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lco/median/android/MainActivity;->G3(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lco/median/android/MainActivity$h;->a:Lco/median/android/MainActivity;

    .line 36
    .line 37
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, Lo0/a;->G0:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lco/median/android/MainActivity;->H3(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
