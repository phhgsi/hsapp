.class public Lco/median/android/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/C$a;
    }
.end annotation


# instance fields
.field private final a:Lco/median/android/C$a;


# direct methods
.method public constructor <init>(Lco/median/android/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lco/median/android/C;->a:Lco/median/android/C$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/median/android/C;->a:Lco/median/android/C$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lco/median/android/C$a;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
