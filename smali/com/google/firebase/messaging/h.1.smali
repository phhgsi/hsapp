.class public final synthetic Lcom/google/firebase/messaging/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lcom/google/firebase/messaging/i;

.field public final synthetic e:Landroid/content/Intent;

.field public final synthetic f:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/i;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/h;->d:Lcom/google/firebase/messaging/i;

    iput-object p2, p0, Lcom/google/firebase/messaging/h;->e:Landroid/content/Intent;

    iput-object p3, p0, Lcom/google/firebase/messaging/h;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/h;->d:Lcom/google/firebase/messaging/i;

    iget-object v1, p0, Lcom/google/firebase/messaging/h;->e:Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/firebase/messaging/h;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/i;->a(Lcom/google/firebase/messaging/i;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
