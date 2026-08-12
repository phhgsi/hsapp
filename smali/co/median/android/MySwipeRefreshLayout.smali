.class public Lco/median/android/MySwipeRefreshLayout;
.super Lco/median/android/widget/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/MySwipeRefreshLayout$a;
    }
.end annotation


# instance fields
.field private R:Lco/median/android/MySwipeRefreshLayout$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lco/median/android/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MySwipeRefreshLayout;->R:Lco/median/android/MySwipeRefreshLayout$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lco/median/android/MySwipeRefreshLayout$a;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Lco/median/android/widget/b;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public setCanChildScrollUpCallback(Lco/median/android/MySwipeRefreshLayout$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MySwipeRefreshLayout;->R:Lco/median/android/MySwipeRefreshLayout$a;

    .line 2
    .line 3
    return-void
.end method
