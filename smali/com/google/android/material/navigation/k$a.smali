.class Lcom/google/android/material/navigation/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/k;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/navigation/k;


# direct methods
.method constructor <init>(Lcom/google/android/material/navigation/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/k$a;->a:Lcom/google/android/material/navigation/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/material/navigation/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/material/navigation/g;->getItemData()Landroidx/appcompat/view/menu/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/navigation/k$a;->a:Lcom/google/android/material/navigation/k;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/material/navigation/k;->c(Lcom/google/android/material/navigation/k;)Lcom/google/android/material/navigation/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/google/android/material/navigation/k$a;->a:Lcom/google/android/material/navigation/k;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/google/android/material/navigation/k;->a(Lcom/google/android/material/navigation/k;)Lcom/google/android/material/navigation/NavigationBarPresenter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/material/navigation/i;->e(Landroid/view/MenuItem;Landroidx/appcompat/view/menu/j;I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Landroid/view/MenuItem;->isCheckable()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/k$a;->a:Lcom/google/android/material/navigation/k;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/google/android/material/navigation/k;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method
