.class public final Lj2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj2/a$a;,
        Lj2/a$b;,
        Lj2/a$c;,
        Lj2/a$d;
    }
.end annotation


# static fields
.field public static final k:Lj2/a$a;

.field private static final synthetic l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field private static final synthetic n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final o:Lh2/y;


# instance fields
.field private volatile synthetic _isTerminated$volatile:I

.field private volatile synthetic controlState$volatile:J

.field public final d:I

.field public final e:I

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Lj2/d;

.field public final i:Lj2/d;

.field public final j:Lh2/w;

.field private volatile synthetic parkedWorkersStack$volatile:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj2/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lj2/a$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj2/a;->k:Lj2/a$a;

    .line 8
    .line 9
    const-string v0, "parkedWorkersStack$volatile"

    .line 10
    .line 11
    const-class v1, Lj2/a;

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lj2/a;->l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    const-string v0, "controlState$volatile"

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lj2/a;->m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    const-string v0, "_isTerminated$volatile"

    .line 28
    .line 29
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lj2/a;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    new-instance v0, Lh2/y;

    .line 36
    .line 37
    const-string v1, "NOT_IN_STACK"

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lh2/y;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lj2/a;->o:Lh2/y;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lj2/a;->d:I

    .line 5
    .line 6
    iput p2, p0, Lj2/a;->e:I

    .line 7
    .line 8
    iput-wide p3, p0, Lj2/a;->f:J

    .line 9
    .line 10
    iput-object p5, p0, Lj2/a;->g:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p5, 0x1

    .line 13
    if-lt p1, p5, :cond_3

    .line 14
    .line 15
    const-string p5, "Max pool size "

    .line 16
    .line 17
    if-lt p2, p1, :cond_2

    .line 18
    .line 19
    const v0, 0x1ffffe

    .line 20
    .line 21
    .line 22
    if-gt p2, v0, :cond_1

    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    cmp-long p2, p3, v0

    .line 27
    .line 28
    if-lez p2, :cond_0

    .line 29
    .line 30
    new-instance p2, Lj2/d;

    .line 31
    .line 32
    invoke-direct {p2}, Lj2/d;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lj2/a;->h:Lj2/d;

    .line 36
    .line 37
    new-instance p2, Lj2/d;

    .line 38
    .line 39
    invoke-direct {p2}, Lj2/d;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lj2/a;->i:Lj2/d;

    .line 43
    .line 44
    new-instance p2, Lh2/w;

    .line 45
    .line 46
    add-int/lit8 p3, p1, 0x1

    .line 47
    .line 48
    mul-int/lit8 p3, p3, 0x2

    .line 49
    .line 50
    invoke-direct {p2, p3}, Lh2/w;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, Lj2/a;->j:Lh2/w;

    .line 54
    .line 55
    int-to-long p1, p1

    .line 56
    const/16 p3, 0x2a

    .line 57
    .line 58
    shl-long/2addr p1, p3

    .line 59
    iput-wide p1, p0, Lj2/a;->controlState$volatile:J

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    iput p1, p0, Lj2/a;->_isTerminated$volatile:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string p2, "Idle worker keep alive time "

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p2, " must be positive"

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p2

    .line 97
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p2, " should not exceed maximal supported number of threads 2097150"

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p2

    .line 127
    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p2, " should be greater than or equals to core pool size "

    .line 139
    .line 140
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p2

    .line 160
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string p3, "Core pool size "

    .line 166
    .line 167
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string p1, " should be at least 1"

    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p2
.end method

