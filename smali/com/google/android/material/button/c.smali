.class public final synthetic Lcom/google/android/material/button/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic d:Lcom/google/android/material/button/d;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/button/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/button/c;->d:Lcom/google/android/material/button/d;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/button/c;->d:Lcom/google/android/material/button/d;

    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    check-cast p2, Lcom/google/android/material/button/MaterialButton;

    invoke-static {v0, p1, p2}, Lcom/google/android/material/button/d;->a(Lcom/google/android/material/button/d;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/button/MaterialButton;)I

    move-result p1

    return p1
.end method
