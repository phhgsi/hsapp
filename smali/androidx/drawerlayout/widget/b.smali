.class public final synthetic Landroidx/drawerlayout/widget/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK/B;


# instance fields
.field public final synthetic a:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method public synthetic constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/drawerlayout/widget/b;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;LK/B$a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/drawerlayout/widget/b;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-static {v0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->b(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/view/View;LK/B$a;)Z

    move-result p1

    return p1
.end method
