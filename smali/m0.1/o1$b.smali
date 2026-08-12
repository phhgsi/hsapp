.class Lm0/o1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/o1;->q(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lm0/o1;


# direct methods
.method constructor <init>(Lm0/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o1$b;->d:Lm0/o1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/o1$b;->d:Lm0/o1;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/o1;->b(Lm0/o1;)Lo0/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lm0/o1$b;->d:Lm0/o1;

    .line 8
    .line 9
    invoke-static {v1}, Lm0/o1;->a(Lm0/o1;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lo0/h;->loadUrl(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
