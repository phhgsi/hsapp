.class Lco/median/android/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/median/android/d;->onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lco/median/android/d;


# direct methods
.method constructor <init>(Lco/median/android/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/d$b;->d:Lco/median/android/d;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/d$b;->d:Lco/median/android/d;

    .line 2
    .line 3
    invoke-static {v0}, Lco/median/android/d;->f(Lco/median/android/d;)Lco/median/android/MainActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lco/median/android/MainActivity;->u3()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
