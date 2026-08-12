.class final Ls0/i$b;
.super Ls0/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ls0/o$c;

.field private b:Ls0/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls0/o$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Ls0/o;
    .locals 4

    .line 1
    new-instance v0, Ls0/i;

    .line 2
    .line 3
    iget-object v1, p0, Ls0/i$b;->a:Ls0/o$c;

    .line 4
    .line 5
    iget-object v2, p0, Ls0/i$b;->b:Ls0/o$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Ls0/i;-><init>(Ls0/o$c;Ls0/o$b;Ls0/i$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(Ls0/o$b;)Ls0/o$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/i$b;->b:Ls0/o$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ls0/o$c;)Ls0/o$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/i$b;->a:Ls0/o$c;

    .line 2
    .line 3
    return-object p0
.end method
