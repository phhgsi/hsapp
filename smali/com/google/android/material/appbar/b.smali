.class public final synthetic Lcom/google/android/material/appbar/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/appbar/AppBarLayout;

.field public final synthetic b:Landroid/content/res/ColorStateList;

.field public final synthetic c:LZ0/h;

.field public final synthetic d:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/appbar/AppBarLayout;Landroid/content/res/ColorStateList;LZ0/h;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/appbar/b;->a:Lcom/google/android/material/appbar/AppBarLayout;

    iput-object p2, p0, Lcom/google/android/material/appbar/b;->b:Landroid/content/res/ColorStateList;

    iput-object p3, p0, Lcom/google/android/material/appbar/b;->c:LZ0/h;

    iput-object p4, p0, Lcom/google/android/material/appbar/b;->d:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/appbar/b;->a:Lcom/google/android/material/appbar/AppBarLayout;

    iget-object v1, p0, Lcom/google/android/material/appbar/b;->b:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Lcom/google/android/material/appbar/b;->c:LZ0/h;

    iget-object v3, p0, Lcom/google/android/material/appbar/b;->d:Ljava/lang/Integer;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/android/material/appbar/AppBarLayout;->b(Lcom/google/android/material/appbar/AppBarLayout;Landroid/content/res/ColorStateList;LZ0/h;Ljava/lang/Integer;Landroid/animation/ValueAnimator;)V

    return-void
.end method
