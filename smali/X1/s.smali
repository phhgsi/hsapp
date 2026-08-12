.class public abstract LX1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LX1/t;

.field private static final b:[Lc2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LX1/t;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :catch_0
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, LX1/t;

    .line 19
    .line 20
    invoke-direct {v0}, LX1/t;-><init>()V

    .line 21
    .line 22
    .line 23
    :goto_0
    sput-object v0, LX1/s;->a:LX1/t;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    new-array v0, v0, [Lc2/b;

    .line 27
    .line 28
    sput-object v0, LX1/s;->b:[Lc2/b;

    .line 29
    .line 30
    return-void
.end method

.method public static a(LX1/i;)Lc2/d;
    .locals 1

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LX1/t;->a(LX1/i;)Lc2/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lc2/b;
    .locals 1

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LX1/t;->b(Ljava/lang/Class;)Lc2/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lc2/c;
    .locals 2

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, LX1/t;->c(Ljava/lang/Class;Ljava/lang/String;)Lc2/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(LX1/n;)Lc2/e;
    .locals 1

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LX1/t;->d(LX1/n;)Lc2/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static e(LX1/h;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LX1/t;->e(LX1/h;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static f(LX1/l;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LX1/s;->a:LX1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LX1/t;->f(LX1/l;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
