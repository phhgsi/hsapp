.class public final Lf2/w$a;
.super LN1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, LN1/f;->a:LN1/f$b;

    .line 3
    sget-object v1, Lf2/w$a$a;->e:Lf2/w$a$a;

    .line 4
    invoke-direct {p0, v0, v1}, LN1/b;-><init>(LN1/i$c;LW1/l;)V

    return-void
.end method

.method public synthetic constructor <init>(LX1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/w$a;-><init>()V

    return-void
.end method
