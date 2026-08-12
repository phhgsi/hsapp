.class public abstract Ld1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(I)Ld1/d;
    .locals 0

    .line 1
    invoke-static {p0}, Ld1/d;->d(I)Ld1/d$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ld1/d$a;->a()Ld1/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(I)Ld1/d$a;
    .locals 1

    .line 1
    new-instance v0, Ld1/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ld1/y;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ld1/y;->c(I)Ld1/d$a;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {v0, p0}, Ld1/d$a;->b(Z)Ld1/d$a;

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()I
.end method
