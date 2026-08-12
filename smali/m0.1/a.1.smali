.class public final synthetic Lm0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/SearchView;

.field public final synthetic b:Lm0/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/SearchView;Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a;->a:Landroidx/appcompat/widget/SearchView;

    iput-object p2, p0, Lm0/a;->b:Lm0/e;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/a;->a:Landroidx/appcompat/widget/SearchView;

    iget-object v1, p0, Lm0/a;->b:Lm0/e;

    invoke-static {v0, v1, p1, p2}, Lm0/e;->c(Landroidx/appcompat/widget/SearchView;Lm0/e;Landroid/view/View;Z)V

    return-void
.end method
