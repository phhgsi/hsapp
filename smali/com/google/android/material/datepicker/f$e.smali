.class Lcom/google/android/material/datepicker/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/datepicker/f$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/f;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/datepicker/f;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/f$e;->a:Lcom/google/android/material/datepicker/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/f$e;->a:Lcom/google/android/material/datepicker/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/datepicker/f;->l(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->h()Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1, p2}, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;->b(J)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/f$e;->a:Lcom/google/android/material/datepicker/f;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/google/android/material/datepicker/f;->m(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/DateSelector;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method
