.class public final Lm0/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/e;->o(Landroid/view/MenuItem;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/e;

.field final synthetic b:Landroid/view/MenuItem;


# direct methods
.method constructor <init>(Lm0/e;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/e$c;->a:Lm0/e;

    .line 2
    .line 3
    iput-object p2, p0, Lm0/e$c;->b:Landroid/view/MenuItem;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm0/e$c;->a:Lm0/e;

    .line 7
    .line 8
    invoke-static {p1}, Lm0/e;->e(Lm0/e;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm0/e$c;->a:Lm0/e;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lm0/e$c;->b:Landroid/view/MenuItem;

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Lm0/e;->v(ZLandroid/view/MenuItem;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
.end method
