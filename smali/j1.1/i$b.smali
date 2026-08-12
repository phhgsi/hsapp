.class Lj1/i$b;
.super Lj1/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj1/i;->y()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic h:Lj1/i;


# direct methods
.method constructor <init>(Lj1/i;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lj1/i$b;->h:Lj1/i;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lj1/i$e;-><init>(Lj1/i;Lj1/i$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method bridge synthetic b(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj1/i$b;->d(I)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method d(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    new-instance v0, Lj1/i$g;

    .line 2
    .line 3
    iget-object v1, p0, Lj1/i$b;->h:Lj1/i;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lj1/i$g;-><init>(Lj1/i;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
