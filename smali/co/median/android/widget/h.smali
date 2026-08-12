.class public final synthetic Lco/median/android/widget/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/widget/MedianProgressView;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/widget/MedianProgressView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/widget/h;->d:Lco/median/android/widget/MedianProgressView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/h;->d:Lco/median/android/widget/MedianProgressView;

    invoke-static {v0}, Lco/median/android/widget/MedianProgressView;->a(Lco/median/android/widget/MedianProgressView;)V

    return-void
.end method
