.class final Le1/t;
.super Le1/q;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic f:Le1/q;

.field final synthetic g:Le1/A;


# direct methods
.method constructor <init>(Le1/A;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Le1/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le1/t;->g:Le1/A;

    .line 2
    .line 3
    iput-object p3, p0, Le1/t;->e:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    iput-object p4, p0, Le1/t;->f:Le1/q;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Le1/q;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Le1/t;->g:Le1/A;

    .line 2
    .line 3
    invoke-static {v0}, Le1/A;->g(Le1/A;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Le1/t;->g:Le1/A;

    .line 9
    .line 10
    iget-object v2, p0, Le1/t;->e:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    invoke-static {v1, v2}, Le1/A;->n(Le1/A;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Le1/t;->g:Le1/A;

    .line 16
    .line 17
    invoke-static {v1}, Le1/A;->i(Le1/A;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_0

    .line 26
    .line 27
    iget-object v1, p0, Le1/t;->g:Le1/A;

    .line 28
    .line 29
    invoke-static {v1}, Le1/A;->f(Le1/A;)Le1/p;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "Already connected to the service."

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    new-array v3, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Le1/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    iget-object v1, p0, Le1/t;->g:Le1/A;

    .line 45
    .line 46
    iget-object v2, p0, Le1/t;->f:Le1/q;

    .line 47
    .line 48
    invoke-static {v1, v2}, Le1/A;->p(Le1/A;Le1/q;)V

    .line 49
    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw v1
.end method
