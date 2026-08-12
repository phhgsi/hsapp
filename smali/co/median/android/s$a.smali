.class Lco/median/android/s$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/s;


# direct methods
.method constructor <init>(Lco/median/android/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/s$a;->a:Lco/median/android/s;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lco/median/android/s$a;->a:Lco/median/android/s;

    .line 2
    .line 3
    invoke-static {p1}, Lco/median/android/s;->g(Lco/median/android/s;)Lco/median/android/s$b;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lco/median/android/s$a;->a:Lco/median/android/s;

    .line 2
    .line 3
    invoke-static {p1}, Lco/median/android/s;->g(Lco/median/android/s;)Lco/median/android/s$b;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
