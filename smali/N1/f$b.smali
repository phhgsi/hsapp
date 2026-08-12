.class public final LN1/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic d:LN1/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LN1/f$b;

    .line 2
    .line 3
    invoke-direct {v0}, LN1/f$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN1/f$b;->d:LN1/f$b;

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
