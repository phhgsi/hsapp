.class public final synthetic Lm0/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lm0/N;

.field public final synthetic e:Landroid/webkit/WebResourceRequest;

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lm0/N;Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/L;->d:Lm0/N;

    iput-object p2, p0, Lm0/L;->e:Landroid/webkit/WebResourceRequest;

    iput-object p3, p0, Lm0/L;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm0/L;->d:Lm0/N;

    iget-object v1, p0, Lm0/L;->e:Landroid/webkit/WebResourceRequest;

    iget-object v2, p0, Lm0/L;->f:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lm0/N;->a(Lm0/N;Landroid/webkit/WebResourceRequest;Ljava/util/Map;)V

    return-void
.end method
