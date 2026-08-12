.class final Lf2/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/i$b;
.implements LN1/i$c;


# static fields
.field public static final d:Lf2/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/A0;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/A0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/A0;->d:Lf2/A0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(LN1/i$c;)LN1/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->b(LN1/i$b;LN1/i$c;)LN1/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()LN1/i$c;
    .locals 0

    .line 1
    return-object p0
.end method

.method public i(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LN1/i$b$a;->a(LN1/i$b;Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p(LN1/i;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->d(LN1/i$b;LN1/i;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public r(LN1/i$c;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/i$b$a;->c(LN1/i$b;LN1/i$c;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
