.class public final Lz0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv0/b;


# instance fields
.field private final a:LK1/a;


# direct methods
.method public constructor <init>(LK1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/g;->a:LK1/a;

    .line 5
    .line 6
    return-void
.end method

.method public static a(LD0/a;)LA0/f;
    .locals 1

    .line 1
    invoke-static {p0}, Lz0/f;->a(LD0/a;)LA0/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lv0/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, LA0/f;

    .line 12
    .line 13
    return-object p0
.end method

.method public static b(LK1/a;)Lz0/g;
    .locals 1

    .line 1
    new-instance v0, Lz0/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz0/g;-><init>(LK1/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public c()LA0/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/g;->a:LK1/a;

    .line 2
    .line 3
    invoke-interface {v0}, LK1/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LD0/a;

    .line 8
    .line 9
    invoke-static {v0}, Lz0/g;->a(LD0/a;)LA0/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz0/g;->c()LA0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
