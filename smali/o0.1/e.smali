.class public final synthetic Lo0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lo0/f;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lo0/f;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/e;->d:Lo0/f;

    iput-object p2, p0, Lo0/e;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo0/e;->d:Lo0/f;

    iget-object v1, p0, Lo0/e;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo0/f;->a(Lo0/f;Ljava/lang/String;)V

    return-void
.end method
