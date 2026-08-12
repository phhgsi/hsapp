.class public final Ld2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/f;


# instance fields
.field private final a:Ld2/f;

.field private final b:LW1/l;


# direct methods
.method public constructor <init>(Ld2/f;LW1/l;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld2/q;->a:Ld2/f;

    .line 15
    .line 16
    iput-object p2, p0, Ld2/q;->b:LW1/l;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic a(Ld2/q;)Ld2/f;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/q;->a:Ld2/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Ld2/q;)LW1/l;
    .locals 0

    .line 1
    iget-object p0, p0, Ld2/q;->b:LW1/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(LW1/l;)Ld2/f;
    .locals 3

    .line 1
    const-string v0, "iterator"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld2/d;

    .line 7
    .line 8
    iget-object v1, p0, Ld2/q;->a:Ld2/f;

    .line 9
    .line 10
    iget-object v2, p0, Ld2/q;->b:LW1/l;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, p1}, Ld2/d;-><init>(Ld2/f;LW1/l;LW1/l;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ld2/q$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ld2/q$a;-><init>(Ld2/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
