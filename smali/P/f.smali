.class public final synthetic LP/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$DurationScaleChangeListener;


# instance fields
.field public final synthetic a:LP/c$d;


# direct methods
.method public synthetic constructor <init>(LP/c$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP/f;->a:LP/c$d;

    return-void
.end method


# virtual methods
.method public final onChanged(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LP/f;->a:LP/c$d;

    invoke-static {v0, p1}, LP/c$d;->c(LP/c$d;F)V

    return-void
.end method
