.class final Lf2/m0$a;
.super Lf2/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final e:Lf2/m0;

.field private final f:Lf2/m0$b;

.field private final g:Lf2/n;

.field private final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf2/m0;Lf2/m0$b;Lf2/n;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/l0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/m0$a;->e:Lf2/m0;

    .line 5
    .line 6
    iput-object p2, p0, Lf2/m0$a;->f:Lf2/m0$b;

    .line 7
    .line 8
    iput-object p3, p0, Lf2/m0$a;->g:Lf2/n;

    .line 9
    .line 10
    iput-object p4, p0, Lf2/m0$a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lf2/m0$a;->e:Lf2/m0;

    .line 2
    .line 3
    iget-object v0, p0, Lf2/m0$a;->f:Lf2/m0$b;

    .line 4
    .line 5
    iget-object v1, p0, Lf2/m0$a;->g:Lf2/n;

    .line 6
    .line 7
    iget-object v2, p0, Lf2/m0$a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, Lf2/m0;->m(Lf2/m0;Lf2/m0$b;Lf2/n;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
