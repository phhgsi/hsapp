.class public final synthetic Lcom/google/firebase/messaging/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h;


# instance fields
.field public final synthetic a:Lp1/E;


# direct methods
.method public synthetic constructor <init>(Lp1/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/B;->a:Lp1/E;

    return-void
.end method


# virtual methods
.method public final a(Lp1/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/B;->a:Lp1/E;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Lp1/E;Lp1/e;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    return-object p1
.end method
