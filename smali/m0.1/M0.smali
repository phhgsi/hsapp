.class public final synthetic Lm0/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/MainActivity$m;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity$m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/M0;->d:Lco/median/android/MainActivity$m;

    iput-object p2, p0, Lm0/M0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/M0;->d:Lco/median/android/MainActivity$m;

    iget-object v1, p0, Lm0/M0;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lco/median/android/MainActivity$m;->a(Lco/median/android/MainActivity$m;Ljava/lang/String;)V

    return-void
.end method
