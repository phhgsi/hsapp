.class public final Landroidx/activity/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/activity/K$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Landroidx/activity/K;
    .locals 6

    .line 1
    new-instance v0, Landroidx/activity/K;

    .line 2
    .line 3
    sget-object v4, Landroidx/activity/K$a$a;->e:Landroidx/activity/K$a$a;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    move v2, p1

    .line 8
    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v5}, Landroidx/activity/K;-><init>(IIILW1/l;LX1/g;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final b(II)Landroidx/activity/K;
    .locals 6

    .line 1
    new-instance v0, Landroidx/activity/K;

    .line 2
    .line 3
    sget-object v4, Landroidx/activity/K$a$b;->e:Landroidx/activity/K$a$b;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Landroidx/activity/K;-><init>(IIILW1/l;LX1/g;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
