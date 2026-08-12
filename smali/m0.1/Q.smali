.class public final Lm0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/Q;

    .line 2
    .line 3
    invoke-direct {v0}, Lm0/Q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm0/Q;->a:Lm0/Q;

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

.method public static final a(Lco/median/android/MainActivity;Ljava/lang/String;Ljava/lang/String;II)Lf/e;
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "activeIcon"

    .line 7
    .line 8
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "inactiveIcon"

    .line 12
    .line 13
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lf/e;

    .line 17
    .line 18
    invoke-direct {v0}, Lf/e;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ln0/a;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1, p3, p4}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v1, Ln0/a;

    .line 31
    .line 32
    invoke-direct {v1, p0, p2, p3, p4}, Ln0/a;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ln0/a;->a()Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const p2, 0x10100a0

    .line 40
    .line 41
    .line 42
    filled-new-array {p2}, [I

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {v0, p2, p1}, Lf/e;->j([ILandroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    const p1, -0x10100a0

    .line 50
    .line 51
    .line 52
    filled-new-array {p1}, [I

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v0, p1, p0}, Lf/e;->j([ILandroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method
