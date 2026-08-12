.class Lco/median/android/B$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/B;->t(Lm0/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lco/median/android/B;


# direct methods
.method constructor <init>(Lco/median/android/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/B$j;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/B$j;->a:Lco/median/android/B;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/B;->j(Lco/median/android/B;)Landroid/webkit/ValueCallback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lco/median/android/B$j;->a:Lco/median/android/B;

    .line 10
    .line 11
    invoke-static {v0}, Lco/median/android/B;->j(Lco/median/android/B;)Landroid/webkit/ValueCallback;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    new-array v1, v1, [Landroid/net/Uri;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aput-object p1, v1, v2

    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lco/median/android/B$j;->a:Lco/median/android/B;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {p1, v0}, Lco/median/android/B;->k(Lco/median/android/B;Landroid/webkit/ValueCallback;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-static {}, Lco/median/android/B;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "onFailure: "

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lco/median/android/B$j;->a:Lco/median/android/B;

    .line 11
    .line 12
    invoke-virtual {p1}, Lco/median/android/B;->m()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
