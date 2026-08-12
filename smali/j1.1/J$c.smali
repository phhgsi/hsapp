.class final Lj1/J$c;
.super Lj1/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final transient f:[Ljava/lang/Object;

.field private final transient g:I

.field private final transient h:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj1/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj1/J$c;->f:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lj1/J$c;->g:I

    .line 7
    .line 8
    iput p3, p0, Lj1/J$c;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lj1/J$c;->h:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Li1/h;->g(II)I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj1/J$c;->f:[Ljava/lang/Object;

    .line 7
    .line 8
    mul-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iget v1, p0, Lj1/J$c;->g:I

    .line 11
    .line 12
    add-int/2addr p1, v1

    .line 13
    aget-object p1, v0, p1

    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/J$c;->h:I

    .line 2
    .line 3
    return v0
.end method
