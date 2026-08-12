.class Landroidx/recyclerview/widget/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/c;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Landroidx/recyclerview/widget/c;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/c;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/c$b;->e:Landroidx/recyclerview/widget/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/recyclerview/widget/c$b;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c$b;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Landroidx/recyclerview/widget/c$i;

    .line 17
    .line 18
    iget-object v4, p0, Landroidx/recyclerview/widget/c$b;->e:Landroidx/recyclerview/widget/c;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/c;->R(Landroidx/recyclerview/widget/c$i;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c$b;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/recyclerview/widget/c$b;->e:Landroidx/recyclerview/widget/c;

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/recyclerview/widget/c;->n:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/recyclerview/widget/c$b;->d:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
