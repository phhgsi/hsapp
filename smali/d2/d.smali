.class public final Ld2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/f;


# instance fields
.field private final a:Ld2/f;

.field private final b:LW1/l;

.field private final c:LW1/l;


# direct methods
.method public constructor <init>(Ld2/f;LW1/l;LW1/l;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transformer"

    .line 7
    .line 8
    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "iterator"

    .line 12
    .line 13
    invoke-static {p3, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ld2/d;->a:Ld2/f;

    .line 20
    .line 21
    iput-object p2, p0, Ld2/d;->b:LW1/l;

    .line 22
    .line 23
    iput-object p3, p0, Ld2/d;->c:LW1/l;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a(Ld2/d;)LW1/l;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/d;->c:LW1/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Ld2/d;)Ld2/f;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/d;->a:Ld2/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Ld2/d;)LW1/l;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/d;->b:LW1/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ld2/d$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ld2/d$a;-><init>(Ld2/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
