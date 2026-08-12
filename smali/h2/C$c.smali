.class final Lh2/C$c;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final e:Lh2/C$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lh2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh2/C$c;->e:Lh2/C$c;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, LX1/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(Lh2/G;LN1/i$b;)Lh2/G;
    .locals 1

    .line 1
    instance-of v0, p2, Lf2/w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lf2/w0;

    .line 6
    .line 7
    iget-object v0, p1, Lh2/G;->a:LN1/i;

    .line 8
    .line 9
    invoke-interface {p2, v0}, Lf2/w0;->x(LN1/i;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, p2, v0}, Lh2/G;->a(Lf2/w0;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lh2/G;

    .line 2
    .line 3
    check-cast p2, LN1/i$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lh2/C$c;->c(Lh2/G;LN1/i$b;)Lh2/G;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
