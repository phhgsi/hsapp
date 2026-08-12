.class final Landroidx/lifecycle/B$a;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/B;-><init>(Landroidx/savedstate/a;Landroidx/lifecycle/K;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroidx/lifecycle/K;


# direct methods
.method constructor <init>(Landroidx/lifecycle/K;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/B$a;->e:Landroidx/lifecycle/K;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/lifecycle/B$a;->c()Landroidx/lifecycle/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/C;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/B$a;->e:Landroidx/lifecycle/K;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/lifecycle/A;->e(Landroidx/lifecycle/K;)Landroidx/lifecycle/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
