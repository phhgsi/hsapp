.class LN/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/b$a;


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
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    check-cast p1, LK/y;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LN/a$a;->b(LK/y;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LK/y;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, LK/y;->m(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
