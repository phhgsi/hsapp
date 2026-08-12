.class public final Ld1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/f;


# instance fields
.field private final a:Le1/f;


# direct methods
.method public constructor <init>(Le1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/x;->a:Le1/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ld1/x;->a:Le1/f;

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
    new-instance v1, Ld1/w;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ld1/w;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-object v1
.end method
