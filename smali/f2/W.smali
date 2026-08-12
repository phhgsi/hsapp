.class public abstract Lf2/W;
.super Lf2/w;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/W$a;
    }
.end annotation


# static fields
.field public static final f:Lf2/W$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf2/W$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf2/W$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf2/W;->f:Lf2/W$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/w;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
