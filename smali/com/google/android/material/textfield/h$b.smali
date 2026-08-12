.class final Lcom/google/android/material/textfield/h$b;
.super LZ0/h$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final x:Landroid/graphics/RectF;


# direct methods
.method private constructor <init>(LZ0/l;Landroid/graphics/RectF;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, LZ0/h$c;-><init>(LZ0/l;LQ0/a;)V

    .line 4
    iput-object p2, p0, Lcom/google/android/material/textfield/h$b;->x:Landroid/graphics/RectF;

    return-void
.end method

.method synthetic constructor <init>(LZ0/l;Landroid/graphics/RectF;Lcom/google/android/material/textfield/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/textfield/h$b;-><init>(LZ0/l;Landroid/graphics/RectF;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/material/textfield/h$b;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, LZ0/h$c;-><init>(LZ0/h$c;)V

    .line 6
    iget-object p1, p1, Lcom/google/android/material/textfield/h$b;->x:Landroid/graphics/RectF;

    iput-object p1, p0, Lcom/google/android/material/textfield/h$b;->x:Landroid/graphics/RectF;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/material/textfield/h$b;Lcom/google/android/material/textfield/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/h$b;-><init>(Lcom/google/android/material/textfield/h$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/material/textfield/h$b;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/h$b;->x:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/material/textfield/h;->s0(Lcom/google/android/material/textfield/h$b;)Lcom/google/android/material/textfield/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LZ0/h;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
