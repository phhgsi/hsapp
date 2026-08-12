.class public abstract Lf2/w;
.super LN1/a;
.source "SourceFile"

# interfaces
.implements LN1/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/w$a;
    }
.end annotation


# static fields
.field public static final e:Lf2/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf2/w$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf2/w$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf2/w;->e:Lf2/w$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LN1/f;->a:LN1/f$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LN1/a;-><init>(LN1/i$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract D(LN1/i;Ljava/lang/Runnable;)V
.end method

.method public E(LN1/i;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public F(I)Lf2/w;
    .locals 1

    .line 1
    invoke-static {p1}, Lh2/k;->a(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh2/j;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lh2/j;-><init>(Lf2/w;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public b(LN1/i$c;)LN1/i$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/f$a;->a(LN1/f;LN1/i$c;)LN1/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final l(LN1/e;)LN1/e;
    .locals 1

    .line 1
    new-instance v0, Lh2/h;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lh2/h;-><init>(Lf2/w;LN1/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final q(LN1/e;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lh2/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Lh2/h;->o()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public r(LN1/i$c;)LN1/i;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN1/f$a;->b(LN1/f;LN1/i$c;)LN1/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lf2/D;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lf2/D;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
