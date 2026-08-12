.class public Lm0/o1$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lm0/o1;


# direct methods
.method public constructor <init>(Lm0/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o1$d;->a:Lm0/o1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Lo0/h;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/o1$d;->a:Lm0/o1;

    .line 2
    .line 3
    invoke-static {v0}, Lm0/o1;->c(Lm0/o1;)Lm0/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, p2, p3, v1}, Lm0/O;->b(Landroid/app/Activity;Lo0/h;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public b(Landroid/app/Activity;Lo0/h;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lm0/o1$d;->a:Lm0/o1;

    .line 2
    .line 3
    invoke-static {p2}, Lm0/o1;->d(Lm0/o1;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p2}, Lm0/o1;->a(Lm0/o1;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p2}, Lm0/o1;->b(Lm0/o1;)Lo0/h;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    invoke-static {p2, p3}, Lm0/o1;->g(Lm0/o1;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, p3}, Lm0/o1;->h(Lm0/o1;Lo0/h;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p2, v0}, Lm0/o1;->i(Lm0/o1;Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Lm0/o1;->c(Lm0/o1;)Lm0/O;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p3}, Lm0/O;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p1}, Lm0/o1;->j(Lm0/o1;Landroid/app/Activity;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
