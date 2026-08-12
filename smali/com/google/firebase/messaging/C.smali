.class public final synthetic Lcom/google/firebase/messaging/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/D;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/C;->a:Lcom/google/firebase/messaging/D;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/C;->a:Lcom/google/firebase/messaging/D;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/D;->a(Lcom/google/firebase/messaging/D;Lcom/google/android/gms/tasks/Task;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
