.class Landroidx/fragment/app/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/F$e;Landroidx/fragment/app/F$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroidx/fragment/app/C;

.field final synthetic e:Landroid/view/View;

.field final synthetic f:Landroid/graphics/Rect;

.field final synthetic g:Landroidx/fragment/app/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/b;Landroidx/fragment/app/C;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/b$h;->g:Landroidx/fragment/app/b;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/b$h;->d:Landroidx/fragment/app/C;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/b$h;->e:Landroid/view/View;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/b$h;->f:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b$h;->d:Landroidx/fragment/app/C;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/b$h;->e:Landroid/view/View;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/b$h;->f:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/C;->h(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
