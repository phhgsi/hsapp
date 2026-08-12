.class final Ld1/r;
.super Le1/q;
.source "SourceFile"


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic g:Ld1/u;


# direct methods
.method constructor <init>(Ld1/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1/r;->g:Ld1/u;

    .line 2
    .line 3
    iput-object p3, p0, Ld1/r;->e:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Ld1/r;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Le1/q;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Ld1/r;->g:Ld1/u;

    .line 2
    .line 3
    iget-object v0, v0, Ld1/u;->a:Le1/A;

    .line 4
    .line 5
    invoke-virtual {v0}, Le1/A;->e()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ld1/r;->g:Ld1/u;

    .line 10
    .line 11
    invoke-static {v1}, Ld1/u;->f(Ld1/u;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Ld1/r;->e:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ld1/u;->b(Ld1/u;Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, Ld1/t;

    .line 22
    .line 23
    iget-object v4, p0, Ld1/r;->g:Ld1/u;

    .line 24
    .line 25
    iget-object v5, p0, Ld1/r;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    iget-object v6, p0, Ld1/r;->e:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v3, v4, v5, v6}, Ld1/t;-><init>(Ld1/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v2, v1, v3}, Le1/k;->b(Ljava/lang/String;Landroid/os/Bundle;Le1/m;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception v0

    .line 37
    invoke-static {}, Ld1/u;->e()Le1/p;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Ld1/r;->e:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    new-array v3, v3, [Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-object v2, v3, v4

    .line 48
    .line 49
    const-string v2, "requestUpdateInfo(%s)"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2, v3}, Le1/p;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Ld1/r;->f:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 55
    .line 56
    new-instance v2, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 62
    .line 63
    .line 64
    return-void
.end method
