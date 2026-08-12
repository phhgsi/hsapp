.class Lcom/google/android/material/internal/i$c$a;
.super LJ/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/i$c;->L(Landroid/view/View;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:Z

.field final synthetic f:Lcom/google/android/material/internal/i$c;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/i$c;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/i$c$a;->f:Lcom/google/android/material/internal/i$c;

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/material/internal/i$c$a;->d:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/google/android/material/internal/i$c$a;->e:Z

    .line 6
    .line 7
    invoke-direct {p0}, LJ/a;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;LK/y;)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2}, LJ/a;->g(Landroid/view/View;LK/y;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/internal/i$c$a;->f:Lcom/google/android/material/internal/i$c;

    .line 5
    .line 6
    iget v1, p0, Lcom/google/android/material/internal/i$c$a;->d:I

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/google/android/material/internal/i$c;->A(Lcom/google/android/material/internal/i$c;I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-boolean v6, p0, Lcom/google/android/material/internal/i$c$a;->e:Z

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x1

    .line 21
    invoke-static/range {v2 .. v7}, LK/y$g;->a(IIIIZZ)LK/y$g;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2, p1}, LK/y;->v0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
