.class public final synthetic LN1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, LN1/i$b;

    invoke-static {p1, p2}, LN1/d;->c(Ljava/lang/String;LN1/i$b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
