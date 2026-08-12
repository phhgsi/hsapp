.class Lz/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/C$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/C;->h([LF/j$b;I)LF/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/C;


# direct methods
.method constructor <init>(Lz/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/C$a;->a:Lz/C;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LF/j$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz/C$a;->c(LF/j$b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LF/j$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz/C$a;->d(LF/j$b;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(LF/j$b;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, LF/j$b;->g()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public d(LF/j$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, LF/j$b;->h()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
