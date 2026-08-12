.class Lcom/google/android/material/internal/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/t;->b(Landroid/view/View;Lcom/google/android/material/internal/t$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/internal/t$c;

.field final synthetic b:Lcom/google/android/material/internal/t$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/t$c;Lcom/google/android/material/internal/t$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/t$a;->a:Lcom/google/android/material/internal/t$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/internal/t$a;->b:Lcom/google/android/material/internal/t$d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LJ/w0;)LJ/w0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/internal/t$a;->a:Lcom/google/android/material/internal/t$c;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/internal/t$d;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/internal/t$a;->b:Lcom/google/android/material/internal/t$d;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/google/android/material/internal/t$d;-><init>(Lcom/google/android/material/internal/t$d;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/material/internal/t$c;->a(Landroid/view/View;LJ/w0;Lcom/google/android/material/internal/t$d;)LJ/w0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
