.class public final synthetic Lm0/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lco/median/android/MyFirebaseMessagingService;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MyFirebaseMessagingService;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/Q0;->d:Lco/median/android/MyFirebaseMessagingService;

    iput-object p2, p0, Lm0/Q0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/Q0;->d:Lco/median/android/MyFirebaseMessagingService;

    iget-object v1, p0, Lm0/Q0;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lco/median/android/MyFirebaseMessagingService;->u(Lco/median/android/MyFirebaseMessagingService;Ljava/lang/String;)V

    return-void
.end method
