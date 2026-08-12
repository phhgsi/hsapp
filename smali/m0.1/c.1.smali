.class public final synthetic Lm0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/Toolbar$h;


# instance fields
.field public final synthetic a:Lm0/e;


# direct methods
.method public synthetic constructor <init>(Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/c;->a:Lm0/e;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/c;->a:Lm0/e;

    invoke-static {v0, p1}, Lm0/e;->b(Lm0/e;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
