.class public final synthetic LM1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW1/l;


# instance fields
.field public final synthetic d:LM1/b;


# direct methods
.method public synthetic constructor <init>(LM1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1/a;->d:LM1/b;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LM1/a;->d:LM1/b;

    invoke-static {v0, p1}, LM1/b;->b(LM1/b;Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
