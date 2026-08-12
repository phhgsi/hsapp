.class public final synthetic Lm0/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Lm0/X;


# direct methods
.method public synthetic constructor <init>(Lm0/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/W;->a:Lm0/X;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/W;->a:Lm0/X;

    invoke-static {v0}, Lm0/X;->a(Lm0/X;)V

    return-void
.end method
