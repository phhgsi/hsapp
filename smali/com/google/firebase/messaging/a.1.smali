.class public final Lcom/google/firebase/messaging/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/a$c;,
        Lcom/google/firebase/messaging/a$b;,
        Lcom/google/firebase/messaging/a$a;
    }
.end annotation


# static fields
.field public static final a:Lu1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/firebase/messaging/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/messaging/a;->a:Lu1/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lu1/b;)V
    .locals 2

    .line 1
    const-class v0, Lcom/google/firebase/messaging/K;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/messaging/a$c;->a:Lcom/google/firebase/messaging/a$c;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lu1/b;->a(Ljava/lang/Class;Lt1/d;)Lu1/b;

    .line 6
    .line 7
    .line 8
    const-class v0, LG1/b;

    .line 9
    .line 10
    sget-object v1, Lcom/google/firebase/messaging/a$b;->a:Lcom/google/firebase/messaging/a$b;

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Lu1/b;->a(Ljava/lang/Class;Lt1/d;)Lu1/b;

    .line 13
    .line 14
    .line 15
    const-class v0, LG1/a;

    .line 16
    .line 17
    sget-object v1, Lcom/google/firebase/messaging/a$a;->a:Lcom/google/firebase/messaging/a$a;

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Lu1/b;->a(Ljava/lang/Class;Lt1/d;)Lu1/b;

    .line 20
    .line 21
    .line 22
    return-void
.end method
