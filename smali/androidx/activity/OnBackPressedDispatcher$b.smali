.class final Landroidx/activity/OnBackPressedDispatcher$b;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;LI/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method constructor <init>(Landroidx/activity/OnBackPressedDispatcher;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$b;->e:Landroidx/activity/OnBackPressedDispatcher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LX1/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Landroidx/activity/b;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$b;->e:Landroidx/activity/OnBackPressedDispatcher;

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroidx/activity/OnBackPressedDispatcher;->d(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/activity/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher$b;->c(Landroidx/activity/b;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LL1/t;->a:LL1/t;

    .line 7
    .line 8
    return-object p1
.end method
