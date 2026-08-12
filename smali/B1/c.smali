.class public final synthetic LB1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lcom/google/firebase/installations/c;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/installations/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB1/c;->d:Lcom/google/firebase/installations/c;

    iput-boolean p2, p0, LB1/c;->e:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/c;->d:Lcom/google/firebase/installations/c;

    iget-boolean v1, p0, LB1/c;->e:Z

    invoke-static {v0, v1}, Lcom/google/firebase/installations/c;->d(Lcom/google/firebase/installations/c;Z)V

    return-void
.end method
