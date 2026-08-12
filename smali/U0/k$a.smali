.class LU0/k$a;
.super LP/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LP/i;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)F
    .locals 0

    .line 1
    check-cast p1, LU0/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LU0/k$a;->c(LU0/k;)F

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
    check-cast p1, LU0/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LU0/k$a;->d(LU0/k;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LU0/k;)F
    .locals 1

    .line 1
    invoke-static {p1}, LU0/k;->x(LU0/k;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x461c4000    # 10000.0f

    .line 6
    .line 7
    .line 8
    mul-float/2addr p1, v0

    .line 9
    return p1
.end method

.method public d(LU0/k;F)V
    .locals 1

    .line 1
    const v0, 0x461c4000    # 10000.0f

    .line 2
    .line 3
    .line 4
    div-float v0, p2, v0

    .line 5
    .line 6
    invoke-static {p1, v0}, LU0/k;->y(LU0/k;F)V

    .line 7
    .line 8
    .line 9
    float-to-int p2, p2

    .line 10
    invoke-static {p1, p2}, LU0/k;->z(LU0/k;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
