.class public final synthetic Ly/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Ly/k$e;

.field public final synthetic e:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Ly/k$e;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/l;->d:Ly/k$e;

    iput-object p2, p0, Ly/l;->e:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly/l;->d:Ly/k$e;

    iget-object v1, p0, Ly/l;->e:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Ly/k$e;->a(Ly/k$e;Landroid/graphics/Typeface;)V

    return-void
.end method
