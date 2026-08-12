.class Lco/median/android/GoNativeApplication$a;
.super Lo0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/median/android/GoNativeApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lco/median/android/GoNativeApplication;


# direct methods
.method constructor <init>(Lco/median/android/GoNativeApplication;Landroid/app/Application;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/GoNativeApplication$a;->b:Lco/median/android/GoNativeApplication;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lo0/b;-><init>(Landroid/app/Application;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected e()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication$a;->b:Lco/median/android/GoNativeApplication;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/GoNativeApplication;->a(Lco/median/android/GoNativeApplication;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lco/median/android/GoNativeApplication$a;->b:Lco/median/android/GoNativeApplication;

    .line 10
    .line 11
    new-instance v1, Lm0/S0;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lm0/S0;-><init>(Landroid/app/Application;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lm0/S0;->a()Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Lco/median/android/GoNativeApplication;->b(Lco/median/android/GoNativeApplication;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lco/median/android/GoNativeApplication$a;->b:Lco/median/android/GoNativeApplication;

    .line 24
    .line 25
    invoke-static {v0}, Lco/median/android/GoNativeApplication;->a(Lco/median/android/GoNativeApplication;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
