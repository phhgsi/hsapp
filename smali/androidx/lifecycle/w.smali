.class public Landroidx/lifecycle/w;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/w$a;,
        Landroidx/lifecycle/w$b;,
        Landroidx/lifecycle/w$c;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/w$b;


# instance fields
.field private a:Landroidx/lifecycle/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/w$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/w$b;-><init>(LX1/g;)V

    sput-object v0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/w$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a(Landroidx/lifecycle/h$a;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/lifecycle/w;->b:Landroidx/lifecycle/w$b;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "activity"

    .line 14
    .line 15
    invoke-static {v1, v2}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/w$b;->a(Landroid/app/Activity;Landroidx/lifecycle/h$a;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private final b(Landroidx/lifecycle/w$a;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/lifecycle/w$a;->onCreate()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private final c(Landroidx/lifecycle/w$a;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/lifecycle/w$a;->onResume()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private final d(Landroidx/lifecycle/w$a;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/lifecycle/w$a;->onStart()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/w$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    .line 2
    .line 3
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/lifecycle/w;->b(Landroidx/lifecycle/w$a;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Landroidx/lifecycle/h$a;->ON_CREATE:Landroidx/lifecycle/h$a;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/lifecycle/h$a;->ON_DESTROY:Landroidx/lifecycle/h$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    .line 11
    .line 12
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/lifecycle/h$a;->ON_PAUSE:Landroidx/lifecycle/h$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->c(Landroidx/lifecycle/w$a;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Landroidx/lifecycle/h$a;->ON_RESUME:Landroidx/lifecycle/h$a;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/lifecycle/w;->a:Landroidx/lifecycle/w$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->d(Landroidx/lifecycle/w$a;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Landroidx/lifecycle/h$a;->ON_START:Landroidx/lifecycle/h$a;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/lifecycle/h$a;->ON_STOP:Landroidx/lifecycle/h$a;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/h$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
