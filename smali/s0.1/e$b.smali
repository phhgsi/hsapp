.class final Ls0/e$b;
.super Ls0/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ls0/k$b;

.field private b:Ls0/a;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls0/k$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Ls0/k;
    .locals 4

    .line 1
    new-instance v0, Ls0/e;

    .line 2
    .line 3
    iget-object v1, p0, Ls0/e$b;->a:Ls0/k$b;

    .line 4
    .line 5
    iget-object v2, p0, Ls0/e$b;->b:Ls0/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Ls0/e;-><init>(Ls0/k$b;Ls0/a;Ls0/e$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(Ls0/a;)Ls0/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/e$b;->b:Ls0/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ls0/k$b;)Ls0/k$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/e$b;->a:Ls0/k$b;

    .line 2
    .line 3
    return-object p0
.end method
