.class LU0/f$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/f;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LU0/f;


# direct methods
.method constructor <init>(LU0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/f$a;->a:LU0/f;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU0/f$a;->a:LU0/f;

    .line 5
    .line 6
    invoke-static {p1}, LU0/f;->i(LU0/f;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {}, LU0/f;->k()[I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    array-length v1, v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    iget-object v1, p0, LU0/f$a;->a:LU0/f;

    .line 17
    .line 18
    invoke-static {v1}, LU0/f;->l(LU0/f;)LU0/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, LU0/c;->e:[I

    .line 23
    .line 24
    array-length v1, v1

    .line 25
    rem-int/2addr v0, v1

    .line 26
    invoke-static {p1, v0}, LU0/f;->j(LU0/f;I)I

    .line 27
    .line 28
    .line 29
    return-void
.end method
