.class Lco/median/android/widget/b$d;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/widget/b;->m(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Lco/median/android/widget/b;


# direct methods
.method constructor <init>(Lco/median/android/widget/b;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/widget/b$d;->f:Lco/median/android/widget/b;

    .line 2
    .line 3
    iput p2, p0, Lco/median/android/widget/b$d;->d:I

    .line 4
    .line 5
    iput p3, p0, Lco/median/android/widget/b$d;->e:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lco/median/android/widget/b$d;->f:Lco/median/android/widget/b;

    .line 2
    .line 3
    iget-object p2, p2, Lco/median/android/widget/b;->C:Lh0/a;

    .line 4
    .line 5
    iget v0, p0, Lco/median/android/widget/b$d;->d:I

    .line 6
    .line 7
    int-to-float v1, v0

    .line 8
    iget v2, p0, Lco/median/android/widget/b$d;->e:I

    .line 9
    .line 10
    sub-int/2addr v2, v0

    .line 11
    int-to-float v0, v2

    .line 12
    mul-float/2addr v0, p1

    .line 13
    add-float/2addr v1, v0

    .line 14
    float-to-int p1, v1

    .line 15
    invoke-virtual {p2, p1}, Lh0/a;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
