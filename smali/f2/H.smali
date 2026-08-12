.class Lf2/H;
.super Lf2/a;
.source "SourceFile"

# interfaces
.implements Lf2/G;


# direct methods
.method public constructor <init>(LN1/i;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, p2}, Lf2/a;-><init>(LN1/i;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf2/m0;->M()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
