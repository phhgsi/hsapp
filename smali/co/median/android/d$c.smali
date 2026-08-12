.class Lco/median/android/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/median/android/DownloadService$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/d;->G(Lco/median/android/d$e;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lco/median/android/d;


# direct methods
.method constructor <init>(Lco/median/android/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/d$c;->b:Lco/median/android/d;

    .line 2
    .line 3
    iput-object p2, p0, Lco/median/android/d$c;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/d$c;->b:Lco/median/android/d;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/d;->f(Lco/median/android/d;)Lco/median/android/MainActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lco/median/android/d$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lco/median/android/d;->C(Lo0/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onSuccess()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/d$c;->b:Lco/median/android/d;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/d;->f(Lco/median/android/d;)Lco/median/android/MainActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lco/median/android/d$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lco/median/android/d;->D(Lo0/g;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
