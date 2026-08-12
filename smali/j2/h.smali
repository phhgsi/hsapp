.class public abstract Lj2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public d:J

.field public e:Lj2/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 4
    sget-object v2, Lj2/l;->g:Lj2/i;

    invoke-direct {p0, v0, v1, v2}, Lj2/h;-><init>(JLj2/i;)V

    return-void
.end method

.method public constructor <init>(JLj2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lj2/h;->d:J

    .line 3
    iput-object p3, p0, Lj2/h;->e:Lj2/i;

    return-void
.end method
