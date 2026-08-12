.class final Lf2/v$a;
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


# static fields
.field public static final e:Lf2/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/v$a;->e:Lf2/v$a;

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
    invoke-virtual {p0, p1, p2}, Lf2/v$a;->c(LN1/i;LN1/i$b;)LN1/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
