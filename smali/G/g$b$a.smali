.class public final LG/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/g$b;->k(LG/g$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LG/g$b;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(LG/g$b;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/g$b$a;->a:LG/g$b;

    .line 2
    .line 3
    iput-object p2, p0, LG/g$b$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    .line 1
    iget-object v0, p0, LG/g$b$a;->a:LG/g$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LG/g$b;->i()LG/g$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LG/g$d;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, LG/g$b$a;->b:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LG/g$b$a;->a:LG/g$b;

    .line 25
    .line 26
    invoke-static {v0}, LG/g$b;->c(LG/g$b;)LG/u;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, LG/g$b$a;->a:LG/g$b;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, LG/g$b;->e(LG/u;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v0, 0x1

    .line 38
    return v0
.end method
