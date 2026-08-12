.class public final LO1/c$d;
.super LP1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/c;->b(LN1/e;)LN1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(LN1/e;LN1/i;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LP1/c;-><init>(LN1/e;LN1/i;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method protected k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, LL1/n;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-object p1
.end method
