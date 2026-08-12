.class abstract Landroidx/vectordrawable/graphics/drawable/h$f;
.super Landroidx/vectordrawable/graphics/drawable/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/vectordrawable/graphics/drawable/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation


# instance fields
.field protected a:[Lz/g$b;

.field b:Ljava/lang/String;

.field c:I

.field d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Landroidx/vectordrawable/graphics/drawable/h$e;-><init>(Landroidx/vectordrawable/graphics/drawable/h$a;)V

    .line 2
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    return-void
.end method

.method public constructor <init>(Landroidx/vectordrawable/graphics/drawable/h$f;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Landroidx/vectordrawable/graphics/drawable/h$e;-><init>(Landroidx/vectordrawable/graphics/drawable/h$a;)V

    .line 5
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->c:I

    .line 7
    iget-object v0, p1, Landroidx/vectordrawable/graphics/drawable/h$f;->b:Ljava/lang/String;

    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->b:Ljava/lang/String;

    .line 8
    iget v0, p1, Landroidx/vectordrawable/graphics/drawable/h$f;->d:I

    iput v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->d:I

    .line 9
    iget-object p1, p1, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    invoke-static {p1}, Lz/g;->f([Lz/g$b;)[Lz/g$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz/g$b;->i([Lz/g$b;Landroid/graphics/Path;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public getPathData()[Lz/g$b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setPathData([Lz/g$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz/g;->b([Lz/g$b;[Lz/g$b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lz/g;->f([Lz/g$b;)[Lz/g$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/h$f;->a:[Lz/g$b;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lz/g;->k([Lz/g$b;[Lz/g$b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
