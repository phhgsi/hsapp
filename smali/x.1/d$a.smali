.class Lx/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/d;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lx/d$d;

.field final synthetic e:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lx/d$d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx/d$a;->d:Lx/d$d;

    .line 2
    .line 3
    iput-object p2, p0, Lx/d$a;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx/d$a;->d:Lx/d$d;

    .line 2
    .line 3
    iget-object v1, p0, Lx/d$a;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object v1, v0, Lx/d$d;->a:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method
