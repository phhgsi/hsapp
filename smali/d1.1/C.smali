.class final Ld1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld1/e;


# instance fields
.field private final a:Ld1/C;

.field private final b:Le1/f;

.field private final c:Le1/f;

.field private final d:Le1/f;

.field private final e:Le1/f;

.field private final f:Le1/f;

.field private final g:Le1/f;


# direct methods
.method synthetic constructor <init>(Ld1/n;Ld1/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Ld1/C;->a:Ld1/C;

    .line 5
    .line 6
    new-instance p2, Ld1/p;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Ld1/p;-><init>(Ld1/n;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Ld1/C;->b:Le1/f;

    .line 12
    .line 13
    new-instance p1, Ld1/x;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ld1/x;-><init>(Le1/f;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Le1/d;->a(Le1/f;)Le1/f;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Ld1/C;->c:Le1/f;

    .line 23
    .line 24
    new-instance v0, Ld1/v;

    .line 25
    .line 26
    invoke-direct {v0, p2, p1}, Ld1/v;-><init>(Le1/f;Le1/f;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Le1/d;->a(Le1/f;)Le1/f;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Ld1/C;->d:Le1/f;

    .line 34
    .line 35
    new-instance v0, Ld1/j;

    .line 36
    .line 37
    invoke-direct {v0, p2}, Ld1/j;-><init>(Le1/f;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Le1/d;->a(Le1/f;)Le1/f;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Ld1/C;->e:Le1/f;

    .line 45
    .line 46
    new-instance v1, Ld1/m;

    .line 47
    .line 48
    invoke-direct {v1, p1, v0, p2}, Ld1/m;-><init>(Le1/f;Le1/f;Le1/f;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Le1/d;->a(Le1/f;)Le1/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Ld1/C;->f:Le1/f;

    .line 56
    .line 57
    new-instance p2, Ld1/o;

    .line 58
    .line 59
    invoke-direct {p2, p1}, Ld1/o;-><init>(Le1/f;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Le1/d;->a(Le1/f;)Le1/f;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Ld1/C;->g:Le1/f;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final zza()Ld1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/C;->g:Le1/f;

    .line 2
    .line 3
    invoke-interface {v0}, Le1/f;->zza()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld1/b;

    .line 8
    .line 9
    return-object v0
.end method
