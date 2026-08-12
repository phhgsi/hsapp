.class public abstract Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$c;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;
    }
.end annotation


# static fields
.field private static final a:Landroid/animation/TimeInterpolator;

.field private static final b:Landroid/animation/TimeInterpolator;

.field private static final c:Landroid/animation/TimeInterpolator;

.field static final d:Landroid/os/Handler;

.field private static final e:[I

.field private static final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LG0/a;->b:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a:Landroid/animation/TimeInterpolator;

    .line 4
    .line 5
    sget-object v0, LG0/a;->a:Landroid/animation/TimeInterpolator;

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:Landroid/animation/TimeInterpolator;

    .line 8
    .line 9
    sget-object v0, LG0/a;->d:Landroid/animation/TimeInterpolator;

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c:Landroid/animation/TimeInterpolator;

    .line 12
    .line 13
    sget v0, LF0/a;->P:I

    .line 14
    .line 15
    filled-new-array {v0}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:[I

    .line 20
    .line 21
    const-class v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v0, Landroid/os/Handler;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$a;

    .line 36
    .line 37
    invoke-direct {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$a;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Landroid/os/Handler;

    .line 44
    .line 45
    return-void
.end method

.method static synthetic a(ILZ0/l;)LZ0/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d(ILZ0/l;)LZ0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(ILandroid/content/res/Resources;)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c(ILandroid/content/res/Resources;)Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static c(ILandroid/content/res/Resources;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    sget v0, LF0/c;->x0:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private static d(ILZ0/l;)LZ0/h;
    .locals 1

    .line 1
    new-instance v0, LZ0/h;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LZ0/h;-><init>(LZ0/l;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, LZ0/h;->c0(Landroid/content/res/ColorStateList;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
