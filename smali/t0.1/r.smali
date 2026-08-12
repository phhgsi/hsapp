.class final Lt0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/h;


# instance fields
.field private final a:Lt0/o;

.field private final b:Ljava/lang/String;

.field private final c:Lr0/c;

.field private final d:Lr0/g;

.field private final e:Lt0/s;


# direct methods
.method constructor <init>(Lt0/o;Ljava/lang/String;Lr0/c;Lr0/g;Lt0/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt0/r;->a:Lt0/o;

    .line 5
    .line 6
    iput-object p2, p0, Lt0/r;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lt0/r;->c:Lr0/c;

    .line 9
    .line 10
    iput-object p4, p0, Lt0/r;->d:Lr0/g;

    .line 11
    .line 12
    iput-object p5, p0, Lt0/r;->e:Lt0/s;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lr0/d;)V
    .locals 1

    .line 1
    new-instance v0, Lt0/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lt0/q;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lt0/r;->c(Lr0/d;Lr0/j;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(Lr0/d;Lr0/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/r;->e:Lt0/s;

    .line 2
    .line 3
    invoke-static {}, Lt0/n;->a()Lt0/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lt0/r;->a:Lt0/o;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lt0/n$a;->e(Lt0/o;)Lt0/n$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, Lt0/n$a;->c(Lr0/d;)Lt0/n$a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, Lt0/r;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lt0/n$a;->f(Ljava/lang/String;)Lt0/n$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lt0/r;->d:Lr0/g;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Lt0/n$a;->d(Lr0/g;)Lt0/n$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v1, p0, Lt0/r;->c:Lr0/c;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lt0/n$a;->b(Lr0/c;)Lt0/n$a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lt0/n$a;->a()Lt0/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p2}, Lt0/s;->a(Lt0/n;Lr0/j;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
