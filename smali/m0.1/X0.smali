.class public final synthetic Lm0/X0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/F;


# instance fields
.field public final synthetic a:Lm0/Y0;


# direct methods
.method public synthetic constructor <init>(Lm0/Y0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/X0;->a:Lm0/Y0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;LJ/w0;)LJ/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/X0;->a:Lm0/Y0;

    invoke-static {v0, p1, p2}, Lm0/Y0;->a(Lm0/Y0;Landroid/view/View;LJ/w0;)LJ/w0;

    move-result-object p1

    return-object p1
.end method
