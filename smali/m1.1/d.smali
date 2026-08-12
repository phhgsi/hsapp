.class public final synthetic Lm1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/e$a;


# instance fields
.field public final synthetic a:Lm1/e;


# direct methods
.method public synthetic constructor <init>(Lm1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/d;->a:Lm1/e;

    return-void
.end method


# virtual methods
.method public final onBackgroundStateChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/d;->a:Lm1/e;

    invoke-static {v0, p1}, Lm1/e;->a(Lm1/e;Z)V

    return-void
.end method
