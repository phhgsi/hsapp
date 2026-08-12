.class final enum Lco/median/android/E;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:Lco/median/android/E;

.field public static final enum e:Lco/median/android/E;

.field public static final enum f:Lco/median/android/E;

.field public static final enum g:Lco/median/android/E;

.field private static final synthetic h:[Lco/median/android/E;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lco/median/android/E;

    .line 2
    .line 3
    const-string v1, "STATE_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lco/median/android/E;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lco/median/android/E;->d:Lco/median/android/E;

    .line 10
    .line 11
    new-instance v0, Lco/median/android/E;

    .line 12
    .line 13
    const-string v1, "STATE_START_LOAD"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lco/median/android/E;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lco/median/android/E;->e:Lco/median/android/E;

    .line 20
    .line 21
    new-instance v0, Lco/median/android/E;

    .line 22
    .line 23
    const-string v1, "STATE_PAGE_STARTED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lco/median/android/E;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lco/median/android/E;->f:Lco/median/android/E;

    .line 30
    .line 31
    new-instance v0, Lco/median/android/E;

    .line 32
    .line 33
    const-string v1, "STATE_DONE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lco/median/android/E;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lco/median/android/E;->g:Lco/median/android/E;

    .line 40
    .line 41
    invoke-static {}, Lco/median/android/E;->a()[Lco/median/android/E;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lco/median/android/E;->h:[Lco/median/android/E;

    .line 46
    .line 47
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic a()[Lco/median/android/E;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lco/median/android/E;

    .line 3
    .line 4
    sget-object v1, Lco/median/android/E;->d:Lco/median/android/E;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lco/median/android/E;->e:Lco/median/android/E;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lco/median/android/E;->f:Lco/median/android/E;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lco/median/android/E;->g:Lco/median/android/E;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/median/android/E;
    .locals 1

    .line 1
    const-class v0, Lco/median/android/E;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lco/median/android/E;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lco/median/android/E;
    .locals 1

    .line 1
    sget-object v0, Lco/median/android/E;->h:[Lco/median/android/E;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lco/median/android/E;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lco/median/android/E;

    .line 8
    .line 9
    return-object v0
.end method
