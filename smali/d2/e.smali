.class final Ld2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/f;


# instance fields
.field private final a:LW1/a;

.field private final b:LW1/l;


# direct methods
.method public constructor <init>(LW1/a;LW1/l;)V
    .locals 1

    .line 1
    const-string v0, "getInitialValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "getNextValue"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld2/e;->a:LW1/a;

    .line 15
    .line 16
    iput-object p2, p0, Ld2/e;->b:LW1/l;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a(Ld2/e;)LW1/a;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/e;->a:LW1/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Ld2/e;)LW1/l;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/e;->b:LW1/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ld2/e$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ld2/e$a;-><init>(Ld2/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
