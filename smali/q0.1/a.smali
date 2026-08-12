.class public Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lq0/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lq0/a;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lq0/a;->b:Z

    .line 8
    .line 9
    sget-object v0, Lq0/b;->d:Lq0/b;

    .line 10
    .line 11
    iput-object v0, p0, Lq0/a;->c:Lq0/b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public b(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq0/a;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq0/a;->a:Z

    .line 2
    .line 3
    return-void
.end method
