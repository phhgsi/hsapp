.class abstract LZ0/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:LZ0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ0/m;

    .line 2
    .line 3
    invoke-direct {v0}, LZ0/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ0/m$a;->a:LZ0/m;

    .line 7
    .line 8
    return-void
.end method
