.class LU0/b$c;
.super Landroidx/vectordrawable/graphics/drawable/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LU0/b;


# direct methods
.method constructor <init>(LU0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/b$c;->b:LU0/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/vectordrawable/graphics/drawable/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p1, p0, LU0/b$c;->b:LU0/b;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LU0/b;->setIndeterminate(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LU0/b$c;->b:LU0/b;

    .line 8
    .line 9
    invoke-static {p1}, LU0/b;->d(LU0/b;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, LU0/b$c;->b:LU0/b;

    .line 14
    .line 15
    invoke-static {v1}, LU0/b;->e(LU0/b;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1, v0, v1}, LU0/b;->p(IZ)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
