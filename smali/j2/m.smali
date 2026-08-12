.class final Lj2/m;
.super Lf2/w;
.source "SourceFile"


# static fields
.field public static final f:Lj2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj2/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lj2/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj2/m;->f:Lj2/m;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/w;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public D(LN1/i;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lj2/c;->l:Lj2/c;

    .line 2
    .line 3
    sget-object v0, Lj2/l;->h:Lj2/i;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v0, v1}, Lj2/f;->H(Ljava/lang/Runnable;Lj2/i;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public F(I)Lf2/w;
    .locals 1

    .line 1
    invoke-static {p1}, Lh2/k;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lj2/l;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lf2/w;->F(I)Lf2/w;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
