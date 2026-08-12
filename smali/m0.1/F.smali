.class public final Lm0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/webkit/WebChromeClient$FileChooserParams;

.field private b:Ljava/util/List;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/webkit/WebChromeClient$FileChooserParams;)V
    .locals 8

    .line 1
    const-string v0, "fileChooserParams"

    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lm0/F;-><init>(Landroid/webkit/WebChromeClient$FileChooserParams;Ljava/util/List;ZZILX1/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebChromeClient$FileChooserParams;Ljava/util/List;ZZ)V
    .locals 1

    const-string v0, "fileChooserParams"

    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mimeTypes"

    invoke-static {p2, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 4
    iput-object p2, p0, Lm0/F;->b:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lm0/F;->c:Z

    .line 6
    iput-boolean p4, p0, Lm0/F;->d:Z

    .line 7
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-static {p1}, LX1/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, LM1/g;->k([Ljava/lang/Object;)Ld2/f;

    move-result-object p1

    new-instance p2, Lm0/C;

    invoke-direct {p2}, Lm0/C;-><init>()V

    .line 9
    invoke-static {p1, p2}, Ld2/g;->s(Ld2/f;LW1/l;)Ld2/f;

    move-result-object p1

    .line 10
    invoke-static {p1}, Ld2/g;->j(Ld2/f;)Ld2/f;

    move-result-object p1

    new-instance p2, Lm0/D;

    invoke-direct {p2}, Lm0/D;-><init>()V

    .line 11
    invoke-static {p1, p2}, Ld2/g;->o(Ld2/f;LW1/l;)Ld2/f;

    move-result-object p1

    new-instance p2, Lm0/E;

    invoke-direct {p2}, Lm0/E;-><init>()V

    .line 12
    invoke-static {p1, p2}, Ld2/g;->s(Ld2/f;LW1/l;)Ld2/f;

    move-result-object p1

    .line 13
    invoke-static {p1}, Ld2/g;->q(Ld2/f;)Ld2/f;

    move-result-object p1

    .line 14
    invoke-static {p1}, Ld2/g;->t(Ld2/f;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, LM1/m;->t(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 15
    iput-object p1, p0, Lm0/F;->b:Ljava/util/List;

    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 17
    iget-object p1, p0, Lm0/F;->b:Ljava/util/List;

    const-string p2, "*/*"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/webkit/WebChromeClient$FileChooserParams;Ljava/util/List;ZZILX1/g;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 18
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 19
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lm0/F;-><init>(Landroid/webkit/WebChromeClient$FileChooserParams;Ljava/util/List;ZZ)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lm0/F;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lm0/F;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lm0/F;->e(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-static {p0}, LX1/k;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "[,;\\s]"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v5, 0x6

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p0

    .line 15
    invoke-static/range {v1 .. v6}, Le2/d;->C(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private static final e(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "/"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p0, v0, v1, v2, v3}, Le2/d;->l(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "."

    .line 18
    .line 19
    invoke-static {p0, v0, v1, v2, v3}, Le2/d;->i(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method private static final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "."

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p0, v2, v3, v0, v1}, Le2/d;->i(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v1, "substring(...)"

    .line 27
    .line 28
    invoke-static {p0, v1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lm0/F;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lm0/F;

    .line 12
    .line 13
    iget-object v1, p0, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 14
    .line 15
    iget-object v3, p1, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 16
    .line 17
    invoke-static {v1, v3}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lm0/F;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lm0/F;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, LX1/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-boolean v1, p0, Lm0/F;->c:Z

    .line 36
    .line 37
    iget-boolean v3, p1, Lm0/F;->c:Z

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, Lm0/F;->d:Z

    .line 43
    .line 44
    iget-boolean p1, p1, Lm0/F;->d:Z

    .line 45
    .line 46
    if-eq v1, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
.end method

.method public final g()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "*/*"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/util/Collection;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    const/4 v4, 0x0

    .line 48
    const-string v5, "image/"

    .line 49
    .line 50
    invoke-static {v1, v5, v2, v3, v4}, Le2/d;->l(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    return v2

    .line 58
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 59
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm0/F;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lm0/F;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lm0/F;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-boolean v1, p0, Lm0/F;->c:Z

    .line 19
    .line 20
    invoke-static {v1}, Lm0/B;->a(Z)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-boolean v1, p0, Lm0/F;->d:Z

    .line 28
    .line 29
    invoke-static {v1}, Lm0/B;->a(Z)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    return v0
.end method

.method public final i()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "*/*"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/util/Collection;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, Ljava/util/Collection;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    const/4 v4, 0x0

    .line 48
    const-string v5, "video/"

    .line 49
    .line 50
    invoke-static {v1, v5, v2, v3, v4}, Le2/d;->l(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    return v2

    .line 58
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 59
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm0/F;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm0/F;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Landroid/webkit/WebChromeClient$FileChooserParams;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lm0/F;->b:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    instance-of v1, v0, Ljava/util/Collection;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return v2

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, "image/"

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x2

    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-static {v1, v3, v4, v5, v6}, Le2/d;->i(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    const-string v3, "video/"

    .line 48
    .line 49
    invoke-static {v1, v3, v4, v5, v6}, Le2/d;->i(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v4

    .line 57
    :cond_3
    return v2
.end method

.method public final o(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/F;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/F;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lm0/F;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/F;->b:Ljava/util/List;

    .line 4
    .line 5
    iget-boolean v2, p0, Lm0/F;->c:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lm0/F;->d:Z

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "FileUploadOptions(fileChooserParams="

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", mimeTypes="

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ", canUseCamera="

    .line 31
    .line 32
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", canSaveToPublicStorage="

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
