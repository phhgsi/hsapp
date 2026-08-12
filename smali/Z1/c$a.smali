.class public final LZ1/c$a;
.super LZ1/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, LZ1/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ1/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 1
    invoke-static {}, LZ1/c;->a()LZ1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LZ1/c;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
