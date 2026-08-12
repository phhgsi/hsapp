.class final Lh2/C$b;
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
.field public static final e:Lh2/C$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh2/C$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lh2/C$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh2/C$b;->e:Lh2/C$b;

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
.method public final c(Lf2/w0;LN1/i$b;)Lf2/w0;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    instance-of p1, p2, Lf2/w0;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    check-cast p2, Lf2/w0;

    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lf2/w0;

    .line 2
    .line 3
    check-cast p2, LN1/i$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lh2/C$b;->c(Lf2/w0;LN1/i$b;)Lf2/w0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
