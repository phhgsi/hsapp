.class public final Lcom/google/android/gms/common/util/PlatformVersion;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isAtLeastHoneycomb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastHoneycombMR1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastIceCreamSandwich()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastIceCreamSandwichMR1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastJellyBean()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastJellyBeanMR1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastJellyBeanMR2()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastKitKat()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastKitKatWatch()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastLollipop()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastLollipopMR1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastM()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static isAtLeastN()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastO()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastP()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastQ()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastR()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastS()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastSv2()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastT()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isAtLeastU()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastT()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {}, LE/a;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public static isAtLeastV()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastU()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {}, LE/a;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
