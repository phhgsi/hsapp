.class public final Ld1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/f;


# instance fields
.field private final a:Le1/f;

.field private final b:Le1/f;

.field private final c:Le1/f;


# direct methods
.method public constructor <init>(Le1/f;Le1/f;Le1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/m;->a:Le1/f;

    .line 5
    .line 6
    iput-object p2, p0, Ld1/m;->b:Le1/f;

    .line 7
    .line 8
    iput-object p3, p0, Ld1/m;->c:Le1/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ld1/m;->a:Le1/f;

    .line 2
    .line 3
    invoke-interface {v0}, Le1/f;->zza()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ld1/m;->b:Le1/f;

    .line 8
    .line 9
    invoke-interface {v1}, Le1/f;->zza()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ld1/i;

    .line 14
    .line 15
    iget-object v2, p0, Ld1/m;->c:Le1/f;

    .line 16
    .line 17
    check-cast v2, Ld1/p;

    .line 18
    .line 19
    invoke-virtual {v2}, Ld1/p;->a()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ld1/l;

    .line 24
    .line 25
    check-cast v0, Ld1/u;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Ld1/l;-><init>(Ld1/u;Ld1/i;Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method
