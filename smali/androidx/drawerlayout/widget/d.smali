.class public final synthetic Landroidx/drawerlayout/widget/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Landroidx/drawerlayout/widget/DrawerLayout$g;


# direct methods
.method public synthetic constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout$g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/drawerlayout/widget/d;->d:Landroidx/drawerlayout/widget/DrawerLayout$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/drawerlayout/widget/d;->d:Landroidx/drawerlayout/widget/DrawerLayout$g;

    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout$g;->o()V

    return-void
.end method
