.class public Ln0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln0/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ln0/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Ln0/a;->c:I

    .line 9
    .line 10
    iput p4, p0, Ln0/a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1
    iget v0, p0, Ln0/a;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 9
    .line 10
    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Landroid/graphics/Canvas;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 22
    .line 23
    .line 24
    iget v4, p0, Ln0/a;->d:I

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    .line 33
    .line 34
    int-to-float v0, v0

    .line 35
    const/high16 v4, 0x40000000    # 2.0f

    .line 36
    .line 37
    div-float v4, v0, v4

    .line 38
    .line 39
    const/high16 v5, 0x40400000    # 3.0f

    .line 40
    .line 41
    div-float/2addr v0, v5

    .line 42
    invoke-virtual {v2, v4, v4, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 46
    .line 47
    iget-object v2, p0, Ln0/a;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method
