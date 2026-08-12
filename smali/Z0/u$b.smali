.class public LZ0/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:LZ0/u$c;

.field b:F


# direct methods
.method constructor <init>(LZ0/u$c;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ0/u$b;->a:LZ0/u$c;

    .line 5
    .line 6
    iput p2, p0, LZ0/u$b;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LZ0/u$b;->a:LZ0/u$c;

    .line 2
    .line 3
    sget-object v1, LZ0/u$c;->d:LZ0/u$c;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, LZ0/u$b;->b:F

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    mul-float/2addr v0, p1

    .line 11
    float-to-int p1, v0

    .line 12
    return p1

    .line 13
    :cond_0
    sget-object p1, LZ0/u$c;->e:LZ0/u$c;

    .line 14
    .line 15
    if-ne v0, p1, :cond_1

    .line 16
    .line 17
    iget p1, p0, LZ0/u$b;->b:F

    .line 18
    .line 19
    float-to-int p1, p1

    .line 20
    return p1

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    return p1
.end method
