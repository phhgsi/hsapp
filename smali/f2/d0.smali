.class final Lf2/d0;
.super Lf2/h0;
.source "SourceFile"


# static fields
.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _invoked$volatile:I

.field private final e:Lf2/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lf2/d0;

    .line 2
    .line 3
    const-string v1, "_invoked$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lf2/d0;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lf2/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/h0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/d0;->e:Lf2/c0;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic y()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lf2/d0;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-static {}, Lf2/d0;->y()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lf2/d0;->e:Lf2/c0;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lf2/c0;->d(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
