.class Landroidx/fragment/app/FragmentManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;


# instance fields
.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Landroidx/lifecycle/h;

.field final synthetic f:Landroidx/fragment/app/FragmentManager;


# virtual methods
.method public d(Landroidx/lifecycle/n;Landroidx/lifecycle/h$a;)V
    .locals 1

    .line 1
    sget-object p1, Landroidx/lifecycle/h$a;->ON_START:Landroidx/lifecycle/h$a;

    .line 2
    .line 3
    if-ne p2, p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->f:Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->f(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->d:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/os/Bundle;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    sget-object p1, Landroidx/lifecycle/h$a;->ON_DESTROY:Landroidx/lifecycle/h$a;

    .line 25
    .line 26
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->e:Landroidx/lifecycle/h;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroidx/lifecycle/h;->c(Landroidx/lifecycle/m;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->f:Landroidx/fragment/app/FragmentManager;

    .line 34
    .line 35
    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->g(Landroidx/fragment/app/FragmentManager;)Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p2, p0, Landroidx/fragment/app/FragmentManager$6;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method