.method private final A(JZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0}, Lj2/a;->G()Z

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2}, Lj2/a;->E(J)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :cond_2
    invoke-direct {p0}, Lj2/a;->G()Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final D(Lj2/a$c;Lj2/h;Z)Lj2/h;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Lj2/a$c;->f:Lj2/a$d;

    .line 5
    .line 6
    sget-object v1, Lj2/a$d;->h:Lj2/a$d;

    .line 7
    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-object p2

    .line 11
    :cond_1
    iget-object v0, p2, Lj2/h;->e:Lj2/i;

    .line 12
    .line 13
    invoke-interface {v0}, Lj2/i;->b()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p1, Lj2/a$c;->f:Lj2/a$d;

    .line 20
    .line 21
    sget-object v1, Lj2/a$d;->e:Lj2/a$d;

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_2
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p1, Lj2/a$c;->j:Z

    .line 28
    .line 29
    iget-object p1, p1, Lj2/a$c;->d:Lj2/o;

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Lj2/o;->a(Lj2/h;Z)Lj2/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method private final E(J)Z
    .locals 3

    .line 1
    const-wide/32 v0, 0x1fffff

    .line 2
    .line 3
    .line 4
    and-long/2addr v0, p1

    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0x3ffffe00000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    shr-long/2addr p1, v1

    .line 15
    long-to-int p1, p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-static {v0, p1}, Lb2/d;->a(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iget v0, p0, Lj2/a;->d:I

    .line 23
    .line 24
    if-ge p2, v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Lj2/a;->d()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v0, 0x1

    .line 31
    if-ne p2, v0, :cond_0

    .line 32
    .line 33
    iget v1, p0, Lj2/a;->d:I

    .line 34
    .line 35
    if-le v1, v0, :cond_0

    .line 36
    .line 37
    invoke-direct {p0}, Lj2/a;->d()I

    .line 38
    .line 39
    .line 40
    :cond_0
    if-lez p2, :cond_1

    .line 41
    .line 42
    return v0

    .line 43
    :cond_1
    return p1
.end method

.method static synthetic F(Lj2/a;JILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Lj2/a;->E(J)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private final G()Z
    .locals 4

    .line 1
    :cond_0
    invoke-direct {p0}, Lj2/a;->u()Lj2/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {}, Lj2/a$c;->j()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, -0x1

    .line 14
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0
.end method

.method public static final synthetic a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 1
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final b(Lj2/h;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lj2/h;->e:Lj2/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/i;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lj2/a;->i:Lj2/d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lh2/o;->a(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    iget-object v0, p0, Lj2/a;->h:Lj2/d;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lh2/o;->a(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method private final d()I
    .locals 8

    .line 1
    iget-object v0, p0, Lj2/a;->j:Lh2/w;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lj2/a;->isTerminated()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    const/4 v0, -0x1

    .line 12
    return v0

    .line 13
    :cond_0
    :try_start_1
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/32 v3, 0x1fffff

    .line 22
    .line 23
    .line 24
    and-long v5, v1, v3

    .line 25
    .line 26
    long-to-int v5, v5

    .line 27
    const-wide v6, 0x3ffffe00000L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v1, v6

    .line 33
    const/16 v6, 0x15

    .line 34
    .line 35
    shr-long/2addr v1, v6

    .line 36
    long-to-int v1, v1

    .line 37
    sub-int v1, v5, v1

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v1, v2}, Lb2/d;->a(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget v6, p0, Lj2/a;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    if-lt v1, v6, :cond_1

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return v2

    .line 50
    :cond_1
    :try_start_2
    iget v6, p0, Lj2/a;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    if-lt v5, v6, :cond_2

    .line 53
    .line 54
    monitor-exit v0

    .line 55
    return v2

    .line 56
    :cond_2
    :try_start_3
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    and-long/2addr v5, v3

    .line 65
    long-to-int v2, v5

    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    if-lez v2, :cond_4

    .line 69
    .line 70
    iget-object v5, p0, Lj2/a;->j:Lh2/w;

    .line 71
    .line 72
    invoke-virtual {v5, v2}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_4

    .line 77
    .line 78
    new-instance v5, Lj2/a$c;

    .line 79
    .line 80
    invoke-direct {v5, p0, v2}, Lj2/a$c;-><init>(Lj2/a;I)V

    .line 81
    .line 82
    .line 83
    iget-object v6, p0, Lj2/a;->j:Lh2/w;

    .line 84
    .line 85
    invoke-virtual {v6, v2, v5}, Lh2/w;->c(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    and-long/2addr v3, v6

    .line 97
    long-to-int v3, v3

    .line 98
    if-ne v2, v3, :cond_3

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    monitor-exit v0

    .line 103
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 104
    .line 105
    .line 106
    return v1

    .line 107
    :cond_3
    :try_start_4
    const-string v1, "Failed requirement."

    .line 108
    .line 109
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v2

    .line 115
    :catchall_0
    move-exception v1

    .line 116
    goto :goto_0

    .line 117
    :cond_4
    const-string v1, "Failed requirement."

    .line 118
    .line 119
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 120
    .line 121
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 125
    :goto_0
    monitor-exit v0

    .line 126
    throw v1
.end method

.method private final h()Lj2/a$c;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lj2/a$c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lj2/a$c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, Lj2/a$c;->a(Lj2/a$c;)Lj2/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1, p0}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    return-object v2
.end method

.method public static synthetic l(Lj2/a;Ljava/lang/Runnable;Lj2/i;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Lj2/l;->g:Lj2/i;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lj2/a;->i(Ljava/lang/Runnable;Lj2/i;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final synthetic p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lj2/a;->m:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final synthetic q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lj2/a;->l:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final synthetic r()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, Lj2/a;->n:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final s(Lj2/a$c;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lj2/a$c;->i()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    sget-object v0, Lj2/a;->o:Lh2/y;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p1, Lj2/a$c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lj2/a$c;->h()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    invoke-virtual {p1}, Lj2/a$c;->i()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0
.end method

.method private final u()Lj2/a$c;
    .locals 10

    .line 1
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    const-wide/32 v1, 0x1fffff

    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v3

    .line 13
    long-to-int v1, v1

    .line 14
    iget-object v2, p0, Lj2/a;->j:Lh2/w;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v7, v1

    .line 21
    check-cast v7, Lj2/a$c;

    .line 22
    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    :cond_1
    const-wide/32 v1, 0x200000

    .line 28
    .line 29
    .line 30
    add-long/2addr v1, v3

    .line 31
    const-wide/32 v5, -0x200000

    .line 32
    .line 33
    .line 34
    and-long/2addr v1, v5

    .line 35
    invoke-direct {p0, v7}, Lj2/a;->s(Lj2/a$c;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-ltz v5, :cond_0

    .line 40
    .line 41
    move-wide v8, v1

    .line 42
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    int-to-long v5, v5

    .line 47
    or-long/2addr v5, v8

    .line 48
    move-object v2, p0

    .line 49
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    sget-object v0, Lj2/a;->o:Lh2/y;

    .line 56
    .line 57
    invoke-virtual {v7, v0}, Lj2/a$c;->r(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v7
.end method


# virtual methods
.method public final C()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lj2/a;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static {p0, v2, v3, v0, v1}, Lj2/a;->F(Lj2/a;JILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    invoke-direct {p0}, Lj2/a;->G()Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lj2/a;->y(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    invoke-static/range {v0 .. v5}, Lj2/a;->l(Lj2/a;Ljava/lang/Runnable;Lj2/i;ZILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(Ljava/lang/Runnable;Lj2/i;)Lj2/h;
    .locals 3

    .line 1
    sget-object v0, Lj2/l;->f:Lj2/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj2/g;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    instance-of v2, p1, Lj2/h;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast p1, Lj2/h;

    .line 12
    .line 13
    iput-wide v0, p1, Lj2/h;->d:J

    .line 14
    .line 15
    iput-object p2, p1, Lj2/h;->e:Lj2/i;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v2, Lj2/k;

    .line 19
    .line 20
    invoke-direct {v2, p1, v0, v1, p2}, Lj2/k;-><init>(Ljava/lang/Runnable;JLj2/i;)V

    .line 21
    .line 22
    .line 23
    return-object v2
.end method

.method public final i(Ljava/lang/Runnable;Lj2/i;Z)V
    .locals 5

    .line 1
    invoke-static {}, Lf2/c;->a()Lf2/b;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lj2/a;->g(Ljava/lang/Runnable;Lj2/i;)Lj2/h;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p1, Lj2/h;->e:Lj2/i;

    .line 9
    .line 10
    invoke-interface {p2}, Lj2/i;->b()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne p2, v1, :cond_0

    .line 17
    .line 18
    move p2, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v0

    .line 21
    :goto_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-wide/32 v3, 0x200000

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    :goto_1
    invoke-direct {p0}, Lj2/a;->h()Lj2/a$c;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {p0, v4, p1, p3}, Lj2/a;->D(Lj2/a$c;Lj2/h;Z)Lj2/h;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lj2/a;->b(Lj2/h;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance p1, Ljava/util/concurrent/RejectedExecutionException;

    .line 55
    .line 56
    new-instance p2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object p3, p0, Lj2/a;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p3, " was terminated"

    .line 67
    .line 68
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-direct {p1, p2}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_3
    :goto_2
    if-eqz p3, :cond_4

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    move v0, v1

    .line 84
    :cond_4
    if-eqz p2, :cond_5

    .line 85
    .line 86
    invoke-direct {p0, v2, v3, v0}, Lj2/a;->A(JZ)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_5
    if-eqz v0, :cond_6

    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    invoke-virtual {p0}, Lj2/a;->C()V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final isTerminated()Z
    .locals 1

    .line 1
    invoke-static {}, Lj2/a;->r()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lj2/a;->j:Lh2/w;

    .line 7
    .line 8
    invoke-virtual {v1}, Lh2/w;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    move v4, v2

    .line 15
    move v5, v4

    .line 16
    move v6, v5

    .line 17
    move v7, v6

    .line 18
    move v8, v3

    .line 19
    :goto_0
    if-ge v8, v1, :cond_7

    .line 20
    .line 21
    iget-object v9, p0, Lj2/a;->j:Lh2/w;

    .line 22
    .line 23
    invoke-virtual {v9, v8}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    check-cast v9, Lj2/a$c;

    .line 28
    .line 29
    if-nez v9, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v10, v9, Lj2/a$c;->d:Lj2/o;

    .line 33
    .line 34
    invoke-virtual {v10}, Lj2/o;->i()I

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    iget-object v9, v9, Lj2/a$c;->f:Lj2/a$d;

    .line 39
    .line 40
    sget-object v11, Lj2/a$b;->a:[I

    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    aget v9, v11, v9

    .line 47
    .line 48
    if-eq v9, v3, :cond_5

    .line 49
    .line 50
    const/4 v11, 0x2

    .line 51
    if-eq v9, v11, :cond_4

    .line 52
    .line 53
    const/4 v11, 0x3

    .line 54
    if-eq v9, v11, :cond_3

    .line 55
    .line 56
    const/4 v11, 0x4

    .line 57
    if-eq v9, v11, :cond_2

    .line 58
    .line 59
    const/4 v10, 0x5

    .line 60
    if-eq v9, v10, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 67
    .line 68
    if-lez v10, :cond_6

    .line 69
    .line 70
    new-instance v9, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/16 v10, 0x64

    .line 79
    .line 80
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    new-instance v9, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const/16 v10, 0x63

    .line 102
    .line 103
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    new-instance v9, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const/16 v10, 0x62

    .line 125
    .line 126
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    :cond_6
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v8

    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lj2/a;->g:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const/16 v3, 0x40

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-static {p0}, Lf2/D;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v3, "[Pool Size {core = "

    .line 173
    .line 174
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget v3, p0, Lj2/a;->d:I

    .line 178
    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v3, ", max = "

    .line 183
    .line 184
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    iget v3, p0, Lj2/a;->e:I

    .line 188
    .line 189
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v3, "}, Worker States {CPU = "

    .line 193
    .line 194
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v2, ", blocking = "

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v2, ", parked = "

    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v2, ", dormant = "

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, ", terminated = "

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v2, "}, running workers queues = "

    .line 233
    .line 234
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v0, ", global CPU queue size = "

    .line 241
    .line 242
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    iget-object v0, p0, Lj2/a;->h:Lj2/d;

    .line 246
    .line 247
    invoke-virtual {v0}, Lh2/o;->c()I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v0, ", global blocking queue size = "

    .line 255
    .line 256
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lj2/a;->i:Lj2/d;

    .line 260
    .line 261
    invoke-virtual {v0}, Lh2/o;->c()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v0, ", Control State {created workers= "

    .line 269
    .line 270
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-wide/32 v2, 0x1fffff

    .line 274
    .line 275
    .line 276
    and-long/2addr v2, v8

    .line 277
    long-to-int v0, v2

    .line 278
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v0, ", blocking tasks = "

    .line 282
    .line 283
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-wide v2, 0x3ffffe00000L

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    and-long/2addr v2, v8

    .line 292
    const/16 v0, 0x15

    .line 293
    .line 294
    shr-long/2addr v2, v0

    .line 295
    long-to-int v0, v2

    .line 296
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v0, ", CPUs acquired = "

    .line 300
    .line 301
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    iget v0, p0, Lj2/a;->d:I

    .line 305
    .line 306
    const-wide v2, 0x7ffffc0000000000L

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    and-long/2addr v2, v8

    .line 312
    const/16 v4, 0x2a

    .line 313
    .line 314
    shr-long/2addr v2, v4

    .line 315
    long-to-int v2, v2

    .line 316
    sub-int/2addr v0, v2

    .line 317
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v0, "}]"

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    return-object v0
.end method

.method public final v(Lj2/a$c;)Z
    .locals 9

    .line 1
    invoke-virtual {p1}, Lj2/a$c;->i()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lj2/a;->o:Lh2/y;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    const-wide/32 v1, 0x1fffff

    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    long-to-int v1, v1

    .line 24
    const-wide/32 v5, 0x200000

    .line 25
    .line 26
    .line 27
    add-long/2addr v5, v3

    .line 28
    const-wide/32 v7, -0x200000

    .line 29
    .line 30
    .line 31
    and-long/2addr v5, v7

    .line 32
    invoke-virtual {p1}, Lj2/a$c;->h()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v7, p0, Lj2/a;->j:Lh2/w;

    .line 37
    .line 38
    invoke-virtual {v7, v1}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1, v1}, Lj2/a$c;->r(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    int-to-long v7, v2

    .line 50
    or-long/2addr v5, v7

    .line 51
    move-object v2, p0

    .line 52
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    return p1
.end method

.method public final w(Lj2/a$c;II)V
    .locals 9

    .line 1
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    const-wide/32 v1, 0x1fffff

    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v3

    .line 13
    long-to-int v1, v1

    .line 14
    const-wide/32 v5, 0x200000

    .line 15
    .line 16
    .line 17
    add-long/2addr v5, v3

    .line 18
    const-wide/32 v7, -0x200000

    .line 19
    .line 20
    .line 21
    and-long/2addr v5, v7

    .line 22
    if-ne v1, p2, :cond_2

    .line 23
    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lj2/a;->s(Lj2/a$c;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, p3

    .line 32
    :cond_2
    :goto_0
    if-ltz v1, :cond_0

    .line 33
    .line 34
    move v2, v1

    .line 35
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    int-to-long v7, v2

    .line 40
    or-long/2addr v5, v7

    .line 41
    move-object v2, p0

    .line 42
    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final x(Lj2/h;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lf2/c;->a()Lf2/b;

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lf2/c;->a()Lf2/b;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    invoke-static {}, Lf2/c;->a()Lf2/b;

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final y(J)V
    .locals 7

    .line 1
    invoke-static {}, Lj2/a;->r()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

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
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0}, Lj2/a;->h()Lj2/a$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lj2/a;->j:Lh2/w;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    invoke-static {}, Lj2/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-wide/32 v5, 0x1fffff

    .line 30
    .line 31
    .line 32
    and-long/2addr v3, v5

    .line 33
    long-to-int v3, v3

    .line 34
    monitor-exit v1

    .line 35
    if-gt v2, v3, :cond_3

    .line 36
    .line 37
    move v1, v2

    .line 38
    :goto_0
    iget-object v4, p0, Lj2/a;->j:Lh2/w;

    .line 39
    .line 40
    invoke-virtual {v4, v1}, Lh2/w;->b(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, LX1/k;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v4, Lj2/a$c;

    .line 48
    .line 49
    if-eq v4, v0, :cond_2

    .line 50
    .line 51
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    sget-object v6, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    .line 56
    .line 57
    if-eq v5, v6, :cond_1

    .line 58
    .line 59
    invoke-static {v4}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iget-object v4, v4, Lj2/a$c;->d:Lj2/o;

    .line 67
    .line 68
    iget-object v5, p0, Lj2/a;->i:Lj2/d;

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lj2/o;->j(Lj2/d;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    if-eq v1, v3, :cond_3

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object p1, p0, Lj2/a;->i:Lj2/d;

    .line 79
    .line 80
    invoke-virtual {p1}, Lh2/o;->b()V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lj2/a;->h:Lj2/d;

    .line 84
    .line 85
    invoke-virtual {p1}, Lh2/o;->b()V

    .line 86
    .line 87
    .line 88
    :goto_2
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Lj2/a$c;->g(Z)Lj2/h;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    :cond_4
    iget-object p1, p0, Lj2/a;->h:Lj2/d;

    .line 97
    .line 98
    invoke-virtual {p1}, Lh2/o;->e()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lj2/h;

    .line 103
    .line 104
    if-nez p1, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, Lj2/a;->i:Lj2/d;

    .line 107
    .line 108
    invoke-virtual {p1}, Lh2/o;->e()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Lj2/h;

    .line 113
    .line 114
    if-nez p1, :cond_6

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    sget-object p1, Lj2/a$d;->h:Lj2/a$d;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Lj2/a$c;->u(Lj2/a$d;)Z

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-static {}, Lj2/a;->q()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const-wide/16 v0, 0x0

    .line 128
    .line 129
    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lj2/a;->p()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    invoke-virtual {p0, p1}, Lj2/a;->x(Lj2/h;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception p1

    .line 145
    monitor-exit v1

    .line 146
    throw p1
.end method
