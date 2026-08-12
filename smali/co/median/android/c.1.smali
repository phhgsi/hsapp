.class public final synthetic Lco/median/android/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/DownloadService$c;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/DownloadService$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/c;->d:Lco/median/android/DownloadService$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/c;->d:Lco/median/android/DownloadService$c;

    invoke-static {v0}, Lco/median/android/DownloadService$c;->b(Lco/median/android/DownloadService$c;)V

    return-void
.end method
