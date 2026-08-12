.class Lco/median/android/MainActivity$f;
.super Landroidx/activity/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lco/median/android/MainActivity;


# direct methods
.method constructor <init>(Lco/median/android/MainActivity;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$f;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/activity/F;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$f;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/MainActivity;->g1(Lco/median/android/MainActivity;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/activity/F;->j(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lco/median/android/MainActivity$f;->d:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->c()Landroidx/activity/OnBackPressedDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->l()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Landroidx/activity/F;->j(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
