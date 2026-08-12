.class Landroidx/fragment/app/F$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/F;->a(Landroidx/fragment/app/F$e$c;Landroidx/fragment/app/F$e$b;Landroidx/fragment/app/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroidx/fragment/app/F$d;

.field final synthetic e:Landroidx/fragment/app/F;


# direct methods
.method constructor <init>(Landroidx/fragment/app/F;Landroidx/fragment/app/F$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/F$b;->e:Landroidx/fragment/app/F;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/F$b;->d:Landroidx/fragment/app/F$d;

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
    iget-object v0, p0, Landroidx/fragment/app/F$b;->e:Landroidx/fragment/app/F;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/F;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/F$b;->d:Landroidx/fragment/app/F$d;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/F$b;->e:Landroidx/fragment/app/F;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/F;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/fragment/app/F$b;->d:Landroidx/fragment/app/F$d;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method
