.class public Lm0/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String; = "m0.f1"

.field private static d:Lm0/f1;


# instance fields
.field private a:Ljava/util/regex/Pattern;

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lm0/f1;->a:Ljava/util/regex/Pattern;

    .line 6
    .line 7
    iput-object v0, p0, Lm0/f1;->b:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public static a()Lm0/f1;
    .locals 1

    .line 1
    sget-object v0, Lm0/f1;->d:Lm0/f1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm0/f1;

    .line 6
    .line 7
    invoke-direct {v0}, Lm0/f1;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lm0/f1;->d:Lm0/f1;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lm0/f1;->d:Lm0/f1;

    .line 13
    .line 14
    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/f1;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/f1;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lo0/a;->f(Landroid/content/Context;)Lo0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, Lo0/a;->D:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lm0/f1;->a:Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    invoke-static {}, Lo0/f;->b()Lo0/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lm0/f1;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v1, v2, p1}, Lo0/f;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/f1;->a:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Lm0/f1;->e(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method
