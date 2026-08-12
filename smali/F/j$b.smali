.class public LF/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v6, p5

    .line 1
    invoke-direct/range {v0 .. v6}, LF/j$b;-><init>(Landroid/net/Uri;IIZLjava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;IIZLjava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LI/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, LF/j$b;->a:Landroid/net/Uri;

    .line 4
    iput p2, p0, LF/j$b;->b:I

    .line 5
    iput p3, p0, LF/j$b;->c:I

    .line 6
    iput-boolean p4, p0, LF/j$b;->d:Z

    .line 7
    iput-object p5, p0, LF/j$b;->e:Ljava/lang/String;

    .line 8
    iput p6, p0, LF/j$b;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "systemfont"

    .line 11
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, LF/j$b;->a:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 14
    iput p1, p0, LF/j$b;->b:I

    const/16 v0, 0x190

    .line 15
    iput v0, p0, LF/j$b;->c:I

    .line 16
    iput-boolean p1, p0, LF/j$b;->d:Z

    .line 17
    iput-object p2, p0, LF/j$b;->e:Ljava/lang/String;

    .line 18
    iput p1, p0, LF/j$b;->f:I

    return-void
.end method

.method static a(Landroid/net/Uri;IIZI)LF/j$b;
    .locals 6

    .line 1
    new-instance v0, LF/j$b;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move v2, p1

    .line 5
    move v3, p2

    .line 6
    move v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, LF/j$b;-><init>(Landroid/net/Uri;IIZI)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LF/j$b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF/j$b;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LF/j$b;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LF/j$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LF/j$b;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF/j$b;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, LF/j$b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LF/j$b;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public i()Z
    .locals 2

    .line 1
    iget-object v0, p0, LF/j$b;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "systemfont"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
