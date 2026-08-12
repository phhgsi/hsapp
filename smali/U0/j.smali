.class public final synthetic LU0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LU0/k;

.field public final synthetic b:LU0/c;


# direct methods
.method public synthetic constructor <init>(LU0/k;LU0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU0/j;->a:LU0/k;

    iput-object p2, p0, LU0/j;->b:LU0/c;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU0/j;->a:LU0/k;

    iget-object v1, p0, LU0/j;->b:LU0/c;

    invoke-static {v0, v1, p1}, LU0/k;->v(LU0/k;LU0/c;Landroid/animation/ValueAnimator;)V

    return-void
.end method
