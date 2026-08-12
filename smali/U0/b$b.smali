.class LU0/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LU0/b;


# direct methods
.method constructor <init>(LU0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/b$b;->d:LU0/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, LU0/b$b;->d:LU0/b;

    .line 2
    .line 3
    invoke-static {v0}, LU0/b;->b(LU0/b;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU0/b$b;->d:LU0/b;

    .line 7
    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, LU0/b;->c(LU0/b;J)J

    .line 11
    .line 12
    .line 13
    return-void
.end method
