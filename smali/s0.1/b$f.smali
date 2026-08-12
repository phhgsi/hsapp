.class final Ls0/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# static fields
.field static final a:Ls0/b$f;

.field private static final b:Lt1/c;

.field private static final c:Lt1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls0/b$f;

    .line 2
    .line 3
    invoke-direct {v0}, Ls0/b$f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls0/b$f;->a:Ls0/b$f;

    .line 7
    .line 8
    const-string v0, "networkType"

    .line 9
    .line 10
    invoke-static {v0}, Lt1/c;->d(Ljava/lang/String;)Lt1/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ls0/b$f;->b:Lt1/c;

    .line 15
    .line 16
    const-string v0, "mobileSubtype"

    .line 17
    .line 18
    invoke-static {v0}, Lt1/c;->d(Ljava/lang/String;)Lt1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Ls0/b$f;->c:Lt1/c;

    .line 23
    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ls0/o;

    .line 2
    .line 3
    check-cast p2, Lt1/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ls0/b$f;->b(Ls0/o;Lt1/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ls0/o;Lt1/e;)V
    .locals 2

    .line 1
    sget-object v0, Ls0/b$f;->b:Lt1/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls0/o;->c()Ls0/o$c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lt1/e;->a(Lt1/c;Ljava/lang/Object;)Lt1/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, Ls0/b$f;->c:Lt1/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Ls0/o;->b()Ls0/o$b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p2, v0, p1}, Lt1/e;->a(Lt1/c;Ljava/lang/Object;)Lt1/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method
