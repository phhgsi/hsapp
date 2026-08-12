.class final Lb0/b$a;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb0/b;->b(Lf2/G;Ljava/lang/Object;)Ll1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroidx/concurrent/futures/c$a;

.field final synthetic f:Lf2/G;


# direct methods
.method constructor <init>(Landroidx/concurrent/futures/c$a;Lf2/G;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb0/b$a;->e:Landroidx/concurrent/futures/c$a;

    .line 2
    .line 3
    iput-object p2, p0, Lb0/b$a;->f:Lf2/G;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, LX1/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lb0/b$a;->e:Landroidx/concurrent/futures/c$a;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/concurrent/futures/c$a;->c()Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lb0/b$a;->e:Landroidx/concurrent/futures/c$a;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->e(Ljava/lang/Throwable;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object p1, p0, Lb0/b$a;->e:Landroidx/concurrent/futures/c$a;

    .line 20
    .line 21
    iget-object v0, p0, Lb0/b$a;->f:Lf2/G;

    .line 22
    .line 23
    invoke-interface {v0}, Lf2/G;->g()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb0/b$a;->c(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LL1/t;->a:LL1/t;

    .line 7
    .line 8
    return-object p1
.end method
