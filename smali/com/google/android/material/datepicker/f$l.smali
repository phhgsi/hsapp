.class final enum Lcom/google/android/material/datepicker/f$l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/datepicker/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "l"
.end annotation


# static fields
.field public static final enum d:Lcom/google/android/material/datepicker/f$l;

.field public static final enum e:Lcom/google/android/material/datepicker/f$l;

.field private static final synthetic f:[Lcom/google/android/material/datepicker/f$l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/material/datepicker/f$l;

    .line 2
    .line 3
    const-string v1, "DAY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/f$l;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/android/material/datepicker/f$l;->d:Lcom/google/android/material/datepicker/f$l;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/material/datepicker/f$l;

    .line 12
    .line 13
    const-string v1, "YEAR"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/f$l;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/material/datepicker/f$l;->e:Lcom/google/android/material/datepicker/f$l;

    .line 20
    .line 21
    invoke-static {}, Lcom/google/android/material/datepicker/f$l;->a()[Lcom/google/android/material/datepicker/f$l;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/google/android/material/datepicker/f$l;->f:[Lcom/google/android/material/datepicker/f$l;

    .line 26
    .line 27
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

.method private static synthetic a()[Lcom/google/android/material/datepicker/f$l;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lcom/google/android/material/datepicker/f$l;

    .line 3
    .line 4
    sget-object v1, Lcom/google/android/material/datepicker/f$l;->d:Lcom/google/android/material/datepicker/f$l;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/google/android/material/datepicker/f$l;->e:Lcom/google/android/material/datepicker/f$l;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/material/datepicker/f$l;
    .locals 1

    .line 1
    const-class v0, Lcom/google/android/material/datepicker/f$l;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/material/datepicker/f$l;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/google/android/material/datepicker/f$l;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/material/datepicker/f$l;->f:[Lcom/google/android/material/datepicker/f$l;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/android/material/datepicker/f$l;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/android/material/datepicker/f$l;

    .line 8
    .line 9
    return-object v0
.end method
