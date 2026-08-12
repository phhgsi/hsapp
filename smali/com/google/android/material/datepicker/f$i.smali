.class Lcom/google/android/material/datepicker/f$i;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/f;->r(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/datepicker/k;

.field final synthetic b:Lcom/google/android/material/datepicker/f;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/f;Lcom/google/android/material/datepicker/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/datepicker/f$i;->a:Lcom/google/android/material/datepicker/k;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    .line 1
    if-gez p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/f;->z()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c2()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/f;->z()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e2()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    iget-object p2, p0, Lcom/google/android/material/datepicker/f$i;->a:Lcom/google/android/material/datepicker/k;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/k;->y(I)Lcom/google/android/material/datepicker/Month;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object p3, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 31
    .line 32
    invoke-static {p3, p2}, Lcom/google/android/material/datepicker/f;->o(Lcom/google/android/material/datepicker/f;Lcom/google/android/material/datepicker/Month;)Lcom/google/android/material/datepicker/Month;

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 36
    .line 37
    invoke-static {p3}, Lcom/google/android/material/datepicker/f;->p(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/button/MaterialButton;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iget-object v0, p0, Lcom/google/android/material/datepicker/f$i;->a:Lcom/google/android/material/datepicker/k;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/k;->z(I)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/material/datepicker/f$i;->a:Lcom/google/android/material/datepicker/k;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/k;->A(Lcom/google/android/material/datepicker/Month;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-object p2, p0, Lcom/google/android/material/datepicker/f$i;->b:Lcom/google/android/material/datepicker/f;

    .line 57
    .line 58
    invoke-static {p2, p1}, Lcom/google/android/material/datepicker/f;->q(Lcom/google/android/material/datepicker/f;I)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
