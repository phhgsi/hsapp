.class public final synthetic LG/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/SplashScreen$OnExitAnimationListener;


# instance fields
.field public final synthetic a:LG/g$c;

.field public final synthetic b:LG/g$e;


# direct methods
.method public synthetic constructor <init>(LG/g$c;LG/g$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/p;->a:LG/g$c;

    iput-object p2, p0, LG/p;->b:LG/g$e;

    return-void
.end method


# virtual methods
.method public final onSplashScreenExit(Landroid/window/SplashScreenView;)V
    .locals 2

    .line 1
    iget-object v0, p0, LG/p;->a:LG/g$c;

    iget-object v1, p0, LG/p;->b:LG/g$e;

    invoke-static {v0, v1, p1}, LG/g$c;->p(LG/g$c;LG/g$e;Landroid/window/SplashScreenView;)V

    return-void
.end method
