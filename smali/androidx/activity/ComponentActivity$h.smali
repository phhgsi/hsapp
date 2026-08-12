.class final Landroidx/activity/ComponentActivity$h;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroidx/activity/ComponentActivity;


# direct methods
.method constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/ComponentActivity$h;->e:Landroidx/activity/ComponentActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity$h;->c()Landroidx/activity/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c()Landroidx/activity/D;
    .locals 4

    .line 1
    new-instance v0, Landroidx/activity/D;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/activity/ComponentActivity$h;->e:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/activity/ComponentActivity;->J(Landroidx/activity/ComponentActivity;)Landroidx/activity/ComponentActivity$d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Landroidx/activity/ComponentActivity$h$a;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/activity/ComponentActivity$h;->e:Landroidx/activity/ComponentActivity;

    .line 12
    .line 13
    invoke-direct {v2, v3}, Landroidx/activity/ComponentActivity$h$a;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/activity/D;-><init>(Ljava/util/concurrent/Executor;LW1/a;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
