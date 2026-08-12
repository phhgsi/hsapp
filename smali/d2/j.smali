.class public final synthetic Ld2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/l;


# instance fields
.field public final synthetic d:LW1/a;


# direct methods
.method public synthetic constructor <init>(LW1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/j;->d:LW1/a;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/j;->d:LW1/a;

    invoke-static {v0, p1}, Ld2/m;->b(LW1/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
