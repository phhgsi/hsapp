.class public final synthetic LU0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LU0/k;


# direct methods
.method public synthetic constructor <init>(LU0/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU0/i;->a:LU0/k;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU0/i;->a:LU0/k;

    invoke-static {v0, p1}, LU0/k;->w(LU0/k;Landroid/animation/ValueAnimator;)V

    return-void
.end method
