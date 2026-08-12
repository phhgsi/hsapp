.class abstract Ld1/s;
.super Le1/l;
.source "SourceFile"


# instance fields
.field final a:Le1/p;

.field final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Ld1/u;


# direct methods
.method constructor <init>(Ld1/u;Le1/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1/s;->c:Ld1/u;

    .line 2
    .line 3
    invoke-direct {p0}, Le1/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ld1/s;->a:Le1/p;

    .line 7
    .line 8
    iput-object p3, p0, Ld1/s;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ld1/s;->c:Ld1/u;

    .line 2
    .line 3
    iget-object p1, p1, Ld1/u;->a:Le1/A;

    .line 4
    .line 5
    iget-object v0, p0, Ld1/s;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Le1/A;->u(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Ld1/s;->a:Le1/p;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "onRequestInfo"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Le1/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ld1/s;->c:Ld1/u;

    .line 2
    .line 3
    iget-object p1, p1, Ld1/u;->a:Le1/A;

    .line 4
    .line 5
    iget-object v0, p0, Ld1/s;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Le1/A;->u(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Ld1/s;->a:Le1/p;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "onCompleteUpdate"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Le1/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    return-void
.end method
