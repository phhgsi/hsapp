.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lp1/E;Lp1/e;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 8

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    const-class v1, Lm1/e;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Lp1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lm1/e;

    .line 10
    .line 11
    const-class v2, Lz1/a;

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lp1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Landroidx/appcompat/app/E;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-class v2, LI1/i;

    .line 21
    .line 22
    invoke-interface {p1, v2}, Lp1/e;->d(Ljava/lang/Class;)LA1/b;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-class v2, Ly1/j;

    .line 27
    .line 28
    invoke-interface {p1, v2}, Lp1/e;->d(Ljava/lang/Class;)LA1/b;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-class v2, LB1/e;

    .line 33
    .line 34
    invoke-interface {p1, v2}, Lp1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v5, v2

    .line 39
    check-cast v5, LB1/e;

    .line 40
    .line 41
    invoke-interface {p1, p0}, Lp1/e;->e(Lp1/E;)LA1/b;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-class p0, Lx1/d;

    .line 46
    .line 47
    invoke-interface {p1, p0}, Lp1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    move-object v7, p0

    .line 52
    check-cast v7, Lx1/d;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lm1/e;Lz1/a;LA1/b;LA1/b;LB1/e;LA1/b;Lx1/d;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp1/c;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lr1/b;

    .line 2
    .line 3
    const-class v1, Lr0/i;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lp1/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lp1/E;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 10
    .line 11
    invoke-static {v1}, Lp1/c;->c(Ljava/lang/Class;)Lp1/c$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "fire-fcm"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lp1/c$b;->h(Ljava/lang/String;)Lp1/c$b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-class v3, Lm1/e;

    .line 22
    .line 23
    invoke-static {v3}, Lp1/r;->j(Ljava/lang/Class;)Lp1/r;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v3, Lz1/a;

    .line 32
    .line 33
    invoke-static {v3}, Lp1/r;->g(Ljava/lang/Class;)Lp1/r;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v3, LI1/i;

    .line 42
    .line 43
    invoke-static {v3}, Lp1/r;->h(Ljava/lang/Class;)Lp1/r;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-class v3, Ly1/j;

    .line 52
    .line 53
    invoke-static {v3}, Lp1/r;->h(Ljava/lang/Class;)Lp1/r;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-class v3, LB1/e;

    .line 62
    .line 63
    invoke-static {v3}, Lp1/r;->j(Ljava/lang/Class;)Lp1/r;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0}, Lp1/r;->i(Lp1/E;)Lp1/r;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-class v3, Lx1/d;

    .line 80
    .line 81
    invoke-static {v3}, Lp1/r;->j(Ljava/lang/Class;)Lp1/r;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3}, Lp1/c$b;->b(Lp1/r;)Lp1/c$b;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    new-instance v3, Lcom/google/firebase/messaging/B;

    .line 90
    .line 91
    invoke-direct {v3, v0}, Lcom/google/firebase/messaging/B;-><init>(Lp1/E;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Lp1/c$b;->f(Lp1/h;)Lp1/c$b;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lp1/c$b;->c()Lp1/c$b;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lp1/c$b;->d()Lp1/c;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "24.1.0"

    .line 107
    .line 108
    invoke-static {v2, v1}, LI1/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp1/c;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const/4 v2, 0x2

    .line 113
    new-array v2, v2, [Lp1/c;

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    aput-object v0, v2, v3

    .line 117
    .line 118
    const/4 v0, 0x1

    .line 119
    aput-object v1, v2, v0

    .line 120
    .line 121
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
