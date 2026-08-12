.class public final synthetic LP/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:LP/c;


# direct methods
.method public synthetic constructor <init>(LP/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP/b;->d:LP/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, LP/b;->d:LP/c;

    invoke-static {v0}, LP/c;->a(LP/c;)V

    return-void
.end method
