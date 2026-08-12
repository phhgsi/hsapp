.class public abstract LX1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/a;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX1/c$a;
    }
.end annotation


# static fields
.field public static final j:Ljava/lang/Object;


# instance fields
.field private transient d:Lc2/a;

.field protected final e:Ljava/lang/Object;

.field private final f:Ljava/lang/Class;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LX1/c$a;->a()LX1/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LX1/c;->j:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX1/c;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LX1/c;->f:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, LX1/c;->g:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, LX1/c;->h:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, LX1/c;->i:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public c()Lc2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/c;->d:Lc2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LX1/c;->e()Lc2/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LX1/c;->d:Lc2/a;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method protected abstract e()Lc2/a;
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/c;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/c;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lc2/c;
    .locals 2

    .line 1
    iget-object v0, p0, LX1/c;->f:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-boolean v1, p0, LX1/c;->i:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, LX1/s;->c(Ljava/lang/Class;)Lc2/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_1
    invoke-static {v0}, LX1/s;->b(Ljava/lang/Class;)Lc2/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/c;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
