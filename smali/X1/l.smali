.class public abstract LX1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/h;
.implements Ljava/io/Serializable;


# instance fields
.field private final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LX1/l;->d:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LX1/l;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, LX1/s;->f(LX1/l;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "renderLambdaToString(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
