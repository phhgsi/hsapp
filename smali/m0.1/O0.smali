.class public final Lm0/O0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm0/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/O0;

    .line 2
    .line 3
    invoke-direct {v0}, Lm0/O0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm0/O0;->a:Lm0/O0;

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

.method public static final a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "file"

    .line 7
    .line 8
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ".fileprovider"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p0, v0, p1}, Landroidx/core/content/FileProvider;->h(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "getUriForFile(...)"

    .line 41
    .line 42
    invoke-static {p0, p1}, LX1/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static final b(Landroid/content/Context;Landroid/net/Uri;Lm0/s;)V
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "imageUri"

    .line 7
    .line 8
    invoke-static {p1, v0}, LX1/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lf2/M;->b()Lf2/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lf2/A;->a(LN1/i;)Lf2/z;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v4, Lm0/O0$a;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {v4, p0, p1, p2, v0}, Lm0/O0$a;-><init>(Landroid/content/Context;Landroid/net/Uri;Lm0/s;LN1/e;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lf2/f;->d(Lf2/z;LN1/i;Lf2/B;LW1/p;ILjava/lang/Object;)Lf2/f0;

    .line 30
    .line 31
    .line 32
    return-void
.end method
