.class public final synthetic LT0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:LT0/b;


# direct methods
.method public synthetic constructor <init>(LT0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT0/e;->a:LT0/b;

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, LT0/e;->a:LT0/b;

    invoke-interface {v0}, LT0/b;->a()V

    return-void
.end method
