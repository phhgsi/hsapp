.class public final synthetic La1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/b;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iput p2, p0, La1/b;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/b;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v1, p0, La1/b;->e:I

    invoke-static {v0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->J(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V

    return-void
.end method
