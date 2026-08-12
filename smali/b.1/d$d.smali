.class final Lb/d$d;
.super LX1/l;
.source "SourceFile"

# interfaces
.implements LW1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d;->h()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final e:Lb/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb/d$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lb/d$d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb/d$d;->e:Lb/d$d;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LX1/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb/d$d;->c()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 2

    .line 1
    sget-object v0, LZ1/c;->d:LZ1/c$a;

    .line 2
    .line 3
    const/high16 v1, 0x7fff0000

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LZ1/c$a;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/high16 v1, 0x10000

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
