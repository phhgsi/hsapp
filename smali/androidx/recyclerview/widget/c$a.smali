.class Landroidx/recyclerview/widget/c$a;
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
    iput-object p1, p0, Landroidx/recyclerview/widget/c$a;->e:Landroidx/recyclerview/widget/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/recyclerview/widget/c$a;->d:Ljava/util/ArrayList;

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
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c$a;->d:Ljava/util/ArrayList;

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
    check-cast v3, Landroidx/recyclerview/widget/c$j;

    .line 17
    .line 18
    iget-object v4, p0, Landroidx/recyclerview/widget/c$a;->e:Landroidx/recyclerview/widget/c;

    .line 19
    .line 20
    iget-object v5, v3, Landroidx/recyclerview/widget/c$j;->a:Landroidx/recyclerview/widget/RecyclerView$C;

    .line 21
    .line 22
    iget v6, v3, Landroidx/recyclerview/widget/c$j;->b:I

    .line 23
    .line 24
    iget v7, v3, Landroidx/recyclerview/widget/c$j;->c:I

    .line 25
    .line 26
    iget v8, v3, Landroidx/recyclerview/widget/c$j;->d:I

    .line 27
    .line 28
    iget v9, v3, Landroidx/recyclerview/widget/c$j;->e:I

    .line 29
    .line 30
    invoke-virtual/range {v4 .. v9}, Landroidx/recyclerview/widget/c;->S(Landroidx/recyclerview/widget/RecyclerView$C;IIII)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c$a;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/recyclerview/widget/c$a;->e:Landroidx/recyclerview/widget/c;

    .line 40
    .line 41
    iget-object v0, v0, Landroidx/recyclerview/widget/c;->m:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v1, p0, Landroidx/recyclerview/widget/c$a;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method
