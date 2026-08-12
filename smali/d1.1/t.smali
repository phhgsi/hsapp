.class final Ld1/t;
.super Ld1/s;
.source "SourceFile"


# instance fields
.field private final d:Ljava/lang/String;

.field final synthetic e:Ld1/u;


# direct methods
.method constructor <init>(Ld1/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ld1/t;->e:Ld1/u;

    .line 2
    .line 3
    new-instance v0, Le1/p;

    .line 4
    .line 5
    const-string v1, "OnRequestInstallCallback"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Le1/p;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, v0, p2}, Ld1/s;-><init>(Ld1/u;Le1/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Ld1/t;->d:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ld1/s;->a(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ld1/u;->a(Landroid/os/Bundle;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ld1/s;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    new-instance v1, Lg1/a;

    .line 13
    .line 14
    invoke-static {p1}, Ld1/u;->a(Landroid/os/Bundle;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {v1, p1}, Lg1/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Ld1/s;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    iget-object v1, p0, Ld1/t;->e:Ld1/u;

    .line 28
    .line 29
    iget-object v2, p0, Ld1/t;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, p1, v2}, Ld1/u;->d(Ld1/u;Landroid/os/Bundle;Ljava/lang/String;)Ld1/a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
