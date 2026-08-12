.class public Lq0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


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
    iput-boolean v0, p0, Lq0/c$a;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lq0/c$a;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lq0/c$a;->c:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/c$a;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/c$a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/c$a;->c:Z

    .line 2
    .line 3
    return v0
.end method
