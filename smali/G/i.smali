.class public final synthetic LG/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:LG/u;

.field public final synthetic e:LG/g$e;


# direct methods
.method public synthetic constructor <init>(LG/u;LG/g$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/i;->d:LG/u;

    iput-object p2, p0, LG/i;->e:LG/g$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LG/i;->d:LG/u;

    iget-object v1, p0, LG/i;->e:LG/g$e;

    invoke-static {v0, v1}, LG/g$b;->a(LG/u;LG/g$e;)V

    return-void
.end method
