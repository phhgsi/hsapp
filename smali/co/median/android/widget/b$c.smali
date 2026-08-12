.class Lco/median/android/widget/b$c;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/widget/b;->q(Landroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lco/median/android/widget/b;


# direct methods
.method constructor <init>(Lco/median/android/widget/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/widget/b$c;->d:Lco/median/android/widget/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lco/median/android/widget/b$c;->d:Lco/median/android/widget/b;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    sub-float/2addr v0, p1

    .line 6
    invoke-virtual {p2, v0}, Lco/median/android/widget/b;->setAnimationProgress(F)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
