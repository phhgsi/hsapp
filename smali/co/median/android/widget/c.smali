.class public final synthetic Lco/median/android/widget/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lco/median/android/widget/g;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/widget/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/widget/c;->a:Lco/median/android/widget/g;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/c;->a:Lco/median/android/widget/g;

    invoke-static {v0, p1}, Lco/median/android/widget/g;->b(Lco/median/android/widget/g;Landroid/animation/ValueAnimator;)V

    return-void
.end method
