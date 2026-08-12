.class LZ0/h$e;
.super LP/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final b:I


# direct methods
.method constructor <init>(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "cornerSizeAtIndex"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, LP/i;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput p1, p0, LZ0/h$e;->b:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)F
    .locals 0

    .line 1
    check-cast p1, LZ0/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LZ0/h$e;->c(LZ0/h;)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    check-cast p1, LZ0/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LZ0/h$e;->d(LZ0/h;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LZ0/h;)F
    .locals 1

    .line 1
    invoke-static {p1}, LZ0/h;->f(LZ0/h;)[F

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LZ0/h;->f(LZ0/h;)[F

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v0, p0, LZ0/h$e;->b:I

    .line 12
    .line 13
    aget p1, p1, v0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public d(LZ0/h;F)V
    .locals 2

    .line 1
    invoke-static {p1}, LZ0/h;->f(LZ0/h;)[F

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, LZ0/h;->f(LZ0/h;)[F

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, LZ0/h$e;->b:I

    .line 12
    .line 13
    aget v0, v0, v1

    .line 14
    .line 15
    cmpl-float v0, v0, p2

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, LZ0/h;->f(LZ0/h;)[F

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v1, p0, LZ0/h$e;->b:I

    .line 24
    .line 25
    aput p2, v0, v1

    .line 26
    .line 27
    invoke-static {p1}, LZ0/h;->g(LZ0/h;)LZ0/h$d;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, LZ0/h;->g(LZ0/h;)LZ0/h$d;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1}, LZ0/h;->z()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-interface {p2, v0}, LZ0/h$d;->a(F)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p1}, LZ0/h;->invalidateSelf()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method
