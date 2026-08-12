.class LJ/e0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/e0;->h(Landroid/view/View;LJ/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/f0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:LJ/e0;


# direct methods
.method constructor <init>(LJ/e0;LJ/f0;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ/e0$a;->c:LJ/e0;

    .line 2
    .line 3
    iput-object p2, p0, LJ/e0$a;->a:LJ/f0;

    .line 4
    .line 5
    iput-object p3, p0, LJ/e0$a;->b:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, LJ/e0$a;->a:LJ/f0;

    .line 2
    .line 3
    iget-object v0, p0, LJ/e0$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, LJ/f0;->a(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, LJ/e0$a;->a:LJ/f0;

    .line 2
    .line 3
    iget-object v0, p0, LJ/e0$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, LJ/f0;->b(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, LJ/e0$a;->a:LJ/f0;

    .line 2
    .line 3
    iget-object v0, p0, LJ/e0$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-interface {p1, v0}, LJ/f0;->c(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
