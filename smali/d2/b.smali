.class final Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/f;


# static fields
.field public static final a:Ld2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld2/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ld2/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld2/b;->a:Ld2/b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, LM1/x;->d:LM1/x;

    .line 2
    .line 3
    return-object v0
.end method
