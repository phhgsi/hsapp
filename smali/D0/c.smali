.class public final LD0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/c$a;
    }
.end annotation


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

.method public static a()LD0/c;
    .locals 1

    .line 1
    invoke-static {}, LD0/c$a;->a()LD0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static b()LD0/a;
    .locals 2

    .line 1
    invoke-static {}, LD0/b;->a()LD0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lv0/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LD0/a;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public c()LD0/a;
    .locals 1

    .line 1
    invoke-static {}, LD0/c;->b()LD0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD0/c;->c()LD0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
