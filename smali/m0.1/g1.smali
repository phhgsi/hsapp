.class public final synthetic Lm0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/B;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/B;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g1;->d:Lco/median/android/B;

    iput-object p2, p0, Lm0/g1;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/g1;->d:Lco/median/android/B;

    iget-object v1, p0, Lm0/g1;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lco/median/android/B;->g(Lco/median/android/B;Ljava/lang/String;)V

    return-void
.end method
