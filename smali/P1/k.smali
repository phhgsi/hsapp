.class public abstract LP1/k;
.super LP1/c;
.source "SourceFile"

# interfaces
.implements LX1/h;


# instance fields
.field private final g:I


# direct methods
.method public constructor <init>(ILN1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LP1/c;-><init>(LN1/e;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LP1/k;->g:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LP1/k;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LP1/a;->h()LN1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LX1/s;->e(LX1/h;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "renderLambdaToString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-super {p0}, LP1/a;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
