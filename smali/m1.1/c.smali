.class public final synthetic Lm1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA1/b;


# instance fields
.field public final synthetic a:Lm1/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lm1/e;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/c;->a:Lm1/e;

    iput-object p2, p0, Lm1/c;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm1/c;->a:Lm1/e;

    iget-object v1, p0, Lm1/c;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lm1/e;->b(Lm1/e;Landroid/content/Context;)LF1/a;

    move-result-object v0

    return-object v0
.end method
