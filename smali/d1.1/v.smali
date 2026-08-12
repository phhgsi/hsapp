.class public final Ld1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/f;


# instance fields
.field private final a:Le1/f;

.field private final b:Le1/f;


# direct methods
.method public constructor <init>(Le1/f;Le1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/v;->a:Le1/f;

    .line 5
    .line 6
    iput-object p2, p0, Ld1/v;->b:Le1/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ld1/v;->a:Le1/f;

    .line 2
    .line 3
    check-cast v0, Ld1/p;

    .line 4
    .line 5
    invoke-virtual {v0}, Ld1/p;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ld1/v;->b:Le1/f;

    .line 10
    .line 11
    invoke-interface {v1}, Le1/f;->zza()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ld1/u;

    .line 16
    .line 17
    check-cast v1, Ld1/w;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1}, Ld1/u;-><init>(Landroid/content/Context;Ld1/w;)V

    .line 20
    .line 21
    .line 22
    return-object v2
.end method
