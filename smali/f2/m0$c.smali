.class public final Lf2/m0$c;
.super Lh2/n$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/m0;->n(Ljava/lang/Object;Lf2/r0;Lf2/l0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lf2/m0;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh2/n;Lf2/m0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lf2/m0$c;->d:Lf2/m0;

    .line 2
    .line 3
    iput-object p3, p0, Lf2/m0$c;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lh2/n$a;-><init>(Lh2/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lh2/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf2/m0$c;->g(Lh2/n;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public g(Lh2/n;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Lf2/m0$c;->d:Lf2/m0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf2/m0;->T()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lf2/m0$c;->e:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-static {}, Lh2/m;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
