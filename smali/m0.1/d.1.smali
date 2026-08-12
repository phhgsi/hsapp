.class public final synthetic Lm0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LX1/r;

.field public final synthetic b:Lm0/e;


# direct methods
.method public synthetic constructor <init>(LX1/r;Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/d;->a:LX1/r;

    iput-object p2, p0, Lm0/d;->b:Lm0/e;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/d;->a:LX1/r;

    iget-object v1, p0, Lm0/d;->b:Lm0/e;

    invoke-static {v0, v1, p1}, Lm0/e;->a(LX1/r;Lm0/e;Landroid/view/View;)V

    return-void
.end method
