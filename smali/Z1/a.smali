.class public abstract LZ1/a;
.super LZ1/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ1/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ1/a;->c()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public abstract c()Ljava/util/Random;
.end method
