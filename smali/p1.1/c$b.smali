.class public Lp1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private d:I

.field private e:I

.field private f:Lp1/h;

.field private final g:Ljava/util/Set;


# direct methods
.method private varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lp1/c$b;->a:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lp1/c$b;->b:Ljava/util/Set;

    .line 6
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lp1/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lp1/c$b;->d:I

    .line 8
    iput v1, p0, Lp1/c$b;->e:I

    .line 9
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lp1/c$b;->g:Ljava/util/Set;

    .line 10
    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    invoke-static {p1}, Lp1/E;->b(Ljava/lang/Class;)Lp1/E;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 13
    invoke-static {v0, v2}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    iget-object v3, p0, Lp1/c$b;->b:Ljava/util/Set;

    invoke-static {v0}, Lp1/E;->b(Ljava/lang/Class;)Lp1/E;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Lp1/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp1/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method private varargs constructor <init>(Lp1/E;[Lp1/E;)V
    .locals 3

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lp1/c$b;->a:Ljava/lang/String;

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lp1/c$b;->b:Ljava/util/Set;

    .line 18
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lp1/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    .line 19
    iput v1, p0, Lp1/c$b;->d:I

    .line 20
    iput v1, p0, Lp1/c$b;->e:I

    .line 21
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lp1/c$b;->g:Ljava/util/Set;

    .line 22
    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 25
    invoke-static {v0, v2}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lp1/c$b;->b:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method synthetic constructor <init>(Lp1/E;[Lp1/E;Lp1/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lp1/c$b;-><init>(Lp1/E;[Lp1/E;)V

    return-void
.end method

.method static synthetic a(Lp1/c$b;)Lp1/c$b;
    .locals 0

    .line 1
    invoke-direct {p0}, Lp1/c$b;->g()Lp1/c$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private g()Lp1/c$b;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lp1/c$b;->e:I

    .line 3
    .line 4
    return-object p0
.end method

.method private i(I)Lp1/c$b;
    .locals 2

    .line 1
    iget v0, p0, Lp1/c$b;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "Instantiation type has already been set."

    .line 9
    .line 10
    invoke-static {v0, v1}, Lp1/D;->d(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lp1/c$b;->d:I

    .line 14
    .line 15
    return-object p0
.end method

.method private j(Lp1/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp1/c$b;->b:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    .line 10
    .line 11
    invoke-static {p1, v0}, Lp1/D;->a(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public b(Lp1/r;)Lp1/c$b;
    .locals 1

    .line 1
    const-string v0, "Null dependency"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lp1/r;->b()Lp1/E;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Lp1/c$b;->j(Lp1/E;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lp1/c$b;->c:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public c()Lp1/c$b;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lp1/c$b;->i(I)Lp1/c$b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public d()Lp1/c;
    .locals 11

    .line 1
    iget-object v0, p0, Lp1/c$b;->f:Lp1/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "Missing required property: factory."

    .line 9
    .line 10
    invoke-static {v0, v1}, Lp1/D;->d(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lp1/c;

    .line 14
    .line 15
    iget-object v3, p0, Lp1/c$b;->a:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v4, Ljava/util/HashSet;

    .line 18
    .line 19
    iget-object v0, p0, Lp1/c$b;->b:Ljava/util/Set;

    .line 20
    .line 21
    invoke-direct {v4, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    new-instance v5, Ljava/util/HashSet;

    .line 25
    .line 26
    iget-object v0, p0, Lp1/c$b;->c:Ljava/util/Set;

    .line 27
    .line 28
    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget v6, p0, Lp1/c$b;->d:I

    .line 32
    .line 33
    iget v7, p0, Lp1/c$b;->e:I

    .line 34
    .line 35
    iget-object v8, p0, Lp1/c$b;->f:Lp1/h;

    .line 36
    .line 37
    iget-object v9, p0, Lp1/c$b;->g:Ljava/util/Set;

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-direct/range {v2 .. v10}, Lp1/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILp1/h;Ljava/util/Set;Lp1/c$a;)V

    .line 41
    .line 42
    .line 43
    return-object v2
.end method

.method public e()Lp1/c$b;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lp1/c$b;->i(I)Lp1/c$b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public f(Lp1/h;)Lp1/c$b;
    .locals 1

    .line 1
    const-string v0, "Null factory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp1/D;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lp1/h;

    .line 8
    .line 9
    iput-object p1, p0, Lp1/c$b;->f:Lp1/h;

    .line 10
    .line 11
    return-object p0
.end method

.method public h(Ljava/lang/String;)Lp1/c$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lp1/c$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
