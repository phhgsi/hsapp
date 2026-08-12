.class public Lcom/google/firebase/messaging/FirebaseMessagingService;
.super Lcom/google/firebase/messaging/i;
.source "SourceFile"


# static fields
.field private static final g:Ljava/util/Queue;


# instance fields
.field private f:Lcom/google/android/gms/cloudmessaging/Rpc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->g:Ljava/util/Queue;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private j(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->g:Ljava/util/Queue;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    const-string v1, "FirebaseMessaging"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Received duplicate message: "

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 p1, 0x1

    .line 47
    return p1

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/16 v3, 0xa

    .line 53
    .line 54
    if-lt v2, v3, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return v1
.end method

.method private k(Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-string v1, "androidx.content.wakelockid"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/firebase/messaging/J;->t(Landroid/os/Bundle;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    new-instance v1, Lcom/google/firebase/messaging/J;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/google/firebase/messaging/J;-><init>(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/google/firebase/messaging/o;->e()Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Lcom/google/firebase/messaging/f;

    .line 33
    .line 34
    invoke-direct {v3, p0, v1, v2}, Lcom/google/firebase/messaging/f;-><init>(Landroid/content/Context;Lcom/google/firebase/messaging/J;Ljava/util/concurrent/ExecutorService;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v3}, Lcom/google/firebase/messaging/f;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lcom/google/firebase/messaging/H;->D(Landroid/content/Intent;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-static {p1}, Lcom/google/firebase/messaging/H;->w(Landroid/content/Intent;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    :goto_0
    new-instance p1, Lcom/google/firebase/messaging/RemoteMessage;

    .line 66
    .line 67
    invoke-direct {p1, v0}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->p(Lcom/google/firebase/messaging/RemoteMessage;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method private l(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "google.message_id"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "message_id"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object v0
.end method

.method private m(Landroid/content/Context;)Lcom/google/android/gms/cloudmessaging/Rpc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->f:Lcom/google/android/gms/cloudmessaging/Rpc;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/cloudmessaging/Rpc;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Lcom/google/android/gms/cloudmessaging/Rpc;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->f:Lcom/google/android/gms/cloudmessaging/Rpc;

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->f:Lcom/google/android/gms/cloudmessaging/Rpc;

    .line 17
    .line 18
    return-object p1
.end method

.method private n(Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "google.message_id"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->j(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->t(Landroid/content/Intent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0, p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->m(Landroid/content/Context;)Lcom/google/android/gms/cloudmessaging/Rpc;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Lcom/google/android/gms/cloudmessaging/CloudMessage;-><init>(Landroid/content/Intent;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/gms/cloudmessaging/Rpc;->messageHandled(Lcom/google/android/gms/cloudmessaging/CloudMessage;)Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private t(Landroid/content/Intent;)V
    .locals 4

    .line 1
    const-string v0, "gcm"

    .line 2
    .line 3
    const-string v1, "message_type"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    :cond_0
    const/4 v2, -0x1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sparse-switch v3, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :sswitch_0
    const-string v0, "send_event"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v2, 0x3

    .line 31
    goto :goto_0

    .line 32
    :sswitch_1
    const-string v0, "send_error"

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v2, 0x2

    .line 42
    goto :goto_0

    .line 43
    :sswitch_2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v2, 0x1

    .line 51
    goto :goto_0

    .line 52
    :sswitch_3
    const-string v0, "deleted_messages"

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const/4 v2, 0x0

    .line 62
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 63
    .line 64
    .line 65
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v0, "Received message with unknown type: "

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "FirebaseMessaging"

    .line 83
    .line 84
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_0
    const-string v0, "google.message_id"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->q(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->l(Landroid/content/Intent;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, Lcom/google/firebase/messaging/V;

    .line 103
    .line 104
    const-string v2, "error"

    .line 105
    .line 106
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {v1, p1}, Lcom/google/firebase/messaging/V;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->s(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_2
    invoke-static {p1}, Lcom/google/firebase/messaging/H;->y(Landroid/content/Intent;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->k(Landroid/content/Intent;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_3
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->o()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    nop

    .line 129
    :sswitch_data_0
    .sparse-switch
        -0x7aedf14e -> :sswitch_3
        0x18f11 -> :sswitch_2
        0x308f3e91 -> :sswitch_1
        0x3090df23 -> :sswitch_0
    .end sparse-switch

    .line 130
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected e(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/firebase/messaging/W;->b()Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->c()Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public f(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.google.android.c2dm.intent.RECEIVE"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    const-string v1, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v1, "com.google.firebase.messaging.NEW_TOKEN"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v0, "token"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->r(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v1, "Unknown intent action: "

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "FirebaseMessaging"

    .line 62
    .line 63
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->n(Landroid/content/Intent;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method
