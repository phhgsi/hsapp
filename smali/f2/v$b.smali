.class final Lf2/v$b;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/v;->a(LN1/i;LN1/i;Z)LN1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic e:LX1/r;

.field final synthetic f:Z


# direct methods
.method constructor <init>(LX1/r;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf2/v$b;->e:LX1/r;

    .line 2
    .line 3
    iput-boolean p2, p0, Lf2/v$b;->f:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, LX1/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(LN1/i;LN1/i$b;)LN1/i;
    .locals 0

    .line 1
    invoke-interface {p1, p2}, LN1/i;->p(LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN1/i;

    .line 2
    .line 3
    check-cast p2, LN1/i$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lf2/v$b;->c(LN1/i;LN1/i$b;)LN1/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
