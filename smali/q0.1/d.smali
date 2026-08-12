.class public Lq0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lq0/d;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lq0/d;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lq0/d;->c:Z

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lq0/d;->d:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lq0/d;->e:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lq0/d;->f:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/d;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/d;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/d;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/d;->f:Z

    .line 2
    .line 3
    return v0
.end method
