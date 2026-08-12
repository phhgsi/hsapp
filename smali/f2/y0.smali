.class public final Lf2/y0;
.super Lf2/w;
.source "SourceFile"


# static fields
.field public static final f:Lf2/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/y0;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/y0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/y0;->f:Lf2/y0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/w;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public D(LN1/i;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p2, Lf2/B0;->e:Lf2/B0$a;

    .line 2
    .line 3
    invoke-interface {p1, p2}, LN1/i;->b(LN1/i$c;)LN1/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public E(LN1/i;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Unconfined"

    .line 2
    .line 3
    return-object v0
.end method
