.class Lj1/o$b;
.super Lj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final f:Lj1/o;


# direct methods
.method constructor <init>(Lj1/o;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0, p2}, Lj1/a;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lj1/o$b;->f:Lj1/o;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/o$b;->f:Lj1/o;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
