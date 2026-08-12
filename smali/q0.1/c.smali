.class public Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/c$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:[Ljava/lang/String;

.field private c:Lq0/c$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lq0/c;->a:Z

    .line 6
    .line 7
    new-instance v0, Lq0/c$a;

    .line 8
    .line 9
    invoke-direct {v0}, Lq0/c$a;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lq0/c;->c:Lq0/c$a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/c;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public b()Lq0/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/c;->c:Lq0/c$a;

    .line 2
    .line 3
    return-object v0
.end method
