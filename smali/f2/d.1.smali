.class final Lf2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/t0;


# static fields
.field public static final a:Lf2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/d;->a:Lf2/d;

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
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Active"

    .line 2
    .line 3
    return-object v0
.end method
