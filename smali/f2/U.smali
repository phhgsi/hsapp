.class public abstract Lf2/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lh2/y;

.field private static final b:Lh2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh2/y;

    .line 2
    .line 3
    const-string v1, "REMOVED_TASK"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh2/y;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf2/U;->a:Lh2/y;

    .line 9
    .line 10
    new-instance v0, Lh2/y;

    .line 11
    .line 12
    const-string v1, "CLOSED_EMPTY"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lh2/y;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf2/U;->b:Lh2/y;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic a()Lh2/y;
    .locals 1

    .line 1
    sget-object v0, Lf2/U;->b:Lh2/y;

    .line 2
    .line 3
    return-object v0
.end method
