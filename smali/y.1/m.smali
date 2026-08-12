.class public final synthetic Ly/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Ly/k$e;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ly/k$e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/m;->d:Ly/k$e;

    iput p2, p0, Ly/m;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly/m;->d:Ly/k$e;

    iget v1, p0, Ly/m;->e:I

    invoke-static {v0, v1}, Ly/k$e;->b(Ly/k$e;I)V

    return-void
.end method
