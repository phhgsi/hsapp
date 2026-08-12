.class public final synthetic Lcom/google/android/material/navigation/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:LT0/c;


# direct methods
.method public synthetic constructor <init>(LT0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/navigation/o;->d:LT0/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/o;->d:LT0/c;

    invoke-virtual {v0}, LT0/c;->d()V

    return-void
.end method
