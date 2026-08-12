.class public final Ld2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LY1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private d:Ljava/lang/Object;

.field private e:I

.field final synthetic f:Ld2/e;


# direct methods
.method constructor <init>(Ld2/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld2/e$a;->f:Ld2/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x2

    .line 7
    iput p1, p0, Ld2/e$a;->e:I

    .line 8
    .line 9
    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    iget v0, p0, Ld2/e$a;->e:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ld2/e$a;->f:Ld2/e;

    .line 7
    .line 8
    invoke-static {v0}, Ld2/e;->a(Ld2/e;)LW1/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, LW1/a;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Ld2/e$a;->f:Ld2/e;

    .line 18
    .line 19
    invoke-static {v0}, Ld2/e;->b(Ld2/e;)LW1/l;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Ld2/e$a;->d:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v1}, LX1/k;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, LW1/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    iput-object v0, p0, Ld2/e$a;->d:Ljava/lang/Object;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    :goto_1
    iput v0, p0, Ld2/e$a;->e:I

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ld2/e$a;->e:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Ld2/e$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Ld2/e$a;->e:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ld2/e$a;->e:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Ld2/e$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Ld2/e$a;->e:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Ld2/e$a;->d:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    .line 15
    .line 16
    invoke-static {v0, v1}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Ld2/e$a;->e:I

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
