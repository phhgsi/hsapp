.class LU0/l$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/l;->r(Landroid/animation/ValueAnimator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LU0/l;


# direct methods
.method constructor <init>(LU0/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/l$a;->a:LU0/l;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU0/l$a;->a:LU0/l;

    .line 5
    .line 6
    invoke-static {p1}, LU0/l;->a(LU0/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
