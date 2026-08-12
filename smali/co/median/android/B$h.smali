.class Lco/median/android/B$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/B;->O(Lo0/h;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo0/h;

.field final synthetic e:Lco/median/android/B;


# direct methods
.method constructor <init>(Lco/median/android/B;Lo0/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/B$h;->e:Lco/median/android/B;

    .line 2
    .line 3
    iput-object p2, p0, Lco/median/android/B$h;->d:Lo0/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/B$h;->d:Lo0/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lo0/h;->reload()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
