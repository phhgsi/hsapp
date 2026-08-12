.class abstract Lx/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method public static a(Lx/s;)Landroid/app/RemoteInput;
    .locals 0

    .line 1
    new-instance p0, Landroid/app/RemoteInput$Builder;

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    throw p0
.end method
