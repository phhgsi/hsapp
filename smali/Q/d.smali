.class public abstract LQ/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:LQ/d;


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

.method public static a()LQ/d;
    .locals 1

    .line 1
    sget-object v0, LQ/d;->a:LQ/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LQ/e;

    .line 6
    .line 7
    invoke-direct {v0}, LQ/e;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LQ/d;->a:LQ/d;

    .line 11
    .line 12
    :cond_0
    sget-object v0, LQ/d;->a:LQ/d;

    .line 13
    .line 14
    return-object v0
.end method
