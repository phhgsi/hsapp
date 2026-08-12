.class public abstract LZ1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ1/c$a;
    }
.end annotation


# static fields
.field public static final d:LZ1/c$a;

.field private static final e:LZ1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ1/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LZ1/c$a;-><init>(LX1/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LZ1/c;->d:LZ1/c$a;

    .line 8
    .line 9
    sget-object v0, LR1/b;->a:LR1/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LR1/a;->b()LZ1/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LZ1/c;->e:LZ1/c;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()LZ1/c;
    .locals 1

    .line 1
    sget-object v0, LZ1/c;->e:LZ1/c;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract b(I)I
.end method
