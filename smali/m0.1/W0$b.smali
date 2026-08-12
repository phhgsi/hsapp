.class public final Lm0/W0$b;
.super Landroidx/appcompat/app/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/W0;->m(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic l:Lm0/W0;

.field final synthetic m:Lo0/a;


# direct methods
.method constructor <init>(Lm0/W0;Lo0/a;Lco/median/android/MainActivity;Lco/median/android/widget/GoNativeDrawerLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/W0$b;->l:Lm0/W0;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/W0$b;->m:Lo0/a;

    .line 4
    .line 5
    const p1, 0x7f120058

    .line 6
    .line 7
    .line 8
    const p2, 0x7f120057

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3, p4, p1, p2}, Landroidx/appcompat/app/b;-><init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;II)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "drawerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm0/W0$b;->l:Lm0/W0;

    .line 7
    .line 8
    invoke-static {p1}, Lm0/W0;->b(Lm0/W0;)Lco/median/android/widget/GoNativeDrawerLayout;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm0/W0$b;->l:Lm0/W0;

    .line 7
    .line 8
    invoke-static {p1}, Lm0/W0;->b(Lm0/W0;)Lco/median/android/widget/GoNativeDrawerLayout;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lm0/W0$b;->m:Lo0/a;

    .line 13
    .line 14
    iget-boolean v0, v0, Lo0/a;->f0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lm0/W0$b;->l:Lm0/W0;

    .line 19
    .line 20
    invoke-virtual {v0}, Lm0/W0;->f()Lco/median/android/MainActivity;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m1()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-virtual {p1, v0}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
