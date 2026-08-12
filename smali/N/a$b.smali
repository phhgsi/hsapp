.class LN/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/collection/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LN/a$b;->c(Landroidx/collection/j;I)LK/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroidx/collection/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN/a$b;->d(Landroidx/collection/j;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Landroidx/collection/j;I)LK/y;
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/collection/j;->j(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LK/y;

    .line 6
    .line 7
    return-object p1
.end method

.method public d(Landroidx/collection/j;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/collection/j;->i()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
