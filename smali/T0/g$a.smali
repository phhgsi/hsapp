.class LT0/g$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT0/g;->h(Landroidx/activity/b;ILandroid/animation/Animator$AnimatorListener;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:LT0/g;


# direct methods
.method constructor <init>(LT0/g;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, LT0/g$a;->c:LT0/g;

    .line 2
    .line 3
    iput-boolean p2, p0, LT0/g$a;->a:Z

    .line 4
    .line 5
    iput p3, p0, LT0/g$a;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object p1, p0, LT0/g$a;->c:LT0/g;

    .line 2
    .line 3
    iget-object p1, p1, LT0/a;->b:Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LT0/g$a;->c:LT0/g;

    .line 10
    .line 11
    iget-boolean v1, p0, LT0/g$a;->a:Z

    .line 12
    .line 13
    iget v2, p0, LT0/g$a;->b:I

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1, v2}, LT0/g;->k(FZI)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
