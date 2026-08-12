.class Lj1/i$a;
.super Lj1/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj1/i;->H()Ljava/util/Iterator;
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
    iput-object p1, p0, Lj1/i$a;->h:Lj1/i;

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
.method b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/i$a;->h:Lj1/i;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lj1/i;->b(Lj1/i;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
