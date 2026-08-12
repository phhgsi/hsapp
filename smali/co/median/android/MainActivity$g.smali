.class Lco/median/android/MainActivity$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/MainActivity;->A3(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lco/median/android/MainActivity;


# direct methods
.method constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity$g;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity$g;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/MainActivity;->b1(Lco/median/android/MainActivity;)Lco/median/android/MySwipeRefreshLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lco/median/android/widget/b;->setRefreshing(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
