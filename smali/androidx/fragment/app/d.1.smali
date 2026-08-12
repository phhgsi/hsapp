.class public final synthetic Landroidx/fragment/app/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/h;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/d;->a:Landroidx/fragment/app/h;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d;->a:Landroidx/fragment/app/h;

    invoke-static {v0}, Landroidx/fragment/app/h;->a0(Landroidx/fragment/app/h;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
