.class final Lf2/W$a$a;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/W$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final e:Lf2/W$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/W$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/W$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/W$a$a;->e:Lf2/W$a$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LX1/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(LN1/i$b;)Lf2/W;
    .locals 1

    .line 1
    instance-of v0, p1, Lf2/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lf2/W;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN1/i$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf2/W$a$a;->c(LN1/i$b;)Lf2/W;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
