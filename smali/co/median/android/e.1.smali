.class public final synthetic Lco/median/android/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/g;

.field public final synthetic e:Lco/median/android/g$a;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/g;Lco/median/android/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/median/android/e;->d:Lco/median/android/g;

    iput-object p2, p0, Lco/median/android/e;->e:Lco/median/android/g$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/e;->d:Lco/median/android/g;

    iget-object v1, p0, Lco/median/android/e;->e:Lco/median/android/g$a;

    invoke-static {v0, v1}, Lco/median/android/g;->b(Lco/median/android/g;Lco/median/android/g$a;)V

    return-void
.end method
