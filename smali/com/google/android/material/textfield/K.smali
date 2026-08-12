.class public final synthetic Lcom/google/android/material/textfield/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/internal/m;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/K;->a:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final a(Landroid/text/StaticLayout$Builder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/K;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->b(Lcom/google/android/material/textfield/TextInputLayout;Landroid/text/StaticLayout$Builder;)V

    return-void
.end method
