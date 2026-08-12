.class public final LG/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LG/x;

    .line 2
    .line 3
    invoke-direct {v0}, LG/x;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LG/x;->a:LG/x;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V
    .locals 3

    .line 1
    const-string v0, "theme"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "decor"

    .line 7
    .line 8
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "tv"

    .line 12
    .line 13
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x10104e0

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget v0, p2, Landroid/util/TypedValue;->data:I

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    const v2, 0x101056c

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    iget p0, p2, Landroid/util/TypedValue;->data:I

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    or-int/lit8 v0, v0, 0x10

    .line 48
    .line 49
    :cond_1
    invoke-static {p1}, LG/v;->a(Landroid/view/View;)Landroid/view/WindowInsetsController;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, LX1/k;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/16 p1, 0x18

    .line 57
    .line 58
    invoke-static {p0, v0, p1}, LG/w;->a(Landroid/view/WindowInsetsController;II)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static synthetic b(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0, p1, p2}, LG/x;->a(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
